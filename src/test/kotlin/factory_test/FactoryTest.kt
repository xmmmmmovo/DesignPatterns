/*
 * Copyright (c) xmmmmmovo 2020.
 */

package factory_test

import factory.idcard.IDCardFactory
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.platform.commons.logging.LoggerFactory

class FactoryTest {
    companion object {
        private val log = LoggerFactory.getLogger(FactoryTest::class.java)

        @BeforeAll
        @JvmStatic
        fun before() {
            log.info { "FactoryTest start" }
        }

        @AfterAll
        @JvmStatic
        fun after() {
            log.info { "FactoryTest end" }
        }
    }

    @Test
    fun factoryTest() {
        val factory = IDCardFactory()
        val c1 = factory.create("小红")
        val c2 = factory.create("小明")
        val c3 = factory.create("小刚")
        c1.use()
        c2.use()
        c3.use()
    }
}