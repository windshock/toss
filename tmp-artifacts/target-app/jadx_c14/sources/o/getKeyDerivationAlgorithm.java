package o;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import com.google.common.collect.Synchronized;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import kotlin.jvm.internal.Intrinsics;
import o.getKeyDerivationAlgorithm;
import o.toHashtable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getKeyDerivationAlgorithm extends RecipientIdentifier<getCompressionAlgorithmIdentifier> {
    private final TdsListRowV1View extraCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getKeyDerivationAlgorithm(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.extraCallback = (TdsListRowV1View) view;
    }

    @Override // o.RecipientIdentifier
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void onExtraCallbackWithResult(@NotNull final getCompressionAlgorithmIdentifier getcompressionalgorithmidentifier, @Nullable final toHashtable.IAuthTabCallback iAuthTabCallback) {
        int iICustomTabsCallbackStubProxy;
        Intrinsics.checkNotNullParameter(getcompressionalgorithmidentifier, "");
        TdsListRowV1View tdsListRowV1View = this.extraCallback;
        BaseTextView baseTextViewICustomTabsCallbackDefault = tdsListRowV1View.ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault != null) {
            baseTextViewICustomTabsCallbackDefault.setText(mergeParams.IAuthTabCallbackDefault(getcompressionalgorithmidentifier.onNavigationEvent().toString()));
            baseTextViewICustomTabsCallbackDefault.setVisibility(0);
        }
        tdsListRowV1View.setCenterText2(mergeParams.IAuthTabCallbackDefault(getcompressionalgorithmidentifier.IAuthTabCallback()));
        tdsListRowV1View.setLeftDate(getcompressionalgorithmidentifier.onWarmupCompleted());
        tdsListRowV1View.setRightText1(getcompressionalgorithmidentifier.asInterface());
        tdsListRowV1View.setRightText2(getcompressionalgorithmidentifier.onExtraCallbackWithResult());
        BaseTextView baseTextView = (BaseTextView) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View}, -1111713185, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1111713194, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (baseTextView != null) {
            transparentBackground.onNavigationEvent(baseTextView, getcompressionalgorithmidentifier.asBinder());
        }
        if (getcompressionalgorithmidentifier.asBinder()) {
            Context context = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            iICustomTabsCallbackStubProxy = ((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new IAuthTabCallback(configuration))}, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue();
        } else {
            Context context2 = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iICustomTabsCallbackStubProxy = new getUrlokhttp(new onWarmupCompleted(configuration2)).ICustomTabsCallbackStubProxy();
        }
        tdsListRowV1View.setRightText1Color(iICustomTabsCallbackStubProxy);
        tdsListRowV1View.setOnClickListener(iAuthTabCallback != null ? new View.OnClickListener() { // from class: viva.republica.toss.card.viewholder.UserCardTransactionViewHolder$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getKeyDerivationAlgorithm.onExtraCallback(iAuthTabCallback, getcompressionalgorithmidentifier, view);
            }
        } : null);
    }

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(toHashtable.IAuthTabCallback iAuthTabCallback, getCompressionAlgorithmIdentifier getcompressionalgorithmidentifier, View view) {
        iAuthTabCallback.onExtraCallbackWithResult(getcompressionalgorithmidentifier);
    }
}
