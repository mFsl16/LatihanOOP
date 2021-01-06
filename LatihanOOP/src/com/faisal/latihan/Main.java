package com.faisal.latihan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Patient patient = new Patient("Faisal", "23",
                new Eyes("Eyes", "normal","brown", true),
                new Heart("Heart", "normal", 16),
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
                                patient.getEyes().setOpen(false);
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
                    System.out.println("Jantung");
                    break;
                case 3 :
                    System.out.println("Kulit");
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
