/*
 * Copyright (c) xmmmmmovo 2021.
 */

package bridge

class CountDisplay(displayImpl: DisplayImpl) : Display(displayImpl) {
    fun multiDisplay(times: Int) {
        open()
        for (i in 0 until times) {
            print()
        }
        close()
    }
}