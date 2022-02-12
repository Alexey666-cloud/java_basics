package ru.skillbox;

public class Main {

    public static void main(String[] args) {
      Country country = new Country("");

      country.setNameCountry("Canada");
      country.setSpaceCountry(9_984670);
      country.setCountPopular(3_804873_8);
      country.setNameCapital("Ottawa");
      country.setAccessToTheSea(true);

      System.out.println(("Население " + (country.getCountPopular()) / (country.getSpaceCountry()) + " человека на км²"));
      System.out.println("Страна " + country.getNameCountry() + " имеет столицу " + country.getNameCapital() + "  у которой: " + country.getAccessToTheSea() + "\n");

      Transport transport = new Transport("");
      transport.setTypeTransport("Самолёт");
      transport.setQuantityFlights(50);
      transport.setQuantityPassenger(350);

      System.out.println("Итого: " + transport.getTypeTransport() + " доставит " + (transport.getQuantityFlights()) * (transport.getQuantityPassenger()) + " людей");
     }
}
