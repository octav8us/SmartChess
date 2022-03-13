package com.example.smartchess

import com.example.smartchess.data.FenPgnDao
import com.example.smartchess.data.GameDao
import com.example.smartchess.data.SmartFenPgn
import com.example.smartchess.data.SmartGame
import com.github.bhlangonijr.chesslib.Board
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint

class ChessRepo @Inject constructor (private val gameDao :GameDao ,private val fenPgnDao : FenPgnDao) {


    suspend fun make_game ():Int{
        val board = Board()
        val id = all_game().size +1
        val game = SmartGame(id,board)
        gameDao.insert(game)
        return id

    }

    suspend fun all_game (): List<SmartGame> {

        return gameDao.getItems()


    }
     suspend fun send_move ( smartGame: SmartGame  ){
        gameDao.update(smartGame)

    }


    suspend fun sendPgnFen (SmartFenPgn:SmartFenPgn){
        fenPgnDao.InsertFenPgn(SmartFenPgn)
    }

    suspend fun deleteFenPgn (){
        fenPgnDao.deleteFenPgn()
    }

    suspend fun getFenPgn (): List<SmartFenPgn> {
        return fenPgnDao.getFenPgn()

    }

}

