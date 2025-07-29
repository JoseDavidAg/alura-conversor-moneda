/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversormoneda;

/**
 *
 * @author ambro
 */
public class Conversion {
    private String base;
    private String con;
    private float valor;
    
    public Conversion(ConversionDto con){
        this.base=con.base_code();
        this.con=con.target_code();
        this.valor=con.conversion_rate();
    }

    public String getBase() {
        return base;
    }

    public String getCon() {
        return con;
    }

    public double getValor() {
        return valor;
    }
    
    
}
