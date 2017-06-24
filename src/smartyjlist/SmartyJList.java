package smartyjlist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class SmartyJList extends JList<Object>{

    private JFrame janela;
    
    public SmartyJList() {
        super();       
    }

    public SmartyJList(JFrame frame) {
        this();
        setJanela(frame);       
    }
  
    
    public void setJanela(JFrame janela) {
        this.janela = janela;
        init();
    }

    @SuppressWarnings("unchecked")
    public void init(){
        
        Container c = janela.getContentPane();
 
        c.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setCellRenderer(new CheckBoxCellRenderer());
        
        Object[] cbArray = new Object[4];
        cbArray[0] = new JCheckBox("Goiânia");
        cbArray[1] = new JCheckBox("Brasília");
        cbArray[2] = new JCheckBox("Barra do Garças");
        cbArray[3] = new JCheckBox("Curitiba");
       
        this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        this.addKeyListener( new JListCheckKeyListenerGeralAdapter(this));
        this.addMouseListener(new JListCheckMouseListenerGeralAdapter(this));
       
        this.setListData(cbArray);
        //janela.add(new JScrollPane(this, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
        c.add(new JScrollPane(this, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));

    }
    
}
