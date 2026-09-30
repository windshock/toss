package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.ButtonLocal;
import im.toss.features.home.core.local.model.dst.widget.ButtonLocal$;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal$Icon$$serializer;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal;
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
public final /* synthetic */ class CrossActivationBannerALocal$$serializer implements aeu2<CrossActivationBannerALocal> {
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    public static final CrossActivationBannerALocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static short[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static byte[] onWarmupCompleted;
    private static final byte[] $$a = {4, -80, 45, 109};
    private static final int $$b = 190;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i) {
        int i2;
        byte[] bArr = $$a;
        int i3 = b * 3;
        int i4 = (i * 2) + 115;
        int i5 = 4 - (s * 4);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i5++;
            i4 = (-i4) + i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            int i8 = i2 + 1;
            i6 = i4;
            i4 = bArr[i5];
            i7 = i8;
            i5++;
            i4 = (-i4) + i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return serialDescriptor;
    }

    static {
        IAuthTabCallbackStub = 0;
        onNavigationEvent();
        CrossActivationBannerALocal$$serializer crossActivationBannerALocal$$serializer = new CrossActivationBannerALocal$$serializer();
        INSTANCE = crossActivationBannerALocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.CrossActivationBannerALocal", crossActivationBannerALocal$$serializer, 4);
        setanimationsloop.onWarmupCompleted("icon", false);
        Object[] objArr = new Object[1];
        a((short) (Process.myPid() >> 22), (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 2052145330 - View.combineMeasuredStates(0, 0), (-713439224) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-99) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a((short) TextUtils.indexOf("", "", 0, 0), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), 2052145332 - MotionEvent.axisFromString(""), TextUtils.lastIndexOf("", '0', 0) - 713439240, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 98, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("handler", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackDefault + 97;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    private CrossActivationBannerALocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(ImageSourceLocal$Icon$$serializer.INSTANCE), TextContentLocal$.serializer.INSTANCE, sp.IAuthTabCallback(ButtonLocal$.serializer.INSTANCE), sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback)};
        int i4 = asInterface + 117;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CrossActivationBannerALocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        ButtonLocal buttonLocal;
        TextContentLocal textContentLocal;
        ImageSourceLocal.Icon icon;
        HandlerLocal handlerLocal;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        ButtonLocal buttonLocal2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = asInterface + 51;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            ImageSourceLocal.Icon icon2 = (ImageSourceLocal.Icon) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, ImageSourceLocal$Icon$$serializer.INSTANCE, (Object) null);
            TextContentLocal textContentLocal2 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TextContentLocal$.serializer.INSTANCE, (Object) null);
            buttonLocal = (ButtonLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ButtonLocal$.serializer.INSTANCE, (Object) null);
            icon = icon2;
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, (Object) null);
            textContentLocal = textContentLocal2;
            i = 15;
        } else {
            int i5 = 0;
            boolean z = true;
            TextContentLocal textContentLocal3 = null;
            ImageSourceLocal.Icon icon3 = null;
            HandlerLocal handlerLocal2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = asInterface;
                    int i7 = i6 + 41;
                    asBinder = i7 % 128;
                    int i8 = i7 % 2;
                    if (iOnNavigationEvent == 0) {
                        icon3 = (ImageSourceLocal.Icon) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, ImageSourceLocal$Icon$$serializer.INSTANCE, icon3);
                        i5 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TextContentLocal$.serializer.INSTANCE, textContentLocal3);
                        i5 |= 2;
                    } else if (iOnNavigationEvent != 2) {
                        int i9 = i6 + 119;
                        asBinder = i9 % 128;
                        int i10 = i9 % 2;
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                        i5 |= 8;
                    } else {
                        buttonLocal2 = (ButtonLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ButtonLocal$.serializer.INSTANCE, buttonLocal2);
                        i5 |= 4;
                    }
                } else {
                    z = false;
                }
            }
            i = i5;
            buttonLocal = buttonLocal2;
            textContentLocal = textContentLocal3;
            icon = icon3;
            handlerLocal = handlerLocal2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CrossActivationBannerALocal(i, icon, textContentLocal, buttonLocal, handlerLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m330deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        CrossActivationBannerALocal crossActivationBannerALocalDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        int i5 = asBinder + 91;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
        return crossActivationBannerALocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CrossActivationBannerALocal crossActivationBannerALocal) {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(crossActivationBannerALocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CrossActivationBannerALocal.onWarmupCompleted(crossActivationBannerALocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(crossActivationBannerALocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CrossActivationBannerALocal.onWarmupCompleted(crossActivationBannerALocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = asInterface + 55;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CrossActivationBannerALocal) obj);
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asInterface + 13;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43425), (ViewConfiguration.getWindowTouchSlop() >> 8) + 42, ((Process.getThreadPriority(0) + 20) >> 6) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr = onWarmupCompleted;
                float f = 0.0f;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = 0;
                    while (i6 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 12843), 55 - ((Process.getThreadPriority(0) + 20) >> 6), 2167 - (ViewConfiguration.getTouchSlop() >> 8), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i6++;
                            f = 0.0f;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i7 = $10 + 19;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    byte[] bArr3 = onWarmupCompleted;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43424), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42, 22438 - TextUtils.lastIndexOf("", '0', 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i9 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j));
                if (z) {
                    int i10 = $11 + 119;
                    $10 = i10 % 128;
                    int i11 = i10 % 2 != 0 ? 0 : 1;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i9 + i11;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), 86 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollBarSize() >> 8) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onWarmupCompleted;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i12 = 0;
                        while (i12 < length2) {
                            int i13 = $11 + 99;
                            $10 = i13 % 128;
                            if (i13 % 2 != 0) {
                                bArr5[i12] = (byte) (bArr4[i12] % (-4629411779493505016L));
                            } else {
                                bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                                i12++;
                            }
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i14 = $10 + 3;
                        int i15 = i14 % 128;
                        $11 = i15;
                        if (i14 % 2 == 0) {
                            int i16 = 37 / 0;
                            if (!(!z2)) {
                                int i17 = i15 + 119;
                                $10 = i17 % 128;
                                if (i17 % 2 != 0) {
                                    byte[] bArr6 = onWarmupCompleted;
                                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent << 1;
                                    i4 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback / (((byte) (((byte) (bArr6[r9] % (-4629411779493505016L))) * s)) ^ b);
                                } else {
                                    byte[] bArr7 = onWarmupCompleted;
                                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                    i4 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r9] ^ (-4629411779493505016L))) + s)) ^ b);
                                }
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i4;
                            } else {
                                short[] sArr = onExtraCallbackWithResult;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r9] ^ (-4629411779493505016L))) + s)) ^ b));
                            }
                        } else if (z2) {
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static void onNavigationEvent() {
        IAuthTabCallback = 568944454;
        onNavigationEvent = -1538795424;
        onExtraCallback = -1899896733;
        onWarmupCompleted = new byte[]{-12, 27, -7, -9, -13, 8, -9, 27, 8, 8};
    }
}
