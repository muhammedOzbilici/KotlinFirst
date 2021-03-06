package com.example.demo.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class User (
        val name: String = "",
        val salary: Int = 2000,
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0
)

