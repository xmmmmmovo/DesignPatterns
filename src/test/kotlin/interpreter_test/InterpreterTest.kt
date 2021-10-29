/*
 * Copyright (c) xmmmmmovo 2021.
 */

package interpreter_test

import Interpreter.core.Context
import Interpreter.core.ProgramNode
import Interpreter.gui.MainGUI
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.platform.commons.logging.LoggerFactory
import java.io.File

class InterpreterTest {
    companion object {
        private val log = LoggerFactory.getLogger(InterpreterTest::class.java)

        @BeforeAll
        @JvmStatic
        fun before() {
            log.info { "InterpreterTest start" }
        }

        @AfterAll
        @JvmStatic
        fun after() {
            log.info { "InterpreterTest end" }
        }
    }

    @Test
    fun parseTest() {
        val filePath = javaClass.getResource("/program.inter")!!.file
        File(filePath).bufferedReader().run {
            while (readLine().run {
                    if (this == null) false else true.also {
                        println("text=\"$this\"")
                        val node = ProgramNode()
                        node.parse(Context(this))
                        println("node=$node")
                    }
                }) {
            }
            close()
        }
    }

//    @Test
//    fun GUITest() {
//        MainGUI()
//    }
}