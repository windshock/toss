package viva.republica.toss.plcc.expectbillamount;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.viewpager2.widget.ViewPager2;
import im.toss.base.BaseActivity;
import im.toss.base.BaseFragment;
import im.toss.network.model.BaseApiResponse;
import im.toss.uikit.widget.tab.TdsTabV1View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CMP_Revoke_Rp;
import o.IPostMessageServiceStubProxy;
import o.InterstitialAdInterstitialAdShowConfigBuilder;
import o.MapConverter;
import o.NativeJpegTranscoderFactory;
import o.NetConverter3;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access8100;
import o.clearTid;
import o.createImageTranscoder;
import o.deserializeUriNullableCollection;
import o.getHostnameVerifierokhttp;
import o.getParamImp;
import o.getWrite;
import o.initMiniApp;
import o.setMessageBytes;
import o.setTagBytes;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.plcc.bill.PlccBillActivity;
import viva.republica.toss.plcc.expectbillamount.PlccExpectedBillAmountActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PlccExpectedBillAmountActivity extends BaseActivity {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int IAuthTabCallbackDefault = 8;
    private final Lazy IAuthTabCallbackStub = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new asInterface(this));

    public long getScreenId() {
        return -1L;
    }

    public static final class asInterface implements Function0<CMP_Revoke_Rp> {
        final /* synthetic */ Activity onNavigationEvent;

        public asInterface(Activity activity) {
            this.onNavigationEvent = activity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final CMP_Revoke_Rp invoke() {
            LayoutInflater layoutInflater = this.onNavigationEvent.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMP_Revoke_Rp.onNavigationEvent(layoutInflater);
        }
    }

    public String getScreenName() {
        return "tosscreditcard__estimated_payment_amount";
    }

    public Map<String, Object> getScreenParams() {
        return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("service", "tosscreditcard")});
    }

    private final CMP_Revoke_Rp onNavigationEvent() {
        Object value = this.IAuthTabCallbackStub.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (CMP_Revoke_Rp) value;
    }

    private final ViewPager2 setEngagementSignalsCallback() {
        ViewPager2 viewPager2 = onNavigationEvent().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        return viewPager2;
    }

    private final TdsTabV1View IAuthTabCallback() {
        TdsTabV1View tdsTabV1View = onNavigationEvent().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsTabV1View, "");
        return tdsTabV1View;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        if (Intrinsics.areEqual(data != null ? data.getLastPathSegment() : null, "expected")) {
            PlccBillActivity.IAuthTabCallback iAuthTabCallback = PlccBillActivity.Companion;
            Context baseContext = getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "");
            startActivity(PlccBillActivity.IAuthTabCallback.IAuthTabCallback(iAuthTabCallback, baseContext, null, 2, null));
            finish();
        }
        setContentView(onNavigationEvent().getRoot());
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
        }
        setTitle(getString(R.string.app_plcc_expectbillamount___ffed8b8e9c));
        updateVisuals();
    }

    private final void updateVisuals() throws Throwable {
        setTagBytes settagbytes = setTagBytes.onNavigationEvent;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29427), 22 - Color.argb(0, 0, 0, 0), 24734 - ExpandableListView.getPackedPositionType(0L), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1971064817);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 29427), (ViewConfiguration.getEdgeSlop() >> 16) + 22, 24734 - (ViewConfiguration.getScrollBarSize() >> 8), -1144844641, false, "access100", new Class[0]);
            }
            writeRaw<BaseApiResponse<createImageTranscoder>> writerawOnNavigationEvent = ((InterstitialAdInterstitialAdShowConfigBuilder) ((Method) objOnExtraCallback2).invoke(obj, null)).onNavigationEvent();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new onExtraCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1971064817);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 29426), (ViewConfiguration.getFadingEdgeLength() >> 16) + 22, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24734, -1144844641, false, "access100", new Class[0]);
            }
            writeRaw writerawIAuthTabCallback2 = InterstitialAdInterstitialAdShowConfigBuilder.IAuthTabCallback((InterstitialAdInterstitialAdShowConfigBuilder) ((Method) objOnExtraCallback3).invoke(obj, null), false, 1, null);
            MapConverter mapConverterOnExtraCallback2 = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback2, "");
            writeRaw writerawIAuthTabCallback3 = writerawIAuthTabCallback2.IAuthTabCallback(new IAuthTabCallbackDefault(mapConverterOnExtraCallback2, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback3, "");
            writeRaw writerawOnWarmupCompleted = settagbytes.IAuthTabCallback(writerawIAuthTabCallback, writerawIAuthTabCallback3).onExtraCallback(new PlccExpectedBillAmountActivity$.ExternalSyntheticLambda2(new PlccExpectedBillAmountActivity$.ExternalSyntheticLambda1(this))).onWarmupCompleted(new PlccExpectedBillAmountActivity$.ExternalSyntheticLambda3(this));
            Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
            setMessageBytes.onExtraCallbackWithResult(writerawOnWarmupCompleted, new PlccExpectedBillAmountActivity$.ExternalSyntheticLambda4(this), new PlccExpectedBillAmountActivity$.ExternalSyntheticLambda5(this));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(PlccExpectedBillAmountActivity plccExpectedBillAmountActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        getHostnameVerifierokhttp.onNavigationEvent(plccExpectedBillAmountActivity, (String) null, 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(PlccExpectedBillAmountActivity plccExpectedBillAmountActivity) {
        plccExpectedBillAmountActivity.bo_();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(PlccExpectedBillAmountActivity plccExpectedBillAmountActivity, Pair pair) {
        createImageTranscoder createimagetranscoder = (createImageTranscoder) pair.onExtraCallbackWithResult();
        List<NativeJpegTranscoderFactory> list = (List) pair.IAuthTabCallback();
        Intrinsics.checkNotNull(createimagetranscoder);
        Intrinsics.checkNotNull(list);
        plccExpectedBillAmountActivity.onExtraCallback(createimagetranscoder, list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onExtraCallbackWithResult(PlccExpectedBillAmountActivity plccExpectedBillAmountActivity, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        getParamImp.onWarmupCompleted(th, plccExpectedBillAmountActivity, false, (initMiniApp) null, (Function0) null, new PlccExpectedBillAmountActivity$.ExternalSyntheticLambda0(plccExpectedBillAmountActivity), 14, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(PlccExpectedBillAmountActivity plccExpectedBillAmountActivity, DialogInterface dialogInterface) {
        plccExpectedBillAmountActivity.finish();
        return Unit.INSTANCE;
    }

    private final void onExtraCallback(createImageTranscoder createimagetranscoder, List<NativeJpegTranscoderFactory> list) {
        IAuthTabCallback(createimagetranscoder, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(createImageTranscoder createimagetranscoder, List<NativeJpegTranscoderFactory> list) {
        List listListOf;
        IAuthTabCallback().setVisibility(8);
        Uri data = getIntent().getData();
        if (Intrinsics.areEqual(data != null ? data.getLastPathSegment() : null, "expected")) {
            listListOf = CollectionsKt.listOf(new onNavigationEvent(onWarmupCompleted.EXPECT, new PlccExpectedBillAmountActivity$.ExternalSyntheticLambda6(createimagetranscoder)));
        } else {
            listListOf = CollectionsKt.listOf(new onNavigationEvent(onWarmupCompleted.BILL, new PlccExpectedBillAmountActivity$.ExternalSyntheticLambda7(list)));
        }
        setEngagementSignalsCallback().setAdapter(new onExtraCallbackWithResult(this, listListOf));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseFragment onNavigationEvent(createImageTranscoder createimagetranscoder) {
        return PlccExpectedBillAmountFragment.Companion.onExtraCallback(createimagetranscoder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseFragment onWarmupCompleted(List list) {
        return PlccExpectedBillListFragment.Companion.onNavigationEvent(list);
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final Intent onExtraCallback(@NotNull Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) PlccExpectedBillAmountActivity.class).putExtra("show_expected", z);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
