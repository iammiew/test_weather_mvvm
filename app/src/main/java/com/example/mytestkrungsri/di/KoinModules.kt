package com.example.mytestkrungsri.di

import com.example.mytestkrungsri.application.app
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.module.Module

fun initKoin(app: app) {
    startKoin {
        printLogger()
        androidContext(app)
        modules(getKoinModules())
    }
}

private fun getKoinModules(): List<Module> = listOf(
    appModule,
    WeatherModule
)