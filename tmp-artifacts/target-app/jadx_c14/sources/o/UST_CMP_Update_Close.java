package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.NativeAdLayout;
import o.UST_CMP_Update_Close;
import o.UST_CRYPT_VerifyMAC;
import o.UST_CRYPT_VerifySign;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class UST_CMP_Update_Close<VH extends RecyclerView.ViewHolder & UST_CRYPT_VerifyMAC<T>, T extends NativeAdLayout & UST_CRYPT_VerifySign> extends RecyclerView.OnScrollListener {
    private deserializeUriNullableCollection IAuthTabCallback;
    private final Function1<T, Unit> onExtraCallback;
    private final CopyOnWriteArraySet<Long> onExtraCallbackWithResult;
    private final UST_CMP_UpdateCertificate<VH, T> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public UST_CMP_Update_Close(@NotNull UST_CMP_UpdateCertificate<VH, T> uST_CMP_UpdateCertificate, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(uST_CMP_UpdateCertificate, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onNavigationEvent = uST_CMP_UpdateCertificate;
        this.onExtraCallback = function1;
        this.onExtraCallbackWithResult = new CopyOnWriteArraySet<>();
    }

    public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onScrollStateChanged(recyclerView, i);
        try {
            if (i == 0) {
                IAuthTabCallback(recyclerView);
            } else {
                onWarmupCompleted();
            }
        } catch (Exception unused) {
        }
    }

    private final void IAuthTabCallback(RecyclerView recyclerView) {
        int iFindLastCompletelyVisibleItemPosition;
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "");
        LinearLayoutManager linearLayoutManager = layoutManager;
        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        if (iFindFirstCompletelyVisibleItemPosition == -1 || (iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition()) == -1) {
            return;
        }
        onWarmupCompleted();
        if (iFindFirstCompletelyVisibleItemPosition <= iFindLastCompletelyVisibleItemPosition) {
            while (true) {
                this.onExtraCallbackWithResult.add(Long.valueOf(this.onNavigationEvent.getItemId(iFindFirstCompletelyVisibleItemPosition)));
                if (iFindFirstCompletelyVisibleItemPosition == iFindLastCompletelyVisibleItemPosition) {
                    break;
                } else {
                    iFindFirstCompletelyVisibleItemPosition++;
                }
            }
        }
        writeRaw writerawOnExtraCallback = writeRaw.onExtraCallback(1L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallback, "");
        this.IAuthTabCallback = setMessageBytes.onExtraCallbackWithResult(writerawOnExtraCallback, new Function1() { // from class: viva.republica.toss.credit.commons.CreditImpressionLogger$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return UST_CMP_Update_Close.onNavigationEvent((Throwable) obj);
            }
        }, new Function1() { // from class: viva.republica.toss.credit.commons.CreditImpressionLogger$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return UST_CMP_Update_Close.onNavigationEvent(this.f$0, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(UST_CMP_Update_Close uST_CMP_Update_Close, Long l) {
        for (Long l2 : uST_CMP_Update_Close.onExtraCallbackWithResult) {
            Function1<T, Unit> function1 = uST_CMP_Update_Close.onExtraCallback;
            UST_CMP_UpdateCertificate<VH, T> uST_CMP_UpdateCertificate = uST_CMP_Update_Close.onNavigationEvent;
            Intrinsics.checkNotNull(l2);
            function1.invoke(uST_CMP_UpdateCertificate.onExtraCallback(uST_CMP_UpdateCertificate.onNavigationEvent(l2.longValue())));
        }
        uST_CMP_Update_Close.onExtraCallbackWithResult.clear();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    private final void onWarmupCompleted() {
        if (this.onExtraCallbackWithResult.size() > 0) {
            zzbr.onWarmupCompleted(this.IAuthTabCallback);
            this.onExtraCallbackWithResult.clear();
        }
    }
}
