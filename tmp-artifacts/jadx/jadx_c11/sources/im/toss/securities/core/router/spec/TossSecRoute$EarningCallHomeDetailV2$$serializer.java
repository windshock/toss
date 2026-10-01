package im.toss.securities.core.router.spec;

import im.toss.securities.core.router.spec.TossSecRoute;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class TossSecRoute$EarningCallHomeDetailV2$$serializer implements aeu2<TossSecRoute.EarningCallHomeDetailV2> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final TossSecRoute$EarningCallHomeDetailV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return serialDescriptor;
    }

    static {
        TossSecRoute$EarningCallHomeDetailV2$$serializer tossSecRoute$EarningCallHomeDetailV2$$serializer = new TossSecRoute$EarningCallHomeDetailV2$$serializer();
        INSTANCE = tossSecRoute$EarningCallHomeDetailV2$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.core.router.spec.TossSecRoute.EarningCallHomeDetailV2", tossSecRoute$EarningCallHomeDetailV2$$serializer, 2);
        setanimationsloop.onWarmupCompleted(TossSecRoute.EarningCallHomeDetailV2.PARAM_TAB, false);
        setanimationsloop.onWarmupCompleted(TossSecRoute.EarningCallHomeDetailV2.PARAM_SUB_TAB, true);
        descriptor = setanimationsloop;
        $stable = 8;
        int i = onNavigationEvent + 97;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private TossSecRoute$EarningCallHomeDetailV2$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, sp.IAuthTabCallback(kSerializer)};
        int i4 = onExtraCallbackWithResult + 121;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final TossSecRoute.EarningCallHomeDetailV2 deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        int i;
        String str;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            int i3 = onExtraCallbackWithResult + 79;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            i = 3;
        } else {
            strAsInterface = null;
            String str2 = null;
            i = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i5 = onExtraCallbackWithResult + 107;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                        i |= 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                        i |= 2;
                    }
                } else {
                    strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i |= 1;
                }
            }
            str = str2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TossSecRoute.EarningCallHomeDetailV2(i, strAsInterface, str, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m23deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TossSecRoute.EarningCallHomeDetailV2 earningCallHomeDetailV2Deserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        int i5 = onExtraCallback + 49;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return earningCallHomeDetailV2Deserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TossSecRoute.EarningCallHomeDetailV2 earningCallHomeDetailV2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(earningCallHomeDetailV2, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TossSecRoute.EarningCallHomeDetailV2.onExtraCallbackWithResult(earningCallHomeDetailV2, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TossSecRoute.EarningCallHomeDetailV2) obj);
        int i4 = onExtraCallback + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 113;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
