package org.japprove.examples;

import java.util.Arrays;
import java.util.List;
import org.japprove.annotations.ApprovalTest;
import org.japprove.verifier.StringVerifier;

public class StringFormatterTest {

    @ApprovalTest(baseline = "names")
    void testFormat(StringVerifier stringVerifier) {
        // arrange
        List<String> names = Arrays.asList("PETER", "MiKe", "joHn", " pAuL ");

        // act
        List<String> formattedNames = StringFormatter.format(names);

        // approve
        stringVerifier.verify(formattedNames);
    }
}
