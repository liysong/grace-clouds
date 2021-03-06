package com.grace.admin.service;

import com.grace.admin.po.SysDicItem;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
public interface ISysDicItemService extends IService<SysDicItem> {


    List<SysDicItem> selectSysDicItemList(String groupId);



}
