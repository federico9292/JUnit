package com.teslacars;

import java.util.Random;

enum Modelli {
    ModelS, Model3, ModelX, ModelY;

    public static Modelli getVersion() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];

    }
}

public abstract class Tesla {

    protected String name;
    protected int range;
    protected double price;
    protected color colore;

    public Tesla(String name) {
        this.name = name;
    }

    public enum color {
        Rossa, Blu, Bianca, Nera;

        public static color getRandomColor() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];

        }
    }
}

class ModelS extends Tesla {
    public Version version;

    public enum Version {
        Plaid, LongRange;

        public static Version getVersion() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];

        }
    }

    ModelS(Version version) {
        super("Model S");
        this.version = version;
        this.colore = color.getRandomColor();

        switch (version) {
            case LongRange: {
                this.range = 652;
                this.price = 89990.00;
                break;
            }
            case Plaid: {
                this.range = 628;
                this.price = 129990.00;
                break;
            }

        }
    }
}

class Model3 extends Tesla {

    public Version version;

    public enum Version {
        StandardRangePlus, LongRange, Performance;

        public static Version getVersion() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];

        }
    }

    Model3(Version version) {
        super("Model 3");
        this.version = version;
        this.colore = color.getRandomColor();
        switch (version) {
            case StandardRangePlus: {
                this.range = 448;
                this.price = 48990.00;
                break;
            }
            case LongRange: {
                this.range = 614;
                this.price = 54990.00;
                break;
            }
            case Performance: {
                this.range = 567;
                this.price = 60990.00;
                break;
            }
        }
    }
}

class ModelX extends Tesla {
    public Version version;

    public enum Version {
        Plaid, LongRange;

        public static Version getVersion() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];

        }
    }

    ModelX(Version version) {
        super("Model X");
        this.version = version;
        this.colore = color.getRandomColor();

        switch (version) {
            case LongRange: {
                this.range = 580;
                this.price = 99990.00;
                break;
            }
            case Plaid: {
                this.range = 547;
                this.price = 119990.00;
                break;
            }
        }
    }
}

class ModelY extends Tesla {
    public Version version;

    public enum Version {
        Performance, LongRange;

        public static Version getVersion() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];

        }
    }

    ModelY(Version version) {
        super("Model Y");
        this.version = version;
        this.colore = color.getRandomColor();
        switch (version) {
            case Performance: {
                this.range = 480;
                this.price = 71000.00;
                break;
            }
            case LongRange: {
                this.range = 505;
                this.price = 63000.00;
                break;
            }
        }
    }

}