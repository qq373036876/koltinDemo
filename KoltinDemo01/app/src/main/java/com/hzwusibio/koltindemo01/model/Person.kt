package com.hzwusibio.koltindemo01.model

import android.util.Log


class Person(firstname: String) {

    var name = firstname // 初始化成员变量

    //如果是主构造函数，需要在init块中初始化。 在init块中可以直接使用主构造器的参数。
    // 如果类中声明了主构造器，那么第二构造器都需要直接或者间接的调用主构造器。
    init {
        Log.w("WSB", "Person = " + name)
    }

    // 第二构造器（通过this直接调用主构造器）
    constructor(age: Int) : this("WUSIBO") {
        Log.w("WSB", "age = " + age)
    }

    // 第二构造器（通过this直接调用主构造器）
    constructor() : this("WUSIBO")


    val country: String  //只读属性
        get() = "中国"

    var city: String = "杭州"  //读写属性
        set(value) {
            field = value   // 注意是field
        }
        get() = field

    var city2: String = "三亚"  //读写属性
        set(value) {
            field = value
        }
        get() {
            Log.w("WSB", "city2 get（） = " + field)
            return field
        }


    fun getMyName(): String = name // 函数可以缩写

}