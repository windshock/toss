package com.google.firebase.installations.remote;

import com.google.firebase.installations.Utils;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class RequestLimiter {
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS = TimeUnit.HOURS.toMillis(24);
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS = TimeUnit.MINUTES.toMillis(30);
    private int attemptCount;
    private long nextRequestTime;
    private final Utils utils;

    private static boolean isRetryableError(int i2) {
        if (i2 != 429) {
            return i2 >= 500 && i2 < 600;
        }
        return true;
    }

    private static boolean isSuccessfulOrRequiresNewFidCreation(int i2) {
        return (i2 >= 200 && i2 < 300) || i2 == 401 || i2 == 404;
    }

    RequestLimiter(Utils utils) {
        this.utils = utils;
    }

    RequestLimiter() {
        this.utils = Utils.getInstance();
    }

    public void setNextRequestTime(int i2) {
        synchronized (this) {
            if (isSuccessfulOrRequiresNewFidCreation(i2)) {
                resetBackoffStrategy();
                return;
            }
            this.attemptCount++;
            this.nextRequestTime = this.utils.currentTimeInMillis() + getBackoffDuration(i2);
        }
    }

    private void resetBackoffStrategy() {
        synchronized (this) {
            this.attemptCount = 0;
        }
    }

    private long getBackoffDuration(int i2) {
        synchronized (this) {
            if (!isRetryableError(i2)) {
                return MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS;
            }
            return (long) Math.min(Math.pow(2.0d, this.attemptCount) + this.utils.getRandomDelayForSyncPrevention(), MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isRequestAllowed() {
        boolean z;
        synchronized (this) {
            if (this.attemptCount != 0) {
                z = this.utils.currentTimeInMillis() > this.nextRequestTime;
            }
        }
        return z;
    }
}
