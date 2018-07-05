package com.hzwusibio.koltindemo01.model

import android.util.Log

interface MyInterface {


    fun process()

    /**
     * koltin允许接口包含默认方法体，对于有方法体的接口方法，
     * 并不要求一定要重写改方法。（抽象类类似，不过不需要要声明open）
     */
    fun getName(): String {
        Log.w("WSB", "MyInterface getName Bill ")
        return "Bill"
    }

}