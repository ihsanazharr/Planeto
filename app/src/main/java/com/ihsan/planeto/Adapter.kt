package com.ihsan.planeto

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*
import java.util.*

class Adapter(var planet: List<PlanetData>) : RecyclerView.Adapter<Adapter.myViewHolder>() {

    class myViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title = view.title
        var planetimg = view.planet_img
        var galaxy = view.galaxy
        var distance = view.distance
        var gravity = view.gravity
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): myViewHolder {
        var itemView = LayoutInflater.from(p0.context)
            .inflate(R.layout.view, p0, false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(p0: myViewHolder, p1: Int) {
        var dummyImage: Int? = null
        p0.itemView.setOnClickListener{
            val intent = Intent(p0.itemView.context, PlanetDetail::class.java)
            intent.putExtra("planet",planet[p1])
            intent.putExtra("planetImage", dummyImage)
            p0.itemView.context.startActivity(intent)
        }
        p0.title.text = planet[p1].title
        p0.galaxy.text = planet[p1].galaxy
        p0.distance.text = planet[p1].distance + " m km"
        p0.gravity.text = planet[p1].gravity + " m/ss"

        when (planet[p1].title!!.lowercase(Locale.getDefault())) {
            "mars" -> {
                dummyImage = R.drawable.ic_mars
            }
            "neptune" -> {
                dummyImage = R.drawable.ic_neptune
            }
            "earth" -> {
                dummyImage = R.drawable.ic_earth
            }
            "moon" -> {
                dummyImage = R.drawable.ic_moon
            }
            "venus" -> {
                dummyImage = R.drawable.ic_venus
            }
            "jupiter" -> {
                dummyImage = R.drawable.ic_jupiter
            }
            "saturn" -> {
                dummyImage = R.drawable.ic_saturn
            }
            "uranus" -> {
                dummyImage = R.drawable.ic_uranus
            }
            "mercury" -> {
                dummyImage = R.drawable.ic_mercury
            }
            "sun" -> {
                dummyImage = R.drawable.ic_sun
            }
        }
        p0.planetimg.setImageResource(dummyImage!!)
    }

    override fun getItemCount(): Int {
        return planet.size
    }
}
