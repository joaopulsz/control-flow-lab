import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class WhatShouldIWear {

    public static void main(String[] args) {

        //Gather information about the weather
        System.out.println("Hello there! Please, enter the current outside temperature in Celsius.");
        Scanner reader1 = new Scanner(System.in);
        String temperature = reader1.nextLine();

        System.out.println("Thanks for that. Now, please enter the weather condition (clear, rain, snow).");
        Scanner reader2 = new Scanner(System.in);
        String weatherCondition = reader2.nextLine();

        //Suggest what to wear
        if (weatherCondition.equals("clear") || weatherCondition.equals("rain") || weatherCondition.equals("snow")) {
            if (parseInt(temperature) >= 30) {
                if (weatherCondition.equals("clear")) {
                    System.out.println("Swimming suit and flip-flops, go out and enjoy. Otherwise, find somewhere with AC.");
                } else if (weatherCondition.equals("rain")) {
                    System.out.println("Shorts and a T-shirt will do it, but don't forget your umbrella.");
                } else {
                    System.out.println("It's probably the end of the world. So long, human.");
                }

            } else if (parseInt(temperature) >= 20 && parseInt(temperature) < 30) {
                if (weatherCondition.equals("clear")) {
                    System.out.println("You should be fine with just a shirt or a T-shirt.");
                } else if (weatherCondition.equals("rain")) {
                    System.out.println("You might wanna bring an umbrella and a light jacket.");
                } else {
                    System.out.println("Something is very wrong, you should have listened when they warned about climate change.");
                }

            } else if (parseInt(temperature) >= 10 && parseInt(temperature) < 20) {
                if (weatherCondition.equals("clear") || weatherCondition.equals("rain")) {
                    System.out.println("Don't forget to wear a jacket or a coat.");
                } else {
                    System.out.println("This is quite unusual, but I suppose you'll be fine with a jacket or coat.");
                }

            } else {
                if (weatherCondition.equals("clear") || weatherCondition.equals("rain")) {
                    System.out.println("It's quite cold outside, wear a heavy jacket or overcoat and maybe a scarf.");
                } else {
                    System.out.println("Go and make a snowman! But don't forget your scarf and a bonnet.");
                }

            }

        } else {
            System.out.println("Please, enter a valid weather condition.");
        }

    }

}
