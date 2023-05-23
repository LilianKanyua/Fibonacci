package com.example.fibonacci

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.rvFibo)
    }
}


class NamesRecyclerViewAdapter(var numbersList: List<String>):
    RecyclerView.Adapter<NamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            NamesViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.
        layout.fibonacci_series, parent, false)
        return NamesViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: NamesViewHolder, position:
    Int) {
        holder.tvNumbers.text = numbersList.get(position)
    }
    override fun getItemCount(): Int {
        return numbersList.size
    }
}
class NamesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
{
    var tvNumbers = itemView.findViewById<TextView>(R.id.tvNumbers)
}