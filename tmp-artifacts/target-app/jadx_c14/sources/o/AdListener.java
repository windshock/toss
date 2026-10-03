package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AdListener {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final AdListener onWarmupCompleted = new AdListener(620, 0.0f, 0.0f, 0.2f, 0.3f, 0.15f, 28.0f, 1.0f, 0.0f, 0.0f, true, true);
    private final float IAuthTabCallback;
    private final float IAuthTabCallbackDefault;
    private final boolean IAuthTabCallbackStub;
    private final float IAuthTabCallbackStubProxy;
    private final float IAuthTabCallback_Parcel;
    private final float access100;
    private final long asBinder;
    private final float asInterface;
    private final float onExtraCallback;
    private final float onExtraCallbackWithResult;
    private final float onNavigationEvent;
    private final boolean onTransact;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdListener)) {
            return false;
        }
        AdListener adListener = (AdListener) obj;
        return this.asBinder == adListener.asBinder && Float.compare(this.asInterface, adListener.asInterface) == 0 && Float.compare(this.onExtraCallbackWithResult, adListener.onExtraCallbackWithResult) == 0 && Float.compare(this.IAuthTabCallback, adListener.IAuthTabCallback) == 0 && Float.compare(this.onExtraCallback, adListener.onExtraCallback) == 0 && Float.compare(this.onNavigationEvent, adListener.onNavigationEvent) == 0 && Float.compare(this.IAuthTabCallback_Parcel, adListener.IAuthTabCallback_Parcel) == 0 && Float.compare(this.IAuthTabCallbackStubProxy, adListener.IAuthTabCallbackStubProxy) == 0 && Float.compare(this.access100, adListener.access100) == 0 && Float.compare(this.IAuthTabCallbackDefault, adListener.IAuthTabCallbackDefault) == 0 && this.onTransact == adListener.onTransact && this.IAuthTabCallbackStub == adListener.IAuthTabCallbackStub;
    }

    public int hashCode() {
        return (((((((((((((((((((((Long.hashCode(this.asBinder) * 31) + Float.hashCode(this.asInterface)) * 31) + Float.hashCode(this.onExtraCallbackWithResult)) * 31) + Float.hashCode(this.IAuthTabCallback)) * 31) + Float.hashCode(this.onExtraCallback)) * 31) + Float.hashCode(this.onNavigationEvent)) * 31) + Float.hashCode(this.IAuthTabCallback_Parcel)) * 31) + Float.hashCode(this.IAuthTabCallbackStubProxy)) * 31) + Float.hashCode(this.access100)) * 31) + Float.hashCode(this.IAuthTabCallbackDefault)) * 31) + Boolean.hashCode(this.onTransact)) * 31) + Boolean.hashCode(this.IAuthTabCallbackStub);
    }

    public String toString() {
        return "PullUpWebMotionSpec(openDurationMs=" + this.asBinder + ", pageRevealProgress=" + this.asInterface + ", colorFollow=" + this.onExtraCallbackWithResult + ", dismissThreshold=" + this.IAuthTabCallback + ", halfHeightRatio=" + this.onExtraCallback + ", compactHeightRatio=" + this.onNavigationEvent + ", sheetCornerRadiusDp=" + this.IAuthTabCallback_Parcel + ", presentingScale=" + this.IAuthTabCallbackStubProxy + ", presentingTranslationYDp=" + this.access100 + ", presentingCornerRadiusDp=" + this.IAuthTabCallbackDefault + ", pagePullDownDismisses=" + this.onTransact + ", pageScrollExpandsToFullscreen=" + this.IAuthTabCallbackStub + ")";
    }

    public AdListener(long j, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean z, boolean z2) {
        this.asBinder = j;
        this.asInterface = f;
        this.onExtraCallbackWithResult = f2;
        this.IAuthTabCallback = f3;
        this.onExtraCallback = f4;
        this.onNavigationEvent = f5;
        this.IAuthTabCallback_Parcel = f6;
        this.IAuthTabCallbackStubProxy = f7;
        this.access100 = f8;
        this.IAuthTabCallbackDefault = f9;
        this.onTransact = z;
        this.IAuthTabCallbackStub = z2;
    }

    public final long onNavigationEvent() {
        return this.asBinder;
    }

    public final float onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public final float onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public final float onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public final float IAuthTabCallbackStub() {
        return this.IAuthTabCallback_Parcel;
    }

    public final boolean asBinder() {
        return this.onTransact;
    }

    public final boolean IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackStub;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final AdListener onExtraCallback() {
            return AdListener.onWarmupCompleted;
        }
    }
}
