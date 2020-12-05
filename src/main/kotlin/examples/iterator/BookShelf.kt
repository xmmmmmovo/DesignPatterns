/*
 * Copyright (c) xmmmmmovo 2020.
 */

package examples.iterator

import iterator.Iterable
import iterator.Iterator

/**
 * 书架类
 * @author xmmmmmovo
 * @param T 书架存储的什么类型的书
 * @property maxSize Int 最大容量
 * @property size Int 书籍数量
 * @property bookList MutableList<T> 书籍列表
 * @constructor
 */
class BookShelf<T> constructor(
    private var maxSize: Int = 0
) : Iterable<T> {
    val size: Int
        get() = bookList.size
    private val bookList = mutableListOf<T>()

    /**
     *  添加书籍
     * @param t T 书
     * @return Boolean 是否成功添加
     */
    fun appendBook(t: T): Boolean {
        if (size == maxSize) {
            return false
        }
        return bookList.add(t)
    }

    /**
     * 获取书籍
     * @param idx Int 第几本
     * @return T 返回书籍
     */
    fun getBookAt(idx: Int): T {
        return bookList[idx]
    }

    /**
     * 获取迭代器
     * @return Iterator<T> 返回迭代器
     */
    override fun iterator(): Iterator<T> {
        return BookShelfIterator(this)
    }

    /**
     * 书架迭代器类
     * @property shelf BookShelf<T> 容器传参
     * @property index Int 位置
     * @constructor 初始化容器和位置
     */
    private open inner class BookShelfIterator constructor(
        private var shelf: BookShelf<T>,
        private var index: Int = 0
    ) : Iterator<T> {
        /**
         * iter实现
         * @return Boolean
         */
        override fun hasNext(): Boolean {
            if (index < bookList.size) return true
            return false
        }

        /**
         * iter实现
         * @return T
         */
        override fun next(): T {
            return shelf.getBookAt(index).also { index++ }
        }
    }
}