package com.hzwusibio.koltindemo01.model

import android.util.Log


/**
 * 默认参数
 */
class Person01(age1: Int, firstname: String = "我是默认参数WUSIBO") {

    var name = firstname // 初始化成员变量
    var age = age1 // 初始化成员变量

    init {
        Log.w("WSB", " age = " + age)
        Log.w("WSB", " name = " + name)
    }

}