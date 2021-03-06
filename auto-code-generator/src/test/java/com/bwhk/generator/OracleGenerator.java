package com.bwhk.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

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
        System.out.println("End");
    }
}
