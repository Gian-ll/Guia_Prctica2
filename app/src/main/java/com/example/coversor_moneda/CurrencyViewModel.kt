package com.example.coversor_moneda
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class CurrencyViewModel : ViewModel() {
    private val _dolares = MutableLiveData("Ingresa un monto")
    val dolares:LiveData <String> get() = _dolares

    fun convertir(soles:Double){
        val tasa = 3.75
        val resultado = soles/tasa
        _dolares.value = "Equivale a : $${String.format("%.2f", resultado)}USD"
    }
}