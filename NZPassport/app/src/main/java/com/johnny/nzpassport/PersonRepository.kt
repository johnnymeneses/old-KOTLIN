package com.johnny.nzpassport

class PersonRepository {

    fun infoPerson(firstName: String, lastName: String): Boolean {
        return (firstName != "" && lastName != "")
    }


}