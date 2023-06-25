package cn.zl.boot.zlapi.api.homeBanner;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zcy
 * @since 2023-06-25
 */
@TableName("home_banner")
@Schema(name = "HomeBanner对象", description = "")
public class HomeBanner implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String imgUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "HomeBanner{" +
            "id = " + id +
            ", imgUrl = " + imgUrl +
        "}";
    }
}
