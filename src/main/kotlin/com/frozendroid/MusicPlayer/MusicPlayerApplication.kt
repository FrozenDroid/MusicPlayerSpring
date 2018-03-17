package com.frozendroid.MusicPlayer

import com.datastax.driver.core.utils.UUIDs
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*

@SpringBootApplication
class MusicPlayerApplication(val repo: UserRepository) : CommandLineRunner{
    override fun run(vararg args: String?) {
//        repo.save(User(UUIDs.timeBased(), "FrozenDroid"))
        println(repo.findAllByUsername("FrozenDroid!"))
        println("aa")
    }

}

fun main(args: Array<String>) {
    runApplication<MusicPlayerApplication>(*args)
}
