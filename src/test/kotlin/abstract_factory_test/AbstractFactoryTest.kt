/*
 * Copyright (c) xmmmmmovo 2021.
 */

package abstract_factory_test

import abstract_factory.factory.Factory
import abstract_factory.factory.Link
import abstract_factory.factory.Page
import abstract_factory.factory.Tray
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.platform.commons.logging.LoggerFactory
import kotlin.system.exitProcess


internal class AbstractFactoryTest {
    companion object {
        private val log = LoggerFactory.getLogger(AbstractFactoryTest::class.java)

        @BeforeAll
        @JvmStatic
        fun before() {
            log.info { "AbstractFactoryTest start" }
        }

        @AfterAll
        @JvmStatic
        fun after() {
            log.info { "AbstractFactoryTest end" }
        }
    }

    @ParameterizedTest
    @CsvSource("abstract_factory.listfactory.ListFactory")
    fun mainTest(arg: String) {
        val factory: Factory = (Factory.getFactory(arg) ?: run { exitProcess(0) })

        val people: Link = factory.createLink("人民日报", "https://www.people.com.cn/")
        val gmw: Link = factory.createLink("光明日报", "https://www.gmw.cn/")

        val us_yahoo: Link = factory.createLink("Yahoo!", "http://www.yahoo.com/")
        val jp_yahoo: Link = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/")
        val excite: Link = factory.createLink("Excite", "http://www.excite.com/")
        val google: Link = factory.createLink("Google", "http://www.google.com/")

        val traynews: Tray = factory.createTray("日报")
        traynews.add(people)
        traynews.add(gmw)

        val trayyahoo: Tray = factory.createTray("Yahoo!")
        trayyahoo.add(us_yahoo)
        trayyahoo.add(jp_yahoo)

        val traysearch: Tray = factory.createTray("检索引擎")
        traysearch.add(trayyahoo)
        traysearch.add(excite)
        traysearch.add(google)

        val page: Page = factory.createPage("LinkPage", "杨文轩")
        page.add(traynews)
        page.add(traysearch)
        page.output()
    }
}