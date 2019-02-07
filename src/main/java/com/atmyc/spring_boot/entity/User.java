package com.atmyc.spring_boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private  Long uid;
    private  String username;
    private  String password;
    private  String email;
    private  String homeUrl;
    private  String screenName;
    private  Long created;
    private  Long activated;
    private  Long logged;
    private  String groupName;

}
