package ohjelmointiprojekti;

import javax.swing.*;
import java.awt.event.*;

import javax.swing.GroupLayout.*;
import static javax.swing.GroupLayout.Alignment.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


/**
 *
 * @author HELIL
 */
public class LippuOstaa extends JFrame{
    private JPanel pohjapaneeli=new JPanel();
    private JLabel etunimiSelite=new JLabel("EtunimiTEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEST");
    private JLabel sukunimiSelite=new JLabel("SukunimiTTTEST HELLO NINK");
    private JLabel ikaSelite=new JLabel("Ikä1");
    private JLabel puhelinSelite=new JLabel("Puhelinnumero");
    private JLabel emailSelite=new JLabel("E-mail");
    private JTextField etunimi=new JTextField(15);
    private JTextField sukunimi=new JTextField(15);
    private JTextField ika=new JTextField(2);
    private JTextField puhelin=new JTextField(15);
    private JTextField email=new JTextField(35);
    private JButton talleta=new JButton("Talleta");
    
    public LippuOstaa() {
        asetteleKomponentit();
        lisaaKasittelijat();
        
        this.add(pohjapaneeli);
        this.setTitle("Asiakkaan tiedot");
        this.pack();
//        this.setSize(400, 700);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(this);
    }

    private void asetteleKomponentit() {
        GroupLayout asettelu=new GroupLayout(pohjapaneeli);
        pohjapaneeli.setLayout(asettelu);
        
        asettelu.setAutoCreateContainerGaps(true);
        asettelu.setAutoCreateGaps(true);
        
        //X-suunta
        ParallelGroup seliteX=asettelu.createParallelGroup();
        seliteX.addComponent(etunimiSelite);
        seliteX.addComponent(sukunimiSelite);
        seliteX.addComponent(ikaSelite);
        seliteX.addComponent(puhelinSelite);
        seliteX.addComponent(emailSelite);
        
        ParallelGroup kenttaX=asettelu.createParallelGroup();
        kenttaX.addComponent(etunimi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE);
        kenttaX.addComponent(sukunimi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE);
        kenttaX.addComponent(ika, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE);
        kenttaX.addComponent(puhelin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE);
        kenttaX.addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE);
        
        SequentialGroup ylaX=asettelu.createSequentialGroup();
        ylaX.addGroup(seliteX);
        ylaX.addGroup(kenttaX);
        
        ParallelGroup pohjaX=asettelu.createParallelGroup();
        pohjaX.addGroup(ylaX);
        pohjaX.addComponent(talleta,TRAILING);
        
        asettelu.setHorizontalGroup(pohjaX);
        
        //Y-suunta
        ParallelGroup etunimiriviY=asettelu.createParallelGroup(BASELINE);
        etunimiriviY.addComponent(etunimiSelite);
        etunimiriviY.addComponent(etunimi);
        
        ParallelGroup sukunimiriviY=asettelu.createParallelGroup(BASELINE);
        sukunimiriviY.addComponent(sukunimiSelite);
        sukunimiriviY.addComponent(sukunimi);
        
        ParallelGroup ikariviY=asettelu.createParallelGroup(BASELINE);
        ikariviY.addComponent(ikaSelite);
        ikariviY.addComponent(ika);
        
        ParallelGroup puhelinriviY=asettelu.createParallelGroup(BASELINE);
        puhelinriviY.addComponent(puhelinSelite);
        puhelinriviY.addComponent(puhelin);
        
        ParallelGroup emailriviY=asettelu.createParallelGroup(BASELINE);
        emailriviY.addComponent(emailSelite);
        emailriviY.addComponent(email);
        
        SequentialGroup pohjaY=asettelu.createSequentialGroup();
        pohjaY.addGroup(etunimiriviY);
        pohjaY.addGroup(sukunimiriviY);
        pohjaY.addGroup(ikariviY);
        pohjaY.addGroup(puhelinriviY);
        pohjaY.addGroup(emailriviY);
        pohjaY.addGap(30);
        pohjaY.addComponent(talleta);
        
        asettelu.setVerticalGroup(pohjaY);
    }

    private void lisaaKasittelijat() {
        talleta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                talletaKantaan();
            }
        });
        
    } 
    
    private void talletaKantaan() {
        if(etunimi.getText().isEmpty() || !etunimi.getText().matches("[A-ZÅÖÄa-zåöä]*")) {
            etunimi.setText("");
            etunimi.requestFocusInWindow();
            return;
        }
        if(sukunimi.getText().isEmpty() || !sukunimi.getText().matches("[A-ZÅÖÄa-zåöä]*")) {
            sukunimi.setText("");
            sukunimi.requestFocusInWindow(); 
            return;
        }
        
//        Integer nro=Lainaajavarasto.lisaaLainaaja(new Lainaaja(etunimi.getText(), sukunimi.getText()));
//        if(sukunimi.getComponent(sukunimi)==null) {
//            JOptionPane.showMessageDialog(talleta,"Lisäys ei onnistunut",
//                                                  "Virhe", 
//                                                  JOptionPane.ERROR_MESSAGE);    
//        }
//        else {
            new ViestiIkkuna(talleta,"Lainaaja lisätty","Uusi lainaaja lisätty.\nLainaajan "+
                                                  etunimi.getText()+" "+
                                                  sukunimi.getText()+
                                                  "\nnumero on: "+
                                                  5 
                                                  ).setVisible(true);
        }
//        etunimi.setText("");
//        sukunimi.setText("");
//        this.dispose();
    }


