package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.features.home.presentation.legacy_transaction_list.R;
import im.toss.tds.view.component.atom.text.Typography7;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class DefaultAuthenticationProxyImpl1 implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final Typography7 onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Typography7 typography7IAuthTabCallback = IAuthTabCallback();
        int i4 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
        return typography7IAuthTabCallback;
    }

    private DefaultAuthenticationProxyImpl1(@NonNull Typography7 typography7) {
        this.onWarmupCompleted = typography7;
    }

    public Typography7 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 121;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Typography7 typography7 = this.onWarmupCompleted;
        int i4 = i2 + 53;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return typography7;
        }
        obj.hashCode();
        throw null;
    }

    public static DefaultAuthenticationProxyImpl1 onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.home_presentation_legacy_transaction_list_item_transaction_section_date_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
            int i4 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return onWarmupCompleted(viewInflate);
    }

    public static DefaultAuthenticationProxyImpl1 onWarmupCompleted(@NonNull View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        DefaultAuthenticationProxyImpl1 defaultAuthenticationProxyImpl1 = new DefaultAuthenticationProxyImpl1((Typography7) view);
        int i3 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return defaultAuthenticationProxyImpl1;
    }
}
