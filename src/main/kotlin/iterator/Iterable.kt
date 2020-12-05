/*
 * Copyright (c) xmmmmmovo 2020.
 */

package iterator

/**
 * 迭代器接口
 * @author xmmmmmovo
 * @param T 模板
 */
interface Iterable<out T> {
    /**
     * 返回迭代器
     * @author xmmmmmovo
     * @date 2020/7/28 16:40
     * @return 返回一个迭代器
     * @since version-1.0
     */
    operator fun iterator(): Iterator<T>
}