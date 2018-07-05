package com.hzwusibio.koltindemo01

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log

/**
 * koltin 数据类
 *
 * @author hzwusibo
 */
class koltinTest03Activity : Activity() {


    companion object {
        fun start(context: Activity) {
            val intent = Intent(context, koltinTest03Activity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koltin_test03)

        // 数据类
        testUser()
        // Copy函数
        testCopy()
    }

    /**
     * 数据类
     * 其实就是 写很少代码koltin自动生成余下代码
     *
     * 主构造器至少要一个参数、 参数必须标记为val 或者 var 、数据类不能是抽象类
     * open类、封闭类 或者 内部类。
     **/
    data class User(val name: String, var age: Int)

    fun testUser() {
        var user1 = User("BIll", 34)
        var user2 = User("BIll", 34)
        Log.w("WSB", "user1.equals(user2)  = " + user1.equals(user2))
        Log.w("WSB", "user1  = " + user1)
        Log.w("WSB", "user2  = " + user2)
    }

    fun testCopy() {
        var user1 = User("BIll", 34)
        var user2 = user1.copy(age = 34)
        var user3 = user1.copy(age = 68)
        Log.w("WSB", "user1.equals(user2)  = " + user1.equals(user2))
        Log.w("WSB", "user1.equals(user3)  = " + user1.equals(user3))
        Log.w("WSB", "user1  = " + user1)
        Log.w("WSB", "user2  = " + user2)
        Log.w("WSB", "user3  = " + user3)
    }

}
