package com.group2.phrmanager.vo;

import com.group2.phrmanager.entity.MedicineEntity;
import com.group2.phrmanager.unti.Page;

import java.util.List;

public class medicinePage {
    private List<MedicineEntity> medicine;
    private Page page;

    public List<MedicineEntity> getMedicine() {
        return medicine;
    }

    public void setMedicine(List<MedicineEntity> medicine) {
        this.medicine = medicine;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
