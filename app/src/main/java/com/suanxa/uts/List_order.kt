package com.suanxa.uts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class List_order : AppCompatActivity() {
    private lateinit var RecyclerViewMakanan : RecyclerView
    private lateinit var AdapterMakanan : orderadapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_order)

        val menuMakanan = listOf(
            modellistorder(
                R.drawable.sate,
                "Sate",
                "29 nov, 01.09 pm",
                "$50.00",
                "2 Items"
            ),
            modellistorder(R.drawable.sate, "Sate", "10 mei, 06.10 pm", "$50.00", "2 Items"),
            modellistorder(R.drawable.american, "Mexican Appetizer", "06 nov, 02.09 pm", "$50.00", "2 Items"),
            modellistorder(R.drawable.sate, "Sate", "07 nov, 07.45 pm", "$50.00", "2 Items"),
            modellistorder(R.drawable.makan2, "Vegetables", "24 june, 07.00 pm", "$50.00", "2 Items")

        )


        RecyclerViewMakanan = findViewById(R.id.RvMakanan)
        RecyclerViewMakanan.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        AdapterMakanan = orderadapter(menuMakanan)
        RecyclerViewMakanan.adapter = AdapterMakanan
    }
}