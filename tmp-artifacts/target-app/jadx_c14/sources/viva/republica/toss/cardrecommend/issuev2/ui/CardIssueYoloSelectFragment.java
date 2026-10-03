package viva.republica.toss.cardrecommend.issuev2.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AppMsgReceiver2;
import o.ExoPlayerImplExternalSyntheticLambda31;
import o.PageContext;
import o.RippleNode;
import o.UST_API_FinishAPI;
import o.access502;
import o.addAllCommandLine;
import o.deprecated_authenticator;
import o.exitAllPages;
import o.extraCommand;
import o.getBacktraceNote;
import o.getDigestAlgorithms;
import o.getPrivateExponent;
import o.getStringArrayList;
import o.matches;
import o.preFillDefault;
import o.setBodyokhttp;
import o.setHeadersokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueYoloSelectFragment;
import viva.republica.toss.cardrecommend.issuev2.ui.view.YoloSelectStepperView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueYoloSelectFragment extends CardIssueBaseFragment<getPrivateExponent> {
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallbackWithResult = {new PropertyReference1Impl<>(CardIssueYoloSelectFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCardIssueYoloSelectBinding;", 0)};
    public static final int onNavigationEvent = 8;
    private final Lazy IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private final List<onNavigationEvent> IAuthTabCallbackStub;
    private int asBinder;
    private final onWarmupCompleted asInterface;
    private final PageContext onExtraCallback;
    private final Lazy onTransact;
    private final Lazy onWarmupCompleted;

    public CardIssueYoloSelectFragment() {
        super(R.layout.fragment_card_issue_yolo_select);
        this.onExtraCallback = preFillDefault.onExtraCallbackWithResult(this, onExtraCallback.onWarmupCompleted);
        this.onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueYoloSelectFragment$$ExternalSyntheticLambda0
            public final Object invoke() {
                return CardIssueYoloSelectFragment.asBinder(this.f$0);
            }
        });
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueYoloSelectFragment$$ExternalSyntheticLambda1
            public final Object invoke() {
                return CardIssueYoloSelectFragment.asInterface(this.f$0);
            }
        });
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueYoloSelectFragment$$ExternalSyntheticLambda2
            public final Object invoke() {
                return CardIssueYoloSelectFragment.IAuthTabCallbackDefault(this.f$0);
            }
        });
        this.onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueYoloSelectFragment$$ExternalSyntheticLambda3
            public final Object invoke() {
                return CardIssueYoloSelectFragment.access100(this.f$0);
            }
        });
        this.asInterface = new onWarmupCompleted();
        this.IAuthTabCallbackStub = new ArrayList();
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, UST_API_FinishAPI> {
        public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

        onExtraCallback() {
            super(1, UST_API_FinishAPI.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCardIssueYoloSelectBinding;", 0);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final UST_API_FinishAPI invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return UST_API_FinishAPI.onExtraCallbackWithResult(view);
        }
    }

    private final UST_API_FinishAPI onNavigationEvent() {
        return (UST_API_FinishAPI) this.onExtraCallback.onExtraCallbackWithResult(this, onExtraCallbackWithResult[0]);
    }

    private final TdsBottomCtaV1View IAuthTabCallback() {
        TdsBottomCtaV1View tdsBottomCtaV1View = onNavigationEvent().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        return tdsBottomCtaV1View;
    }

    public final class onWarmupCompleted extends exitAllPages<Object> {
        private final List<IAuthTabCallback> onNavigationEvent = new ArrayList();

        public static final class onExtraCallback implements Function1<Object, Boolean> {
            public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();

            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof onNavigationEvent);
            }
        }

        public static final class onNavigationEvent implements Function1<Object, Boolean> {
            public static final onNavigationEvent onWarmupCompleted = new onNavigationEvent();

            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof IAuthTabCallback);
            }
        }

        public onWarmupCompleted() {
            access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
            int i = R.layout.item_tds_list_row_v1;
            onextracallbackwithresult.onWarmupCompleted(i);
            onextracallbackwithresult.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueYoloSelectFragment$YoloSelectAdapter$$ExternalSyntheticLambda1
                public final Object invoke(Object obj) {
                    return CardIssueYoloSelectFragment.onWarmupCompleted.onExtraCallback((RecyclerView.ViewHolder) obj);
                }
            });
            onextracallbackwithresult.IAuthTabCallback(new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueYoloSelectFragment$YoloSelectAdapter$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CardIssueYoloSelectFragment.onWarmupCompleted.onWarmupCompleted(this.f$0, (AppMsgReceiver2) obj, (CardIssueYoloSelectFragment.IAuthTabCallback) obj2, (List) obj3);
                }
            });
            if (onextracallbackwithresult.onWarmupCompleted() == null && onextracallbackwithresult.onNavigationEvent() == null) {
                onextracallbackwithresult.onExtraCallback(onNavigationEvent.onWarmupCompleted);
            }
            onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult());
            access502.onExtraCallbackWithResult onextracallbackwithresult2 = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult2.onWarmupCompleted(i);
            onextracallbackwithresult2.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueYoloSelectFragment$YoloSelectAdapter$$ExternalSyntheticLambda3
                public final Object invoke(Object obj) {
                    return CardIssueYoloSelectFragment.onWarmupCompleted.onWarmupCompleted((RecyclerView.ViewHolder) obj);
                }
            });
            onextracallbackwithresult2.IAuthTabCallback(new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueYoloSelectFragment$YoloSelectAdapter$$ExternalSyntheticLambda4
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CardIssueYoloSelectFragment.onWarmupCompleted.onWarmupCompleted((AppMsgReceiver2) obj, (CardIssueYoloSelectFragment.onNavigationEvent) obj2, (List) obj3);
                }
            });
            if (onextracallbackwithresult2.onWarmupCompleted() == null && onextracallbackwithresult2.onNavigationEvent() == null) {
                onextracallbackwithresult2.onExtraCallback(onExtraCallback.onExtraCallbackWithResult);
            }
            onExtraCallbackWithResult(onextracallbackwithresult2.onExtraCallbackWithResult());
        }

        public final List<IAuthTabCallback> IAuthTabCallback() {
            return this.onNavigationEvent;
        }

        public static Unit onExtraCallback(RecyclerView.ViewHolder viewHolder) {
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
            tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.CHECK_BOX);
            tdsListRowV1View2.setRightCheckBoxType(TdsCheckBoxV2View.onNavigationEvent.LINE_TRANSPARENT);
            TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = tdsListRowV1View2.prefetchWithMultipleUrls();
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
                tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setClickable(false);
            }
            return Unit.INSTANCE;
        }

        public static Unit onWarmupCompleted(final onWarmupCompleted onwarmupcompleted, AppMsgReceiver2 appMsgReceiver2, final IAuthTabCallback iAuthTabCallback, List list) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNull(tdsListRowV1View, "");
            TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
            if (iAuthTabCallback.onWarmupCompleted() != null) {
                tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2C);
            } else {
                tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1B);
            }
            tdsListRowV1View2.setLeftImage(deprecated_authenticator.onWarmupCompleted(iAuthTabCallback.onExtraCallbackWithResult()));
            tdsListRowV1View2.setCenterText1(iAuthTabCallback.onExtraCallback());
            tdsListRowV1View2.setCenterText2(iAuthTabCallback.onWarmupCompleted());
            tdsListRowV1View2.setRightCheckBoxChecked(onwarmupcompleted.onNavigationEvent(iAuthTabCallback));
            tdsListRowV1View2.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueYoloSelectFragment$YoloSelectAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CardIssueYoloSelectFragment.onWarmupCompleted.onExtraCallbackWithResult(this.f$0, iAuthTabCallback, view);
                }
            });
            return Unit.INSTANCE;
        }

        public static void onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted, IAuthTabCallback iAuthTabCallback, View view) {
            onwarmupcompleted.onWarmupCompleted(iAuthTabCallback);
        }

        public static Unit onWarmupCompleted(RecyclerView.ViewHolder viewHolder) {
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

        public static Unit onWarmupCompleted(AppMsgReceiver2 appMsgReceiver2, onNavigationEvent onnavigationevent, List list) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNull(tdsListRowV1View, "");
            TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
            if (onnavigationevent.onWarmupCompleted().onWarmupCompleted() != null) {
                tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2C);
            } else {
                tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1B);
            }
            tdsListRowV1View2.setLeftImage(deprecated_authenticator.onWarmupCompleted(onnavigationevent.onWarmupCompleted().onExtraCallbackWithResult()));
            tdsListRowV1View2.setCenterText1(onnavigationevent.onWarmupCompleted().onExtraCallback());
            tdsListRowV1View2.setCenterText2(onnavigationevent.onWarmupCompleted().onWarmupCompleted());
            tdsListRowV1View2.setRightBadgeText(onnavigationevent.onNavigationEvent());
            TdsBadgeV1View tdsBadgeV1ViewRequestPostMessageChannelWithExtras = tdsListRowV1View2.requestPostMessageChannelWithExtras();
            if (tdsBadgeV1ViewRequestPostMessageChannelWithExtras != null) {
                tdsBadgeV1ViewRequestPostMessageChannelWithExtras.setTheme(onnavigationevent.IAuthTabCallback());
            }
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(@NotNull IAuthTabCallback iAuthTabCallback) {
            Integer num;
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            int i = CardIssueYoloSelectFragment.this.asBinder;
            if (i == 0) {
                CardIssueYoloSelectFragment.this.onNavigationEvent(iAuthTabCallback);
                return;
            }
            if (i != 1) {
                return;
            }
            if (onNavigationEvent(iAuthTabCallback)) {
                this.onNavigationEvent.remove(iAuthTabCallback);
                Integer numValueOf = Integer.valueOf(((List) ((ExoPlayerImplExternalSyntheticLambda31) this).onWarmupCompleted).indexOf(iAuthTabCallback));
                num = numValueOf.intValue() >= 0 ? numValueOf : null;
                if (num != null) {
                    notifyItemChanged(num.intValue(), "checkbox");
                }
            } else {
                this.onNavigationEvent.add(iAuthTabCallback);
                Integer numValueOf2 = Integer.valueOf(((List) ((ExoPlayerImplExternalSyntheticLambda31) this).onWarmupCompleted).indexOf(iAuthTabCallback));
                num = numValueOf2.intValue() >= 0 ? numValueOf2 : null;
                if (num != null) {
                    notifyItemChanged(num.intValue(), "checkbox");
                }
            }
            if (this.onNavigationEvent.size() == 2) {
                CardIssueYoloSelectFragment.this.IAuthTabCallbackStubProxy();
            } else {
                CardIssueYoloSelectFragment.this.onWarmupCompleted();
            }
        }

        private final boolean onNavigationEvent(IAuthTabCallback iAuthTabCallback) {
            List<IAuthTabCallback> list = this.onNavigationEvent;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual((IAuthTabCallback) it.next(), iAuthTabCallback)) {
                    return true;
                }
            }
            return false;
        }
    }

    private final RecyclerView onExtraCallbackWithResult() {
        RecyclerView recyclerView = onNavigationEvent().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        return recyclerView;
    }

    private final TdsTopV1View IAuthTabCallbackDefault() {
        TdsTopV1View tdsTopV1View = onNavigationEvent().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsTopV1View, "");
        return tdsTopV1View;
    }

    private final YoloSelectStepperView asInterface() {
        YoloSelectStepperView yoloSelectStepperView = onNavigationEvent().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(yoloSelectStepperView, "");
        return yoloSelectStepperView;
    }

    private final SpannedString onExtraCallback() {
        return (SpannedString) this.onWarmupCompleted.getValue();
    }

    private final SpannedString onTransact() {
        return (SpannedString) this.IAuthTabCallback.getValue();
    }

    private final SpannedString IAuthTabCallbackStub() {
        return (SpannedString) this.IAuthTabCallbackDefault.getValue();
    }

    private final List<IAuthTabCallback> asBinder() {
        return (List) this.onTransact.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List access100(CardIssueYoloSelectFragment cardIssueYoloSelectFragment) {
        String string = cardIssueYoloSelectFragment.getString(R.string.app_cardrecommend_issuev2_ui___6658b85521);
        Intrinsics.checkNotNullExpressionValue(string, "");
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback("icn-shopping-color", string, cardIssueYoloSelectFragment.getString(R.string.app_cardrecommend_issuev2_ui___06dd63e335), "SHOPPING");
        String string2 = cardIssueYoloSelectFragment.getString(R.string.app_cardrecommend_issuev2_ui___6daadb891e);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        IAuthTabCallback iAuthTabCallback2 = new IAuthTabCallback("icn-cafe-color", string2, cardIssueYoloSelectFragment.getString(R.string.app_cardrecommend_issuev2_ui___dbfcdec809), "CAFE");
        String string3 = cardIssueYoloSelectFragment.getString(R.string.app_cardrecommend_issuev2_ui___e7af1ffe6f);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        IAuthTabCallback iAuthTabCallback3 = new IAuthTabCallback("icn-store-color", string3, cardIssueYoloSelectFragment.getString(R.string.app_cardrecommend_issuev2_ui___83a9ba61c7), "CONV");
        String string4 = cardIssueYoloSelectFragment.getString(R.string.app_cardrecommend_issuev2_ui___bd1b4e24de);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        IAuthTabCallback iAuthTabCallback4 = new IAuthTabCallback("icn-bread-color", string4, cardIssueYoloSelectFragment.getString(R.string.app_cardrecommend_issuev2_ui___173a8f3b3c), "BAKERY");
        String string5 = cardIssueYoloSelectFragment.getString(R.string.app_cardrecommend_issuev2_ui___e6cc255f8f);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        IAuthTabCallback iAuthTabCallback5 = new IAuthTabCallback("icn-movie-color", string5, cardIssueYoloSelectFragment.getString(R.string.app_cardrecommend_issuev2_ui___bf72eec5e7), "MOVIE");
        String string6 = cardIssueYoloSelectFragment.getString(R.string.app_cardrecommend_issuev2_ui___358f5aad8d);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        return CollectionsKt.listOf(new IAuthTabCallback[]{iAuthTabCallback, iAuthTabCallback2, iAuthTabCallback3, iAuthTabCallback4, iAuthTabCallback5, new IAuthTabCallback("icn-car-green-color", string6, null, "TAXI", 4, null)});
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        access100();
        onExtraCallbackWithResult().setAdapter(this.asInterface);
        extraCommand.IAuthTabCallback(requireBaseActivity().getOnBackPressedDispatcher(), this, false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueYoloSelectFragment$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return CardIssueYoloSelectFragment.onWarmupCompleted(this.f$0, (OnBackPressedCallback) obj);
            }
        }, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(CardIssueYoloSelectFragment cardIssueYoloSelectFragment, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        if (cardIssueYoloSelectFragment.asBinder != 0) {
            cardIssueYoloSelectFragment.access100();
        } else {
            RippleNode.onNavigationEvent(cardIssueYoloSelectFragment).access100();
        }
        return Unit.INSTANCE;
    }

    private final void access100() {
        this.asBinder = 0;
        IAuthTabCallbackDefault().setUpperText(onExtraCallback());
        this.IAuthTabCallbackStub.clear();
        this.asInterface.IAuthTabCallback().clear();
        this.asInterface.onNavigationEvent(CollectionsKt.emptyList());
        this.asInterface.notifyDataSetChanged();
        onWarmupCompleted onwarmupcompleted = this.asInterface;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = asBinder().iterator();
        while (it.hasNext()) {
            arrayList.add((IAuthTabCallback) it.next());
        }
        onwarmupcompleted.onNavigationEvent(arrayList);
        this.asInterface.notifyDataSetChanged();
        asInterface().onExtraCallbackWithResult();
        TdsBottomCtaV1View.onExtraCallback(IAuthTabCallback(), true, (Function0) null, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNavigationEvent(IAuthTabCallback iAuthTabCallback) {
        this.asBinder = 1;
        int iIndexOf = this.asInterface.onExtraCallbackWithResult().indexOf(iAuthTabCallback);
        List mutableList = CollectionsKt.toMutableList(this.asInterface.onExtraCallbackWithResult());
        mutableList.remove(iAuthTabCallback);
        this.IAuthTabCallbackStub.add(new onNavigationEvent(iAuthTabCallback, "20%", new TdsBadgeV1View.onExtraCallbackWithResult(TdsBadgeV1View.onWarmupCompleted.BLUE, TdsBadgeV1View.onExtraCallback.WEAK_ROUND, TdsBadgeV1View.IAuthTabCallback.SMALL)));
        this.asInterface.onNavigationEvent(mutableList);
        this.asInterface.notifyItemRemoved(iIndexOf);
        IAuthTabCallbackDefault().setUpperText(onTransact());
        asInterface().onNavigationEvent();
        IAuthTabCallback().onExtraCallbackWithResult(true);
        IAuthTabCallback().onNavigationEvent();
        TdsBottomCtaV1View tdsBottomCtaV1ViewIAuthTabCallback = IAuthTabCallback();
        String string = getString(R.string.next);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1ViewIAuthTabCallback, string, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueYoloSelectFragment$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return CardIssueYoloSelectFragment.onExtraCallback(this.f$0, (View) obj);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        IAuthTabCallback().setEnabledCta(false);
        onWarmupCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(CardIssueYoloSelectFragment cardIssueYoloSelectFragment, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        int i = cardIssueYoloSelectFragment.asBinder;
        if (i == 1) {
            cardIssueYoloSelectFragment.IAuthTabCallbackStubProxy();
        } else if (i == 2) {
            cardIssueYoloSelectFragment.getInterfaceDescriptor();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IAuthTabCallbackStubProxy() {
        this.asBinder = 2;
        CollectionsKt.toMutableList(this.asInterface.onExtraCallbackWithResult()).removeAll(this.asInterface.IAuthTabCallback());
        List<onNavigationEvent> list = this.IAuthTabCallbackStub;
        List<IAuthTabCallback> listIAuthTabCallback = this.asInterface.IAuthTabCallback();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIAuthTabCallback, 10));
        Iterator<T> it = listIAuthTabCallback.iterator();
        while (it.hasNext()) {
            arrayList.add(new onNavigationEvent((IAuthTabCallback) it.next(), "15%", new TdsBadgeV1View.onExtraCallbackWithResult(TdsBadgeV1View.onWarmupCompleted.GREEN, TdsBadgeV1View.onExtraCallback.WEAK_ROUND, TdsBadgeV1View.IAuthTabCallback.SMALL)));
        }
        CollectionsKt.addAll(list, arrayList);
        List<onNavigationEvent> list2 = this.IAuthTabCallbackStub;
        List<IAuthTabCallback> listAsBinder = asBinder();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listAsBinder) {
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            List<onNavigationEvent> list3 = this.IAuthTabCallbackStub;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((onNavigationEvent) it2.next()).onWarmupCompleted());
            }
            if (!arrayList3.contains(iAuthTabCallback)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList4.add(new onNavigationEvent((IAuthTabCallback) it3.next(), "10%", new TdsBadgeV1View.onExtraCallbackWithResult(TdsBadgeV1View.onWarmupCompleted.YELLOW, TdsBadgeV1View.onExtraCallback.WEAK_ROUND, TdsBadgeV1View.IAuthTabCallback.SMALL)));
        }
        CollectionsKt.addAll(list2, arrayList4);
        this.asInterface.IAuthTabCallback().clear();
        this.asInterface.onNavigationEvent(this.IAuthTabCallbackStub);
        this.asInterface.notifyDataSetChanged();
        IAuthTabCallbackDefault().setUpperText(IAuthTabCallbackStub());
        asInterface().onWarmupCompleted();
        IAuthTabCallback().asInterface().setText(getString(im.toss.uikit.R.string.uikit_confirm));
        TdsBottomCtaV1View tdsBottomCtaV1ViewIAuthTabCallback = IAuthTabCallback();
        String string = getString(R.string.app_cardrecommend_issuev2_ui___94e15db13c);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setSecondary$default(tdsBottomCtaV1ViewIAuthTabCallback, string, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueYoloSelectFragment$$ExternalSyntheticLambda4
            public final Object invoke(Object obj2) {
                return CardIssueYoloSelectFragment.onNavigationEvent(this.f$0, (View) obj2);
            }
        }, (TdsButtonV1View.asInterface) null, 4, (Object) null);
        onWarmupCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(CardIssueYoloSelectFragment cardIssueYoloSelectFragment, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        cardIssueYoloSelectFragment.access100();
        return Unit.INSTANCE;
    }

    private final void getInterfaceDescriptor() {
        getDigestAlgorithms.onExtraCallback(writeTypedObject(), RippleNode.onNavigationEvent(this), extraCallback(), new getStringArrayList(this.IAuthTabCallbackStub.get(0).onWarmupCompleted().onNavigationEvent(), this.IAuthTabCallbackStub.get(1).onWarmupCompleted().onNavigationEvent(), this.IAuthTabCallbackStub.get(2).onWarmupCompleted().onNavigationEvent()), (String) null, IAuthTabCallback().asInterface().getText().toString(), (Map) null, 40, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWarmupCompleted() {
        int i = this.asBinder;
        if (i == 0) {
            IAuthTabCallback().setEnabledCta(this.asInterface.IAuthTabCallback().size() == 1);
        } else if (i == 1) {
            IAuthTabCallback().setEnabledCta(this.asInterface.IAuthTabCallback().size() == 2);
        } else {
            if (i != 2) {
                return;
            }
            IAuthTabCallback().setEnabledCta(true);
        }
    }

    public static final class IAuthTabCallback {
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            return Intrinsics.areEqual(this.onWarmupCompleted, iAuthTabCallback.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallbackWithResult, iAuthTabCallback.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onNavigationEvent, iAuthTabCallback.onNavigationEvent) && Intrinsics.areEqual(this.onExtraCallback, iAuthTabCallback.onExtraCallback);
        }

        public int hashCode() {
            int iHashCode = this.onWarmupCompleted.hashCode();
            int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
            String str = this.onNavigationEvent;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.onExtraCallback.hashCode();
        }

        public String toString() {
            return "YoloOption(imageUrl=" + this.onWarmupCompleted + ", title=" + this.onExtraCallbackWithResult + ", subtitle=" + this.onNavigationEvent + ", type=" + this.onExtraCallback + ")";
        }

        public IAuthTabCallback(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.onWarmupCompleted = str;
            this.onExtraCallbackWithResult = str2;
            this.onNavigationEvent = str3;
            this.onExtraCallback = str4;
        }

        public /* synthetic */ IAuthTabCallback(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, str4);
        }

        public final String onExtraCallbackWithResult() {
            return this.onWarmupCompleted;
        }

        public final String onExtraCallback() {
            return this.onExtraCallbackWithResult;
        }

        public final String onWarmupCompleted() {
            return this.onNavigationEvent;
        }

        public final String onNavigationEvent() {
            return this.onExtraCallback;
        }
    }

    public static final class onNavigationEvent {
        private final TdsBadgeV1View.onExtraCallbackWithResult onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final IAuthTabCallback onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            return Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent) && Intrinsics.areEqual(this.onExtraCallbackWithResult, onnavigationevent.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback);
        }

        public int hashCode() {
            return (((this.onNavigationEvent.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.onExtraCallback.hashCode();
        }

        public String toString() {
            return "SelectedYolo(yoloOption=" + this.onNavigationEvent + ", badgeString=" + this.onExtraCallbackWithResult + ", badgeColor=" + this.onExtraCallback + ")";
        }

        public onNavigationEvent(@NotNull IAuthTabCallback iAuthTabCallback, @NotNull String str, @NotNull TdsBadgeV1View.onExtraCallbackWithResult onextracallbackwithresult) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            this.onNavigationEvent = iAuthTabCallback;
            this.onExtraCallbackWithResult = str;
            this.onExtraCallback = onextracallbackwithresult;
        }

        public final IAuthTabCallback onWarmupCompleted() {
            return this.onNavigationEvent;
        }

        public final String onNavigationEvent() {
            return this.onExtraCallbackWithResult;
        }

        public final TdsBadgeV1View.onExtraCallbackWithResult IAuthTabCallback() {
            return this.onExtraCallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpannedString asBinder(CardIssueYoloSelectFragment cardIssueYoloSelectFragment) throws IOException {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{setBodyokhttp.onExtraCallback(cardIssueYoloSelectFragment).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "20% ");
        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) cardIssueYoloSelectFragment.getString(R.string.app_cardrecommend_issuev2_ui___19e550ef49)).append('\n');
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{setBodyokhttp.onExtraCallback(cardIssueYoloSelectFragment).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) cardIssueYoloSelectFragment.getString(R.string.app_cardrecommend_issuev2_ui___fb62b44d2d));
        spannableStringBuilder.setSpan(foregroundColorSpan2, length3, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) cardIssueYoloSelectFragment.getString(R.string.app_cardrecommend_issuev2_ui___534f3b4690));
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return new SpannedString(spannableStringBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpannedString asInterface(CardIssueYoloSelectFragment cardIssueYoloSelectFragment) throws IOException {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{setBodyokhttp.onExtraCallback(cardIssueYoloSelectFragment).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "15% ");
        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) cardIssueYoloSelectFragment.getString(R.string.app_cardrecommend_issuev2_ui___19e550ef49)).append('\n');
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{setBodyokhttp.onExtraCallback(cardIssueYoloSelectFragment).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) cardIssueYoloSelectFragment.getString(R.string.app_cardrecommend_issuev2_ui___2f796b9bab));
        spannableStringBuilder.setSpan(foregroundColorSpan2, length3, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) cardIssueYoloSelectFragment.getString(R.string.app_cardrecommend_issuev2_ui___534f3b4690));
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return new SpannedString(spannableStringBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpannedString IAuthTabCallbackDefault(CardIssueYoloSelectFragment cardIssueYoloSelectFragment) throws IOException {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) cardIssueYoloSelectFragment.getString(R.string.app_cardrecommend_issuev2_ui___8ed27c053b));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{setBodyokhttp.onExtraCallback(cardIssueYoloSelectFragment).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "10% ");
        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) cardIssueYoloSelectFragment.getString(R.string.app_cardrecommend_issuev2_ui___2add0ad1c0)).append('\n');
        spannableStringBuilder.append((CharSequence) cardIssueYoloSelectFragment.getString(R.string.app_cardrecommend_issuev2_ui___ef01019e87));
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return new SpannedString(spannableStringBuilder);
    }
}
