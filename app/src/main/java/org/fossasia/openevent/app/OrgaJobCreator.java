package org.fossasia.openevent.app;

import com.evernote.android.job.Job;
import com.evernote.android.job.JobCreator;

import org.fossasia.openevent.app.module.attendee.checkin.job.AttendeeCheckInJob;

public class OrgaJobCreator implements JobCreator {

    @Override
    @SuppressWarnings("PMD.TooFewBranchesForASwitchStatement") // More branches to be added
    public Job create(String tag) {
        switch (tag) {
            case AttendeeCheckInJob.TAG:
                return new AttendeeCheckInJob();
            default:
                return null;
        }
    }

}
