package im.toss.securities.core.router.spec;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class SavedNavEntry$$serializer implements aeu2<SavedNavEntry> {
    public static final int $stable;
    public static final SavedNavEntry$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 63;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        SavedNavEntry$$serializer savedNavEntry$$serializer = new SavedNavEntry$$serializer();
        INSTANCE = savedNavEntry$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.core.router.spec.SavedNavEntry", savedNavEntry$$serializer, 4);
        setanimationsloop.onWarmupCompleted("route", false);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("feedExtras", true);
        setanimationsloop.onWarmupCompleted("landingId", true);
        descriptor = setanimationsloop;
        $stable = 8;
        int i = onExtraCallback + 3;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private SavedNavEntry$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = SavedNavEntry.onNavigationEvent();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {lazyArrOnNavigationEvent[0].getValue(), getwrigglelayout, lazyArrOnNavigationEvent[2].getValue(), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onNavigationEvent + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0040 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SavedNavEntry deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        TossSecRoute tossSecRoute;
        String strAsInterface;
        int i;
        List list;
        String str;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = SavedNavEntry.onNavigationEvent();
        List list2 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            i = 0;
            String str2 = null;
            strAsInterface = null;
            tossSecRoute = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i3 = onNavigationEvent;
                    int i4 = i3 + 37;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 71 / 0;
                        if (iOnNavigationEvent == 0) {
                            tossSecRoute = (TossSecRoute) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), tossSecRoute);
                            i |= 1;
                        } else if (iOnNavigationEvent != 1) {
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                            i |= 2;
                        } else if (iOnNavigationEvent == 2) {
                            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnNavigationEvent[2].getValue(), list2);
                            i |= 4;
                            int i6 = onWarmupCompleted + 93;
                            onNavigationEvent = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i7 = 3 % 5;
                            }
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i8 = i3 + 87;
                            onWarmupCompleted = i8 % 128;
                            int i9 = i8 % 2;
                            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str2);
                            i |= 8;
                        }
                    } else if (iOnNavigationEvent == 0) {
                        tossSecRoute = (TossSecRoute) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), tossSecRoute);
                        i |= 1;
                    } else if (iOnNavigationEvent != 1) {
                    }
                } else {
                    z = false;
                }
            }
            int i10 = onWarmupCompleted + 55;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            str = str2;
            list = list2;
        } else {
            tossSecRoute = (TossSecRoute) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            i = 15;
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnNavigationEvent[2].getValue(), (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, (Object) null);
        }
        TossSecRoute tossSecRoute2 = tossSecRoute;
        int i12 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new SavedNavEntry(i12, tossSecRoute2, strAsInterface, list, str, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m20deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SavedNavEntry savedNavEntryDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return savedNavEntryDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SavedNavEntry savedNavEntry) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(savedNavEntry, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            SavedNavEntry.onNavigationEvent(savedNavEntry, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(savedNavEntry, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        SavedNavEntry.onNavigationEvent(savedNavEntry, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SavedNavEntry) obj);
        int i4 = onNavigationEvent + 71;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
