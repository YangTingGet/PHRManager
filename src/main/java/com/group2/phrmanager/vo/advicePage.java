package com.group2.phrmanager.vo;

import com.group2.phrmanager.entity.AdviceEntity;
import com.group2.phrmanager.unti.Page;

import java.util.List;

public class advicePage {
    private List<AdviceEntity> advice;
    private Page page;

    public List<AdviceEntity> getAdvice() {
        return advice;
    }

    public void setAdvice(List<AdviceEntity> advice) {
        this.advice = advice;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
