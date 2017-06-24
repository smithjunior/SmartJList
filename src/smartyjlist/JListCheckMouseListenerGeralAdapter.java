package smartyjlist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import javax.swing.JList;

public class JListCheckMouseListenerGeralAdapter extends MouseAdapter {

    private JList jList;
    
    
    public JListCheckMouseListenerGeralAdapter(JList jList) {
        super();
        this.jList = jList;
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int index = jList.locationToIndex(e.getPoint());
        if (index != -1) {
            JCheckBox checkbox = (JCheckBox) jList.getModel().getElementAt(index);
            checkbox.setSelected(!checkbox.isSelected());
           
        }
         jList.repaint();
    }
}
