package viva.republica.toss.account.register.openbanking;

import android.content.Context;
import android.os.Bundle;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.uikit.R;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambdaYN2sJNglMasTWVNShwkasqH6K1o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ExternalAppExecutingDialog extends r8lambdaYN2sJNglMasTWVNShwkasqH6K1o {
    public static final int onNavigationEvent = r8lambdaYN2sJNglMasTWVNShwkasqH6K1o.IAuthTabCallback;
    private final String onExtraCallbackWithResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalAppExecutingDialog(@NotNull Context context, @NotNull String str) {
        super(context, R.style.Base_CustomDialog_WithoutAnimation);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(@Nullable Bundle bundle) {
        super/*android.app.Dialog*/.onCreate(bundle);
        setContentView(viva.republica.toss.R.layout.dialog_external_app_executing);
        BaseTextView baseTextViewFindViewById = findViewById(viva.republica.toss.R.id.titleTextView);
        if (baseTextViewFindViewById != null) {
            baseTextViewFindViewById.setText(this.onExtraCallbackWithResult);
        }
    }
}
