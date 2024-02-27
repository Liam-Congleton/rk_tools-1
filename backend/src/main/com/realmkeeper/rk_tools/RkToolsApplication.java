package com.realmkeeper.rk_tools;

import com.realmkeeper.characterGeneration.character;

// import com.realmkeeper.utils.diceSet;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class RkToolsApplication 
{

	public static void main(String[] args) 
	{
//		SpringApplication.run(RkToolsApplication.class, args);
		  // Start time
		  printASCIIDragonLogo();
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
	  private static void printASCIIDragonLogo()
	  {
						
		String logo = ".----. .----.  .--.  .-.   .-.   .-.         .-. .-..----..----..----. .----..----. \r\n" + //
						"| {}  }| {_   / {} \\ | |   |  `.'  |         | |/ / | {_  | {_  | {}  }| {_  | {}  }\r\n" + //
						"| .-. \\| {__ /  /\\  \\| `--.| |\\ /| |         | |\\ \\ | {__ | {__ | .--' | {__ | .-. \\\r\n" + //
						"`-' `-'`----'`-'  `-'`----'`-' ` `-'         `-' `-'`----'`----'`-'    `----'`-' `-'";
		String dragonASCII = 
		"		   ______________\r\n" + //
						"		       ,===:'.,            `-._\r\n" + //
						"		            `:.`---.__         `-._\r\n" + //
						"		              `:.     `--.         `.\r\n" + //
						"		                \\.        `.         `.\r\n" + //
						"		        (,,(,    \\.         `.   ____,-`.,\r\n" + //
						"		     (,'     `/   \\.   ,--.___`.'\r\n" + //
						"		 ,  ,'  ,--.  `,   \\.;'         `\r\n" + //
						"		  `{D, {    \\  :    \\;\r\n" + //
						"		    V,,'    /  /    //\r\n" + //
						"		    j;;    /  ,' ,-//.    ,---.      ,\r\n" + //
						"		    \\;'   /  ,' /  _  \\  /  _  \\   ,'/\r\n" + //
						"		          \\   `'  / \\  `'  / \\  `.' /\r\n" + //
						"		           `.___,'   `.__,'   `.__,'  \r\n" + //
						"";
		System.out.println(dragonASCII + "\n" + logo);
	  }
	  

	}


