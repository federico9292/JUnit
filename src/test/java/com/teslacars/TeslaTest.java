package com.teslacars;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TeslaTest {

    @Test
    @DisplayName("vendo tutte le auto")
    public void vendiAutoNumeroCorretto() {
        List<Tesla> listaAuto = new ArrayList<Tesla>();

        ModelS ms;
        Model3 m3;
        ModelX mx;
        ModelY my;
        String versione = "";

        for (int i = 0; i < 20; i++) {
            Modelli a = Modelli.getVersion();
            boolean duplicato = false;
            switch (a.toString()) {
                case "ModelS":
                    ms = new ModelS(ModelS.Version.getVersion());
                    if (!listaAuto.contains(ms)) {

                        listaAuto.add(ms);
                        versione = ms.version.toString();
                        if (versione.length() > 11) {

                        } else if (versione.length() > 5) {
                            versione += "\t";
                        } else {
                            versione += "\t\t";

                        }
                        break;
                    } else {
                        duplicato = true;
                    }
                    break;

                case "ModelX":
                    mx = new ModelX(ModelX.Version.getVersion());
                    listaAuto.add(mx);
                    if (!listaAuto.contains(mx)) {

                        listaAuto.add(mx);
                        versione = mx.version.toString();
                        if (versione.length() > 11) {

                        } else if (versione.length() > 5) {
                            versione += "\t";
                        } else {
                            versione += "\t\t";

                        }
                        break;
                    } else {
                        duplicato = true;

                    }
                    break;

                case "Model3":
                    m3 = new Model3(Model3.Version.getVersion());
                    if (!listaAuto.contains(m3)) {

                        listaAuto.add(m3);
                        versione = m3.version.toString();
                        if (versione.length() > 11) {

                        } else if (versione.length() > 5) {
                            versione += "\t";
                        } else {
                            versione += "\t\t";

                        }
                        break;
                    } else {
                        duplicato = true;

                    }
                    break;
                case "ModelY":
                    my = new ModelY(ModelY.Version.getVersion());
                    if (!listaAuto.contains(my)) {

                        listaAuto.add(my);
                        versione = my.version.toString();
                        if (versione.length() > 11) {

                        } else if (versione.length() > 5) {
                            versione += "\t";
                        } else {
                            versione += "\t\t";

                        }
                        break;

                    } else {
                        duplicato = true;
                    }
                    break;
            }
            Tesla tem = listaAuto.get(i);
            if (!duplicato)
                System.out.println((i + 1) + "\t" + tem.name + "\t\t" + versione + "\t" + tem.range + " \t " + tem.price
                        + "\t" + tem.colore);

        }

        for (int i = 0; i < listaAuto.size();) {
            listaAuto.remove(i);
        }
        assertEquals(0, listaAuto.size());

    }

    @Test
    @DisplayName("vendi più auto di quante ce ne sono")
    public void vendiAutoNumeroEccessivo() {
        List<Tesla> listaAuto = new ArrayList<Tesla>();

        ModelS ms;
        Model3 m3;
        ModelX mx;
        ModelY my;
        String versione = "";

        for (int i = 0; i < 20; i++) {
            Modelli a = Modelli.getVersion();
            boolean duplicato = false;
            switch (a.toString()) {
                case "ModelS":
                    ms = new ModelS(ModelS.Version.getVersion());
                    if (!listaAuto.contains(ms)) {

                        listaAuto.add(ms);
                        versione = ms.version.toString();
                        if (versione.length() > 11) {

                        } else if (versione.length() > 5) {
                            versione += "\t";
                        } else {
                            versione += "\t\t";

                        }
                        break;
                    } else {
                        duplicato = true;
                    }
                    break;

                case "ModelX":
                    mx = new ModelX(ModelX.Version.getVersion());
                    listaAuto.add(mx);
                    if (!listaAuto.contains(mx)) {

                        listaAuto.add(mx);
                        versione = mx.version.toString();
                        if (versione.length() > 11) {

                        } else if (versione.length() > 5) {
                            versione += "\t";
                        } else {
                            versione += "\t\t";

                        }
                        break;
                    } else {
                        duplicato = true;

                    }
                    break;

                case "Model3":
                    m3 = new Model3(Model3.Version.getVersion());
                    if (!listaAuto.contains(m3)) {

                        listaAuto.add(m3);
                        versione = m3.version.toString();
                        if (versione.length() > 11) {

                        } else if (versione.length() > 5) {
                            versione += "\t";
                        } else {
                            versione += "\t\t";

                        }
                        break;
                    } else {
                        duplicato = true;

                    }
                    break;
                case "ModelY":
                    my = new ModelY(ModelY.Version.getVersion());
                    if (!listaAuto.contains(my)) {

                        listaAuto.add(my);
                        versione = my.version.toString();
                        if (versione.length() > 11) {

                        } else if (versione.length() > 5) {
                            versione += "\t";
                        } else {
                            versione += "\t\t";

                        }
                        break;

                    } else {
                        duplicato = true;
                    }
                    break;
            }
            Tesla tem = listaAuto.get(i);
            if (!duplicato)
                System.out.println((i + 1) + "\t" + tem.name + "\t\t" + versione + "\t" + tem.range + " \t " + tem.price
                        + "\t" + tem.colore);

        }

        for (int i = 0; i < listaAuto.size();) {
            listaAuto.remove(i);
        }

        try {
            listaAuto.remove(0);
        } catch (Exception e) {
            fail("Non ci sono più auto da vendere");
        }
    }
}
