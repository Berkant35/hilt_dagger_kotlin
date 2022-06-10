package com.example.hiltex2

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//Manifest dosyanda bu klası görmemizi sağlıyor...

@HiltAndroidApp
class MyHiltApp :Application ( ){

}