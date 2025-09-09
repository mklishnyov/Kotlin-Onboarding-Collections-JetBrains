Вот еще одно упражнение с функцией `groupBy`.
Реализуйте функцию `groupPhotosByHairAndHat` из класса `GameFunctionsService`.
Эта функция должна группировать фотографии по типу волос,
затем группировать фотографии по наличию шляп в каждой группе по типу волос,
а затем возвращать сглаженный список всех сгруппированных фотографий, например:
```kotlin
fun main() {
    val photos = listOf(
        "olivia", // HairType.Dark; без шляпы
        "daniel", // HairType.Dark; со шляпой
        "emma", // HairType.Light, без шляпы
        "henry", // HairType.Dark; без шляпы
        "noah", // HairType.Dark; со шляпой
        "oliver", // HairType.Light, со шляпой
        "diana" // HairType.Light, без шляпы
    )

    println(photos.groupPhotosByHairAndHat())
    // Сначала мы группируем фотографии по типу волос:
    // - HairType.Dark: Olivia, Daniel, Henry, Noah
    // - HairType.Light: Emma, Oliver, Diana
    // Далее, в каждой из полученных групп, мы группируем по наличию шляпы:
    // - HairType.Dark:
    //      - Без шляпы: Olivia, Henry
    //      - Со шляпой: Daniel, Noah
    // - HairType.Light:
    //      - Без шляпы: Emma, Diana
    //      - Со шляпой: Oliver
    //
    // Наконец, мы просто сглаживаем полученные группы.
    // Таким образом, окончательный сглаженный результат:
    // [Olivia, Henry, Daniel, Noah, Emma, Diana, Oliver]
}
```

Вы можете использовать уже реализованную функцию `toPhotoCharacters` для реализации функции `groupPhotosByHairAndHat`.

После выполнения этой задачи вы сможете группировать фотографии по типу волос и наличию шляп и упорядочивать их в альбоме.

<div class="hint" title="Нажмите, чтобы увидеть ожидаемое состояние приложения после выполнения этой задачи">

![Текущее состояние](../../utils/src/main/resources/images/old/school/states/state_4.gif)

</div>