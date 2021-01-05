/*
 * Copyright (c) xmmmmmovo 2020.
 */

package singleton.exercises

/**
 * 加票类
 */
object TicketMaker {
    /**
     * 票
     */
    private var ticket = 1000

    /**
     * 下一张票
     * @return Int
     */
    @Synchronized
    fun getNextTicketNumber() = ticket++
}