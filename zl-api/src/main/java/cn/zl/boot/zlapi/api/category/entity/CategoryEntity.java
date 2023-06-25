package cn.zl.boot.zlapi.api.category.entity;

import cn.zl.boot.zlapi.api.category.dto.Goods;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.util.List;

/**
 * @author zcy
 * @version 1.0.0
 * @date 2023/6/25 19:50
 * @description:
 */
@Data
public class CategoryEntity {
    private Integer id;

    private String name;

    private String picture;

    private List<ChildrenEntity> children;
    private List<Goods> goods;


}
