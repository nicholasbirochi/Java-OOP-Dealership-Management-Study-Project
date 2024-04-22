package Concessionaria;
import java.util.ArrayList;

public class Concessionaria
{
    public static void main(String[] args)
    {
        Carro carro = new Carro(BMW, X7, 2017, 200000.00, 4, Gasolina, 7, 335, xDrive);
        
        System.out.println(carro.ObterInformacoes());
    }
}
