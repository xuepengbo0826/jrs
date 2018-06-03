package com.jrs.www.dao;

import com.jrs.www.po.JrsMatchInformation;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface JrsMatchInformationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrs_match_information
     *
     * @mbg.generated Fri Jun 01 16:07:07 GMT+08:00 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrs_match_information
     *
     * @mbg.generated Fri Jun 01 16:07:07 GMT+08:00 2018
     */
    int insert(JrsMatchInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrs_match_information
     *
     * @mbg.generated Fri Jun 01 16:07:07 GMT+08:00 2018
     */
    JrsMatchInformation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrs_match_information
     *
     * @mbg.generated Fri Jun 01 16:07:07 GMT+08:00 2018
     */
    List<JrsMatchInformation> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrs_match_information
     *
     * @mbg.generated Fri Jun 01 16:07:07 GMT+08:00 2018
     */
    int updateByPrimaryKey(JrsMatchInformation record);
}