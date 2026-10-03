package o;

import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class fromArray {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ fromArray[] $VALUES;
    public static final onExtraCallbackWithResult Companion;
    public static final fromArray DAILY;
    public static final fromArray DAY;
    public static final fromArray DAY_OF_WEEK;
    public static final fromArray DELAY;
    private static int IAuthTabCallback = 0;
    public static final fromArray ONE_TIME;
    public static final fromArray UNKNOWN;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static char[] onWarmupCompleted;
    private final String value;

    private static final /* synthetic */ fromArray[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        fromArray[] fromarrayArr = {DELAY, DAY, DAY_OF_WEEK, DAILY, ONE_TIME, UNKNOWN};
        int i5 = i3 + 67;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return fromarrayArr;
    }

    public static EnumEntries<fromArray> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<fromArray> enumEntries = $ENTRIES;
        int i5 = i3 + 25;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static fromArray valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        fromArray fromarray = (fromArray) Enum.valueOf(fromArray.class, str);
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        int i5 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 55 / 0;
        }
        return fromarray;
    }

    public static fromArray[] values() {
        fromArray[] fromarrayArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            fromarrayArr = (fromArray[]) $VALUES.clone();
            int i3 = 22 / 0;
        } else {
            fromarrayArr = (fromArray[]) $VALUES.clone();
        }
        int i4 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return fromarrayArr;
    }

    private fromArray(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 87;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        onExtraCallback();
        DELAY = new fromArray("DELAY", 0, "DELAY");
        DAY = new fromArray(then.DATE_YEAR_MONTH_DATE, 1, then.DATE_YEAR_MONTH_DATE);
        DAY_OF_WEEK = new fromArray("DAY_OF_WEEK", 2, "DAY_OF_WEEK");
        DAILY = new fromArray("DAILY", 3, "DAILY");
        ONE_TIME = new fromArray("ONE_TIME", 4, "ONE_TIME");
        Object[] objArr = new Object[1];
        a(new int[]{0, 7, 0, 0}, true, new byte[]{0, 1, 0, 1, 1, 1, 1}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{0, 7, 0, 0}, true, new byte[]{0, 1, 0, 1, 1, 1, 1}, objArr2);
        UNKNOWN = new fromArray(strIntern, 5, ((String) objArr2[0]).intern());
        fromArray[] fromarrayArr$values = $values();
        $VALUES = fromarrayArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(fromarrayArr$values);
        Companion = new onExtraCallbackWithResult(null);
        int i = onExtraCallback + 7;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final fromArray onNavigationEvent(@NotNull String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            fromArray[] fromarrayArrValues = fromArray.values();
            int length = fromarrayArrValues.length;
            int i2 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 0;
            while (i4 < length) {
                fromArray fromarray = fromarrayArrValues[i4];
                if (Intrinsics.areEqual(fromarray.getValue(), str)) {
                    int i5 = onNavigationEvent + 101;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return fromarray;
                }
                i4++;
                int i7 = onExtraCallbackWithResult + 103;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
            return null;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onWarmupCompleted;
        if (cArr2 != null) {
            int i7 = $11 + 125;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 67;
                $10 = i10 % 128;
                if (i10 % i != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - ExpandableListView.getPackedPositionChild(0L)), Gravity.getAbsoluteGravity(0, 0) + 35, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i9])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 35 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 14240 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i9++;
                }
                i = 2;
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            char[] cArr5 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 10887), 65 - TextUtils.indexOf("", "", 0, 0), 16718 - TextUtils.getTrimmedLength(""), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), View.resolveSize(0, 0) + 29, 17705 - AndroidCharacter.getMirror('0'), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - ExpandableListView.getPackedPositionChild(0L)), 71 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i13 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i13, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i13);
        }
        if (z) {
            int i14 = $10 + 77;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i15 = $11 + 125;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i17 = $10 + 17;
                $11 = i17 % 128;
                int i18 = i17 % 2;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void onExtraCallback() {
        onWarmupCompleted = new char[]{27241, 27164, 27165, 27136, 27138, 27138, 27167};
    }
}
