package o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import mozilla.components.support.base.R;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ApmHelper12 extends DialogFragment {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private final Lazy onExtraCallback = LazyKt.onExtraCallbackWithResult(new onNavigationEvent());
    private HashMap onWarmupCompleted;

    public final int IAuthTabCallback() {
        return ((Number) this.onExtraCallback.getValue()).intValue();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        onExtraCallbackWithResult();
    }

    public void onExtraCallbackWithResult() {
        HashMap map = this.onWarmupCompleted;
        if (map != null) {
            map.clear();
        }
    }

    static final class onNavigationEvent extends Lambda implements Function0<Integer> {
        onNavigationEvent() {
            super(0);
        }

        public /* synthetic */ Object invoke() {
            return Integer.valueOf(onWarmupCompleted());
        }

        public final int onWarmupCompleted() {
            return ApmHelper12.this.onWarmupCompleted().getInt("KEY_MESSAGE");
        }
    }

    public final Bundle onWarmupCompleted() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(requireContext()).setMessage(IAuthTabCallback()).setCancelable(true).setNegativeButton(R.string.mozac_support_base_permissions_needed_negative_button, new onWarmupCompleted()).setPositiveButton(R.string.mozac_support_base_permissions_needed_positive_button, new IAuthTabCallback()).create();
        Intrinsics.checkNotNullExpressionValue(alertDialogCreate, BuildConfig.FLAVOR);
        return alertDialogCreate;
    }

    static final class onWarmupCompleted implements DialogInterface.OnClickListener {
        onWarmupCompleted() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            ApmHelper12.this.dismiss();
        }
    }

    static final class IAuthTabCallback implements DialogInterface.OnClickListener {
        IAuthTabCallback() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            ApmHelper12.this.onNavigationEvent();
        }
    }

    public final void onNavigationEvent() {
        dismiss();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, BuildConfig.FLAVOR);
        intent.setData(Uri.fromParts("package", contextRequireContext.getPackageName(), null));
        intent.setFlags(268435456);
        requireContext().startActivity(intent);
    }

    public static final class onExtraCallback {
        private onExtraCallback() {
        }

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
