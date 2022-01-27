package io.github.wangrangzhi.processdefinition.controller;

import io.github.wangrangzhi.processdefinition.dto.controllerUse.InsertUserDto;
import io.github.wangrangzhi.processdefinition.dto.controllerUse.ResultDto;
import io.github.wangrangzhi.processdefinition.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev-api/vue-admin-template/user")

@Slf4j
public class ProcessController {

//    @ApiOperation("启动流程")
//    @PostMapping("/startProcess")
//    public ResultInfo startProcess(@RequestBody ProcessRequestDto processRequestDto) {
//        return newProcessService.startProcess(processRequestDto);
//    }
//
//    @ApiOperation("执行流程")
//    @PostMapping("/executionProcess")
//    public ResultInfo executionProcess(@RequestBody ProcessRequestDto processRequestDto) {
//        return newProcessService.executionProcess(processRequestDto);
//    }
//
//    @ApiOperation("查询所有节点+已办")
//    @PostMapping("/findAllNodes")
//    public ResultInfo findAllNodes(@RequestBody ProcessRequestDto processRequestDto) {
//        return newProcessService.findAllNodes(processRequestDto);
//    }
//
//    @ApiOperation("查看节点审批详情")
//    @PostMapping("/findByJobIdAndNodeName")
//    public ResultInfo findByJobIdAndNodeName(@RequestBody ProcessRequestDto processRequestDto) {
//        return newProcessService.findByJobIdAndNodeName(processRequestDto);
//    }
//
//    @ApiOperation("查询待办数量")
//    @PostMapping("/findToDoListCount")
//    public ResultInfo findToDoListCount(@RequestHeader(value = "X-AUTH-ID") String authorizationHeader) {
//        return newProcessService.findToDoListCount(authorizationHeader);
//    }
//
//    @ApiOperation("查询待办列表")
//    @PostMapping("/findToDoList")
//    public ResultInfo findToDoList(@RequestBody ToDoProcessVO toDoProcessVO, @RequestHeader(value = "X-AUTH-ID") String authorizationHeader) {
//        return newProcessService.findToDoListPage(toDoProcessVO, authorizationHeader);
//    }
//
//
//    @ApiOperation("查询已办数量")
//    @PostMapping("/findFinishListCount")
//    public ResultInfo findFinishListCount(@RequestHeader(value = "X-AUTH-ID") String authorizationHeader) {
//        return newProcessService.findFinishListCount(authorizationHeader);
//    }
//
//    @ApiOperation("查询已办列表")
//    @PostMapping("/findFinishListPage")
//    public ResultInfo findFinishListPage(@RequestBody ToDoProcessVO toDoProcessVO, @RequestHeader(value = "X-AUTH-ID") String authorizationHeader) {
//        return newProcessService.findFinishListPage(toDoProcessVO, authorizationHeader);
//    }
//
//    @ApiOperation("判断采样时间是否超时")
//    @PostMapping("/isSamplingOverTime")
//    public ResultInfo isSamplingOverTime(@RequestHeader(value = "X-AUTH-ID") String authorizationHeader) {
//        return newProcessService.isSamplingOverTime(authorizationHeader);
//    }
}
