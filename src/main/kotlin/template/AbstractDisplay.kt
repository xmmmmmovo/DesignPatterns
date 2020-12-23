/*
 * Copyright (c) xmmmmmovo 2020.
 */

package template

abstract class AbstractDisplay {
    abstract fun open()
    abstract fun print()
    abstract fun close()
    final fun display() {
        open()
        for (i in 0..5) {
            print()
        }
        close()
    }
}