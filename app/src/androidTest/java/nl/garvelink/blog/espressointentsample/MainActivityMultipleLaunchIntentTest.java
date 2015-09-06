/*
 *     Copyright 2015 Barend Garvelink
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package nl.garvelink.blog.espressointentsample;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * This Espresso test builds on {@link MainActivityLaunchIntentTest} to use a custom intent for
 * every {@code &#x40;Test} method in the class.
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class MainActivityMultipleLaunchIntentTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class, true, false);

    @Test
    public void shouldShowHelloMoon() {
        mActivityRule.launchActivity(createIntentWithName("Moon"));;
        onView(withId(R.id.main__tv_hello)).check(matches(withText("Hello Moon!")));
    }

    @Test
    public void shouldShowHelloSun() {
        mActivityRule.launchActivity(createIntentWithName("Sun"));
        onView(withId(R.id.main__tv_hello)).check(matches(withText("Hello Sun!")));
    }

    private static Intent createIntentWithName(String name) {
        Context targetContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        Intent intent = new Intent(targetContext, MainActivity.class);
        intent.putExtra("Name", name);
        return intent;
    }
}
