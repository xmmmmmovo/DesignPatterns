/*
 * Copyright (c) xmmmmmovo 2021.
 */

package strategy

import kotlin.random.Random

class WinningStrategy(seed: Int) : Stratergy {
    private var won = false;
    private val random = Random(seed)
    private var prevHand: Hand = Hand(HandType.PAPER)

    override fun nextHand(): Hand {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3))
        }
        return prevHand
    }

    override fun study(win: Boolean) {
        won = win
    }
}