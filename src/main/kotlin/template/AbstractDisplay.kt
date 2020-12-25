/*
 * Copyright (c) xmmmmmovo 2020.
 */

package template

/**
 * 抽象展示类
 * @author xmmmmmovo
 */
abstract class AbstractDisplay {
    /**
     * 打开方法
     */
    abstract fun open()

    /**
     * 输出方法
     */
    abstract fun print()

    /**
     * 关闭方法
     */
    abstract fun close()

    /**
     * 显示方法
     */
    fun display() {
        open()
        for (i in 0..5) {
            print()
        }
        close()
    }
}