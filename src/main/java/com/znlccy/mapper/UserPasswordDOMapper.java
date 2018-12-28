package com.znlccy.mapper;

import com.znlccy.model.UserPasswordDO;
import com.znlccy.model.UserPasswordDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPasswordDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Fri Dec 28 17:01:29 CST 2018
     */
    long countByExample(UserPasswordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Fri Dec 28 17:01:29 CST 2018
     */
    int deleteByExample(UserPasswordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Fri Dec 28 17:01:29 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Fri Dec 28 17:01:29 CST 2018
     */
    int insert(UserPasswordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Fri Dec 28 17:01:29 CST 2018
     */
    int insertSelective(UserPasswordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Fri Dec 28 17:01:29 CST 2018
     */
    List<UserPasswordDO> selectByExample(UserPasswordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Fri Dec 28 17:01:29 CST 2018
     */
    UserPasswordDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Fri Dec 28 17:01:29 CST 2018
     */
    int updateByExampleSelective(@Param("record") UserPasswordDO record, @Param("example") UserPasswordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Fri Dec 28 17:01:29 CST 2018
     */
    int updateByExample(@Param("record") UserPasswordDO record, @Param("example") UserPasswordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Fri Dec 28 17:01:29 CST 2018
     */
    int updateByPrimaryKeySelective(UserPasswordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Fri Dec 28 17:01:29 CST 2018
     */
    int updateByPrimaryKey(UserPasswordDO record);
}