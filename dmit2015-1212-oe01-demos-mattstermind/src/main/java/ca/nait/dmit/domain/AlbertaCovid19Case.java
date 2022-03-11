package ca.nait.dmit.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AlbertaCovid19Case {
    //"","Date reported","Alberta Health Services Zone","Gender","Age group","Case status","Case type"
    //"1",2021-04-21,"Edmonton Zone","Male","30-39 years","Recovered","Confirmed"
    private int id;
    private LocalDate dateReported;
    private String ahsZone;
    private String gender;
    private String ageGroup;
    private String caseStatus;
    private String caseType;

}
