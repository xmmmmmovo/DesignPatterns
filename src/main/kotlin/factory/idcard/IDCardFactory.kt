/*
 * Copyright (c) xmmmmmovo 2020.
 */

package factory.idcard

import factory.framework.Factory
import factory.framework.Product

class IDCardFactory : Factory() {
    private val _owners = ArrayList<Any>()

    val owner: List<Any>
        get() = _owners

    override fun createProduct(owner: String): Product {
        return IDCard(owner)
    }

    override fun registerProduct(product: Product) {
        _owners.add((product as IDCard).owner)
    }
}