package com.hzwusibio.koltindemo01.model

import android.util.Log


/**
 * 父类
 *
 * 默认的class不能被继承， 需要显示的声明open才能
 *
 *
 */
open class Parent {


    /**
     * （重写方法，需要在父类方法前加open 关键字，且 要在子类重写方法前加override关键字，
     *     重写属性类似，不过需要注意的是 val属性可以被重写为var属性，反过来不可以）
     */
    open val name: String = "Bill"
        get() {
            Log.w("WSB", "打印父类的name " + field)  // 注意不能写  Log.w("WSB", "打印父类的name " + name)
            return field
        }

    open var city: String = "圣何塞"
        get() {
            Log.w("WSB", "打印父类的city " + city)  // 注意不能写  Log.w("WSB", "打印父类的city " + name)
            return field
        }
        set(value) {
            field = value
            Log.w("WSB", "设置子类的city " + city)
        }


}