package br.com.santana.examplegradle;

import java.util.Optional;
import java.util.function.UnaryOperator;

public class ExampleOptional {
    public static void main(String[] args) {
//        optionais();
        unaryOperators();
    }

    public static void optionais(){
        Optional<String> optionalString = Optional.of("Teste");
        Optional<String> optionalVazio = Optional.empty();
        Optional<String> optionalTalvezVazio = Optional.ofNullable(null);

        optionalString.ifPresent(System.out::println);
        if(optionalTalvezVazio.isEmpty()){
            System.out.println("Optional vazio!");
        }
    }

    public static void unaryOperators(){
        UnaryOperator<Integer> calcularVezes3 = valor -> valor*3;
        int valor = 10;
        System.out.println("O valor é #"+calcularVezes3.apply(valor));
        System.out.println();
    }
}
