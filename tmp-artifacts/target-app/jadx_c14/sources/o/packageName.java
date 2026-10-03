package o;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.SetDetectableSize;
import o.packageName;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class packageName extends toRealPath {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 1742854161281406141L;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private final onNavigationEvent onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final Long onWarmupCompleted;

    public interface onNavigationEvent {
        void IEngagementSignalsCallback();
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(setDetectableSize);
        int i4 = asInterface + 79;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asInterface + 7;
            asBinder = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof packageName)) {
            int i3 = asBinder + 123;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        packageName packagename = (packageName) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, packagename.onExtraCallbackWithResult)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, packagename.onExtraCallback)) {
            int i5 = asBinder + 19;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, packagename.onWarmupCompleted)) {
            return true;
        }
        int i7 = asBinder + 1;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = asBinder + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode3 = this.onExtraCallback.hashCode();
        Long l = this.onWarmupCompleted;
        if (l == null) {
            int i4 = asBinder + 61;
            int i5 = i4 % 128;
            asInterface = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 57;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossMoneyLimitBannerViewModel(context=" + this.onExtraCallbackWithResult + ", navigator=" + this.onExtraCallback + ", tossMoneyBalanceLimit=" + this.onWarmupCompleted + ")";
        int i2 = asInterface + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public packageName(@NotNull Context context, @NotNull onNavigationEvent onnavigationevent, @Nullable Long l) throws Throwable {
        super(toRealPath.onNavigationEvent.TOSS_MONEY_LIMIT_BANNER);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        this.onExtraCallbackWithResult = context;
        this.onExtraCallback = onnavigationevent;
        this.onWarmupCompleted = l;
        Object[] objArr = new Object[1];
        a(new char[]{9711, 9607, 17000, 29939, 28077, 11237, 30701, 63630, 39768, 33762, 13804, 46454, 22548, 49376, 63342, 62561, 6602, 1587, 45157, 13221, 56976, 18207, 29156, 29315, 40018, 33861, 13052, 45056, 23828, 50571, 64625, 65366, 4764, 2768, 48437, 16006, 54240, 18504, 32287, 32146, 37218, 35163, 16333, 47956, 22053, 52885, 63617, 64094, 6062, 4054, 47682, 14749, 54451, 19809, 31491, 30882, 35432, 45691, 9373, 51193, 19257, 62371}, 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        this.onNavigationEvent = ((String) objArr[0]).intern();
    }

    public long onWarmupCompleted() {
        int i = 2 % 2;
        long jHashCode = ("toss-money-limit-banner-" + this.onExtraCallback).hashCode();
        int i2 = asBinder + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return jHashCode;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.onNavigationEvent;
        int i5 = i3 + 49;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
        return str;
    }

    private static final String onNavigationEvent(packageName packagename, long j) {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (j == 500000) {
            String string = packagename.onExtraCallbackWithResult.getString(R.string.app_view_account_history_tossmoney_limit_money_unit_10000, 50);
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i4 = asBinder + 13;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 13 / 0;
            }
            return string;
        }
        if (j != 1000000) {
            if (j == 2000000) {
                String string2 = packagename.onExtraCallbackWithResult.getString(R.string.app_view_account_history_tossmoney_limit_money_unit_10000, 200);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                return string2;
            }
            return getLongName.onNavigationEvent(j, (ParamImpl) null, 1, (Object) null);
        }
        int i6 = i3 + 101;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        String string3 = packagename.onExtraCallbackWithResult.getString(R.string.app_view_account_history_tossmoney_limit_money_unit_10000, 100);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        int i8 = asBinder + 25;
        asInterface = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 78 / 0;
        }
        return string3;
    }

    public final String onNavigationEvent() {
        String string;
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 3;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Long l = this.onWarmupCompleted;
        if (l == null) {
            return "";
        }
        int i5 = i2 + 7;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            Context context = this.onExtraCallbackWithResult;
            int i6 = R.string.app_view_account_history_tossmoney_limit_guide_banner_message;
            Object[] objArr = new Object[1];
            objArr[1] = onNavigationEvent(this, l.longValue());
            string = context.getString(i6, objArr);
        } else {
            string = this.onExtraCallbackWithResult.getString(R.string.app_view_account_history_tossmoney_limit_guide_banner_message, onNavigationEvent(this, l.longValue()));
        }
        Intrinsics.checkNotNull(string);
        int i7 = asBinder + 7;
        asInterface = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 19 / 0;
        }
        return string;
    }

    private static final Unit onNavigationEvent(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{60568, 60652, 39110, 61255, 46862, 45141, 31017, 63071}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "normal");
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 107;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1246679L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.detail.viewmodel.header.TossMoneyLimitBannerViewModel$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return packageName.onExtraCallbackWithResult((SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        this.onExtraCallback.IEngagementSignalsCallback();
        int i2 = asInterface + 17;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 121;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - ((Process.getThreadPriority(0) + 20) >> 6)), 84 - (ViewConfiguration.getPressedStateDuration() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21232, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 14185), TextUtils.indexOf("", "") + 19, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8807, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 93;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i7 = 93 / 0;
            objArr[0] = str;
        }
    }
}
