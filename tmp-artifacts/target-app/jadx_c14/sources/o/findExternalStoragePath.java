package o;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View;
import kotlin.jvm.internal.Intrinsics;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class findExternalStoragePath extends enableNativeCSSParsing {
    private final TdsListHeaderV2View extraCallback;

    /* JADX WARN: Illegal instructions before constructor call */
    public findExternalStoragePath(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingOnWarmupCompleted = ContextMenuAreaKtExternalSyntheticLambda0.onWarmupCompleted(LayoutInflater.from(viewGroup.getContext()), toRealPath.onNavigationEvent.TRANSACTION_V2_YEAR.getLayoutResId(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingOnWarmupCompleted, "");
        super(viewDataBindingOnWarmupCompleted);
        this.extraCallback = ((RecyclerView.ViewHolder) this).onNavigationEvent.findViewById(R.id.dateTitle);
    }

    public void onExtraCallback(@Nullable enableInteropViewManagerClassLookUpOptimizationIOS enableinteropviewmanagerclasslookupoptimizationios) {
        androidId androidid = enableinteropviewmanagerclasslookupoptimizationios instanceof androidId ? (androidId) enableinteropviewmanagerclasslookupoptimizationios : null;
        if (androidid == null) {
            return;
        }
        this.extraCallback.setTitle(androidid.onNavigationEvent());
    }
}
