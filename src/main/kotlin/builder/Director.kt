/*
 * Copyright (c) xmmmmmovo 2021.
 */

package builder

/**
 * 监工类
 * 主要根据builder进行包装
 * @property builder Builder 抽象建造方法
 * @constructor
 */
class Director constructor(private val builder: Builder) {
    fun construct(): Builder {
        builder.makeTitle("Greeting")
        builder.makeString("从早上至下午")
        builder.makeItems(listOf("早上好", "下午好"))
        builder.makeString("晚上")
        builder.makeItems(listOf("晚上好", "晚安", "再见"))
        builder.close()
        return builder
    }
}