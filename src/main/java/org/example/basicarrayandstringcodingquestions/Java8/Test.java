package org.example.basicarrayandstringcodingquestions.Java8;

import java.math.BigInteger;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        List<Transaction> transactions = Arrays.asList(
                new Transaction(UUID.randomUUID(), "TCS", getDate(2024, Calendar.NOVEMBER, 15), new BigInteger("1000")),
                new Transaction(UUID.randomUUID(), "HCL", getDate(2024, Calendar.DECEMBER, 25), new BigInteger("2500")),
                new Transaction(UUID.randomUUID(), "Manhatton", getDate(2024, Calendar.NOVEMBER, 15), new BigInteger("1800")),
                new Transaction(UUID.randomUUID(), "Diana", getDate(2024, Calendar.OCTOBER, 20), new BigInteger("5600")),
                new Transaction(UUID.randomUUID(), "Ethan", getDate(2025, Calendar.JULY, 1), new BigInteger("300")),
                new Transaction(UUID.randomUUID(), "Fiona", getDate(2024, Calendar.SEPTEMBER, 15), new BigInteger("7600")),
                new Transaction(UUID.randomUUID(), "George", getDate(2025, Calendar.MARCH, 3), new BigInteger("4200")),
                new Transaction(UUID.randomUUID(), "Hannah", getDate(2025, Calendar.JUNE, 10), new BigInteger("950")),
                new Transaction(UUID.randomUUID(), "Ivan", getDate(2024, Calendar.AUGUST, 28), new BigInteger("1350")),
                new Transaction(UUID.randomUUID(), "Julia", getDate(2024, Calendar.MAY, 9), new BigInteger("8750"))
        );
        Optional<Transaction> max = transactions.stream().filter(t -> t.getTransactionDate().equals(getDate(2024, Calendar.NOVEMBER, 15)))
                .max(Comparator.comparing(Transaction::getTransactionValue));
        System.out.println(max);
    }

    private static Date getDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }
}
