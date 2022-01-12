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

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableWebMvc
@Profile({"dev"})
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Public API")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.carr.upgrade.controller"))
                .paths(PathSelectors.any())
                .build();
    }

}
