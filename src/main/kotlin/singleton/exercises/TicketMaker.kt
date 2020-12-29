/*
 * Copyright (c) xmmmmmovo 2020.
 */

package singleton.exercises

object TicketMaker {
    private var ticket = 1000
    fun getNextTicketNumber() = ticket++
}