package com.example.crud

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class WordRepository(private val wordDao: WordDao) {
    val allWords : Flow<List<Word>> = wordDao.getAlphabetizedWord()

    @SuppressWarnings
    @WorkerThread
    @Suppress("RedundantSuspendModifier")
    suspend fun insert(word: Word){
        wordDao.insert(word)
    }

}