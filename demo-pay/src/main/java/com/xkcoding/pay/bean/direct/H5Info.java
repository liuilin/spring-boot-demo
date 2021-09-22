package com.xkcoding.pay.bean.direct;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author liuqiang
 * @since 2021-09-18
 */
@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class H5Info {
    private String type;
}
