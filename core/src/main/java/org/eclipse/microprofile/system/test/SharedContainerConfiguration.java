/*
 * Copyright (c) 2019 IBM Corporation and others
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
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
package org.eclipse.microprofile.system.test;

/**
 * To be used in conjunction with {@link SharedContainerConfig}
 */
public interface SharedContainerConfiguration {

    /**
     * A method that may optionally be implemented to impose a specific
     * container start ordering.
     * Any containers that do not depend on other containers should make use
     * of Java 8 parallel streams:<br>
     * <code>containersToStart.parallelStream().forEach(GenericContainer::start);</code>
     */
    public default void startContainers() {
        throw new UnsupportedOperationException("Not implemented");
    }

}
