package com.example.ex3;

import java.io.FileWriter;
import java.io.IOException;


public class Ex4JournalisationMain {

	public static void main(String[] args) {
		User [] users = {
			    new User("Alice", 30), 
	            new User("", 25),
	            new User("Bob", 16)
			};
		
		
		for (User u : users) {
            try {
                u.validate();
                System.out.println("Utilisateur validé : " + u);
            } catch (InvalidUserException e) {

                try (FileWriter fw = new FileWriter("error.log", true)) {
                    fw.write("Erreur validation ("+u+"):" + e.getMessage() + "\n");
                } catch (IOException ex) {
                     ex.printStackTrace();
                }
            }  
			
	
            }
	}
}
