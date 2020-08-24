package ru.job4j.condition;

public class BoolLogic {
    public static boolean Conjunction(boolean eggs, boolean pan) {

//      if (eggs == true && pan == true){
//          return true;
//      }else if (eggs == false && pan == true){
//          return false;
//      }else if (eggs == false && pan == false){
//          return false;
//      }else if (eggs == true && pan == false){
//          return false;
//      }
        boolean conjunction = (eggs && pan) ? true : false;
        return conjunction;


    }

    public static boolean Disjunction(boolean carParking, boolean brokenCar) {
//        if (carParking == true || brokenCar == true){
//            return true;
//        }else if (carParking == false || brokenCar == true){
//            return true;
//        }else if (carParking == false || brokenCar == false){
//            return false;
//        }else if (carParking == true || brokenCar == false){
//            return true;
//        }
        boolean disjunction = (carParking || brokenCar) ? true : false;
        return disjunction;
    }

    public static void main(String[] arg) {
        System.out.println("Conjunction: " + BoolLogic.Conjunction(true, false));
        System.out.println("Disjunction: " + BoolLogic.Disjunction(false, true));
    }
}
