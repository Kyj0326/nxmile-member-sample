package com.skcc.nxm.core.domain.entity.member;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter @AllArgsConstructor
public class PrivateInfo {

    private String hName;

    private String eName;

    private String email;

    private String birthDay;

    private String phoneNumber;

    private String sex;




}
