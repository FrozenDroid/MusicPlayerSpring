package com.frozendroid.MusicPlayer

import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table
import java.util.*

@Table("users")
class User(@PrimaryKey var userId: UUID, var username: String) {
}