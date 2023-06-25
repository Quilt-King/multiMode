package cn.zl.boot.zlapi.api.category.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author zcy
 * @since 2023-06-24
 */
@Data
@TableName("goods")
@Schema(name = "Goods对象", description = "")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @SchemaProperty(name = "分类名称")
    private String name;

    @SchemaProperty(name = "图片")
    private String picture;

    @SchemaProperty(name = "描述")
    private String description;

    @SchemaProperty(name = "价格")
    private BigDecimal price;

    @SchemaProperty(name = "折扣")
    private String discount;

    @SchemaProperty(name = "销量")
    private Integer orderNum;
}
