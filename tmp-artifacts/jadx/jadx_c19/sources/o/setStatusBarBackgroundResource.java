package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.appevents.IAuthTabCallbackStubProxy;
import com.facebook.appevents.asInterface;
import com.facebook.internal.ICustomTabsCallbackDefault;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setStatusBarBackgroundResource {
    public static final setStatusBarBackgroundResource onWarmupCompleted = new setStatusBarBackgroundResource();
    private static final String IAuthTabCallback = setStatusBarBackgroundResource.class.getCanonicalName();
    private static final long[] onExtraCallback = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private setStatusBarBackgroundResource() {
    }

    @JvmStatic
    public static final void onExtraCallbackWithResult(@NotNull String str, @Nullable blocksInteractionBelow blocksinteractionbelow, @Nullable String str2, @NotNull Context context) {
        String string;
        if (convertResponseToCredentialManager.onExtraCallback(setStatusBarBackgroundResource.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(context, "");
            if (blocksinteractionbelow == null || (string = blocksinteractionbelow.toString()) == null) {
                string = "Unclassified";
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", string);
            bundle.putString("fb_mobile_pckg_fp", onWarmupCompleted.onExtraCallback(context));
            bundle.putString("fb_mobile_app_cert_hash", CredentialProviderBeginSignInControllerCompanion.onWarmupCompleted(context));
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = new IAuthTabCallbackStubProxy(str, str2, (acquireTempRect) null);
            iAuthTabCallbackStubProxy.onExtraCallback("fb_mobile_activate_app", bundle);
            if (IAuthTabCallbackStubProxy.Companion.onWarmupCompleted() != asInterface.onNavigationEvent.EXPLICIT_ONLY) {
                iAuthTabCallbackStubProxy.onExtraCallbackWithResult();
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, setStatusBarBackgroundResource.class);
        }
    }

    @JvmStatic
    public static final void onExtraCallbackWithResult(@NotNull String str, @Nullable setWindowInsets setwindowinsets, @Nullable String str2) {
        long jLongValue;
        String string;
        if (convertResponseToCredentialManager.onExtraCallback(setStatusBarBackgroundResource.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(str, "");
            if (setwindowinsets == null) {
                return;
            }
            Long lOnNavigationEvent = setwindowinsets.onNavigationEvent();
            if (lOnNavigationEvent != null) {
                jLongValue = lOnNavigationEvent.longValue();
            } else {
                Long lOnExtraCallbackWithResult = setwindowinsets.onExtraCallbackWithResult();
                jLongValue = 0 - (lOnExtraCallbackWithResult != null ? lOnExtraCallbackWithResult.longValue() : 0L);
            }
            if (jLongValue < 0) {
                onWarmupCompleted.onNavigationEvent();
                jLongValue = 0;
            }
            long jIAuthTabCallback = setwindowinsets.IAuthTabCallback();
            if (jIAuthTabCallback < 0) {
                onWarmupCompleted.onNavigationEvent();
                jIAuthTabCallback = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", setwindowinsets.onExtraCallback());
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str3 = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(onNavigationEvent(jLongValue))}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            bundle.putString("fb_mobile_time_between_sessions", str3);
            blocksInteractionBelow blocksinteractionbelowIAuthTabCallbackStub = setwindowinsets.IAuthTabCallbackStub();
            if (blocksinteractionbelowIAuthTabCallbackStub == null || (string = blocksinteractionbelowIAuthTabCallbackStub.toString()) == null) {
                string = "Unclassified";
            }
            bundle.putString("fb_mobile_launch_source", string);
            Long lOnExtraCallbackWithResult2 = setwindowinsets.onExtraCallbackWithResult();
            bundle.putLong("_logTime", (lOnExtraCallbackWithResult2 != null ? lOnExtraCallbackWithResult2.longValue() : 0L) / 1000);
            new IAuthTabCallbackStubProxy(str, str2, (acquireTempRect) null).onNavigationEvent("fb_mobile_deactivate_app", jIAuthTabCallback / 1000.0d, bundle);
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, setStatusBarBackgroundResource.class);
        }
    }

    private final void onNavigationEvent() {
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return;
        }
        try {
            ICustomTabsCallbackDefault.onExtraCallbackWithResult onextracallbackwithresult = ICustomTabsCallbackDefault.Companion;
            addPreDrawListener addpredrawlistener = addPreDrawListener.APP_EVENTS;
            String str = IAuthTabCallback;
            Intrinsics.checkNotNull(str);
            onextracallbackwithresult.onExtraCallback(addpredrawlistener, str, "Clock skew detected");
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
        }
    }

    @JvmStatic
    public static final int onNavigationEvent(long j) {
        if (convertResponseToCredentialManager.onExtraCallback(setStatusBarBackgroundResource.class)) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            try {
                long[] jArr = onExtraCallback;
                if (i2 >= jArr.length || jArr[i2] >= j) {
                    break;
                }
                i2++;
            } catch (Throwable th) {
                convertResponseToCredentialManager.onExtraCallbackWithResult(th, setStatusBarBackgroundResource.class);
                return 0;
            }
        }
        return i2;
    }

    public final String onExtraCallback(@NotNull Context context) {
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "");
            try {
                PackageManager packageManager = context.getPackageManager();
                String str = "PCKGCHKSUM;" + packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                String string = sharedPreferences.getString(str, null);
                if (string != null && string.length() == 32) {
                    return string;
                }
                String strOnExtraCallbackWithResult = CoordinatorLayoutBehavior.onExtraCallbackWithResult(context, null);
                if (strOnExtraCallbackWithResult == null) {
                    strOnExtraCallbackWithResult = CoordinatorLayoutBehavior.IAuthTabCallback(packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir);
                }
                sharedPreferences.edit().putString(str, strOnExtraCallbackWithResult).apply();
                return strOnExtraCallbackWithResult;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
            return null;
        }
    }
}
