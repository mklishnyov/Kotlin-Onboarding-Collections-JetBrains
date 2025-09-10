package org.jetbrains.kotlin.course.duck.shop.functions.change

import org.jetbrains.kotlin.course.duck.shop.duck.Duck
import org.jetbrains.kotlin.course.duck.shop.duck.getDescription
import org.springframework.stereotype.Service

@Service
class GameChangeFunctionsService  {
    fun MutableList<Duck>.addRandomDuck(): Duck {
        val rnd = Duck.entries.random()
        this.add(rnd)
        return rnd
    }

    fun MutableSet<Duck>.addRandomDuck(): Duck {
        var rnd = Duck.entries.random()
        while (rnd in this) rnd = Duck.entries.random()
        this.add(rnd)
        return rnd
    }

    fun MutableMap<Duck, String>.addRandomDuck(): Pair<Duck, String>? {
        val rnd = Duck.entries.random()
        while (rnd !in this.keys) {
            rnd = Duck.entries.random()
        }
        return rnd to rnd.getDescription()
    }

    fun List<Duck>.removeRandomDuck(): List<Duck> {
        val mList = this.toMutableList()
        mList.removeAt(mList.indices.random())
        return mList.toList()
    }

    fun Set<Duck>.removeRandomDuck(): Set<Duck> {
        val mSet = this.toMutableSet()
        mSet.remove(mSet.random())
        return mSet
    }

    fun Map<Duck, String>.removeRandomDuck(): Map<Duck, String> {
        val mMap = this.toMutableMap()
        mMap.remove(mMap.keys.random())
        return mMap.toMap()
    }
}
