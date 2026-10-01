package com.bumptech.glide.load.engine.executor;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RuntimeCompat {
    private RuntimeCompat() {
    }

    public static int onExtraCallbackWithResult() {
        return Runtime.getRuntime().availableProcessors();
    }

    /* renamed from: com.bumptech.glide.load.engine.executor.RuntimeCompat$1, reason: invalid class name */
    class AnonymousClass1 implements FilenameFilter {
        final /* synthetic */ Pattern onNavigationEvent;

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.onNavigationEvent.matcher(str).matches();
        }
    }
}
