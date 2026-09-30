package com.tnkfactory.ad.tnkassert;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class AssertData {
    public final long a;
    public final String b;

    public AssertData() {
        this(0L, 1, null);
    }

    public abstract String getDocName();

    public final String getEvent() {
        return getDocName();
    }

    public final String getParams() {
        return this.b;
    }

    public final long getTime() {
        return this.a;
    }

    public abstract String postData();

    public AssertData(long j) {
        this.a = j;
        this.b = "";
    }

    public /* synthetic */ AssertData(long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? System.currentTimeMillis() : j);
    }
}
