/*
 * Copyright 2018 BSC Msc, LLC
 *
 * This file is part of the AuTe Framework project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.bsc.test.at.executor.service.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.bsc.test.at.executor.model.Project;
import ru.bsc.test.at.executor.model.Scenario;
import ru.bsc.test.at.executor.model.ScenarioResult;
import ru.bsc.test.at.executor.service.IExecutingFinishObserver;
import ru.bsc.test.at.executor.service.IStopObserver;

import java.util.List;

/**
 * @author Pavel Golovkin
 */
@Data
@AllArgsConstructor
public class ProjectExecutorRequest implements ExecutorRequest {
    private Project project; 
    private List<Scenario> scenarioExecuteList;
    List<ScenarioResult> scenarioResultList;
    IStopObserver stopObserver;
    IExecutingFinishObserver finishObserver;
}
