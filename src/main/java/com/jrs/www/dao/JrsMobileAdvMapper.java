package com.jrs.www.dao;

import com.jrs.www.po.JrsMobileAdv;
import java.util.List;

public interface JrsMobileAdvMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrs_mobile_adv
     *
     * @mbg.generated Mon Jun 04 17:56:27 GMT+08:00 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrs_mobile_adv
     *
     * @mbg.generated Mon Jun 04 17:56:27 GMT+08:00 2018
     */
    int insert(JrsMobileAdv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrs_mobile_adv
     *
     * @mbg.generated Mon Jun 04 17:56:27 GMT+08:00 2018
     */
    JrsMobileAdv selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrs_mobile_adv
     *
     * @mbg.generated Mon Jun 04 17:56:27 GMT+08:00 2018
     */
    List<JrsMobileAdv> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrs_mobile_adv
     *
     * @mbg.generated Mon Jun 04 17:56:27 GMT+08:00 2018
     */
    int updateByPrimaryKey(JrsMobileAdv record);
}