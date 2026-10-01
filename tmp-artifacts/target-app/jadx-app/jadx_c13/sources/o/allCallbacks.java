package o;

import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class allCallbacks extends TaskType {

    @Nullable
    private final String IAuthTabCallback;

    @Nullable
    private final String asInterface;

    @Nullable
    private final getDataTrimmed onExtraCallback;

    @Nullable
    private final String onExtraCallbackWithResult;

    @Nullable
    private final String onNavigationEvent;

    @Nullable
    private final String onWarmupCompleted;

    allCallbacks(@Nullable getDataTrimmed getdatatrimmed, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.onExtraCallback = getdatatrimmed;
        this.onExtraCallbackWithResult = str;
        this.IAuthTabCallback = str2;
        this.onWarmupCompleted = str3;
        this.asInterface = str4;
        this.onNavigationEvent = str5;
    }

    @Override // o.TaskType
    @Nullable
    public getDataTrimmed IAuthTabCallback() {
        return this.onExtraCallback;
    }

    @Override // o.TaskType
    @Nullable
    public String onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.TaskType
    @Nullable
    public String onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    @Override // o.TaskType
    @Nullable
    public String onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    @Override // o.TaskType
    @Nullable
    public String asBinder() {
        return this.asInterface;
    }

    @Override // o.TaskType
    @Nullable
    public String onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TaskType)) {
            return false;
        }
        TaskType taskType = (TaskType) obj;
        getDataTrimmed getdatatrimmed = this.onExtraCallback;
        if (getdatatrimmed == null) {
            if (taskType.IAuthTabCallback() != null) {
                return false;
            }
        } else if (!getdatatrimmed.equals(taskType.IAuthTabCallback())) {
            return false;
        }
        String str = this.onExtraCallbackWithResult;
        if (str == null) {
            if (taskType.onExtraCallback() != null) {
                return false;
            }
        } else if (!str.equals(taskType.onExtraCallback())) {
            return false;
        }
        String str2 = this.IAuthTabCallback;
        if (str2 == null) {
            if (taskType.onExtraCallbackWithResult() != null) {
                return false;
            }
        } else if (!str2.equals(taskType.onExtraCallbackWithResult())) {
            return false;
        }
        String str3 = this.onWarmupCompleted;
        if (str3 == null) {
            if (taskType.onWarmupCompleted() != null) {
                return false;
            }
        } else if (!str3.equals(taskType.onWarmupCompleted())) {
            return false;
        }
        String str4 = this.asInterface;
        if (str4 == null) {
            if (taskType.asBinder() != null) {
                return false;
            }
        } else if (!str4.equals(taskType.asBinder())) {
            return false;
        }
        String str5 = this.onNavigationEvent;
        if (str5 == null) {
            if (taskType.onNavigationEvent() != null) {
                return false;
            }
        } else if (!str5.equals(taskType.onNavigationEvent())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        getDataTrimmed getdatatrimmed = this.onExtraCallback;
        int iHashCode = getdatatrimmed == null ? 0 : getdatatrimmed.hashCode();
        String str = this.onExtraCallbackWithResult;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.IAuthTabCallback;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.onWarmupCompleted;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.asInterface;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.onNavigationEvent;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ (str5 != null ? str5.hashCode() : 0);
    }
}
