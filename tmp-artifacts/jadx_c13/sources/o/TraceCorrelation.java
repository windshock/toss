package o;

import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TraceCorrelation {
    private final String IAuthTabCallback;

    @Nullable
    private String onExtraCallback;

    @Nullable
    private String onExtraCallbackWithResult;

    @Nullable
    private getScreenDensityDpi onNavigationEvent;

    TraceCorrelation(String str) {
        this.IAuthTabCallback = str;
    }

    public TraceCorrelation onWarmupCompleted(String str) {
        this.onExtraCallback = str;
        return this;
    }

    public TraceCorrelation onExtraCallbackWithResult(String str) {
        this.onExtraCallbackWithResult = str;
        return this;
    }

    public TraceCorrelation onExtraCallback(getScreenDensityDpi getscreendensitydpi) {
        this.onNavigationEvent = getscreendensitydpi;
        return this;
    }

    public TombstoneParserCompanion onWarmupCompleted() {
        String str = this.IAuthTabCallback;
        String str2 = this.onExtraCallback;
        String str3 = this.onExtraCallbackWithResult;
        getScreenDensityDpi getscreendensitydpiBB_ = this.onNavigationEvent;
        if (getscreendensitydpiBB_ == null) {
            getscreendensitydpiBB_ = getScreenDensityDpi.bB_();
        }
        return TombstoneParserCompanion.onExtraCallbackWithResult(str, str2, str3, getscreendensitydpiBB_);
    }
}
