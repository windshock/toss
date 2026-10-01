package com.kakao.sdk.common.model;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.liq;

@liq(onNavigationEvent = AuthErrorCauseSerializer.class)
/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum AuthErrorCause {
    InvalidRequest,
    InvalidClient,
    InvalidScope,
    InvalidGrant,
    Misconfigured,
    Unauthorized,
    AccessDenied,
    ServerError,
    LoginRequired,
    ConsentRequired,
    InteractionRequired,
    Unknown;

    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.kakao.sdk.common.model.AuthErrorCause$Companion$$cachedSerializer$delegate$1
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final KSerializer<Object> invoke() {
            return AuthErrorCauseSerializer.INSTANCE;
        }
    });

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        private final /* synthetic */ Lazy onWarmupCompleted() {
            return AuthErrorCause.$cachedSerializer$delegate;
        }

        public final KSerializer<AuthErrorCause> serializer() {
            return (KSerializer) onWarmupCompleted().getValue();
        }
    }
}
