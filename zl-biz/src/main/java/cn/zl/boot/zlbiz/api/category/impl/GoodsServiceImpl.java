package cn.zl.boot.zlbiz.api.category.impl;

import cn.zl.boot.zlapi.api.category.dto.Goods;
import cn.zl.boot.zlapi.mapper.category.GoodsMapper;
import cn.zl.boot.zlapi.service.category.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zcy
 * @since 2023-06-24
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

}
