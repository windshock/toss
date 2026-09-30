package com.kakao.sdk.auth.model;

import kotlin.jvm.internal.Intrinsics;
import o.nc;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum Prompt {
    LOGIN,
    CREATE,
    SELECT_ACCOUNT,
    CERT;

    public final String getValue() {
        nc annotation = Prompt.class.getField(name()).getAnnotation(nc.class);
        Intrinsics.checkNotNull(annotation);
        return annotation.IAuthTabCallback();
    }
}
