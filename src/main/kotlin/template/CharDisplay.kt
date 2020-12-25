/*
 * Copyright (c) xmmmmmovo 2020.
 */

package template

/**
 * 字符显示类
 * @property ch Char 需要显示的字符
 * @constructor 初始化字符
 */
class CharDisplay constructor(private val ch: Char) : AbstractDisplay() {

    /**
     * 打开
     */
    override fun open() {
        println("<<")
    }

    /**
     * 输出字符
     */
    override fun print() {
        println(ch)
    }

    /**
     * 关闭
     */
    override fun close() {
        println(">>")
    }
}