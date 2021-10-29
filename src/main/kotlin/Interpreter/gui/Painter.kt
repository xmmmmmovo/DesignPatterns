/*
 * Copyright (c) xmmmmmovo 2021.
 */

package Interpreter.gui

import java.awt.Color
import java.awt.Graphics
import javax.swing.JPanel

class Painter : JPanel() {
    override fun paint(g: Graphics?) {
        super.paint(g)
        println(g)
        if (g == null) return
        g.color = Color.red
        g.fillRect(13, 13, 400 / 3, 200)
    }
}