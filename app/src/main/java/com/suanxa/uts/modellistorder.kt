package com.suanxa.uts

import java.io.Serializable

// Order model, implements Serializable to pass via Intent
data class modellistorder(
    var image : Int,
    var Nama : String,
    var Tanggal : String,
    var Harga : String,
    var Item : String
) : Serializable