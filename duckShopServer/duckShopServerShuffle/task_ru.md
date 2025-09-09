В этом задании вам нужно реализовать функцию, чтобы можно было перемешивать уток в Магазине Уток в случайном порядке.

### Задача

Реализуйте функцию `shuffleDucks` из класса `GameActionFunctionsService` в пакете `org.jetbrains.kotlin.course.duck.shop.functions.action`. Эта функция должна перемешивать список уток в случайном порядке.

У нас есть только одна функция — для `list`, поскольку только `list` по умолчанию является упорядоченной коллекцией.

После выполнения этой задачи кнопка `Shuffle` в режиме `list` оживет.

<div class="hint" title="Нажмите, чтобы увидеть ожидаемое состояние приложения после выполнения этого задания">

![Текущее состояние](../../utils/src/main/resources/images/duck/shop/states/state_8.gif)

</div>

Если у вас возникнут трудности, **подсказки помогут вам решить эту задачу**.

----

### Подсказки

<div class="hint" title="Нажмите, чтобы узнать, как перемешать список элементов">

Вы можете использовать встроенную функцию [`shuffled`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/shuffled.html):
```kotlin
val listOfNumbers = listOf(1, 2, 3, 4)
println(listOfNumbers.shuffled()) // Список с элементами 1, 2, 3, 4 в случайном порядке
```
</div>