/*
 *
 *  * ******************************************************************************
 *  *
 *  *                       Woodare PROPRIETARY INFORMATION
 *  *
 *  *           The information contained herein is proprietary to Woodare
 *  *            and shall not be reproduced or disclosed in whole or in part
 *  *                     or used for any design or manufacture
 *  *               without direct written authorization from FengDa.
 *  *
 *  *             Copyright (c) 2021 by Woodare.  All rights reserved.
 *  *
 *  * ******************************************************************************
 *
 */

package com.carr.upgrade.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
