package com.fnap.ChargeOnline.Entity;

import com.fnap.ChargeOnline.base.Entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "T_APPLICATION_SETTINGS")
public class ApplicationSettingsEntity extends BaseEntity {

    @Id
    @Column(name = "C_KEY", nullable = false, unique = true)
    private String key;

    @Column(name = "C_VALUE")
    private String value;

    @Column(name = "C_DESCRIPTION")
    private String description;

    @Override
    @Transient
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {}

}
