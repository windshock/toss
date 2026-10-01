package im.toss.uikit.widget.tooltip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.tosscert.ui.R;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.widget.tooltip.TdsHighlightV3View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.Address;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.AppDataCollectorCompanion;
import o.AppLovinSdkSettings;
import o.Cacheurls1;
import o.M_;
import o.OkHttp;
import o.OkHttpClient;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.attachAppLovinSdk;
import o.deprecated_certificatePinner;
import o.deprecated_dns;
import o.generateAppWithState;
import o.generateLink;
import o.getAdService;
import o.getAppDataMetadata;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getDurationMs;
import o.getExtraParameters;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.isBackgroundWorkRestricted;
import o.isFireOS;
import o.isMuted;
import o.matches;
import o.onLoadStarted;
import o.pxToDp;
import o.readIntokhttp;
import o.response;
import o.runOnUiThreadDelayed;
import o.setBodyokhttp;
import o.setHeadersokhttp;
import o.setProxySelectorokhttp;
import o.setTagsokhttp;
import o.varyFields;
import o.varyMatches;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RectHighlightV3 extends ConstraintLayout implements generateAppWithState {
    private static int newAuthTabSession = 1;
    private static int postMessage;
    private boolean IAuthTabCallback;
    private generateAppWithState.onNavigationEvent IAuthTabCallbackDefault;
    private ViewGroup IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private generateAppWithState.onExtraCallback ICustomTabsCallback;
    private runOnUiThreadDelayed ICustomTabsCallbackDefault;
    private ViewGroup ICustomTabsCallbackStub;
    private Integer ICustomTabsCallbackStubProxy;
    private float ICustomTabsCallback_Parcel;
    private Rect ICustomTabsService;
    private boolean access000;
    private TdsImageView access100;
    private View asBinder;
    private final DisplayMetrics asInterface;
    private String extraCallback;
    private final Paint extraCallbackWithResult;
    private View extraCommand;
    private runOnUiThreadDelayed getInterfaceDescriptor;
    private int[] isEngagementSignalsApiAvailable;
    private TdsRoundLayout mayLaunchUrl;
    private View newSession;
    private float newSessionWithExtras;
    private TdsImageView onActivityLayout;
    private FrameLayout onActivityResized;
    private float onExtraCallback;
    private TdsImageView onExtraCallbackWithResult;
    private int onMessageChannelReady;
    private int onMinimized;
    private final Paint onNavigationEvent;
    private BaseTextView onPostMessage;
    private float onRelationshipValidationResult;
    private runOnUiThreadDelayed onTransact;
    private generateAppWithState.onExtraCallbackWithResult onUnminimized;
    private TdsImageView onWarmupCompleted;
    private int readTypedObject;
    private generateAppWithState.onWarmupCompleted writeTypedObject;

    public static final /* synthetic */ class WhenMappings {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[generateAppWithState.onNavigationEvent.values().length];
            try {
                iArr[generateAppWithState.onNavigationEvent.STRONG.ordinal()] = 1;
                int i = IAuthTabCallback + 43;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[generateAppWithState.onWarmupCompleted.values().length];
            try {
                iArr2[generateAppWithState.onWarmupCompleted.TOP.ordinal()] = 1;
                int i4 = onExtraCallback + 53;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 % 5;
                } else {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[generateAppWithState.onWarmupCompleted.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr2;
            int[] iArr3 = new int[generateAppWithState.onExtraCallback.values().length];
            try {
                iArr3[generateAppWithState.onExtraCallback.LEFT.ordinal()] = 1;
                int i7 = onExtraCallback + 23;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr3[generateAppWithState.onExtraCallback.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[generateAppWithState.onExtraCallback.RIGHT.ordinal()] = 3;
                int i10 = IAuthTabCallback + 69;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                int i12 = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            onExtraCallbackWithResult = iArr3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RectHighlightV3(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RectHighlightV3(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void IAuthTabCallback(RectHighlightV3 rectHighlightV3) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 63;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(rectHighlightV3);
        int i4 = newAuthTabSession + 33;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(RectHighlightV3 rectHighlightV3, boolean z) {
        int i = 2 % 2;
        int i2 = postMessage + 95;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {rectHighlightV3, Boolean.valueOf(z)};
        onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1371588335, -1371588333, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        int i4 = postMessage + 111;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(RectHighlightV3 rectHighlightV3) {
        int i = 2 % 2;
        int i2 = postMessage + 95;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(rectHighlightV3);
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = postMessage + 99;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            return isEngagementSignalsApiAvailable(attachapplovinsdk);
        }
        isEngagementSignalsApiAvailable(attachapplovinsdk);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage + 41;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(appLovinSdkSettings);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        boolean zBooleanValue;
        RectHighlightV3 rectHighlightV3 = (RectHighlightV3) objArr[0];
        View view = (View) objArr[1];
        MotionEvent motionEvent = (MotionEvent) objArr[2];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 53;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            zBooleanValue = ((Boolean) onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{rectHighlightV3, view, motionEvent}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1798219060, 1798219072, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
            int i3 = 22 / 0;
        } else {
            Object[] objArr2 = {rectHighlightV3, view, motionEvent};
            zBooleanValue = ((Boolean) onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr2, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1798219060, 1798219072, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = postMessage + 61;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsCallbackStub(attachapplovinsdk);
        }
        ICustomTabsCallbackStub(attachapplovinsdk);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 101;
        postMessage = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onPostMessage(attachapplovinsdk);
            obj.hashCode();
            throw null;
        }
        Unit unitOnPostMessage = onPostMessage(attachapplovinsdk);
        int i3 = postMessage + 67;
        newAuthTabSession = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnPostMessage;
        }
        throw null;
    }

    public static /* synthetic */ Unit ICustomTabsCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = postMessage + 101;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnMessageChannelReady = onMessageChannelReady(attachapplovinsdk);
        int i4 = newAuthTabSession + 93;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unitOnMessageChannelReady;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        RectHighlightV3 rectHighlightV3 = (RectHighlightV3) objArr[0];
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[1];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 85;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(rectHighlightV3, appLovinSdkSettings);
        int i4 = postMessage + 123;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit access000(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 113;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            newSession(attachapplovinsdk);
            throw null;
        }
        Unit unitNewSession = newSession(attachapplovinsdk);
        int i3 = newAuthTabSession + 81;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        return unitNewSession;
    }

    public static /* synthetic */ Unit access100(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 47;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsService = ICustomTabsService(attachapplovinsdk);
        int i4 = newAuthTabSession + 115;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsService;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 43;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit typedObject = readTypedObject(attachapplovinsdk);
        int i4 = postMessage + 107;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return typedObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asInterface(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = postMessage + 13;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitPostMessage = postMessage(attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        int i5 = newAuthTabSession + 89;
        postMessage = i5 % 128;
        int i6 = i5 % 2;
        return unitPostMessage;
    }

    public static /* synthetic */ Unit extraCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + Imgproc.COLOR_YUV2RGB_YVYU;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel(attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        int i5 = newAuthTabSession + 103;
        postMessage = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return unitICustomTabsCallback_Parcel;
    }

    public static /* synthetic */ Unit extraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = postMessage + 111;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnActivityLayout = onActivityLayout(attachapplovinsdk);
        int i4 = postMessage + 49;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return unitOnActivityLayout;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        RectHighlightV3 rectHighlightV3 = (RectHighlightV3) objArr[0];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 85;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(rectHighlightV3);
        int i4 = postMessage + 23;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = postMessage + 101;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnRelationshipValidationResult = onRelationshipValidationResult(attachapplovinsdk);
        int i4 = postMessage + 101;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnRelationshipValidationResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(double d, AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 93;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(d, appLovinSdkSettings);
        int i4 = postMessage + 33;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(double d, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = postMessage + 59;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(d, attachapplovinsdk);
        }
        onWarmupCompleted(d, attachapplovinsdk);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(RectHighlightV3 rectHighlightV3) {
        int i = 2 % 2;
        int i2 = postMessage + 77;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            return access000(rectHighlightV3);
        }
        access000(rectHighlightV3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 93;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(appLovinSdkSettings);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(appLovinSdkSettings);
        int i3 = newAuthTabSession + 61;
        postMessage = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 27 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 93;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnActivityResized = onActivityResized(attachapplovinsdk);
        int i4 = newAuthTabSession + 3;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnActivityResized;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = ~i;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i3 | i4);
        int i12 = i | i11;
        int i13 = (~(i | i4)) | (~(i7 | i8 | i9)) | i11 | (~(i3 | i));
        int i14 = i3 + i4 + i5 + (1272450877 * i6) + ((-51365948) * i2);
        int i15 = i14 * i14;
        int i16 = ((-261444822) * i3) + 922746880 + ((-1437248296) * i4) + ((-1175803474) * i10) + (i12 * 587901737) + (587901737 * i13) + ((-849346560) * i5) + ((-1881145344) * i6) + ((-578813952) * i2) + ((-124846080) * i15);
        int i17 = (i3 * 1187242746) + 1002376400 + (i4 * 1187242392) + (i10 * (-354)) + (i12 * 177) + (i13 * 177) + (i5 * 1187242569) + (i6 * (-1484311963)) + (i2 * 1141305060) + (i15 * 516358144);
        switch (i16 + (i17 * i17 * (-861863936))) {
            case 1:
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
                int i18 = 2 % 2;
                int i19 = postMessage + 41;
                newAuthTabSession = i19 % 128;
                int i20 = i19 % 2;
                Unit unitOnNavigationEvent = onNavigationEvent(appLovinSdkSettings);
                int i21 = newAuthTabSession + 49;
                postMessage = i21 % 128;
                int i22 = i21 % 2;
                return unitOnNavigationEvent;
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
                int i23 = 2 % 2;
                int i24 = newAuthTabSession + 55;
                postMessage = i24 % 128;
                int i25 = i24 % 2;
                Unit unit = (Unit) onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{attachapplovinsdk}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2096713367, 2096713371, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                int i26 = postMessage + 109;
                newAuthTabSession = i26 % 128;
                int i27 = i26 % 2;
                return unit;
            case 8:
                return asBinder(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                attachAppLovinSdk attachapplovinsdk2 = (attachAppLovinSdk) objArr[0];
                int i28 = 2 % 2;
                int i29 = postMessage + 125;
                newAuthTabSession = i29 % 128;
                int i30 = i29 % 2;
                Unit unitOnUnminimized = onUnminimized(attachapplovinsdk2);
                int i31 = postMessage + 51;
                newAuthTabSession = i31 % 128;
                int i32 = i31 % 2;
                return unitOnUnminimized;
            case 12:
                return asInterface(objArr);
            case 13:
                return access000(objArr);
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            case 15:
                return IAuthTabCallbackStubProxy(objArr);
            case 16:
                return getInterfaceDescriptor(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 87;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCommand = extraCommand(attachapplovinsdk);
        int i4 = postMessage + 87;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return unitExtraCommand;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(RectHighlightV3 rectHighlightV3) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 49;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(rectHighlightV3);
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onNavigationEvent(RectHighlightV3 rectHighlightV3, getAppDataMetadata getappdatametadata) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 95;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(rectHighlightV3, getappdatametadata);
        int i4 = newAuthTabSession + 109;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = postMessage + 45;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{attachapplovinsdk}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2064912387, 2064912393, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        }
        int i3 = 94 / 0;
        return (Unit) onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{attachapplovinsdk}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2064912387, 2064912393, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ void onNavigationEvent(View view, RectHighlightV3 rectHighlightV3, ViewGroup viewGroup, ViewGroup viewGroup2, Integer num, Integer num2, String str, generateAppWithState.onWarmupCompleted onwarmupcompleted, generateAppWithState.onExtraCallback onextracallback, generateAppWithState.onNavigationEvent onnavigationevent, boolean z, generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, long j) {
        int i = 2 % 2;
        int i2 = postMessage + 51;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(view, rectHighlightV3, viewGroup, viewGroup2, num, num2, str, onwarmupcompleted, onextracallback, onnavigationevent, z, onextracallbackwithresult, j);
        if (i3 == 0) {
            throw null;
        }
        int i4 = postMessage + 39;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onTransact(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = postMessage + 49;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        int i5 = newAuthTabSession + 99;
        postMessage = i5 % 128;
        int i6 = i5 % 2;
        return unitICustomTabsCallbackStubProxy;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage + 39;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnMinimized = onMinimized(attachapplovinsdk);
        int i4 = postMessage + 83;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return unitOnMinimized;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RectHighlightV3 rectHighlightV3) {
        int i = 2 % 2;
        int i2 = postMessage + 13;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact(rectHighlightV3);
        }
        onTransact(rectHighlightV3);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RectHighlightV3 rectHighlightV3, AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = postMessage + 49;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(rectHighlightV3, appLovinSdkSettings);
        int i4 = postMessage + 87;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit writeTypedObject(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = postMessage + 73;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitNewAuthTabSession = newAuthTabSession(attachapplovinsdk);
        int i4 = newAuthTabSession + 111;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unitNewAuthTabSession;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RectHighlightV3(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = newAuthTabSession + 57;
            postMessage = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = newAuthTabSession + 29;
            postMessage = i6 % 128;
            i = i6 % 2 != 0 ? 1 : 0;
            int i7 = 2 % 2;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ boolean asInterface(RectHighlightV3 rectHighlightV3) {
        int i = 2 % 2;
        int i2 = postMessage + 75;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallback = rectHighlightV3.extraCallback();
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        int i5 = postMessage + 39;
        newAuthTabSession = i5 % 128;
        if (i5 % 2 != 0) {
            return zExtraCallback;
        }
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(RectHighlightV3 rectHighlightV3, Function0 function0) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 17;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {rectHighlightV3, function0};
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted4 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        if (i3 != 0) {
            onExtraCallbackWithResult(iOnWarmupCompleted, objArr, iOnWarmupCompleted4, -1805472297, 1805472307, iOnWarmupCompleted2, iOnWarmupCompleted3);
            throw null;
        }
        onExtraCallbackWithResult(iOnWarmupCompleted, objArr, iOnWarmupCompleted4, -1805472297, 1805472307, iOnWarmupCompleted2, iOnWarmupCompleted3);
        int i4 = newAuthTabSession + 111;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.generateAppWithState
    public /* bridge */ boolean onExtraCallbackWithResult(@NotNull Rect rect, float f, float f2) {
        int i = 2 % 2;
        int i2 = postMessage + 25;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult(rect, f, f2);
        int i4 = postMessage + 51;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public ViewGroup onExtraCallback() {
        int i = 2 % 2;
        int i2 = postMessage;
        int i3 = i2 + 7;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        ViewGroup viewGroup = this.IAuthTabCallbackStub;
        int i5 = i2 + 119;
        newAuthTabSession = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return viewGroup;
    }

    public void setDecorView(@Nullable ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + 55;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackStub = viewGroup;
        int i5 = i2 + 111;
        postMessage = i5 % 128;
        int i6 = i5 % 2;
    }

    public runOnUiThreadDelayed IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = postMessage + 105;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        runOnUiThreadDelayed runonuithreaddelayed = this.ICustomTabsCallbackDefault;
        int i4 = i3 + 67;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return runonuithreaddelayed;
        }
        obj.hashCode();
        throw null;
    }

    public void setStartTimeline(@Nullable runOnUiThreadDelayed runonuithreaddelayed) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 79;
        int i3 = i2 % 128;
        postMessage = i3;
        int i4 = i2 % 2;
        this.ICustomTabsCallbackDefault = runonuithreaddelayed;
        int i5 = i3 + 65;
        newAuthTabSession = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public runOnUiThreadDelayed onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 31;
        int i3 = i2 % 128;
        postMessage = i3;
        int i4 = i2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = this.onTransact;
        int i5 = i3 + 85;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
        return runonuithreaddelayed;
    }

    public void setEndTimeline(@Nullable runOnUiThreadDelayed runonuithreaddelayed) {
        int i = 2 % 2;
        int i2 = postMessage + 91;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        int i4 = i2 % 2;
        this.onTransact = runonuithreaddelayed;
        int i5 = i3 + 111;
        postMessage = i5 % 128;
        int i6 = i5 % 2;
    }

    public View asInterface() {
        int i = 2 % 2;
        int i2 = postMessage;
        int i3 = i2 + 49;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        View view = this.extraCommand;
        int i5 = i2 + 71;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    public void setTargetView(@Nullable View view) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 67;
        int i3 = i2 % 128;
        postMessage = i3;
        int i4 = i2 % 2;
        this.extraCommand = view;
        int i5 = i3 + 123;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setMessage(@Nullable String str) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 39;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        this.extraCallback = str;
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
    }

    public generateAppWithState.onExtraCallback onExtraCallbackWithResult() {
        generateAppWithState.onExtraCallback onextracallback;
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + 61;
        postMessage = i3 % 128;
        if (i3 % 2 != 0) {
            onextracallback = this.ICustomTabsCallback;
            int i4 = 76 / 0;
        } else {
            onextracallback = this.ICustomTabsCallback;
        }
        int i5 = i2 + 13;
        postMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return onextracallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setMessageAlign(@NotNull generateAppWithState.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = postMessage + 79;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.ICustomTabsCallback = onextracallback;
        int i4 = postMessage + 109;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    public ViewGroup IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = postMessage;
        int i3 = i2 + 79;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        ViewGroup viewGroup = this.ICustomTabsCallbackStub;
        int i5 = i2 + 89;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
        return viewGroup;
    }

    public void setParentViewGroup(@Nullable ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 15;
        int i3 = i2 % 128;
        postMessage = i3;
        int i4 = i2 % 2;
        this.ICustomTabsCallbackStub = viewGroup;
        int i5 = i3 + 75;
        newAuthTabSession = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 10 / 0;
        }
    }

    public int[] IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + 15;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        int[] iArr = this.isEngagementSignalsApiAvailable;
        int i5 = i2 + 29;
        postMessage = i5 % 128;
        int i6 = i5 % 2;
        return iArr;
    }

    public void setTargetViewPosition(@NotNull int[] iArr) {
        int i = 2 % 2;
        int i2 = postMessage + 115;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iArr, "");
        this.isEngagementSignalsApiAvailable = iArr;
        int i4 = postMessage + 93;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    public Rect onTransact() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 55;
        int i3 = i2 % 128;
        postMessage = i3;
        int i4 = i2 % 2;
        Rect rect = this.ICustomTabsService;
        int i5 = i3 + 87;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
        return rect;
    }

    public void setTargetRect(@NotNull Rect rect) {
        int i = 2 % 2;
        int i2 = postMessage + 99;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rect, "");
            this.ICustomTabsService = rect;
        } else {
            Intrinsics.checkNotNullParameter(rect, "");
            this.ICustomTabsService = rect;
            int i3 = 96 / 0;
        }
    }

    public Integer asBinder() {
        int i = 2 % 2;
        int i2 = postMessage + 27;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        int i4 = i2 % 2;
        Integer num = this.ICustomTabsCallbackStubProxy;
        int i5 = i3 + 51;
        postMessage = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return num;
    }

    public void setPlayCount(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = postMessage + 103;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        int i4 = i2 % 2;
        this.ICustomTabsCallbackStubProxy = num;
        int i5 = i3 + 101;
        postMessage = i5 % 128;
        int i6 = i5 % 2;
    }

    public float access000() {
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + 47;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        float f = this.ICustomTabsCallback_Parcel;
        int i5 = i2 + 109;
        postMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTargetViewX(float f) {
        int i = 2 % 2;
        int i2 = postMessage + 71;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        int i4 = i2 % 2;
        this.ICustomTabsCallback_Parcel = f;
        int i5 = i3 + 5;
        postMessage = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public float getInterfaceDescriptor() {
        float f;
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + 67;
        postMessage = i3 % 128;
        if (i3 % 2 != 0) {
            f = this.newSessionWithExtras;
            int i4 = 99 / 0;
        } else {
            f = this.newSessionWithExtras;
        }
        int i5 = i2 + 109;
        postMessage = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public void setTargetViewY(float f) {
        int i = 2 % 2;
        int i2 = postMessage + 89;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        int i4 = i2 % 2;
        this.newSessionWithExtras = f;
        int i5 = i3 + 113;
        postMessage = i5 % 128;
        int i6 = i5 % 2;
    }

    public View onNavigationEvent() {
        View view;
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
        postMessage = i3 % 128;
        if (i3 % 2 != 0) {
            view = this.asBinder;
            int i4 = 43 / 0;
        } else {
            view = this.asBinder;
        }
        int i5 = i2 + 107;
        postMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return view;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setDim(@NotNull View view) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 19;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        this.asBinder = view;
        int i4 = postMessage + 69;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RectHighlightV3(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.ICustomTabsCallback = generateAppWithState.onExtraCallback.CENTER;
        this.isEngagementSignalsApiAvailable = new int[2];
        this.writeTypedObject = generateAppWithState.onWarmupCompleted.BOTTOM;
        this.ICustomTabsService = new Rect();
        this.ICustomTabsCallback_Parcel = -1.0f;
        this.newSessionWithExtras = -1.0f;
        this.IAuthTabCallback_Parcel = setTagsokhttp.onExtraCallbackWithResult(this, 14);
        this.readTypedObject = -1;
        this.onExtraCallback = -1.0f;
        this.IAuthTabCallback = true;
        this.onRelationshipValidationResult = -1.0f;
        this.IAuthTabCallbackDefault = generateAppWithState.onNavigationEvent.WEAK;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.asInterface = displayMetrics;
        setLayerType(2, null);
        setClipChildren(true);
        setClipToPadding(true);
        if (getLayoutParams() == null) {
            setLayoutParams(new ConstraintLayout.onExtraCallbackWithResult(-1, -1));
            int i2 = postMessage + 67;
            newAuthTabSession = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        View view = new View(getContext());
        Class cls = Integer.TYPE;
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(onextracallbackwithresult);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).width = -1;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).height = -1;
        view.setLayoutParams(onextracallbackwithresult);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Resources resources = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        final Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        view.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new getAdService() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$_init_$lambda$0$$inlined$getColorScheme$1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                int i5 = 2 % 2;
                int i6 = onNavigationEvent + 75;
                IAuthTabCallback = i6 % 128;
                Object obj = null;
                if (i6 % 2 != 0) {
                    if (readIntokhttp.onExtraCallback(configuration)) {
                        return getSpecialFeatureOptInStatus.Dark;
                    }
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                    int i7 = IAuthTabCallback + 41;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        return getspecialfeatureoptinstatus;
                    }
                    throw null;
                }
                readIntokhttp.onExtraCallback(configuration);
                obj.hashCode();
                throw null;
            }
        }).onWarmupCompleted());
        view.setVisibility(4);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, view);
        setDim(view);
        View view2 = new View(getContext());
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult3 = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(onextracallbackwithresult3);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult3;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult4).width = -2;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult4).height = -2;
        view2.setLayoutParams(onextracallbackwithresult3);
        view2.setVisibility(4);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, view2);
        this.newSession = view2;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsImageView tdsImageView = new TdsImageView(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        getDurationMs.onExtraCallback onextracallback = getDurationMs.onExtraCallback.onExtraCallbackWithResult;
        TdsImageView.setImage$default(tdsImageView, onextracallback.onWarmupCompleted(), (Function1) null, (Function1) null, 6, (Object) null);
        tdsImageView.setVisibility(4);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, tdsImageView);
        this.access100 = tdsImageView;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        FrameLayout frameLayout = new FrameLayout(context4);
        frameLayout.setLayoutParams(new ConstraintLayout.onExtraCallbackWithResult(-2, -2));
        Context context5 = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        TdsImageView tdsImageView2 = new TdsImageView(context5, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsImageView2.setTag("BlueGradient");
        tdsImageView2.setAlpha(0.0f);
        TdsImageView.setImage$default(tdsImageView2, onextracallback.IAuthTabCallback(context), (Function1) null, (Function1) null, 6, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(frameLayout, tdsImageView2);
        this.onExtraCallbackWithResult = tdsImageView2;
        Context context6 = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        TdsImageView tdsImageView3 = new TdsImageView(context6, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsImageView3.setTag("MintGradient");
        TdsImageView.setImage$default(tdsImageView3, onextracallback.onExtraCallback(context), (Function1) null, (Function1) null, 6, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(frameLayout, tdsImageView3);
        this.onActivityLayout = tdsImageView3;
        frameLayout.setVisibility(4);
        frameLayout.setAlpha(0.0f);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, frameLayout);
        this.onActivityResized = frameLayout;
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        TdsImageView tdsImageView4 = new TdsImageView(context7, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult5 = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(onextracallbackwithresult5);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult6 = onextracallbackwithresult5;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult6).width = setTagsokhttp.onExtraCallbackWithResult(tdsImageView4, 25);
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult6).height = setTagsokhttp.onExtraCallbackWithResult(tdsImageView4, 25);
        tdsImageView4.setLayoutParams(onextracallbackwithresult5);
        tdsImageView4.setPadding(setTagsokhttp.onExtraCallbackWithResult(tdsImageView4, 5), setTagsokhttp.onExtraCallbackWithResult(tdsImageView4, 5), setTagsokhttp.onExtraCallbackWithResult(tdsImageView4, 5), setTagsokhttp.onExtraCallbackWithResult(tdsImageView4, 5));
        tdsImageView4.setImageTintList(ColorStateList.valueOf(onextracallback.onWarmupCompleted(((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue())));
        tdsImageView4.setImage(OkHttpClient.onExtraCallback(OkHttp.onExtraCallback));
        tdsImageView4.setVisibility(4);
        tdsImageView4.setClickable(true);
        tdsImageView4.setFocusable(true);
        tdsImageView4.setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda20
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                int i5 = 2 % 2;
                int i6 = IAuthTabCallback + 115;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                boolean zIAuthTabCallback = RectHighlightV3.IAuthTabCallback(this.f$0, view3, motionEvent);
                if (i7 == 0) {
                    int i8 = 48 / 0;
                }
                return zIAuthTabCallback;
            }
        });
        setProxySelectorokhttp.onExtraCallbackWithResult(this, tdsImageView4);
        this.onWarmupCompleted = tdsImageView4;
        BaseTextView baseTextView = (BaseTextView) Typography6.class.getDeclaredConstructor(Context.class).newInstance(getContext());
        Intrinsics.checkNotNull(baseTextView);
        baseTextView.onNavigationEvent(response.Bold);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult7 = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(onextracallbackwithresult7);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult8 = onextracallbackwithresult7;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult8).width = -1;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult8).height = -2;
        baseTextView.setLayoutParams(onextracallbackwithresult7);
        baseTextView.setVisibility(4);
        baseTextView.setMaxWidth(displayMetrics.widthPixels);
        baseTextView.setPaddingRelative(setTagsokhttp.onExtraCallbackWithResult(baseTextView, 14), 0, setTagsokhttp.onExtraCallbackWithResult(baseTextView, 14), 0);
        baseTextView.setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda21
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                int i5 = 2 % 2;
                int i6 = onNavigationEvent + 79;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    RectHighlightV3.IAuthTabCallback(view3, motionEvent);
                    throw null;
                }
                boolean zIAuthTabCallback = RectHighlightV3.IAuthTabCallback(view3, motionEvent);
                int i7 = onNavigationEvent + 63;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return zIAuthTabCallback;
            }
        });
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, baseTextView);
        this.onPostMessage = baseTextView;
        TdsRoundLayout tdsRoundLayout = new TdsRoundLayout(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsRoundLayout.setLayoutParams(new ConstraintLayout.onExtraCallbackWithResult(-2, -2));
        tdsRoundLayout.setVisibility(4);
        this.mayLaunchUrl = tdsRoundLayout;
        addView(tdsRoundLayout);
        Paint paint = new Paint();
        paint.setColor(0);
        this.extraCallbackWithResult = paint;
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.onNavigationEvent = paint2;
        int i5 = postMessage + 97;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
    }

    public static boolean IAuthTabCallback(RectHighlightV3 rectHighlightV3, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = postMessage + 37;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        int action = motionEvent.getAction();
        if (action == 0) {
            pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
            Intrinsics.checkNotNull(view);
            isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsJVMKt.listOf((Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(0.9f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null), false, 1, (Object) null);
            return false;
        }
        if (action != 1) {
            int i4 = newAuthTabSession + 39;
            postMessage = i4 % 128;
            return i4 % 2 != 0;
        }
        rectHighlightV3.IAuthTabCallback();
        int i5 = postMessage + 65;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public static boolean IAuthTabCallback(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + 109;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 43;
        postMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback_Parcel(RectHighlightV3 rectHighlightV3) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 93;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        rectHighlightV3.writeTypedObject();
        rectHighlightV3.onNavigationEvent(false);
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 63;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStubProxy(RectHighlightV3 rectHighlightV3) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 27;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        rectHighlightV3.writeTypedObject();
        rectHighlightV3.onNavigationEvent(false);
        Unit unit = Unit.INSTANCE;
        int i4 = postMessage + 29;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.generateAppWithState
    public void onExtraCallbackWithResult(@NotNull Rect rect) {
        int i = 2 % 2;
        int i2 = postMessage + 101;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rect, "");
            setTargetRect(rect);
            isAttachedToWindow();
            throw null;
        }
        Intrinsics.checkNotNullParameter(rect, "");
        setTargetRect(rect);
        if (isAttachedToWindow()) {
            Object[] objArr = {this, new Function0() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda16
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i3 = 2 % 2;
                    int i4 = onExtraCallback + 81;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    Object[] objArr2 = {this.f$0};
                    if (i5 == 0) {
                        return (Unit) RectHighlightV3.onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr2, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 604835727, -604835711, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                    }
                    throw null;
                }
            }};
            onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1805472297, 1805472307, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            int i3 = newAuthTabSession + 7;
            postMessage = i3 % 128;
            int i4 = i3 % 2;
        }
        IAuthTabCallbackStubProxy();
    }

    public static /* synthetic */ void setTargetView$default(RectHighlightV3 rectHighlightV3, View view, ViewGroup viewGroup, ViewGroup viewGroup2, Integer num, String str, generateAppWithState.onWarmupCompleted onwarmupcompleted, generateAppWithState.onExtraCallback onextracallback, generateAppWithState.onNavigationEvent onnavigationevent, boolean z, Integer num2, generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, long j, int i, Object obj) {
        Integer num3;
        Integer num4;
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 8) != 0) {
            int i3 = newAuthTabSession + 49;
            postMessage = i3 % 128;
            if (i3 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i & Imgcodecs.IMWRITE_AVIF_QUALITY) != 0) {
            int i4 = newAuthTabSession + 29;
            postMessage = i4 % 128;
            int i5 = i4 % 2;
            num4 = null;
        } else {
            num4 = num2;
        }
        rectHighlightV3.setTargetView(view, viewGroup, viewGroup2, num3, str, onwarmupcompleted, onextracallback, onnavigationevent, z, num4, onextracallbackwithresult, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f A[PHI: r4
      0x004f: PHI (r4v8 android.view.ViewGroup) = (r4v7 android.view.ViewGroup), (r4v10 android.view.ViewGroup) binds: [B:10:0x004d, B:7:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTargetView(@NotNull View view, @NotNull final ViewGroup viewGroup, @NotNull final ViewGroup viewGroup2, @Nullable final Integer num, @Nullable final String str, @NotNull final generateAppWithState.onWarmupCompleted onwarmupcompleted, @NotNull final generateAppWithState.onExtraCallback onextracallback, @NotNull final generateAppWithState.onNavigationEvent onnavigationevent, final boolean z, @Nullable final Integer num2, @Nullable final generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, final long j) {
        ViewGroup viewGroup3;
        View view2 = view;
        int i = 2 % 2;
        int i2 = postMessage + 69;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view2, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(viewGroup2, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        if (view2 instanceof ViewGroup) {
            int i4 = postMessage + 93;
            newAuthTabSession = i4 % 128;
            if (i4 % 2 == 0) {
                viewGroup3 = (ViewGroup) view2;
                if (viewGroup3.getChildCount() == 1) {
                    if (viewGroup3.getChildAt(0) instanceof TdsListRowV1View) {
                        int i5 = newAuthTabSession + 101;
                        postMessage = i5 % 128;
                        View childAt = i5 % 2 != 0 ? viewGroup3.getChildAt(1) : viewGroup3.getChildAt(0);
                        Intrinsics.checkNotNull(childAt, "");
                        view2 = (TdsListRowV1View) childAt;
                    }
                }
            } else {
                viewGroup3 = (ViewGroup) view2;
                if (viewGroup3.getChildCount() == 1) {
                }
            }
        }
        setTargetView(view2);
        final View viewAsInterface = asInterface();
        if (viewAsInterface == null) {
            return;
        }
        viewAsInterface.post(new Runnable() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda18
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = 2 % 2;
                int i7 = onNavigationEvent + 35;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                RectHighlightV3.onNavigationEvent(viewAsInterface, this, viewGroup, viewGroup2, num, num2, str, onwarmupcompleted, onextracallback, onnavigationevent, z, onextracallbackwithresult, j);
                int i9 = onNavigationEvent + 111;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
            }
        });
    }

    private static final void IAuthTabCallback(View view, RectHighlightV3 rectHighlightV3, ViewGroup viewGroup, ViewGroup viewGroup2, Integer num, Integer num2, String str, generateAppWithState.onWarmupCompleted onwarmupcompleted, generateAppWithState.onExtraCallback onextracallback, generateAppWithState.onNavigationEvent onnavigationevent, boolean z, generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, long j) {
        int i = 2 % 2;
        view.getLocationOnScreen(rectHighlightV3.IAuthTabCallback_Parcel());
        rectHighlightV3.setTargetRect(new Rect(rectHighlightV3.IAuthTabCallback_Parcel()[0], rectHighlightV3.IAuthTabCallback_Parcel()[1], rectHighlightV3.IAuthTabCallback_Parcel()[0] + view.getWidth(), rectHighlightV3.IAuthTabCallback_Parcel()[1] + view.getHeight()));
        rectHighlightV3.onExtraCallback(viewGroup, viewGroup2, num, num2, str, onwarmupcompleted, onextracallback, onnavigationevent, z, onextracallbackwithresult, j);
        int i2 = postMessage + 95;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 0 / 0;
        }
    }

    public static /* synthetic */ void setTargetRect$default(RectHighlightV3 rectHighlightV3, Rect rect, ViewGroup viewGroup, ViewGroup viewGroup2, Integer num, String str, generateAppWithState.onWarmupCompleted onwarmupcompleted, generateAppWithState.onExtraCallback onextracallback, generateAppWithState.onNavigationEvent onnavigationevent, boolean z, Integer num2, generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, long j, int i, Object obj) {
        Integer num3;
        Integer num4;
        int i2 = 2 % 2;
        if ((i & 8) != 0) {
            int i3 = postMessage + 43;
            newAuthTabSession = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 77 / 0;
            }
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i & Imgcodecs.IMWRITE_AVIF_QUALITY) != 0) {
            int i5 = postMessage + Imgproc.COLOR_YUV2RGB_YVYU;
            newAuthTabSession = i5 % 128;
            int i6 = i5 % 2;
            num4 = null;
        } else {
            num4 = num2;
        }
        rectHighlightV3.setTargetRect(rect, viewGroup, viewGroup2, num3, str, onwarmupcompleted, onextracallback, onnavigationevent, z, num4, onextracallbackwithresult, j);
    }

    public final void setTargetRect(@NotNull Rect rect, @NotNull ViewGroup viewGroup, @NotNull ViewGroup viewGroup2, @Nullable Integer num, @Nullable String str, @NotNull generateAppWithState.onWarmupCompleted onwarmupcompleted, @NotNull generateAppWithState.onExtraCallback onextracallback, @NotNull generateAppWithState.onNavigationEvent onnavigationevent, boolean z, @Nullable Integer num2, @Nullable generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, long j) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 25;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(viewGroup2, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        setTargetRect(rect);
        onExtraCallback(viewGroup, viewGroup2, num, num2, str, onwarmupcompleted, onextracallback, onnavigationevent, z, onextracallbackwithresult, j);
        int i4 = newAuthTabSession + 93;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void IAuthTabCallbackStub(final RectHighlightV3 rectHighlightV3) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 43;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            if (rectHighlightV3.isAttachedToWindow()) {
                Object[] objArr = {rectHighlightV3, new Function0() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda37
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unitOnWarmupCompleted;
                        int i3 = 2 % 2;
                        int i4 = onExtraCallbackWithResult + 57;
                        onExtraCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            unitOnWarmupCompleted = RectHighlightV3.onWarmupCompleted(this.f$0);
                            int i5 = 10 / 0;
                        } else {
                            unitOnWarmupCompleted = RectHighlightV3.onWarmupCompleted(this.f$0);
                        }
                        int i6 = onExtraCallback + 7;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        return unitOnWarmupCompleted;
                    }
                }};
                onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1805472297, 1805472307, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                int i3 = newAuthTabSession + 79;
                postMessage = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        rectHighlightV3.isAttachedToWindow();
        throw null;
    }

    private static final Unit onTransact(RectHighlightV3 rectHighlightV3) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 17;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        rectHighlightV3.writeTypedObject();
        rectHighlightV3.onNavigationEvent(true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(ViewGroup viewGroup, ViewGroup viewGroup2, Integer num, Integer num2, String str, generateAppWithState.onWarmupCompleted onwarmupcompleted, generateAppWithState.onExtraCallback onextracallback, generateAppWithState.onNavigationEvent onnavigationevent, boolean z, generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, long j) {
        int i = 2 % 2;
        setParentViewGroup(viewGroup2);
        viewGroup2.addView(this);
        this.readTypedObject = num != null ? num.intValue() : -1;
        setDecorView(viewGroup);
        setMessage(str);
        this.writeTypedObject = onwarmupcompleted;
        setMessageAlign(onextracallback);
        this.IAuthTabCallbackDefault = onnavigationevent;
        setPlayCount(num2);
        setOnDismissListener(onextracallbackwithresult);
        boolean z2 = false;
        if (WhenMappings.onNavigationEvent[onnavigationevent.ordinal()] == 1) {
            int i2 = postMessage;
            int i3 = i2 + 19;
            newAuthTabSession = i3 % 128;
            z = i3 % 2 != 0;
            int i4 = i2 + 37;
            newAuthTabSession = i4 % 128;
            int i5 = i4 % 2;
        }
        this.IAuthTabCallback = z;
        View viewOnNavigationEvent = onNavigationEvent();
        generateAppWithState.onNavigationEvent onnavigationevent2 = generateAppWithState.onNavigationEvent.STRONG;
        viewOnNavigationEvent.setClickable(onnavigationevent == onnavigationevent2);
        View viewOnNavigationEvent2 = onNavigationEvent();
        if (onnavigationevent == onnavigationevent2) {
            int i6 = postMessage + 37;
            newAuthTabSession = i6 % 128;
            int i7 = i6 % 2;
            z2 = true;
        }
        viewOnNavigationEvent2.setFocusable(z2);
        this.onPostMessage.setText(str);
        postDelayed(new Runnable() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda19
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i8 = 2 % 2;
                int i9 = onNavigationEvent + 55;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                RectHighlightV3.IAuthTabCallback(this.f$0);
                if (i10 != 0) {
                    int i11 = 12 / 0;
                }
            }
        }, j);
        IAuthTabCallbackStubProxy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 33;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int i3 = 89 / 0;
            if (varyFields.onWarmupCompleted(context)) {
                return;
            }
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            if (varyFields.onWarmupCompleted(context2)) {
                return;
            }
        }
        onNavigationEvent().setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda17
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 91;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = {this.f$0, view, motionEvent};
                boolean zBooleanValue = ((Boolean) RectHighlightV3.onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1593113614, 1593113629, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
                int i7 = onExtraCallback + 35;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    return zBooleanValue;
                }
                throw null;
            }
        });
        int i4 = postMessage + 27;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        RectHighlightV3 rectHighlightV3 = (RectHighlightV3) objArr[0];
        MotionEvent motionEvent = (MotionEvent) objArr[2];
        int i = 2 % 2;
        int action = motionEvent.getAction();
        if (action == 0) {
            boolean zOnExtraCallbackWithResult = rectHighlightV3.onExtraCallbackWithResult(rectHighlightV3.onTransact(), motionEvent.getX(), motionEvent.getY());
            rectHighlightV3.access000 = !zOnExtraCallbackWithResult;
            if (zOnExtraCallbackWithResult) {
                View viewAsInterface = rectHighlightV3.asInterface();
                if (viewAsInterface != null) {
                    viewAsInterface.setPressed(true);
                    viewAsInterface.onTouchEvent(motionEvent);
                } else {
                    rectHighlightV3.IAuthTabCallback();
                    int i2 = postMessage + Imgproc.COLOR_YUV2RGBA_YVYU;
                    newAuthTabSession = i2 % 128;
                    int i3 = i2 % 2;
                }
            } else if (rectHighlightV3.IAuthTabCallbackDefault == generateAppWithState.onNavigationEvent.WEAK) {
                rectHighlightV3.IAuthTabCallback();
            }
        } else if (action != 1) {
            if (action == 3) {
                if (!rectHighlightV3.access000) {
                    View viewAsInterface2 = rectHighlightV3.asInterface();
                    if (viewAsInterface2 != null) {
                        viewAsInterface2.setPressed(false);
                    }
                    View viewAsInterface3 = rectHighlightV3.asInterface();
                    if (viewAsInterface3 != null) {
                        viewAsInterface3.onTouchEvent(motionEvent);
                    }
                }
                rectHighlightV3.access000 = false;
                rectHighlightV3.IAuthTabCallback();
            }
        } else if (!rectHighlightV3.access000) {
            View viewAsInterface4 = rectHighlightV3.asInterface();
            if (viewAsInterface4 != null) {
                int i4 = postMessage + 75;
                newAuthTabSession = i4 % 128;
                if (i4 % 2 == 0) {
                    viewAsInterface4.setPressed(false);
                } else {
                    viewAsInterface4.setPressed(false);
                }
            }
            View viewAsInterface5 = rectHighlightV3.asInterface();
            if (viewAsInterface5 != null) {
                viewAsInterface5.onTouchEvent(motionEvent);
            }
            if (rectHighlightV3.onExtraCallbackWithResult(rectHighlightV3.onTransact(), motionEvent.getX(), motionEvent.getY())) {
                int i5 = newAuthTabSession + 71;
                postMessage = i5 % 128;
                int i6 = i5 % 2;
                View viewAsInterface6 = rectHighlightV3.asInterface();
                if (viewAsInterface6 != null) {
                    viewAsInterface6.performClick();
                }
            }
            rectHighlightV3.access000 = false;
            rectHighlightV3.IAuthTabCallback();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = postMessage + 75;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.onDetachedFromWindow();
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (runonuithreaddelayedIAuthTabCallbackDefault != null) {
            int i4 = postMessage + 119;
            newAuthTabSession = i4 % 128;
            if (i4 % 2 != 0) {
                runonuithreaddelayedIAuthTabCallbackDefault.onNavigationEvent();
            } else {
                runonuithreaddelayedIAuthTabCallbackDefault.onNavigationEvent();
                int i5 = 96 / 0;
            }
        }
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = onWarmupCompleted();
        if (runonuithreaddelayedOnWarmupCompleted != null) {
            runonuithreaddelayedOnWarmupCompleted.onNavigationEvent();
            int i6 = newAuthTabSession + 99;
            postMessage = i6 % 128;
            int i7 = i6 % 2;
        }
        runOnUiThreadDelayed runonuithreaddelayed = this.getInterfaceDescriptor;
        if (runonuithreaddelayed != null) {
            int i8 = postMessage + 71;
            newAuthTabSession = i8 % 128;
            if (i8 % 2 != 0) {
                runonuithreaddelayed.onNavigationEvent();
            } else {
                runonuithreaddelayed.onNavigationEvent();
                int i9 = 66 / 0;
            }
        }
        setStartTimeline(null);
        setEndTimeline(null);
        this.getInterfaceDescriptor = null;
    }

    public void IAuthTabCallback() {
        int i = 2 % 2;
        if (this.IAuthTabCallbackStubProxy) {
            return;
        }
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = onWarmupCompleted();
        if (runonuithreaddelayedOnWarmupCompleted != null) {
            int i2 = newAuthTabSession + 83;
            postMessage = i2 % 128;
            if (i2 % 2 != 0) {
                if (!runonuithreaddelayedOnWarmupCompleted.postMessage()) {
                    return;
                }
            } else if (runonuithreaddelayedOnWarmupCompleted.postMessage()) {
                return;
            }
        }
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (runonuithreaddelayedIAuthTabCallbackDefault != null) {
            int i3 = newAuthTabSession + 73;
            postMessage = i3 % 128;
            int i4 = i3 % 2;
            if (!runonuithreaddelayedIAuthTabCallbackDefault.prefetch()) {
                return;
            }
        }
        this.IAuthTabCallbackStubProxy = true;
        IAuthTabCallback(getAppDataMetadata.USER_TOUCHED);
    }

    public final void setOnDismissListener(@Nullable generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        this.onUnminimized = onextracallbackwithresult;
        int i5 = i2 + 57;
        postMessage = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, im.toss.uikit.widget.tooltip.RectHighlightV3] */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        ?? r0 = (RectHighlightV3) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult((View) r0);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
            int i2 = postMessage + 51;
            newAuthTabSession = i2 % 128;
            int i3 = i2 % 2;
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
            if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                onLoadStarted.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, null, null, new RectHighlightV3$runAtViewStabled$1(r0, function0, null), 3, null);
            }
        }
        int i4 = newAuthTabSession + 57;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(final boolean z) {
        int i = 2 % 2;
        post(new Runnable() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda36
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 103;
                onWarmupCompleted = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    RectHighlightV3.IAuthTabCallback(this.f$0, z);
                    obj.hashCode();
                    throw null;
                }
                RectHighlightV3.IAuthTabCallback(this.f$0, z);
                int i4 = onNavigationEvent + 87;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = newAuthTabSession + 123;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [android.view.View, im.toss.uikit.widget.tooltip.RectHighlightV3, java.lang.Object] */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        int iWidth;
        int i;
        int i2;
        Float f;
        Float f2;
        final RectHighlightV3 rectHighlightV3;
        Rally rally;
        Boolean bool;
        Integer num;
        Float f3;
        Float f4;
        int iIntValue;
        boolean z;
        Throwable th;
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted;
        ?? r13 = (RectHighlightV3) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i3 = 2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        View viewAsInterface = r13.asInterface();
        if (viewAsInterface != null) {
            int i4 = postMessage + 103;
            newAuthTabSession = i4 % 128;
            if (i4 % 2 == 0) {
                viewAsInterface.getWidth();
                throw null;
            }
            iWidth = viewAsInterface.getWidth();
        } else {
            iWidth = r13.onTransact().width();
        }
        int i5 = iWidth;
        View viewAsInterface2 = r13.asInterface();
        int height = viewAsInterface2 != null ? viewAsInterface2.getHeight() : r13.onTransact().height();
        int iOnExtraCallbackWithResult = ((RectHighlightV3) r13).readTypedObject;
        if (iOnExtraCallbackWithResult == -1) {
            iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult((View) r13, Integer.valueOf(height > varyMatches.IAuthTabCallback((View) r13, 60) ? 20 : 18));
        }
        ((RectHighlightV3) r13).readTypedObject = iOnExtraCallbackWithResult;
        r13.access100();
        r13.onWarmupCompleted(i5, height);
        onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{r13, Integer.valueOf(i5), Integer.valueOf(height)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -353153960, 353153965, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{r13, Integer.valueOf(i5), Integer.valueOf(height)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1240669129, 1240669143, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        View viewAsInterface3 = r13.asInterface();
        if (viewAsInterface3 != null) {
            i = -1;
            i2 = i5;
            f = fValueOf2;
            f2 = fValueOf;
            rectHighlightV3 = r13;
            rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{viewAsInterface3, isMuted.onExtraCallbackWithResult(new AppLovinSdkSettings(), new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i6 = 2 % 2;
                    int i7 = onNavigationEvent + 105;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitOnExtraCallback = RectHighlightV3.onExtraCallback((AppLovinSdkSettings) obj);
                    int i9 = onNavigationEvent + 65;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 != 0) {
                        return unitOnExtraCallback;
                    }
                    throw null;
                }
            }), 0, null, 0, null, null, Boolean.FALSE, 270, 0L, false, 1660, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        } else {
            i = -1;
            i2 = i5;
            f = fValueOf2;
            f2 = fValueOf;
            rectHighlightV3 = r13;
            rally = null;
        }
        if (zBooleanValue) {
            pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
            TdsRoundLayout tdsRoundLayout = rectHighlightV3.mayLaunchUrl;
            AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), f2, f, (Function1) null, 4, (Object) null);
            Boolean bool2 = Boolean.FALSE;
            Float f5 = f;
            Float f6 = f2;
            bool = false;
            f3 = f6;
            num = 0;
            f4 = f5;
            rectHighlightV3.setStartTimeline(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new Rally[]{rally, (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRoundLayout, appLovinSdkSettingsOnNavigationEvent, 0, null, 0, null, null, bool2, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{rectHighlightV3.onPostMessage, isMuted.onExtraCallback(isMuted.IAuthTabCallback_Parcel(new AppLovinSdkSettings(), Float.valueOf(rectHighlightV3.onPostMessage.getX() - 40.0f), Float.valueOf(rectHighlightV3.onPostMessage.getX()), new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda7
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 95;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitIAuthTabCallback_Parcel = RectHighlightV3.IAuthTabCallback_Parcel((attachAppLovinSdk) obj);
                    if (i8 == 0) {
                        int i9 = 72 / 0;
                    }
                    return unitIAuthTabCallback_Parcel;
                }
            }), f6, f5, new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda8
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 55;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    Unit interfaceDescriptor = RectHighlightV3.getInterfaceDescriptor((attachAppLovinSdk) obj);
                    if (i8 != 0) {
                        int i9 = 64 / 0;
                    }
                    int i10 = onExtraCallback + 17;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    return interfaceDescriptor;
                }
            }), 0, null, 0, null, null, null, 270, 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{rectHighlightV3.onWarmupCompleted, isMuted.onTransact(isMuted.onExtraCallback(isMuted.IAuthTabCallback_Parcel(new AppLovinSdkSettings(), Float.valueOf(rectHighlightV3.onExtraCallback - 40.0f), Float.valueOf(rectHighlightV3.onExtraCallback), new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda9
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i6 = 2 % 2;
                    int i7 = onWarmupCompleted + 83;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unit = (Unit) RectHighlightV3.onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{(attachAppLovinSdk) obj}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1875544350, -1875544339, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                    int i9 = IAuthTabCallback + 99;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 != 0) {
                        return unit;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }), f3, f5, new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda10
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 73;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitAccess100 = RectHighlightV3.access100((attachAppLovinSdk) obj);
                    int i9 = IAuthTabCallback + 103;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        return unitAccess100;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }), Float.valueOf(0.5f), f5, new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda11
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallbackWithResult + 87;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitOnNavigationEvent = RectHighlightV3.onNavigationEvent((attachAppLovinSdk) obj);
                    int i9 = onExtraCallbackWithResult + 57;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    return unitOnNavigationEvent;
                }
            }), 0, null, 0, null, null, null, 310, 0L, null, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{rectHighlightV3.access100, isMuted.onExtraCallback(new AppLovinSdkSettings(), f3, f4, new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda12
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallbackWithResult + 83;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unit = (Unit) RectHighlightV3.onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{(attachAppLovinSdk) obj}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1406460970, -1406460970, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                    int i9 = onWarmupCompleted + 123;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    return unit;
                }
            }), null, null, null, null, null, null, 350, 0L, null, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{rectHighlightV3.newSession, isMuted.onExtraCallback(new AppLovinSdkSettings(), f3, f4, new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda13
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 11;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitExtraCallback = RectHighlightV3.extraCallback((attachAppLovinSdk) obj);
                    int i9 = IAuthTabCallback + 75;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        return unitExtraCallback;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }), null, null, null, null, null, bool2, null, 0L, null, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{rectHighlightV3.onNavigationEvent(), isMuted.onExtraCallbackWithResult(new AppLovinSdkSettings(), new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda14
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallbackWithResult + 59;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    Object[] objArr2 = {this.f$0, (AppLovinSdkSettings) obj};
                    Unit unit = (Unit) RectHighlightV3.onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr2, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -501424277, 501424290, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                    int i9 = onExtraCallback + 17;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    return unit;
                }
            }), null, null, null, null, null, Boolean.TRUE, null, 0L, null, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool2, 0, 0L, false, 3833, (Object) null));
        } else {
            bool = false;
            num = 0;
            f3 = f2;
            f4 = f;
            rectHighlightV3.setStartTimeline(null);
        }
        double dFloor = 0.68d;
        int i6 = i2;
        if (i6 <= 200) {
            int i7 = postMessage + 119;
            newAuthTabSession = i7 % 128;
            int i8 = i7 % 2;
            dFloor = 0.68d - (Math.floor((200 - i6) / 20.0d) * 0.01d);
        }
        double d = dFloor;
        pxToDp.IAuthTabCallback iAuthTabCallback2 = pxToDp.IAuthTabCallback.onExtraCallback;
        Integer numAsBinder = rectHighlightV3.asBinder();
        if (numAsBinder != null) {
            int i9 = newAuthTabSession + 123;
            postMessage = i9 % 128;
            int i10 = i9 % 2;
            iIntValue = numAsBinder.intValue();
        } else {
            iIntValue = i;
        }
        getExtraParameters getextraparameters = getExtraParameters.Normal;
        FrameLayout frameLayout = rectHighlightV3.onActivityResized;
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = isMuted.onExtraCallbackWithResult(isMuted.IAuthTabCallback_Parcel(isMuted.onExtraCallback(new AppLovinSdkSettings(), new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda15
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unit;
                int i11 = 2 % 2;
                int i12 = onWarmupCompleted + 91;
                IAuthTabCallback = i12 % 128;
                Object[] objArr2 = {(AppLovinSdkSettings) obj};
                if (i12 % 2 == 0) {
                    unit = (Unit) RectHighlightV3.onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr2, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1718332108, 1718332117, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                    int i13 = 41 / 0;
                } else {
                    unit = (Unit) RectHighlightV3.onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr2, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1718332108, 1718332117, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                }
                int i14 = IAuthTabCallback + 119;
                onWarmupCompleted = i14 % 128;
                int i15 = i14 % 2;
                return unit;
            }
        }), (Float) null, Float.valueOf(i6 * 1.8f), new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i11 = 2 % 2;
                int i12 = onExtraCallback + 109;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                Unit unitExtraCallbackWithResult = RectHighlightV3.extraCallbackWithResult((attachAppLovinSdk) obj);
                if (i13 == 0) {
                    int i14 = 13 / 0;
                }
                return unitExtraCallbackWithResult;
            }
        }, 1, (Object) null), new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unitOnWarmupCompleted;
                int i11 = 2 % 2;
                int i12 = onExtraCallbackWithResult + 57;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 == 0) {
                    unitOnWarmupCompleted = RectHighlightV3.onWarmupCompleted(this.f$0, (AppLovinSdkSettings) obj);
                    int i13 = 4 / 0;
                } else {
                    unitOnWarmupCompleted = RectHighlightV3.onWarmupCompleted(this.f$0, (AppLovinSdkSettings) obj);
                }
                int i14 = onWarmupCompleted + 25;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                return unitOnWarmupCompleted;
            }
        });
        Boolean bool3 = Boolean.TRUE;
        Integer num2 = num;
        Boolean bool4 = bool;
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayout, appLovinSdkSettingsOnExtraCallbackWithResult, num, null, num, null, null, bool3, num2, 0L, bool4, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        final double d2 = 1000.0d * d;
        Rally rally3 = (Rally) RallysKt.onWarmupCompleted(new Object[]{rectHighlightV3.onActivityResized, isMuted.onExtraCallbackWithResult(new AppLovinSdkSettings(), new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i11 = 2 % 2;
                int i12 = onWarmupCompleted + 81;
                onExtraCallback = i12 % 128;
                Object obj2 = null;
                if (i12 % 2 != 0) {
                    RectHighlightV3.onExtraCallback(d2, (AppLovinSdkSettings) obj);
                    throw null;
                }
                Unit unitOnExtraCallback = RectHighlightV3.onExtraCallback(d2, (AppLovinSdkSettings) obj);
                int i13 = onExtraCallback + 101;
                onWarmupCompleted = i13 % 128;
                if (i13 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                obj2.hashCode();
                throw null;
            }
        }), num, null, num, null, null, bool3, num2, 0L, bool4, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsImageView tdsImageView = rectHighlightV3.onActivityLayout;
        if (tdsImageView == null) {
            int i11 = newAuthTabSession + 105;
            postMessage = i11 % 128;
            int i12 = i11 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            tdsImageView = null;
        }
        Address address = Address.onNavigationEvent;
        Rally rally4 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView, isMuted.onNavigationEvent(RallysKt.onExtraCallback(address.asBinder(), 1300), f4, f3, (Function1) null, 4, (Object) null), num, null, num, null, null, null, 100, 0L, bool, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsImageView tdsImageView2 = rectHighlightV3.onExtraCallbackWithResult;
        if (tdsImageView2 == null) {
            int i13 = newAuthTabSession + 29;
            postMessage = i13 % 128;
            if (i13 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i14 = 69 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            }
            tdsImageView2 = null;
        }
        Boolean bool5 = bool;
        rectHighlightV3.getInterfaceDescriptor = RallysKt.onWarmupCompleted((View) null, iAuthTabCallback2, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{rally2, rally3, rally4, (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView2, isMuted.onNavigationEvent(RallysKt.onExtraCallback(address.asBinder(), 1200), f3, f4, (Function1) null, 4, (Object) null), num, null, num, null, null, Boolean.FALSE, 550, 0L, bool5, 1660, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{rectHighlightV3.onPostMessage, isMuted.onExtraCallbackWithResult(new AppLovinSdkSettings(), new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda4
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i15 = 2 % 2;
                int i16 = onNavigationEvent + 107;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                Unit unit = (Unit) RectHighlightV3.onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{(AppLovinSdkSettings) obj}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1698910778, 1698910779, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                int i18 = onExtraCallback + 45;
                onNavigationEvent = i18 % 128;
                if (i18 % 2 != 0) {
                    return unit;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }), num, null, num, null, null, null, num, 0L, bool5, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), iIntValue, getextraparameters, 0, (Interpolator) null, (Integer) null, bool3, 0, 0L, false, 3809, (Object) null);
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallbackDefault = rectHighlightV3.IAuthTabCallbackDefault();
        if (runonuithreaddelayedIAuthTabCallbackDefault != null) {
            th = null;
            runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallbackDefault2 = runOnUiThreadDelayed.IAuthTabCallbackDefault(runonuithreaddelayedIAuthTabCallbackDefault, (Object) null, new Function0() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i15 = 2 % 2;
                    int i16 = onWarmupCompleted + 87;
                    IAuthTabCallback = i16 % 128;
                    int i17 = i16 % 2;
                    Unit unitOnNavigationEvent = RectHighlightV3.onNavigationEvent(this.f$0);
                    int i18 = IAuthTabCallback + 93;
                    onWarmupCompleted = i18 % 128;
                    int i19 = i18 % 2;
                    return unitOnNavigationEvent;
                }
            }, 1, (Object) null);
            if (runonuithreaddelayedIAuthTabCallbackDefault2 != null) {
                z = false;
                isFireOS.onExtraCallbackWithResult(runonuithreaddelayedIAuthTabCallbackDefault2, false, 1, (Object) null);
            } else {
                z = false;
            }
        } else {
            z = false;
            th = null;
        }
        runOnUiThreadDelayed runonuithreaddelayed = rectHighlightV3.getInterfaceDescriptor;
        if (runonuithreaddelayed != null && (runonuithreaddelayedOnWarmupCompleted = runOnUiThreadDelayed.onWarmupCompleted(runonuithreaddelayed, th, new Function0() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i15 = 2 % 2;
                int i16 = IAuthTabCallback + 23;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                Unit unitOnExtraCallback = RectHighlightV3.onExtraCallback(this.f$0);
                if (i17 == 0) {
                    int i18 = 3 / 0;
                }
                return unitOnExtraCallback;
            }
        }, 1, th)) != null) {
            isFireOS.onExtraCallbackWithResult(runonuithreaddelayedOnWarmupCompleted, z, 1, th);
        }
        int i15 = newAuthTabSession + 107;
        postMessage = i15 % 128;
        if (i15 % 2 == 0) {
            return th;
        }
        th.hashCode();
        throw th;
    }

    private static final Unit readTypedObject(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = postMessage + Imgproc.COLOR_YUV2RGB_YVYU;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
        attachapplovinsdk.onExtraCallback(Imgproc.COLOR_BGR2YUV_YVYU);
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 23;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onActivityResized(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 39;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
        attachapplovinsdk.onExtraCallback(400);
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 109;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        isMuted.asBinder(appLovinSdkSettings, (Float) null, Float.valueOf(1.03f), new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda22
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 39;
                IAuthTabCallback = i3 % 128;
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                if (i3 % 2 != 0) {
                    throw null;
                }
                Unit unit = (Unit) RectHighlightV3.onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{attachapplovinsdk}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1347523963, 1347523971, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                int i4 = onNavigationEvent + 21;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        }, 1, (Object) null);
        isMuted.asBinder(appLovinSdkSettings, (Float) null, Float.valueOf(1.0f), new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda23
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 45;
                IAuthTabCallback = i3 % 128;
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                if (i3 % 2 != 0) {
                    RectHighlightV3.onExtraCallback(attachapplovinsdk);
                    throw null;
                }
                Unit unitOnExtraCallback = RectHighlightV3.onExtraCallback(attachapplovinsdk);
                int i4 = IAuthTabCallback + 7;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                throw null;
            }
        }, 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = newAuthTabSession + 73;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
        }
        return unit;
    }

    private static final Unit onPostMessage(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = postMessage + 111;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
        Unit unit = Unit.INSTANCE;
        int i4 = postMessage + 21;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onRelationshipValidationResult(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 71;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 63;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onUnminimized(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = postMessage + 77;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 81;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ICustomTabsService(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = postMessage + 109;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 87;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 123;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 17;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit extraCommand(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 79;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
        Unit unit = Unit.INSTANCE;
        int i4 = postMessage + 23;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ICustomTabsCallback_Parcel(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = postMessage + 41;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
        Unit unit2 = Unit.INSTANCE;
        int i3 = newAuthTabSession + 125;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit isEngagementSignalsApiAvailable(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = postMessage + 115;
        newAuthTabSession = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            i = 26989;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            i = 1200;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = postMessage + 7;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit newSession(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = newAuthTabSession + 73;
        postMessage = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            attachapplovinsdk.onExtraCallback(6972);
            i = 25112;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            attachapplovinsdk.onExtraCallback(800);
            i = 1600;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = postMessage + 53;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(RectHighlightV3 rectHighlightV3, AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Float fValueOf = Float.valueOf(0.0f);
        isMuted.onExtraCallback(appLovinSdkSettings, fValueOf, Float.valueOf(0.8f), new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda34
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 17;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallbackDefault = RectHighlightV3.IAuthTabCallbackDefault((attachAppLovinSdk) obj);
                if (i4 != 0) {
                    int i5 = 86 / 0;
                }
                int i6 = onNavigationEvent + 87;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    return unitIAuthTabCallbackDefault;
                }
                throw null;
            }
        });
        if (rectHighlightV3.IAuthTabCallbackDefault == generateAppWithState.onNavigationEvent.WEAK) {
            isMuted.onNavigationEvent(appLovinSdkSettings, (Float) null, fValueOf, new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda35
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 11;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitAccess000 = RectHighlightV3.access000((attachAppLovinSdk) obj);
                    int i5 = onExtraCallback + 113;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return unitAccess000;
                }
            }, 1, (Object) null);
            int i2 = postMessage + 85;
            newAuthTabSession = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 % 4;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit newAuthTabSession(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 53;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
        attachapplovinsdk.IAuthTabCallback(500);
        attachapplovinsdk.onExtraCallback(Imgproc.COLOR_BGR2YUV_YVYU);
        Unit unit = Unit.INSTANCE;
        int i4 = postMessage + 11;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return unit;
    }

    private static final Unit postMessage(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 33;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
        attachapplovinsdk.IAuthTabCallback(1060);
        attachapplovinsdk.onExtraCallback(400);
        Unit unit = Unit.INSTANCE;
        int i4 = postMessage + Imgproc.COLOR_YUV2RGBA_YVYU;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        isMuted.onTransact(appLovinSdkSettings, fValueOf, fValueOf2, new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda30
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 3;
                onWarmupCompleted = i3 % 128;
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                if (i3 % 2 != 0) {
                    RectHighlightV3.writeTypedObject(attachapplovinsdk);
                    throw null;
                }
                Unit unitWriteTypedObject = RectHighlightV3.writeTypedObject(attachapplovinsdk);
                int i4 = onExtraCallbackWithResult + 87;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitWriteTypedObject;
            }
        });
        isMuted.onTransact(appLovinSdkSettings, fValueOf2, fValueOf, new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda31
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 71;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitAsInterface = RectHighlightV3.asInterface((attachAppLovinSdk) obj);
                int i5 = onNavigationEvent + 109;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitAsInterface;
                }
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = postMessage + 109;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onActivityLayout(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 101;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(3000);
        attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 101;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onMessageChannelReady(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = newAuthTabSession + 107;
        postMessage = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            i = 26143;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            i = 3000;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 49;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onMinimized(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 35;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
        attachapplovinsdk.onExtraCallback(500);
        attachapplovinsdk.IAuthTabCallback(3000);
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 9;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(RectHighlightV3 rectHighlightV3, AppLovinSdkSettings appLovinSdkSettings) {
        float y;
        int i = 2 % 2;
        int i2 = newAuthTabSession + Imgproc.COLOR_YUV2RGB_YVYU;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        int i4 = WhenMappings.onWarmupCompleted[rectHighlightV3.writeTypedObject.ordinal()];
        if (i4 != 1) {
            int i5 = postMessage + 3;
            newAuthTabSession = i5 % 128;
            int i6 = i5 % 2;
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            y = rectHighlightV3.onActivityResized.getY() + varyMatches.IAuthTabCallback(rectHighlightV3, 250);
        } else {
            y = rectHighlightV3.onActivityResized.getY() - varyMatches.IAuthTabCallback(rectHighlightV3, 250);
        }
        isMuted.getInterfaceDescriptor(appLovinSdkSettings, (Float) null, Float.valueOf(y), new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda32
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = 2 % 2;
                int i8 = onExtraCallback + 15;
                onWarmupCompleted = i8 % 128;
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                if (i8 % 2 != 0) {
                    return RectHighlightV3.ICustomTabsCallback(attachapplovinsdk);
                }
                RectHighlightV3.ICustomTabsCallback(attachapplovinsdk);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 1, (Object) null);
        isMuted.getInterfaceDescriptor(appLovinSdkSettings, (Float) null, Float.valueOf(rectHighlightV3.onActivityResized.getY()), new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda33
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = 2 % 2;
                int i8 = IAuthTabCallback + 41;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                Unit unit = (Unit) RectHighlightV3.onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{(attachAppLovinSdk) obj}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 739556334, -739556331, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                int i10 = IAuthTabCallback + 109;
                onExtraCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    return unit;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i7 = postMessage + 119;
        newAuthTabSession = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit ICustomTabsCallbackStub(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 61;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(1000);
        attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 93;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(double d, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 99;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.onExtraCallback((int) d);
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 25;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(final double d, AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        isMuted.onExtraCallback(appLovinSdkSettings, fValueOf, fValueOf2, new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda27
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 35;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallbackStubProxy = RectHighlightV3.IAuthTabCallbackStubProxy((attachAppLovinSdk) obj);
                int i5 = onExtraCallback + 77;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitIAuthTabCallbackStubProxy;
            }
        });
        isMuted.onExtraCallback(appLovinSdkSettings, fValueOf2, fValueOf, new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda28
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 67;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = RectHighlightV3.onExtraCallback(d, (attachAppLovinSdk) obj);
                int i5 = onNavigationEvent + 61;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnExtraCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = postMessage + Imgproc.COLOR_YUV2RGB_YVYU;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit ICustomTabsCallbackStubProxy(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = postMessage + 87;
        newAuthTabSession = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            i = 8900;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            i = 1600;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = postMessage + 3;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 47;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
        attachapplovinsdk.onExtraCallback(900);
        attachapplovinsdk.IAuthTabCallback(1450);
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + Imgproc.COLOR_YUV2RGBA_YVYU;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Float fValueOf = Float.valueOf(1.0f);
        isMuted.onTransact(appLovinSdkSettings, fValueOf, Float.valueOf(1.05f), new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda24
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 63;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnTransact = RectHighlightV3.onTransact((attachAppLovinSdk) obj);
                int i5 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnTransact;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        isMuted.asBinder(appLovinSdkSettings, (Float) null, fValueOf, new Function1() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda25
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 107;
                onExtraCallbackWithResult = i3 % 128;
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                if (i3 % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unit = (Unit) RectHighlightV3.onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{attachapplovinsdk}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1314284358, -1314284351, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                int i4 = onWarmupCompleted + 119;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        }, 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = newAuthTabSession + 69;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit asBinder(RectHighlightV3 rectHighlightV3) {
        int i;
        int i2 = 2 % 2;
        int i3 = postMessage + 27;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        rectHighlightV3.mayLaunchUrl.setVisibility(0);
        rectHighlightV3.onPostMessage.setVisibility(0);
        TdsImageView tdsImageView = rectHighlightV3.onWarmupCompleted;
        if (rectHighlightV3.IAuthTabCallback) {
            int i5 = postMessage + 7;
            newAuthTabSession = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        } else {
            i = 8;
        }
        tdsImageView.setVisibility(i);
        rectHighlightV3.access100.setVisibility(0);
        rectHighlightV3.onActivityResized.setVisibility(0);
        rectHighlightV3.newSession.setVisibility(0);
        rectHighlightV3.onNavigationEvent().setVisibility(0);
        Unit unit = Unit.INSTANCE;
        int i7 = postMessage + 67;
        newAuthTabSession = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit access000(RectHighlightV3 rectHighlightV3) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 123;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        rectHighlightV3.IAuthTabCallback(getAppDataMetadata.REPEAT_FINISHED);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(RectHighlightV3 rectHighlightV3, getAppDataMetadata getappdatametadata) {
        int i;
        int i2 = 2 % 2;
        int i3 = newAuthTabSession + 115;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        rectHighlightV3.mayLaunchUrl.setVisibility(4);
        rectHighlightV3.onPostMessage.setVisibility(4);
        TdsImageView tdsImageView = rectHighlightV3.onWarmupCompleted;
        if (!rectHighlightV3.IAuthTabCallback) {
            int i5 = newAuthTabSession + 31;
            postMessage = i5 % 128;
            int i6 = i5 % 2;
            i = 8;
        } else {
            int i7 = postMessage + 17;
            newAuthTabSession = i7 % 128;
            int i8 = i7 % 2;
            i = 4;
        }
        tdsImageView.setVisibility(i);
        rectHighlightV3.access100.setVisibility(4);
        rectHighlightV3.onActivityResized.setVisibility(4);
        rectHighlightV3.newSession.setVisibility(4);
        rectHighlightV3.onNavigationEvent().setVisibility(4);
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallbackDefault = rectHighlightV3.IAuthTabCallbackDefault();
        if (runonuithreaddelayedIAuthTabCallbackDefault != null) {
            runonuithreaddelayedIAuthTabCallbackDefault.onNavigationEvent();
        }
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = rectHighlightV3.onWarmupCompleted();
        if (runonuithreaddelayedOnWarmupCompleted != null) {
            runonuithreaddelayedOnWarmupCompleted.onNavigationEvent();
        }
        runOnUiThreadDelayed runonuithreaddelayed = rectHighlightV3.getInterfaceDescriptor;
        if (runonuithreaddelayed != null) {
            int i9 = postMessage + 75;
            newAuthTabSession = i9 % 128;
            int i10 = i9 % 2;
            runonuithreaddelayed.onNavigationEvent();
        }
        rectHighlightV3.setStartTimeline(null);
        rectHighlightV3.getInterfaceDescriptor = null;
        rectHighlightV3.setEndTimeline(null);
        ViewGroup viewGroupOnExtraCallback = rectHighlightV3.onExtraCallback();
        if (viewGroupOnExtraCallback != null) {
            viewGroupOnExtraCallback.removeView(rectHighlightV3.IAuthTabCallbackStub());
        }
        generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult = rectHighlightV3.onUnminimized;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onDismiss(getappdatametadata);
        }
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallback(final getAppDataMetadata getappdatametadata) {
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted;
        int i = 2 % 2;
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        deprecated_dns deprecated_dnsVarAsBinder = deprecated_certificatePinner.onExtraCallbackWithResult.asBinder();
        BaseTextView baseTextView = this.onPostMessage;
        AppLovinSdkSettings appLovinSdkSettings = new AppLovinSdkSettings();
        Float fValueOf = Float.valueOf(0.0f);
        setEndTimeline(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{(Rally) RallysKt.onWarmupCompleted(new Object[]{baseTextView, isMuted.asBinder(isMuted.onNavigationEvent(appLovinSdkSettings, (Float) null, fValueOf, (Function1) null, 5, (Object) null), (Float) null, Float.valueOf(0.9f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.onWarmupCompleted, isMuted.asBinder(isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, fValueOf, (Function1) null, 5, (Object) null), (Float) null, Float.valueOf(0.5f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.onActivityResized, isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.access100, isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.newSession, isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{onNavigationEvent(), isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.mayLaunchUrl, isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, deprecated_dnsVarAsBinder, (Integer) null, Boolean.FALSE, 0, 0L, false, 3769, (Object) null));
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted2 = onWarmupCompleted();
        if (runonuithreaddelayedOnWarmupCompleted2 != null && (runonuithreaddelayedOnWarmupCompleted = runOnUiThreadDelayed.onWarmupCompleted(runonuithreaddelayedOnWarmupCompleted2, (Object) null, new Function0() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$$ExternalSyntheticLambda26
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 19;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = RectHighlightV3.onNavigationEvent(this.f$0, getappdatametadata);
                int i5 = onExtraCallback + 49;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }
        }, 1, (Object) null)) != null) {
            int i2 = postMessage + 109;
            newAuthTabSession = i2 % 128;
        }
        int i3 = newAuthTabSession + 5;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void access100() {
        int i;
        int i2 = 2 % 2;
        int i3 = postMessage + 21;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        TdsRoundLayout tdsRoundLayout = this.mayLaunchUrl;
        float fAccess000 = access000();
        if (asInterface() instanceof TdsListRowV1View) {
            int i5 = newAuthTabSession + 91;
            postMessage = i5 % 128;
            int i6 = i5 % 2;
            i = this.IAuthTabCallback_Parcel;
        } else {
            int i7 = postMessage + 9;
            newAuthTabSession = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 / 3;
            }
            i = 0;
        }
        tdsRoundLayout.setX(fAccess000 + i);
        this.mayLaunchUrl.setY(getInterfaceDescriptor());
        TdsRoundLayout tdsRoundLayout2 = this.mayLaunchUrl;
        getDurationMs.onExtraCallback onextracallback = getDurationMs.onExtraCallback.onExtraCallbackWithResult;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iOnExtraCallback = onextracallback.onExtraCallback(readIntokhttp.onExtraCallback(configuration));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Resources resources2 = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        Configuration configuration2 = resources2.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        tdsRoundLayout2.setShadow(new Cacheurls1.onExtraCallback(30, 0, iOnExtraCallback, onextracallback.onExtraCallback(readIntokhttp.onExtraCallback(configuration2))), (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub()), 300}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()));
        TdsRoundLayout tdsRoundLayout3 = this.mayLaunchUrl;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Resources resources3 = context3.getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "");
        Configuration configuration3 = resources3.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        boolean zOnExtraCallback = readIntokhttp.onExtraCallback(configuration3);
        generateAppWithState.onWarmupCompleted onwarmupcompleted = this.writeTypedObject;
        int i9 = this.readTypedObject;
        DisplayMetrics displayMetrics = this.asInterface;
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        tdsRoundLayout3.setBackground(onextracallback.onExtraCallback(zOnExtraCallback, onwarmupcompleted, i9 + varyMatches.onNavigationEvent(2, displayMetrics)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(int i, int i2) {
        float fOnExtraCallbackWithResult;
        boolean z;
        boolean z2;
        int i3 = 2 % 2;
        this.onExtraCallback = -1.0f;
        isBackgroundWorkRestricted.onExtraCallbackWithResult(this.onPostMessage);
        this.onMinimized = this.onPostMessage.getHeight();
        this.onMessageChannelReady = this.onPostMessage.getWidth();
        int width = this.onPostMessage.getWidth();
        int i4 = WhenMappings.onExtraCallbackWithResult[onExtraCallbackWithResult().ordinal()];
        if (i4 == 1) {
            this.onPostMessage.setTextAlignment(2);
            this.onPostMessage.setGravity(8388611);
            StaticLayout staticLayoutIAuthTabCallback = AppDataCollectorCompanion.IAuthTabCallback(this.onPostMessage, Layout.Alignment.ALIGN_NORMAL, TextUtils.TruncateAt.START, null, 8, null);
            if (staticLayoutIAuthTabCallback != null) {
                int i5 = postMessage + 125;
                newAuthTabSession = i5 % 128;
                int i6 = i5 % 2;
                int lineCount = staticLayoutIAuthTabCallback.getLineCount();
                float fCoerceAtLeast = 0.0f;
                for (int i7 = 0; i7 < lineCount; i7++) {
                    fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(fCoerceAtLeast, staticLayoutIAuthTabCallback.getLineWidth(i7));
                }
                this.onMessageChannelReady = (int) fCoerceAtLeast;
                this.onMinimized = staticLayoutIAuthTabCallback.getHeight();
            }
        } else if (i4 == 2) {
            this.onPostMessage.setTextAlignment(4);
            this.onPostMessage.setGravity(17);
            boolean z3 = i < this.asInterface.widthPixels - setTagsokhttp.onExtraCallbackWithResult(this, 28);
            StaticLayout staticLayoutOnExtraCallback = z3 ^ true ? null : AppDataCollectorCompanion.onExtraCallback(this.onPostMessage, Layout.Alignment.ALIGN_CENTER, TextUtils.TruncateAt.MIDDLE, Integer.valueOf(i));
            if (!z3 || staticLayoutOnExtraCallback == null || staticLayoutOnExtraCallback.getLineCount() < 4) {
                z = false;
                if (!z3) {
                    int i8 = postMessage + 85;
                    int i9 = i8 % 128;
                    newAuthTabSession = i9;
                    if (i8 % 2 == 0) {
                        int i10 = 12 / 0;
                        if (z) {
                            z2 = false;
                        } else {
                            int i11 = i9 + 35;
                            postMessage = i11 % 128;
                            int i12 = i11 % 2;
                            int i13 = i9 + 83;
                            postMessage = i13 % 128;
                            int i14 = i13 % 2;
                            z2 = true;
                        }
                    } else if (!z) {
                    }
                    if (z2) {
                        this.onPostMessage.setX(access000());
                        BaseTextView baseTextView = this.onPostMessage;
                        ViewGroup.LayoutParams layoutParams = baseTextView.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams.width = i;
                        baseTextView.setLayoutParams(layoutParams);
                    } else {
                        BaseTextView baseTextView2 = this.onPostMessage;
                        ViewGroup.LayoutParams layoutParams2 = baseTextView2.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams2.width = -1;
                        baseTextView2.setLayoutParams(layoutParams2);
                        this.onExtraCallback = (this.asInterface.widthPixels / 2.0f) - (this.onWarmupCompleted.getWidth() / 2);
                    }
                    if (!z2) {
                        staticLayoutOnExtraCallback = AppDataCollectorCompanion.onExtraCallback(this.onPostMessage, Layout.Alignment.ALIGN_CENTER, TextUtils.TruncateAt.MIDDLE, null);
                    }
                    if (staticLayoutOnExtraCallback != null) {
                        int lineCount2 = staticLayoutOnExtraCallback.getLineCount();
                        int i15 = 0;
                        float fCoerceAtLeast2 = 0.0f;
                        while (i15 < lineCount2) {
                            int i16 = postMessage + 65;
                            newAuthTabSession = i16 % 128;
                            if (i16 % 2 == 0) {
                                fCoerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(fCoerceAtLeast2, staticLayoutOnExtraCallback.getLineWidth(i15));
                                i15 += 69;
                            } else {
                                fCoerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(fCoerceAtLeast2, staticLayoutOnExtraCallback.getLineWidth(i15));
                                i15++;
                            }
                        }
                        width = z2 ? i : staticLayoutOnExtraCallback.getWidth();
                        this.onMessageChannelReady = (int) fCoerceAtLeast2;
                        this.onMinimized = staticLayoutOnExtraCallback.getHeight();
                    }
                }
            } else {
                int i17 = newAuthTabSession + 13;
                postMessage = i17 % 128;
                if (i17 % 2 == 0) {
                    z = true;
                }
                if (!z3) {
                }
            }
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i18 = newAuthTabSession + 69;
            postMessage = i18 % 128;
            int i19 = i18 % 2;
            this.onPostMessage.setTextAlignment(3);
            this.onPostMessage.setGravity(8388613);
            StaticLayout staticLayoutIAuthTabCallback2 = AppDataCollectorCompanion.IAuthTabCallback(this.onPostMessage, Layout.Alignment.ALIGN_OPPOSITE, TextUtils.TruncateAt.END, null, 8, null);
            if (staticLayoutIAuthTabCallback2 != null) {
                int i20 = postMessage + 107;
                newAuthTabSession = i20 % 128;
                int i21 = i20 % 2;
                int lineCount3 = staticLayoutIAuthTabCallback2.getLineCount();
                float fCoerceAtLeast3 = 0.0f;
                for (int i22 = 0; i22 < lineCount3; i22++) {
                    fCoerceAtLeast3 = RangesKt___RangesKt.coerceAtLeast(fCoerceAtLeast3, staticLayoutIAuthTabCallback2.getLineWidth(i22));
                }
                this.onMessageChannelReady = (int) fCoerceAtLeast3;
                this.onMinimized = staticLayoutIAuthTabCallback2.getHeight();
            }
        }
        int i23 = width;
        if (this.onExtraCallback == -1.0f) {
            int i24 = newAuthTabSession + 3;
            postMessage = i24 % 128;
            int i25 = i24 % 2;
            this.onExtraCallback = (access000() + (i / 2)) - (this.onWarmupCompleted.getWidth() / 2);
        }
        this.onWarmupCompleted.setX(this.onExtraCallback);
        int i26 = WhenMappings.onWarmupCompleted[this.writeTypedObject.ordinal()];
        if (i26 == 1) {
            this.onPostMessage.setY(getInterfaceDescriptor() - (this.onMinimized + setTagsokhttp.onExtraCallbackWithResult(this, 16)));
            this.onWarmupCompleted.setY(this.onPostMessage.getY() - (this.onWarmupCompleted.getHeight() + setTagsokhttp.onExtraCallbackWithResult(this, 8)));
        } else {
            if (i26 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.onPostMessage.setY(getInterfaceDescriptor() + i2 + setTagsokhttp.onExtraCallbackWithResult(this, 10));
            this.onWarmupCompleted.setY(this.onPostMessage.getY() + this.onMinimized + setTagsokhttp.onExtraCallbackWithResult(this, 14));
        }
        BaseTextView baseTextView3 = this.onPostMessage;
        int i27 = WhenMappings.onExtraCallbackWithResult[onExtraCallbackWithResult().ordinal()];
        if (i27 == 1) {
            fOnExtraCallbackWithResult = (this.onMessageChannelReady / 2.0f) + setTagsokhttp.onExtraCallbackWithResult(this, 14);
        } else if (i27 == 2) {
            fOnExtraCallbackWithResult = this.onPostMessage.getMaxWidth() / 2.0f;
        } else {
            if (i27 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i28 = postMessage + 113;
            newAuthTabSession = i28 % 128;
            int i29 = i28 % 2;
            fOnExtraCallbackWithResult = (this.onPostMessage.getMaxWidth() - (this.onMessageChannelReady / 2.0f)) - setTagsokhttp.onExtraCallbackWithResult(this, 14);
        }
        baseTextView3.setPivotX(fOnExtraCallbackWithResult);
        this.onPostMessage.setPivotY(this.onMinimized / 2.0f);
        AppDataCollectorCompanion.onExtraCallback(this.newSession, TdsHighlightV3View.onExtraCallbackWithResult.EnumC0010onExtraCallbackWithResult.RECT, this.onPostMessage, i23, this.onMessageChannelReady, this.onMinimized, onExtraCallbackWithResult(), this.writeTypedObject, this.IAuthTabCallback, this.onWarmupCompleted, this.IAuthTabCallbackDefault);
        Drawable drawable = new Drawable() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$updateMessageLayer$closeIconDrawable$1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            private final Paint onNavigationEvent = new Paint(1);
            private final Paint onWarmupCompleted = new Paint(1);

            @Override // android.graphics.drawable.Drawable
            public int getOpacity() {
                int i30 = 2 % 2;
                int i31 = onExtraCallbackWithResult;
                int i32 = i31 + 99;
                onExtraCallback = i32 % 128;
                int i33 = i32 % 2;
                int i34 = i31 + 25;
                onExtraCallback = i34 % 128;
                int i35 = i34 % 2;
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public void draw(Canvas canvas) {
                int iIPostMessageServiceStubProxy;
                int i30 = 2 % 2;
                Float fValueOf = Float.valueOf(10.0f);
                Intrinsics.checkNotNullParameter(canvas, "");
                RectF rectF = new RectF(getBounds());
                float f = rectF.left;
                float f2 = rectF.top;
                float f3 = rectF.right;
                float f4 = rectF.bottom;
                Context context = this.IAuthTabCallback.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                final Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                if (new getUrlokhttp(new getAdService() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$updateMessageLayer$closeIconDrawable$1$draw$$inlined$getPalette$1
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final getSpecialFeatureOptInStatus onExtraCallback() {
                        int i31 = 2 % 2;
                        int i32 = IAuthTabCallback + 9;
                        onExtraCallbackWithResult = i32 % 128;
                        int i33 = i32 % 2;
                        if (!readIntokhttp.onExtraCallback(configuration)) {
                            return getSpecialFeatureOptInStatus.Light;
                        }
                        int i34 = onExtraCallbackWithResult + 45;
                        IAuthTabCallback = i34 % 128;
                        int i35 = i34 % 2;
                        getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                        if (i35 == 0) {
                            return getspecialfeatureoptinstatus;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }).ITrustedWebActivityCallbackDefault() == getSpecialFeatureOptInStatus.Dark) {
                    Context context2 = this.IAuthTabCallback.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    final Configuration configuration2 = context2.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration2, "");
                    iIPostMessageServiceStubProxy = ((Integer) setHeadersokhttp.onExtraCallbackWithResult(673041327, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new getAdService() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$updateMessageLayer$closeIconDrawable$1$draw$$inlined$getPalette$2
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final getSpecialFeatureOptInStatus onExtraCallback() {
                            int i31 = 2 % 2;
                            int i32 = onExtraCallback + 27;
                            onExtraCallbackWithResult = i32 % 128;
                            if (i32 % 2 != 0) {
                                if (readIntokhttp.onExtraCallback(configuration2)) {
                                    return getSpecialFeatureOptInStatus.Dark;
                                }
                                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                                int i33 = onExtraCallback + 21;
                                onExtraCallbackWithResult = i33 % 128;
                                int i34 = i33 % 2;
                                return getspecialfeatureoptinstatus;
                            }
                            readIntokhttp.onExtraCallback(configuration2);
                            throw null;
                        }
                    }).getInterfaceDescriptor()}, matches.onExtraCallback(), -673041326, matches.onExtraCallback())).intValue();
                } else {
                    Context context3 = this.IAuthTabCallback.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    final Configuration configuration3 = context3.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration3, "");
                    iIPostMessageServiceStubProxy = new getUrlokhttp(new getAdService() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$updateMessageLayer$closeIconDrawable$1$draw$$inlined$getPalette$3
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
                        
                            return r1;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
                        
                            return o.getSpecialFeatureOptInStatus.Dark;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
                        
                            if ((!o.readIntokhttp.onExtraCallback(r1)) != true) goto L11;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
                        
                            if (o.readIntokhttp.onExtraCallback(r1) != true) goto L9;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
                        
                            r1 = o.getSpecialFeatureOptInStatus.Light;
                            r2 = im.toss.uikit.widget.tooltip.RectHighlightV3$updateMessageLayer$closeIconDrawable$1$draw$$inlined$getPalette$3.onExtraCallback + 97;
                            im.toss.uikit.widget.tooltip.RectHighlightV3$updateMessageLayer$closeIconDrawable$1$draw$$inlined$getPalette$3.onWarmupCompleted = r2 % 128;
                            r2 = r2 % 2;
                         */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final getSpecialFeatureOptInStatus onExtraCallback() {
                            int i31 = 2 % 2;
                            int i32 = onExtraCallback + 71;
                            onWarmupCompleted = i32 % 128;
                            if (i32 % 2 != 0) {
                                int i33 = 19 / 0;
                            }
                        }
                    }).requestPostMessageChannel().IPostMessageServiceStubProxy();
                    int i31 = onExtraCallbackWithResult + 87;
                    onExtraCallback = i31 % 128;
                    int i32 = i31 % 2;
                }
                int iOnNavigationEvent = setBodyokhttp.onNavigationEvent(iIPostMessageServiceStubProxy, 0.1f);
                Context context4 = this.IAuthTabCallback.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                final Configuration configuration4 = context4.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration4, "");
                this.onNavigationEvent.setShader(new LinearGradient(f, f2, f3, f4, new int[]{iOnNavigationEvent, setBodyokhttp.onNavigationEvent(new getUrlokhttp(new getAdService() { // from class: im.toss.uikit.widget.tooltip.RectHighlightV3$updateMessageLayer$closeIconDrawable$1$draw$$inlined$getPalette$4
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final getSpecialFeatureOptInStatus onExtraCallback() {
                        getSpecialFeatureOptInStatus getspecialfeatureoptinstatus;
                        int i33 = 2 % 2;
                        if (!readIntokhttp.onExtraCallback(configuration4)) {
                            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
                            int i34 = onWarmupCompleted + 1;
                            IAuthTabCallback = i34 % 128;
                            int i35 = i34 % 2;
                            return getspecialfeatureoptinstatus2;
                        }
                        int i36 = onWarmupCompleted + 75;
                        IAuthTabCallback = i36 % 128;
                        if (i36 % 2 == 0) {
                            getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                            int i37 = 12 / 0;
                        } else {
                            getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                        }
                        int i38 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
                        IAuthTabCallback = i38 % 128;
                        int i39 = i38 % 2;
                        return getspecialfeatureoptinstatus;
                    }
                }).requestPostMessageChannel().IAuthTabCallbackStub(), 0.1f)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                this.onWarmupCompleted.setStyle(Paint.Style.STROKE);
                Paint paint = this.onWarmupCompleted;
                getDurationMs.onExtraCallback onextracallback = getDurationMs.onExtraCallback.onExtraCallbackWithResult;
                Context context5 = this.IAuthTabCallback.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                paint.setColor(onextracallback.onNavigationEvent(context5));
                this.onWarmupCompleted.setStrokeWidth(varyMatches.IAuthTabCallback(this.IAuthTabCallback, 1));
                canvas.drawRoundRect(rectF, varyMatches.IAuthTabCallback(this.IAuthTabCallback, fValueOf), varyMatches.IAuthTabCallback(this.IAuthTabCallback, fValueOf), this.onNavigationEvent);
                canvas.drawRoundRect(rectF, varyMatches.IAuthTabCallback(this.IAuthTabCallback, fValueOf), varyMatches.IAuthTabCallback(this.IAuthTabCallback, fValueOf), this.onWarmupCompleted);
                int i33 = onExtraCallbackWithResult + 111;
                onExtraCallback = i33 % 128;
                int i34 = i33 % 2;
            }

            @Override // android.graphics.drawable.Drawable
            public void setAlpha(int i30) {
                int i31 = 2 % 2;
                int i32 = onExtraCallbackWithResult + 101;
                onExtraCallback = i32 % 128;
                if (i32 % 2 == 0) {
                    this.onNavigationEvent.setAlpha(i30);
                    this.onWarmupCompleted.setAlpha(i30);
                    int i33 = 0 / 0;
                } else {
                    this.onNavigationEvent.setAlpha(i30);
                    this.onWarmupCompleted.setAlpha(i30);
                }
                int i34 = onExtraCallbackWithResult + 71;
                onExtraCallback = i34 % 128;
                int i35 = i34 % 2;
            }

            @Override // android.graphics.drawable.Drawable
            public void setColorFilter(ColorFilter colorFilter) {
                int i30 = 2 % 2;
                int i31 = onExtraCallback + 29;
                onExtraCallbackWithResult = i31 % 128;
                if (i31 % 2 != 0) {
                    this.onNavigationEvent.setColorFilter(colorFilter);
                    this.onWarmupCompleted.setColorFilter(colorFilter);
                    int i32 = 42 / 0;
                } else {
                    this.onNavigationEvent.setColorFilter(colorFilter);
                    this.onWarmupCompleted.setColorFilter(colorFilter);
                }
            }
        };
        this.onWarmupCompleted.setLayerType(1, null);
        this.onWarmupCompleted.setBackground(drawable);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, im.toss.uikit.widget.tooltip.RectHighlightV3, java.lang.Object] */
    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        ?? r0 = (RectHighlightV3) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = postMessage + 93;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            if (!(!((RectHighlightV3) r0).IAuthTabCallback)) {
                float y = ((RectHighlightV3) r0).onWarmupCompleted.getY();
                float fOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult((View) r0, 30);
                int i3 = ((RectHighlightV3) r0).asInterface.heightPixels;
                M_ m_ = M_.onExtraCallback;
                if (y + fOnExtraCallbackWithResult >= i3 - m_.onExtraCallbackWithResult()) {
                    ((RectHighlightV3) r0).writeTypedObject = generateAppWithState.onWarmupCompleted.TOP;
                    r0.onWarmupCompleted(iIntValue, iIntValue2);
                    onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{r0, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -353153960, 353153965, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                }
                if (((RectHighlightV3) r0).onWarmupCompleted.getY() <= m_.access000()) {
                    ((RectHighlightV3) r0).writeTypedObject = generateAppWithState.onWarmupCompleted.BOTTOM;
                    r0.onWarmupCompleted(iIntValue, iIntValue2);
                    onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{r0, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -353153960, 353153965, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                    return null;
                }
            } else {
                float y2 = ((RectHighlightV3) r0).onPostMessage.getY();
                float f = ((RectHighlightV3) r0).onMinimized;
                int i4 = ((RectHighlightV3) r0).asInterface.heightPixels;
                M_ m_2 = M_.onExtraCallback;
                if (y2 + f >= i4 - m_2.onExtraCallbackWithResult()) {
                    ((RectHighlightV3) r0).writeTypedObject = generateAppWithState.onWarmupCompleted.TOP;
                    r0.onWarmupCompleted(iIntValue, iIntValue2);
                    onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{r0, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -353153960, 353153965, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                }
                if (((RectHighlightV3) r0).onPostMessage.getY() <= m_2.access000()) {
                    int i5 = newAuthTabSession + 65;
                    postMessage = i5 % 128;
                    int i6 = i5 % 2;
                    ((RectHighlightV3) r0).writeTypedObject = generateAppWithState.onWarmupCompleted.BOTTOM;
                    r0.onWarmupCompleted(iIntValue, iIntValue2);
                    onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{r0, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -353153960, 353153965, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                }
            }
            return null;
        }
        boolean z = ((RectHighlightV3) r0).IAuthTabCallback;
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, im.toss.uikit.widget.tooltip.RectHighlightV3] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int iOnExtraCallbackWithResult;
        int height;
        ?? r0 = (RectHighlightV3) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        TdsImageView tdsImageView = ((RectHighlightV3) r0).access100;
        float interfaceDescriptor = r0.getInterfaceDescriptor();
        generateAppWithState.onWarmupCompleted onwarmupcompleted = ((RectHighlightV3) r0).writeTypedObject;
        int[] iArr = WhenMappings.onWarmupCompleted;
        int i2 = iArr[onwarmupcompleted.ordinal()];
        if (i2 == 1) {
            iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult((View) r0, -50);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = postMessage + Imgproc.COLOR_YUV2RGB_YVYU;
            newAuthTabSession = i3 % 128;
            int i4 = i3 % 2;
            iOnExtraCallbackWithResult = iIntValue2 - setTagsokhttp.onExtraCallbackWithResult((View) r0, 50);
        }
        tdsImageView.setY(interfaceDescriptor + iOnExtraCallbackWithResult);
        ((RectHighlightV3) r0).access100.setX(r0.access000());
        float fAccess000 = r0.access000();
        float width = ((RectHighlightV3) r0).onActivityResized.getWidth();
        Intrinsics.checkNotNullExpressionValue(((RectHighlightV3) r0).asInterface, "");
        float fOnNavigationEvent = (fAccess000 - ((iIntValue * 0.5f) + (width * 0.5f))) + varyMatches.onNavigationEvent(70, r7);
        ((RectHighlightV3) r0).onRelationshipValidationResult = fOnNavigationEvent;
        ((RectHighlightV3) r0).onActivityResized.setX(fOnNavigationEvent);
        FrameLayout frameLayout = ((RectHighlightV3) r0).onActivityResized;
        float interfaceDescriptor2 = r0.getInterfaceDescriptor();
        int i5 = iArr[((RectHighlightV3) r0).writeTypedObject.ordinal()];
        if (i5 == 1) {
            height = -((((RectHighlightV3) r0).onActivityResized.getHeight() / 2) - setTagsokhttp.onExtraCallbackWithResult((View) r0, 56));
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = postMessage + 69;
            newAuthTabSession = i6 % 128;
            height = i6 % 2 == 0 ? iIntValue2 + ((RectHighlightV3) r0).onActivityResized.getHeight() + 4 + setTagsokhttp.onExtraCallbackWithResult((View) r0, 56) : (iIntValue2 - (((RectHighlightV3) r0).onActivityResized.getHeight() / 2)) - setTagsokhttp.onExtraCallbackWithResult((View) r0, 56);
        }
        frameLayout.setY(interfaceDescriptor2 + height);
        int i7 = postMessage + 71;
        newAuthTabSession = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean extraCallback() {
        boolean z;
        View viewAsInterface;
        int i = 2 % 2;
        int i2 = postMessage + 63;
        newAuthTabSession = i2 % 128;
        boolean z2 = false;
        if (i2 % 2 == 0) {
            if (asInterface() != null) {
                z = false;
                viewAsInterface = asInterface();
                if (viewAsInterface != null) {
                    return true;
                }
                int[] iArr = new int[2];
                viewAsInterface.getLocationOnScreen(iArr);
                float f = iArr[0];
                float f2 = iArr[1];
                if (access000() == f && getInterfaceDescriptor() == f2) {
                    z2 = z;
                }
                setTargetViewX(f);
                setTargetViewY(f2);
                int i3 = newAuthTabSession + 31;
                postMessage = i3 % 128;
                int i4 = i3 % 2;
                return z2;
            }
            setTargetViewX(onTransact().left);
            setTargetViewY(onTransact().top);
            int i5 = newAuthTabSession + 67;
            postMessage = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (asInterface() != null) {
            z = true;
            viewAsInterface = asInterface();
            if (viewAsInterface != null) {
            }
        }
        setTargetViewX(onTransact().left);
        setTargetViewY(onTransact().top);
        int i52 = newAuthTabSession + 67;
        postMessage = i52 % 128;
        int i62 = i52 % 2;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086 A[PHI: r5
      0x0086: PHI (r5v16 int) = (r5v15 int), (r5v18 int) binds: [B:26:0x0084, B:23:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(@NotNull Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2 = 2 % 2;
        int i3 = postMessage + 65;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        View viewAsInterface = asInterface();
        int width = viewAsInterface != null ? viewAsInterface.getWidth() : onTransact().width();
        View viewAsInterface2 = asInterface();
        int height = viewAsInterface2 != null ? viewAsInterface2.getHeight() : onTransact().height();
        float fAccess000 = asInterface() != null ? access000() : onTransact().left;
        float interfaceDescriptor = asInterface() != null ? getInterfaceDescriptor() : onTransact().top;
        if (asInterface() instanceof TdsListRowV1View) {
            int i5 = newAuthTabSession + 55;
            postMessage = i5 % 128;
            if (i5 % 2 != 0) {
                i = this.IAuthTabCallback_Parcel;
                int i6 = 16 / 0;
                f = fAccess000 < ((float) i) ? i : fAccess000;
            } else {
                i = this.IAuthTabCallback_Parcel;
                if (fAccess000 < i) {
                }
            }
        }
        if (asInterface() instanceof TdsListRowV1View) {
            f2 = fAccess000 + width;
            float f3 = this.asInterface.widthPixels - this.IAuthTabCallback_Parcel;
            if (f2 >= f3) {
                int i7 = postMessage + 125;
                newAuthTabSession = i7 % 128;
                f2 = i7 % 2 == 0 ? r2 >> r5 : f3;
            }
        } else {
            f2 = fAccess000 + width;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.extraCallbackWithResult);
        super.dispatchDraw(canvas);
        Path path = new Path();
        float f4 = this.readTypedObject;
        path.addRoundRect(f, interfaceDescriptor, f2, interfaceDescriptor + height, f4, f4, Path.Direction.CW);
        canvas.drawPath(path, this.onNavigationEvent);
        canvas.restoreToCount(iSaveLayer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[PHI: r6
      0x0051: PHI (r6v4 android.view.View) = (r6v3 android.view.View), (r6v18 android.view.View) binds: [B:19:0x004f, B:16:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1
      0x001f: PHI (r1v5 android.view.View) = (r1v4 android.view.View), (r1v14 android.view.View) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void writeTypedObject() {
        View viewAsInterface;
        int width;
        View viewAsInterface2;
        int width2;
        int i = 2 % 2;
        int i2 = newAuthTabSession + 13;
        postMessage = i2 % 128;
        int i3 = 0;
        if (i2 % 2 != 0) {
            viewAsInterface = asInterface();
            int i4 = 89 / 0;
            width = viewAsInterface != null ? viewAsInterface.getWidth() : onTransact().width();
        } else {
            viewAsInterface = asInterface();
            if (viewAsInterface != null) {
            }
        }
        TdsRoundLayout tdsRoundLayout = this.mayLaunchUrl;
        ViewGroup.LayoutParams layoutParams = tdsRoundLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i5 = postMessage + 7;
        newAuthTabSession = i5 % 128;
        if (i5 % 2 == 0) {
            viewAsInterface2 = asInterface();
            int i6 = 95 / 0;
            if (viewAsInterface2 != null) {
                int i7 = postMessage + 45;
                newAuthTabSession = i7 % 128;
                if (i7 % 2 == 0) {
                    viewAsInterface2.getWidth();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                width2 = viewAsInterface2.getWidth();
            } else {
                width2 = onTransact().width();
            }
        } else {
            viewAsInterface2 = asInterface();
            if (viewAsInterface2 != null) {
            }
        }
        layoutParams.width = width2 - (!((asInterface() instanceof TdsListRowV1View) ^ true) ? this.IAuthTabCallback_Parcel << 1 : 0);
        View viewAsInterface3 = asInterface();
        layoutParams.height = viewAsInterface3 != null ? viewAsInterface3.getHeight() : onTransact().height();
        tdsRoundLayout.setLayoutParams(layoutParams);
        TdsImageView tdsImageView = this.access100;
        ViewGroup.LayoutParams layoutParams2 = tdsImageView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width = width;
        layoutParams2.height = setTagsokhttp.onExtraCallbackWithResult(this, 100);
        tdsImageView.setLayoutParams(layoutParams2);
        FrameLayout frameLayout = this.onActivityResized;
        ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        float f = width;
        layoutParams3.width = (int) (1.5f * f);
        layoutParams3.height = (int) (f * 0.6f);
        frameLayout.setLayoutParams(layoutParams3);
        TdsImageView tdsImageView2 = this.onWarmupCompleted;
        if (this.IAuthTabCallback) {
            int i8 = postMessage + 97;
            newAuthTabSession = i8 % 128;
            int i9 = i8 % 2;
        } else {
            i3 = 8;
        }
        tdsImageView2.setVisibility(i3);
    }

    public static /* synthetic */ Unit onExtraCallback(RectHighlightV3 rectHighlightV3, AppLovinSdkSettings appLovinSdkSettings) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{rectHighlightV3, appLovinSdkSettings}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -501424277, 501424290, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{attachapplovinsdk}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1406460970, -1406460970, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{attachapplovinsdk}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1875544350, -1875544339, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{attachapplovinsdk}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1347523963, 1347523971, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{attachapplovinsdk}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1314284358, -1314284351, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ Unit asBinder(attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{attachapplovinsdk}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 739556334, -739556331, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RectHighlightV3 rectHighlightV3) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{rectHighlightV3}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 604835727, -604835711, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AppLovinSdkSettings appLovinSdkSettings) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{appLovinSdkSettings}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1718332108, 1718332117, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onWarmupCompleted(AppLovinSdkSettings appLovinSdkSettings) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{appLovinSdkSettings}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1698910778, 1698910779, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private final void onExtraCallback(int i, int i2) {
        Object[] objArr = {this, Integer.valueOf(i), Integer.valueOf(i2)};
        onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1240669129, 1240669143, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static final boolean onWarmupCompleted(RectHighlightV3 rectHighlightV3, View view, MotionEvent motionEvent) {
        return ((Boolean) onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{rectHighlightV3, view, motionEvent}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1798219060, 1798219072, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
    }

    private final void IAuthTabCallback(Function0<Unit> function0) {
        onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, function0}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1805472297, 1805472307, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private final void onNavigationEvent(int i, int i2) {
        Object[] objArr = {this, Integer.valueOf(i), Integer.valueOf(i2)};
        onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -353153960, 353153965, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static final void onNavigationEvent(RectHighlightV3 rectHighlightV3, boolean z) {
        Object[] objArr = {rectHighlightV3, Boolean.valueOf(z)};
        onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1371588335, -1371588333, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static final Unit ICustomTabsCallbackDefault(attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{attachapplovinsdk}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2096713367, 2096713371, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static final Unit mayLaunchUrl(attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{attachapplovinsdk}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2064912387, 2064912393, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }
}
