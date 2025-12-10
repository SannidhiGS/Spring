package com.xworkz.lifestyle;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Component
public class LifeStyle {
    public LifeStyle(){
        System.out.println("The lifestyle method created");
    }
    @Bean("Mall")
    public List<String> getShoppingMallName(){
        List<String> shoppingMall=new ArrayList<>();
        shoppingMall.add("Meenakshi Mall");
        shoppingMall.add("Forum");
        shoppingMall.add("Lulu");
        shoppingMall.add("MantriSquare");
        shoppingMall.add("Mall Of Asia");
        shoppingMall.add("Sky city mall");
        shoppingMall.add("Orian");
        shoppingMall.add("City Center");
        shoppingMall.add("Phoenix Mall");
        shoppingMall.add("Magneto Mall");
        shoppingMall.add("South City Mall");
        shoppingMall.add("Jio World Drive");
        shoppingMall.add("Quest Mall");
        shoppingMall.add("Royal Meenakshi Mall");
        shoppingMall.add("Unity Mall");
        return shoppingMall;
    }
    @Bean("beauty")
    public List<String> getBeautyProducts(){
        List<String> beauty=new ArrayList<>();
        beauty.add("Primer");
        beauty.add("Foundation");
        beauty.add("kajal");
        beauty.add("Lipstick");
        beauty.add("Blush");
        beauty.add("nailpolish");
        beauty.add("LipBalm");
        beauty.add("Lipglass");
        beauty.add("highligther");
        beauty.add("Eyeshadow");
        beauty.add("Powder");
        beauty.add("Moisturiser");
        beauty.add("Sunscreen");
        beauty.add("Eyebrow pencil");
        beauty.add("Hydration Cream");
        return beauty;
    }
    @Bean("phone")
    public List<Long> getPhoneNumber() {
        List<Long> phoneNum = new ArrayList<>();
        phoneNum.add(997965444L);
        phoneNum.add(9876543210L);
        phoneNum.add(9123456789L);
        phoneNum.add(9988776655L);
        phoneNum.add(9090909090L);
        phoneNum.add(8001234567L);
        phoneNum.add(7509876543L);
        phoneNum.add(7001112222L);
        phoneNum.add(7203334444L);
        phoneNum.add(7305556666L);
        phoneNum.add(9407778888L);
        phoneNum.add(9609990000L);
        phoneNum.add(8801231234L);
        phoneNum.add(9904564567L);
        phoneNum.add(9517897890L);
        return phoneNum;
    }
    @Bean("countries")
    public List<String> getCountries() {
        List<String> list = new ArrayList<>();
        list.add("India");
        list.add("USA");
        list.add("UK");
        list.add("Japan");
        list.add("China");
        list.add("Germany");
        list.add("Italy");
        list.add("Canada");
        list.add("France");
        list.add("Brazil");
        return list;
    }
    @Bean("cities")
    public List<String> getCities() {
        List<String> list = new ArrayList<>();
        list.add("Bangalore");
        list.add("Delhi");
        list.add("Mumbai");
        list.add("Chennai");
        list.add("Kolkata");
        list.add("Hyderabad");
        list.add("Pune");
        list.add("Jaipur");
        list.add("Indore");
        list.add("Ahmedabad");
        return list;
    }
    @Bean("vehicles")
    public List<String> getVehicleBrands() {
        List<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Audi");
        list.add("Mercedes");
        list.add("Toyota");
        list.add("Honda");
        list.add("Kia");
        list.add("Hyundai");
        list.add("Tata");
        list.add("Mahindra");
        list.add("Renault");
        return list;
    }
    @Bean("laptops")
    public List<String> getLaptopBrands() {
        List<String> list = new ArrayList<>();
        list.add("Dell");
        list.add("HP");
        list.add("Lenovo");
        list.add("Apple");
        list.add("Acer");
        list.add("Asus");
        list.add("MSI");
        list.add("Samsung");
        list.add("LG");
        list.add("Microsoft");
        return list;
    }
    @Bean("fruits")
    public List<String> getFruits() {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        list.add("Pineapple");
        list.add("Mango");
        list.add("Papaya");
        list.add("Strawberry");
        list.add("Kiwi");
        list.add("Blueberry");
        return list;
    }
    @Bean("vegetables")
    public List<String> getVegetables() {
        List<String> list = new ArrayList<>();
        list.add("Tomato");
        list.add("Carrot");
        list.add("Potato");
        list.add("Onion");
        list.add("Beans");
        list.add("Peas");
        list.add("Spinach");
        list.add("Cabbage");
        list.add("Cauliflower");
        list.add("Capsicum");
        return list;
    }
    @Bean("pincode")
    public List<Integer> getPinCodes() {
        List<Integer> list = new ArrayList<>();
        list.add(560001);
        list.add(560002);
        list.add(560003);
        list.add(560004);
        list.add(560005);
        list.add(600001);
        list.add(600002);
        list.add(700001);
        list.add(700002);
        list.add(411001);
        return list;
    }
    @Bean("prices")
    public List<Double> getPrices() {
        List<Double> list = new ArrayList<>();
        list.add(99.99);
        list.add(150.50);
        list.add(299.00);
        list.add(499.75);
        list.add(10.5);
        list.add(20.0);
        list.add(5.99);
        list.add(250.25);
        list.add(100.10);
        list.add(75.5);
        return list;
    }
    @Bean("ratings")
    public List<Float> getRatings() {
        List<Float> list = new ArrayList<>();
        list.add(4.5f);
        list.add(3.8f);
        list.add(4.9f);
        list.add(2.7f);
        list.add(4.1f);
        list.add(5.0f);
        list.add(3.5f);
        list.add(4.3f);
        list.add(2.9f);
        list.add(3.0f);
        return list;
    }
    @Bean("boolValues")
    public List<Boolean> getBooleanValues() {
        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(false);
        list.add(true);
        list.add(true);
        list.add(false);
        list.add(true);
        list.add(false);
        list.add(true);
        list.add(false);
        list.add(true);
        return list;
    }
    @Bean("characters")
    public List<Character> getCharacters() {
        List<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        list.add('F');
        list.add('G');
        list.add('H');
        list.add('I');
        list.add('J');
        return list;
    }
    @Bean("employees")
    public List<String> getEmployees() {
        List<String> list = new ArrayList<>();
        list.add("Arun");
        list.add("Deepa");
        list.add("Kiran");
        list.add("Manoj");
        list.add("Riya");
        list.add("Suman");
        list.add("Ravi");
        list.add("Maya");
        list.add("Rahul");
        list.add("Sneha");
        return list;
    }
    @Bean("banks")
    public List<String> getBanks() {
        List<String> list = new ArrayList<>();
        list.add("SBI");
        list.add("HDFC");
        list.add("ICICI");
        list.add("Axis");
        list.add("Canara");
        list.add("Kotak");
        list.add("Yes Bank");
        list.add("Federal Bank");
        list.add("Indian Bank");
        list.add("BOI");
        return list;
    }
    @Bean("colors")
    public List<String> getColors() {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Pink");
        list.add("Purple");
        list.add("Black");
        list.add("White");
        list.add("GreenYellow");
        list.add("Light Pink");
        list.add("SkyBlue");
        list.add("Black");
        list.add("White");
        list.add("Orange");
        list.add("Brown");
        return list;
    }
    @Bean("mobileBrands")
    public List<String> getMobileBrands(){
        List<String> list = new ArrayList<>();
        list.add("Samsung");
        list.add("Apple");
        list.add("Vivo");
        list.add("Oppo");
        list.add("OnePlus");
        list.add("Realme");
        list.add("Apple");
        list.add("Vivo");
        list.add("Oppo");
        list.add("OnePlus");
        list.add("Realme");
        list.add("Nokia");
        list.add("Xiaomi");
        list.add("Motorola");
        list.add("Google Pixel");
        return list;
    }
    @Bean("icecream")
    public List<String> getIceCreams() {
        List<String> list = new ArrayList<>();
        list.add("Vanilla");
        list.add("Chocolate");
        list.add("Strawberry");
        list.add("Mint");
        list.add("Butterscotch");
        list.add("Blueberry");
        list.add("Red Velvet");
        list.add("Coffee");
        list.add("Mint");
        list.add("Butterscotch");
        list.add("Blueberry");
        list.add("Red Velvet");
        list.add("Coffee");
        list.add("Mango");
        list.add("Pista");
        return list;
    }
    @Bean("clothing")
    public List<String> getClothingBrands() {
        List<String> list = new ArrayList<>();
        list.add("Zara");
        list.add("H&M");
        list.add("Nike");
        list.add("Adidas");
        list.add("Puma");
        list.add("Levis");
        list.add("UCB");
        list.add("Nike");
        list.add("Adidas");
        list.add("Puma");
        list.add("Levis");
        list.add("UCB");
        list.add("Gucci");
        list.add("Prada");
        list.add("Armani");
        return list;
    }
    @Bean("bikes")
    public List<String> getBikeBrands() {
        List<String> list = new ArrayList<>();
        list.add("Royal Enfield");
        list.add("Honda");
        list.add("Hero");
        list.add("Yamaha");
        list.add("TVS");
        list.add("KTM");
        list.add("Suzuki");
        list.add("BMW");
        list.add("Yamaha");
        list.add("TVS");
        list.add("KTM");
        list.add("Suzuki");
        list.add("BMW");
        list.add("Ducati");
        list.add("Benelli");
        return list;
    }
    @Bean("books")
    public List<String> getBooks() {
        List<String> list = new ArrayList<>();
        list.add("Wings of Fire");
        list.add("The Alchemist");
        list.add("Harry Potter");
        list.add("Atomic Habits");
        list.add("Think and Grow Rich");
        list.add("The Secret");
        list.add("Ikigai");
        list.add("Rich Dad Poor Dad");
        list.add("Harry Potter");
        list.add("Atomic Habits");
        list.add("Think and Grow Rich");
        list.add("The Secret");
        list.add("Ikigai");
        list.add("Deep Work");
        list.add("The Power of Now");
        return list;
    }
    @Bean("movies")
    public List<String> getMovies() {
        List<String> list = new ArrayList<>();
        list.add("KGF");
        list.add("Baahubali");
        list.add("RRR");
        list.add("Dangal");
        list.add("PK");
        list.add("3 Idiots");
        list.add("Kantara");
        list.add("Pushpa");
        list.add("Jawan");
        list.add("Dangal");
        list.add("PK");
        list.add("Om");
        list.add("Upendra");
        list.add("A");
        list.add("Animal");
        return list;
    }
    @Bean("tvBrands")
    public List<String> getTVBrands() {
        List<String> list = new ArrayList<>();
        list.add("Sony");
        list.add("LG");
        list.add("Samsung");
        list.add("Panasonic");
        list.add("TCL");
        list.add("Mi");
        list.add("Vu");
        list.add("OnePlus");
        list.add("Philips");
        list.add("TCL");
        list.add("Mi");
        list.add("Vu");
        list.add("OnePlus");
        list.add("Philips");
        list.add("Toshiba");
        return list;
    }
    @Bean("dairy")
    public List<String> getDairyProducts() {
        List<String> list = new ArrayList<>();
        list.add("Milk");
        list.add("Curd");
        list.add("Paneer");
        list.add("Butter");
        list.add("Ghee");
        list.add("Cheese");
        list.add("Lassi");
        list.add("Buttermilk");
        list.add("Paneer");
        list.add("Butter");
        list.add("Ghee");
        list.add("Cheese");
        list.add("Lassi");
        list.add("Cream");
        list.add("Yogurt");
        return list;
    }
    @Bean("stationery")
    public List<String> getStationery() {
        List<String> list = new ArrayList<>();
        list.add("Pen");
        list.add("Pencil");
        list.add("Eraser");
        list.add("Sharpener");
        list.add("Scale");
        list.add("Notebook");
        list.add("Marker");
        list.add("Eraser");
        list.add("Sharpener");
        list.add("Scale");
        list.add("Notebook");
        list.add("Marker");
        list.add("Highlighter");
        list.add("File");
        list.add("Stapler");
        return list;
    }
    @Bean("games")
    public List<String> getGames() {
        List<String> list = new ArrayList<>();
        list.add("Cricket");
        list.add("Football");
        list.add("Hockey");
        list.add("Badminton");
        list.add("Tennis");
        list.add("Chess");
        list.add("Football");
        list.add("Hockey");
        list.add("Badminton");
        list.add("Tennis");
        list.add("Chess");
        list.add("Carrom");
        list.add("Kabaddi");
        list.add("Volleyball");
        list.add("Basketball");
        return list;
    }
    @Bean("languages")
    public List<String> getLanguages() {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("C++");
        list.add("JavaScript");
        list.add("PHP");
        list.add("Kotlin");
        list.add("Ruby");
        list.add("Swift");
        list.add("PHP");
        list.add("Kotlin");
        list.add("Ruby");
        list.add("Swift");
        list.add("Go");
        return list;
    }
    @Bean("salaries")
    public List<Double> getSalaries() {
        List<Double> list = new ArrayList<>();
        list.add(25000.0);
        list.add(30000.0);
        list.add(45000.0);
        list.add(55000.0);
        list.add(60000.0);
        list.add(42000.0);
        list.add(38000.0);
        list.add(50000.0);
        list.add(75000.0);
        list.add(45000.0);
        list.add(55000.0);
        list.add(60000.0);
        list.add(42000.0);
        list.add(38000.0);
        list.add(90000.0);
        return list;
    }
    @Bean("rollNumbers")
    public List<Integer> getRollNumbers() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        return list;
    }
    @Bean("ages")
    public List<Integer> getAges() {
        List<Integer> list = new ArrayList<>();
        list.add(18);
        list.add(20);
        list.add(22);
        list.add(25);
        list.add(30);
        list.add(35);
        list.add(40);
        list.add(45);
        list.add(50);
        list.add(55);
        list.add(25);
        list.add(30);
        list.add(35);
        list.add(40);
        list.add(45);
        return list;
    }
    @Bean("temperature")
    public List<Float> getTemperature() {
        List<Float> list = new ArrayList<>();
        list.add(23.5f);
        list.add(24.1f);
        list.add(29.2f);
        list.add(30.0f);
        list.add(31.5f);
        list.add(27.2f);
        list.add(25.0f);
        list.add(22.8f);
        list.add(20.5f);
        list.add(18.9f);
        list.add(23.5f);
        list.add(24.1f);
        list.add(29.2f);
        list.add(30.0f);
        list.add(31.5f);
        return list;
    }
    @Bean("carModels")
    public List<String> getCarModels() {
        List<String> list = new ArrayList<>();
        list.add("Swift");
        list.add("Baleno");
        list.add("Creta");
        list.add("Venue");
        list.add("City");
        list.add("Innova");
        list.add("Brezza");
        list.add("i20");
        list.add("Fortuner");
        list.add("Venue");
        list.add("City");
        list.add("Innova");
        list.add("Brezza");
        list.add("i20");
        list.add("Scorpio");
        return list;
    }
    @Bean("animals")
    public List<String> getAnimals() {
        List<String> list = new ArrayList<>();
        list.add("Lion");
        list.add("Tiger");
        list.add("Elephant");
        list.add("Dog");
        list.add("Cat");
        list.add("Cow");
        list.add("Horse");
        list.add("Zebra");
        list.add("Panda");
        list.add("Rabbit");
        list.add("Elephant");
        list.add("Dog");
        list.add("Cat");
        list.add("Cow");
        list.add("Horse");
        return list;
    }
    @Bean("subjects")
    public List<String> getSubjects() {
        List<String> list = new ArrayList<>();
        list.add("Maths");
        list.add("Science");
        list.add("Biology");
        list.add("Physics");
        list.add("Chemistry");
        list.add("Economics");
        list.add("Civics");
        list.add("English");
        list.add("History");
        list.add("Geography");
        list.add("Biology");
        list.add("Physics");
        list.add("Chemistry");
        list.add("Economics");
        list.add("Civics");
        return list;
    }



}
