/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexico;

/**
 *
 * @author pedroelias
 */
public class Token {
    public final int tag;
    public token (int t){
        tag=t;
    }
    public String toString(){
        return ""+tag;
    }
}
