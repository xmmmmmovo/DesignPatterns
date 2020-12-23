/*
 * Copyright (c) xmmmmmovo 2020.
 */

package template

class StringDisplay constructor(private val str: String) : AbstractDisplay() {
    private val width = str.toByteArray().size

    override fun open() {
        printLine()
    }

    override fun print() {
        println("|${str}|")
    }

    override fun close() {
        printLine()
    }

    private fun printLine() {
        print("+")
        for (i in 0..width) {
            print("-")
        }
        println("+")
    }
}