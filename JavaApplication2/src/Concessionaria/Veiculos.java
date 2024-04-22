package Concessionaria;

import java.util.ArrayList;
import java.util.List;

public class Veiculos
{
    // Atributos encapsulados
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private static List<Veiculos> veiculos = new ArrayList<Veiculos>();
    

    // Construtor
    public Veiculos(String marca, String modelo, int ano, double preco)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        veiculos.add(this);
    }

    // Getters e Setters
    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public int getAno()
    {
        return ano;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }

    public double getPreco()
    {
        return preco;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }
    
    public List<Veiculos> getVeiculos()
    {
        return veiculos;
    }
    
    public List<Veiculos> getVeiculosPorPrametro(String parametro, int opcao)
    {
        List<Veiculos> todos =  veiculos;
        List<Veiculos> resultado = new ArrayList<Veiculos>();
        for (Veiculos veiculo : todos)
        {
            switch(opcao)
            {
                case 0:
                    if(veiculo.getMarca().equals(parametro))
                        resultado.add(veiculo);
                    break;
                case 1:
                    if(veiculo.getModelo().equals(parametro))
                        resultado.add(veiculo);
                    break;                    
                case 2:
                    if(String.valueOf(veiculo.getAno()).equals(parametro))
                        resultado.add(veiculo);
                    break;       
            }
        }
        return resultado;
    } 
    
    public List<Veiculos> getVeiculosPorPreco(int min, int max)
    {
        List<Veiculos> todos =  veiculos;
        List<Veiculos> resultado = new ArrayList<Veiculos>();
        for (Veiculos veiculo : todos)
        {
            double preco = veiculo.getPreco();
            if(min < preco && preco < max)
                resultado.add(veiculo);
        }
        return resultado;
    }
    
    //Método obter informações dos veículos:
    public String ObterInformacoes()
    {
        return "Marca: " + getMarca() + 
                "\nModelo: " + getModelo() + 
                "\nAno: " + getAno() +
                "\nPreco: " + getPreco();
    } 
}