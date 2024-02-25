package com.realmkeeper.rk_tools;

import com.realmkeeper.characterGeneration.character;

// import com.realmkeeper.utils.diceSet;
// import com.realmkeeper.characterGeneration.characterBuilderOLD;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
public class RkToolsApplication 
{

	public static void main(String[] args) 
	{
		//SpringApplication.run(RkToolsApplication.class, args);
		
		  // Start time
		  long startTime = System.nanoTime();

		  // Create a new character
		  character demo = new character("R");
		  demo.debugActor(); // Debugging
		  
		  
		  // End time
		  long endTime = System.nanoTime();
  
		  // Calculate execution time in milliseconds
		  long duration = (endTime - startTime) / 1_000_000; // Convert nanoseconds to milliseconds
		 
		  System.out.println("Execution time: " + duration + "ms");
		  System.exit(0);
	  }
	}


