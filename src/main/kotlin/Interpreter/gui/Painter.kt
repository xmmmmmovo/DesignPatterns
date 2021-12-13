/*
 * Copyright (c) xmmmmmovo 2021.
 */

package Interpreter.gui

import Interpreter.core.ExecuteException
import java.awt.Color
import java.awt.Graphics
import java.awt.Graphics2D
import java.awt.Point
import javax.swing.JPanel


class Painter(width: Int, height: Int) : JPanel() {
    private val midPoint = Point(width / 2, height / 2)
    private var direction: Int = 0

    init {
        setBounds(0, 0, width, height)
        initialize()
    }

    private fun initialize() {
        foreground = Color.red
        background = Color.white
        direction = 0
    }

    override fun paint(g: Graphics?) {
        super.paint(g)
        if (g == null) return
        // 创建 Graphics 的副本, 需要改变 Graphics 的参数,
        // 这里必须使用副本, 避免影响到 Graphics 原有的设置
        val g2d = g.create() as Graphics2D

        try {
        } catch (e: ExecuteException) {
            System.err.println("error!")
        }
    }
}