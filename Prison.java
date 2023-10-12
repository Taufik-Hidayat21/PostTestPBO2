/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prison;
import Prisoners.Prisoner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

final class Prison {
    private static final List<Prisoner> prisonerListMan = new ArrayList<>();
    private static final List<Prisoner> prisonerListWoman = new ArrayList<>();

    public final static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add new Prisoner");
            System.out.println("2. List of Prisoner");
            System.out.println("3. Update Prisoner");
            System.out.println("4. Delete Prisoner");
            System.out.println("5. Exit");
            System.out.print("Select Menu: ");

            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.print("Insert Prisoner Name: ");
                    String insertName = scanner.nextLine();
                    System.out.print("Insert Prisoner Gender: ");
                    String insertGender = scanner.nextLine();
                    System.out.print("Insert Prisoner Number: ");
                    Integer insertNoPrisoner = Integer.valueOf(scanner.nextLine());
                    System.out.print("Insert Prisoner Age: ");
                    Integer insertAge = Integer.valueOf(scanner.nextLine());
                    Prisoner newPrisoner = new Prisoner(insertNoPrisoner, insertName, insertGender, insertAge);
                    if (null == insertGender) {
                        System.out.println("Choose between Man and Woman");
                    } else switch (insertGender) {
                    case "Man":
                        prisonerListMan.add(newPrisoner);
                        break;
                    case "Woman":
                        prisonerListWoman.add(newPrisoner);
                        break;
                    default:
                        System.out.println("Choose between Man and Woman");
                        break;
                    }
                    break;


                case "2":
                    System.out.print("Select Gender (Man/Woman): ");
                    String insertListRead = scanner.nextLine();
                    if (null == insertListRead) {
                        System.out.println("Choose between Man and Woman");
                    } else switch (insertListRead) {
                    case "Man":
                        if (prisonerListMan.isEmpty()) {
                            System.out.println("There's no prisoners");
                        } else {
                            System.out.println("List of Prisoners:");
                            for (Prisoner prisoner : prisonerListMan) {
                                System.out.println("No: " + prisoner.getNoPrisoner());
                                System.out.println("Name: " + prisoner.getName());
                                System.out.println("Gender: " + prisoner.getGender());
                                System.out.println("Age: " + prisoner.getAge());
                                System.out.println("-------------------");
                            }
                        }
                        break;
                    case "Woman":
                        if (prisonerListWoman.isEmpty()) {
                            System.out.println("There's no prisoners");
                        } else {
                            System.out.println("List of Prisoners:");
                            for (Prisoner prisoner : prisonerListWoman) {
                                System.out.println("No: " + prisoner.getNoPrisoner());
                                System.out.println("Name: " + prisoner.getName());
                                System.out.println("Gender: " + prisoner.getGender());
                                System.out.println("Age: " + prisoner.getAge());
                                System.out.println("-------------------");
                            }
                        }
                        break;
                    default:
                        System.out.println("Choose between Man and Woman");
                        break;
                }
                    break;


                case "3":
                    System.out.print("Select Gender (Man/Woman): ");
                    String insertListUpdate = scanner.nextLine();
                    if (null == insertListUpdate) {
                        System.out.println("Choose between Man and Woman");
                    } else switch (insertListUpdate) {
                    case "Man":
                        {
                            System.out.print("Insert Prisoner Number: ");
                            Integer getPrisonerNo = Integer.valueOf(scanner.nextLine());
                            System.out.print("Insert New Prisoner Age: ");
                            Integer newAge = Integer.valueOf(scanner.nextLine());
                            boolean findMan = false;
                            for (Prisoner prisoner : prisonerListMan) {
                                if (prisoner.getNoPrisoner().equals(getPrisonerNo)) {
                                    prisoner.setAge(newAge);
                                    findMan = true;
                                    break;
                                }
                            }   if (!findMan) {
                                System.out.println("Prisoner not found");
                            }   break;
                        }
                    case "Woman":
                        {
                            System.out.print("Insert Prisoner Number: ");
                            Integer getPrisonerNo = Integer.valueOf(scanner.nextLine());
                            System.out.print("Insert New Prisoner Age: ");
                            Integer newAge = Integer.valueOf(scanner.nextLine());
                            boolean findWoman = false;
                            for (Prisoner prisoner : prisonerListWoman) {
                                if (prisoner.getNoPrisoner().equals(getPrisonerNo)) {
                                    prisoner.setAge(newAge);
                                    findWoman = true;
                                    break;
                                }
                            }   if (!findWoman) {
                                System.out.println("Prisoner not found");
                            }   break;
                        }
                    default:
                        System.out.println("Choose between Man and Woman");
                        break;
                }
                    break;


                case "4":
                    System.out.print("Select Gender (Man/Woman): ");
                    String insertListDelete = scanner.nextLine();
                    if (null == insertListDelete) {
                        System.out.println("Choose between Man and Woman");
                    } else switch (insertListDelete) {
                    case "Man":
                        {
                            System.out.print("Insert Prisoner Number to Delete: ");
                            Integer deletePrisoner = Integer.valueOf(scanner.nextLine());
                            boolean foundDelete = false;
                            Iterator<Prisoner> iterator = prisonerListMan.iterator();
                            while (iterator.hasNext()) {
                                Prisoner prisoner = iterator.next();
                                if (prisoner.getNoPrisoner().equals(deletePrisoner)) {
                                    iterator.remove();
                                    foundDelete = true;
                                    break;
                                }
                            }   if (!foundDelete) {
                                System.out.println("Prisoner not found");
                            }   break;
                        }
                    case "Woman":
                        {
                            System.out.print("Insert Prisoner Number to Delete: ");
                            Integer deletePrisoner = Integer.valueOf(scanner.nextLine());
                            boolean foundDelete = false;
                            Iterator<Prisoner> iterator = prisonerListWoman.iterator();
                            while (iterator.hasNext()) {
                                Prisoner prisoner = iterator.next();
                                if (prisoner.getNoPrisoner().equals(deletePrisoner)) {
                                    iterator.remove();
                                    foundDelete = true;
                                    break;
                                }
                            }   if (!foundDelete) {
                                System.out.println("Prisoner not found");
                            }   break;
                        }
                    default:
                        System.out.println("Choose between Man and Woman");
                        break;
                }
                    break;


                case "5":
                    System.out.println("Thanks For Using This Code!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Choice invalid, pick again");
            }
        }
    }
}