package com.fnap.ChargeOnline.dataaccess;

import com.fnap.ChargeOnline.Entity.ApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplicationRepository extends JpaRepository<ApplicationEntity,Long> {

    ApplicationEntity findByCode(Integer code);


    default ApplicationEntity findBycode(Integer code){
        List<ApplicationEntity> list = (List<ApplicationEntity>) findByCode(code);
        return list.get(0);
    }
}
