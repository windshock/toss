package o;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class isExecuted {
    public static final isExecuted IAuthTabCallback = new isExecuted();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallback + 69;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isExecuted() {
    }

    public static /* synthetic */ Spanned onNavigationEvent(isExecuted isexecuted, String str, Object[] objArr, Context context, getSpecialFeatureOptInStatus getspecialfeatureoptinstatus, Function1 function1, boolean z, boolean z2, CertificatePinner certificatePinner, int i, Object obj) {
        getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2;
        Function1 function12;
        CertificatePinner certificatePinnerOnExtraCallback;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 95;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 == 0 ? (i & 8) == 0 : (i & 90) == 0) {
            getspecialfeatureoptinstatus2 = getspecialfeatureoptinstatus;
        } else {
            int i5 = i4 + 57;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            getspecialfeatureoptinstatus2 = readIntokhttp.onExtraCallback(configuration) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
        if ((i & 16) != 0) {
            int i7 = onWarmupCompleted + 27;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            function12 = null;
        } else {
            function12 = function1;
        }
        boolean z3 = (i & 32) != 0 ? false : z;
        boolean z4 = (i & 64) != 0 ? true : z2;
        if ((i & 128) != 0) {
            int i9 = onNavigationEvent + 85;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            certificatePinnerOnExtraCallback = CertificatePinner.Companion.onExtraCallback();
        } else {
            certificatePinnerOnExtraCallback = certificatePinner;
        }
        return isexecuted.onNavigationEvent(str, objArr, context, getspecialfeatureoptinstatus2, function12, z3, z4, certificatePinnerOnExtraCallback);
    }

    public final Spanned onNavigationEvent(@NotNull String str, @NotNull Object[] objArr, @NotNull Context context, @NotNull getSpecialFeatureOptInStatus getspecialfeatureoptinstatus, @Nullable Function1<? super String, Unit> function1, boolean z, boolean z2, @NotNull CertificatePinner certificatePinner) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(getspecialfeatureoptinstatus, "");
        Intrinsics.checkNotNullParameter(certificatePinner, "");
        Spanned spannedOnExtraCallback = onExtraCallback(str, Arrays.copyOf(objArr, objArr.length), new indexOfElementdefault(context, getspecialfeatureoptinstatus, function1, certificatePinner), z, z2);
        int i2 = onNavigationEvent + 91;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 71 / 0;
        }
        return spannedOnExtraCallback;
    }

    public static /* synthetic */ Spanned onWarmupCompleted(isExecuted isexecuted, String str, Object[] objArr, Html.TagHandler tagHandler, boolean z, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = onNavigationEvent + 15;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                indexOfElement.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            tagHandler = indexOfElement.onWarmupCompleted();
        }
        Html.TagHandler tagHandler2 = tagHandler;
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            int i4 = onNavigationEvent + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            z2 = true;
        }
        return isexecuted.onExtraCallback(str, objArr, tagHandler2, z3, z2);
    }

    public final Spanned onExtraCallback(@NotNull String str, @NotNull Object[] objArr, @NotNull Html.TagHandler tagHandler, boolean z, boolean z2) {
        Spannable spannableOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        Intrinsics.checkNotNullParameter(tagHandler, "");
        if (z) {
            str = StringsKt.replace$default(str, "\n", "<br>", false, 4, (Object) null);
        }
        if (objArr.length != 0) {
            str = WorkForegroundRunnableExternalSyntheticLambda0.onExtraCallback(str, Arrays.copyOf(objArr, objArr.length));
        }
        Spanned spannedFromHtml = Html.fromHtml("<ContentHandlerReplacementTag />" + str, 63, null, tagHandler);
        if (!z2) {
            Intrinsics.checkNotNull(spannedFromHtml);
            int i4 = onNavigationEvent + 95;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return spannedFromHtml;
        }
        int i6 = onNavigationEvent + 31;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            CacheControlCompanion cacheControlCompanion = CacheControlCompanion.IAuthTabCallback;
            Intrinsics.checkNotNull(spannedFromHtml);
            spannableOnExtraCallbackWithResult = cacheControlCompanion.onExtraCallbackWithResult(spannedFromHtml);
            int i7 = 25 / 0;
        } else {
            CacheControlCompanion cacheControlCompanion2 = CacheControlCompanion.IAuthTabCallback;
            Intrinsics.checkNotNull(spannedFromHtml);
            spannableOnExtraCallbackWithResult = cacheControlCompanion2.onExtraCallbackWithResult(spannedFromHtml);
        }
        int i8 = onWarmupCompleted + 31;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return spannableOnExtraCallbackWithResult;
    }
}
