package com.orangeandbronze;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class RegistrationValidator {

	static void process(Collection<Registration> registrations) {
	    for (Registration r : registrations) {
	        if (r.getName() != null && !r.getName().trim().isEmpty()
	                && r.getAge() >= 21 && r.getPhoneNumber() != null
	                && r.getPhoneNumber().matches("\\d{11}")) {
	            // Process:
	            System.out.println("Texting: " + r.getPhoneNumber());
	            // Confirm:
	            System.out.println("Registered: " + r.getName());
	        }
	    }
	}

	public static void main(String[] args) {
		Collection<Registration> registrations = new ArrayList<>();
		registrations.add(new Registration("Mickey", 24, "09399227802"));
		registrations.add(new Registration("Minnie", 23, "09399227802"));
		registrations.add(new Registration("Donald", 22, "9399227802"));
		registrations.add(new Registration("Goofy", 21, "goofy@yahoo.com"));
		registrations.add(new Registration("Pluto", 7, "09399227802"));
		System.out.println(registrations);
		process(registrations);
	}
}
