package im.toss.features.benefit.admob;

import im.toss.features.benefit.admob.AdMobLogEventRequest;
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
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AdMobLogEventRequest$AdMobLoadFailure$$serializer implements aeu2<AdMobLogEventRequest.AdMobLoadFailure> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final AdMobLogEventRequest$AdMobLoadFailure$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 83 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 31;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        AdMobLogEventRequest$AdMobLoadFailure$$serializer adMobLogEventRequest$AdMobLoadFailure$$serializer = new AdMobLogEventRequest$AdMobLoadFailure$$serializer();
        INSTANCE = adMobLogEventRequest$AdMobLoadFailure$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.benefit.admob.AdMobLogEventRequest.AdMobLoadFailure", adMobLogEventRequest$AdMobLoadFailure$$serializer, 4);
        setanimationsloop.onWarmupCompleted("requestId", false);
        setanimationsloop.onWarmupCompleted("eventTs", false);
        setanimationsloop.onWarmupCompleted("adUnit", true);
        setanimationsloop.onWarmupCompleted("mediationType", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private AdMobLogEventRequest$AdMobLoadFailure$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArr = new KSerializer[2];
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            kSerializerArr[1] = getwrigglelayout;
            kSerializerArr[0] = getwrigglelayout;
            kSerializerArr[5] = getwrigglelayout;
            kSerializerArr[5] = getwrigglelayout;
        } else {
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{getwrigglelayout2, getwrigglelayout2, getwrigglelayout2, getwrigglelayout2};
        }
        int i3 = onWarmupCompleted + 49;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AdMobLogEventRequest.AdMobLoadFailure deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        int iOnNavigationEvent;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            int i3 = onNavigationEvent + 59;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            i = 15;
            str = strAsInterface;
            str2 = strAsInterface4;
            str3 = strAsInterface2;
            str4 = strAsInterface3;
        } else {
            String strAsInterface5 = null;
            String strAsInterface6 = null;
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            int i5 = 0;
            boolean z = true;
            while (z) {
                int i6 = onWarmupCompleted + 83;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i7 = 17 / 0;
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent == 0) {
                        int i8 = onWarmupCompleted;
                        int i9 = i8 + 45;
                        onNavigationEvent = i9 % 128;
                        if (i9 % 2 == 0) {
                            if (iOnNavigationEvent == 1) {
                                strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                                i5 |= 2;
                            } else if (iOnNavigationEvent == 2) {
                                int i10 = i8 + 73;
                                onNavigationEvent = i10 % 128;
                                int i11 = i10 % 2;
                                if (iOnNavigationEvent != 3) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                                i5 |= 8;
                            } else {
                                strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                                i5 |= 4;
                            }
                        } else if (iOnNavigationEvent == 1) {
                            strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                            i5 |= 2;
                        } else if (iOnNavigationEvent == 2) {
                        }
                    } else {
                        strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i5 |= 1;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent == 0) {
                    }
                }
            }
            i = i5;
            str = strAsInterface5;
            str2 = strAsInterface6;
            str3 = strAsInterface7;
            str4 = strAsInterface8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AdMobLogEventRequest.AdMobLoadFailure(i, str, str3, str4, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m79deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AdMobLogEventRequest.AdMobLoadFailure adMobLoadFailureDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return adMobLoadFailureDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AdMobLogEventRequest.AdMobLoadFailure adMobLoadFailure) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(adMobLoadFailure, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AdMobLogEventRequest.AdMobLoadFailure.onExtraCallbackWithResult(adMobLoadFailure, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(adMobLoadFailure, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        AdMobLogEventRequest.AdMobLoadFailure.onExtraCallbackWithResult(adMobLoadFailure, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 60 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AdMobLogEventRequest.AdMobLoadFailure) obj);
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
