package im.toss.features.home.core.local.model.dst.widget;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal$;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetActivationBannerButtonLocal$$serializer implements aeu2<AssetActivationBannerButtonLocal> {
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    public static final AssetActivationBannerButtonLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static short[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static byte[] onWarmupCompleted;
    private static final byte[] $$a = {114, 69, -115, -114};
    private static final int $$b = 65;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallbackDefault = 0;

    private static String $$c(short s, byte b, int i) {
        int i2 = (s * 2) + 4;
        int i3 = 115 - (b * 4);
        int i4 = i * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 += i4;
            i2++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i2];
            i2++;
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 91;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 95;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        IAuthTabCallbackStub = 1;
        onExtraCallbackWithResult();
        AssetActivationBannerButtonLocal$$serializer assetActivationBannerButtonLocal$$serializer = new AssetActivationBannerButtonLocal$$serializer();
        INSTANCE = assetActivationBannerButtonLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.AssetActivationBannerButtonLocal", assetActivationBannerButtonLocal$$serializer, 3);
        Object[] objArr = new Object[1];
        a((short) (89 - Drawable.resolveOpacity(0, 0)), (byte) (75 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 558423393 - (ViewConfiguration.getLongPressTimeout() >> 16), 1678525452 + (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getEdgeSlop() >> 16) - 102, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("padding", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackDefault + 21;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    private AssetActivationBannerButtonLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{sp.IAuthTabCallback(TextContentLocal$.serializer.INSTANCE), sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback), sp.IAuthTabCallback(PaddingLocal$$serializer.INSTANCE)};
        }
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(TextContentLocal$.serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(PaddingLocal$$serializer.INSTANCE);
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        kSerializerArr[0] = kSerializerIAuthTabCallback;
        kSerializerArr[0] = kSerializerIAuthTabCallback2;
        kSerializerArr[5] = kSerializerIAuthTabCallback3;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AssetActivationBannerButtonLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        PaddingLocal paddingLocal;
        TextContentLocal textContentLocal;
        HandlerLocal handlerLocal;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            TextContentLocal textContentLocal2 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, TextContentLocal$.serializer.INSTANCE, (Object) null);
            HandlerLocal handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, (Object) null);
            paddingLocal = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, PaddingLocal$$serializer.INSTANCE, (Object) null);
            textContentLocal = textContentLocal2;
            handlerLocal = handlerLocal2;
            i = 7;
        } else {
            int i3 = 0;
            boolean z = true;
            PaddingLocal paddingLocal2 = null;
            TextContentLocal textContentLocal3 = null;
            HandlerLocal handlerLocal3 = null;
            while (z) {
                int i4 = asInterface + 57;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i5 = asInterface + 67;
                    int i6 = i5 % 128;
                    asBinder = i6;
                    if (i5 % 2 != 0) {
                        if (iOnNavigationEvent == 1) {
                            handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                        }
                        if (iOnNavigationEvent == 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i7 = i6 + 23;
                        asInterface = i7 % 128;
                        int i8 = i7 % 2;
                        paddingLocal2 = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, PaddingLocal$$serializer.INSTANCE, paddingLocal2);
                        i3 = i8 == 0 ? i3 | 2 : i3 | 4;
                    } else {
                        if (iOnNavigationEvent == 1) {
                            handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                        }
                        if (iOnNavigationEvent == 2) {
                        }
                    }
                } else {
                    textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, TextContentLocal$.serializer.INSTANCE, textContentLocal3);
                    i3 |= 1;
                }
            }
            paddingLocal = paddingLocal2;
            textContentLocal = textContentLocal3;
            handlerLocal = handlerLocal3;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AssetActivationBannerButtonLocal(i, textContentLocal, handlerLocal, paddingLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m470deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        AssetActivationBannerButtonLocal assetActivationBannerButtonLocalDeserialize = deserialize(decoder);
        int i4 = asBinder + 15;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return assetActivationBannerButtonLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AssetActivationBannerButtonLocal assetActivationBannerButtonLocal) {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(assetActivationBannerButtonLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AssetActivationBannerButtonLocal.IAuthTabCallback(assetActivationBannerButtonLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asInterface + 115;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AssetActivationBannerButtonLocal) obj);
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        int i5 = asBinder + 43;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asBinder + 99;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int i5 = 2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.MeasureSpec.makeMeasureSpec(0, 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 42, View.resolveSizeAndState(0, 0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 != 0) {
                byte[] bArr = onWarmupCompleted;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 19;
                        $10 = i9 % 128;
                        int i10 = i9 % i5;
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.indexOf("", "", 0, 0) + 55, TextUtils.indexOf("", "", 0, 0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i8++;
                        i5 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onWarmupCompleted;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 41 - ImageFormat.getBitsPerPixel(0), 22439 - (ViewConfiguration.getTapTimeout() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onExtraCallback[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i11 = $10 + 31;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))) + i7;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 86 - Gravity.getAbsoluteGravity(0, 0), 9567 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onWarmupCompleted;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        bArr5[i13] = (byte) (bArr4[i13] ^ (-4629411779493505016L));
                    }
                    int i14 = $10 + 5;
                    $11 = i14 % 128;
                    i4 = 2;
                    int i15 = i14 % 2;
                    bArr4 = bArr5;
                } else {
                    i4 = 2;
                }
                if (bArr4 != null) {
                    int i16 = $10 + 17;
                    $11 = i16 % 128;
                    int i17 = i16 % i4;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i18 = $10 + 117;
                    $11 = i18 % 128;
                    if (i18 % 2 == 0) {
                        int i19 = 1 / 0;
                        if (z) {
                            byte[] bArr6 = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                    } else if (z) {
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

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = 2062613143;
        onExtraCallbackWithResult = -1538795411;
        onNavigationEvent = 1068786784;
        onWarmupCompleted = new byte[]{-105, 86, -9, 105};
    }
}
