/*
 * Copyright (c) xmmmmmovo 2021.
 */

package abstract_factory.factory

abstract class Item(protected var caption: String) {
    abstract fun makeHTML(): String
}