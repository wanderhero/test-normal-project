package com.wander.jni;

public class JNITest {

	static {
		System.loadLibrary("JNITest");// 加载实现了 native 函数的动态库
	}

	public static native String test(String name);// 声明 native 函数

	public static void main(String[] args) {
		System.out.println(test("wander"));// 调用 native 函数
	}

}
