/*
 * Copyright (c) xmmmmmovo 2020.
 */

package adapter.exercises

import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream
import java.util.*

class PropertiesAdapter : FileIO {
    private val properties = Properties()

    @Throws(IOException::class)
    override fun readFromFile(filename: String) {
        properties.load(FileInputStream(filename))
    }

    @Throws(IOException::class)
    override fun writeToFile(filename: String) {
        properties.store(FileOutputStream(filename), "图解设计模式")
    }

    override fun setValue(key: String, value: String): Boolean {
        properties.setProperty(key, value)
        return true
    }

    override fun getValue(key: String): String {
        return properties.getProperty(key, "")
    }
}