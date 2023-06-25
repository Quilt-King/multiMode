package cn.zl.boot.zlbiz.api.user.impl;

import cn.zl.boot.zlapi.api.user.dto.User;
import cn.zl.boot.zlapi.mapper.user.UserMapper;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
