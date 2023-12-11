public class Main
{
    public static void main(String[] args)
    {
        //Grace Hopper, "Queen Bee", 190692, 3.99, Yes
        Cars gtr = new Cars("GT-R","Nissan","3.8 L V6","Orange",2020,205,false,true);
        Cars lambo = new Cars("Aventador S","Lamborghini"," 6.5 V12 7AT","Yellow",2018,217,false,true);
        Cars cat = new Cars("Challenger SRT Hellcat", "Dodge","8.0-liter W16 engine","Red",2019, 203, false, true);
        Cars golf = new Cars("G29 Golf Cart","Yamaha","Overhead - Valve 357cc","Turqoise",2016,35,false,false);
        Cars chevy = new Cars("Bel Air Impala Tri Power","Chevrolet","None","Blue",1958,125,false,true);
        Cars cadi = new Cars("Eldorado Biarritz","Unknown","365 cubic inch 325 horsepower V8","Spring Green",1956,60,false,false);



        cat.setYear(2021);
        cat.setCustom(true);
        golf.setName("G39 Golf Cart");
        golf.setColor("Black");
        cadi.setBrand("Cadillac");
        cadi.setMaxSpeed(119);
        chevy.setEngine("348ci V8");
        chevy.setCanRace(false);


        //setters^

        System.out.println(gtr);
        System.out.println("Name: " + lambo.getName() + "\nBrand: " + lambo.getBrand() + "\nEngine: " + lambo.getEngine() + "\nColor: " + lambo.getColor() + "\nYear: " + lambo.getYear() + "\nSpeed(mph): " + lambo.getMaxSpeed() + "\nIs Custom: " + lambo.getCustom() + "\nCan Race: " + lambo.getCanRace() + "\n" + "Price: " + lambo.createPrice() + "\n");
        System.out.print(cat.toString());
        System.out.println(golf.toString());
        System.out.println("Name: " + cadi.getName() + "\nBrand: " + cadi.getBrand() + "\nEngine: " + cadi.getEngine() + "\nColor: " + cadi.getColor() + "\nYear: " + cadi.getYear() + "\nSpeed(mph): " + cadi.getMaxSpeed() + "\nIs Custom: " + cadi.getCustom() + "\nCan Race: " + cadi.getCanRace() + "\nPrice: " + cadi.createPrice() + "\n");
        System.out.print(chevy.toString());
        //outputting^




    }
}