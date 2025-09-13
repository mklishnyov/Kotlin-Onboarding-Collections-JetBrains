package org.jetbrains.kotlin.course.old.school.functions

import org.jetbrains.kotlin.course.old.school.photo.Color
import org.jetbrains.kotlin.course.old.school.photo.PhotoCharacter
import org.jetbrains.kotlin.course.old.school.photo.HairType
import org.jetbrains.kotlin.course.old.school.photo.Accessory
import org.springframework.stereotype.Service

@Service
class GameFunctionsService {
    fun getAllPossibleColors(): List<String> = Color.entries.map { it.name.lowercase() }

    private fun String.toColor(): Color = Color.valueOf(this
        .lowercase().replaceFirstChar { it.titlecase() })

    private fun Iterable<String>.toPhotoCharacters(): List<PhotoCharacter> =
        this.map { PhotoCharacter.valueOf(it.lowercase().replaceFirstChar { c -> c.titlecase() }) }


    fun Iterable<String>.findPhoto(colorStr: String) = with(colorStr.toColor()) {
        toPhotoCharacters().find { it.backgroundColor == this }
    }
    fun Iterable<String>.groupPhotosByColor(): List<PhotoCharacter> = this.toPhotoCharacters()
        .groupBy { b -> b.backgroundColor.name }.flatMap { it.value }

    fun Iterable<String>.groupPhotosByHairAndHat(): List<PhotoCharacter> {
        val chars = this.toPhotoCharacters()
        val groupedByHair = chars.groupBy { it.hairType }
        val hairOrder = chars.map { it.hairType }.distinct()
        return hairOrder.flatMap { hair ->
            val list = groupedByHair[hair] ?: emptyList()
            val withHat = list.filter { it.accessories?.contains(Accessory.Hat) == true }
            val noHat = list.filter { it.accessories?.contains(Accessory.Hat) != true }
            if (list.firstOrNull()?.accessories?.contains(Accessory.Hat) == true) withHat + noHat else noHat + withHat
        }
    }

}
