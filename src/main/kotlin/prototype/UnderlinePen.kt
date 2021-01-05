/*
 * Copyright (c) xmmmmmovo 2021.
 */

package prototype

import prototype.framework.Product

/**
 * 下划线
 * @property ulchar Char 下划线char
 * @constructor
 */
class UnderlinePen constructor(private val ulchar: Char) : Product() {
    override fun use(s: String) {
        println("\"$s\"")
        repeat(s.toByteArray().size) { print(ulchar) }
    }
}