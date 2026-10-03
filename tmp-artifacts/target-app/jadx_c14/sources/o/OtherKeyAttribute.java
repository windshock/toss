package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class OtherKeyAttribute extends RecipientIdentifier<getCertificates> {
    private final TdsListRowV1View writeTypedObject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtherKeyAttribute(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.writeTypedObject = ((RecyclerView.ViewHolder) this).onNavigationEvent.findViewById(R.id.list_row);
    }

    @Override // o.RecipientIdentifier
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void IAuthTabCallback(@NotNull getCertificates getcertificates) {
        Intrinsics.checkNotNullParameter(getcertificates, "");
        super.IAuthTabCallback(getcertificates);
        Function1<TdsListRowV1View, Unit> function1OnWarmupCompleted = getcertificates.onWarmupCompleted();
        TdsListRowV1View tdsListRowV1View = this.writeTypedObject;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        function1OnWarmupCompleted.invoke(tdsListRowV1View);
    }
}
