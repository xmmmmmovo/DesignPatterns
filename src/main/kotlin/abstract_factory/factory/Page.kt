/*
 * Copyright (c) xmmmmmovo 2021.
 */

package abstract_factory.factory

import java.io.File
import java.io.IOException

abstract class Page(protected val title: String, protected val author: String) {
    protected val content: ArrayList<Item> = ArrayList()
    fun add(item: Item) {
        content.add(item)
    }

    fun output() {
        try {
            File("${title}.html").writeText(makeHTML())
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    abstract fun makeHTML(): String
}