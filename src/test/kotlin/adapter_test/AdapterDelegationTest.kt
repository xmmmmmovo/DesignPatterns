/*
 * Copyright (c) xmmmmmovo 2020.
 */

package adapter_test

import adapter.delegation.Print
import adapter.delegation.PrintBanner
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.platform.commons.logging.LoggerFactory

internal class AdapterDelegationTest {
    companion object {
        private val log = LoggerFactory.getLogger(AdapterDelegationTest::class.java)
        private val p: Print = PrintBanner("114514")

        @BeforeAll
        @JvmStatic
        fun before() {
            log.info { "AdapterDelegationTest start" }
        }

        @AfterAll
        @JvmStatic
        fun after() {
            log.info { "AdapterDelegationTest end" }
        }
    }

    @Test
    fun printWeak() {
        p.printWeak()
    }

    @Test
    fun printStrong() {
        p.printStrong()
    }
}