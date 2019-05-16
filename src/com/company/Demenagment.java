package com.company;

import java.lang.*;

public class Demenagment {


    private int nbCar;
    private int capaCam1;
    private int capaCam2;
    private int capaCam3;
    private int nbMove;
    private int a;
    private int c;



    /**
     * Constructor
     */
    public Demenagment(){
        nbCar =250;
        capaCam1=5;
        capaCam2=7;
        capaCam3=9;
        nbMove=0;
        a=0;
        c=0;
    }

    /**
     *
     * Constructor Overloaded
     *
     */
    public Demenagment(int nbcart ){
        nbCar = nbcart;
        capaCam1=5;
        capaCam2=7;
        capaCam3=9;
        nbMove=0;
        a=0;
        c=0;
    }


    /**
     * Constructor Overloaded
     */
    public Demenagment(int nbcart,int capa1 ,int capa2, int capa3){
        nbCar =nbcart;
        capaCam1=capa1;
        capaCam2=capa2;
        capaCam3=capa3;
        nbMove=0;
        a=0;
        c=0;
    }


    private void init (){

    }
    /**
     *
     * @return
     */
    public int getNbCar() {
        return nbCar;
    }
    /**
     *
     * @return
     */
    public String hello(){
        return "happy déménagement !!!";
    }


    private String calculateBoxPerMove(){
        return "";
    }

    /**
     *
     * @return String    message final nb carton et de voyage.
     */
    public String DoDem() {

        int nbcarTemp = nbCar;
        int aTemp = a;
        int cTemp = c;
        int capa1Temp = capaCam1 ;
        int capa2Temp = capaCam2 ;
        int capa3Temp = capaCam2 ;
        int nbMoveTemp = nbMove;

        while (nbcarTemp>0)
        {
            aTemp = nbcarTemp;
            {
                nbcarTemp = movCar(nbcarTemp,capa1Temp);
            }
            if (nbcarTemp>0)
            {
                nbcarTemp = movCar(nbcarTemp,capa2Temp);
            }
            if (nbcarTemp>0)
            {
                nbcarTemp = movCar(nbcarTemp,capa3Temp);
            }
            cTemp = nbcarTemp;

           System.out.println("voyage " + nbMoveTemp +" de " + (aTemp - cTemp) + " cartons");
            nbMoveTemp++;
        }

       return "nombre de voyage " + nbMoveTemp;
    }


    /**
     *  renvoie
     * @param nbCar
     * @param capaCam
     * @return
     */
    private int movCar(int nbCar,int capaCam ){
        if (nbCar>=capaCam)
        {
            return nbCar-capaCam;
        }
        else
        {
            return nbCar-nbCar;
        }

    }
}


