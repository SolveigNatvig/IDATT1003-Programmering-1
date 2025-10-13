package Oving6;

import java.util.ArrayList;
//import java.util.stream.IntStream;


class Matrix{
    private ArrayList<ArrayList<Double>> matrixList = new ArrayList<ArrayList<Double>>();

    public Matrix (ArrayList<ArrayList<Double>> matrixList) {
        this.matrixList = matrixList;
    }

    public void printMatrix(){
        System.out.println("");
        for (int i = 0; i < this.matrixList.size(); i++){
            String lineForPrint = "";
            for (int j = 0; j < this.matrixList.size(); j++){
                lineForPrint += "  " + this.matrixList.get(i).get(j);
            }
            System.out.println(lineForPrint);
        }
        System.out.println("");
    }

    public ArrayList<ArrayList<Double>> additionMatrix(Matrix other){

        for (int i = 0; i < this.matrixList.size(); i++){
            for (int j = 0; j < this.matrixList.size(); j++){
                double newValue = this.matrixList.get(i).get(j) + other.matrixList.get(i).get(j);
                this.matrixList.get(i).set(j, newValue);
            }
        }
        return this.matrixList;
    }

    public ArrayList<ArrayList<Double>> multiplicationMatrix(Matrix other){ 
        ArrayList<ArrayList<Double>> mult = new ArrayList<ArrayList<Double>>();
        ArrayList<Double> multRow1 = new ArrayList<Double>();
        ArrayList<Double> multRow2 = new ArrayList<Double>();

        mult.add(multRow1);
        mult.add(multRow2);

        for (int i = 0; i < matrixList.size(); i++){
            for (int k = 0; k < this.matrixList.size(); k++){
                double newValue = 0.0;
                for (int j = 0; j < this.matrixList.size(); j++){
                    if (i == 1 && k == 0){
                        newValue = newValue + this.matrixList.get(i).get(j) * other.matrixList.get(j).get(k);
                    }
                    else if (k == 1){
                        newValue = newValue + this.matrixList.get(i).get(j) * other.matrixList.get(j).get(k);
                    }
                    else if (i == 0){
                        newValue = newValue + this.matrixList.get(k).get(j) * other.matrixList.get(j).get(k);
                    }
                    //System.out.println(i + " " + k + " " + j);
                    //System.out.println(newValue);
                }
            
                if (i == 0){
                    multRow1.add(newValue);
                }
                else if (i == 1){
                    multRow2.add(newValue);
                }
            }
        }
        this.matrixList = mult;
        return mult;
    }


    public ArrayList<ArrayList<Double>> transposeMatrix(){
        double newValue1 = 0.0;
        double newValue2 = 0.0;

        for (int i = 0; i < this.matrixList.size(); i++){
            for (int j = 0; j < this.matrixList.size(); j++){
                if (i == 0 && j == 1){
                    newValue1 = this.matrixList.get(j).get(i);
                }
                else if (i == 1 && j == 0){
                    newValue2 = this.matrixList.get(j).get(i);
                }
            }
        }

        for (int i = 0; i < this.matrixList.size(); i++){
            for (int j = 0; j < this.matrixList.size(); j++){
                if (i == 0 && j == 1){
                    this.matrixList.get(i).set(j, newValue1);
                }
                else if (i == 1 && j == 0){
                    this.matrixList.get(i).set(j, newValue2);
                }
            }
        }
        return this.matrixList;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Double>> matrixListe = new ArrayList<ArrayList<Double>>();
        Matrix matrix = new Matrix(matrixListe);
        ArrayList<Double> matrixListe1 = new ArrayList<Double>();
        ArrayList<Double> matrixListe2 = new ArrayList<Double>();

        matrixListe1.add((double)1);
        matrixListe1.add((double)2);

        matrixListe2.add((double)3);
        matrixListe2.add((double)3);
        
        matrixListe.add(matrixListe1);
        matrixListe.add(matrixListe2);
        
        System.out.println("This is our matrix: ");
        matrix.printMatrix();

        System.out.println("Addition: ");
        matrix.additionMatrix(matrix);
        matrix.printMatrix();
        
        System.out.println("Multiplication: ");
        matrix.multiplicationMatrix(matrix);
        matrix.printMatrix();

        System.out.println("Transpose: ");
        matrix.transposeMatrix();
        matrix.printMatrix();
        
    }
}