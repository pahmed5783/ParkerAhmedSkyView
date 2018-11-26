package com.company;

public class SkyView {

    private double view [][];

    public SkyView (int numRows, int numCols, double[] scanned) {
        view = new double[numRows][numCols];
        int idx = 0;
        for (int i = 0; i < numRows; i++) {
            if (i % 2 == 0) {
                for (int x = 0; x < numCols; x++) {
                    view[i][x] = scanned[idx];
                    idx++;
                }
            } else {
                for (int x = numCols - 1; x >= 0; x--){
                    view[i][x] = scanned[idx];
                }
            }
        }
    }

    public double getAverage (int startRow , int endRow , int startCol, int endCol){
        double sum = 0.0;
        int numIdx = 0;
        for (int i = startRow; i < endRow; i++){
            for (int x = startCol; x < endCol; x++){
                sum+= view[i][x];
            }
        }
        return (sum/numIdx);
    }
}
