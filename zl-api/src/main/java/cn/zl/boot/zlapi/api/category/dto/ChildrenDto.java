package cn.zl.boot.zlapi.api.category.dto;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;

/**
 * <p>
 *
 * </p>
 *
 * @author zcy
 * @since 2023-06-24
 */
@TableName("children_dto")
@Schema(name = "ChildrenDto对象", description = "")
public class ChildrenDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @SchemaProperty(name = "分类名称")
    private String name;

    @SchemaProperty(name = "图片")
    private String picture;

    private Integer goodId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    @Override
    public String toString() {
        return "ChildrenDto{" +
                "id = " + id +
                ", name = " + name +
                ", picture = " + picture +
                ", goodId = " + goodId +
                "}";
    }
}
