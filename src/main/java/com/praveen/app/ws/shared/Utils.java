package com.praveen.app.ws.shared;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Utils {

	private Random random = new SecureRandom();
	private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

	public String generateUserId(int length) {
		return generateRandom(length);
	}

	private String generateRandom(int length) {
		StringBuilder response = new StringBuilder(length);

		for (int i = 0; i < length; ++i) {
			response.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
		}

		return response.toString();
	}

}
