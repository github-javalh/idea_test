/**
 * Copyright (C), 2015-2019, XXX有限公司
 * Description:
 * FileName: PageController
 * author：LH
 * date：Created in 2019/11/20
 * since 1.0.0
 * History:
 * <author>          <date>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.alipay.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 @author LH
 @create 2019-11-20
 @Description:com.alipay.web.controller
 @Version:1.0
 */
@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        System.out.println("page="+page);
        return  page;
    }

}
