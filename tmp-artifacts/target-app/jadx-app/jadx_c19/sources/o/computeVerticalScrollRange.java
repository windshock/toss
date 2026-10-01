package o;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class computeVerticalScrollRange extends ContentProvider {
    public static Context onNavigationEvent;
    public static final onExtraCallback onWarmupCompleted = new onExtraCallback(null);
    private static final String IAuthTabCallback = "KRC_PLA";

    public static final class onExtraCallback {
        private onExtraCallback() {
        }

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Context IAuthTabCallback() {
            Context context = computeVerticalScrollRange.onNavigationEvent;
            if (context != null) {
                return context;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }

        public final void onExtraCallbackWithResult(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            computeVerticalScrollRange.onNavigationEvent = context;
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@NotNull Context context, @Nullable ProviderInfo providerInfo) {
        Intrinsics.checkNotNullParameter(context, "");
        if (providerInfo == null) {
            throw new NullPointerException("KRCPLAInitProvider ProviderInfo cannot be null.");
        }
        if (Intrinsics.areEqual("kr.korail.krchce.KRCPLAInitProvider", providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        String str = providerInfo.authority;
        Intrinsics.checkNotNullExpressionValue(str, "");
        ApmHelper11.onExtraCallbackWithResult("Successfully get authority from %s app", new Object[]{str});
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "");
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(uri, "");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new NullPointerException("Application context is null.");
        }
        onWarmupCompleted.onExtraCallbackWithResult(context);
        ApmHelper11.IAuthTabCallback("Initialize Logger", new Object[0]);
        ApmHelper11.IAuthTabCallback(context);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(uri, "");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "");
        return 0;
    }
}
