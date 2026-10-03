package o;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1T03View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.access502;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;
import viva.republica.toss.common.accountchooser.AbsAccountChooserActivity;
import viva.republica.toss.common.accountchooser.AccountChooserAdapter$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getPathLenConstraint extends exitAllPages<Object> {
    private deserializeLongCollection<KeyBoardVisiblePoint> IAuthTabCallback;
    private final boolean asBinder;
    private final String onNavigationEvent;
    private final AbsAccountChooserActivity.onExtraCallback onTransact;

    public static final class IAuthTabCallback implements Function1<Object, Boolean> {
        public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof AbsAccountChooserActivity.onExtraCallbackWithResult);
        }
    }

    public static final class onExtraCallbackWithResult implements Function1<Object, Boolean> {
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof KeyBoardVisiblePoint);
        }
    }

    public static final class onWarmupCompleted implements Function1<Object, Boolean> {
        public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof AbsAccountChooserActivity.onNavigationEvent);
        }
    }

    public getPathLenConstraint(boolean z, @NotNull String str, @NotNull AbsAccountChooserActivity.onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.asBinder = z;
        this.onNavigationEvent = str;
        this.onTransact = onextracallback;
        onExtraCallbackWithResult(new access502.onNavigationEvent().onExtraCallbackWithResult(onExtraCallbackWithResult.onExtraCallbackWithResult).onNavigationEvent(R.layout.item_tds_list_row_v1_legacy).onExtraCallback(new AccountChooserAdapter$.ExternalSyntheticLambda0(this)).IAuthTabCallback());
        onExtraCallbackWithResult(new access502.onNavigationEvent().onExtraCallbackWithResult(onWarmupCompleted.onExtraCallback).onNavigationEvent(R.layout.row_account_chooser_add).onExtraCallback(new AccountChooserAdapter$.ExternalSyntheticLambda1(this)).IAuthTabCallback());
        onExtraCallbackWithResult(new access502.onNavigationEvent().onExtraCallbackWithResult(IAuthTabCallback.onExtraCallbackWithResult).onNavigationEvent(R.layout.account_chooser_title_view_default).onExtraCallback(new AccountChooserAdapter$.ExternalSyntheticLambda2()).IAuthTabCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(getPathLenConstraint getpathlenconstraint, AppMsgReceiver2 appMsgReceiver2, KeyBoardVisiblePoint keyBoardVisiblePoint) {
        Object objOnExtraCallback;
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setLeftImage(issueCertV3.onNavigationEvent(keyBoardVisiblePoint, tdsListRowV1View2.getContext(), 40.0f, true, (Boolean) null, 8, (Object) null));
        tdsListRowV1View2.setCenterText1(issueCertV3.onNavigationEvent(keyBoardVisiblePoint));
        if (getpathlenconstraint.asBinder) {
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
            objOnExtraCallback = issueCertV3.onExtraCallback(-1624867189, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1624867189, new Object[]{keyBoardVisiblePoint, false, 0L, 0L, 7, null}, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        } else {
            int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
            objOnExtraCallback = issueCertV3.onExtraCallback(-212427217, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, 212427218, new Object[]{keyBoardVisiblePoint}, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3);
        }
        tdsListRowV1View2.setCenterText2((String) objOnExtraCallback);
        tdsListRowV1View2.setRightArrow(false);
        tdsListRowV1View2.setOnClickListener(new AccountChooserAdapter$.ExternalSyntheticLambda4(getpathlenconstraint, keyBoardVisiblePoint));
        deserializeLongCollection<KeyBoardVisiblePoint> deserializelongcollection = getpathlenconstraint.IAuthTabCallback;
        if (deserializelongcollection != null) {
            tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.CHECK_BOX);
            tdsListRowV1View2.setRightCheckBoxType(TdsCheckBoxV2View.onNavigationEvent.LINE);
            TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = tdsListRowV1View2.prefetchWithMultipleUrls();
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
                tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setClickable(false);
            }
            tdsListRowV1View2.setRightCheckBoxChecked(deserializelongcollection.test(keyBoardVisiblePoint));
        }
        return Unit.INSTANCE;
    }

    public static void onExtraCallback(getPathLenConstraint getpathlenconstraint, KeyBoardVisiblePoint keyBoardVisiblePoint, View view) {
        getpathlenconstraint.onTransact.onExtraCallbackWithResult(keyBoardVisiblePoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(getPathLenConstraint getpathlenconstraint, AppMsgReceiver2 appMsgReceiver2, AbsAccountChooserActivity.onNavigationEvent onnavigationevent) {
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        TdsButtonV1View tdsButtonV1ViewFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(R.id.cta_button);
        if (tdsButtonV1ViewFindViewById != null) {
            if (getpathlenconstraint.onNavigationEvent.length() > 0) {
                tdsButtonV1ViewFindViewById.setText(getpathlenconstraint.onNavigationEvent);
            }
            tdsButtonV1ViewFindViewById.setOnClickListener(new AccountChooserAdapter$.ExternalSyntheticLambda3(getpathlenconstraint));
        }
        return Unit.INSTANCE;
    }

    public static void onNavigationEvent(getPathLenConstraint getpathlenconstraint, View view) {
        getpathlenconstraint.onTransact.IAuthTabCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(AppMsgReceiver2 appMsgReceiver2, AbsAccountChooserActivity.onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        int i = R.id.description1;
        TdsTopV1T03View tdsTopV1T03ViewFindViewById = (TdsTopV1T03View) appMsgReceiver2.onWarmupCompleted().get(i);
        if (tdsTopV1T03ViewFindViewById == null) {
            tdsTopV1T03ViewFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i);
            if (tdsTopV1T03ViewFindViewById != null) {
                appMsgReceiver2.onWarmupCompleted().put(i, tdsTopV1T03ViewFindViewById);
            } else {
                appMsgReceiver2.onWarmupCompleted().remove(i);
            }
        }
        if (tdsTopV1T03ViewFindViewById != null) {
            if (onextracallbackwithresult.onExtraCallbackWithResult().length() > 0) {
                tdsTopV1T03ViewFindViewById.setText(onextracallbackwithresult.onExtraCallbackWithResult());
                tdsTopV1T03ViewFindViewById.setVisibility(0);
            } else {
                tdsTopV1T03ViewFindViewById.setVisibility(8);
            }
        }
        int i2 = R.id.description2;
        TextView textView = (TextView) appMsgReceiver2.onWarmupCompleted().get(i2);
        if (textView == null) {
            textView = (TextView) ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i2);
            if (textView != null) {
                appMsgReceiver2.onWarmupCompleted().put(i2, textView);
            } else {
                appMsgReceiver2.onWarmupCompleted().remove(i2);
            }
        }
        if (textView != null) {
            if (onextracallbackwithresult.IAuthTabCallback().length() > 0) {
                textView.setText(onextracallbackwithresult.IAuthTabCallback());
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }

    public final void onExtraCallbackWithResult(@NotNull deserializeLongCollection<KeyBoardVisiblePoint> deserializelongcollection) {
        Intrinsics.checkNotNullParameter(deserializelongcollection, "");
        this.IAuthTabCallback = deserializelongcollection;
    }
}
