/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DayTwoTest.java 
 * @Prject: day20
 * @Package: com.zhangkai.test 
 * @Description: TODO
 * @author: 张凯   
 * @date: 2019年11月25日 上午8:10:50 
 * @version: V1.0   
 */
package com.zhangkai.test;

/** 
 * @ClassName: DayTwoTest 
 * @Description: TODO
 * @author: 张凯
 * @date: 2019年11月25日 上午8:10:50  
 */
public class DayTwoTest {
	
	
	public static void main(String[] args) {
		
//		整型变量 a=10,b=12，在不使用第三个变量的前提下实现a与b数值的互换，写出解题思路并使用代码实现
		
		int a = 10;
		int b = 12;
		
		//位运算方法  一个数被另一个数疑惑两次，就还是其本身。
		a = a ^ b;
		//相当于a^b^b,结果还是a
		b = a ^ b;
		//相当于a^b^a,结果还是b
		a = a ^ b;
		System.out.println("a="+a+"--b="+b);
		
		 
		
		
	}

}
