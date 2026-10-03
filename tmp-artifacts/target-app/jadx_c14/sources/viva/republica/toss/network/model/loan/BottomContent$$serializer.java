package viva.republica.toss.network.model.loan;

import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.EncryptedContentInfoParser;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class BottomContent$$serializer implements aeu2<BottomContent> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final BottomContent$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int[] onNavigationEvent = null;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 75;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 121;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onNavigationEvent;
        int i4 = -1469660336;
        long j = 0;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $11 + 71;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 72, 8848 - Gravity.getAbsoluteGravity(0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i8]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1)), 72 - (ViewConfiguration.getWindowTouchSlop() >> 8), 8847 - TextUtils.lastIndexOf("", '0'), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i8++;
                i4 = -1469660336;
                i5 = 0;
            }
            i2 = i5;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i9 = $10 + 91;
            $11 = i9 % 128;
            int i10 = 2;
            int i11 = i9 % 2;
            int i12 = 0;
            while (i12 < 16) {
                int i13 = $10 + 19;
                $11 = i13 % 128;
                if (i13 % i10 == 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22251), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39, 10301 - TextUtils.getCapsMode("", 0, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i12 += 16;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                    try {
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 38, (ViewConfiguration.getFadingEdgeLength() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                        i12++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i10 = 2;
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4034 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 78, 7399 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        onNavigationEvent();
        BottomContent$$serializer bottomContent$$serializer = new BottomContent$$serializer();
        INSTANCE = bottomContent$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.BottomContent", bottomContent$$serializer, 10);
        setanimationsloop.onWarmupCompleted("iconUrl", false);
        setanimationsloop.onWarmupCompleted("mainText", false);
        setanimationsloop.onWarmupCompleted("subText", true);
        Object[] objArr = new Object[1];
        a(new int[]{1926336443, 679354102, 1652371026, 174723219}, 6 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("helpText", true);
        setanimationsloop.onWarmupCompleted("badge", true);
        setanimationsloop.onWarmupCompleted("subContents", true);
        setanimationsloop.onWarmupCompleted("impressionLogId", true);
        setanimationsloop.onWarmupCompleted("clickLogId", true);
        setanimationsloop.onWarmupCompleted("remainTimeInfo", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 7;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 69 / 0;
        }
    }

    private BottomContent$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = BottomContent.onNavigationEvent();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        oty1 oty1Var = oty1.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(LoanProductBadge$$serializer.INSTANCE), lazyArrOnNavigationEvent[6].getValue(), oty1Var, oty1Var, sp.IAuthTabCallback(RemainingTimeInfo$$serializer.INSTANCE)};
        int i4 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        BottomContent bottomContentM24deserialize = m24deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return bottomContentM24deserialize;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final BottomContent m24deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        long jIAuthTabCallbackDefault;
        long jIAuthTabCallbackDefault2;
        String str;
        String str2;
        String str3;
        String str4;
        LoanProductBadge loanProductBadge;
        int i;
        List list;
        RemainingTimeInfo remainingTimeInfo;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = BottomContent.onNavigationEvent();
        boolean z = true;
        int i3 = 9;
        int i4 = 7;
        int i5 = 8;
        String str5 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            boolean z2 = true;
            String str6 = null;
            LoanProductBadge loanProductBadge2 = null;
            List list2 = null;
            String str7 = null;
            String str8 = null;
            strAsInterface = null;
            jIAuthTabCallbackDefault2 = 0;
            jIAuthTabCallbackDefault = 0;
            int i8 = 0;
            RemainingTimeInfo remainingTimeInfo2 = null;
            while (z2 == z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = true;
                        i3 = 9;
                        i5 = 8;
                        z2 = false;
                    case 0:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i8 |= 1;
                        z = true;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i8 |= 2;
                        int i9 = onExtraCallbackWithResult + 41;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        str6 = strAsInterface2;
                        str7 = str7;
                        str8 = str8;
                        z = true;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                    case 2:
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str5);
                        i8 |= 4;
                        z = true;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                    case 3:
                        i8 |= 8;
                        str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str8);
                        z = true;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                    case 4:
                        i8 |= 16;
                        str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str7);
                        z = true;
                        i3 = 9;
                        i5 = 8;
                    case 5:
                        loanProductBadge2 = (LoanProductBadge) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, LoanProductBadge$$serializer.INSTANCE, loanProductBadge2);
                        i8 |= 32;
                        z = true;
                        i3 = 9;
                    case 6:
                        list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, (jp) lazyArrOnNavigationEvent[6].getValue(), list2);
                        i8 |= 64;
                        z = true;
                    case 7:
                        jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, i4);
                        i8 |= 128;
                        z = true;
                    case 8:
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, i5);
                        i8 |= 256;
                        z = true;
                    case 9:
                        remainingTimeInfo2 = (RemainingTimeInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, RemainingTimeInfo$$serializer.INSTANCE, remainingTimeInfo2);
                        i8 |= 512;
                        z = true;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            int i11 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            str2 = str6;
            loanProductBadge = loanProductBadge2;
            i = i8;
            list = list2;
            str = str5;
            remainingTimeInfo = remainingTimeInfo2;
            str3 = str7;
            str4 = str8;
        } else {
            int i13 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            LoanProductBadge loanProductBadge3 = (LoanProductBadge) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, LoanProductBadge$$serializer.INSTANCE, (Object) null);
            List list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, (jp) lazyArrOnNavigationEvent[6].getValue(), (Object) null);
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 7);
            jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 8);
            str = str9;
            str2 = strAsInterface3;
            str3 = str11;
            str4 = str10;
            loanProductBadge = loanProductBadge3;
            i = 1023;
            list = list3;
            remainingTimeInfo = (RemainingTimeInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, RemainingTimeInfo$$serializer.INSTANCE, (Object) null);
        }
        String str12 = strAsInterface;
        long j = jIAuthTabCallbackDefault2;
        long j2 = jIAuthTabCallbackDefault;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BottomContent(i, str12, str2, str, str4, str3, loanProductBadge, list, j2, j, remainingTimeInfo, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BottomContent) obj);
        int i4 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BottomContent bottomContent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bottomContent, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        BottomContent.onExtraCallbackWithResult(bottomContent, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void onNavigationEvent() {
        onNavigationEvent = new int[]{1499309793, 32020854, 1055104717, -1374119096, -1230325379, -752248913, 708694596, -336197971, -659994772, 427662447, 2099790086, 1376742009, 188213526, -880904917, 187659827, -24540138, -1703926702, 530344488};
    }
}
