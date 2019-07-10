package com.assignment;

import com.assignment.processor.MacProcessor;

public class Application {

	public static void main(String... args) {
		if(args.length==0) printHelp();
		for(String arg : args) {
			System.out.println(MacProcessor.getMacInfo(arg));
		}
	}
	
	private static void printHelp() {
		System.out.println("Invalid parameter...");
		System.out.println("Please provide one or more parameter and each paramter should be mac address.");
		System.out.println("eg.");
		System.out.println("  java -jar mac-pro.jar {mac-address} {mac-address} {mac-address} ...");
		System.out.println("\nBye.");
		System.exit(0);
	}

}
