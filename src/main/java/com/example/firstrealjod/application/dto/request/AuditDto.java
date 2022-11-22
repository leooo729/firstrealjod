package com.example.firstrealjod.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuditDto {
    private String caseId;
    private String status; //submitCase=提交/放行
    private String desc; //備註 可選填

}
