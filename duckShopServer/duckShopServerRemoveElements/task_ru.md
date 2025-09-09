В этом задании вам нужно реализовать функции, которые позволят удалять уток из Магазина Уток.

### Задание

Реализуйте три версии функции `removeRandomDuck` из класса `GameChangeFunctionsService` в пакете `org.jetbrains.kotlin.course.duck.shop.functions.change`. Эти функции должны удалять случайную утку из списка, множества или карты.

После выполнения этого задания кнопка `Remove` во всех трех режимах оживает.

<div class="hint" title="Нажмите, чтобы увидеть ожидаемое состояние приложения после выполнения этого задания">

![Текущее состояние](../../utils/src/main/resources/images/duck/shop/states/state_4.gif)

</div>

Если у вас возникнут трудности, **подсказки помогут вам решить это задание**.

----

### Подсказки

<div class="hint" title="Нажмите, чтобы узнать, что такое функции-расширения">

Функции `removeRandomDuck` реализованы как [функции-расширения](https://kotlinlang.org/docs/extensions.html#extension-functions).
Эти функции позволяют вам расширять _любой_ класс своей собственной функциональностью, например,

```kotlin
fun List<Duck>.removeRandomDuck(): List<Duck> = TODO("Not implemented yet")
```
то же самое что и
```kotlin
fun removeRandomDuck(listOfDucks: List<Duck>): List<Duck> = TODO("Not implemented yet")
```
Однако, в первом примере вы можете вызвать функцию `removeRandomDuck` напрямую из списка уток, например,
```kotlin
myList.removeRandomDuck()
```
Во втором примере вам нужно передать список в качестве аргумента:
```kotlin
removeRandomDuck(myList)
```
</div>

<div class="hint" title="Нажмите, чтобы узнать, как конвертировать коллекцию в изменяемую">

Вы можете использовать встроенные функции `toMutableList`, `toMutableSet` и `toMutableMap`:
```kotlin
fun main() {
    val listOfNumbers = listOf(1, 2, 3)
    val mutableListOfNumbers = listOfNumbers.toMutableList()

    val setOfNumbers = setOf(1, 2, 3)
    val mutableSetOfNumbers = setOfNumbers.toMutableSet()

    val mapOfNumbers = mapOf(1 to "one", 2 to "two")
    val mutableMapOfNumbers = mapOfNumbers.toMutableMap()
}
```
</div>

<div class="hint" title="Нажмите, чтобы узнать, как сгенерировать случайный элемент из списка или множества">

Вы можете использовать различные встроенные функции. Первый способ сгенерировать случайный элемент из списка — это сгенерировать случайный индекс и получить элемент с этим индексом из списка:
```kotlin
val listOfNumbers = listOf(1, 2, 3)
println(listOfNumbers[listOfNumbers.indices.random()])
```

Второй способ короче, так как вы можете сгенерировать случайный элемент непосредственно из коллекции:
```kotlin
val listOfNumbers = listOf(1, 2, 3)
println(listOfNumbers.random())

val mapOfNumbers = mapOf(1 to "one", 2 to "two")
println(mapOfNumbers[mapOfNumbers.keys.random()])
```
</div>

<div class="hint" title="Нажмите, чтобы узнать, как сгенерировать случайный элемент из карты">

Поскольку в карте у вас есть ключи и значения, вы можете применить функцию `random` к списку ключей, чтобы сгенерировать случайный ключ, а затем получить значение для этого ключа:
```kotlin
val mapOfNumbers = mapOf(1 to "one", 2 to "two")
println(mapOfNumbers[mapOfNumbers.keys.random()])
```
</div>

<div class="hint" title="Нажмите, чтобы узнать, как удалить элемент из списка, множества или карты">

Вы можете использовать различные встроенные функции для удаления элементов из коллекций.
Первый способ — удалить элемент из списка _по индексу_:
```kotlin
val listOfNumbers = mutableListOf(1, 2, 3)
listOfNumbers.removeAt(0)
println(listOfNumbers) // 2, 3
```

Вы не можете вызвать эту функцию для множества или карты, так как это неупорядоченные коллекции.

Второй способ подходит для всех трех типов коллекций — вы можете удалить элемент напрямую через встроенную функцию `remove`:
```kotlin
val listOfNumbers = mutableListOf(1, 2, 3)
listOfNumbers.remove(2) // Удалить элемент: 2

val mapOfNumbers = mutableMapOf(1 to "one", 2 to "two")
mapOfNumbers.remove(1) // Удалить элемент: 1 to "one"
```
</div>