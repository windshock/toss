package viva.republica.toss.common.web.message.handlers;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.gson.JsonObject;
import im.toss.features.tosscert.ui.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceQuality;
import o.ALCFaceValidation;
import o.IconRoundCornerProgressBarSavedState;
import o.clearRevision;
import o.onOutOfMemory;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setMessageBytes;
import o.setOnOutOfMemeryErrorCallback;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.RefreshHomeFailoverStateHandler$;
import viva.republica.toss.main.StatusManager;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RefreshHomeFailoverStateHandler implements ALCFaceQuality {
    public /* bridge */ onOutOfMemory onExtraCallback() {
        return super/*o.drawTextBox*/.onExtraCallback();
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        return super/*o.drawTextBox*/.onExtraCallbackWithResult();
    }

    public /* bridge */ boolean onNavigationEvent() {
        return super/*o.drawTextBox*/.onNavigationEvent();
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        return super/*o.drawTextBox*/.onWarmupCompleted(str);
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        Object next;
        writeRaw writeraw;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Iterator itIAuthTabCallback = clearRevision.asInterface(CollectionsKt.asSequence(StatusManager.Companion.IAuthTabCallback()), new RefreshHomeFailoverStateHandler$.ExternalSyntheticLambda0()).IAuthTabCallback();
        while (true) {
            if (!itIAuthTabCallback.hasNext()) {
                next = null;
                break;
            } else {
                next = itIAuthTabCallback.next();
                if (((StatusManager) next).onExtraCallbackWithResult()) {
                    break;
                }
            }
        }
        StatusManager statusManager = (StatusManager) next;
        if (statusManager != null) {
            writeraw = (writeRaw) StatusManager.onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -613548562, new Object[]{statusManager}, R.drawable.IAuthTabCallback(), 613548577, R.drawable.IAuthTabCallback());
        } else {
            writeraw = null;
        }
        if (writeraw == null) {
            setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
        } else {
            IconRoundCornerProgressBarSavedState.IAuthTabCallback(setMessageBytes.onExtraCallbackWithResult(writeraw, new RefreshHomeFailoverStateHandler$.ExternalSyntheticLambda1(setonoutofmemeryerrorcallback), new RefreshHomeFailoverStateHandler$.ExternalSyntheticLambda2(setonoutofmemeryerrorcallback)), r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StatusManager IAuthTabCallback(WeakReference weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        return (StatusManager) weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, StatusManager.IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        int i = WhenMappings.onExtraCallbackWithResult[iAuthTabCallback.ordinal()];
        if (i == 1 || i == 2) {
            setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
        } else {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, iAuthTabCallback.name(), (String) null, (Map) null, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        String message = th.getMessage();
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, message == null ? "" : message, (String) null, (Map) null, 6, (Object) null);
        return Unit.INSTANCE;
    }
}
