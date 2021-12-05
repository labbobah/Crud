package com.example.crud

import android.app.Application
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.CoroutineScope

class WordsApplication : Application() {
    private val applicationScope = CoroutineScope(SupervisorJob())
    private val database by lazy { WordRoomDatabase.getDataBase(this, applicationScope) }
    val repository by lazy { WordRepository(database.wordDao()) }

}