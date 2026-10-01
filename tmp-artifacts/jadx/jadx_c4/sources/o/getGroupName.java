package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getGroupName {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getGroupName[] $VALUES;
    public static final getGroupName ACCOUNT;
    public static final getGroupName ADMOB_INTERSTITIAL_BRAND;
    public static final getGroupName ADMOB_INTERSTITIAL_MOMENT;
    public static final getGroupName ADMOB_INTERSTITIAL_MOMENT_VIDEO;
    public static final getGroupName ADMOB_REWARD_BRAND;
    public static final getGroupName ADMOB_REWARD_MOMENT;
    public static final getGroupName ADMOB_REWARD_MOMENT_VIDEO;
    public static final getGroupName BENEFIT_BANNER;
    public static final getGroupName BENEFIT_BANNER_ALPHA;
    public static final getGroupName BENEFIT_BOARD;
    public static final getGroupName BENEFIT_BOARD_TEST_1;
    public static final getGroupName BENEFIT_BOARD_TEST_2;
    public static final getGroupName BENEFIT_BOARD_TEST_3;
    public static final getGroupName BENEFIT_FEED;
    public static final getGroupName BENEFIT_FEED_TEST;
    public static final getGroupName BENEFIT_PLACEMENT;
    public static final getGroupName HOME_ALPHA;
    public static final getGroupName HOME_LIVE;
    private static char IAuthTabCallback = 0;
    public static final getGroupName NONE;
    public static final getGroupName TEST_13579;
    public static final getGroupName TEST_MOMENT_BANNER;
    public static final getGroupName TEST_PLAYABLE_AD;
    public static final getGroupName TEST_UI_BANNER;
    public static final getGroupName TEST_UI_FEED;
    public static final getGroupName TEST_UI_FEED_VIDEO;
    public static final getGroupName TEST_UI_FEED_VIDEO_2;
    public static final getGroupName TEST_UI_FULL_BANNER;
    public static final getGroupName TEST_UI_FULL_PAGE;
    public static final getGroupName TEST_UI_PLAYABLE_AD;
    public static final getGroupName TEST_UI_SHORT_VIDEO;
    public static final getGroupName TOSS_SEC_HOME_BANNER_ALPHA;
    public static final getGroupName TOSS_SEC_HOME_BANNER_LIVE;
    public static final getGroupName TRANSFER_ALPHA;
    public static final getGroupName TRANSFER_LIVE;
    public static final getGroupName UNKNOWN;
    private static int asBinder = 1;
    private static int asInterface = 0;
    private static char onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;
    private final String id;
    private final boolean permittedControl;

    private static final /* synthetic */ getGroupName[] $values() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 93;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getGroupName[] getgroupnameArr = {NONE, UNKNOWN, TEST_13579, TEST_UI_BANNER, TEST_UI_FEED, TEST_UI_FULL_BANNER, TEST_UI_SHORT_VIDEO, TEST_UI_FULL_PAGE, TEST_UI_FEED_VIDEO, TEST_UI_FEED_VIDEO_2, TEST_UI_PLAYABLE_AD, ADMOB_INTERSTITIAL_BRAND, ADMOB_INTERSTITIAL_MOMENT, ADMOB_INTERSTITIAL_MOMENT_VIDEO, ADMOB_REWARD_BRAND, ADMOB_REWARD_MOMENT, ADMOB_REWARD_MOMENT_VIDEO, TEST_MOMENT_BANNER, BENEFIT_BANNER_ALPHA, BENEFIT_BANNER, BENEFIT_FEED_TEST, BENEFIT_FEED, BENEFIT_BOARD_TEST_1, BENEFIT_BOARD_TEST_2, BENEFIT_BOARD_TEST_3, BENEFIT_BOARD, BENEFIT_PLACEMENT, TEST_PLAYABLE_AD, HOME_ALPHA, HOME_LIVE, TOSS_SEC_HOME_BANNER_ALPHA, TOSS_SEC_HOME_BANNER_LIVE, TRANSFER_ALPHA, TRANSFER_LIVE, ACCOUNT};
        int i5 = i2 + 29;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return getgroupnameArr;
    }

    public static EnumEntries<getGroupName> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        EnumEntries<getGroupName> enumEntries = $ENTRIES;
        int i5 = i3 + 15;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 64 / 0;
        }
        return enumEntries;
    }

    public static getGroupName valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getGroupName getgroupname = (getGroupName) Enum.valueOf(getGroupName.class, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 13;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return getgroupname;
    }

    public static getGroupName[] values() {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getGroupName[] getgroupnameArr = (getGroupName[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 109;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return getgroupnameArr;
    }

    private getGroupName(String str, int i, String str2, boolean z) {
        this.id = str2;
        this.permittedControl = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ getGroupName(String str, int i, String str2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallbackWithResult + 107;
            int i4 = i3 % 128;
            asBinder = i4;
            z = i3 % 2 == 0;
            int i5 = i4 + 125;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        }
        this(str, i, str2, z);
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 63;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean getPermittedControl() {
        boolean z;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 85;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.permittedControl;
            int i4 = 87 / 0;
        } else {
            z = this.permittedControl;
        }
        int i5 = i2 + 55;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return z;
    }

    static {
        IAuthTabCallback();
        NONE = new getGroupName("NONE", 0, "", false, 2, null);
        Object[] objArr = new Object[1];
        a(new char[]{13915, 3334, 15273, 14470, 40381, 54871, 48758, 13702}, 6 - ImageFormat.getBitsPerPixel(0), objArr);
        UNKNOWN = new getGroupName(((String) objArr[0]).intern(), 1, "", false, 2, null);
        int i = 2;
        TEST_13579 = new getGroupName("TEST_13579", i, "13579", false, 2, null);
        boolean z = false;
        int i2 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TEST_UI_BANNER = new getGroupName("TEST_UI_BANNER", 3, "ui_test_1", z, i2, defaultConstructorMarker);
        boolean z2 = false;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        TEST_UI_FEED = new getGroupName("TEST_UI_FEED", 4, "ui_test_2", z2, i, defaultConstructorMarker2);
        TEST_UI_FULL_BANNER = new getGroupName("TEST_UI_FULL_BANNER", 5, "ui_test_3", z, i2, defaultConstructorMarker);
        TEST_UI_SHORT_VIDEO = new getGroupName("TEST_UI_SHORT_VIDEO", 6, "ui_test_4", z2, i, defaultConstructorMarker2);
        TEST_UI_FULL_PAGE = new getGroupName("TEST_UI_FULL_PAGE", 7, "ui_test_5", z, i2, defaultConstructorMarker);
        TEST_UI_FEED_VIDEO = new getGroupName("TEST_UI_FEED_VIDEO", 8, "ui_test_10", z2, i, defaultConstructorMarker2);
        TEST_UI_FEED_VIDEO_2 = new getGroupName("TEST_UI_FEED_VIDEO_2", 9, "ui_test_10_2", z, i2, defaultConstructorMarker);
        TEST_UI_PLAYABLE_AD = new getGroupName("TEST_UI_PLAYABLE_AD", 10, "ui_test_11", z2, i, defaultConstructorMarker2);
        ADMOB_INTERSTITIAL_BRAND = new getGroupName("ADMOB_INTERSTITIAL_BRAND", 11, "admob_test_ait.dev.f3ca6244d346478d", z, i2, defaultConstructorMarker);
        ADMOB_INTERSTITIAL_MOMENT = new getGroupName("ADMOB_INTERSTITIAL_MOMENT", 12, "admob_test_ait.dev.6965ed36d12e431f", z2, i, defaultConstructorMarker2);
        ADMOB_INTERSTITIAL_MOMENT_VIDEO = new getGroupName("ADMOB_INTERSTITIAL_MOMENT_VIDEO", 13, "admob_test_ait.dev.e59f58673e544d94", z, i2, defaultConstructorMarker);
        ADMOB_REWARD_BRAND = new getGroupName("ADMOB_REWARD_BRAND", 14, "admob_test_ait.dev.5b0a924a698647b2", z2, i, defaultConstructorMarker2);
        ADMOB_REWARD_MOMENT = new getGroupName("ADMOB_REWARD_MOMENT", 15, "admob_test_ait.dev.fd46e48b6b384024", z, i2, defaultConstructorMarker);
        ADMOB_REWARD_MOMENT_VIDEO = new getGroupName("ADMOB_REWARD_MOMENT_VIDEO", 16, "admob_test_ait.dev.8b37aea8d74648f8", z2, i, defaultConstructorMarker2);
        TEST_MOMENT_BANNER = new getGroupName("TEST_MOMENT_BANNER", 17, "13579", z, i2, defaultConstructorMarker);
        Object[] objArr2 = new Object[1];
        a(new char[]{11796, 5791}, 1 - Color.green(0), objArr2);
        BENEFIT_BANNER_ALPHA = new getGroupName("BENEFIT_BANNER_ALPHA", 18, ((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(new char[]{56100, 46906}, 1 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr3);
        BENEFIT_BANNER = new getGroupName("BENEFIT_BANNER", 19, ((String) objArr3[0]).intern(), true);
        BENEFIT_FEED_TEST = new getGroupName("BENEFIT_FEED_TEST", 20, "toss.dev.c755189473764bfc", true);
        BENEFIT_FEED = new getGroupName("BENEFIT_FEED", 21, "toss.live.d83c3d2505474c67", true);
        BENEFIT_BOARD_TEST_1 = new getGroupName("BENEFIT_BOARD_TEST_1", 22, "ui_test_6_1", true);
        BENEFIT_BOARD_TEST_2 = new getGroupName("BENEFIT_BOARD_TEST_2", 23, "ui_test_6_2", true);
        BENEFIT_BOARD_TEST_3 = new getGroupName("BENEFIT_BOARD_TEST_3", 24, "ui_test_6_3", true);
        BENEFIT_BOARD = new getGroupName("BENEFIT_BOARD", 25, "36", true);
        BENEFIT_PLACEMENT = new getGroupName("BENEFIT_PLACEMENT", 26, "toss.benefit-tab.placement", true);
        TEST_PLAYABLE_AD = new getGroupName("TEST_PLAYABLE_AD", 27, "toss.dev.e08675a85cb64663", false, 2, null);
        HOME_ALPHA = new getGroupName("HOME_ALPHA", 28, "toss.dev.4b0b3cee9a9841f8", false, 2, null);
        boolean z3 = false;
        int i3 = 2;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        HOME_LIVE = new getGroupName("HOME_LIVE", 29, "toss.live.979b882836ef4b09", z3, i3, defaultConstructorMarker3);
        boolean z4 = false;
        int i4 = 2;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        TOSS_SEC_HOME_BANNER_ALPHA = new getGroupName("TOSS_SEC_HOME_BANNER_ALPHA", 30, "toss.dev.a3ea9411fd624f7d", z4, i4, defaultConstructorMarker4);
        TOSS_SEC_HOME_BANNER_LIVE = new getGroupName("TOSS_SEC_HOME_BANNER_LIVE", 31, "toss.live.313dde8af1b34baa", z3, i3, defaultConstructorMarker3);
        TRANSFER_ALPHA = new getGroupName("TRANSFER_ALPHA", 32, "toss.dev.ac5376f5e1024d02", z4, i4, defaultConstructorMarker4);
        TRANSFER_LIVE = new getGroupName("TRANSFER_LIVE", 33, "toss.live.dd7cdfebc6874037", z3, i3, defaultConstructorMarker3);
        ACCOUNT = new getGroupName("ACCOUNT", 34, "31", z4, i4, defaultConstructorMarker4);
        getGroupName[] getgroupnameArr$values = $values();
        $VALUES = getgroupnameArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getgroupnameArr$values);
        int i5 = onTransact + 53;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i5 = $11 + 125;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i7 = $11 + 5;
            $10 = i7 % 128;
            int i8 = 58224;
            if (i7 % 2 != 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i8) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        int iIndexOf = TextUtils.indexOf("", "") + 10;
                        int keyRepeatTimeout = 12434 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), iIndexOf, keyRepeatTimeout, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), Color.blue(0) + 10, 12434 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i2++;
                    int i11 = $11 + 77;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr3 = cArr4;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 16014), KeyEvent.keyCodeFromString("") + 14, TextUtils.getOffsetBefore("", 0) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void IAuthTabCallback() {
        onNavigationEvent = (char) 3665;
        IAuthTabCallback = (char) 20245;
        onExtraCallback = (char) 17034;
        onWarmupCompleted = (char) 29246;
    }
}
