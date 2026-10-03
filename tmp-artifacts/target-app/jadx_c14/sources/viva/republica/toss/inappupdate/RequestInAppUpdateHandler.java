package viva.republica.toss.inappupdate;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import com.google.gson.JsonObject;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceQuality;
import o.ALCFaceValidation;
import o.Response;
import o.SubsamplingScaleImageViewAnimationBuilder;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.UserChoiceBillingListener;
import o.maybeUpdateAnimatable;
import o.onOutOfMemory;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setOnOutOfMemeryErrorCallback;
import o.setRandomHost;
import o.setText;
import o.withOrigin;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RequestInAppUpdateHandler implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    private static final String onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final int onWarmupCompleted;
    private final Lazy IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.inappupdate.RequestInAppUpdateHandler$$ExternalSyntheticLambda0
        public final Object invoke() {
            return RequestInAppUpdateHandler.onWarmupCompleted();
        }
    });

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new char[]{27104, 64120, 20174, 54094}, 37781 - (Process.myTid() >> 22), objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        Companion = new Companion(null);
        onWarmupCompleted = 8;
        int i = IAuthTabCallbackDefault + 107;
        asInterface = i % 128;
        if (i % 2 != 0) {
            int i2 = 76 / 0;
        }
    }

    public static /* synthetic */ withOrigin onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        withOrigin withoriginIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = IAuthTabCallbackStub + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return withoriginIAuthTabCallbackDefault;
    }

    public static final /* synthetic */ withOrigin onWarmupCompleted(RequestInAppUpdateHandler requestInAppUpdateHandler) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        withOrigin withoriginAsBinder = requestInAppUpdateHandler.asBinder();
        int i4 = onNavigationEvent + 69;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return withoriginAsBinder;
        }
        throw null;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = IAuthTabCallbackStub + 13;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 59;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 == 0) {
            throw null;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
            int i3 = 40 / 0;
        } else {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        int i4 = onNavigationEvent + 113;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = IAuthTabCallbackStub + 13;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = IAuthTabCallbackStub + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 99;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = onNavigationEvent + 57;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    private final withOrigin asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        withOrigin withorigin = (withOrigin) this.IAuthTabCallback.getValue();
        int i4 = IAuthTabCallbackStub + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return withorigin;
    }

    private static final withOrigin IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        withOrigin withoriginRequiresPermission = ((SubsamplingScaleImageViewAnimationBuilder) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), SubsamplingScaleImageViewAnimationBuilder.class)).RequiresPermission();
        int i4 = IAuthTabCallbackStub + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return withoriginRequiresPermission;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context == null) {
            int i4 = onNavigationEvent + 55;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        setText settext = new setText(jsonObject);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq), (CoroutineContext) null, (setRandomHost) null, new RequestInAppUpdateHandler$onHandleMessage$1(this, null), 3, (Object) null);
        ycxycx.onWarmupCompleted(ycxycx.IAuthTabCallback(asBinder().onWarmupCompleted(), new RequestInAppUpdateHandler$onHandleMessage$2(settext, context, setonoutofmemeryerrorcallback, null)), TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq));
        int i5 = onNavigationEvent + 11;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(char[] r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.inappupdate.RequestInAppUpdateHandler.a(char[], int, java.lang.Object[]):void");
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = 4979455626380176547L;
    }
}
