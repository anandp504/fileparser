package com.anand.fileparser;

import org.junit.Test;
import com.anand.fileparser.JSONFileParser;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


public class JSONFileParserTest {

    @Test
    public void parseFileTest(){
                FileParser jsonParser = new JSONFileParser("Jsontest.json");

                List<Map<String, String>> outPut =jsonParser.parseFile();

        System.out.println(outPut);

        //assertEquals(outPut, "[{date=1577836800000, year=2020, dekad_week_text=Jan 01-Jan 10, block_lat=13.81073513, grid_rainfall=0.0, grid_temp_min=18.6462, met_week_num=1, month_num=1, block_id=5082, met_week_text=Jan 01-Jan 07, district_name=Anantapur, block_name=Agali, dekad_week_num=1, month=Jan, state_name=ANDHRA PRADESH, grid_temp_max=27.6101, year_type=Neutral, state_id=28, district_id=553, block_lon=77.04504997, state_iso_code=IN-AP}, {date=1577836800000, year=2020, dekad_week_text=Jan 01-Jan 10, block_lat=13.82270909, grid_rainfall=0.0, grid_temp_min=18.6462, met_week_num=1, month_num=1, block_id=5104, met_week_text=Jan 01-Jan 07, district_name=Anantapur, block_name=Hindupur, dekad_week_num=1, month=Jan, state_name=ANDHRA PRADESH, grid_temp_max=27.6101, year_type=Neutral, state_id=28, district_id=553, block_lon=77.53421143, state_iso_code=IN-AP}]");


    }
}