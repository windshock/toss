package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleSetPositionAutoJNI implements sya5, jni_YGNodeStyleSetPositionTypeJNI, uh1<jni_YGNodeStyleSetPositionAutoJNI> {
    private final removeAllViewsInLayout IAuthTabCallback;
    private final bba onExtraCallback;
    private String onNavigationEvent;
    private final hpv onWarmupCompleted;

    public jni_YGNodeStyleSetPositionAutoJNI() {
        this(null, null, null, null, 15, null);
    }

    @Override // o.jni_YGNodeStyleSetMinWidthJNI
    public Integer IAuthTabCallback() {
        return this.IAuthTabCallback.IAuthTabCallback();
    }

    @Override // o.yi
    public void IAuthTabCallback(@Nullable Integer num) {
        this.onWarmupCompleted.IAuthTabCallback(num);
    }

    @Override // o.yi
    public void IAuthTabCallback(@Nullable invalidateSelf invalidateself) {
        this.onWarmupCompleted.IAuthTabCallback(invalidateself);
    }

    @Override // o.yi
    public jni_YGNodeStyleSetMinHeightPercentJNI IAuthTabCallbackDefault() {
        return this.onWarmupCompleted.IAuthTabCallbackDefault();
    }

    @Override // o.sya5
    public void IAuthTabCallbackDefault(@Nullable Integer num) {
        this.onExtraCallback.IAuthTabCallbackDefault(num);
    }

    @Override // o.yi
    public Integer IAuthTabCallbackStub() {
        return this.onWarmupCompleted.IAuthTabCallbackStub();
    }

    @Override // o.fby4
    public void IAuthTabCallbackStub(@Nullable Integer num) {
        this.IAuthTabCallback.IAuthTabCallbackStub(num);
    }

    @Override // o.yi
    public Integer IAuthTabCallbackStubProxy() {
        return this.onWarmupCompleted.IAuthTabCallbackStubProxy();
    }

    @Override // o.sya5
    public void IAuthTabCallbackStubProxy(@Nullable Integer num) {
        this.onExtraCallback.IAuthTabCallbackStubProxy(num);
    }

    @Override // o.yi
    public Integer IAuthTabCallback_Parcel() {
        return this.onWarmupCompleted.IAuthTabCallback_Parcel();
    }

    @Override // o.fby4
    public void IAuthTabCallback_Parcel(@Nullable Integer num) {
        this.IAuthTabCallback.IAuthTabCallback_Parcel(num);
    }

    @Override // o.sya5
    public Boolean ICustomTabsCallback() {
        return this.onExtraCallback.ICustomTabsCallback();
    }

    @Override // o.sya5
    public Integer access000() {
        return this.onExtraCallback.access000();
    }

    @Override // o.fby4
    public Integer access100() {
        return this.IAuthTabCallback.access100();
    }

    @Override // o.yi
    public invalidateSelf asBinder() {
        return this.onWarmupCompleted.asBinder();
    }

    @Override // o.sya5
    public void asBinder(@Nullable Integer num) {
        this.onExtraCallback.asBinder(num);
    }

    @Override // o.yi
    public void asInterface(@Nullable Integer num) {
        this.onWarmupCompleted.asInterface(num);
    }

    @Override // o.yi
    public Integer extraCallbackWithResult() {
        return this.onWarmupCompleted.extraCallbackWithResult();
    }

    @Override // o.yi
    public void getInterfaceDescriptor(@Nullable Integer num) {
        this.onWarmupCompleted.getInterfaceDescriptor(num);
    }

    @Override // o.fby4
    public Integer onActivityLayout() {
        return this.IAuthTabCallback.onActivityLayout();
    }

    @Override // o.jni_YGNodeStyleSetMinWidthJNI
    public void onExtraCallback(@Nullable Integer num) {
        this.IAuthTabCallback.onExtraCallback(num);
    }

    @Override // o.yi
    public void onExtraCallback(@Nullable jni_YGNodeStyleSetMinHeightPercentJNI jni_ygnodestylesetminheightpercentjni) {
        this.onWarmupCompleted.onExtraCallback(jni_ygnodestylesetminheightpercentjni);
    }

    @Override // o.jni_YGNodeStyleSetMinWidthJNI
    public Integer onExtraCallbackWithResult() {
        return this.IAuthTabCallback.onExtraCallbackWithResult();
    }

    @Override // o.sya5
    public void onExtraCallbackWithResult(@Nullable Boolean bool) {
        this.onExtraCallback.onExtraCallbackWithResult(bool);
    }

    @Override // o.jni_YGNodeStyleSetMinWidthJNI
    public void onExtraCallbackWithResult(@Nullable Integer num) {
        this.IAuthTabCallback.onExtraCallbackWithResult(num);
    }

    @Override // o.jni_YGNodeStyleSetMinWidthJNI
    public void onNavigationEvent(@Nullable Integer num) {
        this.IAuthTabCallback.onNavigationEvent(num);
    }

    @Override // o.yi
    public Integer onTransact() {
        return this.onWarmupCompleted.onTransact();
    }

    @Override // o.yi
    public void onTransact(@Nullable Integer num) {
        this.onWarmupCompleted.onTransact(num);
    }

    @Override // o.jni_YGNodeStyleSetMinWidthJNI
    public Integer onWarmupCompleted() {
        return this.IAuthTabCallback.onWarmupCompleted();
    }

    @Override // o.yi
    public void onWarmupCompleted(@Nullable Integer num) {
        this.onWarmupCompleted.onWarmupCompleted(num);
    }

    @Override // o.sya5
    public Integer readTypedObject() {
        return this.onExtraCallback.readTypedObject();
    }

    @Override // o.sya5
    public Integer writeTypedObject() {
        return this.onExtraCallback.writeTypedObject();
    }

    public jni_YGNodeStyleSetPositionAutoJNI(@NotNull removeAllViewsInLayout removeallviewsinlayout, @NotNull hpv hpvVar, @NotNull bba bbaVar, @Nullable String str) {
        Intrinsics.checkNotNullParameter(removeallviewsinlayout, "");
        Intrinsics.checkNotNullParameter(hpvVar, "");
        Intrinsics.checkNotNullParameter(bbaVar, "");
        this.IAuthTabCallback = removeallviewsinlayout;
        this.onWarmupCompleted = hpvVar;
        this.onExtraCallback = bbaVar;
        this.onNavigationEvent = str;
    }

    public /* synthetic */ jni_YGNodeStyleSetPositionAutoJNI(removeAllViewsInLayout removeallviewsinlayout, hpv hpvVar, bba bbaVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new removeAllViewsInLayout(null, null, null, null, 15, null) : removeallviewsinlayout, (i & 2) != 0 ? new hpv(null, null, null, null, null, null, 63, null) : hpvVar, (i & 4) != 0 ? new bba(null, null, null, null, 15, null) : bbaVar, (i & 8) != 0 ? null : str);
    }

    public final removeAllViewsInLayout asInterface() {
        return this.IAuthTabCallback;
    }

    public final hpv extraCallback() {
        return this.onWarmupCompleted;
    }

    public final bba getInterfaceDescriptor() {
        return this.onExtraCallback;
    }

    public final void IAuthTabCallback(@Nullable String str) {
        this.onNavigationEvent = str;
    }

    public final String onMessageChannelReady() {
        return this.onNavigationEvent;
    }

    @Override // o.uh1
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public jni_YGNodeStyleSetPositionAutoJNI onExtraCallback() {
        return new jni_YGNodeStyleSetPositionAutoJNI(this.IAuthTabCallback.onExtraCallback(), this.onWarmupCompleted.onExtraCallback(), this.onExtraCallback.onExtraCallback(), this.onNavigationEvent);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof jni_YGNodeStyleSetPositionAutoJNI)) {
            return false;
        }
        jni_YGNodeStyleSetPositionAutoJNI jni_ygnodestylesetpositionautojni = (jni_YGNodeStyleSetPositionAutoJNI) obj;
        return Intrinsics.areEqual(jni_ygnodestylesetpositionautojni.IAuthTabCallback, this.IAuthTabCallback) && Intrinsics.areEqual(jni_ygnodestylesetpositionautojni.onWarmupCompleted, this.onWarmupCompleted) && Intrinsics.areEqual(jni_ygnodestylesetpositionautojni.onExtraCallback, this.onExtraCallback) && Intrinsics.areEqual(jni_ygnodestylesetpositionautojni.onNavigationEvent, this.onNavigationEvent);
    }

    public int hashCode() {
        int iHashCode = this.IAuthTabCallback.hashCode();
        int iHashCode2 = this.onWarmupCompleted.hashCode();
        int iHashCode3 = this.onExtraCallback.hashCode();
        String str = this.onNavigationEvent;
        return ((iHashCode ^ iHashCode2) ^ iHashCode3) ^ (str != null ? str.hashCode() : 0);
    }
}
