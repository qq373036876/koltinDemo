package com.hzwusibio.koltindemo01

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.netease.snailread.util.FileUtil


/**
 * koltin 样例
 *
 * @author hzwusibo
 */
class MainActivity : Activity() {

    /**
     * 用于定义常量
     */
    companion object {
        /**
         * 主要用于定义Log TAG
         */
        val TAG = "WSB"
    }

    /**
     * 通过var定义变量,var表示变量既可读也可写
     * 通过val定义变量,val表示变量只是可读
     *  ? 表示变量可为空
     */
    var mTextView01: TextView? = null
    var mTextView02: TextView? = null
    var mTextView03: TextView? = null
    var mTextView04: TextView? = null
    var mTextView05: TextView? = null

    /**
     * override 表示函数重载父类方法
     * ? 表示变量可为空
     *
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * as 类似于java中的类型强转
         */
        mTextView01 = findViewById(R.id.tab1) as TextView
//        mTextView01!!.text = " koltin 基础知识 "  //  !!. 表示mTextView01 会抛出异常
        mTextView01?.text = " koltin 基础知识"  //  ?. 安全调用操作符  表示 if(mTextView01  != null ){ mTextView01.text} else null
        // ?: 表示左侧不为空， 返回左侧 例如 val len = b?.length ?: -1   b?.length 不为null 返回左侧，否则返回右侧
        // val value : Int? = a as? Int
        // ? 表示变量可为空
        // val mlist : List<Int?> = listOf(1,2,null,4)
        // val intList :List<Int> = mlist.filterNotnull()  //可以过滤为null的元素

        mTextView01?.setTextColor(getResources().getColor(R.color.colorPrimary))
        mTextView01?.setOnClickListener { view ->
            koltinTest01Activity.start(this)
//            koltinTest01Activity.Companion.start(this) // Java调koltin 中间加Companion
        }


        mTextView02 = findViewById(R.id.tab2) as TextView
        mTextView02?.text = FileUtil.add("koltin 类与接口")
        mTextView02?.setOnClickListener { view ->
            koltinTest02Activity.start(this)
        }

        mTextView03 = findViewById(R.id.tab3) as TextView
        mTextView03?.text = "数据类"
        mTextView03?.setOnClickListener { view ->
            koltinTest03Activity.start(this)
        }

        mTextView04 = findViewById(R.id.tab4) as TextView
        mTextView04?.text = "泛型"
        mTextView04?.setOnClickListener { view ->
            koltinTest04Activity.start(this)
        }

        mTextView05 = findViewById(R.id.tab5) as TextView
        mTextView05?.text = "高阶函数与Lambda表达式"
        mTextView05?.setOnClickListener { view ->
            koltinTest05Activity.start(this)
        }
    }

}
