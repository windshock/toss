package com.kakao.sdk.common.model;

import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class KakaoSdkError$onExtraCallbackWithResult {
    public /* synthetic */ KakaoSdkError$onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private KakaoSdkError$onExtraCallbackWithResult() {
    }

    private final /* synthetic */ Lazy IAuthTabCallback() {
        return KakaoSdkError.onExtraCallback();
    }

    public final KSerializer<KakaoSdkError> serializer() {
        return (KSerializer) IAuthTabCallback().getValue();
    }
}
