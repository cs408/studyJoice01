package org.joice.cache.test.own;

import org.joice.cache.config.CacheConfig;
import org.joice.cache.map.MapCache;
import org.joice.cache.test.domain.Department;
import org.joice.cache.test.domain.Employee;
import org.joice.cache.to.CacheKey;
import org.joice.cache.to.CacheWrapper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** 
 * @author lxw 
 * @describe
 * @date 2017年11月3日 下午3:02:34 
 */
public class MapCacheTest01 {
	
	 	private CacheConfig cacheConfig = new CacheConfig();

	    private MapCache    cache;

	    private Department  dept        = new Department(11L, "陆军");

	    private Employee    emp         = new Employee(1L, "林冲", dept);
	
	@Before
	public void InitialContext(){
		cache = new MapCache(cacheConfig);
	}


	/**
	 * testSetAndDelete:测试添加和删除缓存
	 *
	 * @author prd-lxw
	 * @since JDK 1.7
	 */
	@Test
	public void testSetAndDelete() {
		String key = emp.getId()+"";
		CacheKey cacheKey = new CacheKey(key);
		CacheWrapper wrapper = new CacheWrapper(emp);
		cache.clear();
		Assert.assertNull("yes", cache.get(cacheKey));
		cache.set(cacheKey, wrapper);
		CacheWrapper wrapper2 = cache.get(cacheKey);
		Assert.assertNotNull(cache.get(cacheKey));
		Assert.assertEquals(1L, ((Employee)wrapper2.getObj()).getId());
		long dd =cache.delete(cacheKey);
		Assert.assertEquals(1L, dd);
	}
	
	
	
	/**
	 * testExpire:测试缓存生命周期
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author prd-lxw
	 * @throws InterruptedException 
	 * @since JDK 1.7
	 */
	@Test
	public void testExpire() throws InterruptedException{
		String key1 = emp.getId()+"1";
		String key2 = emp.getId()+"2";
		CacheKey cacheKey1 = new CacheKey(key1);
		CacheKey cacheKey2 = new CacheKey(key2);
		int expire=10;
		CacheWrapper wrapper = new CacheWrapper(emp,expire); //创建10s后清理缓存
		cache.clear();
		Assert.assertEquals(0, cache.getCache().size());
		cache.set(cacheKey1, wrapper);
		cache.set(cacheKey2, wrapper);
		Assert.assertEquals(emp.getId(), ((Employee)(cache.get(cacheKey1).getObj())).getId());
		Assert.assertEquals(emp.getId(), ((Employee)(cache.get(cacheKey2).getObj())).getId());
		
		 //测试超时
        Thread.sleep(expire * 1000 + 200);//休眠时间略大于expire time
		
	}
	@After
	public void shutDown(){
		cache.shutdown();
	}

}
