/*
 * Copyright (c) xmmmmmovo 2020.
 */

package adapter_test

import adapter.exercises.FileIO
import adapter.exercises.PropertiesAdapter
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.platform.commons.logging.LoggerFactory
import kotlin.test.assertEquals

internal class FilePropertiesTest {
    companion object {
        private val log = LoggerFactory.getLogger(FilePropertiesTest::class.java)
        private val pIO: FileIO = PropertiesAdapter()

        @BeforeAll
        @JvmStatic
        fun before() {
            log.info { "FilePropertiesTest start" }
        }

        @AfterAll
        @JvmStatic
        fun after() {
            log.info { "FilePropertiesTest end" }
        }
    }

    @Test
    fun loadGetAndSave() {
        val filePath = javaClass.getResource("/file.txt").file
        pIO.readFromFile(filePath)
        assertEquals(true, pIO.setValue("year", "2004"))
        assertEquals(true, pIO.setValue("month", "4"))
        assertEquals(true, pIO.setValue("day", "21"))
        assertEquals("2004", pIO.getValue("year"))
        val rootPath = javaClass.getResource("/").path
        pIO.writeToFile(rootPath + "out.txt")
    }

}