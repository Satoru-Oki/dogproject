package org.example;

class JapanRugbyPlayer {
    private String name;
    private int height;
    private int weight;
    private String posi;

    public JapanRugbyPlayer(String name, int height, int weight, String posi) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.posi = posi;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getPosi() {
        return posi;
    }
}
