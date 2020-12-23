/*
 * Copyright (c) xmmmmmovo 2020.
 */

package template

class CharDisplay constructor(private val ch: Char) : AbstractDisplay() {
    override fun open() {
        println("<<")
    }

    override fun print() {
        println(ch)
    }

    override fun close() {
        println(">>")
    }
}