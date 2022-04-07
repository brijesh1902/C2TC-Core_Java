package com.bpal.d1;

public class Count {
	String name;
    public static void main(String[] args) {
        String name = "Brijesh Pal";
        int count = 0;
        for(int i=0; i<name.length(); i++){
            if(name.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println(count);
        System.out.println(name.replace(" ", "").length());
        
        
    }

} 
