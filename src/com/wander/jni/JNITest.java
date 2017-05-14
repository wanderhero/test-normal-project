package com.wander.jni;

public class JNITest {
	static {
		System.loadLibrary("JNITest");// 加载实现了native函数的动态库
	}

	public static native String test(String name);// 声明native函数

	public static void main(String[] args) {
		System.out.println("java.library.path : " + System.getProperty("java.library.path"));
		System.out.println(test("wander"));
	}
}
