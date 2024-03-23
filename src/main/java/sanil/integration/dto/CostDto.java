package sanil.integration.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
public class CostDto {
    @JsonProperty("charge_ROV")
    private Integer chargeRov;

    @JsonProperty("charge_REATTEMPT")
    private Integer chargeReattempt;

    @JsonProperty("charge_RTO")
    private Integer chargeRto;

    @JsonProperty("charge_MPS")
    private Integer chargeMPS;

    @JsonProperty("charge_PICKUP")
    private Integer chargePickup;

    @JsonProperty("charge_CWH")
    private Integer chargeCwh;

    @JsonProperty("tax_data")
    private TaxDataDto taxData;

    @JsonProperty("charge_DEMUR")
    private Integer chargeDemur;

    @JsonProperty("charge_AWB")
    private Integer chargeAwb;

    @JsonProperty("zone")
    private String zone;

    @JsonProperty("wt_rule_id")
    private Integer wtRuleId;

    @JsonProperty("charge_AIR")
    private Integer chargeAir;

    @JsonProperty("charge_FSC")
    private Integer chargeFsc;

    @JsonProperty("charge_LABEL")
    private Integer chargeLabel;

    @JsonProperty("charge_COD")
    private Integer chargeCod;

    @JsonProperty("status")
    private String status;

    @JsonProperty("charge_POD")
    private Integer chargePod;

    @JsonProperty("adhoc_data")
    private Map<String, String> adhocData;

    @JsonProperty("charge_CCOD")
    private Integer chargeCcod;

    @JsonProperty("gross_amount")
    private Integer grossAmount;

    @JsonProperty("charge_DTO")
    private Integer chargeDto;

    @JsonProperty("charge_COVID")
    private Integer chargeCovid;

    @JsonProperty("zonal_cl")
    private String zonalCl;

    @JsonProperty("charge_DL")
    private Integer chargeDl;

    @JsonProperty("total_amount")
    private Integer totalAmount;

    @JsonProperty("charge_DPH")
    private Integer chargeDph;

    @JsonProperty("charge_FOD")
    private Integer chargeFod;

    @JsonProperty("charge_DOCUMENT")
    private Integer chargeDocument;

    @JsonProperty("charge_WOD")
    private Integer chargeWod;

    @JsonProperty("charge_INS")
    private Integer chargeIns;

    @JsonProperty("charge_FS")
    private Integer chargeFs;

    @JsonProperty("charge_CNC")
    private Integer chargeCnc;

    @JsonProperty("charge_FOV")
    private Integer chargeFov;

    @JsonProperty("charge_QC")
    private Integer chargeQc;

    @JsonProperty("charged_weight")
    private Integer chargedWeight;
}
