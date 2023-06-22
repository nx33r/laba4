package org.example;

public class FilmCamera extends Camera {
    private String filmType;
    private int filmISO;

    public FilmCamera(String brand, String model, String lens, String filmType, int filmISO) {
        super(brand, model, lens);
        this.filmType = filmType;
        this.filmISO = filmISO;
    }

    @Override
    public String takePhoto() {
        return "Film Camera Photo: Film Type - " + filmType + ", Film ISO - " + filmISO;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ",filmType,filmISO";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + filmType + "," + filmISO;
    }
}
