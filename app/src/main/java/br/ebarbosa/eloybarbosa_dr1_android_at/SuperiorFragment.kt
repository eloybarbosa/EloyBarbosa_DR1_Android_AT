package br.ebarbosa.eloybarbosa_dr1_android_at

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.ebarbosa.eloybarbosa_dr1_android_at.model.usuario
import kotlinx.android.synthetic.main.fragment_superior.*


class SuperiorFragment : Fragment() {

    lateinit var usuario: usuario

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_superior, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        usuario = getActivity()?.getIntent()?.getSerializableExtra("usuario") as usuario
        textViewSuperior.text = "Olá, " + usuario.nome + " este questionário tem como objetivo avaliar o seu nivel de exposição ao Covid-19 e a partir das suas respostas informar se está apto para retornar ao trabalho presencial."
    }
}