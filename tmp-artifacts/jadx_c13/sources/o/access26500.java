package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access26500 {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        r1 = r15.IAuthTabCallback(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r1 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T, U> void onExtraCallback(parseNegativeInt<T> parsenegativeint, writeQuoted<? super U> writequoted, boolean z, deserializeUriNullableCollection deserializeurinullablecollection, TombstoneProtosLogBufferOrBuilder<T, U> tombstoneProtosLogBufferOrBuilder) {
        int iIAuthTabCallback = 1;
        while (!onWarmupCompleted(tombstoneProtosLogBufferOrBuilder.IAuthTabCallback(), parsenegativeint.isEmpty(), writequoted, z, parsenegativeint, deserializeurinullablecollection, tombstoneProtosLogBufferOrBuilder)) {
            while (true) {
                boolean zIAuthTabCallback = tombstoneProtosLogBufferOrBuilder.IAuthTabCallback();
                T tPoll = parsenegativeint.poll();
                boolean z2 = tPoll == null;
                if (onWarmupCompleted(zIAuthTabCallback, z2, writequoted, z, parsenegativeint, deserializeurinullablecollection, tombstoneProtosLogBufferOrBuilder)) {
                    return;
                }
                if (z2) {
                    break;
                } else {
                    tombstoneProtosLogBufferOrBuilder.onExtraCallbackWithResult(writequoted, tPoll);
                }
            }
        }
    }

    public static <T, U> boolean onWarmupCompleted(boolean z, boolean z2, writeQuoted<?> writequoted, boolean z3, parsePositiveDecimal<?> parsepositivedecimal, deserializeUriNullableCollection deserializeurinullablecollection, TombstoneProtosLogBufferOrBuilder<T, U> tombstoneProtosLogBufferOrBuilder) {
        if (tombstoneProtosLogBufferOrBuilder.onWarmupCompleted()) {
            parsepositivedecimal.clear();
            deserializeurinullablecollection.dispose();
            return true;
        }
        if (!z) {
            return false;
        }
        if (z3) {
            if (!z2) {
                return false;
            }
            if (deserializeurinullablecollection != null) {
                deserializeurinullablecollection.dispose();
            }
            Throwable thOnNavigationEvent = tombstoneProtosLogBufferOrBuilder.onNavigationEvent();
            if (thOnNavigationEvent != null) {
                writequoted.onExtraCallbackWithResult(thOnNavigationEvent);
            } else {
                writequoted.onExtraCallback();
            }
            return true;
        }
        Throwable thOnNavigationEvent2 = tombstoneProtosLogBufferOrBuilder.onNavigationEvent();
        if (thOnNavigationEvent2 != null) {
            parsepositivedecimal.clear();
            if (deserializeurinullablecollection != null) {
                deserializeurinullablecollection.dispose();
            }
            writequoted.onExtraCallbackWithResult(thOnNavigationEvent2);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (deserializeurinullablecollection != null) {
            deserializeurinullablecollection.dispose();
        }
        writequoted.onExtraCallback();
        return true;
    }
}
