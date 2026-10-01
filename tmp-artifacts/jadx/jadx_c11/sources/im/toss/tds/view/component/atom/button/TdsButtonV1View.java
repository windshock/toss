package im.toss.tds.view.component.atom.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.res.ResourcesCompat;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallyCanvas;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.foundation.graphics.drawable.RoundDrawable;
import im.toss.tds.view.component.atom.button.TdsButtonV1View$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import o.Address;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.AppLovinSdkSettings;
import o.ConnectionPool;
import o.EnumC0079certificatePinner;
import o.ICrashFilter;
import o.RequestBody;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.VectorConvertersKtExternalSyntheticLambda8;
import o.access13800;
import o.access14300;
import o.access15300;
import o.access8100;
import o.accessgetTlsVersionsAsStringp;
import o.authParams;
import o.clearFaultAdjacentMetadata;
import o.connectionCount;
import o.deprecated_cacheResponse;
import o.deprecated_certificatePinner;
import o.deprecated_code;
import o.deprecated_dns;
import o.deprecated_noStore;
import o.deprecated_noTransform;
import o.deprecated_priorResponse;
import o.deprecated_proxy;
import o.deprecated_proxySelector;
import o.eExternalSyntheticLambda0;
import o.enableThreadsBoost;
import o.findResAndMsg;
import o.formatMsgs;
import o.getBacktraceNoteBytes;
import o.getDEFAULT_PROTOCOLSokhttp;
import o.getDid;
import o.getExtraParameters;
import o.getHostnameVerifierokhttp;
import o.getInstallBeginTimestampServerSeconds;
import o.getPackageType;
import o.getReferrerClickTimestampSeconds;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.handleRemoveKey;
import o.head;
import o.initMiniApp;
import o.initSDK;
import o.isFireOS;
import o.isMuted;
import o.isOneShot;
import o.maybeUpdateAnimatable;
import o.noStore;
import o.onCrash;
import o.onInstallReferrerServiceDisconnected;
import o.onInstallReferrerSetupFinished;
import o.protocol;
import o.pxToDp;
import o.readIntokhttp;
import o.registerCrashCallback;
import o.removeHeader;
import o.reportCustomErr;
import o.response;
import o.runOnUiThreadDelayed;
import o.setBodyokhttp;
import o.setCallTimeoutokhttp;
import o.setCertificateChainCleanerokhttp;
import o.setCertificatePinnerokhttp;
import o.setCustomDataCallback;
import o.setHasUserConsent;
import o.setRandomHost;
import o.setTagsokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class TdsButtonV1View extends AppCompatButton implements getHostnameVerifierokhttp, registerCrashCallback {
    private static int IEngagementSignalsCallbackStubProxy = 1;
    private static int IPostMessageServiceDefault = 0;
    private static int ITrustedWebActivityCallback = 1;
    private static int ITrustedWebActivityCallbackDefault;
    private Bitmap IAuthTabCallbackDefault;
    private Boolean IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private onExtraCallbackWithResult IAuthTabCallback_Parcel;
    private Map<Pair<IAuthTabCallbackDefault, IAuthTabCallbackStub>, setCertificatePinnerokhttp> ICustomTabsCallback;
    private Bitmap ICustomTabsCallbackDefault;
    private float ICustomTabsCallbackStub;
    private Float ICustomTabsCallbackStubProxy;
    private float ICustomTabsCallback_Parcel;
    private float ICustomTabsService;
    private final Float[] ICustomTabsServiceDefault;
    private final Float[] ICustomTabsServiceStub;
    private onWarmupCompleted ICustomTabsServiceStubProxy;
    private IAuthTabCallbackDefault ICustomTabsService_Parcel;
    private final RallyCanvas IEngagementSignalsCallback;
    private final Float[] IEngagementSignalsCallbackDefault;
    private IAuthTabCallbackStub IEngagementSignalsCallbackStub;
    private final head IEngagementSignalsCallback_Parcel;
    private int IPostMessageService;
    private Rally IPostMessageServiceStub;
    private float access000;
    private int access100;
    private onNavigationEvent access200;
    private boolean asBinder;
    private Rect asInterface;
    private float extraCallback;
    private boolean extraCallbackWithResult;
    private Paint extraCommand;
    private Drawable getInterfaceDescriptor;
    private float isEngagementSignalsApiAvailable;
    private Rect mayLaunchUrl;
    private final Float[] newAuthTabSession;
    private boolean newSession;
    private boolean newSessionWithExtras;
    private IAuthTabCallback onActivityLayout;
    private getPackageType onActivityResized;
    private Boolean onExtraCallback;
    private final Integer[] onGreatestScrollPercentageIncreased;
    private Rect onMessageChannelReady;
    private setCertificateChainCleanerokhttp onMinimized;
    private runOnUiThreadDelayed onNavigationEvent;
    private int onPostMessage;
    private final RallyCanvas onRelationshipValidationResult;
    private float onSessionEnded;
    private float onTransact;
    private final Paint onUnminimized;
    private float onVerticalScrollEvent;
    private final List<RallyCanvas> postMessage;
    private boolean prefetch;
    private final Paint prefetchWithMultipleUrls;
    private float readTypedObject;
    private final Float[] receiveFile;
    private final Paint requestPostMessageChannel;
    private final Float[] requestPostMessageChannelWithExtras;
    private final RallyCanvas setEngagementSignalsCallback;
    private final Lazy updateVisuals;
    private runOnUiThreadDelayed validateRelationship;
    private long warmup;
    private setCertificatePinnerokhttp writeTypedList;
    private boolean writeTypedObject;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final float onWarmupCompleted = 0.3f;
    private static final float onExtraCallbackWithResult = 0.4f;

    public interface onNavigationEvent {
        void onExtraCallbackWithResult(@NotNull View view, boolean z);
    }

    public static final /* synthetic */ class onTransact {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int IAuthTabCallbackDefault = 1;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[getSpecialFeatureOptInStatus.values().length];
            try {
                iArr[getSpecialFeatureOptInStatus.Light.ordinal()] = 1;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getSpecialFeatureOptInStatus.Dark.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
            int[] iArr2 = new int[IAuthTabCallbackDefault.values().length];
            try {
                iArr2[IAuthTabCallbackDefault.FILL.ordinal()] = 1;
                int i2 = IAuthTabCallbackDefault + 117;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[IAuthTabCallbackDefault.WEAK.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            onNavigationEvent = iArr2;
            int[] iArr3 = new int[IAuthTabCallbackStub.values().length];
            try {
                iArr3[IAuthTabCallbackStub.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[IAuthTabCallbackStub.DANGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[IAuthTabCallbackStub.DARK.ordinal()] = 3;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[IAuthTabCallbackStub.LIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            onWarmupCompleted = iArr3;
            int[] iArr4 = new int[onExtraCallbackWithResult.values().length];
            try {
                iArr4[onExtraCallbackWithResult.LOADING_DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[onExtraCallbackWithResult.DISABLED.ordinal()] = 2;
                int i5 = IAuthTabCallbackDefault + 109;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[onExtraCallbackWithResult.ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            onExtraCallback = iArr4;
        }
    }

    /* JADX WARN: Type inference failed for: r7v10, types: [android.view.View, im.toss.tds.view.component.atom.button.TdsButtonV1View] */
    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~(i6 | i3);
        int i11 = i9 | i10;
        int i12 = i9 | (~(i4 | i3)) | i10;
        int i13 = (~(i3 | i4 | i6)) | (~(i8 | (~i6)));
        int i14 = i4 + i6 + i2 + ((-2005657349) * i) + (1476006321 * i5);
        int i15 = i14 * i14;
        int i16 = ((583353605 * i4) - 1319501824) + (407026429 * i6) + ((-176327176) * i11) + (i12 * (-2059320060)) + ((-2059320060) * i13) + ((-1652293632) * i2) + ((-798228480) * i) + ((-1404829696) * i5) + ((-1043726336) * i15);
        int i17 = (i4 * 961754349) + 784684277 + (i6 * 961754277) + (i11 * (-72)) + (i12 * 36) + (i13 * 36) + (i2 * 961754313) + (i * (-1264871149)) + (i5 * 72538105) + (i15 * 798621696);
        switch (i16 + (i17 * i17 * (-1437204480))) {
            case 1:
                TdsButtonV1View tdsButtonV1View = (TdsButtonV1View) objArr[0];
                float fFloatValue = ((Number) objArr[1]).floatValue();
                int i18 = 2 % 2;
                int i19 = IPostMessageServiceDefault + 29;
                IEngagementSignalsCallbackStubProxy = i19 % 128;
                int i20 = i19 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(tdsButtonV1View, fFloatValue);
                int i21 = IEngagementSignalsCallbackStubProxy + 83;
                IPostMessageServiceDefault = i21 % 128;
                int i22 = i21 % 2;
                return unitOnWarmupCompleted;
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                return asBinder(objArr);
            case 10:
                ?? r7 = (TdsButtonV1View) objArr[0];
                onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[1];
                int i23 = 2 % 2;
                int i24 = IPostMessageServiceDefault + 61;
                IEngagementSignalsCallbackStubProxy = i24 % 128;
                int i25 = i24 % 2;
                int iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult((View) r7, ((TdsButtonV1View) r7).ICustomTabsServiceDefault[onwarmupcompleted.getIndex()]);
                int i26 = IEngagementSignalsCallbackStubProxy + 53;
                IPostMessageServiceDefault = i26 % 128;
                int i27 = i26 % 2;
                return Integer.valueOf(iOnExtraCallbackWithResult);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(TdsButtonV1View tdsButtonV1View, initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 11;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tdsButtonV1View, onnavigationevent);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        int i5 = IEngagementSignalsCallbackStubProxy + 5;
        IPostMessageServiceDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        TdsButtonV1View tdsButtonV1View = (TdsButtonV1View) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 1;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Set setOnNavigationEvent = onNavigationEvent(tdsButtonV1View);
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        return setOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(float f, float f2, float f3, TdsButtonV1View tdsButtonV1View, Canvas canvas) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 39;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(f, f2, f3, tdsButtonV1View, canvas);
        int i4 = IEngagementSignalsCallbackStubProxy + 13;
        IPostMessageServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RallyCanvas rallyCanvas, float f, int i, float f2, float f3, float f4, float f5, TdsButtonV1View tdsButtonV1View, Canvas canvas) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStubProxy + 13;
        IPostMessageServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(rallyCanvas, f, i, f2, f3, f4, f5, tdsButtonV1View, canvas);
        int i5 = IEngagementSignalsCallbackStubProxy + 1;
        IPostMessageServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TdsButtonV1View tdsButtonV1View, float f, float f2, float f3, Canvas canvas) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 59;
        IPostMessageServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(tdsButtonV1View, f, f2, f3, canvas);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(tdsButtonV1View, f, f2, f3, canvas);
        int i3 = IEngagementSignalsCallbackStubProxy + 87;
        IPostMessageServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TdsButtonV1View tdsButtonV1View, Canvas canvas) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 13;
        IPostMessageServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(tdsButtonV1View, canvas);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(tdsButtonV1View, canvas);
        int i3 = IPostMessageServiceDefault + 21;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TdsButtonV1View tdsButtonV1View = (TdsButtonV1View) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 3;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(tdsButtonV1View, fFloatValue);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(tdsButtonV1View, fFloatValue);
        int i3 = IPostMessageServiceDefault + 115;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings onNavigationEvent(TdsButtonV1View tdsButtonV1View, boolean z) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 23;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {tdsButtonV1View, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, 239859549, handleRemoveKey.onExtraCallbackWithResult(), -239859542);
        int i4 = IPostMessageServiceDefault + 51;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return appLovinSdkSettings;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTheme() throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 17;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        setTheme$default(this, null, null, null, null, 15, null);
        int i4 = IPostMessageServiceDefault + 105;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setTheme(@NotNull IAuthTabCallbackStub iAuthTabCallbackStub) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 17;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        setTheme$default(this, iAuthTabCallbackStub, null, null, null, i3 != 0 ? 61 : 14, null);
        int i4 = IEngagementSignalsCallbackStubProxy + 31;
        IPostMessageServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void setTheme(@NotNull IAuthTabCallbackStub iAuthTabCallbackStub, @NotNull IAuthTabCallbackDefault iAuthTabCallbackDefault) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 45;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
        setTheme$default(this, iAuthTabCallbackStub, iAuthTabCallbackDefault, null, null, 12, null);
        int i4 = IEngagementSignalsCallbackStubProxy + 121;
        IPostMessageServiceDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setTheme(@NotNull IAuthTabCallbackStub iAuthTabCallbackStub, @NotNull IAuthTabCallbackDefault iAuthTabCallbackDefault, @NotNull onWarmupCompleted onwarmupcompleted) throws Resources.NotFoundException {
        IAuthTabCallback iAuthTabCallback;
        int i;
        int i2 = 2 % 2;
        int i3 = IPostMessageServiceDefault + 59;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        if (i4 == 0) {
            iAuthTabCallback = null;
            i = 126;
        } else {
            iAuthTabCallback = null;
            i = 8;
        }
        setTheme$default(this, iAuthTabCallbackStub, iAuthTabCallbackDefault, onwarmupcompleted, iAuthTabCallback, i, null);
    }

    public static final /* synthetic */ void IAuthTabCallback(TdsButtonV1View tdsButtonV1View, boolean z) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 123;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        tdsButtonV1View.newSession = z;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(TdsButtonV1View tdsButtonV1View, long j) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault;
        int i3 = i2 + 83;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        tdsButtonV1View.warmup = j;
        int i5 = i2 + 21;
        IEngagementSignalsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onExtraCallback(TdsButtonV1View tdsButtonV1View, boolean z) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 59;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        tdsButtonV1View.onExtraCallbackWithResult(z);
        int i4 = IEngagementSignalsCallbackStubProxy + 111;
        IPostMessageServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ long onWarmupCompleted(TdsButtonV1View tdsButtonV1View) {
        long j;
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault;
        int i3 = i2 + 121;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            j = tdsButtonV1View.warmup;
            int i4 = 13 / 0;
        } else {
            j = tdsButtonV1View.warmup;
        }
        int i5 = i2 + 51;
        IEngagementSignalsCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public /* bridge */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 51;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        int i4 = IPostMessageServiceDefault + 63;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return strIAuthTabCallback;
    }

    public /* synthetic */ initSDK IAuthTabCallbackDefault() {
        setCustomDataCallback typedObject;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 1;
        IPostMessageServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            typedObject = readTypedObject();
            int i3 = 95 / 0;
        } else {
            typedObject = readTypedObject();
        }
        int i4 = IPostMessageServiceDefault + 47;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return typedObject;
    }

    public /* bridge */ Set<String> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 25;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
            throw null;
        }
        Set<String> setIAuthTabCallbackStub = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        int i3 = IEngagementSignalsCallbackStubProxy + 77;
        IPostMessageServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        return setIAuthTabCallbackStub;
    }

    public /* bridge */ initSDK IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 75;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        initSDK initsdkIAuthTabCallbackStubProxy = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
        int i4 = IEngagementSignalsCallbackStubProxy + 79;
        IPostMessageServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return initsdkIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    public /* bridge */ boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 15;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback_Parcel = super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        int i4 = IPostMessageServiceDefault + 7;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback_Parcel;
    }

    public /* bridge */ enableThreadsBoost.onNavigationEvent access000() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 35;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        enableThreadsBoost.onNavigationEvent onnavigationeventAccess000 = super/*o.setDeviceId*/.access000();
        int i4 = IPostMessageServiceDefault + 75;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationeventAccess000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean access100() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 95;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess100 = super/*o.initSDK*/.access100();
        int i4 = IPostMessageServiceDefault + 111;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return zAccess100;
    }

    public /* bridge */ Function1<ICrashFilter, Boolean> asBinder() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 19;
        IPostMessageServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.asBinder();
            throw null;
        }
        Function1<ICrashFilter, Boolean> function1AsBinder = super/*o.MonitorCrashConfig*/.asBinder();
        int i3 = IEngagementSignalsCallbackStubProxy + 55;
        IPostMessageServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 31 / 0;
        }
        return function1AsBinder;
    }

    public /* bridge */ boolean extraCallback() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 99;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallback = super/*o.MonitorCrashConfig*/.extraCallback();
        int i4 = IEngagementSignalsCallbackStubProxy + 63;
        IPostMessageServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return zExtraCallback;
    }

    public /* bridge */ initSDK.onNavigationEvent getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 11;
        IPostMessageServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        initSDK.onNavigationEvent interfaceDescriptor = super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
        int i3 = IPostMessageServiceDefault + 15;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return interfaceDescriptor;
    }

    public /* bridge */ initSDK.onNavigationEvent onExtraCallback() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 61;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        initSDK.onNavigationEvent onnavigationeventOnExtraCallback = super/*o.MonitorCrashConfig*/.onExtraCallback();
        int i4 = IPostMessageServiceDefault + 63;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnExtraCallback;
    }

    public /* bridge */ initMiniApp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 93;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp initminiappOnExtraCallbackWithResult = super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
        int i4 = IPostMessageServiceDefault + 105;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return initminiappOnExtraCallbackWithResult;
    }

    public /* bridge */ enableThreadsBoost onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 115;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        enableThreadsBoost enablethreadsboostOnNavigationEvent = super/*o.MonitorCrashConfig*/.onNavigationEvent();
        int i4 = IPostMessageServiceDefault + 83;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return enablethreadsboostOnNavigationEvent;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 11;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(map);
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        int i5 = IPostMessageServiceDefault + 39;
        IEngagementSignalsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull ICrashFilter iCrashFilter) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 85;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(iCrashFilter);
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* bridge */ getDid onTransact() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 69;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        getDid getdidOnTransact = super/*o.MonitorCrashConfig*/.onTransact();
        int i4 = IPostMessageServiceDefault + 5;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return getdidOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 117;
        IPostMessageServiceDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.onWarmupCompleted();
            throw null;
        }
        Map<String, Object> mapOnWarmupCompleted = super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        int i3 = IEngagementSignalsCallbackStubProxy + 101;
        IPostMessageServiceDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return mapOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setAsCtaButton() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 79;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.initSDK*/.setAsCtaButton();
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        int i5 = IPostMessageServiceDefault + 95;
        IEngagementSignalsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ void setComponentKey(@Nullable enableThreadsBoost enablethreadsboost) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 41;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setComponentKey(enablethreadsboost);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ void setCustomParam(@NotNull String str, @NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 17;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParam(str, function1);
        int i4 = IEngagementSignalsCallbackStubProxy + 73;
        IPostMessageServiceDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setCustomParams(@NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 87;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParams(function1);
        int i4 = IEngagementSignalsCallbackStubProxy + 85;
        IPostMessageServiceDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setEventLoggableChecker(@Nullable Function1<? super ICrashFilter, Boolean> function1) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 125;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super/*o.MonitorCrashConfig*/.setEventLoggableChecker(function1);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IEngagementSignalsCallbackStubProxy + 65;
        IPostMessageServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setMaskingWords(@NotNull Set<String> set) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 87;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMaskingWords(set);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IPostMessageServiceDefault + 107;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ void setMetadata(@NotNull getDid getdid) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 105;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMetadata(getdid);
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
    }

    public /* bridge */ void setTrackable(boolean z) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 95;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setTrackable(z);
        int i4 = IPostMessageServiceDefault + 75;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setForcedRadius(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 107;
        IPostMessageServiceDefault = i2 % 128;
        if (i2 % 2 == 0) {
            this.ICustomTabsCallbackStubProxy = f;
            int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
            IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this}, 1225889989, handleRemoveKey.onExtraCallbackWithResult(), -1225889989);
            return;
        }
        this.ICustomTabsCallbackStubProxy = f;
        int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = handleRemoveKey.onExtraCallbackWithResult();
        IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, new Object[]{this}, 1225889989, handleRemoveKey.onExtraCallbackWithResult(), -1225889989);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setCircularCorner(boolean z) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 111;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.prefetch = z;
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this}, 1225889989, handleRemoveKey.onExtraCallbackWithResult(), -1225889989);
        int i4 = IPostMessageServiceDefault + 121;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public setCustomDataCallback readTypedObject() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 107;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.updateVisuals.getValue();
        if (i3 == 0) {
            return (setCustomDataCallback) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Set onNavigationEvent(TdsButtonV1View tdsButtonV1View) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 121;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Set setOnExtraCallback = clearFaultAdjacentMetadata.onExtraCallback(tdsButtonV1View.ICustomTabsCallbackStub());
        int i4 = IEngagementSignalsCallbackStubProxy + 111;
        IPostMessageServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return setOnExtraCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(TdsButtonV1View tdsButtonV1View, initSDK.onNavigationEvent onnavigationevent) {
        String str;
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 29;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            CharSequence[] charSequenceArr = new CharSequence[0];
            charSequenceArr[1] = tdsButtonV1View.ICustomTabsCallbackStub();
            getReferrerClickTimestampSeconds.onWarmupCompleted(onnavigationevent, "theme", charSequenceArr);
            str = tdsButtonV1View.isEnabled() ? "Y" : "N";
        } else {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            getReferrerClickTimestampSeconds.onWarmupCompleted(onnavigationevent, "theme", new CharSequence[]{tdsButtonV1View.ICustomTabsCallbackStub()});
            if (tdsButtonV1View.isEnabled()) {
            }
        }
        getReferrerClickTimestampSeconds.onWarmupCompleted(onnavigationevent, "enable_yn", new CharSequence[]{str});
        Unit unit = Unit.INSTANCE;
        int i3 = IEngagementSignalsCallbackStubProxy + 35;
        IPostMessageServiceDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallbackDefault {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallbackDefault[] $VALUES;
        public static final onNavigationEvent Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private final int index;
        public static final IAuthTabCallbackDefault FILL = new IAuthTabCallbackDefault("FILL", 0, 0);
        public static final IAuthTabCallbackDefault WEAK = new IAuthTabCallbackDefault("WEAK", 1, 1);

        private static final /* synthetic */ IAuthTabCallbackDefault[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            IAuthTabCallbackDefault[] iAuthTabCallbackDefaultArr = {FILL, WEAK};
            int i5 = i3 + 59;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallbackDefaultArr;
        }

        public static EnumEntries<IAuthTabCallbackDefault> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<IAuthTabCallbackDefault> enumEntries = $ENTRIES;
            if (i3 == 0) {
                int i4 = 28 / 0;
            }
            return enumEntries;
        }

        public static IAuthTabCallbackDefault valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) Enum.valueOf(IAuthTabCallbackDefault.class, str);
            if (i3 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onExtraCallback + 95;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackDefault;
        }

        public static IAuthTabCallbackDefault[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault[] iAuthTabCallbackDefaultArr = (IAuthTabCallbackDefault[]) $VALUES.clone();
            int i4 = onExtraCallback + 35;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackDefaultArr;
        }

        private IAuthTabCallbackDefault(String str, int i, int i2) {
            this.index = i2;
        }

        public final int getIndex() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 35;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.index;
            int i6 = i2 + 125;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        static {
            IAuthTabCallbackDefault[] iAuthTabCallbackDefaultArr$values = $values();
            $VALUES = iAuthTabCallbackDefaultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackDefaultArr$values);
            Companion = new onNavigationEvent(null);
            int i = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 77 / 0;
            }
        }

        public static final class onNavigationEvent {
            public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onNavigationEvent() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallbackStub {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallbackStub[] $VALUES;
        public static final onExtraCallback Companion;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final int index;
        public static final IAuthTabCallbackStub PRIMARY = new IAuthTabCallbackStub("PRIMARY", 0, 0);
        public static final IAuthTabCallbackStub DANGER = new IAuthTabCallbackStub("DANGER", 1, 1);
        public static final IAuthTabCallbackStub DARK = new IAuthTabCallbackStub("DARK", 2, 2);
        public static final IAuthTabCallbackStub LIGHT = new IAuthTabCallbackStub("LIGHT", 3, 3);

        private static final /* synthetic */ IAuthTabCallbackStub[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 21;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallbackStub[] iAuthTabCallbackStubArr = {PRIMARY, DANGER, DARK, LIGHT};
            int i5 = i2 + 19;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return iAuthTabCallbackStubArr;
            }
            throw null;
        }

        public static EnumEntries<IAuthTabCallbackStub> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<IAuthTabCallbackStub> enumEntries = $ENTRIES;
            int i5 = i3 + 105;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 54 / 0;
            }
            return enumEntries;
        }

        public static IAuthTabCallbackStub valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = (IAuthTabCallbackStub) Enum.valueOf(IAuthTabCallbackStub.class, str);
            int i4 = onExtraCallback + 99;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 93 / 0;
            }
            return iAuthTabCallbackStub;
        }

        public static IAuthTabCallbackStub[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackStub[] iAuthTabCallbackStubArr = (IAuthTabCallbackStub[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 19;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iAuthTabCallbackStubArr;
            }
            throw null;
        }

        private IAuthTabCallbackStub(String str, int i, int i2) {
            this.index = i2;
        }

        public final int getIndex() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = this.index;
            int i6 = i3 + 19;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            throw null;
        }

        static {
            IAuthTabCallbackStub[] iAuthTabCallbackStubArr$values = $values();
            $VALUES = iAuthTabCallbackStubArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackStubArr$values);
            Companion = new onExtraCallback(null);
            int i = onExtraCallbackWithResult + 93;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public static final class onExtraCallback {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallback() {
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            public final IAuthTabCallbackStub onExtraCallback(@NotNull String str) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 97;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String lowerCase = str.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                switch (lowerCase.hashCode()) {
                    case -1339091421:
                        if (!(!lowerCase.equals("danger"))) {
                            return IAuthTabCallbackStub.DANGER;
                        }
                        break;
                    case -314765822:
                        if (lowerCase.equals("primary")) {
                            int i4 = onExtraCallbackWithResult + 55;
                            onNavigationEvent = i4 % 128;
                            int i5 = i4 % 2;
                            return IAuthTabCallbackStub.PRIMARY;
                        }
                        break;
                    case 3075958:
                        if (lowerCase.equals("dark")) {
                            int i6 = onExtraCallbackWithResult + 87;
                            onNavigationEvent = i6 % 128;
                            if (i6 % 2 != 0) {
                                IAuthTabCallbackStub iAuthTabCallbackStub = IAuthTabCallbackStub.DARK;
                                throw null;
                            }
                            IAuthTabCallbackStub iAuthTabCallbackStub2 = IAuthTabCallbackStub.DARK;
                            int i7 = onNavigationEvent + 35;
                            onExtraCallbackWithResult = i7 % 128;
                            int i8 = i7 % 2;
                            return iAuthTabCallbackStub2;
                        }
                        break;
                    case 102970646:
                        if (lowerCase.equals("light")) {
                            return IAuthTabCallbackStub.LIGHT;
                        }
                        break;
                }
                IAuthTabCallbackStub iAuthTabCallbackStub3 = IAuthTabCallbackStub.PRIMARY;
                int i9 = onExtraCallbackWithResult + 49;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                return iAuthTabCallbackStub3;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final int index;
        public static final onWarmupCompleted XLARGE = new onWarmupCompleted("XLARGE", 0, 0);
        public static final onWarmupCompleted LARGE = new onWarmupCompleted("LARGE", 1, 1);
        public static final onWarmupCompleted MEDIUM = new onWarmupCompleted("MEDIUM", 2, 2);
        public static final onWarmupCompleted SMALL = new onWarmupCompleted("SMALL", 3, 3);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                onWarmupCompleted onwarmupcompleted = XLARGE;
                onWarmupCompleted onwarmupcompleted2 = LARGE;
                onWarmupCompleted onwarmupcompleted3 = MEDIUM;
                onWarmupCompleted onwarmupcompleted4 = SMALL;
                onwarmupcompletedArr = new onWarmupCompleted[5];
                onwarmupcompletedArr[0] = onwarmupcompleted;
                onwarmupcompletedArr[1] = onwarmupcompleted2;
                onwarmupcompletedArr[4] = onwarmupcompleted3;
                onwarmupcompletedArr[5] = onwarmupcompleted4;
            } else {
                onwarmupcompletedArr = new onWarmupCompleted[]{XLARGE, LARGE, MEDIUM, SMALL};
            }
            int i4 = i3 + 119;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return onwarmupcompletedArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i3 + 125;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            throw null;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = onExtraCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = $VALUES;
            if (i3 == 0) {
                return (onWarmupCompleted[]) onwarmupcompletedArr.clone();
            }
            throw null;
        }

        private onWarmupCompleted(String str, int i, int i2) {
            this.index = i2;
        }

        public final int getIndex() {
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 67;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            if (i3 % 2 != 0) {
                i = this.index;
                int i5 = 79 / 0;
            } else {
                i = this.index;
            }
            int i6 = i4 + 11;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return i;
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = IAuthTabCallback + 97;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final int index;
        public static final IAuthTabCallback INLINE = new IAuthTabCallback("INLINE", 0, 0);
        public static final IAuthTabCallback BLOCK = new IAuthTabCallback("BLOCK", 1, 1);
        public static final IAuthTabCallback FULL = new IAuthTabCallback("FULL", 2, 2);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            IAuthTabCallback[] iAuthTabCallbackArr;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                IAuthTabCallback iAuthTabCallback = INLINE;
                IAuthTabCallback iAuthTabCallback2 = BLOCK;
                IAuthTabCallback iAuthTabCallback3 = FULL;
                iAuthTabCallbackArr = new IAuthTabCallback[5];
                iAuthTabCallbackArr[1] = iAuthTabCallback;
                iAuthTabCallbackArr[0] = iAuthTabCallback2;
                iAuthTabCallbackArr[2] = iAuthTabCallback3;
            } else {
                iAuthTabCallbackArr = new IAuthTabCallback[]{INLINE, BLOCK, FULL};
            }
            int i4 = i3 + 95;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            int i4 = onExtraCallback + 37;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = $VALUES;
            if (i3 != 0) {
                return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback(String str, int i, int i2) {
            this.index = i2;
        }

        public final int getIndex() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 91;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.index;
            int i6 = i2 + 11;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onWarmupCompleted + 123;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }

    public final void setNightMode(boolean z) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 57;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback = Boolean.valueOf(z);
        this.ICustomTabsCallback = onRelationshipValidationResult();
        setTheme$default(this, null, null, null, null, 15, null);
        int i4 = IPostMessageServiceDefault + 81;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private final int onExtraCallback(authParams authparams) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 117;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (!(!ICustomTabsCallback())) {
            int i4 = IPostMessageServiceDefault + 89;
            IEngagementSignalsCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            return RequestBody.onExtraCallback(authparams);
        }
        int iOnExtraCallbackWithResult = RequestBody.onExtraCallbackWithResult(authparams);
        int i6 = IPostMessageServiceDefault + 105;
        IEngagementSignalsCallbackStubProxy = i6 % 128;
        if (i6 % 2 != 0) {
            return iOnExtraCallbackWithResult;
        }
        throw null;
    }

    private final int onWarmupCompleted(eExternalSyntheticLambda0 eexternalsyntheticlambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 51;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (!ICustomTabsCallback()) {
            return getDEFAULT_PROTOCOLSokhttp.onWarmupCompleted(eexternalsyntheticlambda0);
        }
        int iOnExtraCallback = getDEFAULT_PROTOCOLSokhttp.onExtraCallback(eexternalsyntheticlambda0);
        int i4 = IEngagementSignalsCallbackStubProxy + 81;
        IPostMessageServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return iOnExtraCallback;
        }
        throw null;
    }

    private final setCertificatePinnerokhttp onUnminimized() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 81;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        setCertificatePinnerokhttp setcertificatepinnerokhttpOnExtraCallback = this.writeTypedList;
        if (setcertificatepinnerokhttpOnExtraCallback == null) {
            setcertificatepinnerokhttpOnExtraCallback = onExtraCallback(this.ICustomTabsCallback, this.ICustomTabsService_Parcel, this.IEngagementSignalsCallbackStub);
        }
        int i4 = IPostMessageServiceDefault + 123;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return setcertificatepinnerokhttpOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View, im.toss.tds.view.component.atom.button.TdsButtonV1View] */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        setCertificatePinnerokhttp setcertificatepinnerokhttpIAuthTabCallback;
        ?? r8 = (TdsButtonV1View) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 51;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        setCertificateChainCleanerokhttp setcertificatechaincleanerokhttp = ((TdsButtonV1View) r8).onMinimized;
        if (setcertificatechaincleanerokhttp != null) {
            IAuthTabCallbackDefault iAuthTabCallbackDefault = ((TdsButtonV1View) r8).ICustomTabsService_Parcel;
            boolean zICustomTabsCallback = r8.ICustomTabsCallback();
            Context context = r8.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            setcertificatepinnerokhttpIAuthTabCallback = setcertificatechaincleanerokhttp.IAuthTabCallback(iAuthTabCallbackDefault, zICustomTabsCallback, new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration)));
            int i4 = IEngagementSignalsCallbackStubProxy + 29;
            IPostMessageServiceDefault = i4 % 128;
            int i5 = i4 % 2;
        } else {
            setcertificatepinnerokhttpIAuthTabCallback = null;
        }
        ((TdsButtonV1View) r8).writeTypedList = setcertificatepinnerokhttpIAuthTabCallback;
        return null;
    }

    private final Map<Pair<IAuthTabCallbackDefault, IAuthTabCallbackStub>, setCertificatePinnerokhttp> onRelationshipValidationResult() {
        int i = 2 % 2;
        Map mapOnExtraCallback = access8100.onExtraCallback();
        int i2 = IEngagementSignalsCallbackStubProxy + 31;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        for (IAuthTabCallbackDefault iAuthTabCallbackDefault : IAuthTabCallbackDefault.getEntries()) {
            for (IAuthTabCallbackStub iAuthTabCallbackStub : IAuthTabCallbackStub.getEntries()) {
                mapOnExtraCallback.put(getWrite.IAuthTabCallback(iAuthTabCallbackDefault, iAuthTabCallbackStub), onWarmupCompleted(iAuthTabCallbackDefault, iAuthTabCallbackStub));
                int i4 = IPostMessageServiceDefault + 1;
                IEngagementSignalsCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        return access8100.onExtraCallbackWithResult(mapOnExtraCallback);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private final setCertificatePinnerokhttp onWarmupCompleted(IAuthTabCallbackDefault iAuthTabCallbackDefault, IAuthTabCallbackStub iAuthTabCallbackStub) throws NoWhenBranchMatchedException {
        int iOnExtraCallback;
        int iOnExtraCallback2;
        int iOnExtraCallback3;
        int i = 2 % 2;
        int i2 = onTransact.onWarmupCompleted[iAuthTabCallbackStub.ordinal()];
        if (i2 == 1) {
            int i3 = onTransact.onNavigationEvent[iAuthTabCallbackDefault.ordinal()];
            if (i3 == 1) {
                return new setCertificatePinnerokhttp(onExtraCallback(authParams.FillBrand), onExtraCallback(authParams.TextOnFillBrand), 0.0f, onWarmupCompleted(eExternalSyntheticLambda0.ButtonGradientLayerFillBrandGradientStart), onWarmupCompleted(eExternalSyntheticLambda0.ButtonGradientLayerFillBrandGradientEnd), 0.1f, 0.3f, onWarmupCompleted(eExternalSyntheticLambda0.ButtonLoaderFill), 0.0f, onWarmupCompleted(eExternalSyntheticLambda0.ButtonStateLayerFill), 0.0f, 0.0f, 0.0f, 7428, null);
            }
            int i4 = IPostMessageServiceDefault + 99;
            IEngagementSignalsCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int iOnExtraCallback4 = onExtraCallback(authParams.FillBrandWeak);
            int iOnExtraCallback5 = onExtraCallback(authParams.TextBrand);
            float f = onWarmupCompleted;
            int iOnWarmupCompleted = onWarmupCompleted(eExternalSyntheticLambda0.ButtonGradientLayerFillBrandWeakGradientStart);
            int iOnWarmupCompleted2 = onWarmupCompleted(eExternalSyntheticLambda0.ButtonGradientLayerFillBrandWeakGradientEnd);
            int iOnWarmupCompleted3 = onWarmupCompleted(eExternalSyntheticLambda0.ButtonLoaderFillBrandWeak);
            float f2 = onExtraCallbackWithResult;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            int i6 = onTransact.IAuthTabCallback[new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration)).ITrustedWebActivityCallbackDefault().ordinal()];
            if (i6 == 1) {
                iOnExtraCallback = onExtraCallback(authParams.FillBrand);
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i7 = IEngagementSignalsCallbackStubProxy + 25;
                IPostMessageServiceDefault = i7 % 128;
                if (i7 % 2 != 0) {
                    onWarmupCompleted(eExternalSyntheticLambda0.ButtonStateLayerFill);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                iOnExtraCallback = onWarmupCompleted(eExternalSyntheticLambda0.ButtonStateLayerFill);
            }
            return new setCertificatePinnerokhttp(iOnExtraCallback4, iOnExtraCallback5, f, iOnWarmupCompleted, iOnWarmupCompleted2, 0.5f, 0.4f, iOnWarmupCompleted3, f2, iOnExtraCallback, 0.0f, 0.0f, 1.0f, 3072, null);
        }
        if (i2 == 2) {
            int i8 = onTransact.onNavigationEvent[iAuthTabCallbackDefault.ordinal()];
            if (i8 == 1) {
                return new setCertificatePinnerokhttp(onExtraCallback(authParams.FillDanger), onExtraCallback(authParams.TextOnFill), 0.0f, onWarmupCompleted(eExternalSyntheticLambda0.ButtonGradientLayerFillDangerGradientStart), onWarmupCompleted(eExternalSyntheticLambda0.ButtonGradientLayerFillDangerGradientEnd), 0.5f, 0.3f, onWarmupCompleted(eExternalSyntheticLambda0.ButtonLoaderFill), 0.0f, onWarmupCompleted(eExternalSyntheticLambda0.ButtonStateLayerFill), 0.0f, 0.0f, 0.0f, 7428, null);
            }
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int iOnExtraCallback6 = onExtraCallback(authParams.FillDangerWeak);
            int iOnExtraCallback7 = onExtraCallback(authParams.TextDanger);
            float f3 = onWarmupCompleted;
            int iOnWarmupCompleted4 = onWarmupCompleted(eExternalSyntheticLambda0.ButtonGradientLayerFillDangerWeakGradientStart);
            int iOnWarmupCompleted5 = onWarmupCompleted(eExternalSyntheticLambda0.ButtonGradientLayerFillDangerWeakGradientEnd);
            int iOnWarmupCompleted6 = onWarmupCompleted(eExternalSyntheticLambda0.ButtonLoaderFillDangerWeak);
            float f4 = onExtraCallbackWithResult;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            int i9 = onTransact.IAuthTabCallback[new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration2)).ITrustedWebActivityCallbackDefault().ordinal()];
            if (i9 != 1) {
                int i10 = IPostMessageServiceDefault + 109;
                int i11 = i10 % 128;
                IEngagementSignalsCallbackStubProxy = i11;
                int i12 = i10 % 2;
                if (i9 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i13 = i11 + 21;
                IPostMessageServiceDefault = i13 % 128;
                int i14 = i13 % 2;
                iOnExtraCallback2 = onWarmupCompleted(eExternalSyntheticLambda0.ButtonStateLayerFill);
            } else {
                iOnExtraCallback2 = onExtraCallback(authParams.FillDanger);
            }
            return new setCertificatePinnerokhttp(iOnExtraCallback6, iOnExtraCallback7, f3, iOnWarmupCompleted4, iOnWarmupCompleted5, 0.7f, 0.4f, iOnWarmupCompleted6, f4, iOnExtraCallback2, 0.0f, 0.0f, 1.0f, 3072, null);
        }
        if (i2 != 3) {
            int i15 = IPostMessageServiceDefault + 71;
            IEngagementSignalsCallbackStubProxy = i15 % 128;
            if (i15 % 2 != 0 ? i2 != 4 : i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i16 = onTransact.onNavigationEvent[iAuthTabCallbackDefault.ordinal()];
            if (i16 == 1) {
                return new setCertificatePinnerokhttp(onExtraCallback(authParams.FillInverse), onWarmupCompleted(eExternalSyntheticLambda0.ButtonTextInverse), 0.0f, onWarmupCompleted(eExternalSyntheticLambda0.ButtonGradientLayerFillInverseGradientStart), onWarmupCompleted(eExternalSyntheticLambda0.ButtonGradientLayerFillInverseGradientEnd), 0.5f, 0.3f, onWarmupCompleted(eExternalSyntheticLambda0.ButtonLoaderFillInverse), 0.0f, onWarmupCompleted(eExternalSyntheticLambda0.ButtonStateLayerFill), 0.0f, 0.0f, 0.0f, 7428, null);
            }
            if (i16 == 2) {
                return new setCertificatePinnerokhttp(onExtraCallback(authParams.FillInverseWeak), onExtraCallback(authParams.TextOnFill), onWarmupCompleted, onWarmupCompleted(eExternalSyntheticLambda0.ButtonGradientLayerFillInverseWeakGradientStart), onWarmupCompleted(eExternalSyntheticLambda0.ButtonGradientLayerFillInverseWeakGradientEnd), 0.7f, 0.4f, onWarmupCompleted(eExternalSyntheticLambda0.ButtonLoaderFill), onExtraCallbackWithResult, onExtraCallback(authParams.FillInverse), 0.0f, 0.0f, 1.0f, 3072, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        int i17 = onTransact.onNavigationEvent[iAuthTabCallbackDefault.ordinal()];
        if (i17 == 1) {
            return new setCertificatePinnerokhttp(onExtraCallback(authParams.FillNeutral), onExtraCallback(authParams.TextOnFill), 0.0f, onWarmupCompleted(eExternalSyntheticLambda0.ButtonGradientLayerFillDarkGradientStart), onWarmupCompleted(eExternalSyntheticLambda0.ButtonGradientLayerFillDarkGradientEnd), 0.7f, 0.2f, onWarmupCompleted(eExternalSyntheticLambda0.ButtonLoaderFill), 0.0f, onWarmupCompleted(eExternalSyntheticLambda0.ButtonStateLayerFill), 0.0f, 0.0f, 0.0f, 7428, null);
        }
        if (i17 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int iOnExtraCallback8 = onExtraCallback(authParams.FillNeutralWeak);
        int iOnExtraCallback9 = onExtraCallback(authParams.TextSecondary);
        float f5 = onWarmupCompleted;
        int iOnWarmupCompleted7 = onWarmupCompleted(eExternalSyntheticLambda0.ButtonGradientLayerFillDarkWeakGradientStart);
        int iOnWarmupCompleted8 = onWarmupCompleted(eExternalSyntheticLambda0.ButtonGradientLayerFillDarkWeakGradientEnd);
        int iOnWarmupCompleted9 = onWarmupCompleted(eExternalSyntheticLambda0.ButtonLoaderFillNeutralWeak);
        float f6 = onExtraCallbackWithResult;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration3 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        int i18 = onTransact.IAuthTabCallback[new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration3)).ITrustedWebActivityCallbackDefault().ordinal()];
        if (i18 == 1) {
            iOnExtraCallback3 = onExtraCallback(authParams.FillNeutral);
        } else {
            if (i18 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iOnExtraCallback3 = onWarmupCompleted(eExternalSyntheticLambda0.ButtonStateLayerFill);
        }
        return new setCertificatePinnerokhttp(iOnExtraCallback8, iOnExtraCallback9, f5, iOnWarmupCompleted7, iOnWarmupCompleted8, 0.24f, 0.14f, iOnWarmupCompleted9, f6, iOnExtraCallback3, 0.0f, 0.0f, 1.0f, 3072, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final onExtraCallbackWithResult ENABLED = new onExtraCallbackWithResult("ENABLED", 0);
        public static final onExtraCallbackWithResult LOADING = new onExtraCallbackWithResult("LOADING", 1);
        public static final onExtraCallbackWithResult DISABLED = new onExtraCallbackWithResult("DISABLED", 2);
        public static final onExtraCallbackWithResult LOADING_DISABLED = new onExtraCallbackWithResult("LOADING_DISABLED", 3);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 45;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {ENABLED, LOADING, DISABLED, LOADING_DISABLED};
            int i5 = i2 + 105;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return onextracallbackwithresultArr;
            }
            throw null;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i5 = i3 + 3;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            throw null;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 == 0) {
                int i4 = 51 / 0;
            }
            int i5 = onNavigationEvent + 65;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i4 = onNavigationEvent + 39;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresultArr;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                int i2 = 63 / 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(Drawable drawable) {
        RoundDrawable roundDrawable;
        int i = 2 % 2;
        this.getInterfaceDescriptor = drawable;
        Drawable background = getBackground();
        if (!(!(background instanceof RoundDrawable))) {
            int i2 = IEngagementSignalsCallbackStubProxy + 71;
            IPostMessageServiceDefault = i2 % 128;
            int i3 = i2 % 2;
            roundDrawable = (RoundDrawable) background;
        } else {
            roundDrawable = null;
        }
        if (roundDrawable != null) {
            int i4 = IEngagementSignalsCallbackStubProxy + 25;
            IPostMessageServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            roundDrawable.IAuthTabCallback(this.onPostMessage);
            int i6 = IPostMessageServiceDefault + 103;
            IEngagementSignalsCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setButtonsOuterStrokeColor(int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStubProxy + 75;
        IPostMessageServiceDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.IAuthTabCallbackStubProxy = i;
            invalidate();
            int i4 = IPostMessageServiceDefault + 59;
            IEngagementSignalsCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.IAuthTabCallbackStubProxy = i;
        invalidate();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setButtonsOuterStrokeWidth(float f) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 73;
        IPostMessageServiceDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.access000 = f;
            invalidate();
            int i3 = IPostMessageServiceDefault + 67;
            IEngagementSignalsCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.access000 = f;
        invalidate();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setButtonsStrokeColor(int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStubProxy + 109;
        IPostMessageServiceDefault = i3 % 128;
        if (i3 % 2 == 0) {
            this.access100 = i;
            invalidate();
        } else {
            this.access100 = i;
            invalidate();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setButtonsStrokeWidth(float f) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 117;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            this.extraCallback = f;
            invalidate();
        } else {
            this.extraCallback = f;
            invalidate();
            throw null;
        }
    }

    public final boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault;
        int i3 = i2 + 17;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.newSession;
        int i5 = i2 + 87;
        IEngagementSignalsCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        int label;

        access100(access13800<? super access100> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = TdsButtonV1View.this.new access100(access13800Var);
            int i2 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return access100Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 51;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                long jOnWarmupCompleted = TdsButtonV1View.onWarmupCompleted(TdsButtonV1View.this);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted((4 - jOnWarmupCompleted) * 100, this) == objOnWarmupCompleted) {
                    int i3 = onNavigationEvent;
                    int i4 = i3 + 17;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = i3 + 123;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = onExtraCallbackWithResult + 113;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    int i9 = 24 / 0;
                } else {
                    ResultKt.onNavigationEvent(obj);
                }
            }
            TdsButtonV1View.IAuthTabCallback(TdsButtonV1View.this, false);
            TdsButtonV1View.onExtraCallback(TdsButtonV1View.this, false);
            Unit unit = Unit.INSTANCE;
            int i10 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            return unit;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setLoading(boolean z) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 23;
        int i3 = i2 % 128;
        IEngagementSignalsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        if (z) {
            mayLaunchUrl();
            onExtraCallback(isEnabled());
            this.warmup = 0L;
            int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
            IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this}, -556069623, handleRemoveKey.onExtraCallbackWithResult(), 556069629);
            if (!this.newSession) {
                int i5 = IPostMessageServiceDefault + 91;
                IEngagementSignalsCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                onExtraCallbackWithResult(true);
            }
            this.newSession = true;
            return;
        }
        long j = this.warmup;
        Object obj = null;
        if (0 > j || j >= 4 || this.onActivityResized != null) {
            this.newSession = false;
            onExtraCallbackWithResult(false);
            int i7 = IEngagementSignalsCallbackStubProxy + 7;
            IPostMessageServiceDefault = i7 % 128;
            if (i7 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i8 = i3 + 37;
        IPostMessageServiceDefault = i8 % 128;
        int i9 = i8 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
            this.onActivityResized = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult), (CoroutineContext) null, (setRandomHost) null, new access100(null), 3, (Object) null);
        } else {
            this.newSession = false;
            onExtraCallbackWithResult(false);
        }
    }

    private final void mayLaunchUrl() {
        int i = 2 % 2;
        getPackageType getpackagetype = this.onActivityResized;
        if (getpackagetype != null) {
            int i2 = IEngagementSignalsCallbackStubProxy + 73;
            IPostMessageServiceDefault = i2 % 128;
            int i3 = i2 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            int i4 = IEngagementSignalsCallbackStubProxy + 101;
            IPostMessageServiceDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 3;
            }
        }
        this.onActivityResized = null;
        int i6 = IEngagementSignalsCallbackStubProxy + 107;
        IPostMessageServiceDefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 19 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(boolean z) {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 123;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        int i4 = onTransact.onExtraCallback[this.IAuthTabCallback_Parcel.ordinal()];
        if (i4 != 1) {
            int i5 = IPostMessageServiceDefault + 85;
            int i6 = i5 % 128;
            IEngagementSignalsCallbackStubProxy = i6;
            if (i5 % 2 != 0 ? i4 == 2 : i4 == 2) {
                onextracallbackwithresult = z ? onExtraCallbackWithResult.LOADING_DISABLED : onExtraCallbackWithResult.DISABLED;
            } else {
                int i7 = i6 + 17;
                IPostMessageServiceDefault = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                onextracallbackwithresult = z ? onExtraCallbackWithResult.LOADING : onExtraCallbackWithResult.ENABLED;
            }
        }
        this.IAuthTabCallback_Parcel = onextracallbackwithresult;
        isEngagementSignalsApiAvailable();
        if (!z) {
            runOnUiThreadDelayed runonuithreaddelayed = this.validateRelationship;
            if (runonuithreaddelayed != null) {
                runonuithreaddelayed.onNavigationEvent();
            }
            pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
            RallyCanvas rallyCanvas = this.IEngagementSignalsCallback;
            deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
            List<AppLovinSdkSettings> listOnNavigationEvent = RallysKt.onNavigationEvent(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null));
            Boolean bool = Boolean.FALSE;
            this.validateRelationship = (runOnUiThreadDelayed) isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted(null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{RallysKt.onWarmupCompleted(rallyCanvas, (List) listOnNavigationEvent, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 1916, (Object) null), RallysKt.onWarmupCompleted(this.setEngagementSignalsCallback, (List) RallysKt.onNavigationEvent(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf2, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 1916, (Object) null)}), 0, null, 0, null, null, bool, 0, 0L, false, 3833, null), false, 1, null);
            return;
        }
        Pair pair = new Pair(Float.valueOf(0.2f), fValueOf);
        float fFloatValue = ((Number) pair.onExtraCallbackWithResult()).floatValue();
        float fFloatValue2 = ((Number) pair.IAuthTabCallback()).floatValue();
        AppLovinSdkSettings appLovinSdkSettings = new AppLovinSdkSettings();
        Address address = Address.onNavigationEvent;
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{appLovinSdkSettings.onWarmupCompleted(address.asInterface()), 300}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2), (Function1) null, 4, (Object) null);
        runOnUiThreadDelayed runonuithreaddelayed2 = this.validateRelationship;
        if (runonuithreaddelayed2 != null) {
            runonuithreaddelayed2.onNavigationEvent();
        }
        pxToDp.IAuthTabCallback iAuthTabCallback2 = pxToDp.IAuthTabCallback.onExtraCallback;
        RallyCanvas rallyCanvas2 = this.postMessage.get(0);
        getExtraParameters getextraparameters = getExtraParameters.Alternate;
        List<AppLovinSdkSettings> listOnNavigationEvent2 = RallysKt.onNavigationEvent(appLovinSdkSettingsOnNavigationEvent);
        Boolean bool2 = Boolean.FALSE;
        Rally rallyOnWarmupCompleted = RallysKt.onWarmupCompleted(rallyCanvas2, (List) listOnNavigationEvent2, -1, getextraparameters, 0, (Interpolator) null, (Integer) null, bool2, 0, 0L, false, 1904, (Object) null);
        Rally rallyOnWarmupCompleted2 = RallysKt.onWarmupCompleted(this.postMessage.get(1), (List) RallysKt.onNavigationEvent(appLovinSdkSettingsOnNavigationEvent), -1, getextraparameters, 0, (Interpolator) null, (Integer) null, bool2, 100, 0L, false, 1648, (Object) null);
        Rally rallyOnWarmupCompleted3 = RallysKt.onWarmupCompleted(this.postMessage.get(2), (List) RallysKt.onNavigationEvent(appLovinSdkSettingsOnNavigationEvent), -1, getextraparameters, 0, (Interpolator) null, (Integer) null, bool2, 200, 0L, false, 1648, (Object) null);
        Rally rallyOnWarmupCompleted4 = RallysKt.onWarmupCompleted(this.onRelationshipValidationResult, (List) RallysKt.onNavigationEvent(isMuted.onNavigationEvent((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(address.asBinder()), 600}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), fValueOf2, Float.valueOf(onUnminimized().IAuthTabCallback(setCallTimeoutokhttp.onExtraCallback(this.IAuthTabCallback_Parcel))), (Function1) null, 4, (Object) null)), -1, getextraparameters, 0, (Interpolator) null, (Integer) null, bool2, 0, 0L, false, 1904, (Object) null);
        RallyCanvas rallyCanvas3 = this.IEngagementSignalsCallback;
        deprecated_certificatePinner deprecated_certificatepinner2 = deprecated_certificatePinner.onExtraCallbackWithResult;
        this.validateRelationship = (runOnUiThreadDelayed) isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted(null, iAuthTabCallback2, CollectionsKt.listOf(new Rally[]{rallyOnWarmupCompleted, rallyOnWarmupCompleted2, rallyOnWarmupCompleted3, rallyOnWarmupCompleted4, RallysKt.onWarmupCompleted(rallyCanvas3, (List) RallysKt.onNavigationEvent(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner2.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf2, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool2, 0, 0L, false, 1916, (Object) null), RallysKt.onWarmupCompleted(this.setEngagementSignalsCallback, (List) RallysKt.onNavigationEvent(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner2.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(onUnminimized().onExtraCallbackWithResult(true)), (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool2, 0, 0L, false, 1916, (Object) null)}), 0, null, 0, null, null, bool2, 0, 0L, false, 3833, null), false, 1, null);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [android.view.View, im.toss.tds.view.component.atom.button.TdsButtonV1View] */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        ?? r10 = (TdsButtonV1View) objArr[0];
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult((View) r10);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
            int i2 = IEngagementSignalsCallbackStubProxy + 29;
            IPostMessageServiceDefault = i2 % 128;
            int i3 = i2 % 2;
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
            if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new asBinder(null), 3, (Object) null);
            }
        }
        int i4 = IEngagementSignalsCallbackStubProxy + 85;
        IPostMessageServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = TdsButtonV1View.this.new asBinder(access13800Var);
            int i2 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(100, r8) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(100, r8) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        
            return r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004e -> B:20:0x005a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0057 -> B:20:0x005a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = IAuthTabCallback + 23;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                TdsButtonV1View.onExtraCallback(TdsButtonV1View.this, TdsButtonV1View.onWarmupCompleted(TdsButtonV1View.this) + 1);
                if (TdsButtonV1View.onWarmupCompleted(TdsButtonV1View.this) < 4) {
                    int i7 = IAuthTabCallback + 111;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        this.label = 1;
                    } else {
                        this.label = 1;
                    }
                    if (TdsButtonV1View.onWarmupCompleted(TdsButtonV1View.this) < 4) {
                        return Unit.INSTANCE;
                    }
                }
            } else {
                ResultKt.onNavigationEvent(obj);
                if (TdsButtonV1View.onWarmupCompleted(TdsButtonV1View.this) < 4) {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setArrow(boolean z) {
        float width;
        int i = 2 % 2;
        this.asBinder = z;
        if (!z) {
            width = 0.0f;
        } else {
            Bitmap bitmap = this.IAuthTabCallbackDefault;
            if (bitmap == null) {
                int i2 = IPostMessageServiceDefault + 51;
                IEngagementSignalsCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = IEngagementSignalsCallbackStubProxy + 65;
                IPostMessageServiceDefault = i4 % 128;
                int i5 = i4 % 2;
                bitmap = null;
            }
            width = bitmap.getWidth() - setTagsokhttp.onExtraCallbackWithResult(this, 8);
            int i6 = IPostMessageServiceDefault + 51;
            IEngagementSignalsCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
        }
        this.onTransact = width;
        if (isInLayout()) {
            return;
        }
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(TdsButtonV1View tdsButtonV1View, float f) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 101;
        IPostMessageServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            tdsButtonV1View.readTypedObject = f;
            tdsButtonV1View.invalidate();
            unit = Unit.INSTANCE;
            int i3 = 38 / 0;
        } else {
            tdsButtonV1View.readTypedObject = f;
            tdsButtonV1View.invalidate();
            unit = Unit.INSTANCE;
        }
        int i4 = IPostMessageServiceDefault + 35;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, im.toss.tds.view.component.atom.button.TdsButtonV1View, java.lang.Object] */
    private static /* synthetic */ Object asInterface(Object[] objArr) {
        deprecated_dns deprecated_dnsVarAsInterface;
        final ?? r0 = (TdsButtonV1View) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        Float fValueOf = Float.valueOf(0.5f);
        if (zBooleanValue && !r0.isEnabled()) {
            int i2 = IEngagementSignalsCallbackStubProxy + 17;
            IPostMessageServiceDefault = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), new Object[]{r0}, -94371013, handleRemoveKey.onExtraCallbackWithResult(), 94371021);
            return null;
        }
        if (((TdsButtonV1View) r0).onActivityLayout == IAuthTabCallback.FULL) {
            deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
            return (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{zBooleanValue ? deprecated_certificatepinner.asInterface() : deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(((TdsButtonV1View) r0).readTypedObject), Float.valueOf(zBooleanValue ? 0.96f : 1.0f), new Function1() { // from class: im.toss.tds.view.component.atom.button.TdsButtonV1View$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj) {
                    Unit unit;
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 81;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        Object[] objArr2 = {this.f$0, Float.valueOf(((Float) obj).floatValue())};
                        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
                        unit = (Unit) TdsButtonV1View.IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr2, 1399686815, handleRemoveKey.onExtraCallbackWithResult(), -1399686814);
                        int i6 = 70 / 0;
                    } else {
                        Object[] objArr3 = {this.f$0, Float.valueOf(((Float) obj).floatValue())};
                        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
                        unit = (Unit) TdsButtonV1View.IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr3, 1399686815, handleRemoveKey.onExtraCallbackWithResult(), -1399686814);
                    }
                    int i7 = IAuthTabCallback + 27;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    return unit;
                }
            }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
        }
        deprecated_certificatePinner deprecated_certificatepinner2 = deprecated_certificatePinner.onExtraCallbackWithResult;
        if (zBooleanValue) {
            deprecated_dnsVarAsInterface = deprecated_certificatepinner2.asInterface();
        } else {
            deprecated_dns deprecated_dnsVarOnNavigationEvent = deprecated_certificatepinner2.onNavigationEvent();
            int i4 = IPostMessageServiceDefault + 9;
            IEngagementSignalsCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            deprecated_dnsVarAsInterface = deprecated_dnsVarOnNavigationEvent;
        }
        return isMuted.asBinder(isMuted.access000(isMuted.asInterface((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_dnsVarAsInterface}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null), null, fValueOf, null, 5, null), Float.valueOf(r0.getScaleX()), Float.valueOf(zBooleanValue ? 0.96f : 1.0f), null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = IPostMessageServiceDefault + 93;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        this.onPostMessage = i;
        postInvalidateOnAnimation();
        int i5 = IEngagementSignalsCallbackStubProxy + 91;
        IPostMessageServiceDefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TdsButtonV1View(@NotNull Context context) {
        onExtraCallbackWithResult onextracallbackwithresult;
        super(context, (AttributeSet) null);
        Intrinsics.checkNotNullParameter(context, "");
        this.updateVisuals = reportCustomErr.onNavigationEvent(this, onCrash.Button, false, new Function0() { // from class: im.toss.tds.view.component.atom.button.TdsButtonV1View$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 91;
                onExtraCallbackWithResult = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    Object[] objArr = {this.f$0};
                    int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
                    throw null;
                }
                Object[] objArr2 = {this.f$0};
                int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
                Set set = (Set) TdsButtonV1View.IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr2, 343440725, handleRemoveKey.onExtraCallbackWithResult(), -343440716);
                int i3 = onExtraCallbackWithResult + 59;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return set;
                }
                obj.hashCode();
                throw null;
            }
        }, new Function1() { // from class: im.toss.tds.view.component.atom.button.TdsButtonV1View$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 43;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallback = TdsButtonV1View.IAuthTabCallback(this.f$0, (initSDK.onNavigationEvent) obj);
                int i4 = IAuthTabCallback + 69;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallback;
            }
        }, 2, (Object) null);
        this.ICustomTabsCallback = onRelationshipValidationResult();
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.SubTypography9;
        this.IEngagementSignalsCallbackDefault = new Float[]{Float.valueOf(accessgettlsversionsasstringp.getSize()), Float.valueOf(accessgettlsversionsasstringp.getSize()), Float.valueOf(accessgetTlsVersionsAsStringp.Typography6.getSize()), Float.valueOf(accessgetTlsVersionsAsStringp.Typography7.getSize())};
        ConnectionPool connectionPool = ConnectionPool.onWarmupCompleted;
        this.newAuthTabSession = new Float[]{Float.valueOf(connectionPool.onWarmupCompleted().IAuthTabCallback()), Float.valueOf(connectionPool.onWarmupCompleted().IAuthTabCallback()), Float.valueOf(connectionPool.onWarmupCompleted().IAuthTabCallback()), Float.valueOf(connectionPool.onWarmupCompleted().IAuthTabCallback())};
        this.onGreatestScrollPercentageIncreased = new Integer[]{Integer.valueOf(setTagsokhttp.onExtraCallbackWithResult(this, 28)), Integer.valueOf(setTagsokhttp.onExtraCallbackWithResult(this, 16)), Integer.valueOf(setTagsokhttp.onExtraCallbackWithResult(this, 16)), Integer.valueOf(setTagsokhttp.onExtraCallbackWithResult(this, 10))};
        this.requestPostMessageChannel = new Paint();
        Float fValueOf = Float.valueOf(8.0f);
        Float fValueOf2 = Float.valueOf(5.0f);
        this.requestPostMessageChannelWithExtras = new Float[]{fValueOf, fValueOf, fValueOf2, fValueOf2};
        this.receiveFile = new Float[]{Float.valueOf(7.0f), fValueOf2, Float.valueOf(4.0f), Float.valueOf(3.0f)};
        this.ICustomTabsServiceDefault = new Float[]{Float.valueOf(96.0f), Float.valueOf(80.0f), Float.valueOf(64.0f), Float.valueOf(52.0f)};
        this.ICustomTabsServiceStub = new Float[]{Float.valueOf(56.0f), Float.valueOf(48.0f), Float.valueOf(38.0f), Float.valueOf(32.0f)};
        this.ICustomTabsCallback_Parcel = setTagsokhttp.onExtraCallbackWithResult(this, 8);
        this.ICustomTabsService_Parcel = IAuthTabCallbackDefault.FILL;
        this.IEngagementSignalsCallbackStub = IAuthTabCallbackStub.PRIMARY;
        this.ICustomTabsServiceStubProxy = onWarmupCompleted.XLARGE;
        this.onActivityLayout = IAuthTabCallback.INLINE;
        this.postMessage = CollectionsKt.listOf(new RallyCanvas[]{new RallyCanvas(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, 0.0f, 2097150, null), new RallyCanvas(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, 0.0f, 2097150, null), new RallyCanvas(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, 0.0f, 2097150, null)});
        this.onRelationshipValidationResult = new RallyCanvas(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, 0.0f, 2097150, null);
        this.IEngagementSignalsCallback = new RallyCanvas(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, 0.0f, 2097150, null);
        this.setEngagementSignalsCallback = new RallyCanvas(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, 0.0f, 2097150, null);
        if (!isEnabled()) {
            onextracallbackwithresult = onExtraCallbackWithResult.DISABLED;
            int i = IPostMessageServiceDefault + 21;
            IEngagementSignalsCallbackStubProxy = i % 128;
            int i2 = i % 2;
        } else {
            onextracallbackwithresult = onExtraCallbackWithResult.ENABLED;
            int i3 = IEngagementSignalsCallbackStubProxy + 85;
            IPostMessageServiceDefault = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 3;
            }
            this.IAuthTabCallback_Parcel = onextracallbackwithresult;
            this.extraCallbackWithResult = true;
            this.writeTypedObject = true;
            this.IPostMessageService = -1;
            this.warmup = -1L;
            this.readTypedObject = 1.0f;
            this.IEngagementSignalsCallback_Parcel = new head(this, (View) null, false, new Function1() { // from class: im.toss.tds.view.component.atom.button.TdsButtonV1View$$ExternalSyntheticLambda7
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj) {
                    int i5 = 2 % 2;
                    int i6 = onNavigationEvent + 35;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = TdsButtonV1View.onNavigationEvent(this.f$0, ((Boolean) obj).booleanValue());
                    int i8 = onNavigationEvent + 79;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    return appLovinSdkSettingsOnNavigationEvent;
                }
            }, 6, (DefaultConstructorMarker) null);
            this.onUnminimized = new Paint();
            this.prefetchWithMultipleUrls = new Paint();
            onWarmupCompleted(this, null, 1, null);
        }
        int i5 = 2 % 2;
        this.IAuthTabCallback_Parcel = onextracallbackwithresult;
        this.extraCallbackWithResult = true;
        this.writeTypedObject = true;
        this.IPostMessageService = -1;
        this.warmup = -1L;
        this.readTypedObject = 1.0f;
        this.IEngagementSignalsCallback_Parcel = new head(this, (View) null, false, new Function1() { // from class: im.toss.tds.view.component.atom.button.TdsButtonV1View$$ExternalSyntheticLambda7
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i52 = 2 % 2;
                int i6 = onNavigationEvent + 35;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = TdsButtonV1View.onNavigationEvent(this.f$0, ((Boolean) obj).booleanValue());
                int i8 = onNavigationEvent + 79;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                return appLovinSdkSettingsOnNavigationEvent;
            }
        }, 6, (DefaultConstructorMarker) null);
        this.onUnminimized = new Paint();
        this.prefetchWithMultipleUrls = new Paint();
        onWarmupCompleted(this, null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TdsButtonV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        onExtraCallbackWithResult onextracallbackwithresult;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.updateVisuals = reportCustomErr.onNavigationEvent(this, onCrash.Button, false, new Function0() { // from class: im.toss.tds.view.component.atom.button.TdsButtonV1View$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 91;
                onExtraCallbackWithResult = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    Object[] objArr = {this.f$0};
                    int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
                    throw null;
                }
                Object[] objArr2 = {this.f$0};
                int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
                Set set = (Set) TdsButtonV1View.IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr2, 343440725, handleRemoveKey.onExtraCallbackWithResult(), -343440716);
                int i3 = onExtraCallbackWithResult + 59;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return set;
                }
                obj.hashCode();
                throw null;
            }
        }, new Function1() { // from class: im.toss.tds.view.component.atom.button.TdsButtonV1View$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 43;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallback = TdsButtonV1View.IAuthTabCallback(this.f$0, (initSDK.onNavigationEvent) obj);
                int i4 = IAuthTabCallback + 69;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallback;
            }
        }, 2, (Object) null);
        this.ICustomTabsCallback = onRelationshipValidationResult();
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.SubTypography9;
        this.IEngagementSignalsCallbackDefault = new Float[]{Float.valueOf(accessgettlsversionsasstringp.getSize()), Float.valueOf(accessgettlsversionsasstringp.getSize()), Float.valueOf(accessgetTlsVersionsAsStringp.Typography6.getSize()), Float.valueOf(accessgetTlsVersionsAsStringp.Typography7.getSize())};
        ConnectionPool connectionPool = ConnectionPool.onWarmupCompleted;
        this.newAuthTabSession = new Float[]{Float.valueOf(connectionPool.onWarmupCompleted().IAuthTabCallback()), Float.valueOf(connectionPool.onWarmupCompleted().IAuthTabCallback()), Float.valueOf(connectionPool.onWarmupCompleted().IAuthTabCallback()), Float.valueOf(connectionPool.onWarmupCompleted().IAuthTabCallback())};
        this.onGreatestScrollPercentageIncreased = new Integer[]{Integer.valueOf(setTagsokhttp.onExtraCallbackWithResult(this, 28)), Integer.valueOf(setTagsokhttp.onExtraCallbackWithResult(this, 16)), Integer.valueOf(setTagsokhttp.onExtraCallbackWithResult(this, 16)), Integer.valueOf(setTagsokhttp.onExtraCallbackWithResult(this, 10))};
        this.requestPostMessageChannel = new Paint();
        Float fValueOf = Float.valueOf(8.0f);
        Float fValueOf2 = Float.valueOf(5.0f);
        this.requestPostMessageChannelWithExtras = new Float[]{fValueOf, fValueOf, fValueOf2, fValueOf2};
        this.receiveFile = new Float[]{Float.valueOf(7.0f), fValueOf2, Float.valueOf(4.0f), Float.valueOf(3.0f)};
        this.ICustomTabsServiceDefault = new Float[]{Float.valueOf(96.0f), Float.valueOf(80.0f), Float.valueOf(64.0f), Float.valueOf(52.0f)};
        this.ICustomTabsServiceStub = new Float[]{Float.valueOf(56.0f), Float.valueOf(48.0f), Float.valueOf(38.0f), Float.valueOf(32.0f)};
        this.ICustomTabsCallback_Parcel = setTagsokhttp.onExtraCallbackWithResult(this, 8);
        this.ICustomTabsService_Parcel = IAuthTabCallbackDefault.FILL;
        this.IEngagementSignalsCallbackStub = IAuthTabCallbackStub.PRIMARY;
        this.ICustomTabsServiceStubProxy = onWarmupCompleted.XLARGE;
        this.onActivityLayout = IAuthTabCallback.INLINE;
        this.postMessage = CollectionsKt.listOf(new RallyCanvas[]{new RallyCanvas(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, 0.0f, 2097150, null), new RallyCanvas(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, 0.0f, 2097150, null), new RallyCanvas(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, 0.0f, 2097150, null)});
        this.onRelationshipValidationResult = new RallyCanvas(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, 0.0f, 2097150, null);
        this.IEngagementSignalsCallback = new RallyCanvas(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, 0.0f, 2097150, null);
        this.setEngagementSignalsCallback = new RallyCanvas(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, 0.0f, 2097150, null);
        if (!isEnabled()) {
            onextracallbackwithresult = onExtraCallbackWithResult.DISABLED;
        } else {
            onextracallbackwithresult = onExtraCallbackWithResult.ENABLED;
            int i = IPostMessageServiceDefault + 9;
            IEngagementSignalsCallbackStubProxy = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        this.IAuthTabCallback_Parcel = onextracallbackwithresult;
        this.extraCallbackWithResult = true;
        this.writeTypedObject = true;
        this.IPostMessageService = -1;
        this.warmup = -1L;
        this.readTypedObject = 1.0f;
        this.IEngagementSignalsCallback_Parcel = new head(this, (View) null, false, new Function1() { // from class: im.toss.tds.view.component.atom.button.TdsButtonV1View$$ExternalSyntheticLambda7
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i52 = 2 % 2;
                int i6 = onNavigationEvent + 35;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = TdsButtonV1View.onNavigationEvent(this.f$0, ((Boolean) obj).booleanValue());
                int i8 = onNavigationEvent + 79;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                return appLovinSdkSettingsOnNavigationEvent;
            }
        }, 6, (DefaultConstructorMarker) null);
        this.onUnminimized = new Paint();
        this.prefetchWithMultipleUrls = new Paint();
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{this, attributeSet}, -741645653, handleRemoveKey.onExtraCallbackWithResult(), 741645658);
        int i4 = IPostMessageServiceDefault + 49;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TdsButtonV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        onExtraCallbackWithResult onextracallbackwithresult;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.updateVisuals = reportCustomErr.onNavigationEvent(this, onCrash.Button, false, new Function0() { // from class: im.toss.tds.view.component.atom.button.TdsButtonV1View$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i22 = IAuthTabCallback + 91;
                onExtraCallbackWithResult = i22 % 128;
                Object obj = null;
                if (i22 % 2 != 0) {
                    Object[] objArr = {this.f$0};
                    int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
                    throw null;
                }
                Object[] objArr2 = {this.f$0};
                int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
                Set set = (Set) TdsButtonV1View.IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr2, 343440725, handleRemoveKey.onExtraCallbackWithResult(), -343440716);
                int i3 = onExtraCallbackWithResult + 59;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return set;
                }
                obj.hashCode();
                throw null;
            }
        }, new Function1() { // from class: im.toss.tds.view.component.atom.button.TdsButtonV1View$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i22 = onWarmupCompleted + 43;
                IAuthTabCallback = i22 % 128;
                int i3 = i22 % 2;
                Unit unitIAuthTabCallback = TdsButtonV1View.IAuthTabCallback(this.f$0, (initSDK.onNavigationEvent) obj);
                int i4 = IAuthTabCallback + 69;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallback;
            }
        }, 2, (Object) null);
        this.ICustomTabsCallback = onRelationshipValidationResult();
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.SubTypography9;
        this.IEngagementSignalsCallbackDefault = new Float[]{Float.valueOf(accessgettlsversionsasstringp.getSize()), Float.valueOf(accessgettlsversionsasstringp.getSize()), Float.valueOf(accessgetTlsVersionsAsStringp.Typography6.getSize()), Float.valueOf(accessgetTlsVersionsAsStringp.Typography7.getSize())};
        ConnectionPool connectionPool = ConnectionPool.onWarmupCompleted;
        this.newAuthTabSession = new Float[]{Float.valueOf(connectionPool.onWarmupCompleted().IAuthTabCallback()), Float.valueOf(connectionPool.onWarmupCompleted().IAuthTabCallback()), Float.valueOf(connectionPool.onWarmupCompleted().IAuthTabCallback()), Float.valueOf(connectionPool.onWarmupCompleted().IAuthTabCallback())};
        this.onGreatestScrollPercentageIncreased = new Integer[]{Integer.valueOf(setTagsokhttp.onExtraCallbackWithResult(this, 28)), Integer.valueOf(setTagsokhttp.onExtraCallbackWithResult(this, 16)), Integer.valueOf(setTagsokhttp.onExtraCallbackWithResult(this, 16)), Integer.valueOf(setTagsokhttp.onExtraCallbackWithResult(this, 10))};
        this.requestPostMessageChannel = new Paint();
        Float fValueOf = Float.valueOf(8.0f);
        Float fValueOf2 = Float.valueOf(5.0f);
        this.requestPostMessageChannelWithExtras = new Float[]{fValueOf, fValueOf, fValueOf2, fValueOf2};
        this.receiveFile = new Float[]{Float.valueOf(7.0f), fValueOf2, Float.valueOf(4.0f), Float.valueOf(3.0f)};
        this.ICustomTabsServiceDefault = new Float[]{Float.valueOf(96.0f), Float.valueOf(80.0f), Float.valueOf(64.0f), Float.valueOf(52.0f)};
        this.ICustomTabsServiceStub = new Float[]{Float.valueOf(56.0f), Float.valueOf(48.0f), Float.valueOf(38.0f), Float.valueOf(32.0f)};
        this.ICustomTabsCallback_Parcel = setTagsokhttp.onExtraCallbackWithResult(this, 8);
        this.ICustomTabsService_Parcel = IAuthTabCallbackDefault.FILL;
        this.IEngagementSignalsCallbackStub = IAuthTabCallbackStub.PRIMARY;
        this.ICustomTabsServiceStubProxy = onWarmupCompleted.XLARGE;
        this.onActivityLayout = IAuthTabCallback.INLINE;
        this.postMessage = CollectionsKt.listOf(new RallyCanvas[]{new RallyCanvas(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, 0.0f, 2097150, null), new RallyCanvas(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, 0.0f, 2097150, null), new RallyCanvas(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, 0.0f, 2097150, null)});
        this.onRelationshipValidationResult = new RallyCanvas(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, 0.0f, 2097150, null);
        this.IEngagementSignalsCallback = new RallyCanvas(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, 0.0f, 2097150, null);
        this.setEngagementSignalsCallback = new RallyCanvas(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, 0.0f, 2097150, null);
        if (isEnabled()) {
            onextracallbackwithresult = onExtraCallbackWithResult.ENABLED;
        } else {
            onextracallbackwithresult = onExtraCallbackWithResult.DISABLED;
            int i2 = IPostMessageServiceDefault + 109;
            IEngagementSignalsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.IAuthTabCallback_Parcel = onextracallbackwithresult;
        this.extraCallbackWithResult = true;
        this.writeTypedObject = true;
        this.IPostMessageService = -1;
        this.warmup = -1L;
        this.readTypedObject = 1.0f;
        this.IEngagementSignalsCallback_Parcel = new head(this, (View) null, false, new Function1() { // from class: im.toss.tds.view.component.atom.button.TdsButtonV1View$$ExternalSyntheticLambda7
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i52 = 2 % 2;
                int i6 = onNavigationEvent + 35;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = TdsButtonV1View.onNavigationEvent(this.f$0, ((Boolean) obj).booleanValue());
                int i8 = onNavigationEvent + 79;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                return appLovinSdkSettingsOnNavigationEvent;
            }
        }, 6, (DefaultConstructorMarker) null);
        this.onUnminimized = new Paint();
        this.prefetchWithMultipleUrls = new Paint();
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{this, attributeSet}, -741645653, handleRemoveKey.onExtraCallbackWithResult(), 741645658);
        int i5 = IPostMessageServiceDefault + 91;
        IEngagementSignalsCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void onWarmupCompleted(TdsButtonV1View tdsButtonV1View, AttributeSet attributeSet, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initialize");
        }
        if ((i & 1) != 0) {
            int i3 = IEngagementSignalsCallbackStubProxy + 21;
            IPostMessageServiceDefault = i3 % 128;
            int i4 = i3 % 2;
            attributeSet = null;
        }
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{tdsButtonV1View, attributeSet}, -741645653, handleRemoveKey.onExtraCallbackWithResult(), 741645658);
        int i5 = IEngagementSignalsCallbackStubProxy + 103;
        IPostMessageServiceDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Resources.NotFoundException {
        TdsButtonV1View tdsButtonV1View = (TdsButtonV1View) objArr[0];
        AttributeSet attributeSet = (AttributeSet) objArr[1];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 59;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        tdsButtonV1View.ICustomTabsCallbackDefault();
        tdsButtonV1View.onExtraCallbackWithResult(attributeSet);
        tdsButtonV1View.onPostMessage();
        tdsButtonV1View.onMessageChannelReady();
        tdsButtonV1View.onActivityResized();
        tdsButtonV1View.onActivityLayout();
        tdsButtonV1View.requestPostMessageChannel.setColor(tdsButtonV1View.onUnminimized().onWarmupCompleted(setCallTimeoutokhttp.onExtraCallback(tdsButtonV1View.IAuthTabCallback_Parcel)));
        tdsButtonV1View.requestPostMessageChannel.setStyle(Paint.Style.FILL);
        tdsButtonV1View.newSessionWithExtras = true;
        int i4 = IPostMessageServiceDefault + 13;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(boolean z) {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 53;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (getMeasuredWidth() <= 0) {
            return;
        }
        if (z) {
            int i4 = IEngagementSignalsCallbackStubProxy + 111;
            IPostMessageServiceDefault = i4 % 128;
            if (i4 % 2 != 0) {
                onextracallbackwithresult = onExtraCallbackWithResult.LOADING;
                int i5 = 31 / 0;
            } else {
                onextracallbackwithresult = onExtraCallbackWithResult.LOADING;
            }
            int i6 = IEngagementSignalsCallbackStubProxy + 61;
            IPostMessageServiceDefault = i6 % 128;
            int i7 = i6 % 2;
        } else {
            onextracallbackwithresult = onExtraCallbackWithResult.LOADING_DISABLED;
        }
        this.requestPostMessageChannel.setColor(onUnminimized().onWarmupCompleted(setCallTimeoutokhttp.onExtraCallback(onextracallbackwithresult)));
        this.onUnminimized.setShader(new RadialGradient(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredWidth() / 2.0f) * 1.05f, onUnminimized().onExtraCallbackWithResult(), onUnminimized().onExtraCallback(), Shader.TileMode.CLAMP));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(AttributeSet attributeSet) {
        int i = 2 % 2;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, im.toss.tds.view.R.styleable.TdsButtonV1View);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            IntRange intRangeUntil = RangesKt.until(0, typedArrayObtainStyledAttributes.getIndexCount());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            IntIterator it = intRangeUntil.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(typedArrayObtainStyledAttributes.getIndex(it.nextInt())));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int i2 = IPostMessageServiceDefault + 43;
                IEngagementSignalsCallbackStubProxy = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    ((Number) it2.next()).intValue();
                    int i3 = im.toss.tds.view.R.styleable.TdsButtonV1View_android_textAllCaps;
                    obj.hashCode();
                    throw null;
                }
                int iIntValue = ((Number) it2.next()).intValue();
                int i4 = im.toss.tds.view.R.styleable.TdsButtonV1View_android_textAllCaps;
                if (iIntValue == i4) {
                    int i5 = IPostMessageServiceDefault + 79;
                    IEngagementSignalsCallbackStubProxy = i5 % 128;
                    if (i5 % 2 == 0) {
                        typedArrayObtainStyledAttributes.hasValue(i4);
                        throw null;
                    }
                    if (typedArrayObtainStyledAttributes.hasValue(i4)) {
                        this.IAuthTabCallbackStub = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(i4, false));
                    }
                } else {
                    int i6 = im.toss.tds.view.R.styleable.TdsButtonV1View_buttonsStyle;
                    if (iIntValue == i6) {
                        this.ICustomTabsService_Parcel = (IAuthTabCallbackDefault) IAuthTabCallbackDefault.getEntries().get(typedArrayObtainStyledAttributes.getInt(i6, 0));
                    } else {
                        int i7 = im.toss.tds.view.R.styleable.TdsButtonV1View_buttonsType;
                        if (iIntValue == i7) {
                            this.IEngagementSignalsCallbackStub = (IAuthTabCallbackStub) IAuthTabCallbackStub.getEntries().get(typedArrayObtainStyledAttributes.getInt(i7, 0));
                        } else {
                            int i8 = im.toss.tds.view.R.styleable.TdsButtonV1View_buttonsSize;
                            if (iIntValue == i8) {
                                int i9 = IPostMessageServiceDefault + 35;
                                IEngagementSignalsCallbackStubProxy = i9 % 128;
                                int i10 = i9 % 2;
                                this.ICustomTabsServiceStubProxy = (onWarmupCompleted) onWarmupCompleted.getEntries().get(typedArrayObtainStyledAttributes.getInt(i8, 0));
                                int i11 = IEngagementSignalsCallbackStubProxy + 11;
                                IPostMessageServiceDefault = i11 % 128;
                                int i12 = i11 % 2;
                            } else {
                                int i13 = im.toss.tds.view.R.styleable.TdsButtonV1View_buttonsDisplay;
                                if (iIntValue == i13) {
                                    int i14 = IPostMessageServiceDefault + 13;
                                    IEngagementSignalsCallbackStubProxy = i14 % 128;
                                    int i15 = i14 % 2;
                                    this.onActivityLayout = (IAuthTabCallback) IAuthTabCallback.getEntries().get(typedArrayObtainStyledAttributes.getInt(i13, 0));
                                } else if (iIntValue == im.toss.tds.view.R.styleable.TdsButtonV1View_buttonsIconSrc) {
                                    this.ICustomTabsCallbackDefault = IAuthTabCallback(typedArrayObtainStyledAttributes.getDrawable(iIntValue));
                                } else if (iIntValue == im.toss.tds.view.R.styleable.TdsButtonV1View_buttonsIconSize) {
                                    int i16 = IEngagementSignalsCallbackStubProxy + 1;
                                    IPostMessageServiceDefault = i16 % 128;
                                    int i17 = i16 % 2;
                                    float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(iIntValue, 0);
                                    this.isEngagementSignalsApiAvailable = dimensionPixelSize;
                                    this.ICustomTabsService = dimensionPixelSize;
                                } else if (iIntValue == im.toss.tds.view.R.styleable.TdsButtonV1View_buttonsArrow) {
                                    setArrow(typedArrayObtainStyledAttributes.getBoolean(iIntValue, false));
                                } else if (iIntValue == im.toss.tds.view.R.styleable.TdsButtonV1View_buttonsOuterStrokeColor) {
                                    setButtonsOuterStrokeColor(typedArrayObtainStyledAttributes.getColor(iIntValue, 0));
                                } else if (iIntValue == im.toss.tds.view.R.styleable.TdsButtonV1View_buttonsOuterStrokeWidth) {
                                    int i18 = IPostMessageServiceDefault + 107;
                                    IEngagementSignalsCallbackStubProxy = i18 % 128;
                                    int i19 = i18 % 2;
                                    setButtonsOuterStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(iIntValue, 0));
                                } else if (iIntValue == im.toss.tds.view.R.styleable.TdsButtonV1View_buttonsStrokeColor) {
                                    int i20 = IPostMessageServiceDefault + 43;
                                    IEngagementSignalsCallbackStubProxy = i20 % 128;
                                    int i21 = i20 % 2;
                                    setButtonsStrokeColor(typedArrayObtainStyledAttributes.getColor(iIntValue, 0));
                                } else if (iIntValue == im.toss.tds.view.R.styleable.TdsButtonV1View_buttonsStrokeWidth) {
                                    setButtonsStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(iIntValue, 0));
                                }
                            }
                        }
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        Bitmap bitmap = this.ICustomTabsCallbackDefault;
        if (bitmap != null) {
            setIcon(bitmap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        this.extraCommand = new Paint();
        this.onMessageChannelReady = new Rect();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), im.toss.tds.R.drawable.list_arrow);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "");
        this.IAuthTabCallbackDefault = bitmapDecodeResource;
        Bitmap bitmap = null;
        if (bitmapDecodeResource == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = IEngagementSignalsCallbackStubProxy + 79;
            IPostMessageServiceDefault = i2 % 128;
            int i3 = i2 % 2;
            bitmapDecodeResource = null;
        }
        int width = bitmapDecodeResource.getWidth();
        Bitmap bitmap2 = this.IAuthTabCallbackDefault;
        if (bitmap2 == null) {
            int i4 = IPostMessageServiceDefault + 63;
            IEngagementSignalsCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            bitmap = bitmap2;
        }
        this.asInterface = new Rect(0, 0, width, bitmap.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onPostMessage() throws Resources.NotFoundException {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy;
        int i3 = i2 + 21;
        IPostMessageServiceDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Boolean bool = this.IAuthTabCallbackStub;
            if (bool == null) {
                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(im.toss.tds.view.R.style.TdsButton, new int[]{android.R.attr.textAllCaps});
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
                boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
                typedArrayObtainStyledAttributes.recycle();
                zBooleanValue = z;
            } else {
                int i4 = i2 + 49;
                IPostMessageServiceDefault = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNull(bool);
                zBooleanValue = bool.booleanValue();
            }
            setAllCaps(zBooleanValue);
            onNavigationEvent(((Integer) setCertificatePinnerokhttp.onExtraCallbackWithResult(new Object[]{onUnminimized()}, -1833968944, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1833968944, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).intValue());
            Drawable drawableOnWarmupCompleted = onUnminimized().onWarmupCompleted(getContext(), this.ICustomTabsServiceStubProxy, this.onActivityLayout, this.ICustomTabsCallbackStubProxy, this.prefetch);
            onExtraCallbackWithResult(drawableOnWarmupCompleted);
            setBackground(drawableOnWarmupCompleted);
            setTextColor(onUnminimized().onNavigationEvent(setCallTimeoutokhttp.onExtraCallback(this.IAuthTabCallback_Parcel)));
            setFont(response.SemiBold);
            setTextSize(0, IAuthTabCallbackStub(this.ICustomTabsServiceStubProxy));
            setEllipsize(TextUtils.TruncateAt.END);
            VectorConvertersKtExternalSyntheticLambda8.onNavigationEvent(this, getBacktraceNoteBytes.onExtraCallback(protocol.IAuthTabCallback(IAuthTabCallbackStub(this.ICustomTabsServiceStubProxy), ConnectionPool.onWarmupCompleted.onWarmupCompleted())));
            Paint paint = this.extraCommand;
            if (paint != null) {
                paint.setColorFilter(new PorterDuffColorFilter(getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
            this.prefetchWithMultipleUrls.setColor(onUnminimized().onNavigationEvent());
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[PHI: r1
      0x0036: PHI (r1v2 java.lang.Float) = (r1v1 java.lang.Float), (r1v14 java.lang.Float) binds: [B:3:0x0007, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onMessageChannelReady() {
        float fFloatValue;
        RoundDrawable roundDrawable;
        int i = 2 % 2;
        Float fValueOf = this.ICustomTabsCallbackStubProxy;
        if (fValueOf != null) {
            fFloatValue = fValueOf.floatValue();
        } else {
            Drawable drawable = this.getInterfaceDescriptor;
            if (drawable instanceof RoundDrawable) {
                roundDrawable = (RoundDrawable) drawable;
            } else {
                int i2 = IPostMessageServiceDefault + 93;
                IEngagementSignalsCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
                roundDrawable = null;
            }
            if (roundDrawable != null) {
                fValueOf = Float.valueOf(roundDrawable.onNavigationEvent());
                int i4 = IEngagementSignalsCallbackStubProxy + 25;
                IPostMessageServiceDefault = i4 % 128;
                int i5 = i4 % 2;
            } else {
                fValueOf = null;
            }
            if (fValueOf == null) {
                fFloatValue = 0.0f;
            }
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(setBodyokhttp.IAuthTabCallback(onUnminimized().onNavigationEvent(), onUnminimized().onExtraCallbackWithResult(false)));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "");
        setForeground(new RippleDrawable(colorStateListValueOf, null, deprecated_noTransform.onExtraCallback(fFloatValue)));
        setElevation(0.0f);
        setTranslationZ(0.0f);
        setStateListAnimator(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setFont(@NotNull response responseVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(responseVar, "");
        if (!isInEditMode()) {
            int i2 = IPostMessageServiceDefault + 19;
            IEngagementSignalsCallbackStubProxy = i2 % 128;
            setTypeface(i2 % 2 == 0 ? response.toTypeface$default(responseVar, getContext(), null, 3, null) : response.toTypeface$default(responseVar, getContext(), null, 2, null));
        }
        int i3 = IPostMessageServiceDefault + 125;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onActivityResized() throws Resources.NotFoundException {
        int minimumWidth;
        int iOnNavigationEvent;
        int i = 2 % 2;
        if (!this.extraCallbackWithResult) {
            Object[] objArr = {this, this.ICustomTabsServiceStubProxy};
            int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
            int iIntValue = ((Integer) IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, -406880225, handleRemoveKey.onExtraCallbackWithResult(), 406880235)).intValue();
            int iOnNavigationEvent2 = onNavigationEvent(this.ICustomTabsServiceStubProxy);
            setMinWidth(iIntValue);
            setMinHeight(iOnNavigationEvent2);
            setMinimumWidth(iIntValue);
            setMinimumHeight(iOnNavigationEvent2);
            return;
        }
        int i2 = IPostMessageServiceDefault + 63;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(im.toss.tds.view.R.style.TdsButton, new int[]{android.R.attr.minWidth, android.R.attr.minHeight});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int iOnExtraCallback = getBacktraceNoteBytes.onExtraCallback(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        int iOnExtraCallback2 = getBacktraceNoteBytes.onExtraCallback(typedArrayObtainStyledAttributes.getDimension(1, 0.0f));
        typedArrayObtainStyledAttributes.recycle();
        if (getMinimumWidth() == iOnExtraCallback) {
            int i4 = IPostMessageServiceDefault + 89;
            IEngagementSignalsCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr2 = {this, this.ICustomTabsServiceStubProxy};
                int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
                minimumWidth = ((Integer) IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr2, -406880225, handleRemoveKey.onExtraCallbackWithResult(), 406880235)).intValue();
                int i5 = 92 / 0;
            } else {
                Object[] objArr3 = {this, this.ICustomTabsServiceStubProxy};
                int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
                minimumWidth = ((Integer) IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, objArr3, -406880225, handleRemoveKey.onExtraCallbackWithResult(), 406880235)).intValue();
            }
        } else {
            minimumWidth = getMinimumWidth();
        }
        if (getMinimumHeight() == iOnExtraCallback2) {
            int i6 = IEngagementSignalsCallbackStubProxy + 69;
            IPostMessageServiceDefault = i6 % 128;
            if (i6 % 2 != 0) {
                onNavigationEvent(this.ICustomTabsServiceStubProxy);
                throw null;
            }
            iOnNavigationEvent = onNavigationEvent(this.ICustomTabsServiceStubProxy);
        } else {
            int minimumHeight = getMinimumHeight();
            int i7 = IPostMessageServiceDefault + 3;
            IEngagementSignalsCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            iOnNavigationEvent = minimumHeight;
        }
        setMinWidth(minimumWidth);
        setMinHeight(iOnNavigationEvent);
        setMinimumWidth(minimumWidth);
        setMinimumHeight(iOnNavigationEvent);
        this.extraCallbackWithResult = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
    
        if (getPaddingLeft() != r3) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        r1 = im.toss.tds.view.component.atom.button.TdsButtonV1View.IPostMessageServiceDefault + 7;
        im.toss.tds.view.component.atom.button.TdsButtonV1View.IEngagementSignalsCallbackStubProxy = r1 % 128;
        r1 = r1 % 2;
        r1 = IAuthTabCallback(r6.ICustomTabsServiceStubProxy);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r1 = getPaddingLeft();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        if (getPaddingRight() != r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        r3 = IAuthTabCallback(r6.ICustomTabsServiceStubProxy);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        r3 = getPaddingRight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        setPadding(r1, 0, r3, 0);
        setPaddingRelative(r1, 0, r3, 0);
        r6.writeTypedObject = false;
        r1 = im.toss.tds.view.component.atom.button.TdsButtonV1View.IPostMessageServiceDefault + 97;
        im.toss.tds.view.component.atom.button.TdsButtonV1View.IEngagementSignalsCallbackStubProxy = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if ((r1 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        r0 = 81 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
    
        r0 = IAuthTabCallback(r6.ICustomTabsServiceStubProxy);
        setPadding(r0, 0, r0, 0);
        setPaddingRelative(r0, 0, r0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r6.writeTypedObject != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r6.writeTypedObject != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = getContext().obtainStyledAttributes(im.toss.tds.view.R.style.TdsButton, new int[]{android.R.attr.paddingLeft, android.R.attr.paddingRight});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r3 = o.getBacktraceNoteBytes.onExtraCallback(r1.getDimension(0, getPaddingLeft()));
        r4 = o.getBacktraceNoteBytes.onExtraCallback(r1.getDimension(1, getPaddingRight()));
        r1.recycle();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onActivityLayout() throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 115;
        IPostMessageServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 61 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int measuredWidth = getMeasuredWidth();
        super/*android.view.View*/.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        float fMeasureText = 0.0f;
        if (mode == Integer.MIN_VALUE) {
            float f = this.ICustomTabsCallbackDefault != null ? this.ICustomTabsCallbackStub + 0.0f : 0.0f;
            if (this.asBinder) {
                f += this.onTransact;
            }
            if (f > 0.0f) {
                int i4 = IEngagementSignalsCallbackStubProxy + 93;
                IPostMessageServiceDefault = i4 % 128;
                setMeasuredDimension((int) (i4 % 2 != 0 ? getMeasuredWidth() % f : getMeasuredWidth() + f), getMeasuredHeight());
            }
        }
        if (getText() != null) {
            int i5 = IEngagementSignalsCallbackStubProxy + 17;
            IPostMessageServiceDefault = i5 % 128;
            fMeasureText = i5 % 2 != 0 ? getPaint().measureText(getText(), 1, getText().length()) : getPaint().measureText(getText(), 0, getText().length());
        }
        this.onSessionEnded = fMeasureText;
        this.IPostMessageService = mode;
        if (measuredWidth == 0) {
            onExtraCallback(isEnabled());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onConfigurationChanged(@Nullable Configuration configuration) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 125;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            super/*android.view.View*/.onConfigurationChanged(configuration);
            this.ICustomTabsCallback = onRelationshipValidationResult();
            int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
            IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this}, 1306986311, handleRemoveKey.onExtraCallbackWithResult(), -1306986307);
            onPostMessage();
            onMessageChannelReady();
            int i3 = 12 / 0;
            return;
        }
        super/*android.view.View*/.onConfigurationChanged(configuration);
        this.ICustomTabsCallback = onRelationshipValidationResult();
        int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = handleRemoveKey.onExtraCallbackWithResult();
        IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, new Object[]{this}, 1306986311, handleRemoveKey.onExtraCallbackWithResult(), -1306986307);
        onPostMessage();
        onMessageChannelReady();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawableStateChanged() {
        int i = 2 % 2;
        super.drawableStateChanged();
        Paint paint = this.extraCommand;
        if (paint != null) {
            paint.setColorFilter(new PorterDuffColorFilter(getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            int i2 = IEngagementSignalsCallbackStubProxy + 61;
            IPostMessageServiceDefault = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = IPostMessageServiceDefault + 79;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 85;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.onAttachedToWindow();
        setLoading(this.newSession);
        int i4 = IPostMessageServiceDefault + 101;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        super/*android.view.View*/.onDetachedFromWindow();
        runOnUiThreadDelayed runonuithreaddelayed = this.onNavigationEvent;
        if (runonuithreaddelayed != null) {
            int i2 = IEngagementSignalsCallbackStubProxy + 59;
            IPostMessageServiceDefault = i2 % 128;
            if (i2 % 2 == 0) {
                runonuithreaddelayed.onNavigationEvent();
            } else {
                runonuithreaddelayed.onNavigationEvent();
                int i3 = 74 / 0;
            }
        }
        runOnUiThreadDelayed runonuithreaddelayed2 = this.validateRelationship;
        if (runonuithreaddelayed2 != null) {
            int i4 = IEngagementSignalsCallbackStubProxy + 3;
            IPostMessageServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            runonuithreaddelayed2.onNavigationEvent();
            if (i5 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = IEngagementSignalsCallbackStubProxy + 69;
            IPostMessageServiceDefault = i6 % 128;
            int i7 = i6 % 2;
        }
        this.warmup = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setEnabled(boolean z) {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 17;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsEnabled = isEnabled();
        onExtraCallbackWithResult onextracallbackwithresult2 = this.IAuthTabCallback_Parcel;
        onExtraCallbackWithResult onextracallbackwithresult3 = onExtraCallbackWithResult.LOADING;
        if (onextracallbackwithresult2 != onextracallbackwithresult3) {
            int i4 = IEngagementSignalsCallbackStubProxy + 21;
            IPostMessageServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            onextracallbackwithresult = onextracallbackwithresult2 != onExtraCallbackWithResult.LOADING_DISABLED ? z ? onExtraCallbackWithResult.ENABLED : onExtraCallbackWithResult.DISABLED : z ? onextracallbackwithresult3 : onExtraCallbackWithResult.LOADING_DISABLED;
        }
        this.IAuthTabCallback_Parcel = onextracallbackwithresult;
        onExtraCallback(z);
        isEngagementSignalsApiAvailable();
        if (this.newSessionWithExtras && z == isEnabled()) {
            int i6 = IEngagementSignalsCallbackStubProxy + 15;
            IPostMessageServiceDefault = i6 % 128;
            if (i6 % 2 != 0) {
                isEnabled();
                throw null;
            }
            if (zIsEnabled != isEnabled()) {
                int i7 = IPostMessageServiceDefault + 21;
                IEngagementSignalsCallbackStubProxy = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 75 / 0;
                    if (getInstallBeginTimestampServerSeconds.asInterface(this)) {
                        onInstallReferrerSetupFinished.onExtraCallback(onInstallReferrerSetupFinished.onWarmupCompleted, this, (initMiniApp) null, 2, (Object) null);
                    }
                } else if (getInstallBeginTimestampServerSeconds.asInterface(this)) {
                }
            }
        }
        onExtraCallbackWithResult onextracallbackwithresult4 = this.IAuthTabCallback_Parcel;
        if (onextracallbackwithresult4 == onextracallbackwithresult3 || onextracallbackwithresult4 == onExtraCallbackWithResult.LOADING_DISABLED) {
            onExtraCallbackWithResult(true);
            return;
        }
        int i9 = IPostMessageServiceDefault + 89;
        IEngagementSignalsCallbackStubProxy = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(TdsButtonV1View tdsButtonV1View, float f) {
        RoundDrawable roundDrawable;
        int i = 2 % 2;
        int iIntValue = ((Integer) setCertificatePinnerokhttp.onExtraCallbackWithResult(new Object[]{tdsButtonV1View.onUnminimized()}, -1833968944, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1833968944, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).intValue();
        int iOnNavigationEvent = tdsButtonV1View.onUnminimized().onNavigationEvent(setCallTimeoutokhttp.onExtraCallback(tdsButtonV1View.IAuthTabCallback_Parcel));
        int iOnWarmupCompleted = tdsButtonV1View.onUnminimized().onWarmupCompleted(setCallTimeoutokhttp.onExtraCallback(tdsButtonV1View.IAuthTabCallback_Parcel));
        int iIntValue2 = new setHasUserConsent(tdsButtonV1View.onPostMessage, iIntValue).IAuthTabCallback(f).intValue();
        Drawable background = tdsButtonV1View.getBackground();
        if (!(background instanceof RoundDrawable)) {
            roundDrawable = null;
        } else {
            int i2 = IEngagementSignalsCallbackStubProxy + 21;
            int i3 = i2 % 128;
            IPostMessageServiceDefault = i3;
            int i4 = i2 % 2;
            roundDrawable = (RoundDrawable) background;
            int i5 = i3 + 93;
            IEngagementSignalsCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
        }
        if (roundDrawable != null) {
            int i7 = IEngagementSignalsCallbackStubProxy + 45;
            IPostMessageServiceDefault = i7 % 128;
            int i8 = i7 % 2;
            roundDrawable.IAuthTabCallback(iIntValue2);
        }
        tdsButtonV1View.onNavigationEvent(iIntValue2);
        tdsButtonV1View.setTextColor(new setHasUserConsent(tdsButtonV1View.getCurrentTextColor(), iOnNavigationEvent).IAuthTabCallback(f).intValue());
        Paint paint = tdsButtonV1View.requestPostMessageChannel;
        paint.setColor(new setHasUserConsent(paint.getColor(), iOnWarmupCompleted).IAuthTabCallback(f).intValue());
        return Unit.INSTANCE;
    }

    private final void isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        if (onTransact.onExtraCallback[this.IAuthTabCallback_Parcel.ordinal()] == 3) {
            int i2 = IPostMessageServiceDefault + 89;
            IEngagementSignalsCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                super/*android.view.View*/.setEnabled(false);
            } else {
                super/*android.view.View*/.setEnabled(true);
            }
        } else {
            super/*android.view.View*/.setEnabled(false);
        }
        runOnUiThreadDelayed runonuithreaddelayed = this.onNavigationEvent;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
            int i3 = IEngagementSignalsCallbackStubProxy + 65;
            IPostMessageServiceDefault = i3 % 128;
            int i4 = i3 % 2;
        }
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted(this, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt.listOf((Rally) RallysKt.onWarmupCompleted(new Object[]{this, isMuted.onNavigationEvent((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(0.0f), Float.valueOf(1.0f), new Function1() { // from class: im.toss.tds.view.component.atom.button.TdsButtonV1View$$ExternalSyntheticLambda8
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i5 = 2 % 2;
                int i6 = onExtraCallback + 5;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr = {this.f$0, Float.valueOf(((Float) obj).floatValue())};
                int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
                Unit unit = (Unit) TdsButtonV1View.IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, -140140411, handleRemoveKey.onExtraCallbackWithResult(), 140140414);
                int i8 = onExtraCallbackWithResult + 111;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                return unit;
            }
        }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), Float.valueOf(getAlpha()), Float.valueOf(this.newSessionWithExtras ? ((Float) setCertificatePinnerokhttp.onExtraCallbackWithResult(new Object[]{onUnminimized(), Boolean.valueOf(setCallTimeoutokhttp.onExtraCallback(this.IAuthTabCallback_Parcel))}, 319612355, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -319612354, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).floatValue() : 1.0f), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)), 0, null, 0, deprecated_certificatepinner.onNavigationEvent(), null, Boolean.FALSE, 0, 0L, false, 3768, null);
        this.onNavigationEvent = runonuithreaddelayedOnWarmupCompleted;
        if (runonuithreaddelayedOnWarmupCompleted != null) {
            int i5 = IPostMessageServiceDefault + 25;
            IEngagementSignalsCallbackStubProxy = i5 % 128;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float IAuthTabCallbackStub(onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        float fIAuthTabCallback = varyMatches.IAuthTabCallback((View) this, (Number) Float.valueOf(deprecated_cacheResponse.onExtraCallbackWithResult(this, new connectionCount(this.IEngagementSignalsCallbackDefault[onwarmupcompleted.getIndex()].floatValue(), 0.0f, 2, null), 0.0f, 2, (Object) null)));
        int i2 = IPostMessageServiceDefault + 3;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return fIAuthTabCallback;
        }
        throw null;
    }

    private final float onWarmupCompleted(onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 101;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Float[] fArr = this.requestPostMessageChannelWithExtras;
        int index = onwarmupcompleted.getIndex();
        if (i3 != 0) {
            return fArr[index].floatValue();
        }
        float fFloatValue = fArr[index].floatValue();
        int i4 = 54 / 0;
        return fFloatValue;
    }

    private final float onExtraCallback(onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 93;
        IPostMessageServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            this.receiveFile[onwarmupcompleted.getIndex()].floatValue();
            throw null;
        }
        float fFloatValue = this.receiveFile[onwarmupcompleted.getIndex()].floatValue();
        int i3 = IPostMessageServiceDefault + 81;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return fFloatValue;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int onNavigationEvent(onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 83;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            setTagsokhttp.onExtraCallbackWithResult(this, this.ICustomTabsServiceStub[onwarmupcompleted.getIndex()]);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(this, this.ICustomTabsServiceStub[onwarmupcompleted.getIndex()]);
        int i3 = IPostMessageServiceDefault + 77;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return iOnExtraCallbackWithResult;
    }

    private final int IAuthTabCallback(onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 89;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = this.onGreatestScrollPercentageIncreased[onwarmupcompleted.getIndex()].intValue();
        int i4 = IPostMessageServiceDefault + 121;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean performClick() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 91;
        IPostMessageServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, this, (initMiniApp) null, 3, (Object) null);
        } else {
            onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, this, (initMiniApp) null, 2, (Object) null);
        }
        return super/*android.view.View*/.performClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setIcon(int i) {
        int i2 = 2 % 2;
        int i3 = IPostMessageServiceDefault + 35;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawableOnExtraCallback = null;
        try {
            drawableOnExtraCallback = ResourcesCompat.onExtraCallback(getResources(), i, (Resources.Theme) null);
        } catch (Throwable unused) {
        }
        setIcon(drawableOnExtraCallback);
        int i5 = IPostMessageServiceDefault + 99;
        IEngagementSignalsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setIcon(@Nullable Drawable drawable) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 75;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        setIcon(IAuthTabCallback(drawable));
        int i4 = IEngagementSignalsCallbackStubProxy + 95;
        IPostMessageServiceDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setIcon(@Nullable Bitmap bitmap) {
        int i = 2 % 2;
        Object obj = null;
        if (bitmap == null) {
            this.ICustomTabsCallbackDefault = null;
            this.mayLaunchUrl = null;
            this.isEngagementSignalsApiAvailable = 0.0f;
            this.ICustomTabsService = 0.0f;
            this.ICustomTabsCallbackStub = 0.0f;
        } else {
            this.ICustomTabsCallbackDefault = bitmap;
            Intrinsics.checkNotNull(bitmap);
            int width = bitmap.getWidth();
            Bitmap bitmap2 = this.ICustomTabsCallbackDefault;
            Intrinsics.checkNotNull(bitmap2);
            Rect rect = new Rect(0, 0, width, bitmap2.getHeight());
            this.mayLaunchUrl = rect;
            if (this.isEngagementSignalsApiAvailable == 0.0f) {
                int i2 = IPostMessageServiceDefault + 43;
                IEngagementSignalsCallbackStubProxy = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNull(rect);
                    this.isEngagementSignalsApiAvailable = rect.width();
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNull(rect);
                this.isEngagementSignalsApiAvailable = rect.width();
            }
            if (this.ICustomTabsService == 0.0f) {
                int i3 = IEngagementSignalsCallbackStubProxy + 19;
                IPostMessageServiceDefault = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNull(this.mayLaunchUrl);
                this.ICustomTabsService = r7.height();
            }
            this.ICustomTabsCallbackStub = this.isEngagementSignalsApiAvailable + this.ICustomTabsCallback_Parcel;
        }
        requestLayout();
    }

    public final void setButtonType(@NotNull IAuthTabCallbackStub iAuthTabCallbackStub) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 59;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        setTheme$default(this, iAuthTabCallbackStub, null, null, null, 14, null);
        int i4 = IEngagementSignalsCallbackStubProxy + 11;
        IPostMessageServiceDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setButtonStyle(@NotNull IAuthTabCallbackDefault iAuthTabCallbackDefault) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 21;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
        setTheme$default(this, null, iAuthTabCallbackDefault, null, null, 13, null);
        int i4 = IPostMessageServiceDefault + 93;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setButtonSize(@NotNull onWarmupCompleted onwarmupcompleted) throws Resources.NotFoundException {
        IAuthTabCallbackStub iAuthTabCallbackStub;
        IAuthTabCallbackDefault iAuthTabCallbackDefault;
        IAuthTabCallback iAuthTabCallback;
        int i;
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStubProxy + 65;
        IPostMessageServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            iAuthTabCallbackStub = null;
            iAuthTabCallbackDefault = null;
            iAuthTabCallback = null;
            i = 44;
        } else {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            iAuthTabCallbackStub = null;
            iAuthTabCallbackDefault = null;
            iAuthTabCallback = null;
            i = 11;
        }
        setTheme$default(this, iAuthTabCallbackStub, iAuthTabCallbackDefault, onwarmupcompleted, iAuthTabCallback, i, null);
        int i4 = IEngagementSignalsCallbackStubProxy + 97;
        IPostMessageServiceDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setButtonDisplay(@NotNull IAuthTabCallback iAuthTabCallback) throws Resources.NotFoundException {
        IAuthTabCallbackStub iAuthTabCallbackStub;
        IAuthTabCallbackDefault iAuthTabCallbackDefault;
        onWarmupCompleted onwarmupcompleted;
        int i;
        int i2 = 2 % 2;
        int i3 = IPostMessageServiceDefault + 11;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            iAuthTabCallbackStub = null;
            iAuthTabCallbackDefault = null;
            onwarmupcompleted = null;
            i = 111;
        } else {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            iAuthTabCallbackStub = null;
            iAuthTabCallbackDefault = null;
            onwarmupcompleted = null;
            i = 7;
        }
        setTheme$default(this, iAuthTabCallbackStub, iAuthTabCallbackDefault, onwarmupcompleted, iAuthTabCallback, i, null);
    }

    public final void setCustomColors(int i) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        this.onMinimized = new setCertificateChainCleanerokhttp(i);
        setTheme$default(this, null, null, null, null, 15, null);
        int i3 = IPostMessageServiceDefault + 55;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 47 / 0;
        }
    }

    public final void asInterface() throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 11;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.onMinimized = null;
        setTheme$default(this, null, null, null, null, 15, null);
        int i4 = IEngagementSignalsCallbackStubProxy + 5;
        IPostMessageServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void setTheme$default(TdsButtonV1View tdsButtonV1View, IAuthTabCallbackStub iAuthTabCallbackStub, IAuthTabCallbackDefault iAuthTabCallbackDefault, onWarmupCompleted onwarmupcompleted, IAuthTabCallback iAuthTabCallback, int i, Object obj) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTheme");
        }
        if ((i & 1) != 0) {
            int i3 = IEngagementSignalsCallbackStubProxy + 101;
            IPostMessageServiceDefault = i3 % 128;
            int i4 = i3 % 2;
            iAuthTabCallbackStub = tdsButtonV1View.IEngagementSignalsCallbackStub;
        }
        if ((i & 2) != 0) {
            int i5 = IPostMessageServiceDefault + 5;
            IEngagementSignalsCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                IAuthTabCallbackDefault iAuthTabCallbackDefault2 = tdsButtonV1View.ICustomTabsService_Parcel;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            iAuthTabCallbackDefault = tdsButtonV1View.ICustomTabsService_Parcel;
        }
        if ((i & 4) != 0) {
            onwarmupcompleted = tdsButtonV1View.ICustomTabsServiceStubProxy;
        }
        if ((i & 8) != 0) {
            iAuthTabCallback = tdsButtonV1View.onActivityLayout;
        }
        tdsButtonV1View.setTheme(iAuthTabCallbackStub, iAuthTabCallbackDefault, onwarmupcompleted, iAuthTabCallback);
    }

    public final void setTheme(@NotNull IAuthTabCallbackStub iAuthTabCallbackStub, @NotNull IAuthTabCallbackDefault iAuthTabCallbackDefault, @NotNull onWarmupCompleted onwarmupcompleted, @NotNull IAuthTabCallback iAuthTabCallback) throws Resources.NotFoundException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        setTheme(new asInterface(iAuthTabCallbackStub, iAuthTabCallbackDefault, onwarmupcompleted, iAuthTabCallback));
        int i2 = IEngagementSignalsCallbackStubProxy + 115;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void setTheme(@NotNull asInterface asinterface) throws Resources.NotFoundException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(asinterface, "");
        IAuthTabCallbackStub iAuthTabCallbackStubIAuthTabCallback = asinterface.IAuthTabCallback();
        if (iAuthTabCallbackStubIAuthTabCallback != null) {
            this.IEngagementSignalsCallbackStub = iAuthTabCallbackStubIAuthTabCallback;
        }
        IAuthTabCallbackDefault iAuthTabCallbackDefaultOnExtraCallback = asinterface.onExtraCallback();
        if (iAuthTabCallbackDefaultOnExtraCallback != null) {
            this.ICustomTabsService_Parcel = iAuthTabCallbackDefaultOnExtraCallback;
        }
        onWarmupCompleted onWarmupCompleted2 = asinterface.onWarmupCompleted();
        if (onWarmupCompleted2 != null) {
            this.ICustomTabsServiceStubProxy = onWarmupCompleted2;
            int i2 = IEngagementSignalsCallbackStubProxy + 89;
            IPostMessageServiceDefault = i2 % 128;
            int i3 = i2 % 2;
        }
        IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = asinterface.onExtraCallbackWithResult();
        if (iAuthTabCallbackOnExtraCallbackWithResult != null) {
            int i4 = IEngagementSignalsCallbackStubProxy + 49;
            IPostMessageServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            this.onActivityLayout = iAuthTabCallbackOnExtraCallbackWithResult;
        }
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this}, 1306986311, handleRemoveKey.onExtraCallbackWithResult(), -1306986307);
        onPostMessage();
        onMessageChannelReady();
        onActivityResized();
        onActivityLayout();
        onExtraCallback(setCallTimeoutokhttp.onExtraCallback(this.IAuthTabCallback_Parcel));
        if (this.newSessionWithExtras) {
            isEngagementSignalsApiAvailable();
            reportCustomErr.IAuthTabCallback(readTypedObject());
            int i6 = IPostMessageServiceDefault + 85;
            IEngagementSignalsCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r2 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return "custom";
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        r0 = r4.IEngagementSignalsCallbackStub.name().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4.onMinimized != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4.onMinimized != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 61;
        im.toss.tds.view.component.atom.button.TdsButtonV1View.IPostMessageServiceDefault = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 55;
        int i3 = i2 % 128;
        IEngagementSignalsCallbackStubProxy = i3;
        if (i2 % 2 == 0) {
            int i4 = 48 / 0;
        }
    }

    private static final Unit onWarmupCompleted(float f, float f2, float f3, TdsButtonV1View tdsButtonV1View, Canvas canvas) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 1;
        IPostMessageServiceDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(canvas, "");
            canvas.drawCircle(f, f2, f3, tdsButtonV1View.onUnminimized);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(canvas, "");
        canvas.drawCircle(f, f2, f3, tdsButtonV1View.onUnminimized);
        int i3 = 96 / 0;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r3
      0x0027: PHI (r3v2 java.lang.Float) = (r3v1 java.lang.Float), (r3v13 java.lang.Float) binds: [B:8:0x0025, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(RallyCanvas rallyCanvas, float f, int i, float f2, float f3, float f4, float f5, TdsButtonV1View tdsButtonV1View, Canvas canvas) {
        Float typedObject;
        float fFloatValue;
        int i2 = 2 % 2;
        int i3 = IPostMessageServiceDefault + 33;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(canvas, "");
            typedObject = rallyCanvas.readTypedObject();
            int i4 = 21 / 0;
            if (typedObject != null) {
                fFloatValue = typedObject.floatValue();
            } else {
                int i5 = IEngagementSignalsCallbackStubProxy + 59;
                IPostMessageServiceDefault = i5 % 128;
                int i6 = i5 % 2;
                fFloatValue = 1.0f;
            }
        } else {
            Intrinsics.checkNotNullParameter(canvas, "");
            typedObject = rallyCanvas.readTypedObject();
            if (typedObject != null) {
            }
        }
        float f6 = ((fFloatValue / 5.0f) + 0.8f) * f;
        if (i == 0) {
            canvas.drawCircle((f2 - f3) - f4, f5, f6, tdsButtonV1View.requestPostMessageChannel);
        } else if (i == 1) {
            canvas.drawCircle(f2, f5, f6, tdsButtonV1View.requestPostMessageChannel);
        } else if (i == 2) {
            int i7 = IEngagementSignalsCallbackStubProxy + 87;
            IPostMessageServiceDefault = i7 % 128;
            canvas.drawCircle((i7 % 2 != 0 ? f2 - f3 : f2 + f3) + f4, f5, f6, tdsButtonV1View.requestPostMessageChannel);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(TdsButtonV1View tdsButtonV1View, Canvas canvas) {
        float fOnNavigationEvent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        Drawable drawable = tdsButtonV1View.getInterfaceDescriptor;
        RoundDrawable roundDrawable = null;
        if (drawable instanceof RoundDrawable) {
            int i2 = IEngagementSignalsCallbackStubProxy + 39;
            IPostMessageServiceDefault = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            roundDrawable = (RoundDrawable) drawable;
        } else {
            int i3 = IEngagementSignalsCallbackStubProxy + 121;
            IPostMessageServiceDefault = i3 % 128;
            int i4 = i3 % 2;
        }
        if (roundDrawable != null) {
            int i5 = IPostMessageServiceDefault + 37;
            IEngagementSignalsCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                fOnNavigationEvent = roundDrawable.onNavigationEvent();
                int i6 = 82 / 0;
            } else {
                fOnNavigationEvent = roundDrawable.onNavigationEvent();
            }
        } else {
            fOnNavigationEvent = 0.0f;
        }
        canvas.drawPath(deprecated_noStore.onNavigationEvent(deprecated_noStore.onExtraCallback, tdsButtonV1View, fOnNavigationEvent, 0, false, 6, null), tdsButtonV1View.prefetchWithMultipleUrls);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(TdsButtonV1View tdsButtonV1View, float f, float f2, float f3, Canvas canvas) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        Rect rect = null;
        if (tdsButtonV1View.ICustomTabsCallbackDefault != null) {
            canvas.save();
            canvas.translate((f - f2) / 2.0f, 0.0f);
            canvas.translate(varyMatches.IAuthTabCallback((View) tdsButtonV1View, (Number) Float.valueOf(-2.0f)), 0.0f);
            int i2 = (int) ((f3 / 2.0f) - (tdsButtonV1View.ICustomTabsService / 2.0f));
            Rect rect2 = tdsButtonV1View.onMessageChannelReady;
            if (rect2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                rect2 = null;
            }
            rect2.left = 0;
            Rect rect3 = tdsButtonV1View.onMessageChannelReady;
            if (rect3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                rect3 = null;
            }
            rect3.top = i2;
            Rect rect4 = tdsButtonV1View.onMessageChannelReady;
            if (rect4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                rect4 = null;
            }
            rect4.right = (int) (tdsButtonV1View.isEngagementSignalsApiAvailable + 0.0f);
            Rect rect5 = tdsButtonV1View.onMessageChannelReady;
            if (rect5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                rect5 = null;
            }
            rect5.bottom = (int) (i2 + tdsButtonV1View.ICustomTabsService);
            Bitmap bitmap = tdsButtonV1View.ICustomTabsCallbackDefault;
            Intrinsics.checkNotNull(bitmap);
            Rect rect6 = tdsButtonV1View.mayLaunchUrl;
            Rect rect7 = tdsButtonV1View.onMessageChannelReady;
            if (rect7 == null) {
                int i3 = IPostMessageServiceDefault + 43;
                IEngagementSignalsCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                rect7 = null;
            }
            canvas.drawBitmap(bitmap, rect6, rect7, tdsButtonV1View.extraCommand);
            canvas.restore();
            canvas.translate(tdsButtonV1View.ICustomTabsCallbackStub, 0.0f);
        }
        if (tdsButtonV1View.getText() != null) {
            canvas.restore();
            canvas.save();
            if (tdsButtonV1View.IPostMessageService == Integer.MIN_VALUE) {
                int i5 = IPostMessageServiceDefault + 23;
                IEngagementSignalsCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                canvas.translate(tdsButtonV1View.ICustomTabsCallbackStub, 0.0f);
            } else {
                canvas.translate((tdsButtonV1View.ICustomTabsCallbackStub - tdsButtonV1View.onTransact) / 2.0f, 0.0f);
                int i7 = IEngagementSignalsCallbackStubProxy + 15;
                IPostMessageServiceDefault = i7 % 128;
                int i8 = i7 % 2;
            }
            canvas.save();
            float f4 = tdsButtonV1View.onVerticalScrollEvent;
            if (f4 != 0.0f) {
                canvas.translate(0.0f, f4);
            }
            super/*android.view.View*/.onDraw(canvas);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(((f - f2) / 2.0f) + tdsButtonV1View.ICustomTabsCallbackStub + tdsButtonV1View.onSessionEnded, 0.0f);
        }
        if (tdsButtonV1View.asBinder) {
            float f5 = f3 / 2.0f;
            Bitmap bitmap2 = tdsButtonV1View.IAuthTabCallbackDefault;
            if (bitmap2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                bitmap2 = null;
            }
            int height = (int) (f5 - (bitmap2.getHeight() / 2.0f));
            Rect rect8 = tdsButtonV1View.onMessageChannelReady;
            if (rect8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                rect8 = null;
            }
            rect8.left = 0;
            Rect rect9 = tdsButtonV1View.onMessageChannelReady;
            if (rect9 == null) {
                int i9 = IPostMessageServiceDefault + 61;
                IEngagementSignalsCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                rect9 = null;
            }
            rect9.top = height;
            Rect rect10 = tdsButtonV1View.onMessageChannelReady;
            if (rect10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                rect10 = null;
            }
            Bitmap bitmap3 = tdsButtonV1View.IAuthTabCallbackDefault;
            if (bitmap3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                bitmap3 = null;
            }
            rect10.right = bitmap3.getWidth();
            Rect rect11 = tdsButtonV1View.onMessageChannelReady;
            if (rect11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i11 = IPostMessageServiceDefault + 19;
                IEngagementSignalsCallbackStubProxy = i11 % 128;
                int i12 = i11 % 2;
                rect11 = null;
            }
            Bitmap bitmap4 = tdsButtonV1View.IAuthTabCallbackDefault;
            if (bitmap4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                bitmap4 = null;
            }
            rect11.bottom = height + bitmap4.getHeight();
            Bitmap bitmap5 = tdsButtonV1View.IAuthTabCallbackDefault;
            if (bitmap5 == null) {
                int i13 = IEngagementSignalsCallbackStubProxy + 103;
                IPostMessageServiceDefault = i13 % 128;
                int i14 = i13 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                bitmap5 = null;
            }
            Rect rect12 = tdsButtonV1View.asInterface;
            if (rect12 == null) {
                int i15 = IEngagementSignalsCallbackStubProxy + 45;
                IPostMessageServiceDefault = i15 % 128;
                int i16 = i15 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                rect12 = null;
            }
            Rect rect13 = tdsButtonV1View.onMessageChannelReady;
            if (rect13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                rect = rect13;
            }
            canvas.drawBitmap(bitmap5, rect12, rect, tdsButtonV1View.extraCommand);
            canvas.translate(tdsButtonV1View.onTransact, 0.0f);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(@NotNull Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i = 2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        int iSave = canvas.save();
        float f6 = this.readTypedObject;
        canvas.scale(f6, f6, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f7 = this.ICustomTabsCallbackStub;
        float f8 = this.onSessionEnded;
        float f9 = this.onTransact;
        canvas.save();
        Drawable drawable = this.getInterfaceDescriptor;
        RoundDrawable roundDrawable = drawable instanceof RoundDrawable ? (RoundDrawable) drawable : null;
        float fOnNavigationEvent = roundDrawable != null ? roundDrawable.onNavigationEvent() : 0.0f;
        int i3 = this.IAuthTabCallbackStubProxy;
        if (i3 != 0) {
            float f10 = this.access000;
            if (f10 != 0.0f) {
                f = f9;
                f2 = f8;
                f3 = f7;
                f4 = measuredHeight;
                f5 = measuredWidth;
                removeHeader.onNavigationEvent(this, canvas, f10, i3, fOnNavigationEvent, fOnNavigationEvent, fOnNavigationEvent, fOnNavigationEvent, 0, 128, (Object) null);
            } else {
                f = f9;
                f2 = f8;
                f3 = f7;
                f4 = measuredHeight;
                f5 = measuredWidth;
            }
        }
        int i4 = this.access100;
        if (i4 != 0) {
            float f11 = this.extraCallback;
            if (f11 != 0.0f) {
                removeHeader.onExtraCallbackWithResult(this, canvas, f11, i4, fOnNavigationEvent, fOnNavigationEvent, fOnNavigationEvent, fOnNavigationEvent, 0, 128, (Object) null);
            }
        }
        if (this.newSession) {
            this.onRelationshipValidationResult.onNavigationEvent(canvas, new TdsButtonV1View$.ExternalSyntheticLambda1(getWidth() / 2, getHeight() / 2, (getWidth() / 2.0f) * 1.05f, this));
        }
        if (this.newSession) {
            int i5 = IPostMessageServiceDefault + 53;
            IEngagementSignalsCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            float fOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(this, Float.valueOf(onWarmupCompleted(this.ICustomTabsServiceStubProxy)));
            float fOnExtraCallbackWithResult2 = setTagsokhttp.onExtraCallbackWithResult(this, Float.valueOf(onExtraCallback(this.ICustomTabsServiceStubProxy)));
            float width = getWidth() / 2;
            float height = getHeight() / 2;
            float f12 = fOnExtraCallbackWithResult / 2.0f;
            Iterator<T> it = this.postMessage.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                int i8 = IEngagementSignalsCallbackStubProxy + 71;
                IPostMessageServiceDefault = i8 % 128;
                if (i8 % i != 0) {
                    it.next();
                    throw null;
                }
                Object next = it.next();
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                RallyCanvas rallyCanvas = (RallyCanvas) next;
                float f13 = fOnExtraCallbackWithResult2;
                float f14 = height;
                float f15 = width;
                rallyCanvas.onNavigationEvent(canvas, new TdsButtonV1View$.ExternalSyntheticLambda2(rallyCanvas, f12, i7, width, fOnExtraCallbackWithResult2, fOnExtraCallbackWithResult, height, this));
                i7++;
                int i9 = IEngagementSignalsCallbackStubProxy + 77;
                IPostMessageServiceDefault = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 2 % 3;
                }
                i = 2;
                fOnExtraCallbackWithResult2 = f13;
                height = f14;
                width = f15;
            }
            if (setCallTimeoutokhttp.onExtraCallback(this.IAuthTabCallback_Parcel)) {
                this.setEngagementSignalsCallback.onNavigationEvent(canvas, new TdsButtonV1View$.ExternalSyntheticLambda3(this));
            }
        }
        this.IEngagementSignalsCallback.onNavigationEvent(canvas, new TdsButtonV1View$.ExternalSyntheticLambda4(this, f5, f3 + f2 + f, f4));
        canvas.restore();
        canvas.restoreToCount(iSave);
        onInstallReferrerServiceDisconnected.onExtraCallbackWithResult(onInstallReferrerServiceDisconnected.onExtraCallback, this, canvas, (SizeF) null, 4, (Object) null);
    }

    private final Bitmap IAuthTabCallback(Drawable drawable) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 17;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        int i3 = IPostMessageServiceDefault + 123;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return bitmapCreateBitmap;
        }
        throw null;
    }

    public static final class asInterface {
        private static int onTransact = 1;
        private static int onWarmupCompleted;
        private final IAuthTabCallback IAuthTabCallback;
        private final IAuthTabCallbackDefault onExtraCallback;
        private final IAuthTabCallbackStub onExtraCallbackWithResult;
        private final onWarmupCompleted onNavigationEvent;

        public asInterface() {
            this(null, null, null, null, 15, null);
        }

        public asInterface(@Nullable IAuthTabCallbackStub iAuthTabCallbackStub) {
            this(iAuthTabCallbackStub, null, null, null, 14, null);
        }

        public asInterface(@Nullable IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable IAuthTabCallbackDefault iAuthTabCallbackDefault) {
            this(iAuthTabCallbackStub, iAuthTabCallbackDefault, null, null, 12, null);
        }

        public asInterface(@Nullable IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable IAuthTabCallbackDefault iAuthTabCallbackDefault, @Nullable onWarmupCompleted onwarmupcompleted) {
            this(iAuthTabCallbackStub, iAuthTabCallbackDefault, onwarmupcompleted, null, 8, null);
        }

        public asInterface(@Nullable IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable IAuthTabCallbackDefault iAuthTabCallbackDefault, @Nullable onWarmupCompleted onwarmupcompleted, @Nullable IAuthTabCallback iAuthTabCallback) {
            this.onExtraCallbackWithResult = iAuthTabCallbackStub;
            this.onExtraCallback = iAuthTabCallbackDefault;
            this.onNavigationEvent = onwarmupcompleted;
            this.IAuthTabCallback = iAuthTabCallback;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ asInterface(IAuthTabCallbackStub iAuthTabCallbackStub, IAuthTabCallbackDefault iAuthTabCallbackDefault, onWarmupCompleted onwarmupcompleted, IAuthTabCallback iAuthTabCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
            iAuthTabCallbackStub = (i & 1) != 0 ? null : iAuthTabCallbackStub;
            if ((i & 2) != 0) {
                int i2 = onWarmupCompleted + 35;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 48 / 0;
                }
                iAuthTabCallbackDefault = null;
            }
            if ((i & 4) != 0) {
                int i4 = 2 % 2;
                onwarmupcompleted = null;
            }
            if ((i & 8) != 0) {
                int i5 = onTransact + 7;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                int i6 = 2 % 2;
                iAuthTabCallback = null;
            }
            this(iAuthTabCallbackStub, iAuthTabCallbackDefault, onwarmupcompleted, iAuthTabCallback);
        }

        public final IAuthTabCallbackStub IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 7;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            IAuthTabCallbackStub iAuthTabCallbackStub = this.onExtraCallbackWithResult;
            int i4 = i2 + 35;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackStub;
        }

        public final IAuthTabCallbackDefault onExtraCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 113;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = this.onExtraCallback;
            int i5 = i3 + 61;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallbackDefault;
        }

        public final onWarmupCompleted onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final IAuthTabCallback onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 51;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback iAuthTabCallback = this.IAuthTabCallback;
            int i5 = i2 + 43;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                return iAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onNavigationEvent(@NotNull TdsButtonV1View tdsButtonV1View) throws Resources.NotFoundException {
            int i = 2 % 2;
            int i2 = onTransact + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(tdsButtonV1View, "");
            tdsButtonV1View.setTheme(this);
            int i4 = onTransact + 47;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // o.getHostnameVerifierokhttp
    public void showLoadingIndicator(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 59;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        setLoading(true);
        int i4 = IPostMessageServiceDefault + 73;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.getHostnameVerifierokhttp
    public void dismissLoadingIndicator() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 65;
        IPostMessageServiceDefault = i2 % 128;
        setLoading(i2 % 2 != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setText(@Nullable CharSequence charSequence, @Nullable TextView.BufferType bufferType) {
        int i = 2 % 2;
        deprecated_priorResponse deprecated_priorresponse = deprecated_priorResponse.onNavigationEvent;
        if (deprecated_priorresponse.onExtraCallback()) {
            int i2 = IEngagementSignalsCallbackStubProxy + 77;
            IPostMessageServiceDefault = i2 % 128;
            int i3 = i2 % 2;
            super/*android.widget.TextView*/.setText(deprecated_priorresponse.onNavigationEvent(getContext(), charSequence, deprecated_code.BUTTON), bufferType);
            return;
        }
        super/*android.widget.TextView*/.setText(charSequence, bufferType);
        int i4 = IPostMessageServiceDefault + 101;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if ((r5 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        return super/*android.view.View*\/.onTouchEvent(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (o.onInstallReferrerServiceDisconnected.onExtraCallback.onExtraCallback(r4, r5) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (o.onInstallReferrerServiceDisconnected.onExtraCallback.onExtraCallback(r4, r5) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        r5 = im.toss.tds.view.component.atom.button.TdsButtonV1View.IPostMessageServiceDefault + 57;
        im.toss.tds.view.component.atom.button.TdsButtonV1View.IEngagementSignalsCallbackStubProxy = r5 % 128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 83;
        IPostMessageServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            this.IEngagementSignalsCallback_Parcel.onNavigationEvent(motionEvent);
            int i3 = 98 / 0;
        } else {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            this.IEngagementSignalsCallback_Parcel.onNavigationEvent(motionEvent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPressed(boolean z) {
        int i = 2 % 2;
        super/*android.view.View*/.setPressed(z);
        this.IEngagementSignalsCallback_Parcel.onNavigationEvent(z);
        onNavigationEvent onnavigationevent = this.access200;
        if (onnavigationevent != null) {
            onnavigationevent.onExtraCallbackWithResult(this, z);
            int i2 = IPostMessageServiceDefault + 45;
            IEngagementSignalsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = IEngagementSignalsCallbackStubProxy + 13;
        IPostMessageServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [android.view.View, im.toss.tds.view.component.atom.button.TdsButtonV1View, java.lang.Object] */
    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        ?? r12 = (TdsButtonV1View) objArr[0];
        int i = 2 % 2;
        Rally rally = ((TdsButtonV1View) r12).IPostMessageServiceStub;
        if (rally != null) {
            int i2 = IEngagementSignalsCallbackStubProxy + 55;
            IPostMessageServiceDefault = i2 % 128;
            if (i2 % 2 == 0 ? rally.postMessage() : !rally.postMessage()) {
                return null;
            }
        }
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        Rally rally2 = (Rally) IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{r12}, -65654314, handleRemoveKey.onExtraCallbackWithResult(), 65654316);
        ((TdsButtonV1View) r12).IPostMessageServiceStub = rally2;
        if (rally2 != null) {
            int i3 = IPostMessageServiceDefault + 7;
            IEngagementSignalsCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            int i5 = IPostMessageServiceDefault + 1;
            IEngagementSignalsCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
        }
        isOneShot.onExtraCallbackWithResult((View) r12, noStore.Companion.access100());
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        registerCrashCallback registercrashcallback = (TdsButtonV1View) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 91;
        IPostMessageServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Rally rallyOnWarmupCompleted = RallysKt.onWarmupCompleted((View) registercrashcallback, (List) deprecated_proxy.onNavigationEvent.onExtraCallbackWithResult(deprecated_proxySelector.SMALL, EnumC0079certificatePinner.X).onNavigationEvent(), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 100L, false, 1404, (Object) null);
        int i4 = IPostMessageServiceDefault + 17;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return rallyOnWarmupCompleted;
        }
        throw null;
    }

    public final void setOnPressedListener(@Nullable onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 85;
        int i3 = i2 % 128;
        IEngagementSignalsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        this.access200 = onnavigationevent;
        int i5 = i3 + 99;
        IPostMessageServiceDefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [android.view.View, im.toss.tds.view.component.atom.button.TdsButtonV1View] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ?? r9 = (TdsButtonV1View) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 77;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Drawable drawableOnWarmupCompleted = r9.onUnminimized().onWarmupCompleted(r9.getContext(), ((TdsButtonV1View) r9).ICustomTabsServiceStubProxy, ((TdsButtonV1View) r9).onActivityLayout, ((TdsButtonV1View) r9).ICustomTabsCallbackStubProxy, ((TdsButtonV1View) r9).prefetch);
        r9.onExtraCallbackWithResult(drawableOnWarmupCompleted);
        r9.setBackground(drawableOnWarmupCompleted);
        r9.onMessageChannelReady();
        int i4 = IEngagementSignalsCallbackStubProxy + 67;
        IPostMessageServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return null;
    }

    private final setCertificatePinnerokhttp onExtraCallback(Map<Pair<IAuthTabCallbackDefault, IAuthTabCallbackStub>, setCertificatePinnerokhttp> map, IAuthTabCallbackDefault iAuthTabCallbackDefault, IAuthTabCallbackStub iAuthTabCallbackStub) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 47;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        setCertificatePinnerokhttp setcertificatepinnerokhttp = map.get(getWrite.IAuthTabCallback(iAuthTabCallbackDefault, iAuthTabCallbackStub));
        if (i3 != 0) {
            Intrinsics.checkNotNull(setcertificatepinnerokhttp);
            return setcertificatepinnerokhttp;
        }
        Intrinsics.checkNotNull(setcertificatepinnerokhttp);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    static {
        int i = ITrustedWebActivityCallbackDefault + 115;
        ITrustedWebActivityCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 26 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceDefault + 85;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = this.onExtraCallback;
        if (bool != null) {
            return bool.booleanValue();
        }
        Resources resources = getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        boolean zOnExtraCallback = readIntokhttp.onExtraCallback(configuration);
        int i4 = IEngagementSignalsCallbackStubProxy + 31;
        IPostMessageServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TdsButtonV1View tdsButtonV1View, float f) {
        Object[] objArr = {tdsButtonV1View, Float.valueOf(f)};
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, -140140411, handleRemoveKey.onExtraCallbackWithResult(), 140140414);
    }

    public static /* synthetic */ Unit onExtraCallback(TdsButtonV1View tdsButtonV1View, float f) {
        Object[] objArr = {tdsButtonV1View, Float.valueOf(f)};
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, 1399686815, handleRemoveKey.onExtraCallbackWithResult(), -1399686814);
    }

    public static /* synthetic */ Set IAuthTabCallback(TdsButtonV1View tdsButtonV1View) {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        return (Set) IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{tdsButtonV1View}, 343440725, handleRemoveKey.onExtraCallbackWithResult(), -343440716);
    }

    private final void writeTypedObject() {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this}, -556069623, handleRemoveKey.onExtraCallbackWithResult(), 556069629);
    }

    private final Rally onMinimized() {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        return (Rally) IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this}, -65654314, handleRemoveKey.onExtraCallbackWithResult(), 65654316);
    }

    private final int onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted) {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        return ((Integer) IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this, onwarmupcompleted}, -406880225, handleRemoveKey.onExtraCallbackWithResult(), 406880235)).intValue();
    }

    private final void onExtraCallback(AttributeSet attributeSet) {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this, attributeSet}, -741645653, handleRemoveKey.onExtraCallbackWithResult(), 741645658);
    }

    private final void ICustomTabsCallbackStubProxy() {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this}, 1225889989, handleRemoveKey.onExtraCallbackWithResult(), -1225889989);
    }

    private final void ICustomTabsCallback_Parcel() {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this}, 1306986311, handleRemoveKey.onExtraCallbackWithResult(), -1306986307);
    }

    private static final AppLovinSdkSettings onExtraCallbackWithResult(TdsButtonV1View tdsButtonV1View, boolean z) {
        Object[] objArr = {tdsButtonV1View, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        return (AppLovinSdkSettings) IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, 239859549, handleRemoveKey.onExtraCallbackWithResult(), -239859542);
    }

    private final void ICustomTabsService() {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        IAuthTabCallback(handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this}, -94371013, handleRemoveKey.onExtraCallbackWithResult(), 94371021);
    }
}
