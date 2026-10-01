package o;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCFaceSDKExternalSyntheticLambda2 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 1;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
                int i2 = onNavigationEvent + 115;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallback = iArr;
            int i5 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static final /* synthetic */ boolean IAuthTabCallback(long j, Date date) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(j, date);
        int i4 = onNavigationEvent + 31;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ long onWarmupCompleted(Date date, int i, TimeUnit timeUnit) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 51;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        long jIAuthTabCallback = IAuthTabCallback(date, i, timeUnit);
        if (i4 == 0) {
            int i5 = 28 / 0;
        }
        return jIAuthTabCallback;
    }

    private static final boolean onExtraCallback(long j, Date date) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            if (j <= 1) {
                return false;
            }
        } else if (j <= 0) {
            return false;
        }
        if (date.getTime() >= j) {
            return false;
        }
        int i3 = onNavigationEvent + 67;
        onExtraCallback = i3 % 128;
        return i3 % 2 != 0;
    }

    private static final long IAuthTabCallback(Date date, int i, TimeUnit timeUnit) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult.onExtraCallback[timeUnit.ordinal()];
        if (i4 == 1) {
            i2 = 5;
        } else if (i4 != 2) {
            int i5 = onExtraCallback;
            int i6 = i5 + 3;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (i4 != 3) {
                int i8 = i5 + 27;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                if (i4 != 4) {
                    int i10 = i5 + 81;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    i2 = 14;
                } else {
                    i2 = 13;
                }
            } else {
                i2 = 12;
            }
        } else {
            i2 = 11;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        gregorianCalendar.add(i2, i);
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        int i12 = onNavigationEvent + 9;
        onExtraCallback = i12 % 128;
        int i13 = i12 % 2;
        return timeInMillis;
    }
}
