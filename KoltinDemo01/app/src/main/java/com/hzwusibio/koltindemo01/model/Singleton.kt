package com.hzwusibio.koltindemo01.model


class Singleton private constructor() {

    public var value: Singleton? = null

    /**
     * Koltin不支持静态方法与成员，由于Koltin支持全局函数和变量，
     * 因此可以使用全局函数和变量来代替（用objects技术）
     */
    private object mHolder {
        val INSATNCE = Singleton()
    }

    companion object {
        fun getInstance(): Singleton {
            return mHolder.INSATNCE;
        }
    }

}