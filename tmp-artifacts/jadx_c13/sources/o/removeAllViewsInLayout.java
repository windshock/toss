package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class removeAllViewsInLayout implements jni_YGNodeStyleSetMinWidthJNI, uh1<removeAllViewsInLayout> {
    private Integer IAuthTabCallback;
    private Integer onExtraCallback;
    private Integer onNavigationEvent;
    private final removeViews onWarmupCompleted;

    public removeAllViewsInLayout() {
        this(null, null, null, null, 15, null);
    }

    @Override // o.fby4
    public void IAuthTabCallbackStub(@Nullable Integer num) {
        this.onWarmupCompleted.IAuthTabCallbackStub(num);
    }

    @Override // o.fby4
    public void IAuthTabCallback_Parcel(@Nullable Integer num) {
        this.onWarmupCompleted.IAuthTabCallback_Parcel(num);
    }

    @Override // o.fby4
    public Integer access100() {
        return this.onWarmupCompleted.access100();
    }

    @Override // o.fby4
    public Integer onActivityLayout() {
        return this.onWarmupCompleted.onActivityLayout();
    }

    public removeAllViewsInLayout(@NotNull removeViews removeviews, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(removeviews, "");
        this.onWarmupCompleted = removeviews;
        this.IAuthTabCallback = num;
        this.onExtraCallback = num2;
        this.onNavigationEvent = num3;
    }

    public /* synthetic */ removeAllViewsInLayout(removeViews removeviews, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new removeViews(null, null, 3, null) : removeviews, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
    }

    @Override // o.jni_YGNodeStyleSetMinWidthJNI
    public void onNavigationEvent(@Nullable Integer num) {
        this.IAuthTabCallback = num;
    }

    @Override // o.jni_YGNodeStyleSetMinWidthJNI
    public Integer onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    @Override // o.jni_YGNodeStyleSetMinWidthJNI
    public Integer IAuthTabCallback() {
        return this.onExtraCallback;
    }

    @Override // o.jni_YGNodeStyleSetMinWidthJNI
    public void onExtraCallbackWithResult(@Nullable Integer num) {
        this.onExtraCallback = num;
    }

    @Override // o.jni_YGNodeStyleSetMinWidthJNI
    public void onExtraCallback(@Nullable Integer num) {
        this.onNavigationEvent = num;
    }

    @Override // o.jni_YGNodeStyleSetMinWidthJNI
    public Integer onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public final jni_YGNodeStyleSetAspectRatioJNI IAuthTabCallbackStub() {
        jni_YGNodeStyleSetAspectRatioJNI jni_ygnodestylesetaspectratiojniIAuthTabCallback;
        int iIntValue;
        int iIntValue2 = ((Number) jw11.onWarmupCompleted(onActivityLayout(), "year")).intValue();
        Integer numOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (numOnExtraCallbackWithResult == null) {
            jni_ygnodestylesetaspectratiojniIAuthTabCallback = new jni_YGNodeStyleSetAspectRatioJNI(iIntValue2, ((Number) jw11.onWarmupCompleted(access100(), "monthNumber")).intValue(), ((Number) jw11.onWarmupCompleted(onWarmupCompleted(), "day")).intValue());
        } else {
            jni_ygnodestylesetaspectratiojniIAuthTabCallback = jni_YGNodeStyleSetDirectionJNI.IAuthTabCallback(new jni_YGNodeStyleSetAspectRatioJNI(iIntValue2, 1, 1), numOnExtraCallbackWithResult.intValue() - 1, jni_YGNodeStyleGetPositionTypeJNI.Companion.onNavigationEvent());
            if (jni_ygnodestylesetaspectratiojniIAuthTabCallback.asInterface() != iIntValue2) {
                throw new jni_YGNodeStyleGetMaxHeightJNI("Can not create a LocalDate from the given input: the day of year is " + numOnExtraCallbackWithResult + ", which is not a valid day of year for the year " + iIntValue2);
            }
            if (access100() != null) {
                int iOnExtraCallback = jni_YGNodeStyleSetFlexGrowJNI.onExtraCallback(jni_ygnodestylesetaspectratiojniIAuthTabCallback.onWarmupCompleted());
                Integer numAccess100 = access100();
                if (numAccess100 == null || iOnExtraCallback != numAccess100.intValue()) {
                    throw new jni_YGNodeStyleGetMaxHeightJNI("Can not create a LocalDate from the given input: the day of year is " + numOnExtraCallbackWithResult + ", which is " + jni_ygnodestylesetaspectratiojniIAuthTabCallback.onWarmupCompleted() + ", but " + access100() + " was specified as the month number");
                }
            }
            if (onWarmupCompleted() != null) {
                int iIAuthTabCallback = jni_ygnodestylesetaspectratiojniIAuthTabCallback.IAuthTabCallback();
                Integer numOnWarmupCompleted = onWarmupCompleted();
                if (numOnWarmupCompleted == null || iIAuthTabCallback != numOnWarmupCompleted.intValue()) {
                    throw new jni_YGNodeStyleGetMaxHeightJNI("Can not create a LocalDate from the given input: the day of year is " + numOnExtraCallbackWithResult + ", which is the day " + jni_ygnodestylesetaspectratiojniIAuthTabCallback.IAuthTabCallback() + " of " + jni_ygnodestylesetaspectratiojniIAuthTabCallback.onWarmupCompleted() + ", but " + onWarmupCompleted() + " was specified as the day of month");
                }
            }
        }
        Integer numIAuthTabCallback = IAuthTabCallback();
        if (numIAuthTabCallback == null || (iIntValue = numIAuthTabCallback.intValue()) == jni_YGNodeStyleSetBorderJNI.onExtraCallback(jni_ygnodestylesetaspectratiojniIAuthTabCallback.onNavigationEvent())) {
            return jni_ygnodestylesetaspectratiojniIAuthTabCallback;
        }
        throw new jni_YGNodeStyleGetMaxHeightJNI("Can not create a LocalDate from the given input: the day of week is " + jni_YGNodeStyleSetBorderJNI.onExtraCallback(iIntValue) + " but the date is " + jni_ygnodestylesetaspectratiojniIAuthTabCallback + ", which is a " + jni_ygnodestylesetaspectratiojniIAuthTabCallback.onNavigationEvent());
    }

    public final void onExtraCallbackWithResult(@NotNull jni_YGNodeStyleSetAspectRatioJNI jni_ygnodestylesetaspectratiojni) {
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetaspectratiojni, "");
        IAuthTabCallback_Parcel(Integer.valueOf(jni_ygnodestylesetaspectratiojni.asInterface()));
        IAuthTabCallbackStub(Integer.valueOf(jni_YGNodeStyleSetFlexGrowJNI.onExtraCallback(jni_ygnodestylesetaspectratiojni.onWarmupCompleted())));
        onNavigationEvent(Integer.valueOf(jni_ygnodestylesetaspectratiojni.IAuthTabCallback()));
        onExtraCallbackWithResult(Integer.valueOf(jni_YGNodeStyleSetBorderJNI.onExtraCallback(jni_ygnodestylesetaspectratiojni.onNavigationEvent())));
        onExtraCallback(Integer.valueOf(jni_ygnodestylesetaspectratiojni.onExtraCallback()));
    }

    @Override // o.uh1
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public removeAllViewsInLayout onExtraCallback() {
        return new removeAllViewsInLayout(this.onWarmupCompleted.onExtraCallback(), onWarmupCompleted(), IAuthTabCallback(), onExtraCallbackWithResult());
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof removeAllViewsInLayout)) {
            return false;
        }
        removeAllViewsInLayout removeallviewsinlayout = (removeAllViewsInLayout) obj;
        return Intrinsics.areEqual(this.onWarmupCompleted, removeallviewsinlayout.onWarmupCompleted) && Intrinsics.areEqual(onWarmupCompleted(), removeallviewsinlayout.onWarmupCompleted()) && Intrinsics.areEqual(IAuthTabCallback(), removeallviewsinlayout.IAuthTabCallback()) && Intrinsics.areEqual(onExtraCallbackWithResult(), removeallviewsinlayout.onExtraCallbackWithResult());
    }

    public int hashCode() {
        int iHashCode = this.onWarmupCompleted.hashCode();
        Integer numOnWarmupCompleted = onWarmupCompleted();
        int iHashCode2 = numOnWarmupCompleted != null ? numOnWarmupCompleted.hashCode() : 0;
        Integer numIAuthTabCallback = IAuthTabCallback();
        int iHashCode3 = numIAuthTabCallback != null ? numIAuthTabCallback.hashCode() : 0;
        Integer numOnExtraCallbackWithResult = onExtraCallbackWithResult();
        return (iHashCode * 29791) + (iHashCode2 * 961) + (iHashCode3 * 31) + (numOnExtraCallbackWithResult != null ? numOnExtraCallbackWithResult.hashCode() : 0);
    }

    public String toString() {
        if (onExtraCallbackWithResult() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.onWarmupCompleted);
            sb.append('-');
            Object objOnWarmupCompleted = onWarmupCompleted();
            if (objOnWarmupCompleted == null) {
                objOnWarmupCompleted = "??";
            }
            sb.append(objOnWarmupCompleted);
            sb.append(" (day of week is ");
            Integer numIAuthTabCallback = IAuthTabCallback();
            sb.append(numIAuthTabCallback != null ? numIAuthTabCallback : "??");
            sb.append(')');
            return sb.toString();
        }
        if (onWarmupCompleted() == null && access100() == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            Object objOnActivityLayout = this.onWarmupCompleted.onActivityLayout();
            if (objOnActivityLayout == null) {
                objOnActivityLayout = "??";
            }
            sb2.append(objOnActivityLayout);
            sb2.append(")-");
            sb2.append(onExtraCallbackWithResult());
            sb2.append(" (day of week is ");
            Integer numIAuthTabCallback2 = IAuthTabCallback();
            sb2.append(numIAuthTabCallback2 != null ? numIAuthTabCallback2 : "??");
            sb2.append(')');
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.onWarmupCompleted);
        sb3.append('-');
        Object objOnWarmupCompleted2 = onWarmupCompleted();
        if (objOnWarmupCompleted2 == null) {
            objOnWarmupCompleted2 = "??";
        }
        sb3.append(objOnWarmupCompleted2);
        sb3.append(" (day of week is ");
        Integer numIAuthTabCallback3 = IAuthTabCallback();
        sb3.append(numIAuthTabCallback3 != null ? numIAuthTabCallback3 : "??");
        sb3.append(", day of year is ");
        sb3.append(onExtraCallbackWithResult());
        sb3.append(')');
        return sb3.toString();
    }
}
