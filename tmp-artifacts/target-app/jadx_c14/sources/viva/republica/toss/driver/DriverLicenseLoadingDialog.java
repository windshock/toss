package viva.republica.toss.driver;

import android.content.Context;
import android.os.Bundle;
import im.toss.uikit.R;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambdaYN2sJNglMasTWVNShwkasqH6K1o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DriverLicenseLoadingDialog extends r8lambdaYN2sJNglMasTWVNShwkasqH6K1o {
    public static final int onNavigationEvent = r8lambdaYN2sJNglMasTWVNShwkasqH6K1o.IAuthTabCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriverLicenseLoadingDialog(@NotNull Context context) {
        super(context, R.style.Base_CustomDialog_WithoutAnimation);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(@Nullable Bundle bundle) {
        super/*android.app.Dialog*/.onCreate(bundle);
        setContentView(viva.republica.toss.R.layout.dialog_driver_license_loading);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }
}
