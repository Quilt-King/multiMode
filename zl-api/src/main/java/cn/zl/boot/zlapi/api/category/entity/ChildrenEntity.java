package cn.zl.boot.zlapi.api.category.entity;

import cn.zl.boot.zlapi.api.category.dto.Goods;
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
@Data
public class ChildrenEntity implements Serializable {


    private Integer id;

    private String name;

    private String picture;

    private List<ChildrenEntity> children;
    private List<Goods> goods;

}
