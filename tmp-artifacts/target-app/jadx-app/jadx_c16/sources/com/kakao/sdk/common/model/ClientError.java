package com.kakao.sdk.common.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.updateAnchorFromPendingData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ClientError extends KakaoSdkError {
    private final String msg;
    private final ClientErrorCause reason;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientError)) {
            return false;
        }
        ClientError clientError = (ClientError) obj;
        return this.reason == clientError.reason && Intrinsics.areEqual(am_(), clientError.am_());
    }

    public int hashCode() {
        return (this.reason.hashCode() * 31) + am_().hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "ClientError(reason=" + this.reason + ", msg=" + am_() + ")";
    }

    public final ClientErrorCause IAuthTabCallback() {
        return this.reason;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ClientError(ClientErrorCause clientErrorCause, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        updateAnchorFromPendingData annotation;
        if ((i & 2) != 0 && ((annotation = clientErrorCause.getClass().getField(clientErrorCause.name()).getAnnotation(updateAnchorFromPendingData.class)) == null || (str = annotation.IAuthTabCallback()) == null)) {
            str = "Client-side error";
        }
        this(clientErrorCause, str);
    }

    @Override // com.kakao.sdk.common.model.KakaoSdkError
    public String am_() {
        return this.msg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientError(@NotNull ClientErrorCause clientErrorCause, @NotNull String str) {
        super(str, null);
        Intrinsics.checkNotNullParameter(clientErrorCause, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.reason = clientErrorCause;
        this.msg = str;
    }
}
