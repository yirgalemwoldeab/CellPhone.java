package day_44_polylmorphism.building;

public  class BuildingUtil {




        public static double rent (Building building){
            if (building instanceof House) {
                return 1500;
            } else if (building instanceof Apartment) {

                return 800;
            } else
                return 2000;
        }

      public static Building search(String location) {

          if (location.equals("great falls")) {
              return new House("great falls", 500_000, 4);
          } else if (location.equals("fairfax")) {
              return new Apartment("fairfax", 250_000, 6);

          } else if (location.equals("mclean")) {
              return new OfficeBuilding("mclean", 200_000, 6);

          }


      return null;
      }





        public static void main(String[] args) {
            House house = new House("chicago", 14_000.00, 5);
            Building house1 =new House ("chicago", 15_000.00, 5);
            HasBackyard house2 = new House("chicago", 1400.00, 5);

            System.out.println(rent(house));
            System.out.println(new House ("chicago", 15_000.00, 5));

            System.out.println(search("fairfax"));
            System.out.println(search("mclean"));
        }
}
