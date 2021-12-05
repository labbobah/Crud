package com.example.crud

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface WordDao {
    @Query("SELECT * FROM word_table ORDER BY word ASC")
    fun getAlphabetizedWord() : Flow<List<Word>>

    @Insert //is like distinct
    fun insert(word: Word)

    @Query("DELETE FROM word_table")
    fun deleteAll()

}