package com.Cognizant.Invoke;

import com.Cognizant.Classes.PhoneOrderRepair;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // @SuppressWarnings("resource");
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our site. Would you like to order or repair");
        String processOption = sc.nextLine().toLowerCase().trim();
        PhoneOrderRepair phoneOrderRepair = new PhoneOrderRepair() {
            @Override
            public void processOrder(String modelName) {

            }

            @Override
            public void processPhoneRepair(String modelName) {

            }

            @Override
            public void processAccessoryRepair(String accessoryType) {

            }
        };
        String productDetail = null;
        switch(processOption)
        {
            case "order":
                System.out.println("Please provide the phone model name");
                productDetail = sc.nextLine().trim();
                phoneOrderRepair.processOrder((productDetail));
                break;

            case "repair":
                System.out.println("Is it the phone or the accessory that you want to be repaired?");
                String productType = sc.nextLine().toLowerCase();
                if(productType.equals("phone"))
            {
                System.out.println("Please provide the phone model");
                productDetail = sc.nextLine().trim();
                phoneOrderRepair.processPhoneRepair(productDetail);
            }
            else{
                System.out.println("Please provide the accessory detail, like headphone, tempered glass");
                productDetail = sc.nextLine().trim();
                phoneOrderRepair.processAccessoryRepair(productDetail);
            }

            break;
            default:break;
        }
    }
}
