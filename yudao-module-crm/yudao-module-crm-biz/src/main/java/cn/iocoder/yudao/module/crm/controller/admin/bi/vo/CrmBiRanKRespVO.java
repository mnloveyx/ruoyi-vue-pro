package cn.iocoder.yudao.module.crm.controller.admin.bi.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


@Schema(description = "管理后台 - CRM BI 排行榜 Response VO")
@Data
public class CrmBiRanKRespVO {

    @Schema(description = "负责人编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    private Long ownerUserId;

    @Schema(description = "姓名", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    private String nickname;

    @Schema(description = "部门名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    private String deptName;

    /**
     * 数量是个特别“抽象”的概念，在不同排行下，代表不同含义
     *
     * 1. 金额：合同金额排行、回款金额排行
     * 2. 个数：签约合同排行、产品销量排行、产品销量排行、新增客户数排行、新增联系人排行、跟进次数排行、跟进客户数排行
     */
    @Schema(description = "数量", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    private Integer count;

}
