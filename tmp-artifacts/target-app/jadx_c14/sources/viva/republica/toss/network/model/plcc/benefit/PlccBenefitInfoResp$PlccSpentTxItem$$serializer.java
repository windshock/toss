package viva.republica.toss.network.model.plcc.benefit;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
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
import o.getBgColor;
import o.getWriggleLayout;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class PlccBenefitInfoResp$PlccSpentTxItem$$serializer implements aeu2<PlccBenefitInfoResp.PlccSpentTxItem> {
    public static final int $stable;
    private static short[] IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    public static final PlccBenefitInfoResp$PlccSpentTxItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static byte[] onWarmupCompleted;
    private static final byte[] $$a = {86, 117, -27, 75};
    private static final int $$b = 117;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, short r8) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r7 = r7 * 2
            int r7 = r7 + 115
            byte[] r1 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccSpentTxItem$$serializer.$$a
            int r8 = r8 * 4
            int r8 = 4 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccSpentTxItem$$serializer.$$c(int, int, short):java.lang.String");
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        IAuthTabCallbackDefault = 0;
        onNavigationEvent();
        PlccBenefitInfoResp$PlccSpentTxItem$$serializer plccBenefitInfoResp$PlccSpentTxItem$$serializer = new PlccBenefitInfoResp$PlccSpentTxItem$$serializer();
        INSTANCE = plccBenefitInfoResp$PlccSpentTxItem$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccSpentTxItem", plccBenefitInfoResp$PlccSpentTxItem$$serializer, 6);
        setanimationsloop.onWarmupCompleted("isValid", false);
        setanimationsloop.onWarmupCompleted("salesTs", true);
        setanimationsloop.onWarmupCompleted("useStore", true);
        setanimationsloop.onWarmupCompleted("amount", true);
        Object[] objArr = new Object[1];
        a((short) (17 - (ViewConfiguration.getScrollBarSize() >> 8)), (byte) ((-69) - TextUtils.getTrimmedLength("")), 2046568976 - KeyEvent.keyCodeFromString(""), TextUtils.getOffsetBefore("", 0) + 1444581218, (-1) - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("isCancel", true);
        descriptor = setanimationsloop;
        int i = asInterface + 17;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private PlccBenefitInfoResp$PlccSpentTxItem$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getbgcolor, getwrigglelayout, getwrigglelayout, oty1.onExtraCallback, getwrigglelayout, getbgcolor};
        int i4 = IAuthTabCallbackStub + 105;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        PlccBenefitInfoResp.PlccSpentTxItem plccSpentTxItemM69deserialize = m69deserialize(decoder);
        int i4 = asBinder + 63;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return plccSpentTxItemM69deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final PlccBenefitInfoResp.PlccSpentTxItem m69deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        String strAsInterface;
        String strAsInterface2;
        long jIAuthTabCallbackDefault;
        String strAsInterface3;
        boolean zOnExtraCallbackWithResult2;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = asBinder + 71;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            strAsInterface3 = null;
            boolean z = true;
            jIAuthTabCallbackDefault = 0;
            i = 0;
            zOnExtraCallbackWithResult = false;
            zOnExtraCallbackWithResult2 = false;
            strAsInterface = null;
            strAsInterface2 = null;
            while (z) {
                int i6 = IAuthTabCallbackStub + 101;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i8 = IAuthTabCallbackStub + 1;
                        asBinder = i8 % 128;
                        int i9 = i8 % 2;
                        z = false;
                    case 0:
                        zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                        i |= 1;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i |= 2;
                    case 2:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i |= 4;
                    case 3:
                        jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
                        i |= 8;
                        i2 = asBinder + 49;
                        IAuthTabCallbackStub = i2 % 128;
                        int i10 = i2 % 2;
                    case 4:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i |= 16;
                        i2 = IAuthTabCallbackStub + 45;
                        asBinder = i2 % 128;
                        int i102 = i2 % 2;
                    case 5:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5);
                        i |= 32;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
        } else {
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5);
            int i11 = asBinder + 3;
            IAuthTabCallbackStub = i11 % 128;
            int i12 = i11 % 2;
            i = 63;
        }
        String str = strAsInterface;
        String str2 = strAsInterface2;
        long j = jIAuthTabCallbackDefault;
        int i13 = i;
        boolean z2 = zOnExtraCallbackWithResult;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PlccBenefitInfoResp.PlccSpentTxItem(i13, z2, str, str2, j, strAsInterface3, zOnExtraCallbackWithResult2, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PlccBenefitInfoResp.PlccSpentTxItem) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 21;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PlccBenefitInfoResp.PlccSpentTxItem plccSpentTxItem) {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(plccSpentTxItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        PlccBenefitInfoResp.PlccSpentTxItem.IAuthTabCallback(plccSpentTxItem, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackStub + 111;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asBinder + 11;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43423), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 41, View.getDefaultSize(0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                int i5 = $10 + 49;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                byte[] bArr = onWarmupCompleted;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 12843), 55 - (ViewConfiguration.getLongPressTimeout() >> 16), 2166 - MotionEvent.axisFromString(""), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onWarmupCompleted;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43425 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 43, Gravity.getAbsoluteGravity(0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ j)) + (!(z ^ true) ? 1 : 0);
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 86 - TextUtils.getOffsetAfter("", 0), 9568 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onWarmupCompleted;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i8 = 0; i8 < length2; i8++) {
                        int i9 = $11 + 1;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        bArr5[i8] = (byte) (bArr4[i8] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i11 = $11 + 79;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        throw null;
                    }
                    if (z2) {
                        byte[] bArr6 = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
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
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void onNavigationEvent() {
        onNavigationEvent = 574885368;
        onExtraCallback = -1538795505;
        onExtraCallbackWithResult = 228763928;
        onWarmupCompleted = new byte[]{59, 62, -112, 62, 63, 8};
    }
}
