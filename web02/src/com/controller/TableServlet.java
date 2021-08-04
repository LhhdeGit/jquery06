package com.controller;

import com.alibaba.fastjson.JSON;
import com.bean.Table;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "TableServlet",urlPatterns = "/TableServlet")
public class TableServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");

        List<Table> tables = new ArrayList<>();
        //创建对象
        Table t1 = new Table();
        t1.setName("张三");
        t1.setAge(15);
        t1.setBj("15网络");
        tables.add(t1);

        Table t2 = new Table();
        t2.setName("李四");
        t2.setAge(22);
        t2.setBj("17软件");
        tables.add(t2);

        Table t3 = new Table();
        t3.setName("王五");
        t3.setAge(33);
        t3.setBj("16信息");
        tables.add(t3);

        Table t4 = new Table();
        t4.setName("叫兽");
        t4.setAge(21);
        t4.setBj("15网络");
        tables.add(t4);

        Table t5 = new Table();
        t5.setName("大娃");
        t5.setAge(30);
        t5.setBj("17软件");
        tables.add(t5);

        Table t6 = new Table();
        t6.setName("二娃");
        t6.setAge(22);
        t6.setBj("18大数据");
        tables.add(t6);

        Table t7 = new Table();
        t7.setName("三娃");
        t7.setAge(23);
        t7.setBj("19网管");
        tables.add(t7);

        Table t8 = new Table();
        t8.setName("四娃");
        t8.setAge(24);
        t8.setBj("15网络");
        tables.add(t8);
        Table t9 = new Table();
        t9.setName("五娃");
        t9.setAge(25);
        t9.setBj("18大数据");
        tables.add(t9);

        Table t10 = new Table();
        t10.setName("六娃");
        t10.setAge(18);
        t10.setBj("15网络");
        tables.add(t10);

        Table t11 = new Table();
        t11.setName("七娃");
        t11.setAge(19);
        t11.setBj("16信息");
        tables.add(t11);

        Table t12 = new Table();
        t12.setName("小矮人1号");
        t12.setAge(17);
        t12.setBj("17软件");
        tables.add(t12);

        Table t13 = new Table();
        t13.setName("小矮人2号");
        t13.setAge(19);
        t13.setBj("17软件");
        tables.add(t13);

        Table t14 = new Table();
        t14.setName("小矮人3号");
        t14.setAge(16);
        t14.setBj("18大数据");
        tables.add(t14);

        Table t15 = new Table();
        t15.setName("小矮人4号");
        t15.setAge(19);
        t15.setBj("19网管");
        tables.add(t15);




       /* String t = "{\"total\":66,\"rows\":[\n" +
                "  {\"name\":\"张三\",\"age\":\"15\",\"class\":\"15网络\"},\n" +
                "  {\"name\":\"李四\",\"age\":\"22\",\"class\":\"17软件\"},\n" +
                "  {\"name\":\"王五\",\"age\":\"33\",\"class\":\"16信息\"},\n" +
                "  {\"name\":\"叫兽\",\"age\":\"21\",\"class\":\"15网络\"}\n" +
                "]}";*/

        Map map = new HashMap();
        map.put("code",0);//默认必须是0
        map.put("msg","写啥都行");
        map.put("count",3);
        map.put("data",tables);

        String s = JSON.toJSONString(map);
        PrintWriter writer = resp.getWriter();
        writer.println(s);
        writer.close();
    }
}
