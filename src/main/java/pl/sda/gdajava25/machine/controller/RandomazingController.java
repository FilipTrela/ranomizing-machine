package pl.sda.gdajava25.machine.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomazingController {
    @Value("${random.words}")
    private String[] words;
    @Value("${random.number}")
    private String[] numbers;
    private Random random = new Random();

    @GetMapping("/word")
    public String randomWord() {
        return words[random.nextInt(11)];
    }

    @GetMapping("/number")
    public String randomNumber() {
        return numbers[random.nextInt(11)];
    }
}
