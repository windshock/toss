package im.toss.features.alltab.feature.total_service.data.model;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import o.aeu2;
import o.encryptType4;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MiniHomeRequest$$serializer implements aeu2<MiniHomeRequest> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final MiniHomeRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return serialDescriptor;
    }

    static {
        MiniHomeRequest$$serializer miniHomeRequest$$serializer = new MiniHomeRequest$$serializer();
        INSTANCE = miniHomeRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.alltab.feature.total_service.data.model.MiniHomeRequest", miniHomeRequest$$serializer, 2);
        setanimationsloop.onWarmupCompleted("category", false);
        setanimationsloop.onWarmupCompleted("schemeParams", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 9;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private MiniHomeRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(encryptType4.IAuthTabCallback)};
        int i4 = onExtraCallback + 111;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final MiniHomeRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        JsonObject jsonObject;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            jsonObject = (JsonObject) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, encryptType4.IAuthTabCallback, (Object) null);
            i = 3;
        } else {
            String strAsInterface2 = null;
            JsonObject jsonObject2 = null;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i4 = onNavigationEvent + 37;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 2 % 5;
                    }
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i3 |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i6 = onExtraCallback + 21;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    jsonObject2 = (JsonObject) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, encryptType4.IAuthTabCallback, jsonObject2);
                    i3 |= 2;
                }
            }
            strAsInterface = strAsInterface2;
            jsonObject = jsonObject2;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new MiniHomeRequest(i, strAsInterface, jsonObject, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m69deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MiniHomeRequest miniHomeRequestDeserialize = deserialize(decoder);
        int i3 = onNavigationEvent + 113;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return miniHomeRequestDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull MiniHomeRequest miniHomeRequest) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(miniHomeRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        MiniHomeRequest.onNavigationEvent(miniHomeRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 103;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (MiniHomeRequest) obj);
        int i4 = onExtraCallback + 93;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
