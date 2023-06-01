/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.ui.textrender;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
    DocumentationRendererTests.class,
    IfRendererTests.class,
    NameRendererTests.class,
    PropertiesRendererTests.class,
    RelationshipRendererTests.class,
    SpecializationRendererTests.class,
    TextContentRendererTests.class,
    TextRendererTests.class,
    TypeRendererTests.class,
    ViewpointRendererTests.class,
    WordWrapRendererTests.class
})

public class AllTextRenderTests {
}