package com.kakao.sdk.common.model;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.liq;
import o.nc;

@liq(onNavigationEvent = ApiErrorCauseSerializer.class)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public enum ApiErrorCause {
    InternalError(-1),
    IllegalParams(-2),
    UnsupportedApi(-3),
    BlockedAccount(-4),
    PermissionDenied(-5),
    DeprecatedApi(-9),
    ApiLimitExceeded(-10),
    BlockedApp(-12),
    NotRegisteredUser(-101),
    AlreadyRegisteredUser(-102),
    AccountDoesNotExist(-103),
    PropertyKeyDoesNotExist(-201),
    AppDoesNotExist(-301),
    InvalidToken(-401),
    InsufficientScope(-402),
    RequiredAgeVerification(-405),
    UnderAgeLimit(-406),
    SigningIsNotCompleted(-421),
    InvalidTransaction(-422),
    TransactionHasExpired(-423),
    NotTalkUser(-501),
    NotFriend(-502),
    UserDeviceUnsupported(-504),
    TalkMessageDisabled(-530),
    TalkSendMessageMonthlyLimitExceed(-531),
    TalkSendMessageDailyLimitExceed(-532),
    ImageUploadSizeExceeded(-602),
    ServerTimeOut(-603),
    ImageMaxUploadCountExceed(-606),
    DeveloperDoesNotExist(-903),
    UnderMaintenance(-9798),
    Unknown(Integer.MAX_VALUE);

    private final int errorCode;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.kakao.sdk.common.model.ApiErrorCause$Companion$$cachedSerializer$delegate$1
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final KSerializer<Object> invoke() {
            return ApiErrorCauseSerializer.INSTANCE;
        }
    });

    @nc(IAuthTabCallback = "error_code")
    public static /* synthetic */ void getErrorCode$annotations() {
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        private final /* synthetic */ Lazy IAuthTabCallback() {
            return ApiErrorCause.$cachedSerializer$delegate;
        }

        public final KSerializer<ApiErrorCause> serializer() {
            return (KSerializer) IAuthTabCallback().getValue();
        }
    }

    ApiErrorCause(int i) {
        this.errorCode = i;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
