/*
 * Copyright (c) xmmmmmovo 2020.
 */

package singleton.exercises

import java.util.concurrent.ConcurrentHashMap

/**
 * 最多生成三个单例的类
 * @property instanceId Int 单例id
 * @constructor 私有构造函数 只能内部创建
 */
class Triple private constructor(val instanceId: Int) {
    
    companion object {
        /**
         * 单例表
         */
        private val instanceMap = ConcurrentHashMap<Int, Triple>()

        /**
         * 双重验证机制进行单例创建
         * @param instanceId Int 单例id
         * @return Triple 返回单例
         */
        fun getInstance(instanceId: Int): Triple =
            if (instanceId > 2 || instanceId < 0) throw IndexOutOfBoundsException()
            else instanceMap[instanceId].run {
                this ?: synchronized(Triple::class.java) {
                    instanceMap[instanceId].run { this ?: Triple(instanceId).also { instanceMap[instanceId] = it } }
                }
            }
    }
}