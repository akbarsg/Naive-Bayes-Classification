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
public class PengenalanPola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tes1 = "C:\\Users\\Akbar\\Documents\\Kuliah\\Semester 5\\Pengenalan Pola\\Garapan\\Nursery\\tes1.txt";
        String tes2 = "C:\\Users\\Akbar\\Documents\\Kuliah\\Semester 5\\Pengenalan Pola\\Garapan\\Nursery\\tes2.txt";
        String tes3 = "C:\\Users\\Akbar\\Documents\\Kuliah\\Semester 5\\Pengenalan Pola\\Garapan\\Nursery\\tes3.txt";
        String tes4 = "C:\\Users\\Akbar\\Documents\\Kuliah\\Semester 5\\Pengenalan Pola\\Garapan\\Nursery\\tes4.txt";
        String tes5 = "C:\\Users\\Akbar\\Documents\\Kuliah\\Semester 5\\Pengenalan Pola\\Garapan\\Nursery\\tes5.txt";
        String dataset = "C:\\Users\\Akbar\\Documents\\Kuliah\\Semester 5\\Pengenalan Pola\\Garapan\\Nursery\\nursery.data.txt";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(tes1))) {

            double data1[][] = new double[9000][8];
            double data2[][] = new double[9000][8];
            double data3[][] = new double[9000][8];
            double data4[][] = new double[9000][8];
            double data5[][] = new double[9000][8];

            double datasetAngka[][] = new double[12960][9];

            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int count4 = 0;
            int count5 = 0;

            for (int j = 0; j < 1; j++) {   //EDIT
                BufferedReader br2;
                switch (j) {
                    case 0:
                        br2 = new BufferedReader(new FileReader(dataset));
                        break;
                    case 1:
                        br2 = new BufferedReader(new FileReader(tes2));
                        break;
                    case 2:
                        br2 = new BufferedReader(new FileReader(tes3));
                        break;
                    case 3:
                        br2 = new BufferedReader(new FileReader(tes4));
                        break;
                    default:
                        br2 = new BufferedReader(new FileReader(tes5));
                        break;
                }

                while ((line = br2.readLine()) != null) {

                    // use comma as separator
                    String[] temp = line.split(cvsSplitBy);
                    for (int i = 0; i < 9; i++) {
                        switch (i) {
                            case 0:
                                if (null != temp[i]) {
                                    switch (temp[i]) {
                                        case "usual":
                                            temp[i] = "1";
                                            break;
                                        case "pretentious":
                                            temp[i] = "2";
                                            break;
                                        default:
                                            temp[i] = "3";
                                            break;
                                    }
                                }
                                break;
                            case 1:
                                if (null != temp[i]) {
                                    switch (temp[i]) {
                                        case "proper":
                                            temp[i] = "1";
                                            break;
                                        case "less_proper":
                                            temp[i] = "2";
                                            break;
                                        case "improper":
                                            temp[i] = "3";
                                            break;
                                        case "critical":
                                            temp[i] = "4";
                                            break;
                                        default:
                                            temp[i] = "5";
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                if (null != temp[i]) {
                                    switch (temp[i]) {
                                        case "complete":
                                            temp[i] = "1";
                                            break;
                                        case "completed":
                                            temp[i] = "2";
                                            break;
                                        case "incomplete":
                                            temp[i] = "3";
                                            break;
                                        default:
                                            temp[i] = "4";
                                            break;
                                    }
                                }
                                break;
                            case 3:
                                if ("more".equals(temp[i])) {
                                    temp[i] = "4";
                                }
                                break;
                            case 4:
                                if (null != temp[i]) {
                                    switch (temp[i]) {
                                        case "convenient":
                                            temp[i] = "1";
                                            break;
                                        case "less_conv":
                                            temp[i] = "2";
                                            break;
                                        default:
                                            temp[i] = "3";
                                            break;
                                    }
                                }
                                break;
                            case 5:
                                if (null != temp[i]) {
                                    switch (temp[i]) {
                                        case "convenient":
                                            temp[i] = "1";
                                            break;
                                        default:
                                            temp[i] = "2";
                                            break;
                                    }
                                }
                                break;
                            case 6:
                                if (null != temp[i]) {
                                    switch (temp[i]) {
                                        case "nonprob":
                                            temp[i] = "1";
                                            break;
                                        case "slightly_prob":
                                            temp[i] = "2";
                                            break;
                                        default:
                                            temp[i] = "3";
                                            break;
                                    }
                                }
                                break;
                            case 7:
                                if (null != temp[i]) {
                                    switch (temp[i]) {
                                        case "not_recom":
                                            temp[i] = "1";
                                            break;
                                        case "recommended":
                                            temp[i] = "2";
                                            break;
                                        default:
                                            temp[i] = "3";
                                            break;
                                    }
                                }
                                break;
                            case 8:
                                if (null != temp[i]) {
                                    switch (temp[i]) {
                                        case "not_recom":
                                            temp[i] = "1";
                                            break;
                                        case "recommend":
                                            temp[i] = "2";
                                            break;
                                        case "very_recom":
                                            temp[i] = "3";
                                            break;
                                        case "priority":
                                            temp[i] = "4";
                                            break;
                                        default:
                                            temp[i] = "5";
                                            break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
//                        if (i != 8) {
//                            switch (j) {
//                                case 0:
//                                    System.out.print(temp[i]);
//                                    data1[count1][i] = Double.parseDouble(temp[i]);
//                                    break;
//                                case 1:
//                                    data2[count2][i] = Double.parseDouble(temp[i]);
//                                    break;
//                                case 2:
//                                    data3[count3][i] = Double.parseDouble(temp[i]);
//                                    break;
//                                case 3:
//                                    data4[count4][i] = Double.parseDouble(temp[i]);
//                                    break;
//                                default:
//                                    data5[count5][i] = Double.parseDouble(temp[i]);
//                                    break;
//                            }
//                        }

                        //System.out.println(data3[countLine][i]);
                    }
                    
                    switch (temp[8]) {
                        case "1":
                            
                            for (int i = 0; i < 8; i++) {
                                data1[count1][i] = Double.parseDouble(temp[i]);
                            }
                            count1++;
                            break;
                        case "2":
                            for (int i = 0; i < 8; i++) {
                                data2[count2][i] = Double.parseDouble(temp[i]);
                            }
                            count2++;
                            break;
                        case "3":
                            for (int i = 0; i < 8; i++) {
                                data3[count3][i] = Double.parseDouble(temp[i]);
                            }
                            count3++;
                            break;
                        case "4":
                            for (int i = 0; i < 8; i++) {
                                data4[count4][i] = Double.parseDouble(temp[i]);
                            }
                            count4++;
                            break;
                        default:
                            for (int i = 0; i < 8; i++) {
                                data5[count5][i] = Double.parseDouble(temp[i]);
                            }
                            count5++;
                            break;
                    }

                }
            }

//            try (BufferedReader br4 = new BufferedReader(new FileReader(tes4))) {
//                while ((line = br4.readLine()) != null) {
//
//                    // use comma as separator
//                    String[] temp = line.split(cvsSplitBy);
//                    for (int i = 0; i < 8; i++) {
//                        data4[count4][i] = Double.parseDouble(temp[i]);
//                        //System.out.println(data4[countLine][i]);
//                    }
//                    count4++;
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try (BufferedReader br5 = new BufferedReader(new FileReader(tes5))) {
//                while ((line = br5.readLine()) != null) {
//
//                    // use comma as separator
//                    String[] temp = line.split(cvsSplitBy);
//                    for (int i = 0; i < 8; i++) {
//                        data5[count5][i] = Double.parseDouble(temp[i]);
//                        //System.out.println(data4[countLine][i]);
//                    }
//                    count5++;
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
            //double p3, p4, p5;
            double dataTest[] = {1, 4, 1, 4, 3, 2, 3, 2};
            double dataTestinClass[][] = new double[5][8];

            //p3 = (double) data3.length / (data3.length + data4.length + data5.length);
            //p4 = (double) data4.length / (data3.length + data4.length + data5.length);
            //p5 = (double) data5.length / (data3.length + data4.length + data5.length);
            //System.out.println(p4);
            double count;
            System.out.println("");
            System.out.println(data2[0][1] +","+ data2[33][1] +","+ data2[33][2] +","+ data2[33][3] +","+ data2[33][4] +","+ data2[33][5] +","+ data2[33][6] +","+ data2[33][7]);
            for (int i = 0; i < 5; i++) {   //kelas
                //System.out.println("for " + i);
                for (int j = 0; j < 8; j++) {   //fitur
                    //System.out.println("for " + j);
                    count = 0;
                    switch (i) {
                        case 0:
                            //kelas pertama
                            for (int k = 0; k < count1; k++) {    //data pertama
                                if (data1[k][j] == dataTest[j]) {
                                    count++;
                                }
                            }
                            dataTestinClass[i][j] = count / count1;
                            System.out.println(dataTestinClass[i][j]);
                            break;
                        //System.out.println(count + "dibagi" + data4.length);
                        //System.out.println(dataTestinClass[i][j]);
                        case 1:
                            for (int k = 0; k < count2; k++) {    //data pertama
                                if (data2[k][j] == dataTest[j]) {
                                    count++;
                                }
                            }
                            dataTestinClass[i][j] = count / count2;
                            System.out.println(dataTestinClass[i][j]);
                            break;
                        case 2:
                            for (int k = 0; k < count3; k++) {    //data pertama
                                if (data3[k][j] == dataTest[j]) {
                                    count++;
                                }
                            }
                            dataTestinClass[i][j] = count / count3;
                            System.out.println(dataTestinClass[i][j]);
                            break;
                        case 3:
                            for (int k = 0; k < count4; k++) {    //data pertama
                                if (data4[k][j] == dataTest[j]) {
                                    count++;
                                }
                            }
                            dataTestinClass[i][j] = count / count4;
                            System.out.println(dataTestinClass[i][j]);
                            break;
                        case 4:
                            for (int k = 0; k < count5; k++) {    //data pertama
                                if (data5[k][j] == dataTest[j]) {
                                    count++;
                                }
                            }
                            dataTestinClass[i][j] = count / count5;
                            System.out.println(dataTestinClass[i][j]);
                            break;
                        default:
                            break;
                    }
                }
            }

            // tahap 3
            double pIn[] = new double[5];
            for (int i = 0; i < 5; i++) {
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
