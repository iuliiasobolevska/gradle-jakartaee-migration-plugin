/*
 * Copyright 2023 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.netflix.gradle.jakartaee.specifications.impl

import com.netflix.gradle.jakartaee.artifacts.ArtifactCoordinate
import com.netflix.gradle.jakartaee.artifacts.ArtifactVersion
import com.netflix.gradle.jakartaee.specifications.SpecificationVersion

internal class Mail : BasicImpl(
    "mail",
    JAVAX,
    JAVAX_COORDINATES,
    ANGUS,
    JAKARTA_COORDINATES,
    SPECIFICATION_TO_MAIL_VERSION
) {
    companion object {
        private val GLASSFISH = ArtifactCoordinate("org.glassfish", "javax.mail") // Repackaged OSGi bundle, appears to be EE 6
        private val SUN_JAVAX = ArtifactCoordinate("com.sun.mail", "javax.mail") // 1.4.4 through 1.6.2
        private val JAVAX = ArtifactCoordinate("javax.mail", "mail") // 1.3.2 through 1.4.7
        private val JAKARTA_SUN = ArtifactCoordinate("com.sun.mail", "jakarta.mail") // 1.6.3 through 2.0.1
        private val ANGUS = ArtifactCoordinate("org.eclipse.angus", "angus-mail") // Eclipse Implementation

        private val SPECIFICATION_TO_MAIL_VERSION = mapOf(
            SpecificationVersion.EE7 to ArtifactVersion("1.5.0"),
            SpecificationVersion.EE8 to ArtifactVersion("1.6.0"),
            SpecificationVersion.EE9 to ArtifactVersion("2.0.0"),
            SpecificationVersion.EE9_1 to ArtifactVersion("2.0.0"),
            SpecificationVersion.EE10 to ArtifactVersion("2.0.2"),
        )

        private val JAVAX_COORDINATES = listOf(
            GLASSFISH,
            SUN_JAVAX,
            JAVAX,
        )

        private val JAKARTA_COORDINATES = listOf(
            JAKARTA_SUN,
            ANGUS,
        )
    }
}
