package com.orangeandbronze;

import java.io.*;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DirectoryLister {
	public static void main(String[] args) {
		
		Collection<Registration> registrations = new ArrayList<>();
		registrations.add(new Registration("Mickey", 24, "09399227802"));
		registrations.add(new Registration("Minnie", 23, "09399227802"));
		registrations.add(new Registration("Donald", 22, "9399227802"));
		registrations.add(new Registration("Goofy", 21, "goofy@yahoo.com"));
		registrations.add(new Registration("Pluto", 7, "09399227802"));
		System.out.println(registrations);
		
/*		process(registrations, 
				r -> r.getName() != null && !r.getName().trim().isEmpty()
                	&& r.getAge() >= 21 && r.getPhoneNumber() != null
                	&& r.getPhoneNumber().matches("\\d{11}"),
                r -> System.out.println("Texting: " + r.getPhoneNumber()),
                r -> "Registered: " + r.getName());*/
		
		Predicate<Registration> p = r -> r.getName() != null && !r.getName().trim().isEmpty()
            	&& r.getAge() >= 21 && r.getPhoneNumber() != null
            	&& r.getPhoneNumber().matches("\\d{11}");
            	
        //registrations.stream().filter(p).forEach(r -> System.out.println(r + " " + r.getClass().getName()));
		
/*        registrations.stream().filter(p).map(Registration::getName)
        .forEach(r -> System.out.println(r + " " + r.getClass().getName()));*/
        
/*        Collection<String> validNumbers = registrations.stream()
        		.filter(p).map(Registration::getPhoneNumber).collect(Collectors.toList());
        System.out.println(validNumbers);*/
        
        double aveAge = registrations.stream().mapToInt(Registration::getAge)
        		.sum();
        System.out.println(aveAge);
	}
	
/*	static void process(Collection<Registration> registrations, 
			Predicate<Registration> checker, Consumer<Registration> processor,
			Function<Registration, String> confMsg) {
		
	    for (Registration r : registrations) {
	        if (checker.test(r)) {
	            // Process:
	            processor.accept(r);
	            // Confirm:
	            System.out.println(confMsg.apply(r));
	        }
	    }
	}*/
}
