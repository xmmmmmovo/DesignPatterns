/*
 * Copyright (c) xmmmmmovo 2020.
 */

package factory.idcard

import factory.framework.Product

/**
 * id 卡示例
 * @property owner String  卡所有者字符串
 * @constructor 输出创建语句
 */
class IDCard(val owner: String, val id: String) : Product() {

    init {
        println("制作${owner}的ID卡")
    }

    /**
     * 使用函数实现
     */
    override fun use() {
        println("使用id为${id}${owner}的ID卡")
    }
}