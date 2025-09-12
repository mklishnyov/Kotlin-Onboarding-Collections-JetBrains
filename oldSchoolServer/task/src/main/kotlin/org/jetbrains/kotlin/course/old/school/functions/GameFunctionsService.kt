package org.jetbrains.kotlin.course.old.school.functions

import org.jetbrains.kotlin.course.old.school.photo.Color
import org.jetbrains.kotlin.course.old.school.photo.PhotoCharacter
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

    fun Iterable<String>.groupPhotosByHairAndHat(): List<PhotoCharacter> = TODO("Not implemented yet")
}
