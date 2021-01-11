/*
 * Copyright (c) xmmmmmovo 2021.
 */

package builder

/**
 * 建造者抽象接口
 * @author xmmmmmovo
 */
interface Builder {
    fun makeTitle(title: String)
    fun makeString(str: String)
    fun makeItems(items: List<String>)
    fun close()
    fun build(): Any
}