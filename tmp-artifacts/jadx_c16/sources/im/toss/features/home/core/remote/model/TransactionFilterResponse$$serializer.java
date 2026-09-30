package im.toss.features.home.core.remote.model;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
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
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionFilterResponse$$serializer implements aeu2<TransactionFilterResponse> {
    private static int IAuthTabCallback;
    public static final TransactionFilterResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static byte[] onNavigationEvent;
    private static int onTransact;
    private static short[] onWarmupCompleted;
    private static final byte[] $$a = {48, -22, 122, 126};
    private static final int $$b = 17;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, byte b) {
        int i2;
        int i3 = 1 - (s * 2);
        byte[] bArr = $$a;
        int i4 = 115 - (b * 2);
        int i5 = 4 - (i * 3);
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i3;
            int i7 = i5;
            i2 = 0;
            int i8 = i7 + 1;
            i4 = i5 + (-i6);
            i5 = i8;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i5];
            int i9 = i4;
            i7 = i5;
            i5 = i9;
            int i82 = i7 + 1;
            i4 = i5 + (-i6);
            i5 = i82;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i3) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onTransact = 0;
        onWarmupCompleted();
        TransactionFilterResponse$$serializer transactionFilterResponse$$serializer = new TransactionFilterResponse$$serializer();
        INSTANCE = transactionFilterResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.TransactionFilterResponse", transactionFilterResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("filters", false);
        Object[] objArr = new Object[1];
        a((short) View.getDefaultSize(0, 0), (byte) (View.combineMeasuredStates(0, 0) - 19), (-784110271) - KeyEvent.getDeadChar(0, 0), (-1878109468) + (KeyEvent.getMaxKeyCode() >> 16), (-10) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("currentKey", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackDefault + 113;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private TransactionFilterResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {TransactionFilterResponse.onExtraCallback()[0].getValue(), getwrigglelayout, getwrigglelayout};
        int i4 = asInterface + 95;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final TransactionFilterResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        List list;
        String str;
        String str2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = TransactionFilterResponse.onExtraCallback();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            List list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            int i3 = asInterface + 25;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            i = 7;
            list = list2;
            str = strAsInterface;
            str2 = strAsInterface2;
        } else {
            List list3 = null;
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            int i5 = 0;
            boolean z = true;
            while (!(!z)) {
                int i6 = IAuthTabCallbackStub + 121;
                asInterface = i6 % 128;
                if (i6 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i7 = IAuthTabCallbackStub + 85;
                    asInterface = i7 % 128;
                    int i8 = i7 % 2;
                    if (iOnNavigationEvent == 0) {
                        list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), list3);
                        i5 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i5 |= 2;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i5 |= 4;
                    }
                } else {
                    z = false;
                }
            }
            i = i5;
            list = list3;
            str = strAsInterface3;
            str2 = strAsInterface4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransactionFilterResponse(i, list, str, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m547deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TransactionFilterResponse transactionFilterResponseDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallbackStub + 117;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 65 / 0;
        }
        return transactionFilterResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransactionFilterResponse transactionFilterResponse) {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(transactionFilterResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TransactionFilterResponse.onNavigationEvent(transactionFilterResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(transactionFilterResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TransactionFilterResponse.onNavigationEvent(transactionFilterResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 99 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransactionFilterResponse) obj);
        int i4 = IAuthTabCallbackStub + 27;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asInterface + 19;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            char c = '0';
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.getOffsetAfter("", 0)), TextUtils.lastIndexOf("", '0', 0) + 43, MotionEvent.axisFromString("") + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                int i7 = $10 + 111;
                int i8 = i7 % 128;
                $11 = i8;
                if (i7 % 2 == 0) {
                    throw null;
                }
                byte[] bArr2 = onNavigationEvent;
                if (bArr2 != null) {
                    int i9 = i8 + 71;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i5])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12842), TextUtils.lastIndexOf("", c, 0) + 56, TextUtils.indexOf("", "") + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr[i5] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i5++;
                        c = '0';
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 43424), 42 - Color.argb(0, 0, 0, 0), Color.alpha(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    int i10 = $10 + 75;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i12 = $11;
                int i13 = i12 + 17;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                int i15 = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L)));
                if (z) {
                    int i16 = i12 + 3;
                    $10 = i16 % 128;
                    int i17 = i16 % 2 != 0 ? 0 : 1;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i15 + i17;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), TextUtils.getCapsMode("", 0, 0) + 86, 9567 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onNavigationEvent;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i18 = 0; i18 < length2; i18++) {
                            int i19 = $10 + 89;
                            $11 = i19 % 128;
                            int i20 = i19 % 2;
                            bArr5[i18] = (byte) (bArr4[i18] ^ (-4629411779493505016L));
                        }
                        int i21 = $10 + 35;
                        $11 = i21 % 128;
                        int i22 = i21 % 2;
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z2) {
                            int i23 = $11 + 101;
                            $10 = i23 % 128;
                            if (i23 % 2 != 0) {
                                byte[] bArr6 = onNavigationEvent;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent << 1;
                                i4 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback / (((byte) (((byte) (bArr6[r8] % (-4629411779493505016L))) * s)) ^ b);
                            } else {
                                byte[] bArr7 = onNavigationEvent;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                i4 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b);
                            }
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i4;
                        } else {
                            short[] sArr = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
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

    static void onWarmupCompleted() {
        onExtraCallback = -1963242825;
        onExtraCallbackWithResult = -1538795519;
        IAuthTabCallback = -877234792;
        onNavigationEvent = new byte[]{-12, 28, 29, -18, 16};
    }
}
