package com.anand.fileparser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public abstract class FileParser {

    public abstract List<Map<String, String>> parseFile();

    public BufferedReader openFile(String fileName) {
        BufferedReader fileContent = null;
        try {
            fileContent = new BufferedReader(new FileReader(this.getClass().getClassLoader().getResource(fileName).getFile()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return fileContent;
    }

}
