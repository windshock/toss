package org.apache.commons.compress.archivers.zip;

import java.io.Serializable;
import java.util.zip.ZipException;
import o.TTWebsiteActivity2;
import o.dj14;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class UnsupportedZipFeatureException extends ZipException {
    private static final long serialVersionUID = 20161219;
    private final transient TTWebsiteActivity2 onNavigationEvent;
    private final onExtraCallback reason;

    public static class onExtraCallback implements Serializable {
        private static final long serialVersionUID = 4112582948775420359L;
        private final String name;
        public static final onExtraCallback IAuthTabCallback = new onExtraCallback("encryption");
        public static final onExtraCallback onWarmupCompleted = new onExtraCallback("compression method");
        public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback("data descriptor");
        public static final onExtraCallback onExtraCallback = new onExtraCallback("splitting");
        public static final onExtraCallback onNavigationEvent = new onExtraCallback("unknown compressed size");

        private onExtraCallback(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    public UnsupportedZipFeatureException(onExtraCallback onextracallback, TTWebsiteActivity2 tTWebsiteActivity2) {
        super("Unsupported feature " + onextracallback + " used in entry " + tTWebsiteActivity2.getName());
        this.reason = onextracallback;
        this.onNavigationEvent = tTWebsiteActivity2;
    }

    public UnsupportedZipFeatureException(dj14 dj14Var, TTWebsiteActivity2 tTWebsiteActivity2) {
        super("Unsupported compression method " + tTWebsiteActivity2.getMethod() + " (" + dj14Var.name() + ") used in entry " + tTWebsiteActivity2.getName());
        this.reason = onExtraCallback.onWarmupCompleted;
        this.onNavigationEvent = tTWebsiteActivity2;
    }
}
