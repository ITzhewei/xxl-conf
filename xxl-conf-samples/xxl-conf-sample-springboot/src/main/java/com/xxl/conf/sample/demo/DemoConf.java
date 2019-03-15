package com.xxl.conf.sample.demo;

import com.xxl.conf.core.annotation.XxlConf;
import org.springframework.stereotype.Component;

/**
 *  测试示例（可删除）
 *
 *  @author xuxueli
 */
@Component
public class DemoConf {

	@XxlConf("default.key02")
	public String paramByAnno;


}
