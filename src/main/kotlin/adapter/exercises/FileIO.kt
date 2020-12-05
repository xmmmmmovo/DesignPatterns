/*
 * Copyright (c) xmmmmmovo 2020.
 */

package adapter.exercises

import java.io.IOException

/**
 * 文件IO接口
 * @author xmmmmmovo
 */
interface FileIO {
    @Throws(IOException::class)
    fun readFromFile(filename: String)

    @Throws(IOException::class)
    fun writeToFile(filename: String)

    fun setValue(key: String, value: String): Boolean

    fun getValue(key: String): String
}