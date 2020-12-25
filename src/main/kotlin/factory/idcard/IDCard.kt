/*
 * Copyright (c) xmmmmmovo 2020.
 */

package factory.idcard

import factory.framework.Product

class IDCard(val owner: String) : Product() {

    init {
        println("制作${owner}的ID卡")
    }

    override fun use() {
        println("使用${owner}的ID卡")
    }
}