В этом задании вам нужно реализовать функции, которые смогут фильтровать уток для магазина уток и оставлять только уток с некоторыми свойствами, связанными с Kotlin.

### Задание

Реализуйте две версии функции `deleteDucksWithoutKotlinStuff` из класса `GameActionFunctionsService` в
пакете `org.jetbrains.kotlin.course.duck.shop.functions.action`.
Эти функции должны оставлять только уток с некоторыми свойствами, связанными с Kotlin (поле `hasKotlinAttribute` равно `true`).

У нас есть всего две функции, так как функция `fun Collection<Duck>.deleteDucksWithoutKotlinStuff()` работает для обеих коллекций — `List` и `Set`.

После выполнения этого задания, кнопка `Filter` во всех трех режимах становится активной.

<div class="hint" title="Щелкните, чтобы просмотреть ожидаемое состояние приложения после выполнения этого задания">

![Текущее состояние](../../utils/src/main/resources/images/duck/shop/states/state_6.gif)

</div>

Если у вас возникли трудности, **подсказки помогут вам решить это задание**.

----

### Подсказки

<div class="hint" title="Щелкните, чтобы узнать, как фильтровать элементы в списке или множестве">

Чтобы фильтровать элементы в списке или множестве, вы можете использовать встроенную функцию [`filter`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter.html) 
для передачи условия:
```kotlin
val listOfNumbers = listOf(1, 2, 3, 4, 5)
println(listOfNumbers.filter { it % 2 == 0 }) // 2, 4
```

Вы также можете задать имя для элементов вместо использования `it`:
```kotlin
val listOfNumbers = listOf(1, 2, 3, 4, 5)
println(listOfNumbers.filter { number -> number % 2 == 0 }) // 2, 4
```
</div>

<div class="hint" title="Щелкните, чтобы узнать, как фильтровать элементы в карте">

Вы также можете использовать встроенную функцию [`filter`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter.html) для фильтрации элементов в карте:
```kotlin
val mapOfNumbers = mapOf(1 to "one", 2 to "two", 3 to "three")
println(mapOfNumbers.filter { (key, value) -> key % 2 != 0 && value.length > 3 }) // 3 to "three"
```

Если нужно фильтровать карту _только_ по ключам или значениям, можно использовать функции [filterKeys](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-keys.html#filterkeys) 
и [filterValues](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-values.html#filtervalues):

```kotlin
val mapOfNumbers = mapOf(1 to "one", 2 to "two", 3 to "three")
println(mapOfNumbers.filterKeys { it % 2 != 0 }) // 1 to "one", 3 to "three"
// ИЛИ
println(mapOfNumbers.filterKeys { key -> key % 2 != 0 }) // 1 to "one", 3 to "three"

println(mapOfNumbers.filterValues { it.length > 3 }) // 3 to "three"
// ИЛИ
println(mapOfNumbers.filterValues { value -> value.length > 3 }) // 3 to "three"
```
</div>