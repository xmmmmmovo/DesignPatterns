/*
 * Copyright (c) xmmmmmovo 2020.
 */

package template

/**
 * 字符串输出类
 * @property str String输出的字符串
 * @property width Int 字符串宽度
 * @constructor 初始化字符串
 */
class StringDisplay constructor(private val str: String) : AbstractDisplay() {
    private val width = str.toByteArray().size

    /**
     * 打开
     */
    override fun open() {
        printLine()
    }

    /**
     * 输出字符串
     */
    override fun print() {
        println("|${str}|")
    }

    /**
     * 关闭
     */
    override fun close() {
        printLine()
    }

    /**
     * 输出字符串宽度的起始字符
     */
    private fun printLine() {
        print("+")
        for (i in 0..width) {
            print("-")
        }
        println("+")
    }
}