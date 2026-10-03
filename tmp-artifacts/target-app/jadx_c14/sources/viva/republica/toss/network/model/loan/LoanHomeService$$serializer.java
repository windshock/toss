package viva.republica.toss.network.model.loan;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.EncryptedContentInfoParser;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class LoanHomeService$$serializer implements aeu2<LoanHomeService> {
    private static short[] IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    public static final LoanHomeService$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static byte[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {69, 81, 99, -123};
    private static final int $$b = 12;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, int r8) {
        /*
            int r8 = r8 * 2
            int r0 = r8 + 1
            int r6 = r6 * 3
            int r6 = 115 - r6
            int r7 = r7 + 4
            byte[] r1 = viva.republica.toss.network.model.loan.LoanHomeService$$serializer.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeService$$serializer.$$c(byte, byte, int):java.lang.String");
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallbackStub = 0;
        onNavigationEvent();
        LoanHomeService$$serializer loanHomeService$$serializer = new LoanHomeService$$serializer();
        INSTANCE = loanHomeService$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.LoanHomeService", loanHomeService$$serializer, 7);
        setanimationsloop.onWarmupCompleted("iconUrl", true);
        Object[] objArr = new Object[1];
        a((short) ((ViewConfiguration.getTouchSlop() >> 8) + 35), (byte) KeyEvent.normalizeMetaState(0), 770021247 + (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-582484560) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (-54) - TextUtils.lastIndexOf("", '0', 0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a((short) ((-18) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) (ViewConfiguration.getScrollBarSize() >> 8), 770021251 - (ViewConfiguration.getScrollBarSize() >> 8), Process.getGidForName("") - 582484559, (ViewConfiguration.getLongPressTimeout() >> 16) - 54, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("loanStatus", true);
        setanimationsloop.onWarmupCompleted("landingUrl", true);
        setanimationsloop.onWarmupCompleted("summaryResult", true);
        setanimationsloop.onWarmupCompleted("creditPeerAverageInfo", true);
        descriptor = setanimationsloop;
        int i = asInterface + 51;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private LoanHomeService$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(LoanHomeServiceSummaryResult$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(LoanHomeCreditPeerAverageInfo$$serializer.INSTANCE);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2};
        int i4 = IAuthTabCallbackDefault + 11;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            m47deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LoanHomeService loanHomeServiceM47deserialize = m47deserialize(decoder);
        int i3 = asBinder + 63;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return loanHomeServiceM47deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final LoanHomeService m47deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String strAsInterface2;
        String strAsInterface3;
        String strAsInterface4;
        LoanHomeCreditPeerAverageInfo loanHomeCreditPeerAverageInfo;
        int i;
        String str;
        LoanHomeServiceSummaryResult loanHomeServiceSummaryResult;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 95;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String strAsInterface5 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            LoanHomeServiceSummaryResult loanHomeServiceSummaryResult2 = null;
            loanHomeCreditPeerAverageInfo = null;
            strAsInterface4 = null;
            strAsInterface3 = null;
            strAsInterface2 = null;
            strAsInterface = null;
            i = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        loanHomeServiceSummaryResult2 = (LoanHomeServiceSummaryResult) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, LoanHomeServiceSummaryResult$$serializer.INSTANCE, loanHomeServiceSummaryResult2);
                        i |= 32;
                        break;
                    case 6:
                        loanHomeCreditPeerAverageInfo = (LoanHomeCreditPeerAverageInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, LoanHomeCreditPeerAverageInfo$$serializer.INSTANCE, loanHomeCreditPeerAverageInfo);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            loanHomeServiceSummaryResult = loanHomeServiceSummaryResult2;
            str = strAsInterface5;
        } else {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            LoanHomeServiceSummaryResult loanHomeServiceSummaryResult3 = (LoanHomeServiceSummaryResult) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, LoanHomeServiceSummaryResult$$serializer.INSTANCE, (Object) null);
            loanHomeCreditPeerAverageInfo = (LoanHomeCreditPeerAverageInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, LoanHomeCreditPeerAverageInfo$$serializer.INSTANCE, (Object) null);
            i = 127;
            str = strAsInterface6;
            loanHomeServiceSummaryResult = loanHomeServiceSummaryResult3;
        }
        String str2 = strAsInterface2;
        String str3 = strAsInterface;
        int i5 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        LoanHomeService loanHomeService = new LoanHomeService(i5, str3, str2, strAsInterface3, strAsInterface4, str, loanHomeServiceSummaryResult, loanHomeCreditPeerAverageInfo, (okycx) null);
        int i6 = asBinder + 93;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 58 / 0;
        }
        return loanHomeService;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LoanHomeService) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 47;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LoanHomeService loanHomeService) {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(loanHomeService, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            LoanHomeService.onExtraCallback(loanHomeService, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(loanHomeService, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        LoanHomeService.onExtraCallback(loanHomeService, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = asBinder + 79;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 63 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = asBinder + 89;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int i5;
        int length;
        byte[] bArr;
        int i6;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - KeyEvent.getDeadChar(0, 0)), 41 - TextUtils.indexOf((CharSequence) "", '0'), 22438 - ExpandableListView.getPackedPositionChild(0L), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $11 + 45;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                int i10 = $11 + 5;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                byte[] bArr2 = onExtraCallback;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    for (int i11 = 0; i11 < length2; i11++) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i11])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - ImageFormat.getBitsPerPixel(0)), 55 - (ViewConfiguration.getTapTimeout() >> 16), 2167 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -299036574, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        bArr3[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = onExtraCallback;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.combineMeasuredStates(0, 0)), Color.green(0) + 42, 22439 - (ViewConfiguration.getEdgeSlop() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 86 - TextUtils.getCapsMode("", 0, 0), 9566 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onExtraCallback;
                if (bArr5 != null) {
                    int i12 = $10 + 119;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i6 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i6 = 0;
                    }
                    while (i6 < length) {
                        bArr[i6] = (byte) (bArr5[i6] ^ (-4629411779493505016L));
                        i6++;
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    int i13 = $11 + 93;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        int i15 = $11 + 57;
                        $10 = i15 % 128;
                        if (i15 % 2 != 0) {
                            byte[] bArr6 = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent;
                            i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback - (((byte) (((byte) (bArr6[r8] * (-4629411779493505016L))) % s)) ^ b);
                        } else {
                            byte[] bArr7 = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b);
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i5;
                    } else {
                        short[] sArr = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = 1985851529;
        onWarmupCompleted = -1538795470;
        onNavigationEvent = -2030052660;
        onExtraCallback = new byte[]{-34, -35, -32, -38, 0, 2, 16, 8, 8};
    }
}
