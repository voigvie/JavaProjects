/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.horadosistema;

import java.util.Date;

/**
 *
 * @author Giovanna
 */
public class HoraDoSistema {

    public static void main(String[] args) {
        Date relogio = new Date(); //new é usado sempre que criamos novo objeto
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());
    }
}
