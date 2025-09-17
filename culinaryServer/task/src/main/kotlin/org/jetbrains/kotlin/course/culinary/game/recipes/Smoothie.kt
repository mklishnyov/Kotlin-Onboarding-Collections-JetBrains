package org.jetbrains.kotlin.course.culinary.game.recipes

import org.jetbrains.kotlin.course.culinary.game.blender
import org.jetbrains.kotlin.course.culinary.game.fridge
import org.jetbrains.kotlin.course.culinary.game.kitchen
import org.jetbrains.kotlin.course.culinary.models.food.Fruit
import org.jetbrains.kotlin.course.culinary.models.food.FruitType

fun getFruitsForSmoothie(): List<Fruit> =
    listOf(FruitType.Berry, FruitType.Citrus)
        .map { type -> fridge.getBasketOf(type).also { basket ->
            kitchen.put(basket)
            kitchen.takeFromBasket(basket)
        }}
        .flatMap { basket -> List(basket.capacity) { Fruit(basket.type) } }
        .sortedBy { it.type.sugarContent }

fun List<Fruit>.cookSmoothie() {
    this.forEach { blender.add(it) }
    blender.blend()
}
