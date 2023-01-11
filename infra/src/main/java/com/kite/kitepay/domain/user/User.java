package com.kite.kitepay.domain.user;


import com.kite.kitepay.base.BaseEntity;
import org.hibernate.annotations.Comment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "user", schema = "user",
        uniqueConstraints = @UniqueConstraint(name = "UK_email", columnNames = "email"))
public class User extends BaseEntity {

    @Comment("유저 계정 이메일")
    @Column(name = "email", nullable = false, updatable = false, columnDefinition = "VARCHAR(255)")
    private String email;

    @Comment("유저 계정 비밀번호")
    @Column(name = "password", nullable = false, columnDefinition = "VARCHAR(255)")
    private String password;
}
