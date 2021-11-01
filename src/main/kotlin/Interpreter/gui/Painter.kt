/*
 * Copyright (c) xmmmmmovo 2021.
 */

package Interpreter.gui

import java.awt.Color
import java.awt.Graphics
import java.awt.Graphics2D
import javax.swing.JPanel


class Painter : JPanel() {
    override fun paint(g: Graphics?) {
        super.paint(g)
        if (g == null) return
        // 创建 Graphics 的副本, 需要改变 Graphics 的参数,
        // 这里必须使用副本, 避免影响到 Graphics 原有的设置
        val g2d = g.create() as Graphics2D

        g2d.color = Color.red
        g2d.drawRect(1, 1, 30, 30)
    }
}