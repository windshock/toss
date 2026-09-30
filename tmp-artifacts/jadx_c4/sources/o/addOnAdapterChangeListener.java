package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.ads_sdk.R;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addOnAdapterChangeListener {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ addOnAdapterChangeListener[] $VALUES;
    public static final addOnAdapterChangeListener AD_NOT_LOADED;
    public static final addOnAdapterChangeListener AD_NOT_READY;
    public static final addOnAdapterChangeListener BLOCKED;
    public static final addOnAdapterChangeListener CONSENT_REQUIRED;
    public static final addOnAdapterChangeListener ERROR;
    public static final addOnAdapterChangeListener EXECUTION_FAIL;
    public static final addOnAdapterChangeListener FAIL;
    public static final addOnAdapterChangeListener HTTP_TIMEOUT;
    private static long IAuthTabCallback = 0;
    public static final addOnAdapterChangeListener INTERNAL_ERROR;
    public static final addOnAdapterChangeListener INTERRUPTED;
    public static final addOnAdapterChangeListener INVALID_REQUEST;
    public static final addOnAdapterChangeListener INVALID_SPACE;
    public static final addOnAdapterChangeListener LIMITED_AD;
    public static final addOnAdapterChangeListener NETWORK_ERROR;
    public static final addOnAdapterChangeListener NO_AD;
    public static final addOnAdapterChangeListener SDK_NOT_INITIALIZED;
    public static final addOnAdapterChangeListener TEST_MODE;
    public static final addOnAdapterChangeListener TIMEOUT;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final int code;
    private final int messageRes;

    private static final /* synthetic */ addOnAdapterChangeListener[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        addOnAdapterChangeListener[] addonadapterchangelistenerArr = {NETWORK_ERROR, INVALID_REQUEST, NO_AD, ERROR, INVALID_SPACE, SDK_NOT_INITIALIZED, HTTP_TIMEOUT, EXECUTION_FAIL, INTERRUPTED, FAIL, BLOCKED, TIMEOUT, LIMITED_AD, CONSENT_REQUIRED, TEST_MODE, AD_NOT_LOADED, AD_NOT_READY, INTERNAL_ERROR};
        int i5 = i3 + 119;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return addonadapterchangelistenerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<addOnAdapterChangeListener> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<addOnAdapterChangeListener> enumEntries = $ENTRIES;
        int i5 = i3 + 71;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return enumEntries;
    }

    public static addOnAdapterChangeListener valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        addOnAdapterChangeListener addonadapterchangelistener = (addOnAdapterChangeListener) Enum.valueOf(addOnAdapterChangeListener.class, str);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 107;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return addonadapterchangelistener;
    }

    public static addOnAdapterChangeListener[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        addOnAdapterChangeListener[] addonadapterchangelistenerArr = (addOnAdapterChangeListener[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return addonadapterchangelistenerArr;
    }

    private addOnAdapterChangeListener(String str, int i, int i2, int i3) {
        this.code = i2;
        this.messageRes = i3;
    }

    public final int getCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 25;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.code;
        int i6 = i2 + 51;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int getMessageRes() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 65;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.messageRes;
        int i6 = i2 + 5;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 8 / 0;
        }
        return i5;
    }

    static {
        onExtraCallback();
        NETWORK_ERROR = new addOnAdapterChangeListener("NETWORK_ERROR", 0, 1001, R.string.ads_sdk_error_message_network_error);
        Object[] objArr = new Object[1];
        a(new char[]{29399, 26484, 53509, 29342, 15773, 30333, 25629, 31177, 6151, 41598, 52907, 3251, 42941, 18670, 23506, 37637, 19782, 64860, 9331}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        INVALID_REQUEST = new addOnAdapterChangeListener(((String) objArr[0]).intern(), 1, 1002, R.string.ads_sdk_error_message_invalid_request);
        NO_AD = new addOnAdapterChangeListener("NO_AD", 2, 1003, R.string.ads_sdk_error_message_no_ad);
        ERROR = new addOnAdapterChangeListener("ERROR", 3, 1004, R.string.ads_sdk_error_message_server_error);
        INVALID_SPACE = new addOnAdapterChangeListener("INVALID_SPACE", 4, 1005, R.string.ads_sdk_error_message_invalid_space);
        SDK_NOT_INITIALIZED = new addOnAdapterChangeListener("SDK_NOT_INITIALIZED", 5, 1007, R.string.ads_sdk_error_message_sdk_not_initialized);
        HTTP_TIMEOUT = new addOnAdapterChangeListener("HTTP_TIMEOUT", 6, 1008, R.string.ads_sdk_error_message_http_timeout);
        EXECUTION_FAIL = new addOnAdapterChangeListener("EXECUTION_FAIL", 7, 1009, R.string.ads_sdk_error_message_execution_fail);
        INTERRUPTED = new addOnAdapterChangeListener("INTERRUPTED", 8, 1010, R.string.ads_sdk_error_message_interrupted);
        Object[] objArr2 = new Object[1];
        a(new char[]{28685, 21282, 60123, 28747, 2500, 23452, 24540, 21541}, 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
        FAIL = new addOnAdapterChangeListener(((String) objArr2[0]).intern(), 9, 1011, R.string.ads_sdk_error_message_fail);
        BLOCKED = new addOnAdapterChangeListener("BLOCKED", 10, 1012, R.string.ads_sdk_error_message_blocked);
        TIMEOUT = new addOnAdapterChangeListener("TIMEOUT", 11, 1013, R.string.ads_sdk_error_message_timeout);
        LIMITED_AD = new addOnAdapterChangeListener("LIMITED_AD", 12, 1014, R.string.ads_sdk_error_message_limited_ad);
        CONSENT_REQUIRED = new addOnAdapterChangeListener("CONSENT_REQUIRED", 13, 1015, R.string.ads_sdk_error_message_consent_required);
        TEST_MODE = new addOnAdapterChangeListener("TEST_MODE", 14, 1016, R.string.ads_sdk_error_message_test_mode);
        AD_NOT_LOADED = new addOnAdapterChangeListener("AD_NOT_LOADED", 15, 1006, R.string.ads_sdk_error_message_ad_not_loaded);
        AD_NOT_READY = new addOnAdapterChangeListener("AD_NOT_READY", 16, 1018, R.string.ads_sdk_error_message_ad_not_ready);
        INTERNAL_ERROR = new addOnAdapterChangeListener("INTERNAL_ERROR", 17, 1017, R.string.ads_sdk_error_message_internal_error);
        addOnAdapterChangeListener[] addonadapterchangelistenerArr$values = $values();
        $VALUES = addonadapterchangelistenerArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(addonadapterchangelistenerArr$values);
        int i = onExtraCallbackWithResult + 61;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 51;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 % 5;
        }
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 79;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 45812), 84 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 14185), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19, 8808 - Color.argb(0, 0, 0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static void onExtraCallback() {
        IAuthTabCallback = 8050030980364313003L;
    }
}
