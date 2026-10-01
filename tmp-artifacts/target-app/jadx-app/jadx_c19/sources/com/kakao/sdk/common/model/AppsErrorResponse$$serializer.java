package com.kakao.sdk.common.model;

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
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppsErrorResponse$$serializer implements aeu2<AppsErrorResponse> {
    public static final AppsErrorResponse$$serializer INSTANCE;
    private static final /* synthetic */ setAnimationsLoop descriptor;

    static {
        AppsErrorResponse$$serializer appsErrorResponse$$serializer = new AppsErrorResponse$$serializer();
        INSTANCE = appsErrorResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("com.kakao.sdk.common.model.AppsErrorResponse", appsErrorResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("error_code", false);
        setanimationsloop.onWarmupCompleted("error_message", false);
        descriptor = setanimationsloop;
    }

    private AppsErrorResponse$$serializer() {
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull AppsErrorResponse appsErrorResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(appsErrorResponse, "");
        SerialDescriptor descriptor2 = getDescriptor();
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(descriptor2);
        AppsErrorResponse.onExtraCallbackWithResult(appsErrorResponse, vylVarOnExtraCallback, descriptor2);
        vylVarOnExtraCallback.onNavigationEvent(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        return new KSerializer[]{getwrigglelayout, getwrigglelayout};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public AppsErrorResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String strAsInterface2;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor2 = getDescriptor();
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor2);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(descriptor2, 0);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(descriptor2, 1);
            i2 = 3;
        } else {
            strAsInterface = null;
            String strAsInterface3 = null;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(descriptor2);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface = ywVarOnWarmupCompleted.asInterface(descriptor2, 0);
                    i3 |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    strAsInterface3 = ywVarOnWarmupCompleted.asInterface(descriptor2, 1);
                    i3 |= 2;
                }
            }
            strAsInterface2 = strAsInterface3;
            i2 = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor2);
        return new AppsErrorResponse(i2, strAsInterface, strAsInterface2, null);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return aeu2.onWarmupCompleted.onWarmupCompleted(this);
    }
}
