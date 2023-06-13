package com.sbl.microservice_project.ms_stock.entities;

import com.sbl_commons.entities.BaseEntity;
import lombok.*;

import javax.persistence.Entity;

@Entity
//lombok annotation
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Stock extends BaseEntity {
    private String adresse;

}
