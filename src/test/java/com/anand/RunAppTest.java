package com.anand;

import com.anand.RunApp;
import static org.junit.jupiter.api.Assertions.*;

import com.anand.fileparser.FileParser;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RunAppTest {

    @Rule
    public  ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void exceptionFiletypeNotSupported() {



        try {
            RunApp.main(new String[] {"xml", "Xmltest.xml"});
        } catch (Exception e) {

            assertEquals("filetype is not supported", e.getMessage());
        }
    }


}