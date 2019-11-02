package Dang_Ba_Hau;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name student");
        String name = input.nextLine();
        boolean isExist = false;
        for(int i = 0 ; i < students.length ; i ++){
            if(students[i].equals(name)){
                System.out.println("position of the students in the list is :"+ i );
                isExist = true;
            }
        }
        if(!isExist){
            System.out.println("Not found "+name + " in the list students");
        }
    }
}
