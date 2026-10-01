package im.toss.features.home.core.local.model.dst.widget;

import im.toss.features.home.core.local.model.dst.widget.BadgeLocal$;
import im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BaseManifest3;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeListRowAttributeLocal$Right$Badge$$serializer implements aeu2<HomeListRowAttributeLocal.Right.Badge> {
    private static int IAuthTabCallback = 0;
    public static final HomeListRowAttributeLocal$Right$Badge$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 65;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        HomeListRowAttributeLocal$Right$Badge$$serializer homeListRowAttributeLocal$Right$Badge$$serializer = new HomeListRowAttributeLocal$Right$Badge$$serializer();
        INSTANCE = homeListRowAttributeLocal$Right$Badge$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal.Right.Badge", homeListRowAttributeLocal$Right$Badge$$serializer, 2);
        setanimationsloop.onWarmupCompleted("verticalAlignment", false);
        setanimationsloop.onWarmupCompleted("badge", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 35;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 39 / 0;
        }
    }

    private HomeListRowAttributeLocal$Right$Badge$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {HomeListRowAttributeLocal.Right.Badge.onExtraCallback()[0].getValue(), BadgeLocal$.serializer.INSTANCE};
        int i4 = onWarmupCompleted + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HomeListRowAttributeLocal.Right.Badge deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        BaseManifest3 baseManifest3;
        BadgeLocal badgeLocal;
        int iOnNavigationEvent;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = HomeListRowAttributeLocal.Right.Badge.onExtraCallback();
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            baseManifest3 = (BaseManifest3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), (Object) null);
            badgeLocal = (BadgeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BadgeLocal$.serializer.INSTANCE, (Object) null);
            int i4 = IAuthTabCallback + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            i = 3;
        } else {
            boolean z = true;
            BaseManifest3 baseManifest32 = null;
            BadgeLocal badgeLocal2 = null;
            int i6 = 0;
            while (z) {
                int i7 = IAuthTabCallback + 79;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i8 = 7 / 0;
                    if (iOnNavigationEvent != -1) {
                        i2 = IAuthTabCallback + 59;
                        onWarmupCompleted = i2 % 128;
                        if (i2 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (iOnNavigationEvent == 0) {
                            baseManifest32 = (BaseManifest3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), baseManifest32);
                            i6 |= 1;
                        } else {
                            if (iOnNavigationEvent != 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            badgeLocal2 = (BadgeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BadgeLocal$.serializer.INSTANCE, badgeLocal2);
                            i6 |= 2;
                        }
                    } else {
                        z = false;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        i2 = IAuthTabCallback + 59;
                        onWarmupCompleted = i2 % 128;
                        if (i2 % 2 != 0) {
                        }
                    } else {
                        z = false;
                    }
                }
            }
            i = i6;
            baseManifest3 = baseManifest32;
            badgeLocal = badgeLocal2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeListRowAttributeLocal.Right.Badge(i, baseManifest3, badgeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m497deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeListRowAttributeLocal.Right.Badge badge) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(badge, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeListRowAttributeLocal.Right.Badge.onExtraCallbackWithResult(badge, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 49;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeListRowAttributeLocal.Right.Badge) obj);
        int i4 = onWarmupCompleted + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
