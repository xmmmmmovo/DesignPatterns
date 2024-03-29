/*
 * Copyright (c) xmmmmmovo 2020.
 */

package iterator_test

import iterator.Book
import iterator.BookShelf
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.platform.commons.logging.LoggerFactory
import kotlin.test.assertEquals

internal class IteratorTest {
    companion object {
        private val log = LoggerFactory.getLogger(IteratorTest::class.java)
        private val bs = BookShelf<Book>(4)

        @BeforeAll
        @JvmStatic
        fun before() {
            log.info { "IteratorTest start" }
        }

        @AfterAll
        @JvmStatic
        fun after() {
            log.info { "IteratorTest end" }
        }
    }

    @Test
    fun addBooks() {
        assertEquals(true, bs.appendBook(Book("A")))
        assertEquals(true, bs.appendBook(Book("B")))
        assertEquals(true, bs.appendBook(Book("C")))
        assertEquals(true, bs.appendBook(Book("D")))
        assertEquals(false, bs.appendBook(Book("KKK")))
    }

    @Test
    fun getBook() {
        assertEquals(Book("A"), bs.getBookAt(0))
        assertEquals("B", bs.getBookAt(1).name)
    }

    @Test
    fun iteratorTest() {
        val it = bs.iterator()
        assertEquals(true, it.hasNext())
        assertEquals(Book("A"), it.next())
        assertEquals("B", it.next().name)
        assertEquals(Book("C"), it.next())
        assertEquals(Book("D"), it.next())
        assertEquals(false, it.hasNext())
    }

}