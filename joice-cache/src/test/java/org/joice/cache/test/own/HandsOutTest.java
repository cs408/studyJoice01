/**
 * Project Name:joice-cache
 * File Name:HandsOutTest.java
 * Package Name:org.joice.cache.test.own
 * Date:2017年11月8日下午4:13:34
 * Copyright (c) 2017, 深圳金融电子结算中心 All Rights Reserved.
 *
*/

package org.joice.cache.test.own;

import org.junit.Test;

/**
 * ClassName:HandsOutTest <br/>
 * Function: 用来练习java讲义中的示例
 * Reason:	 TODO  <br/>
 * Date:     2017年11月8日 下午4:13:34 <br/>
 * @author   prd-lxw
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class HandsOutTest {

	/**
	 * test:测试表达式类型的自动提升
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 *
	 * @author prd-lxw
	 * @param ss
	 * @since JDK 1.7
	 */
	@Test
	public void testExpression() {
		System.out.println("hello"+'a'+7);
		System.out.println('a'+7+"hello");
	}
	
	/**
	 * testVerificationCode:TODO(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 *
	 * @author prd-lxw
	 * @since JDK 1.7
	 */
	@Test
	public void testVerificationCode(){
		String string ="";
		int array =4;
		for (int i = 0; i < array; i++) {
			System.out.println((int)(Math.random()*26));
//			int value = (int)(Math.random()*26+97);
			int value = (int)(Math.random()*26)+97;
			string += (char)value;
			
		}
		System.out.println(string);
	}
	
	/**
	 * testGzip:测试java的GIZP压缩和解压算法，见360浏览器
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 *
	 * @author prd-lxw
	 * @since JDK 1.7
	 */
	@Test
	public void testGzip(){
		
	}

}

