package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.domain.Order;
import feign.Param;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author EiletXie
 * @Since 2020/3/18 21:16
 */
@Mapper
public interface OrderDao {
    /**
     * 1 新建订单
     * @param order
     * @return
     */
    int create(Order order);

    /**
     * 2 修改订单状态,从0改为1
     * @param userId
     * @param status
     * @return
     */
    int update(@Param("userId") Long userId, @Param("status") Integer status);
}