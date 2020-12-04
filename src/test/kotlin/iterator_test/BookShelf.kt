/*
 * Copyright (c) xmmmmmovo 2020.
 */

package iterator_test

import iterator.Iterable
import iterator.Iterator

class BookShelf<T> constructor(
    private var maxSize: Int = 0
) : Iterable<T> {
    val size: Int
        get() = bookList.size
    private val bookList = mutableListOf<T>()


    fun appendBook(t: T): Boolean {
        if (size == maxSize) {
            return false
        }
        return bookList.add(t)
    }

    fun getBookAt(idx: Int): T? {
        if (idx > size - 1) return null
        return bookList[idx]
    }

    override fun iterator(): Iterator<T> {
        return BookShelfIterator()
    }

    private open inner class BookShelfIterator constructor(

    ) : Iterator<T> {
        override fun hasNext(): Boolean {
            TODO("Not yet implemented")
        }

        override fun next(): T {
            TODO("Not yet implemented")
        }

    }
}