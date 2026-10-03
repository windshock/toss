package o;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_DetachedSignedDataWithHash extends UST_CRYPT_VerifyHASH {

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onNavigationEvent(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CMS_DetachedSignedDataWithHash(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) view;
        tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.NONE);
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1B);
        tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.ROW1A);
        Context context = tdsListRowV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View.setCenterText1Color(new getUrlokhttp(new onExtraCallbackWithResult(configuration)).onRelationshipValidationResult());
        Context context2 = tdsListRowV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        tdsListRowV1View.setRightText1Color(new getUrlokhttp(new onWarmupCompleted(configuration2)).onPostMessage());
        Float fValueOf = Float.valueOf(24.0f);
        DisplayMetrics displayMetrics = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(fValueOf, displayMetrics);
        DisplayMetrics displayMetrics2 = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(fValueOf, displayMetrics2);
        DisplayMetrics displayMetrics3 = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iOnNavigationEvent3 = varyMatches.onNavigationEvent(fValueOf, displayMetrics3);
        DisplayMetrics displayMetrics4 = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        tdsListRowV1View.setPadding(iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent3, varyMatches.onNavigationEvent(Float.valueOf(6.0f), displayMetrics4));
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        UST_CMS_DecEnvelopedDataWithEncryptKey2 uST_CMS_DecEnvelopedDataWithEncryptKey2 = (UST_CMS_DecEnvelopedDataWithEncryptKey2) uST_CMS_EncryptedData;
        TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) this).onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setCenterText1(uST_CMS_DecEnvelopedDataWithEncryptKey2.asBinder());
        tdsListRowV1View2.setRightText1(uST_CMS_DecEnvelopedDataWithEncryptKey2.onWarmupCompleted());
        if (uST_CMS_DecEnvelopedDataWithEncryptKey2.onNavigationEvent()) {
            tdsListRowV1View2.setBorder(true);
            tdsListRowV1View2.setBorderType(ProtocolCompanion.LEFT24);
        }
        int iIAuthTabCallbackStub = uST_CMS_DecEnvelopedDataWithEncryptKey2.IAuthTabCallbackStub();
        Context context = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (iIAuthTabCallbackStub != new getUrlokhttp(new onNavigationEvent(configuration)).onRelationshipValidationResult()) {
            tdsListRowV1View2.setCenterText1Color(uST_CMS_DecEnvelopedDataWithEncryptKey2.IAuthTabCallbackStub());
        }
        int iOnExtraCallbackWithResult = uST_CMS_DecEnvelopedDataWithEncryptKey2.onExtraCallbackWithResult();
        Context context2 = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        if (iOnExtraCallbackWithResult != new getUrlokhttp(new IAuthTabCallback(configuration2)).onPostMessage()) {
            tdsListRowV1View2.setRightText1Color(uST_CMS_DecEnvelopedDataWithEncryptKey2.onExtraCallbackWithResult());
        }
    }
}
