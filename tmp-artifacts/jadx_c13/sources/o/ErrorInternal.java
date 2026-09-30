package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class ErrorInternal extends getDescbugsnag_android_core_release {
    private final String IAuthTabCallback;
    private final boolean IAuthTabCallbackDefault;
    private final getUserImplbugsnag_android_core_release asInterface;
    private final boolean onExtraCallback;
    private final isAnr onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    ErrorInternal(String str, String str2, isAnr isanr, getUserImplbugsnag_android_core_release getuserimplbugsnag_android_core_release, boolean z, boolean z2) {
        if (str == null) {
            throw new NullPointerException("Null traceId");
        }
        this.onWarmupCompleted = str;
        if (str2 == null) {
            throw new NullPointerException("Null spanId");
        }
        this.IAuthTabCallback = str2;
        if (isanr == null) {
            throw new NullPointerException("Null traceFlags");
        }
        this.onExtraCallbackWithResult = isanr;
        if (getuserimplbugsnag_android_core_release == null) {
            throw new NullPointerException("Null traceState");
        }
        this.asInterface = getuserimplbugsnag_android_core_release;
        this.onExtraCallback = z;
        this.IAuthTabCallbackDefault = z2;
    }

    @Override // o.getSeverityReasonbugsnag_android_core_release
    public String onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    @Override // o.getSeverityReasonbugsnag_android_core_release
    public String IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.getSeverityReasonbugsnag_android_core_release
    public isAnr onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getSeverityReasonbugsnag_android_core_release
    public getUserImplbugsnag_android_core_release onExtraCallback() {
        return this.asInterface;
    }

    @Override // o.getSeverityReasonbugsnag_android_core_release
    public boolean onNavigationEvent() {
        return this.onExtraCallback;
    }

    @Override // o.getDescbugsnag_android_core_release, o.getSeverityReasonbugsnag_android_core_release
    public boolean onTransact() {
        return this.IAuthTabCallbackDefault;
    }

    public String toString() {
        return "ImmutableSpanContext{traceId=" + this.onWarmupCompleted + ", spanId=" + this.IAuthTabCallback + ", traceFlags=" + this.onExtraCallbackWithResult + ", traceState=" + this.asInterface + ", remote=" + this.onExtraCallback + ", valid=" + this.IAuthTabCallbackDefault + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getDescbugsnag_android_core_release)) {
            return false;
        }
        getDescbugsnag_android_core_release getdescbugsnag_android_core_release = (getDescbugsnag_android_core_release) obj;
        return this.onWarmupCompleted.equals(getdescbugsnag_android_core_release.onExtraCallbackWithResult()) && this.IAuthTabCallback.equals(getdescbugsnag_android_core_release.IAuthTabCallback()) && this.onExtraCallbackWithResult.equals(getdescbugsnag_android_core_release.onWarmupCompleted()) && this.asInterface.equals(getdescbugsnag_android_core_release.onExtraCallback()) && this.onExtraCallback == getdescbugsnag_android_core_release.onNavigationEvent() && this.IAuthTabCallbackDefault == getdescbugsnag_android_core_release.onTransact();
    }

    public int hashCode() {
        int iHashCode = this.onWarmupCompleted.hashCode();
        int iHashCode2 = this.IAuthTabCallback.hashCode();
        int iHashCode3 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode4 = this.asInterface.hashCode();
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ (this.onExtraCallback ? 1231 : 1237)) * 1000003) ^ (this.IAuthTabCallbackDefault ? 1231 : 1237);
    }
}
