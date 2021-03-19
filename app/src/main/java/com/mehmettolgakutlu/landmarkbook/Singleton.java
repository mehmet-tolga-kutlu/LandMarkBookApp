package com.mehmettolgakutlu.landmarkbook;

import android.graphics.Bitmap;

public class Singleton {

    private Bitmap chosenImage;
    private static Singleton singleton;

    private Singleton(){

    }

    public Bitmap getChosenImage() { //Seçilen image'ı veriyor.
        return chosenImage;
    }

    public void setChosenImage(Bitmap chosenImage) {
        this.chosenImage = chosenImage;
    }

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton(); // Singleton boş ise yeni singleton oluştur.
        }
            return singleton; //Boş değil ise var olan singletonu geriye döndür.
    }
}
