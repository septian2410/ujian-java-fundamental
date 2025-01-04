// SOAL NO.1 Progran Base Coverage (Aritmatika)
package com.juaracoding.psujian1jf.ujian1;
import java.util.Scanner;

public class BaseCoverage {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int cmy40ml = 7500;
            int k = 4500;
            int constantBaseCoverage = 5;      // 5%
            int price = 216860;

            System.out.println("## Progran Base Coverage ##");
            System.out.println("Botol 40ML CMY              = " + cmy40ml +" hal");
            System.out.println("Botol 40ML K                = " + k +" hal");
            System.out.println("Based Coverage (constant)   = " + constantBaseCoverage +"%");

            // Input baseCoverage
            System.err.print("MASUKKAN BaseCoverage       : ");               // baseCoverage (sesuai permintaan customer)
            int baseCoverage = input.nextInt();

            int resultBaseCoverage = baseCoverage / constantBaseCoverage;
            int cmyk = (cmy40ml + k) / 2;
            int pageDiv = cmyk / resultBaseCoverage;
            int totalCount = price / pageDiv;

            // Output
            System.out.println("\n## Data Akhir ##");
            System.out.println("Based Coverage (Request)    = " + baseCoverage +"%");
            System.out.println("------------------------------------------------");
            System.out.println("Total                       = Rp." + totalCount+"/pages");

            input.close();
        }
    }

// cmyk = 6000
// total = price / (cmyk / resultBaseCoverage)

// Test Case 0 (10%)    = 216860 / (6000 / 2 )  = 72/pages
// Test Case 1 (30%)    = 216860 / (6000 / 6 )  = 216/pages
// Test Case 2 (80%)    = 216860 / (6000 / 16 ) = 578/pages


