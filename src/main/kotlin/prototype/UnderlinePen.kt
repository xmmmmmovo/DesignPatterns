/*
 * Copyright (c) xmmmmmovo 2021.
 */

package prototype

import prototype.framework.Product

class UnderlinePen constructor(private val ulchar: Char) : Product() {
    override fun use(s: String) {
        println("\"$s\"")
        repeat(s.toByteArray().size) { print(ulchar) }
    }
}