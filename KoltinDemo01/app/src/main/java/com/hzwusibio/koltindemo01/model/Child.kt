package com.hzwusibio.koltindemo01.model

import android.util.Log


/**
 * 子类

 */
class Child : Parent() {

    /**
     * （重写方法，需要在父类方法前加open 关键字，且 要在子类重写方法前加override关键字，
     *     重写属性类似，不过需要注意的是 val属性可以被重写为var属性，反过来不可以）
     */
    override var name: String = "Mike"
        get() {
            Log.w("WSB", "打印子类的name " + field)
            return field
        }
        set(value) {
            field = value
            Log.w("WSB", "设置子类的name " + field)
        }


    override var city: String = "旧金山"
        get() {
            Log.w("WSB", "打印子类的city " + field)
            return field
        }
        set(value) {
            field = value
            Log.w("WSB", "设置子类的city " + field)
        }
}