package Concessionaria;
import java.util.ArrayList;

public class Concessionaria
{
    public static void main(String[] args)
    {
        // Exemplo 1: Barco de pesca
        Barco barcoDePesca = new Barco("FishingMaster", "FM2000", 2018, 35000.00, 7.2, "Casco de Fibra de Vidro", 4, 150.0, "Motor de Popa");

        // Exemplo 2: Barco de passeio
        Barco barcoDePasseio = new Barco("SeaJoy", "SunCruiser", 2020, 55000.00, 8.5, "Casco de Alumínio", 6, 200.0, "Motor de Centro");

        // Exemplo 3: Barco de competição
        Barco barcoDeCompeticao = new Barco("SpeedMaster", "RacingX", 2022, 120000.00, 9.0, "Casco de Fibra de Carbono", 2, 450.0, "Motor a Jato");

        // Exemplo 4: Barco de transporte
        Barco barcoDeTransporte = new Barco("CargoShip", "OceanCarrier", 2015, 500000.00, 20.0, "Casco de Aço", 50, 1500.0, "Propulsão a Hélice");

        // Exemplo 5: Barco inflável
        Barco barcoInflavel = new Barco("Zodiac", "ZS200", 2019, 15000.00, 4.0, "Casco Inflável", 4, 50.0, "Motor de Popa");

        // Exemplo 6: Barco de luxo
        Barco barcoDeLuxo = new Barco("YachtMaster", "LuxuryLiner", 2024, 1000000.00, 15.0, "Casco de Fibra de Vidro Reforçado", 12, 800.0, "Motor de Centro");
        
        System.out.println(carro.ObterInformacoes());

        Carro carro = new Carro("BMW", "X7", 2017, 200000.00, 4, "Gasolina", 7, 335, "xDrive");
    }
}
