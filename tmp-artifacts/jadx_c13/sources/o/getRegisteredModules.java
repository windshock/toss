package o;

import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.uikit.R;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getRegisteredModules {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getRegisteredModules[] $VALUES;
    public static final onNavigationEvent Companion;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 0;
    public static final getRegisteredModules None;
    public static final getRegisteredModules Toss;
    public static final getRegisteredModules TossBank;
    public static final getRegisteredModules TossIncome;
    public static final getRegisteredModules TossInsurance;
    public static final getRegisteredModules TossMobile;
    public static final getRegisteredModules TossPlace;
    public static final getRegisteredModules TossSecurities;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static boolean onWarmupCompleted;
    private final int defaultMessage;
    private final int fullLogoNightResId;
    private final int fullLogoResId;
    private final int label;
    private final String type;

    private static final /* synthetic */ getRegisteredModules[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 105;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        getRegisteredModules[] getregisteredmodulesArr = {Toss, TossBank, TossSecurities, TossInsurance, TossMobile, TossPlace, TossIncome, None};
        int i5 = i2 + 109;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return getregisteredmodulesArr;
    }

    public static EnumEntries<getRegisteredModules> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        int i3 = i2 % 128;
        asInterface = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        EnumEntries<getRegisteredModules> enumEntries = $ENTRIES;
        int i4 = i3 + 1;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return enumEntries;
        }
        obj.hashCode();
        throw null;
    }

    public static getRegisteredModules valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getRegisteredModules getregisteredmodules = (getRegisteredModules) Enum.valueOf(getRegisteredModules.class, str);
        int i4 = asInterface + 19;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return getregisteredmodules;
    }

    public static getRegisteredModules[] values() {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getRegisteredModules[] getregisteredmodulesArr = $VALUES;
        if (i3 == 0) {
            return (getRegisteredModules[]) getregisteredmodulesArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getRegisteredModules(String str, int i, String str2, int i2, int i3, int i4, int i5) {
        this.type = str2;
        this.label = i2;
        this.defaultMessage = i3;
        this.fullLogoResId = i4;
        this.fullLogoNightResId = i5;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.type;
        }
        throw null;
    }

    public final int getLabel() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 113;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.label;
        int i6 = i2 + 47;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final int getDefaultMessage() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.defaultMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getFullLogoResId() {
        int i = 2 % 2;
        int i2 = asInterface + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.fullLogoResId;
        }
        throw null;
    }

    public final int getFullLogoNightResId() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.fullLogoNightResId;
        int i5 = i3 + 5;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    static {
        onWarmupCompleted();
        int i = R.string.bridge_type_transition_label_toss;
        int i2 = R.string.bridge_type_transition_description;
        Toss = new getRegisteredModules("Toss", 0, "toss", i, i2, R.drawable.logo_toss, R.drawable.logo_toss_dark);
        TossBank = new getRegisteredModules("TossBank", 1, "bank", R.string.bridge_type_transition_label_toss_bank, i2, R.drawable.logo_bank, R.drawable.logo_bank_dark);
        int i3 = R.string.bridge_type_transition_label_toss_securities;
        int i4 = R.string.bridge_type_transition_description_has_last_consonant;
        int i5 = R.drawable.logo_securities;
        int i6 = R.drawable.logo_securities_dark;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-127, -126, -122, -121, -122, -123, -124, -125, -126, -127}, KeyEvent.getDeadChar(0, 0) + 127, objArr);
        TossSecurities = new getRegisteredModules("TossSecurities", 2, ((String) objArr[0]).intern(), i3, i4, i5, i6);
        TossInsurance = new getRegisteredModules("TossInsurance", 3, "insurance", R.string.bridge_type_transition_label_toss_insurance, i2, R.drawable.logo_insurance, R.drawable.logo_insurance_dark);
        TossMobile = new getRegisteredModules("TossMobile", 4, "mobile", R.string.bridge_type_transition_label_toss_mobile, i2, R.drawable.logo_mobile, R.drawable.logo_mobile_dark);
        TossPlace = new getRegisteredModules("TossPlace", 5, "place", R.string.bridge_type_transition_label_toss_place, i2, R.drawable.logo_place, R.drawable.logo_place_dark);
        TossIncome = new getRegisteredModules("TossIncome", 6, "income", R.string.bridge_type_transition_label_toss_income, i4, R.drawable.logo_income, R.drawable.logo_income_dark);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-126, -120, -119, -120}, ExpandableListView.getPackedPositionType(0L) + 127, objArr2);
        None = new getRegisteredModules("None", 7, ((String) objArr2[0]).intern(), 0, 0, 0, 0);
        getRegisteredModules[] getregisteredmodulesArr$values = $values();
        $VALUES = getregisteredmodulesArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getregisteredmodulesArr$values);
        Companion = new onNavigationEvent(null);
        int i7 = IAuthTabCallbackDefault + 107;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
    }

    public static final class onNavigationEvent {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final getRegisteredModules IAuthTabCallback(@NotNull String str) {
            Iterator<getRegisteredModules> it;
            getRegisteredModules next;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                it = getRegisteredModules.getEntries().iterator();
                int i3 = 89 / 0;
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                it = getRegisteredModules.getEntries().iterator();
            }
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(next.getType(), str)) {
                    break;
                }
            }
            getRegisteredModules getregisteredmodules = next;
            if (getregisteredmodules != null) {
                return getregisteredmodules;
            }
            getRegisteredModules getregisteredmodules2 = getRegisteredModules.None;
            int i4 = onWarmupCompleted + 27;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return getregisteredmodules2;
            }
            throw null;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onNavigationEvent;
        long j = 0;
        if (cArr2 != null) {
            int i4 = $11 + 3;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 11;
                $10 = i7 % 128;
                int i8 = i7 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 77, Gravity.getAbsoluteGravity(0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    i2 = 2;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 74, 16037 - TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i9 = 1052772399;
        if (onWarmupCompleted) {
            int i10 = $11 + 13;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 63 - View.MeasureSpec.makeMeasureSpec(0, 0), 12214 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i12 = $11 + 39;
                $10 = i12 % 128;
                int i13 = i12 % 2;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i14 = $10 + 55;
        $11 = i14 % 128;
        int i15 = i14 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i9);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0')), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 63, 12214 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i9 = 1052772399;
        }
        String str = new String(cArr6);
        int i16 = $11 + 115;
        $10 = i16 % 128;
        int i17 = i16 % 2;
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        onNavigationEvent = new char[]{32502, 32452, 32454, 32500, 32503, 32504, 32501, 32499, 32498};
        onExtraCallbackWithResult = -1184333983;
        IAuthTabCallback = true;
        onWarmupCompleted = true;
    }
}
