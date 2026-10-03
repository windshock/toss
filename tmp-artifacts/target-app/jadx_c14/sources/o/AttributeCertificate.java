package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AttributeCertificate {
    public static final AttributeCertificate onWarmupCompleted = new AttributeCertificate();

    private AttributeCertificate() {
    }

    public final void onNavigationEvent(@NotNull Context context, @Nullable Intent intent) {
        String dataString;
        Intrinsics.checkNotNullParameter(context, "");
        if (!Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.intent.action.VIEW") || (dataString = intent.getDataString()) == null) {
            return;
        }
        if (enableModuleArgumentNSNullConversionIOS.asInterface.IAuthTabCallbackDefault(dataString)) {
            dataString = null;
        }
        if (dataString != null) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "externalScheme", (String) null, access8100.onNavigationEvent(getWrite.IAuthTabCallback("schemeURL", dataString)), (String) null, false, (String) null, 58, (Object) null);
            Set setOnExtraCallback = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"https", "http"});
            Uri data = intent.getData();
            if (CollectionsKt.contains(setOnExtraCallback, data != null ? data.getScheme() : null) || StringsKt.equals(intent.getType(), "application/pdf", true)) {
                onWarmupCompleted.onExtraCallback(context, intent);
            }
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Context context, Intent intent, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
            this.$intent = intent;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallbackWithResult(this.$context, this.$intent, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                int r0 = r12.label
                if (r0 != 0) goto Lc1
                kotlin.ResultKt.onNavigationEvent(r13)
                android.content.Context r13 = r12.$context     // Catch: java.lang.Exception -> Laf
                android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch: java.lang.Exception -> Laf
                r0 = 0
                if (r13 == 0) goto L1d
                android.content.Intent r1 = r12.$intent     // Catch: java.lang.Exception -> Laf
                r2 = 65536(0x10000, float:9.1835E-41)
                android.content.pm.ResolveInfo r13 = r13.resolveActivity(r1, r2)     // Catch: java.lang.Exception -> Laf
                if (r13 == 0) goto L1d
                android.content.pm.ActivityInfo r13 = r13.activityInfo     // Catch: java.lang.Exception -> Laf
                goto L1e
            L1d:
                r13 = r0
            L1e:
                r1 = 0
                if (r13 == 0) goto L32
                java.lang.String r2 = r13.packageName     // Catch: java.lang.Exception -> Laf
                if (r2 == 0) goto L32
                android.content.Context r3 = r12.$context     // Catch: java.lang.Exception -> Laf
                android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Exception -> Laf
                if (r3 == 0) goto L32
                android.content.pm.PackageInfo r2 = r3.getPackageInfo(r2, r1)     // Catch: java.lang.Exception -> Laf
                goto L33
            L32:
                r2 = r0
            L33:
                o.ConvertFloatArrayToByteArray r3 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult     // Catch: java.lang.Exception -> Laf
                java.lang.String r4 = "schemeURL"
                android.content.Intent r5 = r12.$intent     // Catch: java.lang.Exception -> Laf
                java.lang.String r5 = r5.getDataString()     // Catch: java.lang.Exception -> Laf
                kotlin.Pair r4 = o.getWrite.IAuthTabCallback(r4, r5)     // Catch: java.lang.Exception -> Laf
                java.lang.String r5 = "mimeType"
                android.content.Intent r6 = r12.$intent     // Catch: java.lang.Exception -> Laf
                java.lang.String r6 = r6.getType()     // Catch: java.lang.Exception -> Laf
                kotlin.Pair r5 = o.getWrite.IAuthTabCallback(r5, r6)     // Catch: java.lang.Exception -> Laf
                if (r13 == 0) goto L69
                java.lang.String r6 = r13.packageName     // Catch: java.lang.Exception -> Laf
                java.lang.String r13 = r13.name     // Catch: java.lang.Exception -> Laf
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Laf
                r7.<init>()     // Catch: java.lang.Exception -> Laf
                r7.append(r6)     // Catch: java.lang.Exception -> Laf
                java.lang.String r6 = "/"
                r7.append(r6)     // Catch: java.lang.Exception -> Laf
                r7.append(r13)     // Catch: java.lang.Exception -> Laf
                java.lang.String r13 = r7.toString()     // Catch: java.lang.Exception -> Laf
                if (r13 != 0) goto L6b
            L69:
                java.lang.String r13 = ""
            L6b:
                java.lang.String r6 = "activityInfo"
                kotlin.Pair r13 = o.getWrite.IAuthTabCallback(r6, r13)     // Catch: java.lang.Exception -> Laf
                if (r2 == 0) goto L76
                java.lang.String r6 = r2.versionName     // Catch: java.lang.Exception -> Laf
                goto L77
            L76:
                r6 = r0
            L77:
                java.lang.String r7 = "appVersionName"
                kotlin.Pair r6 = o.getWrite.IAuthTabCallback(r7, r6)     // Catch: java.lang.Exception -> Laf
                if (r2 == 0) goto L87
                long r7 = o.Cookies_getFromResponse.onNavigationEvent(r2)     // Catch: java.lang.Exception -> Laf
                java.lang.Long r0 = o.access14000.onExtraCallback(r7)     // Catch: java.lang.Exception -> Laf
            L87:
                java.lang.String r2 = "appVersionCode"
                kotlin.Pair r0 = o.getWrite.IAuthTabCallback(r2, r0)     // Catch: java.lang.Exception -> Laf
                r2 = 5
                kotlin.Pair[] r2 = new kotlin.Pair[r2]     // Catch: java.lang.Exception -> Laf
                r2[r1] = r4     // Catch: java.lang.Exception -> Laf
                r1 = 1
                r2[r1] = r5     // Catch: java.lang.Exception -> Laf
                r1 = 2
                r2[r1] = r13     // Catch: java.lang.Exception -> Laf
                r13 = 3
                r2[r13] = r6     // Catch: java.lang.Exception -> Laf
                r13 = 4
                r2[r13] = r0     // Catch: java.lang.Exception -> Laf
                java.util.Map r6 = o.access8100.onWarmupCompleted(r2)     // Catch: java.lang.Exception -> Laf
                java.lang.String r4 = "externalSchemeResolveInfo"
                r5 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 58
                r11 = 0
                o.ConvertFloatArrayToByteArray.onExtraCallback(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> Laf
                goto Lbe
            Laf:
                r13 = move-exception
                r3 = r13
                o.ConvertFloatArrayToByteArray r0 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
                java.lang.String r1 = "externalSchemeResolveInfo"
                java.lang.String r2 = "Failed to get resolve info."
                r4 = 0
                r5 = 8
                r6 = 0
                o.ConvertFloatArrayToByteArray.IAuthTabCallback(r0, r1, r2, r3, r4, r5, r6)
            Lbe:
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
            Lc1:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AttributeCertificate.onExtraCallbackWithResult.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final getPackageType onExtraCallback(Context context, Intent intent) {
        return maybeUpdateAnimatable.onNavigationEvent(ComponentModelb.onExtraCallback, putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new onExtraCallbackWithResult(context, intent, null), 2, (Object) null);
    }
}
