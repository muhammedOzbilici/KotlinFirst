package com.example.demo.controller

import com.example.demo.domain.User
import com.example.demo.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletResponse

@RestController
@RequestMapping("/rest/users")
class MainController (val userRepository: UserRepository) {

    @GetMapping("/welcome")
    fun hello(res: HttpServletResponse){
        res.writer.write("welcome")
    }

    @GetMapping("/all")
    fun getUsers() = userRepository.findAll()

    @GetMapping("/insert/{name}")
    fun insertUsers(@PathVariable name: String): List<User>{
        val user = User(name)
        userRepository.save(user)
        return userRepository.findAll()
    }

}

