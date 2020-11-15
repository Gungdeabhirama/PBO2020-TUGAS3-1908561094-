package com.main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TampilanGitar {
    public static com.main.JenisGitar TampilanGitar() {
        com.main.JenisGitar jenisGitar = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("persistent_file.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            jenisGitar = (com.main.JenisGitar) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception error) {
            error.printStackTrace();
        }
        return jenisGitar;
    }
}
