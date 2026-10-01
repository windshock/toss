package com.alibaba.ariver.kernel.common.immutable;

import android.os.Bundle;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ImmutableBundle implements Immutable<Bundle> {
    private Bundle immutable;

    public ImmutableBundle(Bundle bundle) {
        this.immutable = bundle;
    }

    public boolean getBoolean(String str, boolean z) {
        Bundle bundle = this.immutable;
        return bundle != null ? bundle.getBoolean(str, z) : z;
    }

    public int getInt(String str, int i2) {
        Bundle bundle = this.immutable;
        return bundle != null ? bundle.getInt(str, i2) : i2;
    }

    public long getLong(String str, long j) {
        Bundle bundle = this.immutable;
        return bundle != null ? bundle.getLong(str, j) : j;
    }

    public double getDouble(String str, double d) {
        Bundle bundle = this.immutable;
        return bundle != null ? bundle.getDouble(str, d) : d;
    }

    public String getString(String str, String str2) {
        Bundle bundle = this.immutable;
        return bundle != null ? bundle.getString(str, str2) : str2;
    }

    public boolean containsKey(String str) {
        Bundle bundle = this.immutable;
        return bundle != null && bundle.containsKey(str);
    }

    public int size() {
        Bundle bundle = this.immutable;
        if (bundle != null) {
            return bundle.size();
        }
        return 0;
    }

    public boolean isEmpty() {
        Bundle bundle = this.immutable;
        return bundle == null || bundle.isEmpty();
    }

    public ImmutableSet<String> keySet() {
        if (this.immutable != null) {
            return new ImmutableSet<>(this.immutable.keySet());
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alibaba.ariver.kernel.common.immutable.Immutable
    public Bundle mutable() {
        return new Bundle(this.immutable);
    }

    public String toString() {
        if (this.immutable == null) {
            return "ImmutableBundle{NULL}";
        }
        return "ImmutableBundle{" + this.immutable.toString() + "}";
    }
}
