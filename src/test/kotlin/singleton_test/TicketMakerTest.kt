/*
 * Copyright (c) xmmmmmovo 2020.
 */

package singleton_test

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.platform.commons.logging.LoggerFactory
import singleton.exercises.TicketMaker
import kotlin.test.assertEquals

internal class TicketMakerTest {
    companion object {
        private val log = LoggerFactory.getLogger(TicketMakerTest::class.java)

        @BeforeAll
        @JvmStatic
        fun before() {
            log.info { "TicketMakerTest start" }
        }

        @AfterAll
        @JvmStatic
        fun after() {
            log.info { "TicketMakerTest end" }
        }
    }

    @Test
    fun singletonTest() {
        assertEquals(1000, TicketMaker.getNextTicketNumber())
        assertEquals(1001, TicketMaker.getNextTicketNumber())
        assertEquals(1002, TicketMaker.getNextTicketNumber())
    }
}