package com.silanis.esl.sdk.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;

public class ReminderExampleTest {
    @Test
    public void verifyResult() {
        ReminderExample example = new ReminderExample();
        example.run();

        // Verify that a reminder schedule has been created for this package -- we need the packageId for that
        assertThat( example.createdReminderSchedule, notNullValue() );
        assertThat( example.createdReminderSchedule.getDaysUntilFirstReminder(), is(example.reminderScheduleToCreate.getDaysUntilFirstReminder()) );
        assertThat( example.createdReminderSchedule.getDaysBetweenReminders(), is(example.reminderScheduleToCreate.getDaysBetweenReminders()) );
        assertThat( example.createdReminderSchedule.getNumberOfRepetitions(), is(example.reminderScheduleToCreate.getNumberOfRepetitions()) );

        assertThat( example.updatedReminderSchedule, notNullValue() );
        assertThat( example.updatedReminderSchedule.getDaysUntilFirstReminder(), is(example.updatedReminderSchedule.getDaysUntilFirstReminder()) );
        assertThat( example.updatedReminderSchedule.getDaysBetweenReminders(), is(example.updatedReminderSchedule.getDaysBetweenReminders()) );
        assertThat( example.updatedReminderSchedule.getNumberOfRepetitions(), is(example.updatedReminderSchedule.getNumberOfRepetitions()) );

        assertThat( example.removedReminderSchedule, nullValue() );
    }
}
