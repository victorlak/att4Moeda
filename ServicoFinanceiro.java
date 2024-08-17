/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.att4;

import Interfaces.IConversorMoeda;

/**
 *
 * @author USUARIO
 */
public class ServicoFinanceiro {
    private IConversorMoeda converte;

    public ServicoFinanceiro(IConversorMoeda converte) {
        this.converte= converte;
    }
            
    public void realizarTransacao(double Valor){
        converte.converterParaReal(Valor);
        converte.converterParaDolar(Valor);
    }
}
