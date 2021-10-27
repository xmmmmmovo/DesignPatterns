/*
 * Copyright (c) xmmmmmovo 2021.
 */

package abstract_factory.factory

import  java.util.ArrayList

abstract class Tray(caption: String) : Item(caption) {
    protected val tray: ArrayList<Item> = ArrayList()

    fun add(item: Item) {
        tray.add(item)
    }

}