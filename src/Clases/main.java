/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author JohnJairo
 */
public class main {

    public static void main(String agrs[]) {
        JFrame.setDefaultLookAndFeelDecorated(true); //que nos permite dejar a Substance la decoracion ( por asi decirlo)
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.RavenSkin"); // Setencia que aplica el skin Creme de Substance
        SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceEbonyTheme"); // Se aplica el tema Aqui de Substance
        Interfaz.Capa1 inicio = new Interfaz.Capa1();
        inicio.setVisible(true);
    }

}
