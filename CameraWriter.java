package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CameraWriter {
    public void writeToFile(List<Camera> cameras, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write headers
            Camera firstCamera = cameras.get(0);
            String headers = firstCamera.getHeaders();
            writer.write(headers);
            writer.newLine();

            // Write data for each camera
            for (Camera camera : cameras) {
                String csvData = camera.toCSV();
                writer.write(csvData);
                writer.newLine();
            }

            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
