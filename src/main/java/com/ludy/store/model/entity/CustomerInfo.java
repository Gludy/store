package com.ludy.store.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInfo {
    /**
     * 用户id
     */
    private String customerNo;
    /**
     * 性别
     */
    private Boolean sex;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 微信openId
     */
    private String vxOpenId;
    /**
     * 会员编号
     */
    private String vipNo;
    /**
     * 有效位
     */
    private Boolean isEnabled;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}