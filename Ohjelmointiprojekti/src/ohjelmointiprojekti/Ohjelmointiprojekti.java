package ohjelmointiprojekti;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

import static javax.swing.GroupLayout.Alignment.*;
import javax.swing.JSeparator;

/**
 *
 * @author HELIL
 */
public class Ohjelmointiprojekti extends JFrame {

    private JPanel pohjapaneeli = new JPanel();
    private JButton lippuOstaa = new JButton("Osta lippua");
    private JButton lippuVarata = new JButton("Varaa lippua");
    private JButton naytosaikaUusi = new JButton("Uusi näytösaika");
    private JButton leffaUusi = new JButton("Uusi leffa");
    private JButton naytosaikaKaikki = new JButton("Kaikki näytösajat");
    private JButton leffaKaikki = new JButton("Kaikki leffat");
    private JButton asiakasKaikki = new JButton("Kaikki asiakkaat");
    private JButton lippuKaikki = new JButton("Kaikki lipput");
    private JButton varausKaikki = new JButton("Kaikki varaukset");
    private JButton naytosaikaPoista = new JButton("Poista näytösaikaa");
    private JButton leffaPoista = new JButton("Poista leffaa");
    private JButton varausPoista = new JButton("Poista varausta");
    private JButton lippuPoista = new JButton("Poista lippua");
    private JButton asiakasPoista = new JButton("Poista asiakasta");
    private JButton lopeta = new JButton("Lopeta");
    private JSeparator ylaviiva = new JSeparator();
    private JSeparator keskiviiva = new JSeparator();
    private JSeparator alaviiva = new JSeparator();

    public Ohjelmointiprojekti() {

        asetteleKomponentit();
        lisaaKasittelijat();

        this.add(pohjapaneeli);
        this.setTitle("Leffa-arkisto");
        this.setSize(400, 700);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void asetteleKomponentit() {
        GroupLayout asettelu = new GroupLayout(pohjapaneeli);
        pohjapaneeli.setLayout(asettelu);


        asettelu.setAutoCreateContainerGaps(true);
        asettelu.setAutoCreateGaps(true);

        //X-suunta
        GroupLayout.ParallelGroup pohjaX = asettelu.createParallelGroup(CENTER);
        pohjaX.addComponent(lippuOstaa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        pohjaX.addComponent(lippuVarata, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        pohjaX.addComponent(naytosaikaUusi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        pohjaX.addComponent(leffaUusi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        pohjaX.addComponent(ylaviiva);
        pohjaX.addComponent(naytosaikaKaikki, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        pohjaX.addComponent(leffaKaikki, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        pohjaX.addComponent(asiakasKaikki, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        pohjaX.addComponent(lippuKaikki, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        pohjaX.addComponent(varausKaikki, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        pohjaX.addComponent(keskiviiva);
        pohjaX.addComponent(naytosaikaPoista, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        pohjaX.addComponent(leffaPoista, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        pohjaX.addComponent(varausPoista, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        pohjaX.addComponent(lippuPoista, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        pohjaX.addComponent(asiakasPoista, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        pohjaX.addComponent(alaviiva);
        pohjaX.addComponent(lopeta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);

        asettelu.setHorizontalGroup(pohjaX);

        //Y-suunta
        GroupLayout.SequentialGroup pohjaY = asettelu.createSequentialGroup();
        pohjaY.addComponent(lippuOstaa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, 1000);
        pohjaY.addComponent(lippuVarata, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, 1000);
        pohjaY.addComponent(naytosaikaUusi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, 1000);
        pohjaY.addComponent(leffaUusi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, 1000);
        pohjaY.addGap(10);
        pohjaY.addComponent(ylaviiva);
        pohjaY.addGap(10);
        pohjaY.addComponent(naytosaikaKaikki, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, 1000);
        pohjaY.addComponent(leffaKaikki, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, 1000);
        pohjaY.addComponent(asiakasKaikki, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, 1000);
        pohjaY.addComponent(lippuKaikki, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, 1000);
        pohjaY.addComponent(varausKaikki, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, 1000);
        pohjaY.addGap(10);
        pohjaY.addComponent(keskiviiva);
        pohjaY.addGap(10);
        pohjaY.addComponent(naytosaikaPoista, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, 1000);
        pohjaY.addComponent(leffaPoista, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, 1000);
        pohjaY.addComponent(varausPoista, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, 1000);
        pohjaY.addComponent(lippuPoista, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, 1000);
        pohjaY.addComponent(asiakasPoista, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, 1000);
        pohjaY.addGap(10);
        pohjaY.addComponent(alaviiva);
        pohjaY.addGap(10);
        pohjaY.addComponent(lopeta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, 1000);
        asettelu.setVerticalGroup(pohjaY);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ohjelmointiprojekti().setVisible(true);
            }
        });
    }

    private void lisaaKasittelijat(){
        lippuOstaa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LippuOstaa().setVisible(true);
            }
        });
    }
}
//
//        lippuVarata.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
////                new KirjanSyotto().setVisible(true);
//            }
//        });
//        kirjanPalautus.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
////                new KirjanPalautus().setVisible(true);
//            }
//        });
//
//        uusiLaina.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
////                 new LainanSyotto().setVisible(true);
//            }
//        });
//
//        sakot.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
////                new SakonMaksu().setVisible(true);
//            }
//        });
//
//        haeLainaajat.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
////                suoritaHaku();
//            }
//        });
//
//        haeKirjat.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
////                suoritaKirjaHaku();
//            }
//        });
//
//        haeLainat.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
////                suoritaLainatHaku();
//            }
//        });
//        haeLainassaOlevat.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
////                suoritaLainassaOlevatHaku();
//            }
//        });
//        karhulista.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
////                karhuttavienHaku();
//            }
//        });
//
//        lopeta.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                suoritaLopputoimet();
//            }
//        });


//    private void suoritaHaku() {       
//        String hakutulos="";
//        for(Lainaaja lainaaja:Lainaajavarasto.haeKaikkiLainaajat()) {
//            hakutulos+=lainaaja+"\n";
//        }
//        new ViestiIkkuna(this,"Kaikki Asiakkaat",hakutulos,10,30);
//    }
//    
//    private void suoritaKirjaHaku() {
//        String hakutulos="";
//        for(Kirja kirja:Kirjavarasto.haeKaikkiKirjat()) {
//            hakutulos+=kirja+"\n";
//        }
//        new ViestiIkkuna(this,"Kaikki kirjat",hakutulos);
//    }
//
//    private void suoritaLainatHaku() {
//        String hakutulos="";
//        for(Laina laina:Lainaustenvarasto.haeKaikkiLainat()) {
//            hakutulos+=laina+"\n";
//        }
//        new ViestiIkkuna(this,"Kaikki lainat",hakutulos,30,50);
//    }
//    
//    private void suoritaLainassaOlevatHaku() {
//        String hakutulos="";
//        for(Laina laina:Lainaustenvarasto.haeKaikkiLainassaOlevat()) {
//            hakutulos+=laina+"\n";
//        }
//        new ViestiIkkuna(this,"Kaikki lainassa olevat",hakutulos,30,50);
//    }
//    
//    private void karhuttavienHaku() {
//        String hakutulos="";
//        for(Lainaaja lainaaja:Lainaajavarasto.haeKaikkiKarhuttavatLainaajat()) {
//            hakutulos+=lainaaja+"\n";
//        }
//        new ViestiIkkuna(this,"Karhuttavat sakot",hakutulos);
//    }
//    private void suoritaLopputoimet() {
//        System.exit(0);
//    }

