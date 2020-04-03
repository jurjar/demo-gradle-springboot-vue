package com.example.demo.model

import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDate
import java.util.*
import javax.persistence.*

@Entity
class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
    var firstName: String? = null
    var lastName: String?=null
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    var birthDate: LocalDate?=null
    var medicalTeamId: Int?=null

    constructor() {}

    constructor(id: Int?, firstName: String?, lastName:String? , birthDate: LocalDate?, medicalTeamId:Int?) {
        this.id = id
        this.firstName = firstName
        this.lastName = lastName
        this.birthDate = birthDate
        this.medicalTeamId = medicalTeamId
    }

}