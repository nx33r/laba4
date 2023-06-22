package org.example;

public class DigitalCamera extends Camera {
    private String resolution;
    private double zoom;
    private String memoryCardType;
    private int photosCount;

    public DigitalCamera(String brand, String model, String lens, String resolution, double zoom, String memoryCardType, int photosCount) {
        super(brand, model, lens);
        this.resolution = resolution;
        this.zoom = zoom;
        this.memoryCardType = memoryCardType;
        this.photosCount = photosCount;
    }

    @Override
    public String takePhoto() {
        return "Digital Camera Photo: Resolution - " + resolution + ", Zoom - " + zoom;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ",resolution,zoom,memoryCardType,photosCount";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + resolution + "," + zoom + "," + memoryCardType + "," + photosCount;
    }
}
