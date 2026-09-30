package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal;
import im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal$$serializer;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeListRowLocal$$serializer implements aeu2<HomeListRowLocal> {
    public static final HomeListRowLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        HomeListRowLocal$$serializer homeListRowLocal$$serializer = new HomeListRowLocal$$serializer();
        INSTANCE = homeListRowLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.HomeListRowLocal", homeListRowLocal$$serializer, 1);
        setanimationsloop.onWarmupCompleted("homeListRow", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private HomeListRowLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {HomeListRowAttributeLocal$$serializer.INSTANCE};
        int i4 = onNavigationEvent + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeListRowLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        HomeListRowAttributeLocal homeListRowAttributeLocal;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallback + 43;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            homeListRowAttributeLocal = (HomeListRowAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, HomeListRowAttributeLocal$$serializer.INSTANCE, (Object) null);
        } else {
            int i5 = onNavigationEvent + 99;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            boolean z = true;
            HomeListRowAttributeLocal homeListRowAttributeLocal2 = null;
            int i7 = 0;
            while (z) {
                int i8 = onNavigationEvent + 103;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i10 = onExtraCallback + 21;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    homeListRowAttributeLocal2 = (HomeListRowAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, HomeListRowAttributeLocal$$serializer.INSTANCE, homeListRowAttributeLocal2);
                    i7 = 1;
                } else {
                    z = false;
                }
            }
            homeListRowAttributeLocal = homeListRowAttributeLocal2;
            i2 = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeListRowLocal(i2, homeListRowAttributeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m390deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        HomeListRowLocal homeListRowLocalDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return homeListRowLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeListRowLocal homeListRowLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(homeListRowLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HomeListRowLocal.onNavigationEvent(homeListRowLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeListRowLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HomeListRowLocal.onNavigationEvent(homeListRowLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeListRowLocal) obj);
        int i4 = onNavigationEvent + 115;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
