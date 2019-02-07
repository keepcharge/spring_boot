package com.atmyc.spring_boot.test01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User1 implements Serializable{
    private Integer id;
    private String username;
    private Integer age;

}
