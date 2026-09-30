package com.krc.pl_card.exceptions;

import com.krc.pl_card.enums.ResponseCode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class EpTagException extends Exception {
    private ResponseCode code;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpTagException(@NotNull ResponseCode responseCode, @NotNull String str, @Nullable Exception exc) {
        super('[' + responseCode + "] " + str);
        Intrinsics.checkNotNullParameter(responseCode, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.code = responseCode;
    }

    public /* synthetic */ EpTagException(ResponseCode responseCode, String str, Exception exc, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(responseCode, (i2 & 2) != 0 ? responseCode.getMessage() : str, (i2 & 4) != 0 ? null : exc);
    }

    public final ResponseCode getCode() {
        return this.code;
    }

    public final void setCode(@NotNull ResponseCode responseCode) {
        Intrinsics.checkNotNullParameter(responseCode, "");
        this.code = responseCode;
    }
}
