package viva.republica.toss.plcc.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import com.google.common.collect.Synchronized;
import im.toss.base.BaseActivity;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.network.model.BaseApiResponse;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CMP_UpdateCertificate_Close;
import o.Cookies_flush;
import o.EasingFunctionsKtExternalSyntheticLambda0;
import o.FullScreenAdShowConfigBuilder;
import o.IPostMessageServiceStubProxy;
import o.KitKatPurgeableDecoder;
import o.MapConverter;
import o.NetConverter3;
import o.ParamImpl;
import o.ReactNativeFeatureFlagsAccessor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access8100;
import o.clearTid;
import o.getAdService;
import o.getLongName;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.nativePinBitmap;
import o.onJsBridgeReady;
import o.readIntokhttp;
import o.setMessageBytes;
import o.setVisitUrl;
import o.transparentBackground;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.plcc.activity.PlccCardTransactionDetailActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PlccCardTransactionDetailActivity extends BaseActivity {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int asInterface = 8;
    private KitKatPurgeableDecoder IAuthTabCallbackDefault;
    private final Lazy asBinder = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onNavigationEvent(this));

    public long getScreenId() {
        return -1L;
    }

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onNavigationEvent implements Function0<CMP_UpdateCertificate_Close> {
        final /* synthetic */ Activity IAuthTabCallback;

        public onNavigationEvent(Activity activity) {
            this.IAuthTabCallback = activity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final CMP_UpdateCertificate_Close invoke() {
            LayoutInflater layoutInflater = this.IAuthTabCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMP_UpdateCertificate_Close.onNavigationEvent(layoutInflater);
        }
    }

    public String getScreenName() {
        return "tosscreditcard__payment_details";
    }

    public Map<String, Object> getScreenParams() {
        return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("service", "tosscreditcard")});
    }

    private final CMP_UpdateCertificate_Close ICustomTabsServiceStubProxy() {
        Object value = this.asBinder.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (CMP_UpdateCertificate_Close) value;
    }

    private final TdsTopV1View onGreatestScrollPercentageIncreased() {
        TdsTopV1View tdsTopV1View = ICustomTabsServiceStubProxy().getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(tdsTopV1View, "");
        return tdsTopV1View;
    }

    private final TdsListRowV1View ICustomTabsServiceDefault() {
        TdsListRowV1View tdsListRowV1View = ICustomTabsServiceStubProxy().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        return tdsListRowV1View;
    }

    private final TdsListRowV1View IEngagementSignalsCallback_Parcel() {
        TdsListRowV1View tdsListRowV1View = ICustomTabsServiceStubProxy().extraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        return tdsListRowV1View;
    }

    private final LinearLayout setEngagementSignalsCallback() {
        LinearLayout linearLayout = ICustomTabsServiceStubProxy().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    private final Typography7 access200() {
        Typography7 typography7 = ICustomTabsServiceStubProxy().asBinder;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        return typography7;
    }

    private final TdsListRowV1View onSessionEnded() {
        TdsListRowV1View tdsListRowV1View = ICustomTabsServiceStubProxy().readTypedObject;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        return tdsListRowV1View;
    }

    private final TdsListRowV1View validateRelationship() {
        TdsListRowV1View tdsListRowV1View = ICustomTabsServiceStubProxy().IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        return tdsListRowV1View;
    }

    private final TdsListRowV1View ICustomTabsServiceStub() {
        TdsListRowV1View tdsListRowV1View = ICustomTabsServiceStubProxy().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        return tdsListRowV1View;
    }

    private final View IEngagementSignalsCallback() {
        View view = ICustomTabsServiceStubProxy().onTransact;
        Intrinsics.checkNotNullExpressionValue(view, "");
        return view;
    }

    private final LinearLayout onVerticalScrollEvent() {
        LinearLayout linearLayout = ICustomTabsServiceStubProxy().IAuthTabCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    private final Typography6 IEngagementSignalsCallbackDefault() {
        Typography6 typography6 = ICustomTabsServiceStubProxy().access100;
        Intrinsics.checkNotNullExpressionValue(typography6, "");
        return typography6;
    }

    private final TdsListRowV1View IEngagementSignalsCallbackStub() {
        TdsListRowV1View tdsListRowV1View = ICustomTabsServiceStubProxy().IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        return tdsListRowV1View;
    }

    private final TdsListRowV1View updateVisuals() {
        TdsListRowV1View tdsListRowV1View = ICustomTabsServiceStubProxy().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        return tdsListRowV1View;
    }

    private final TdsListRowV1View writeTypedList() {
        TdsListRowV1View tdsListRowV1View = ICustomTabsServiceStubProxy().IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        return tdsListRowV1View;
    }

    private final TdsListRowV1View ICustomTabsService_Parcel() {
        TdsListRowV1View tdsListRowV1View = ICustomTabsServiceStubProxy().asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        return tdsListRowV1View;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        setContentView(ICustomTabsServiceStubProxy().getRoot());
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
        }
        KitKatPurgeableDecoder kitKatPurgeableDecoder = (KitKatPurgeableDecoder) getIntent().getParcelableExtra("extra.transaction");
        if (kitKatPurgeableDecoder == null) {
            onJsBridgeReady.onNavigationEvent(this, getString(R.string.app_plcc_activity___c059baa90a), 0, 2, (Object) null);
            finish();
        } else {
            this.IAuthTabCallbackDefault = kitKatPurgeableDecoder;
            onNavigationEvent();
            IAuthTabCallback();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent() {
        TdsTopV1View tdsTopV1ViewOnGreatestScrollPercentageIncreased = onGreatestScrollPercentageIncreased();
        KitKatPurgeableDecoder kitKatPurgeableDecoder = this.IAuthTabCallbackDefault;
        KitKatPurgeableDecoder kitKatPurgeableDecoder2 = null;
        if (kitKatPurgeableDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            kitKatPurgeableDecoder = null;
        }
        tdsTopV1ViewOnGreatestScrollPercentageIncreased.setUpperText((String) KitKatPurgeableDecoder.onExtraCallbackWithResult(-55003368, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 55003370, new Object[]{kitKatPurgeableDecoder}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent()));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(getString(R.string.app_plcc_activity___6d54ca5621));
        KitKatPurgeableDecoder kitKatPurgeableDecoder3 = this.IAuthTabCallbackDefault;
        if (kitKatPurgeableDecoder3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            kitKatPurgeableDecoder3 = null;
        }
        tdsTopV1ViewOnGreatestScrollPercentageIncreased.setLowerText(simpleDateFormat.format(kitKatPurgeableDecoder3.onNavigationEvent()));
        TdsListRowV1View tdsListRowV1ViewICustomTabsServiceDefault = ICustomTabsServiceDefault();
        KitKatPurgeableDecoder kitKatPurgeableDecoder4 = this.IAuthTabCallbackDefault;
        if (kitKatPurgeableDecoder4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            kitKatPurgeableDecoder4 = null;
        }
        String strOnNavigationEvent = (String) KitKatPurgeableDecoder.onExtraCallbackWithResult(1068234498, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1068234498, new Object[]{kitKatPurgeableDecoder4}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
        if (strOnNavigationEvent.length() <= 0) {
            strOnNavigationEvent = null;
        }
        if (strOnNavigationEvent == null) {
            KitKatPurgeableDecoder kitKatPurgeableDecoder5 = this.IAuthTabCallbackDefault;
            if (kitKatPurgeableDecoder5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                kitKatPurgeableDecoder5 = null;
            }
            strOnNavigationEvent = getLongName.onNavigationEvent(kitKatPurgeableDecoder5.onExtraCallback(), (ParamImpl) null, 1, (Object) null);
        }
        tdsListRowV1ViewICustomTabsServiceDefault.setRightText1(strOnNavigationEvent);
        KitKatPurgeableDecoder kitKatPurgeableDecoder6 = this.IAuthTabCallbackDefault;
        if (kitKatPurgeableDecoder6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            kitKatPurgeableDecoder6 = null;
        }
        if (kitKatPurgeableDecoder6.asInterface()) {
            Context context = tdsListRowV1ViewICustomTabsServiceDefault.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsListRowV1ViewICustomTabsServiceDefault.setRightText1Color(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new IAuthTabCallback(configuration))}, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
            BaseTextView baseTextView = (BaseTextView) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1ViewICustomTabsServiceDefault}, -1111713185, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1111713194, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
            if (baseTextView != null) {
                KitKatPurgeableDecoder kitKatPurgeableDecoder7 = this.IAuthTabCallbackDefault;
                if (kitKatPurgeableDecoder7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    kitKatPurgeableDecoder7 = null;
                }
                transparentBackground.onNavigationEvent(baseTextView, kitKatPurgeableDecoder7.asInterface());
            }
        }
        TdsListRowV1View tdsListRowV1ViewIEngagementSignalsCallback_Parcel = IEngagementSignalsCallback_Parcel();
        KitKatPurgeableDecoder kitKatPurgeableDecoder8 = this.IAuthTabCallbackDefault;
        if (kitKatPurgeableDecoder8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            kitKatPurgeableDecoder8 = null;
        }
        int i = 8;
        tdsListRowV1ViewIEngagementSignalsCallback_Parcel.setVisibility((!kitKatPurgeableDecoder8.IAuthTabCallbackStubProxy() || kitKatPurgeableDecoder8.asInterface()) ? 8 : 0);
        KitKatPurgeableDecoder kitKatPurgeableDecoder9 = this.IAuthTabCallbackDefault;
        if (kitKatPurgeableDecoder9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            kitKatPurgeableDecoder9 = null;
        }
        tdsListRowV1ViewIEngagementSignalsCallback_Parcel.setRightText1(getLongName.onNavigationEvent(kitKatPurgeableDecoder9.onExtraCallback(), (ParamImpl) null, 1, (Object) null));
        KitKatPurgeableDecoder kitKatPurgeableDecoder10 = this.IAuthTabCallbackDefault;
        if (kitKatPurgeableDecoder10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            kitKatPurgeableDecoder10 = null;
        }
        boolean zIAuthTabCallbackStubProxy = kitKatPurgeableDecoder10.IAuthTabCallbackStubProxy();
        KitKatPurgeableDecoder kitKatPurgeableDecoder11 = this.IAuthTabCallbackDefault;
        if (kitKatPurgeableDecoder11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            kitKatPurgeableDecoder11 = null;
        }
        Long lOnWarmupCompleted = kitKatPurgeableDecoder11.onWarmupCompleted();
        if (lOnWarmupCompleted != null) {
            long jLongValue = lOnWarmupCompleted.longValue();
            TdsListRowV1View tdsListRowV1ViewUpdateVisuals = updateVisuals();
            tdsListRowV1ViewUpdateVisuals.setVisibility(0);
            tdsListRowV1ViewUpdateVisuals.setRightText1(getLongName.onNavigationEvent(jLongValue, (ParamImpl) null, 1, (Object) null));
            if (zIAuthTabCallbackStubProxy) {
                tdsListRowV1ViewUpdateVisuals.setCenterText1(getString(R.string.app_plcc_activity___8daae0ffab));
            }
        }
        KitKatPurgeableDecoder kitKatPurgeableDecoder12 = this.IAuthTabCallbackDefault;
        if (kitKatPurgeableDecoder12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            kitKatPurgeableDecoder12 = null;
        }
        Long lAsBinder = kitKatPurgeableDecoder12.asBinder();
        if (lAsBinder != null) {
            long jLongValue2 = lAsBinder.longValue();
            TdsListRowV1View tdsListRowV1ViewWriteTypedList = writeTypedList();
            tdsListRowV1ViewWriteTypedList.setVisibility(0);
            tdsListRowV1ViewWriteTypedList.setRightText1(getLongName.onNavigationEvent(-jLongValue2, (ParamImpl) null, 1, (Object) null));
            if (zIAuthTabCallbackStubProxy) {
                tdsListRowV1ViewWriteTypedList.setCenterText1(getString(R.string.app_plcc_activity___05af5ea08d));
            }
        }
        KitKatPurgeableDecoder kitKatPurgeableDecoder13 = this.IAuthTabCallbackDefault;
        if (kitKatPurgeableDecoder13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            kitKatPurgeableDecoder13 = null;
        }
        Long lAccess100 = kitKatPurgeableDecoder13.access100();
        if (lAccess100 != null) {
            long jLongValue3 = lAccess100.longValue();
            TdsListRowV1View tdsListRowV1ViewICustomTabsService_Parcel = ICustomTabsService_Parcel();
            tdsListRowV1ViewICustomTabsService_Parcel.setVisibility(0);
            tdsListRowV1ViewICustomTabsService_Parcel.setRightText1(getLongName.onNavigationEvent(jLongValue3, (ParamImpl) null, 1, (Object) null));
        }
        LinearLayout engagementSignalsCallback = setEngagementSignalsCallback();
        Iterator itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(engagementSignalsCallback).IAuthTabCallback();
        while (true) {
            if (!itIAuthTabCallback.hasNext()) {
                break;
            } else if (((View) itIAuthTabCallback.next()).getVisibility() == 0) {
                engagementSignalsCallback.setVisibility(0);
                break;
            }
        }
        Typography7 typography7Access200 = access200();
        if (zIAuthTabCallbackStubProxy && ICustomTabsService_Parcel().getVisibility() == 0) {
            i = 0;
        }
        typography7Access200.setVisibility(i);
        TdsListRowV1View tdsListRowV1ViewOnSessionEnded = onSessionEnded();
        KitKatPurgeableDecoder kitKatPurgeableDecoder14 = this.IAuthTabCallbackDefault;
        if (kitKatPurgeableDecoder14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            kitKatPurgeableDecoder14 = null;
        }
        tdsListRowV1ViewOnSessionEnded.setRightText1(kitKatPurgeableDecoder14.access000());
        TdsListRowV1View tdsListRowV1ViewValidateRelationship = validateRelationship();
        KitKatPurgeableDecoder kitKatPurgeableDecoder15 = this.IAuthTabCallbackDefault;
        if (kitKatPurgeableDecoder15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            kitKatPurgeableDecoder15 = null;
        }
        tdsListRowV1ViewValidateRelationship.setRightText1((String) KitKatPurgeableDecoder.onExtraCallbackWithResult(1695089993, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1695089992, new Object[]{kitKatPurgeableDecoder15}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent()));
        TdsListRowV1View tdsListRowV1ViewICustomTabsServiceStub = ICustomTabsServiceStub();
        KitKatPurgeableDecoder kitKatPurgeableDecoder16 = this.IAuthTabCallbackDefault;
        if (kitKatPurgeableDecoder16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            kitKatPurgeableDecoder2 = kitKatPurgeableDecoder16;
        }
        tdsListRowV1ViewICustomTabsServiceStub.setRightText1(kitKatPurgeableDecoder2.IAuthTabCallbackDefault());
    }

    private final void IAuthTabCallback() throws Throwable {
        KitKatPurgeableDecoder kitKatPurgeableDecoder = this.IAuthTabCallbackDefault;
        if (kitKatPurgeableDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            kitKatPurgeableDecoder = null;
        }
        if (kitKatPurgeableDecoder.IAuthTabCallbackStubProxy()) {
            return;
        }
        KitKatPurgeableDecoder kitKatPurgeableDecoder2 = this.IAuthTabCallbackDefault;
        if (kitKatPurgeableDecoder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            kitKatPurgeableDecoder2 = null;
        }
        String strIAuthTabCallback = kitKatPurgeableDecoder2.IAuthTabCallback();
        if (strIAuthTabCallback != null) {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29427 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 24734 - KeyEvent.getDeadChar(0, 0), -842029757, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1023870124);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 29426), (Process.myPid() >> 22) + 22, 24734 - (ViewConfiguration.getEdgeSlop() >> 16), -206043708, false, "getInterfaceDescriptor", new Class[0]);
                }
                writeRaw<BaseApiResponse<nativePinBitmap>> writerawIAuthTabCallback = ((FullScreenAdShowConfigBuilder) ((Method) objOnExtraCallback2).invoke(obj, null)).IAuthTabCallback(strIAuthTabCallback);
                MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
                Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
                writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new onWarmupCompleted(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
                onNavigationEvent(setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback2, new PlccCardTransactionDetailActivity$.ExternalSyntheticLambda0(), new PlccCardTransactionDetailActivity$.ExternalSyntheticLambda1(this)));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(PlccCardTransactionDetailActivity plccCardTransactionDetailActivity, nativePinBitmap nativepinbitmap) {
        Intrinsics.checkNotNullParameter(nativepinbitmap, "");
        plccCardTransactionDetailActivity.onExtraCallback(nativepinbitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit asInterface(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    private final void onExtraCallback(nativePinBitmap nativepinbitmap) {
        String strIAuthTabCallback = nativepinbitmap.IAuthTabCallback();
        String strOnExtraCallbackWithResult = nativepinbitmap.onExtraCallbackWithResult();
        if ((strIAuthTabCallback == null || StringsKt.isBlank(strIAuthTabCallback)) && (strOnExtraCallbackWithResult == null || StringsKt.isBlank(strOnExtraCallbackWithResult))) {
            return;
        }
        IEngagementSignalsCallback().setVisibility(0);
        if (strIAuthTabCallback != null) {
            if (StringsKt.isBlank(strIAuthTabCallback)) {
                strIAuthTabCallback = null;
            }
            if (strIAuthTabCallback != null) {
                String strOnNavigationEvent = Cookies_flush.onNavigationEvent(strIAuthTabCallback);
                Intrinsics.checkNotNullExpressionValue(strOnNavigationEvent, "");
                TdsListRowV1View tdsListRowV1ViewIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub();
                tdsListRowV1ViewIEngagementSignalsCallbackStub.setVisibility(0);
                tdsListRowV1ViewIEngagementSignalsCallbackStub.setRightText1(strOnNavigationEvent);
                BaseTextView baseTextView = (BaseTextView) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1ViewIEngagementSignalsCallbackStub}, -1111713185, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1111713194, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
                if (baseTextView != null) {
                    baseTextView.setOnClickListener(new PlccCardTransactionDetailActivity$.ExternalSyntheticLambda2(tdsListRowV1ViewIEngagementSignalsCallbackStub, strOnNavigationEvent));
                }
            }
        }
        if (strOnExtraCallbackWithResult != null) {
            if (StringsKt.isBlank(strOnExtraCallbackWithResult)) {
                strOnExtraCallbackWithResult = null;
            }
            if (strOnExtraCallbackWithResult != null) {
                onVerticalScrollEvent().setVisibility(0);
                IEngagementSignalsCallbackDefault().setText(strOnExtraCallbackWithResult);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(TdsListRowV1View tdsListRowV1View, String str, View view) {
        ReactNativeFeatureFlagsAccessor.onExtraCallback.onWarmupCompleted(tdsListRowV1View.getContext(), str);
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final Intent onExtraCallback(@NotNull Context context, @NotNull KitKatPurgeableDecoder kitKatPurgeableDecoder) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(kitKatPurgeableDecoder, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) PlccCardTransactionDetailActivity.class).putExtra("extra.transaction", kitKatPurgeableDecoder);
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
