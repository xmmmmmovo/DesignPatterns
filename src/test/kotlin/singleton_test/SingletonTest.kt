/*
 * Copyright (c) xmmmmmovo 2020.
 */

package singleton_test

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.platform.commons.logging.LoggerFactory
import singleton.Singleton
import kotlin.test.assertEquals

internal class SingletonTest {
    companion object {
        private val log = LoggerFactory.getLogger(SingletonTest::class.java)

        @BeforeAll
        @JvmStatic
        fun before() {
            log.info { "SingletonTest start" }
        }

        @AfterAll
        @JvmStatic
        fun after() {
            log.info { "SingletonTest end" }
        }
    }

    @Test
    fun singletonTest() {
        val s1 = Singleton
        val s2 = Singleton
        assertEquals(s1, s2)
    }
}