/*
 * Copyright (c) xmmmmmovo 2021.
 */

package builder

interface Builder {
    fun makeTitle(title: String)
    fun makeString(str: String)
    fun makeItems(items: List<String>)
    fun close()
    fun build(): Any
}