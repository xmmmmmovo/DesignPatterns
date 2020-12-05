/*
 * Copyright (c) xmmmmmovo 2020.
 */

package adapter_test

import adapter.extern.Print
import adapter.extern.PrintBanner
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.platform.commons.logging.LoggerFactory

class AdapterExternTest {
    companion object {
        private val log = LoggerFactory.getLogger(AdapterExternTest::class.java)
        private val p: Print = PrintBanner("114514")

        @BeforeAll
        @JvmStatic
        fun before() {
            log.info { "AdapterExternTest start" }
        }

        @AfterAll
        @JvmStatic
        fun after() {
            log.info { "AdapterExternTest end" }
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