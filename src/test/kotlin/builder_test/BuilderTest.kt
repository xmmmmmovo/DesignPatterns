/*
 * Copyright (c) xmmmmmovo 2021.
 */

package builder_test

import builder.Director
import builder.HTMLBuilder
import builder.TextBuilder
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.platform.commons.logging.LoggerFactory

internal class BuilderTest {

    companion object {
        private val log = LoggerFactory.getLogger(BuilderTest::class.java)

        @BeforeAll
        @JvmStatic
        fun before() {
            log.info { "BuilderTest start" }
        }

        @AfterAll
        @JvmStatic
        fun after() {
            log.info { "BuilderTest end" }
        }
    }

    @Test
    fun textBuilderTest() {
        val tb = TextBuilder()
        val s = Director(tb).construct().build()
        println(s)
    }

    @Test
    fun htmlBuilderTest() {
        val hb = HTMLBuilder()
        val s = Director(hb).construct().build()
        println(s)
    }
}