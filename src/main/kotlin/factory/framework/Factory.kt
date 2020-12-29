/*
 * Copyright (c) xmmmmmovo 2020.
 */

package factory.framework

/**
 * 工厂抽象类
 */
abstract class Factory {

    /**
     * 创建产品
     * @param owner String 所有者字符串
     * @return Product 生产的产品
     */
    fun create(owner: String, id: String): Product {
        return createProduct(owner, id).also { registerProduct(it) }
    }

    /**
     * 创建产品抽象方法
     * @param owner String
     * @param id String
     * @return Product
     */
    protected abstract fun createProduct(owner: String, id: String): Product

    /**
     * 注册产品的抽象方法
     * @param product Product
     */
    protected abstract fun registerProduct(product: Product)
}