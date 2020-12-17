package br.ebarbosa.eloybarbosa_dr1_android_at

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.ebarbosa.eloybarbosa_dr1_android_at.model.usuario
import kotlinx.android.synthetic.main.teste_fragment.*

class TesteFragment : Fragment() {

    private lateinit var mainViewModel : MainViewModel
    lateinit var usuario: usuario
    var resultado = usuario()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
        { mainViewModel = ViewModelProvider( requireActivity(), ViewModelFactory()
        ).get(MainViewModel::class.java)
        return inflater.inflate(R.layout.teste_fragment, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        usuario = getActivity()?.getIntent()?.getSerializableExtra("usuario") as usuario



        if (mainViewModel.pergunta1.value == false && mainViewModel.pergunta2.value == false  && mainViewModel.pergunta3.value == false  && mainViewModel.pergunta4.value == false  && mainViewModel.pergunta5.value == false  && mainViewModel.pergunta6.value == true ){
            textViewResultado.text = "APROVADO"
            textViewSugestao.text = "De acordo com as respostas fornecidas você está apto para retornar ao trabalho presencial"

        }else   {
            textViewResultado.text = "REPROVADO"
            textViewSugestao.text = "De acordo com as respostas fornecidas recomendamos fortemente que você ainda não retorne as suas atividades presenciais"
        }
    }
}