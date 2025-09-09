Главная цель этого задания — подготовить всё для реализации функций сортировки и группировки. Реализуйте две функции из класса `GameFunctionsService`, чтобы завершить задание:

1) функция `toColor`, которая возвращает `Color` по его имени: например, для ввода `white`, она должна вернуть `Color.White`
2) функция `toPhotoCharacters`, которая преобразует _итерируемую_ коллекцию имен, например, список или множество, в список `PhotoCharacter`. Вы можете найти уже определенный класс перечисления `PhotoCharacter` в файле `PhotoCharacter.kt`. Например, список `[emily, david]` должен быть преобразован в список `[PhotoCharacter.Emily, PhotoCharacter.David]`

Если у вас возникнут трудности, **подсказки помогут вам решить это задание**.

----

### Подсказки

<div class="hint" title="Нажмите здесь, чтобы узнать возможные подходы к получению сущности перечисления по имени">

Мы предлагаем два основных подхода для возвращения конкретной сущности перечисления по его имени:

1) Используйте встроенную функцию [`valueOf`](https://kotlinlang.org/docs/enum-classes.html#working-with-enum-constants), которая выбрасывает `IllegalArgumentException`, если указанное имя не совпадает ни с одной из констант перечисления, определенных в классе:
```kotlin
enum class Color {
    White,
    Blue,
    ;
}

fun main() {
    println(Color.valueOf("White")) // Color.White
    
    println(Color.valueOf("white")) // ОШИБКА
    println(Color.valueOf("Red")) // ОШИБКА
}
```

2) Получите все возможные записи и найдите нужную по условию:
```kotlin
enum class Color {
    White,
    Blue,
    ;
}

fun main() {
    Color.entries.find { it.name == "White" }?.let{ println(it) } ?: error("Не удается найти цвет")
}
```
</div>

<div class="hint" title="Нажмите здесь, чтобы узнать, как капитализировать строку">

Чтобы капитализировать строку, вы можете использовать встроенную функцию [`replaceFirstChar`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/replace-first-char.html) с функцией [`titlecase`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/titlecase.html) в качестве аргумента:
```kotlin
fun main() {
    println("white".replaceFirstChar { it.titlecase() }) // "White"
}
```
</div>