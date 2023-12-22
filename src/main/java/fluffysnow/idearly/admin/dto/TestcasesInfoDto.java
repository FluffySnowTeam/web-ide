package fluffysnow.idearly.admin.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class TestcasesInfoDto {

    private String input;

    private String answer;

    private Boolean hidden;

}