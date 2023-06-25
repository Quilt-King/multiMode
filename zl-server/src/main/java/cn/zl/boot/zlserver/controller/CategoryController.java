package cn.zl.boot.zlserver.controller;

import cn.zl.boot.zlapi.api.category.dto.CategoryDto;
import cn.zl.boot.zlapi.api.category.dto.ChildrenDto;
import cn.zl.boot.zlapi.api.category.dto.Goods;
import cn.zl.boot.zlapi.api.category.entity.CategoryEntity;
import cn.zl.boot.zlapi.api.category.entity.ChildrenEntity;
import cn.zl.boot.zlapi.api.homeBanner.HomeBanner;
import cn.zl.boot.zlapi.mapper.category.CategoryDtoMapper;
import cn.zl.boot.zlapi.mapper.category.ChildrenDtoMapper;
import cn.zl.boot.zlapi.mapper.category.GoodsMapper;
import cn.zl.boot.zlapi.mapper.homeBanner.HomeBannerMapper;
import cn.zl.boot.zlapi.response.BaseResponse;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author zcy
 * @version 1.0.0
 * @date 2023/5/5 20:58
 * @description:
 */
@RestController
@RequestMapping("/layout")
@Slf4j
@CrossOrigin
@Tag(name = "分类接口")
public class CategoryController {
    @Resource
    CategoryDtoMapper categoryDtoMapper;
    @Resource
    ChildrenDtoMapper childrenDtoMapper;
    @Resource
    GoodsMapper goodsMapper;
    @Resource
    HomeBannerMapper homeBannerMapper;

    @GetMapping("/getCategoryNames")
    public BaseResponse getCategoryNames() {
        log.info("收到分类请求");
        BaseResponse baseResponse = new BaseResponse();
        List<ChildrenEntity> childrenEntityList = new ArrayList<ChildrenEntity>();
        List<Goods> goodsList = new ArrayList<Goods>();
        List<CategoryDto> categoryDtos = categoryDtoMapper.selectList(null);
        ArrayList<CategoryEntity> categoryEntities = new ArrayList<>();
        categoryDtos.forEach((categoryDto) -> {
//            List<ChildrenEntity> childrenEntityList = new ArrayList<ChildrenEntity>();
//            List<Goods> goodsList = new ArrayList<Goods>();
            ChildrenDto childrenDto = childrenDtoMapper.selectById(categoryDto.getChildrenId());
            Goods goods = goodsMapper.selectById(categoryDto.getGoodsId());

            ChildrenEntity childrenEntity = new ChildrenEntity();
            childrenEntity.setId(childrenDto.getId());
            childrenEntity.setName(childrenDto.getName());
            childrenEntity.setPicture(childrenDto.getPicture());
            goodsList.add(goods);
            childrenEntity.setGoods(goodsList);
            CategoryEntity categoryEntity = new CategoryEntity();
            categoryEntity.setId(categoryDto.getId());
            categoryEntity.setName(categoryDto.getName());
            categoryEntity.setPicture(categoryDto.getPicture());
            childrenEntityList.add(childrenEntity);
            categoryEntity.setChildren(childrenEntityList);
            categoryEntity.setGoods(goodsList);
            categoryEntities.add(categoryEntity);
        });
        baseResponse.setCode(200);
        baseResponse.setResult(categoryEntities);
        log.info("返回值为：" + baseResponse);
        return baseResponse;
    }
    @GetMapping("/getHomeBanner")
    public BaseResponse getHomeBanner() {
        log.info("收到getHomeBanner请求");
        BaseResponse baseResponse = new BaseResponse();
        List<HomeBanner> homeBanners = homeBannerMapper.selectList(null);
        baseResponse.setCode(200);
        baseResponse.setResult(homeBanners);
        log.info("返回值为：" + baseResponse);
        return baseResponse;
    }
}
