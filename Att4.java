/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.att4;

import Classes.ConversorDolar;
import Classes.ConversorReal;
import Interfaces.IConversorMoeda;

/**
 *
 * @author USUARIO
 */
public class Att4 {

    public static void main(String[] args) {
        IConversorMoeda converteReal = new ConversorReal();
       IConversorMoeda converteDolar = new ConversorDolar();
       
       ServicoFinanceiro sReal = new ServicoFinanceiro(converteReal);
       ServicoFinanceiro sDolar = new ServicoFinanceiro(converteDolar);
       
       sReal.realizarTransacao(8000.0);
       sDolar.realizarTransacao(359.0);
    }
}
