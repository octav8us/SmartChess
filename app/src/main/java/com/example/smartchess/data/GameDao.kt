package com.example.smartchess.data

import androidx.room.*

@Dao
interface GameDao {

    @Query("SELECT * from SmartGame ORDER BY id ASC")
    fun getItems(): List<SmartGame>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(game: SmartGame)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(game: SmartGame)

    @Query("DELETE FROM SmartGame WHERE id = :id")
    suspend fun delete(id: Int)
    abstract fun InsertFenPgn(smartFenPgn: SmartFenPgn)
}

