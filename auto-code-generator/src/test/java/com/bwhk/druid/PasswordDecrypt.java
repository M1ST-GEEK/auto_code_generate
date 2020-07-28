package com.bwhk.druid;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import com.alibaba.druid.filter.config.ConfigTools;
import com.bwhk.generator.OracleGenerator;

public class PasswordDecrypt {
	public static void main(String[] args) throws Exception {
		String[] args1 = {"yjfxgj"};
		ConfigTools.main(args1);
    }
}
