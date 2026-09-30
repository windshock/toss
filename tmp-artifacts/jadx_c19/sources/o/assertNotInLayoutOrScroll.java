package o;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import o.removeOnContextAvailableListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class assertNotInLayoutOrScroll {
    public static final assertNotInLayoutOrScroll IAuthTabCallback = new assertNotInLayoutOrScroll();
    private static final String[] onExtraCallbackWithResult = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    private assertNotInLayoutOrScroll() {
    }

    public final ServiceConnection onWarmupCompleted(@NotNull Context context, @NotNull Uri uri) throws UnsupportedOperationException {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(context, uri);
        if (strOnExtraCallbackWithResult == null) {
            throw new UnsupportedOperationException();
        }
        updateLayoutStateToFillStart.Companion.IAuthTabCallback("Choosing " + strOnExtraCallbackWithResult + " as custom tabs browser");
        CustomTabsServiceConnection iAuthTabCallback = new IAuthTabCallback(uri, strOnExtraCallbackWithResult, context);
        if (removeMenuProvider.onExtraCallbackWithResult(context, strOnExtraCallbackWithResult, iAuthTabCallback)) {
            return iAuthTabCallback;
        }
        return null;
    }

    public static final class IAuthTabCallback extends CustomTabsServiceConnection {
        final /* synthetic */ String IAuthTabCallback;
        final /* synthetic */ Uri onExtraCallbackWithResult;
        final /* synthetic */ Context onNavigationEvent;

        IAuthTabCallback(Uri uri, String str, Context context) {
            this.onExtraCallbackWithResult = uri;
            this.IAuthTabCallback = str;
            this.onNavigationEvent = context;
        }

        public void onCustomTabsServiceConnected(@NotNull ComponentName componentName, @NotNull removeMenuProvider removemenuprovider) {
            Intrinsics.checkNotNullParameter(componentName, "");
            Intrinsics.checkNotNullParameter(removemenuprovider, "");
            removeOnContextAvailableListener.onExtraCallbackWithResult onExtraCallbackWithResult = new removeOnContextAvailableListener.onExtraCallbackWithResult().onWarmupCompleted(true).onExtraCallbackWithResult(true);
            Intrinsics.checkNotNullExpressionValue(onExtraCallbackWithResult, "");
            removeOnContextAvailableListener removeoncontextavailablelistenerOnExtraCallbackWithResult = onExtraCallbackWithResult.onExtraCallbackWithResult();
            Intrinsics.checkNotNullExpressionValue(removeoncontextavailablelistenerOnExtraCallbackWithResult, "");
            removeoncontextavailablelistenerOnExtraCallbackWithResult.IAuthTabCallback.setData(this.onExtraCallbackWithResult);
            removeoncontextavailablelistenerOnExtraCallbackWithResult.IAuthTabCallback.setPackage(this.IAuthTabCallback);
            this.onNavigationEvent.startActivity(removeoncontextavailablelistenerOnExtraCallbackWithResult.IAuthTabCallback);
        }

        public void onServiceDisconnected(@Nullable ComponentName componentName) {
            updateLayoutStateToFillStart.Companion.IAuthTabCallback("onServiceDisconnected: " + componentName);
        }
    }

    public final void onNavigationEvent(@NotNull Context context, @NotNull Uri uri) throws ActivityNotFoundException {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        new removeOnContextAvailableListener.onExtraCallbackWithResult().onWarmupCompleted(true).onExtraCallbackWithResult(true).onExtraCallbackWithResult().onExtraCallback(context, uri);
    }

    private final String onExtraCallbackWithResult(Context context, Uri uri) {
        ResolveInfo resolveInfoResolveActivity;
        List<ResolveInfo> listQueryIntentServices;
        ActivityInfo activityInfo;
        ActivityInfo activityInfo2;
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, PackageManager.ResolveInfoFlags.of(65536L));
        } else {
            resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        }
        Intent action = new Intent().setAction("android.support.customtabs.action.CustomTabsService");
        Intrinsics.checkNotNullExpressionValue(action, "");
        if (i2 >= 33) {
            listQueryIntentServices = context.getPackageManager().queryIntentServices(action, PackageManager.ResolveInfoFlags.of(0L));
        } else {
            listQueryIntentServices = context.getPackageManager().queryIntentServices(action, 0);
        }
        Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "");
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        String str = null;
        String str2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo next = it.next();
            if (str2 == null) {
                String str3 = next.serviceInfo.packageName;
                Intrinsics.checkNotNullExpressionValue(str3, "");
                if (onWarmupCompleted(str3)) {
                    str2 = next.serviceInfo.packageName;
                }
            }
            if (Intrinsics.areEqual(next.serviceInfo.packageName, (resolveInfoResolveActivity == null || (activityInfo2 = resolveInfoResolveActivity.activityInfo) == null) ? null : activityInfo2.packageName)) {
                if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null) {
                    str = activityInfo.packageName;
                }
            }
        }
        return (str != null || str2 == null) ? str : str2;
    }

    private final boolean onWarmupCompleted(String str) {
        return ArraysKt.contains(onExtraCallbackWithResult, str);
    }
}
