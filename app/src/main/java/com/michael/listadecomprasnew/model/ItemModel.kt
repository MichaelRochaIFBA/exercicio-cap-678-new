package com.michael.listadecomprasnew.model

import com.michael.listadecomprasnew.data.ItemEntity

data class ItemModel (
    val id: Long,
    val name: String,
    val onRemove: (ItemModel) -> Unit
)

fun ItemModel.toEntity(): ItemEntity {
    return ItemEntity(
        id = this.id,
        name = this.name
    )
}