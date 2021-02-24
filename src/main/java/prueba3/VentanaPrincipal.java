/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author JOSAFAT
 */
public class VentanaPrincipal extends JFrame implements ActionListener{

  
    JScrollPane scrollPane;
    JButton boton1, boton2, boton3; //declarams el nombre del componente jButton en boton1
      JLabel lblnombre,lblapellido, lbltelefono,lblsexo,lbledad, lbldireccion; //declaramos el nombre del componente Jlabel
      JTextField n,a,t,s,ed,dir;
       JPanel laminaboton = new JPanel();
        JTable tabla2 = new JTable();
        DefaultListModel modelo = new DefaultListModel();
    VentanaPrincipal (){
                         setTitle("REGISTROS DE DATOS");//titulo de la ventana	
                         setLayout(null);
			//setSize(550,650); //tamaño de la ventana
                        //setLocation(390, 180);//posicion dela ventana
                        //setLocation(null);
                        setBounds(290, 150,550,380);//posicion y tamaño de la ventana
			setResizable(true);//para poder maximizar o minimizar la ventana
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para cerrar la ventana
                        
                         
            
       
         JPanel miPanel1 = new JPanel();
       setBackground(Color.red);
          lblnombre = new JLabel("Nombre");
            lblnombre.setBounds(50, 60, 100, 20);
          add(lblnombre);
            ///////////////////////////////////
            lblapellido = new JLabel("Apellido");
            lblapellido.setBounds(50, 90, 100, 20);
           add(lblapellido);
            /////////////////////////////////////////
            lbltelefono = new JLabel("Telefono");
            lbltelefono.setBounds(50, 120, 100, 20);
           add(lbltelefono);
            ////////////////////////////////////////
            lblsexo = new JLabel("Sexo");
            lblsexo.setBounds(50, 150, 100, 20);
         add(lblsexo);
            ///////////////////////////////////////
            lbledad = new JLabel("Edad");
            lbledad.setBounds(50, 180, 100, 20);
           add(lbledad);
            //////////////////////////////////////
            lbldireccion = new JLabel("Direccion");
            lbldireccion.setBounds(50, 210, 100, 20);
            add(lbldireccion);
            ///////////////////////////////////////
            
            n = new JTextField();
            n.setBounds(120, 60, 200, 20);
            add(n);
            
             a = new JTextField();
            a.setBounds(120, 90, 200, 20);
            add(a);
            
             t = new JTextField();
            t.setBounds(120, 120, 200, 20);
           add(t);
            
             s = new JTextField();
            s.setBounds(120, 150, 200, 20);
            add(s);
            
             ed = new JTextField();
            ed.setBounds(120, 180, 200, 20);
            add(ed);
            
             dir = new JTextField();
            dir.setBounds(120, 210, 200, 20);
            add(dir);
            
           
                
            boton1=new JButton("REGISTRAR");     
           add(boton1);
            boton1.setBounds(100,260,150,30);
            boton1.addActionListener(this);
           
            boton3=new JButton("SALIR");
            add(boton3);
            boton3.setBounds(380,260,100,30);
            boton3.addActionListener(this);
            
            
                    laminaboton.setLayout(new BorderLayout());
                    
                     add(laminaboton,BorderLayout.SOUTH);
                   
                     laminaboton.setBounds(20,350,500,220); 
                     
    }
    
   ArrayList<Usuario> lista = new ArrayList<Usuario>();   


        @Override
        public void actionPerformed(ActionEvent e) {
           if (e.getSource()==boton1){
         
    
                     setLayout(null);
                    Usuario usua = new Usuario(n.getText(), a.getText(), t.getText(), s.getText(), ed.getText(), dir.getText());
                    
                       lista.add(usua);
                       
                       //JTable tabla2 = new JTable();
                          //laminaboton.add(new JScrollPane(tabla2),BorderLayout.CENTER);
                            //  mostrar();
                            String matriz[][]=new String [lista.size()][6];
          
         for (int i = 0; i < lista.size(); i++) {
             matriz[i][0]=lista.get(i).getNombre();
             matriz[i][1]=lista.get(i).getApellido();
             matriz[i][2]=lista.get(i).getTelefono();
             matriz[i][3]=lista.get(i).getSexo();
             matriz[i][4]=lista.get(i).getEdad();
             matriz[i][5]=lista.get(i).getDireccion();
              }
         String[] columna ={"Nombre", 
              "Apellidos", 
              "Telefono", 
              "Sexo", 
              "Edad",
              "Direccion"}; 
               
          
                     JTable tabla2 = new JTable(matriz,columna);
                       
                       tabla2.setLayout(new BorderLayout());
                       tabla2.setFillsViewportHeight(true);
                       laminaboton.add(new JScrollPane(tabla2),BorderLayout.CENTER);
                        tabla2.setBounds(30,400,500,500);
                        laminaboton.setVisible(true);
                        
                      
                             n.setText(" ");                    
                             a.setText(" ");
                             t.setText(" ");
                             s.setText(" ");
                             ed.setText(" ");
                             dir.setText(" ");
                      
             
                 }else{
                     System.exit(0);
                 } 
        }
        
        
       
    
    public static void main(String[] args) {
        VentanaPrincipal v = new VentanaPrincipal();
        //v.iniciaircomponente();
        v.setVisible(true);
    }
}
    
     
        