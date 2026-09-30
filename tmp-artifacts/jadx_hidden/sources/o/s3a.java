package o;

import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.view.ViewConfiguration;
import im.toss.security.impl.malware.MalwareDetectActivity$IAuthTabCallback;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s3a {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static long onExtraCallback = -3230818559983521914L;
    private static int onWarmupCompleted = 1;

    public static final List<PackageInfo> onWarmupCompleted(@NotNull PackageManager packageManager, int i) {
        Object obj;
        List<PackageInfo> installedPackages;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(packageManager, "");
        try {
            Result.Companion companion = Result.Companion;
            if (Build.VERSION.SDK_INT >= 33) {
                installedPackages = packageManager.getInstalledPackages(PackageManager.PackageInfoFlags.of(i));
                int i3 = onWarmupCompleted + 15;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            } else {
                installedPackages = packageManager.getInstalledPackages(i);
            }
            obj = Result.constructor-impl(installedPackages);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (!(!Result.onExtraCallback(obj))) {
            int i5 = IAuthTabCallback + 29;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            obj = null;
        }
        List<PackageInfo> list = (List) obj;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public static final String onWarmupCompleted(@NotNull PackageManager packageManager, @NotNull String str) {
        Object obj;
        String installerPackageName;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Companion companion = Result.Companion;
            if (Build.VERSION.SDK_INT >= 30) {
                InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(str);
                Intrinsics.checkNotNullExpressionValue(installSourceInfo, "");
                installerPackageName = installSourceInfo.getInstallingPackageName();
                if (installerPackageName == null) {
                    int i4 = onWarmupCompleted + 69;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        installSourceInfo.getInitiatingPackageName();
                        obj.hashCode();
                        throw null;
                    }
                    installerPackageName = installSourceInfo.getInitiatingPackageName();
                    if (installerPackageName == null) {
                        int i5 = onWarmupCompleted + 19;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        installerPackageName = installSourceInfo.getOriginatingPackageName();
                    }
                }
            } else {
                installerPackageName = packageManager.getInstallerPackageName(str);
            }
            obj = Result.constructor-impl(installerPackageName);
            int i7 = IAuthTabCallback + 85;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        String str2 = (String) (Result.onExtraCallback(obj) ? null : obj);
        if (str2 != null) {
            return str2;
        }
        Object[] objArr = new Object[1];
        a(new char[]{32349, 32264, 58305, 63269, 12729, 53095, 6342, 62103, 11290, 34052, 19179}, ViewConfiguration.getPressedStateDuration() >> 16, objArr);
        return ((String) objArr[0]).intern();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[Catch: all -> 0x0025, PHI: r9
      0x0039: PHI (r9v12 java.lang.String[]) = (r9v11 java.lang.String[]), (r9v15 java.lang.String[]) binds: [B:12:0x0037, B:6:0x0022] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0025, blocks: (B:5:0x0018, B:17:0x006c, B:13:0x0039, B:15:0x0043, B:11:0x002d), top: B:31:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<java.lang.String> onExtraCallback(@org.jetbrains.annotations.NotNull android.content.pm.PackageManager r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.s3a.onWarmupCompleted
            int r1 = r1 + 13
            int r2 = r1 % 128
            o.s3a.IAuthTabCallback = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            r4 = 0
            if (r1 == 0) goto L27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r3)
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L25
            r1 = 4115(0x1013, float:5.766E-42)
            android.content.pm.PackageInfo r9 = onExtraCallbackWithResult(r9, r10, r1)     // Catch: java.lang.Throwable -> L25
            java.lang.String[] r9 = r9.requestedPermissions     // Catch: java.lang.Throwable -> L25
            if (r9 == 0) goto L6b
            goto L39
        L25:
            r9 = move-exception
            goto L7a
        L27:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r3)
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L25
            r1 = 4224(0x1080, float:5.919E-42)
            android.content.pm.PackageInfo r9 = onExtraCallbackWithResult(r9, r10, r1)     // Catch: java.lang.Throwable -> L25
            java.lang.String[] r9 = r9.requestedPermissions     // Catch: java.lang.Throwable -> L25
            if (r9 == 0) goto L6b
        L39:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L25
            int r1 = r9.length     // Catch: java.lang.Throwable -> L25
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L25
            int r1 = r9.length     // Catch: java.lang.Throwable -> L25
            r3 = r4
        L41:
            if (r3 >= r1) goto L6c
            r5 = r9[r3]     // Catch: java.lang.Throwable -> L25
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch: java.lang.Throwable -> L25
            r6 = 23
            char[] r6 = new char[r6]     // Catch: java.lang.Throwable -> L25
            r6 = {x00a8: FILL_ARRAY_DATA , data: [31602, 31507, -12702, -9594, 26635, -20194, 16763, -29454, 10549, -22343, 4947, 16118, -8366, 30429, -23267, 20637, -29341, -15085, 30708, -31391, 13245, -27866, 6545} // fill-array     // Catch: java.lang.Throwable -> L25
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)     // Catch: java.lang.Throwable -> L25
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L25
            a(r6, r7, r8)     // Catch: java.lang.Throwable -> L25
            r6 = r8[r4]     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = r6.intern()     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = kotlin.text.StringsKt.removePrefix(r5, r6)     // Catch: java.lang.Throwable -> L25
            r10.add(r5)     // Catch: java.lang.Throwable -> L25
            int r3 = r3 + 1
            goto L41
        L6b:
            r10 = r2
        L6c:
            java.lang.Object r9 = kotlin.Result.constructor-impl(r10)     // Catch: java.lang.Throwable -> L25
            int r10 = o.s3a.onWarmupCompleted
            int r10 = r10 + 85
            int r1 = r10 % 128
            o.s3a.IAuthTabCallback = r1
            int r10 = r10 % r0
            goto L84
        L7a:
            kotlin.Result$Companion r10 = kotlin.Result.Companion
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r9)
            java.lang.Object r9 = kotlin.Result.constructor-impl(r9)
        L84:
            boolean r10 = kotlin.Result.onExtraCallback(r9)
            if (r10 == 0) goto L8b
            goto L8c
        L8b:
            r2 = r9
        L8c:
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto La7
            int r9 = o.s3a.onWarmupCompleted
            int r9 = r9 + 25
            int r10 = r9 % 128
            o.s3a.IAuthTabCallback = r10
            int r9 = r9 % r0
            if (r9 == 0) goto La3
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            r9 = 28
            int r9 = r9 / r4
            goto La7
        La3:
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        La7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.s3a.onExtraCallback(android.content.pm.PackageManager, java.lang.String):java.util.List");
    }

    public static final List<Signature> onExtraCallbackWithResult(@NotNull PackageManager packageManager, @NotNull String str) {
        Object obj;
        Signature[] signingCertificateHistory;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Companion companion = Result.Companion;
            if (Build.VERSION.SDK_INT >= 28) {
                int i2 = onWarmupCompleted + 53;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    SigningInfo signingInfoKf_ = EncoderImplByteBufferInputExternalSyntheticLambda5.kf_(onExtraCallbackWithResult(packageManager, str, 134217728));
                    Intrinsics.checkNotNull(signingInfoKf_);
                    signingInfoKf_.hasMultipleSigners();
                    throw null;
                }
                SigningInfo signingInfoKf_2 = EncoderImplByteBufferInputExternalSyntheticLambda5.kf_(onExtraCallbackWithResult(packageManager, str, 134217728));
                Intrinsics.checkNotNull(signingInfoKf_2);
                if (signingInfoKf_2.hasMultipleSigners()) {
                    int i3 = onWarmupCompleted + 21;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        signingInfoKf_2.getApkContentsSigners();
                        obj.hashCode();
                        throw null;
                    }
                    signingCertificateHistory = signingInfoKf_2.getApkContentsSigners();
                } else {
                    signingCertificateHistory = signingInfoKf_2.getSigningCertificateHistory();
                }
            } else {
                signingCertificateHistory = onExtraCallbackWithResult(packageManager, str, 64).signatures;
                Intrinsics.checkNotNull(signingCertificateHistory);
            }
            Intrinsics.checkNotNull(signingCertificateHistory);
            obj = Result.constructor-impl(ArraysKt.toList(signingCertificateHistory));
            int i4 = onWarmupCompleted + 109;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        List<Signature> list = (List) (Result.onExtraCallback(obj) ? null : obj);
        if (list != null) {
            return list;
        }
        int i6 = onWarmupCompleted + 37;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return CollectionsKt.emptyList();
    }

    private static final PackageInfo onExtraCallbackWithResult(PackageManager packageManager, String str, int i) throws PackageManager.NameNotFoundException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 3;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0 ? Build.VERSION.SDK_INT >= 33 : Build.VERSION.SDK_INT >= 64) {
            int i4 = onWarmupCompleted + 41;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            PackageInfo packageInfo = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(i));
            Intrinsics.checkNotNull(packageInfo);
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(str, i);
        Intrinsics.checkNotNull(packageInfo2);
        return packageInfo2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 123;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 2 / 5;
        }
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 121;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, onExtraCallback);
            tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }
}
