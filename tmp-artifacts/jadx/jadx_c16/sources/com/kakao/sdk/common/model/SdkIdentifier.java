package com.kakao.sdk.common.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SdkIdentifier {
    public static final onWarmupCompleted Companion = new onWarmupCompleted((DefaultConstructorMarker) null);
    private final String identifiers;

    /* JADX WARN: Illegal instructions before constructor call */
    public SdkIdentifier() {
        String str = null;
        this(str, 1, str);
    }

    public SdkIdentifier(@Nullable String str) {
        this.identifiers = str;
    }

    public /* synthetic */ SdkIdentifier(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public final String IAuthTabCallback() {
        return this.identifiers;
    }
}
