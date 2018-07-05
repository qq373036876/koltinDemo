package com.hzwusibio.koltindemo01

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log

/**
 * koltin 泛型
 *
 * @author hzwusibo
 */
class koltinTest04Activity : Activity() {


    companion object {
        fun start(context: Activity) {
            val intent = Intent(context, koltinTest04Activity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koltin_test04)

        // 基础泛型
        testBox()
    }

    class Box<T>(t: T) {
        var value = t
    }

    fun testBox() {
        var box1 :Box<Int> = Box(20)
        var box2 :Box<String> = Box("Bill")
        Log.w("WSB", "box1.value  = " + box1.value)
        Log.w("WSB", "box2.value  = " + box2.value)
    }

    /**
     * out声明泛型的占位符只能在获取泛型类型值的地方，如函数的返回
     */
    abstract class Source<out T>{
        abstract fun next():T
    }

    fun testOut(strs : Source<String>){
        val objects : Source<Any> = strs
    }

    /**
     * in声明的泛型占位符只能在设置泛型类型值的地方，如函数参数
     */
    abstract class Source1<in T> {
        abstract fun compare(i: T): Int
    }

    fun testIn(x : Source1<Number>){
        x.compare(1.0)
        val y : Source1<Double> = x
    }


    /**
     * Array<out Any> 与java Array<? extends Object>相同
     */
    fun copy (from :Array<out Any> ,to :Array<Any>){

    }

    /**
     * Array<in String>  与 java Array<? super String>相同
     */
    fun fill (from :Array<in String> ,to :String){

    }



}
