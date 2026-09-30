package viva.republica.toss.network.model.teens;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TeensCardTaxDeductionHistory$$serializer implements aeu2<TeensCardTaxDeductionHistory> {
    private static int IAuthTabCallback = 1;
    public static final TeensCardTaxDeductionHistory$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 119;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TeensCardTaxDeductionHistory$$serializer teensCardTaxDeductionHistory$$serializer = new TeensCardTaxDeductionHistory$$serializer();
        INSTANCE = teensCardTaxDeductionHistory$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.teens.TeensCardTaxDeductionHistory", teensCardTaxDeductionHistory$$serializer, 1);
        setanimationsloop.onWarmupCompleted("createdAt", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 90 / 0;
        }
    }

    private TeensCardTaxDeductionHistory$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArr = new KSerializer[0];
            kSerializerArr[0] = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
        } else {
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
        }
        int i3 = onExtraCallback + 45;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TeensCardTaxDeductionHistory teensCardTaxDeductionHistoryM79deserialize = m79deserialize(decoder);
        int i4 = onExtraCallback + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return teensCardTaxDeductionHistoryM79deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TeensCardTaxDeductionHistory m79deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onNavigationEvent + 27;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
        } else {
            int i7 = onNavigationEvent + 101;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            String str2 = null;
            boolean z = true;
            loop0: while (true) {
                int i9 = 0;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i10 = onNavigationEvent + 69;
                        onExtraCallback = i10 % 128;
                        if (i10 % 2 == 0) {
                            break;
                        }
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str2);
                        i9 = 1;
                    }
                }
                str = str2;
                i4 = i9;
                str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str2);
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TeensCardTaxDeductionHistory(i4, str, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TeensCardTaxDeductionHistory) obj);
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        int i5 = onNavigationEvent + 105;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TeensCardTaxDeductionHistory teensCardTaxDeductionHistory) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(teensCardTaxDeductionHistory, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TeensCardTaxDeductionHistory.onExtraCallback(teensCardTaxDeductionHistory, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(teensCardTaxDeductionHistory, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TeensCardTaxDeductionHistory.onExtraCallback(teensCardTaxDeductionHistory, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
