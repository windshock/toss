package im.toss.features.credit.data.response;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
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
import o.TrackGroupExternalSyntheticLambda0;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DisclaimerV2$$serializer implements aeu2<DisclaimerV2> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final DisclaimerV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 53;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return serialDescriptor;
    }

    static {
        onWarmupCompleted();
        DisclaimerV2$$serializer disclaimerV2$$serializer = new DisclaimerV2$$serializer();
        INSTANCE = disclaimerV2$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.DisclaimerV2", disclaimerV2$$serializer, 3);
        Object[] objArr = new Object[1];
        a(new int[]{0, 5, 0, 0}, true, new byte[]{1, 1, 0, 1, 1}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("items", true);
        setanimationsloop.onWarmupCompleted("hasNoContents", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 79;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 28 / 0;
        }
    }

    private DisclaimerV2$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback((KSerializer) DisclaimerV2.IAuthTabCallback()[1].getValue()), getBgColor.IAuthTabCallback};
        }
        Lazy[] lazyArrIAuthTabCallback = DisclaimerV2.IAuthTabCallback();
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[1].getValue());
        KSerializer<?>[] kSerializerArr = new KSerializer[4];
        kSerializerArr[1] = kSerializerIAuthTabCallback;
        kSerializerArr[1] = kSerializerIAuthTabCallback2;
        kSerializerArr[5] = getBgColor.IAuthTabCallback;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final DisclaimerV2 deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        List list;
        int i;
        String str;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 63;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            DisclaimerV2.IAuthTabCallback();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = DisclaimerV2.IAuthTabCallback();
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            String str2 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            List list2 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), (Object) null);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2);
            list = list2;
            i = 7;
            str = str2;
        } else {
            List list3 = null;
            String str3 = null;
            boolean zOnExtraCallbackWithResult2 = false;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int i5 = onExtraCallback + 99;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    str3 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                    i4 |= 1;
                    int i6 = onExtraCallback + 17;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                } else if (iOnNavigationEvent == 1) {
                    list3 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), list3);
                    i4 |= 2;
                } else {
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2);
                    i4 |= 4;
                }
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            list = list3;
            i = i4;
            str = str3;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new DisclaimerV2(i, str, list, zOnExtraCallbackWithResult, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m177deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DisclaimerV2 disclaimerV2Deserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return disclaimerV2Deserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DisclaimerV2 disclaimerV2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(disclaimerV2, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DisclaimerV2.onWarmupCompleted(disclaimerV2, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DisclaimerV2) obj);
        int i4 = onWarmupCompleted + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        char c = '0';
        if (cArr != null) {
            int i6 = $11 + 91;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 35283), 35 - View.resolveSizeAndState(0, 0, 0), 14238 - TextUtils.indexOf("", c, 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i8++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10936 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 66 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 16718 - (ViewConfiguration.getWindowTouchSlop() >> 8), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 29 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 17658 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getLongPressTimeout() >> 16)), View.getDefaultSize(0, 0) + 70, 12486 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            int i11 = $11 + 15;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i13 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i13, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i13);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i14 = $10 + 55;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        String str = new String(cArr3);
        int i16 = $11 + 119;
        $10 = i16 % 128;
        int i17 = i16 % 2;
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new char[]{27260, 27174, 27198, 27168, 27168};
    }
}
