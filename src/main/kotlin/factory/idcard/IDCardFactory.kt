/*
 * Copyright (c) xmmmmmovo 2020.
 */

package factory.idcard

import factory.framework.Factory
import factory.framework.Product

/**
 * ID卡工厂
 * @property _owners ArrayList<Any>  拥有者列表
 * @property owner List<Any> 对外的拥有者
 */
class IDCardFactory : Factory() {
    private val _owners = ArrayList<Any>()

    val owner: List<Any>
        get() = _owners

    /**
     * 创建产品
     * @param owner String 产品所有
     * @return Product 创建的产品
     */
    override fun createProduct(owner: String): Product {
        return IDCard(owner)
    }

    /**
     * 注册产品
     * @param product Product 用于注册的产品
     */
    override fun registerProduct(product: Product) {
        _owners.add((product as IDCard).owner)
    }
}