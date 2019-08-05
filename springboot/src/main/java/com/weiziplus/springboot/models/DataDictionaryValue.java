package com.weiziplus.springboot.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.weiziplus.springboot.base.Column;
import com.weiziplus.springboot.base.Id;
import com.weiziplus.springboot.base.Table;
import lombok.Data;

import java.io.Serializable;

/**
 * 数据字典值
 * data_dictionary_value
 * @author WeiziPlus
 * @date 2019-08-05 09:52:05
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Table("data_dictionary_value")
public class DataDictionaryValue implements Serializable {
    /**
     * 自增
     */
    @Id("id")
    private Long id;

    /**
     * 字典编号
     */
    @Column("dictionary_code")
    private String dictionaryCode;

    /**
     * 名称
     */
    @Column("name")
    private String name;

    /**
     * 值
     */
    @Column("value")
    private String value;

    /**
     * 备注
     */
    @Column("remark")
    private String remark;

    /**
     * 排序
     */
    @Column("order")
    private Integer order;

    /**
     * 创建时间
     */
    @Column("create_time")
    private String createTime;

    private static final long serialVersionUID = 1L;
}