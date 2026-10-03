package viva.republica.toss.main.more;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import im.toss.base.BaseActivity;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.CERT_GetPublicKey;
import o.IPostMessageServiceStubProxy;
import o.ITrustedWebActivityCallbackStubProxy;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.addPolicy;
import o.disableImageViewPreallocationAndroid;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.liq;
import o.readIntokhttp;
import o.setProtocolsokhttp;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.more.DisplaySettingActivity;
import viva.republica.toss.main.more.DisplaySettingActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DisplaySettingActivity extends BaseActivity {
    public static final Companion Companion = new Companion(null);
    public static final int IAuthTabCallbackStub = 8;
    private Companion.DisplaySetting asInterface = Companion.DisplaySetting.Companion.onExtraCallback();
    private final Lazy onTransact = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallback(this));

    public long getScreenId() {
        return 1013723L;
    }

    public static final class onExtraCallback implements Function0<CERT_GetPublicKey> {
        final /* synthetic */ Activity onExtraCallbackWithResult;

        public onExtraCallback(Activity activity) {
            this.onExtraCallbackWithResult = activity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final CERT_GetPublicKey invoke() {
            LayoutInflater layoutInflater = this.onExtraCallbackWithResult.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_GetPublicKey.onWarmupCompleted(layoutInflater);
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

    private final CERT_GetPublicKey IAuthTabCallback() {
        Object value = this.onTransact.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (CERT_GetPublicKey) value;
    }

    private final TdsListRowV1View setEngagementSignalsCallback() {
        TdsListRowV1View tdsListRowV1View = IAuthTabCallback().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        return tdsListRowV1View;
    }

    private final TdsListRowV1View onNavigationEvent() {
        TdsListRowV1View tdsListRowV1View = IAuthTabCallback().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        return tdsListRowV1View;
    }

    private final TdsListRowV1View ICustomTabsServiceStub() {
        TdsListRowV1View tdsListRowV1View = IAuthTabCallback().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        return tdsListRowV1View;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(IAuthTabCallback().getRoot());
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
        }
        LinearLayout root = IAuthTabCallback().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(root, IAuthTabCallback().onExtraCallback, (View) null, (View) null, false, 14, (Object) null);
        TdsTopV2View tdsTopV2View = IAuthTabCallback().IAuthTabCallbackDefault;
        tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        String string = getString(R.string.setting_display);
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsTopV2View.setTitleText(string);
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        Intrinsics.checkNotNull(tdsTopV2View);
        Context context = tdsTopV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsTopV2View.setTitleTextColor(new getUrlokhttp(new onExtraCallbackWithResult(configuration)).onUnminimized());
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = setEngagementSignalsCallback().prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
            tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setClickable(false);
            setProtocolsokhttp.onExtraCallbackWithResult(tdsCheckBoxV2ViewPrefetchWithMultipleUrls, false);
        }
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 = onNavigationEvent().prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 != null) {
            tdsCheckBoxV2ViewPrefetchWithMultipleUrls2.setClickable(false);
            setProtocolsokhttp.onExtraCallbackWithResult(tdsCheckBoxV2ViewPrefetchWithMultipleUrls2, false);
        }
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls3 = ICustomTabsServiceStub().prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls3 != null) {
            tdsCheckBoxV2ViewPrefetchWithMultipleUrls3.setClickable(false);
            setProtocolsokhttp.onExtraCallbackWithResult(tdsCheckBoxV2ViewPrefetchWithMultipleUrls3, false);
        }
        setEngagementSignalsCallback().setOnClickListener(new DisplaySettingActivity$.ExternalSyntheticLambda0(this));
        onNavigationEvent().setOnClickListener(new DisplaySettingActivity$.ExternalSyntheticLambda1(this));
        ICustomTabsServiceStub().setOnClickListener(new DisplaySettingActivity$.ExternalSyntheticLambda2(this));
        ICustomTabsServiceDefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(DisplaySettingActivity displaySettingActivity, View view) {
        Companion.DisplaySetting displaySetting = displaySettingActivity.asInterface;
        Companion.DisplaySetting displaySetting2 = Companion.DisplaySetting.LIGHT;
        if (displaySetting != displaySetting2) {
            displaySettingActivity.asInterface = displaySetting2;
            Companion.DisplaySetting.Companion.onWarmupCompleted(displaySetting2);
            displaySettingActivity.ICustomTabsServiceDefault();
            displaySettingActivity.setEngagementSignalsCallback().postDelayed(new DisplaySettingActivity$.ExternalSyntheticLambda4(displaySettingActivity), 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onWarmupCompleted(DisplaySettingActivity displaySettingActivity) {
        ITrustedWebActivityCallbackStubProxy.onWarmupCompleted(1);
        displaySettingActivity.recreate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(DisplaySettingActivity displaySettingActivity, View view) {
        Companion.DisplaySetting displaySetting = displaySettingActivity.asInterface;
        Companion.DisplaySetting displaySetting2 = Companion.DisplaySetting.DARK;
        if (displaySetting != displaySetting2) {
            displaySettingActivity.asInterface = displaySetting2;
            Companion.DisplaySetting.Companion.onWarmupCompleted(displaySetting2);
            displaySettingActivity.ICustomTabsServiceDefault();
            displaySettingActivity.onNavigationEvent().postDelayed(new DisplaySettingActivity$.ExternalSyntheticLambda3(displaySettingActivity), 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void IAuthTabCallback(DisplaySettingActivity displaySettingActivity) {
        ITrustedWebActivityCallbackStubProxy.onWarmupCompleted(2);
        displaySettingActivity.recreate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asInterface(DisplaySettingActivity displaySettingActivity, View view) {
        Companion.DisplaySetting displaySetting = displaySettingActivity.asInterface;
        Companion.DisplaySetting displaySetting2 = Companion.DisplaySetting.SYSTEM;
        if (displaySetting != displaySetting2) {
            displaySettingActivity.asInterface = displaySetting2;
            Companion.DisplaySetting.Companion.onWarmupCompleted(displaySetting2);
            displaySettingActivity.ICustomTabsServiceDefault();
            displaySettingActivity.ICustomTabsServiceStub().postDelayed(new DisplaySettingActivity$.ExternalSyntheticLambda5(displaySettingActivity), 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void asBinder(DisplaySettingActivity displaySettingActivity) {
        ITrustedWebActivityCallbackStubProxy.onWarmupCompleted(-1);
        displaySettingActivity.recreate();
    }

    private final void ICustomTabsServiceDefault() {
        TdsListRowV1View engagementSignalsCallback = setEngagementSignalsCallback();
        boolean z = this.asInterface == Companion.DisplaySetting.LIGHT;
        engagementSignalsCallback.setRightCheckBoxChecked(z);
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = engagementSignalsCallback.prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
            setProtocolsokhttp.onExtraCallbackWithResult(tdsCheckBoxV2ViewPrefetchWithMultipleUrls, z);
        }
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent = onNavigationEvent();
        boolean z2 = this.asInterface == Companion.DisplaySetting.DARK;
        tdsListRowV1ViewOnNavigationEvent.setRightCheckBoxChecked(z2);
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 = tdsListRowV1ViewOnNavigationEvent.prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 != null) {
            setProtocolsokhttp.onExtraCallbackWithResult(tdsCheckBoxV2ViewPrefetchWithMultipleUrls2, z2);
        }
        TdsListRowV1View tdsListRowV1ViewICustomTabsServiceStub = ICustomTabsServiceStub();
        boolean z3 = this.asInterface == Companion.DisplaySetting.SYSTEM;
        tdsListRowV1ViewICustomTabsServiceStub.setRightCheckBoxChecked(z3);
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls3 = tdsListRowV1ViewICustomTabsServiceStub.prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls3 != null) {
            setProtocolsokhttp.onExtraCallbackWithResult(tdsCheckBoxV2ViewPrefetchWithMultipleUrls3, z3);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent onExtraCallback(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new Intent(context, (Class<?>) DisplaySettingActivity.class);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @liq
        public static final class DisplaySetting {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ DisplaySetting[] $VALUES;
            private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
            public static final C0029Companion Companion;
            public static final DisplaySetting LIGHT = new DisplaySetting("LIGHT", 0);
            public static final DisplaySetting DARK = new DisplaySetting("DARK", 1);
            public static final DisplaySetting SYSTEM = new DisplaySetting("SYSTEM", 2);

            private static final /* synthetic */ DisplaySetting[] $values() {
                return new DisplaySetting[]{LIGHT, DARK, SYSTEM};
            }

            public static EnumEntries<DisplaySetting> getEntries() {
                return $ENTRIES;
            }

            public static DisplaySetting valueOf(String str) {
                return (DisplaySetting) Enum.valueOf(DisplaySetting.class, str);
            }

            public static DisplaySetting[] values() {
                return (DisplaySetting[]) $VALUES.clone();
            }

            private DisplaySetting(String str, int i) {
            }

            static {
                DisplaySetting[] displaySettingArr$values = $values();
                $VALUES = displaySettingArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(displaySettingArr$values);
                Companion = new C0029Companion(null);
                $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.main.more.DisplaySettingActivity$Companion$DisplaySetting$$ExternalSyntheticLambda0
                    public final Object invoke() {
                        return DisplaySettingActivity.Companion.DisplaySetting._init_$_anonymous_();
                    }
                });
            }

            /* renamed from: viva.republica.toss.main.more.DisplaySettingActivity$Companion$DisplaySetting$Companion, reason: collision with other inner class name */
            public static final class C0029Companion {

                /* renamed from: viva.republica.toss.main.more.DisplaySettingActivity$Companion$DisplaySetting$Companion$onWarmupCompleted */
                public static final /* synthetic */ class onWarmupCompleted {
                    public static final /* synthetic */ int[] IAuthTabCallback;

                    static {
                        int[] iArr = new int[DisplaySetting.values().length];
                        try {
                            iArr[DisplaySetting.LIGHT.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[DisplaySetting.DARK.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[DisplaySetting.SYSTEM.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        IAuthTabCallback = iArr;
                    }
                }

                public /* synthetic */ C0029Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private C0029Companion() {
                }

                private final /* synthetic */ KSerializer onExtraCallbackWithResult() {
                    return (KSerializer) DisplaySetting.$cachedSerializer$delegate.getValue();
                }

                public final KSerializer<DisplaySetting> serializer() {
                    return onExtraCallbackWithResult();
                }

                public final DisplaySetting onExtraCallback() {
                    return (DisplaySetting) addPolicy.ITrustedWebActivityServiceStub().onExtraCallback("display.setting", DisplaySetting.SYSTEM);
                }

                public final void onWarmupCompleted(@NotNull DisplaySetting displaySetting) {
                    Intrinsics.checkNotNullParameter(displaySetting, "");
                    addPolicy.ITrustedWebActivityServiceStub().IAuthTabCallback("display.setting", displaySetting);
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public final boolean IAuthTabCallback(@NotNull Context context) throws NoWhenBranchMatchedException {
                    Intrinsics.checkNotNullParameter(context, "");
                    int i = context.getResources().getConfiguration().uiMode;
                    int i2 = onWarmupCompleted.IAuthTabCallback[DisplaySetting.Companion.onExtraCallback().ordinal()];
                    if (i2 == 1) {
                        return false;
                    }
                    if (i2 == 2) {
                        return true;
                    }
                    if (i2 == 3) {
                        return (i & 48) == 32;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.main.more.DisplaySettingActivity.Companion.DisplaySetting", values());
            }
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
