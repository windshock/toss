package o;

import android.text.TextUtils;
import android.view.View;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AttributeCertificateInfo {
    public static final AttributeCertificateInfo onNavigationEvent = new AttributeCertificateInfo();

    private AttributeCertificateInfo() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull final java.lang.String r22, @org.jetbrains.annotations.Nullable final java.lang.String r23, @org.jetbrains.annotations.Nullable java.lang.String r24, boolean r25, boolean r26, @org.jetbrains.annotations.Nullable final java.lang.String r27, @org.jetbrains.annotations.Nullable final java.lang.String r28, @org.jetbrains.annotations.Nullable final java.lang.String r29, @org.jetbrains.annotations.Nullable final java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AttributeCertificateInfo.onExtraCallbackWithResult(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("schemeURL", str);
        if (str2 != null) {
            setDetectableSize.onExtraCallback("consumer", str2);
        }
        if (str3 != null) {
            setDetectableSize.onExtraCallback("consumerDetail", str3);
        }
        if (str4 != null) {
            setDetectableSize.onExtraCallback("originalSchemeURL", str4);
        }
        if (str5 != null) {
            setDetectableSize.onExtraCallback("lastScreenSchemaId", str5);
        }
        if (str6 != null) {
            setDetectableSize.onExtraCallback("fromWebViewUrl", str6);
        }
        if (str7 != null) {
            setDetectableSize.onExtraCallback("routeOrigin", str7);
        }
        if (z && setDetectableSize.onExtraCallback().get("content") == null) {
            setDetectableSize.onExtraCallback("content", str);
        }
        return Unit.INSTANCE;
    }

    public final boolean IAuthTabCallback$363f39d1(@NotNull String str, @NotNull Enum r12) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(r12, "");
        try {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1365158677);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 34 - View.resolveSizeAndState(0, 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 7095, 1612600709, false, "getDomainName", new Class[0]);
            }
            return StringsKt.contains$default(str, (CharSequence) ((Method) objOnExtraCallback).invoke(r12, null), false, 2, (Object) null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
