package kg.geekteck.vp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.geekteck.vp.R
import kg.geekteck.vp.databinding.ItemBinding

class HistoryAdapter(private var list: ArrayList<Int>
) : RecyclerView.Adapter<HistoryAdapter.ImageHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ImageHolder(view)
    }

    override fun onBindViewHolder(holder: ImageHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size

    class ImageHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemBinding.bind(itemView)
        fun bind(i: Int) = with(binding) {
            tvItem.text=i.toString()
        }
    }
}