package o;

import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class extractTombstoneFd extends TombstoneParserCompanion {

    @Nullable
    private final String IAuthTabCallback;
    private final getScreenDensityDpi onExtraCallbackWithResult;
    private final String onNavigationEvent;

    @Nullable
    private final String onWarmupCompleted;

    extractTombstoneFd(String str, @Nullable String str2, @Nullable String str3, getScreenDensityDpi getscreendensitydpi) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.onNavigationEvent = str;
        this.IAuthTabCallback = str2;
        this.onWarmupCompleted = str3;
        if (getscreendensitydpi == null) {
            throw new NullPointerException("Null attributes");
        }
        this.onExtraCallbackWithResult = getscreendensitydpi;
    }

    @Override // o.TombstoneParserCompanion
    public String onExtraCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.TombstoneParserCompanion
    @Nullable
    public String onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    @Override // o.TombstoneParserCompanion
    @Nullable
    public String IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.TombstoneParserCompanion
    public getScreenDensityDpi onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public String toString() {
        return "InstrumentationScopeInfo{name=" + this.onNavigationEvent + ", version=" + this.IAuthTabCallback + ", schemaUrl=" + this.onWarmupCompleted + ", attributes=" + this.onExtraCallbackWithResult + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TombstoneParserCompanion)) {
            return false;
        }
        TombstoneParserCompanion tombstoneParserCompanion = (TombstoneParserCompanion) obj;
        if (!this.onNavigationEvent.equals(tombstoneParserCompanion.onExtraCallback())) {
            return false;
        }
        String str = this.IAuthTabCallback;
        if (str == null) {
            if (tombstoneParserCompanion.onExtraCallbackWithResult() != null) {
                return false;
            }
        } else if (!str.equals(tombstoneParserCompanion.onExtraCallbackWithResult())) {
            return false;
        }
        String str2 = this.onWarmupCompleted;
        if (str2 == null) {
            if (tombstoneParserCompanion.IAuthTabCallback() != null) {
                return false;
            }
        } else if (!str2.equals(tombstoneParserCompanion.IAuthTabCallback())) {
            return false;
        }
        return this.onExtraCallbackWithResult.equals(tombstoneParserCompanion.onNavigationEvent());
    }

    public int hashCode() {
        int iHashCode = this.onNavigationEvent.hashCode();
        String str = this.IAuthTabCallback;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.onWarmupCompleted;
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.onExtraCallbackWithResult.hashCode();
    }
}
