package com.group2.phrmanager.dao;


import com.group2.phrmanager.entity.AdviceEntity;
import com.group2.phrmanager.service.AdviceService;
import com.group2.phrmanager.unti.Page;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdviceDao {

    boolean add(AdviceEntity advice);

    boolean delete(String title);

    AdviceEntity find(String title);

    List<AdviceEntity> findAll();

    /* 获取资讯内容*/
    String getBody();

    /**
     * 查询未审核的资讯state = 0,1,2(0为未审核，1为通过，2为不通过)
     */
    List<AdviceEntity> selectInformationState0();

    boolean update(AdviceEntity newInfo);

    /**
     * 修改资讯审核状态
     */
    boolean updateInformationState(String informationNum);

    int selectAdviceCount();

    List<AdviceEntity> selectAdviceByPage(Page page);

    AdviceEntity selectAdviceById(String h_id);

}
