/*
 * Copyright (c) xmmmmmovo 2021.
 */

package strategy

enum class HandType {
    ROCK,
    SCISSORS,
    PAPER
}

class Hand(private val t: HandType) {
    companion object {
        val hands = arrayOf(Hand(HandType.ROCK), Hand(HandType.SCISSORS), Hand(HandType.PAPER))
        val names = arrayOf("石头", "剪刀", "布")

        fun getHand(t: Int) = hands[t]
    }

    fun isStrongerThan(hand: Hand): Boolean {
        return fight(hand) == 1
    }


    fun isWeakerThan(hand: Hand): Boolean {
        return fight(hand) == -1
    }

    private fun fight(hand: Hand): Int {
        if (this == hand) return 0
        if ((this.t.ordinal + 1) % 3 == hand.t.ordinal) return 1
        return -1
    }

    override fun toString(): String {
        return names[t.ordinal]
    }
}