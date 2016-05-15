/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bobpaulin.tika.kids.translate;

import com.memetix.mst.language.Language;
import org.apache.tika.Tika;


/**
 *
 * @author bpaulin
 */
public class Translator {

    private final Tika tika;

    public Translator() {
        tika = new Tika();
    }
    
    
    
    public String translate(String text, String language)
    {
        String result = tika.translate(text, language);
        return result;
    }
    
    public static void main(String[] args) {
        Translator translator = new Translator();
        System.out.println(translator.translate("Good Morning", Language.GERMAN.toString()));
    }
    
}
