package org.apache.commons.text.lookup;

import o.getVideoFrameLayout;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ResourceBundleStringLookup extends getVideoFrameLayout {
    public static final ResourceBundleStringLookup onExtraCallback = new ResourceBundleStringLookup();
    private final String onExtraCallbackWithResult;

    ResourceBundleStringLookup() {
        this(null);
    }

    ResourceBundleStringLookup(String str) {
        this.onExtraCallbackWithResult = str;
    }

    public String toString() {
        return super.toString() + " [bundleName=" + this.onExtraCallbackWithResult + "]";
    }
}
