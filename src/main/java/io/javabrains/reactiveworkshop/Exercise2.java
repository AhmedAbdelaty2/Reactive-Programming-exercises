package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.List;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        ReactiveSources.intNumbersFlux().subscribe(System.out::println);
        var x = ReactiveSources.intNumbersFlux();
        var y = x.collectList().map(List::listIterator);


        // Print all users in the ReactiveSources.userFlux stream
       ReactiveSources.userFlux().map(User::getFirstName).subscribe(System.out::println);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
