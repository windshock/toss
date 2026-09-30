package com.horcrux.svg;

import javax.annotation.Nonnull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public enum SvgView$Events {
    EVENT_DATA_URL("onDataURL");

    private final String mName;

    SvgView$Events(String str) {
        this.mName = str;
    }

    @Override // java.lang.Enum
    @Nonnull
    public String toString() {
        return this.mName;
    }
}
