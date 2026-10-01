package im.toss.securities.core.router.spec;

import im.toss.securities.core.router.spec.TossSecRoute;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class TossSecRoute$OptionPracticeIntroVideo$$serializer implements aeu2<TossSecRoute.OptionPracticeIntroVideo> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final TossSecRoute$OptionPracticeIntroVideo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TossSecRoute$OptionPracticeIntroVideo$$serializer tossSecRoute$OptionPracticeIntroVideo$$serializer = new TossSecRoute$OptionPracticeIntroVideo$$serializer();
        INSTANCE = tossSecRoute$OptionPracticeIntroVideo$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.core.router.spec.TossSecRoute.OptionPracticeIntroVideo", tossSecRoute$OptionPracticeIntroVideo$$serializer, 4);
        setanimationsloop.onWarmupCompleted(TossSecRoute.OptionPracticeIntroVideo.PARAM_ENTRY_ID, true);
        setanimationsloop.onWarmupCompleted("beforeEntryId", true);
        setanimationsloop.onWarmupCompleted(TossSecRoute.OptionPracticeIntroVideo.PARAM_START_IN_PIP, true);
        setanimationsloop.onWarmupCompleted(TossSecRoute.OptionPracticeIntroVideo.PARAM_FROM_NOTIFICATION, true);
        descriptor = setanimationsloop;
        $stable = 8;
        int i = onExtraCallbackWithResult + 55;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private TossSecRoute$OptionPracticeIntroVideo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onWarmupCompleted + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final TossSecRoute.OptionPracticeIntroVideo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String str5 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            i = 15;
            str3 = str6;
            str4 = str7;
        } else {
            int i3 = IAuthTabCallback + 87;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            boolean z = true;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str9);
                    i5 |= 1;
                    int i6 = IAuthTabCallback + 5;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                } else if (iOnNavigationEvent == 1) {
                    str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str10);
                    i5 |= 2;
                } else if (iOnNavigationEvent != 2) {
                    int i8 = onWarmupCompleted + 19;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        if (iOnNavigationEvent != 4) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str8);
                        i5 |= 8;
                    } else {
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str8);
                        i5 |= 8;
                    }
                } else {
                    str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str5);
                    i5 |= 4;
                }
            }
            i = i5;
            str = str5;
            str2 = str8;
            str3 = str9;
            str4 = str10;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TossSecRoute.OptionPracticeIntroVideo(i, str3, str4, str, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m25deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TossSecRoute.OptionPracticeIntroVideo optionPracticeIntroVideoDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 51;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return optionPracticeIntroVideoDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TossSecRoute.OptionPracticeIntroVideo optionPracticeIntroVideo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(optionPracticeIntroVideo, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TossSecRoute.OptionPracticeIntroVideo.onExtraCallback(optionPracticeIntroVideo, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 105;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TossSecRoute.OptionPracticeIntroVideo) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 57;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
