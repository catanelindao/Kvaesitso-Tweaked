package de.mm20.launcher2.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "SearchAction")
data class SearchActionEntity(
    @PrimaryKey val position: Int,
    val type: String,
    val data: String,
    val label: String?,
    val icon: Int,
    val color: Int = 0,
    val customIcon: String? = null,
    val options: String? = null,
)