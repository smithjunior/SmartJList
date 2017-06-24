package smartyjlist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBox;
import javax.swing.JList;

public class JListCheckKeyListenerGeralAdapter extends KeyAdapter {

    private JList jList;

    public JListCheckKeyListenerGeralAdapter(JList jList) {
        super();
        this.jList = jList;       
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            int index = jList.getSelectedIndex();
            if (index != -1) {
                JCheckBox checkbox = (JCheckBox) jList.getModel().getElementAt(index);
                checkbox.setSelected(!checkbox.isSelected());
                jList.repaint();
               
            }
          
        }
        
    }
}
