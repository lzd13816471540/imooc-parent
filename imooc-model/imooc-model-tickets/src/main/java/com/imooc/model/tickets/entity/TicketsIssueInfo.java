package com.imooc.model.tickets.entity;

import lombok.Data;

import java.util.Date;

/**
 * 开期信息实体类
 */
@Data
public class TicketsIssueInfo {
    //主键id
    private Integer id;
    //彩种 10001:双色球  10003:七乐彩
    private String productType;
    //期号
    private String lotteryNo;
    //彩种图标
    private String lotteryIcon;
    //开期开始时间
    private Date startTime;
    //开期结束时间
    private Date endTime;
    //奖池金额
    private Long prizePool;
    //描述
    private String remark;
}
