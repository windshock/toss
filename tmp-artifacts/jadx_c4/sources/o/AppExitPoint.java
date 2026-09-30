package o;

import im.toss.features.credit.ui.quiz.R;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppExitPoint {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppExitPoint[] $VALUES;
    public static final AppExitPoint AVAILABLE;
    public static final AppExitPoint COOLTIME;
    public static final AppExitPoint REQUIRE_ALARM_TERM;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String description;
    private final String logParam;
    private final String text;

    private static final /* synthetic */ AppExitPoint[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        AppExitPoint[] appExitPointArr = {AVAILABLE, COOLTIME, REQUIRE_ALARM_TERM};
        int i5 = i3 + 81;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return appExitPointArr;
    }

    public static EnumEntries<AppExitPoint> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AppExitPoint valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AppExitPoint appExitPoint = (AppExitPoint) Enum.valueOf(AppExitPoint.class, str);
        int i4 = onNavigationEvent + 73;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return appExitPoint;
        }
        throw null;
    }

    public static AppExitPoint[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AppExitPoint[] appExitPointArr = (AppExitPoint[]) $VALUES.clone();
        int i4 = onExtraCallback + 65;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return appExitPointArr;
    }

    private AppExitPoint(String str, int i, String str2, String str3, String str4) {
        this.logParam = str2;
        this.text = str3;
        this.description = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ AppExitPoint(String str, int i, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        if ((i2 & 4) != 0) {
            int i3 = onExtraCallback + 107;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = 2 % 2;
            str5 = null;
        } else {
            str5 = str4;
        }
        this(str, i, str2, str3, str5);
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.description;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getLogParam() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.logParam;
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        return str;
    }

    public final String getText() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.text;
        int i4 = i3 + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        AFj1rSDK aFj1rSDK = AFj1rSDK.onExtraCallback;
        AVAILABLE = new AppExitPoint("AVAILABLE", 0, "quiz", aFj1rSDK.onExtraCallbackWithResult(R.string.my_credit_quiz_cta), null, 4, null);
        String strOnExtraCallbackWithResult = aFj1rSDK.onExtraCallbackWithResult(R.string.my_credit_quiz_cta_cooltime);
        int i = R.string.my_credit_quiz_cta_cooltime_description;
        COOLTIME = new AppExitPoint("COOLTIME", 1, "alarm_done", strOnExtraCallbackWithResult, aFj1rSDK.onExtraCallbackWithResult(i));
        REQUIRE_ALARM_TERM = new AppExitPoint("REQUIRE_ALARM_TERM", 2, "alarm", aFj1rSDK.onExtraCallbackWithResult(R.string.my_credit_quiz_cta_alarm), aFj1rSDK.onExtraCallbackWithResult(i));
        AppExitPoint[] appExitPointArr$values = $values();
        $VALUES = appExitPointArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(appExitPointArr$values);
        int i2 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean needTermsAgreement() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 51;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this != REQUIRE_ALARM_TERM) {
            return false;
        }
        int i5 = i2 + 61;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }
}
