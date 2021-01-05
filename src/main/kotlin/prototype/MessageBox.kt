/*
 * Copyright (c) xmmmmmovo 2021.
 */

package prototype

import prototype.framework.Product

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