package com.mayikt.conntroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Map;

@Controller
public class FreemakeConntroller {

    @RequestMapping("/freemakeIndex")
    public String freemakeIndex(Map<String,Object> result, HttpServletRequest request){
        result.put("name","大鹅");
        result.put("data","哈哈哈啊哈哈");
        result.put("sex","0");
        result.put("age",19);
        ArrayList<String> list= new ArrayList<>();
        list.add("谨防电信诈骗");
        list.add("新闻的");
        result.put("list",list);
        return "freemakeIndex";
    }
}
