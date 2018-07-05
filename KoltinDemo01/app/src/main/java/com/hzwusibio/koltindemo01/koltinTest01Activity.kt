package com.hzwusibio.koltindemo01

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView

/**
 * koltin 基础知识
 *
 * @author hzwusibo
 */
class koltinTest01Activity : Activity() {

    var mTextView: TextView? = null // textview使用


    var n: Int = 30 // 变量
    val m: Int = 20  //常量

    var string: String = "杭州"

    //  Kotlin 不支持short 隐形转int ，如果要相互转换  toInt()
    // 讲 short转为int (其他几个类似  tobyte() , toLong()  )
    var k: Double = m.toDouble()

    var k1: Int = 12_3456  //数值可以用  _  分开写 比如123456 能写成 12_3456 ，也能写出123_4_56

    var flag1: Boolean = true // boolen型

    /**
     * 静态常量 类似于 static  Koltin中没有静态成员的概念，用陪伴对象解决，使用companion关键字声明
     **/
    companion object {
        fun start(context: Activity) {
            val intent = Intent(context, koltinTest01Activity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koltin_test01)
        mTextView = findViewById(R.id.tv1) as TextView
    }

    override fun onResume() {
        super.onResume()

        add(n, m)
        add(k1, m)

        ifvoid()

        switchvoid()

        showFor()

        showWhile()

        showValue()

        showIs()
    }


    /**
     * 函数
     **/
    fun add(m: Int, n: Int): Int {
        Log.w("WSB", "----------分割线--------------- ")
        Log.w("WSB", "add =  " + (m + n))
        return m + n
    }


    /**
     * if 语句
     **/
    fun ifvoid() {
        Log.w("WSB", "----------分割线--------------- ")
        var a = 20
        var b = 30
        var max = if (a > b) a else b
        Log.w("WSB", "max = " + max)
    }


    /**
     * switch 语句
     * Kotlin中没用Java三元操作符， switch语句用when代替（不需要每个后面break），
     * when与if一样，既可以作为语句也能作为表达式，如果是表达式，
     * 每个分支最后一个表达式就是when 或者if表达式的返回值。
     * （When，支持多个分支执行相同代码，
     * 支持使用 in （表示在这个范围内），支持分支条件是函数 ）
     **/
    fun switchvoid() {
        Log.w("WSB", "----------分割线--------------- ")

        var x = 1
        when (x) {
            1 -> {
                Log.w("WSB", "when = " + 1)
            }
            2 -> {
                Log.w("WSB", "when = " + 2)
            }
            3, 4 -> {
                Log.w("WSB", "when = " + 2)
            }
            else -> {
                Log.w("WSB", "when = " + 3)
            }
        }


        var x1 = 2
        var m = when (x1) {
            1 -> {
                Log.w("WSB", "when = " + 1)
                10
            }
            2 -> {
                Log.w("WSB", "when = " + 2)
                20
            }
            else -> {
                Log.w("WSB", "when = " + 3)
                30
            }
        }
        Log.w("WSB", "m = " + m)


        var x2 = 14
        when (x2) {
            in 1..10 -> {
                Log.w("WSB", "when = " + 1)
            }
            11 -> {
                Log.w("WSB", "when = " + 2)
            }
            in 12..14 -> {
                Log.w("WSB", "when = " + 14)
            }
            else -> {
                Log.w("WSB", "when = " + 3)
            }
        }

        Log.w("WSB", "----------分割线--------------- ")
    }


    /**
     * for循环
     **/
    fun showFor() {

        /**
         * 通过 in 关键字实现循环遍历
         * 在调用mTabLayou变量的方法时,由于mTabLayout可能为空,所以在调用方法时添加!!
         * titles[] 与 titles.get 方法的功能是一样的
         * titles.indices 获取的是数组的下标
         */

        var srr = intArrayOf(2, 4, 6, 8, 10) // 数组

        for (i in srr.indices) {
            Log.w("WSB", "ssr[$i] = " + srr[i])
        }

        Log.w("WSB", "----------分割线--------------- ")

        for (i in srr) {
            Log.w("WSB", "i = " + i)
        }

        var srr1 = arrayOfNulls<Int>(10) // 数组
        srr1.set(1, 11)
        srr1.set(3, 156)
        srr1.set(5, 123)

        Log.w("WSB", "----------分割线--------------- ")

        for (i in srr1.indices) {
            Log.w("WSB", "ssr1[$i] = " + srr1[i])
        }

    }

    /**
     * While循环
     **/
    fun showWhile() {
        Log.w("WSB", "----------分割线--------------- ")
        var i = 0
        while (i++ < 10) {
            Log.w("WSB", "i =" + i)
        }
    }

    /**
     * 值范围
     **/
    fun showValue() {
        Log.w("WSB", "----------分割线--------------- ")
        // 1到10
        for(k1 in 1..10){
            Log.w("WSB", "k1 ="+k1)
        }

        // 10 到 1
        // for(k1 in 10..1) 什么都不会输出
        Log.w("WSB", "----------分割线--------------- ")
        for(k2 in 10 downTo 1){
            Log.w("WSB", "k2 ="+k2)
        }

        Log.w("WSB", "----------分割线--------------- ")
        for(k3 in 1..10 step 2){
            Log.w("WSB", "k3 ="+k3)
        }

        Log.w("WSB", "----------分割线--------------- ")
        for(k4 in 10 downTo 1 step 3){
            Log.w("WSB", "k4 ="+k4)
        }


        //  （until表示 1 到 10 - n 不包含n， 开区间）
//        for(i in 10 until n){      等于   for(i in 10 -n)
//            // 不包含n
//        }
//

        Log.w("WSB", "----------分割线--------------- ")
        // 1 到 9
        for(k5 in 10 until 1){
            Log.w("WSB", "k5 ="+k5)
        }

    }


    /**
     * 类型检查与类型转换
     **/
    fun showIs() {
        Log.w("WSB", "----------分割线--------------- ")
        var obj1 = "hello"
        if(obj1 is String){
            Log.w("WSB", "ibj1 是String类型")
        }

        if(obj1 !is String){
            Log.w("WSB", "ibj1 不是String类型")
        }

        if(obj1 is String){
            Log.w("WSB", "obj1.length = "+obj1.length)  // 编译器会自己加入安全类型转换
        }

        // === 判断引用相等 （!==） 类似Java ==
        // == 判断结构相等（!=） 类似Java equal

    }


}
