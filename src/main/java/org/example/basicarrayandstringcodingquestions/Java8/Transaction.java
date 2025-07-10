package org.example.basicarrayandstringcodingquestions.Java8;

import lombok.*;

import java.math.BigInteger;
import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class Transaction {
    UUID id;
    String cName;
    Date transactionDate;
    BigInteger transactionValue;


}
