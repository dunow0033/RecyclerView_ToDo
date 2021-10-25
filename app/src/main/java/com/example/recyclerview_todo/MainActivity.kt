package com.example.recyclerview_todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview_todo.databinding.ActivityMainBinding
import com.example.recyclerview_todo.databinding.ItemTodoBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ItemTodoBinding? = null
    val binding: ItemTodoBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}