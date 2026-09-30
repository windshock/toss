package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.setResultData;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setResultData extends RecyclerView.Adapter<onExtraCallbackWithResult> {
    private final Function1<getHandle, Unit> onNavigationEvent;
    private final List<getHandle> onWarmupCompleted;

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public onExtraCallbackWithResult onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, BuildConfig.FLAVOR);
        C0015getCAPubs c0015getCAPubsIAuthTabCallback = C0015getCAPubs.IAuthTabCallback(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c0015getCAPubsIAuthTabCallback, BuildConfig.FLAVOR);
        return new onExtraCallbackWithResult(c0015getCAPubsIAuthTabCallback);
    }

    public int getItemCount() {
        return this.onWarmupCompleted.size();
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull onExtraCallbackWithResult onextracallbackwithresult, int i) {
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, BuildConfig.FLAVOR);
        final getHandle gethandle = this.onWarmupCompleted.get(i);
        C0015getCAPubs c0015getCAPubsOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted();
        FrameLayout root = c0015getCAPubsOnWarmupCompleted.getRoot();
        root.setContentDescription(gethandle.IAuthTabCallback() + " 버튼");
        root.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.account.agreement.adapter.NotExpandableTermsAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setResultData.onExtraCallback(this.f$0, gethandle, view);
            }
        });
        c0015getCAPubsOnWarmupCompleted.onExtraCallbackWithResult.setText(gethandle.IAuthTabCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(setResultData setresultdata, getHandle gethandle, View view) {
        setresultdata.onNavigationEvent.invoke(gethandle);
    }

    public static final class onExtraCallbackWithResult extends RecyclerView.ViewHolder {
        private final C0015getCAPubs writeTypedObject;

        public final C0015getCAPubs onWarmupCompleted() {
            return this.writeTypedObject;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(@NotNull C0015getCAPubs c0015getCAPubs) {
            super(c0015getCAPubs.getRoot());
            Intrinsics.checkNotNullParameter(c0015getCAPubs, BuildConfig.FLAVOR);
            this.writeTypedObject = c0015getCAPubs;
        }
    }
}
