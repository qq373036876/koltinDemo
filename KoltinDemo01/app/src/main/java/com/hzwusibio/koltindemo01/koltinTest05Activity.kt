package com.hzwusibio.koltindemo01

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log

/**
 * koltin 高阶函数与Lambda表达式
 *
 * @author hzwusibo
 */
class koltinTest05Activity : Activity() {


    companion object {
        fun start(context: Activity) {
            val intent = Intent(context, koltinTest05Activity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koltin_test05)


        // 高阶函数
        // 将函数作为参数值传入高阶函数， 需要在函数名前加两个冒号（：：）作为标记
        processProduct("中国", ::mobilePhoneArea)
    }

    fun mobilePhoneArea(name : String):String {
        return "${name} 美国"
    }


    // 高阶函数  高阶函数简单的说就是 一个函数作为方法的参数
    fun processProduct(product : String , area:(name :String) -> String ){
        Log.w("WSB", "product = "+product);
        Log.w("WSB", "area(iphome) = "+area("iphone"));
    }


    // Lambda表达式 Lambda表达式，或者称为匿名函数
    // 也就是一 个没有声明的函数，但是可以作为表达式传递出去
//    max(strings , { a , b - > a.length < b.length }) 等价于 如下代码
    fun compare(a: String, b: String): Boolean = a.length < b.length

}
