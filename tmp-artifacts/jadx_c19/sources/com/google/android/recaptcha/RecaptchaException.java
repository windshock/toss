package com.google.android.recaptcha;

import androidx.annotation.NonNull;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RecaptchaException extends Exception {
    private final RecaptchaErrorCode errorCode;
    private final String errorMessage;

    public RecaptchaException(@NonNull RecaptchaErrorCode recaptchaErrorCode, @NonNull String str) {
        super(str);
        this.errorCode = recaptchaErrorCode;
        this.errorMessage = str;
    }

    public final RecaptchaErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public /* synthetic */ RecaptchaException(@NonNull RecaptchaErrorCode recaptchaErrorCode, @NonNull String str, int i2, @NonNull DefaultConstructorMarker defaultConstructorMarker) {
        this(recaptchaErrorCode, (i2 & 2) != 0 ? recaptchaErrorCode.getErrorMessage() : str);
    }
}
