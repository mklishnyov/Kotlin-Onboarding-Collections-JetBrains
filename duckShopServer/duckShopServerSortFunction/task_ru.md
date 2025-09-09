В этом задании вам нужно реализовать функцию, которая позволит сортировать уток в Магазине Уток в соответствии со стоимостью их аксессуаров. Этот шаг является завершающим для завершения данного приложения.

### Задача

Реализуйте функцию `sortDucks` из класса `GameActionFunctionsService` в пакете `org.jetbrains.kotlin.course.duck.shop.functions.action`. Эта функция должна сортировать уток в списке в порядке убывания в соответствии со стоимостью их аксессуаров. Чтобы рассчитать стоимость утки, нужно суммировать стоимость всех ее аксессуаров. Пожалуйста, используйте дополнительный коэффициент `100` для каждого аксессуара, если у утки есть хотя бы один атрибут, связанный с Kotlin (`hasKotlinAttribute` равно `true`).

У нас есть только одна функция — для `list`, так как только `list` является упорядоченной коллекцией по умолчанию.

После выполнения этого задания кнопка `Sort` в режиме `list` станет активной.

<div class="hint" title="Щелкните меня, чтобы увидеть ожидаемое состояние приложения после выполнения этого задания">

![Текущее состояние](../../utils/src/main/resources/images/duck/shop/states/state_9.gif)

</div>

Если у вас возникнут трудности, **подсказки помогут вам решить эту задачу**.

----

### Подсказки

<div class="hint" title="Щелкните меня, чтобы узнать, как сортировать список элементов">

Вы можете использовать встроенные функции [`sortedBy`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sorted-by.html) 
или [`sortedByDescending`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sorted-by-descending.html),
которые сортируют значения в списке в соответствии со значением, возвращаемым переданной функцией:
```kotlin
val listOfWords = listOf("a", "bbbbb", "aa", "aaa", "aaaaaaaa")
println(listOfWords.sortedBy { it.length }) // [a, aa, aaa, bbbbb, aaaaaaaa]
```
В приведенном примере список сортируется по длине слов.
</div>

<div class="hint" title="Щелкните меня, чтобы узнать, как вычислить сумму элементов в списке">

Вы можете использовать встроенную функцию [`sum`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sum.html):
```kotlin
val listOfNumbers = listOf(1, 2, 3, 4, 5)
println(listOfNumbers.sum()) // 15
```

Если вам нужно использовать дополнительные вычисления, например, умножить значения четных чисел в списке на коэффициент, вы можете использовать встроенную функцию [`sumOf`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sum-of.html):
```kotlin
val listOfNumbers = listOf(1, 2, 3, 4, 5)
println(listOfNumbers.sumOf { if (it % 2 == 0) it * 2 else it }) // 21
```
В приведенном примере мы вычислили сумму следующих значений: `1 + 2 * 2 + 3 + 4 * 2 + 5`.
</div>