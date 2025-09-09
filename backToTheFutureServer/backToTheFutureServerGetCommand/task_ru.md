Благодаря этому шагу, наше приложение оживает с хранилищем команд.  
В этой задаче вам нужно реализовать функцию `getCommand` в уже реализованном классе `GameService`  
в пакете `org.jetbrains.kotlin.course.tamagotchi.game`.

Эта функция должна возвращать `null`, если `commands` пуст.  
В противном случае, она должна получать команду из `commands` в соответствии с `mode`.

После выполнения этой задачи хранилище команд будет работать корректно.

<div class="hint" title="Кликните, чтобы увидеть ожидаемое состояние приложения после выполнения этой задачи">

![Финальное приложение](../../utils/src/main/resources/images/tamagotchi/states/ready.gif)

</div>

Если вы испытываете трудности, **подсказки помогут вам решить эту задачу**.

----

### подсказки

<div class="hint" title="Нажмите, чтобы узнать, как получить первый и последний элементы">

Вы можете использовать встроенные функции [`removeFirstOrNull`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-deque/remove-first-or-null.html)  
и [`removeLastOrNull`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-deque/remove-last-or-null.html)  
для удаления и возврата элемента. Обе эти функции возвращают `null`, если коллекция пуста.
</div>