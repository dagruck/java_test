package ru.stqa.pft.sandbox;

import javax.sql.rowset.spi.SyncResolver;

public class MyFirstProgramm {
   public static void main (String[] args) {
      hello("world");
      hello("user");
      System.out.println("Hello ww");
      Quad s = new Quad(5);


      int s = 4;
      String Me = "test";

      double len = 5;
      System.out.println("Plosh quad" + s + "= "+ area (s));
      System.out.println("S quad"+5+5);
   }
   public static void hello (String some) {

      System.out.println("Hell  " + some + "!");

   }

   public static double area(Quad s){
      return s.l*s.l
   }
}
