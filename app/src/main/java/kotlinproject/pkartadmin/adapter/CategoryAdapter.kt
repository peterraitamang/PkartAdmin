package kotlinproject.pkartadmin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinproject.pkartadmin.R
import kotlinproject.pkartadmin.databinding.ItemCategoryLayoutBinding
import kotlinproject.pkartadmin.model.CategoryModel


class CategoryAdapter(var context : Context, val list: ArrayList<CategoryModel>) : RecyclerView.Adapter<CategoryAdapter.CategoryViewholder>(){

    inner class CategoryViewholder(view : View) : RecyclerView.ViewHolder(view){
        var binding = ItemCategoryLayoutBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewholder {
        return CategoryViewholder(LayoutInflater.from(context).inflate(R.layout.item_category_layout,parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CategoryViewholder, position: Int) {
        holder.binding.tvName.text = list[position].cat
        Glide.with(context).load(list[position].img).into(holder.binding.imageViewPerson)

    }

}