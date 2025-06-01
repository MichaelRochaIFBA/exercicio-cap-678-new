package com.michael.listadecomprasnew

data class ItemModel (val name: String, val onRemove: (ItemModel) -> Unit)