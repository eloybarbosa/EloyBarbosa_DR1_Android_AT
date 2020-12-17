package br.ebarbosa.eloybarbosa_dr1_android_at

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.ebarbosa.eloybarbosa_dr1_android_at.model.usuario
import java.io.Serializable
import kotlin.Lazy as Lazy

class MainViewModel : ViewModel() {


    val pergunta1: MutableLiveData<Boolean>by lazy {
        MutableLiveData<Boolean>()
    }
    val pergunta2: MutableLiveData<Boolean>by lazy {
        MutableLiveData<Boolean>()
    }
    val pergunta3: MutableLiveData<Boolean>by lazy {
        MutableLiveData<Boolean>()
    }
    val pergunta4: MutableLiveData<Boolean>by lazy {
        MutableLiveData<Boolean>()
    }
    val pergunta5: MutableLiveData<Boolean>by lazy {
        MutableLiveData<Boolean>()
    }
    val pergunta6: MutableLiveData<Boolean>by lazy {
        MutableLiveData<Boolean>()
    }



//    class respostas (
//        var pergunta1: Boolean = true,
//        var pergunta2: Boolean = false,
//        var pergunta3: Boolean = false,
//        var pergunta4: Boolean = false,
//        var pergunta5: Boolean = false,
//        var pergunta6: Boolean = false,
//
//        ): Serializable

}