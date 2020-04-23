package com.company;

import com.store.*;

public class GroceryStoreFactory {

        ScannerWrapper sc = new ScannerWrapper();
        public GroceryStore create(){
            System.out.println("1 - create meat store");
            System.out.println("2 - create fish store");
            System.out.println("3 - create sweet store");
            System.out.println("4 - create vegetable store");
            int choice = sc.nextInt(1, 4);
            GroceryStore result = null;
                switch (choice) {
                    case 1:
                    result = new MeatStore();
                    break;
                case 2:
                    result = new FishStore();
                    break;
                case 3:
                    result = new SweetStore();
                    break;
                case 4:
                    result = new VegetableStore();
                    break;
                default:
                    throw new IllegalArgumentException("Wrong GroceryStore type:" + choice);
            }
            System.out.println("Enter square store:");
            result.setSquareStore(sc.nextDouble());
            System.out.println("Enter food:");
            System.out.println("When finished typing \"end\"");
            String input = "";
            while (!(input = sc.nextLine()).equals("end")){
                result.setFoods(input);
            }
        return result;
        }

}
