package org.jetbrains.kotlin.course.duck.shop.functions.change

import org.jetbrains.kotlin.course.duck.shop.duck.Duck
import org.jetbrains.kotlin.course.duck.shop.duck.generateRandomDuck
import org.jetbrains.kotlin.course.duck.shop.duck.getDescription
import org.jetbrains.kotlin.course.duck.shop.duck.getNewRandomDuck
import org.springframework.stereotype.Service

@Service
class GameChangeFunctionsService {
    fun MutableList<Duck>.addRandomDuck(): Duck =
        this.getNewRandomDuck().also { this.add(it) }

    fun MutableSet<Duck>.addRandomDuck(): Duck =
        this.getNewRandomDuck().also { this.add(it) }

    fun MutableMap<Duck, String>.addRandomDuck(): Pair<Duck, String> =
        this.keys.getNewRandomDuck()
            .let { it to it.getDescription() }
            .also { (duck, description) ->
                this.toMutableMap()[duck] = description
            }

    fun List<Duck>.removeRandomDuck(): List<Duck> =
        this.toMutableList().apply { removeAt(indices.random()) }.toList()

    fun Set<Duck>.removeRandomDuck(): Set<Duck> =
        this.toMutableSet().apply { remove(random()) }

    fun Map<Duck, String>.removeRandomDuck(): Map<Duck, String> =
        this.toMutableMap().apply { remove(keys.random()) }.toMap()
}
