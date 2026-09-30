package com.kakao.sdk.common.model;

import java.util.List;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.checkCanOpenLandingPage;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ApiErrorResponse$$serializer implements aeu2<ApiErrorResponse> {
    public static final ApiErrorResponse$$serializer INSTANCE;
    private static final /* synthetic */ setAnimationsLoop descriptor;

    static {
        ApiErrorResponse$$serializer apiErrorResponse$$serializer = new ApiErrorResponse$$serializer();
        INSTANCE = apiErrorResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("com.kakao.sdk.common.model.ApiErrorResponse", apiErrorResponse$$serializer, 5);
        setanimationsloop.onWarmupCompleted("code", false);
        setanimationsloop.onWarmupCompleted("msg", false);
        setanimationsloop.onWarmupCompleted("api_type", true);
        setanimationsloop.onWarmupCompleted("required_scopes", true);
        setanimationsloop.onWarmupCompleted("allowed_scopes", true);
        descriptor = setanimationsloop;
    }

    private ApiErrorResponse$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        return new KSerializer[]{getDynamicHeight.onWarmupCompleted, kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(new checkCanOpenLandingPage(kSerializer)), sp.IAuthTabCallback(new checkCanOpenLandingPage(kSerializer))};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull ApiErrorResponse apiErrorResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(apiErrorResponse, "");
        SerialDescriptor descriptor2 = getDescriptor();
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(descriptor2);
        ApiErrorResponse.onWarmupCompleted(apiErrorResponse, vylVarOnExtraCallback, descriptor2);
        vylVarOnExtraCallback.onNavigationEvent(descriptor2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ApiErrorResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i2;
        int i3;
        Object objOnExtraCallbackWithResult;
        Object objOnExtraCallbackWithResult2;
        Object objOnExtraCallbackWithResult3;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor2 = getDescriptor();
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor2);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(descriptor2, 0);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(descriptor2, 1);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            objOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor2, 2, getwrigglelayout, (Object) null);
            objOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor2, 3, new checkCanOpenLandingPage(getwrigglelayout), (Object) null);
            objOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor2, 4, new checkCanOpenLandingPage(getwrigglelayout), (Object) null);
            i2 = iOnTransact;
            str = strAsInterface;
            i3 = 31;
        } else {
            int iOnTransact2 = 0;
            boolean z = true;
            Object objOnExtraCallbackWithResult4 = null;
            Object objOnExtraCallbackWithResult5 = null;
            Object objOnExtraCallbackWithResult6 = null;
            String strAsInterface2 = null;
            int i4 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(descriptor2);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    iOnTransact2 = ywVarOnWarmupCompleted.onTransact(descriptor2, 0);
                    i4 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(descriptor2, 1);
                    i4 |= 2;
                } else if (iOnNavigationEvent == 2) {
                    objOnExtraCallbackWithResult6 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor2, 2, getWriggleLayout.onNavigationEvent, objOnExtraCallbackWithResult6);
                    i4 |= 4;
                } else if (iOnNavigationEvent == 3) {
                    objOnExtraCallbackWithResult5 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor2, 3, new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent), objOnExtraCallbackWithResult5);
                    i4 |= 8;
                } else {
                    if (iOnNavigationEvent != 4) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    objOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor2, 4, new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent), objOnExtraCallbackWithResult4);
                    i4 |= 16;
                }
            }
            i2 = iOnTransact2;
            i3 = i4;
            objOnExtraCallbackWithResult = objOnExtraCallbackWithResult4;
            objOnExtraCallbackWithResult2 = objOnExtraCallbackWithResult5;
            objOnExtraCallbackWithResult3 = objOnExtraCallbackWithResult6;
            str = strAsInterface2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor2);
        return new ApiErrorResponse(i3, i2, str, (String) objOnExtraCallbackWithResult3, (List) objOnExtraCallbackWithResult2, (List) objOnExtraCallbackWithResult, (okycx) null);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return aeu2.onWarmupCompleted.onWarmupCompleted(this);
    }
}
