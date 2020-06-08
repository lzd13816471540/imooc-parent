package com.imooc.model.tickets.entity;

import lombok.Data;

import java.util.Date;

/**
 * 开奖信息表
 */
@Data
public class TicketsOpenInfo {
    //主键
    private Integer id;
    //彩种
    private String lotteryType;
    //期号
    private String lotteryNo;
    //期截止时间
    private Date lotteryEndTime;
    //开奖日期
    private Date openDate;
    //开奖号码
    private String openNums;
    //特殊号码
    private String specialNum;
    //本期销售金额
    private Long totalSalesAmt;
    //奖池金额
    private Long poolAmt;
    //描述
    private String remark;
}
