package edu.ntudp.olkhovyk;

import com.google.gson.Gson;
import edu.ntudp.olkhovyk.model.University;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonSerializer {
    public void write(Object object, String filePath) throws IOException {
        Gson gson = new Gson();
        String json = gson.toJson(object);

        FileWriter writer = new FileWriter(filePath);
        writer.write(json);
        writer.close();
    }

    public Object read(String filePath) throws FileNotFoundException {
        Gson gson = new Gson();

        return gson.fromJson(new FileReader(filePath), University.class);
    }
}
