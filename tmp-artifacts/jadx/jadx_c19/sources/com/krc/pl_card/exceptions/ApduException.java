package com.krc.pl_card.exceptions;

import com.krc.pl_card.enums.ResponseCode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ApduException extends Exception {
    private ResponseCode code;
    private Exception e;
    private String message;
    private String statusWord;

    public ApduException(@NotNull String str, @Nullable Exception exc) {
        Intrinsics.checkNotNullParameter(str, "");
        this.code = ResponseCode.FATAL_NFC;
        setMessage(str);
        this.e = exc;
    }

    public /* synthetic */ ApduException(String str, Exception exc, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : exc);
    }

    public ApduException(@NotNull String str, @NotNull String str2, @Nullable Exception exc) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.code = ResponseCode.FATAL_NFC;
        setMessage(str);
        this.statusWord = str2;
        this.e = exc;
    }

    public /* synthetic */ ApduException(String str, String str2, Exception exc, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : exc);
    }

    public final ResponseCode getCode() {
        return this.code;
    }

    public final Exception getE() {
        return this.e;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final String getStatusWord() {
        return this.statusWord;
    }

    public final void setCode(@NotNull ResponseCode responseCode) {
        Intrinsics.checkNotNullParameter(responseCode, "");
        this.code = responseCode;
    }

    public final void setE(@Nullable Exception exc) {
        this.e = exc;
    }

    public void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
    }

    public final void setStatusWord(@Nullable String str) {
        this.statusWord = str;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getMessage() + '[' + this.code + "][" + this.statusWord + ']';
    }
}
