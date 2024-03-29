/*
 * Copyright (c) xmmmmmovo 2021.
 */

package prototype.framework

/**
 * 声明了抽象方法use和createClone接口
 */
abstract class Product : Cloneable {
    /**
     * use抽象方法
     * 如何使用交给子类进行实现
     * @param s String
     */
    abstract fun use(s: String)

    /**
     * 返回产品克隆
     * @return Product
     */
    fun createClone(): Product {
        return clone() as? Product ?: throw CloneNotSupportedException()
    }
}