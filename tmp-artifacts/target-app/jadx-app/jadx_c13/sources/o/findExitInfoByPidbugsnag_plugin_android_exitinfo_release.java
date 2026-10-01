package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import im.toss.uikit.widget.underlay.PulseRingView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class findExitInfoByPidbugsnag_plugin_android_exitinfo_release {
    private static int access000 = 1;
    private static int access100;
    private final ViewGroup IAuthTabCallback;
    private final ViewGroup IAuthTabCallbackDefault;
    private final FrameLayout IAuthTabCallbackStub;
    private final PulseRingView asBinder;
    private final ViewGroup asInterface;
    private final View onExtraCallback;
    private final View onExtraCallbackWithResult;
    private final View onNavigationEvent;
    private final View onTransact;
    private final View onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof findExitInfoByPidbugsnag_plugin_android_exitinfo_release)) {
            int i2 = access100 + 93;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release = (findExitInfoByPidbugsnag_plugin_android_exitinfo_release) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, findexitinfobypidbugsnag_plugin_android_exitinfo_release.IAuthTabCallbackDefault)) {
            int i4 = access000 + 55;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if ((!Intrinsics.areEqual(this.IAuthTabCallback, findexitinfobypidbugsnag_plugin_android_exitinfo_release.IAuthTabCallback)) || !Intrinsics.areEqual(this.onNavigationEvent, findexitinfobypidbugsnag_plugin_android_exitinfo_release.onNavigationEvent) || !Intrinsics.areEqual(this.asInterface, findexitinfobypidbugsnag_plugin_android_exitinfo_release.asInterface) || !Intrinsics.areEqual(this.onTransact, findexitinfobypidbugsnag_plugin_android_exitinfo_release.onTransact)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, findexitinfobypidbugsnag_plugin_android_exitinfo_release.onExtraCallback)) {
            int i6 = access100 + 23;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, findexitinfobypidbugsnag_plugin_android_exitinfo_release.onWarmupCompleted)) {
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, findexitinfobypidbugsnag_plugin_android_exitinfo_release.onExtraCallbackWithResult) && Intrinsics.areEqual(this.asBinder, findexitinfobypidbugsnag_plugin_android_exitinfo_release.asBinder) && Intrinsics.areEqual(this.IAuthTabCallbackStub, findexitinfobypidbugsnag_plugin_android_exitinfo_release.IAuthTabCallbackStub);
        }
        int i8 = access000 + 35;
        int i9 = i8 % 128;
        access100 = i9;
        int i10 = i8 % 2;
        int i11 = i9 + 103;
        access000 = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = access000 + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.IAuthTabCallbackDefault.hashCode();
        int iHashCode3 = this.IAuthTabCallback.hashCode();
        int iHashCode4 = this.onNavigationEvent.hashCode();
        int iHashCode5 = this.asInterface.hashCode();
        int iHashCode6 = this.onTransact.hashCode();
        int iHashCode7 = this.onExtraCallback.hashCode();
        View view = this.onWarmupCompleted;
        if (view == null) {
            int i4 = access100;
            int i5 = i4 + 105;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 45;
            access000 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode = 0;
        } else {
            iHashCode = view.hashCode();
        }
        View view2 = this.onExtraCallbackWithResult;
        return (((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + (view2 != null ? view2.hashCode() : 0)) * 31) + this.asBinder.hashCode()) * 31) + this.IAuthTabCallbackStub.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UnderlayDecorViews(stack=" + this.IAuthTabCallbackDefault + ", bodyHost=" + this.IAuthTabCallback + ", bottomExtension=" + this.onNavigationEvent + ", root=" + this.asInterface + ", handleOverlay=" + this.onTransact + ", handleBar=" + this.onExtraCallback + ", handleBarConnector=" + this.onWarmupCompleted + ", handleBarIndicator=" + this.onExtraCallbackWithResult + ", pulseContainer=" + this.asBinder + ", messageHost=" + this.IAuthTabCallbackStub + ")";
        int i2 = access100 + 67;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public findExitInfoByPidbugsnag_plugin_android_exitinfo_release(@NotNull ViewGroup viewGroup, @NotNull ViewGroup viewGroup2, @NotNull View view, @NotNull ViewGroup viewGroup3, @NotNull View view2, @NotNull View view3, @Nullable View view4, @Nullable View view5, @NotNull PulseRingView pulseRingView, @NotNull FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(viewGroup2, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewGroup3, "");
        Intrinsics.checkNotNullParameter(view2, "");
        Intrinsics.checkNotNullParameter(view3, "");
        Intrinsics.checkNotNullParameter(pulseRingView, "");
        Intrinsics.checkNotNullParameter(frameLayout, "");
        this.IAuthTabCallbackDefault = viewGroup;
        this.IAuthTabCallback = viewGroup2;
        this.onNavigationEvent = view;
        this.asInterface = viewGroup3;
        this.onTransact = view2;
        this.onExtraCallback = view3;
        this.onWarmupCompleted = view4;
        this.onExtraCallbackWithResult = view5;
        this.asBinder = pulseRingView;
        this.IAuthTabCallbackStub = frameLayout;
    }

    public final ViewGroup onTransact() {
        int i = 2 % 2;
        int i2 = access100 + 3;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        ViewGroup viewGroup = this.IAuthTabCallbackDefault;
        int i5 = i3 + 7;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
        return viewGroup;
    }

    public final ViewGroup onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000 + 35;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        ViewGroup viewGroup = this.IAuthTabCallback;
        int i5 = i3 + 63;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return viewGroup;
    }

    public final View onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 37;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        View view = this.onNavigationEvent;
        int i5 = i2 + 67;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return view;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ViewGroup asBinder() {
        int i = 2 % 2;
        int i2 = access000 + 73;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup viewGroup = this.asInterface;
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        return viewGroup;
    }

    public final View asInterface() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 69;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        View view = this.onTransact;
        int i5 = i2 + 7;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return view;
        }
        throw null;
    }

    public final View onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 115;
        int i3 = i2 % 128;
        access000 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        View view = this.onExtraCallback;
        int i4 = i3 + 19;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }

    public final View IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 25;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        View view = this.onWarmupCompleted;
        int i5 = i2 + 91;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    public final View onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100 + 63;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public final PulseRingView IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access000 + 47;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        PulseRingView pulseRingView = this.asBinder;
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return pulseRingView;
    }
}
