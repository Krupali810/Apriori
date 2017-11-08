import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String args[]) throws FileNotFoundException {
        System.out.println("Apriori Algorithm");
//input the value of minimum support and confidence
        System.out.println("Enter the minumum support and confidence percentage");
        Scanner sc = new Scanner(System.in);
        int support = sc.nextInt();
        int confidence = sc.nextInt();
        String fileName = "C:/Users/krupali.patel/workspace/Apriori/src/input5.txt";
        Helper helper = new Helper();
//Pass value of filename, support, & confidence to the helper function
        helper.toMap(fileName,support,confidence);
    }
}

