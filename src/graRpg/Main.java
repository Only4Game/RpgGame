package graRpg;


import graRpg.klasy.Postac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
charCreate();
    }

    public static void charCreate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("==================================================");
        System.out.println("Witaj w grze RPG wybierz swoją klasę z poniższych:");
        System.out.println("==================================================");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("1 - Wojownik - duża siła fizyczna, mała szybkość i niska inteligencja");
        System.out.println("2 - Łucznik - słaba siła, duża zwinność i szybkość i średnia inteligencja");
        System.out.println("3 - Mag - słaba siła, mała szybkość i duża inteligencja");
        int klasaWybor = scanner.nextInt();

        switch (klasaWybor){
            case 1: {
                System.out.println("Podaj imie twojej postaci");
                String charName = scanner.nextLine();
                Postac postac = new Postac(charName,"Wojownik",5,2,1);
                game(postac);
                break;
            }
            case 2: {
                System.out.println("Podaj imie twojej postaci");
                String charName = scanner.nextLine();
                Postac postac = new Postac(charName,"Łucznik",2,5,1);
                game(postac);
                break;
            }
            case 3: {
                System.out.println("Podaj imie twojej postaci");
                String charName = scanner.nextLine();
                Postac postac = new Postac(charName,"Mag",1,2,5);
                game(postac);
                break;
            }
            default: {
                System.out.println("ERROR - BAD NUMBER");
                charCreate();
                break;
            }
        }
    }
    public static void game(Postac postac){
        boolean core = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Opis postaci");
        System.out.println("2 - Lochy");
        System.out.println("3 - Trenuj");
        System.out.println("0 - Exit");
        while (core == true){
            int wybor = scanner.nextInt();
            switch (wybor){

                case 1:{
                    charInfo(postac);
                    System.out.println("napisz 0 aby wyjść");
                    int exit = scanner.nextInt();
                    switch (exit){
                        case 0: {
                            game(postac);
                            break;
                        }
                        default:
                            System.out.println("ERROR - BAD NUMBER");
                            break;
                    }
                }


                case 2:{

                }

                case 3:{
                    train(postac);
                    System.out.println("napisz 0 aby wyjść");
                    int exit = scanner.nextInt();
                        switch (exit){
                            case 0: {
                                game(postac);
                                break;
                            }
                            default:
                                System.out.println("ERROR - BAD NUMBER");
                                break;
                        }

                }

                case 0:{
                    core = false;
                    System.out.println("==========");
                    System.out.println("==========");
                    System.out.println("KONIEC GRY");
                    System.out.println("==========");
                    System.out.println("==========");
                    break;
                }

                default:{
                    System.out.println("ERROR - BAD NUMBER");
                    game(postac);
                    break;
                }
            }
        }
    }

    public static void charInfo(Postac postac){
        System.out.println("Imie: " + postac.getName());
        System.out.println("Klasa: " + postac.getType());
        System.out.println("Siła: " + postac.getPhysicalPower());
        System.out.println("Precyzja: " + postac.getSpeedPower());
        System.out.println("Inteligencja: " + postac.getMagicPower());
    }

    public static void train(Postac postac){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Co chcesz trenować?");
        System.out.println("1 - Walka z kukłą (trening siły)");
        System.out.println("2 - Strzelnica (trening precyzji)");
        System.out.println("3 - Biblioteka (trening intelgencji)");
        int wybor = scanner.nextInt();
        switch (wybor){
            case 1: {
                int random1 = (int)(Math.random()* (10-1) + 1);
                if(random1 == 1){
                    postac.setPhysicalPower(postac.getPhysicalPower()+0);
                    System.out.println("Niestety twój trening nie przyniósł najlepszych rezultatów...");
                }
                else if(random1 >= 2 && random1 <= 7){
                    postac.setPhysicalPower(postac.getPhysicalPower()+1);
                    System.out.println("Trening przebiegł pomyślnie i twoje umiejętności walki są teraz lepsze");
                }
                else if(random1 >= 8 && random1 <= 10){
                    postac.setPhysicalPower(postac.getPhysicalPower()+2);
                    System.out.println("Nauczyłeś się nowej techniki miecza, twoje umiejętności są o wiele lepsze");
                }
                break;
            }

            case 2: {
                int random2 = (int)(Math.random()* (10-1) + 1);
                if(random2 == 1){
                    postac.setSpeedPower(postac.getSpeedPower()+0);
                    System.out.println("Niestety dzisiaj nic nie wyniosłeś z treningu, zero trafionych celów...");
                }
                else if(random2 >= 2 && random2 <= 7){
                    postac.setSpeedPower(postac.getSpeedPower()+1);
                    System.out.println("Gratulacje ustrzeliłeś dzisiaj kilka celów, twoje umiejętności wzrosły");
                }
                else if(random2 >= 8 && random2 <= 10){
                    postac.setSpeedPower(postac.getSpeedPower()+2);
                    System.out.printf("Brawo dzisiaj trafiłeś wszystkie cele w dziesiątkę, twoje umiejętności wzrosły o wiele więcej");
                }
                break;
            }

            case 3: {
                int random3 = (int)(Math.random()* (10-1) + 1);
                if(random3 == 1){
                    postac.setMagicPower(postac.getMagicPower()+0);
                    System.out.println("Twoja dzisiejsza nauka w bibliotece wiele nie wniosła, nie mogłeś się skupić...");
                }
                else if(random3 >= 2 && random3 <= 7){
                    postac.setMagicPower(postac.getMagicPower()+1);
                    System.out.println("Przeczytałeś dzisiaj kilka nowych ksiąg i skryptów, twoja inteligencja wzrosła");
                }
                else if(random3 >= 8 && random3 <= 10){
                    postac.setMagicPower(postac.getMagicPower()+2);
                    System.out.println("Przeczytałeś dzisiaj wiele nowych ksiąg skryptów i manuskryptów, twoja inteligencja znacznie wzrosła");
                }
                break;
            }

            default:
                System.out.println("ERROR - BAD NUMBER");
                train(postac);
                break;
        }
    }

}