Время для практики! В этом задании вам нужно реализовать функции, чтобы можно было инициализировать список случайных уток в магазине уток.

### Задание

В первую очередь реализуйте функцию `generateRandomDuck` из файла `Duck.kt` внутри пакета `org.jetbrains.kotlin.course.duck.shop.duck`. Эта функция должна получить все значения из класса `Duck`, расположенного в том же файле, и вернуть случайную утку из этого списка.

Далее, реализуйте функцию `generateListOfDucks` из класса `GameModeService` в пакете `org.jetbrains.kotlin.course.duck.shop.mode`. Эта функция должна сгенерировать новый список с `MAX_NUMBER_OF_DUCKS` случайными утками. Чтобы сгенерировать случайную утку, пожалуйста, используйте функцию `generateRandomDuck`.

Вы можете найти уже определённую переменную `MAX_NUMBER_OF_DUCKS` в файле `GameUtil.kt` в пакете `org.jetbrains.kotlin.course.duck.shop.utils`.

После выполнения этого задания кнопка `List` станет активной.

<div class="hint" title="Нажмите, чтобы увидеть ожидаемое состояние приложения после выполнения этого задания">

![Текущее состояние](../../utils/src/main/resources/images/duck/shop/states/state_1.gif)

</div>

Если у вас возникнут трудности, **подсказки помогут решить это задание**.

----

### Подсказки

<div class="hint" title="Нажмите, чтобы узнать, как получить все значения из класса-перечисления">

Чтобы получить все значения из класса-перечисления, вы можете использовать встроенное свойство [`entries`](https://kotlinlang.org/docs/enum-classes.html#working-with-enum-constants):
```kotlin
val allDucks = Duck.entries
```
</div>

<div class="hint" title="Нажмите, чтобы узнать, как получить случайный элемент из списка">

Вы можете использовать специальную встроенную функцию [`random`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/random.html), которая работает со _списком_ и позволяет извлечь из него случайное значение.
</div>

<div class="hint" title="Нажмите, чтобы узнать, как создать список с N элементами">

Вы можете вызвать конструктор класса `List` напрямую с числом элементов, которые должны быть сгенерированы:
```kotlin
val N = 5
fun generateRandomInt(): Int = TODO("Not implemented yet")

val listWithNumbers = List(N) { generateRandomInt() } // Будет создан список с N случайными целыми числами
```
</div>