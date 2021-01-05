/*
 * Copyright (c) xmmmmmovo 2021.
 */

package prototype.framework

/**
 * 使用Product来复制示例
 * @property showcase HashMap<String, Product> 保存示例“名字”和“示例”之间的对应关系
 */
class Manager {
    private val showcase = HashMap<String, Product>()

    /**
     *
     * @param s String
     * @param proto Product
     */
    fun register(s: String, proto: Product) {
        showcase[s] = proto
    }

    /**
     *
     * @param protoName Product
     * @return Product
     */
    fun create(protoName: String): Product {
        return showcase[protoName]?.createClone() ?: throw NullPointerException()
    }
}