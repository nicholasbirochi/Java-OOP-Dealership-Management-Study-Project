package Concessionaria;
import java.util.ArrayList;

public class Concessionaria
{
    public static void main(String[] args)
    {
        Barco barcoDePesca = new Barco("FishingMaster", "FM2000", 2018, 35000.00, 7.2, "Casco de Fibra de Vidro", 4, 150.0, "Motor de Popa");

        Barco barcoDePasseio = new Barco("SeaJoy", "SunCruiser", 2020, 55000.00, 8.5, "Casco de Alumínio", 6, 200.0, "Motor de Centro");

        Barco barcoDeCompeticao = new Barco("SpeedMaster", "RacingX", 2022, 120000.00, 9.0, "Casco de Fibra de Carbono", 2, 450.0, "Motor a Jato");

        Barco barcoDeTransporte = new Barco("CargoShip", "OceanCarrier", 2015, 500000.00, 20.0, "Casco de Aço", 50, 1500.0, "Propulsão a Hélice");

        Barco barcoInflavel = new Barco("Zodiac", "ZS200", 2019, 15000.00, 4.0, "Casco Inflável", 4, 50.0, "Motor de Popa");

        Barco barcoDeLuxo = new Barco("YachtMaster", "LuxuryLiner", 2024, 1000000.00, 15.0, "Casco de Fibra de Vidro Reforçado", 12, 800.0, "Motor de Centro");

        // Zodiac - Marca; 0 - 
        List<Barcos> barcos = getVeiculosPorPrametro("Zodiac", 0);

        for (Barco barco : barcos)
        {
            barco.ObterInformacoes();
        }

        // Exemplo 1: Caminhão de carga geral
        Caminhao caminhaoCargaGeral = new Caminhao("Volvo", "FH16", 2020, 250000.00, "Carga Geral", 20000.0, 4, 600.0, "Manual");

        // Exemplo 2: Caminhão baú refrigerado
        Caminhao caminhaoBauRefrigerado = new Caminhao("Scania", "P-Series", 2018, 180000.00, "Produtos Refrigerados", 15000.0, 3, 450.0, "Automática");

        // Exemplo 3: Caminhão de transporte de combustível
        Caminhao caminhaoTransporteCombustivel = new Caminhao("Mercedes-Benz", "Actros", 2021, 300000.00, "Combustível", 30000.0, 5, 700.0, "Automática");

        List<Caminhao> caminhao = getVeiculosPorPrametro("Automático", 0);

        for (Caminhao caminhao : caminhao)
        {
            caminhao.ObterInformacoes();
        }
        

        // Exemplo 1: Carro hatchback
        Carro carroHatchback = new Carro("Volkswagen", "Golf", 2020, 45000.00, 5, "Gasolina", 150.0, 300.0, "Automática");
        
        // Exemplo 2: Carro sedan
        Carro carroSedan = new Carro("Toyota", "Corolla", 2021, 48000.00, 4, "Etanol", 170.0, 400.0, "CVT");
        
        // Exemplo 3: Carro SUV
        Carro carroSUV = new Carro("Honda", "CR-V", 2019, 55000.00, 5, "Gasolina", 190.0, 500.0, "Automática");
        

        
        // Exemplo 1: Helicóptero de transporte
        Helicoptero helicopteroTransporte = new Helicoptero("Airbus", "H225 Super Puma", 2019, 15000000.00, 19, 800, "Bimotor", 1800.0, 20000.0);
        
        // Exemplo 2: Helicóptero executivo
        Helicoptero helicopteroExecutivo = new Helicoptero("AgustaWestland", "AW109 GrandNew", 2020, 8000000.00, 6, 600, "Bimotor", 1500.0, 15000.0);
        
        // Exemplo 3: Helicóptero de resgate
        Helicoptero helicopteroResgate = new Helicoptero("Sikorsky", "S-92", 2018, 20000000.00, 22, 700, "Bimotor", 2000.0, 25000.0);
        

        
        // Exemplo 1: Moto esportiva
        Moto motoEsportiva = new Moto("Honda", "CBR1000RR Fireblade", 2022, 20000.00, "4 tempos", 1000, "Elétrica", 200);
        
        // Exemplo 2: Moto cruiser
        Moto motoCruiser = new Moto("Harley-Davidson", "Street Glide Special", 2021, 25000.00, "4 tempos", 1750, "Elétrica", 350);
        
        // Exemplo 3: Moto naked
        Moto motoNaked = new Moto("Kawasaki", "Z900", 2020, 12000.00, "4 tempos", 900, "Elétrica", 210);
    }
}
