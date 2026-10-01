package im.toss.core.webkit.bridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.gson.JsonObject;
import im.toss.core.webkit.bridge.RemoveHighlightV3Handler$;
import im.toss.uikit.widget.tooltip.TdsHighlightV3View;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceQuality;
import o.ALCFaceValidation;
import o.EasingFunctionsKtExternalSyntheticLambda4;
import o.filterCreatePageParams;
import o.generateAppWithState;
import o.hasVaryAll;
import o.onOutOfMemory;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setOnOutOfMemeryErrorCallback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RemoveHighlightV3Handler implements ALCFaceQuality {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static /* synthetic */ boolean onNavigationEvent(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(str, str2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIAuthTabCallback = IAuthTabCallback(str, str2);
        int i3 = onExtraCallbackWithResult + 109;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return zIAuthTabCallback;
    }

    @Override // o.ALCFaceQuality
    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 5;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = onExtraCallbackWithResult + 79;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super.onNavigationEvent();
        int i4 = onExtraCallbackWithResult + 57;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super.onWarmupCompleted(str);
        int i4 = onExtraCallback + 117;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return aLCFaceValidationOnWarmupCompleted;
    }

    @Override // o.ALCFaceQuality
    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 != 0) {
            int i6 = 81 / 0;
        }
    }

    @Override // o.drawTextBox
    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new RemoveHighlightV3Handler$.ExternalSyntheticLambda0());
        int i2 = onExtraCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final boolean IAuthTabCallback(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Uri uri = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            filterCreatePageParams.onTransact(uri);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Uri uri2 = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri2, "");
        boolean zOnTransact = filterCreatePageParams.onTransact(uri2);
        int i3 = onExtraCallbackWithResult + 57;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnTransact;
        }
        throw null;
    }

    @Override // o.ALCFaceQuality
    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        View decorView;
        Window window;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context != null) {
            int i2 = onExtraCallbackWithResult + 37;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                hasVaryAll.IAuthTabCallback(context);
                obj.hashCode();
                throw null;
            }
            Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
            if (activityIAuthTabCallback == null || (window = activityIAuthTabCallback.getWindow()) == null) {
                decorView = null;
            } else {
                int i3 = onExtraCallback + 75;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                decorView = window.getDecorView();
            }
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup != null) {
                int i5 = onExtraCallback + 9;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                Iterator itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda4.onWarmupCompleted(viewGroup).IAuthTabCallback();
                while (itIAuthTabCallback.hasNext()) {
                    int i7 = onExtraCallbackWithResult + 1;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        boolean z = ((View) itIAuthTabCallback.next()) instanceof TdsHighlightV3View;
                        obj.hashCode();
                        throw null;
                    }
                    View view = (View) itIAuthTabCallback.next();
                    if ((view instanceof TdsHighlightV3View) || (view instanceof generateAppWithState)) {
                        viewGroup.removeView(view);
                    }
                }
            }
        }
    }
}
