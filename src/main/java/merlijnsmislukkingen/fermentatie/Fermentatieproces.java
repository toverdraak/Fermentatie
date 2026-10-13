/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merlijnsmislukkingen.fermentatie;

/**
 *
 * @author alexander
 */
public class Fermentatieproces {
    double mum = 0.35;
    double suiker = 100; 
    double bioHuidig = 1;        
    public double BiomassaBerekenen(){
        double mu=BerekenMu();
        double bioNew = bioHuidig + mu*bioHuidig;
        double bioVerschil = bioNew - bioHuidig;
        Update(bioVerschil);
        bioHuidig = bioNew;
        return bioHuidig;
    
    }
    public double BerekenMu(){
        double temperatuurFactor = BerekenTemperatuurFactor();
        double pHFactor = BerekenpHFactor();
        double suikerFactor = BerekenSuikerFactor(suiker);
        double mu = mum*temperatuurFactor*suikerFactor*pHFactor;
        return mu;
    }
    public double BerekenTemperatuurFactor(){
        //tabel toevoegen
        return 1;
    }
    public double BerekenpHFactor(){
        //tabel toevoegen
        return 1;
    }
    public double BerekenSuikerFactor(double suiker){
        double suikerFactor = suiker/(10+suiker);
        return suikerFactor;
    }
    public void Update(double veranderingBiomassa){
        suiker = suiker - veranderingBiomassa/0.12;
    }
    
}
