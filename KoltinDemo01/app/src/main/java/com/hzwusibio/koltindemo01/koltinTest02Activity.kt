package com.hzwusibio.koltindemo01

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.hzwusibio.koltindemo01.model.*

/**
 * koltin 类与接口
 *
 * @author hzwusibo
 */
class koltinTest02Activity : Activity() {


    companion object {
        fun start(context: Activity) {
            val intent = Intent(context, koltinTest02Activity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koltin_test02)

        // 构造函数
        var person1 = Person()
        var person2 = Person(30)
        var person3 = Person("ddd")


        // 单利模式
        var obj1 = Singleton.getInstance()
        var obj2 = Singleton.getInstance()

        Log.w("WSB", "Singleton.getInstance1 = " + obj1)
        Log.w("WSB", "Singleton.getInstance2 = " + obj2)

        // 默认参数
        //Koltin函数支持默认参数 （JVM不支持，是Koltin的表面支持），
        // 带默认参数的必须是最后几个参数，如果某个参数带默认值，后面的参数都必须带默认值。
        // （支持参数命名参数传递参数值 ,  支持可变参数  vararg ）
        var person01 = Person01(10)


        // 属性 set 与 get 函数
        var person4 = Person("wusibo")
        person4.city = "上海"
        Log.w("WSB", "person4.country = = " + person4.country)
        Log.w("WSB", "person4.city = = " + person4.city)

        person4.city2 = "三亚"
        person4.city2


        //  构造函数 可变参数
        var persons = Persons().addPersons(Person(), Person("Mike"), Person("Bill"))
        for (person in persons) {
            Log.w("WSB", "persons name = " + person.name)
        }


        // 继承
        var parent = Parent()
        parent.name

        var child = Child()
        child.name = "wusibo"
        child.name
        child.city

        // 实现接口
        var myClass = MyClass()
        myClass.getName()
        myClass.process()

        // 实现抽象方法
        var derived = Derived01()
        derived.f()

    }


}
