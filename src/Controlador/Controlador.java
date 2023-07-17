/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Auto;
import Modelo.Vehiculo;
import Modelo.moto;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Controlador implements ActionListener{
    Formulario objForm=new Formulario();
    Vehiculo vehi= new Vehiculo();
    Auto auto=new Auto();
    moto moto=new moto();
    ArrayList <Auto> lisauto;
    ArrayList <moto> lismoto;

    public Controlador() {
        objForm.getjButton1().addActionListener(this);
        objForm.getjButton2().addActionListener(this);
        objForm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objForm.getjButton1()){
            lisauto = new ArrayList();
                       if(objForm.getjRadioButton1().isSelected()){                
                       Auto auto = new Auto();
                       auto.setTipo_vehiculo("Auto");
                       auto.setPropietario(objForm.getjTextField1().getText());
                       auto.setPlaca(objForm.getjTextField2().getText());
                       if (objForm.getjComboBox1().getSelectedItem().toString()=="Cambio de aceite"){
                           
                               auto.setServicio(objForm.getjComboBox1().getSelectedItem().toString());
                               auto.setPrecio(120000);
                               auto.setF(1);
                       }
                       lisauto.add(auto);
                       JOptionPane.showMessageDialog(null, "Datos ingresados con extio");
                       }
                       if(objForm.getMoto().isSelected()){
                       moto moto = new moto();
                       moto.setTipo_vehiculo("Moto");
                       moto.setPropietario(objForm.getjTextField1().getText());
                       moto.setPlaca(objForm.getjTextField2().getText());
                       if (objForm.getjComboBox1().getSelectedItem().toString()=="Cambio de aceite"){
                           
                               moto.setServicio(objForm.getjComboBox1().getSelectedItem().toString());
                               moto.setPrecio(120000);
                               moto.setF(1);
                       }                       
                       }
                                   for(int i=0;i<lisauto.size();i++){
                vehi.connect(lisauto.get(i).getPlaca(),lisauto.get(i).getPropietario(),lisauto.get(i).getTipo_vehiculo(),lisauto.get(i).getF()
                        ,lisauto.get(i).getPrecio());
            }
        }
        if(e.getSource()==objForm.getjButton2()){
           
        }
    }
    public void iniciar(){
        objForm.setVisible(true);
    }
}
