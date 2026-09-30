package im.toss.features.applock.impl.source.api.response;

import java.util.Date;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.cb;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class UserAccessTsResponse$$serializer implements aeu2<UserAccessTsResponse> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final UserAccessTsResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 65;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 73 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 15;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        UserAccessTsResponse$$serializer userAccessTsResponse$$serializer = new UserAccessTsResponse$$serializer();
        INSTANCE = userAccessTsResponse$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.applock.impl.source.api.response.UserAccessTsResponse", userAccessTsResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("accessTs", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 123;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private UserAccessTsResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArr = new KSerializer[0];
            kSerializerArr[1] = sp.IAuthTabCallback(cb.onExtraCallback);
        } else {
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(cb.onExtraCallback)};
        }
        int i3 = onNavigationEvent + 91;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final UserAccessTsResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Date date;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            date = (Date) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, cb.onExtraCallback, (Object) null);
            int i3 = onExtraCallback + 43;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        } else {
            date = null;
            boolean z = true;
            int i5 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i6 = onNavigationEvent + 23;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    date = (Date) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, cb.onExtraCallback, date);
                    i5 = 1;
                }
            }
            i2 = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new UserAccessTsResponse(i2, date, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m73deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        UserAccessTsResponse userAccessTsResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return userAccessTsResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull UserAccessTsResponse userAccessTsResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(userAccessTsResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            UserAccessTsResponse.onExtraCallback(userAccessTsResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(userAccessTsResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        UserAccessTsResponse.onExtraCallback(userAccessTsResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallback + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (UserAccessTsResponse) obj);
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 101;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 96 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
