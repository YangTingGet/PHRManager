package com.group2.phrmanager.dao;


import com.group2.phrmanager.entity.ABSEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
<<<<<<< HEAD


=======
@Repository
>>>>>>> origin/master
public interface AbsDao {
    boolean add(ABSEntity abs);

    boolean delete(String absNumber);

    ABSEntity find(String absNumber);

    List<ABSEntity> findAll();

    void update(ABSEntity newInfo);

    boolean updateNotes(String notes,String userName);

    boolean doRemark(String remarks,String userName);
}
