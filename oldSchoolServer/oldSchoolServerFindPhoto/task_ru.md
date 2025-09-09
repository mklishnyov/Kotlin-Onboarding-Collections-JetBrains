В этой задаче вы познакомитесь с встроенной функцией [`find`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find.html). Эта функция возвращает _первый_ элемент, удовлетворяющий заданному предикату, или `null`, если такой элемент не был найден.

Реализуйте функцию `findPhoto` из класса `GameFunctionsService`. Эта функция принимает итерируемую коллекцию имен персонажей и название цвета, которое нужно найти в коллекции. Вам нужно преобразовать каждый элемент из исходной коллекции в `PhotoCharacter` и найти _только первый_, у которого `backgroundColor` равен переданному значению.

Вы можете использовать уже реализованные функции `toColor` и `toPhotoCharacters`, чтобы реализовать функцию `findPhoto`.

После выполнения этой задачи вы сможете находить фотографии по цвету.

<div class="hint" title="Щелкните, чтобы увидеть ожидаемое состояние приложения после завершения этой задачи">

![Текущее состояние](../../utils/src/main/resources/images/old/school/states/state_2.gif)

</div>

Обратите внимание, что подсвечивается только первое фото, так как именно так работает функция `find` в Kotlin.

Если у вас есть трудности, **подсказки помогут вам решить эту задачу**.

----

### Подсказки

<div class="hint" title="Щелкните, чтобы узнать о функции 'with'">

Чтобы реализовать функцию `findPhoto`, вам нужно преобразовать `colorStr` в `Color`. Гораздо эффективнее сделать это только один раз, а затем вызвать функцию `filter`, например:
```kotlin
fun Iterable<String>.findPhoto(colorStr: String): PhotoCharacter? {
    val color = colorStr.toColor()
    return toPhotoCharacters().find { it.backgroundColor == color }
}
```

Но в Kotlin этот код можно переписать с использованием функции [`with`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/with.html), которая позволяет избежать объявления новой переменной:
```kotlin
fun Iterable<String>.findPhoto(colorStr: String) = with(colorStr.toColor()) {
    toPhotoCharacters().find { it.backgroundColor == this }
}
```

Эта функция позволяет использовать дополнительный _контекст_, например, в приведенных ниже примерах кода мы преобразуем `colorStr` в `Color` только один раз, и затем можем использовать полученный _контекст_ `Color`. В примере кода мы используем `this`, когда хотим обратиться к преобразованному цвету.
</div>