package br.ebarbosa.eloybarbosa_dr1_android_at

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecycleAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val items: List<String> = listOf("Sintomas mais comuns:",
        "febre",
        "tosse seca",
        "cansaço",
        "",
        "Sintomas menos comuns:",
        "dores e desconfortos",
        "dor de garganta",
        "diarreia",
        "conjuntivite",
        "dor de cabeça",
        "perda de paladar ou olfato",
        "erupção cutânea na pele ou descoloração dos dedos das mãos ou dos pés",
        "",
        "Sintomas graves:",
        "dificuldade de respirar ou falta de ar",
        "dor ou pressão no peito",
        "perda de fala ou movimento",)

    override fun getItemCount(): Int {
        return items.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val card = LayoutInflater.from(parent.context).inflate(R.layout.recycle_card, parent, false)

        return MessageViewHolder(card)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val currentItem = items [position]
        if (holder is MessageViewHolder){
            holder.itemTextView.text= currentItem
        }

    }

    class MessageViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        val itemTextView: TextView = itemView.findViewById(R.id.textViewItem)

    }

}