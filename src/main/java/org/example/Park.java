package org.example;

public class Park {
    String name;
    int numAttraction;
    String rang;

    public Park(String _name, int _numAttraction, String _rang) {
        name = _name;
        numAttraction = _numAttraction;
        rang = _rang;
    }

       public  class Attraction {
           String at_name;
           String time;
           double cost;

           public Attraction(String _at_name, String _time, double _cost) {
               at_name = _at_name;
               time = _time;
               cost = _cost;
           }
       }

    public void someInfo() {
        System.out.println(name);
        System.out.println(numAttraction);
        System.out.println(rang);
    }
}
