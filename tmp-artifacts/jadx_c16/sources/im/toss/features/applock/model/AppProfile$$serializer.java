package im.toss.features.applock.model;

import im.toss.features.applock.model.AppProfile;
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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppProfile$$serializer implements aeu2<AppProfile> {
    public static final AppProfile$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        AppProfile$$serializer appProfile$$serializer = new AppProfile$$serializer();
        INSTANCE = appProfile$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.applock.model.AppProfile", appProfile$$serializer, 2);
        setanimationsloop.onWarmupCompleted("security", true);
        setanimationsloop.onWarmupCompleted("hideBalance", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 87;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private AppProfile$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i2 % 128;
        return i2 % 2 != 0 ? new KSerializer[]{sp.IAuthTabCallback(AppProfile$HideBalance$$serializer.INSTANCE), sp.IAuthTabCallback(AppProfile$Security$$serializer.INSTANCE)} : new KSerializer[]{sp.IAuthTabCallback(AppProfile$Security$$serializer.INSTANCE), sp.IAuthTabCallback(AppProfile$HideBalance$$serializer.INSTANCE)};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AppProfile deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        AppProfile.Security security;
        AppProfile.HideBalance hideBalance;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            security = (AppProfile.Security) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, AppProfile$Security$$serializer.INSTANCE, (Object) null);
            hideBalance = (AppProfile.HideBalance) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, AppProfile$HideBalance$$serializer.INSTANCE, (Object) null);
            i = 3;
        } else {
            int i5 = 0;
            boolean z = true;
            security = null;
            AppProfile.HideBalance hideBalance2 = null;
            while (z) {
                int i6 = onNavigationEvent + 5;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    security = (AppProfile.Security) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, AppProfile$Security$$serializer.INSTANCE, security);
                    i5 |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    hideBalance2 = (AppProfile.HideBalance) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, AppProfile$HideBalance$$serializer.INSTANCE, hideBalance2);
                    i5 |= 2;
                }
            }
            hideBalance = hideBalance2;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        AppProfile appProfile = new AppProfile(i, security, hideBalance, (okycx) null);
        int i7 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return appProfile;
        }
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m74deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AppProfile appProfileDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return appProfileDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AppProfile appProfile) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(appProfile, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AppProfile.onWarmupCompleted(appProfile, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 31 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(appProfile, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            AppProfile.onWarmupCompleted(appProfile, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AppProfile) obj);
        int i4 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
