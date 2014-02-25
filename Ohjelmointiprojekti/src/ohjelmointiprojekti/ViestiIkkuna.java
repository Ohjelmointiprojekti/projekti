package ohjelmointiprojekti;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


/**
 *
 * @author HELIL
 */
public class ViestiIkkuna extends JFrame{
    private JPanel pohjapaneeli=new JPanel(new BorderLayout());
    private JPanel alapaneeli=new JPanel(new FlowLayout(FlowLayout.TRAILING));
    private JTextArea sisalto;
    private JScrollPane vieritettavaSisalto;
    private JButton sulje=new JButton("Sulje");
    private Font fontti=new Font(Font.SANS_SERIF, Font.BOLD, 14);

    public ViestiIkkuna(Component komponentti,String otsikko, String teksti, int rivit,int sarakkeet) {
        sisalto=new JTextArea(rivit, sarakkeet);
        vieritettavaSisalto=new JScrollPane(sisalto);
        sisalto.setText(teksti);
        alustaIkkuna();
        
        this.setTitle(otsikko);
        this.setLocationRelativeTo(komponentti); 
    }
    public ViestiIkkuna(Component komponentti,String otsikko, String teksti) {
        sisalto=new JTextArea();
        vieritettavaSisalto=new JScrollPane(sisalto);
        sisalto.setText(teksti);
        alustaIkkuna();
        this.setTitle(otsikko);
        this.setLocationRelativeTo(komponentti); 
    }
    
    private void alustaIkkuna(){
        sisalto.setMargin(new Insets(5, 5, 5, 5));
        sisalto.setFont(fontti);
        sisalto.setEditable(false);
        alapaneeli.add(sulje);
        pohjapaneeli.add(vieritettavaSisalto, BorderLayout.CENTER);
        pohjapaneeli.add(alapaneeli, BorderLayout.PAGE_END);
        pohjapaneeli.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        this.add(pohjapaneeli);
       
        this.pack();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        this.setVisible(true);
        
        sulje.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                suljeIkkuna();
            }
        });
    }
    private void suljeIkkuna() {
        this.dispose();
    }
}
