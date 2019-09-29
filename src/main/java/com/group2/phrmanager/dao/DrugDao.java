package com.group2.phrmanager.dao;



import com.group2.phrmanager.entity.MedicineEntity;

import java.util.List;

public interface DrugDao {
    boolean add(MedicineEntity drug);

    boolean delete(String med_name);

    MedicineEntity find(String med_name);

    List<MedicineEntity> findAll();

    boolean update(MedicineEntity newInfo);
}
