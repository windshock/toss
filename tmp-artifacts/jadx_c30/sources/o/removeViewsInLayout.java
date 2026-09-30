package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class removeViewsInLayout implements jni_YGNodeStyleSetPositionTypeJNI, uh1<removeViewsInLayout> {
    private final removeAllViewsInLayout onExtraCallback;
    private final hpv onExtraCallbackWithResult;

    /* JADX WARN: Illegal instructions before constructor call */
    public removeViewsInLayout() {
        removeAllViewsInLayout removeallviewsinlayout = null;
        this(removeallviewsinlayout, removeallviewsinlayout, 3, removeallviewsinlayout);
    }

    public Integer IAuthTabCallback() {
        return this.onExtraCallback.IAuthTabCallback();
    }

    public void IAuthTabCallback(@Nullable Integer num) {
        this.onExtraCallbackWithResult.IAuthTabCallback(num);
    }

    public void IAuthTabCallback(@Nullable invalidateSelf invalidateself) {
        this.onExtraCallbackWithResult.IAuthTabCallback(invalidateself);
    }

    public jni_YGNodeStyleSetMinHeightPercentJNI IAuthTabCallbackDefault() {
        return this.onExtraCallbackWithResult.IAuthTabCallbackDefault();
    }

    public Integer IAuthTabCallbackStub() {
        return this.onExtraCallbackWithResult.IAuthTabCallbackStub();
    }

    public void IAuthTabCallbackStub(@Nullable Integer num) {
        this.onExtraCallback.IAuthTabCallbackStub(num);
    }

    public Integer IAuthTabCallbackStubProxy() {
        return this.onExtraCallbackWithResult.IAuthTabCallbackStubProxy();
    }

    public Integer IAuthTabCallback_Parcel() {
        return this.onExtraCallbackWithResult.IAuthTabCallback_Parcel();
    }

    public void IAuthTabCallback_Parcel(@Nullable Integer num) {
        this.onExtraCallback.IAuthTabCallback_Parcel(num);
    }

    public Integer access100() {
        return this.onExtraCallback.access100();
    }

    public invalidateSelf asBinder() {
        return this.onExtraCallbackWithResult.asBinder();
    }

    public void asInterface(@Nullable Integer num) {
        this.onExtraCallbackWithResult.asInterface(num);
    }

    public Integer extraCallbackWithResult() {
        return this.onExtraCallbackWithResult.extraCallbackWithResult();
    }

    public void getInterfaceDescriptor(@Nullable Integer num) {
        this.onExtraCallbackWithResult.getInterfaceDescriptor(num);
    }

    public Integer onActivityLayout() {
        return this.onExtraCallback.onActivityLayout();
    }

    public void onExtraCallback(@Nullable Integer num) {
        this.onExtraCallback.onExtraCallback(num);
    }

    public void onExtraCallback(@Nullable jni_YGNodeStyleSetMinHeightPercentJNI jni_ygnodestylesetminheightpercentjni) {
        this.onExtraCallbackWithResult.onExtraCallback(jni_ygnodestylesetminheightpercentjni);
    }

    public Integer onExtraCallbackWithResult() {
        return this.onExtraCallback.onExtraCallbackWithResult();
    }

    public void onExtraCallbackWithResult(@Nullable Integer num) {
        this.onExtraCallback.onExtraCallbackWithResult(num);
    }

    public void onNavigationEvent(@Nullable Integer num) {
        this.onExtraCallback.onNavigationEvent(num);
    }

    public Integer onTransact() {
        return this.onExtraCallbackWithResult.onTransact();
    }

    public void onTransact(@Nullable Integer num) {
        this.onExtraCallbackWithResult.onTransact(num);
    }

    public Integer onWarmupCompleted() {
        return this.onExtraCallback.onWarmupCompleted();
    }

    public void onWarmupCompleted(@Nullable Integer num) {
        this.onExtraCallbackWithResult.onWarmupCompleted(num);
    }

    public removeViewsInLayout(@NotNull removeAllViewsInLayout removeallviewsinlayout, @NotNull hpv hpvVar) {
        Intrinsics.checkNotNullParameter(removeallviewsinlayout, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(hpvVar, BuildConfig.FLAVOR);
        this.onExtraCallback = removeallviewsinlayout;
        this.onExtraCallbackWithResult = hpvVar;
    }

    public /* synthetic */ removeViewsInLayout(removeAllViewsInLayout removeallviewsinlayout, hpv hpvVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new removeAllViewsInLayout((removeViews) null, (Integer) null, (Integer) null, (Integer) null, 15, (DefaultConstructorMarker) null) : removeallviewsinlayout, (i & 2) != 0 ? new hpv((Integer) null, (Integer) null, (jni_YGNodeStyleSetMinHeightPercentJNI) null, (Integer) null, (Integer) null, (Integer) null, 63, (DefaultConstructorMarker) null) : hpvVar);
    }

    public final jni_YGNodeStyleSetFlexBasisJNI asInterface() {
        return new jni_YGNodeStyleSetFlexBasisJNI(this.onExtraCallback.IAuthTabCallbackStub(), this.onExtraCallbackWithResult.IAuthTabCallback());
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public removeViewsInLayout onExtraCallback() {
        return new removeViewsInLayout(this.onExtraCallback.onNavigationEvent(), this.onExtraCallbackWithResult.onExtraCallbackWithResult());
    }
}
