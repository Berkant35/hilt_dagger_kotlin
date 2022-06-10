package com.example.hiltex2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(private  val repository: RetrofitRepository): ViewModel() {

    //MutableLive Data dediğimiz şey aslında bir array bu örnek
    //yapılan şey aşağıya callback li bir list yolluyorsun orda içine dolunca burdan yakalıyorsun
    //gidip liveData.add(gelenVeriler) yerine zaten mutable bunu otomatik olarak dolduruyor...

    var liveData: MutableLiveData<List<Post>>

    init {
        liveData = MutableLiveData()
    }

    //Bu fonksiyonda uidan çağıracağımız fonksiyon...
    fun getLiveDataObserver()  : MutableLiveData<List<Post>> {
       return liveData
    }


    fun loadData() {
        repository.getPosts(liveData)
    }
}