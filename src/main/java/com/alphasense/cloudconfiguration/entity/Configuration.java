package com.alphasense.cloudconfiguration.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "\"configuration\"")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Configuration {

    @Id
    @Column(name = "record_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recordId;

    @Column(name = "cloud_provider")
    private String cloudProvider;

    @Column(name = "created_at")
    private Timestamp createdAt;
}
