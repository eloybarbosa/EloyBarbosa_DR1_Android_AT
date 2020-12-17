package br.ebarbosa.eloybarbosa_dr1_android_at

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        recycleView.layoutManager = LinearLayoutManager(this)
        recycleView.adapter = RecycleAdapter()
    }



}