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
import kotlinx.android.synthetic.main.pergunta2_fragment.*
import kotlinx.android.synthetic.main.pergunta5_fragment.*

class Pergunta5Fragment : Fragment() {

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
        return inflater.inflate(R.layout.pergunta5_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        usuario = getActivity()?.getIntent()?.getSerializableExtra("usuario") as usuario

        buttonPergunta5.setOnClickListener {
            if (radioGroupP5.checkedRadioButtonId == -1) {
                Toast.makeText(context, "Selecione uma opção!", Toast.LENGTH_LONG).show()
            } else {
                usuario.pergunta5 = radioButton5a.isChecked

                findNavController().navigate(R.id.pergunta6Fragment)
                }

            }

        }
    }
