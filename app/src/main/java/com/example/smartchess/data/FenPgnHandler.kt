package com.example.smartchess.data

import com.example.smartchess.ChessRepo
import com.github.bhlangonijr.chesslib.Board
import com.github.bhlangonijr.chesslib.move.Move


suspend fun FenPgnHandler(fen:String, repo : ChessRepo) {

  var possibleMoves = repo.getFenPgn()
    if (possibleMoves.size == 0) {
        val board = Board()
        val moves: List<Move> = board.legalMoves()
        for (move in moves) {
            board.doMove(move)
            var possibleMove=SmartFenPgn(board.fen , move)
repo.sendPgnFen(possibleMove)
            board.undoMove()
        }


    }











}