package com.kakao.sdk.common.model;

import com.alibaba.ariver.kernel.common.log.ApiLog;
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
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AuthErrorResponse$$serializer implements aeu2<AuthErrorResponse> {
    public static final AuthErrorResponse$$serializer INSTANCE;
    private static final /* synthetic */ setAnimationsLoop descriptor;

    static {
        AuthErrorResponse$$serializer authErrorResponse$$serializer = new AuthErrorResponse$$serializer();
        INSTANCE = authErrorResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("com.kakao.sdk.common.model.AuthErrorResponse", authErrorResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted(ApiLog.API_LOG_STATE_ERROR, false);
        setanimationsloop.onWarmupCompleted("error_description", false);
        descriptor = setanimationsloop;
    }

    private AuthErrorResponse$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        return new KSerializer[]{kSerializer, sp.IAuthTabCallback(kSerializer)};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull AuthErrorResponse authErrorResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(authErrorResponse, "");
        SerialDescriptor descriptor2 = getDescriptor();
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(descriptor2);
        AuthErrorResponse.onExtraCallbackWithResult(authErrorResponse, vylVarOnExtraCallback, descriptor2);
        vylVarOnExtraCallback.onNavigationEvent(descriptor2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public AuthErrorResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        Object objOnExtraCallbackWithResult;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor2 = getDescriptor();
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor2);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(descriptor2, 0);
            objOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor2, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            i2 = 3;
        } else {
            strAsInterface = null;
            Object objOnExtraCallbackWithResult2 = null;
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
                    objOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor2, 1, getWriggleLayout.onNavigationEvent, objOnExtraCallbackWithResult2);
                    i3 |= 2;
                }
            }
            objOnExtraCallbackWithResult = objOnExtraCallbackWithResult2;
            i2 = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor2);
        return new AuthErrorResponse(i2, strAsInterface, (String) objOnExtraCallbackWithResult, (okycx) null);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return aeu2.onWarmupCompleted.onWarmupCompleted(this);
    }
}
