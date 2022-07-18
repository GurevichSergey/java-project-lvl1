package hexlet.code.games;

import hexlet.code.Engine;


public class Prime {
    public static void prime() {
        var engine = new Engine();
        engine.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (engine.round() < engine.getRoundToWin()) {
            var number = engine.getRandomNumber();
            System.out.println("Question: " + number);
            engine.stringUserAnswer();
            String result = "yes";
            for (var i = 2; i < number / 2; i++) {
                var check = number % i;
                if (check == 0) {
                    result = "no";
                    break;
                }
            }
            engine.setStringResult(result);
            if (engine.getStringAnswer().equals(result)) {
                engine.correctAnswer();
            } else {
                engine.wrongStringAnswer();
                break;
            }
        }
        engine.winMessage();
    }
}
