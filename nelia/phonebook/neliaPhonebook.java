/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package phonebook;


/**
 *
 * @author neliaPhonebook
 */
public class neliaPhonebook implements CRUD_Interface {

    public static void main(String[] args) {
        //Initialize Data Structure
        CRUD_Interface.DB_Initialize();
        //Insert Sample Data
        System.out.println("Adding Sample Data");
        CRUD_Interface.addRow("Nelia", "Valencia", "05/22/2001", "Lipa", "neliabebic@ub.edu.ph", "09183372752");
        //Initialize GUI
        MainF app = new MainF();
        app.setVisible(true);
        System.out.println("Hello World!");
        
        
    }
}
