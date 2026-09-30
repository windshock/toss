package o;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Cookies_set {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public static final Cookies_set onNavigationEvent = new Cookies_set();
    private static int onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private Cookies_set() {
    }

    public final PackageInfo IAuthTabCallback(@NotNull Context context) {
        Object objM31constructorimpl;
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Result.Companion companion2 = Result.Companion;
            Result.m31constructorimpl(SegmentedButtonKtExternalSyntheticLambda6.onExtraCallbackWithResult(context.getApplicationContext()));
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Result.Companion companion3 = Result.Companion;
        objM31constructorimpl = Result.m31constructorimpl(SegmentedButtonKtExternalSyntheticLambda6.onExtraCallbackWithResult(context.getApplicationContext()));
        if (Result.onExtraCallback(objM31constructorimpl)) {
            int i3 = onExtraCallback + 97;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 64 / 0;
            }
        } else {
            obj = objM31constructorimpl;
        }
        return (PackageInfo) obj;
    }

    public final String onWarmupCompleted(@NotNull Context context) {
        Object objM31constructorimpl;
        String str;
        Object objValueOf;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        try {
            Result.Companion companion = Result.Companion;
            PackageInfo packageInfoOnExtraCallbackWithResult = SegmentedButtonKtExternalSyntheticLambda6.onExtraCallbackWithResult(context.getApplicationContext());
            if (packageInfoOnExtraCallbackWithResult != null) {
                String str2 = packageInfoOnExtraCallbackWithResult.packageName;
                String str3 = packageInfoOnExtraCallbackWithResult.versionName;
                if (Build.VERSION.SDK_INT >= 28) {
                    objValueOf = Long.valueOf(packageInfoOnExtraCallbackWithResult.getLongVersionCode());
                } else {
                    objValueOf = Integer.valueOf(packageInfoOnExtraCallbackWithResult.versionCode);
                    int i2 = onExtraCallback + 19;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 2 % 5;
                    }
                }
                str = str2 + "_" + str3 + "(" + objValueOf + ")";
            } else {
                str = null;
            }
            objM31constructorimpl = Result.m31constructorimpl(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        String str4 = (String) (Result.onExtraCallback(objM31constructorimpl) ? null : objM31constructorimpl);
        if (str4 != null) {
            return str4;
        }
        int i4 = onWarmupCompleted + 53;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return "Unknown";
    }

    public final String onNavigationEvent(@NotNull Context context) {
        Object objM31constructorimpl;
        String installerPackageName;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        try {
            Result.Companion companion = Result.Companion;
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT >= 30) {
                int i2 = onWarmupCompleted + 113;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(packageName);
                Intrinsics.checkNotNullExpressionValue(installSourceInfo, "");
                installerPackageName = installSourceInfo.getInstallingPackageName();
                if (installerPackageName == null && (installerPackageName = installSourceInfo.getInitiatingPackageName()) == null) {
                    installerPackageName = installSourceInfo.getOriginatingPackageName();
                }
            } else {
                installerPackageName = packageManager.getInstallerPackageName(packageName);
            }
            objM31constructorimpl = Result.m31constructorimpl(installerPackageName);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        Object obj = null;
        if (Result.onExtraCallback(objM31constructorimpl)) {
            int i4 = onExtraCallback + 83;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            objM31constructorimpl = null;
        }
        String str = (String) objM31constructorimpl;
        if (str != null) {
            return str;
        }
        int i6 = onWarmupCompleted + 109;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return "Unknown";
        }
        obj.hashCode();
        throw null;
    }
}
