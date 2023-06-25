package cn.zl.boot.zlapi.api.user.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author zcy
 * @since 2023-05-08
 */
@Schema(name = "User对象", description = "")
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "主键ID")
    private Long id;

    @Schema(name = "姓名")
    private String name;

    @Schema(name = "年龄")
    private Integer age;

    @Schema(name = "邮箱")
    private String email;
}
