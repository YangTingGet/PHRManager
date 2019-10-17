package com.group2.phrmanager.dao;



import com.group2.phrmanager.entity.MedicineEntity;
import com.group2.phrmanager.unti.Page;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrugDao {
    boolean add(MedicineEntity drug);

    boolean delete(String med_name);

    List<MedicineEntity> find(String med_name);

    List<MedicineEntity> findSome();

    boolean update(MedicineEntity newInfo);

    int selectMedicineCount();

    List<MedicineEntity> selectMedicineByPage(Page page);

    MedicineEntity selectMedicineByMedid(String med_id);
}
