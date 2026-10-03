package o;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import com.google.common.collect.Synchronized;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.OriginatorPublicKey;
import o.toHashtable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class OriginatorPublicKey extends RecipientIdentifier<KitKatPurgeableDecoder> {
    private final TdsListRowV1View ICustomTabsCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OriginatorPublicKey(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.ICustomTabsCallback = (TdsListRowV1View) view;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // o.RecipientIdentifier
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onExtraCallbackWithResult(@NotNull final KitKatPurgeableDecoder kitKatPurgeableDecoder, @Nullable final toHashtable.IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        int iOnPostMessage;
        int iICustomTabsCallbackStubProxy;
        Intrinsics.checkNotNullParameter(kitKatPurgeableDecoder, "");
        TdsListRowV1View tdsListRowV1View = this.ICustomTabsCallback;
        BaseTextView baseTextViewICustomTabsCallbackDefault = tdsListRowV1View.ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault != null) {
            baseTextViewICustomTabsCallbackDefault.setText(kitKatPurgeableDecoder.readTypedObject());
        }
        tdsListRowV1View.setCenterText2(kitKatPurgeableDecoder.extraCallbackWithResult());
        tdsListRowV1View.setLeftDate(kitKatPurgeableDecoder.IAuthTabCallback_Parcel());
        tdsListRowV1View.setRightText1(kitKatPurgeableDecoder.onMinimized());
        if (kitKatPurgeableDecoder.getInterfaceDescriptor() > 0) {
            Context context = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            iOnPostMessage = ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new onExtraCallback(configuration)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue();
        } else {
            Context context2 = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iOnPostMessage = new getUrlokhttp(new IAuthTabCallback(configuration2)).onPostMessage();
        }
        tdsListRowV1View.setRightText2Color(iOnPostMessage);
        tdsListRowV1View.setRightText2(kitKatPurgeableDecoder.extraCallback());
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        BaseTextView baseTextView = (BaseTextView) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View}, -1111713185, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1111713194, iOnNavigationEvent, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (baseTextView != null) {
            transparentBackground.onNavigationEvent(baseTextView, kitKatPurgeableDecoder.asInterface());
        }
        boolean zAsInterface = kitKatPurgeableDecoder.asInterface();
        if (zAsInterface) {
            Context context3 = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration3 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            Object[] objArr = {new getUrlokhttp(new onExtraCallbackWithResult(configuration3))};
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            iICustomTabsCallbackStubProxy = ((Integer) getUrlokhttp.onNavigationEvent(objArr, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
        } else {
            if (zAsInterface) {
                throw new NoWhenBranchMatchedException();
            }
            Context context4 = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration4 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration4, "");
            iICustomTabsCallbackStubProxy = new getUrlokhttp(new onNavigationEvent(configuration4)).ICustomTabsCallbackStubProxy();
        }
        tdsListRowV1View.setRightText1Color(iICustomTabsCallbackStubProxy);
        tdsListRowV1View.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.card.viewholder.PlccCardTransactionViewHolder$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OriginatorPublicKey.onWarmupCompleted(iAuthTabCallback, kitKatPurgeableDecoder, view);
            }
        });
    }

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallback implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
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
        final /* synthetic */ Configuration onExtraCallback;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(toHashtable.IAuthTabCallback iAuthTabCallback, KitKatPurgeableDecoder kitKatPurgeableDecoder, View view) {
        if (iAuthTabCallback != null) {
            iAuthTabCallback.onExtraCallbackWithResult(kitKatPurgeableDecoder);
        }
    }
}
