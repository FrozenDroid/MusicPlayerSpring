package com.frozendroid.MusicPlayer

import org.springframework.data.cassandra.repository.Query
import org.springframework.data.repository.CrudRepository
import java.util.*

interface UserRepository: CrudRepository<User, UUID> {

    @Query("Select * from users where username=?0")
    fun findAllByUsername(username: String): Iterable<User>

}