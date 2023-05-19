package com.schnurritv.sexmod;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.common.FMLCommonHandler;
import org.apache.commons.io.FileUtils;

public class cu extends JFrame {
  private JPanel c;
  
  static cu a;
  
  public static boolean b = true;
  
  public static void a() {
    EventQueue.invokeLater(() -> {
          try {
            a = new cu();
            a.setVisible(true);
            a.requestFocus();
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
        });
  }
  
  public cu() {
    setResizable(false);
    setBounds(100, 100, 600, 260);
    this.c = new JPanel();
    this.c.setBorder(new EmptyBorder(5, 5, 5, 5));
    this.c.setLayout(new BorderLayout(0, 0));
    setContentPane(this.c);
    JPanel jPanel1 = new JPanel();
    this.c.add(jPanel1, "North");
    JTextPane jTextPane1 = new JTextPane();
    jTextPane1.setFont(new Font("Tahoma", 0, 16));
    jTextPane1.setBackground(SystemColor.control);
    jTextPane1.setText(I18n.func_135052_a("window.pornwarning.title", new Object[0]));
    jPanel1.add(jTextPane1);
    JPanel jPanel2 = new JPanel();
    this.c.add(jPanel2, "South");
    JCheckBox jCheckBox = new JCheckBox(I18n.func_135052_a("window.pornwarning.dontaskagain", new Object[0]));
    jPanel2.add(jCheckBox);
    JButton jButton1 = new JButton(I18n.func_135052_a("window.pornwarning.am18", new Object[0]));
    jButton1.addActionListener(paramActionEvent -> {
          b = false;
          if (paramJCheckBox.isSelected()) {
            File file1 = new File("sexmod");
            file1.mkdir();
            File file2 = new File("sexmod/dontAskAgain");
            try {
              file2.createNewFile();
            } catch (IOException iOException) {
              iOException.printStackTrace();
            } 
          } 
          a.dispose();
        });
    jPanel2.add(jButton1);
    JButton jButton2 = new JButton(I18n.func_135052_a("window.pornwarning.not18", new Object[0]));
    jButton2.addActionListener(paramActionEvent -> {
          b = false;
          System.out.println("MINOR!!! WHEOO WOOO WHEEE WHOOO WHEEE WHOO");
          File file1 = new File("sexmod");
          try {
            FileUtils.deleteDirectory(file1);
          } catch (IOException iOException) {
            iOException.printStackTrace();
          } 
          File file2 = new File("mods/youCanJustDeleteMe.bat");
          try {
            FileWriter fileWriter = new FileWriter(file2);
            fileWriter.write("@echo off\n");
            fileWriter.write("TIMEOUT /T 5\n");
            fileWriter.write("DEL \"mods\\*sexmod*.jar\"\n");
            fileWriter.write("exit 0");
            fileWriter.close();
            Runtime.getRuntime().exec("cmd /c start " + file2.getPath());
          } catch (IOException iOException) {
            iOException.printStackTrace();
          } 
          FMLCommonHandler.instance().exitJava(0, true);
        });
    jPanel2.add(jButton2);
    JPanel jPanel3 = new JPanel();
    this.c.add(jPanel3, "Center");
    jPanel3.setLayout(new BoxLayout(jPanel3, 0));
    JTextPane jTextPane2 = new JTextPane();
    jTextPane2.setContentType("text/html");
    jTextPane2.setBackground(SystemColor.control);
    jTextPane2.setEditable(false);
    jTextPane2.setText("<html><center><p style='font-family: Tahoma'>" + I18n.func_135052_a("window.pornwarning.text", new Object[0]) + "</p></center></html> ");
    jPanel3.add(jTextPane2);
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\cu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */