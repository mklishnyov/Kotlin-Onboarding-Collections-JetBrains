В этом задании вам необходимо реализовать функцию для инициализации карты случайных уток в Магазине Уток.

### Задание

Реализуйте функцию `generateMapOfDucks` из класса `GameModeService` в пакете `org.jetbrains.kotlin.course.duck.shop.mode`. Эта функция должна генерировать новую карту, содержащую `MAX_NUMBER_OF_DUCKS` случайных уток. Для значения каждой утки вам нужно использовать функцию `getDescription` из файла `Duck.kt`.

Вы можете найти уже определенную переменную `MAX_NUMBER_OF_DUCKS` в файле `GameUtil.kt` в пакете `org.jetbrains.kotlin.course.duck.shop.utils`.

После реализации этого задания кнопка `Map` станет активной.

<div class="hint" title="Нажмите, чтобы увидеть ожидаемое состояние приложения после выполнения этого задания">

![Текущее состояние](../../utils/src/main/resources/images/duck/shop/states/state_3.gif)

</div>

Если у вас возникнут трудности, **подсказки помогут вам решить это задание**.

----

### Подсказки

<div class="hint" title="Нажмите, чтобы узнать, как создать карту из списка">

Вы можете использовать встроенную функцию [`associateWith`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/associate-with.html), чтобы сопоставить каждый элемент из коллекции с определенным значением и создать карту:

```kotlin
val l = listOf("cat", "dog", "rabbit")
val m = l.associateWith { it.length } // Будет создана карта {"cat": 3, "dog": 3, "rabbit": 6}
```
</div>