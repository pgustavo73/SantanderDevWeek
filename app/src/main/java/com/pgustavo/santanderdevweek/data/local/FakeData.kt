package com.pgustavo.santanderdevweek.data.local

import com.pgustavo.santanderdevweek.data.Cartao
import com.pgustavo.santanderdevweek.data.Cliente
import com.pgustavo.santanderdevweek.data.Conta

class FakeData {

    fun getLocalData() : Conta{
        val cliente = Cliente( " Olá Paulo Gustavo")
        val cartao = Cartao("4567")
        return Conta (
                "445866-8",
                "6552-4",
                "R$ 3.830,60",
                "R$ 6.500,00",
                cliente,
                cartao
        )
    }

}