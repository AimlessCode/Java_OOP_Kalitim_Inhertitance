package com.emin;

import com.emin.entities.Hizmetli;
import com.emin.entities.Mudur;
import com.emin.entities.Muhendis;

public class Runner {
    public static void main(String[] args) {

        Hizmetli hizmetli = new Hizmetli();
        Mudur mudur = new Mudur();
        Muhendis muhendis = new Muhendis();

        hizmetli.ad = "Canan";
        mudur.ad = "Ahmet";

        muhendis.maasVer("Mühendis");

    }
}
