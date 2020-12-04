/*
 * Copyright (c) xmmmmmovo 2020.
 */

package examples.iterator

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

    fun getBookAt(idx: Int): T {
        return bookList[idx]
    }

    override fun iterator(): Iterator<T> {
        return BookShelfIterator(this)
    }

    private open inner class BookShelfIterator constructor(
        private var shelf: BookShelf<T>,
        private var index: Int = 0
    ) : Iterator<T> {
        override fun hasNext(): Boolean {
            if (index < bookList.size) return true
            return false
        }

        override fun next(): T {
            return shelf.getBookAt(index).also { index++ }
        }
    }
}