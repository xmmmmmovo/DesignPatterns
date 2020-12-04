/*
 * Copyright (c) xmmmmmovo 2020.
 */

package iterator

interface Iterable<out T> {
    operator fun iterator(): Iterator<T>
}