package viva.republica.toss.network.model.verify;

import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.PhotoBrowseView;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SmsMoVerifyResponse$$serializer implements aeu2<SmsMoVerifyResponse> {
    private static int IAuthTabCallback = 0;
    public static final SmsMoVerifyResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 47;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 95;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return serialDescriptor;
    }

    static {
        SmsMoVerifyResponse$$serializer smsMoVerifyResponse$$serializer = new SmsMoVerifyResponse$$serializer();
        INSTANCE = smsMoVerifyResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.verify.SmsMoVerifyResponse", smsMoVerifyResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("verifyId", false);
        setanimationsloop.onWarmupCompleted("status", true);
        setanimationsloop.onWarmupCompleted("statusTs", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 87;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private SmsMoVerifyResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {oty1.onExtraCallback, SmsMoVerifyResponse.onNavigationEvent()[1].getValue(), getWriggleLayout.onNavigationEvent};
        int i4 = onNavigationEvent + 39;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SmsMoVerifyResponse smsMoVerifyResponseM118deserialize = m118deserialize(decoder);
        int i4 = onNavigationEvent + 55;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return smsMoVerifyResponseM118deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final SmsMoVerifyResponse m118deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String strAsInterface;
        PhotoBrowseView photoBrowseView;
        long j;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = SmsMoVerifyResponse.onNavigationEvent();
        String strAsInterface2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            PhotoBrowseView photoBrowseView2 = (PhotoBrowseView) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), (Object) null);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            photoBrowseView = photoBrowseView2;
            i = 7;
            j = jIAuthTabCallbackDefault;
        } else {
            int i3 = onNavigationEvent + 115;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            boolean z = true;
            long jIAuthTabCallbackDefault2 = 0;
            PhotoBrowseView photoBrowseView3 = null;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = onWarmupCompleted;
                    int i7 = i6 + 91;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    if (iOnNavigationEvent != 1) {
                        int i9 = i6 + 27;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i11 = i6 + 69;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i5 |= 4;
                    } else {
                        photoBrowseView3 = (PhotoBrowseView) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), photoBrowseView3);
                        i5 |= 2;
                    }
                } else {
                    jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                    i5 |= 1;
                }
            }
            i = i5;
            strAsInterface = strAsInterface2;
            photoBrowseView = photoBrowseView3;
            j = jIAuthTabCallbackDefault2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new SmsMoVerifyResponse(i, j, photoBrowseView, strAsInterface, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SmsMoVerifyResponse) obj);
        int i4 = onWarmupCompleted + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SmsMoVerifyResponse smsMoVerifyResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(smsMoVerifyResponse, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        SmsMoVerifyResponse.onNavigationEvent(smsMoVerifyResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
