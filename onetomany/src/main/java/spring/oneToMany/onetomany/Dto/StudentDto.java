package spring.oneToMany.onetomany.Dto;


import lombok.Getter;
import lombok.Setter;


import java.util.List;

@Getter
@Setter

public class StudentDto {
    private Integer studentId;

    private String studentName;

    private Integer studentAge;

    private List<SubjectDto> subjectDto;
}