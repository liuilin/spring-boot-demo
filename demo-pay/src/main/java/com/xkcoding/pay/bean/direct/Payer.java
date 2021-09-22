package com.xkcoding.pay.bean.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Payer {

    @JsonProperty("openid")
    private String openId;

}
