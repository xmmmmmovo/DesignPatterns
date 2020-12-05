/*
 * Copyright (c) xmmmmmovo 2020.
 */

package adapter.delegation

/**
 * banner类
 * @author xmmmmmovo
 * @property string String 版面题目
 * @constructor
 */
open class Banner(val string: String) {
    fun showWithParen() {
        println("(${string})")
    }

    fun showWithAster() {
        println("*${string}*")
    }
}