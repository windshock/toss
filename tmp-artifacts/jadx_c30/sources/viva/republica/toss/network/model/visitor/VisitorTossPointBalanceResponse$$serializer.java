package viva.republica.toss.network.model.visitor;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class VisitorTossPointBalanceResponse$$serializer implements aeu2<VisitorTossPointBalanceResponse> {
    private static int IAuthTabCallback = 1;
    public static final VisitorTossPointBalanceResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 1;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        VisitorTossPointBalanceResponse$$serializer visitorTossPointBalanceResponse$$serializer = new VisitorTossPointBalanceResponse$$serializer();
        INSTANCE = visitorTossPointBalanceResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.visitor.VisitorTossPointBalanceResponse", visitorTossPointBalanceResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("balance", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 111;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private VisitorTossPointBalanceResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {oty1.onExtraCallback};
        int i4 = onExtraCallback + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        VisitorTossPointBalanceResponse visitorTossPointBalanceResponseM122deserialize = m122deserialize(decoder);
        int i4 = IAuthTabCallback + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return visitorTossPointBalanceResponseM122deserialize;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final VisitorTossPointBalanceResponse m122deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        long jIAuthTabCallbackDefault;
        int iOnNavigationEvent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallback + 103;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
        } else {
            long jIAuthTabCallbackDefault2 = 0;
            boolean z = true;
            int i5 = 0;
            while (z) {
                int i6 = IAuthTabCallback + 71;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i7 = 67 / 0;
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else {
                        if (iOnNavigationEvent == 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i5 = 1;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent == 0) {
                    }
                }
            }
            jIAuthTabCallbackDefault = jIAuthTabCallbackDefault2;
            i2 = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        Object obj = null;
        VisitorTossPointBalanceResponse visitorTossPointBalanceResponse = new VisitorTossPointBalanceResponse(i2, jIAuthTabCallbackDefault, (okycx) null);
        int i8 = IAuthTabCallback + 107;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return visitorTossPointBalanceResponse;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (VisitorTossPointBalanceResponse) obj);
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        int i5 = IAuthTabCallback + 69;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull VisitorTossPointBalanceResponse visitorTossPointBalanceResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(visitorTossPointBalanceResponse, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        VisitorTossPointBalanceResponse.onExtraCallback(visitorTossPointBalanceResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 67;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
