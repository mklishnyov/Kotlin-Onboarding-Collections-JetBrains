## Определение

Мы уже научились создавать различные коллекции в Kotlin, например, `List`, `Set` или `Map`. 
Однако, если вы попробуете изменить коллекции, которые мы создали с помощью встроенных функций (например, `listOf()`, и т.д.), 
вы получите ошибку:

```kotlin
fun main() {
    val listOfNumbers = listOf(1, 2, 3)
    listOfNumbers.add(4) // ОШИБКА

    val setOfNumbers = setOf(1, 2, 3)
    setOfNumbers.add(4) // ОШИБКА

    val mapOfNumbers = mapOf(1 to "one", 2 to "two", 3 to "three")
    mapOfNumbers.put(4, "four") // ОШИБКА
}
```

Это происходит потому, что в Kotlin все коллекции делятся на _только для чтения_ и _изменяемые_. 
Если у вас есть _только для чтения_ коллекция, вы можете создать её только один раз, а затем вы можете только _читать_ элементы 
из коллекции: например, этот код корректен:

```kotlin
fun main() {
    val listOfNumbers = listOf(1, 2, 3)
    println(listOfNumbers[1]) // 2
}
```

Если вам нужно как-то изменить коллекцию, вам нужно создать _изменяемую_ коллекцию или преобразовать _только для чтения_ 
версию в _изменяемую_:

```kotlin
fun main() {
    val listOfNumbers = listOf(1, 2, 3)
    val mutableListOfNumbers = listOfNumbers.toMutableList()
    mutableListOfNumbers.add(4) // ОК

    val setOfNumbers = mutableSetOf(1, 2, 3)
    setOfNumbers.add(4) // ОК
}
```

Каждая изменяемая коллекция имеет _все_ методы из версии только для чтения, но расширяет их 
такими методами, как `add`, `remove`, и т.д. 
Вы можете найти их все в официальной [документации Kotlin](https://kotlinlang.org/docs/collections-overview.html).

## создание изменяемой коллекции

Как упомянуто выше, вы можете _создать_ изменяемую коллекцию или _преобразовать_ существующую.

Чтобы создать изменяемые коллекции, вы можете использовать встроенные функции:

```kotlin
fun main() {
    val mutableList1 = mutableListOf<Int>() // Или: ArrayList<Int>()
    val mutableList2 = mutableListOf(1, 2, 3) // Тип может быть выведен

    val mutableSet1 = mutableSetOf<Int>() // Или: LinkedHashSet<Int>() или HashSet<Int>()
    val mutableSet2 = mutableSetOf(1, 2, 3) // Тип может быть выведен

    val mutableMap1 = mutableMapOf<Int, String>() // Или: LinkedHashMap<...>() или HashMap<...>()
    val mutableMap2 = mutableMapOf(1 to "one", 2 to "two") // Тип может быть выведен
}
```

Если вам нужно _преобразовать_ существующую коллекцию, вы также можете использовать встроенные функции:

```kotlin
fun main() {
    val listOfNumbers = listOf(1, 2, 3)
    val mutableListOfNumbers = listOfNumbers.toMutableList()

    val setOfNumbers = setOf(1, 2, 3)
    val mutableSetOfNumbers = setOfNumbers.toMutableSet()

    val mapOfNumbers = mapOf(1 to "one", 2 to "two")
    val mutableMyMap = mapOfNumbers.toMutableMap()
}
```