package com.kakao.sdk.common.model;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.liq;

@liq(onNavigationEvent = AppsErrorCauseSerializer.class)
/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum AppsErrorCause {
    InternalServerError,
    InvalidRequest,
    InvalidParameter,
    TimeExpired,
    InvalidChannel,
    IllegalStateChannel,
    AppTypeError,
    AppScopeError,
    PermissionError,
    AppKeyTypeError,
    AppChannelNotConnected,
    AuthError,
    NotRegisteredUser,
    InvalidScope,
    AccountTermsError,
    LoginRequired,
    InvalidShippingAddressId,
    Unknown;

    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.kakao.sdk.common.model.AppsErrorCause$Companion$$cachedSerializer$delegate$1
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final KSerializer<Object> invoke() {
            return AppsErrorCauseSerializer.INSTANCE;
        }
    });

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        private final /* synthetic */ Lazy onExtraCallback() {
            return AppsErrorCause.$cachedSerializer$delegate;
        }

        public final KSerializer<AppsErrorCause> serializer() {
            return (KSerializer) onExtraCallback().getValue();
        }
    }
}
