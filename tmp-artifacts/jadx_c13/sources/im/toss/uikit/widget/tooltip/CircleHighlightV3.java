package im.toss.uikit.widget.tooltip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.tooltip.TdsHighlightV3View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.Address;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.AppDataCollectorCompanion;
import o.AppLovinSdkSettings;
import o.OkHttp;
import o.OkHttpClient;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14100;
import o.attachAppLovinSdk;
import o.deprecated_certificatePinner;
import o.deprecated_dns;
import o.findResAndMsg;
import o.formatMsgs;
import o.generateAppWithState;
import o.generateLink;
import o.getAdService;
import o.getAppDataMetadata;
import o.getDurationMs;
import o.getExtraParameters;
import o.getKekid;
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
import o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled;
import o.varyFields;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class CircleHighlightV3 extends ConstraintLayout implements generateAppWithState {
    private static int ICustomTabsService = 0;
    private static int isEngagementSignalsApiAvailable = 1;
    private ViewGroup IAuthTabCallback;
    private runOnUiThreadDelayed IAuthTabCallbackDefault;
    private final DisplayMetrics IAuthTabCallbackStub;
    private final Paint IAuthTabCallbackStubProxy;
    private runOnUiThreadDelayed IAuthTabCallback_Parcel;
    private BaseTextView ICustomTabsCallback;
    private View ICustomTabsCallbackDefault;
    private float ICustomTabsCallbackStub;
    private float ICustomTabsCallbackStubProxy;
    private boolean access000;
    private boolean access100;
    private TdsImageView asBinder;
    private float asInterface;
    private generateAppWithState.onWarmupCompleted extraCallback;
    private generateAppWithState.onExtraCallback extraCallbackWithResult;
    private String getInterfaceDescriptor;
    private ViewGroup onActivityLayout;
    private Integer onActivityResized;
    private int onExtraCallback;
    private View onExtraCallbackWithResult;
    private Rect onMessageChannelReady;
    private runOnUiThreadDelayed onMinimized;
    private boolean onNavigationEvent;
    private generateAppWithState.onExtraCallbackWithResult onPostMessage;
    private View onRelationshipValidationResult;
    private generateAppWithState.onNavigationEvent onTransact;
    private int[] onUnminimized;
    private TdsImageView onWarmupCompleted;
    private int readTypedObject;
    private int writeTypedObject;

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] IAuthTabCallback;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[generateAppWithState.onNavigationEvent.values().length];
            try {
                iArr[generateAppWithState.onNavigationEvent.STRONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            onExtraCallback = iArr;
            int[] iArr2 = new int[generateAppWithState.onWarmupCompleted.values().length];
            try {
                iArr2[generateAppWithState.onWarmupCompleted.BOTTOM.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 31;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[generateAppWithState.onWarmupCompleted.TOP.ordinal()] = 2;
                int i4 = onExtraCallbackWithResult + 123;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr2;
            int[] iArr3 = new int[generateAppWithState.onExtraCallback.values().length];
            try {
                iArr3[generateAppWithState.onExtraCallback.LEFT.ordinal()] = 1;
                int i7 = onExtraCallbackWithResult + 71;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr3[generateAppWithState.onExtraCallback.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[generateAppWithState.onExtraCallback.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            onWarmupCompleted = iArr3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleHighlightV3(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleHighlightV3(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(CircleHighlightV3 circleHighlightV3) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 119;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(getKekid.onExtraCallback(), 1306178718, new Object[]{circleHighlightV3}, -1306178705, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
        int i4 = ICustomTabsService + 3;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 17;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitMayLaunchUrl = mayLaunchUrl(attachapplovinsdk);
        int i4 = ICustomTabsService + 123;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unitMayLaunchUrl;
    }

    public static /* synthetic */ void IAuthTabCallback(CircleHighlightV3 circleHighlightV3, boolean z) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 125;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {circleHighlightV3, Boolean.valueOf(z)};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        int iOnExtraCallback3 = getKekid.onExtraCallback();
        int iOnExtraCallback4 = getKekid.onExtraCallback();
        if (i3 == 0) {
            onExtraCallbackWithResult(iOnExtraCallback3, 1200961814, objArr, -1200961799, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback4);
        } else {
            onExtraCallbackWithResult(iOnExtraCallback3, 1200961814, objArr, -1200961799, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback4);
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        CircleHighlightV3 circleHighlightV3 = (CircleHighlightV3) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 89;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        asBinder(circleHighlightV3);
        int i4 = isEngagementSignalsApiAvailable + 61;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 17;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel(attachapplovinsdk);
        int i4 = isEngagementSignalsApiAvailable + 23;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            return unitICustomTabsCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 123;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsService = ICustomTabsService(attachapplovinsdk);
        int i4 = ICustomTabsService + 7;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return unitICustomTabsService;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 17;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCommand = extraCommand(attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        int i5 = isEngagementSignalsApiAvailable + 13;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return unitExtraCommand;
    }

    public static /* synthetic */ Unit ICustomTabsCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 99;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = getKekid.onExtraCallback();
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            return (Unit) onExtraCallbackWithResult(getKekid.onExtraCallback(), -2125528026, new Object[]{attachapplovinsdk}, 2125528026, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
        }
        int iOnExtraCallback3 = getKekid.onExtraCallback();
        int iOnExtraCallback4 = getKekid.onExtraCallback();
        int i3 = 30 / 0;
        return (Unit) onExtraCallbackWithResult(getKekid.onExtraCallback(), -2125528026, new Object[]{attachapplovinsdk}, 2125528026, iOnExtraCallback4, iOnExtraCallback3, getKekid.onExtraCallback());
    }

    public static /* synthetic */ Unit access100(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 9;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            return onMinimized(attachapplovinsdk);
        }
        onMinimized(attachapplovinsdk);
        throw null;
    }

    public static /* synthetic */ Unit asBinder(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 33;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            return onMessageChannelReady(attachapplovinsdk);
        }
        onMessageChannelReady(attachapplovinsdk);
        throw null;
    }

    public static /* synthetic */ Unit asInterface(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 13;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnUnminimized = onUnminimized(attachapplovinsdk);
        int i4 = ICustomTabsService + 97;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unitOnUnminimized;
    }

    public static /* synthetic */ Unit extraCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 59;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitNewSession = newSession(attachapplovinsdk);
        int i4 = isEngagementSignalsApiAvailable + 3;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return unitNewSession;
    }

    public static /* synthetic */ Unit extraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 25;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallbackStub = ICustomTabsCallbackStub(attachapplovinsdk);
        int i4 = ICustomTabsService + 87;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return unitICustomTabsCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 125;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(getKekid.onExtraCallback(), -85763025, new Object[]{attachapplovinsdk}, 85763039, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
        int i4 = ICustomTabsService + 83;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CircleHighlightV3 circleHighlightV3) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 125;
        ICustomTabsService = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback_Parcel(circleHighlightV3);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(circleHighlightV3);
        int i3 = ICustomTabsService + 109;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback_Parcel;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 25;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            newSessionWithExtras(attachapplovinsdk);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitNewSessionWithExtras = newSessionWithExtras(attachapplovinsdk);
        int i3 = isEngagementSignalsApiAvailable + 95;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        return unitNewSessionWithExtras;
    }

    public static /* synthetic */ boolean onExtraCallback(CircleHighlightV3 circleHighlightV3, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 77;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(circleHighlightV3, view, motionEvent);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return zOnWarmupCompleted;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~i2;
        int i11 = i9 | (~(i10 | i5));
        int i12 = (~(i5 | i7)) | (~(i8 | i10));
        int i13 = ~(i3 | i2);
        int i14 = i12 | i13;
        int i15 = i13 | i11;
        int i16 = i3 + i2 + i4 + ((-1585779005) * i) + (640148872 * i6);
        int i17 = i16 * i16;
        int i18 = (i3 * 308833806) + 153878528 + (308833806 * i2) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i4) + (1159200768 * i) + ((-734003200) * i6) + (2089549824 * i17);
        int i19 = (i3 * (-1291220770)) + 263398195 + (i2 * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * 901) + (i4 * (-1291221671)) + (i * (-1079815989)) + (i6 * 669414472) + (i17 * 145489920);
        switch (i18 + (i19 * i19 * (-1699479552))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
                int i20 = 2 % 2;
                int i21 = isEngagementSignalsApiAvailable + 55;
                ICustomTabsService = i21 % 128;
                int i22 = i21 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult());
                Unit unit = Unit.INSTANCE;
                int i23 = isEngagementSignalsApiAvailable + 15;
                ICustomTabsService = i23 % 128;
                int i24 = i23 % 2;
                return unit;
            case 7:
                return asInterface(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return onTransact(objArr);
            case 11:
                attachAppLovinSdk attachapplovinsdk2 = (attachAppLovinSdk) objArr[0];
                int i25 = 2 % 2;
                int i26 = ICustomTabsService + 57;
                isEngagementSignalsApiAvailable = i26 % 128;
                int i27 = i26 % 2;
                Unit unitOnRelationshipValidationResult = onRelationshipValidationResult(attachapplovinsdk2);
                int i28 = isEngagementSignalsApiAvailable + 115;
                ICustomTabsService = i28 % 128;
                int i29 = i28 % 2;
                return unitOnRelationshipValidationResult;
            case 12:
                return IAuthTabCallback_Parcel(objArr);
            case 13:
                return access100(objArr);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            case 15:
                return getInterfaceDescriptor(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CircleHighlightV3 circleHighlightV3) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 89;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(getKekid.onExtraCallback(), -383106685, new Object[]{circleHighlightV3}, 383106686, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
        int i4 = isEngagementSignalsApiAvailable + 19;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 83;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnActivityResized = onActivityResized(attachapplovinsdk);
        int i4 = ICustomTabsService + 99;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnActivityResized;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CircleHighlightV3 circleHighlightV3) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 69;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(circleHighlightV3);
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
        int i5 = ICustomTabsService + 99;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return unitAccess000;
    }

    public static /* synthetic */ Unit onNavigationEvent(CircleHighlightV3 circleHighlightV3, AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 45;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(circleHighlightV3, appLovinSdkSettings);
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(CircleHighlightV3 circleHighlightV3, getAppDataMetadata getappdatametadata) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 87;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(circleHighlightV3, getappdatametadata);
        int i4 = isEngagementSignalsApiAvailable + 9;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 13;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(appLovinSdkSettings);
        int i4 = ICustomTabsService + 59;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ boolean onNavigationEvent(CircleHighlightV3 circleHighlightV3, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 61;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(circleHighlightV3, view, motionEvent);
            throw null;
        }
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(circleHighlightV3, view, motionEvent);
        int i3 = ICustomTabsService + 67;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 34 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 15;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsCallbackStubProxy(attachapplovinsdk);
        }
        ICustomTabsCallbackStubProxy(attachapplovinsdk);
        throw null;
    }

    public static /* synthetic */ Unit onTransact(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 15;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            postMessage(attachapplovinsdk);
            throw null;
        }
        Unit unitPostMessage = postMessage(attachapplovinsdk);
        int i3 = isEngagementSignalsApiAvailable + 55;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        return unitPostMessage;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 105;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {attachapplovinsdk};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        int iOnExtraCallback3 = getKekid.onExtraCallback();
        int iOnExtraCallback4 = getKekid.onExtraCallback();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(iOnExtraCallback3, -1469090983, objArr2, 1469090989, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback4);
        int i4 = isEngagementSignalsApiAvailable + 93;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CircleHighlightV3 circleHighlightV3) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 95;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(getKekid.onExtraCallback(), 1326374480, new Object[]{circleHighlightV3}, -1326374477, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
        int i4 = isEngagementSignalsApiAvailable + 53;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 105;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(appLovinSdkSettings);
        }
        onExtraCallbackWithResult(appLovinSdkSettings);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 109;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnActivityLayout = onActivityLayout(attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        int i5 = ICustomTabsService + 45;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return unitOnActivityLayout;
    }

    public static /* synthetic */ void onWarmupCompleted(View view, CircleHighlightV3 circleHighlightV3) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 97;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        onExtraCallbackWithResult(getKekid.onExtraCallback(), 1651240656, new Object[]{view, circleHighlightV3}, -1651240644, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
        int i4 = ICustomTabsService + 67;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(View view, CircleHighlightV3 circleHighlightV3, ViewGroup viewGroup, ViewGroup viewGroup2, String str, generateAppWithState.onWarmupCompleted onwarmupcompleted, generateAppWithState.onExtraCallback onextracallback, generateAppWithState.onNavigationEvent onnavigationevent, int i, boolean z, Integer num, generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, long j) {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 1;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Integer numValueOf = Integer.valueOf(i);
        Boolean boolValueOf = Boolean.valueOf(z);
        Long lValueOf = Long.valueOf(j);
        if (i4 != 0) {
            int iOnExtraCallback = getKekid.onExtraCallback();
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            onExtraCallbackWithResult(getKekid.onExtraCallback(), -1706534444, new Object[]{view, circleHighlightV3, viewGroup, viewGroup2, str, onwarmupcompleted, onextracallback, onnavigationevent, numValueOf, boolValueOf, num, onextracallbackwithresult, lValueOf}, 1706534446, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
            throw null;
        }
        int iOnExtraCallback3 = getKekid.onExtraCallback();
        int iOnExtraCallback4 = getKekid.onExtraCallback();
        onExtraCallbackWithResult(getKekid.onExtraCallback(), -1706534444, new Object[]{view, circleHighlightV3, viewGroup, viewGroup2, str, onwarmupcompleted, onextracallback, onnavigationevent, numValueOf, boolValueOf, num, onextracallbackwithresult, lValueOf}, 1706534446, iOnExtraCallback4, iOnExtraCallback3, getKekid.onExtraCallback());
        int i5 = ICustomTabsService + 41;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit writeTypedObject(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 51;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(getKekid.onExtraCallback(), 1125189424, new Object[]{attachapplovinsdk}, -1125189417, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
        int i4 = ICustomTabsService + 109;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class onExtraCallback extends Drawable {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final Paint IAuthTabCallback = new Paint(1);
        private final Paint onNavigationEvent = new Paint(1);

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 93;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return -3;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class IAuthTabCallback implements getAdService {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ Configuration onExtraCallbackWithResult;

            public IAuthTabCallback(Configuration configuration) {
                this.onExtraCallbackWithResult = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 35;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                        return getSpecialFeatureOptInStatus.Dark;
                    }
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                    int i3 = onExtraCallback + 49;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 0 / 0;
                    }
                    return getspecialfeatureoptinstatus;
                }
                readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        /* renamed from: im.toss.uikit.widget.tooltip.CircleHighlightV3$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        public static final class C0009onExtraCallback implements getAdService {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ Configuration onExtraCallback;

            public C0009onExtraCallback(Configuration configuration) {
                this.onExtraCallback = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                int i = 2 % 2;
                if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    int i2 = onExtraCallbackWithResult + 125;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i4 = onExtraCallbackWithResult + 41;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
        }

        public static final class onExtraCallbackWithResult implements getAdService {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ Configuration onExtraCallbackWithResult;

            public onExtraCallbackWithResult(Configuration configuration) {
                this.onExtraCallbackWithResult = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    if (!(!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult))) {
                        return getSpecialFeatureOptInStatus.Dark;
                    }
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                    int i3 = IAuthTabCallback + 29;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return getspecialfeatureoptinstatus;
                }
                readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static final class onWarmupCompleted implements getAdService {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            final /* synthetic */ Configuration onNavigationEvent;

            public onWarmupCompleted(Configuration configuration) {
                this.onNavigationEvent = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 5;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                        return getSpecialFeatureOptInStatus.Light;
                    }
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                    int i3 = onExtraCallback + 119;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return getspecialfeatureoptinstatus;
                }
                readIntokhttp.onExtraCallback(this.onNavigationEvent);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        onExtraCallback() {
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            int iIPostMessageServiceStubProxy;
            int i = 2 % 2;
            Float fValueOf = Float.valueOf(10.0f);
            Intrinsics.checkNotNullParameter(canvas, "");
            RectF rectF = new RectF(getBounds());
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = rectF.right;
            float f4 = rectF.bottom;
            Context context = CircleHighlightV3.this.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            if (new getUrlokhttp(new onExtraCallbackWithResult(configuration)).ITrustedWebActivityCallbackDefault() == getSpecialFeatureOptInStatus.Dark) {
                Context context2 = CircleHighlightV3.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                Configuration configuration2 = context2.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                iIPostMessageServiceStubProxy = ((Integer) setHeadersokhttp.onExtraCallbackWithResult(673041327, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new IAuthTabCallback(configuration2)).getInterfaceDescriptor()}, matches.onExtraCallback(), -673041326, matches.onExtraCallback())).intValue();
            } else {
                Context context3 = CircleHighlightV3.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                Configuration configuration3 = context3.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration3, "");
                iIPostMessageServiceStubProxy = new getUrlokhttp(new onWarmupCompleted(configuration3)).requestPostMessageChannel().IPostMessageServiceStubProxy();
            }
            int iOnNavigationEvent = setBodyokhttp.onNavigationEvent(iIPostMessageServiceStubProxy, 0.1f);
            int i2 = onWarmupCompleted + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Context context4 = CircleHighlightV3.this.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration4 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration4, "");
            this.IAuthTabCallback.setShader(new LinearGradient(f, f2, f3, f4, new int[]{iOnNavigationEvent, setBodyokhttp.onNavigationEvent(new getUrlokhttp(new C0009onExtraCallback(configuration4)).requestPostMessageChannel().IAuthTabCallbackStub(), 0.1f)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.onNavigationEvent.setStyle(Paint.Style.STROKE);
            Paint paint = this.onNavigationEvent;
            getDurationMs.onWarmupCompleted onwarmupcompleted = getDurationMs.onWarmupCompleted.onExtraCallbackWithResult;
            Context context5 = CircleHighlightV3.this.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            paint.setColor(onwarmupcompleted.onWarmupCompleted(context5));
            this.onNavigationEvent.setStrokeWidth(varyMatches.IAuthTabCallback(CircleHighlightV3.this, 1));
            canvas.drawRoundRect(rectF, varyMatches.IAuthTabCallback(CircleHighlightV3.this, fValueOf), varyMatches.IAuthTabCallback(CircleHighlightV3.this, fValueOf), this.IAuthTabCallback);
            canvas.drawRoundRect(rectF, varyMatches.IAuthTabCallback(CircleHighlightV3.this, fValueOf), varyMatches.IAuthTabCallback(CircleHighlightV3.this, fValueOf), this.onNavigationEvent);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 21;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            this.IAuthTabCallback.setAlpha(i);
            this.onNavigationEvent.setAlpha(i);
            int i5 = onWarmupCompleted + 45;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.setColorFilter(colorFilter);
            this.onNavigationEvent.setColorFilter(colorFilter);
            int i4 = onWarmupCompleted + 97;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CircleHighlightV3(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = isEngagementSignalsApiAvailable + 113;
            ICustomTabsService = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = isEngagementSignalsApiAvailable + 49;
            ICustomTabsService = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 2;
            } else {
                int i6 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ boolean IAuthTabCallbackDefault(CircleHighlightV3 circleHighlightV3) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 11;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallback = circleHighlightV3.extraCallback();
        int i4 = isEngagementSignalsApiAvailable + 11;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            return zExtraCallback;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(CircleHighlightV3 circleHighlightV3, Function0 function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 17;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        circleHighlightV3.onExtraCallbackWithResult((Function0<Unit>) function0);
        int i4 = isEngagementSignalsApiAvailable + 95;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ generateAppWithState.onNavigationEvent onTransact(CircleHighlightV3 circleHighlightV3) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 105;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        generateAppWithState.onNavigationEvent onnavigationevent = circleHighlightV3.onTransact;
        if (i3 != 0) {
            return onnavigationevent;
        }
        throw null;
    }

    @Override // o.generateAppWithState
    public /* bridge */ boolean onExtraCallbackWithResult(@NotNull Rect rect, float f, float f2) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 97;
        ICustomTabsService = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onExtraCallbackWithResult(rect, f, f2);
            throw null;
        }
        boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult(rect, f, f2);
        int i3 = ICustomTabsService + 119;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public ViewGroup onExtraCallback() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 85;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        ViewGroup viewGroup = this.IAuthTabCallback;
        int i5 = i2 + 65;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return viewGroup;
    }

    public void setDecorView(@Nullable ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 87;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallback = viewGroup;
        int i5 = i2 + 47;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
    }

    public runOnUiThreadDelayed IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 37;
        isEngagementSignalsApiAvailable = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        runOnUiThreadDelayed runonuithreaddelayed = this.onMinimized;
        int i4 = i2 + 71;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return runonuithreaddelayed;
        }
        obj.hashCode();
        throw null;
    }

    public void setStartTimeline(@Nullable runOnUiThreadDelayed runonuithreaddelayed) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 75;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        this.onMinimized = runonuithreaddelayed;
        int i5 = i3 + 77;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
    }

    public runOnUiThreadDelayed IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 5;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = this.IAuthTabCallbackDefault;
        int i5 = i3 + 7;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return runonuithreaddelayed;
    }

    public void setEndTimeline(@Nullable runOnUiThreadDelayed runonuithreaddelayed) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 33;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackDefault = runonuithreaddelayed;
        if (i4 != 0) {
            int i5 = 10 / 0;
        }
        int i6 = i2 + 51;
        ICustomTabsService = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public View onTransact() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 49;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        View view = this.onRelationshipValidationResult;
        int i5 = i2 + 73;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    public void setTargetView(@Nullable View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 123;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        this.onRelationshipValidationResult = view;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 65;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setMessage(@Nullable String str) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 95;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        this.getInterfaceDescriptor = str;
        if (i4 != 0) {
            int i5 = 49 / 0;
        }
        int i6 = i3 + 37;
        isEngagementSignalsApiAvailable = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public generateAppWithState.onExtraCallback onNavigationEvent() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 97;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        generateAppWithState.onExtraCallback onextracallback = this.extraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        return onextracallback;
    }

    public void setMessageAlign(@NotNull generateAppWithState.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 109;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.extraCallbackWithResult = onextracallback;
        } else {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.extraCallbackWithResult = onextracallback;
            throw null;
        }
    }

    public ViewGroup IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 35;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup viewGroup = this.onActivityLayout;
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return viewGroup;
    }

    public void setParentViewGroup(@Nullable ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 31;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        this.onActivityLayout = viewGroup;
        int i5 = i3 + 87;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public int[] IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 25;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        int[] iArr = this.onUnminimized;
        int i5 = i3 + 59;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return iArr;
    }

    public void setTargetViewPosition(@NotNull int[] iArr) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 105;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iArr, "");
        this.onUnminimized = iArr;
        int i4 = ICustomTabsService + 69;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public Rect asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 55;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        Rect rect = this.onMessageChannelReady;
        int i5 = i2 + 71;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return rect;
    }

    public void setTargetRect(@NotNull Rect rect) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 107;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rect, "");
        this.onMessageChannelReady = rect;
        int i4 = isEngagementSignalsApiAvailable + 73;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
    }

    public Integer asBinder() {
        Integer num;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 15;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        if (i2 % 2 != 0) {
            num = this.onActivityResized;
            int i4 = 78 / 0;
        } else {
            num = this.onActivityResized;
        }
        int i5 = i3 + 89;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public void setPlayCount(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 107;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        this.onActivityResized = num;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 91;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
    }

    public float IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 71;
        isEngagementSignalsApiAvailable = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        float f = this.ICustomTabsCallbackStub;
        int i4 = i2 + 29;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        obj.hashCode();
        throw null;
    }

    public void setTargetViewX(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 77;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        this.ICustomTabsCallbackStub = f;
        if (i3 == 0) {
            throw null;
        }
    }

    public float getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 13;
        isEngagementSignalsApiAvailable = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        float f = this.ICustomTabsCallbackStubProxy;
        int i4 = i2 + 1;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        obj.hashCode();
        throw null;
    }

    public void setTargetViewY(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 55;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.ICustomTabsCallbackStubProxy = f;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 33;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public View onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 27;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setDim(@NotNull View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 65;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        this.onExtraCallbackWithResult = view;
        int i4 = ICustomTabsService + 55;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CircleHighlightV3(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.extraCallbackWithResult = generateAppWithState.onExtraCallback.CENTER;
        this.extraCallback = generateAppWithState.onWarmupCompleted.BOTTOM;
        this.onUnminimized = new int[2];
        this.asInterface = setTagsokhttp.onExtraCallbackWithResult(this, 14);
        this.onMessageChannelReady = new Rect();
        this.ICustomTabsCallbackStub = -1.0f;
        this.ICustomTabsCallbackStubProxy = -1.0f;
        this.onNavigationEvent = true;
        this.onTransact = generateAppWithState.onNavigationEvent.WEAK;
        this.onExtraCallback = setTagsokhttp.onExtraCallbackWithResult(this, 8);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.IAuthTabCallbackStub = displayMetrics;
        setLayerType(2, null);
        setClipChildren(true);
        setClipToPadding(true);
        if (getLayoutParams() == null) {
            setLayoutParams(new ConstraintLayout.onExtraCallbackWithResult(-1, -1));
            int i2 = isEngagementSignalsApiAvailable + 13;
            ICustomTabsService = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 / 2;
            } else {
                int i4 = 2 % 2;
            }
        }
        View view = new View(getContext());
        getDurationMs.onWarmupCompleted onwarmupcompleted = getDurationMs.onWarmupCompleted.onExtraCallbackWithResult;
        view.setBackground(onwarmupcompleted.onNavigationEvent(context));
        view.setVisibility(4);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, view);
        setDim(view);
        View view2 = new View(getContext());
        Class cls = Integer.TYPE;
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(onextracallbackwithresult);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).width = -2;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).height = -2;
        view2.setLayoutParams(onextracallbackwithresult);
        view2.setVisibility(4);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, view2);
        this.ICustomTabsCallbackDefault = view2;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        TdsImageView tdsImageView = new TdsImageView(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        TdsImageView.setImage$default(tdsImageView, onwarmupcompleted.IAuthTabCallback(context), (Function1) null, (Function1) null, 6, (Object) null);
        tdsImageView.setVisibility(4);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, tdsImageView);
        this.asBinder = tdsImageView;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsImageView tdsImageView2 = new TdsImageView(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult3 = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(onextracallbackwithresult3);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult3;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult4).width = setTagsokhttp.onExtraCallbackWithResult(tdsImageView2, 25);
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult4).height = setTagsokhttp.onExtraCallbackWithResult(tdsImageView2, 25);
        tdsImageView2.setLayoutParams(onextracallbackwithresult3);
        tdsImageView2.setPadding(setTagsokhttp.onExtraCallbackWithResult(tdsImageView2, 5), setTagsokhttp.onExtraCallbackWithResult(tdsImageView2, 5), setTagsokhttp.onExtraCallbackWithResult(tdsImageView2, 5), setTagsokhttp.onExtraCallbackWithResult(tdsImageView2, 5));
        tdsImageView2.setImageTintList(ColorStateList.valueOf(onwarmupcompleted.onExtraCallback(context)));
        tdsImageView2.setClickable(true);
        tdsImageView2.setFocusable(true);
        tdsImageView2.setImage(OkHttpClient.onExtraCallback(OkHttp.onExtraCallback));
        tdsImageView2.setVisibility(4);
        tdsImageView2.setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda7
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                int i5 = 2 % 2;
                int i6 = onNavigationEvent + 7;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr = {this.f$0, view3, motionEvent};
                int iOnExtraCallback = getKekid.onExtraCallback();
                boolean zBooleanValue = ((Boolean) CircleHighlightV3.onExtraCallbackWithResult(getKekid.onExtraCallback(), -2145079774, objArr, 2145079782, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback())).booleanValue();
                int i8 = onNavigationEvent + 23;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                return zBooleanValue;
            }
        });
        setProxySelectorokhttp.onExtraCallbackWithResult(this, tdsImageView2);
        this.onWarmupCompleted = tdsImageView2;
        BaseTextView baseTextView = (BaseTextView) Typography6.class.getDeclaredConstructor(Context.class).newInstance(getContext());
        Intrinsics.checkNotNull(baseTextView);
        baseTextView.onNavigationEvent(response.Bold);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult5 = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(onextracallbackwithresult5);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult6 = onextracallbackwithresult5;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult6).width = -1;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult6).height = -2;
        baseTextView.setLayoutParams(onextracallbackwithresult5);
        baseTextView.setMaxWidth(displayMetrics.widthPixels);
        baseTextView.setPaddingRelative(setTagsokhttp.onExtraCallbackWithResult(baseTextView, 14), 0, setTagsokhttp.onExtraCallbackWithResult(baseTextView, 14), 0);
        baseTextView.setVisibility(4);
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, baseTextView);
        this.ICustomTabsCallback = baseTextView;
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setAntiAlias(true);
        this.IAuthTabCallbackStubProxy = paint;
        int i5 = isEngagementSignalsApiAvailable + 111;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        CircleHighlightV3 circleHighlightV3 = (CircleHighlightV3) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int action = ((MotionEvent) objArr[2]).getAction();
        if (action == 0) {
            pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
            Intrinsics.checkNotNull(view);
            isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsJVMKt.listOf((Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(0.9f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null), false, 1, (Object) null);
            int i2 = isEngagementSignalsApiAvailable + 73;
            ICustomTabsService = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = isEngagementSignalsApiAvailable + 105;
        int i5 = i4 % 128;
        ICustomTabsService = i5;
        int i6 = i4 % 2;
        if (action == 1) {
            circleHighlightV3.onWarmupCompleted();
            return false;
        }
        int i7 = i5 + 49;
        isEngagementSignalsApiAvailable = i7 % 128;
        return i7 % 2 == 0;
    }

    private static final Unit access000(CircleHighlightV3 circleHighlightV3) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 73;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        circleHighlightV3.access100();
        circleHighlightV3.onWarmupCompleted(false);
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 39;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [android.view.View, im.toss.uikit.widget.tooltip.CircleHighlightV3, java.lang.Object] */
    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        View view = (View) objArr[0];
        final ?? r11 = (CircleHighlightV3) objArr[1];
        int i = 2 % 2;
        view.getLocationOnScreen(r11.IAuthTabCallbackStubProxy());
        r11.setTargetRect(new Rect(r11.IAuthTabCallbackStubProxy()[0], r11.IAuthTabCallbackStubProxy()[1], r11.IAuthTabCallbackStubProxy()[0] + view.getWidth(), r11.IAuthTabCallbackStubProxy()[1] + view.getHeight()));
        if (r11.isAttachedToWindow()) {
            r11.onExtraCallbackWithResult(new Function0() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda6
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 47;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitOnNavigationEvent = CircleHighlightV3.onNavigationEvent(this.f$0);
                    int i5 = onWarmupCompleted + 111;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        return unitOnNavigationEvent;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
            int i2 = ICustomTabsService + 63;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
        }
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        onExtraCallbackWithResult(getKekid.onExtraCallback(), -417139152, new Object[]{r11}, 417139157, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
        int i4 = isEngagementSignalsApiAvailable + 53;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CircleHighlightV3 circleHighlightV3 = (CircleHighlightV3) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 33;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        circleHighlightV3.access100();
        circleHighlightV3.onWarmupCompleted(false);
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 93;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.generateAppWithState
    public void onExtraCallbackWithResult(@NotNull Rect rect) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rect, "");
        setTargetRect(rect);
        if (isAttachedToWindow()) {
            onExtraCallbackWithResult((Function0<Unit>) new Function0() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda5
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 19;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitOnExtraCallbackWithResult = CircleHighlightV3.onExtraCallbackWithResult(this.f$0);
                    int i5 = onExtraCallback + 17;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 2 / 0;
                    }
                    return unitOnExtraCallbackWithResult;
                }
            });
            int i2 = isEngagementSignalsApiAvailable + 57;
            ICustomTabsService = i2 % 128;
            int i3 = i2 % 2;
        }
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        onExtraCallbackWithResult(getKekid.onExtraCallback(), -417139152, new Object[]{this}, 417139157, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
        int i4 = ICustomTabsService + 49;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void setTargetView$default(CircleHighlightV3 circleHighlightV3, View view, ViewGroup viewGroup, ViewGroup viewGroup2, String str, generateAppWithState.onWarmupCompleted onwarmupcompleted, generateAppWithState.onExtraCallback onextracallback, generateAppWithState.onNavigationEvent onnavigationevent, int i, boolean z, Integer num, generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, long j, int i2, Object obj) {
        Integer num2;
        int i3 = 2 % 2;
        int i4 = isEngagementSignalsApiAvailable + 43;
        int i5 = i4 % 128;
        ICustomTabsService = i5;
        int i6 = i4 % 2;
        if ((i2 & Imgcodecs.IMWRITE_AVIF_QUALITY) != 0) {
            int i7 = i5 + 97;
            isEngagementSignalsApiAvailable = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            num2 = null;
        } else {
            num2 = num;
        }
        circleHighlightV3.setTargetView(view, viewGroup, viewGroup2, str, onwarmupcompleted, onextracallback, onnavigationevent, i, z, num2, onextracallbackwithresult, j);
    }

    public final void setTargetView(@NotNull View view, @NotNull final ViewGroup viewGroup, @NotNull final ViewGroup viewGroup2, @Nullable final String str, @NotNull final generateAppWithState.onWarmupCompleted onwarmupcompleted, @NotNull final generateAppWithState.onExtraCallback onextracallback, @NotNull final generateAppWithState.onNavigationEvent onnavigationevent, final int i, final boolean z, @Nullable final Integer num, @Nullable final generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, final long j) {
        View view2 = view;
        int i2 = 2 % 2;
        int i3 = ICustomTabsService + 91;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view2, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(viewGroup2, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        if (view2 instanceof ViewGroup) {
            int i5 = isEngagementSignalsApiAvailable + 53;
            ICustomTabsService = i5 % 128;
            int i6 = i5 % 2;
            ViewGroup viewGroup3 = (ViewGroup) view2;
            if (viewGroup3.getChildCount() == 1 && (viewGroup3.getChildAt(0) instanceof TdsListRowV1View)) {
                View childAt = viewGroup3.getChildAt(0);
                Intrinsics.checkNotNull(childAt, "");
                view2 = (TdsListRowV1View) childAt;
            }
        }
        setTargetView(view2);
        final View viewOnTransact = onTransact();
        if (viewOnTransact == null) {
            return;
        }
        viewOnTransact.post(new Runnable() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // java.lang.Runnable
            public final void run() {
                int i7 = 2 % 2;
                int i8 = onWarmupCompleted + 103;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                CircleHighlightV3.onWarmupCompleted(viewOnTransact, this, viewGroup, viewGroup2, str, onwarmupcompleted, onextracallback, onnavigationevent, i, z, num, onextracallbackwithresult, j);
                int i10 = onExtraCallbackWithResult + 9;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
            }
        });
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        View view = (View) objArr[0];
        CircleHighlightV3 circleHighlightV3 = (CircleHighlightV3) objArr[1];
        ViewGroup viewGroup = (ViewGroup) objArr[2];
        ViewGroup viewGroup2 = (ViewGroup) objArr[3];
        String str = (String) objArr[4];
        generateAppWithState.onWarmupCompleted onwarmupcompleted = (generateAppWithState.onWarmupCompleted) objArr[5];
        generateAppWithState.onExtraCallback onextracallback = (generateAppWithState.onExtraCallback) objArr[6];
        generateAppWithState.onNavigationEvent onnavigationevent = (generateAppWithState.onNavigationEvent) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[9]).booleanValue();
        Integer num = (Integer) objArr[10];
        generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult = (generateAppWithState.onExtraCallbackWithResult) objArr[11];
        long jLongValue = ((Number) objArr[12]).longValue();
        int i = 2 % 2;
        view.getLocationOnScreen(circleHighlightV3.IAuthTabCallbackStubProxy());
        circleHighlightV3.setTargetRect(new Rect(circleHighlightV3.IAuthTabCallbackStubProxy()[0], circleHighlightV3.IAuthTabCallbackStubProxy()[1], circleHighlightV3.IAuthTabCallbackStubProxy()[0] + view.getWidth(), circleHighlightV3.IAuthTabCallbackStubProxy()[1] + view.getHeight()));
        circleHighlightV3.onWarmupCompleted(viewGroup, viewGroup2, str, onwarmupcompleted, onextracallback, onnavigationevent, iIntValue, zBooleanValue, num, onextracallbackwithresult, jLongValue);
        int i2 = isEngagementSignalsApiAvailable + Imgproc.COLOR_YUV2RGB_YVYU;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 36 / 0;
        }
        return null;
    }

    public static /* synthetic */ void setTargetRect$default(CircleHighlightV3 circleHighlightV3, Rect rect, ViewGroup viewGroup, ViewGroup viewGroup2, String str, generateAppWithState.onWarmupCompleted onwarmupcompleted, generateAppWithState.onExtraCallback onextracallback, generateAppWithState.onNavigationEvent onnavigationevent, int i, boolean z, Integer num, generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, long j, int i2, Object obj) {
        Integer num2;
        int i3 = 2 % 2;
        int i4 = ICustomTabsService + 3;
        int i5 = i4 % 128;
        isEngagementSignalsApiAvailable = i5;
        if (i4 % 2 != 0 ? (i2 & Imgcodecs.IMWRITE_AVIF_QUALITY) == 0 : (i2 & 19241) == 0) {
            num2 = num;
        } else {
            int i6 = i5 + 25;
            ICustomTabsService = i6 % 128;
            int i7 = i6 % 2;
            num2 = null;
        }
        circleHighlightV3.setTargetRect(rect, viewGroup, viewGroup2, str, onwarmupcompleted, onextracallback, onnavigationevent, i, z, num2, onextracallbackwithresult, j);
    }

    public final void setTargetRect(@NotNull Rect rect, @NotNull ViewGroup viewGroup, @NotNull ViewGroup viewGroup2, @Nullable String str, @NotNull generateAppWithState.onWarmupCompleted onwarmupcompleted, @NotNull generateAppWithState.onExtraCallback onextracallback, @NotNull generateAppWithState.onNavigationEvent onnavigationevent, int i, boolean z, @Nullable Integer num, @Nullable generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, long j) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService + 93;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(viewGroup2, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        setTargetRect(rect);
        onWarmupCompleted(viewGroup, viewGroup2, str, onwarmupcompleted, onextracallback, onnavigationevent, i, z, num, onextracallbackwithresult, j);
        int i5 = isEngagementSignalsApiAvailable + 41;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void asBinder(final CircleHighlightV3 circleHighlightV3) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 61;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 87 / 0;
            if (!circleHighlightV3.isAttachedToWindow()) {
                return;
            }
        } else if (!circleHighlightV3.isAttachedToWindow()) {
            return;
        }
        circleHighlightV3.onExtraCallbackWithResult((Function0<Unit>) new Function0() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda33
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unitOnWarmupCompleted;
                int i4 = 2 % 2;
                int i5 = IAuthTabCallback + 119;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    unitOnWarmupCompleted = CircleHighlightV3.onWarmupCompleted(this.f$0);
                    int i6 = 42 / 0;
                } else {
                    unitOnWarmupCompleted = CircleHighlightV3.onWarmupCompleted(this.f$0);
                }
                int i7 = onExtraCallbackWithResult + 107;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                throw null;
            }
        });
        int i4 = isEngagementSignalsApiAvailable + 45;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CircleHighlightV3 circleHighlightV3 = (CircleHighlightV3) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 1;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        circleHighlightV3.access100();
        circleHighlightV3.onWarmupCompleted(true);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsService + 53;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(ViewGroup viewGroup, ViewGroup viewGroup2, String str, generateAppWithState.onWarmupCompleted onwarmupcompleted, generateAppWithState.onExtraCallback onextracallback, generateAppWithState.onNavigationEvent onnavigationevent, int i, boolean z, Integer num, generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, long j) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService + 19;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 == 0) {
            setParentViewGroup(viewGroup2);
            setDecorView(viewGroup);
            setMessage(str);
            this.extraCallback = onwarmupcompleted;
            setMessageAlign(onextracallback);
            this.onTransact = onnavigationevent;
            this.onExtraCallback = i;
            if (onWarmupCompleted.onExtraCallback[onnavigationevent.ordinal()] == 0) {
                int i4 = isEngagementSignalsApiAvailable + 1;
                ICustomTabsService = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            }
        } else {
            setParentViewGroup(viewGroup2);
            setDecorView(viewGroup);
            setMessage(str);
            this.extraCallback = onwarmupcompleted;
            setMessageAlign(onextracallback);
            this.onTransact = onnavigationevent;
            this.onExtraCallback = i;
            if (onWarmupCompleted.onExtraCallback[onnavigationevent.ordinal()] == 1) {
            }
        }
        this.onNavigationEvent = z;
        View viewOnExtraCallbackWithResult = onExtraCallbackWithResult();
        generateAppWithState.onNavigationEvent onnavigationevent2 = generateAppWithState.onNavigationEvent.STRONG;
        viewOnExtraCallbackWithResult.setClickable(onnavigationevent == onnavigationevent2);
        onExtraCallbackWithResult().setFocusable(onnavigationevent == onnavigationevent2);
        setPlayCount(num);
        setOnDismissListener(onextracallbackwithresult);
        this.ICustomTabsCallback.setText(str);
        postDelayed(new Runnable() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda14
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = 2 % 2;
                int i7 = onExtraCallback + 89;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                Object[] objArr = {this.f$0};
                int iOnExtraCallback = getKekid.onExtraCallback();
                CircleHighlightV3.onExtraCallbackWithResult(getKekid.onExtraCallback(), 564430266, objArr, -564430257, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback());
                int i9 = onExtraCallback + 55;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 85 / 0;
                }
            }
        }, j);
        onExtraCallbackWithResult(getKekid.onExtraCallback(), -417139152, new Object[]{this}, 417139157, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback());
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, im.toss.uikit.widget.tooltip.CircleHighlightV3] */
    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        final ?? r3 = (CircleHighlightV3) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 13;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Context context = r3.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (!varyFields.onWarmupCompleted(context)) {
            r3.onExtraCallbackWithResult().setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda8
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    boolean zOnNavigationEvent = CircleHighlightV3.onNavigationEvent(this.f$0, view, motionEvent);
                    int i7 = onExtraCallback + 107;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        return zOnNavigationEvent;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
        }
        int i4 = isEngagementSignalsApiAvailable + 77;
        ICustomTabsService = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final boolean onExtraCallbackWithResult(CircleHighlightV3 circleHighlightV3, View view, MotionEvent motionEvent) {
        View viewOnTransact;
        int i = 2 % 2;
        int i2 = ICustomTabsService + 77;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        int action = motionEvent.getAction();
        if (action == 0) {
            boolean zOnExtraCallbackWithResult = circleHighlightV3.onExtraCallbackWithResult(circleHighlightV3.asInterface(), motionEvent.getX(), motionEvent.getY());
            circleHighlightV3.access100 = !zOnExtraCallbackWithResult;
            if (!(!zOnExtraCallbackWithResult)) {
                int i4 = isEngagementSignalsApiAvailable + 21;
                ICustomTabsService = i4 % 128;
                int i5 = i4 % 2;
                View viewOnTransact2 = circleHighlightV3.onTransact();
                if (viewOnTransact2 != null) {
                    viewOnTransact2.setPressed(true);
                    viewOnTransact2.onTouchEvent(motionEvent);
                    int i6 = ICustomTabsService + 49;
                    isEngagementSignalsApiAvailable = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    circleHighlightV3.onWarmupCompleted();
                }
            } else if (circleHighlightV3.onTransact == generateAppWithState.onNavigationEvent.WEAK) {
                circleHighlightV3.onWarmupCompleted();
            }
        } else if (action != 1) {
            int i8 = ICustomTabsService + 109;
            isEngagementSignalsApiAvailable = i8 % 128;
            int i9 = i8 % 2;
            if (action == 3) {
                if (!circleHighlightV3.access100) {
                    View viewOnTransact3 = circleHighlightV3.onTransact();
                    if (viewOnTransact3 != null) {
                        viewOnTransact3.setPressed(false);
                    }
                    View viewOnTransact4 = circleHighlightV3.onTransact();
                    if (viewOnTransact4 != null) {
                        int i10 = isEngagementSignalsApiAvailable + 23;
                        ICustomTabsService = i10 % 128;
                        if (i10 % 2 != 0) {
                            viewOnTransact4.onTouchEvent(motionEvent);
                            int i11 = 94 / 0;
                        } else {
                            viewOnTransact4.onTouchEvent(motionEvent);
                        }
                    }
                }
                circleHighlightV3.access100 = false;
                circleHighlightV3.onWarmupCompleted();
            }
        } else if (!circleHighlightV3.access100) {
            View viewOnTransact5 = circleHighlightV3.onTransact();
            if (viewOnTransact5 != null) {
                int i12 = isEngagementSignalsApiAvailable + 65;
                ICustomTabsService = i12 % 128;
                int i13 = i12 % 2;
                viewOnTransact5.setPressed(false);
            }
            View viewOnTransact6 = circleHighlightV3.onTransact();
            if (viewOnTransact6 != null) {
                int i14 = ICustomTabsService + 71;
                isEngagementSignalsApiAvailable = i14 % 128;
                if (i14 % 2 == 0) {
                    viewOnTransact6.onTouchEvent(motionEvent);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                viewOnTransact6.onTouchEvent(motionEvent);
            }
            if (circleHighlightV3.onExtraCallbackWithResult(circleHighlightV3.asInterface(), motionEvent.getX(), motionEvent.getY()) && (viewOnTransact = circleHighlightV3.onTransact()) != null) {
                viewOnTransact.performClick();
            }
            circleHighlightV3.access100 = false;
            circleHighlightV3.onWarmupCompleted();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 21;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.onDetachedFromWindow();
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (runonuithreaddelayedIAuthTabCallbackStub != null) {
            runonuithreaddelayedIAuthTabCallbackStub.onNavigationEvent();
        }
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallback = IAuthTabCallback();
        if (runonuithreaddelayedIAuthTabCallback != null) {
            runonuithreaddelayedIAuthTabCallback.onNavigationEvent();
        }
        runOnUiThreadDelayed runonuithreaddelayed = this.IAuthTabCallback_Parcel;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
            int i4 = ICustomTabsService + 67;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
        }
        setStartTimeline(null);
        setEndTimeline(null);
        this.IAuthTabCallback_Parcel = null;
    }

    public void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 7;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
            if (this.access000) {
                return;
            }
        } else if (this.access000) {
            return;
        }
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (runonuithreaddelayedIAuthTabCallbackStub == null || runonuithreaddelayedIAuthTabCallbackStub.prefetch()) {
            runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallback = IAuthTabCallback();
            if (runonuithreaddelayedIAuthTabCallback == null || !runonuithreaddelayedIAuthTabCallback.postMessage()) {
                this.access000 = true;
                onExtraCallbackWithResult(getAppDataMetadata.USER_TOUCHED);
                return;
            }
            int i4 = isEngagementSignalsApiAvailable + 47;
            ICustomTabsService = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 75 / 0;
            }
        }
    }

    public final void setOnDismissListener(@Nullable generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 111;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        this.onPostMessage = onextracallbackwithresult;
        int i5 = i2 + 79;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
      0x0020: PHI (r1v5 o.TextFieldScrollKtExternalSyntheticLambda0) = (r1v4 o.TextFieldScrollKtExternalSyntheticLambda0), (r1v7 o.TextFieldScrollKtExternalSyntheticLambda0) binds: [B:8:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(Function0<Unit> function0) {
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = ICustomTabsService + 73;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            int i3 = 39 / 0;
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
                if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                    onLoadStarted.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, null, null, new onExtraCallbackWithResult(function0, null), 3, null);
                }
            }
        } else {
            textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
            }
        }
        int i4 = isEngagementSignalsApiAvailable + 19;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function0<Unit> $runnable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Function0<Unit> function0, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$runnable = function0;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onExtraCallbackWithResult) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 57;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = CircleHighlightV3.this.new onExtraCallbackWithResult(this.$runnable, access13800Var);
            int i2 = IAuthTabCallback + 97;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i4 = onNavigationEvent + 21;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 21;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 125;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(100L, this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            }
            if (CircleHighlightV3.IAuthTabCallbackDefault(CircleHighlightV3.this)) {
                this.$runnable.invoke();
                int i7 = onNavigationEvent + 29;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            } else {
                CircleHighlightV3.onExtraCallbackWithResult(CircleHighlightV3.this, this.$runnable);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean extraCallback() {
        boolean z;
        int i = 2 % 2;
        int i2 = ICustomTabsService + 7;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0 ? onTransact() == null : onTransact() == null) {
            setTargetViewX(asInterface().left);
            setTargetViewY(asInterface().top);
            return true;
        }
        View viewOnTransact = onTransact();
        if (viewOnTransact == null) {
            int i3 = ICustomTabsService + 37;
            isEngagementSignalsApiAvailable = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        int[] iArr = new int[2];
        viewOnTransact.getLocationOnScreen(iArr);
        float f = iArr[0];
        float f2 = iArr[1];
        if (IAuthTabCallback_Parcel() == f) {
            int i5 = isEngagementSignalsApiAvailable + 61;
            ICustomTabsService = i5 % 128;
            int i6 = i5 % 2;
            z = getInterfaceDescriptor() == f2;
        }
        setTargetViewX(f);
        setTargetViewY(f2);
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r0
      0x0028: PHI (r0v6 int) = (r0v5 int), (r0v24 int) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean onWarmupCompleted(CircleHighlightV3 circleHighlightV3, View view, MotionEvent motionEvent) {
        int action;
        View viewOnTransact;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 91;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            circleHighlightV3.getLocationOnScreen(new int[5]);
            action = motionEvent.getAction();
            if (action == 0) {
                boolean zOnExtraCallbackWithResult = circleHighlightV3.onExtraCallbackWithResult(circleHighlightV3.asInterface(), motionEvent.getX(), motionEvent.getY());
                circleHighlightV3.access100 = !zOnExtraCallbackWithResult;
                if (zOnExtraCallbackWithResult) {
                    int i3 = isEngagementSignalsApiAvailable + 13;
                    ICustomTabsService = i3 % 128;
                    if (i3 % 2 != 0) {
                        circleHighlightV3.onTransact();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    View viewOnTransact2 = circleHighlightV3.onTransact();
                    if (viewOnTransact2 != null) {
                        viewOnTransact2.setPressed(true);
                        viewOnTransact2.onTouchEvent(motionEvent);
                    } else {
                        circleHighlightV3.onWarmupCompleted();
                    }
                } else if (circleHighlightV3.onTransact == generateAppWithState.onNavigationEvent.WEAK) {
                    circleHighlightV3.onWarmupCompleted();
                }
            } else if (action != 1) {
                if (action == 3) {
                    int i4 = isEngagementSignalsApiAvailable + 1;
                    ICustomTabsService = i4 % 128;
                    int i5 = i4 % 2;
                    if (!circleHighlightV3.access100) {
                        View viewOnTransact3 = circleHighlightV3.onTransact();
                        if (viewOnTransact3 != null) {
                            viewOnTransact3.setPressed(false);
                            int i6 = ICustomTabsService + 87;
                            isEngagementSignalsApiAvailable = i6 % 128;
                            int i7 = i6 % 2;
                        }
                        View viewOnTransact4 = circleHighlightV3.onTransact();
                        if (viewOnTransact4 != null) {
                            viewOnTransact4.onTouchEvent(motionEvent);
                        }
                    }
                    circleHighlightV3.access100 = false;
                    circleHighlightV3.onWarmupCompleted();
                    int i8 = ICustomTabsService + 35;
                    isEngagementSignalsApiAvailable = i8 % 128;
                    int i9 = i8 % 2;
                }
            } else if (!circleHighlightV3.access100) {
                View viewOnTransact5 = circleHighlightV3.onTransact();
                if (viewOnTransact5 != null) {
                    viewOnTransact5.setPressed(false);
                }
                View viewOnTransact6 = circleHighlightV3.onTransact();
                if (viewOnTransact6 != null) {
                    viewOnTransact6.onTouchEvent(motionEvent);
                }
                if (circleHighlightV3.onExtraCallbackWithResult(circleHighlightV3.asInterface(), motionEvent.getX(), motionEvent.getY()) && (viewOnTransact = circleHighlightV3.onTransact()) != null) {
                    viewOnTransact.performClick();
                }
                circleHighlightV3.access100 = false;
                circleHighlightV3.onWarmupCompleted();
            }
        } else {
            circleHighlightV3.getLocationOnScreen(new int[2]);
            action = motionEvent.getAction();
            if (action != 0) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(final boolean z) {
        int i = 2 % 2;
        post(new Runnable() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda12
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 99;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                CircleHighlightV3 circleHighlightV3 = this.f$0;
                if (i4 == 0) {
                    CircleHighlightV3.IAuthTabCallback(circleHighlightV3, z);
                } else {
                    CircleHighlightV3.IAuthTabCallback(circleHighlightV3, z);
                    int i5 = 54 / 0;
                }
            }
        });
        int i2 = ICustomTabsService + 109;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View, im.toss.uikit.widget.tooltip.CircleHighlightV3] */
    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        int iWidth;
        float y;
        float y2;
        Boolean bool;
        Integer num;
        int i;
        int i2;
        final CircleHighlightV3 circleHighlightV3;
        boolean z;
        Object obj;
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted;
        int i3;
        float f;
        CircleHighlightV3 circleHighlightV32 = (CircleHighlightV3) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i4 = 2 % 2;
        Float fValueOf = Float.valueOf(0.8f);
        Float fValueOf2 = Float.valueOf(1.0f);
        Float fValueOf3 = Float.valueOf(0.0f);
        View viewOnTransact = circleHighlightV32.onTransact();
        if (viewOnTransact != null) {
            iWidth = viewOnTransact.getWidth();
            int i5 = ICustomTabsService + 29;
            isEngagementSignalsApiAvailable = i5 % 128;
            int i6 = i5 % 2;
        } else {
            iWidth = circleHighlightV32.asInterface().width();
        }
        int i7 = iWidth;
        View viewOnTransact2 = circleHighlightV32.onTransact();
        circleHighlightV32.onExtraCallback(i7, viewOnTransact2 != null ? viewOnTransact2.getHeight() : circleHighlightV32.asInterface().height());
        circleHighlightV32.readTypedObject();
        generateAppWithState.onWarmupCompleted onwarmupcompleted = circleHighlightV32.extraCallback;
        int[] iArr = onWarmupCompleted.IAuthTabCallback;
        int i8 = iArr[onwarmupcompleted.ordinal()];
        if (i8 == 1) {
            y = circleHighlightV32.ICustomTabsCallback.getY() - 20.0f;
            int i9 = ICustomTabsService + 97;
            isEngagementSignalsApiAvailable = i9 % 128;
            int i10 = i9 % 2;
        } else {
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            y = circleHighlightV32.ICustomTabsCallback.getY() + 20.0f;
        }
        int i11 = iArr[circleHighlightV32.extraCallback.ordinal()];
        if (i11 != 1) {
            int i12 = ICustomTabsService + 3;
            isEngagementSignalsApiAvailable = i12 % 128;
            if (i12 % 2 != 0 ? i11 != 2 : i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            y2 = circleHighlightV32.onWarmupCompleted.getY() + 20.0f;
        } else {
            y2 = circleHighlightV32.onWarmupCompleted.getY() - 20.0f;
        }
        float f2 = y2;
        if (zBooleanValue) {
            pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
            BaseTextView baseTextView = circleHighlightV32.ICustomTabsCallback;
            AppLovinSdkSettings interfaceDescriptor = isMuted.getInterfaceDescriptor(isMuted.onExtraCallback(isMuted.onTransact(new AppLovinSdkSettings(), fValueOf, Float.valueOf(1.05f), new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda15
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = IAuthTabCallback + 29;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                    Object[] objArr2 = {(attachAppLovinSdk) obj2};
                    int iOnExtraCallback = getKekid.onExtraCallback();
                    int iOnExtraCallback2 = getKekid.onExtraCallback();
                    int iOnExtraCallback3 = getKekid.onExtraCallback();
                    int iOnExtraCallback4 = getKekid.onExtraCallback();
                    if (i15 != 0) {
                        return (Unit) CircleHighlightV3.onExtraCallbackWithResult(iOnExtraCallback3, -1708201500, objArr2, 1708201504, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback4);
                    }
                    throw null;
                }
            }), fValueOf3, fValueOf2, new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda24
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onWarmupCompleted + 79;
                    onExtraCallbackWithResult = i14 % 128;
                    attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj2;
                    if (i14 % 2 != 0) {
                        return CircleHighlightV3.asBinder(attachapplovinsdk);
                    }
                    CircleHighlightV3.asBinder(attachapplovinsdk);
                    throw null;
                }
            }), Float.valueOf(y), Float.valueOf(circleHighlightV32.ICustomTabsCallback.getY()), new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda25
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallback + 23;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                    Unit unitIAuthTabCallbackStubProxy = CircleHighlightV3.IAuthTabCallbackStubProxy((attachAppLovinSdk) obj2);
                    if (i15 == 0) {
                        int i16 = 10 / 0;
                    }
                    return unitIAuthTabCallbackStubProxy;
                }
            });
            Boolean bool2 = Boolean.FALSE;
            ?? r0 = circleHighlightV32;
            Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{baseTextView, interfaceDescriptor, 0, null, 0, null, null, bool2, Integer.valueOf(Imgproc.COLOR_BGR2YUV_YVYU), 0L, false, 1660, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            bool = false;
            Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{((CircleHighlightV3) r0).onWarmupCompleted, isMuted.getInterfaceDescriptor(isMuted.onExtraCallback(isMuted.onTransact(new AppLovinSdkSettings(), fValueOf, Float.valueOf(1.1f), new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda26
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onNavigationEvent + 21;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    Unit unitIAuthTabCallback = CircleHighlightV3.IAuthTabCallback((attachAppLovinSdk) obj2);
                    if (i15 == 0) {
                        int i16 = 40 / 0;
                    }
                    return unitIAuthTabCallback;
                }
            }), fValueOf3, fValueOf2, new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda27
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = IAuthTabCallback + 101;
                    onExtraCallbackWithResult = i14 % 128;
                    attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj2;
                    if (i14 % 2 != 0) {
                        return CircleHighlightV3.IAuthTabCallbackDefault(attachapplovinsdk);
                    }
                    CircleHighlightV3.IAuthTabCallbackDefault(attachapplovinsdk);
                    throw null;
                }
            }), Float.valueOf(f2), Float.valueOf(((CircleHighlightV3) r0).onWarmupCompleted.getY()), new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda28
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallbackWithResult + 73;
                    onExtraCallback = i14 % 128;
                    attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj2;
                    if (i14 % 2 == 0) {
                        CircleHighlightV3.IAuthTabCallback_Parcel(attachapplovinsdk);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    Unit unitIAuthTabCallback_Parcel = CircleHighlightV3.IAuthTabCallback_Parcel(attachapplovinsdk);
                    int i15 = onExtraCallbackWithResult + 47;
                    onExtraCallback = i15 % 128;
                    int i16 = i15 % 2;
                    return unitIAuthTabCallback_Parcel;
                }
            }), 0, null, 0, null, null, bool2, 200, 0L, false, 1660, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            Rally rallyIAuthTabCallback = RallysKt.IAuthTabCallback(new onNavigationEvent(), isMuted.onExtraCallback(isMuted.onTransact(new AppLovinSdkSettings(), Float.valueOf(r0.onExtraCallbackWithResult().getScaleX()), Float.valueOf((((CircleHighlightV3) r0).IAuthTabCallbackStub.heightPixels * 3.0f) / Math.max(1.0f, i7 + ((CircleHighlightV3) r0).onExtraCallback)), new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda29
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = IAuthTabCallback + 57;
                    onWarmupCompleted = i14 % 128;
                    attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj2;
                    if (i14 % 2 == 0) {
                        return CircleHighlightV3.ICustomTabsCallback(attachapplovinsdk);
                    }
                    CircleHighlightV3.ICustomTabsCallback(attachapplovinsdk);
                    throw null;
                }
            }), Float.valueOf(0.85f), fValueOf3, new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda30
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallbackWithResult + 65;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    Unit unitOnExtraCallback = CircleHighlightV3.onExtraCallback((attachAppLovinSdk) obj2);
                    if (i15 != 0) {
                        int i16 = 13 / 0;
                    }
                    return unitOnExtraCallback;
                }
            }), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool2, 0, 0L, false, 1916, (Object) null);
            Rally rally3 = (Rally) RallysKt.onWarmupCompleted(new Object[]{((CircleHighlightV3) r0).onWarmupCompleted, isMuted.getInterfaceDescriptor(isMuted.onExtraCallback(isMuted.onTransact(new AppLovinSdkSettings(), fValueOf, fValueOf2, new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda31
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallbackWithResult + 49;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    Unit unitOnTransact = CircleHighlightV3.onTransact((attachAppLovinSdk) obj2);
                    int i16 = onExtraCallback + 29;
                    onExtraCallbackWithResult = i16 % 128;
                    if (i16 % 2 != 0) {
                        return unitOnTransact;
                    }
                    throw null;
                }
            }), fValueOf3, fValueOf2, new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda32
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallbackWithResult + 41;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    Unit unitExtraCallback = CircleHighlightV3.extraCallback((attachAppLovinSdk) obj2);
                    int i16 = onExtraCallback + 75;
                    onExtraCallbackWithResult = i16 % 128;
                    if (i16 % 2 != 0) {
                        return unitExtraCallback;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            }), Float.valueOf(f2), Float.valueOf(((CircleHighlightV3) r0).onWarmupCompleted.getY()), new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda16
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onWarmupCompleted + 45;
                    onExtraCallback = i14 % 128;
                    attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj2;
                    if (i14 % 2 == 0) {
                        return CircleHighlightV3.access100(attachapplovinsdk);
                    }
                    CircleHighlightV3.access100(attachapplovinsdk);
                    throw null;
                }
            }), 0, null, 0, null, null, bool2, 200, 0L, null, 1660, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            Rally rally4 = (Rally) RallysKt.onWarmupCompleted(new Object[]{((CircleHighlightV3) r0).ICustomTabsCallbackDefault, isMuted.onNavigationEvent((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(Address.onNavigationEvent.asBinder()), 1000}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), fValueOf3, fValueOf2, (Function1) null, 4, (Object) null), 0, null, 0, null, null, bool2, 0, 0L, null, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            TdsImageView tdsImageView = ((CircleHighlightV3) r0).asBinder;
            AppLovinSdkSettings appLovinSdkSettingsOnTransact = isMuted.onTransact(new AppLovinSdkSettings(), fValueOf3, fValueOf2, new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda17
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = IAuthTabCallback + 111;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                    Unit unitOnWarmupCompleted = CircleHighlightV3.onWarmupCompleted((attachAppLovinSdk) obj2);
                    int i16 = onNavigationEvent + 71;
                    IAuthTabCallback = i16 % 128;
                    int i17 = i16 % 2;
                    return unitOnWarmupCompleted;
                }
            });
            Context context = r0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
                int i13 = isEngagementSignalsApiAvailable + Imgproc.COLOR_YUV2RGBA_YVYU;
                ICustomTabsService = i13 % 128;
                i3 = 2;
                if (i13 % 2 != 0) {
                    throw null;
                }
                f = 0.4f;
            } else {
                i3 = 2;
                f = 0.25f;
            }
            num = 0;
            i2 = i3;
            Rally rally5 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView, isMuted.onExtraCallback(appLovinSdkSettingsOnTransact, fValueOf3, Float.valueOf(f), new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda18
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i14 = 2 % 2;
                    int i15 = onNavigationEvent + 79;
                    onWarmupCompleted = i15 % 128;
                    int i16 = i15 % 2;
                    Unit unitWriteTypedObject = CircleHighlightV3.writeTypedObject((attachAppLovinSdk) obj2);
                    int i17 = onWarmupCompleted + 9;
                    onNavigationEvent = i17 % 128;
                    if (i17 % 2 != 0) {
                        int i18 = 6 / 0;
                    }
                    return unitWriteTypedObject;
                }
            }), 0, null, 0, null, null, bool2, 0, 0L, null, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            Rally[] rallyArr = new Rally[6];
            rallyArr[0] = rally;
            i = 1;
            rallyArr[1] = rally2;
            rallyArr[i2] = rallyIAuthTabCallback;
            rallyArr[3] = rally3;
            rallyArr[4] = rally4;
            rallyArr[5] = rally5;
            r0.setStartTimeline(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsKt.listOf((Object[]) rallyArr), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool2, 0, 0L, false, 3833, (Object) null));
            circleHighlightV3 = r0;
        } else {
            CircleHighlightV3 circleHighlightV33 = circleHighlightV32;
            bool = false;
            num = 0;
            i = 1;
            i2 = 2;
            circleHighlightV33.setStartTimeline(null);
            circleHighlightV3 = circleHighlightV33;
        }
        pxToDp.IAuthTabCallback iAuthTabCallback2 = pxToDp.IAuthTabCallback.onExtraCallback;
        Integer numAsBinder = circleHighlightV3.asBinder();
        int iIntValue = numAsBinder != null ? numAsBinder.intValue() : -1;
        getExtraParameters getextraparameters = getExtraParameters.Normal;
        TdsImageView tdsImageView2 = circleHighlightV3.asBinder;
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = isMuted.onExtraCallbackWithResult(isMuted.onExtraCallbackWithResult(new AppLovinSdkSettings(), new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda19
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i14 = 2 % 2;
                int i15 = onExtraCallbackWithResult + 35;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                Unit unitOnNavigationEvent = CircleHighlightV3.onNavigationEvent((AppLovinSdkSettings) obj2);
                int i17 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                onExtraCallbackWithResult = i17 % 128;
                int i18 = i17 % 2;
                return unitOnNavigationEvent;
            }
        }), new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda20
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i14 = 2 % 2;
                int i15 = onNavigationEvent + 99;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                Unit unitOnNavigationEvent = CircleHighlightV3.onNavigationEvent(this.f$0, (AppLovinSdkSettings) obj2);
                int i17 = onNavigationEvent + 31;
                onWarmupCompleted = i17 % 128;
                int i18 = i17 % 2;
                return unitOnNavigationEvent;
            }
        });
        Boolean bool3 = Boolean.TRUE;
        Integer num2 = num;
        Integer num3 = num;
        Boolean bool4 = bool;
        int i14 = i;
        Rally rally6 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView2, appLovinSdkSettingsOnExtraCallbackWithResult, num, null, num2, null, null, bool3, num3, 0L, bool4, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        Rally rally7 = (Rally) RallysKt.onWarmupCompleted(new Object[]{circleHighlightV3.ICustomTabsCallback, isMuted.onExtraCallbackWithResult(new AppLovinSdkSettings(), new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda21
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i15 = 2 % 2;
                int i16 = onNavigationEvent + 109;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                Unit unitOnWarmupCompleted = CircleHighlightV3.onWarmupCompleted((AppLovinSdkSettings) obj2);
                if (i17 == 0) {
                    int i18 = 16 / 0;
                }
                return unitOnWarmupCompleted;
            }
        }), num, null, num2, null, null, bool3, num3, 0L, bool4, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        Rally[] rallyArr2 = new Rally[i2];
        rallyArr2[0] = rally6;
        rallyArr2[i14] = rally7;
        circleHighlightV3.IAuthTabCallback_Parcel = RallysKt.onWarmupCompleted((View) null, iAuthTabCallback2, CollectionsKt__CollectionsKt.listOf((Object[]) rallyArr2), iIntValue, getextraparameters, 0, (Interpolator) null, (Integer) null, (Boolean) null, 1150, 0L, false, 3553, (Object) null);
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallbackStub = circleHighlightV3.IAuthTabCallbackStub();
        if (runonuithreaddelayedIAuthTabCallbackStub != null) {
            obj = null;
            runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallbackDefault = runOnUiThreadDelayed.IAuthTabCallbackDefault(runonuithreaddelayedIAuthTabCallbackStub, (Object) null, new Function0() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda22
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i15 = 2 % 2;
                    int i16 = IAuthTabCallback + 111;
                    onExtraCallbackWithResult = i16 % 128;
                    int i17 = i16 % 2;
                    Unit unitIAuthTabCallback = CircleHighlightV3.IAuthTabCallback(this.f$0);
                    int i18 = IAuthTabCallback + 107;
                    onExtraCallbackWithResult = i18 % 128;
                    int i19 = i18 % 2;
                    return unitIAuthTabCallback;
                }
            }, i14, (Object) null);
            z = false;
            if (runonuithreaddelayedIAuthTabCallbackDefault != null) {
                isFireOS.onExtraCallbackWithResult(runonuithreaddelayedIAuthTabCallbackDefault, false, i14, (Object) null);
            }
        } else {
            z = false;
            obj = null;
        }
        runOnUiThreadDelayed runonuithreaddelayed = circleHighlightV3.IAuthTabCallback_Parcel;
        if (runonuithreaddelayed != null && (runonuithreaddelayedOnWarmupCompleted = runOnUiThreadDelayed.onWarmupCompleted(runonuithreaddelayed, obj, new Function0() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda23
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i15 = 2 % 2;
                int i16 = onNavigationEvent + 37;
                IAuthTabCallback = i16 % 128;
                int i17 = i16 % 2;
                Unit unitOnExtraCallback = CircleHighlightV3.onExtraCallback(this.f$0);
                int i18 = IAuthTabCallback + 43;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
                return unitOnExtraCallback;
            }
        }, i14, obj)) != null) {
            isFireOS.onExtraCallbackWithResult(runonuithreaddelayedOnWarmupCompleted, z, i14, obj);
        }
        return obj;
    }

    private static final Unit onMessageChannelReady(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + Imgproc.COLOR_YUV2RGB_YVYU;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(1000);
        attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 9;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit ICustomTabsService(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 81;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsService + 119;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit mayLaunchUrl(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 111;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsService + 105;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit ICustomTabsCallback_Parcel(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = ICustomTabsService + 71;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 25298;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 1000;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsService + 25;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
        return unit;
    }

    private static final Unit extraCommand(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 9;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsService + 3;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class onNavigationEvent implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public static final /* synthetic */ class onWarmupCompleted {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            public static final /* synthetic */ int[] onWarmupCompleted;

            static {
                int[] iArr = new int[generateAppWithState.onNavigationEvent.values().length];
                try {
                    iArr[generateAppWithState.onNavigationEvent.WEAK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[generateAppWithState.onNavigationEvent.STRONG.ordinal()] = 2;
                    int i = onExtraCallbackWithResult + 83;
                    onExtraCallback = i % 128;
                    int i2 = i % 2;
                    int i3 = 2 % 2;
                } catch (NoSuchFieldError unused2) {
                }
                onWarmupCompleted = iArr;
                int i4 = onExtraCallbackWithResult + 81;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        onNavigationEvent() {
        }

        public /* bridge */ void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallback(f);
            if (i3 == 0) {
                int i4 = 39 / 0;
            }
        }

        public /* bridge */ void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(f);
            int i4 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* bridge */ void onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(obj);
            if (i3 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i4 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(f);
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
        
            r4 = im.toss.uikit.widget.tooltip.CircleHighlightV3.onNavigationEvent.onExtraCallbackWithResult + 31;
            im.toss.uikit.widget.tooltip.CircleHighlightV3.onNavigationEvent.onWarmupCompleted = r4 % 128;
            r4 = r4 % 2;
            r3.onExtraCallback.onExtraCallbackWithResult().setAlpha(0.85f);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
        
            throw new kotlin.NoWhenBranchMatchedException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            r3.onExtraCallback.onExtraCallbackWithResult().setAlpha(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        
            if (r1 != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
        
            if (r1 != 1) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
        
            if (r1 != 2) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onNavigationEvent(float f) {
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                i = onWarmupCompleted.onWarmupCompleted[CircleHighlightV3.onTransact(CircleHighlightV3.this).ordinal()];
            } else {
                i = onWarmupCompleted.onWarmupCompleted[CircleHighlightV3.onTransact(CircleHighlightV3.this).ordinal()];
            }
        }

        public void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            CircleHighlightV3.this.onExtraCallbackWithResult().setScaleX(f);
            CircleHighlightV3.this.onExtraCallbackWithResult().setScaleY(f);
            int i4 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 85;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.onExtraCallback(70);
        attachapplovinsdk.IAuthTabCallback(1700);
        attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 49;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit newSessionWithExtras(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 97;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.onExtraCallback(1200);
        attachapplovinsdk.IAuthTabCallback(1900);
        attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsService + 3;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit postMessage(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 71;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 21;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit newSession(attachAppLovinSdk attachapplovinsdk) {
        Interpolator interpolatorAsBinder;
        int i = 2 % 2;
        int i2 = ICustomTabsService + 31;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(5305);
            interpolatorAsBinder = Address.onNavigationEvent.asBinder();
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(1000);
            interpolatorAsBinder = Address.onNavigationEvent.asBinder();
        }
        attachapplovinsdk.IAuthTabCallback(interpolatorAsBinder);
        Unit unit = Unit.INSTANCE;
        int i3 = isEngagementSignalsApiAvailable + 13;
        ICustomTabsService = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 95 / 0;
        }
        return unit;
    }

    private static final Unit onMinimized(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 97;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit onActivityLayout(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 109;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
        attachapplovinsdk.IAuthTabCallback(1150);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsService + 71;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 9;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
        int i3 = 27 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit onActivityResized(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 55;
        ICustomTabsService = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            i = 2407;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            i = 1540;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        attachapplovinsdk.onExtraCallback(0);
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 13;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        int i;
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 93;
        ICustomTabsService = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            attachapplovinsdk.IAuthTabCallback(23449);
            i = 12359;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            attachapplovinsdk.IAuthTabCallback(1100);
            i = 1250;
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsService + 37;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.6f);
        isMuted.onTransact(appLovinSdkSettings, fValueOf, fValueOf2, new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
                IAuthTabCallback = i3 % 128;
                Object obj2 = null;
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                if (i3 % 2 == 0) {
                    CircleHighlightV3.onExtraCallbackWithResult(attachapplovinsdk);
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = CircleHighlightV3.onExtraCallbackWithResult(attachapplovinsdk);
                int i4 = IAuthTabCallback + 69;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                obj2.hashCode();
                throw null;
            }
        });
        isMuted.onTransact(appLovinSdkSettings, fValueOf2, fValueOf, new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 39;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit interfaceDescriptor = CircleHighlightV3.getInterfaceDescriptor((attachAppLovinSdk) obj);
                int i5 = IAuthTabCallback + 75;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return interfaceDescriptor;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsService + 47;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onUnminimized(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 45;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
        Unit unit2 = Unit.INSTANCE;
        int i3 = isEngagementSignalsApiAvailable + 83;
        ICustomTabsService = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    private static final Unit onRelationshipValidationResult(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = ICustomTabsService + 11;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            attachapplovinsdk.IAuthTabCallback(6736);
            i = 25074;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            attachapplovinsdk.IAuthTabCallback(1090);
            i = 1250;
        }
        attachapplovinsdk.onExtraCallback(i);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(CircleHighlightV3 circleHighlightV3, AppLovinSdkSettings appLovinSdkSettings) {
        float f;
        int i = 2 % 2;
        int i2 = ICustomTabsService + 55;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
            Context context = circleHighlightV3.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            ((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Context context2 = circleHighlightV3.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        float f2 = 0.25f;
        float f3 = !(((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context2}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue() ^ true) ? 0.4f : 0.25f;
        Context context3 = circleHighlightV3.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context3}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
            int i3 = isEngagementSignalsApiAvailable + 37;
            ICustomTabsService = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            f = 0.3f;
        } else {
            f = 0.15f;
        }
        isMuted.onExtraCallback(appLovinSdkSettings, Float.valueOf(f3), Float.valueOf(f), new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda10
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 21;
                onExtraCallback = i5 % 128;
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj2;
                if (i5 % 2 != 0) {
                    CircleHighlightV3.asInterface(attachapplovinsdk);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Unit unitAsInterface = CircleHighlightV3.asInterface(attachapplovinsdk);
                int i6 = onWarmupCompleted + 29;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 42 / 0;
                }
                return unitAsInterface;
            }
        });
        Context context4 = circleHighlightV3.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        float f4 = ((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context4}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue() ? 0.3f : 0.15f;
        Context context5 = circleHighlightV3.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context5}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
            int i4 = ICustomTabsService + 75;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            f2 = 0.4f;
        }
        isMuted.onExtraCallback(appLovinSdkSettings, Float.valueOf(f4), Float.valueOf(f2), new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda11
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i6 = 2 % 2;
                int i7 = onExtraCallback + 37;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                Object[] objArr = {(attachAppLovinSdk) obj2};
                int iOnExtraCallback = getKekid.onExtraCallback();
                int iOnExtraCallback2 = getKekid.onExtraCallback();
                int iOnExtraCallback3 = getKekid.onExtraCallback();
                int iOnExtraCallback4 = getKekid.onExtraCallback();
                if (i8 != 0) {
                    return (Unit) CircleHighlightV3.onExtraCallbackWithResult(iOnExtraCallback3, 1268141616, objArr, -1268141605, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback4);
                }
                Unit unit = (Unit) CircleHighlightV3.onExtraCallbackWithResult(iOnExtraCallback3, 1268141616, objArr, -1268141605, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback4);
                int i9 = 61 / 0;
                return unit;
            }
        });
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallbackStub(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 59;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
        attachapplovinsdk.IAuthTabCallback(1660);
        attachapplovinsdk.onExtraCallback(0);
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 81;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ICustomTabsCallbackStubProxy(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 67;
        ICustomTabsService = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            attachapplovinsdk.IAuthTabCallback(8919);
            i = 21795;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            attachapplovinsdk.IAuthTabCallback(1450);
            i = 1250;
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 45;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Float fValueOf = Float.valueOf(1.05f);
        Float fValueOf2 = Float.valueOf(0.95f);
        isMuted.onTransact(appLovinSdkSettings, fValueOf, fValueOf2, new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 123;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitExtraCallbackWithResult = CircleHighlightV3.extraCallbackWithResult((attachAppLovinSdk) obj);
                if (i4 != 0) {
                    int i5 = 81 / 0;
                }
                return unitExtraCallbackWithResult;
            }
        });
        isMuted.onTransact(appLovinSdkSettings, fValueOf2, fValueOf, new Function1() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 47;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int iOnExtraCallback = getKekid.onExtraCallback();
                int iOnExtraCallback2 = getKekid.onExtraCallback();
                Unit unit = (Unit) CircleHighlightV3.onExtraCallbackWithResult(getKekid.onExtraCallback(), 1516799823, new Object[]{(attachAppLovinSdk) obj}, -1516799813, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
                int i5 = onExtraCallback + 109;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 26 / 0;
                }
                return unit;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsService + 21;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        int i;
        CircleHighlightV3 circleHighlightV3 = (CircleHighlightV3) objArr[0];
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 43;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        circleHighlightV3.asBinder.setVisibility(0);
        circleHighlightV3.ICustomTabsCallback.setVisibility(0);
        TdsImageView tdsImageView = circleHighlightV3.onWarmupCompleted;
        if (circleHighlightV3.onNavigationEvent) {
            int i5 = ICustomTabsService + 61;
            isEngagementSignalsApiAvailable = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        } else {
            i = 8;
        }
        tdsImageView.setVisibility(i);
        circleHighlightV3.ICustomTabsCallbackDefault.setVisibility(0);
        circleHighlightV3.onExtraCallbackWithResult().setVisibility(0);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback_Parcel(CircleHighlightV3 circleHighlightV3) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 23;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        circleHighlightV3.onExtraCallbackWithResult(getAppDataMetadata.REPEAT_FINISHED);
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 19;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void readTypedObject() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 69;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        if (onTransact() != null) {
            View viewOnTransact = onTransact();
            if (viewOnTransact == null) {
                return;
            }
            viewOnTransact.setPivotX(IAuthTabCallback_Parcel() + (viewOnTransact.getWidth() / 2.0f));
            viewOnTransact.setPivotY(getInterfaceDescriptor() + (viewOnTransact.getHeight() / 2.0f));
            this.asBinder.setX(viewOnTransact.getPivotX() - (this.asBinder.getWidth() / 2.0f));
            this.asBinder.setY(viewOnTransact.getPivotY() - (this.asBinder.getHeight() / 2.0f));
            onExtraCallbackWithResult().setX(viewOnTransact.getPivotX() - (onExtraCallbackWithResult().getWidth() / 2.0f));
            onExtraCallbackWithResult().setY(viewOnTransact.getPivotY() - (onExtraCallbackWithResult().getHeight() / 2.0f));
            int i4 = ICustomTabsService + 97;
            isEngagementSignalsApiAvailable = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 76 / 0;
                return;
            }
            return;
        }
        Rect rectAsInterface = asInterface();
        this.asBinder.setX((rectAsInterface.left + (rectAsInterface.width() / 2.0f)) - (this.asBinder.getWidth() / 2.0f));
        this.asBinder.setY((rectAsInterface.top + (rectAsInterface.height() / 2.0f)) - (this.asBinder.getHeight() / 2.0f));
        onExtraCallbackWithResult().setX((rectAsInterface.left + (rectAsInterface.width() / 2.0f)) - (onExtraCallbackWithResult().getWidth() / 2.0f));
        onExtraCallbackWithResult().setY((rectAsInterface.top + (rectAsInterface.height() / 2.0f)) - (onExtraCallbackWithResult().getHeight() / 2.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(int i, int i2) {
        float fOnExtraCallbackWithResult;
        int iAbs;
        int i3 = 2 % 2;
        int i4 = ICustomTabsService + 109;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        isBackgroundWorkRestricted.onExtraCallbackWithResult(this.ICustomTabsCallback);
        this.readTypedObject = this.ICustomTabsCallback.getHeight();
        this.writeTypedObject = this.ICustomTabsCallback.getWidth();
        int width = this.ICustomTabsCallback.getWidth();
        int i6 = onWarmupCompleted.onWarmupCompleted[onNavigationEvent().ordinal()];
        int i7 = 0;
        float fCoerceAtLeast = 0.0f;
        if (i6 == 1) {
            this.ICustomTabsCallback.setTextAlignment(2);
            this.ICustomTabsCallback.setGravity(8388611);
            StaticLayout staticLayoutIAuthTabCallback = AppDataCollectorCompanion.IAuthTabCallback(this.ICustomTabsCallback, Layout.Alignment.ALIGN_NORMAL, TextUtils.TruncateAt.START, null, 8, null);
            if (staticLayoutIAuthTabCallback != null) {
                int lineCount = staticLayoutIAuthTabCallback.getLineCount();
                int i8 = ICustomTabsService + 125;
                isEngagementSignalsApiAvailable = i8 % 128;
                int i9 = i8 % 2;
                while (i7 < lineCount) {
                    int i10 = ICustomTabsService + 87;
                    isEngagementSignalsApiAvailable = i10 % 128;
                    if (i10 % 2 == 0) {
                        fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(fCoerceAtLeast, staticLayoutIAuthTabCallback.getLineWidth(i7));
                        i7 += 120;
                    } else {
                        fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(fCoerceAtLeast, staticLayoutIAuthTabCallback.getLineWidth(i7));
                        i7++;
                    }
                }
                this.writeTypedObject = (int) fCoerceAtLeast;
                this.readTypedObject = staticLayoutIAuthTabCallback.getHeight();
            }
        } else if (i6 == 2) {
            this.ICustomTabsCallback.setTextAlignment(4);
            this.ICustomTabsCallback.setGravity(17);
            int iOnExtraCallbackWithResult = (this.onExtraCallback << 1) + i + setTagsokhttp.onExtraCallbackWithResult(this, 50);
            float fIAuthTabCallback_Parcel = (IAuthTabCallback_Parcel() - this.onExtraCallback) - setTagsokhttp.onExtraCallbackWithResult(this, 25);
            if (fIAuthTabCallback_Parcel < 0.0f) {
                iAbs = iOnExtraCallbackWithResult - Math.abs((int) fIAuthTabCallback_Parcel);
            } else {
                fCoerceAtLeast = fIAuthTabCallback_Parcel;
                iAbs = iOnExtraCallbackWithResult;
            }
            float f = iAbs + fCoerceAtLeast;
            float f2 = this.IAuthTabCallbackStub.widthPixels;
            if (f > f2) {
                int i11 = ICustomTabsService + 7;
                isEngagementSignalsApiAvailable = i11 % 128;
                int i12 = i11 % 2;
                iAbs = (int) (f2 - fCoerceAtLeast);
            }
            BaseTextView baseTextView = this.ICustomTabsCallback;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
            StaticLayout staticLayoutOnExtraCallback = AppDataCollectorCompanion.onExtraCallback(baseTextView, alignment, truncateAt, Integer.valueOf(iAbs));
            StaticLayout staticLayoutOnExtraCallback2 = AppDataCollectorCompanion.onExtraCallback(this.ICustomTabsCallback, alignment, truncateAt, Integer.valueOf(this.IAuthTabCallbackStub.widthPixels));
            if (staticLayoutOnExtraCallback != null) {
                if (staticLayoutOnExtraCallback.getLineCount() >= 4) {
                    this.ICustomTabsCallback.setMaxWidth(this.IAuthTabCallbackStub.widthPixels);
                    width = this.IAuthTabCallbackStub.widthPixels;
                    this.writeTypedObject = width;
                    this.readTypedObject = staticLayoutOnExtraCallback2 != null ? staticLayoutOnExtraCallback2.getHeight() : staticLayoutOnExtraCallback.getHeight();
                    BaseTextView baseTextView2 = this.ICustomTabsCallback;
                    ViewGroup.LayoutParams layoutParams = baseTextView2.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.width = this.IAuthTabCallbackStub.widthPixels;
                    baseTextView2.setLayoutParams(layoutParams);
                } else {
                    this.writeTypedObject = iAbs;
                    this.readTypedObject = staticLayoutOnExtraCallback.getHeight();
                    this.ICustomTabsCallback.setX(fCoerceAtLeast);
                    BaseTextView baseTextView3 = this.ICustomTabsCallback;
                    ViewGroup.LayoutParams layoutParams2 = baseTextView3.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams2.width = this.writeTypedObject;
                    baseTextView3.setLayoutParams(layoutParams2);
                    width = iOnExtraCallbackWithResult;
                }
            }
        } else {
            if (i6 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.ICustomTabsCallback.setTextAlignment(3);
            this.ICustomTabsCallback.setGravity(8388613);
            StaticLayout staticLayoutIAuthTabCallback2 = AppDataCollectorCompanion.IAuthTabCallback(this.ICustomTabsCallback, Layout.Alignment.ALIGN_OPPOSITE, TextUtils.TruncateAt.END, null, 8, null);
            if (staticLayoutIAuthTabCallback2 != null) {
                int i13 = isEngagementSignalsApiAvailable + 119;
                ICustomTabsService = i13 % 128;
                int i14 = i13 % 2;
                int lineCount2 = staticLayoutIAuthTabCallback2.getLineCount();
                while (i7 < lineCount2) {
                    int i15 = isEngagementSignalsApiAvailable + 75;
                    ICustomTabsService = i15 % 128;
                    if (i15 % 2 != 0) {
                        fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(fCoerceAtLeast, staticLayoutIAuthTabCallback2.getLineWidth(i7));
                        i7 += 64;
                    } else {
                        fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(fCoerceAtLeast, staticLayoutIAuthTabCallback2.getLineWidth(i7));
                        i7++;
                    }
                }
                this.writeTypedObject = (int) fCoerceAtLeast;
                this.readTypedObject = staticLayoutIAuthTabCallback2.getHeight();
            }
        }
        int i16 = onWarmupCompleted.IAuthTabCallback[this.extraCallback.ordinal()];
        if (i16 == 1) {
            this.ICustomTabsCallback.setY(getInterfaceDescriptor() + (i2 / 2) + (i / 2.0f) + this.onExtraCallback + setTagsokhttp.onExtraCallbackWithResult(this, 7));
            this.onWarmupCompleted.setY(this.ICustomTabsCallback.getY() + this.readTypedObject + setTagsokhttp.onExtraCallbackWithResult(this, 8));
        } else {
            if (i16 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i17 = isEngagementSignalsApiAvailable + Imgproc.COLOR_YUV2RGBA_YVYU;
            ICustomTabsService = i17 % 128;
            int i18 = i17 % 2;
            this.ICustomTabsCallback.setY(((((getInterfaceDescriptor() - this.readTypedObject) - (i / 2.0f)) + (i2 / 2)) - this.onExtraCallback) - setTagsokhttp.onExtraCallbackWithResult(this, 7));
            this.onWarmupCompleted.setY((this.ICustomTabsCallback.getY() - this.onWarmupCompleted.getHeight()) - setTagsokhttp.onExtraCallbackWithResult(this, 8));
        }
        this.onWarmupCompleted.setX((IAuthTabCallback_Parcel() + (i / 2)) - (this.onWarmupCompleted.getWidth() / 2));
        BaseTextView baseTextView4 = this.ICustomTabsCallback;
        int i19 = onWarmupCompleted.onWarmupCompleted[onNavigationEvent().ordinal()];
        if (i19 != 1) {
            int i20 = isEngagementSignalsApiAvailable + 47;
            int i21 = i20 % 128;
            ICustomTabsService = i21;
            if (i20 % 2 == 0 ? i19 == 2 : i19 == 4) {
                int i22 = i21 + 47;
                isEngagementSignalsApiAvailable = i22 % 128;
                int i23 = i22 % 2;
                fOnExtraCallbackWithResult = width / 2.0f;
            } else {
                int i24 = i21 + 37;
                isEngagementSignalsApiAvailable = i24 % 128;
                if (i24 % 2 != 0 ? i19 != 3 : i19 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                fOnExtraCallbackWithResult = (this.ICustomTabsCallback.getMaxWidth() - (this.writeTypedObject / 2.0f)) - setTagsokhttp.onExtraCallbackWithResult(this, 14);
            }
        } else {
            fOnExtraCallbackWithResult = (this.writeTypedObject / 2.0f) + setTagsokhttp.onExtraCallbackWithResult(this, 14);
        }
        baseTextView4.setPivotX(fOnExtraCallbackWithResult);
        this.ICustomTabsCallback.setPivotY(this.readTypedObject / 2.0f);
        AppDataCollectorCompanion.onExtraCallback(this.ICustomTabsCallbackDefault, TdsHighlightV3View.onExtraCallbackWithResult.EnumC0010onExtraCallbackWithResult.CIRCLE, this.ICustomTabsCallback, width, this.writeTypedObject, this.readTypedObject, onNavigationEvent(), this.extraCallback, this.onNavigationEvent, this.onWarmupCompleted, this.onTransact);
        onExtraCallback onextracallback = new onExtraCallback();
        this.onWarmupCompleted.setLayerType(1, null);
        this.onWarmupCompleted.setBackground(onextracallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[PHI: r1
      0x0029: PHI (r1v18 im.toss.tds.view.component.atom.image.TdsImageView) = (r1v5 im.toss.tds.view.component.atom.image.TdsImageView), (r1v20 im.toss.tds.view.component.atom.image.TdsImageView) binds: [B:8:0x0025, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
      0x0027: PHI (r1v6 im.toss.tds.view.component.atom.image.TdsImageView) = (r1v5 im.toss.tds.view.component.atom.image.TdsImageView), (r1v20 im.toss.tds.view.component.atom.image.TdsImageView) binds: [B:8:0x0025, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(CircleHighlightV3 circleHighlightV3, getAppDataMetadata getappdatametadata) {
        TdsImageView tdsImageView;
        int i;
        int i2 = 2 % 2;
        int i3 = ICustomTabsService + 101;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 == 0) {
            circleHighlightV3.ICustomTabsCallback.setVisibility(5);
            tdsImageView = circleHighlightV3.onWarmupCompleted;
            i = circleHighlightV3.onNavigationEvent ? 4 : 8;
        } else {
            circleHighlightV3.ICustomTabsCallback.setVisibility(4);
            tdsImageView = circleHighlightV3.onWarmupCompleted;
            if (circleHighlightV3.onNavigationEvent) {
            }
        }
        tdsImageView.setVisibility(i);
        circleHighlightV3.ICustomTabsCallbackDefault.setVisibility(4);
        circleHighlightV3.onExtraCallbackWithResult().setVisibility(4);
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallbackStub = circleHighlightV3.IAuthTabCallbackStub();
        if (runonuithreaddelayedIAuthTabCallbackStub != null) {
            runonuithreaddelayedIAuthTabCallbackStub.onNavigationEvent();
        }
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallback = circleHighlightV3.IAuthTabCallback();
        if (runonuithreaddelayedIAuthTabCallback != null) {
            runonuithreaddelayedIAuthTabCallback.onNavigationEvent();
        }
        runOnUiThreadDelayed runonuithreaddelayed = circleHighlightV3.IAuthTabCallback_Parcel;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
        }
        circleHighlightV3.setStartTimeline(null);
        circleHighlightV3.IAuthTabCallback_Parcel = null;
        circleHighlightV3.setEndTimeline(null);
        ViewGroup viewGroupOnExtraCallback = circleHighlightV3.onExtraCallback();
        if (viewGroupOnExtraCallback != null) {
            int i4 = isEngagementSignalsApiAvailable + 33;
            ICustomTabsService = i4 % 128;
            int i5 = i4 % 2;
            viewGroupOnExtraCallback.removeView(circleHighlightV3.IAuthTabCallbackDefault());
            int i6 = ICustomTabsService + 67;
            isEngagementSignalsApiAvailable = i6 % 128;
            int i7 = i6 % 2;
        }
        generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult = circleHighlightV3.onPostMessage;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onDismiss(getappdatametadata);
        }
        return Unit.INSTANCE;
    }

    private final void onExtraCallbackWithResult(final getAppDataMetadata getappdatametadata) {
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted;
        int i = 2 % 2;
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        deprecated_dns deprecated_dnsVarAsBinder = deprecated_certificatePinner.onExtraCallbackWithResult.asBinder();
        BaseTextView baseTextView = this.ICustomTabsCallback;
        AppLovinSdkSettings appLovinSdkSettings = new AppLovinSdkSettings();
        Float fValueOf = Float.valueOf(0.0f);
        setEndTimeline(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{(Rally) RallysKt.onWarmupCompleted(new Object[]{baseTextView, isMuted.onNavigationEvent(appLovinSdkSettings, (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.onWarmupCompleted, isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.ICustomTabsCallbackDefault, isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{onExtraCallbackWithResult(), isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.asBinder, isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, deprecated_dnsVarAsBinder, (Integer) null, Boolean.FALSE, 0, 0L, false, 3769, (Object) null));
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallback = IAuthTabCallback();
        if (runonuithreaddelayedIAuthTabCallback != null && (runonuithreaddelayedOnWarmupCompleted = runOnUiThreadDelayed.onWarmupCompleted(runonuithreaddelayedIAuthTabCallback, (Object) null, new Function0() { // from class: im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda34
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 83;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = CircleHighlightV3.onNavigationEvent(this.f$0, getappdatametadata);
                int i5 = onWarmupCompleted + 115;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }
        }, 1, (Object) null)) != null) {
            int i2 = ICustomTabsService + 83;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            isFireOS.onExtraCallbackWithResult(runonuithreaddelayedOnWarmupCompleted, false, 1, (Object) null);
        }
        int i4 = ICustomTabsService + 23;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dispatchDraw(@NotNull Canvas canvas) {
        int iWidth;
        float fIAuthTabCallback_Parcel;
        int i = 2 % 2;
        int i2 = ICustomTabsService + 51;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        View viewOnTransact = onTransact();
        if (viewOnTransact != null) {
            iWidth = viewOnTransact.getWidth();
            int i4 = ICustomTabsService + 71;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iWidth = asInterface().width();
        }
        int i6 = iWidth;
        View viewOnTransact2 = onTransact();
        int height = viewOnTransact2 != null ? viewOnTransact2.getHeight() : asInterface().height();
        if (onTransact() != null) {
            int i7 = ICustomTabsService + 41;
            isEngagementSignalsApiAvailable = i7 % 128;
            int i8 = i7 % 2;
            fIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        } else {
            fIAuthTabCallback_Parcel = asInterface().left;
        }
        float f = fIAuthTabCallback_Parcel;
        float interfaceDescriptor = onTransact() != null ? getInterfaceDescriptor() : asInterface().top;
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.IAuthTabCallbackStubProxy);
        super.dispatchDraw(canvas);
        Path path = new Path();
        float f2 = i6 / 2.0f;
        float f3 = f + f2;
        float f4 = interfaceDescriptor + (height / 2.0f);
        path.addCircle(f3, f4, this.onExtraCallback + f2, Path.Direction.CW);
        Paint paint = new Paint();
        paint.setShader(new RadialGradient(f3, f4, f2 + this.onExtraCallback, new int[]{-1, 0}, new float[]{0.7f, 1.0f}, Shader.TileMode.CLAMP));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setAntiAlias(true);
        canvas.drawPath(path, paint);
        canvas.restoreToCount(iSaveLayer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r2 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r2 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        r1 = (int) (((r7.onExtraCallback << 1) + r1) * 0.9f);
        r2.width = r1;
        r2.height = r1;
        r0.setLayoutParams(r2);
        r7.ICustomTabsCallbackDefault.setOnTouchListener(new im.toss.uikit.widget.tooltip.CircleHighlightV3$$ExternalSyntheticLambda9(r7));
        r0 = r7.onWarmupCompleted;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        if (r7.onNavigationEvent == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        r1 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        r0.setVisibility(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void access100() {
        int iWidth;
        View viewOnExtraCallbackWithResult;
        ViewGroup.LayoutParams layoutParams;
        int i = 2 % 2;
        int i2 = ICustomTabsService + 105;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        View viewOnTransact = onTransact();
        if (viewOnTransact != null) {
            int i4 = ICustomTabsService + 53;
            isEngagementSignalsApiAvailable = i4 % 128;
            if (i4 % 2 == 0) {
                viewOnTransact.getWidth();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iWidth = viewOnTransact.getWidth();
        } else {
            iWidth = asInterface().width();
        }
        TdsImageView tdsImageView = this.asBinder;
        ViewGroup.LayoutParams layoutParams2 = tdsImageView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i5 = isEngagementSignalsApiAvailable + 15;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = this.onExtraCallback;
            layoutParams2.width = (i6 * iWidth) / 2;
            layoutParams2.height = (i6 / iWidth) + 2;
            tdsImageView.setLayoutParams(layoutParams2);
            viewOnExtraCallbackWithResult = onExtraCallbackWithResult();
            layoutParams = viewOnExtraCallbackWithResult.getLayoutParams();
        } else {
            int i7 = ((this.onExtraCallback << 1) + iWidth) * 3;
            layoutParams2.width = i7;
            layoutParams2.height = i7;
            tdsImageView.setLayoutParams(layoutParams2);
            viewOnExtraCallbackWithResult = onExtraCallbackWithResult();
            layoutParams = viewOnExtraCallbackWithResult.getLayoutParams();
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(getKekid.onExtraCallback(), 1268141616, new Object[]{attachapplovinsdk}, -1268141605, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
    }

    public static boolean IAuthTabCallback(CircleHighlightV3 circleHighlightV3, View view, MotionEvent motionEvent) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return ((Boolean) onExtraCallbackWithResult(getKekid.onExtraCallback(), -2145079774, new Object[]{circleHighlightV3, view, motionEvent}, 2145079782, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback())).booleanValue();
    }

    public static /* synthetic */ void IAuthTabCallbackStub(CircleHighlightV3 circleHighlightV3) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        onExtraCallbackWithResult(getKekid.onExtraCallback(), 564430266, new Object[]{circleHighlightV3}, -564430257, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(getKekid.onExtraCallback(), -1708201500, new Object[]{attachapplovinsdk}, 1708201504, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
    }

    public static /* synthetic */ Unit access000(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(getKekid.onExtraCallback(), 1516799823, new Object[]{attachapplovinsdk}, -1516799813, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
    }

    private final void access000() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        onExtraCallbackWithResult(getKekid.onExtraCallback(), -417139152, new Object[]{this}, 417139157, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
    }

    private static final void onExtraCallback(View view, CircleHighlightV3 circleHighlightV3, ViewGroup viewGroup, ViewGroup viewGroup2, String str, generateAppWithState.onWarmupCompleted onwarmupcompleted, generateAppWithState.onExtraCallback onextracallback, generateAppWithState.onNavigationEvent onnavigationevent, int i, boolean z, Integer num, generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, long j) {
        Object[] objArr = {view, circleHighlightV3, viewGroup, viewGroup2, str, onwarmupcompleted, onextracallback, onnavigationevent, Integer.valueOf(i), Boolean.valueOf(z), num, onextracallbackwithresult, Long.valueOf(j)};
        int iOnExtraCallback = getKekid.onExtraCallback();
        onExtraCallbackWithResult(getKekid.onExtraCallback(), -1706534444, objArr, 1706534446, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback());
    }

    private static final Unit asInterface(CircleHighlightV3 circleHighlightV3) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(getKekid.onExtraCallback(), 1326374480, new Object[]{circleHighlightV3}, -1326374477, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
    }

    private static final void onWarmupCompleted(CircleHighlightV3 circleHighlightV3, boolean z) {
        Object[] objArr = {circleHighlightV3, Boolean.valueOf(z)};
        int iOnExtraCallback = getKekid.onExtraCallback();
        onExtraCallbackWithResult(getKekid.onExtraCallback(), 1200961814, objArr, -1200961799, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback());
    }

    private static final Unit readTypedObject(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(getKekid.onExtraCallback(), -1469090983, new Object[]{attachapplovinsdk}, 1469090989, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
    }

    private static final Unit onPostMessage(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(getKekid.onExtraCallback(), 1125189424, new Object[]{attachapplovinsdk}, -1125189417, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
    }

    private static final Unit ICustomTabsCallbackDefault(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(getKekid.onExtraCallback(), -85763025, new Object[]{attachapplovinsdk}, 85763039, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
    }

    private static final Unit getInterfaceDescriptor(CircleHighlightV3 circleHighlightV3) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(getKekid.onExtraCallback(), 1306178718, new Object[]{circleHighlightV3}, -1306178705, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
    }

    private static final Unit isEngagementSignalsApiAvailable(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(getKekid.onExtraCallback(), -2125528026, new Object[]{attachapplovinsdk}, 2125528026, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
    }

    private static final Unit IAuthTabCallbackStubProxy(CircleHighlightV3 circleHighlightV3) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(getKekid.onExtraCallback(), -383106685, new Object[]{circleHighlightV3}, 383106686, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
    }

    private static final void onNavigationEvent(View view, CircleHighlightV3 circleHighlightV3) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        onExtraCallbackWithResult(getKekid.onExtraCallback(), 1651240656, new Object[]{view, circleHighlightV3}, -1651240644, iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback());
    }
}
