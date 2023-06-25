package cn.zl.boot.zlbiz.api.category.impl;

import cn.zl.boot.zlapi.api.category.dto.CategoryDto;
import cn.zl.boot.zlapi.api.user.dto.User;
import cn.zl.boot.zlapi.mapper.category.CategoryDtoMapper;
import cn.zl.boot.zlapi.mapper.user.UserMapper;
import cn.zl.boot.zlapi.service.category.ICategoryDtoService;
import cn.zl.boot.zlapi.service.user.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zcy
 * @since 2023-05-08
 */
@Service
public class CategoryDtoServiceImpl extends ServiceImpl<CategoryDtoMapper, CategoryDto> implements ICategoryDtoService {

}
