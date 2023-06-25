package cn.zl.boot.zlapi.request;

import lombok.Data;

/**
 * @author zcy
 * @version 1.0.0
 * @date 2023/6/24 18:23
 * @description:
 */
@Data
public class BaseRequest {
    private Integer code;
    private String  errorMsg;
    private Object result;
}
