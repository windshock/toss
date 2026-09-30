package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.SearchBarKtExternalSyntheticLambda5;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppNode<V extends SearchBarKtExternalSyntheticLambda5> extends RecyclerView.ViewHolder {
    private static int ICustomTabsCallback = 1;
    private static int writeTypedObject;
    private final V extraCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppNode(@NotNull V v) {
        super(v.getRoot());
        Intrinsics.checkNotNullParameter(v, "");
        this.extraCallback = v;
    }

    public final V onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 45;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return this.extraCallback;
        }
        throw null;
    }
}
