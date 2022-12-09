package com.fastcampus.pass.entity.user;

import com.fastcampus.pass.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {
    @Id
    @Column(updatable = false, nullable = false)
    private String userId;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String status;

    private String phone;
    private String meta;
}
