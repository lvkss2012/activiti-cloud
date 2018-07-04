/*
 * Copyright 2018 Alfresco, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.cloud.starter.audit.tests;

import org.activiti.cloud.starter.audit.configuration.EnableActivitiAudit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableActivitiAudit
@ComponentScan({
        "org.activiti.cloud.services.audit.api",
        "org.activiti.cloud.services.audit.jpa",
        "org.activiti.cloud.services.security",
        "org.activiti.cloud.services.common.security",
        "org.activiti.cloud.starters",
        "org.activiti.cloud.starter",
        "org.activiti.cloud.services.identity",
        "org.activiti.cloud.alfresco"})
public class JpaAuditApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaAuditApplication.class,
                              args);
    }
}
