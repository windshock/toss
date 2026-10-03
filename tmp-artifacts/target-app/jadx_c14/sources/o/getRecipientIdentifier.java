package o;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import com.google.common.collect.Synchronized;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.getRecipientIdentifier;
import o.toHashtable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getRecipientIdentifier extends RecipientIdentifier<nativeToCircleFilter> {
    private final TdsListRowV1View writeTypedObject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getRecipientIdentifier(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.writeTypedObject = (TdsListRowV1View) view;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // o.RecipientIdentifier
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onExtraCallbackWithResult(@NotNull final nativeToCircleFilter nativetocirclefilter, @Nullable final toHashtable.IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        int iICustomTabsCallbackStubProxy;
        Intrinsics.checkNotNullParameter(nativetocirclefilter, "");
        TdsListRowV1View tdsListRowV1View = this.writeTypedObject;
        BaseTextView baseTextViewICustomTabsCallbackDefault = tdsListRowV1View.ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault != null) {
            baseTextViewICustomTabsCallbackDefault.setText(nativetocirclefilter.asInterface());
        }
        tdsListRowV1View.setCenterText2(nativetocirclefilter.onWarmupCompleted());
        tdsListRowV1View.setLeftDate(nativetocirclefilter.onExtraCallback());
        tdsListRowV1View.setRightText1(nativetocirclefilter.IAuthTabCallbackDefault());
        tdsListRowV1View.setRightText2(nativetocirclefilter.onNavigationEvent());
        Context context = tdsListRowV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View.setRightText2Color(new getUrlokhttp(new onExtraCallbackWithResult(configuration)).onPostMessage());
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        BaseTextView baseTextView = (BaseTextView) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View}, -1111713185, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1111713194, iOnNavigationEvent, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (baseTextView != null) {
            transparentBackground.onNavigationEvent(baseTextView, nativetocirclefilter.onExtraCallbackWithResult());
        }
        boolean zOnExtraCallbackWithResult = nativetocirclefilter.onExtraCallbackWithResult();
        if (zOnExtraCallbackWithResult) {
            Context context2 = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            Object[] objArr = {new getUrlokhttp(new onNavigationEvent(configuration2))};
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            iICustomTabsCallbackStubProxy = ((Integer) getUrlokhttp.onNavigationEvent(objArr, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
        } else {
            if (zOnExtraCallbackWithResult) {
                throw new NoWhenBranchMatchedException();
            }
            Context context3 = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration3 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            iICustomTabsCallbackStubProxy = new getUrlokhttp(new onWarmupCompleted(configuration3)).ICustomTabsCallbackStubProxy();
        }
        tdsListRowV1View.setRightText1Color(iICustomTabsCallbackStubProxy);
        tdsListRowV1View.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.card.viewholder.PlccCardBillTransactionViewHolder$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getRecipientIdentifier.onExtraCallbackWithResult(iAuthTabCallback, nativetocirclefilter, view);
            }
        });
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onNavigationEvent(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public onWarmupCompleted(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(toHashtable.IAuthTabCallback iAuthTabCallback, nativeToCircleFilter nativetocirclefilter, View view) {
        if (iAuthTabCallback != null) {
            iAuthTabCallback.onExtraCallbackWithResult(nativetocirclefilter);
        }
    }
}
