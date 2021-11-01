/*
 * Copyright (c) xmmmmmovo 2021.
 */

package Interpreter.gui

import javax.swing.JFrame

class MainGUI() : JFrame() {
    init {
        this.layout = null
        this.setSize(520, 520)
        this.setLocationRelativeTo(null)
        val painter = Painter()
        painter.setBounds(0, 0, 520, 520)
        this.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        this.isVisible = true
        this.contentPane = painter
        while (true) {
            //不停的重绘JPanel,实现动画的效果
            painter.repaint()
            try {
                Thread.sleep(300)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }
    }
}

fun main() {
    MainGUI()
}