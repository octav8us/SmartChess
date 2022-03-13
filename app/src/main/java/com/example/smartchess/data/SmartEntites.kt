package com.example.smartchess.data
    
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.github.bhlangonijr.chesslib.Board
import com.github.bhlangonijr.chesslib.move.Move

@Entity

data class SmartGame(@PrimaryKey val id: Int,
                     @ColumnInfo(name="game" )val game: Board,
                @ColumnInfo(name = "white") val firstName: String= "white",
                @ColumnInfo(name = "black") val lastName: String = "black"

                )


@Entity(primaryKeys =["Fen","pgn"])

data class SmartFenPgn(val Fen: String ,
                      val Pgn: Move
                 )
