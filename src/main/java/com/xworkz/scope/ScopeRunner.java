package com.xworkz.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeRunner {

    public static void main(String[] args) {

        System.out.println("The main method started");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CoreConfigure.class);

        ForumMall forumMall = applicationContext.getBean(ForumMall.class);
        forumMall.setMallID(1);
        forumMall.setMallLocation("Bengaluru");
        forumMall.setMallName("ForumMall");
        System.out.println(forumMall);
        LifeStyle lifeStyle = forumMall.getLifeStyle();
        lifeStyle.setShopId(100);
        lifeStyle.setMallType("Cloth");
        lifeStyle.setShopName("LifeStyle");
        System.out.println(lifeStyle);
        System.out.println("------------------------------------");

        Library library = applicationContext.getBean(Library.class);
        library.setLibraryID(1);
        library.setLibraryName("Ram Library");
        library.setLibraryLocation("Bengaluru");
        Book book = library.getBook();
        book.setBookId(1);
        book.setBookName("Kaya");
        book.setBookPrice(123);
        System.out.println(library);
        System.out.println(book);
        System.out.println("------------------------------------");

        Hospital hospital = applicationContext.getBean(Hospital.class);
        hospital.setHospitalId(1);
        hospital.setHospitalName("Apollo");
        hospital.setHospitalLocation("Bengaluru");
        Doctor doctor = hospital.getDoctor();
        doctor.setDoctorID(101);
        doctor.setDoctorName("Surya");
        doctor.setSpecialization("Cardiologist");
        System.out.println(hospital);
        System.out.println(doctor);
        System.out.println("------------------------------------");

        Hotel hotel = applicationContext.getBean(Hotel.class);
        hotel.setHotelId(1);
        hotel.setHotelName("Sannidhi Paradise");
        hotel.setLocation("Mangalur");
        Dish dish = hotel.getDish();
        dish.setDishId(1);
        dish.setDishName("Arishinadele Kadabu");
        dish.setDishPrice(70);
        System.out.println(hotel);
        System.out.println(dish);
        System.out.println("------------------------------------");

        Office office = applicationContext.getBean(Office.class);
        office.setOfficeId(1);
        office.setOfficeName("J.P Morgan");
        office.setLocation("Bengaluru");
        Employee employee = office.getEmployee();
        employee.setEmployeeId(1);
        employee.setEmployeeName("Sannidhi Shetty");
        System.out.println(office);
        System.out.println(employee);
        System.out.println("------------------------------------");

        Factory factory = applicationContext.getBean(Factory.class);
        factory.setFactoryId(1);
        factory.setFactoryName("Milky Steel Factory");
        factory.setFactoryLocation("Bengaluru");
        Machine machine = factory.getMachine();
        machine.setMachineId(1);
        machine.setMachineName("2 Stroke Chip Machine");
        machine.setMachineType("Diesel");
        System.out.println(factory);
        System.out.println(machine);
        System.out.println("------------------------------------");

        Train train = applicationContext.getBean(Train.class);
        train.setTrainId(1);
        train.setTrainName("Shatabdi Express");
        Coach coach = train.getCoach();
        coach.setCoachId(108);
        coach.setNoOfCoach(25);
        System.out.println(train);
        System.out.println(coach);
        System.out.println("------------------------------------");

        Plane plane = applicationContext.getBean(Plane.class);
        plane.setPlaneId(1);
        plane.setPlaneSource("Tokyo");
        plane.setPlaneDestination("India");
        Pilot pilot = plane.getPilot();
        pilot.setPilotId(1);
        pilot.setPilotName("Surya");
        pilot.setYearOfExperience(2);
        System.out.println(plane);
        System.out.println(pilot);
        System.out.println("------------------------------------");

        Course course = applicationContext.getBean(Course.class);
        course.setCourseId(1);
        course.setCourseName("Java FullStack");
        Trainer trainer = course.getTrainer();
        trainer.setTrainerId(2);
        trainer.setTrainerName("Omkar");
        System.out.println(course);
        System.out.println(trainer);
        System.out.println("------------------------------------");

        Bustand bustand = applicationContext.getBean(Bustand.class);
        bustand.setBusStandId(1);
        bustand.setBusstandName("Brigade Millennium");
        Bus bus = bustand.getBus();
        bus.setBusId(1);
        bus.setBusSource("Majestic");
        bus.setBusDestination("Jambusavari");
        System.out.println(bustand);
        System.out.println(bus);
        System.out.println("------------------------------------");

        House house = applicationContext.getBean(House.class);
        house.setHouseNo(1);
        house.setColor("Orange");
        Owner owner = house.getOwner();
        owner.setOwnerName("Ramesh");
        owner.setOwnerAge(50);
        owner.setPhone(9766868676L);
        System.out.println(house);
        System.out.println(owner);
        System.out.println("------------------------------------");

        Bank bank = applicationContext.getBean(Bank.class);
        bank.setBankId(1);
        bank.setBankBranch("Kattehaklu");
        Account account = bank.getAccount();
        account.setAccountNo(1233786);
        account.setAccountBalance(460000F);
        System.out.println(bank);
        System.out.println(account);
        System.out.println("------------------------------------");

        School school = applicationContext.getBean(School.class);
        school.setSchoolId(1);
        school.setSchoolName("National Public School");
        Teacher teacher = school.getTeacher();
        teacher.setTeacherId(101);
        teacher.setTeacherName("Ravi");
        teacher.setSubject("Mathematics");
        System.out.println(school);
        System.out.println(teacher);
        System.out.println("------------------------------------");

        University university = applicationContext.getBean(University.class);
        university.setUniversityId(1);
        university.setUniversityName("VTU");
        Professor professor = university.getProfessor();
        professor.setProfessorId(101);
        professor.setProfessorName("Dr Kumar");
        System.out.println(university);
        System.out.println(professor);
        System.out.println("------------------------------------");

        Cinema cinema = applicationContext.getBean(Cinema.class);
        cinema.setCinemaId(1);
        cinema.setCinemaName("INOX");
        Screen screen = cinema.getScreen();
        screen.setScreenNumber(3);
        screen.setScreenType("IMAX");
        System.out.println(cinema);
        System.out.println(screen);
        System.out.println("------------------------------------");

        Stadium stadium = applicationContext.getBean(Stadium.class);
        stadium.setStadiumId(1);
        stadium.setStadiumName("Chinnaswamy");
        Player player = stadium.getPlayer();
        player.setPlayerId(18);
        player.setPlayerName("Virat");
        System.out.println(stadium);
        System.out.println(player);
        System.out.println("------------------------------------");

        Mobile mobile = applicationContext.getBean(Mobile.class);
        mobile.setMobileId(1);
        mobile.setBrand("Samsung");
        SIM sim = mobile.getSim();
        sim.setSimNumber(9876543210L);
        sim.setProvider("Jio");
        System.out.println(mobile);
        System.out.println(sim);
        System.out.println("------------------------------------");

        Laptop laptop = applicationContext.getBean(Laptop.class);
        laptop.setLaptopId(1);
        laptop.setBrand("Dell");
        Battery battery = laptop.getBattery();
        battery.setCapacity(5000);
        battery.setType("Li-ion");
        System.out.println(laptop);
        System.out.println(battery);
        System.out.println("------------------------------------");

        Camera camera = applicationContext.getBean(Camera.class);
        camera.setCameraId(1);
        camera.setBrand("Canon");
        Lens lens = camera.getLens();
        lens.setLensType("Wide Angle");
        lens.setFocalLength(35);
        System.out.println(camera);
        System.out.println(lens);
        System.out.println("------------------------------------");

        Car car = applicationContext.getBean(Car.class);
        car.setName("BMW");
        Engine engine = car.getEngine();
        engine.setValue("Petrol Engine");
        System.out.println(car);
        System.out.println(engine);
        System.out.println("------------------------------------");

        Bike bike = applicationContext.getBean(Bike.class);
        bike.setBikeName("Royal Enfield");
        Helmet helmet = bike.getHelmet();
        helmet.setHelmetBrand("Studds");
        helmet.setHelmetSize("M");
        System.out.println(bike);
        System.out.println(helmet);
        System.out.println("------------------------------------");

// Space & Astronaut
        Space space = applicationContext.getBean(Space.class);
        space.setSpaceId(1);
        space.setGalaxyName("Milky Way");
        System.out.println(space);
        Astronaut astronaut = space.getAstronaut();
        astronaut.setAstronautId(101);
        astronaut.setAstronautName("Neil Armstrong");
        System.out.println(astronaut);
        System.out.println("------------------------------------");

// Apartment & Flat
        Apartment apartment = applicationContext.getBean(Apartment.class);
        apartment.setApartmentId(1);
        apartment.setApartmentName("Skyline Residency");
        System.out.println(apartment);
        Flat flat = apartment.getFlat();
        flat.setFlatNo(101);
        flat.setOwnerName("Ramesh");
        System.out.println(flat);
        System.out.println("------------------------------------");


        Park park = applicationContext.getBean(Park.class);
        park.setParkId(1);
        park.setParkName("Cubbon Park");
        System.out.println(park);
        Tree tree = park.getTree();
        tree.setTreeId(301);
        tree.setTreeType("Neem");
        System.out.println(tree);
        System.out.println("------------------------------------");

// College & Student
        College college = applicationContext.getBean(College.class);
        college.setCollegeId(1);
        college.setCollegeName("Oxford College");
        System.out.println(college);
        Student student = college.getStudent();
        student.setStudentId(201);
        student.setStudentName("Suresh");
        System.out.println(student);
        System.out.println("------------------------------------");


        Restaurant restaurant = applicationContext.getBean(Restaurant.class);
        restaurant.setRestaurantId(1);
        restaurant.setRestaurantName("Taj Restaurant");
        System.out.println(restaurant);
        Chef chef = restaurant.getChef();
        chef.setChefId(301);
        chef.setChefName("Rahul");
        System.out.println(chef);
        System.out.println("------------------------------------");


        Museum museum = applicationContext.getBean(Museum.class);
        museum.setMuseumId(1);
        museum.setMuseumName("National Museum");
        System.out.println(museum);
        Exhibit exhibit = museum.getExhibit();
        exhibit.setExhibitId(401);
        exhibit.setExhibitName("Ancient Sculpture");
        System.out.println(exhibit);
        System.out.println("------------------------------------");



        Court court = applicationContext.getBean(Court.class);
        court.setName("High Court");
        Judge judge = court.getJudge();
        judge.setValue("Justice Suresh");
        System.out.println(court);
        System.out.println(judge);
        System.out.println("------------------------------------");

        Event event = applicationContext.getBean(Event.class);
        event.setName("Tech Fest");
        Organizer organizer = event.getOrganizer();
        organizer.setValue("Rahul");
        System.out.println(event);
        System.out.println(organizer);
        System.out.println("------------------------------------");

        Garage garage = applicationContext.getBean(Garage.class);
        garage.setName("AutoCare");
        Mechanic mechanic = garage.getMechanic();
        mechanic.setValue("Ramesh");
        System.out.println(garage);
        System.out.println(mechanic);
        System.out.println("------------------------------------");

        Hostel hostel = applicationContext.getBean(Hostel.class);
        hostel.setName("Boys Hostel");
        Warden warden = hostel.getWarden();
        warden.setValue("Mahesh");
        System.out.println(hostel);
        System.out.println(warden);
        System.out.println("------------------------------------");

        Newspaper newspaper = applicationContext.getBean(Newspaper.class);
        newspaper.setName("The Hindu");
        Editor editor = newspaper.getEditor();
        editor.setValue("Suresh");
        System.out.println(newspaper);
        System.out.println(editor);
        System.out.println("------------------------------------");

        BusDepot busDepot = applicationContext.getBean(BusDepot.class);
        busDepot.setName("KSRTC");
        Driver driver = busDepot.getDriver();
        driver.setValue("Manjunath");
        System.out.println(busDepot);
        System.out.println(driver);
        System.out.println("------------------------------------");

        CourierOffice courierOffice = applicationContext.getBean(CourierOffice.class);
        courierOffice.setName("DTDC");
        DeliveryBoy deliveryBoy = courierOffice.getDeliveryBoy();
        deliveryBoy.setValue("Ravi");
        System.out.println(courierOffice);
        System.out.println(deliveryBoy);
        System.out.println("------------------------------------");

        System.out.println("The main method ended");
    }
}
