package smartyjlist;

import java.awt.Image;
import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class SmartyJListBeanInfo extends SimpleBeanInfo {

    @Override
    public BeanDescriptor getBeanDescriptor() {
        BeanDescriptor bd = new BeanDescriptor(SmartyJList.class);
        bd.setDisplayName("SmartyJListCheckBox");
        bd.setShortDescription("Jlist com CheckBox para seleção inteligente!");
        return bd; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Image getIcon(int iconKind) {
        if (iconKind == BeanInfo.ICON_COLOR_16x16) {
            Image image = loadImage("SmartyList.gif");
            return image;
        }
        return null;
        //  return super.getIcon(iconKind); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return null;            
    }

}
