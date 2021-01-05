/*
 * Copyright (c) xmmmmmovo 2021.
 */

package prototype_test

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.platform.commons.logging.LoggerFactory
import prototype.MessageBox
import prototype.UnderlinePen
import prototype.framework.Manager

internal class PrototypeTest {
    companion object {
        private val log = LoggerFactory.getLogger(PrototypeTest::class.java)
        private val manager = Manager()

        @BeforeAll
        @JvmStatic
        fun before() {
            log.info { "PrototypeTest start" }
        }

        @AfterAll
        @JvmStatic
        fun after() {
            log.info { "PrototypeTest end" }
        }
    }

    @Test
    fun messageBoxTest() {
        val mbox = MessageBox('*')
        val sbox = MessageBox('/')

        manager.register("wb", mbox)
        manager.register("sb", sbox)

        // 这里由于kotlin bug过不了测试 等待官方修复
        // https://youtrack.jetbrains.com/issue/KT-24193
        val p1 = manager.create("wb")
        p1.use("Hello World.")

        val p2 = manager.create("sb")
        p2.use("Hello World.")
    }

    @Test
    fun underlinePenTest() {
        val upen = UnderlinePen('~')

        manager.register("sm", upen)

        val p1 = manager.create("sm")
        p1.use("Hello World.")
    }
}