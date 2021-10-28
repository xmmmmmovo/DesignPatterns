/*
 * Copyright (c) xmmmmmovo 2021.
 */

package strategy

interface Stratergy {
    fun nextHand(): Hand
    fun study(win: Boolean)
}