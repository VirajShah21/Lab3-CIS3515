package edu.temple.lab3


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(_images: Array<Int>) : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    private val images = _images


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val itemLayoutView = LayoutInflater.from(parent.context)
            .inflate(R.layout.image_item, null)

        val viewHolder = ViewHolder(itemLayoutView)
        return viewHolder
    }


    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.imageView.setImageResource(images[position])
    }

    class ViewHolder(itemLayoutView: View) :
        RecyclerView.ViewHolder(itemLayoutView) {
        val imageView = itemLayoutView.findViewById<ImageView>(R.id.image)
    }


    override fun getItemCount(): Int {
        return images.size
    }

}
