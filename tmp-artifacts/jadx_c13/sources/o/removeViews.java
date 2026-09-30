package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class removeViews implements fby4, uh1<removeViews> {
    private Integer onNavigationEvent;
    private Integer onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public removeViews() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public removeViews(@Nullable Integer num, @Nullable Integer num2) {
        this.onWarmupCompleted = num;
        this.onNavigationEvent = num2;
    }

    public /* synthetic */ removeViews(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }

    @Override // o.fby4
    public void IAuthTabCallback_Parcel(@Nullable Integer num) {
        this.onWarmupCompleted = num;
    }

    @Override // o.fby4
    public Integer onActivityLayout() {
        return this.onWarmupCompleted;
    }

    @Override // o.fby4
    public void IAuthTabCallbackStub(@Nullable Integer num) {
        this.onNavigationEvent = num;
    }

    @Override // o.fby4
    public Integer access100() {
        return this.onNavigationEvent;
    }

    public final jni_YGNodeStyleSetHeightPercentJNI onNavigationEvent() {
        return new jni_YGNodeStyleSetHeightPercentJNI(((Number) jw11.onWarmupCompleted(onActivityLayout(), "year")).intValue(), ((Number) jw11.onWarmupCompleted(access100(), "monthNumber")).intValue());
    }

    @Override // o.uh1
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public removeViews onExtraCallback() {
        return new removeViews(onActivityLayout(), access100());
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof removeViews)) {
            return false;
        }
        removeViews removeviews = (removeViews) obj;
        return Intrinsics.areEqual(onActivityLayout(), removeviews.onActivityLayout()) && Intrinsics.areEqual(access100(), removeviews.access100());
    }

    public int hashCode() {
        Integer numOnActivityLayout = onActivityLayout();
        int iHashCode = numOnActivityLayout != null ? numOnActivityLayout.hashCode() : 0;
        Integer numAccess100 = access100();
        return (iHashCode * 31) + (numAccess100 != null ? numAccess100.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Object objOnActivityLayout = onActivityLayout();
        if (objOnActivityLayout == null) {
            objOnActivityLayout = "??";
        }
        sb.append(objOnActivityLayout);
        sb.append('-');
        Integer numAccess100 = access100();
        sb.append(numAccess100 != null ? numAccess100 : "??");
        return sb.toString();
    }
}
