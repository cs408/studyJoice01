package org.joice.cache.test.own;
/** 
 * @author lxw 
 * @describe
 * @date 2017年11月1日 下午4:04:52 
 */
public class MainClass {
	public static void main(String[] args) {
	    MyClass one = new MyClass("Becker", 35);
	    MyClass two = new MyClass("Becker", 35);
	    MyClass three = new MyClass("Agassi", 33);

	    System.out.println("One>>>" + one);
	    System.out.println("Two>>>" + two);
	    System.out.println("Three>>>" + three);

	    System.out.println("one equals two? " + one.equals(two));
	    System.out.println("one equals three? " + one.equals(three));

	    System.out.println("One HashCode>>> " + one.hashCode());
	    System.out.println("Two HashCode>>> " + two.hashCode());
	    System.out.println("Three HashCode>>> " + three.hashCode());
	}

}
