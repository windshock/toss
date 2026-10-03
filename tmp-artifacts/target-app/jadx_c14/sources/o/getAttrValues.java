package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class getAttrValues extends RecyclerView.Adapter<RecipientIdentifier<getOther>> {
    private final List<getOther> onWarmupCompleted = new ArrayList();

    public abstract RecipientIdentifier<getOther> onExtraCallbackWithResult(@NotNull View view, @NotNull toASN1EncodableVector toasn1encodablevector);

    public getAttrValues() {
        setHasStableIds(true);
    }

    public final List<getOther> onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public int getItemViewType(int i) {
        return this.onWarmupCompleted.get(i).onTransact().ordinal();
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public RecipientIdentifier<getOther> onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        toASN1EncodableVector toasn1encodablevectorIAuthTabCallback = toASN1EncodableVector.Companion.IAuthTabCallback(i);
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(toasn1encodablevectorIAuthTabCallback.getResId(), viewGroup, false);
        Intrinsics.checkNotNull(viewInflate);
        return onExtraCallbackWithResult(viewInflate, toasn1encodablevectorIAuthTabCallback);
    }

    public final void onNavigationEvent(@NotNull List<? extends getOther> list) {
        Intrinsics.checkNotNullParameter(list, "");
        synchronized (this.onWarmupCompleted) {
            this.onWarmupCompleted.clear();
            this.onWarmupCompleted.addAll(list);
            notifyDataSetChanged();
            Unit unit = Unit.INSTANCE;
        }
    }

    public int getItemCount() {
        return this.onWarmupCompleted.size();
    }

    public long getItemId(int i) {
        return this.onWarmupCompleted.get(i).hashCode();
    }
}
