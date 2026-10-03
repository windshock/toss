package viva.republica.toss.dashboard.primaryAccount;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ConvertByteArrayToFloatArray;
import o.KeyBoardVisiblePoint;
import o.ParamImpl;
import o.getAdService;
import o.getLongName;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.issueCertV3;
import o.matches;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import o.readIntokhttp;
import o.setHeadersokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.dashboard.primaryAccount.ConnectPrimaryAccountBottomSheet$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ConnectPrimaryAccountBottomSheet extends r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI {
    private final boolean IAuthTabCallback;
    private final KeyBoardVisiblePoint onExtraCallback;
    private final Function0<Unit> onExtraCallbackWithResult;
    private final long onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectPrimaryAccountBottomSheet(@NotNull Context context, @NotNull KeyBoardVisiblePoint keyBoardVisiblePoint, long j, boolean z, @NotNull Function0<Unit> function0) {
        super(context, 0, false, false, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.onExtraCallback = keyBoardVisiblePoint;
        this.onNavigationEvent = j;
        this.IAuthTabCallback = z;
        this.onExtraCallbackWithResult = function0;
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        BaseTextView baseTextViewFindViewById;
        TdsBottomCtaV1View tdsBottomCtaV1ViewFindViewById;
        super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
        setContentView(R.layout.bottom_sheet_connect_primary_account);
        TdsImageView tdsImageViewFindViewById = findViewById(R.id.transferIcon);
        if (tdsImageViewFindViewById == null || (baseTextViewFindViewById = findViewById(R.id.transferTitle)) == null || (tdsBottomCtaV1ViewFindViewById = findViewById(R.id.bottomCta)) == null) {
            return;
        }
        KeyBoardVisiblePoint keyBoardVisiblePoint = this.onExtraCallback;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsImageView.setImage$default(tdsImageViewFindViewById, issueCertV3.onNavigationEvent(keyBoardVisiblePoint, context, 64.0f, false, (Boolean) null, 8, (Object) null), (Function1) null, (Function1) null, 6, (Object) null);
        baseTextViewFindViewById.setText(getLongName.onNavigationEvent(this.onNavigationEvent, (ParamImpl) null, 1, (Object) null) + "\n" + (this.IAuthTabCallback ? "받기" : "옮기기") + " 완료");
        BaseTextView baseTextViewExtraCallbackWithResult = tdsBottomCtaV1ViewFindViewById.extraCallbackWithResult();
        if (baseTextViewExtraCallbackWithResult != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            baseTextViewExtraCallbackWithResult.setTextColor(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new onExtraCallbackWithResult(configuration)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
        }
        tdsBottomCtaV1ViewFindViewById.asInterface().setOnClickListener(new ConnectPrimaryAccountBottomSheet$.ExternalSyntheticLambda0(this));
        ConvertByteArrayToFloatArray.onExtraCallback(1005556L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(ConnectPrimaryAccountBottomSheet connectPrimaryAccountBottomSheet, View view) {
        ConvertByteArrayToFloatArray.onExtraCallback(1005558L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        connectPrimaryAccountBottomSheet.onExtraCallbackWithResult.invoke();
        connectPrimaryAccountBottomSheet.dismiss();
    }
}
