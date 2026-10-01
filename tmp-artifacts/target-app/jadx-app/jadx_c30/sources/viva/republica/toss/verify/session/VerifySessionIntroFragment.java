package viva.republica.toss.verify.session;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import im.toss.base.BaseFragment;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class VerifySessionIntroFragment extends BaseFragment {
    public long getScreenId() {
        return -1L;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, BuildConfig.FLAVOR);
        return layoutInflater.inflate(R.layout.fragment_nested_fragment, viewGroup, false);
    }
}
