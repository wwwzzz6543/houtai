package cn.itsource.controller;

import cn.itsource.basic.util.AjaxResult;
import cn.itsource.domain.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

//    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @PostMapping("/login")
    @ResponseBody
    @ApiOperation("登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "登录信息",value = "user")
    })
    public AjaxResult login(@RequestBody User user){
        System.out.println(user);
        String username = user.getUsername();
        String password = user.getPassword();
        if("admin".equals(username)&&"admin".equals(password)){
            return AjaxResult.result().setSuccess(true).setMessage("登录成功!").setRestObj(user);
        }
        return AjaxResult.result().setSuccess(false).setMessage("登录失败!");
    }
}
