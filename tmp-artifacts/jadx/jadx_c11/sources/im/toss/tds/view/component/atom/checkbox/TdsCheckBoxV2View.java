package im.toss.tds.view.component.atom.checkbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.R;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Address;
import o.AppLovinSdkSettings;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ComposableLambdaImplExternalSyntheticLambda2;
import o.ComposableLambdaImplExternalSyntheticLambda9;
import o.EnumC0079certificatePinner;
import o.ICrashFilter;
import o.OkHttpClientCompanion;
import o.RequestBodyCompanion;
import o.access13800;
import o.access14300;
import o.access15300;
import o.attachAppLovinSdk;
import o.authParams;
import o.deprecated_certificatePinner;
import o.deprecated_proxy;
import o.deprecated_proxySelector;
import o.eExternalSyntheticLambda0;
import o.enableThreadsBoost;
import o.findRes;
import o.findResAndMsg;
import o.forceDomainCheck;
import o.formatMsgs;
import o.getDid;
import o.getExtraParameters;
import o.getInstallBeginTimestampServerSeconds;
import o.getPackageType;
import o.getReferrerClickTimestampSeconds;
import o.initMiniApp;
import o.initSDK;
import o.isFireOS;
import o.isMuted;
import o.isNeedUnzip;
import o.isOneShot;
import o.maybeUpdateAnimatable;
import o.noStore;
import o.onCrash;
import o.onInstallReferrerServiceDisconnected;
import o.onInstallReferrerSetupFinished;
import o.putChannelInfo;
import o.registerCrashCallback;
import o.reportCustomErr;
import o.setCustomDataCallback;
import o.setHasUserConsent;
import o.setRandomHost;
import o.varyFields;
import o.varyMatches;
import o.waitForLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TdsCheckBoxV2View extends ConstraintLayout implements Checkable, registerCrashCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallback_Parcel = 1;
    private static long ICustomTabsService = -6024275974427956851L;
    private static int extraCommand;
    private boolean IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private Paint IAuthTabCallbackStub;
    private Rally IAuthTabCallbackStubProxy;
    private Rally IAuthTabCallback_Parcel;
    private waitForLayout ICustomTabsCallback;
    private final int ICustomTabsCallbackDefault;
    private Rally ICustomTabsCallbackStub;
    private int ICustomTabsCallbackStubProxy;
    private Rally access000;
    private boolean access100;
    private Paint asBinder;
    private String asInterface;
    private Rally extraCallback;
    private boolean extraCallbackWithResult;
    private final Drawable getInterfaceDescriptor;
    private String isEngagementSignalsApiAvailable;
    private findResAndMsg mayLaunchUrl;
    private Rally onActivityLayout;
    private View.OnClickListener onActivityResized;
    private boolean onExtraCallback;
    private int onExtraCallbackWithResult;
    private Rally onMessageChannelReady;
    private final Lazy onMinimized;
    private onWarmupCompleted onNavigationEvent;
    private onExtraCallback onPostMessage;
    private Rally onRelationshipValidationResult;
    private final float onTransact;
    private onNavigationEvent onUnminimized;
    private boolean onWarmupCompleted;
    private final Drawable readTypedObject;
    private boolean writeTypedObject;

    public interface onExtraCallback {
        void IAuthTabCallback(@NotNull TdsCheckBoxV2View tdsCheckBoxV2View, boolean z);
    }

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[onNavigationEvent.values().length];
            try {
                iArr[onNavigationEvent.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onNavigationEvent.LINE.ordinal()] = 2;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onNavigationEvent.LINE_TRANSPARENT.ordinal()] = 3;
                int i2 = onWarmupCompleted + 7;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[ICrashFilter.values().length];
            try {
                iArr2[ICrashFilter.Impression.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ICrashFilter.Click.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            IAuthTabCallback = iArr2;
            int i4 = onExtraCallback + 119;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 80 / 0;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsCheckBoxV2View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsCheckBoxV2View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(TdsCheckBoxV2View tdsCheckBoxV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 103;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback = ICustomTabsCallback(tdsCheckBoxV2View);
        int i4 = ICustomTabsCallback_Parcel + 111;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return unitICustomTabsCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 115;
        extraCommand = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onTransact(attachapplovinsdk);
            obj.hashCode();
            throw null;
        }
        Unit unitOnTransact = onTransact(attachapplovinsdk);
        int i3 = extraCommand + 23;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnTransact;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(TdsCheckBoxV2View tdsCheckBoxV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 59;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(-946653077, new Object[]{tdsCheckBoxV2View}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 946653081);
        int i4 = ICustomTabsCallback_Parcel + 25;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit asBinder(TdsCheckBoxV2View tdsCheckBoxV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 57;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(-352523368, new Object[]{tdsCheckBoxV2View}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 352523378);
        int i3 = extraCommand + 7;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 22 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        TdsCheckBoxV2View tdsCheckBoxV2View = (TdsCheckBoxV2View) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        float fFloatValue = ((Number) objArr[3]).floatValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 105;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(tdsCheckBoxV2View, iIntValue, iIntValue2, fFloatValue);
        }
        onNavigationEvent(tdsCheckBoxV2View, iIntValue, iIntValue2, fFloatValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8 = ~i;
        int i9 = (~(i8 | i6)) | i2;
        int i10 = ~i6;
        int i11 = ~i2;
        int i12 = (~(i10 | i11)) | i;
        int i13 = (~(i2 | i10 | i)) | (~(i8 | i10 | i11)) | (~(i11 | i6 | i));
        int i14 = i6 + i + i3 + ((-104759182) * i5) + ((-453318476) * i4);
        int i15 = i14 * i14;
        int i16 = (i6 * 1504131295) + 1805123584 + (1504131295 * i) + (179255518 * i9) + ((-358511036) * i12) + ((-179255518) * i13) + (1324875776 * i3) + (711983104 * i5) + (1180696576 * i4) + (1022754816 * i15);
        int i17 = ((i6 * (-1431886989)) - 1507491630) + (i * (-1431886989)) + (i9 * (-122)) + (i12 * 244) + (i13 * 122) + (i3 * (-1431886867)) + (i5 * 722567050) + (i4 * (-1618605404)) + (i15 * 297664512);
        switch (i16 + (i17 * i17 * (-277217280))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
                int i18 = 2 % 2;
                int i19 = ICustomTabsCallback_Parcel + 83;
                extraCommand = i19 % 128;
                if (i19 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asInterface());
                    i7 = 124;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asInterface());
                    i7 = 100;
                }
                attachapplovinsdk.IAuthTabCallback(i7);
                return Unit.INSTANCE;
            case 6:
                return asInterface(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return asBinder(objArr);
            case 11:
                return getInterfaceDescriptor(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(TdsCheckBoxV2View tdsCheckBoxV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 119;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            return writeTypedObject(tdsCheckBoxV2View);
        }
        writeTypedObject(tdsCheckBoxV2View);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(TdsCheckBoxV2View tdsCheckBoxV2View, int i, int i2, int i3, int i4, int i5, float f) {
        int i6 = 2 % 2;
        int i7 = ICustomTabsCallback_Parcel + 47;
        extraCommand = i7 % 128;
        int i8 = i7 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tdsCheckBoxV2View, i, i2, i3, i4, i5, f);
        int i9 = ICustomTabsCallback_Parcel + 59;
        extraCommand = i9 % 128;
        if (i9 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = extraCommand + 105;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(attachapplovinsdk);
        int i4 = extraCommand + 35;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TdsCheckBoxV2View tdsCheckBoxV2View) {
        int i = 2 % 2;
        int i2 = extraCommand + 117;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(tdsCheckBoxV2View);
        int i4 = ICustomTabsCallback_Parcel + 49;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return unitAccess000;
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsCheckBoxV2View tdsCheckBoxV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 69;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(tdsCheckBoxV2View);
        int i4 = extraCommand + 27;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsCheckBoxV2View tdsCheckBoxV2View, int i, int i2, int i3, int i4, int i5, float f) {
        int i6 = 2 % 2;
        int i7 = extraCommand + 63;
        ICustomTabsCallback_Parcel = i7 % 128;
        if (i7 % 2 != 0) {
            return (Unit) onExtraCallback(-1486436202, new Object[]{tdsCheckBoxV2View, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Float.valueOf(f)}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1486436203);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        TdsCheckBoxV2View tdsCheckBoxV2View = (TdsCheckBoxV2View) objArr[0];
        initSDK.onNavigationEvent onnavigationevent = (initSDK.onNavigationEvent) objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 73;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(tdsCheckBoxV2View, onnavigationevent);
        int i4 = extraCommand + 73;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ void onTransact(TdsCheckBoxV2View tdsCheckBoxV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 79;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        IAuthTabCallback_Parcel(tdsCheckBoxV2View);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = extraCommand + 23;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, int i2, TdsCheckBoxV2View tdsCheckBoxV2View, float f) {
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallback_Parcel + 41;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(i, i2, tdsCheckBoxV2View, f);
        int i6 = ICustomTabsCallback_Parcel + 83;
        extraCommand = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, int i2, TdsCheckBoxV2View tdsCheckBoxV2View, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f) {
        int i10 = 2 % 2;
        int i11 = extraCommand + 113;
        ICustomTabsCallback_Parcel = i11 % 128;
        int i12 = i11 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, i2, tdsCheckBoxV2View, i3, i4, i5, i6, i7, i8, i9, f);
        int i13 = extraCommand + 121;
        ICustomTabsCallback_Parcel = i13 % 128;
        if (i13 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsCheckBoxV2View tdsCheckBoxV2View) {
        int i = 2 % 2;
        int i2 = extraCommand + 111;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(tdsCheckBoxV2View);
        int i4 = ICustomTabsCallback_Parcel + 103;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return interfaceDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsCheckBoxV2View tdsCheckBoxV2View, int i, int i2, float f) {
        int i3 = 2 % 2;
        int i4 = extraCommand + 101;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(tdsCheckBoxV2View, i, i2, f);
        int i6 = ICustomTabsCallback_Parcel + 49;
        extraCommand = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = extraCommand + 15;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {attachapplovinsdk};
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback4 = forceDomainCheck.IAuthTabCallback();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(-382184477, objArr, iIAuthTabCallback, iIAuthTabCallback2, iIAuthTabCallback4, iIAuthTabCallback3, 382184482);
        int i4 = extraCommand + 19;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v21 */
    public TdsCheckBoxV2View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws NoWhenBranchMatchedException {
        boolean z;
        Object obj;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onMinimized = reportCustomErr.onNavigationEvent(this, onCrash.CheckBox, false, (Function0) null, new Function1() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View$$ExternalSyntheticLambda17
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 109;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unit = (Unit) TdsCheckBoxV2View.onExtraCallback(510660801, new Object[]{this.f$0, (initSDK.onNavigationEvent) obj2}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -510660793);
                int i5 = onWarmupCompleted + 13;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        }, 6, (Object) null);
        boolean z2 = true;
        this.ICustomTabsCallback = isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null);
        this.mayLaunchUrl = findRes.onWarmupCompleted(putChannelInfo.onExtraCallback().plus(this.ICustomTabsCallback));
        this.onTransact = 0.817f;
        this.onExtraCallback = true;
        this.access100 = true;
        this.extraCallbackWithResult = true;
        String string = context.getString(R.string.tds_view_checked);
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.asInterface = string;
        String string2 = context.getString(R.string.tds_view_unchecked);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        this.isEngagementSignalsApiAvailable = string2;
        this.ICustomTabsCallbackStubProxy = RequestBodyCompanion.onNavigationEvent(this, authParams.IconUnselected);
        this.IAuthTabCallbackDefault = RequestBodyCompanion.onNavigationEvent(this, authParams.FillBrand);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.ICustomTabsCallbackStubProxy);
        paint.setAlpha(this.ICustomTabsCallbackStubProxy >>> 24);
        paint.setAntiAlias(true);
        this.asBinder = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(this.IAuthTabCallbackDefault);
        boolean z3 = false;
        int i2 = 0;
        paint2.setAlpha(0);
        paint2.setAntiAlias(true);
        this.IAuthTabCallbackStub = paint2;
        onNavigationEvent onnavigationevent = onNavigationEvent.FILL;
        this.onUnminimized = onnavigationevent;
        onWarmupCompleted onwarmupcompleted = onWarmupCompleted.MEDIUM;
        this.onNavigationEvent = onwarmupcompleted;
        this.onExtraCallbackWithResult = this.ICustomTabsCallbackStubProxy;
        Drawable drawableOnExtraCallback = ResourcesCompat.onExtraCallback(getResources(), im.toss.tds.R.drawable.ic_check_path__22_fit, context.getTheme());
        if (drawableOnExtraCallback != null) {
            drawableOnExtraCallback.mutate();
            drawableOnExtraCallback.setTint(this.onExtraCallbackWithResult);
        } else {
            drawableOnExtraCallback = null;
        }
        this.getInterfaceDescriptor = drawableOnExtraCallback;
        Drawable drawableOnExtraCallback2 = ResourcesCompat.onExtraCallback(getResources(), im.toss.tds.R.drawable.icon_check_mono, context.getTheme());
        if (drawableOnExtraCallback2 != null) {
            drawableOnExtraCallback2.mutate();
            drawableOnExtraCallback2.setTint(this.onExtraCallbackWithResult);
            int i3 = extraCommand + 81;
            ICustomTabsCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } else {
            drawableOnExtraCallback2 = null;
        }
        this.readTypedObject = drawableOnExtraCallback2;
        if (attributeSet != null) {
            int i6 = ICustomTabsCallback_Parcel + 73;
            extraCommand = i6 % 128;
            int i7 = i6 % 2;
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsCheckBoxV2View, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z4 = true;
            Object obj2 = onwarmupcompleted;
            boolean z5 = false;
            Object obj3 = onnavigationevent;
            while (i2 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.TdsCheckBoxV2View_android_checked) {
                    z5 = typedArrayObtainStyledAttributes.getBoolean(index, z5);
                    obj3 = obj3;
                } else if (index == R.styleable.TdsCheckBoxV2View_android_enabled) {
                    int i8 = ICustomTabsCallback_Parcel + 55;
                    extraCommand = i8 % 128;
                    int i9 = i8 % 2;
                    z4 = typedArrayObtainStyledAttributes.getBoolean(index, z4);
                    obj3 = obj3;
                } else {
                    if (index == R.styleable.TdsCheckBoxV2View_android_clickable) {
                        z2 = typedArrayObtainStyledAttributes.getBoolean(index, z2);
                    } else if (index == R.styleable.TdsCheckBoxV2View_checkBoxV2Type) {
                        Object obj4 = onNavigationEvent.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, ((onNavigationEvent) obj3).ordinal()));
                        int i10 = ICustomTabsCallback_Parcel + 53;
                        extraCommand = i10 % 128;
                        int i11 = i10 % 2;
                        obj3 = obj4;
                    } else if (index == R.styleable.TdsCheckBoxV2View_checkBoxV2Size) {
                        int i12 = extraCommand + 73;
                        ICustomTabsCallback_Parcel = i12 % 128;
                        if (i12 % 2 == 0) {
                            onWarmupCompleted.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, ((onWarmupCompleted) obj2).ordinal()));
                            throw null;
                        }
                        obj2 = onWarmupCompleted.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, ((onWarmupCompleted) obj2).ordinal()));
                    } else {
                        continue;
                    }
                    i2++;
                    obj3 = obj3;
                    obj2 = obj2;
                }
                int i13 = 2 % 2;
                i2++;
                obj3 = obj3;
                obj2 = obj2;
            }
            z = z2;
            z3 = z5;
            onwarmupcompleted = obj2;
            z2 = z4;
            obj = obj3;
        } else {
            int i14 = extraCommand + 37;
            ICustomTabsCallback_Parcel = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 2 % 2;
            z = true;
            obj = onnavigationevent;
        }
        setType((onNavigationEvent) obj);
        setSize(onwarmupcompleted);
        setChecked(z3);
        setEnabled(z2);
        ICustomTabsCallback();
        setClickable(z);
        this.ICustomTabsCallbackDefault = 150;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        TdsCheckBoxV2View tdsCheckBoxV2View = (TdsCheckBoxV2View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 85;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        int i5 = tdsCheckBoxV2View.ICustomTabsCallbackDefault;
        int i6 = i2 + 43;
        extraCommand = i6 % 128;
        if (i6 % 2 == 0) {
            return Integer.valueOf(i5);
        }
        int i7 = 93 / 0;
        return Integer.valueOf(i5);
    }

    public static final /* synthetic */ void onExtraCallback(TdsCheckBoxV2View tdsCheckBoxV2View, Rally rally) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 101;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        tdsCheckBoxV2View.onRelationshipValidationResult = rally;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 117;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TdsCheckBoxV2View tdsCheckBoxV2View = (TdsCheckBoxV2View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 45;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        Rally rally = tdsCheckBoxV2View.onRelationshipValidationResult;
        int i5 = i2 + 23;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            return rally;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TdsCheckBoxV2View tdsCheckBoxV2View = (TdsCheckBoxV2View) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand + 13;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return tdsCheckBoxV2View.onMinimized();
        }
        tdsCheckBoxV2View.onMinimized();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 79;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        }
        super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        throw null;
    }

    public /* synthetic */ initSDK IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCommand + 3;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback setcustomdatacallbackAsInterface = asInterface();
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return setcustomdatacallbackAsInterface;
    }

    public /* bridge */ Set<String> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 25;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        }
        super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        throw null;
    }

    public /* bridge */ initSDK IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 7;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
            throw null;
        }
        initSDK initsdkIAuthTabCallbackStubProxy = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
        int i3 = ICustomTabsCallback_Parcel + 99;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        return initsdkIAuthTabCallbackStubProxy;
    }

    public /* bridge */ boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 69;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        }
        super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ enableThreadsBoost.onNavigationEvent access000() {
        enableThreadsBoost.onNavigationEvent onnavigationeventAccess000;
        int i = 2 % 2;
        int i2 = extraCommand + 77;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            onnavigationeventAccess000 = super/*o.setDeviceId*/.access000();
            int i3 = 18 / 0;
        } else {
            onnavigationeventAccess000 = super/*o.setDeviceId*/.access000();
        }
        int i4 = extraCommand + 69;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventAccess000;
    }

    public /* bridge */ boolean access100() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 77;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess100 = super/*o.initSDK*/.access100();
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return zAccess100;
    }

    public /* bridge */ Function1<ICrashFilter, Boolean> asBinder() {
        int i = 2 % 2;
        int i2 = extraCommand + 75;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Function1<ICrashFilter, Boolean> function1AsBinder = super/*o.MonitorCrashConfig*/.asBinder();
        int i4 = ICustomTabsCallback_Parcel + 61;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return function1AsBinder;
        }
        throw null;
    }

    public /* bridge */ boolean extraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 55;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallback = super/*o.MonitorCrashConfig*/.extraCallback();
        int i4 = extraCommand + 31;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zExtraCallback;
    }

    public /* bridge */ initSDK.onNavigationEvent getInterfaceDescriptor() {
        initSDK.onNavigationEvent interfaceDescriptor;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 77;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            interfaceDescriptor = super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
            int i3 = 77 / 0;
        } else {
            interfaceDescriptor = super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
        }
        int i4 = ICustomTabsCallback_Parcel + 115;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return interfaceDescriptor;
        }
        throw null;
    }

    public /* bridge */ initSDK.onNavigationEvent onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 23;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.onExtraCallback();
        }
        super/*o.MonitorCrashConfig*/.onExtraCallback();
        throw null;
    }

    public /* bridge */ initMiniApp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 119;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp initminiappOnExtraCallbackWithResult = super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
        int i4 = extraCommand + 73;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return initminiappOnExtraCallbackWithResult;
        }
        throw null;
    }

    public /* bridge */ enableThreadsBoost onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 97;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        enableThreadsBoost enablethreadsboostOnNavigationEvent = super/*o.MonitorCrashConfig*/.onNavigationEvent();
        int i3 = extraCommand + 51;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 18 / 0;
        }
        return enablethreadsboostOnNavigationEvent;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = extraCommand + 7;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(map);
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        int i5 = ICustomTabsCallback_Parcel + 107;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public /* bridge */ getDid onTransact() {
        int i = 2 % 2;
        int i2 = extraCommand + 39;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.MonitorCrashConfig*/.onTransact();
            throw null;
        }
        getDid getdidOnTransact = super/*o.MonitorCrashConfig*/.onTransact();
        int i3 = ICustomTabsCallback_Parcel + 35;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        return getdidOnTransact;
    }

    public /* bridge */ Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 23;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        }
        super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        throw null;
    }

    public /* bridge */ void setAsCtaButton() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 53;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        super/*o.initSDK*/.setAsCtaButton();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback_Parcel + 23;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setComponentKey(@Nullable enableThreadsBoost enablethreadsboost) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 117;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setComponentKey(enablethreadsboost);
        int i4 = extraCommand + 91;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ void setCustomParam(@NotNull String str, @NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = extraCommand + 21;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParam(str, function1);
        int i4 = extraCommand + 117;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setCustomParams(@NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 29;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParams(function1);
        int i4 = ICustomTabsCallback_Parcel + 11;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setEventLoggableChecker(@Nullable Function1<? super ICrashFilter, Boolean> function1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 5;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setEventLoggableChecker(function1);
        int i4 = ICustomTabsCallback_Parcel + 81;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setMaskingWords(@NotNull Set<String> set) {
        int i = 2 % 2;
        int i2 = extraCommand + 83;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMaskingWords(set);
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
        int i5 = ICustomTabsCallback_Parcel + 91;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ void setMetadata(@NotNull getDid getdid) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 57;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMetadata(getdid);
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCommand + 59;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
    }

    public /* bridge */ void setTrackable(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 3;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setTrackable(z);
        int i4 = ICustomTabsCallback_Parcel + 111;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsCheckBoxV2View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = extraCommand;
            int i4 = i3 + 39;
            ICustomTabsCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 57 / 0;
            }
            int i6 = i3 + 85;
            ICustomTabsCallback_Parcel = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i8 = extraCommand + 95;
            ICustomTabsCallback_Parcel = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public setCustomDataCallback asInterface() {
        int i = 2 % 2;
        int i2 = extraCommand + 85;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback setcustomdatacallback = (setCustomDataCallback) this.onMinimized.getValue();
        int i4 = ICustomTabsCallback_Parcel + 3;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return setcustomdatacallback;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(TdsCheckBoxV2View tdsCheckBoxV2View, initSDK.onNavigationEvent onnavigationevent) throws Throwable {
        String str;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 33;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            int i3 = 99 / 0;
            if (tdsCheckBoxV2View.onWarmupCompleted) {
                int i4 = extraCommand + 15;
                ICustomTabsCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                str = "on";
            } else {
                str = "off";
            }
        } else {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            if (!tdsCheckBoxV2View.onWarmupCompleted) {
            }
        }
        onnavigationevent.onExtraCallback("status", str);
        Object[] objArr = new Object[1];
        a(new char[]{44238, 38604, 55524, 759}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14867, objArr);
        getReferrerClickTimestampSeconds.onWarmupCompleted(onnavigationevent, ((String) objArr[0]).intern(), tdsCheckBoxV2View.getContentDescription());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private ComposableLambdaImplExternalSyntheticLambda2 composition;
        private final String path;
        public static final onNavigationEvent LINE = new onNavigationEvent("LINE", 0, "lottie/checkbox/check_line.json", null, 2, null);
        public static final onNavigationEvent FILL = new onNavigationEvent("FILL", 1, "lottie/checkbox/check_fill.json", null, 2, null);
        public static final onNavigationEvent LINE_TRANSPARENT = new onNavigationEvent("LINE_TRANSPARENT", 2, "lottie/checkbox/check_line.json", null, 2, null);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = {LINE, FILL, LINE_TRANSPARENT};
            int i5 = i3 + 85;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i3 + 5;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 55 / 0;
            }
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = IAuthTabCallback + 7;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i3 = IAuthTabCallback + 77;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i, String str2, ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2) {
            this.path = str2;
            this.composition = composableLambdaImplExternalSyntheticLambda2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* synthetic */ onNavigationEvent(String str, int i, String str2, ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 2) != 0) {
                int i3 = IAuthTabCallback;
                int i4 = i3 + 13;
                onWarmupCompleted = i4 % 128;
                Object obj = null;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 71;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 5;
                } else {
                    int i7 = 2 % 2;
                }
                composableLambdaImplExternalSyntheticLambda2 = null;
            }
            this(str, i, str2, composableLambdaImplExternalSyntheticLambda2);
        }

        public final ComposableLambdaImplExternalSyntheticLambda2 getComposition() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2 = this.composition;
            int i5 = i3 + 115;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return composableLambdaImplExternalSyntheticLambda2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getPath() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return this.path;
            }
            throw null;
        }

        public final void setComposition(@Nullable ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            this.composition = composableLambdaImplExternalSyntheticLambda2;
            int i5 = i3 + 103;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onNavigationEvent + 49;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public final void load(@NotNull Context context) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            if (this.composition == null) {
                this.composition = (ComposableLambdaImplExternalSyntheticLambda2) ComposableLambdaImplExternalSyntheticLambda9.onExtraCallback(context, this.path).IAuthTabCallback();
                int i4 = onWarmupCompleted + 119;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = onWarmupCompleted + 11;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Drawable.resolveOpacity(0, 0) + 24, 19627 - Gravity.getAbsoluteGravity(0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (ICustomTabsService ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 59, 6383 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i4 = $11 + 97;
                $10 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i6 = $11 + 87;
        $10 = i6 % 128;
        while (true) {
            int i7 = i6 % 2;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 58, 6383 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            i6 = $10 + 111;
            $11 = i6 % 128;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        private final float dpValue;
        public static final onWarmupCompleted XSMALL = new onWarmupCompleted("XSMALL", 0, 16.0f);
        public static final onWarmupCompleted SMALL = new onWarmupCompleted("SMALL", 1, 20.0f);
        public static final onWarmupCompleted MEDIUM = new onWarmupCompleted("MEDIUM", 2, 24.0f);
        public static final onWarmupCompleted LARGE = new onWarmupCompleted("LARGE", 3, 30.0f);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = {XSMALL, SMALL, MEDIUM, LARGE};
            int i5 = i3 + 115;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return onwarmupcompletedArr;
            }
            throw null;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i3 + 111;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i, float f) {
            this.dpValue = f;
        }

        public final float getDpValue() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            float f = this.dpValue;
            int i5 = i3 + 27;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 25 / 0;
            }
            return f;
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onWarmupCompleted + 7;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        registerCrashCallback registercrashcallback = (TdsCheckBoxV2View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 7;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        float measuredWidth = registercrashcallback.getMeasuredWidth() * 0.04166f;
        int i4 = ICustomTabsCallback_Parcel + 75;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return Float.valueOf(measuredWidth);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setUnCheckedIconColor(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback_Parcel + 41;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        this.ICustomTabsCallbackStubProxy = i;
        if (i4 != 0) {
            throw null;
        }
    }

    public final void setCheckedIconColor(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback_Parcel + 41;
        int i4 = i3 % 128;
        extraCommand = i4;
        int i5 = i3 % 2;
        this.IAuthTabCallbackDefault = i;
        if (i5 != 0) {
            int i6 = 95 / 0;
        }
        int i7 = i4 + 77;
        ICustomTabsCallback_Parcel = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        if (this.onNavigationEvent != onwarmupcompleted) {
            int i2 = extraCommand + 69;
            ICustomTabsCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent = onwarmupcompleted;
            requestLayout();
        }
        int i4 = extraCommand + 63;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = extraCommand + 123;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            this.onExtraCallbackWithResult = i;
            Drawable drawableExtraCallbackWithResult = extraCallbackWithResult();
            if (drawableExtraCallbackWithResult != null) {
                drawableExtraCallbackWithResult.setTint(i);
            }
            invalidate();
            int i4 = extraCommand + 41;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.onExtraCallbackWithResult = i;
        extraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Drawable extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 5;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        if (this.onUnminimized != onNavigationEvent.FILL) {
            return this.readTypedObject;
        }
        int i4 = ICustomTabsCallback_Parcel + 41;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return this.getInterfaceDescriptor;
        }
        throw null;
    }

    public final void setType(@NotNull onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = extraCommand + 79;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            this.onUnminimized = onnavigationevent;
        } else {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            this.onUnminimized = onnavigationevent;
            throw null;
        }
    }

    public final void setSize(@NotNull onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 33;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            IAuthTabCallback(onwarmupcompleted);
        } else {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            IAuthTabCallback(onwarmupcompleted);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        Object obj = null;
        if (onInstallReferrerServiceDisconnected.onExtraCallback.onExtraCallback(this, motionEvent)) {
            int i2 = ICustomTabsCallback_Parcel + 69;
            extraCommand = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
        if (isClickable()) {
            int i3 = ICustomTabsCallback_Parcel + 23;
            extraCommand = i3 % 128;
            if (i3 % 2 != 0) {
                varyFields.onWarmupCompleted(getContext());
                obj.hashCode();
                throw null;
            }
            if (!varyFields.onWarmupCompleted(getContext())) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    if (!isEnabled()) {
                        if (!this.writeTypedObject) {
                            isOneShot.onExtraCallbackWithResult(this, noStore.Companion.access100());
                            int i4 = extraCommand + 77;
                            ICustomTabsCallback_Parcel = i4 % 128;
                            int i5 = i4 % 2;
                        }
                        ICustomTabsCallbackStub();
                        return false;
                    }
                    int i6 = extraCommand + 71;
                    ICustomTabsCallback_Parcel = i6 % 128;
                    int i7 = i6 % 2;
                    setPressed(true);
                    int i8 = extraCommand + 117;
                    ICustomTabsCallback_Parcel = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 75 / 0;
                    }
                    return true;
                }
                if (action == 1) {
                    onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, this, (initMiniApp) null, 2, (Object) null);
                    setPressed(false);
                    View.OnClickListener onClickListener = this.onActivityResized;
                    if (onClickListener == null) {
                        setChecked(!isChecked());
                    } else if (onClickListener != null) {
                        int i10 = ICustomTabsCallback_Parcel + 59;
                        extraCommand = i10 % 128;
                        if (i10 % 2 != 0) {
                            onClickListener.onClick(this);
                            obj.hashCode();
                            throw null;
                        }
                        onClickListener.onClick(this);
                    }
                    return true;
                }
                int i11 = extraCommand;
                int i12 = i11 + 49;
                ICustomTabsCallback_Parcel = i12 % 128;
                if (i12 % 2 != 0 ? action != 3 : action != 5) {
                    if (action != 4) {
                        int i13 = i11 + 27;
                        ICustomTabsCallback_Parcel = i13 % 128;
                        int i14 = i13 % 2;
                        return false;
                    }
                }
                if (this.IAuthTabCallback) {
                    onNavigationEvent(this.onWarmupCompleted, this.onExtraCallback, this.access100);
                    setPressed(false);
                }
                return true;
            }
        }
        if (this.IAuthTabCallback) {
            setPressed(false);
            setChecked(isChecked());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setPressed(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 29;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        if (isClickable()) {
            int i4 = ICustomTabsCallback_Parcel + 107;
            int i5 = i4 % 128;
            extraCommand = i5;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (this.IAuthTabCallback != z && this.onActivityResized == null) {
                int i6 = i5 + 57;
                ICustomTabsCallback_Parcel = i6 % 128;
                if (i6 % 2 == 0) {
                    this.IAuthTabCallback = z;
                    int i7 = 14 / 0;
                    if (z) {
                        if (this.onUnminimized == onNavigationEvent.FILL) {
                            ICustomTabsCallbackStubProxy();
                            return;
                        }
                        ICustomTabsCallbackDefault();
                        int i8 = ICustomTabsCallback_Parcel + 43;
                        extraCommand = i8 % 128;
                        int i9 = i8 % 2;
                    }
                } else {
                    this.IAuthTabCallback = z;
                    if (z) {
                    }
                }
            }
        }
        int i10 = ICustomTabsCallback_Parcel + 27;
        extraCommand = i10 % 128;
        int i11 = i10 % 2;
    }

    private final void writeTypedObject() {
        int i = 2 % 2;
        Rally rally = this.IAuthTabCallbackStubProxy;
        if (rally != null) {
            rally.ICustomTabsServiceStub();
        }
        Rally rally2 = this.access000;
        if (rally2 != null) {
            rally2.ICustomTabsServiceStub();
        }
        Rally rally3 = this.IAuthTabCallback_Parcel;
        if (rally3 != null) {
            int i2 = extraCommand + 23;
            ICustomTabsCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            rally3.ICustomTabsServiceStub();
        }
        Rally rally4 = this.extraCallback;
        if (rally4 != null) {
            int i4 = ICustomTabsCallback_Parcel + 29;
            extraCommand = i4 % 128;
            if (i4 % 2 != 0) {
                rally4.ICustomTabsServiceStub();
                int i5 = 13 / 0;
            } else {
                rally4.ICustomTabsServiceStub();
            }
        }
        Rally rally5 = this.onMessageChannelReady;
        if (rally5 != null) {
            rally5.ICustomTabsServiceStub();
        }
        Rally rally6 = this.onActivityLayout;
        if (rally6 != null) {
            int i6 = extraCommand + 9;
            ICustomTabsCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            rally6.ICustomTabsServiceStub();
            int i8 = extraCommand + 73;
            ICustomTabsCallback_Parcel = i8 % 128;
            int i9 = i8 % 2;
        }
        Rally rally7 = this.onRelationshipValidationResult;
        if (rally7 != null) {
            rally7.ICustomTabsServiceStub();
        }
        Rally rally8 = this.ICustomTabsCallbackStub;
        if (rally8 != null) {
            rally8.ICustomTabsServiceStub();
            int i10 = extraCommand + 95;
            ICustomTabsCallback_Parcel = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    private final void onExtraCallback(boolean z, boolean z2) {
        float f;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 65;
        extraCommand = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            writeTypedObject();
            this.IAuthTabCallbackStubProxy = (Rally) onExtraCallback(756996069, new Object[]{this}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -756996067);
            throw null;
        }
        writeTypedObject();
        Rally rally = (Rally) onExtraCallback(756996069, new Object[]{this}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -756996067);
        this.IAuthTabCallbackStubProxy = rally;
        if (z && z2) {
            int i3 = ICustomTabsCallback_Parcel + 89;
            extraCommand = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (rally != null) {
                return;
            }
            return;
        }
        if (rally != null) {
            int i4 = extraCommand + 75;
            ICustomTabsCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                rally.IAuthTabCallback_Parcel();
                f = 2.0f;
            } else {
                rally.IAuthTabCallback_Parcel();
                f = 1.0f;
            }
            rally.asInterface(f);
        }
        if (z) {
            return;
        }
        int i5 = ICustomTabsCallback_Parcel + 81;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
        onUnminimized();
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        final TdsCheckBoxV2View tdsCheckBoxV2View = (TdsCheckBoxV2View) objArr[0];
        int i = 2 % 2;
        final int alpha = tdsCheckBoxV2View.IAuthTabCallbackStub.getAlpha();
        final int color = tdsCheckBoxV2View.IAuthTabCallbackStub.getColor();
        final int alpha2 = tdsCheckBoxV2View.asBinder.getAlpha();
        final int color2 = tdsCheckBoxV2View.asBinder.getColor();
        final int i2 = tdsCheckBoxV2View.onExtraCallbackWithResult;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onWarmupCompleted()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        Float fValueOf = Float.valueOf(1.0f);
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsCheckBoxV2View, isMuted.onNavigationEvent(isMuted.asBinder(isMuted.onNavigationEvent(appLovinSdkSettings, (Float) null, fValueOf, (Function1) null, 5, (Object) null), null, fValueOf, null, 5, null), 0.0f, 1.0f, new Function1() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View$$ExternalSyntheticLambda11
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 55;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnExtraCallback = TdsCheckBoxV2View.onExtraCallback(this.f$0, color, alpha, color2, alpha2, i2, ((Float) obj).floatValue());
                int i6 = onExtraCallback + 71;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return unitOnExtraCallback;
            }
        }, new Function1() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View$$ExternalSyntheticLambda12
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 105;
                IAuthTabCallback = i4 % 128;
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                if (i4 % 2 != 0) {
                    TdsCheckBoxV2View.onExtraCallback(attachapplovinsdk);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnExtraCallback = TdsCheckBoxV2View.onExtraCallback(attachapplovinsdk);
                int i5 = onExtraCallbackWithResult + 45;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallback;
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        int i3 = ICustomTabsCallback_Parcel + 1;
        extraCommand = i3 % 128;
        if (i3 % 2 == 0) {
            return rally;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(TdsCheckBoxV2View tdsCheckBoxV2View, int i, int i2, int i3, int i4, int i5, float f) {
        int i6 = 2 % 2;
        tdsCheckBoxV2View.IAuthTabCallbackStub.setColor(new setHasUserConsent(i, tdsCheckBoxV2View.IAuthTabCallbackDefault).IAuthTabCallback(f).intValue());
        tdsCheckBoxV2View.IAuthTabCallbackStub.setAlpha(i2 + ((int) ((0 - i2) * f)));
        tdsCheckBoxV2View.asBinder.setColor(new setHasUserConsent(i3, tdsCheckBoxV2View.ICustomTabsCallbackStubProxy).IAuthTabCallback(f).intValue());
        tdsCheckBoxV2View.asBinder.setAlpha(i4 + ((int) (((r9 >>> 24) - i4) * f)));
        onExtraCallback(-470838291, new Object[]{tdsCheckBoxV2View, Integer.valueOf(new setHasUserConsent(i5, tdsCheckBoxV2View.ICustomTabsCallbackStubProxy).IAuthTabCallback(f).intValue())}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 470838297);
        Unit unit = Unit.INSTANCE;
        int i7 = extraCommand + 83;
        ICustomTabsCallback_Parcel = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 11;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asInterface());
        attachapplovinsdk.IAuthTabCallback(100);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback_Parcel + 77;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsCallbackStubProxy() {
        final int i;
        int i2 = 2 % 2;
        writeTypedObject();
        final int alpha = this.IAuthTabCallbackStub.getAlpha();
        final int color = this.IAuthTabCallbackStub.getColor();
        final int alpha2 = this.asBinder.getAlpha();
        final int color2 = this.asBinder.getColor();
        final int i3 = this.onExtraCallbackWithResult;
        final int iOnWarmupCompleted = OkHttpClientCompanion.onWarmupCompleted(this, eExternalSyntheticLambda0.CheckBoxCircleBackgroundFillCheckedPressed);
        final int i4 = isChecked() ? iOnWarmupCompleted >>> 24 : 0;
        final int iOnNavigationEvent = RequestBodyCompanion.onNavigationEvent(this, authParams.IconQuaternary);
        if (isChecked()) {
            int i5 = extraCommand + 81;
            ICustomTabsCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        } else {
            i = iOnNavigationEvent >>> 24;
        }
        this.access000 = (Rally) isFireOS.onExtraCallbackWithResult(Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{isMuted.asBinder(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(1.0f), (Function1) null, 5, (Object) null), null, Float.valueOf(0.8f), null, 5, null), Float.valueOf(0.0f), Float.valueOf(1.0f), new Function1() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i7 = 2 % 2;
                int i8 = IAuthTabCallback + 23;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                Unit unitOnWarmupCompleted = TdsCheckBoxV2View.onWarmupCompleted(color, iOnWarmupCompleted, this, alpha, i4, color2, alpha2, i, i3, iOnNavigationEvent, ((Float) obj).floatValue());
                int i10 = IAuthTabCallback + 75;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                return unitOnWarmupCompleted;
            }
        }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), null, new Function0() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i7 = 2 % 2;
                int i8 = onExtraCallbackWithResult + 121;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                Unit unitIAuthTabCallback = TdsCheckBoxV2View.IAuthTabCallback(this.f$0);
                int i10 = onWarmupCompleted + 55;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, 1, null), false, 1, null);
        int i7 = extraCommand + 61;
        ICustomTabsCallback_Parcel = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(int i, int i2, TdsCheckBoxV2View tdsCheckBoxV2View, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f) {
        int i10 = 2 % 2;
        tdsCheckBoxV2View.IAuthTabCallbackStub.setColor(new setHasUserConsent(i, i2).IAuthTabCallback(f).intValue());
        tdsCheckBoxV2View.IAuthTabCallbackStub.setAlpha(i3 + ((int) ((i4 - i3) * f)));
        tdsCheckBoxV2View.asBinder.setColor(new setHasUserConsent(i5, RequestBodyCompanion.onNavigationEvent(tdsCheckBoxV2View, authParams.IconQuaternary)).IAuthTabCallback(f).intValue());
        tdsCheckBoxV2View.asBinder.setAlpha(i6 + ((int) ((i7 - i6) * f)));
        onExtraCallback(-470838291, new Object[]{tdsCheckBoxV2View, Integer.valueOf(new setHasUserConsent(i8, i9).IAuthTabCallback(f).intValue())}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 470838297);
        Unit unit = Unit.INSTANCE;
        int i11 = ICustomTabsCallback_Parcel + 59;
        extraCommand = i11 % 128;
        if (i11 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit ICustomTabsCallback(TdsCheckBoxV2View tdsCheckBoxV2View) {
        int i = 2 % 2;
        int i2 = extraCommand + 89;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {noStore.Companion};
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        isOneShot.onExtraCallbackWithResult(tdsCheckBoxV2View, (noStore) noStore.onExtraCallback.onWarmupCompleted(objArr, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted));
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 101;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return unit;
    }

    private final void onNavigationEvent(boolean z, boolean z2) {
        int i = 2 % 2;
        writeTypedObject();
        Rally rallyOnActivityLayout = onActivityLayout();
        this.IAuthTabCallback_Parcel = rallyOnActivityLayout;
        if (z) {
            int i2 = ICustomTabsCallback_Parcel;
            int i3 = i2 + 79;
            extraCommand = i3 % 128;
            int i4 = i3 % 2;
            if (!(!z2)) {
                if (rallyOnActivityLayout != null) {
                    int i5 = i2 + 45;
                    extraCommand = i5 % 128;
                    if (i5 % 2 != 0) {
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
        }
        if (rallyOnActivityLayout != null) {
            rallyOnActivityLayout.IAuthTabCallback_Parcel();
            rallyOnActivityLayout.asInterface(1.0f);
        }
        if (!z) {
            onUnminimized();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View, java.lang.Object] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ?? r0 = (TdsCheckBoxV2View) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int iIntValue3 = ((Number) objArr[3]).intValue();
        int iIntValue4 = ((Number) objArr[4]).intValue();
        int iIntValue5 = ((Number) objArr[5]).intValue();
        float fFloatValue = ((Number) objArr[6]).floatValue();
        int i = 2 % 2;
        ((TdsCheckBoxV2View) r0).IAuthTabCallbackStub.setColor(new setHasUserConsent(iIntValue, ((TdsCheckBoxV2View) r0).IAuthTabCallbackDefault).IAuthTabCallback(fFloatValue).intValue());
        ((TdsCheckBoxV2View) r0).IAuthTabCallbackStub.setAlpha(iIntValue2 + ((int) (((r7 >>> 24) - iIntValue2) * fFloatValue)));
        ((TdsCheckBoxV2View) r0).asBinder.setColor(new setHasUserConsent(iIntValue3, ((TdsCheckBoxV2View) r0).ICustomTabsCallbackStubProxy).IAuthTabCallback(fFloatValue).intValue());
        ((TdsCheckBoxV2View) r0).asBinder.setAlpha(iIntValue4 + ((int) ((0 - iIntValue4) * fFloatValue)));
        onExtraCallback(-470838291, new Object[]{r0, Integer.valueOf(new setHasUserConsent(iIntValue5, OkHttpClientCompanion.onWarmupCompleted((View) r0, eExternalSyntheticLambda0.CheckBoxCircleCheckFillCheckedEnabled)).IAuthTabCallback(fFloatValue).intValue())}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 470838297);
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallback_Parcel + 121;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private final Rally onActivityLayout() {
        int i = 2 % 2;
        final int alpha = this.IAuthTabCallbackStub.getAlpha();
        final int color = this.IAuthTabCallbackStub.getColor();
        final int alpha2 = this.asBinder.getAlpha();
        final int color2 = this.asBinder.getColor();
        final int i2 = this.onExtraCallbackWithResult;
        Rally rallyOnTransact = Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{this, isMuted.onNavigationEvent(isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, Float.valueOf(1.0f), (Function1) null, 5, (Object) null), 0.0f, 1.0f, new Function1() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 13;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                TdsCheckBoxV2View tdsCheckBoxV2View = this.f$0;
                int i6 = color;
                int i7 = alpha;
                int i8 = color2;
                int i9 = alpha2;
                int i10 = i2;
                float fFloatValue = ((Float) obj).floatValue();
                if (i5 == 0) {
                    TdsCheckBoxV2View.onNavigationEvent(tdsCheckBoxV2View, i6, i7, i8, i9, i10, fFloatValue);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnNavigationEvent = TdsCheckBoxV2View.onNavigationEvent(tdsCheckBoxV2View, i6, i7, i8, i9, i10, fFloatValue);
                int i11 = IAuthTabCallback + 71;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                return unitOnNavigationEvent;
            }
        }, new Function1() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 55;
                IAuthTabCallback = i4 % 128;
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                if (i4 % 2 != 0) {
                    return TdsCheckBoxV2View.onWarmupCompleted(attachapplovinsdk);
                }
                TdsCheckBoxV2View.onWarmupCompleted(attachapplovinsdk);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), null, new Function0() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 59;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnNavigationEvent = TdsCheckBoxV2View.onNavigationEvent(this.f$0);
                int i6 = onExtraCallbackWithResult + 43;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    return unitOnNavigationEvent;
                }
                throw null;
            }
        }, 1, null);
        int i3 = extraCommand + 103;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return rallyOnTransact;
        }
        throw null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = TdsCheckBoxV2View.this.new IAuthTabCallback(access13800Var);
            int i2 = onExtraCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = 90 / 0;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 53;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult;
                int i4 = i3 + 65;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i3 + 63;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                TdsCheckBoxV2View tdsCheckBoxV2View = TdsCheckBoxV2View.this;
                TdsCheckBoxV2View.onExtraCallback(tdsCheckBoxV2View, (Rally) TdsCheckBoxV2View.onExtraCallback(1015049759, new Object[]{tdsCheckBoxV2View}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1015049759));
                Rally rally = (Rally) TdsCheckBoxV2View.onExtraCallback(1940866258, new Object[]{TdsCheckBoxV2View.this}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1940866255);
                if (rally != null) {
                }
                long jIntValue = ((Integer) TdsCheckBoxV2View.onExtraCallback(-1719948499, new Object[]{TdsCheckBoxV2View.this}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1719948506)).intValue();
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(jIntValue, this) == objOnWarmupCompleted) {
                    int i8 = onExtraCallback + 21;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    return objOnWarmupCompleted;
                }
            }
            Rally rally2 = (Rally) TdsCheckBoxV2View.onExtraCallback(1940866258, new Object[]{TdsCheckBoxV2View.this}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1940866255);
            if (rally2 != null) {
                rally2.ICustomTabsServiceStub();
                int i10 = onExtraCallbackWithResult + 21;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
            }
            Unit unit = Unit.INSTANCE;
            int i12 = onExtraCallbackWithResult + 7;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            return unit;
        }
    }

    private static final Unit IAuthTabCallbackStubProxy(TdsCheckBoxV2View tdsCheckBoxV2View) {
        int i = 2 % 2;
        int i2 = extraCommand + 25;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Rally rally = tdsCheckBoxV2View.IAuthTabCallback_Parcel;
        if (rally != null && rally.postMessage()) {
            maybeUpdateAnimatable.onNavigationEvent(tdsCheckBoxV2View.mayLaunchUrl, (CoroutineContext) null, (setRandomHost) null, tdsCheckBoxV2View.new IAuthTabCallback(null), 3, (Object) null);
            int i4 = ICustomTabsCallback_Parcel + 1;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private final void onExtraCallbackWithResult(boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 89;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            writeTypedObject();
            this.extraCallback = onActivityResized();
            throw null;
        }
        writeTypedObject();
        Rally rallyOnActivityResized = onActivityResized();
        this.extraCallback = rallyOnActivityResized;
        if (z && z2) {
            int i3 = ICustomTabsCallback_Parcel + 51;
            extraCommand = i3 % 128;
            int i4 = i3 % 2;
            if (rallyOnActivityResized != null) {
                return;
            }
            return;
        }
        if (rallyOnActivityResized != null) {
            int i5 = extraCommand + 7;
            ICustomTabsCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            rallyOnActivityResized.IAuthTabCallback_Parcel();
            rallyOnActivityResized.asInterface(1.0f);
        }
        if (z) {
            return;
        }
        int i7 = ICustomTabsCallback_Parcel + 75;
        extraCommand = i7 % 128;
        int i8 = i7 % 2;
        onUnminimized();
    }

    private final Rally onActivityResized() {
        int i = 2 % 2;
        final int i2 = this.onExtraCallbackWithResult;
        final int i3 = this.ICustomTabsCallbackStubProxy;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        Float fValueOf = Float.valueOf(1.0f);
        Object[] objArr = {isMuted.asBinder(isMuted.onNavigationEvent(appLovinSdkSettings, (Float) null, fValueOf, (Function1) null, 5, (Object) null), null, fValueOf, null, 5, null), Float.valueOf(0.0f), Float.valueOf(1.0f), new Function1() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onExtraCallback + 1;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unit = (Unit) TdsCheckBoxV2View.onExtraCallback(304379631, new Object[]{this.f$0, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(((Float) obj).floatValue())}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -304379620);
                int i6 = onExtraCallback + 19;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return unit;
            }
        }, null, 8, null};
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, objArr, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        int i4 = extraCommand + 7;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return rally;
    }

    private static final Unit onNavigationEvent(TdsCheckBoxV2View tdsCheckBoxV2View, int i, int i2, float f) {
        int i3 = 2 % 2;
        onExtraCallback(-470838291, new Object[]{tdsCheckBoxV2View, Integer.valueOf(new setHasUserConsent(i, i2).IAuthTabCallback(f).intValue())}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 470838297);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 109;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsCallbackDefault() {
        final int iOnNavigationEvent;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 107;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject();
        final int i4 = this.onExtraCallbackWithResult;
        if (isChecked()) {
            iOnNavigationEvent = OkHttpClientCompanion.onWarmupCompleted(this, eExternalSyntheticLambda0.CheckBoxLineCheckFillCheckedPressed);
        } else {
            iOnNavigationEvent = RequestBodyCompanion.onNavigationEvent(this, authParams.IconQuaternary);
        }
        Object[] objArr = {isMuted.asBinder(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(1.0f), (Function1) null, 5, (Object) null), null, Float.valueOf(0.8f), null, 5, null), Float.valueOf(0.0f), Float.valueOf(1.0f), new Function1() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View$$ExternalSyntheticLambda15
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i5 = 2 % 2;
                int i6 = IAuthTabCallback + 45;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                Unit unitOnWarmupCompleted = TdsCheckBoxV2View.onWarmupCompleted(this.f$0, i4, iOnNavigationEvent, ((Float) obj).floatValue());
                int i8 = IAuthTabCallback + 93;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return unitOnWarmupCompleted;
            }
        }, null, 8, null};
        this.onMessageChannelReady = (Rally) isFireOS.onExtraCallbackWithResult(Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, objArr, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), null, new Function0() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View$$ExternalSyntheticLambda16
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i5 = 2 % 2;
                int i6 = IAuthTabCallback + 91;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                Unit unitOnExtraCallback = TdsCheckBoxV2View.onExtraCallback(this.f$0);
                int i8 = onNavigationEvent + 85;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 70 / 0;
                }
                return unitOnExtraCallback;
            }
        }, 1, null), false, 1, null);
        int i5 = extraCommand + 43;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit IAuthTabCallback(TdsCheckBoxV2View tdsCheckBoxV2View, int i, int i2, float f) {
        int i3 = 2 % 2;
        onExtraCallback(-470838291, new Object[]{tdsCheckBoxV2View, Integer.valueOf(new setHasUserConsent(i, i2).IAuthTabCallback(f).intValue())}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 470838297);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 125;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit writeTypedObject(TdsCheckBoxV2View tdsCheckBoxV2View) {
        int i = 2 % 2;
        int i2 = extraCommand + 115;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {noStore.Companion};
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        isOneShot.onExtraCallbackWithResult(tdsCheckBoxV2View, (noStore) noStore.onExtraCallback.onWarmupCompleted(objArr, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted));
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 37;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void IAuthTabCallback(boolean z, boolean z2) {
        int i = 2 % 2;
        writeTypedObject();
        Rally rallyOnPostMessage = onPostMessage();
        this.onActivityLayout = rallyOnPostMessage;
        if (!z || !z2) {
            if (rallyOnPostMessage != null) {
                rallyOnPostMessage.IAuthTabCallback_Parcel();
                rallyOnPostMessage.asInterface(1.0f);
            }
            if (z) {
                return;
            }
            onUnminimized();
            return;
        }
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 83;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        if (rallyOnPostMessage != null) {
            int i5 = i2 + 57;
            extraCommand = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static final Unit IAuthTabCallback(int i, int i2, TdsCheckBoxV2View tdsCheckBoxV2View, float f) {
        int i3 = 2 % 2;
        onExtraCallback(-470838291, new Object[]{tdsCheckBoxV2View, Integer.valueOf(new setHasUserConsent(i, i2).IAuthTabCallback(f).intValue())}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 470838297);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 111;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onTransact(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = extraCommand + 91;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback_Parcel + 97;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Rally onPostMessage() {
        int i = 2 % 2;
        final int i2 = this.onExtraCallbackWithResult;
        final int iOnNavigationEvent = RequestBodyCompanion.onNavigationEvent(this, authParams.FillBrand);
        Rally rallyOnTransact = Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{this, isMuted.onNavigationEvent(isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, Float.valueOf(1.0f), (Function1) null, 5, (Object) null), 0.0f, 1.0f, new Function1() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 101;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i2;
                if (i5 != 0) {
                    return TdsCheckBoxV2View.onWarmupCompleted(i6, iOnNavigationEvent, this, ((Float) obj).floatValue());
                }
                TdsCheckBoxV2View.onWarmupCompleted(i6, iOnNavigationEvent, this, ((Float) obj).floatValue());
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, new Function1() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 53;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                Unit unitIAuthTabCallback = TdsCheckBoxV2View.IAuthTabCallback((attachAppLovinSdk) obj);
                int i6 = onExtraCallback + 17;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return unitIAuthTabCallback;
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), null, new Function0() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 45;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnWarmupCompleted = TdsCheckBoxV2View.onWarmupCompleted(this.f$0);
                if (i5 == 0) {
                    int i6 = 46 / 0;
                }
                return unitOnWarmupCompleted;
            }
        }, 1, null);
        int i3 = ICustomTabsCallback_Parcel + 59;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        return rallyOnTransact;
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = TdsCheckBoxV2View.this.new IAuthTabCallbackDefault(access13800Var);
            int i2 = onExtraCallback + 93;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 11 / 0;
            }
            return iAuthTabCallbackDefault;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 91;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            IAuthTabCallbackDefault iAuthTabCallbackDefaultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                iAuthTabCallbackDefaultCreate.invokeSuspend(unit);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackDefaultCreate.invokeSuspend(unit);
            int i4 = onNavigationEvent + 67;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback;
                int i4 = i3 + 25;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i3 + 63;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(obj);
                int i8 = onExtraCallback + 69;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                TdsCheckBoxV2View tdsCheckBoxV2View = TdsCheckBoxV2View.this;
                TdsCheckBoxV2View.onExtraCallback(tdsCheckBoxV2View, (Rally) TdsCheckBoxV2View.onExtraCallback(1015049759, new Object[]{tdsCheckBoxV2View}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1015049759));
                Rally rally = (Rally) TdsCheckBoxV2View.onExtraCallback(1940866258, new Object[]{TdsCheckBoxV2View.this}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1940866255);
                if (rally != null) {
                }
                long jIntValue = ((Integer) TdsCheckBoxV2View.onExtraCallback(-1719948499, new Object[]{TdsCheckBoxV2View.this}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1719948506)).intValue();
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(jIntValue, this) == objOnWarmupCompleted) {
                    int i10 = onNavigationEvent + 93;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    return objOnWarmupCompleted;
                }
            }
            Rally rally2 = (Rally) TdsCheckBoxV2View.onExtraCallback(1940866258, new Object[]{TdsCheckBoxV2View.this}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1940866255);
            if (rally2 != null) {
                rally2.ICustomTabsServiceStub();
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit getInterfaceDescriptor(TdsCheckBoxV2View tdsCheckBoxV2View) {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 43;
        ICustomTabsCallback_Parcel = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Rally rally = tdsCheckBoxV2View.onActivityLayout;
            if (rally != null) {
                int i4 = i2 + 59;
                ICustomTabsCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                if (rally.postMessage()) {
                    maybeUpdateAnimatable.onNavigationEvent(tdsCheckBoxV2View.mayLaunchUrl, (CoroutineContext) null, (setRandomHost) null, tdsCheckBoxV2View.new IAuthTabCallbackDefault(null), 3, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
        Rally rally2 = tdsCheckBoxV2View.onActivityLayout;
        obj.hashCode();
        throw null;
    }

    private final Rally onMinimized() {
        int i = 2 % 2;
        Rally rallyOnExtraCallbackWithResult = Rally.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{this, isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), null, Float.valueOf(1.1f), null, 5, null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new Function0() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View$$ExternalSyntheticLambda14
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                Unit unitOnExtraCallbackWithResult;
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 21;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    unitOnExtraCallbackWithResult = TdsCheckBoxV2View.onExtraCallbackWithResult(this.f$0);
                    int i4 = 60 / 0;
                } else {
                    unitOnExtraCallbackWithResult = TdsCheckBoxV2View.onExtraCallbackWithResult(this.f$0);
                }
                int i5 = onExtraCallback + 77;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, 1, (Object) null);
        int i2 = extraCommand + 63;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return rallyOnExtraCallbackWithResult;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c A[PHI: r2
      0x001c: PHI (r2v3 im.toss.tds.foundation.anim.rally.Rally) = (r2v2 im.toss.tds.foundation.anim.rally.Rally), (r2v8 im.toss.tds.foundation.anim.rally.Rally) binds: [B:8:0x001a, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit access000(TdsCheckBoxV2View tdsCheckBoxV2View) {
        Rally rally;
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 7;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            rally = tdsCheckBoxV2View.IAuthTabCallback_Parcel;
            int i4 = 28 / 0;
            if (rally != null) {
                int i5 = i2 + 97;
                ICustomTabsCallback_Parcel = i5 % 128;
                if (i5 % 2 != 0 ? rally.postMessage() : rally.postMessage()) {
                    tdsCheckBoxV2View.ICustomTabsCallbackStub = (Rally) isFireOS.onExtraCallbackWithResult(tdsCheckBoxV2View.onRelationshipValidationResult(), false, 1, null);
                    int i6 = ICustomTabsCallback_Parcel + 73;
                    extraCommand = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    Rally rally2 = tdsCheckBoxV2View.onActivityLayout;
                    if (rally2 != null) {
                        int i8 = extraCommand + 81;
                        ICustomTabsCallback_Parcel = i8 % 128;
                        if (i8 % 2 != 0 ? rally2.postMessage() : rally2.postMessage()) {
                        }
                    }
                }
            }
        } else {
            rally = tdsCheckBoxV2View.IAuthTabCallback_Parcel;
            if (rally != null) {
            }
        }
        return Unit.INSTANCE;
    }

    private final Rally onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 17;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{this, isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onWarmupCompleted()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), null, Float.valueOf(1.0f), null, 5, null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        int i4 = extraCommand + 9;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return rally;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onUnminimized() {
        int i = 2 % 2;
        post(new Runnable() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 125;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    TdsCheckBoxV2View.onTransact(this.f$0);
                    int i4 = 85 / 0;
                } else {
                    TdsCheckBoxV2View.onTransact(this.f$0);
                }
                int i5 = onExtraCallback + 125;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = ICustomTabsCallback_Parcel + 85;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 50 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void IAuthTabCallback_Parcel(TdsCheckBoxV2View tdsCheckBoxV2View) {
        int i = 2 % 2;
        int i2 = extraCommand + 45;
        ICustomTabsCallback_Parcel = i2 % 128;
        tdsCheckBoxV2View.onExtraCallback(i2 % 2 == 0 ? 0.0f : 1.0f);
        tdsCheckBoxV2View.setAlpha(0.4f);
        int i3 = extraCommand + 75;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isPressed() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 111;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.IAuthTabCallback;
        int i5 = i2 + 119;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setAnimationEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 63;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        this.access100 = z;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 39;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        int i = 2 % 2;
        int i2 = extraCommand + 31;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return z;
    }

    @Override // android.widget.Checkable
    public void toggle() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = extraCommand + 97;
        ICustomTabsCallback_Parcel = i2 % 128;
        setChecked(i2 % 2 == 0 ? this.onWarmupCompleted : !this.onWarmupCompleted);
        int i3 = ICustomTabsCallback_Parcel + 91;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Checkable
    public void setChecked(boolean z) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 53;
        extraCommand = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (this.onWarmupCompleted != z) {
                this.onWarmupCompleted = z;
                ICustomTabsCallback();
                if (isAttachedToWindow()) {
                    onNavigationEvent(this.onWarmupCompleted, isEnabled(), this.access100);
                } else {
                    boolean z2 = this.access100;
                    setAnimationEnabled(false);
                    onNavigationEvent(this.onWarmupCompleted, isEnabled(), this.access100);
                    setAnimationEnabled(z2);
                }
                if (this.extraCallbackWithResult) {
                    int i3 = extraCommand + 105;
                    ICustomTabsCallback_Parcel = i3 % 128;
                    if (i3 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    onExtraCallback onextracallback = this.onPostMessage;
                    if (onextracallback != null) {
                        onextracallback.IAuthTabCallback(this, this.onWarmupCompleted);
                    }
                }
                sendAccessibilityEvent(1);
                if (getInstallBeginTimestampServerSeconds.asInterface(this)) {
                    onInstallReferrerSetupFinished.onExtraCallback(onInstallReferrerSetupFinished.onWarmupCompleted, this, (initMiniApp) null, 2, (Object) null);
                    return;
                }
                return;
            }
            return;
        }
        obj.hashCode();
        throw null;
    }

    public boolean isEnabled() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 111;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setEnabled(boolean z) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 103;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 32 / 0;
            if (this.onExtraCallback != z) {
                this.onExtraCallback = z;
            }
        } else if (this.onExtraCallback != z) {
        }
        onNavigationEvent(this.onWarmupCompleted, z, false);
        int i4 = extraCommand + 53;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onNavigationEvent(boolean z, boolean z2, boolean z3) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        if (z) {
            int i2 = onExtraCallbackWithResult.onNavigationEvent[this.onUnminimized.ordinal()];
            if (i2 == 1) {
                onNavigationEvent(z2, z3);
                return;
            }
            if (i2 != 2) {
                int i3 = extraCommand + 123;
                ICustomTabsCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            IAuthTabCallback(z2, z3);
            return;
        }
        int i5 = onExtraCallbackWithResult.onNavigationEvent[this.onUnminimized.ordinal()];
        if (i5 != 1) {
            if (i5 != 2 && i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            onExtraCallbackWithResult(z2, z3);
            return;
        }
        onExtraCallback(z2, z3);
        int i6 = extraCommand + 17;
        ICustomTabsCallback_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 18 / 0;
        }
    }

    public final void setCheckedState(boolean z) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 41;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        isChecked();
        this.extraCallbackWithResult = false;
        setChecked(z);
        this.extraCallbackWithResult = true;
        int i4 = extraCommand + 77;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackStub implements onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Function2<TdsCheckBoxV2View, Boolean, Unit> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallbackStub(Function2<? super TdsCheckBoxV2View, ? super Boolean, Unit> function2) {
            this.onWarmupCompleted = function2;
        }

        @Override // im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View.onExtraCallback
        public void IAuthTabCallback(TdsCheckBoxV2View tdsCheckBoxV2View, boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(tdsCheckBoxV2View, "");
                this.onWarmupCompleted.invoke(tdsCheckBoxV2View, Boolean.valueOf(z));
                int i3 = 58 / 0;
            } else {
                Intrinsics.checkNotNullParameter(tdsCheckBoxV2View, "");
                this.onWarmupCompleted.invoke(tdsCheckBoxV2View, Boolean.valueOf(z));
            }
            int i4 = onExtraCallback + 17;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    public final void setOnCheckedChangeListener(@NotNull Function2<? super TdsCheckBoxV2View, ? super Boolean, Unit> function2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        setOnCheckedChangeListener(new IAuthTabCallbackStub(function2));
        int i2 = extraCommand + 37;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void setOnCheckedChangeListener(@Nullable onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 77;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        this.onPostMessage = onextracallback;
        int i5 = i2 + 115;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void setStateDescription(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 1;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.asInterface = str;
        this.isEngagementSignalsApiAvailable = str2;
        ICustomTabsCallback();
        int i4 = extraCommand + 45;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ICustomTabsCallback() {
        String str;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 87;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        if (this.onWarmupCompleted) {
            str = this.asInterface;
            int i5 = i3 + 59;
            ICustomTabsCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str = this.isEngagementSignalsApiAvailable;
        }
        ViewCompat.onWarmupCompleted(this, str);
        int i7 = ICustomTabsCallback_Parcel + 43;
        extraCommand = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityEvent(@NotNull AccessibilityEvent accessibilityEvent) {
        int i = 2 % 2;
        int i2 = extraCommand + 121;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(accessibilityEvent, "");
        super/*android.view.View*/.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setChecked(isChecked());
        int i4 = ICustomTabsCallback_Parcel + 5;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo accessibilityNodeInfo) {
        int i = 2 % 2;
        int i2 = extraCommand + 1;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(isChecked());
        int i4 = extraCommand + 117;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
    }

    public CharSequence getAccessibilityClassName() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 107;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 65 / 0;
        }
        int i5 = i2 + 25;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            return "android.widget.CheckBox";
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = extraCommand + 73;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        int iIAuthTabCallback = varyMatches.IAuthTabCallback((View) this, (Number) Float.valueOf(this.onNavigationEvent.getDpValue()));
        if (getLayoutParams().width == -2) {
            int i6 = extraCommand + 39;
            ICustomTabsCallback_Parcel = i6 % 128;
            if (i6 % 2 == 0) {
                i = View.MeasureSpec.makeMeasureSpec(iIAuthTabCallback, 1073741824);
                int i7 = 30 / 0;
            } else {
                i = View.MeasureSpec.makeMeasureSpec(iIAuthTabCallback, 1073741824);
            }
        }
        if (getLayoutParams().height == -2) {
            int i8 = ICustomTabsCallback_Parcel + 81;
            extraCommand = i8 % 128;
            if (i8 % 2 != 0) {
                View.MeasureSpec.makeMeasureSpec(iIAuthTabCallback, 1073741824);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 = View.MeasureSpec.makeMeasureSpec(iIAuthTabCallback, 1073741824);
        }
        super.onMeasure(i, i2);
        int iFloatValue = (int) ((Float) onExtraCallback(1605555957, new Object[]{this}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1605555948)).floatValue();
        float measuredWidth = getMeasuredWidth() - (iFloatValue * 2.0f);
        this.asBinder.setStrokeWidth(((measuredWidth / 2.0f) - ((measuredWidth * (this.onTransact + 1.0f)) / 4.0f)) * 2.0f);
        Drawable drawable = this.getInterfaceDescriptor;
        if (drawable != null) {
            int i9 = ICustomTabsCallback_Parcel + 115;
            extraCommand = i9 % 128;
            int i10 = i9 % 2;
            drawable.setBounds(iFloatValue, iFloatValue, getMeasuredWidth() - iFloatValue, getMeasuredHeight() - iFloatValue);
            int i11 = extraCommand + 33;
            ICustomTabsCallback_Parcel = i11 % 128;
            int i12 = i11 % 2;
        }
        Drawable drawable2 = this.readTypedObject;
        if (drawable2 != null) {
            drawable2.setBounds(iFloatValue, iFloatValue, getMeasuredWidth() - iFloatValue, getMeasuredHeight() - iFloatValue);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public void dispatchDraw(@NotNull Canvas canvas) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        float fFloatValue = (int) ((Float) onExtraCallback(1605555957, new Object[]{this}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1605555948)).floatValue();
        float measuredWidth = getMeasuredWidth() - (fFloatValue * 2.0f);
        float f = measuredWidth / 2.0f;
        int i2 = onExtraCallbackWithResult.onNavigationEvent[this.onUnminimized.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                int i3 = ICustomTabsCallback_Parcel + 13;
                extraCommand = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 3 : i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Drawable drawable = this.readTypedObject;
            if (drawable != null) {
                canvas.save();
                canvas.scale(getScaleX(), getScaleY(), getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                drawable.draw(canvas);
                canvas.restore();
            }
        } else {
            float f2 = fFloatValue + f;
            canvas.drawCircle(f2, f2, f, this.IAuthTabCallbackStub);
            canvas.drawCircle(f2, f2, (measuredWidth * (this.onTransact + 1.0f)) / 4.0f, this.asBinder);
            Drawable drawable2 = this.getInterfaceDescriptor;
            if (drawable2 != null) {
                int i4 = ICustomTabsCallback_Parcel + 75;
                extraCommand = i4 % 128;
                if (i4 % 2 != 0) {
                    canvas.save();
                    canvas.scale(getScaleX(), getScaleY(), getMeasuredWidth() / 0.0f, getMeasuredHeight() - 1.0f);
                } else {
                    canvas.save();
                    canvas.scale(getScaleX(), getScaleY(), getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                }
                drawable2.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        onInstallReferrerServiceDisconnected.onExtraCallbackWithResult(onInstallReferrerServiceDisconnected.onExtraCallback, this, canvas, (SizeF) null, 4, (Object) null);
        int i5 = extraCommand + 101;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = extraCommand + 25;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            setScaleX(f);
            setScaleY(f);
            int i3 = 7 / 0;
        } else {
            setScaleX(f);
            setScaleY(f);
        }
        int i4 = extraCommand + 23;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        TdsCheckBoxV2View tdsCheckBoxV2View = (TdsCheckBoxV2View) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = extraCommand + 21;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        tdsCheckBoxV2View.onNavigationEvent(iIntValue);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        int i5 = ICustomTabsCallback_Parcel + 11;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        TdsCheckBoxV2View tdsCheckBoxV2View = (TdsCheckBoxV2View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 25;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            tdsCheckBoxV2View.writeTypedObject = false;
        } else {
            tdsCheckBoxV2View.writeTypedObject = true;
        }
        Unit unit = Unit.INSTANCE;
        int i3 = ICustomTabsCallback_Parcel + 29;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 41 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsCallbackStub() {
        int i = 2 % 2;
        Object[] objArr = {Rally.onTransact(RallysKt.onWarmupCompleted((View) this, (List) deprecated_proxy.onNavigationEvent.onExtraCallbackWithResult(deprecated_proxySelector.SMALL, EnumC0079certificatePinner.X).onNavigationEvent(), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null), null, new Function0() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View$$ExternalSyntheticLambda9
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 81;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitAsBinder = TdsCheckBoxV2View.asBinder(this.f$0);
                int i5 = onNavigationEvent + 23;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitAsBinder;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, 1, null), null, new Function0() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View$$ExternalSyntheticLambda10
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 19;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                TdsCheckBoxV2View tdsCheckBoxV2View = this.f$0;
                if (i4 == 0) {
                    return TdsCheckBoxV2View.IAuthTabCallbackStub(tdsCheckBoxV2View);
                }
                TdsCheckBoxV2View.IAuthTabCallbackStub(tdsCheckBoxV2View);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, 1, null};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        isFireOS.onExtraCallbackWithResult((Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, iOnExtraCallback, objArr, 2128644226), false, 1, null);
        int i2 = ICustomTabsCallback_Parcel + 95;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TdsCheckBoxV2View tdsCheckBoxV2View = (TdsCheckBoxV2View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 69;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        tdsCheckBoxV2View.writeTypedObject = false;
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 75;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 17;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        this.onActivityResized = onClickListener;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 69;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean hasOnClickListeners() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 21;
        int i4 = i3 % 128;
        extraCommand = i4;
        int i5 = i3 % 2;
        if (this.onActivityResized == null) {
            int i6 = i2 + 71;
            extraCommand = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i7 = i4 + 63;
        int i8 = i7 % 128;
        ICustomTabsCallback_Parcel = i8;
        boolean z = i7 % 2 != 0;
        int i9 = i8 + 13;
        extraCommand = i9 % 128;
        int i10 = i9 % 2;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean performClick() throws NoWhenBranchMatchedException {
        boolean zPerformClick;
        int i = 2 % 2;
        int i2 = extraCommand + 47;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            varyFields.onWarmupCompleted(getContext());
            throw null;
        }
        if (varyFields.onWarmupCompleted(getContext())) {
            View.OnClickListener onClickListener = this.onActivityResized;
            if (onClickListener == null) {
                toggle();
            } else if (onClickListener != null) {
                onClickListener.onClick(this);
            }
            zPerformClick = true;
        } else {
            zPerformClick = super/*android.view.View*/.performClick();
        }
        onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, this, (initMiniApp) null, 2, (Object) null);
        int i3 = ICustomTabsCallback_Parcel + 91;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        return zPerformClick;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 107;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.onAttachedToWindow();
        getPackageType.onWarmupCompleted.onWarmupCompleted(this.ICustomTabsCallback, (CancellationException) null, 1, (Object) null);
        this.ICustomTabsCallback = isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null);
        this.mayLaunchUrl = findRes.onWarmupCompleted(putChannelInfo.onExtraCallback().plus(this.ICustomTabsCallback));
        int i4 = extraCommand + 79;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDetachedFromWindow() {
        waitForLayout waitforlayout;
        int i;
        int i2 = 2 % 2;
        int i3 = extraCommand + 119;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            super/*android.view.View*/.onDetachedFromWindow();
            waitforlayout = this.ICustomTabsCallback;
            i = 0;
        } else {
            super/*android.view.View*/.onDetachedFromWindow();
            waitforlayout = this.ICustomTabsCallback;
            i = 1;
        }
        getPackageType.onWarmupCompleted.onWarmupCompleted(waitforlayout, (CancellationException) null, i, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r5 = im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View.ICustomTabsCallback_Parcel + 91;
        im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View.extraCommand = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        return super/*o.setDeviceId*\/.onNavigationEvent(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r1 != 2) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onNavigationEvent(@NotNull ICrashFilter iCrashFilter) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = extraCommand + 63;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iCrashFilter, "");
            i = onExtraCallbackWithResult.IAuthTabCallback[iCrashFilter.ordinal()];
        } else {
            Intrinsics.checkNotNullParameter(iCrashFilter, "");
            i = onExtraCallbackWithResult.IAuthTabCallback[iCrashFilter.ordinal()];
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TdsCheckBoxV2View tdsCheckBoxV2View, int i, int i2, float f) {
        return (Unit) onExtraCallback(304379631, new Object[]{tdsCheckBoxV2View, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f)}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -304379620);
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsCheckBoxV2View tdsCheckBoxV2View, initSDK.onNavigationEvent onnavigationevent) {
        return (Unit) onExtraCallback(510660801, new Object[]{tdsCheckBoxV2View, onnavigationevent}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -510660793);
    }

    public static final /* synthetic */ Rally asInterface(TdsCheckBoxV2View tdsCheckBoxV2View) {
        return (Rally) onExtraCallback(1940866258, new Object[]{tdsCheckBoxV2View}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1940866255);
    }

    public static final /* synthetic */ Rally IAuthTabCallbackDefault(TdsCheckBoxV2View tdsCheckBoxV2View) {
        return (Rally) onExtraCallback(1015049759, new Object[]{tdsCheckBoxV2View}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1015049759);
    }

    private final float readTypedObject() {
        return ((Float) onExtraCallback(1605555957, new Object[]{this}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1605555948)).floatValue();
    }

    private final Rally onMessageChannelReady() {
        return (Rally) onExtraCallback(756996069, new Object[]{this}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -756996067);
    }

    private static final Unit onWarmupCompleted(TdsCheckBoxV2View tdsCheckBoxV2View, int i, int i2, int i3, int i4, int i5, float f) {
        return (Unit) onExtraCallback(-1486436202, new Object[]{tdsCheckBoxV2View, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Float.valueOf(f)}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1486436203);
    }

    private static final Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onExtraCallback(-382184477, new Object[]{attachapplovinsdk}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 382184482);
    }

    private static final Unit extraCallback(TdsCheckBoxV2View tdsCheckBoxV2View) {
        return (Unit) onExtraCallback(-352523368, new Object[]{tdsCheckBoxV2View}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 352523378);
    }

    private static final Unit extraCallbackWithResult(TdsCheckBoxV2View tdsCheckBoxV2View) {
        return (Unit) onExtraCallback(-946653077, new Object[]{tdsCheckBoxV2View}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 946653081);
    }

    private final void IAuthTabCallback(int i) {
        onExtraCallback(-470838291, new Object[]{this, Integer.valueOf(i)}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 470838297);
    }
}
