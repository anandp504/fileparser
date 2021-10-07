package com.anand.fileparser;

import org.junit.Test;
import com.anand.fileparser.JSONFileParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


public class JSONFileParserTest {

    @Test
    public void parseFileTest(){

                FileParser jsonParser = new JSONFileParser("Jsontest.json");

                List<Map<String, String>> outPut =jsonParser.parseFile();


        assertEquals(outPut, "[{date=1577836800000}]");


    }
}