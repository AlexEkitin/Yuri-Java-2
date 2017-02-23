package ru.stqa.pft.sandbox;

public class Square {

   public double l; //atribut


   public Square(double pri_Sozdanii_Obekta) { //constructor
      this.l = pri_Sozdanii_Obekta;
   }


   public double area() {
      return this.l * this.l;
   }
}
