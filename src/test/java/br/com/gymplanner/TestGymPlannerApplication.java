package br.com.gymplanner;

import org.springframework.boot.SpringApplication;

public class TestGymPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.from(GymPlannerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
