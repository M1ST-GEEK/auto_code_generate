package com.bwhk.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

//1.设置数据库
//2.设置mybatis生成路径[选]
//3.设置表名称
//4.start
//5.执行完毕如没有文件请刷新整个目录
public class OracleGenerator {
	public static void main(String[] args) throws Exception {
        System.out.println("Start");
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = 
                      cp.parseConfiguration(new File(URLDecoder.decode(OracleGenerator.class.getResource("/config/generatorConfig.xml").getFile())));
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
}
