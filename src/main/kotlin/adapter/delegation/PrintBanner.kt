/*
 * Copyright (c) xmmmmmovo 2020.
 */

package adapter.delegation

/**
 * 适配器，用于讲Banner适配到Print接口
 * 使用委托
 * @author xmmmmmovo
 * @constructor
 */
class PrintBanner(string: String) : Print() {
    /**
     * 委托Banner来进行
     */
    private val banner = Banner(string)

    /**
     * 适配Weak接口
     */
    override fun printWeak() {
        banner.showWithParen()
    }

    /**
     * 适配接口
     */
    override fun printStrong() {
        banner.showWithAster()
    }
}