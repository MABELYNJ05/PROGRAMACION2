
package com.Operaciones;

public class operacionesProrrateo {
    
    public int SegLocal;
    public int ComisionBan;
    public int Transporte;
    public int flete;
    public int impuestos;
    public String MATRIZ[][];
    public int VSF;
    public int TGV;
    public double CG;
    public double CGP;
    public String VectorGV[];
    public String VectorGP[];
    public String VectorCT[];
    public String VectorCU[];
    public int TGP;
    
    public operacionesProrrateo(String SL, String CB, String Trans, String Flete, String Imp){
        
        SegLocal=Integer.parseInt(SL);
        ComisionBan=Integer.parseInt(CB);
        Transporte=Integer.parseInt(Trans);
        flete=Integer.parseInt(Flete);
        impuestos=Integer.parseInt(Imp);  
        
    }
    
    public void primerPaso(String matriz[][]){
        int precio;
        int cant;
        int suma=0;
        
        for (int i = 0; i < matriz.length; i++) {
            precio=Integer.parseInt(matriz[i][2]);
            cant=Integer.parseInt(matriz[i][0]);
            suma+=precio*cant;
            
        }
        VSF=suma;              
        TGV=SegLocal+ComisionBan+impuestos;
        
        CG=TGV/VSF;
                
    }
            
    public String cuartoPaso(String matriz[][]){
        
        int precio;
        int cantidad;
        int peso;
        int pesoTotal;
        int suma=0;
        String GranTotal="";
        VectorGV=new String[matriz.length];
        VectorGP=new String[matriz.length];
        VectorCU=new String[matriz.length];
        VectorCT=new String[matriz.length];
        
        for (int i = 0; i < matriz.length; i++) {
            precio=Integer.parseInt(matriz[i][2]);
            cantidad=Integer.parseInt(matriz[i][0]);
            peso=Integer.parseInt(matriz[i][3]);
            VectorGV[i]=Double.toString(precio*CG);
            suma+=peso*cantidad;
        }
        pesoTotal=suma;
        
        TGP=flete+Transporte;
        
        CGP=TGP/pesoTotal;
        
        for (int i = 0; i < matriz.length; i++) {
            peso=Integer.parseInt(matriz[i][2]);
            VectorGP[i]=Double.toString(peso*CGP);
            
        }
        suma=0;
        
        for (int i = 0; i <matriz.length; i++) {
            precio=Integer.parseInt(matriz[i][2]);
            cantidad=Integer.parseInt(matriz[i][0]);
            double gv =Double.valueOf(VectorGV[i]);
            double gp=Double.valueOf(VectorGP[i]);
            double f=precio+gv+gp;
            double g=f*cantidad;
            VectorCU[i] =Double.toString(f);
            VectorCT[i]=Double.toString(g);
            suma+=suma+g;
            
        }
        GranTotal=Integer.toString(suma);
        return GranTotal;
    }
    
    public String[][] matrizMostrar(String matriz[][]){
        MATRIZ= new String[matriz.length][7];    
        
        for (int i = 0; i < matriz.length; i++) {
            MATRIZ[i][0]=matriz[i][0];
            MATRIZ[i][1]=matriz[i][1];
            MATRIZ[i][2]=matriz[i][2];
            MATRIZ[i][3]=VectorGV[i];
            MATRIZ[i][4]=VectorGP[i];
            MATRIZ[i][5]=VectorCU[i];
            MATRIZ[i][6]=VectorCT[i];            
        }

        return MATRIZ;
    }
    
    
    
}
