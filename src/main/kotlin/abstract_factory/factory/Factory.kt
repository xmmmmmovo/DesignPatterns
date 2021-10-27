/*
 * Copyright (c) xmmmmmovo 2021.
 */

package abstract_factory.factory

abstract class Factory {
    companion object {
        fun getFactory(classname: String): Factory? {
            try {
                return Class.forName(classname).getDeclaredConstructor().newInstance() as Factory
            } catch (e: ClassNotFoundException) {
                System.err.println("没有找到${classname}类！")
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return null
        }
    }

    abstract fun createLink(caption: String, url: String): Link

    abstract fun createTray(caption: String): Tray

    abstract fun createPage(title: String, author: String): Page
}