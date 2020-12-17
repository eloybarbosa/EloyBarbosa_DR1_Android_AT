package br.ebarbosa.eloybarbosa_dr1_android_at

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import br.ebarbosa.eloybarbosa_dr1_android_at.model.usuario
import kotlinx.android.synthetic.main.pergunta1_fragment.*
import kotlinx.android.synthetic.main.pergunta2_fragment.*
import kotlinx.android.synthetic.main.pergunta4_fragment.*

class Pergunta4Fragment : Fragment() {

    private lateinit var mainViewModel : MainViewModel
    private lateinit var viewModelFactory: ViewModelFactory
    lateinit var usuario: usuario

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainViewModel = ViewModelProvider(
            requireActivity(),
            ViewModelFactory()
        ).get(MainViewModel::class.java)
        return inflater.inflate(R.layout.pergunta4_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        usuario = getActivity()?.getIntent()?.getSerializableExtra("usuario") as usuario

        buttonPergunta4.setOnClickListener {
            if (radioGroupP4.checkedRadioButtonId == -1) {
                Toast.makeText(context, "Selecione uma opção!", Toast.LENGTH_LONG).show()
            } else {
                if (radioButton4a.isChecked){
                    mainViewModel.pergunta4.value = true
                }else{
                    mainViewModel.pergunta4.value = false
                }

                findNavController().navigate(R.id.pergunta5Fragment)
                }

            }

        }
    }