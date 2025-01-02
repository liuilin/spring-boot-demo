package com.demo.rules;

import lombok.Data;

import java.math.BigDecimal;

/**
 * This class was automatically generated by the data modeler tool.
 *
 * @author liuqiang
 * @date 2024/12/13
 */

@Data
@org.kie.api.definition.type.Label("客户信息")
public class CustomerManager implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label("底薪")
    private BigDecimal basicSalary = new BigDecimal(0);
    @org.kie.api.definition.type.Label("担保业务提成")
    private BigDecimal guaranteeBiz = new BigDecimal(0);
    @org.kie.api.definition.type.Label("助贷业务提成")
    private BigDecimal assistanceBiz = new BigDecimal(0);
    @org.kie.api.definition.type.Label("无风险奖励")
    private BigDecimal riskFreeReward = new BigDecimal(0);
    @org.kie.api.definition.type.Label("ID")
    private Long id;
    @org.kie.api.definition.type.Label("姓名")
    private String name;
    @org.kie.api.definition.type.Label("月放款业绩")
    private BigDecimal monthlyLoan = new BigDecimal(0);
    @org.kie.api.definition.type.Label("助贷业务单量")
    private Integer assistanceNum;

    @org.kie.api.definition.type.Label("担保业务单量")
    private Integer guaranteeNum;

    @org.kie.api.definition.type.Label("总单量")
    private Integer totalNum;

    @org.kie.api.definition.type.Label("总收入")
    private BigDecimal grossIncome = new BigDecimal(0);

    @org.kie.api.definition.type.Label("明细")
    private java.util.List<SaleDtl> dtls;

}