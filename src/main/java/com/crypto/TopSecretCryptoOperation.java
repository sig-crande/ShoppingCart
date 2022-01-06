//This is a top secret file
package com.crypto;

public class TopSecretCryptoOperation {

    private int strength;
    private String topSecret;

    public TopSecretCryptoOperation(int strength, String topSecret){
        this.strength = strength;
        this.topSecret = topSecret;
    }

    public void doCrypto(){
        System.out.println("Do the top secret operation now.....");
        System.out.println("I'm afraid I will mess this up.");
        System.out.println("Praying I don't print the secret out.");
        System.out.println("Praying I don't print the secret out.");
        System.out.println("The strength of the operation is: "+ strength);
        System.out.println("Operation completed.");
    }
}
