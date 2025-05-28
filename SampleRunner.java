package examples.api;

import com.intuit.karate.junit5.Karate;

class SampleRunner {
    @Karate.Test
    Karate runTest() {
        return Karate.run("sample").relativeTo(getClass());
    }
}
