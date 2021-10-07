package com.anand;

import com.anand.fileparser.CSVFileParser;
import com.anand.fileparser.FileParser;
import com.anand.fileparser.JSONFileParser;

import java.util.List;
import java.util.Map;

public class RunApp {

    public static void main(String [] args) throws Exception {
        String fileType = "json";
        FileParser fileParser = null;

        if(fileType.equalsIgnoreCase("json")) {
            fileParser = new JSONFileParser("test_data.json");
        } else if (fileType.equalsIgnoreCase("csv")) {
            fileParser = new CSVFileParser("test_data.csv");
        } else {
            System.out.printf("%s filetype is not supported", fileType);
            throw new Exception();
        }

        List<Map<String, String>> output = fileParser.parseFile();
        output.forEach(record -> {
        for(Map.Entry<String, String> entry: record.entrySet()) {
            System.out.printf("(%s, %s) ", entry.getKey(), entry.getValue());
        }});
    }
}
