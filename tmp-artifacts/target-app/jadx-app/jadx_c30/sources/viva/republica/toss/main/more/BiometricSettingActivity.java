package viva.republica.toss.main.more;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.base.BaseActivity;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.CERT_EncryptPrikey;
import o.IPostMessageServiceStubProxy;
import o.NetConverter3;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TypeUtils1;
import o.UTF8Decoder;
import o.accessMapSafely;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.disableImageViewPreallocationAndroid;
import o.getByteBuffer;
import o.isJSONTypeIgnore;
import o.isProxy;
import o.onJsBridgeReady;
import o.shortValue;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class BiometricSettingActivity extends BaseActivity {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int asBinder = 8;
    private final Lazy onTransact = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallback(this));

    public long getScreenId() {
        return -1L;
    }

    public static final class IAuthTabCallback implements Function0<CERT_EncryptPrikey> {
        final /* synthetic */ Activity onExtraCallback;

        public IAuthTabCallback(Activity activity) {
            this.onExtraCallback = activity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final CERT_EncryptPrikey invoke() {
            LayoutInflater layoutInflater = this.onExtraCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, BuildConfig.FLAVOR);
            return CERT_EncryptPrikey.onExtraCallback(layoutInflater);
        }
    }

    public String getScreenName() {
        return "biometric_settings";
    }

    private final CERT_EncryptPrikey IAuthTabCallback() {
        Object value = this.onTransact.getValue();
        Intrinsics.checkNotNullExpressionValue(value, BuildConfig.FLAVOR);
        return (CERT_EncryptPrikey) value;
    }

    private final TdsListRowV1View setEngagementSignalsCallback() {
        TdsListRowV1View tdsListRowV1View = IAuthTabCallback().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, BuildConfig.FLAVOR);
        return tdsListRowV1View;
    }

    private final TdsListRowV1View onNavigationEvent() {
        TdsListRowV1View tdsListRowV1View = IAuthTabCallback().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, BuildConfig.FLAVOR);
        return tdsListRowV1View;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(IAuthTabCallback().getRoot());
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        Intrinsics.checkNotNull(supportActionBar);
        supportActionBar.onNavigationEvent(true);
        ConstraintLayout root = IAuthTabCallback().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, BuildConfig.FLAVOR);
        disableImageViewPreallocationAndroid.onNavigationEvent(root, IAuthTabCallback().onWarmupCompleted, (View) null, (View) null, false, 14, (Object) null);
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = setEngagementSignalsCallback().prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
            tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setClickable(false);
        }
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 = onNavigationEvent().prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 != null) {
            tdsCheckBoxV2ViewPrefetchWithMultipleUrls2.setClickable(false);
        }
        setEngagementSignalsCallback().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.main.more.BiometricSettingActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BiometricSettingActivity.onWarmupCompleted(this.f$0, view);
            }
        });
        onNavigationEvent().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.main.more.BiometricSettingActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BiometricSettingActivity.IAuthTabCallback(this.f$0, view);
            }
        });
        ICustomTabsServiceDefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(BiometricSettingActivity biometricSettingActivity, View view) {
        accessMapSafely.onNavigationEvent.onNavigationEvent();
        biometricSettingActivity.ICustomTabsServiceDefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(final BiometricSettingActivity biometricSettingActivity, View view) {
        if (!accessMapSafely.onNavigationEvent.IAuthTabCallback()) {
            getByteBuffer getbytebufferOnExtraCallback = shortValue.IAuthTabCallback(shortValue.Companion, biometricSettingActivity, UTF8Decoder.SETTING_FINGERPRINT, 80L, true, false, false, false, (shortValue.onNavigationEvent) null, false, (Function0) null, false, (TypeUtils1) null, false, (String) null, (Function1) null, 32752, (Object) null).onExtraCallbackWithResult(NetConverter3.onExtraCallback()).onExtraCallback(new deserializeDecimalCollection() { // from class: viva.republica.toss.main.more.BiometricSettingActivity$$ExternalSyntheticLambda2
                public final void run() {
                    BiometricSettingActivity.onNavigationEvent(this.f$0);
                }
            });
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.main.more.BiometricSettingActivity$$ExternalSyntheticLambda3
                public final Object invoke(Object obj) {
                    return BiometricSettingActivity.onExtraCallback(this.f$0, (isJSONTypeIgnore) obj);
                }
            };
            deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.main.more.BiometricSettingActivity$$ExternalSyntheticLambda4
                public final void accept(Object obj) {
                    BiometricSettingActivity.asInterface(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.main.more.BiometricSettingActivity$$ExternalSyntheticLambda5
                public final Object invoke(Object obj) {
                    return BiometricSettingActivity.onExtraCallback(this.f$0, (Throwable) obj);
                }
            };
            getbytebufferOnExtraCallback.onExtraCallbackWithResult(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.main.more.BiometricSettingActivity$$ExternalSyntheticLambda6
                public final void accept(Object obj) {
                    BiometricSettingActivity.IAuthTabCallbackStub(function12, obj);
                }
            });
            return;
        }
        biometricSettingActivity.ICustomTabsServiceDefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(BiometricSettingActivity biometricSettingActivity) {
        biometricSettingActivity.ICustomTabsServiceDefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asInterface(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onExtraCallback(BiometricSettingActivity biometricSettingActivity, isJSONTypeIgnore isjsontypeignore) {
        if (accessMapSafely.onNavigationEvent.IAuthTabCallback()) {
            onJsBridgeReady.onNavigationEvent(biometricSettingActivity, biometricSettingActivity.getString(R.string.fingerprint_enable_success), 0, 2, (Object) null);
        } else {
            onJsBridgeReady.onNavigationEvent(biometricSettingActivity, biometricSettingActivity.getString(R.string.fingerprint_enable_failed), 0, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onExtraCallback(BiometricSettingActivity biometricSettingActivity, Throwable th) {
        if (!(th instanceof isProxy)) {
            onJsBridgeReady.onNavigationEvent(biometricSettingActivity, biometricSettingActivity.getString(R.string.fingerprint_enable_failed), 0, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private final void ICustomTabsServiceDefault() {
        if (accessMapSafely.onNavigationEvent.IAuthTabCallback()) {
            setEngagementSignalsCallback().setRightCheckBoxChecked(false);
            onNavigationEvent().setRightCheckBoxChecked(true);
        } else {
            setEngagementSignalsCallback().setRightCheckBoxChecked(true);
            onNavigationEvent().setRightCheckBoxChecked(false);
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
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
