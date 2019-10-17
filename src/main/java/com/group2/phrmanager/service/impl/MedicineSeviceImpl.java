package com.group2.phrmanager.service.impl;

import com.group2.phrmanager.dao.DrugDao;
import com.group2.phrmanager.entity.MedicineEntity;
import com.group2.phrmanager.service.MedicineService;
import com.group2.phrmanager.unti.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineSeviceImpl implements MedicineService {

    @Autowired
    DrugDao drugDao;

    @Override
    public List<MedicineEntity> getAllMedicine() {
        return drugDao.findSome();
    }

    @Override
    public int getMedicineCount() {
        return drugDao.selectMedicineCount();
    }

    @Override
    public List<MedicineEntity> getAllMedicineByPage(Page page) {
        return drugDao.selectMedicineByPage(page);
    }

    @Override
    public MedicineEntity getMedicineDetails(String med_id) {
        return drugDao.selectMedicineByMedid(med_id);
    }
}
