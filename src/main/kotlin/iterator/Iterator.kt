/*
 * Copyright (c) xmmmmmovo 2020.
 */

package iterator

/**
 * 迭代器本体
 * @author xmmmmmovo
 * @param T
 */
interface Iterator<out T> {
    /**
     * 是否有下一个元素
     * @author xmmmmmovo
     * @return Boolean 返回是否有
     */
    fun hasNext(): Boolean

    /**
     * 返回下一个元素
     * @author xmmmmmovo
     * @return T 下一个元素
     */
    fun next(): T
}