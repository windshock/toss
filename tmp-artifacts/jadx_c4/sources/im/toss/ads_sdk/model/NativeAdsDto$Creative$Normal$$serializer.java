package im.toss.ads_sdk.model;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
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
public final /* synthetic */ class NativeAdsDto$Creative$Normal$$serializer implements aeu2<NativeAdsDto.Creative.Normal> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final NativeAdsDto$Creative$Normal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 75;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 125;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45813 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 85, 21233 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16791401), TextUtils.getTrimmedLength("") + 19, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        int i6 = $11 + 1;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static {
        onNavigationEvent();
        NativeAdsDto$Creative$Normal$$serializer nativeAdsDto$Creative$Normal$$serializer = new NativeAdsDto$Creative$Normal$$serializer();
        INSTANCE = nativeAdsDto$Creative$Normal$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("styleId", nativeAdsDto$Creative$Normal$$serializer, 6);
        setanimationsloop.onWarmupCompleted("id", true);
        Object[] objArr = new Object[1];
        a(new char[]{62472, 8733, 62561, 5667, 55615, 45560, 467, 40269, 9505, 10199, 57535, 28666}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(new char[]{44020, 2785, 43904, 16091, 3232, 25714, 44239, 12378, 31453}, 1 - View.getDefaultSize(0, 0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("subTitle", true);
        setanimationsloop.onWarmupCompleted("landingUrl", true);
        setanimationsloop.onWarmupCompleted("adClearanceText", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 121;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 53 / 0;
        }
    }

    private NativeAdsDto$Creative$Normal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, sp.IAuthTabCallback(kSerializer)};
        }
        KSerializer<?> kSerializer2 = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer2);
        KSerializer<?>[] kSerializerArr = new KSerializer[22];
        kSerializerArr[0] = kSerializer2;
        kSerializerArr[1] = kSerializer2;
        kSerializerArr[4] = kSerializer2;
        kSerializerArr[3] = kSerializer2;
        kSerializerArr[2] = kSerializer2;
        kSerializerArr[5] = kSerializerIAuthTabCallback;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final NativeAdsDto.Creative.Normal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 71;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 5;
        String strAsInterface = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            str3 = strAsInterface4;
            str4 = strAsInterface2;
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, (Object) null);
            str6 = strAsInterface5;
            str = strAsInterface6;
            str5 = strAsInterface3;
            i = 63;
        } else {
            boolean z = true;
            int i6 = 0;
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            String strAsInterface9 = null;
            String str7 = null;
            String strAsInterface10 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i6 |= 1;
                        int i7 = IAuthTabCallback + 27;
                        onExtraCallback = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = 3 % 4;
                        }
                        i5 = 5;
                    case 1:
                        strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i6 |= 2;
                        i5 = 5;
                    case 2:
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i6 |= 4;
                        i5 = 5;
                    case 3:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i6 |= 8;
                        i5 = 5;
                    case 4:
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i6 |= 16;
                        int i9 = IAuthTabCallback + 125;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        i5 = 5;
                    case 5:
                        str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getWriggleLayout.onNavigationEvent, str7);
                        i6 |= 32;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = strAsInterface7;
            str2 = str7;
            i = i6;
            str3 = strAsInterface8;
            str4 = strAsInterface9;
            str5 = strAsInterface10;
            str6 = strAsInterface;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new NativeAdsDto.Creative.Normal(i, str4, str5, str3, str6, str, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m25deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull NativeAdsDto.Creative.Normal normal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(normal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        NativeAdsDto.Creative.Normal.onNavigationEvent(normal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 51;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (NativeAdsDto.Creative.Normal) obj);
        int i4 = onExtraCallback + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = 466478572455022431L;
    }
}
