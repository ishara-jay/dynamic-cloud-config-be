package com.alphasense.cloudconfiguration.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "\"parameter\"")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Parameter {

    @Id
    @Column(name = "param_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paramId;

    @Column(name = "record_id")
    private int recordId;

    @Column(name = "param_type")
    private String paramType;

    @Column(name = "param_key")
    private String paramKey;

    @Column(name = "param_value")
    private String paramValue;

}
