package com.group2.phrmanager.dao;



import com.group2.phrmanager.entity.MedicineEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
<<<<<<< HEAD

=======
>>>>>>> origin/master
@Repository
public interface DrugDao {
    boolean add(MedicineEntity drug);

    boolean delete(String med_name);

    List<MedicineEntity> find(String med_name);

    List<MedicineEntity> findSome();

    boolean update(MedicineEntity newInfo);
}
