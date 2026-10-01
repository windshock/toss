package im.toss.features.alltab.feature.total_service.data.model;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceV6CurationRequest$$serializer implements aeu2<TotalServiceV6CurationRequest> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final TotalServiceV6CurationRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 15 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 39;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        TotalServiceV6CurationRequest$$serializer totalServiceV6CurationRequest$$serializer = new TotalServiceV6CurationRequest$$serializer();
        INSTANCE = totalServiceV6CurationRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.alltab.feature.total_service.data.model.TotalServiceV6CurationRequest", totalServiceV6CurationRequest$$serializer, 3);
        setanimationsloop.onWarmupCompleted("closeCount", false);
        setanimationsloop.onWarmupCompleted("seenCurationBannerId", false);
        setanimationsloop.onWarmupCompleted("tubaVariable", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 9;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private TotalServiceV6CurationRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getDynamicHeight.onWarmupCompleted, sp.IAuthTabCallback(oty1.onExtraCallback), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
        int i4 = onWarmupCompleted + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final TotalServiceV6CurationRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        int i2;
        String str;
        Long l;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            Long l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, (Object) null);
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, (Object) null);
            int i4 = onWarmupCompleted + 9;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 5;
            }
            i = 7;
            i2 = iOnTransact;
            str = str2;
            l = l2;
        } else {
            String str3 = null;
            Long l3 = null;
            int i6 = 0;
            int iOnTransact2 = 0;
            boolean z = true;
            while (z) {
                int i7 = IAuthTabCallback + 49;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i8 = onWarmupCompleted + 41;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                    i6 |= 1;
                    int i10 = onWarmupCompleted + 89;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                } else if (iOnNavigationEvent == 1) {
                    l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, l3);
                    i6 |= 2;
                } else {
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i12 = IAuthTabCallback + 61;
                    onWarmupCompleted = i12 % 128;
                    if (i12 % 2 == 0) {
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str3);
                        i6 |= 3;
                    } else {
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str3);
                        i6 |= 4;
                    }
                }
            }
            i = i6;
            i2 = iOnTransact2;
            str = str3;
            l = l3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TotalServiceV6CurationRequest(i, i2, l, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m70deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TotalServiceV6CurationRequest totalServiceV6CurationRequestDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
        return totalServiceV6CurationRequestDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TotalServiceV6CurationRequest totalServiceV6CurationRequest) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(totalServiceV6CurationRequest, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TotalServiceV6CurationRequest.onExtraCallback(totalServiceV6CurationRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(totalServiceV6CurationRequest, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TotalServiceV6CurationRequest.onExtraCallback(totalServiceV6CurationRequest, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TotalServiceV6CurationRequest) obj);
        int i4 = onWarmupCompleted + 75;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 13;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 1 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
