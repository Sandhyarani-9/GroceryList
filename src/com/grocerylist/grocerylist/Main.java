package com.grocerylist.grocerylist;

import java.util.Scanner;

public class Main {
    private static Scanner scan=new Scanner(System.in);
    private static GroceryList groceryList=new GroceryList();
    public static void main(String[] args) {
        boolean quit=false;
        int choice=0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice=scan.nextInt();
            scan.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit=true;
                    break;
            }
        }
    }
    public static void printInstructions(){
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print list of grocery Items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.println("Please enter the grocery item.");
        groceryList.addGroceryItem(scan.nextLine());
    }
    public static void modifyItem(){
        System.out.print("Current item name :");
        String itemNo= scan.nextLine();
        System.out.print("Enter new item:");
        String newItem=scan.nextLine();
        groceryList.modifyGroceryItem(itemNo,newItem);
    }
    public static void removeItem(){
        System.out.print("Enter item number to remove : ");
        String  itemNo=scan.nextLine();
        groceryList.removeGroceryItem(itemNo);
       
    }
    public static void searchItem(){
        System.out.print("Item to search for : ");
        String searchItem=scan.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " +searchItem+ " in our groceryList.");
        }
        else{
            System.out.println(searchItem + " not found in our groceryList.");
        }
    }
}



