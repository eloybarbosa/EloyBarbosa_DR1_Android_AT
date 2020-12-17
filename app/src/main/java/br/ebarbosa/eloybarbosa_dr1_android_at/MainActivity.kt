package br.ebarbosa.eloybarbosa_dr1_android_at

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.ebarbosa.eloybarbosa_dr1_android_at.model.usuario
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonIniciar.setOnClickListener{
            if(editTextName.text.isNullOrEmpty()){
                Toast.makeText(this,"Digite seu nome!", Toast.LENGTH_LONG).show()
            }else {
                var nome = editTextName.text.toString()
                var usuario = usuario(
                    nome
                )
                var intent = Intent(this, QuestionarioActivity::class.java)
                intent.putExtra("usuario", usuario)
                startActivity(intent)
            }
        }

        buttonSintomas.setOnClickListener{
            var intent = Intent (this, RecyclerActivity::class.java)
            startActivity(intent)
        }

        logoPwC.setOnClickListener {

            var intent = Intent(Intent.ACTION_VIEW).apply { data = Uri.parse("http://www.pwc.com.br") }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }




    }
}