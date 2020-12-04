/*
 * Copyright (c) xmmmmmovo 2020.
 */

package iterator

interface Iterator<out T> {
    fun hasNext(): Boolean
    fun next(): T

}