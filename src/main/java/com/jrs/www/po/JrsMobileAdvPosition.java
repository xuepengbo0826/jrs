package com.jrs.www.po;

public class JrsMobileAdvPosition {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jrs_mobile_adv_position.id
     *
     * @mbg.generated Tue Jun 05 17:24:15 GMT+08:00 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jrs_mobile_adv_position.adv_position_type_id
     *
     * @mbg.generated Tue Jun 05 17:24:15 GMT+08:00 2018
     */
    private Integer advPositionTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jrs_mobile_adv_position.adv_position
     *
     * @mbg.generated Tue Jun 05 17:24:15 GMT+08:00 2018
     */
    private String advPosition;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jrs_mobile_adv_position.id
     *
     * @return the value of jrs_mobile_adv_position.id
     *
     * @mbg.generated Tue Jun 05 17:24:15 GMT+08:00 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jrs_mobile_adv_position.id
     *
     * @param id the value for jrs_mobile_adv_position.id
     *
     * @mbg.generated Tue Jun 05 17:24:15 GMT+08:00 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jrs_mobile_adv_position.adv_position_type_id
     *
     * @return the value of jrs_mobile_adv_position.adv_position_type_id
     *
     * @mbg.generated Tue Jun 05 17:24:15 GMT+08:00 2018
     */
    public Integer getAdvPositionTypeId() {
        return advPositionTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jrs_mobile_adv_position.adv_position_type_id
     *
     * @param advPositionTypeId the value for jrs_mobile_adv_position.adv_position_type_id
     *
     * @mbg.generated Tue Jun 05 17:24:15 GMT+08:00 2018
     */
    public void setAdvPositionTypeId(Integer advPositionTypeId) {
        this.advPositionTypeId = advPositionTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jrs_mobile_adv_position.adv_position
     *
     * @return the value of jrs_mobile_adv_position.adv_position
     *
     * @mbg.generated Tue Jun 05 17:24:15 GMT+08:00 2018
     */
    public String getAdvPosition() {
        return advPosition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jrs_mobile_adv_position.adv_position
     *
     * @param advPosition the value for jrs_mobile_adv_position.adv_position
     *
     * @mbg.generated Tue Jun 05 17:24:15 GMT+08:00 2018
     */
    public void setAdvPosition(String advPosition) {
        this.advPosition = advPosition;
    }
}