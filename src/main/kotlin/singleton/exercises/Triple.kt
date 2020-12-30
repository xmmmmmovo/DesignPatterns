/*
 * Copyright (c) xmmmmmovo 2020.
 */

package singleton.exercises

import java.util.concurrent.ConcurrentHashMap

class Triple private constructor(val instanceId: Int) {

    companion object {
        private val instanceMap = ConcurrentHashMap<Int, Triple>()

        fun getInstance(instanceId: Int): Triple =
            if (instanceId > 2 || instanceId < 0) throw IndexOutOfBoundsException()
            else instanceMap[instanceId].run {
                this ?: synchronized(Triple::class.java) {
                    instanceMap[instanceId].run { this ?: Triple(instanceId).also { instanceMap[instanceId] = it } }
                }
            }
    }
}