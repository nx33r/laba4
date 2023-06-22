package org.example;

import java.util.ArrayList;
import java.util.List;

public class CameraManager {
    public static void main(String[] args) {
        List<Camera> cameras = new ArrayList<>();

        DigitalCamera digitalCamera = new DigitalCamera("Canon", "D200", "50mm", "1024x768", 1.0, "SD", 0);
        cameras.add(digitalCamera);

        FilmCamera filmCamera = new FilmCamera("Nikon", "F3", "35mm", "35mm", 400);
        cameras.add(filmCamera);

        CameraWriter writer = new CameraWriter();
        writer.writeToFile(cameras, "cameras.csv");
    }
}
