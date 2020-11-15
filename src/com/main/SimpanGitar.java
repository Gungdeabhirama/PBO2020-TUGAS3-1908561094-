package com.main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SimpanGitar implements Serializable {
    private com.main.JenisGitar jenisGitar;
    public SimpanGitar(String gitarBaru) {
        if (gitarBaru == null) {
            jenisGitar = null;
        } else {
            jenisGitar= new com.main.JenisGitar(gitarBaru);
        }
    }

    public void Jalankan() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("persistent_file.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(this.jenisGitar);
            objectOutputStream.flush();
            objectOutputStream.close();

        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}