package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1;
import o.SetDetectableSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.plcc.benefit.PlccBenefitGroupItem;
import viva.republica.toss.plcc.util.PlccBenefitLogUtil$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 {
    private static int IAuthTabCallback;
    private static int onExtraCallbackWithResult;
    public static final JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 onWarmupCompleted;
    private static final byte[] $$a = {84, -122, 19, 43};
    private static final int $$b = 136;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    private static String $$c(byte b, short s, int i) {
        int i2 = 105 - (i * 2);
        byte[] bArr = $$a;
        int i3 = 3 - (b * 2);
        int i4 = s * 2;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i2 = i3 + (-i5);
            i3 = i3;
        }
        while (true) {
            i6++;
            int i7 = i3 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 += -bArr[i7];
            i3 = i7;
        }
    }

    static {
        IAuthTabCallback = 0;
        onExtraCallbackWithResult();
        onWarmupCompleted = new JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1();
        int i = onTransact + 55;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, String str3, long j, PlccBenefitGroupItem plccBenefitGroupItem, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {str, str2, str3, Long.valueOf(j), plccBenefitGroupItem, setDetectableSize};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(-1082778239, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, 1082778239, iOnExtraCallbackWithResult, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        int i4 = onExtraCallback + 1;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(-594415652, iOnExtraCallbackWithResult2, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{str, setDetectableSize}, 594415654, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3);
        int i4 = onNavigationEvent + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, boolean z, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, z, setDetectableSize);
        int i4 = onExtraCallback + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, boolean z, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {str, str2, Boolean.valueOf(z), setDetectableSize};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(1517878199, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, -1517878196, iOnExtraCallbackWithResult, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        int i4 = onNavigationEvent + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, String str2, String str3, long j, boolean z, boolean z2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, str2, str3, j, z, z2, setDetectableSize);
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i;
        int i8 = ~(i7 | i4);
        int i9 = ~i4;
        int i10 = ~((~i5) | i9);
        int i11 = ~(i9 | i);
        int i12 = i10 | i11;
        int i13 = (~(i5 | i7)) | i11 | i8;
        int i14 = i4 + i + i2 + ((-168536539) * i6) + (1787681333 * i3);
        int i15 = i14 * i14;
        int i16 = (i4 * (-925914073)) + 175428941 + (i * (-925912777)) + (i8 * (-864)) + (i12 * 432) + (i13 * 432) + ((-925913209) * i2) + (1252505731 * i6) + (30625011 * i3) + (i15 * (-2030960640));
        int i17 = ((-1349843359) * i4) + 1460535296 + ((-923239215) * i) + ((-1716058528) * i8) + (i12 * (-1289454384)) + ((-1289454384) * i13) + (366215168 * i2) + (1604583424 * i6) + (216268800 * i3) + (1778253824 * i15) + (i16 * i16 * 899809280);
        if (i17 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i17 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i17 == 3) {
            return onExtraCallback(objArr);
        }
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        PlccBenefitGroupItem plccBenefitGroupItem = (PlccBenefitGroupItem) objArr[4];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[5];
        int i18 = 2 % 2;
        int i19 = onExtraCallback + 101;
        onNavigationEvent = i19 % 128;
        int i20 = i19 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        a(8 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{7, 7, 65530, 7, 7, 65530, 65531, 65530}, true, 270 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
        setDetectableSize.onExtraCallback("section_title", str2);
        setDetectableSize.onExtraCallback("year_month", onWarmupCompleted.onNavigationEvent(str3));
        setDetectableSize.onExtraCallback("card_id", Long.valueOf(jLongValue));
        setDetectableSize.onExtraCallback("item_title", plccBenefitGroupItem.onExtraCallback());
        setDetectableSize.onExtraCallback("item_subtitle", plccBenefitGroupItem.onNavigationEvent());
        setDetectableSize.onExtraCallback("item_pct", plccBenefitGroupItem.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i21 = onExtraCallback + 103;
        onNavigationEvent = i21 % 128;
        int i22 = i21 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, long j, String str2, int i, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 41;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, j, str2, i, setDetectableSize);
        if (i4 != 0) {
            int i5 = 82 / 0;
        }
        int i6 = onExtraCallback + 41;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, setDetectableSize);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        int i5 = onExtraCallback + 91;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1() {
    }

    public final void onExtraCallback(@Nullable String str, @NotNull String str2, @NotNull String str3, long j, @NotNull PlccBenefitGroupItem plccBenefitGroupItem) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(plccBenefitGroupItem, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1333661L, false, (String) null, (Map) null, new PlccBenefitLogUtil$.ExternalSyntheticLambda6(str, str2, str3, j, plccBenefitGroupItem), 14, (Object) null);
        int i2 = onNavigationEvent + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final void onExtraCallbackWithResult(long j, @NotNull final String str, final boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ConvertByteArrayToFloatArray.onExtraCallback(j, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.plcc.util.PlccBenefitLogUtil$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.IAuthTabCallback(str, z, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = onExtraCallback + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onNavigationEvent(String str, boolean z, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("item_title", str);
            setDetectableSize.onExtraCallback("current_month_yn", zzaz.onExtraCallbackWithResult(z));
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("item_title", str);
        setDetectableSize.onExtraCallback("current_month_yn", zzaz.onExtraCallbackWithResult(z));
        Unit unit2 = Unit.INSTANCE;
        int i3 = onNavigationEvent + 85;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public final void IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1333667L, false, (String) null, (Map) null, new PlccBenefitLogUtil$.ExternalSyntheticLambda4(str), 14, (Object) null);
        int i2 = onExtraCallback + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str = (String) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("item_title", str);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 51;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return unit;
    }

    public final void IAuthTabCallback(@NotNull String str, @NotNull String str2, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1333657L, false, (String) null, (Map) null, new PlccBenefitLogUtil$.ExternalSyntheticLambda1(str, str2, z), 14, (Object) null);
        int i2 = onNavigationEvent + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[3];
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("year_month", onWarmupCompleted.onNavigationEvent(str));
            setDetectableSize.onExtraCallback("item_type", str2);
            setDetectableSize.onExtraCallback("current_month_yn", zzaz.onExtraCallbackWithResult(zBooleanValue));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("year_month", onWarmupCompleted.onNavigationEvent(str));
        setDetectableSize.onExtraCallback("item_type", str2);
        setDetectableSize.onExtraCallback("current_month_yn", zzaz.onExtraCallbackWithResult(zBooleanValue));
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public final void onWarmupCompleted(@NotNull final String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1333673L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.plcc.util.PlccBenefitLogUtil$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted(str, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = onExtraCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallbackWithResult(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("tab", str);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("tab", str);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 87;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 66 / 0;
        }
        return unit2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final String str = (String) objArr[1];
        final long jLongValue = ((Number) objArr[2]).longValue();
        final String str2 = (String) objArr[3];
        final int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1333675L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.plcc.util.PlccBenefitLogUtil$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted(str, jLongValue, str2, iIntValue, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = onExtraCallback + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static final Unit onExtraCallback(String str, long j, String str2, int i, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 77;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("tab", str);
        setDetectableSize.onExtraCallback("card_id", Long.valueOf(j));
        setDetectableSize.onExtraCallback("year_month", onWarmupCompleted.onNavigationEvent(str2));
        setDetectableSize.onExtraCallback("trx_cnt", Integer.valueOf(i));
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 63;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public final void onExtraCallback(@Nullable final String str, @NotNull final String str2, @NotNull final String str3, final long j, final boolean z, final boolean z2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1333659L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.plcc.util.PlccBenefitLogUtil$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onNavigationEvent(str, str2, str3, j, z, z2, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = onNavigationEvent + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallback(String str, String str2, String str3, long j, boolean z, boolean z2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(9 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.argb(0, 0, 0, 0) + 1, new char[]{7, 7, 65530, 7, 7, 65530, 65531, 65530}, true, 269 - KeyEvent.getDeadChar(0, 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("section_title", str2);
        setDetectableSize.onExtraCallback("year_month", onWarmupCompleted.onNavigationEvent(str3));
        setDetectableSize.onExtraCallback("card_id", Long.valueOf(j));
        setDetectableSize.onExtraCallback("reach_goal_yn", zzaz.onExtraCallbackWithResult(z));
        setDetectableSize.onExtraCallback("current_month_yn", zzaz.onExtraCallbackWithResult(z2));
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return unit;
    }

    public final String onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strReplace = new Regex("(\\d{4})(\\d{2})").replace(str, "$1-$2");
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return strReplace;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r22, int r23, char[] r24, boolean r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2, boolean z, SetDetectableSize setDetectableSize) {
        Object[] objArr = {str, str2, Boolean.valueOf(z), setDetectableSize};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(1517878199, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, -1517878196, iOnExtraCallbackWithResult, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    private static final Unit onNavigationEvent(String str, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(-594415652, iOnExtraCallbackWithResult2, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{str, setDetectableSize}, 594415654, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3);
    }

    private static final Unit onWarmupCompleted(String str, String str2, String str3, long j, PlccBenefitGroupItem plccBenefitGroupItem, SetDetectableSize setDetectableSize) {
        Object[] objArr = {str, str2, str3, Long.valueOf(j), plccBenefitGroupItem, setDetectableSize};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(-1082778239, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, 1082778239, iOnExtraCallbackWithResult, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public final void onExtraCallback(@NotNull String str, long j, @NotNull String str2, int i) throws Throwable {
        Object[] objArr = {this, str, Long.valueOf(j), str2, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onWarmupCompleted(623591432, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, -623591431, iOnExtraCallbackWithResult, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = 478309003;
    }
}
