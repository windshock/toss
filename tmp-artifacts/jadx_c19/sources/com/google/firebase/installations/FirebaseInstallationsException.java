package com.google.firebase.installations;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.google.firebase.FirebaseException;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class FirebaseInstallationsException extends FirebaseException {
    private final Status status;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UNAVAILABLE' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class Status {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status BAD_CONFIG;
        private static int IAuthTabCallback = 1;
        public static final Status TOO_MANY_REQUESTS;
        public static final Status UNAVAILABLE;
        private static int onExtraCallback = 1;
        private static long onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        private Status(String str, int i2) {
        }

        public static Status valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 77;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Status status = (Status) Enum.valueOf(Status.class, str);
            if (i4 != 0) {
                int i5 = 68 / 0;
            }
            int i6 = IAuthTabCallback + 113;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return status;
        }

        public static Status[] values() {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 47;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Status[] statusArr = (Status[]) $VALUES.clone();
            int i5 = IAuthTabCallback + 21;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return statusArr;
        }

        static {
            onWarmupCompleted();
            Status status = new Status("BAD_CONFIG", 0);
            BAD_CONFIG = status;
            Object[] objArr = new Object[1];
            a(new char[]{2963, 3014, 2035, 25512, 49237, 2110, 20725, 39814, 62419, 39015, 31900, 49230, 11129, 33538, 10434}, -ExpandableListView.getPackedPositionChild(0L), objArr);
            Status status2 = new Status(((String) objArr[0]).intern(), 1);
            UNAVAILABLE = status2;
            Status status3 = new Status("TOO_MANY_REQUESTS", 2);
            TOO_MANY_REQUESTS = status3;
            $VALUES = new Status[]{status, status2, status3};
            int i2 = onExtraCallback + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }

        private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i2);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i4 = $10 + 11;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - View.resolveSizeAndState(0, 0, 0)), TextUtils.indexOf("", "", 0, 0) + 84, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21232, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 14185), 18 - TextUtils.indexOf((CharSequence) "", '0'), View.MeasureSpec.makeMeasureSpec(0, 0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i7 = $10 + 19;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }

        static void onWarmupCompleted() {
            onExtraCallbackWithResult = -6105336466599043303L;
        }
    }

    public FirebaseInstallationsException(@NonNull Status status) {
        this.status = status;
    }

    public FirebaseInstallationsException(@NonNull String str, @NonNull Status status) {
        super(str);
        this.status = status;
    }

    public FirebaseInstallationsException(@NonNull String str, @NonNull Status status, @NonNull Throwable th) {
        super(str, th);
        this.status = status;
    }

    public Status getStatus() {
        return this.status;
    }
}
