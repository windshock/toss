package im.toss.ads_sdk.remote.model;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.util.TypedValue;
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
import o.TimelineExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class SdkTemplateCta$$serializer implements aeu2<SdkTemplateCta> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final SdkTemplateCta$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 39;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 45812), AndroidCharacter.getMirror('0') + '$', 21233 - Color.alpha(0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getTapTimeout() >> 16)), View.resolveSizeAndState(0, 0, 0) + 19, 8808 - View.resolveSize(0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        int i6 = $11 + 11;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static {
        IAuthTabCallback();
        SdkTemplateCta$$serializer sdkTemplateCta$$serializer = new SdkTemplateCta$$serializer();
        INSTANCE = sdkTemplateCta$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.SdkTemplateCta", sdkTemplateCta$$serializer, 2);
        Object[] objArr = new Object[1];
        a(new char[]{29178, 29981, 29070, 3707, 25066, 18601, 38804, 14804}, 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("landingUrl", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 63;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private SdkTemplateCta$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArr = new KSerializer[3];
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            kSerializerArr[0] = getwrigglelayout;
            kSerializerArr[0] = getwrigglelayout;
        } else {
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{getwrigglelayout2, getwrigglelayout2};
        }
        int i3 = IAuthTabCallback + 73;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054 A[PHI: r1 r13
      0x0054: PHI (r1v10 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v11 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0054: PHI (r13v5 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[PHI: r1 r13
      0x0035: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v11 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r13v2 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SdkTemplateCta deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        String strAsInterface;
        String strAsInterface2;
        int i;
        int iOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 41;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i4 = 82 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                int i5 = IAuthTabCallback + 27;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i = 2;
                } else {
                    strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                    i = 3;
                }
            } else {
                strAsInterface = null;
                String strAsInterface3 = null;
                int i6 = 0;
                boolean z = true;
                while (z) {
                    int i7 = IAuthTabCallback + 55;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 != 0) {
                        iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        int i8 = 20 / 0;
                        if (iOnNavigationEvent == -1) {
                            z = false;
                        } else if (iOnNavigationEvent == 0) {
                            int i9 = onWarmupCompleted + 85;
                            IAuthTabCallback = i9 % 128;
                            if (i9 % 2 == 0) {
                                if (iOnNavigationEvent != 1) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                                i6 |= 2;
                            } else {
                                if (iOnNavigationEvent != 1) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                                i6 |= 2;
                            }
                        } else {
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i6 |= 1;
                        }
                    } else {
                        iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        if (iOnNavigationEvent == -1) {
                            z = false;
                        } else if (iOnNavigationEvent == 0) {
                        }
                    }
                }
                strAsInterface2 = strAsInterface3;
                i = i6;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        SdkTemplateCta sdkTemplateCta = new SdkTemplateCta(i, strAsInterface, strAsInterface2, (okycx) null);
        int i10 = IAuthTabCallback + 45;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 == 0) {
            return sdkTemplateCta;
        }
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m56deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SdkTemplateCta sdkTemplateCtaDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return sdkTemplateCtaDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SdkTemplateCta sdkTemplateCta) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(sdkTemplateCta, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            SdkTemplateCta.onNavigationEvent(sdkTemplateCta, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(sdkTemplateCta, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        SdkTemplateCta.onNavigationEvent(sdkTemplateCta, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallback + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SdkTemplateCta) obj);
        int i4 = IAuthTabCallback + 85;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onWarmupCompleted + 17;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = -1509421339033468913L;
    }
}
