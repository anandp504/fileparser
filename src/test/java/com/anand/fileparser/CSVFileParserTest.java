package com.anand.fileparser;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class CSVFileParserTest {

    @Test
    public void JSONParseFileTest() {
        FileParser csvParser = null;
        csvParser = new CSVFileParser("Csvtest.json");


        List<Map<String, String>> actual = csvParser.parseFile();
        //System.out.println(actual);

        Map<String, String> data1 = actual.get(0);
        assertEquals("Agali", data1.get("block_name"));
        assertEquals("13.81073513", data1.get("block_lat"));
        assertEquals("Agali", data1.get("block_name"));

        Map<String, String> data2 = actual.get(1);
        assertEquals("Hindupur", data2.get("block_name"));
        assertEquals("5104", data2.get("block_id"));

    }

    @Test
    public void itReturnsEmptyArray() {

        FileParser csvParser = null;
        csvParser = new JSONFileParser("test.json");

        List<Map<String, String>> actual = csvParser.parseFile();

        assertTrue(actual.size() == 0);

    }

}
