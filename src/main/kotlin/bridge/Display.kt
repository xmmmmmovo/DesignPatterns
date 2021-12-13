/*
 * Copyright (c) xmmmmmovo 2021.
 */

package bridge

open class Display(private val displayImpl: DisplayImpl) {
    fun open() {
        displayImpl.rawOpen()
    }

    fun close() {
        displayImpl.rawClose()
    }

    fun print() {
        displayImpl.rawPrint()
    }

    final fun display() {
        open()
        print()
        display()
    }
}