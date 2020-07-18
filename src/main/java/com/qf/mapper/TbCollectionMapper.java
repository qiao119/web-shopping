package com.qf.mapper;

import com.qf.pojo.TbCollection;
import com.qf.pojo.TbCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TbCollectionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_collection
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    long countByExample(TbCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_collection
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int deleteByExample(TbCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_collection
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int insert(TbCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_collection
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int insertSelective(TbCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_collection
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    List<TbCollection> selectByExample(TbCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_collection
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbCollection record, @Param("example") TbCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_collection
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int updateByExample(@Param("record") TbCollection record, @Param("example") TbCollectionExample example);
}