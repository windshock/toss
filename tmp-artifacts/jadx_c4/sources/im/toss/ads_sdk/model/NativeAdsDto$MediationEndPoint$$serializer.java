package im.toss.ads_sdk.model;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.ads_sdk.model.NativeAdsDto;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class NativeAdsDto$MediationEndPoint$$serializer implements aeu2<NativeAdsDto.MediationEndPoint> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final NativeAdsDto$MediationEndPoint$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 113;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 69;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 35;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 45811), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 83, ExpandableListView.getPackedPositionChild(0L) + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 14185), MotionEvent.axisFromString("") + 20, ((Process.getThreadPriority(0) + 20) >> 6) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static {
        onExtraCallbackWithResult();
        NativeAdsDto$MediationEndPoint$$serializer nativeAdsDto$MediationEndPoint$$serializer = new NativeAdsDto$MediationEndPoint$$serializer();
        INSTANCE = nativeAdsDto$MediationEndPoint$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.model.NativeAdsDto.MediationEndPoint", nativeAdsDto$MediationEndPoint$$serializer, 3);
        Object[] objArr = new Object[1];
        a(new char[]{9896, 9946, 51674, 15355, 42606, 14958, 58410, 30056, 39296, 35087}, 1 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("exposure", true);
        setanimationsloop.onWarmupCompleted("error", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 99;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 29 / 0;
        }
    }

    private NativeAdsDto$MediationEndPoint$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        }
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getwrigglelayout2);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getwrigglelayout2);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(getwrigglelayout2);
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        kSerializerArr[0] = kSerializerIAuthTabCallback;
        kSerializerArr[1] = kSerializerIAuthTabCallback2;
        kSerializerArr[3] = kSerializerIAuthTabCallback3;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final NativeAdsDto.MediationEndPoint deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        String str2;
        String str3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String str4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = IAuthTabCallback + 111;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            i = 7;
            str3 = str5;
            str = str6;
        } else {
            int i5 = 0;
            boolean z = true;
            String str7 = null;
            String str8 = null;
            while (z) {
                int i6 = onExtraCallback + 99;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i8 = IAuthTabCallback + 11;
                    int i9 = i8 % 128;
                    onExtraCallback = i9;
                    int i10 = i8 % 2;
                    if (iOnNavigationEvent != 1) {
                        int i11 = i9 + 53;
                        IAuthTabCallback = i11 % 128;
                        if (i11 % 2 != 0) {
                            if (iOnNavigationEvent != 5) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str7);
                            i5 |= 4;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str7);
                            i5 |= 4;
                        }
                    } else {
                        str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str4);
                        i5 |= 2;
                        int i12 = IAuthTabCallback + 65;
                        onExtraCallback = i12 % 128;
                        int i13 = i12 % 2;
                    }
                } else {
                    str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str8);
                    i5 |= 1;
                }
            }
            i = i5;
            str = str4;
            str2 = str7;
            str3 = str8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new NativeAdsDto.MediationEndPoint(i, str3, str, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m36deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.MediationEndPoint mediationEndPointDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return mediationEndPointDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull NativeAdsDto.MediationEndPoint mediationEndPoint) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(mediationEndPoint, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            NativeAdsDto.MediationEndPoint.onExtraCallback(mediationEndPoint, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 82 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(mediationEndPoint, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            NativeAdsDto.MediationEndPoint.onExtraCallback(mediationEndPoint, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = IAuthTabCallback + 61;
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
        int i2 = IAuthTabCallback + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (NativeAdsDto.MediationEndPoint) obj);
        int i4 = onExtraCallback + 119;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = 4500421228611966173L;
    }
}
