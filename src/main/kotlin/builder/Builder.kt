/*
 * Copyright (c) xmmmmmovo 2021.
 */

package builder

abstract class Builder {
    abstract fun makeTitle(title: String)
    abstract fun makeString(str: String)
    abstract fun makeItems(items: List<String>)
    abstract fun close()
    abstract fun build(): Any
}