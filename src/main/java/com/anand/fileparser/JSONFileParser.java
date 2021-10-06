package com.anand.fileparser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONFileParser extends FileParser {

    private final String fileName;
    private ObjectMapper mapper = new ObjectMapper();

    public JSONFileParser(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Map<String, String>> parseFile() {
        List<Map<String, String>> result = new ArrayList<>();
        try {
            BufferedReader fileContent = openFile(fileName);
            String line = null;
            while ((line = fileContent.readLine()) != null) {
                result.add(mapper.readValue(line, new TypeReference<HashMap<String, String>>() {
                }));
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
