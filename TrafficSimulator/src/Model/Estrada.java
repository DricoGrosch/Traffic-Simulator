package Model;

import java.util.ArrayList;
import java.util.List;

public enum Estrada {

    ZERO(0,"img/0.png"),
    ONE(1,"img/1.png"),
    TWO(2,"img/2.png"),
    THREE(3,"img/3.png"),
    FOUR(4,"img/4.png"),
    FIVE(5,"img/crossing.png"),
    SIX(6,"img/crossing.png"),
    SEVEN(7,"img/crossing.png"),
    EIGHT(8,"img/crossing.png"),
    NINE(9,"img/crossing.png"),
    TEN(10,"img/crossing.png"),
    ELEVEN(11,"img/crossing.png"),
    TWELVE(12,"img/crossing.png");


    private String filePath;
    private int numero;

    private Estrada(int number, String filePath) {
        this.filePath = filePath;
        this.numero   = number;
    }

    @Override
    public String toString() {
        return this.filePath;
    }
    
   public static String getRoadType(int number) {
      for (Estrada roadType : Estrada.values()) {
          if (roadType.numero == number)
              return roadType.toString();
      }
        return null;
   }

   public static List<Integer> getStopCells(){
       List<Integer> list = new ArrayList<>();
       for (Estrada type:
            Estrada.values()) {
           if( (type.numero == 5) || (type.numero == 6) || (type.numero == 7) || (type.numero == 8) ||
                   (type.numero == 9) || (type.numero == 10) || (type.numero == 11) || (type.numero == 12) ){
               list.add(type.numero);
           }
       }
        return list;

   }
}