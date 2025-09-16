package org.jetbrains.kotlin.course.culinary.game.recipes

import org.jetbrains.kotlin.course.culinary.game.fridge
import org.jetbrains.kotlin.course.culinary.models.food.Fruit
import org.jetbrains.kotlin.course.culinary.models.food.FruitType

fun getFruitsForSmoothie(): List<Fruit> = fridge.getBasketOf(FruitType.entries.random())

fun List<Fruit>.cookSmoothie() {
    TODO("Not implemented yet")
}
