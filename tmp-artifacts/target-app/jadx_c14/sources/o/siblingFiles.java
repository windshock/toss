package o;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.inventory_sdk.ui.view.InventoryAdView;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class siblingFiles extends enableNativeCSSParsing {
    public void onExtraCallback(@Nullable enableInteropViewManagerClassLookUpOptimizationIOS enableinteropviewmanagerclasslookupoptimizationios) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public siblingFiles(@NotNull ViewGroup viewGroup, @NotNull zzdt zzdtVar, @NotNull decEnvelopedData decenvelopeddata) {
        super(decenvelopeddata);
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(zzdtVar, "");
        Intrinsics.checkNotNullParameter(decenvelopeddata, "");
        boolean zContains = CollectionsKt.listOf(new zzdt[]{zzdt.FANGIRL_BOX_DETAIL, zzdt.HENEM_BOX_DETAIL}).contains(zzdtVar);
        View view = decenvelopeddata.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(zContains ? 8 : 0);
        if (zContains) {
            InventoryAdView inventoryAdView = decenvelopeddata.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(inventoryAdView, "");
            DisplayMetrics displayMetrics = ((RecyclerView.ViewHolder) this).onNavigationEvent.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            InventoryAdView.setCardTheme$default(inventoryAdView, true, (Integer) null, 0, 0, 0, 0, varyMatches.onNavigationEvent(18, displayMetrics), (InventoryAdView.onExtraCallbackWithResult) null, 190, (Object) null);
            return;
        }
        InventoryAdView inventoryAdView2 = decenvelopeddata.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(inventoryAdView2, "");
        InventoryAdView.setCardTheme$default(inventoryAdView2, false, (Integer) null, 0, 0, 0, 0, 0, (InventoryAdView.onExtraCallbackWithResult) null, 254, (Object) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ siblingFiles(ViewGroup viewGroup, zzdt zzdtVar, decEnvelopedData decenvelopeddata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            ViewDataBinding viewDataBindingOnWarmupCompleted = ContextMenuAreaKtExternalSyntheticLambda0.onWarmupCompleted(LayoutInflater.from(viewGroup.getContext()), toRealPath.onNavigationEvent.INVENTORY_SDK.getLayoutResId(), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewDataBindingOnWarmupCompleted, "");
            decenvelopeddata = (decEnvelopedData) viewDataBindingOnWarmupCompleted;
        }
        this(viewGroup, zzdtVar, decenvelopeddata);
    }
}
