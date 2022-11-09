package com.example.kotlinhomework.KotlinHomeWork1

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet

class Task4 {

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val shop = Shop()
            var product = Product(1, "t-shirt", 200)
            var product1 = Product(2, "shoes", 1000)
            var product2 = Product(3, "jeans", 500)

            shop.addProduct(product)
            shop.addProduct(product1)
            shop.addProduct(product2)

            val allProduct: HashSet<Product> = shop.getAllProduct()

            val sortedAllProductsByPrice: ArrayList<Product> = ArrayList(allProduct)
            sortedAllProductsByPrice.sortBy { it.getPriceOfProduct() }

            println("Sorted list")
            for (sorted in sortedAllProductsByPrice){
                println("${sorted.getId()} ${sorted.getNameOfProduct()} ${sorted.getPriceOfProduct()}")
            }

            println("Unsorted list")
            for (item in allProduct){
                println("${item.getId()} ${item.getNameOfProduct()} ${item.getPriceOfProduct()}")
            }

            println()

            println("delete")

            shop.deleteProduct(product1.getId())
            for (item in allProduct){
              println("${item.getId()} ${item.getNameOfProduct()} ${item.getPriceOfProduct()}")
            }

          shop.editProduct(Product(3, "jeans", 1010))
          for (item in allProduct){
              println("${item.getId()} ${item.getNameOfProduct()} ${item.getPriceOfProduct()}")
          }


            println()

            val sortedAllProductByLast: ArrayList<Product> = ArrayList(allProduct)
            sortedAllProductByLast.reverse()
            for (item in sortedAllProductByLast){
              println("${item.getId()} ${item.getNameOfProduct()} ${item.getPriceOfProduct()}")
          }
        }
    }
}

class Product(private val id: Int, private val nameOfProduct: String, private val priceOfProduct: Int){

    fun getId(): Int {
        return id
    }

    fun getNameOfProduct(): String {
        return nameOfProduct
    }

    fun getPriceOfProduct(): Int {
        return priceOfProduct
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Product

        if (id != other.id) return false
        if (nameOfProduct != other.nameOfProduct) return false
        if (priceOfProduct != other.priceOfProduct) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + nameOfProduct.hashCode()
        result = 31 * result + priceOfProduct
        return result
    }


}

class Shop{
    private val productList = HashSet<Product>()


    fun addProduct(product: Product){
        productList.add(product)
    }
    fun getAllProduct(): HashSet<Product> { //????????
        return productList
    }

    fun deleteProduct(id: Int){

        productList.removeIf {product -> product.getId() == id}
    }

    fun editProduct(product: Product){ // NOT WORK, DONT KNOW HOW TO WRITE THIS
        for (productInList in productList){
            if (product.getId() == productInList.getId()){
                productList.remove(productInList)
                productList.add(product)
            }
        }

    }
}