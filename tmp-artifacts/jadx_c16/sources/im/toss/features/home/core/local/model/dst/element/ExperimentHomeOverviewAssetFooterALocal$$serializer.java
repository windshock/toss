package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAssetFooterALocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.property.VerticalPaddingLocal;
import im.toss.features.home.core.local.model.dst.property.VerticalPaddingLocal$$serializer;
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
public final /* synthetic */ class ExperimentHomeOverviewAssetFooterALocal$$serializer implements aeu2<ExperimentHomeOverviewAssetFooterALocal> {
    private static int IAuthTabCallback;
    public static final ExperimentHomeOverviewAssetFooterALocal$$serializer INSTANCE;
    private static int asBinder;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static byte[] onNavigationEvent;
    private static short[] onWarmupCompleted;
    private static final byte[] $$a = {79, 7, -80, -125};
    private static final int $$b = 137;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallbackDefault = 0;

    private static String $$c(byte b, byte b2, byte b3) {
        int i = b + 4;
        int i2 = b3 * 2;
        int i3 = 115 - (b2 * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i3 += i4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            i++;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i];
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 9;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 41;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        asBinder = 1;
        IAuthTabCallback();
        ExperimentHomeOverviewAssetFooterALocal$$serializer experimentHomeOverviewAssetFooterALocal$$serializer = new ExperimentHomeOverviewAssetFooterALocal$$serializer();
        INSTANCE = experimentHomeOverviewAssetFooterALocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAssetFooterALocal", experimentHomeOverviewAssetFooterALocal$$serializer, 3);
        Object[] objArr = new Object[1];
        a((short) (55 - TextUtils.lastIndexOf("", '0')), (byte) (ViewConfiguration.getEdgeSlop() >> 16), 1765186707 + (ViewConfiguration.getFadingEdgeLength() >> 16), 1718943186 + (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 81, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("verticalPadding", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackDefault + 29;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private ExperimentHomeOverviewAssetFooterALocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = asInterface + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback);
            kSerializerArr = new KSerializer[5];
            kSerializerArr[1] = ExperimentHomeOverviewAssetFooterALocal$TextContent$$serializer.INSTANCE;
            kSerializerArr[0] = kSerializerIAuthTabCallback;
            kSerializerArr[2] = VerticalPaddingLocal$$serializer.INSTANCE;
        } else {
            kSerializerArr = new KSerializer[]{ExperimentHomeOverviewAssetFooterALocal$TextContent$$serializer.INSTANCE, sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback), VerticalPaddingLocal$$serializer.INSTANCE};
        }
        int i3 = IAuthTabCallbackStub + 119;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExperimentHomeOverviewAssetFooterALocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        HandlerLocal handlerLocal;
        ExperimentHomeOverviewAssetFooterALocal.TextContent textContent;
        VerticalPaddingLocal verticalPaddingLocal;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 57;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        HandlerLocal handlerLocal2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = IAuthTabCallbackStub + 115;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            ExperimentHomeOverviewAssetFooterALocal.TextContent textContent2 = (ExperimentHomeOverviewAssetFooterALocal.TextContent) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ExperimentHomeOverviewAssetFooterALocal$TextContent$$serializer.INSTANCE, (Object) null);
            HandlerLocal handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, (Object) null);
            verticalPaddingLocal = (VerticalPaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, VerticalPaddingLocal$$serializer.INSTANCE, (Object) null);
            textContent = textContent2;
            handlerLocal = handlerLocal3;
            i = 7;
        } else {
            int i7 = 0;
            boolean z = true;
            ExperimentHomeOverviewAssetFooterALocal.TextContent textContent3 = null;
            VerticalPaddingLocal verticalPaddingLocal2 = null;
            while (z) {
                int i8 = asInterface + 117;
                IAuthTabCallbackStub = i8 % 128;
                int i9 = i8 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i10 = IAuthTabCallbackStub + 87;
                    asInterface = i10 % 128;
                    if (i10 % 2 == 0) {
                        if (iOnNavigationEvent == 0) {
                            handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                            i7 |= 2;
                        } else {
                            if (iOnNavigationEvent == 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            verticalPaddingLocal2 = (VerticalPaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, VerticalPaddingLocal$$serializer.INSTANCE, verticalPaddingLocal2);
                            i7 |= 4;
                        }
                    } else if (iOnNavigationEvent == 1) {
                        handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                        i7 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                    }
                } else {
                    textContent3 = (ExperimentHomeOverviewAssetFooterALocal.TextContent) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ExperimentHomeOverviewAssetFooterALocal$TextContent$$serializer.INSTANCE, textContent3);
                    i7 |= 1;
                }
            }
            i = i7;
            handlerLocal = handlerLocal2;
            textContent = textContent3;
            verticalPaddingLocal = verticalPaddingLocal2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentHomeOverviewAssetFooterALocal(i, textContent, handlerLocal, verticalPaddingLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m354deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        ExperimentHomeOverviewAssetFooterALocal experimentHomeOverviewAssetFooterALocalDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallbackStub + 63;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return experimentHomeOverviewAssetFooterALocalDeserialize;
        }
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentHomeOverviewAssetFooterALocal experimentHomeOverviewAssetFooterALocal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(experimentHomeOverviewAssetFooterALocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ExperimentHomeOverviewAssetFooterALocal.onExtraCallback(experimentHomeOverviewAssetFooterALocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asInterface + 37;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentHomeOverviewAssetFooterALocal) obj);
        int i4 = asInterface + 49;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackStub + 75;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        boolean z;
        int length;
        byte[] bArr;
        int i5 = 2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getTapTimeout() >> 16)), 43 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 22439 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i7 = -1;
            int i8 = iIntValue == -1 ? 1 : 0;
            if (i8 == 0) {
                j = -4629411779493505016L;
            } else {
                byte[] bArr2 = onNavigationEvent;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i9 = 0;
                    while (i9 < length2) {
                        int i10 = $11 + 57;
                        $10 = i10 % 128;
                        if (i10 % i5 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) i7;
                                byte b3 = (byte) (b2 + 1);
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.indexOf("", "", 0, 0)), AndroidCharacter.getMirror('0') + 7, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2166, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr3[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr2[i9])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b4 = (byte) (-1);
                                byte b5 = (byte) (b4 + 1);
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.indexOf("", "", 0, 0) + 55, 2167 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr3[i9] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                            i9++;
                        }
                        i5 = 2;
                        i7 = -1;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 43424), (Process.myTid() >> 22) + 42, Color.argb(0, 0, 0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j)) + i8;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), TextUtils.getCapsMode("", 0, 0) + 86, 9567 - TextUtils.indexOf("", "", 0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onNavigationEvent;
                if (bArr5 != null) {
                    int i11 = $10;
                    int i12 = i11 + 31;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    int i13 = i11 + 81;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 2 / 4;
                    }
                    int i15 = 0;
                    while (i15 < length) {
                        bArr[i15] = (byte) (bArr5[i15] ^ (-4629411779493505016L));
                        i15++;
                        int i16 = $10 + 31;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                    }
                    i4 = 2;
                    bArr5 = bArr;
                } else {
                    i4 = 2;
                }
                if (bArr5 != null) {
                    int i18 = $11 + 31;
                    $10 = i18 % 128;
                    int i19 = i18 % i4;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (!z) {
                        short[] sArr = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        byte[] bArr6 = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            String string = sb.toString();
            int i20 = $11 + 47;
            $10 = i20 % 128;
            if (i20 % 2 == 0) {
                objArr[0] = string;
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = 848214885;
        onExtraCallbackWithResult = -1538795449;
        onExtraCallback = 1036835497;
        onNavigationEvent = new byte[]{-66, -55, -56, -37, -75};
    }
}
