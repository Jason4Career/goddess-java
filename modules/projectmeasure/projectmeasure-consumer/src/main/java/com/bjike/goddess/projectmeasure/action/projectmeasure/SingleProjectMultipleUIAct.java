package com.bjike.goddess.projectmeasure.action.projectmeasure;

import com.bjike.goddess.common.api.entity.ADD;
import com.bjike.goddess.common.api.entity.EDIT;
import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.restful.Result;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.projectmeasure.api.SingleProjectMultipleUIAPI;
import com.bjike.goddess.projectmeasure.bo.SingleProjectMultipleUIBO;
import com.bjike.goddess.projectmeasure.dto.SingleProjectMultipleUIDTO;
import com.bjike.goddess.projectmeasure.to.SingleProjectMultipleUITO;
import com.bjike.goddess.projectmeasure.vo.SingleProjectMultipleUIVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 单个项目多个界面
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-03-23 10:51 ]
 * @Description: [  ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@RestController
@RequestMapping("smui")
public class SingleProjectMultipleUIAct {

    @Autowired
    private SingleProjectMultipleUIAPI singleProjectMultipleUIAPI;

    /**
     * 根据id查询单个项目多个界面
     *
     * @param id 单个项目多个界面唯一标识
     * @return class SingleProjectMultipleUIVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/smui/{id}")
    public Result findById(@PathVariable String id, HttpServletRequest request) throws ActException {
        try {
            SingleProjectMultipleUIBO bo = singleProjectMultipleUIAPI.findById(id);
            SingleProjectMultipleUIVO vo = BeanTransform.copyProperties(bo, SingleProjectMultipleUIVO.class, request);
            return ActResult.initialize(vo);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 计算总数量
     *
     * @param dto 单个项目多个界面dto
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/count")
    public Result count(@Validated SingleProjectMultipleUIDTO dto, BindingResult result) throws ActException {
        try {
            Long count = singleProjectMultipleUIAPI.count(dto);
            return ActResult.initialize(count);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 分页查询单个项目多个界面
     *
     * @param dto 单个项目多个界面传输对象
     * @return class SingleProjectMultipleUIVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/list")
    public Result list(@Validated SingleProjectMultipleUIDTO dto, BindingResult result, HttpServletRequest request) throws ActException {
        try {
            List<SingleProjectMultipleUIBO> boList = singleProjectMultipleUIAPI.list(dto);
            List<SingleProjectMultipleUIVO> voList = BeanTransform.copyProperties(boList, SingleProjectMultipleUIVO.class, request);
            return ActResult.initialize(voList);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 添加单个项目多个界面
     *
     * @param to 单个项目多个界面to信息
     * @return class SingleProjectMultipleUIVO
     * @throws ActException
     * @version v1
     */
    @PostMapping("v1/add")
    public Result add(@Validated({ADD.class}) SingleProjectMultipleUITO to, BindingResult result, HttpServletRequest request) throws ActException {
        try {
            SingleProjectMultipleUIBO bo = singleProjectMultipleUIAPI.save(to);
            SingleProjectMultipleUIVO vo = BeanTransform.copyProperties(bo, SingleProjectMultipleUIVO.class, request);
            return ActResult.initialize(vo);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 删除单个项目多个界面
     *
     * @param id 单个项目多个界面唯一标识
     * @throws ActException
     * @version v1
     */
    @DeleteMapping("v1/delete/{id}")
    public Result delete(@PathVariable String id) throws ActException {
        try {
            singleProjectMultipleUIAPI.remove(id);
            return new ActResult("delete success!");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 编辑单个项目多个界面
     *
     * @param to 单个项目多个界面to信息
     * @throws ActException
     * @version v1
     */
    @PutMapping("v1/edit")
    public Result edit(@Validated({EDIT.class}) SingleProjectMultipleUITO to, BindingResult result) throws ActException {
        try {
            singleProjectMultipleUIAPI.update(to);
            return new ActResult("edit success!");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

}