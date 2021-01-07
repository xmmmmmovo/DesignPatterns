/*
 * Copyright (c) xmmmmmovo 2021.
 */

package builder

import java.io.FileWriter
import java.io.IOException
import java.io.PrintWriter

class HTMLBuilder : Builder {
    private lateinit var filename: String
    private lateinit var writer: PrintWriter

    override fun makeTitle(title: String) {
        filename = "$title.html"
        try {
            writer = PrintWriter(FileWriter(filename))
        } catch (e: IOException) {
            e.printStackTrace()
        }
        writer.println("<html><head><title>$title</title></head><body>")
        writer.println("<h1>$title</h1>")
    }

    override fun makeString(str: String) {
        writer.println("<p>$str</p>")
    }

    override fun makeItems(items: List<String>) {
        writer.println("<ul>")
        items.forEach { s: String ->
            writer.println("<li>$s</li>")
        }
        writer.println("</ul>")
    }

    override fun close() {
        writer.println("</body></html>")
        writer.close()
    }

    override fun build(): Any {
        return filename
    }
}