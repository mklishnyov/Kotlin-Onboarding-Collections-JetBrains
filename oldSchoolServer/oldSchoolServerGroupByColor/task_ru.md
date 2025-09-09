Пора попрактиковаться с функцией `groupBy`.  
Реализуйте функцию `groupPhotosByColor` из класса `GameFunctionsService`.  
Эта функция должна группировать фотографии по цвету фона и затем возвращать  
сглаженный список сгруппированных фотографий, например:
```kotlin
fun main() {
    val photos = listOf(
        "olivia", // Фиолетовый
        "larry", // Оранжевый
        "david", // Серый
        "daniel", // Фиолетовый
        "diana" // Оранжевый
    )

    println(photos.groupPhotosByColor())
    // Группирует по цветам и затем строит сглаженный 
    // список значений для каждого цвета: 
    // - Фиолетовый: Olivia, Daniel
    // - Оранжевый: Larry, Diana
    // - Серый: David
    //
    // Итак, окончательный сглаженный результат:
    // [Olivia, Daniel, Larry, Diana, David]
}
```

Вы можете использовать уже реализованную функцию `toPhotoCharacters` для реализации функции `groupPhotosByColor`.

Выполнив это задание, вы сможете группировать фотографии по цвету и изменять их порядок в альбоме.

<div class="hint" title="Click me to view the expected state of the application after completing this task">

![Current state](../../utils/src/main/resources/images/old/school/states/state_3.gif)

</div>

Если у вас возникнут трудности, **подсказки помогут вам решить эту задачу**.

----

### Подсказки

<div class="hint" title="Click me to learn how to flatten a list of lists">

Самый простой способ сделать это — использовать встроенную функцию [`flatten`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/flatten.html):
```kotlin
fun main() {
    val photos = listOf(
        listOf("olivia", "daniel"),
        listOf("larry", "diana"),
        listOf("david"),
    )

    println(photos.flatten()) // [olivia, daniel, larry, diana, david]
}
```

Также, если вы работаете с картой, где значения — это списки, и вам нужно получить значения и сгладить их в один список,
вы можете использовать встроенную функцию [`flatMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/flat-map.html):
```kotlin
fun main() {
    val photos = mapOf(
        1 to listOf("olivia", "daniel"),
        2 to listOf("larry", "diana"),
        3 to listOf("david"),
    )

    println(photos.map { it.value }.flatten()) // [olivia, daniel, larry, diana, david]
    // то же самое с 
    println(photos.flatMap { it.value }) // [olivia, daniel, larry, diana, david]
}
```
</div>