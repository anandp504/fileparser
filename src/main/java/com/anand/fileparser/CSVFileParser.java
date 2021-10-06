package com.anand.fileparser;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CSVFileParser extends FileParser {

    private final String fileName;

    public CSVFileParser(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Map<String, String>> parseFile() {
        List<Map<String, String>> result = new ArrayList<>();
        CsvMapper mapper = new CsvMapper();
        CsvSchema schema = CsvSchema.emptySchema().withHeader();
        try {
            BufferedReader fileContent = openFile(fileName);
            MappingIterator<Map<String, String>> dataIterator = mapper.readerFor(Map.class).with(schema).readValues(fileContent);
            while(dataIterator.hasNext()) {
                result.add(dataIterator.next());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
