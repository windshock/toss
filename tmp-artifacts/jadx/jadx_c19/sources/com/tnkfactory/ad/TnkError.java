package com.tnkfactory.ad;

import com.alibaba.ariver.kernel.RVParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkError extends Throwable {
    private final Throwable cause;
    private final int code;
    private final String message;

    public TnkError() {
        this(0, null, null, 7, null);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public final int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public /* synthetic */ TnkError(int i2, String str, Throwable th, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? RVParams.WEBVIEW_FONT_SIZE_LARGEST : i2, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? null : th);
    }

    public TnkError(int i2, @NotNull String str, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        this.code = i2;
        this.message = str;
        this.cause = th;
    }
}
