/*
 * Copyright (c) xmmmmmovo 2020.
 */

package adapter.extern

/**
 * 适配器，用于讲Banner适配到Print接口
 * @author xmmmmmovo
 * @constructor
 */
class PrintBanner(string: String) : Banner(string), Print {
    /**
     * 适配Weak接口
     */
    override fun printWeak() {
        showWithParen()
    }

    /**
     * 适配接口
     */
    override fun printStrong() {
        showWithAster()
    }
}