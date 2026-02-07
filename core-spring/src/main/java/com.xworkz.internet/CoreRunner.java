package com.xworkz.internet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CoreRunner {

    public static void main(String[] args) {

        System.out.println("The main started");

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(CoreConfigure.class);

        System.out.println("-------------------------------------");
        Internet internet = applicationContext.getBean(Internet.class);
        internet.setInternetId(1);
        internet.setInternetName("Jio");
        System.out.println(internet);

        System.out.println("-------------------------------------");
        Remote remote = applicationContext.getBean(Remote.class);
        remote.setRemoteId(2);
        remote.setRemoteName("Samsung Remote");
        System.out.println(remote);

        System.out.println("-------------------------------------");
        TV tv = applicationContext.getBean(TV.class);
        tv.setTvId(3);
        tv.setTvName("Sony Smart TV");
        System.out.println(tv);

        System.out.println("-------------------------------------");
        Mobile mobile = applicationContext.getBean(Mobile.class);
        mobile.setMobileId(4);
        mobile.setMobileName("iPhone");
        System.out.println(mobile);

        System.out.println("-------------------------------------");
        Laptop laptop = applicationContext.getBean(Laptop.class);
        laptop.setLaptopId(5);
        laptop.setLaptopName("Dell Laptop");
        System.out.println(laptop);

        System.out.println("-------------------------------------");
        AC ac = applicationContext.getBean(AC.class);
        ac.setAcId(6);
        ac.setAcName("LG AC");
        System.out.println(ac);

        System.out.println("-------------------------------------");
        Fan fan = applicationContext.getBean(Fan.class);
        fan.setFanId(7);
        fan.setFanName("Usha Fan");
        System.out.println(fan);

        System.out.println("-------------------------------------");
        Charger charger = applicationContext.getBean(Charger.class);
        charger.setChargerId(8);
        charger.setChargerName("Samsung Charger");
        System.out.println(charger);

        System.out.println("-------------------------------------");
        Speaker speaker = applicationContext.getBean(Speaker.class);
        speaker.setSpeakerId(9);
        speaker.setSpeakerName("Boat Speaker");
        System.out.println(speaker);

        System.out.println("-------------------------------------");
        Keyboard keyboard = applicationContext.getBean(Keyboard.class);
        keyboard.setKeyboardId(10);
        keyboard.setKeyboardName("HP Keyboard");
        System.out.println(keyboard);

        System.out.println("-------------------------------------");
        Mouse mouse = applicationContext.getBean(Mouse.class);
        mouse.setMouseId(11);
        mouse.setMouseName("Logitech Mouse");
        System.out.println(mouse);

        System.out.println("-------------------------------------");
        Headphone headphone = applicationContext.getBean(Headphone.class);
        headphone.setHeadphoneId(12);
        headphone.setHeadphoneName("Sony Headphone");
        System.out.println(headphone);

        System.out.println("-------------------------------------");
        Refrigerator refrigerator = applicationContext.getBean(Refrigerator.class);
        refrigerator.setRefrigeratorId(13);
        refrigerator.setRefrigeratorName("LG Refrigerator");
        System.out.println(refrigerator);

        System.out.println("-------------------------------------");
        WashingMachine washingMachine = applicationContext.getBean(WashingMachine.class);
        washingMachine.setWashingMachineId(14);
        washingMachine.setWashingMachineName("IFB Washing Machine");
        System.out.println(washingMachine);

        System.out.println("-------------------------------------");
        Mixer mixer = applicationContext.getBean(Mixer.class);
        mixer.setMixerId(15);
        mixer.setMixerName("Philips Mixer");
        System.out.println(mixer);

        System.out.println("-------------------------------------");
        Oven oven = applicationContext.getBean(Oven.class);
        oven.setOvenId(16);
        oven.setOvenName("LG Oven");
        System.out.println(oven);

        System.out.println("-------------------------------------");
        Stove stove = applicationContext.getBean(Stove.class);
        stove.setStoveId(17);
        stove.setStoveName("Prestige Stove");
        System.out.println(stove);

        System.out.println("-------------------------------------");
        Printer printer = applicationContext.getBean(Printer.class);
        printer.setPrinterId(18);
        printer.setPrinterName("HP Printer");
        System.out.println(printer);

        System.out.println("-------------------------------------");
        Scanner scanner = applicationContext.getBean(Scanner.class);
        scanner.setScannerId(19);
        scanner.setScannerName("Canon Scanner");
        System.out.println(scanner);

        System.out.println("-------------------------------------");
        Monitor monitor = applicationContext.getBean(Monitor.class);
        monitor.setMonitorId(20);
        monitor.setMonitorName("Acer Monitor");
        System.out.println(monitor);

        System.out.println("-------------------------------------");
        Projector projector = applicationContext.getBean(Projector.class);
        projector.setProjectorId(21);
        projector.setProjectorName("Epson Projector");
        System.out.println(projector);

        System.out.println("-------------------------------------");
        Camera camera = applicationContext.getBean(Camera.class);
        camera.setCameraId(22);
        camera.setCameraName("Canon Camera");
        System.out.println(camera);

        System.out.println("-------------------------------------");
        Battery battery = applicationContext.getBean(Battery.class);
        battery.setBatteryId(23);
        battery.setBatteryName("Duracell Battery");
        System.out.println(battery);

        System.out.println("-------------------------------------");
        PowerBank powerBank = applicationContext.getBean(PowerBank.class);
        powerBank.setPowerBankId(24);
        powerBank.setPowerBankName("Mi PowerBank");
        System.out.println(powerBank);

        System.out.println("-------------------------------------");
        Torch torch = applicationContext.getBean(Torch.class);
        torch.setTorchId(25);
        torch.setTorchName("Philips Torch");
        System.out.println(torch);

        System.out.println("-------------------------------------");
        Clock clock = applicationContext.getBean(Clock.class);
        clock.setClockId(26);
        clock.setClockName("Titan Clock");
        System.out.println(clock);

        System.out.println("-------------------------------------");
        Watch watch = applicationContext.getBean(Watch.class);
        watch.setWatchId(27);
        watch.setWatchName("Fastrack Watch");
        System.out.println(watch);

        System.out.println("-------------------------------------");
        Calculator calculator = applicationContext.getBean(Calculator.class);
        calculator.setCalculatorId(28);
        calculator.setCalculatorName("Casio Calculator");
        System.out.println(calculator);

        System.out.println("-------------------------------------");
        AirCooler airCooler = applicationContext.getBean(AirCooler.class);
        airCooler.setAirCoolerId(29);
        airCooler.setAirCoolerName("Symphony AirCooler");
        System.out.println(airCooler);

        System.out.println("-------------------------------------");
        Heater heater = applicationContext.getBean(Heater.class);
        heater.setHeaterId(30);
        heater.setHeaterName("Bajaj Heater");
        System.out.println(heater);

        System.out.println("The main ended");
    }
}
