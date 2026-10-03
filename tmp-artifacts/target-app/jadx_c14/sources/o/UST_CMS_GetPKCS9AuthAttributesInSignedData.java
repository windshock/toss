package o;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.uikit.widget.table.TdsTableRowV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.UST_CMS_GetPKCS9AuthAttributesInSignedData;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_GetPKCS9AuthAttributesInSignedData extends UST_CRYPT_VerifyHASH {

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
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CMS_GetPKCS9AuthAttributesInSignedData(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        TdsTableRowV1View tdsTableRowV1View = ((RecyclerView.ViewHolder) this).onNavigationEvent;
        TdsTableRowV1View tdsTableRowV1View2 = tdsTableRowV1View instanceof TdsTableRowV1View ? tdsTableRowV1View : null;
        if (tdsTableRowV1View2 != null) {
            UST_CMS_GetCertCountWithSignedData uST_CMS_GetCertCountWithSignedData = uST_CMS_EncryptedData instanceof UST_CMS_GetCertCountWithSignedData ? (UST_CMS_GetCertCountWithSignedData) uST_CMS_EncryptedData : null;
            if (uST_CMS_GetCertCountWithSignedData != null) {
                BaseTextView baseTextViewOnExtraCallbackWithResult = tdsTableRowV1View2.onExtraCallbackWithResult();
                View view = ((RecyclerView.ViewHolder) this).onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(view, "");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                baseTextViewOnExtraCallbackWithResult.setTextColor(new getUrlokhttp(new onNavigationEvent(configuration)).ICustomTabsCallbackStubProxy());
                BaseTextView baseTextViewOnNavigationEvent = tdsTableRowV1View2.onNavigationEvent();
                View view2 = ((RecyclerView.ViewHolder) this).onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                Context context2 = view2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                Configuration configuration2 = context2.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                baseTextViewOnNavigationEvent.setTextColor(new getUrlokhttp(new onWarmupCompleted(configuration2)).ICustomTabsCallbackStubProxy());
                tdsTableRowV1View2.onExtraCallbackWithResult().setText(uST_CMS_GetCertCountWithSignedData.onExtraCallbackWithResult());
                tdsTableRowV1View2.onNavigationEvent().setText(mergeParams.IAuthTabCallback(uST_CMS_GetCertCountWithSignedData.onWarmupCompleted(), false, 1, (Object) null));
                final Function0<Unit> function0OnNavigationEvent = uST_CMS_GetCertCountWithSignedData.onNavigationEvent();
                if (function0OnNavigationEvent != null) {
                    ((RecyclerView.ViewHolder) this).onNavigationEvent.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.credit.commons.TableRowViewHolder$$ExternalSyntheticLambda0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            UST_CMS_GetPKCS9AuthAttributesInSignedData.onExtraCallbackWithResult(function0OnNavigationEvent, view3);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(Function0 function0, View view) {
        function0.invoke();
    }
}
