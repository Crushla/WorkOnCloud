package com.crush.server.service.impl;

import com.crush.server.pojo.Position;
import com.crush.server.mapper.PositionMapper;
import com.crush.server.service.IPositionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author crush
 * @since 2021-12-29
 */
@Service
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements IPositionService {

}
