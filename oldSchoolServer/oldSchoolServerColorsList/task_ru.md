Пора программировать! Первая задача - реализовать метод `getAllPossibleColors` в `GameFunctionsService`, который уже определен в пакете `org.jetbrains.kotlin.course.old.school.functions` в файле `GameFunctionsService.kt`.

Эта функция должна возвращать имена всех _сущностей_ из перечисления `Color` в нижнем регистре из пакета `org.jetbrains.kotlin.course.old.school.photo`.

После выполнения этой задачи список возможных цветов будет непустым.

<div class="hint" title="Нажмите, чтобы узнать ожидаемое состояние приложения после выполнения этой задачи">

![Текущее состояние](../../utils/src/main/resources/images/old/school/states/state_1.gif)

</div>

Если у вас возникнут трудности, **подсказки помогут вам решить эту задачу**.

----

### Подсказки

<div class="hint" title="Нажмите, чтобы узнать, как получить все значения из перечисления">

Чтобы получить все значения из перечисления, вы можете использовать встроенное свойство [`entries`](https://kotlinlang.org/docs/enum-classes.html#working-with-enum-constants):
```kotlin
val allColors = Color.entries
```
</div>

<div class="hint" title="Нажмите, чтобы узнать, как именовать элемент перечисления">

Вы можете использовать свойство `name`:
```kotlin
enum class Color {
    White,
    Blue,
    ;
}

fun main() {
    Color.entries.forEach{ println(it.name) } // White, Blue
}
```
</div>

<div class="hint" title="Нажмите, чтобы узнать, как преобразовать строку в нижний регистр">

Вы можете использовать встроенную функцию [`lowercase`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/lowercase.html):
```kotlin
fun main() {
    println("Name".lowercase()) // name
}
```
</div>