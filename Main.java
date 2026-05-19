 

import java.math.BigInteger;

public class Main
{
    public static void main(String args[]){
        int summe = 0;
        int obereGrenze = 50;
        for (int i = 1; i<= obereGrenze;i++)
        {
            summe += i;
        }        

        BigInteger mult = new BigInteger("1");
        for(int i = 1; i<= obereGrenze;i++)
        {
            BigInteger temp = new BigInteger(String.valueOf(i));
            mult = mult.multiply(temp);
        }

        System.out.println("Summe = " + summe);
        System.out.println("Mult = " + mult.toString());

        //Coole Idee 1
        //Coole Idee 2
	//Master Update 1
	//Master Update 2
	//featureupdate 1
	//featureupdate 2
	//Masterupdate 1 neu
    }
}
