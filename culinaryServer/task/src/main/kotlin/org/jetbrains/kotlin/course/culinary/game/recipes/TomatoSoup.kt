@file:Suppress("ForbiddenComment")

package org.jetbrains.kotlin.course.culinary.game.recipes

import org.jetbrains.kotlin.course.culinary.implementation.KitchenImpl
import org.jetbrains.kotlin.course.culinary.implementation.cooking.PotImpl
import org.jetbrains.kotlin.course.culinary.implementation.storage.FridgeImpl.getVegetable
import org.jetbrains.kotlin.course.culinary.models.food.SpiceType
import org.jetbrains.kotlin.course.culinary.models.food.Vegetable
import org.jetbrains.kotlin.course.culinary.models.food.VegetableType

internal const val NUMBER_OF_TOMATOES = 3

fun getTomatoesForSoup(): List<Vegetable> =
    List(NUMBER_OF_TOMATOES) { getVegetable(VegetableType.Tomato) }

fun prepareTomatoes(tomatoes: List<Vegetable>) {
    tomatoes.forEach { KitchenImpl.put(it) }
    val cutTomatoes = tomatoes.map { KitchenImpl.cut(it) }
    val takenCutTomatoes = cutTomatoes.map { KitchenImpl.take(it) }
    takenCutTomatoes.forEach { PotImpl.put(it) }
}

fun generateSpices(): Sequence<SpiceType> = TODO("Not implemented yet")

fun addSpices(spices: Sequence<SpiceType>) {
    TODO("Not implemented yet")
}
