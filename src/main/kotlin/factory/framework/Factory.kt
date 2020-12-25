/*
 * Copyright (c) xmmmmmovo 2020.
 */

package factory.framework

abstract class Factory {
    fun create(owner: String): Product {
        return createProduct(owner).also { registerProduct(it) }
    }

    protected abstract fun createProduct(owner: String): Product
    protected abstract fun registerProduct(product: Product)
}