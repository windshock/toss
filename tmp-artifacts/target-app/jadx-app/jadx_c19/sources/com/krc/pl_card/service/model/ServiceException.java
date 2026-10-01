package com.krc.pl_card.service.model;

import com.krc.pl_card.enums.ResponseCode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ServiceException extends Exception {
    private final String additionalCode;
    private final ResponseCode code;

    public ServiceException(@NotNull ResponseCode responseCode, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(responseCode, "");
        StringBuilder sb = new StringBuilder();
        sb.append(responseCode.getCode());
        sb.append('(');
        sb.append(str);
        sb.append(") - ");
        sb.append(str2 == null ? responseCode.getMessage() : str2);
        super(sb.toString());
        this.code = responseCode;
        this.additionalCode = str;
    }

    public /* synthetic */ ServiceException(ResponseCode responseCode, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(responseCode, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
    }

    public final String getAdditionalCode() {
        return this.additionalCode;
    }

    public final ResponseCode getCode() {
        return this.code;
    }
}
