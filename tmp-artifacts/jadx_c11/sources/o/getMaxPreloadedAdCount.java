package o;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import o.checkGlErrorOrThrow;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getMaxPreloadedAdCount implements checkGlErrorOrThrow.onExtraCallback {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final int onExtraCallback;

    public getMaxPreloadedAdCount(int i) {
        this.onExtraCallback = i;
    }

    public Object IAuthTabCallback(@NotNull Context context, @NotNull checkGlErrorOrThrow checkglerrororthrow, @NotNull access13800<? super Typeface> access13800Var) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("All TDS fonts are blocking.");
    }

    public Typeface onExtraCallbackWithResult(@NotNull Context context, @NotNull checkGlErrorOrThrow checkglerrororthrow) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(checkglerrororthrow, "");
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(response.Companion.IAuthTabCallback(this.onExtraCallback));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            obj = null;
        }
        response responseVar = (response) obj;
        if (responseVar == null) {
            int i4 = onNavigationEvent + 21;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i5 = IAuthTabCallback + 1;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Typeface typeface$default = response.toTypeface$default(responseVar, context, null, 2, null);
        int i7 = IAuthTabCallback + 83;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return typeface$default;
        }
        throw null;
    }
}
