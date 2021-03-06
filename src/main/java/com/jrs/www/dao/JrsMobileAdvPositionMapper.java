package com.jrs.www.dao;

import com.jrs.www.po.JrsMobileAdvPosition;
import java.util.List;

public interface JrsMobileAdvPositionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrs_mobile_adv_position
     *
     * @mbg.generated Fri Jun 01 16:07:07 GMT+08:00 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrs_mobile_adv_position
     *
     * @mbg.generated Fri Jun 01 16:07:07 GMT+08:00 2018
     */
    int insert(JrsMobileAdvPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrs_mobile_adv_position
     *
     * @mbg.generated Fri Jun 01 16:07:07 GMT+08:00 2018
     */
    JrsMobileAdvPosition selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrs_mobile_adv_position
     *
     * @mbg.generated Fri Jun 01 16:07:07 GMT+08:00 2018
     */
    List<JrsMobileAdvPosition> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrs_mobile_adv_position
     *
     * @mbg.generated Fri Jun 01 16:07:07 GMT+08:00 2018
     */
    int updateByPrimaryKey(JrsMobileAdvPosition record);
}