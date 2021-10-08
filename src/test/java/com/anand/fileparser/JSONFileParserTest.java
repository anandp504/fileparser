package com.anand.fileparser;

import org.junit.Test;
import com.anand.fileparser.JSONFileParser;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


public class JSONFileParserTest {

    @Test
    public void JSONParseFileTest(){
                    FileParser jsonParser = null;
                    jsonParser = new JSONFileParser("Jsontest.json");


                List<Map<String, String>> actual =jsonParser.parseFile();
                //System.out.println(actual);

                Map<String,String> data1 = actual.get(0);
                assertEquals("Agali", data1.get("block_name"));

                Map<String,String> data2 = actual.get(1);
                assertEquals("Penukonda", data2.get("block_name"));
                assertEquals("5125", data2.get("block_id"));

    }
    @Test
    public void itReturnsEmptyArray() {

        FileParser jsonParser = null;
        jsonParser = new JSONFileParser("test.json");

        List<Map<String, String>> actual =jsonParser.parseFile();

        assertTrue(actual.size() == 0);

    }
}