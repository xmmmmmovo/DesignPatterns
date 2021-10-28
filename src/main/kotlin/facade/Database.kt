/*
 * Copyright (c) xmmmmmovo 2021.
 */

package facade

import java.io.FileInputStream
import java.io.IOException
import java.util.*

fun getProperties(dbname: String): Properties {
    return Properties().apply {
        try {
            load(FileInputStream("$dbname.txt"))
        } catch (e: IOException) {
            println("Warning: $dbname.txt not found")
        }
    }
}