import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Crie dicionarios que relacionem os seus modelos e seus respectivos");
        Map<String, Double> carrosNovos = new HashMap<>(){{
            put("Gol",14.5);
            put("Uno", 13.5);
            put("mobi", 15.5);
            put("hb20", 15.3);
            put("kwid", 12.2);

        }};
        //HashMap = ordem aleatório
        System.out.println(carrosNovos);

        System.out.println("Substitua o consumo do gol por 12.5");
        carrosNovos.put("Gol",12.5);
        System.out.println(carrosNovos);

        System.out.println("Confira se o modelo tucson está no dicionario " + carrosNovos.containsKey("tucson"));
        System.out.println("Exiba o consumo do uno " +carrosNovos.get("Uno"));

        System.out.println("Exiba os modelos ");
        Set<String> modelos = carrosNovos.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos");
        Collection<Double> consumo = carrosNovos.values();
        System.out.println(consumo);

      //  System.out.println("Exiba o modelo mais economico");
      //  Double consumoMaisEficiente = Collections.max(carrosNovos.values());
      //  Set <Map.Entry<String, Double>> entris = carrosNovos.entrySet();
      //  String modeloMaisEficiente = "";
       // for (Map.Entry<String, Double> entry:
       //      ) {

        System.out.println("Exiba os carros na ordem que foram inseridos");
        Map<String, Double> carrosNovos1 = new LinkedHashMap<>(){{
                put("gol", 14.5);
                put("uno", 13.5);
                put("mobi", 15.5);
                put("hb20", 15.3);
                put("kwid", 12.2);
            }};
        System.out.println(carrosNovos1);

        System.out.println("Exiba o dicionario ordenado pelo modelo");
        Map<String, Double> carroNovos2 = new TreeMap<>(carrosNovos1);
        System.out.println(carroNovos2.toString());

        System.out.println("Apague o dicionario de carros");
        carrosNovos.clear();

        System.out.println("Confira se o dicionaroi está vazio");
        System.out.println(carrosNovos.isEmpty());

                
        }





    }
