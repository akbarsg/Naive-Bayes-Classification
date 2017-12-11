/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengenalan.pola;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Akbar
 */
public class BreastCancer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tes3 = "C:\\Users\\Akbar\\Documents\\Kuliah\\Semester 5\\Pengenalan Pola\\Garapan\\Nursery\\tes3.txt";
        String tes4 = "C:\\Users\\Akbar\\Documents\\Kuliah\\Semester 5\\Pengenalan Pola\\Garapan\\Nursery\\tes4.txt";
        String tes5 = "C:\\Users\\Akbar\\Documents\\Kuliah\\Semester 5\\Pengenalan Pola\\Garapan\\Nursery\\tes5.txt";
        String dataset = "C:\\Users\\Akbar\\Documents\\Kuliah\\Semester 5\\Pengenalan Pola\\Garapan\\Nursery\\nursery.data.txt";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(tes3))) {

            double data3[][] = new double[2][8];
            double data4[][] = new double[5][8];
            double data5[][] = new double[2][8];

            int countLine = 0;

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] temp = line.split(cvsSplitBy);
                for (int i = 0; i < 8; i++) {
                    data3[countLine][i] = Double.parseDouble(temp[i]);
                    //System.out.println(data3[countLine][i]);
                }
                countLine++;
            }
            countLine = 0;
            try (BufferedReader br4 = new BufferedReader(new FileReader(tes4))) {
                while ((line = br4.readLine()) != null) {

                    // use comma as separator
                    String[] temp = line.split(cvsSplitBy);
                    for (int i = 0; i < 8; i++) {
                        data4[countLine][i] = Double.parseDouble(temp[i]);
                        //System.out.println(data4[countLine][i]);
                    }
                    countLine++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            countLine = 0;
            try (BufferedReader br5 = new BufferedReader(new FileReader(tes5))) {
                while ((line = br5.readLine()) != null) {

                    // use comma as separator
                    String[] temp = line.split(cvsSplitBy);
                    for (int i = 0; i < 8; i++) {
                        data5[countLine][i] = Double.parseDouble(temp[i]);
                        //System.out.println(data4[countLine][i]);
                    }
                    countLine++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            double p3, p4, p5;

            double dataTest[] = {1, 4, 1, 4, 3, 2, 3, 2};
            double dataTestinClass[][] = new double[3][8];

//            data5[0][0] = 1;
//            data5[0][1] = 4;
//            data5[0][2] = 1;
//            data5[0][3] = 4;
//            data5[0][4] = 3;
//            data5[0][5] = 2;
//            data5[0][6] = 3;
//            data5[0][7] = 2;
//            
//            data4[0][0] = 1;
//            data4[0][1] = 3;
//            data4[0][2] = 3;
//            data4[0][3] = 3;
//            data4[0][4] = 1;
//            data4[0][5] = 2;
//            data4[0][6] = 2;
//            data4[0][7] = 2;
//            data4[1][0] = 1;
//            data4[1][1] = 3;
//            data4[1][2] = 3;
//            data4[1][3] = 3;
//            data4[1][4] = 1;
//            data4[1][5] = 2;
//            data4[1][6] = 2;
//            data4[1][7] = 2;
            p3 = (double) data3.length / (data3.length + data4.length + data5.length);
            p4 = (double) data4.length / (data3.length + data4.length + data5.length);
            p5 = (double) data5.length / (data3.length + data4.length + data5.length);

            System.out.println(p4);

            double count;

            for (int i = 0; i < 3; i++) {   //kelas
                //System.out.println("for " + i);
                for (int j = 0; j < 8; j++) {   //fitur
                    //System.out.println("for " + j);
                    count = 0;
                    if (i == 0) {   //kelas pertama

                        for (int k = 0; k < data3.length; k++) {    //data pertama
                            if (data3[k][j] == dataTest[j]) {
                                count++;
                            }
                        }
                        dataTestinClass[i][j] = count / data3.length;
                    } else if (i == 1) {
                        for (int k = 0; k < data4.length; k++) {    //data pertama
                            if (data4[k][j] == dataTest[j]) {
                                count++;
                            }
                        }
                        dataTestinClass[i][j] = count / data4.length;
                    } else if (i == 2) {
                        for (int k = 0; k < data5.length; k++) {    //data pertama
                            if (data5[k][j] == dataTest[j]) {
                                count++;
                            }
                        }
                        dataTestinClass[i][j] = count / data5.length;
                    }
                    //System.out.println(count + "dibagi" + data4.length);
                    //System.out.println(dataTestinClass[i][j]);
                }
            }

            // tahap 3
            double pIn[] = new double[3];
            for (int i = 0; i < 3; i++) {
                pIn[i] = 1;
                for (int j = 0; j < 8; j++) {
                    pIn[i] *= dataTestinClass[i][j];
                }
                System.out.println("pin = " + pIn[i]);
            }

            //tahap 4
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
