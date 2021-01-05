/*
 * Copyright (c) xmmmmmovo 2021.
 */

package prototype

import prototype.framework.Product

/**
 * 字符框
 * @property decochar Char 边框char
 * @constructor
 */
class MessageBox constructor(private val decochar: Char) : Product() {
    override fun use(s: String) {
        val l = s.toByteArray().size

        repeat(l + 4) {
            print(decochar)
        }
        println()

        println("$decochar $s $decochar")

        repeat(l + 4) {
            print(decochar)
        }
        println()
    }
}