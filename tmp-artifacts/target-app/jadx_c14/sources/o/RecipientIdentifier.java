package o;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.getOther;
import o.toHashtable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class RecipientIdentifier<T extends getOther> extends RecyclerView.ViewHolder {
    private View extraCallback;

    public void IAuthTabCallback(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipientIdentifier(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.extraCallback = view;
    }

    public final View IAuthTabCallback() {
        return this.extraCallback;
    }

    public void onExtraCallbackWithResult(@NotNull T t, @Nullable toHashtable.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(t, "");
        IAuthTabCallback(t);
    }

    public final Context onExtraCallbackWithResult() {
        Context context = ((RecyclerView.ViewHolder) this).onNavigationEvent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return context;
    }
}
