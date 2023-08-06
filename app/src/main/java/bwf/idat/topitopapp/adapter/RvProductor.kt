package bwf.idat.topitop.adapter

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import bwf.idat.topitop.model.Producto
import bwf.idat.topitopapp.databinding.ItemProductoBinding

class RvProductor(private val productos:List<Producto>): RecyclerView.Adapter<ProductoRv>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductoRv {
    val binding = ItemProductoBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    return ProductoRv(binding)
    }

    override fun getItemCount(): Int =productos.size

    override fun onBindViewHolder(holder: ProductoRv, position: Int) {
    holder.bind(productos[position])
    }
}
class ProductoRv(private val binding: ItemProductoBinding ):RecyclerView.ViewHolder(binding.root){
    fun bind(producto: Producto){
        binding.txtproducto.text= producto.nombre
        binding.txtprecio.text= producto.precio.toString()+"/$"
        binding.txtdescuento.text=producto.descuento.toString()+"/$"
        binding.txtprecio.paintFlags=Paint.STRIKE_THRU_TEXT_FLAG

    }

}