package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.ReadableArrayBuilder;
import viva.republica.toss.R;
import viva.republica.toss.network.model.transfer.PredictedBanks;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ReadableArrayBuilder extends exitAllPages<PredictedBanks.Bank> {
    public static final int IAuthTabCallback = exitAllPages.onExtraCallbackWithResult;
    private final Function1<PredictedBanks.Bank, Unit> onNavigationEvent;

    public static Unit onExtraCallback(final ReadableArrayBuilder readableArrayBuilder, AppMsgReceiver2 appMsgReceiver2, final PredictedBanks.Bank bank) {
        Intrinsics.checkNotNullParameter(appMsgReceiver2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(bank, BuildConfig.FLAVOR);
        int i = R.id.icon;
        TdsImageView tdsImageView = (TdsImageView) appMsgReceiver2.onWarmupCompleted().get(i);
        if (tdsImageView == null) {
            tdsImageView = (TdsImageView) ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i);
            if (tdsImageView != null) {
                appMsgReceiver2.onWarmupCompleted().put(i, tdsImageView);
            } else {
                appMsgReceiver2.onWarmupCompleted().remove(i);
            }
        }
        TdsImageView tdsImageView2 = tdsImageView;
        if (tdsImageView2 != null) {
            TdsImageView.setImage$default(tdsImageView2, bank.IAuthTabCallback(), (Function1) null, (Function1) null, 6, (Object) null);
        }
        int i2 = R.id.name;
        BaseTextView baseTextViewFindViewById = (BaseTextView) appMsgReceiver2.onWarmupCompleted().get(i2);
        if (baseTextViewFindViewById == null) {
            baseTextViewFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i2);
            if (baseTextViewFindViewById != null) {
                appMsgReceiver2.onWarmupCompleted().put(i2, baseTextViewFindViewById);
            } else {
                appMsgReceiver2.onWarmupCompleted().remove(i2);
            }
        }
        if (baseTextViewFindViewById != null) {
            baseTextViewFindViewById.setText(bank.onExtraCallback());
        }
        ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.send.v4.receiver.account.BankPerdictAdapter$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReadableArrayBuilder.onNavigationEvent(this.f$0, bank, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static void onNavigationEvent(ReadableArrayBuilder readableArrayBuilder, PredictedBanks.Bank bank, View view) {
        readableArrayBuilder.onNavigationEvent.invoke(bank);
    }
}
