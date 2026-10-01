package im.toss.tosssecurities.tracker.v2;

import im.toss.tosssecurities.tracker.v2.SecuritiesLogV2;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class SecuritiesLogV2$UserContext$$serializer implements aeu2<SecuritiesLogV2.UserContext> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final SecuritiesLogV2$UserContext$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 3;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        SecuritiesLogV2$UserContext$$serializer securitiesLogV2$UserContext$$serializer = new SecuritiesLogV2$UserContext$$serializer();
        INSTANCE = securitiesLogV2$UserContext$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.tosssecurities.tracker.v2.SecuritiesLogV2.UserContext", securitiesLogV2$UserContext$$serializer, 4);
        setanimationsloop.onWarmupCompleted("deviceId", false);
        setanimationsloop.onWarmupCompleted("gaNo", false);
        setanimationsloop.onWarmupCompleted("userNo", false);
        setanimationsloop.onWarmupCompleted("securitiesDeviceSession", false);
        descriptor = setanimationsloop;
        $stable = 8;
        int i = IAuthTabCallback + 43;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private SecuritiesLogV2$UserContext$$serializer() {
    }

    @Override // o.aeu2
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), getwrigglelayout};
        int i4 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
        return kSerializerArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a A[SYNTHETIC] */
    @Override // o.jp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SecuritiesLogV2.UserContext deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String strAsInterface;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String str4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, null);
            str3 = strAsInterface2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            i = 15;
            str2 = str5;
        } else {
            int i5 = 0;
            boolean z = true;
            String str6 = null;
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onExtraCallbackWithResult + 101;
                    int i7 = i6 % 128;
                    onNavigationEvent = i7;
                    int i8 = i6 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i9 = i7 + 111;
                        int i10 = i9 % 128;
                        onExtraCallbackWithResult = i10;
                        if (i9 % 2 != 0) {
                            if (iOnNavigationEvent != 0) {
                                if (iOnNavigationEvent != 2) {
                                    str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str4);
                                } else {
                                    if (iOnNavigationEvent != 3) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    int i11 = i10 + 57;
                                    onNavigationEvent = i11 % 128;
                                    if (i11 % 2 == 0) {
                                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                                    } else {
                                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                                        i5 |= 8;
                                    }
                                }
                                i5 |= 4;
                            } else {
                                str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str6);
                                i5 |= 2;
                            }
                        } else if (iOnNavigationEvent != 1) {
                            if (iOnNavigationEvent != 2) {
                            }
                            i5 |= 4;
                        } else {
                            str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str6);
                            i5 |= 2;
                        }
                    } else {
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i5 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            int i12 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            i = i5;
            str = str4;
            str2 = str6;
            str3 = strAsInterface3;
            strAsInterface = strAsInterface4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new SecuritiesLogV2.UserContext(i, str3, str2, str, strAsInterface, null);
    }

    @Override // o.jp
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SecuritiesLogV2.UserContext userContextDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return userContextDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SecuritiesLogV2.UserContext userContext) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(userContext, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        SecuritiesLogV2.UserContext.IAuthTabCallback(userContext, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.py
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SecuritiesLogV2.UserContext) obj);
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        int i5 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
    }

    @Override // o.aeu2
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }
}
