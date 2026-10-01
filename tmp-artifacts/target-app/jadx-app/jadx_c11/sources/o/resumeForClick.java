package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import im.toss.deeplink.DeepLinkResult;
import kotlin.Deprecated;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.SessionTrackerb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class resumeForClick implements SessionTrackerb {
    private static int IAuthTabCallback_Parcel = 1;
    private static int ICustomTabsCallback = 1;
    private static int access100;
    private static int getInterfaceDescriptor;
    private final /* synthetic */ SessionTrackerb IAuthTabCallbackStubProxy;
    public static final resumeForClick asBinder = new resumeForClick();
    public static final int IAuthTabCallbackDefault = 8;

    static {
        int i = access100 + 95;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    @Override // o.SessionTrackerb
    public void IAuthTabCallback(@NotNull Activity activity, @NotNull DeepLinkResult deepLinkResult, @NotNull SessionTrackerb.onExtraCallbackWithResult onextracallbackwithresult, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(deepLinkResult, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (i3 != 0) {
            this.IAuthTabCallbackStubProxy.IAuthTabCallback(activity, deepLinkResult, onextracallbackwithresult, str, str2, str3);
        } else {
            this.IAuthTabCallbackStubProxy.IAuthTabCallback(activity, deepLinkResult, onextracallbackwithresult, str, str2, str3);
            int i4 = 37 / 0;
        }
    }

    @Override // o.SessionTrackerb
    public String IAuthTabCallbackDefault(@Nullable String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 119;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackDefault = this.IAuthTabCallbackStubProxy.IAuthTabCallbackDefault(str);
        int i4 = ICustomTabsCallback + 87;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return strIAuthTabCallbackDefault;
    }

    @Override // o.SessionTrackerb
    @Deprecated
    public Intent onExtraCallback(@NotNull Context context, @NotNull String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 != 0) {
            this.IAuthTabCallbackStubProxy.onExtraCallback(context, str);
            throw null;
        }
        Intent intentOnExtraCallback = this.IAuthTabCallbackStubProxy.onExtraCallback(context, str);
        int i4 = ICustomTabsCallback + 125;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return intentOnExtraCallback;
    }

    public boolean onExtraCallback(@NotNull String str) {
        boolean zOnExtraCallback;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 3;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 != 0) {
            zOnExtraCallback = this.IAuthTabCallbackStubProxy.onExtraCallback(str);
            int i4 = 71 / 0;
        } else {
            zOnExtraCallback = this.IAuthTabCallbackStubProxy.onExtraCallback(str);
        }
        int i5 = getInterfaceDescriptor + 37;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return zOnExtraCallback;
    }

    @Override // o.SessionTrackerb
    public Intent onExtraCallbackWithResult(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 51;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (i3 != 0) {
            this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(context);
            throw null;
        }
        Intent intentOnExtraCallbackWithResult = this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(context);
        int i4 = getInterfaceDescriptor + 73;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return intentOnExtraCallbackWithResult;
    }

    @Override // o.SessionTrackerb
    public Class<?> onExtraCallbackWithResult(@Nullable String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 101;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Class<?> clsOnExtraCallbackWithResult = this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(str);
        int i4 = getInterfaceDescriptor + 109;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return clsOnExtraCallbackWithResult;
    }

    @Override // o.SessionTrackerb
    public void onExtraCallbackWithResult(@NotNull Activity activity, @Nullable String str, int i, @Nullable Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 109;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        if (i4 != 0) {
            this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(activity, str, i, bundle);
            int i5 = 29 / 0;
        } else {
            this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(activity, str, i, bundle);
        }
        int i6 = ICustomTabsCallback + 97;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 88 / 0;
        }
    }

    @Override // o.SessionTrackerb
    public void onExtraCallbackWithResult(@NotNull String str, @NotNull SessionTrackerb.onExtraCallbackWithResult onextracallbackwithresult, @Nullable String str2, @Nullable String str3) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(str, onextracallbackwithresult, str2, str3);
        int i4 = ICustomTabsCallback + 37;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.SessionTrackerb
    public boolean onExtraCallbackWithResult(@NotNull Activity activity, @Nullable String str, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 79;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        boolean zOnExtraCallbackWithResult = this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(activity, str, bundle);
        int i4 = getInterfaceDescriptor + 31;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    @Override // o.SessionTrackerb
    public boolean onExtraCallbackWithResult(@Nullable Activity activity, @Nullable String str, boolean z, @Nullable Function1<? super Uri, Boolean> function1, @Nullable Bundle bundle, boolean z2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 83;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(activity, str, z, function1, bundle, z2);
        int i4 = getInterfaceDescriptor + 77;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    @Override // o.SessionTrackerb
    public boolean onExtraCallbackWithResult(@Nullable Context context, @Nullable String str, boolean z, @Nullable Function1<? super Uri, Boolean> function1, @Nullable Bundle bundle, boolean z2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 81;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(context, str, z, function1, bundle, z2);
            throw null;
        }
        boolean zOnExtraCallbackWithResult = this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(context, str, z, function1, bundle, z2);
        int i3 = ICustomTabsCallback + 27;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallbackWithResult;
    }

    @Override // o.SessionTrackerb
    public boolean onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 13;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.IAuthTabCallbackStubProxy;
        if (i3 != 0) {
            return sessionTrackerb.onNavigationEvent(str);
        }
        sessionTrackerb.onNavigationEvent(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.SessionTrackerb
    @Deprecated
    public Intent onWarmupCompleted(@NotNull Context context, @NotNull Uri uri) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 81;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intent intentOnWarmupCompleted = this.IAuthTabCallbackStubProxy.onWarmupCompleted(context, uri);
        int i4 = ICustomTabsCallback + 19;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return intentOnWarmupCompleted;
    }

    @Override // o.SessionTrackerb
    public DeepLinkResult onWarmupCompleted(@Nullable Activity activity, @Nullable String str, boolean z, @Nullable Function1<? super Uri, Boolean> function1, @Nullable Bundle bundle, boolean z2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 83;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        DeepLinkResult deepLinkResultOnWarmupCompleted = this.IAuthTabCallbackStubProxy.onWarmupCompleted(activity, str, z, function1, bundle, z2);
        int i4 = ICustomTabsCallback + 73;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return deepLinkResultOnWarmupCompleted;
    }

    @Override // o.SessionTrackerb
    public String onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.IAuthTabCallbackStubProxy;
        if (i3 == 0) {
            return sessionTrackerb.onWarmupCompleted();
        }
        sessionTrackerb.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.SessionTrackerb
    public String onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strOnWarmupCompleted = this.IAuthTabCallbackStubProxy.onWarmupCompleted(str);
        int i4 = getInterfaceDescriptor + 97;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return strOnWarmupCompleted;
    }

    @Override // o.SessionTrackerb
    public void onWarmupCompleted(@NotNull Context context, @Nullable String str, @NotNull IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallback_Parcel, "");
        this.IAuthTabCallbackStubProxy.onWarmupCompleted(context, str, iEngagementSignalsCallback_Parcel, bundle);
        int i4 = ICustomTabsCallback + 97;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.SessionTrackerb
    public boolean onWarmupCompleted(@NotNull Activity activity, @NotNull Uri uri) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(uri, "");
        if (i3 != 0) {
            return this.IAuthTabCallbackStubProxy.onWarmupCompleted(activity, uri);
        }
        this.IAuthTabCallbackStubProxy.onWarmupCompleted(activity, uri);
        throw null;
    }

    @Override // o.SessionTrackerb
    public boolean onWarmupCompleted(@NotNull Uri uri) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 21;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(uri, "");
        if (i3 != 0) {
            this.IAuthTabCallbackStubProxy.onWarmupCompleted(uri);
            obj.hashCode();
            throw null;
        }
        boolean zOnWarmupCompleted = this.IAuthTabCallbackStubProxy.onWarmupCompleted(uri);
        int i4 = ICustomTabsCallback + 67;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    private resumeForClick() {
        Response response = Response.onNavigationEvent;
        this.IAuthTabCallbackStubProxy = ((SessionTrackerb.onExtraCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), SessionTrackerb.onExtraCallback.class)).getSmallIconId();
    }
}
