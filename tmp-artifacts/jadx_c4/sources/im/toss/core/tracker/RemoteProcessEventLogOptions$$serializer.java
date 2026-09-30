package im.toss.core.tracker;

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
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class RemoteProcessEventLogOptions$$serializer implements aeu2<RemoteProcessEventLogOptions> {
    private static int IAuthTabCallback = 1;
    public static final RemoteProcessEventLogOptions$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        RemoteProcessEventLogOptions$$serializer remoteProcessEventLogOptions$$serializer = new RemoteProcessEventLogOptions$$serializer();
        INSTANCE = remoteProcessEventLogOptions$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.core.tracker.RemoteProcessEventLogOptions", remoteProcessEventLogOptions$$serializer, 3);
        setanimationsloop.onWarmupCompleted("log_name_key", false);
        setanimationsloop.onWarmupCompleted("default_service", false);
        setanimationsloop.onWarmupCompleted("extra_params", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 93;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private RemoteProcessEventLogOptions$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{getwrigglelayout, getwrigglelayout, encryptType4.IAuthTabCallback};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        kSerializerArr[1] = getwrigglelayout2;
        kSerializerArr[1] = getwrigglelayout2;
        kSerializerArr[4] = encryptType4.IAuthTabCallback;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RemoteProcessEventLogOptions deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        JsonObject jsonObject;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String strAsInterface = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            jsonObject = (JsonObject) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, encryptType4.IAuthTabCallback, (Object) null);
            str = strAsInterface2;
            i = 7;
            str2 = strAsInterface3;
        } else {
            String strAsInterface4 = null;
            JsonObject jsonObject2 = null;
            boolean z = true;
            int i3 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onExtraCallbackWithResult + 65;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 36 / 0;
                        if (iOnNavigationEvent == 0) {
                            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i3 |= 1;
                        } else if (iOnNavigationEvent != 1) {
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                            i3 |= 2;
                            int i6 = onExtraCallbackWithResult + 47;
                            onWarmupCompleted = i6 % 128;
                            int i7 = i6 % 2;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            jsonObject2 = (JsonObject) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, encryptType4.IAuthTabCallback, jsonObject2);
                            i3 |= 4;
                        }
                    } else if (iOnNavigationEvent == 0) {
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i3 |= 1;
                    } else if (iOnNavigationEvent != 1) {
                    }
                } else {
                    z = false;
                }
            }
            str = strAsInterface4;
            str2 = strAsInterface;
            jsonObject = jsonObject2;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new RemoteProcessEventLogOptions(i, str, str2, jsonObject, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m80deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        RemoteProcessEventLogOptions remoteProcessEventLogOptionsDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return remoteProcessEventLogOptionsDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull RemoteProcessEventLogOptions remoteProcessEventLogOptions) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(remoteProcessEventLogOptions, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            RemoteProcessEventLogOptions.onExtraCallbackWithResult(remoteProcessEventLogOptions, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(remoteProcessEventLogOptions, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        RemoteProcessEventLogOptions.onExtraCallbackWithResult(remoteProcessEventLogOptions, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 30 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (RemoteProcessEventLogOptions) obj);
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        int i5 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
