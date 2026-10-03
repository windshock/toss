package o;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppMsgReceiver2;
import o.access502;
import o.getDataGroupNumber;
import o.getDatagroupHash;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getDataGroupNumber extends exitAllPages<getDatagroupHash> {
    public static final int IAuthTabCallback = exitAllPages.onExtraCallbackWithResult;
    private final Function1<getDatagroupHash, Unit> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public getDataGroupNumber(@NotNull Function1<? super getDatagroupHash, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onNavigationEvent = function1;
        access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult.onWarmupCompleted(R.layout.item_tds_list_row_v1);
        onextracallbackwithresult.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.select.TripleInLocaSelectAdapter$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return getDataGroupNumber.onNavigationEvent((RecyclerView.ViewHolder) obj);
            }
        });
        onextracallbackwithresult.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.select.TripleInLocaSelectAdapter$$ExternalSyntheticLambda1
            public final Object invoke(Object obj, Object obj2) {
                return getDataGroupNumber.onExtraCallback(this.f$0, (AppMsgReceiver2) obj, (getDatagroupHash) obj2);
            }
        });
        if (onextracallbackwithresult.onWarmupCompleted() == null && onextracallbackwithresult.onNavigationEvent() == null) {
            onextracallbackwithresult.onExtraCallback(onWarmupCompleted.onWarmupCompleted);
        }
        onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult());
    }

    public static Unit onNavigationEvent(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        DisplayMetrics displayMetrics = tdsListRowV1View2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
        DisplayMetrics displayMetrics2 = tdsListRowV1View2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        tdsListRowV1View2.setLeftImageSize(iOnNavigationEvent, varyMatches.onNavigationEvent(24, displayMetrics2));
        tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.BADGE);
        return Unit.INSTANCE;
    }

    public static Unit onExtraCallback(final getDataGroupNumber getdatagroupnumber, AppMsgReceiver2 appMsgReceiver2, final getDatagroupHash getdatagrouphash) {
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(getdatagrouphash, "");
        TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2A);
        tdsListRowV1View2.setLeftImage(getdatagrouphash.onNavigationEvent());
        tdsListRowV1View2.setCenterText1(getdatagrouphash.onWarmupCompleted());
        tdsListRowV1View2.setCenterText2(getdatagrouphash.IAuthTabCallback());
        boolean z = true;
        if (getdatagrouphash.onExtraCallback() != null) {
            tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.BADGE);
            tdsListRowV1View2.setRightBadgeText(getdatagrouphash.onExtraCallback().onNavigationEvent());
            TdsBadgeV1View tdsBadgeV1ViewRequestPostMessageChannelWithExtras = tdsListRowV1View2.requestPostMessageChannelWithExtras();
            if (tdsBadgeV1ViewRequestPostMessageChannelWithExtras != null) {
                tdsBadgeV1ViewRequestPostMessageChannelWithExtras.setTheme(getdatagrouphash.onExtraCallback().onExtraCallback());
            }
        } else if (getdatagrouphash.IAuthTabCallbackStub()) {
            tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.CHECK_BOX);
            tdsListRowV1View2.setRightCheckBoxType(TdsCheckBoxV2View.onNavigationEvent.LINE);
            tdsListRowV1View2.setRightCheckBoxChecked(true);
        } else {
            tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.NONE);
        }
        if (getdatagrouphash.onExtraCallback() == null) {
            tdsListRowV1View2.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.select.TripleInLocaSelectAdapter$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    getDataGroupNumber.onExtraCallback(this.f$0, getdatagrouphash, view);
                }
            });
        } else {
            tdsListRowV1View2.setOnClickListener((View.OnClickListener) null);
            z = false;
        }
        tdsListRowV1View2.setClickable(z);
        return Unit.INSTANCE;
    }

    public static final class onWarmupCompleted implements Function1<Object, Boolean> {
        public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof getDatagroupHash);
        }
    }

    public static void onExtraCallback(getDataGroupNumber getdatagroupnumber, getDatagroupHash getdatagrouphash, View view) {
        getdatagroupnumber.onNavigationEvent.invoke(getdatagrouphash);
    }
}
