package o;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.atom.text.Typography7;
import kotlin.jvm.internal.Intrinsics;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SharedPreferencesManager extends enableNativeCSSParsing {
    private final Typography7 extraCallback;

    /* JADX WARN: Illegal instructions before constructor call */
    public SharedPreferencesManager(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingOnWarmupCompleted = ContextMenuAreaKtExternalSyntheticLambda0.onWarmupCompleted(LayoutInflater.from(viewGroup.getContext()), toRealPath.onNavigationEvent.TRANSACTION_V2_DATE.getLayoutResId(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingOnWarmupCompleted, "");
        super(viewDataBindingOnWarmupCompleted);
        this.extraCallback = ((RecyclerView.ViewHolder) this).onNavigationEvent.findViewById(R.id.dateTitle);
    }

    public void onExtraCallback(@Nullable enableInteropViewManagerClassLookUpOptimizationIOS enableinteropviewmanagerclasslookupoptimizationios) {
        setTimeVisible settimevisible = enableinteropviewmanagerclasslookupoptimizationios instanceof setTimeVisible ? (setTimeVisible) enableinteropviewmanagerclasslookupoptimizationios : null;
        if (settimevisible == null) {
            return;
        }
        this.extraCallback.setText(settimevisible.IAuthTabCallback());
    }
}
