package cn.zl.boot.zlapi.api.category.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author zcy
 * @since 2023-06-24
 */
@TableName("category_dto")
@Schema(name = "CategoryDto对象", description = "")
@Data
public class CategoryDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @SchemaProperty(name = "分类名称")
    private String name;

    @SchemaProperty(name = "图片")
    private String picture;

    @SchemaProperty(name = "外键")
    private Integer childrenId;
    @SchemaProperty(name = "货物外键")
    private Integer goodsId;
}
