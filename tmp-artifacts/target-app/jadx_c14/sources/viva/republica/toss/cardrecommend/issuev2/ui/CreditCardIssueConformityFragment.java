package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.zzaq;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.post.ListItem;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.PageContext;
import o.ProtocolCompanion;
import o.RippleNode;
import o.TypographyKtExternalSyntheticLambda0;
import o.UTIL_RemoveFile;
import o.addAllCommandLine;
import o.createAdSizeApi;
import o.getDigestAlgorithms;
import o.getDispatcherokhttp;
import o.getIterationCount;
import o.getPrivacyDestinationUri;
import o.getSupportedHighSpeedResolutionsFor;
import o.getTestDevicesList;
import o.mergeParams;
import o.preFillDefault;
import o.setBodyokhttp;
import o.setByteOrder;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CreditCardIssueConformityFragment extends CardIssueBaseFragment<getIterationCount> {
    private final PageContext IAuthTabCallback;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent = {new PropertyReference1Impl<>(CreditCardIssueConformityFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCreditCardIssueConformityBinding;", 0)};
    public static final int onExtraCallback = 8;

    public CreditCardIssueConformityFragment() {
        super(R.layout.fragment_credit_card_issue_conformity);
        this.IAuthTabCallback = preFillDefault.onExtraCallbackWithResult(this, onWarmupCompleted.onNavigationEvent);
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function1<View, UTIL_RemoveFile> {
        public static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();

        onWarmupCompleted() {
            super(1, UTIL_RemoveFile.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCreditCardIssueConformityBinding;", 0);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final UTIL_RemoveFile invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return UTIL_RemoveFile.onExtraCallback(view);
        }
    }

    private final UTIL_RemoveFile onWarmupCompleted() {
        return (UTIL_RemoveFile) this.IAuthTabCallback.onExtraCallbackWithResult(this, onNavigationEvent[0]);
    }

    private final LinearLayout IAuthTabCallback() {
        LinearLayout linearLayout = onWarmupCompleted().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    private final TdsBottomCtaV1View onNavigationEvent() {
        TdsBottomCtaV1View tdsBottomCtaV1View = onWarmupCompleted().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        return tdsBottomCtaV1View;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        TdsTopV2View tdsTopV2View = onWarmupCompleted().IAuthTabCallback;
        tdsTopV2View.setUpperGap(24);
        tdsTopV2View.setLowerGap(24);
        if (readTypedObject().asInterface().length() > 0) {
            tdsTopV2View.setUpperType(TdsTopV2View.onTransact.ASSET_V1);
            getDispatcherokhttp getdispatcherokhttpAccess100 = tdsTopV2View.access100();
            if (getdispatcherokhttpAccess100 != null) {
                getdispatcherokhttpAccess100.onExtraCallbackWithResult().IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onNavigationEvent.Companion.onNavigationEvent());
                int iOnNavigationEvent = zzaq.onNavigationEvent();
                ((getSupportedHighSpeedResolutionsFor) getDispatcherokhttp.IAuthTabCallback(-1880973595, new Object[]{getdispatcherokhttpAccess100}, zzaq.onNavigationEvent(), 1880973596, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), iOnNavigationEvent)).IAuthTabCallback(setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault()));
                getdispatcherokhttpAccess100.onWarmupCompleted(readTypedObject().asInterface());
            }
        }
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        tdsTopV2View.setTitleText(readTypedObject().access000());
        tdsTopV2View.setTitleTextColor(setBodyokhttp.onExtraCallback(this).onUnminimized());
        String strIAuthTabCallbackStub = readTypedObject().IAuthTabCallbackStub();
        if (strIAuthTabCallbackStub != null && strIAuthTabCallbackStub.length() != 0) {
            tdsTopV2View.setSubtitle2Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
            tdsTopV2View.setSubtitle2TextSize(TdsTopV2View.onWarmupCompleted.SIZE_17);
            String strIAuthTabCallbackStub2 = readTypedObject().IAuthTabCallbackStub();
            if (strIAuthTabCallbackStub2 == null) {
                strIAuthTabCallbackStub2 = "";
            }
            tdsTopV2View.setSubtitle2Text(strIAuthTabCallbackStub2);
            tdsTopV2View.setSubtitle2TextColor(setBodyokhttp.onExtraCallback(this).ICustomTabsCallbackStubProxy());
        }
        LinearLayout linearLayoutIAuthTabCallback = IAuthTabCallback();
        if (readTypedObject().onWarmupCompleted() != null) {
            Context context = linearLayoutIAuthTabCallback.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
            tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1C);
            tdsListRowV1View.setCenterText1(readTypedObject().onWarmupCompleted());
            tdsListRowV1View.setBorder(true);
            tdsListRowV1View.setBorderType(ProtocolCompanion.LEFT24);
            DisplayMetrics displayMetrics = tdsListRowV1View.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            setMinWebSocketMessageToCompressokhttp.onNavigationEvent(tdsListRowV1View, varyMatches.onNavigationEvent(16, displayMetrics));
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayoutIAuthTabCallback, tdsListRowV1View);
        }
        for (String str : readTypedObject().onTransact()) {
            Context context2 = linearLayoutIAuthTabCallback.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            ListItem listItem = new ListItem(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            listItem.setText(mergeParams.IAuthTabCallback(str, false, 1, (Object) null));
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayoutIAuthTabCallback, listItem);
        }
        TdsBottomCtaV1View.setCta$default(onNavigationEvent(), readTypedObject().onExtraCallbackWithResult().onExtraCallback().onNavigationEvent(), new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueConformityFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CreditCardIssueConformityFragment.onWarmupCompleted(this.f$0, view2);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        String strOnWarmupCompleted = readTypedObject().onExtraCallbackWithResult().onWarmupCompleted();
        if (strOnWarmupCompleted != null) {
            onNavigationEvent().setTopDescription(strOnWarmupCompleted);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(CreditCardIssueConformityFragment creditCardIssueConformityFragment, View view) {
        getDigestAlgorithms<getIterationCount> getdigestalgorithmsWriteTypedObject = creditCardIssueConformityFragment.writeTypedObject();
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(creditCardIssueConformityFragment);
        CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = creditCardIssueConformityFragment.extraCallback();
        getTestDevicesList gettestdeviceslist = new getTestDevicesList(String.valueOf(System.currentTimeMillis()));
        createAdSizeApi createadsizeapiOnWarmupCompleted = creditCardIssueConformityFragment.readTypedObject().onExtraCallbackWithResult().onExtraCallback().onWarmupCompleted();
        getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnNavigationEvent, cardIssueOverviewViewModelExtraCallback, gettestdeviceslist, createadsizeapiOnWarmupCompleted != null ? createadsizeapiOnWarmupCompleted.IAuthTabCallback() : null, creditCardIssueConformityFragment.readTypedObject().onExtraCallbackWithResult().onExtraCallback().onNavigationEvent(), (Map) null, 32, (Object) null);
    }
}
