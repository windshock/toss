package o;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CertificatePinnerCompanion extends ClickableSpan {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final String onExtraCallbackWithResult;
    private final Function1<String, Unit> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public CertificatePinnerCompanion(@NotNull String str, @Nullable Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult = str;
        this.onNavigationEvent = function1;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NotNull View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Function1<String, Unit> function1 = this.onNavigationEvent;
        if (function1 != null) {
            function1.invoke(this.onExtraCallbackWithResult);
            int i4 = onWarmupCompleted + 63;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 20 / 0;
                return;
            }
            return;
        }
        Uri uri = Uri.parse(this.onExtraCallbackWithResult);
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        if (!(context instanceof Activity)) {
            int i6 = onWarmupCompleted + 53;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                intent.addFlags(268435456);
                int i7 = 79 / 0;
            } else {
                intent.addFlags(268435456);
            }
        }
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
            Unit unit = Unit.INSTANCE;
        } catch (ActivityNotFoundException unused) {
            intent.toString();
        }
    }

    @Override // android.text.style.ClickableSpan
    public String toString() {
        int i = 2 % 2;
        String str = "UrlSpan{url='" + this.onExtraCallbackWithResult + "'}";
        int i2 = onWarmupCompleted + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
