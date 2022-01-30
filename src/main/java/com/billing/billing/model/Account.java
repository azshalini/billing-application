package com.billing.billing.model;

import java.util.Date;

import lombok.*;

import javax.persistence.*;
import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="az_acct")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String acctId;

    @Column(name = "descr")
    private String description;

    @Column(name="entity_id")
    private String entityId;

    @Column(name = "start_dt")
    private Date startDate;

    @Column(name = "end_dt")
    private Date endDate;

    @Column(name = "active_sw")
    private boolean activeSwitch;
}
