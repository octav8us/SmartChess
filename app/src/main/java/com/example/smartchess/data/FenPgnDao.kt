package com.example.smartchess.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface FenPgnDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun InsertFenPgn(move :SmartFenPgn)

    @Query("SELECT * from SmartGame")
    fun getFenPgn(): List<SmartFenPgn>


    @Query("DELETE FROM SmartGame")
    suspend fun deleteFenPgn()
}