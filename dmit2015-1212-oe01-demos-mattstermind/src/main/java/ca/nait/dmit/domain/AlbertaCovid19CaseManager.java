package ca.nait.dmit.domain;

import lombok.Getter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AlbertaCovid19CaseManager {

    @Getter
    private List<AlbertaCovid19Case> albertaCovid19CovidList = new ArrayList<>();

    public AlbertaCovid19CaseManager() throws IOException {
        try(var reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(
                "/data/covid-19-alberta-statistics-data.csv")))) {

            String lineText;

            final var DELIMITER = ",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)";
            //We can skip the first line since it contains header columns
            reader.readLine();
            var dateTimeFormatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
            while((lineText = reader.readLine()) != null){
                //Create an object for each row in the file
                AlbertaCovid19Case currentCase = new AlbertaCovid19Case();
                String[] values = lineText.split(DELIMITER, -1); //The -1 limit allows for any number of fields and not discard empty fields
                //Order of column data is important
                //0 - "Id"
                //1 - "Date reported"
                // 2 - "Alberta Health Services Zone"
                // 3 - "Gender"
                // 4 - "Age group"
                // 5 - "Case status"
                // 6 - "Case type"
                currentCase.setId(Integer.parseInt(values[0].replaceAll("\"","")));
                currentCase.setDateReported(LocalDate.parse(values[1].replaceAll("\"",""), dateTimeFormatter));
                currentCase.setAhsZone(values[2].replaceAll("\"",""));
                currentCase.setGender(values[3].replaceAll("\"",""));
                currentCase.setAgeGroup(values[4].replaceAll("\"",""));
                currentCase.setCaseStatus(values[5].replaceAll("\"",""));
                currentCase.setCaseType(values[6].replaceAll("\"",""));
                //Now we can add the object to our list
                albertaCovid19CovidList.add(currentCase);
            }

        }
    }
}
