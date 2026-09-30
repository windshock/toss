package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getCertWithPFX {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getCertWithPFX[] $VALUES;
    public static final onExtraCallback Companion;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final int cardCode;
    private final String code;
    private final String vendorName;
    public static final getCertWithPFX NONE = new getCertWithPFX("NONE", 0, "선택", 0, BuildConfig.FLAVOR);
    public static final getCertWithPFX SHINHAN = new getCertWithPFX("SHINHAN", 1, "신한카드", 1, "shinhan");
    public static final getCertWithPFX HYUNDAI = new getCertWithPFX("HYUNDAI", 2, "현대카드", 2, "hyundaicard");
    public static final getCertWithPFX SAMSUNG = new getCertWithPFX("SAMSUNG", 3, "삼성카드", 3, "samsung");
    public static final getCertWithPFX KB = new getCertWithPFX("KB", 4, "KB국민카드", 4, "kb");
    public static final getCertWithPFX LOTTE = new getCertWithPFX("LOTTE", 5, "롯데카드", 5, "lotte");
    public static final getCertWithPFX HANA = new getCertWithPFX("HANA", 6, "하나카드", 6, "hana");
    public static final getCertWithPFX WOORI = new getCertWithPFX("WOORI", 7, "우리카드", 7, "woori");
    public static final getCertWithPFX NH = new getCertWithPFX("NH", 8, "NH농협카드", 8, "nh");
    public static final getCertWithPFX CITI = new getCertWithPFX("CITI", 9, "씨티카드", 9, "citi");
    public static final getCertWithPFX BC = new getCertWithPFX("BC", 10, "BC카드", 10, "bc");
    public static final getCertWithPFX IBK = new getCertWithPFX("IBK", 11, "IBK기업은행", 10, BuildConfig.FLAVOR);
    public static final getCertWithPFX SC = new getCertWithPFX("SC", 12, "SC제일은행", 10, BuildConfig.FLAVOR);
    public static final getCertWithPFX DAEGU = new getCertWithPFX("DAEGU", 13, "대구은행", 10, BuildConfig.FLAVOR);
    public static final getCertWithPFX BUSAN = new getCertWithPFX("BUSAN", 14, "부산은행", 10, BuildConfig.FLAVOR);
    public static final getCertWithPFX GYEONGNAM = new getCertWithPFX("GYEONGNAM", 15, "경남은행", 10, BuildConfig.FLAVOR);
    public static final getCertWithPFX TOSS = new getCertWithPFX("TOSS", 16, "토스카드", 888, BuildConfig.FLAVOR);

    private static final /* synthetic */ getCertWithPFX[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        getCertWithPFX[] getcertwithpfxArr = {NONE, SHINHAN, HYUNDAI, SAMSUNG, KB, LOTTE, HANA, WOORI, NH, CITI, BC, IBK, SC, DAEGU, BUSAN, GYEONGNAM, TOSS};
        int i5 = i3 + 53;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return getcertwithpfxArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<getCertWithPFX> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<getCertWithPFX> enumEntries = $ENTRIES;
        int i5 = i3 + 25;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static getCertWithPFX valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getCertWithPFX getcertwithpfx = (getCertWithPFX) Enum.valueOf(getCertWithPFX.class, str);
        int i4 = onExtraCallbackWithResult + 89;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return getcertwithpfx;
        }
        throw null;
    }

    public static getCertWithPFX[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getCertWithPFX[] getcertwithpfxArr = $VALUES;
        if (i3 != 0) {
            return (getCertWithPFX[]) getcertwithpfxArr.clone();
        }
        throw null;
    }

    private getCertWithPFX(String str, int i, String str2, int i2, String str3) {
        this.vendorName = str2;
        this.cardCode = i2;
        this.code = str3;
    }

    public final int getCardCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.cardCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getVendorName() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 91;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.vendorName;
        int i5 = i2 + 109;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 115;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.code;
        int i4 = i2 + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        getCertWithPFX[] getcertwithpfxArr$values = $values();
        $VALUES = getcertwithpfxArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getcertwithpfxArr$values);
        Companion = new onExtraCallback(null);
        int i = onNavigationEvent + 111;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.vendorName;
        int i4 = i3 + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getImageUrl() throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = Companion.onExtraCallbackWithResult(this.cardCode);
        if (strOnExtraCallbackWithResult == null) {
            strOnExtraCallbackWithResult = BuildConfig.FLAVOR;
        }
        int i4 = onExtraCallback + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static char[] onWarmupCompleted = {27178, 27265, 27291, 27293, 27292, 27385, 27355, 27358, 27388, 27290, 27269, 27269, 27265, 27273, 27367, 27388, 27292, 27292, 27290, 27391, 27362, 27266, 27361, 27367, 27269, 27290, 27267, 27267, 27290, 27388, 27360, 27264, 27266, 27266, 27390, 27367, 27276, 27270, 27267, 27266, 27264, 27266, 27266, 27390, 27388, 27293, 27290, 27266, 27268, 27266, 27365, 27367, 27276, 27270, 27267, 27266, 27264, 27266, 27266, 27361, 27391, 27293, 27290, 27266, 27268, 27266, 27364};

        public static final /* synthetic */ class onWarmupCompleted {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            static {
                int[] iArr = new int[getCertWithPFX.values().length];
                try {
                    iArr[getCertWithPFX.SHINHAN.ordinal()] = 1;
                    int i = IAuthTabCallback + 123;
                    onWarmupCompleted = i % 128;
                    int i2 = i % 2;
                    int i3 = 2 % 2;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[getCertWithPFX.HYUNDAI.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[getCertWithPFX.SAMSUNG.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[getCertWithPFX.KB.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[getCertWithPFX.LOTTE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[getCertWithPFX.HANA.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[getCertWithPFX.WOORI.ordinal()] = 7;
                    int i4 = 2 % 2;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[getCertWithPFX.NH.ordinal()] = 8;
                    int i5 = onWarmupCompleted + 31;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[getCertWithPFX.CITI.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[getCertWithPFX.BC.ordinal()] = 10;
                    int i8 = 2 % 2;
                } catch (NoSuchFieldError unused10) {
                }
                $EnumSwitchMapping$0 = iArr;
                int i9 = onWarmupCompleted + 5;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
            }
        }

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final getCertWithPFX onWarmupCompleted(int i) {
            getCertWithPFX[] getcertwithpfxArrValues;
            int length;
            getCertWithPFX getcertwithpfx;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 5;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                getcertwithpfxArrValues = getCertWithPFX.values();
                length = getcertwithpfxArrValues.length;
            } else {
                getcertwithpfxArrValues = getCertWithPFX.values();
                length = getcertwithpfxArrValues.length;
            }
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = onExtraCallbackWithResult + 119;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    getcertwithpfx = getcertwithpfxArrValues[i4];
                    int i6 = 15 / 0;
                    if (getcertwithpfx.getCardCode() == i) {
                        return getcertwithpfx;
                    }
                } else {
                    getcertwithpfx = getcertwithpfxArrValues[i4];
                    if (getcertwithpfx.getCardCode() == i) {
                        return getcertwithpfx;
                    }
                }
            }
            return null;
        }

        public final String onExtraCallbackWithResult(int i) throws Throwable {
            int i2 = 2 % 2;
            getCertWithPFX getcertwithpfxOnWarmupCompleted = onWarmupCompleted(i);
            Object obj = null;
            if (getcertwithpfxOnWarmupCompleted != null) {
                int i3 = onExtraCallbackWithResult + 89;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    StringsKt.isBlank(getcertwithpfxOnWarmupCompleted.getCode());
                    obj.hashCode();
                    throw null;
                }
                if (!StringsKt.isBlank(getcertwithpfxOnWarmupCompleted.getCode())) {
                    String code = getcertwithpfxOnWarmupCompleted.getCode();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr = new Object[1];
                    a(new int[]{0, 67, 97, 0}, false, new byte[]{1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0}, objArr);
                    sb.append(((String) objArr[0]).intern());
                    sb.append(code);
                    sb.append("@4x.png");
                    String string = sb.toString();
                    int i4 = onExtraCallback + 57;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return string;
                }
            }
            return null;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            int length;
            char[] cArr;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr2 = onWarmupCompleted;
            if (cArr2 != null) {
                int i7 = $11 + 43;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                }
                for (int i8 = 0; i8 < length; i8++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 35283), View.MeasureSpec.makeMeasureSpec(0, 0) + 35, 14239 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr;
            }
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr2, i3, cArr3, 0, i4);
            if (bArr != null) {
                int i9 = $11 + 29;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                char[] cArr4 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i11 = $11 + 63;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 10935), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 65, 16766 - AndroidCharacter.getMirror('0'), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 28, 17656 - MotionEvent.axisFromString(BuildConfig.FLAVOR), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        int i15 = $11 + 73;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 49467), ((byte) KeyEvent.getModifierMetaStateMask()) + 71, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                int i17 = $11 + 115;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    char[] cArr5 = new char[i4];
                    System.arraycopy(cArr3, 0, cArr5, 0, i4);
                    System.arraycopy(cArr5, 1, cArr3, i4 % i6, i6);
                    System.arraycopy(cArr5, i6, cArr3, 0, i4 >>> i6);
                } else {
                    char[] cArr6 = new char[i4];
                    System.arraycopy(cArr3, 0, cArr6, 0, i4);
                    int i18 = i4 - i6;
                    System.arraycopy(cArr6, 0, cArr3, i18, i6);
                    System.arraycopy(cArr6, i6, cArr3, 0, i18);
                }
            }
            if (z) {
                char[] cArr7 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i19 = $10 + 13;
                    $11 = i19 % 128;
                    if (i19 % 2 == 0) {
                        cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 << trackGroupExternalSyntheticLambda0.onNavigationEvent) >> 1];
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    } else {
                        cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                    }
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                }
                cArr3 = cArr7;
            }
            if (i5 > 0) {
                int i20 = $10 + 21;
                $11 = i20 % 128;
                int i21 = i20 % 2;
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }
}
