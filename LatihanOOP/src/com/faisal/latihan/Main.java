package com.faisal.latihan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Patient patient = new Patient("Faisal", "23",
                new Eyes("Eyes", "normal","brown", true),
                new Heart("Heart", "normal", 90),
                new Skin("Skin", "normal", "white", 40),
                new Stomatch("Stomatch", "normal", false)
                );

        boolean isFinish = false;

        while (!isFinish) {
            System.out.println("Selamat Datang di Aplikasi Cek Kesehatan");
            System.out.println("Nama : " + patient.getName());
            System.out.println("Umur  : " + patient.getAge());
            System.out.println("Pilih Organ : \n" +
                    "\t\t1. Mata\n" +
                    "\t\t2. Jantung\n" +
                    "\t\t3. Kulit\n" +
                    "\t\t4. Perut\n" +
                    "\t\t5. Keluar\n");
            System.out.print("Pilihan anda : ");
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1 :
                    boolean isQuit = false;
                    System.out.println();
                    patient.getEyes().getDetail();

                    while (!isQuit) {
                        if (patient.getEyes().isOpen() == true) {
                            System.out.println("1. Tutup Mata");
                            System.out.println("2. Keluar");
                            int isClose = scanner.nextInt();

                            if (isClose == 1) {
                                patient.getEyes().setOpen(false);
                                patient.getEyes().eyesDetail();
                            } else if(isClose == 2) {
                                isQuit = true;
                            } else {
                                System.err.println("Anda memsukan pilihan yang salah");
                            }
                        } else {
                            System.out.println("1. Buka mata");
                            System.out.println("2. Keluar");
                            int isClose = scanner.nextInt();

                            if (isClose == 1) {
                                patient.getEyes().setOpen(true);
                                patient.getEyes().eyesDetail();
                            } else if(isClose == 2) {
                                isQuit = true;
                            } else {
                                System.err.println("Anda memsukan pilihan yang salah");
                            }
                        }
                    }
                    break;
                case 2 :
                    boolean isContinue = true;
                    while(isContinue) {
                        System.out.println("Jantung");
                        patient.getHeart().getDetail();
                        System.out.println("\t\t1.Ubah Detak jantung");
                        System.out.println("\t\t2.Keluar");
                        int isChange = scanner.nextInt();

                        if(isChange == 1) {
                            System.out.print("Masukan detak jantung : ");
                            int hRate = scanner.nextInt();
                            patient.getHeart().setRate(hRate);
                        } else {
                            isContinue = false;
                        }
                    }
                    break;
                case 3 :
                    System.out.println("Kulit");
                    boolean isKulit =  false;

                    while (!isKulit) {
                        patient.getSkin().getDetail();
                        System.out.println("\t\t1. Ubah warna");
                        System.out.println("\t\t2. Ubah Kelembutan");
                        System.out.println("\t\t3. keluar");
                        int kulitInput = scanner.nextInt();

                        switch (kulitInput) {
                            case 1 :
                                System.out.print("Masukan warna : ");
                                String color = scanner.next();
                                patient.getSkin().setColor(color);
                                break;
                            case 2 :
                                System.out.print("Masukan kelembutan : ");
                                int softness = scanner.nextInt();
                                patient.getSkin().setSoftness(softness);
                                break;
                            case 3 :
                                isKulit = true;
                                break;
                            default:
                                System.err.println("Anda memasukan input yang salah !");
                        }
                    }

                    break;
                case 4 :
                    System.out.println("Perut");
                    break;
                case 5 :
                    isFinish = true;
                    break;
                default:
                    System.err.println("Anda memasukan pilihan yang salah !");
            }
        }
    }
}
