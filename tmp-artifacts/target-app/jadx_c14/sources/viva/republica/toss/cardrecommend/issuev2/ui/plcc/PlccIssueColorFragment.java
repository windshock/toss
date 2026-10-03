package viva.republica.toss.cardrecommend.issuev2.ui.plcc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.list.agreements.v1.TdsAgreementRowV1T04View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.PKCS12PBEParams;
import o.PageRenderReadyListener;
import o.RippleNode;
import o.TypographyKtExternalSyntheticLambda0;
import o.X509Certificate;
import o.addAllCommandLine;
import o.getDigestAlgorithms;
import o.getWrite;
import o.isDebuggerOn;
import o.onJsBridgeReady;
import o.preFillDefault;
import o.setMinWebSocketMessageToCompressokhttp;
import o.toCircle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment;
import viva.republica.toss.plcc.view.showcase.PlccShowcaseView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PlccIssueColorFragment extends CardIssueBaseFragment<PKCS12PBEParams> {
    private toCircle.IAuthTabCallback IAuthTabCallback;
    private final PageRenderReadyListener onNavigationEvent;
    private List<? extends Pair<? extends toCircle.IAuthTabCallback, ? extends ImageView>> onWarmupCompleted;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallbackWithResult = {new PropertyReference1Impl<>(PlccIssueColorFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentPlccIssueColorBinding;", 0)};
    public static final int onExtraCallback = 8;

    public PlccIssueColorFragment() {
        super(R.layout.fragment_plcc_issue_color);
        this.onNavigationEvent = preFillDefault.IAuthTabCallback(this, IAuthTabCallback.IAuthTabCallback);
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function1<View, X509Certificate> {
        public static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();

        IAuthTabCallback() {
            super(1, X509Certificate.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentPlccIssueColorBinding;", 0);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final X509Certificate invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return X509Certificate.IAuthTabCallback(view);
        }
    }

    private final X509Certificate onExtraCallback() {
        return (X509Certificate) this.onNavigationEvent.onNavigationEvent(this, onExtraCallbackWithResult[0]);
    }

    private final void onWarmupCompleted(toCircle.IAuthTabCallback iAuthTabCallback) {
        X509Certificate x509CertificateOnExtraCallback;
        TdsAgreementRowV1T04View tdsAgreementRowV1T04View;
        this.IAuthTabCallback = iAuthTabCallback;
        List<? extends Pair<? extends toCircle.IAuthTabCallback, ? extends ImageView>> list = this.onWarmupCompleted;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ((View) pair.getSecond()).setVisibility(pair.getFirst() != iAuthTabCallback ? 4 : 0);
            }
        }
        if (iAuthTabCallback == null || (x509CertificateOnExtraCallback = onExtraCallback()) == null || (tdsAgreementRowV1T04View = x509CertificateOnExtraCallback.IAuthTabCallback) == null) {
            return;
        }
        onWarmupCompleted(iAuthTabCallback, tdsAgreementRowV1T04View.onPostMessage());
        onNavigationEvent(iAuthTabCallback);
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        onExtraCallbackWithResult();
    }

    private final void onExtraCallbackWithResult() {
        TdsBottomCtaV1View tdsBottomCtaV1View;
        TdsButtonV1View tdsButtonV1ViewAsInterface;
        final TdsAgreementRowV1T04View tdsAgreementRowV1T04View;
        LinearLayout linearLayout;
        EnumEntries<toCircle.IAuthTabCallback> entries = toCircle.IAuthTabCallback.getEntries();
        toCircle.IAuthTabCallback iAuthTabCallbackValueOf = toCircle.IAuthTabCallback.valueOf(readTypedObject().onWarmupCompleted().onExtraCallbackWithResult());
        onWarmupCompleted(iAuthTabCallbackValueOf);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
        Iterator it = entries.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            final toCircle.IAuthTabCallback iAuthTabCallback = (toCircle.IAuthTabCallback) it.next();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            int i = R.layout.plcc_card_style_icon;
            X509Certificate x509CertificateOnExtraCallback = onExtraCallback();
            View viewOnWarmupCompleted = onJsBridgeReady.onWarmupCompleted(contextRequireContext, i, x509CertificateOnExtraCallback != null ? x509CertificateOnExtraCallback.onNavigationEvent : null, false);
            ImageView imageView = (ImageView) viewOnWarmupCompleted.findViewById(R.id.selectedCircle);
            TdsImageView tdsImageViewFindViewById = viewOnWarmupCompleted.findViewById(R.id.styleIcon);
            Intrinsics.checkNotNullExpressionValue(tdsImageViewFindViewById, "");
            TdsImageView.setImage$default(tdsImageViewFindViewById, iAuthTabCallback.getStyleIconUrl(), (Function1) null, (Function1) null, 6, (Object) null);
            viewOnWarmupCompleted.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.plcc.PlccIssueColorFragment$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlccIssueColorFragment.IAuthTabCallback(this.f$0, iAuthTabCallback, view);
                }
            });
            if (iAuthTabCallback == iAuthTabCallbackValueOf) {
                Intrinsics.checkNotNull(imageView);
                imageView.setVisibility(0);
            }
            X509Certificate x509CertificateOnExtraCallback2 = onExtraCallback();
            if (x509CertificateOnExtraCallback2 != null && (linearLayout = x509CertificateOnExtraCallback2.onNavigationEvent) != null) {
                linearLayout.addView(viewOnWarmupCompleted);
            }
            arrayList.add(getWrite.IAuthTabCallback(iAuthTabCallback, imageView));
        }
        this.onWarmupCompleted = arrayList;
        X509Certificate x509CertificateOnExtraCallback3 = onExtraCallback();
        if (x509CertificateOnExtraCallback3 != null && (tdsAgreementRowV1T04View = x509CertificateOnExtraCallback3.IAuthTabCallback) != null) {
            BaseTextView baseTextViewOnActivityResized = tdsAgreementRowV1T04View.onActivityResized();
            baseTextViewOnActivityResized.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            Intrinsics.checkNotNull(baseTextViewOnActivityResized);
            ViewGroup.LayoutParams layoutParams = baseTextViewOnActivityResized.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(baseTextViewOnActivityResized, marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
            tdsAgreementRowV1T04View.extraCallbackWithResult().setOnCheckedChangeListener(new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.plcc.PlccIssueColorFragment$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return PlccIssueColorFragment.IAuthTabCallback(this.f$0, (TdsCheckBoxV2View) obj, ((Boolean) obj2).booleanValue());
                }
            });
            tdsAgreementRowV1T04View.setChecked(true);
            tdsAgreementRowV1T04View.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.plcc.PlccIssueColorFragment$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlccIssueColorFragment.onWarmupCompleted(tdsAgreementRowV1T04View, view);
                }
            });
        }
        X509Certificate x509CertificateOnExtraCallback4 = onExtraCallback();
        if (x509CertificateOnExtraCallback4 == null || (tdsBottomCtaV1View = x509CertificateOnExtraCallback4.onExtraCallbackWithResult) == null || (tdsButtonV1ViewAsInterface = tdsBottomCtaV1View.asInterface()) == null) {
            return;
        }
        tdsButtonV1ViewAsInterface.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.plcc.PlccIssueColorFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlccIssueColorFragment.onWarmupCompleted(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(PlccIssueColorFragment plccIssueColorFragment, toCircle.IAuthTabCallback iAuthTabCallback, View view) {
        plccIssueColorFragment.onWarmupCompleted(iAuthTabCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(PlccIssueColorFragment plccIssueColorFragment, TdsCheckBoxV2View tdsCheckBoxV2View, boolean z) {
        Intrinsics.checkNotNullParameter(tdsCheckBoxV2View, "");
        toCircle.IAuthTabCallback iAuthTabCallback = plccIssueColorFragment.IAuthTabCallback;
        if (iAuthTabCallback != null) {
            plccIssueColorFragment.onWarmupCompleted(iAuthTabCallback, z);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(TdsAgreementRowV1T04View tdsAgreementRowV1T04View, View view) {
        tdsAgreementRowV1T04View.setChecked(!tdsAgreementRowV1T04View.onPostMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(PlccIssueColorFragment plccIssueColorFragment, View view) {
        TdsBottomCtaV1View tdsBottomCtaV1View;
        TdsButtonV1View tdsButtonV1ViewAsInterface;
        TdsAgreementRowV1T04View tdsAgreementRowV1T04View;
        toCircle.IAuthTabCallback iAuthTabCallback = plccIssueColorFragment.IAuthTabCallback;
        if (iAuthTabCallback == null) {
            return;
        }
        getDigestAlgorithms<PKCS12PBEParams> getdigestalgorithmsWriteTypedObject = plccIssueColorFragment.writeTypedObject();
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(plccIssueColorFragment);
        CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = plccIssueColorFragment.extraCallback();
        String string = iAuthTabCallback.toString();
        X509Certificate x509CertificateOnExtraCallback = plccIssueColorFragment.onExtraCallback();
        isDebuggerOn isdebuggeron = new isDebuggerOn(string, (x509CertificateOnExtraCallback == null || (tdsAgreementRowV1T04View = x509CertificateOnExtraCallback.IAuthTabCallback) == null) ? false : tdsAgreementRowV1T04View.onPostMessage());
        X509Certificate x509CertificateOnExtraCallback2 = plccIssueColorFragment.onExtraCallback();
        getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnNavigationEvent, cardIssueOverviewViewModelExtraCallback, isdebuggeron, (String) null, String.valueOf((x509CertificateOnExtraCallback2 == null || (tdsBottomCtaV1View = x509CertificateOnExtraCallback2.onExtraCallbackWithResult) == null || (tdsButtonV1ViewAsInterface = tdsBottomCtaV1View.asInterface()) == null) ? null : tdsButtonV1ViewAsInterface.getText()), (Map) null, 40, (Object) null);
    }

    private final void onWarmupCompleted(toCircle.IAuthTabCallback iAuthTabCallback, boolean z) {
        PlccShowcaseView plccShowcaseView;
        X509Certificate x509CertificateOnExtraCallback = onExtraCallback();
        if (x509CertificateOnExtraCallback == null || (plccShowcaseView = x509CertificateOnExtraCallback.onExtraCallback) == null) {
            return;
        }
        plccShowcaseView.setCardStyle(iAuthTabCallback, z);
    }

    private final void onNavigationEvent(toCircle.IAuthTabCallback iAuthTabCallback) {
        TdsBottomCtaV1View tdsBottomCtaV1View;
        TdsButtonV1View tdsButtonV1ViewAsInterface;
        X509Certificate x509CertificateOnExtraCallback = onExtraCallback();
        if (x509CertificateOnExtraCallback == null || (tdsBottomCtaV1View = x509CertificateOnExtraCallback.onExtraCallbackWithResult) == null || (tdsButtonV1ViewAsInterface = tdsBottomCtaV1View.asInterface()) == null) {
            return;
        }
        tdsButtonV1ViewAsInterface.setText(getString(R.string.app_cardrecommend_issuev2_ui_plcc___227889cb3e, new Object[]{iAuthTabCallback.getDisplayName()}));
    }
}
