/*
 * Copyright (c) xmmmmmovo 2020.
 */

package singleton_test

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.platform.commons.logging.LoggerFactory
import singleton.exercises.Triple
import kotlin.test.assertEquals

internal class TripleTest {
    companion object {
        private val log = LoggerFactory.getLogger(TripleTest::class.java)

        @BeforeAll
        @JvmStatic
        fun before() {
            log.info { "TripleTest start" }
        }

        @AfterAll
        @JvmStatic
        fun after() {
            log.info { "TripleTest end" }
        }
    }

    @Test
    fun tripleTest() {
        assertEquals(false, Triple.getInstance(0) == Triple.getInstance(1))
        assertEquals(true, Triple.getInstance(0) == Triple.getInstance(0))
        assertEquals(0, Triple.getInstance(0).instanceId)
        assertThrows(IndexOutOfBoundsException::class.java) {
            Triple.getInstance(4)
        }
    }

}