package org.wso2.siddhiql.plugins.idea;

import com.intellij.testFramework.ParsingTestCase;

public class SiddhiQLParsingTest extends ParsingTestCase {
  public SiddhiQLParsingTest() {
    super("", "SiddhiQL", new SiddhiQLParserDefinition());
  }

  public void testParsingTestData() {
//    doTest(true);
  }

  @Override
  protected String getTestDataPath() {
    return "testData";
  }

  @Override
  protected boolean skipSpaces() {
    return false;
  }

  @Override
  protected boolean includeRanges() {
    return true;
  }
}
