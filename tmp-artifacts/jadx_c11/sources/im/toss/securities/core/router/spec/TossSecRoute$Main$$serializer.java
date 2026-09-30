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
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class TossSecRoute$Main$$serializer implements aeu2<TossSecRoute.Main> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final TossSecRoute$Main$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 33;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        TossSecRoute$Main$$serializer tossSecRoute$Main$$serializer = new TossSecRoute$Main$$serializer();
        INSTANCE = tossSecRoute$Main$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.core.router.spec.TossSecRoute.Main", tossSecRoute$Main$$serializer, 4);
        setanimationsloop.onWarmupCompleted("tab", true);
        setanimationsloop.onWarmupCompleted(TossSecRoute.Main.PARAM_RESTORE_TARGET_TAB, true);
        setanimationsloop.onWarmupCompleted(TossSecRoute.Main.PARAM_SCROLL_TO_SECTION, true);
        setanimationsloop.onWarmupCompleted(TossSecRoute.Main.PARAM_WATCHLIST_ID, true);
        descriptor = setanimationsloop;
        $stable = 8;
        int i = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private TossSecRoute$Main$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(oty1.onExtraCallback)};
        int i4 = onWarmupCompleted + 49;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final TossSecRoute.Main deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Long l;
        String str;
        int i;
        String str2;
        String str3;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 95;
        onWarmupCompleted = i3 % 128;
        String str4 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            str4.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, oty1.onExtraCallback, (Object) null);
            i = 15;
            str3 = str5;
            str2 = str6;
        } else {
            Long l2 = null;
            String str7 = null;
            String str8 = null;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i5 = onWarmupCompleted + 5;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str8);
                    i4 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str7);
                    i4 |= 2;
                } else if (iOnNavigationEvent != 2) {
                    int i7 = onWarmupCompleted + 3;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    if (iOnNavigationEvent != 3) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, oty1.onExtraCallback, l2);
                    i4 |= 8;
                } else {
                    str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str4);
                    i4 |= 4;
                }
            }
            l = l2;
            str = str4;
            i = i4;
            str2 = str7;
            str3 = str8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TossSecRoute.Main(i, str3, str2, str, l, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m24deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        TossSecRoute.Main mainDeserialize = deserialize(decoder);
        int i3 = onWarmupCompleted + 5;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return mainDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TossSecRoute.Main main) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(main, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TossSecRoute.Main.onExtraCallback(main, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TossSecRoute.Main) obj);
        int i4 = onWarmupCompleted + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 93 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onExtraCallback + 95;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
