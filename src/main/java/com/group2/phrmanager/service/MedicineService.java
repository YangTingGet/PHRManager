package com.group2.phrmanager.service;

import com.group2.phrmanager.entity.MedicineEntity;
import com.group2.phrmanager.unti.Page;

import java.util.List;

public interface MedicineService {
    List<MedicineEntity> getAllMedicine();

    int getMedicineCount();

    List<MedicineEntity>  getAllMedicineByPage(Page page);

    MedicineEntity getMedicineDetails(String med_id);
}
