package io.github.wangrangzhi.maillist.dao;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Thu Jan 27 11:35:44 CST 2022
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbg.generated Thu Jan 27 11:35:44 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phone
     *
     * @mbg.generated Thu Jan 27 11:35:44 CST 2022
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbg.generated Thu Jan 27 11:35:44 CST 2022
     */
    private Integer sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.insertdata
     *
     * @mbg.generated Thu Jan 27 11:35:44 CST 2022
     */
    private Date insertdata;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.remark
     *
     * @mbg.generated Thu Jan 27 11:35:44 CST 2022
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Thu Jan 27 11:35:44 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Thu Jan 27 11:35:44 CST 2022
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbg.generated Thu Jan 27 11:35:44 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbg.generated Thu Jan 27 11:35:44 CST 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phone
     *
     * @return the value of user.phone
     *
     * @mbg.generated Thu Jan 27 11:35:44 CST 2022
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phone
     *
     * @param phone the value for user.phone
     *
     * @mbg.generated Thu Jan 27 11:35:44 CST 2022
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbg.generated Thu Jan 27 11:35:44 CST 2022
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sex
     *
     * @param sex the value for user.sex
     *
     * @mbg.generated Thu Jan 27 11:35:44 CST 2022
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.insertdata
     *
     * @return the value of user.insertdata
     *
     * @mbg.generated Thu Jan 27 11:35:44 CST 2022
     */
    public Date getInsertdata() {
        return insertdata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.insertdata
     *
     * @param insertdata the value for user.insertdata
     *
     * @mbg.generated Thu Jan 27 11:35:44 CST 2022
     */
    public void setInsertdata(Date insertdata) {
        this.insertdata = insertdata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.remark
     *
     * @return the value of user.remark
     *
     * @mbg.generated Thu Jan 27 11:35:44 CST 2022
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.remark
     *
     * @param remark the value for user.remark
     *
     * @mbg.generated Thu Jan 27 11:35:44 CST 2022
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}