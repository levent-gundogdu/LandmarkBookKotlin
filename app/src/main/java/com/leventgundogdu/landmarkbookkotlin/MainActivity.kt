package com.leventgundogdu.landmarkbookkotlin

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.leventgundogdu.landmarkbookkotlin.databinding.ActivityMainBinding

var chosenLandmark : Landmark? = null

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        landmarkList = ArrayList<Landmark>()

        //Data
        val pisa = Landmark("Pisa", "Italy", R.drawable.pisa)
        val colloseum = Landmark("Colloseum", "Italy", R.drawable.colloseum)
        val eiffel = Landmark("Eiffel", "France", R.drawable.eiffel)
        val londonBridge = Landmark("London Bridge", "United Kingdom", R.drawable.londonbridge)

//        val bitmap = Bitmap

        landmarkList.add(pisa)
        landmarkList.add(colloseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter

        /*
        //Adapter: Layout & Data

        //Mapping

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, landmarkList.map { landmark -> landmark.name })

        binding.listView.adapter = adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent = Intent(MainActivity@this, DetailsActivity::class.java)
            intent.putExtra("landmark", landmarkList.get(position))

            startActivity(intent)
        }
         */



    }
}