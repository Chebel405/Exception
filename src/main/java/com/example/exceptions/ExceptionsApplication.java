package com.example.exceptions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ExceptionsApplication {

    public static void main(String[] args) {
        try{
            var saisieUtilisateur = inputFromUser();
            System.out.println(saisieUtilisateur);
        }catch(BlankInputException e){
            System.out.println(e.getMessage());
        }

    }

    private static String inputFromUser() throws BlankInputException {
        System.out.println("Saisie : ");
        var scanner = new Scanner(System.in);
        var result = scanner.nextLine();
        //isBlank = verifie que le contenu de la chaine de caractère n'est pas vide
        if(result.isBlank()){
            throw new BlankInputException("La saisie utilisateur ne peut pas être vide");
        }
        return result;
    }

}
