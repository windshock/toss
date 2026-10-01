package im.toss.ads_sdk.model;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
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
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class NativeAdsDto$Creative$TossstreamLongFormVideo$$serializer implements aeu2<NativeAdsDto.Creative.TossstreamLongFormVideo> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final NativeAdsDto$Creative$TossstreamLongFormVideo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static long onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 75;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 119;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (true) {
            obj = null;
            if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                break;
            }
            int i3 = $10 + 119;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - TextUtils.getCapsMode("", 0, 0)), (-16777132) - Color.rgb(0, 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 14185), 20 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') + 8760, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 107;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    static {
        IAuthTabCallback();
        NativeAdsDto$Creative$TossstreamLongFormVideo$$serializer nativeAdsDto$Creative$TossstreamLongFormVideo$$serializer = new NativeAdsDto$Creative$TossstreamLongFormVideo$$serializer();
        INSTANCE = nativeAdsDto$Creative$TossstreamLongFormVideo$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("styleId", nativeAdsDto$Creative$TossstreamLongFormVideo$$serializer, 9);
        setanimationsloop.onWarmupCompleted("id", true);
        Object[] objArr = new Object[1];
        a(new char[]{42159, 42203, 1116, 14703, 50408, 43415, 25183, 52322, 4674}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("subTitle", true);
        setanimationsloop.onWarmupCompleted("thumbnailImageUrl", true);
        setanimationsloop.onWarmupCompleted("videoUrl", true);
        setanimationsloop.onWarmupCompleted("autoPlayDelaySec", true);
        setanimationsloop.onWarmupCompleted("landingUrl", true);
        setanimationsloop.onWarmupCompleted("adClearanceText", true);
        setanimationsloop.onWarmupCompleted("ratio", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private NativeAdsDto$Creative$TossstreamLongFormVideo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, setVideoListener.onWarmupCompleted, kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer)};
        int i4 = onWarmupCompleted + 23;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final NativeAdsDto.Creative.TossstreamLongFormVideo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String strAsInterface2;
        String str5;
        double d;
        int iOnNavigationEvent;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i6 = 7;
        int i7 = 6;
        String strAsInterface3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i8 = onExtraCallback + 67;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            double dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 5);
            String strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getwrigglelayout, (Object) null);
            i = 511;
            str = strAsInterface5;
            str3 = str6;
            str4 = strAsInterface8;
            strAsInterface3 = strAsInterface6;
            str5 = str7;
            d = dIAuthTabCallback;
            strAsInterface = strAsInterface7;
            str2 = strAsInterface4;
        } else {
            boolean z = true;
            int i10 = 0;
            String str8 = null;
            String str9 = null;
            String strAsInterface9 = null;
            String strAsInterface10 = null;
            String strAsInterface11 = null;
            double dIAuthTabCallback2 = 0.0d;
            strAsInterface = null;
            String strAsInterface12 = null;
            while (z) {
                int i11 = onWarmupCompleted + 117;
                onExtraCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i12 = 86 / 0;
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = false;
                            i6 = 7;
                            i7 = 6;
                            break;
                        case 0:
                            strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i10 |= 1;
                            i6 = 7;
                            i7 = 6;
                            break;
                        case 1:
                            i3 = 1;
                            strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i3);
                            i10 |= 2;
                            int i13 = onWarmupCompleted + 95;
                            onExtraCallback = i13 % 128;
                            int i14 = i13 % 2;
                            i6 = 7;
                            i7 = 6;
                            break;
                        case 2:
                            strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i10 |= 4;
                            break;
                        case 3:
                            i2 = 3;
                            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i2);
                            i10 |= 8;
                            break;
                        case 4:
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                            i10 |= 16;
                            break;
                        case 5:
                            dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 5);
                            i10 |= 32;
                            break;
                        case 6:
                            strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i7);
                            i10 |= 64;
                            break;
                        case 7:
                            str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, getWriggleLayout.onNavigationEvent, str8);
                            i10 |= 128;
                            i4 = onWarmupCompleted + 105;
                            onExtraCallback = i4 % 128;
                            if (i4 % 2 != 0) {
                                int i15 = 5 / 4;
                            }
                            break;
                        case 8:
                            str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, str9);
                            i10 |= 256;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = false;
                            i6 = 7;
                            i7 = 6;
                            break;
                        case 0:
                            strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i10 |= 1;
                            i6 = 7;
                            i7 = 6;
                            break;
                        case 1:
                            i3 = 1;
                            strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i3);
                            i10 |= 2;
                            int i132 = onWarmupCompleted + 95;
                            onExtraCallback = i132 % 128;
                            int i142 = i132 % 2;
                            i6 = 7;
                            i7 = 6;
                            break;
                        case 2:
                            strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i10 |= 4;
                            break;
                        case 3:
                            i2 = 3;
                            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i2);
                            i10 |= 8;
                            break;
                        case 4:
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                            i10 |= 16;
                            break;
                        case 5:
                            dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 5);
                            i10 |= 32;
                            break;
                        case 6:
                            strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i7);
                            i10 |= 64;
                            break;
                        case 7:
                            str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, getWriggleLayout.onNavigationEvent, str8);
                            i10 |= 128;
                            i4 = onWarmupCompleted + 105;
                            onExtraCallback = i4 % 128;
                            if (i4 % 2 != 0) {
                            }
                            break;
                        case 8:
                            str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, str9);
                            i10 |= 256;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
            }
            i = i10;
            str = strAsInterface9;
            str2 = strAsInterface10;
            str3 = str8;
            str4 = strAsInterface12;
            strAsInterface2 = strAsInterface11;
            str5 = str9;
            d = dIAuthTabCallback2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new NativeAdsDto.Creative.TossstreamLongFormVideo(i, str2, strAsInterface2, str, strAsInterface3, strAsInterface, d, str4, str3, str5, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m31deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull NativeAdsDto.Creative.TossstreamLongFormVideo tossstreamLongFormVideo) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tossstreamLongFormVideo, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        NativeAdsDto.Creative.TossstreamLongFormVideo.onNavigationEvent(tossstreamLongFormVideo, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 43;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (NativeAdsDto.Creative.TossstreamLongFormVideo) obj);
        int i4 = onExtraCallback + 79;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void IAuthTabCallback() {
        onNavigationEvent = -6563280141352249682L;
    }
}
