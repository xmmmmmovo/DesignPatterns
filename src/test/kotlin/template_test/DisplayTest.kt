/*
 * Copyright (c) xmmmmmovo 2020.
 */

package template_test

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.platform.commons.logging.LoggerFactory
import template.AbstractDisplay
import template.CharDisplay
import template.StringDisplay

internal class DisplayTest {
    companion object {
        private val log = LoggerFactory.getLogger(DisplayTest::class.java)

        @BeforeAll
        @JvmStatic
        fun before() {
            log.info { "DisplayTest start" }
        }

        @AfterAll
        @JvmStatic
        fun after() {
            log.info { "DisplayTest end" }
        }
    }

    @Test
    fun charDisplayTest() {
        val c: AbstractDisplay = CharDisplay('a')
        c.display()
    }

    @Test
    fun textDisplayTest() {
        val c: AbstractDisplay = StringDisplay("你好~")
        c.display()
    }

}