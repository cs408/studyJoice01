package org.joice.cache.test.own;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/** 
 * @author lxw 
 * @describe
 * @date 2017年11月1日 下午4:03:46 
 */
public class MyClass {

	private String name = null;
	private int age = 0;

	public MyClass(String name, int age) {
	    this.name = name;
	    this.age = age;
	}

	public boolean equals(Object obj) {
	    return EqualsBuilder.reflectionEquals(this, obj);
	}

	public String toString() {
	    return ToStringBuilder.reflectionToString(this,
	        ToStringStyle.SHORT_PREFIX_STYLE);
	}

	public int hashCode() {
	    return HashCodeBuilder.reflectionHashCode(this);
	}
}
