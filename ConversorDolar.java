/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Interfaces.IConversorMoeda;

/**
 *
 * @author USUARIO
 */
public class ConversorDolar implements IConversorMoeda{
    @Override
    public void converterParaReal(double dolar) {
        System.out.println("US$" +dolar+ " em Reais é: R$" +  dolar * 5.49);
    }

    @Override
    public void converterParaDolar(double real) {
        System.out.println("R$"+real+ "em Dolares é: US$" + real / 5.49);
    }
}
