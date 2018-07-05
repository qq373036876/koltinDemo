package com.hzwusibio.koltindemo01.model

import android.util.Log


/**
 * 抽象方法  不需要要声明open
 */
class Derived01 : Derived() {

    override fun f() {
        Log.w("WSB", "Derived01")
    }

}