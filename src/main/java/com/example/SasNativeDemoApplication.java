package com.example;

import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

@SpringBootApplication
@ImportRuntimeHints(SasNativeDemoApplication.SasNativeDemoRuntimeHints.class)
public class SasNativeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SasNativeDemoApplication.class, args);
	}

	static class SasNativeDemoRuntimeHints implements RuntimeHintsRegistrar {

		@Override
		public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
			hints.resources().registerPattern("app.*");
		}

	}

}
