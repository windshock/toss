package viva.republica.toss.network.model.user;

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
import o.oty1;
import o.setAnimationsLoop;
import o.verifySignatureValue_NoAlgorithmInfo;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class NpsSurvey$$serializer implements aeu2<NpsSurvey> {
    private static int IAuthTabCallback = 0;
    public static final NpsSurvey$$serializer INSTANCE;
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
        int i5 = i3 + 67;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        NpsSurvey$$serializer npsSurvey$$serializer = new NpsSurvey$$serializer();
        INSTANCE = npsSurvey$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.user.NpsSurvey", npsSurvey$$serializer, 6);
        setanimationsloop.onWarmupCompleted(verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_ID, false);
        setanimationsloop.onWarmupCompleted("question", false);
        setanimationsloop.onWarmupCompleted("questionDesc", false);
        setanimationsloop.onWarmupCompleted("commentDesc", false);
        setanimationsloop.onWarmupCompleted("completionTitle", false);
        setanimationsloop.onWarmupCompleted("completionDesc", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private NpsSurvey$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArr = new KSerializer[73];
            kSerializerArr[1] = oty1.onExtraCallback;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            kSerializerArr[1] = getwrigglelayout;
            kSerializerArr[4] = getwrigglelayout;
            kSerializerArr[4] = getwrigglelayout;
            kSerializerArr[4] = getwrigglelayout;
            kSerializerArr[3] = getwrigglelayout;
        } else {
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{oty1.onExtraCallback, getwrigglelayout2, getwrigglelayout2, getwrigglelayout2, getwrigglelayout2, getwrigglelayout2};
        }
        int i3 = onWarmupCompleted + 15;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NpsSurvey npsSurveyM113deserialize = m113deserialize(decoder);
        int i4 = onWarmupCompleted + 117;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return npsSurveyM113deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final NpsSurvey m113deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        long j;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 5;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            str = strAsInterface3;
            str2 = strAsInterface2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            str3 = strAsInterface4;
            str4 = strAsInterface5;
            j = jIAuthTabCallbackDefault;
            i = 63;
        } else {
            String strAsInterface6 = null;
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            int i6 = 0;
            boolean z = true;
            long jIAuthTabCallbackDefault2 = 0;
            String strAsInterface9 = null;
            String strAsInterface10 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i6 |= 1;
                        int i7 = onWarmupCompleted + 65;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        i5 = 5;
                    case 1:
                        strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i6 |= 2;
                        i5 = 5;
                    case 2:
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i6 |= 4;
                        i5 = 5;
                    case 3:
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i6 |= 8;
                        i5 = 5;
                    case 4:
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i6 |= 16;
                        int i9 = onExtraCallback + 9;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        i5 = 5;
                    case 5:
                        strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i5);
                        i6 |= 32;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            strAsInterface = strAsInterface10;
            int i11 = i6;
            str = strAsInterface6;
            String str5 = strAsInterface8;
            str2 = strAsInterface9;
            i = i11;
            long j2 = jIAuthTabCallbackDefault2;
            str3 = strAsInterface7;
            str4 = str5;
            j = j2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new NpsSurvey(i, j, str2, str, str3, str4, strAsInterface, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (NpsSurvey) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull NpsSurvey npsSurvey) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(npsSurvey, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            NpsSurvey.onExtraCallbackWithResult(npsSurvey, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(npsSurvey, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        NpsSurvey.onExtraCallbackWithResult(npsSurvey, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallback + 109;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 46 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onExtraCallback + 105;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
