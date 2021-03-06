package com.example.architecture

import android.app.Application
import com.chul.data.di.apiModule
import com.chul.data.di.dataModule
import com.example.architecture.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ArchitectureApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            if (BuildConfig.DEBUG) {
                androidLogger()
            }
            androidContext(this@ArchitectureApplication)
            modules(appModule, apiModule, dataModule)
        }
    }
}