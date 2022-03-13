package com.example.smartchess

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.smartchess.data.GameDao
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class CameraViewmodel @Inject constructor(repo:ChessRepo): ViewModel() {


    private var hunredI = 0


    init{
        viewModelScope.launch {


        }


    }

/*
    class CameraViewModelFactory(
        private val gameDao: GameDao
    ) : ViewModelProvider.Factory {

        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(CameraViewmodel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return CameraViewmodel(gameDao) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
*/


}