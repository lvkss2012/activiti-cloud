/*
 * Copyright 2017-2020 Alfresco Software, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activiti.cloud.services.query.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.activiti.cloud.api.process.model.CloudServiceTask;
import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="ServiceTask")
@Table(name="BPMN_ACTIVITY")
@Where(clause = "activity_type='serviceTask'")
public class ServiceTaskEntity extends BaseBPMNActivityEntity implements CloudServiceTask {

    @JsonIgnore
    @OneToOne(mappedBy = "serviceTask", fetch = FetchType.LAZY, optional = true)
    private IntegrationContextEntity integrationContext;

    public IntegrationContextEntity getIntegrationContext() {
        return integrationContext;
    }

    public void setIntegrationContext(IntegrationContextEntity integrationContext) {
        this.integrationContext = integrationContext;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ServiceTaskEntity [toString()=").append(super.toString()).append("]");
        return builder.toString();
    }

}
