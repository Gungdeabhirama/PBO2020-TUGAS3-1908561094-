package com.main;

import java.io.Serializable;

public class JenisGitar implements Serializable {
    private String jenisGitar;

    public JenisGitar(String jenisGitar) {
        this.jenisGitar = jenisGitar;
    }

    public String getJenisGitar() {
        return jenisGitar;
    }
}

