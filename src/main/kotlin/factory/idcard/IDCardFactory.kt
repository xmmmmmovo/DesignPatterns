/*
 * Copyright (c) xmmmmmovo 2020.
 */

package factory.idcard

import factory.framework.Factory
import factory.framework.Product

/**
 * ID卡工厂
 * @property _owners mutableMap<String, String>  拥有者列表
 * @property owner Map<String, String> 对外的拥有者
 */
class IDCardFactory : Factory() {
    private val _owners = mutableMapOf<String, String>()

    val owner: Map<String, String>
        get() = _owners

    /**
     * 创建产品
     * @param owner String 产品所有
     * @param id String
     * @return Product 创建的产品
     */
    override fun createProduct(owner: String, id: String): Product {
        return IDCard(owner, id)
    }

    /**
     * 注册产品
     * @param product Product 用于注册的产品
     */
    override fun registerProduct(product: Product) {
        _owners[(product as IDCard).id] = product.owner
    }
}