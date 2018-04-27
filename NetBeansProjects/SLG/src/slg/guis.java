package slg;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guis extends JFrame implements ActionListener{
    JButton createb,exitb,resetb,strIncb,strDecb,dexIncb,dexDecb,wisIncb,wisDecb,stamIncb,stamDecb;
    JLabel namel,plrClassl,strl,dexl,wisl,staml;
    JTextField namet,strt,dext,wist,stamt;
    JComboBox plrClassCb;
    String[] classes = {"Mage","Ranger","Warrior"};
    
    public guis(){
        setLayout(new FlowLayout());
        namel = new JLabel("Character Name: ");
        add(namel);
        namet = new JTextField(null,25);
        add(namet);
        createb = new JButton("CREATE CHARACTER");
        add(createb);
        resetb = new JButton("RESET");
        add(resetb);
        exitb = new JButton("EXIT");
        add(exitb);
        //..//
        setTitle("Class Creation");
        setSize(450,180 );
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        exitb.addActionListener(e -> System.exit(0));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
