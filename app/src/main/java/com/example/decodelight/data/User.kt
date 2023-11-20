package com.example.decodelight.data

import android.provider.ContactsContract.CommonDataKinds.Email

data class User(

    val firstName : String,
    val lastName : String,
    val email: String,
    val imagePath: String = ""
){
    constructor(): this("","","","")
}
