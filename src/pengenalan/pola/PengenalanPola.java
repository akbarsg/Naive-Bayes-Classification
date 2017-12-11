/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengenalan.pola;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Akbar
 */
public class PengenalanPola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String dataset = "C:\\Users\\Akbar\\Documents\\Kuliah\\Semester 5\\Pengenalan Pola\\Garapan\\Nursery\\nursery.data.txt";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(dataset))) {

            double data1[][] = new double[9000][8];
            double data2[][] = new double[9000][8];
            double data3[][] = new double[9000][8];
            double data4[][] = new double[9000][8];
            double data5[][] = new double[9000][8];


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
//                    case 1:
//                        br2 = new BufferedReader(new FileReader(tes2));
//                        break;
//                    case 2:
//                        br2 = new BufferedReader(new FileReader(tes3));
//                        break;
//                    case 3:
//                        br2 = new BufferedReader(new FileReader(tes4));
//                        break;
                    default:
                        br2 = new BufferedReader(new FileReader(dataset));
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



            Scanner input = new Scanner(System.in);
            double dataTest[] = new double[8];
            int maxInput[] = {3, 5, 4, 4, 3, 2, 3, 3};
            for (int i = 0; i < 8; i++) {
                System.out.print("Input nilai fitur ke-" + (i+1) + " = ");
                dataTest[i] = input.nextDouble();
                if (dataTest[i] > maxInput[i] || dataTest[i] < 1) {
                    System.out.println("Nilai melebihi batas fitur. Coba masukkan kembali.");
                    i--;
                }
                
                
            }
            
            double likelihood[][] = new double[5][8];

            double count;
            //System.out.println("");
            //System.out.println(data2[0][1] +","+ data2[33][1] +","+ data2[33][2] +","+ data2[33][3] +","+ data2[33][4] +","+ data2[33][5] +","+ data2[33][6] +","+ data2[33][7]);
            for (int i = 0; i < 5; i++) {   //kelas
                for (int j = 0; j < 8; j++) {   //fitur
                    count = 0;
                    switch (i) {
                        case 0:
                            //kelas pertama
                            for (int k = 0; k < count1; k++) {    
                                if (data1[k][j] == dataTest[j]) {
                                    count++;
                                }
                            }
                            likelihood[i][j] = count / count1;
                            break;
                        case 1:
                            for (int k = 0; k < count2; k++) {    
                                if (data2[k][j] == dataTest[j]) {
                                    count++;
                                }
                            }
                            likelihood[i][j] = count / count2;
                            break;
                        case 2:
                            for (int k = 0; k < count3; k++) {    
                                if (data3[k][j] == dataTest[j]) {
                                    count++;
                                }
                            }
                            likelihood[i][j] = count / count3;
                            break;
                        case 3:
                            for (int k = 0; k < count4; k++) {    
                                if (data4[k][j] == dataTest[j]) {
                                    count++;
                                }
                            }
                            likelihood[i][j] = count / count4;
                            break;
                        case 4:
                            for (int k = 0; k < count5; k++) {    
                                if (data5[k][j] == dataTest[j]) {
                                    count++;
                                }
                            }
                            likelihood[i][j] = count / count5;
                            break;
                        default:
                            break;
                    }
                }
            }
            
            System.out.println("");
            System.out.println("----------------DAFTAR KELAS----------------");
            System.out.println("1. Acceptance is not recommended");
            System.out.println("2. Acceptance is recommended");
            System.out.println("3. Acceptance is very much recommended");
            System.out.println("4. Priority acceptance is recommended");
            System.out.println("5. Special priority acceptance is recommended");
            System.out.println("---------------------------------------------");

            // tahap 3
            double pIn[] = new double[5];
            System.out.println("");
            System.out.println("HASIL KELAS");
            
            double prior[] = new double[5];
            double total = count1+count2+count3+count4+count5;
            prior[0] = count1 / total;
            prior[1] = count2 / total;
            prior[2] = count3 / total;
            prior[3] = count4 / total;
            prior[4] = count5 / total;
            
            
            for (int i = 0; i < 5; i++) {
                pIn[i] = 1;
                for (int j = 0; j < 8; j++) {
                    pIn[i] *= likelihood[i][j];
                }
                pIn[i] *= prior[i];
                System.out.println("Kelas " + (i+1) + " = " + pIn[i]);
            }
            System.out.println("");
            if(pIn[0] > pIn[1] && pIn[0] > pIn[2] && pIn[0] > pIn[3] && pIn[0] > pIn[4]){
                System.out.println("Kelas 1 (acceptance is not recommended)");
            } else if (pIn[1] > pIn[0] && pIn[1] > pIn[2] && pIn[1] > pIn[3] && pIn[1] > pIn[4]) {
                System.out.println("Kelas 2 : acceptance is recommended");
            } else if (pIn[2] > pIn[0] && pIn[2] > pIn[1] && pIn[2] > pIn[3] && pIn[2] > pIn[4]) {
                System.out.println("Kelas 3 : acceptance is very much recommended");
            } else if (pIn[3] > pIn[0] && pIn[3] > pIn[1] && pIn[3] > pIn[2] && pIn[3] > pIn[4]) {
                System.out.println("Kelas 4 : priority acceptance is recommended");
            } else if (pIn[4] > pIn[0] && pIn[4] > pIn[1] && pIn[4] > pIn[2] && pIn[4] > pIn[3]) {
                System.out.println("Kelas 5 : special priority acceptance is recommended");
            } else {
                System.out.println("Terdapat nilai yang sama.");
            }
            

            //tahap 4
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
