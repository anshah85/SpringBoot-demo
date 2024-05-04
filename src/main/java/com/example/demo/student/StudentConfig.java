package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.AUGUST;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student akshat = new Student(
                    "Akshat",
                    "ashah85@binghamton.edu",
                    LocalDate.of(1992, Month.JANUARY, 24)
            );

            Student saumil = new Student(
                    "Saumil",
                    "sam.world@gmail.com",
                    LocalDate.of(1992, AUGUST, 16)
            );

            repository.saveAll(
                    List.of(akshat, saumil)
            );

        };
    }
}
