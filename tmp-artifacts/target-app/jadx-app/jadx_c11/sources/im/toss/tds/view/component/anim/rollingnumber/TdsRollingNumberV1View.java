package im.toss.tds.view.component.anim.rollingnumber;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import androidx.core.content.res.ResourcesCompat;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import im.toss.features.tosscert.ui.R;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.R;
import im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.Address;
import o.AppLovinSdkSettings;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ForwardingLiveDataExternalSyntheticLambda0;
import o.RequestBodyCompanion;
import o.RequestBodyCompanionasRequestBody1;
import o.access15300;
import o.accessgetTlsVersionsAsStringp;
import o.accessinit;
import o.authParams;
import o.connectionCount;
import o.deprecated_cacheResponse;
import o.deprecated_certificatePinner;
import o.deprecated_dns;
import o.getBacktraceNoteBytes;
import o.getExtraParameters;
import o.getHostnameVerifierokhttp;
import o.getTcfVendorConsentStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.head;
import o.headerdefault;
import o.isFireOS;
import o.isMuted;
import o.processDeepLink;
import o.pxToDp;
import o.response;
import o.runOnUiThreadDelayed;
import o.sMaxAgeSeconds;
import o.setBodyokhttp;
import o.setMethodokhttp;
import o.setTagsokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TdsRollingNumberV1View extends View implements getHostnameVerifierokhttp {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final asBinder Companion;
    private static long ITrustedWebActivityCallback_Parcel = 0;
    private static int getActiveNotifications = 0;
    private static int getSmallIconBitmap = 1;
    private static int getSmallIconId = 1;
    private static int notifyNotificationWithChannel;
    private boolean IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private final IAuthTabCallbackDefault IAuthTabCallbackStub;
    private Rally IAuthTabCallbackStubProxy;
    private onTransact IAuthTabCallback_Parcel;
    private asInterface ICustomTabsCallback;
    private float ICustomTabsCallbackDefault;
    private boolean ICustomTabsCallbackStub;
    private boolean ICustomTabsCallbackStubProxy;
    private final List<View> ICustomTabsCallback_Parcel;
    private getInterfaceDescriptor ICustomTabsService;
    private float ICustomTabsServiceDefault;
    private final TextPaint ICustomTabsServiceStub;
    private final List<View> ICustomTabsServiceStubProxy;
    private float ICustomTabsService_Parcel;
    private float IEngagementSignalsCallback;
    private runOnUiThreadDelayed IEngagementSignalsCallbackDefault;
    private onNavigationEvent IEngagementSignalsCallbackStub;
    private CharSequence IEngagementSignalsCallbackStubProxy;
    private CharSequence IEngagementSignalsCallback_Parcel;
    private float IPostMessageService;
    private final TextPaint IPostMessageServiceDefault;
    private float IPostMessageServiceStub;
    private int IPostMessageServiceStubProxy;
    private String IPostMessageService_Parcel;
    private float ITrustedWebActivityCallback;
    private final ArrayList<onExtraCallbackWithResult> ITrustedWebActivityCallbackDefault;
    private String ITrustedWebActivityCallbackStub;
    private float ITrustedWebActivityCallbackStubProxy;
    private head ITrustedWebActivityService;
    private int access000;
    private char access100;
    private float access200;
    private float areNotificationsEnabled;
    private int asBinder;
    private runOnUiThreadDelayed asInterface;
    private head cancelNotification;
    private char extraCallback;
    private String extraCallbackWithResult;
    private float extraCommand;
    private final ArrayList<IAuthTabCallbackStub> getInterfaceDescriptor;
    private final int isEngagementSignalsApiAvailable;
    private onNavigationEvent mayLaunchUrl;
    private float newAuthTabSession;
    private Rally newSession;
    private final Lazy newSessionWithExtras;
    private float onActivityLayout;
    private final Paint onActivityResized;
    private Paint.Align onExtraCallback;
    private View onExtraCallbackWithResult;
    private boolean onGreatestScrollPercentageIncreased;
    private int onMessageChannelReady;
    private String onMinimized;
    private float onNavigationEvent;
    private float onPostMessage;
    private boolean onRelationshipValidationResult;
    private IAuthTabCallbackStubProxy onSessionEnded;
    private final ArrayList<onWarmupCompleted> onTransact;
    private boolean onUnminimized;
    private onExtraCallback onVerticalScrollEvent;
    private IAuthTabCallback onWarmupCompleted;
    private final Lazy postMessage;
    private float prefetch;
    private final String[] prefetchWithMultipleUrls;
    private float readTypedObject;
    private onExtraCallback receiveFile;
    private final TextPaint requestPostMessageChannel;
    private float requestPostMessageChannelWithExtras;
    private Function0<Unit> setEngagementSignalsCallback;
    private float updateVisuals;
    private float validateRelationship;
    private CharSequence warmup;
    private CharSequence writeTypedList;
    private final ArrayList<onExtraCallbackWithResult> writeTypedObject;

    public static final /* synthetic */ class access100 {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[Paint.Align.values().length];
            try {
                iArr[Paint.Align.LEFT.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 59;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Paint.Align.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
            int[] iArr2 = new int[onNavigationEvent.values().length];
            try {
                iArr2[onNavigationEvent.CENTER.ordinal()] = 1;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[onNavigationEvent.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[onNavigationEvent.TOP.ordinal()] = 3;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            onExtraCallback = iArr2;
            int i6 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public interface getInterfaceDescriptor {
        void onWarmupCompleted();
    }

    static {
        asBinder();
        Companion = new asBinder(null);
        int i = getActiveNotifications + 91;
        getSmallIconBitmap = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsRollingNumberV1View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsRollingNumberV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Unit unit;
        TdsRollingNumberV1View tdsRollingNumberV1View = (TdsRollingNumberV1View) objArr[0];
        int i = 2 % 2;
        int i2 = getSmallIconId + 125;
        notifyNotificationWithChannel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {tdsRollingNumberV1View};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent4 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        if (i3 != 0) {
            unit = (Unit) onExtraCallbackWithResult(objArr2, iOnNavigationEvent3, iOnNavigationEvent, iOnNavigationEvent4, -1168770223, iOnNavigationEvent2, 1168770227);
            int i4 = 68 / 0;
        } else {
            unit = (Unit) onExtraCallbackWithResult(objArr2, iOnNavigationEvent3, iOnNavigationEvent, iOnNavigationEvent4, -1168770223, iOnNavigationEvent2, 1168770227);
        }
        int i5 = getSmallIconId + 45;
        notifyNotificationWithChannel = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TdsRollingNumberV1View tdsRollingNumberV1View) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 5;
        notifyNotificationWithChannel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(tdsRollingNumberV1View);
        int i4 = notifyNotificationWithChannel + 105;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TdsRollingNumberV1View tdsRollingNumberV1View, IAuthTabCallbackStub iAuthTabCallbackStub, float f) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 81;
        getSmallIconId = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback_Parcel(tdsRollingNumberV1View, iAuthTabCallbackStub, f);
        }
        IAuthTabCallback_Parcel(tdsRollingNumberV1View, iAuthTabCallbackStub, f);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TdsRollingNumberV1View tdsRollingNumberV1View, asInterface asinterface, float f) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 41;
        getSmallIconId = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(tdsRollingNumberV1View, asinterface, f);
        }
        onExtraCallback(tdsRollingNumberV1View, asinterface, f);
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback(TdsRollingNumberV1View tdsRollingNumberV1View, boolean z) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 39;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(tdsRollingNumberV1View, z);
            throw null;
        }
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onExtraCallback(tdsRollingNumberV1View, z);
        int i3 = getSmallIconId + 43;
        notifyNotificationWithChannel = i3 % 128;
        int i4 = i3 % 2;
        return appLovinSdkSettingsOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(TdsRollingNumberV1View tdsRollingNumberV1View, IAuthTabCallbackStub iAuthTabCallbackStub, float f) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 95;
        notifyNotificationWithChannel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(tdsRollingNumberV1View, iAuthTabCallbackStub, f);
        int i4 = notifyNotificationWithChannel + 39;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAccess100;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 85;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return onActivityLayout();
        }
        onActivityLayout();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        TdsRollingNumberV1View tdsRollingNumberV1View = (TdsRollingNumberV1View) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = getSmallIconId + 99;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub(tdsRollingNumberV1View, fFloatValue);
        }
        IAuthTabCallbackStub(tdsRollingNumberV1View, fFloatValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Unit unit;
        TdsRollingNumberV1View tdsRollingNumberV1View = (TdsRollingNumberV1View) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        int iIntValue = ((Number) objArr[5]).intValue();
        access000 access000Var = (access000) objArr[6];
        boolean zBooleanValue3 = ((Boolean) objArr[7]).booleanValue();
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 119;
        getSmallIconId = i2 % 128;
        if (i2 % 2 == 0) {
            unit = (Unit) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, str, str2, Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2), Integer.valueOf(iIntValue), access000Var, Boolean.valueOf(zBooleanValue3)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1421619214, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1421619224);
            int i3 = 0 / 0;
        } else {
            unit = (Unit) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, str, str2, Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2), Integer.valueOf(iIntValue), access000Var, Boolean.valueOf(zBooleanValue3)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1421619214, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1421619224);
        }
        int i4 = getSmallIconId + 87;
        notifyNotificationWithChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit asBinder(TdsRollingNumberV1View tdsRollingNumberV1View, IAuthTabCallbackStub iAuthTabCallbackStub, float f) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 31;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return access000(tdsRollingNumberV1View, iAuthTabCallbackStub, f);
        }
        access000(tdsRollingNumberV1View, iAuthTabCallbackStub, f);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(TdsRollingNumberV1View tdsRollingNumberV1View, IAuthTabCallbackStub iAuthTabCallbackStub, float f) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 113;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(tdsRollingNumberV1View, iAuthTabCallbackStub, f);
        int i4 = getSmallIconId + 19;
        notifyNotificationWithChannel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallback(TdsRollingNumberV1View tdsRollingNumberV1View, onWarmupCompleted onwarmupcompleted, float f) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 83;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(tdsRollingNumberV1View, onwarmupcompleted, f);
        int i4 = notifyNotificationWithChannel + 101;
        getSmallIconId = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~i6;
        int i11 = i9 | (~(i10 | i2));
        int i12 = i8 | i4;
        int i13 = ~(i12 | i6);
        int i14 = (~(i2 | i7)) | (~(i8 | i10)) | (~i12);
        int i15 = i4 + i6 + i5 + (1650861130 * i) + ((-924421097) * i3);
        int i16 = i15 * i15;
        int i17 = ((i4 * (-959335331)) - 587927435) + (i6 * (-959335331)) + (i11 * 462) + (i13 * (-462)) + (i14 * 462) + ((-959334869) * i5) + (22983790 * i) + (637852125 * i3) + (i16 * (-1124859904));
        switch ((i4 * (-405912681)) + 1474035712 + ((-405912681) * i6) + (i11 * (-1619411862)) + (1619411862 * i13) + ((-1619411862) * i14) + ((-2025324544) * i5) + (986710016 * i) + ((-948436992) * i3) + ((-1864630272) * i16) + (i17 * i17 * (-1807482880))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                TdsRollingNumberV1View tdsRollingNumberV1View = (TdsRollingNumberV1View) objArr[0];
                float fFloatValue = ((Number) objArr[1]).floatValue();
                int i18 = 2 % 2;
                int i19 = getSmallIconId + 43;
                notifyNotificationWithChannel = i19 % 128;
                int i20 = i19 % 2;
                Unit unitAsInterface = asInterface(tdsRollingNumberV1View, fFloatValue);
                int i21 = getSmallIconId + 51;
                notifyNotificationWithChannel = i21 % 128;
                int i22 = i21 % 2;
                return unitAsInterface;
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return onNavigationEvent(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return asInterface(objArr);
            case 11:
                TdsRollingNumberV1View tdsRollingNumberV1View2 = (TdsRollingNumberV1View) objArr[0];
                String str = (String) objArr[1];
                access000 access000Var = (access000) objArr[2];
                boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
                boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
                boolean zBooleanValue3 = ((Boolean) objArr[5]).booleanValue();
                char cCharValue = ((Character) objArr[6]).charValue();
                char cCharValue2 = ((Character) objArr[7]).charValue();
                int i23 = 2 % 2;
                int i24 = notifyNotificationWithChannel + 41;
                getSmallIconId = i24 % 128;
                int i25 = i24 % 2;
                Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View2, str, access000Var, Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2), Boolean.valueOf(zBooleanValue3), Character.valueOf(cCharValue), Character.valueOf(cCharValue2)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -83639508, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 83639522);
                int i26 = getSmallIconId + 125;
                notifyNotificationWithChannel = i26 % 128;
                int i27 = i26 % 2;
                return unit;
            case 12:
                return IAuthTabCallbackDefault(objArr);
            case 13:
                return getInterfaceDescriptor(objArr);
            case 14:
                TdsRollingNumberV1View tdsRollingNumberV1View3 = (TdsRollingNumberV1View) objArr[0];
                String str2 = (String) objArr[1];
                access000 access000Var2 = (access000) objArr[2];
                boolean zBooleanValue4 = ((Boolean) objArr[3]).booleanValue();
                boolean zBooleanValue5 = ((Boolean) objArr[4]).booleanValue();
                boolean zBooleanValue6 = ((Boolean) objArr[5]).booleanValue();
                char cCharValue3 = ((Character) objArr[6]).charValue();
                char cCharValue4 = ((Character) objArr[7]).charValue();
                int i28 = 2 % 2;
                int i29 = getSmallIconId + 11;
                notifyNotificationWithChannel = i29 % 128;
                int i30 = i29 % 2;
                tdsRollingNumberV1View3.IAuthTabCallback(str2, false, access000Var2, 0, zBooleanValue4, zBooleanValue5, zBooleanValue6, cCharValue3, cCharValue4);
                Unit unit2 = Unit.INSTANCE;
                int i31 = notifyNotificationWithChannel + 57;
                getSmallIconId = i31 % 128;
                int i32 = i31 % 2;
                return unit2;
            case 15:
                return access100(objArr);
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                return IAuthTabCallbackStubProxy(objArr);
            case R.styleable.TdsListRowV1View_centerType /* 17 */:
                return access000(objArr);
            case R.styleable.TdsListRowV1View_disabledType /* 18 */:
                return IAuthTabCallback_Parcel(objArr);
            case R.styleable.TdsListRowV1View_leftDate /* 19 */:
                TdsRollingNumberV1View tdsRollingNumberV1View4 = (TdsRollingNumberV1View) objArr[0];
                CharSequence charSequence = (CharSequence) objArr[1];
                Long l = (Long) objArr[2];
                CharSequence charSequence2 = (CharSequence) objArr[3];
                CharSequence charSequence3 = (CharSequence) objArr[4];
                int iIntValue = ((Number) objArr[5]).intValue();
                Object obj = objArr[6];
                int i33 = 2 % 2;
                if ((iIntValue & 1) != 0) {
                    int i34 = getSmallIconId + 55;
                    notifyNotificationWithChannel = i34 % 128;
                    int i35 = i34 % 2;
                    charSequence = null;
                }
                if ((iIntValue & 2) != 0) {
                    l = null;
                }
                if ((iIntValue & 4) != 0) {
                    charSequence2 = null;
                }
                if ((iIntValue & 8) != 0) {
                    int i36 = notifyNotificationWithChannel + 63;
                    getSmallIconId = i36 % 128;
                    int i37 = i36 % 2;
                    charSequence3 = tdsRollingNumberV1View4.IEngagementSignalsCallbackStubProxy;
                }
                return Float.valueOf(tdsRollingNumberV1View4.IAuthTabCallback(charSequence, l, charSequence2, charSequence3));
            case R.styleable.TdsListRowV1View_leftImage /* 20 */:
                return writeTypedObject(objArr);
            case R.styleable.TdsListRowV1View_leftImageColor /* 21 */:
                return extraCallback(objArr);
            case R.styleable.TdsListRowV1View_leftImageHeight /* 22 */:
                return readTypedObject(objArr);
            case R.styleable.TdsListRowV1View_leftImageType /* 23 */:
                int i38 = 2 % 2;
                RectF rectF = new RectF();
                int i39 = getSmallIconId + 29;
                notifyNotificationWithChannel = i39 % 128;
                int i40 = i39 % 2;
                return rectF;
            case R.styleable.TdsListRowV1View_leftImageUrl /* 24 */:
                return extraCallbackWithResult(objArr);
            case R.styleable.TdsListRowV1View_leftImageWidth /* 25 */:
                return ICustomTabsCallback(objArr);
            case R.styleable.TdsListRowV1View_leftLottie /* 26 */:
                return onPostMessage(objArr);
            default:
                char cCharValue5 = ((Character) objArr[1]).charValue();
                int i41 = 2 % 2;
                if (cCharValue5 != '?') {
                    int i42 = getSmallIconId + 117;
                    int i43 = i42 % 128;
                    notifyNotificationWithChannel = i43;
                    int i44 = i42 % 2;
                    if (cCharValue5 != 65311) {
                        int i45 = i43 + 125;
                        getSmallIconId = i45 % 128;
                        int i46 = i45 % 2;
                        return false;
                    }
                }
                return true;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TdsRollingNumberV1View tdsRollingNumberV1View, IAuthTabCallbackStub iAuthTabCallbackStub, float f) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 101;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(tdsRollingNumberV1View, iAuthTabCallbackStub, f);
        int i4 = getSmallIconId + 17;
        notifyNotificationWithChannel = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TdsRollingNumberV1View tdsRollingNumberV1View, asInterface asinterface, float f) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 1;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, asinterface, Float.valueOf(f)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 859304503, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -859304479);
        }
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult(TdsRollingNumberV1View tdsRollingNumberV1View, boolean z) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 85;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, Boolean.valueOf(z)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1996864087, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1996864088);
        int i4 = notifyNotificationWithChannel + 121;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        return appLovinSdkSettings;
    }

    public static /* synthetic */ RectF onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 47;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return (RectF) onExtraCallbackWithResult(new Object[0], MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1818681553, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1818681576);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsRollingNumberV1View tdsRollingNumberV1View) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 121;
        notifyNotificationWithChannel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(tdsRollingNumberV1View);
        int i4 = notifyNotificationWithChannel + 109;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnTransact;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsRollingNumberV1View tdsRollingNumberV1View, IAuthTabCallbackStub iAuthTabCallbackStub, float f) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 55;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(tdsRollingNumberV1View, iAuthTabCallbackStub, f);
        int i4 = getSmallIconId + 101;
        notifyNotificationWithChannel = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsRollingNumberV1View tdsRollingNumberV1View, asInterface asinterface, float f) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 35;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, asinterface, Float.valueOf(f)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 2066092931, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -2066092906);
        int i4 = notifyNotificationWithChannel + 45;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsRollingNumberV1View tdsRollingNumberV1View, onTransact ontransact, float f) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 11;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 != 0) {
            asInterface(tdsRollingNumberV1View, ontransact, f);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAsInterface = asInterface(tdsRollingNumberV1View, ontransact, f);
        int i3 = notifyNotificationWithChannel + 91;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 63 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsRollingNumberV1View tdsRollingNumberV1View, onWarmupCompleted onwarmupcompleted, float f) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 47;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(tdsRollingNumberV1View, onwarmupcompleted, f);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tdsRollingNumberV1View, onwarmupcompleted, f);
        int i3 = getSmallIconId + 29;
        notifyNotificationWithChannel = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        TdsRollingNumberV1View tdsRollingNumberV1View = (TdsRollingNumberV1View) objArr[0];
        IAuthTabCallbackStub iAuthTabCallbackStub = (IAuthTabCallbackStub) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 23;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(tdsRollingNumberV1View, iAuthTabCallbackStub, fFloatValue);
        int i4 = notifyNotificationWithChannel + 57;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        TdsRollingNumberV1View tdsRollingNumberV1View = (TdsRollingNumberV1View) objArr[0];
        onTransact ontransact = (onTransact) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = getSmallIconId + 61;
        notifyNotificationWithChannel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(tdsRollingNumberV1View, ontransact, fFloatValue);
        int i4 = notifyNotificationWithChannel + 25;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TdsRollingNumberV1View tdsRollingNumberV1View = (TdsRollingNumberV1View) objArr[0];
        onTransact ontransact = (onTransact) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 45;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {tdsRollingNumberV1View, ontransact, Float.valueOf(fFloatValue)};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent4 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(objArr2, iOnNavigationEvent3, iOnNavigationEvent, iOnNavigationEvent4, 1066779698, iOnNavigationEvent2, -1066779677);
        int i4 = notifyNotificationWithChannel + 1;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsRollingNumberV1View tdsRollingNumberV1View, float f) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 97;
        notifyNotificationWithChannel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(tdsRollingNumberV1View, f);
        int i4 = notifyNotificationWithChannel + 69;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsRollingNumberV1View tdsRollingNumberV1View, onTransact ontransact, float f) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 93;
        notifyNotificationWithChannel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(tdsRollingNumberV1View, ontransact, f);
        int i4 = getSmallIconId + 19;
        notifyNotificationWithChannel = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsRollingNumberV1View tdsRollingNumberV1View, onWarmupCompleted onwarmupcompleted, float f) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 55;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault(tdsRollingNumberV1View, onwarmupcompleted, f);
        }
        IAuthTabCallbackDefault(tdsRollingNumberV1View, onwarmupcompleted, f);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback_Parcel implements View.OnLayoutChangeListener {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public IAuthTabCallback_Parcel() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = IAuthTabCallback + 31;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            TdsRollingNumberV1View.onNavigationEvent(TdsRollingNumberV1View.this, true);
            int i12 = IAuthTabCallback + 47;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 86 / 0;
            }
        }
    }

    public static final class writeTypedObject implements View.OnLayoutChangeListener {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public writeTypedObject() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = onExtraCallback + 105;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            if (StringsKt.isBlank(TdsRollingNumberV1View.this.onExtraCallbackWithResult())) {
                int i12 = onExtraCallback + 121;
                onNavigationEvent = i12 % 128;
                if (i12 % 2 != 0) {
                    TdsRollingNumberV1View.asInterface(TdsRollingNumberV1View.this);
                    throw null;
                }
                if (TdsRollingNumberV1View.asInterface(TdsRollingNumberV1View.this) == null) {
                    return;
                }
            }
            TdsRollingNumberV1View tdsRollingNumberV1View = TdsRollingNumberV1View.this;
            TdsRollingNumberV1View.IAuthTabCallback(tdsRollingNumberV1View, ((Float) TdsRollingNumberV1View.onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, null, null, null, null, 15, null}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -783133487, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 783133506)).floatValue());
            Rally rallyOnExtraCallbackWithResult = TdsRollingNumberV1View.onExtraCallbackWithResult(TdsRollingNumberV1View.this);
            if (rallyOnExtraCallbackWithResult != null) {
                rallyOnExtraCallbackWithResult.ICustomTabsServiceStub();
            }
            TdsRollingNumberV1View tdsRollingNumberV1View2 = TdsRollingNumberV1View.this;
            AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(Address.onNavigationEvent.asInterface(), 2200);
            float f = -TdsRollingNumberV1View.onExtraCallback(TdsRollingNumberV1View.this);
            float fOnExtraCallback = TdsRollingNumberV1View.onExtraCallback(TdsRollingNumberV1View.this);
            Object[] objArr = {appLovinSdkSettingsOnExtraCallback, Float.valueOf(f), Float.valueOf(fOnExtraCallback), TdsRollingNumberV1View.this.new extraCallbackWithResult(), null, 8, null};
            TdsRollingNumberV1View.onExtraCallbackWithResult(tdsRollingNumberV1View2, (Rally) isFireOS.onExtraCallbackWithResult(Rally.onExtraCallbackWithResult(Rally.onWarmupCompleted((Rally) RallysKt.onWarmupCompleted(new Object[]{TdsRollingNumberV1View.this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, objArr, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), -1, getExtraParameters.Normal, 0, null, null, null, 0, 0L, false, 2032, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), null, TdsRollingNumberV1View.this.new ICustomTabsCallback(), 1, null), (Object) null, TdsRollingNumberV1View.this.new readTypedObject(), 1, (Object) null), false, 1, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02de A[PHI: r1
      0x02de: PHI (r1v22 java.lang.String) = (r1v21 java.lang.String), (r1v23 java.lang.String) binds: [B:71:0x02db, B:68:0x02d4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TdsRollingNumberV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws Throwable {
        String str;
        String string;
        Paint.Align align;
        int i2;
        int i3;
        Paint paint;
        Drawable drawable;
        Drawable drawable2;
        int i4;
        int i5;
        String string2;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.writeTypedList = "";
        this.onMinimized = "";
        this.ITrustedWebActivityCallbackStub = "";
        this.extraCallbackWithResult = "";
        this.IPostMessageService_Parcel = "";
        this.writeTypedObject = new ArrayList<>();
        this.ITrustedWebActivityCallbackDefault = new ArrayList<>();
        this.getInterfaceDescriptor = new ArrayList<>();
        this.onTransact = new ArrayList<>();
        this.warmup = "";
        int i6 = im.toss.tds.view.R.string.tds_view_currency_won;
        String string3 = context.getString(i6);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        this.IEngagementSignalsCallback_Parcel = string3;
        this.ICustomTabsCallback_Parcel = new ArrayList();
        this.ICustomTabsServiceStubProxy = new ArrayList();
        Paint.Align align2 = Paint.Align.LEFT;
        this.onExtraCallback = align2;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        this.IPostMessageServiceStubProxy = new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration)).onRelationshipValidationResult();
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(varyMatches.onExtraCallback((View) this, (Number) 30));
        response responseVar = response.Medium;
        textPaint.setTypeface(response.toTypeface$default(responseVar, context, null, 2, null));
        textPaint.setColor(this.IPostMessageServiceStubProxy);
        textPaint.setAntiAlias(true);
        this.requestPostMessageChannel = textPaint;
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setTypeface(response.toTypeface$default(responseVar, context, null, 2, null));
        textPaint2.setColor(this.IPostMessageServiceStubProxy);
        textPaint2.setAntiAlias(true);
        this.ICustomTabsServiceStub = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        textPaint3.setTypeface(response.toTypeface$default(responseVar, context, null, 2, null));
        textPaint3.setColor(this.IPostMessageServiceStubProxy);
        textPaint3.setAntiAlias(true);
        this.IPostMessageServiceDefault = textPaint3;
        int dimensionPixelSize = 0;
        Object[] objArr = new Object[1];
        a(new char[]{18375}, View.getDefaultSize(0, 0) + 13873, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{18374}, 51893 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{18373}, (Process.myPid() >> 22) + 45053, objArr3);
        this.prefetchWithMultipleUrls = new String[]{strIntern, strIntern2, ((String) objArr3[0]).intern(), "3", "4", "5", "6", "7", "8", "9"};
        this.onMessageChannelReady = RequestBodyCompanion.onNavigationEvent(this, authParams.BackgroundDefault);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.onActivityResized = paint2;
        this.IAuthTabCallbackStub = new IAuthTabCallbackDefault();
        onNavigationEvent onnavigationevent = onNavigationEvent.CENTER;
        this.IEngagementSignalsCallbackStub = onnavigationevent;
        this.mayLaunchUrl = onnavigationevent;
        this.newSessionWithExtras = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                RectF rectFOnNavigationEvent;
                int i7 = 2 % 2;
                int i8 = onWarmupCompleted + 55;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    rectFOnNavigationEvent = TdsRollingNumberV1View.onNavigationEvent();
                    int i9 = 69 / 0;
                } else {
                    rectFOnNavigationEvent = TdsRollingNumberV1View.onNavigationEvent();
                }
                int i10 = onWarmupCompleted + 113;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                return rectFOnNavigationEvent;
            }
        });
        this.postMessage = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i7 = 2 % 2;
                int i8 = IAuthTabCallback + 69;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                Paint paint3 = (Paint) TdsRollingNumberV1View.onExtraCallbackWithResult(new Object[0], MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1935681165, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1935681182);
                int i10 = onExtraCallback + 79;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                return paint3;
            }
        });
        int color = Color.parseColor("#CC000000");
        this.isEngagementSignalsApiAvailable = color;
        this.access000 = color;
        this.onSessionEnded = IAuthTabCallbackStubProxy.onNavigationEvent.onExtraCallback;
        this.access200 = 1.0f;
        this.extraCallback = ',';
        this.access100 = '.';
        int resourceId = im.toss.tds.R.font.toss_product_sans_md;
        int textSize = (int) textPaint.getTextSize();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        int iOnRelationshipValidationResult = new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration2)).onRelationshipValidationResult();
        String string4 = context.getString(i6);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, im.toss.tds.view.R.styleable.TdsRollingNumberV1View, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            str = "";
            string = str;
            drawable2 = null;
            Drawable drawable3 = null;
            int i7 = 0;
            while (i7 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == im.toss.tds.view.R.styleable.TdsRollingNumberV1View_android_fontFamily) {
                    resourceId = typedArrayObtainStyledAttributes.getResourceId(index, resourceId);
                    int i8 = getSmallIconId + 71;
                    notifyNotificationWithChannel = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = 2 % 2;
                } else if (index == im.toss.tds.view.R.styleable.TdsRollingNumberV1View_android_textSize) {
                    textSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, textSize);
                } else {
                    if (index == im.toss.tds.view.R.styleable.TdsRollingNumberV1View_android_textColor) {
                        int color2 = typedArrayObtainStyledAttributes.getColor(index, iOnRelationshipValidationResult);
                        int i11 = getSmallIconId + 105;
                        notifyNotificationWithChannel = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i12 = 3 % 3;
                        } else {
                            int i13 = 2 % 2;
                        }
                        i5 = indexCount;
                        iOnRelationshipValidationResult = color2;
                    } else if (index == im.toss.tds.view.R.styleable.TdsRollingNumberV1View_align) {
                        int i14 = typedArrayObtainStyledAttributes.getInt(index, align2.ordinal());
                        if (i14 == 0) {
                            i5 = indexCount;
                            align2 = Paint.Align.LEFT;
                        } else if (i14 != 1) {
                            int i15 = getSmallIconId + 89;
                            i5 = indexCount;
                            notifyNotificationWithChannel = i15 % 128;
                            if (i15 % 2 != 0) {
                                if (i14 != 2) {
                                }
                                align2 = Paint.Align.RIGHT;
                            } else {
                                if (i14 != 2) {
                                }
                                align2 = Paint.Align.RIGHT;
                            }
                            int i16 = 2 % 2;
                        } else {
                            i5 = indexCount;
                            align2 = Paint.Align.CENTER;
                        }
                    } else {
                        i5 = indexCount;
                        if (index == im.toss.tds.view.R.styleable.TdsRollingNumberV1View_android_text) {
                            string = typedArrayObtainStyledAttributes.getString(index);
                            if (string == null) {
                                string = "";
                            } else {
                                int i17 = getSmallIconId + 61;
                                notifyNotificationWithChannel = i17 % 128;
                                if (i17 % 2 == 0) {
                                    int i162 = 2 % 2;
                                }
                            }
                        } else if (index == im.toss.tds.view.R.styleable.TdsRollingNumberV1View_android_drawableLeft) {
                            int i18 = notifyNotificationWithChannel + 119;
                            getSmallIconId = i18 % 128;
                            if (i18 % 2 == 0) {
                                typedArrayObtainStyledAttributes.getDrawable(index);
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            drawable2 = typedArrayObtainStyledAttributes.getDrawable(index);
                        } else if (index == im.toss.tds.view.R.styleable.TdsRollingNumberV1View_android_drawableRight) {
                            drawable3 = typedArrayObtainStyledAttributes.getDrawable(index);
                        } else if (index == im.toss.tds.view.R.styleable.TdsRollingNumberV1View_android_drawablePadding) {
                            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dimensionPixelSize);
                        } else if (index == im.toss.tds.view.R.styleable.TdsRollingNumberV1View_prefix) {
                            int i19 = notifyNotificationWithChannel + 89;
                            getSmallIconId = i19 % 128;
                            int i20 = i19 % 2;
                            String string5 = typedArrayObtainStyledAttributes.getString(index);
                            if (string5 == null) {
                                int i21 = notifyNotificationWithChannel + 125;
                                getSmallIconId = i21 % 128;
                                int i22 = i21 % 2;
                            } else {
                                str = string5;
                            }
                        } else if (index == im.toss.tds.view.R.styleable.TdsRollingNumberV1View_suffix) {
                            int i23 = getSmallIconId + 103;
                            notifyNotificationWithChannel = i23 % 128;
                            if (i23 % 2 != 0) {
                                string2 = typedArrayObtainStyledAttributes.getString(index);
                                int i24 = 55 / 0;
                                if (string2 != null) {
                                    string4 = string2;
                                }
                            } else {
                                string2 = typedArrayObtainStyledAttributes.getString(index);
                                if (string2 == null) {
                                }
                            }
                        }
                    }
                    i7++;
                    indexCount = i5;
                }
                i5 = indexCount;
                i7++;
                indexCount = i5;
            }
            typedArrayObtainStyledAttributes.recycle();
            align = align2;
            i4 = textSize;
            i3 = iOnRelationshipValidationResult;
            drawable = drawable3;
            i2 = 1;
            paint = null;
        } else {
            str = "";
            string = str;
            align = align2;
            i2 = 1;
            i3 = iOnRelationshipValidationResult;
            paint = null;
            dimensionPixelSize = 0;
            drawable = null;
            drawable2 = null;
            i4 = textSize;
        }
        setLayerType(i2, paint);
        setTextColor$default(this, i3, false, false, 6, null);
        setTextAlignment$default(this, align, false, 2, null);
        setFont$default(this, response.Companion.onExtraCallback(resourceId), false, false, 6, null);
        setTextSizePx$default(this, i4, false, false, 6, null);
        onExtraCallbackWithResult(dimensionPixelSize);
        setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable, false);
        setPrefixTextSize$default(this, i4, false, 2, null);
        setSuffixTextSize$default(this, i4, false, 2, null);
        setPrefix(str, false);
        setSuffix$default(this, string4, null, null, null, false, 14, null);
        setNumber$default(this, string, false, null, 0, false, false, false, 126, null);
    }

    public static final /* synthetic */ void IAuthTabCallback(TdsRollingNumberV1View tdsRollingNumberV1View, float f) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 1;
        int i3 = i2 % 128;
        notifyNotificationWithChannel = i3;
        int i4 = i2 % 2;
        tdsRollingNumberV1View.newAuthTabSession = f;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 1;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ boolean IAuthTabCallbackStub(TdsRollingNumberV1View tdsRollingNumberV1View) {
        int i = 2 % 2;
        int i2 = getSmallIconId;
        int i3 = i2 + 73;
        notifyNotificationWithChannel = i3 % 128;
        int i4 = i3 % 2;
        boolean z = tdsRollingNumberV1View.ICustomTabsCallbackStub;
        int i5 = i2 + 125;
        notifyNotificationWithChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ CharSequence asInterface(TdsRollingNumberV1View tdsRollingNumberV1View) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 75;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequence = tdsRollingNumberV1View.IEngagementSignalsCallbackStubProxy;
        if (i3 != 0) {
            return charSequence;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ float onExtraCallback(TdsRollingNumberV1View tdsRollingNumberV1View) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel;
        int i3 = i2 + 61;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        float f = tdsRollingNumberV1View.newAuthTabSession;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 93;
        getSmallIconId = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public static final /* synthetic */ Rally onExtraCallbackWithResult(TdsRollingNumberV1View tdsRollingNumberV1View) {
        int i = 2 % 2;
        int i2 = getSmallIconId;
        int i3 = i2 + 63;
        notifyNotificationWithChannel = i3 % 128;
        int i4 = i3 % 2;
        Rally rally = tdsRollingNumberV1View.newSession;
        int i5 = i2 + 79;
        notifyNotificationWithChannel = i5 % 128;
        int i6 = i5 % 2;
        return rally;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(TdsRollingNumberV1View tdsRollingNumberV1View, float f) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 73;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        tdsRollingNumberV1View.prefetch = f;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(TdsRollingNumberV1View tdsRollingNumberV1View, Rally rally) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 57;
        int i3 = i2 % 128;
        notifyNotificationWithChannel = i3;
        int i4 = i2 % 2;
        tdsRollingNumberV1View.newSession = rally;
        int i5 = i3 + 65;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(TdsRollingNumberV1View tdsRollingNumberV1View, boolean z) {
        int i = 2 % 2;
        int i2 = getSmallIconId;
        int i3 = i2 + 59;
        notifyNotificationWithChannel = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        tdsRollingNumberV1View.ICustomTabsCallbackStub = z;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 37;
        notifyNotificationWithChannel = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsRollingNumberV1View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = notifyNotificationWithChannel + 17;
            getSmallIconId = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = notifyNotificationWithChannel + 115;
            getSmallIconId = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 51;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23, 19627 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() + (ITrustedWebActivityCallback_Parcel % 5407414049857832247L);
                    try {
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 59 - ExpandableListView.getPackedPositionType(0L), Color.alpha(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 24 - Color.alpha(0), (-16757589) - Color.rgb(0, 0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (ITrustedWebActivityCallback_Parcel ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), 59 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            int i6 = $11 + 57;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i8 = $11 + 95;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 59 - (Process.myTid() >> 22), 6383 - (Process.myTid() >> 22), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 57;
        int i3 = i2 % 128;
        getSmallIconId = i3;
        int i4 = i2 % 2;
        String str = this.ITrustedWebActivityCallbackStub;
        int i5 = i3 + 121;
        notifyNotificationWithChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        TdsRollingNumberV1View tdsRollingNumberV1View = (TdsRollingNumberV1View) objArr[0];
        int i = 2 % 2;
        int i2 = getSmallIconId + 87;
        notifyNotificationWithChannel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Paint.Align align = tdsRollingNumberV1View.onExtraCallback;
        if (i3 != 0) {
            Paint.Align align2 = Paint.Align.LEFT;
            throw null;
        }
        if (align == Paint.Align.LEFT) {
            int i4 = notifyNotificationWithChannel + 9;
            getSmallIconId = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
        int i5 = getSmallIconId + 81;
        notifyNotificationWithChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TdsRollingNumberV1View tdsRollingNumberV1View = (TdsRollingNumberV1View) objArr[0];
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 95;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Paint.Align align = tdsRollingNumberV1View.onExtraCallback;
        if (i3 == 0) {
            Paint.Align align2 = Paint.Align.CENTER;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (align != Paint.Align.CENTER) {
            return false;
        }
        int i4 = notifyNotificationWithChannel + 29;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private final boolean onPostMessage() {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 85;
        getSmallIconId = i2 % 128;
        if (i2 % 2 == 0) {
            Paint.Align align = Paint.Align.RIGHT;
            throw null;
        }
        if (this.onExtraCallback == Paint.Align.RIGHT) {
            return true;
        }
        int i3 = notifyNotificationWithChannel + 77;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 65 / 0;
        }
        return false;
    }

    private final float readTypedObject() {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 43;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        float measuredHeight = (getMeasuredHeight() / 2.0f) - ((this.requestPostMessageChannel.descent() + this.requestPostMessageChannel.ascent()) / 2.0f);
        int i4 = notifyNotificationWithChannel + 83;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            return measuredHeight;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final float extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 107;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        float textSize = this.requestPostMessageChannel.getTextSize() + ((access000() + IAuthTabCallbackStubProxy()) / 2.0f);
        int i4 = notifyNotificationWithChannel + 57;
        getSmallIconId = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return textSize;
    }

    private final float access000() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 95;
        notifyNotificationWithChannel = i2 % 128;
        return i2 % 2 != 0 ? this.requestPostMessageChannel.getTextSize() - 0.15f : this.requestPostMessageChannel.getTextSize() * 0.15f;
    }

    private final float IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 13;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        float textSize = this.requestPostMessageChannel.getTextSize() * 0.25f;
        int i4 = notifyNotificationWithChannel + 31;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        return textSize;
    }

    private final float IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 81;
        getSmallIconId = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.IAuthTabCallbackStub.onExtraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        if (this.IAuthTabCallbackStub.onExtraCallbackWithResult() != null) {
            return this.IAuthTabCallbackStub.onNavigationEvent() + this.asBinder;
        }
        int i3 = notifyNotificationWithChannel + 7;
        getSmallIconId = i3 % 128;
        if (i3 % 2 != 0) {
            return 0.0f;
        }
        throw null;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 11;
        notifyNotificationWithChannel = i2 % 128;
        int i3 = i2 % 2;
        if (this.IAuthTabCallbackStub.IAuthTabCallback() != null) {
            return this.IAuthTabCallbackStub.asBinder() + this.asBinder;
        }
        int i4 = getSmallIconId + 125;
        notifyNotificationWithChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return this.ICustomTabsService_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setLoading(boolean z) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 13;
        int i3 = i2 % 128;
        notifyNotificationWithChannel = i3;
        int i4 = i2 % 2;
        if (this.ICustomTabsCallbackStubProxy == z) {
            return;
        }
        this.ICustomTabsCallbackStubProxy = z;
        Object obj = null;
        if (z) {
            int i5 = i3 + 13;
            getSmallIconId = i5 % 128;
            if (i5 % 2 != 0) {
                showLoadingIndicator(null);
                return;
            } else {
                showLoadingIndicator(null);
                int i6 = 38 / 0;
                return;
            }
        }
        dismissLoadingIndicator();
        int i7 = getSmallIconId + 59;
        notifyNotificationWithChannel = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final RectF writeTypedObject() {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 81;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        RectF rectF = (RectF) this.newSessionWithExtras.getValue();
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return rectF;
    }

    private final Paint ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 59;
        getSmallIconId = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Paint paint = (Paint) this.postMessage.getValue();
        int i3 = notifyNotificationWithChannel + 71;
        getSmallIconId = i3 % 128;
        if (i3 % 2 != 0) {
            return paint;
        }
        throw null;
    }

    private static final Paint onActivityLayout() {
        int i = 2 % 2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        int i2 = notifyNotificationWithChannel + 19;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        return paint;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel;
        int i3 = i2 + 3;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.IAuthTabCallbackDefault;
        int i5 = i2 + 79;
        getSmallIconId = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final void setCanAutoResize(boolean z) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 81;
        int i3 = i2 % 128;
        notifyNotificationWithChannel = i3;
        int i4 = i2 % 2;
        if (this.IAuthTabCallbackDefault == z) {
            return;
        }
        if (z) {
            if (this.updateVisuals == 0.0f) {
                int i5 = i3 + 73;
                getSmallIconId = i5 % 128;
                int i6 = i5 % 2;
                this.updateVisuals = this.requestPostMessageChannel.getTextSize();
                int i7 = getSmallIconId + 29;
                notifyNotificationWithChannel = i7 % 128;
                int i8 = i7 % 2;
            }
            if (this.ICustomTabsServiceDefault == 0.0f) {
                this.ICustomTabsServiceDefault = this.ICustomTabsServiceStub.getTextSize();
            }
            if (this.IEngagementSignalsCallback == 0.0f) {
                int i9 = notifyNotificationWithChannel + 41;
                getSmallIconId = i9 % 128;
                if (i9 % 2 == 0) {
                    this.IEngagementSignalsCallback = this.IPostMessageServiceDefault.getTextSize();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                this.IEngagementSignalsCallback = this.IPostMessageServiceDefault.getTextSize();
            }
        } else {
            float f = this.updateVisuals;
            if (f != 0.0f) {
                this.requestPostMessageChannel.setTextSize(f);
                this.updateVisuals = 0.0f;
            }
            float f2 = this.ICustomTabsServiceDefault;
            if (f2 != 0.0f) {
                this.ICustomTabsServiceStub.setTextSize(f2);
                this.ICustomTabsServiceDefault = 0.0f;
            }
            float f3 = this.IEngagementSignalsCallback;
            if (f3 != 0.0f) {
                this.IPostMessageServiceDefault.setTextSize(f3);
                this.IEngagementSignalsCallback = 0.0f;
            }
        }
        this.IAuthTabCallbackDefault = z;
        requestLayout();
    }

    private static final AppLovinSdkSettings onExtraCallback(TdsRollingNumberV1View tdsRollingNumberV1View, boolean z) {
        deprecated_dns deprecated_dnsVarOnNavigationEvent;
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 57;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        if (z) {
            int i4 = getSmallIconId + 53;
            notifyNotificationWithChannel = i4 % 128;
            if (i4 % 2 != 0) {
                deprecated_certificatepinner.asInterface();
                throw null;
            }
            deprecated_dnsVarOnNavigationEvent = deprecated_certificatepinner.asInterface();
        } else {
            deprecated_dnsVarOnNavigationEvent = deprecated_certificatepinner.onNavigationEvent();
        }
        return isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_dnsVarOnNavigationEvent}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(tdsRollingNumberV1View.getScaleX()), Float.valueOf(!z ? 1.0f : 0.94f), null, 4, null);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        float f;
        TdsRollingNumberV1View tdsRollingNumberV1View = (TdsRollingNumberV1View) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = getSmallIconId + 103;
        notifyNotificationWithChannel = i2 % 128;
        int i3 = i2 % 2;
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{zBooleanValue ? deprecated_certificatepinner.asInterface() : deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        float scaleX = tdsRollingNumberV1View.getScaleX();
        if (zBooleanValue) {
            int i4 = notifyNotificationWithChannel + 93;
            getSmallIconId = i4 % 128;
            f = 0.94f;
            if (i4 % 2 == 0) {
                int i5 = 30 / 0;
            }
        } else {
            f = 1.0f;
        }
        return isMuted.asBinder(appLovinSdkSettings, Float.valueOf(scaleX), Float.valueOf(f), null, 4, null);
    }

    public final void onWarmupCompleted(@NotNull View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        this.onExtraCallbackWithResult = view;
        setBackground(null);
        this.cancelNotification = new head(this, (View) null, false, new TdsRollingNumberV1View$.ExternalSyntheticLambda0(this), 6, (DefaultConstructorMarker) null);
        this.ITrustedWebActivityService = new head(view, (View) null, false, new TdsRollingNumberV1View$.ExternalSyntheticLambda1(this), 6, (DefaultConstructorMarker) null);
        onNavigationEvent(this, 0.0f, 1, (Object) null);
        int i2 = getSmallIconId + 79;
        notifyNotificationWithChannel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 13;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(motionEvent, "");
        head headVar = this.cancelNotification;
        if (headVar != null) {
            headVar.onNavigationEvent(motionEvent);
            int i3 = getSmallIconId + 33;
            notifyNotificationWithChannel = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 / 2;
            }
        }
        head headVar2 = this.ITrustedWebActivityService;
        if (headVar2 != null) {
            int i5 = notifyNotificationWithChannel + 29;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
            headVar2.onNavigationEvent(motionEvent);
        }
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        int i7 = notifyNotificationWithChannel + 125;
        getSmallIconId = i7 % 128;
        int i8 = i7 % 2;
        return zOnTouchEvent;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 115;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        head headVar = this.cancelNotification;
        if (headVar != null) {
            headVar.onNavigationEvent(z);
        }
        head headVar2 = this.ITrustedWebActivityService;
        if (headVar2 != null) {
            int i4 = notifyNotificationWithChannel + 29;
            getSmallIconId = i4 % 128;
            int i5 = i4 % 2;
            headVar2.onNavigationEvent(z);
        }
        View view = this.onExtraCallbackWithResult;
        if (view != null) {
            int i6 = getSmallIconId + 107;
            notifyNotificationWithChannel = i6 % 128;
            if (i6 % 2 != 0) {
                view.setPressed(z);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            view.setPressed(z);
        }
        super.setPressed(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x009b A[PHI: r0 r10 r12 r13
      0x009b: PHI (r0v10 int) = (r0v9 int), (r0v22 int) binds: [B:8:0x0099, B:5:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r10v1 int) = (r10v0 int), (r10v3 int) binds: [B:8:0x0099, B:5:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r12v1 int) = (r12v0 int), (r12v3 int) binds: [B:8:0x0099, B:5:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r13v1 int) = (r13v0 int), (r13v5 int) binds: [B:8:0x0099, B:5:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        int mode;
        int size;
        int mode2;
        int size2;
        int iFloatValue;
        int i3 = 2 % 2;
        int i4 = getSmallIconId + 63;
        notifyNotificationWithChannel = i4 % 128;
        if (i4 % 2 != 0) {
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            mode2 = View.MeasureSpec.getMode(i2);
            size2 = View.MeasureSpec.getSize(i2);
            iFloatValue = (int) ((Float) onExtraCallbackWithResult(new Object[]{this, null, null, null, null, 69, null}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -783133487, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 783133506)).floatValue();
            if (mode != 1073741824) {
                size = getPaddingStart() + iFloatValue + getPaddingEnd();
                int i5 = notifyNotificationWithChannel + 109;
                getSmallIconId = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            mode2 = View.MeasureSpec.getMode(i2);
            size2 = View.MeasureSpec.getSize(i2);
            iFloatValue = (int) ((Float) onExtraCallbackWithResult(new Object[]{this, null, null, null, null, 15, null}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -783133487, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 783133506)).floatValue();
            if (mode != 1073741824) {
            }
        }
        if (mode2 != 1073741824) {
            size2 = getBacktraceNoteBytes.onExtraCallback(this.requestPostMessageChannel.descent() - this.requestPostMessageChannel.ascent()) + getPaddingTop() + getPaddingBottom();
        }
        setPivotX(((iFloatValue + getPaddingStart()) + getPaddingEnd()) / 2.0f);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public final float IAuthTabCallback(@Nullable CharSequence charSequence, @Nullable Long l, @Nullable CharSequence charSequence2, @Nullable CharSequence charSequence3) {
        float fMeasureText;
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel;
        int i3 = i2 + 79;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        if (charSequence3 == null) {
            int i5 = i2 + 53;
            int i6 = i5 % 128;
            getSmallIconId = i6;
            int i7 = i5 % 2;
            if (!this.IAuthTabCallbackDefault || this.ICustomTabsServiceDefault == 0.0f) {
                return IAuthTabCallback(charSequence, l, charSequence2);
            }
            int i8 = i6 + 5;
            notifyNotificationWithChannel = i8 % 128;
            int i9 = i8 % 2;
            float textSize = this.ICustomTabsServiceStub.getTextSize();
            float textSize2 = this.requestPostMessageChannel.getTextSize();
            float textSize3 = this.IPostMessageServiceDefault.getTextSize();
            this.ICustomTabsServiceStub.setTextSize(this.ICustomTabsServiceDefault);
            this.requestPostMessageChannel.setTextSize(this.updateVisuals);
            this.IPostMessageServiceDefault.setTextSize(this.IEngagementSignalsCallback);
            float fIAuthTabCallback = IAuthTabCallback(charSequence, l, charSequence2);
            this.ICustomTabsServiceStub.setTextSize(textSize);
            this.requestPostMessageChannel.setTextSize(textSize2);
            this.IPostMessageServiceDefault.setTextSize(textSize3);
            return fIAuthTabCallback;
        }
        if (this.IAuthTabCallbackDefault && this.ICustomTabsServiceDefault != 0.0f) {
            float textSize4 = this.requestPostMessageChannel.getTextSize();
            this.requestPostMessageChannel.setTextSize(this.updateVisuals);
            fMeasureText = this.requestPostMessageChannel.measureText(charSequence3.toString());
            this.requestPostMessageChannel.setTextSize(textSize4);
            if (IAuthTabCallbackStub() && this.writeTypedList.length() > 0) {
                float fMeasureText2 = this.requestPostMessageChannel.measureText(this.writeTypedList.toString());
                onNavigationEvent(fMeasureText2, fMeasureText);
                fMeasureText = Math.max(fMeasureText, fMeasureText2);
            }
        } else if (IAuthTabCallbackStub() && this.writeTypedList.length() > 0) {
            float fMeasureText3 = this.requestPostMessageChannel.measureText(this.writeTypedList.toString());
            float fMeasureText4 = this.requestPostMessageChannel.measureText(charSequence3.toString());
            onNavigationEvent(fMeasureText3, fMeasureText4);
            fMeasureText = Math.max(fMeasureText3, fMeasureText4);
        } else {
            fMeasureText = this.requestPostMessageChannel.measureText(charSequence3.toString());
        }
        return fMeasureText + IAuthTabCallback_Parcel() + onExtraCallback();
    }

    private final float IAuthTabCallback(CharSequence charSequence, Long l, CharSequence charSequence2) {
        CharSequence charSequence3;
        Object obj;
        int i = 2 % 2;
        TextPaint textPaint = this.ICustomTabsServiceStub;
        if (charSequence == null) {
            int i2 = getSmallIconId + 29;
            notifyNotificationWithChannel = i2 % 128;
            int i3 = i2 % 2;
            charSequence3 = this.warmup;
        } else {
            charSequence3 = charSequence;
        }
        float fMeasureText = textPaint.measureText(charSequence3.toString());
        TextPaint textPaint2 = this.requestPostMessageChannel;
        if (l == null) {
            int i4 = notifyNotificationWithChannel;
            int i5 = i4 + 61;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
            obj = this.ITrustedWebActivityCallbackStub;
            int i7 = i4 + 81;
            getSmallIconId = i7 % 128;
            int i8 = i7 % 2;
        } else {
            obj = l;
        }
        float fMeasureText2 = textPaint2.measureText((String) onExtraCallbackWithResult(new Object[]{this, obj.toString()}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1447235696, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1447235687));
        float fMeasureText3 = this.IPostMessageServiceDefault.measureText((charSequence2 == null ? this.IEngagementSignalsCallback_Parcel : charSequence2).toString());
        if (IAuthTabCallbackStub()) {
            int i9 = notifyNotificationWithChannel + 51;
            getSmallIconId = i9 % 128;
            int i10 = i9 % 2;
            if (this.onMinimized.length() > 0) {
                int i11 = notifyNotificationWithChannel + 63;
                getSmallIconId = i11 % 128;
                int i12 = i11 % 2;
                float fMeasureText4 = this.requestPostMessageChannel.measureText((String) onExtraCallbackWithResult(new Object[]{this, this.onMinimized}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1447235696, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1447235687));
                onNavigationEvent(fMeasureText4, fMeasureText2);
                return IAuthTabCallback_Parcel() + fMeasureText + Math.max(fMeasureText4, fMeasureText2) + fMeasureText3 + onExtraCallback();
            }
        }
        return IAuthTabCallback_Parcel() + fMeasureText + fMeasureText2 + fMeasureText3 + onExtraCallback();
    }

    private final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 1;
        getSmallIconId = i2 % 128;
        if (i2 % 2 == 0) {
            this.ICustomTabsCallback_Parcel.isEmpty();
            throw null;
        }
        if (!this.ICustomTabsCallback_Parcel.isEmpty() || !this.ICustomTabsServiceStubProxy.isEmpty() || this.onRelationshipValidationResult) {
            int i3 = notifyNotificationWithChannel + 101;
            getSmallIconId = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = notifyNotificationWithChannel;
        int i6 = i5 + 83;
        getSmallIconId = i6 % 128;
        boolean z = true ^ (i6 % 2 != 0);
        int i7 = i5 + 39;
        getSmallIconId = i7 % 128;
        int i8 = i7 % 2;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(float f, float f2) {
        Iterator it;
        runOnUiThreadDelayed runonuithreaddelayed;
        int i = 2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        ArrayList arrayList = new ArrayList();
        float f3 = f - f2;
        if (((Boolean) onExtraCallbackWithResult(new Object[]{this}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1909624481, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1909624475)).booleanValue()) {
            f3 /= 2.0f;
        }
        float f4 = f3;
        if (f4 > 0.0f) {
            int i2 = notifyNotificationWithChannel + 119;
            getSmallIconId = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 50 / 0;
                if (((Boolean) onExtraCallbackWithResult(new Object[]{this}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1977507681, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1977507699)).booleanValue()) {
                    Iterator<T> it2 = this.ICustomTabsServiceStubProxy.iterator();
                    while (it2.hasNext()) {
                        arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{(View) it2.next(), isMuted.IAuthTabCallback_Parcel((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), null, Float.valueOf(-f4), null, 5, null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                    }
                }
                if (onPostMessage()) {
                    Iterator<T> it3 = this.ICustomTabsCallback_Parcel.iterator();
                    while (it3.hasNext()) {
                        int i4 = getSmallIconId + 97;
                        notifyNotificationWithChannel = i4 % 128;
                        int i5 = i4 % 2;
                        arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{(View) it3.next(), isMuted.IAuthTabCallback_Parcel((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), null, Float.valueOf(f4), null, 5, null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                    }
                }
                runonuithreaddelayed = this.asInterface;
                if (runonuithreaddelayed != null) {
                    runonuithreaddelayed.onNavigationEvent();
                }
            } else {
                if (((Boolean) onExtraCallbackWithResult(new Object[]{this}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1977507681, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1977507699)).booleanValue()) {
                }
                if (onPostMessage()) {
                }
                runonuithreaddelayed = this.asInterface;
                if (runonuithreaddelayed != null) {
                }
            }
        } else {
            if (((Boolean) onExtraCallbackWithResult(new Object[]{this}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1977507681, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1977507699)).booleanValue()) {
                int i6 = getSmallIconId + 11;
                notifyNotificationWithChannel = i6 % 128;
                int i7 = i6 % 2;
                Iterator<T> it4 = this.ICustomTabsServiceStubProxy.iterator();
                while (it4.hasNext()) {
                    arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{(View) it4.next(), isMuted.IAuthTabCallback_Parcel((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(f4), fValueOf, null, 4, null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                }
            }
            if (onPostMessage()) {
                int i8 = getSmallIconId + 97;
                notifyNotificationWithChannel = i8 % 128;
                if (i8 % 2 != 0) {
                    it = this.ICustomTabsCallback_Parcel.iterator();
                    int i9 = 48 / 0;
                } else {
                    it = this.ICustomTabsCallback_Parcel.iterator();
                }
                while (it.hasNext()) {
                    int i10 = notifyNotificationWithChannel + 85;
                    getSmallIconId = i10 % 128;
                    int i11 = i10 % 2;
                    arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{(View) it.next(), isMuted.IAuthTabCallback_Parcel((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(-f4), fValueOf, null, 4, null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                }
            }
        }
        runOnUiThreadDelayed runonuithreaddelayed2 = this.asInterface;
        if (runonuithreaddelayed2 != null) {
            int i12 = getSmallIconId + 57;
            notifyNotificationWithChannel = i12 % 128;
            int i13 = i12 % 2;
            runonuithreaddelayed2.onNavigationEvent();
        }
        this.asInterface = (runOnUiThreadDelayed) isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted(null, pxToDp.IAuthTabCallback.onExtraCallback, arrayList, 0, null, 0, null, null, Boolean.FALSE, 200, 0L, false, 3321, null), false, 1, null);
    }

    public final void setOnAnimationListener(@NotNull getInterfaceDescriptor getinterfacedescriptor) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 89;
        getSmallIconId = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(getinterfacedescriptor, "");
            this.ICustomTabsService = getinterfacedescriptor;
            int i3 = 8 / 0;
        } else {
            Intrinsics.checkNotNullParameter(getinterfacedescriptor, "");
            this.ICustomTabsService = getinterfacedescriptor;
        }
        int i4 = getSmallIconId + 55;
        notifyNotificationWithChannel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
    }

    static final class extraCallbackWithResult implements Function1<Float, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        extraCallbackWithResult() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(((Number) obj).floatValue());
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TdsRollingNumberV1View.onExtraCallbackWithResult(TdsRollingNumberV1View.this, f);
            TdsRollingNumberV1View.this.invalidate();
            int i4 = onNavigationEvent + 107;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    static final class ICustomTabsCallback implements Function0<Unit> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        ICustomTabsCallback() {
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback();
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (TdsRollingNumberV1View.IAuthTabCallbackStub(TdsRollingNumberV1View.this)) {
                Rally rallyOnExtraCallbackWithResult = TdsRollingNumberV1View.onExtraCallbackWithResult(TdsRollingNumberV1View.this);
                if (rallyOnExtraCallbackWithResult != null) {
                    int i4 = onWarmupCompleted + 15;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        rallyOnExtraCallbackWithResult.ICustomTabsServiceStub();
                        int i5 = 68 / 0;
                    } else {
                        rallyOnExtraCallbackWithResult.ICustomTabsServiceStub();
                    }
                }
                TdsRollingNumberV1View.onNavigationEvent(TdsRollingNumberV1View.this, false);
            }
        }
    }

    static final class readTypedObject implements Function0<Unit> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        readTypedObject() {
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback();
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 19;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 54 / 0;
            }
            return unit;
        }

        public final void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                TdsRollingNumberV1View.this.invalidate();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TdsRollingNumberV1View.this.invalidate();
            int i3 = onNavigationEvent + 3;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static /* synthetic */ void setTextSizePx$default(TdsRollingNumberV1View tdsRollingNumberV1View, int i, boolean z, boolean z2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = getSmallIconId;
        int i5 = i4 + 99;
        notifyNotificationWithChannel = i5 % 128;
        if (i5 % 2 == 0 ? (i2 & 2) != 0 : (i2 & 5) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            int i6 = i4 + 11;
            notifyNotificationWithChannel = i6 % 128;
            int i7 = i6 % 2;
            z2 = false;
        }
        tdsRollingNumberV1View.setTextSizePx(i, z, z2);
    }

    public final void setTextSizePx(int i, boolean z, boolean z2) {
        int i2 = 2 % 2;
        int i3 = notifyNotificationWithChannel + 77;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            setTextSizeWithUnit$default(this, i, 1, null, z, z2, 2, null);
        } else {
            setTextSizeWithUnit$default(this, i, 0, null, z, z2, 4, null);
        }
        int i4 = getSmallIconId + 41;
        notifyNotificationWithChannel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void setTextSizeWithUnit$default(TdsRollingNumberV1View tdsRollingNumberV1View, float f, int i, Float f2, boolean z, boolean z2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = getSmallIconId;
        int i5 = i4 + 61;
        notifyNotificationWithChannel = i5 % 128;
        int i6 = (i5 % 2 == 0 ? (i2 & 2) == 0 : (i2 & 5) == 0) ? i : 2;
        if ((i2 & 4) != 0) {
            f2 = null;
        }
        Float f3 = f2;
        if ((i2 & 8) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            int i7 = i4 + 107;
            notifyNotificationWithChannel = i7 % 128;
            int i8 = i7 % 2;
            z2 = false;
        }
        tdsRollingNumberV1View.setTextSizeWithUnit(f, i6, f3, z3, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTextSizeWithUnit(float f, int i, @Nullable Float f2, boolean z, boolean z2) {
        float fApplyDimension;
        float fFloatValue;
        float f3;
        int i2 = 2 % 2;
        if (i == 2) {
            accessinit accessinitVarAsBinder = getTcfVendorConsentStatus.Companion.asBinder();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Resources resources = context.getResources();
            if (resources != null) {
                int i3 = notifyNotificationWithChannel + 9;
                getSmallIconId = i3 % 128;
                int i4 = i3 % 2;
                Configuration configuration = resources.getConfiguration();
                if (configuration != null) {
                    int i5 = notifyNotificationWithChannel + 49;
                    getSmallIconId = i5 % 128;
                    if (i5 % 2 == 0) {
                        float f4 = configuration.fontScale;
                        throw null;
                    }
                    f3 = configuration.fontScale;
                } else {
                    f3 = 1.0f;
                }
                fApplyDimension = TypedValue.applyDimension(1, deprecated_cacheResponse.onExtraCallbackWithResult(this, headerdefault.onNavigationEvent(RequestBodyCompanionasRequestBody1.IAuthTabCallback(this), accessinitVarAsBinder.onNavigationEvent(f3).onNavigationEvent(f), 0.0f, 2, (Object) null), 0.0f, 2, (Object) null), getResources().getDisplayMetrics());
            }
        } else {
            fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
        }
        if (f2 != null) {
            int i6 = notifyNotificationWithChannel + 15;
            getSmallIconId = i6 % 128;
            int i7 = i6 % 2;
            fFloatValue = (!(Intrinsics.areEqual(f2, 0.0f) ^ true) || f2.floatValue() > fApplyDimension) ? Float.MAX_VALUE : f2.floatValue();
        }
        IAuthTabCallback(Math.min(fApplyDimension, fFloatValue), z, z2);
    }

    public static /* synthetic */ void setTypography$default(TdsRollingNumberV1View tdsRollingNumberV1View, int i, boolean z, boolean z2, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 2) != 0) {
            int i4 = notifyNotificationWithChannel + 93;
            int i5 = i4 % 128;
            getSmallIconId = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 27;
            notifyNotificationWithChannel = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        }
        if ((i2 & 4) != 0) {
            int i9 = notifyNotificationWithChannel + 17;
            getSmallIconId = i9 % 128;
            z2 = i9 % 2 == 0;
        }
        tdsRollingNumberV1View.setTypography(i, z, z2);
        int i10 = getSmallIconId + 121;
        notifyNotificationWithChannel = i10 % 128;
        int i11 = i10 % 2;
    }

    public final void setTypography(int i, boolean z, boolean z2) {
        float size;
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 81;
        notifyNotificationWithChannel = i3 % 128;
        int i4 = i3 % 2;
        switch (i) {
            case 1:
                size = accessgetTlsVersionsAsStringp.Typography1.getSize();
                break;
            case 2:
                size = accessgetTlsVersionsAsStringp.Typography2.getSize();
                break;
            case 3:
                size = accessgetTlsVersionsAsStringp.Typography3.getSize();
                break;
            case 4:
                size = accessgetTlsVersionsAsStringp.Typography4.getSize();
                break;
            case 5:
                size = accessgetTlsVersionsAsStringp.Typography5.getSize();
                int i5 = notifyNotificationWithChannel + 29;
                getSmallIconId = i5 % 128;
                int i6 = i5 % 2;
                break;
            case 6:
                size = accessgetTlsVersionsAsStringp.Typography6.getSize();
                break;
            case 7:
                size = accessgetTlsVersionsAsStringp.Typography7.getSize();
                break;
            default:
                size = accessgetTlsVersionsAsStringp.Typography6.getSize();
                break;
        }
        setTextSizeWithUnit(size, 2, Float.valueOf(deprecated_cacheResponse.onExtraCallback(this, new connectionCount(r2, 0.0f, 2, null), 0.0f, 2, (Object) null)), z, z2);
    }

    public static /* synthetic */ void setTextSize$default(TdsRollingNumberV1View tdsRollingNumberV1View, int i, boolean z, boolean z2, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 2) != 0) {
            int i4 = notifyNotificationWithChannel + 57;
            getSmallIconId = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        }
        if ((i2 & 4) != 0) {
            int i6 = getSmallIconId + 51;
            notifyNotificationWithChannel = i6 % 128;
            z2 = i6 % 2 != 0;
        }
        tdsRollingNumberV1View.setTextSize(i, z, z2);
    }

    public final void setTextSize(int i, boolean z, boolean z2) {
        int i2 = 2 % 2;
        int i3 = notifyNotificationWithChannel + 49;
        getSmallIconId = i3 % 128;
        if (i3 % 2 != 0) {
            IAuthTabCallback(i, z, z2);
        } else {
            IAuthTabCallback(i, z, z2);
            int i4 = 36 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(float f, boolean z, boolean z2) {
        int i;
        int i2 = 2 % 2;
        if (this.IAuthTabCallbackDefault) {
            int i3 = getSmallIconId + 5;
            notifyNotificationWithChannel = i3 % 128;
            int i4 = i3 % 2;
            if (this.updateVisuals != 0.0f) {
                this.updateVisuals = f;
            } else {
                this.requestPostMessageChannel.setTextSize(f);
            }
        }
        if (z) {
            int i5 = getSmallIconId;
            int i6 = i5 + 89;
            notifyNotificationWithChannel = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            if (!this.IAuthTabCallbackDefault || this.ICustomTabsServiceDefault == 0.0f) {
                this.ICustomTabsServiceStub.setTextSize(f);
                i = notifyNotificationWithChannel + 59;
                getSmallIconId = i % 128;
            } else {
                this.ICustomTabsServiceDefault = f;
                i = i5 + 99;
                notifyNotificationWithChannel = i % 128;
            }
            int i7 = i % 2;
            if (!this.IAuthTabCallbackDefault || this.IEngagementSignalsCallback == 0.0f) {
                this.IPostMessageServiceDefault.setTextSize(f);
            } else {
                this.IEngagementSignalsCallback = f;
            }
        }
        extraCommand();
        if (z2) {
            int i8 = getSmallIconId + 25;
            notifyNotificationWithChannel = i8 % 128;
            int i9 = i8 % 2;
            onUnminimized();
        }
    }

    public static /* synthetic */ void setFont$default(TdsRollingNumberV1View tdsRollingNumberV1View, response responseVar, boolean z, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            int i3 = getSmallIconId;
            int i4 = i3 + 109;
            notifyNotificationWithChannel = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 51;
            notifyNotificationWithChannel = i6 % 128;
            int i7 = i6 % 2;
            z2 = false;
        }
        tdsRollingNumberV1View.setFont(responseVar, z, z2);
    }

    public final void setFont(@NotNull response responseVar, boolean z, boolean z2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(responseVar, "");
        TextPaint textPaint = this.requestPostMessageChannel;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textPaint.setTypeface(response.toTypeface$default(responseVar, context, null, 2, null));
        if (z) {
            TextPaint textPaint2 = this.ICustomTabsServiceStub;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            textPaint2.setTypeface(response.toTypeface$default(responseVar, context2, null, 2, null));
            TextPaint textPaint3 = this.IPostMessageServiceDefault;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            textPaint3.setTypeface(response.toTypeface$default(responseVar, context3, null, 2, null));
            int i2 = notifyNotificationWithChannel + 83;
            getSmallIconId = i2 % 128;
            int i3 = i2 % 2;
        }
        extraCommand();
        if (z2) {
            int i4 = notifyNotificationWithChannel + 123;
            getSmallIconId = i4 % 128;
            int i5 = i4 % 2;
            onUnminimized();
            if (i5 == 0) {
                int i6 = 44 / 0;
            }
        }
    }

    public static /* synthetic */ void setNumberTypeface$default(TdsRollingNumberV1View tdsRollingNumberV1View, Typeface typeface, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = getSmallIconId + 65;
            int i4 = i3 % 128;
            notifyNotificationWithChannel = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 47;
            getSmallIconId = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 / 2;
            }
            z = false;
        }
        tdsRollingNumberV1View.setNumberTypeface(typeface, z);
    }

    public final void setNumberTypeface(@Nullable Typeface typeface, boolean z) {
        int i = 2 % 2;
        this.requestPostMessageChannel.setTypeface(typeface);
        extraCommand();
        if (z) {
            int i2 = getSmallIconId + 15;
            notifyNotificationWithChannel = i2 % 128;
            int i3 = i2 % 2;
            onUnminimized();
            if (i3 != 0) {
                int i4 = 82 / 0;
            }
            int i5 = getSmallIconId + 5;
            notifyNotificationWithChannel = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = getSmallIconId + 29;
        notifyNotificationWithChannel = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void extraCommand() {
        int i = 2 % 2;
        this.requestPostMessageChannelWithExtras = 0.0f;
        Object[] objArrPlus = ArraysKt.plus(ArraysKt.plus(this.prefetchWithMultipleUrls, "?"), "？");
        int length = objArrPlus.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = getSmallIconId + 105;
            notifyNotificationWithChannel = i3 % 128;
            if (i3 % 2 != 0) {
                this.requestPostMessageChannel.measureText((String) objArrPlus[i2]);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            float fMeasureText = this.requestPostMessageChannel.measureText((String) objArrPlus[i2]);
            if (fMeasureText > this.requestPostMessageChannelWithExtras) {
                this.requestPostMessageChannelWithExtras = fMeasureText;
            }
            i2++;
            int i4 = notifyNotificationWithChannel + 115;
            getSmallIconId = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static /* synthetic */ void setTextColor$default(TdsRollingNumberV1View tdsRollingNumberV1View, int i, boolean z, boolean z2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = notifyNotificationWithChannel;
        int i5 = i4 + 25;
        getSmallIconId = i5 % 128;
        if (i5 % 2 != 0 ? (i2 & 2) != 0 : (i2 & 5) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            int i6 = i4 + 83;
            getSmallIconId = i6 % 128;
            z2 = i6 % 2 == 0;
        }
        tdsRollingNumberV1View.setTextColor(i, z, z2);
    }

    public final void setTextColor(int i, boolean z, boolean z2) {
        int i2 = 2 % 2;
        int i3 = notifyNotificationWithChannel + 77;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        this.requestPostMessageChannel.setColor(i);
        if (z) {
            this.ICustomTabsServiceStub.setColor(i);
            this.IPostMessageServiceDefault.setColor(i);
        }
        if (z2) {
            invalidate();
            int i5 = getSmallIconId + 71;
            notifyNotificationWithChannel = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static /* synthetic */ void setTextAlignment$default(TdsRollingNumberV1View tdsRollingNumberV1View, Paint.Align align, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = notifyNotificationWithChannel + 119;
        int i4 = i3 % 128;
        getSmallIconId = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 93;
            notifyNotificationWithChannel = i6 % 128;
            z = i6 % 2 != 0;
        }
        tdsRollingNumberV1View.setTextAlignment(align, z);
    }

    public final void setTextAlignment(@NotNull Paint.Align align, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(align, "");
        this.onExtraCallback = align;
        if (z) {
            int i2 = getSmallIconId + 107;
            notifyNotificationWithChannel = i2 % 128;
            int i3 = i2 % 2;
            onUnminimized();
        }
        int i4 = getSmallIconId + 39;
        notifyNotificationWithChannel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void setPrefix$default(TdsRollingNumberV1View tdsRollingNumberV1View, CharSequence charSequence, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 77;
        int i4 = i3 % 128;
        notifyNotificationWithChannel = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 81;
            getSmallIconId = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 4;
            }
            z = true;
        }
        tdsRollingNumberV1View.setPrefix(charSequence, z);
    }

    public final void setPrefix(@NotNull CharSequence charSequence, boolean z) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 59;
        notifyNotificationWithChannel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.warmup = charSequence;
            throw null;
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.warmup = charSequence;
        if (!(!z)) {
            onUnminimized();
        }
        int i3 = notifyNotificationWithChannel + 21;
        getSmallIconId = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void setPrefixFont$default(TdsRollingNumberV1View tdsRollingNumberV1View, response responseVar, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId;
        int i4 = i3 + 53;
        notifyNotificationWithChannel = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 55;
            notifyNotificationWithChannel = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        tdsRollingNumberV1View.setPrefixFont(responseVar, z);
    }

    public final void setPrefixFont(@NotNull response responseVar, boolean z) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 121;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(responseVar, "");
        TextPaint textPaint = this.ICustomTabsServiceStub;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textPaint.setTypeface(response.toTypeface$default(responseVar, context, null, 2, null));
        if (z) {
            int i4 = getSmallIconId + 115;
            notifyNotificationWithChannel = i4 % 128;
            int i5 = i4 % 2;
            onUnminimized();
        }
        int i6 = notifyNotificationWithChannel + 113;
        getSmallIconId = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ void setPrefixTextSize$default(TdsRollingNumberV1View tdsRollingNumberV1View, int i, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = getSmallIconId;
        int i5 = i4 + 111;
        notifyNotificationWithChannel = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 2) != 0) {
            int i7 = i4 + 93;
            notifyNotificationWithChannel = i7 % 128;
            z = i7 % 2 != 0;
        }
        tdsRollingNumberV1View.setPrefixTextSize(i, z);
    }

    public final void setPrefixTextSize(int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 61;
        notifyNotificationWithChannel = i3 % 128;
        if (i3 % 2 == 0) {
            this.ICustomTabsServiceStub.setTextSize(i);
            if (z) {
                onUnminimized();
                int i4 = notifyNotificationWithChannel + 57;
                getSmallIconId = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 / 5;
                    return;
                }
                return;
            }
            return;
        }
        this.ICustomTabsServiceStub.setTextSize(i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void setPrefixColor$default(TdsRollingNumberV1View tdsRollingNumberV1View, int i, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = notifyNotificationWithChannel;
        int i5 = i4 + 97;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 2) != 0) {
            int i7 = i4 + 115;
            getSmallIconId = i7 % 128;
            z = i7 % 2 == 0;
        }
        tdsRollingNumberV1View.setPrefixColor(i, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setPrefixColor(int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 15;
        notifyNotificationWithChannel = i3 % 128;
        if (i3 % 2 != 0) {
            this.ICustomTabsServiceStub.setColor(i);
            int i4 = 68 / 0;
            if (z) {
                invalidate();
            }
        } else {
            this.ICustomTabsServiceStub.setColor(i);
            if (!(!z)) {
            }
        }
        int i5 = notifyNotificationWithChannel + 93;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void setSuffix$default(TdsRollingNumberV1View tdsRollingNumberV1View, CharSequence charSequence, response responseVar, Integer num, Integer num2, boolean z, int i, Object obj) {
        response responseVar2;
        Integer num3;
        Integer num4;
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i3 = getSmallIconId + 65;
            notifyNotificationWithChannel = i3 % 128;
            if (i3 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            responseVar2 = null;
        } else {
            responseVar2 = responseVar;
        }
        if ((i & 4) != 0) {
            int i4 = notifyNotificationWithChannel;
            int i5 = i4 + 109;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 7;
            getSmallIconId = i7 % 128;
            int i8 = i7 % 2;
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i & 8) != 0) {
            int i9 = notifyNotificationWithChannel + 21;
            getSmallIconId = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 31 / 0;
            }
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i & 16) != 0) {
            z = true;
        }
        tdsRollingNumberV1View.setSuffix(charSequence, responseVar2, num3, num4, z);
    }

    public final void setSuffix(@NotNull CharSequence charSequence, @Nullable response responseVar, @Nullable Integer num, @Nullable Integer num2, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.IEngagementSignalsCallback_Parcel = charSequence;
        Object obj = null;
        if (responseVar != null) {
            TextPaint textPaint = this.IPostMessageServiceDefault;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textPaint.setTypeface(response.toTypeface$default(responseVar, context, null, 2, null));
        }
        if (num != null) {
            this.IPostMessageServiceDefault.setTextSize(num.intValue());
            int i2 = getSmallIconId + 85;
            notifyNotificationWithChannel = i2 % 128;
            int i3 = i2 % 2;
        }
        if (num2 != null) {
            int i4 = notifyNotificationWithChannel + 85;
            getSmallIconId = i4 % 128;
            if (i4 % 2 == 0) {
                this.IPostMessageServiceDefault.setColor(num2.intValue());
                obj.hashCode();
                throw null;
            }
            this.IPostMessageServiceDefault.setColor(num2.intValue());
        }
        if (z) {
            onUnminimized();
        }
    }

    public static /* synthetic */ void setSuffixFont$default(TdsRollingNumberV1View tdsRollingNumberV1View, response responseVar, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId;
        int i4 = i3 + 45;
        notifyNotificationWithChannel = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 3;
            notifyNotificationWithChannel = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        tdsRollingNumberV1View.setSuffixFont(responseVar, z);
    }

    public final void setSuffixFont(@NotNull response responseVar, boolean z) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 55;
        notifyNotificationWithChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(responseVar, "");
        TextPaint textPaint = this.IPostMessageServiceDefault;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textPaint.setTypeface(response.toTypeface$default(responseVar, context, null, 2, null));
        if (z) {
            int i4 = getSmallIconId + 11;
            notifyNotificationWithChannel = i4 % 128;
            int i5 = i4 % 2;
            onUnminimized();
        }
    }

    public static /* synthetic */ void setSuffixTextSize$default(TdsRollingNumberV1View tdsRollingNumberV1View, int i, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = notifyNotificationWithChannel + 121;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0 ? (i2 & 2) != 0 : (i2 & 5) != 0) {
            z = false;
        }
        tdsRollingNumberV1View.setSuffixTextSize(i, z);
        int i5 = getSmallIconId + 3;
        notifyNotificationWithChannel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
    }

    public final void setSuffixTextSize(int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 7;
        notifyNotificationWithChannel = i3 % 128;
        if (i3 % 2 == 0) {
            this.IPostMessageServiceDefault.setTextSize(i);
            if (z) {
                int i4 = notifyNotificationWithChannel + 49;
                getSmallIconId = i4 % 128;
                int i5 = i4 % 2;
                onUnminimized();
                if (i5 == 0) {
                    int i6 = 15 / 0;
                    return;
                }
                return;
            }
            return;
        }
        this.IPostMessageServiceDefault.setTextSize(i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void setSuffixColor$default(TdsRollingNumberV1View tdsRollingNumberV1View, int i, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = notifyNotificationWithChannel + 111;
        int i5 = i4 % 128;
        getSmallIconId = i5;
        if (i4 % 2 != 0 ? (i2 & 2) != 0 : (i2 & 2) != 0) {
            int i6 = i5 + 27;
            notifyNotificationWithChannel = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        tdsRollingNumberV1View.setSuffixColor(i, z);
    }

    public final void setSuffixColor(int i, boolean z) {
        int i2 = 2 % 2;
        this.IPostMessageServiceDefault.setColor(i);
        if (z) {
            int i3 = getSmallIconId + 65;
            notifyNotificationWithChannel = i3 % 128;
            int i4 = i3 % 2;
            invalidate();
            int i5 = notifyNotificationWithChannel + 65;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public final void setRollingDirection(@NotNull IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 1;
        notifyNotificationWithChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStubProxy, "");
        this.onSessionEnded = iAuthTabCallbackStubProxy;
        int i4 = getSmallIconId + 63;
        notifyNotificationWithChannel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void setCompoundDrawablePadding$default(TdsRollingNumberV1View tdsRollingNumberV1View, int i, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = notifyNotificationWithChannel + 121;
        int i5 = i4 % 128;
        getSmallIconId = i5;
        int i6 = i4 % 2;
        if ((i2 & 2) != 0) {
            int i7 = i5 + 113;
            int i8 = i7 % 128;
            notifyNotificationWithChannel = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 67;
            getSmallIconId = i10 % 128;
            int i11 = i10 % 2;
            z = false;
        }
        tdsRollingNumberV1View.setCompoundDrawablePadding(i, z);
    }

    public final void setCompoundDrawablePadding(int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 57;
        notifyNotificationWithChannel = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            onExtraCallbackWithResult(i);
            if (z) {
                invalidate();
            }
            int i4 = getSmallIconId + 13;
            notifyNotificationWithChannel = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        onExtraCallbackWithResult(i);
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId;
        int i4 = i3 + 85;
        notifyNotificationWithChannel = i4 % 128;
        int i5 = i4 % 2;
        this.asBinder = i;
        int i6 = i3 + 73;
        notifyNotificationWithChannel = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ void setCompoundDrawablesWithIntrinsicBounds$default(TdsRollingNumberV1View tdsRollingNumberV1View, Integer num, Integer num2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = notifyNotificationWithChannel + 103;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 4) != 0) {
            z = true;
        }
        tdsRollingNumberV1View.setCompoundDrawablesWithIntrinsicBounds(num, num2, z);
        int i5 = notifyNotificationWithChannel + 9;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(@Nullable Integer num, @Nullable Integer num2, boolean z) {
        Drawable drawableOnExtraCallback;
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 123;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Drawable drawableOnExtraCallback2 = null;
        if (num == null || num.intValue() == 0) {
            int i4 = notifyNotificationWithChannel + 117;
            getSmallIconId = i4 % 128;
            int i5 = i4 % 2;
            drawableOnExtraCallback = null;
        } else {
            int i6 = notifyNotificationWithChannel + 63;
            getSmallIconId = i6 % 128;
            int i7 = i6 % 2;
            drawableOnExtraCallback = ResourcesCompat.onExtraCallback(getResources(), num.intValue(), getContext().getTheme());
        }
        if (num2 != null) {
            int i8 = notifyNotificationWithChannel + 43;
            getSmallIconId = i8 % 128;
            if (i8 % 2 == 0) {
                num2.intValue();
                drawableOnExtraCallback2.hashCode();
                throw null;
            }
            if (num2.intValue() != 0) {
                int i9 = notifyNotificationWithChannel + 111;
                getSmallIconId = i9 % 128;
                if (i9 % 2 == 0) {
                    ResourcesCompat.onExtraCallback(getResources(), num2.intValue(), getContext().getTheme());
                    drawableOnExtraCallback2.hashCode();
                    throw null;
                }
                drawableOnExtraCallback2 = ResourcesCompat.onExtraCallback(getResources(), num2.intValue(), getContext().getTheme());
            }
        }
        setCompoundDrawablesWithIntrinsicBounds(drawableOnExtraCallback, drawableOnExtraCallback2, z);
    }

    public static /* synthetic */ void setCompoundDrawablesWithIntrinsicBounds$default(TdsRollingNumberV1View tdsRollingNumberV1View, Drawable drawable, Drawable drawable2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = notifyNotificationWithChannel + 41;
        int i4 = i3 % 128;
        getSmallIconId = i4;
        int i5 = i3 % 2;
        if ((i & 4) != 0) {
            int i6 = i4 + 39;
            int i7 = i6 % 128;
            notifyNotificationWithChannel = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 105;
            getSmallIconId = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        }
        tdsRollingNumberV1View.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, z);
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, boolean z) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel;
        int i3 = i2 + 55;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        if (drawable != null) {
            int i5 = i2 + 117;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        }
        setCompoundDrawables(drawable, drawable2, z);
        int i7 = getSmallIconId + 101;
        notifyNotificationWithChannel = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void setCompoundDrawables$default(TdsRollingNumberV1View tdsRollingNumberV1View, Integer num, Integer num2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 41;
        int i4 = i3 % 128;
        notifyNotificationWithChannel = i4;
        int i5 = i3 % 2;
        if ((i & 4) != 0) {
            int i6 = i4 + 123;
            getSmallIconId = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        }
        tdsRollingNumberV1View.setCompoundDrawables(num, num2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setCompoundDrawables(@Nullable Integer num, @Nullable Integer num2, boolean z) {
        Drawable drawableOnExtraCallback;
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel;
        int i3 = i2 + 109;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawableOnExtraCallback2 = null;
        if (num != null) {
            int i5 = i2 + 103;
            getSmallIconId = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 40 / 0;
                if (num.intValue() != 0) {
                    int i7 = getSmallIconId + 59;
                    notifyNotificationWithChannel = i7 % 128;
                    int i8 = i7 % 2;
                    drawableOnExtraCallback = ResourcesCompat.onExtraCallback(getResources(), num.intValue(), getContext().getTheme());
                } else {
                    int i9 = notifyNotificationWithChannel + 125;
                    getSmallIconId = i9 % 128;
                    int i10 = i9 % 2;
                    drawableOnExtraCallback = null;
                }
            } else if (num.intValue() != 0) {
            }
        }
        if (num2 != null) {
            int i11 = notifyNotificationWithChannel + 37;
            getSmallIconId = i11 % 128;
            int i12 = i11 % 2;
            if (num2.intValue() != 0) {
                drawableOnExtraCallback2 = ResourcesCompat.onExtraCallback(getResources(), num2.intValue(), getContext().getTheme());
                int i13 = notifyNotificationWithChannel + 95;
                getSmallIconId = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        setCompoundDrawables(drawableOnExtraCallback, drawableOnExtraCallback2, z);
    }

    public static /* synthetic */ void setCompoundDrawables$default(TdsRollingNumberV1View tdsRollingNumberV1View, Drawable drawable, Drawable drawable2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = notifyNotificationWithChannel + 7;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 4) != 0) {
            z = true;
        }
        tdsRollingNumberV1View.setCompoundDrawables(drawable, drawable2, z);
        int i5 = notifyNotificationWithChannel + 29;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, boolean z) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 67;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault iAuthTabCallbackDefault = this.IAuthTabCallbackStub;
        iAuthTabCallbackDefault.onExtraCallback();
        iAuthTabCallbackDefault.onExtraCallback(drawable);
        iAuthTabCallbackDefault.onExtraCallbackWithResult(drawable2);
        if (!z) {
            return;
        }
        onUnminimized();
        int i4 = notifyNotificationWithChannel + 1;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void setRightDrawableVerticalAlignment$default(TdsRollingNumberV1View tdsRollingNumberV1View, onNavigationEvent onnavigationevent, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = getSmallIconId + 89;
            notifyNotificationWithChannel = i3 % 128;
            z = i3 % 2 != 0;
        }
        tdsRollingNumberV1View.setRightDrawableVerticalAlignment(onnavigationevent, z);
        int i4 = notifyNotificationWithChannel + 103;
        getSmallIconId = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
    }

    public final void setRightDrawableVerticalAlignment(@NotNull onNavigationEvent onnavigationevent, boolean z) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 125;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            this.IEngagementSignalsCallbackStub = onnavigationevent;
            throw null;
        }
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        this.IEngagementSignalsCallbackStub = onnavigationevent;
        if (z) {
            invalidate();
        }
        int i3 = getSmallIconId + 91;
        notifyNotificationWithChannel = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setRightDrawablePreWidth(int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId;
        int i4 = i3 + 107;
        notifyNotificationWithChannel = i4 % 128;
        if (i4 % 2 != 0) {
            this.ICustomTabsService_Parcel = i;
            int i5 = 77 / 0;
        } else {
            this.ICustomTabsService_Parcel = i;
        }
        int i6 = i3 + 33;
        notifyNotificationWithChannel = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void setLeftDrawableVerticalAlignment$default(TdsRollingNumberV1View tdsRollingNumberV1View, onNavigationEvent onnavigationevent, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = notifyNotificationWithChannel + 25;
        int i4 = i3 % 128;
        getSmallIconId = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 21;
            notifyNotificationWithChannel = i6 % 128;
            z = i6 % 2 != 0;
        }
        tdsRollingNumberV1View.setLeftDrawableVerticalAlignment(onnavigationevent, z);
        int i7 = getSmallIconId + 97;
        notifyNotificationWithChannel = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void setLeftDrawableVerticalAlignment(@NotNull onNavigationEvent onnavigationevent, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        this.mayLaunchUrl = onnavigationevent;
        if (z) {
            int i2 = getSmallIconId + 97;
            notifyNotificationWithChannel = i2 % 128;
            int i3 = i2 % 2;
            invalidate();
        }
        int i4 = notifyNotificationWithChannel + 1;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 63;
        notifyNotificationWithChannel = i2 % 128;
        int i3 = i2 % 2;
        if (this.IAuthTabCallbackStub.IAuthTabCallback() != null) {
            int i4 = getSmallIconId + 79;
            notifyNotificationWithChannel = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = notifyNotificationWithChannel + 61;
        getSmallIconId = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    private final void onUnminimized() {
        String str;
        boolean z;
        boolean z2;
        access000 access000Var;
        int i;
        boolean z3;
        boolean z4;
        char c;
        char c2;
        int i2;
        int i3 = 2 % 2;
        if (this.IEngagementSignalsCallbackStubProxy == null) {
            int i4 = notifyNotificationWithChannel + 123;
            getSmallIconId = i4 % 128;
            if (i4 % 2 == 0) {
                str = this.ITrustedWebActivityCallbackStub;
                z = this.onGreatestScrollPercentageIncreased;
                z2 = true;
                access000Var = null;
                i = 1;
                z3 = true;
                z4 = true;
                c = 0;
                c2 = 1;
                i2 = 19060;
            } else {
                str = this.ITrustedWebActivityCallbackStub;
                z = this.onGreatestScrollPercentageIncreased;
                z2 = false;
                access000Var = null;
                i = 0;
                z3 = false;
                z4 = true;
                c = 0;
                c2 = 0;
                i2 = 412;
            }
            onWarmupCompleted(this, str, z2, access000Var, i, z3, z4, z, c, c2, i2, null);
        }
        int i5 = getSmallIconId + 55;
        notifyNotificationWithChannel = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private final void onTransact() {
        int i = 2 % 2;
        CharSequence charSequence = this.warmup;
        setContentDescription(((Object) charSequence) + " " + onExtraCallbackWithResult(this.IPostMessageService_Parcel) + " " + ((Object) this.IEngagementSignalsCallback_Parcel));
        int i2 = getSmallIconId + 117;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
        }
    }

    public final void setText(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = getSmallIconId;
        int i3 = i2 + 93;
        notifyNotificationWithChannel = i3 % 128;
        int i4 = i3 % 2;
        CharSequence charSequence2 = this.IEngagementSignalsCallbackStubProxy;
        if (charSequence2 == null) {
            int i5 = i2 + 61;
            notifyNotificationWithChannel = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            charSequence2 = "";
        }
        this.writeTypedList = charSequence2;
        this.IEngagementSignalsCallbackStubProxy = charSequence;
        this.extraCallbackWithResult = "";
        this.IPostMessageService_Parcel = "";
        this.onMinimized = "";
        this.ITrustedWebActivityCallbackStub = "";
        setContentDescription(charSequence);
        requestLayout();
        setMethodokhttp.IAuthTabCallback(this, new Function0() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 45;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                Unit unitIAuthTabCallback = TdsRollingNumberV1View.IAuthTabCallback(this.f$0);
                int i9 = onNavigationEvent + 75;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 54 / 0;
                }
                return unitIAuthTabCallback;
            }
        });
    }

    private static final Unit asBinder(TdsRollingNumberV1View tdsRollingNumberV1View) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 109;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 != 0) {
            tdsRollingNumberV1View.asInterface();
            tdsRollingNumberV1View.invalidate();
            int i3 = 98 / 0;
            return Unit.INSTANCE;
        }
        tdsRollingNumberV1View.asInterface();
        tdsRollingNumberV1View.invalidate();
        return Unit.INSTANCE;
    }

    private final void asInterface() {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 99;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Float) onExtraCallbackWithResult(new Object[]{this, null, null, null, null, 15, null}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -783133487, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 783133506)).floatValue();
        if (!this.IAuthTabCallbackDefault || getMeasuredWidth() == 0 || fFloatValue == 0.0f) {
            onExtraCallbackWithResult(fFloatValue);
            return;
        }
        if (fFloatValue > getMeasuredWidth()) {
            float fCoerceIn = RangesKt.coerceIn((getMeasuredWidth() / fFloatValue) * 0.95f, 0.0f, 1.0f);
            this.access200 = fCoerceIn;
            if (fCoerceIn != 0.0f) {
                this.requestPostMessageChannel.setTextSize(this.updateVisuals * fCoerceIn);
                this.ICustomTabsServiceStub.setTextSize(this.ICustomTabsServiceDefault * this.access200);
                this.IPostMessageServiceDefault.setTextSize(this.IEngagementSignalsCallback * this.access200);
            }
        } else {
            this.access200 = 1.0f;
            float f = this.updateVisuals;
            if (f != 0.0f) {
                this.requestPostMessageChannel.setTextSize(f);
            }
            float f2 = this.ICustomTabsServiceDefault;
            if (f2 != 0.0f) {
                int i4 = notifyNotificationWithChannel + 111;
                getSmallIconId = i4 % 128;
                int i5 = i4 % 2;
                this.ICustomTabsServiceStub.setTextSize(f2);
            }
            float f3 = this.IEngagementSignalsCallback;
            if (f3 != 0.0f) {
                int i6 = notifyNotificationWithChannel + 67;
                getSmallIconId = i6 % 128;
                int i7 = i6 % 2;
                this.IPostMessageServiceDefault.setTextSize(f3);
            }
        }
        onExtraCallbackWithResult(fFloatValue);
    }

    static /* synthetic */ void onNavigationEvent(TdsRollingNumberV1View tdsRollingNumberV1View, float f, int i, Object obj) {
        TdsRollingNumberV1View tdsRollingNumberV1View2;
        float fFloatValue;
        int i2 = 2 % 2;
        int i3 = getSmallIconId;
        int i4 = i3 + 57;
        notifyNotificationWithChannel = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 53;
            notifyNotificationWithChannel = i6 % 128;
            if (i6 % 2 != 0) {
                fFloatValue = ((Float) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, null, null, null, null, 86, null}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -783133487, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 783133506)).floatValue();
                tdsRollingNumberV1View2 = tdsRollingNumberV1View;
            } else {
                tdsRollingNumberV1View2 = tdsRollingNumberV1View;
                fFloatValue = ((Float) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View2, null, null, null, null, 15, null}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -783133487, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 783133506)).floatValue();
            }
        } else {
            tdsRollingNumberV1View2 = tdsRollingNumberV1View;
            fFloatValue = f;
        }
        tdsRollingNumberV1View2.onExtraCallbackWithResult(fFloatValue);
    }

    private final void onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int iAsBinder = (int) ((((f - this.IAuthTabCallbackStub.asBinder()) + getInterfaceDescriptor()) * this.access200) + this.IAuthTabCallbackStub.asBinder());
        View view = this.onExtraCallbackWithResult;
        if (view != null) {
            int i2 = notifyNotificationWithChannel + 29;
            getSmallIconId = i2 % 128;
            int i3 = i2 % 2;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int i4 = notifyNotificationWithChannel + 59;
            getSmallIconId = i4 % 128;
            int i5 = i4 % 2;
            layoutParams.width = iAsBinder;
            layoutParams.height = getMeasuredHeight() + setTagsokhttp.onExtraCallbackWithResult(this, 6);
            view.setLayoutParams(layoutParams);
            int i6 = notifyNotificationWithChannel + 71;
            getSmallIconId = i6 % 128;
            int i7 = i6 % 2;
        }
        View view2 = this.onExtraCallbackWithResult;
        int x = view2 != null ? (int) view2.getX() : 0;
        View view3 = this.onExtraCallbackWithResult;
        int y = view3 != null ? (int) view3.getY() : 0;
        View view4 = this.onExtraCallbackWithResult;
        if (view4 != null) {
            view4.layout(x, y, iAsBinder + x, getMeasuredHeight() + y + setTagsokhttp.onExtraCallbackWithResult(this, 6));
        }
    }

    private final int getInterfaceDescriptor() {
        int i;
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 115;
        notifyNotificationWithChannel = i3 % 128;
        if (i3 % 2 != 0) {
            IAuthTabCallbackDefault();
            throw null;
        }
        if (IAuthTabCallbackDefault()) {
            int i4 = getSmallIconId;
            int i5 = i4 + 35;
            notifyNotificationWithChannel = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 73;
            notifyNotificationWithChannel = i7 % 128;
            int i8 = i7 % 2;
            i = 15;
        } else {
            i = 22;
        }
        int iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(this, Integer.valueOf(i));
        int i9 = notifyNotificationWithChannel + 35;
        getSmallIconId = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 26 / 0;
        }
        return iOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void setNumber$default(TdsRollingNumberV1View tdsRollingNumberV1View, int i, boolean z, access000 access000Var, boolean z2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = getSmallIconId;
        int i5 = i4 + 31;
        notifyNotificationWithChannel = i5 % 128;
        if (i5 % 2 == 0 ? (i2 & 2) != 0 : (i2 & 3) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            int i6 = i4 + 43;
            notifyNotificationWithChannel = i6 % 128;
            if (i6 % 2 != 0) {
                access000Var = access000.IAuthTabCallback.onExtraCallbackWithResult.onExtraCallback;
                int i7 = 96 / 0;
            } else {
                access000Var = access000.IAuthTabCallback.onExtraCallbackWithResult.onExtraCallback;
            }
        }
        if ((i2 & 8) != 0) {
            int i8 = notifyNotificationWithChannel + 107;
            getSmallIconId = i8 % 128;
            int i9 = i8 % 2;
            z2 = false;
        }
        tdsRollingNumberV1View.setNumber(i, z, access000Var, z2);
    }

    public final void setNumber(int i, boolean z, @NotNull access000 access000Var, boolean z2) {
        String strValueOf;
        int i2;
        boolean z3;
        boolean z4;
        int i3;
        int i4 = 2 % 2;
        int i5 = notifyNotificationWithChannel + 3;
        getSmallIconId = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(access000Var, "");
            strValueOf = String.valueOf(i);
            i2 = 0;
            z3 = true;
            z4 = true;
            i3 = 87;
        } else {
            Intrinsics.checkNotNullParameter(access000Var, "");
            strValueOf = String.valueOf(i);
            i2 = 0;
            z3 = false;
            z4 = false;
            i3 = 56;
        }
        setNumber$default(this, strValueOf, z, access000Var, i2, z3, z4, z2, i3, null);
        int i6 = getSmallIconId + 57;
        notifyNotificationWithChannel = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 39 / 0;
        }
    }

    public static /* synthetic */ void setNumber$default(TdsRollingNumberV1View tdsRollingNumberV1View, long j, boolean z, access000 access000Var, boolean z2, int i, Object obj) {
        access000.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult;
        int i2 = 2 % 2;
        boolean z3 = (i & 2) != 0 ? true : z;
        if ((i & 4) != 0) {
            int i3 = getSmallIconId + 123;
            notifyNotificationWithChannel = i3 % 128;
            if (i3 % 2 != 0) {
                onextracallbackwithresult = access000.IAuthTabCallback.onExtraCallbackWithResult.onExtraCallback;
                int i4 = 91 / 0;
            } else {
                onextracallbackwithresult = access000.IAuthTabCallback.onExtraCallbackWithResult.onExtraCallback;
            }
            access000Var = onextracallbackwithresult;
            int i5 = getSmallIconId + 111;
            notifyNotificationWithChannel = i5 % 128;
            int i6 = i5 % 2;
        }
        access000 access000Var2 = access000Var;
        if ((i & 8) != 0) {
            int i7 = getSmallIconId;
            int i8 = i7 + 3;
            notifyNotificationWithChannel = i8 % 128;
            z2 = i8 % 2 != 0;
            int i9 = i7 + 55;
            notifyNotificationWithChannel = i9 % 128;
            int i10 = i9 % 2;
        }
        tdsRollingNumberV1View.setNumber(j, z3, access000Var2, z2);
    }

    public final void setNumber(long j, boolean z, @NotNull access000 access000Var, boolean z2) {
        String strValueOf;
        int i;
        boolean z3;
        boolean z4;
        int i2;
        int i3 = 2 % 2;
        int i4 = getSmallIconId + 107;
        notifyNotificationWithChannel = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(access000Var, "");
            strValueOf = String.valueOf(j);
            i = 1;
            z3 = false;
            z4 = false;
            i2 = 34;
        } else {
            Intrinsics.checkNotNullParameter(access000Var, "");
            strValueOf = String.valueOf(j);
            i = 0;
            z3 = false;
            z4 = false;
            i2 = 56;
        }
        setNumber$default(this, strValueOf, z, access000Var, i, z3, z4, z2, i2, null);
    }

    public static /* synthetic */ void setNumber$default(TdsRollingNumberV1View tdsRollingNumberV1View, String str, boolean z, access000 access000Var, int i, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        int i3;
        boolean z5;
        int i4 = 2 % 2;
        boolean z6 = (i2 & 2) != 0 ? true : z;
        access000 access000Var2 = (i2 & 4) != 0 ? access000.IAuthTabCallback.onExtraCallbackWithResult.onExtraCallback : access000Var;
        boolean z7 = false;
        if ((i2 & 8) != 0) {
            int i5 = notifyNotificationWithChannel + 115;
            int i6 = i5 % 128;
            getSmallIconId = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 121;
            notifyNotificationWithChannel = i8 % 128;
            int i9 = i8 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            int i10 = notifyNotificationWithChannel + 55;
            getSmallIconId = i10 % 128;
            int i11 = i10 % 2;
            z5 = false;
        } else {
            z5 = z2;
        }
        boolean z8 = (i2 & 32) != 0 ? false : z3;
        if ((i2 & 64) != 0) {
            int i12 = notifyNotificationWithChannel + 87;
            getSmallIconId = i12 % 128;
            int i13 = i12 % 2;
        } else {
            z7 = z4;
        }
        tdsRollingNumberV1View.setNumber(str, z6, access000Var2, i3, z5, z8, z7);
    }

    public final void setNumber(@NotNull String str, boolean z, @NotNull access000 access000Var, int i, boolean z2, boolean z3, boolean z4) {
        char c;
        char c2;
        int i2 = 2 % 2;
        int i3 = notifyNotificationWithChannel + 101;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(access000Var, "");
            c = 31;
            c2 = 'm';
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(access000Var, "");
            c = ',';
            c2 = '.';
        }
        IAuthTabCallback(str, z, access000Var, i, z2, z3, z4, c, c2);
    }

    public static /* synthetic */ void setFormattedNumber$default(TdsRollingNumberV1View tdsRollingNumberV1View, String str, Character ch, Character ch2, boolean z, access000 access000Var, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 8) != 0) {
            int i3 = notifyNotificationWithChannel + 23;
            getSmallIconId = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            int i5 = notifyNotificationWithChannel + 73;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
            access000Var = access000.IAuthTabCallback.onExtraCallbackWithResult.onExtraCallback;
        }
        tdsRollingNumberV1View.setFormattedNumber(str, ch, ch2, z2, access000Var);
    }

    public final void setFormattedNumber(@NotNull String str, @Nullable Character ch, @Nullable Character ch2, boolean z, @NotNull access000 access000Var) {
        char cCharValue;
        char cCharValue2;
        String strReplace$default;
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 35;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(access000Var, "");
        if (ch != null) {
            int i4 = notifyNotificationWithChannel + 53;
            getSmallIconId = i4 % 128;
            int i5 = i4 % 2;
            cCharValue = ch.charValue();
        } else {
            cCharValue = this.extraCallback;
        }
        char c = cCharValue;
        if (ch2 != null) {
            int i6 = getSmallIconId + 87;
            notifyNotificationWithChannel = i6 % 128;
            if (i6 % 2 != 0) {
                ch2.charValue();
                throw null;
            }
            cCharValue2 = ch2.charValue();
        } else {
            cCharValue2 = this.access100;
        }
        char c2 = cCharValue2;
        if (ch == null || (strReplace$default = StringsKt.replace$default(str, String.valueOf(ch.charValue()), "", false, 4, (Object) null)) == null) {
            strReplace$default = str;
        } else {
            int i7 = notifyNotificationWithChannel + 49;
            getSmallIconId = i7 % 128;
            int i8 = i7 % 2;
        }
        if (ch2 != null) {
            String strReplace$default2 = StringsKt.replace$default(strReplace$default, ch2.charValue(), '.', false, 4, (Object) null);
            if (strReplace$default2 != null) {
                strReplace$default = strReplace$default2;
            }
        }
        onWarmupCompleted(this, strReplace$default, z, access000Var, 0, false, false, false, c, c2, 120, null);
    }

    static /* synthetic */ void onWarmupCompleted(TdsRollingNumberV1View tdsRollingNumberV1View, String str, boolean z, access000 access000Var, int i, boolean z2, boolean z3, boolean z4, char c, char c2, int i2, Object obj) {
        boolean z5;
        access000 access000Var2;
        int i3;
        boolean z6;
        int i4 = 2 % 2;
        if ((i2 & 2) != 0) {
            int i5 = notifyNotificationWithChannel + 99;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
            z5 = true;
        } else {
            z5 = z;
        }
        if ((i2 & 4) != 0) {
            access000Var2 = access000.IAuthTabCallback.onExtraCallbackWithResult.onExtraCallback;
            int i7 = getSmallIconId + 105;
            notifyNotificationWithChannel = i7 % 128;
            int i8 = i7 % 2;
        } else {
            access000Var2 = access000Var;
        }
        if ((i2 & 8) != 0) {
            int i9 = getSmallIconId + 123;
            notifyNotificationWithChannel = i9 % 128;
            int i10 = i9 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            int i11 = notifyNotificationWithChannel;
            int i12 = i11 + 93;
            getSmallIconId = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i11 + 11;
            getSmallIconId = i14 % 128;
            int i15 = i14 % 2;
            z6 = false;
        } else {
            z6 = z2;
        }
        tdsRollingNumberV1View.IAuthTabCallback(str, z5, access000Var2, i3, z6, (i2 & 32) != 0 ? false : z3, (i2 & 64) == 0 ? z4 : false, (i2 & 128) != 0 ? tdsRollingNumberV1View.extraCallback : c, (i2 & 256) != 0 ? tdsRollingNumberV1View.access100 : c2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (onActivityResized() != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(final String str, final boolean z, final access000 access000Var, final int i, final boolean z2, boolean z3, final boolean z4, final char c, final char c2) {
        boolean z5;
        int i2 = 2 % 2;
        this.IEngagementSignalsCallbackStubProxy = null;
        this.onGreatestScrollPercentageIncreased = z4;
        boolean z6 = false;
        if (this.extraCallback == c && this.access100 == c2) {
            int i3 = notifyNotificationWithChannel + 27;
            getSmallIconId = i3 % 128;
            int i4 = i3 % 2;
            z5 = false;
        } else {
            z5 = true;
        }
        boolean z7 = z3 || z5;
        if (StringsKt.isBlank(str)) {
            this.extraCallback = c;
            this.access100 = c2;
            int i5 = notifyNotificationWithChannel + 109;
            getSmallIconId = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (z7 || !Intrinsics.areEqual(this.ITrustedWebActivityCallbackStub, str)) {
            if (!z) {
                if (!extraCallback()) {
                    int i6 = notifyNotificationWithChannel + 13;
                    getSmallIconId = i6 % 128;
                    int i7 = i6 % 2;
                }
                final boolean z8 = z7;
                this.setEngagementSignalsCallback = new Function0() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda7
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i8 = 2 % 2;
                        int i9 = onNavigationEvent + 125;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unit = (Unit) TdsRollingNumberV1View.onExtraCallbackWithResult(new Object[]{this.f$0, str, access000Var, Boolean.valueOf(z2), Boolean.valueOf(z8), Boolean.valueOf(z4), Character.valueOf(c), Character.valueOf(c2)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1745444392, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1745444403);
                        int i11 = onNavigationEvent + 31;
                        IAuthTabCallback = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i12 = 11 / 0;
                        }
                        return unit;
                    }
                };
                return;
            }
            this.setEngagementSignalsCallback = null;
            this.extraCallback = c;
            this.access100 = c2;
            if (this.ICustomTabsCallbackStubProxy) {
                int i8 = notifyNotificationWithChannel + 53;
                getSmallIconId = i8 % 128;
                int i9 = i8 % 2;
                getHostnameVerifierokhttp.onNavigationEvent(this, null, 1, null);
            }
            ICustomTabsCallbackDefault();
            if (processDeepLink.onExtraCallback()) {
                int i10 = notifyNotificationWithChannel + 43;
                int i11 = i10 % 128;
                getSmallIconId = i11;
                int i12 = i10 % 2;
                int i13 = i11 + 49;
                notifyNotificationWithChannel = i13 % 128;
                int i14 = i13 % 2;
            } else {
                int i15 = notifyNotificationWithChannel + 25;
                getSmallIconId = i15 % 128;
                int i16 = i15 % 2;
                z6 = z;
            }
            this.IAuthTabCallback = z6;
            onNavigationEvent(str, (String) onExtraCallbackWithResult(new Object[]{this, str}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1447235696, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1447235687));
            requestLayout();
            final String str2 = this.extraCallbackWithResult;
            final String str3 = this.IPostMessageService_Parcel;
            final boolean zOnPostMessage = onPostMessage();
            setMethodokhttp.IAuthTabCallback(this, new Function0() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda8
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i17 = 2 % 2;
                    int i18 = onWarmupCompleted + 49;
                    onExtraCallbackWithResult = i18 % 128;
                    int i19 = i18 % 2;
                    TdsRollingNumberV1View tdsRollingNumberV1View = this.f$0;
                    String str4 = str2;
                    String str5 = str3;
                    boolean z9 = z;
                    boolean z10 = z2;
                    int i20 = i;
                    Unit unit = (Unit) TdsRollingNumberV1View.onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, str4, str5, Boolean.valueOf(z9), Boolean.valueOf(z10), Integer.valueOf(i20), access000Var, Boolean.valueOf(zOnPostMessage)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1473872923, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1473872916);
                    int i21 = onExtraCallbackWithResult + 19;
                    onWarmupCompleted = i21 % 128;
                    int i22 = i21 % 2;
                    return unit;
                }
            });
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws NoWhenBranchMatchedException {
        TdsRollingNumberV1View tdsRollingNumberV1View = (TdsRollingNumberV1View) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        int iIntValue = ((Number) objArr[5]).intValue();
        access000 access000Var = (access000) objArr[6];
        boolean zBooleanValue3 = ((Boolean) objArr[7]).booleanValue();
        int i = 2 % 2;
        int i2 = getSmallIconId + 43;
        notifyNotificationWithChannel = i2 % 128;
        int i3 = i2 % 2;
        tdsRollingNumberV1View.onExtraCallbackWithResult(str, str2, zBooleanValue, zBooleanValue2, iIntValue, access000Var, zBooleanValue3);
        Unit unit = Unit.INSTANCE;
        int i4 = notifyNotificationWithChannel + 95;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onTransact(TdsRollingNumberV1View tdsRollingNumberV1View) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 77;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        tdsRollingNumberV1View.access100();
        Unit unit = Unit.INSTANCE;
        int i4 = getSmallIconId + 117;
        notifyNotificationWithChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TdsRollingNumberV1View tdsRollingNumberV1View = (TdsRollingNumberV1View) objArr[0];
        int i = 2 % 2;
        tdsRollingNumberV1View.access100();
        getInterfaceDescriptor getinterfacedescriptor = tdsRollingNumberV1View.ICustomTabsService;
        if (getinterfacedescriptor != null) {
            getinterfacedescriptor.onWarmupCompleted();
            int i2 = notifyNotificationWithChannel + 43;
            getSmallIconId = i2 % 128;
            int i3 = i2 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = notifyNotificationWithChannel + 63;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(String str, String str2, boolean z, boolean z2, int i, access000 access000Var, boolean z3) throws NoWhenBranchMatchedException {
        boolean zOnExtraCallback;
        int i2 = 2 % 2;
        asInterface();
        onExtraCallback(str2, z3);
        onExtraCallbackWithResult(z);
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = this.onSessionEnded;
        Object obj = null;
        if (iAuthTabCallbackStubProxy instanceof IAuthTabCallbackStubProxy.onNavigationEvent) {
            int i3 = getSmallIconId + 17;
            notifyNotificationWithChannel = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallback(str, str2);
                obj.hashCode();
                throw null;
            }
            zOnExtraCallback = onExtraCallback(str, str2);
            int i4 = getSmallIconId + 71;
            notifyNotificationWithChannel = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 4;
            }
        } else if (iAuthTabCallbackStubProxy instanceof IAuthTabCallbackStubProxy.onExtraCallback) {
            int i6 = notifyNotificationWithChannel + 67;
            getSmallIconId = i6 % 128;
            int i7 = i6 % 2;
            zOnExtraCallback = true;
        } else {
            zOnExtraCallback = false;
        }
        this.getInterfaceDescriptor.clear();
        ArrayList<IAuthTabCallbackStub> arrayList = this.getInterfaceDescriptor;
        ArrayList<onExtraCallbackWithResult> arrayList2 = this.writeTypedObject;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (onExtraCallback(((onExtraCallbackWithResult) obj2).onExtraCallback())) {
                int i8 = notifyNotificationWithChannel + 35;
                getSmallIconId = i8 % 128;
                if (i8 % 2 == 0) {
                    arrayList3.add(obj2);
                    int i9 = 99 / 0;
                } else {
                    arrayList3.add(obj2);
                }
            }
        }
        ArrayList<onExtraCallbackWithResult> arrayList4 = this.ITrustedWebActivityCallbackDefault;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            if (onExtraCallback(((onExtraCallbackWithResult) obj3).onExtraCallback())) {
                arrayList5.add(obj3);
            }
        }
        arrayList.addAll((List) onExtraCallbackWithResult(new Object[]{this, arrayList3, arrayList5, Boolean.valueOf(zOnExtraCallback), Boolean.valueOf(z2), access000Var}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 832088648, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -832088636));
        if (z) {
            Iterator<T> it = this.getInterfaceDescriptor.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            float fOnNavigationEvent = onNavigationEvent((IAuthTabCallbackStub) it.next());
            while (it.hasNext()) {
                fOnNavigationEvent = Math.min(fOnNavigationEvent, onNavigationEvent((IAuthTabCallbackStub) it.next()));
            }
            Iterator<T> it2 = this.getInterfaceDescriptor.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = notifyNotificationWithChannel + 33;
            getSmallIconId = i10 % 128;
            if (i10 % 2 == 0) {
                onExtraCallback((IAuthTabCallbackStub) it2.next());
                throw null;
            }
            float fOnExtraCallback = onExtraCallback((IAuthTabCallbackStub) it2.next());
            int i11 = notifyNotificationWithChannel + 95;
            getSmallIconId = i11 % 128;
            int i12 = i11 % 2;
            while (it2.hasNext()) {
                int i13 = notifyNotificationWithChannel + 41;
                getSmallIconId = i13 % 128;
                int i14 = i13 % 2;
                fOnExtraCallback = Math.max(fOnExtraCallback, onExtraCallback((IAuthTabCallbackStub) it2.next()));
            }
            onExtraCallbackWithResult(fOnNavigationEvent, fOnExtraCallback);
        }
        this.onTransact.clear();
        if (!this.onGreatestScrollPercentageIncreased) {
            ArrayList<onWarmupCompleted> arrayList6 = this.onTransact;
            List<onExtraCallbackWithResult> list = this.writeTypedObject;
            ArrayList arrayList7 = new ArrayList();
            for (Object obj4 : list) {
                if (((onExtraCallbackWithResult) obj4).onExtraCallback() == ',') {
                    arrayList7.add(obj4);
                }
            }
            ArrayList<onExtraCallbackWithResult> arrayList8 = this.ITrustedWebActivityCallbackDefault;
            ArrayList arrayList9 = new ArrayList();
            for (Object obj5 : arrayList8) {
                int i15 = notifyNotificationWithChannel + 29;
                getSmallIconId = i15 % 128;
                int i16 = i15 % 2;
                if (((onExtraCallbackWithResult) obj5).onExtraCallback() == ',') {
                    int i17 = getSmallIconId + 97;
                    notifyNotificationWithChannel = i17 % 128;
                    if (i17 % 2 != 0) {
                        arrayList9.add(obj5);
                        obj.hashCode();
                        throw null;
                    }
                    arrayList9.add(obj5);
                }
            }
            arrayList6.addAll(IAuthTabCallback(list, arrayList7, arrayList9, this.getInterfaceDescriptor, access000Var));
        }
        this.IAuthTabCallback_Parcel = (onTransact) onExtraCallbackWithResult(new Object[]{this, this.writeTypedObject, this.ITrustedWebActivityCallbackDefault, this.getInterfaceDescriptor, Boolean.valueOf(this.onUnminimized), access000Var}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -715332983, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 715332999);
        this.ICustomTabsCallback = onExtraCallbackWithResult(this.writeTypedObject, this.ITrustedWebActivityCallbackDefault, this.getInterfaceDescriptor, access000Var);
        this.receiveFile = (onExtraCallback) onExtraCallbackWithResult(new Object[]{this, this.writeTypedObject, this.ITrustedWebActivityCallbackDefault, this.getInterfaceDescriptor, Boolean.valueOf(this.onUnminimized), access000Var}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1050413352, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1050413330);
        this.onVerticalScrollEvent = onNavigationEvent(this.writeTypedObject, this.ITrustedWebActivityCallbackDefault, this.getInterfaceDescriptor, this.onUnminimized, access000Var);
        this.onWarmupCompleted = onWarmupCompleted(this.writeTypedObject, this.ITrustedWebActivityCallbackDefault, this.getInterfaceDescriptor, this.onUnminimized, access000Var);
        if (z) {
            this.IEngagementSignalsCallbackDefault = (runOnUiThreadDelayed) isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.onExtraCallback(onExtraCallbackWithResult(access000Var, i), (Object) null, new Function0() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i18 = 2 % 2;
                    int i19 = onExtraCallback + 7;
                    onWarmupCompleted = i19 % 128;
                    int i20 = i19 % 2;
                    Unit unitOnNavigationEvent = TdsRollingNumberV1View.onNavigationEvent(this.f$0);
                    int i21 = onWarmupCompleted + 113;
                    onExtraCallback = i21 % 128;
                    int i22 = i21 % 2;
                    return unitOnNavigationEvent;
                }
            }, 1, (Object) null), null, new Function0() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i18 = 2 % 2;
                    int i19 = onNavigationEvent + 51;
                    IAuthTabCallback = i19 % 128;
                    int i20 = i19 % 2;
                    Unit unit = (Unit) TdsRollingNumberV1View.onExtraCallbackWithResult(new Object[]{this.f$0}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1781337846, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1781337844);
                    int i21 = onNavigationEvent + 89;
                    IAuthTabCallback = i21 % 128;
                    if (i21 % 2 != 0) {
                        int i22 = 4 / 0;
                    }
                    return unit;
                }
            }, 1, null), false, 1, null);
        } else {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean extraCallback() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 29;
        int i3 = i2 % 128;
        notifyNotificationWithChannel = i3;
        int i4 = i2 % 2;
        if (this.IAuthTabCallback) {
            int i5 = i3 + 103;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
            boolean zIsLayoutRequested = isLayoutRequested();
            if (i6 == 0) {
                int i7 = 86 / 0;
                if (!(!zIsLayoutRequested)) {
                    return true;
                }
            } else if (zIsLayoutRequested) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onActivityResized() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 51;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        runOnUiThreadDelayed runonuithreaddelayed = this.IEngagementSignalsCallbackDefault;
        if (runonuithreaddelayed != null && runonuithreaddelayed.postMessage()) {
            int i3 = notifyNotificationWithChannel + 35;
            getSmallIconId = i3 % 128;
            int i4 = i3 % 2;
            runOnUiThreadDelayed runonuithreaddelayed2 = this.IEngagementSignalsCallbackDefault;
            if (i4 != 0) {
                if (runonuithreaddelayed2 != null) {
                }
                return true;
            }
            int i5 = 33 / 0;
            if (runonuithreaddelayed2 != null) {
                if (!runonuithreaddelayed2.prefetch()) {
                }
            }
            return true;
        }
        return false;
    }

    private final void ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 55;
        getSmallIconId = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        runOnUiThreadDelayed runonuithreaddelayed = this.IEngagementSignalsCallbackDefault;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
        }
        int i3 = notifyNotificationWithChannel + 107;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void onExtraCallbackWithResult(boolean z) {
        float f;
        int i = 2 % 2;
        int i2 = getSmallIconId;
        int i3 = i2 + 15;
        notifyNotificationWithChannel = i3 % 128;
        int i4 = i3 % 2;
        if (z) {
            int i5 = i2 + 37;
            notifyNotificationWithChannel = i5 % 128;
            if (i5 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            f = this.onActivityLayout;
        } else {
            f = this.areNotificationsEnabled;
        }
        this.onNavigationEvent = f;
        this.extraCommand = z ? this.onActivityLayout : this.areNotificationsEnabled;
        this.IPostMessageService = z ? this.readTypedObject : this.ITrustedWebActivityCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0082 A[PHI: r14
      0x0082: PHI (r14v5 int) = (r14v4 int), (r14v2 int) binds: [B:21:0x0080, B:18:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int iOnWarmupCompleted;
        int iIAuthTabCallbackStub;
        Pair<Interpolator, Integer> pairOnExtraCallback;
        TdsRollingNumberV1View tdsRollingNumberV1View = (TdsRollingNumberV1View) objArr[0];
        List list = (List) objArr[1];
        List list2 = (List) objArr[2];
        List list3 = (List) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        access000 access000Var = (access000) objArr[5];
        int i5 = 2 % 2;
        Object obj = null;
        if (!tdsRollingNumberV1View.onPostMessage()) {
            int i6 = notifyNotificationWithChannel + 109;
            getSmallIconId = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }
        int size = list.size();
        int size2 = list2.size();
        List list4 = list;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            i = 0;
        } else {
            Iterator it = list4.iterator();
            i = 0;
            while (it.hasNext()) {
                int i8 = notifyNotificationWithChannel + 53;
                getSmallIconId = i8 % 128;
                if (i8 % 2 == 0) {
                    tdsRollingNumberV1View.onExtraCallback(((onExtraCallbackWithResult) it.next()).onExtraCallback());
                    obj.hashCode();
                    throw null;
                }
                if (tdsRollingNumberV1View.onExtraCallback(((onExtraCallbackWithResult) it.next()).onExtraCallback())) {
                    int i9 = getSmallIconId + 101;
                    notifyNotificationWithChannel = i9 % 128;
                    if (i9 % 2 == 0) {
                        i++;
                        if (i < 0) {
                        }
                    } else if (i < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
        }
        List list5 = list2;
        if ((list5 instanceof Collection) && list5.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it2 = list5.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if (tdsRollingNumberV1View.onExtraCallback(((onExtraCallbackWithResult) it2.next()).onExtraCallback()) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        List list6 = list3;
        boolean z2 = list6 instanceof Collection;
        if (z2 && list6.isEmpty()) {
            i3 = 0;
        } else {
            Iterator it3 = list6.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                int i10 = notifyNotificationWithChannel + 3;
                getSmallIconId = i10 % 128;
                int i11 = i10 % 2;
                if ((((IAuthTabCallbackStub) it3.next()) instanceof IAuthTabCallbackStub.onExtraCallback) && (i3 = i3 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        boolean z3 = i3 != 0;
        if (z2) {
            int i12 = getSmallIconId + 105;
            notifyNotificationWithChannel = i12 % 128;
            int i13 = i12 % 2;
            if (list6.isEmpty()) {
                i4 = 0;
            } else {
                Iterator it4 = list6.iterator();
                i4 = 0;
                while (it4.hasNext()) {
                    if ((((IAuthTabCallbackStub) it4.next()) instanceof IAuthTabCallbackStub.onExtraCallbackWithResult) && (i4 = i4 + 1) < 0) {
                        int i14 = notifyNotificationWithChannel + 107;
                        getSmallIconId = i14 % 128;
                        int i15 = i14 % 2;
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
        }
        if (i4 != 0) {
            int i16 = notifyNotificationWithChannel + 25;
            getSmallIconId = i16 % 128;
            int i17 = i16 % 2;
            z = true;
        } else {
            z = false;
        }
        if (zBooleanValue) {
            if (i == i2) {
                iIAuthTabCallbackStub = access000Var.IAuthTabCallbackStub();
                iOnWarmupCompleted = iIAuthTabCallbackStub * (i - 1);
            } else {
                iOnWarmupCompleted = access000Var.IAuthTabCallbackStub() * (size - 1);
            }
        } else if (i == i2) {
            iIAuthTabCallbackStub = access000Var.IAuthTabCallbackStub();
            iOnWarmupCompleted = iIAuthTabCallbackStub * (i - 1);
        } else if (!z) {
            iOnWarmupCompleted = access000Var.IAuthTabCallbackStub() * (size2 - 1);
        } else {
            int i18 = notifyNotificationWithChannel + 47;
            getSmallIconId = i18 % 128;
            int i19 = i18 % 2;
            iOnWarmupCompleted = access000Var instanceof access000.onExtraCallbackWithResult ? ((access000.onExtraCallbackWithResult) access000Var).onWarmupCompleted() * 20 : (i4 * 10) + 50;
        }
        if (zBooleanValue) {
            if (z3) {
                pairOnExtraCallback = access000Var.onNavigationEvent(i3);
                int i20 = getSmallIconId + 11;
                notifyNotificationWithChannel = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = 5 / 3;
                }
            } else {
                pairOnExtraCallback = access000Var.onExtraCallback();
            }
        } else if (z) {
            int i22 = notifyNotificationWithChannel + 93;
            getSmallIconId = i22 % 128;
            if (i22 % 2 == 0) {
                access000Var.IAuthTabCallback(i4);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            pairOnExtraCallback = access000Var.IAuthTabCallback(i4);
        } else {
            pairOnExtraCallback = access000Var.onExtraCallback();
        }
        return new onExtraCallback(iOnWarmupCompleted, tdsRollingNumberV1View.onActivityLayout, tdsRollingNumberV1View.areNotificationsEnabled, pairOnExtraCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final onExtraCallback onNavigationEvent(List<onExtraCallbackWithResult> list, List<onExtraCallbackWithResult> list2, List<? extends IAuthTabCallbackStub> list3, boolean z, access000 access000Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int iIAuthTabCallbackStub;
        int i5 = 2 % 2;
        int i6 = notifyNotificationWithChannel + 9;
        getSmallIconId = i6 % 128;
        int i7 = i6 % 2;
        if (onPostMessage()) {
            return null;
        }
        int size = list.size();
        int size2 = list2.size();
        List<onExtraCallbackWithResult> list4 = list;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            int i8 = getSmallIconId + 121;
            notifyNotificationWithChannel = i8 % 128;
            int i9 = i8 % 2;
            i = 0;
        } else {
            Iterator<T> it = list4.iterator();
            i = 0;
            while (it.hasNext()) {
                if (onExtraCallback(((onExtraCallbackWithResult) it.next()).onExtraCallback())) {
                    int i10 = notifyNotificationWithChannel + 123;
                    getSmallIconId = i10 % 128;
                    int i11 = i10 % 2;
                    i++;
                    if (i < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
        }
        List<onExtraCallbackWithResult> list5 = list2;
        if ((list5 instanceof Collection) && list5.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<T> it2 = list5.iterator();
            loop2: while (true) {
                i2 = 0;
                while (it2.hasNext()) {
                    if (onExtraCallback(((onExtraCallbackWithResult) it2.next()).onExtraCallback())) {
                        int i12 = getSmallIconId + 13;
                        notifyNotificationWithChannel = i12 % 128;
                        if (i12 % 2 != 0) {
                            break;
                        }
                        i2++;
                        if (i2 < 0) {
                            CollectionsKt.throwCountOverflow();
                            int i13 = getSmallIconId + 35;
                            notifyNotificationWithChannel = i13 % 128;
                            if (i13 % 2 != 0) {
                                int i14 = 2 / 2;
                            }
                        }
                    }
                }
            }
        }
        List<? extends IAuthTabCallbackStub> list6 = list3;
        boolean z2 = list6 instanceof Collection;
        if (z2 && list6.isEmpty()) {
            i3 = 0;
        } else {
            Iterator<T> it3 = list6.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                if ((((IAuthTabCallbackStub) it3.next()) instanceof IAuthTabCallbackStub.onExtraCallback) && (i3 = i3 + 1) < 0) {
                    int i15 = notifyNotificationWithChannel + 81;
                    getSmallIconId = i15 % 128;
                    int i16 = i15 % 2;
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        boolean z3 = i3 != 0;
        if (z2) {
            int i17 = getSmallIconId + 95;
            notifyNotificationWithChannel = i17 % 128;
            if (i17 % 2 != 0) {
                list6.isEmpty();
                throw null;
            }
            if (list6.isEmpty()) {
                int i18 = getSmallIconId + 3;
                notifyNotificationWithChannel = i18 % 128;
                int i19 = i18 % 2;
                i4 = 0;
            } else {
                Iterator<T> it4 = list6.iterator();
                i4 = 0;
                while (it4.hasNext()) {
                    int i20 = notifyNotificationWithChannel + 93;
                    getSmallIconId = i20 % 128;
                    int i21 = i20 % 2;
                    if ((((IAuthTabCallbackStub) it4.next()) instanceof IAuthTabCallbackStub.onExtraCallbackWithResult) && (i4 = i4 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
        }
        boolean z4 = i4 != 0;
        if (i == i2) {
            iIAuthTabCallbackStub = access000Var.IAuthTabCallbackStub() * (i - 1);
        } else if (z) {
            iIAuthTabCallbackStub = access000Var.IAuthTabCallbackStub() * (size - 1);
        } else if (!z4) {
            iIAuthTabCallbackStub = access000Var.IAuthTabCallbackStub() * (size2 - 1);
        } else if (!(access000Var instanceof access000.onExtraCallbackWithResult)) {
            iIAuthTabCallbackStub = (i4 * 10) + 50;
        } else {
            int i22 = notifyNotificationWithChannel + 59;
            getSmallIconId = i22 % 128;
            iIAuthTabCallbackStub = i22 % 2 == 0 ? ((access000.onExtraCallbackWithResult) access000Var).onWarmupCompleted() + 95 : ((access000.onExtraCallbackWithResult) access000Var).onWarmupCompleted() * 20;
        }
        return new onExtraCallback(iIAuthTabCallbackStub, this.readTypedObject, this.ITrustedWebActivityCallback, z ? z3 ? access000Var.onNavigationEvent(i3) : access000Var.onExtraCallback() : z4 ? access000Var.IAuthTabCallback(i4) : access000Var.onExtraCallback());
    }

    private final IAuthTabCallback onWarmupCompleted(List<onExtraCallbackWithResult> list, List<onExtraCallbackWithResult> list2, List<? extends IAuthTabCallbackStub> list3, boolean z, access000 access000Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int iIAuthTabCallbackStub;
        int iIAuthTabCallbackStub2;
        Pair<Interpolator, Integer> pairOnExtraCallback;
        int i5 = 2 % 2;
        Object obj = null;
        if (!((Boolean) onExtraCallbackWithResult(new Object[]{this}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1909624481, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1909624475)).booleanValue()) {
            return null;
        }
        int size = list.size();
        int size2 = list2.size();
        List<onExtraCallbackWithResult> list4 = list;
        boolean z2 = false;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list4.iterator();
            int i6 = getSmallIconId + 51;
            notifyNotificationWithChannel = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
            while (it.hasNext()) {
                if (onExtraCallback(((onExtraCallbackWithResult) it.next()).onExtraCallback()) && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        List<onExtraCallbackWithResult> list5 = list2;
        if ((list5 instanceof Collection) && list5.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<T> it2 = list5.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                int i8 = notifyNotificationWithChannel + 99;
                getSmallIconId = i8 % 128;
                if (i8 % 2 == 0) {
                    onExtraCallback(((onExtraCallbackWithResult) it2.next()).onExtraCallback());
                    obj.hashCode();
                    throw null;
                }
                if (onExtraCallback(((onExtraCallbackWithResult) it2.next()).onExtraCallback()) && (i2 = i2 + 1) < 0) {
                    int i9 = getSmallIconId + 69;
                    notifyNotificationWithChannel = i9 % 128;
                    int i10 = i9 % 2;
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        List<? extends IAuthTabCallbackStub> list6 = list3;
        boolean z3 = list6 instanceof Collection;
        if (z3 && list6.isEmpty()) {
            i3 = 0;
        } else {
            Iterator<T> it3 = list6.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                if (((IAuthTabCallbackStub) it3.next()) instanceof IAuthTabCallbackStub.onExtraCallback) {
                    int i11 = notifyNotificationWithChannel + 103;
                    getSmallIconId = i11 % 128;
                    if (i11 % 2 == 0) {
                        i3++;
                        if (i3 < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    } else {
                        i3++;
                        if (i3 < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
            }
        }
        boolean z4 = i3 != 0;
        if ((!z3) || !list6.isEmpty()) {
            Iterator<T> it4 = list6.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                if ((((IAuthTabCallbackStub) it4.next()) instanceof IAuthTabCallbackStub.onExtraCallbackWithResult) && (i4 = i4 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            int i12 = notifyNotificationWithChannel + 73;
            getSmallIconId = i12 % 128;
            int i13 = i12 % 2;
            z2 = true;
        }
        if (z) {
            int i14 = notifyNotificationWithChannel + 123;
            getSmallIconId = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
            if (i == i2) {
                iIAuthTabCallbackStub2 = access000Var.IAuthTabCallbackStub();
                iIAuthTabCallbackStub = iIAuthTabCallbackStub2 * (i - 1);
            } else {
                iIAuthTabCallbackStub = access000Var.IAuthTabCallbackStub() * (size - 1);
            }
        } else if (i == i2) {
            iIAuthTabCallbackStub2 = access000Var.IAuthTabCallbackStub();
            iIAuthTabCallbackStub = iIAuthTabCallbackStub2 * (i - 1);
        } else if (!(!z2)) {
            int i15 = notifyNotificationWithChannel + 121;
            int i16 = i15 % 128;
            getSmallIconId = i16;
            int i17 = i15 % 2;
            if (access000Var instanceof access000.onExtraCallbackWithResult) {
                int i18 = i16 + 13;
                notifyNotificationWithChannel = i18 % 128;
                iIAuthTabCallbackStub = i18 % 2 != 0 ? ((access000.onExtraCallbackWithResult) access000Var).onWarmupCompleted() << 107 : ((access000.onExtraCallbackWithResult) access000Var).onWarmupCompleted() * 20;
            } else {
                iIAuthTabCallbackStub = (i4 * 10) + 50;
            }
        } else {
            iIAuthTabCallbackStub = access000Var.IAuthTabCallbackStub() * (size2 - 1);
        }
        if (z) {
            if (z4) {
                int i19 = getSmallIconId + 125;
                notifyNotificationWithChannel = i19 % 128;
                int i20 = i19 % 2;
                pairOnExtraCallback = access000Var.onNavigationEvent(i3);
            } else {
                pairOnExtraCallback = access000Var.onExtraCallback();
            }
        } else if (!(!z2)) {
            int i21 = notifyNotificationWithChannel + 109;
            getSmallIconId = i21 % 128;
            int i22 = i21 % 2;
            pairOnExtraCallback = access000Var.IAuthTabCallback(i4);
        } else {
            pairOnExtraCallback = access000Var.onExtraCallback();
        }
        return new IAuthTabCallback(iIAuthTabCallbackStub, this.onActivityLayout, this.areNotificationsEnabled, pairOnExtraCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01ba A[PHI: r13
      0x01ba: PHI (r13v19 int) = (r13v18 int), (r13v20 int) binds: [B:102:0x01b8, B:99:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023b A[PHI: r13
      0x023b: PHI (r13v10 int) = (r13v11 int), (r13v11 int), (r13v11 int), (r13v11 int), (r13v19 int) binds: [B:124:0x0204, B:119:0x01eb, B:115:0x01dd, B:110:0x01c9, B:103:0x01ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        Object next;
        Object next2;
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        onExtraCallbackWithResult onextracallbackwithresult;
        int i4;
        Object next3;
        int i5;
        int iOnWarmupCompleted;
        Pair<Interpolator, Integer> pairIAuthTabCallback;
        float fOnWarmupCompleted;
        int i6;
        int iIAuthTabCallbackStub;
        TdsRollingNumberV1View tdsRollingNumberV1View = (TdsRollingNumberV1View) objArr[0];
        List list = (List) objArr[1];
        List list2 = (List) objArr[2];
        List list3 = (List) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        access000 access000Var = (access000) objArr[5];
        int i7 = 2 % 2;
        List list4 = list;
        Iterator it = list4.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((onExtraCallbackWithResult) next).onExtraCallback() == '-') {
                break;
            }
        }
        onExtraCallbackWithResult onextracallbackwithresult2 = (onExtraCallbackWithResult) next;
        List list5 = list2;
        Iterator it2 = list5.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((onExtraCallbackWithResult) next2).onExtraCallback() == '-') {
                break;
            }
        }
        onExtraCallbackWithResult onextracallbackwithresult3 = (onExtraCallbackWithResult) next2;
        if (onextracallbackwithresult2 != null) {
            int i8 = getSmallIconId + 109;
            notifyNotificationWithChannel = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (onextracallbackwithresult3 != null) {
            int i10 = getSmallIconId + 49;
            notifyNotificationWithChannel = i10 % 128;
            int i11 = i10 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zIsBlank = StringsKt.isBlank(tdsRollingNumberV1View.warmup);
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            i = 0;
        } else {
            Iterator it3 = list4.iterator();
            i = 0;
            while (it3.hasNext()) {
                if (tdsRollingNumberV1View.onExtraCallback(((onExtraCallbackWithResult) it3.next()).onExtraCallback()) && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        boolean z3 = list5 instanceof Collection;
        if (z3 && list5.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it4 = list5.iterator();
            i2 = 0;
            while (it4.hasNext()) {
                if (tdsRollingNumberV1View.onExtraCallback(((onExtraCallbackWithResult) it4.next()).onExtraCallback())) {
                    int i12 = getSmallIconId + 75;
                    notifyNotificationWithChannel = i12 % 128;
                    int i13 = i12 % 2;
                    i2++;
                    if (i2 < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
        }
        List list6 = list3;
        boolean z4 = list6 instanceof Collection;
        if (!z4 || !list6.isEmpty()) {
            Iterator it5 = list6.iterator();
            i3 = 0;
            while (true) {
                onextracallbackwithresult = onextracallbackwithresult3;
                if (!it5.hasNext()) {
                    break;
                }
                if ((((IAuthTabCallbackStub) it5.next()) instanceof IAuthTabCallbackStub.onExtraCallback) && (i3 = i3 + 1) < 0) {
                    int i14 = notifyNotificationWithChannel + 71;
                    getSmallIconId = i14 % 128;
                    int i15 = i14 % 2;
                    CollectionsKt.throwCountOverflow();
                }
                onextracallbackwithresult3 = onextracallbackwithresult;
            }
        } else {
            onextracallbackwithresult = onextracallbackwithresult3;
            i3 = 0;
        }
        if (z4) {
            int i16 = notifyNotificationWithChannel + 25;
            getSmallIconId = i16 % 128;
            int i17 = i16 % 2;
            if (list6.isEmpty()) {
                i4 = 0;
            } else {
                Iterator it6 = list6.iterator();
                i4 = 0;
                while (it6.hasNext()) {
                    if ((((IAuthTabCallbackStub) it6.next()) instanceof IAuthTabCallbackStub.onExtraCallbackWithResult) && (i4 = i4 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
        }
        boolean z5 = i4 != 0;
        Iterator it7 = list6.iterator();
        while (true) {
            if (!it7.hasNext()) {
                next3 = null;
                break;
            }
            int i18 = getSmallIconId + 125;
            notifyNotificationWithChannel = i18 % 128;
            int i19 = i18 % 2;
            next3 = it7.next();
            IAuthTabCallbackStub iAuthTabCallbackStub = (IAuthTabCallbackStub) next3;
            Iterator it8 = it7;
            if ((iAuthTabCallbackStub instanceof IAuthTabCallbackStub.onExtraCallback) || (iAuthTabCallbackStub instanceof IAuthTabCallbackStub.onExtraCallbackWithResult)) {
                break;
            }
            it7 = it8;
        }
        boolean z6 = next3 == null;
        if (z) {
            int i20 = getSmallIconId + 123;
            notifyNotificationWithChannel = i20 % 128;
            if (i20 % 2 != 0) {
                i5 = 0;
                int i21 = 94 / 0;
                if (!z2) {
                    if (z5) {
                        iOnWarmupCompleted = i5;
                    }
                }
            } else {
                i5 = 0;
                if (!z2) {
                }
            }
            if (!zBooleanValue) {
                pairIAuthTabCallback = i3 != 0 ? access000Var.onNavigationEvent(i3) : access000Var.onExtraCallback();
            } else if (z5) {
                int i22 = getSmallIconId + 59;
                notifyNotificationWithChannel = i22 % 128;
                int i23 = i22 % 2;
                pairIAuthTabCallback = access000Var.IAuthTabCallback(i4);
            }
            if (onextracallbackwithresult2 == null && onextracallbackwithresult != null) {
                return new onTransact.onExtraCallback(iOnWarmupCompleted, onextracallbackwithresult2.onWarmupCompleted(), tdsRollingNumberV1View.onPostMessage() ? onextracallbackwithresult.onWarmupCompleted() : 0.0f, pairIAuthTabCallback);
            }
            if (onextracallbackwithresult2 == null) {
                int i24 = getSmallIconId + 125;
                notifyNotificationWithChannel = i24 % 128;
                int i25 = i24 % 2;
                if (onextracallbackwithresult != null) {
                    if (tdsRollingNumberV1View.onPostMessage()) {
                        fOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted() + (!zIsBlank ? tdsRollingNumberV1View.ITrustedWebActivityCallback - tdsRollingNumberV1View.readTypedObject : 0.0f);
                    } else {
                        fOnWarmupCompleted = 0.0f;
                    }
                    return new onTransact.onWarmupCompleted(iOnWarmupCompleted, fOnWarmupCompleted, tdsRollingNumberV1View.onPostMessage() ? onextracallbackwithresult.onWarmupCompleted() : 0.0f, pairIAuthTabCallback);
                }
            }
            if (onextracallbackwithresult2 == null) {
                return new onTransact.onNavigationEvent(iOnWarmupCompleted, onextracallbackwithresult2.onWarmupCompleted(), onextracallbackwithresult2.onWarmupCompleted(), pairIAuthTabCallback);
            }
            return null;
        }
        i5 = 0;
        if (z2 && !z && zIsBlank) {
            if (tdsRollingNumberV1View.onPostMessage()) {
                iOnWarmupCompleted = access000Var.IAuthTabCallbackStub() * (i2 - 1);
            }
        } else if (z6) {
            if (tdsRollingNumberV1View.onPostMessage()) {
                i6 = i - 1;
                iIAuthTabCallbackStub = access000Var.IAuthTabCallbackStub();
                iOnWarmupCompleted = iIAuthTabCallbackStub * i6;
            }
            iOnWarmupCompleted = i5;
        } else {
            if (zBooleanValue) {
                if (tdsRollingNumberV1View.onPostMessage()) {
                    i6 = i - 1;
                    iIAuthTabCallbackStub = access000Var.IAuthTabCallbackStub();
                    int i26 = getSmallIconId + 87;
                    notifyNotificationWithChannel = i26 % 128;
                    int i27 = i26 % 2;
                    iOnWarmupCompleted = iIAuthTabCallbackStub * i6;
                }
            } else if (z5) {
                iOnWarmupCompleted = access000Var instanceof access000.onExtraCallbackWithResult ? ((access000.onExtraCallbackWithResult) access000Var).onWarmupCompleted() * 20 : (i4 * 10) + 50;
            } else if (tdsRollingNumberV1View.onPostMessage()) {
                if (!z3 || !list5.isEmpty()) {
                    Iterator it9 = list5.iterator();
                    while (it9.hasNext()) {
                        if (((onExtraCallbackWithResult) it9.next()).onExtraCallback() != '-' && (i5 = i5 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                iOnWarmupCompleted = (i5 - 1) * access000Var.IAuthTabCallbackStub();
            }
            iOnWarmupCompleted = i5;
        }
        if (!zBooleanValue) {
        }
        if (onextracallbackwithresult2 == null) {
        }
        if (onextracallbackwithresult2 == null) {
        }
        if (onextracallbackwithresult2 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01e2, code lost:
    
        if (r10 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01e5, code lost:
    
        if (r10 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01e7, code lost:
    
        r5 = r7.onWarmupCompleted();
        r6 = r10.onWarmupCompleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01ef, code lost:
    
        if (r0 != r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01f1, code lost:
    
        r0 = r20.onExtraCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01f6, code lost:
    
        if (r0 >= r1) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01f8, code lost:
    
        r0 = im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.notifyNotificationWithChannel + 31;
        im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.getSmallIconId = r0 % 128;
        r0 = r0 % 2;
        r0 = r20.onNavigationEvent(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0206, code lost:
    
        r0 = r20.IAuthTabCallback(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x020f, code lost:
    
        return new im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.asInterface.onWarmupCompleted(r4, r5, r6, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final asInterface onExtraCallbackWithResult(List<onExtraCallbackWithResult> list, List<onExtraCallbackWithResult> list2, List<? extends IAuthTabCallbackStub> list3, access000 access000Var) {
        List<onExtraCallbackWithResult> list4;
        Iterator it;
        Object obj;
        Object next;
        int iOnExtraCallbackWithResult;
        Object next2;
        int iIndexOf;
        int i;
        int i2;
        int iIAuthTabCallbackStub;
        int i3;
        int iOnExtraCallbackWithResult2;
        int iIAuthTabCallbackStub2;
        int i4 = 2 % 2;
        int i5 = getSmallIconId + 113;
        notifyNotificationWithChannel = i5 % 128;
        if (i5 % 2 != 0) {
            list4 = list;
            it = list4.iterator();
            int i6 = 90 / 0;
        } else {
            list4 = list;
            it = list4.iterator();
        }
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((onExtraCallbackWithResult) next).onExtraCallback() == '.') {
                break;
            }
        }
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) next;
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((onExtraCallbackWithResult) next2).onExtraCallback() == '.') {
                break;
            }
        }
        onExtraCallbackWithResult onextracallbackwithresult2 = (onExtraCallbackWithResult) next2;
        if (onextracallbackwithresult == null && onextracallbackwithresult2 == null) {
            return null;
        }
        int iIndexOf2 = onextracallbackwithresult != null ? list.indexOf(onextracallbackwithresult) : -1;
        if (onextracallbackwithresult2 != null) {
            int i7 = notifyNotificationWithChannel + 111;
            getSmallIconId = i7 % 128;
            int i8 = i7 % 2;
            iIndexOf = list2.indexOf(onextracallbackwithresult2);
        } else {
            iIndexOf = -1;
        }
        List<? extends IAuthTabCallbackStub> list5 = list3;
        boolean z = list5 instanceof Collection;
        if (z) {
            int i9 = notifyNotificationWithChannel + 99;
            getSmallIconId = i9 % 128;
            if (i9 % 2 == 0) {
                list5.isEmpty();
                throw null;
            }
            if (list5.isEmpty()) {
                i = 0;
            } else {
                Iterator<T> it3 = list5.iterator();
                i = 0;
                while (it3.hasNext()) {
                    if ((((IAuthTabCallbackStub) it3.next()) instanceof IAuthTabCallbackStub.onExtraCallback) && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
        }
        if (z && list5.isEmpty()) {
            int i10 = notifyNotificationWithChannel + 9;
            getSmallIconId = i10 % 128;
            int i11 = i10 % 2;
            i2 = 0;
        } else {
            Iterator<T> it4 = list5.iterator();
            i2 = 0;
            while (it4.hasNext()) {
                if ((((IAuthTabCallbackStub) it4.next()) instanceof IAuthTabCallbackStub.onExtraCallbackWithResult) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        boolean z2 = i2 != 0;
        if (onextracallbackwithresult != null && onextracallbackwithresult2 == null) {
            int i12 = notifyNotificationWithChannel + 77;
            getSmallIconId = i12 % 128;
            int i13 = i12 % 2;
            if (!z2) {
                iOnExtraCallbackWithResult2 = onPostMessage() ? onextracallbackwithresult.onExtraCallbackWithResult() - 1 : onextracallbackwithresult.onExtraCallbackWithResult();
                iIAuthTabCallbackStub2 = access000Var.IAuthTabCallbackStub();
                i3 = iOnExtraCallbackWithResult2 * iIAuthTabCallbackStub2;
            }
            i3 = 0;
        } else if (onextracallbackwithresult != null || onextracallbackwithresult2 == null) {
            if (iIndexOf2 < iIndexOf) {
                if (!onPostMessage()) {
                    if ((list4 instanceof Collection) && list4.isEmpty()) {
                        int i14 = getSmallIconId + 65;
                        notifyNotificationWithChannel = i14 % 128;
                        if (i14 % 2 == 0) {
                            iOnExtraCallbackWithResult = 0;
                        }
                        iIAuthTabCallbackStub = access000Var.IAuthTabCallbackStub();
                    } else {
                        Iterator<T> it5 = list4.iterator();
                        iOnExtraCallbackWithResult = 0;
                        while (it5.hasNext()) {
                            if (onExtraCallback(((onExtraCallbackWithResult) it5.next()).onExtraCallback()) && (iOnExtraCallbackWithResult = iOnExtraCallbackWithResult + 1) < 0) {
                                int i15 = getSmallIconId + 89;
                                notifyNotificationWithChannel = i15 % 128;
                                if (i15 % 2 != 0) {
                                    CollectionsKt.throwCountOverflow();
                                    throw null;
                                }
                                CollectionsKt.throwCountOverflow();
                            }
                        }
                    }
                    iIAuthTabCallbackStub = access000Var.IAuthTabCallbackStub();
                }
                i3 = 0;
            } else {
                if (!onPostMessage()) {
                    iOnExtraCallbackWithResult = onextracallbackwithresult2 != null ? onextracallbackwithresult2.onExtraCallbackWithResult() : 0;
                } else {
                    iOnExtraCallbackWithResult = (onextracallbackwithresult2 != null ? onextracallbackwithresult2.onExtraCallbackWithResult() : 1) - 1;
                }
                iIAuthTabCallbackStub = access000Var.IAuthTabCallbackStub();
            }
            i3 = iIAuthTabCallbackStub * iOnExtraCallbackWithResult;
        } else {
            int i16 = notifyNotificationWithChannel + 115;
            getSmallIconId = i16 % 128;
            if (i16 % 2 == 0) {
                onPostMessage();
                obj.hashCode();
                throw null;
            }
            iOnExtraCallbackWithResult2 = onPostMessage() ? onextracallbackwithresult2.onExtraCallbackWithResult() - 1 : onextracallbackwithresult2.onExtraCallbackWithResult() + 1;
            iIAuthTabCallbackStub2 = access000Var.IAuthTabCallbackStub();
            i3 = iOnExtraCallbackWithResult2 * iIAuthTabCallbackStub2;
        }
        if (onextracallbackwithresult != null) {
            int i17 = getSmallIconId + 9;
            notifyNotificationWithChannel = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 94 / 0;
            }
        }
        if (onextracallbackwithresult == null && onextracallbackwithresult2 != null) {
            return new asInterface.onExtraCallbackWithResult(i3, onextracallbackwithresult2.onWarmupCompleted(), access000Var.IAuthTabCallbackDefault());
        }
        if (onextracallbackwithresult == null || onextracallbackwithresult2 != null) {
            return null;
        }
        return new asInterface.IAuthTabCallback(i3, onextracallbackwithresult.onWarmupCompleted(), access000Var.onNavigationEvent());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<onWarmupCompleted> IAuthTabCallback(List<onExtraCallbackWithResult> list, List<onExtraCallbackWithResult> list2, List<onExtraCallbackWithResult> list3, List<? extends IAuthTabCallbackStub> list4, access000 access000Var) {
        boolean z;
        IntIterator it;
        int iOnExtraCallbackWithResult;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int iMax = Math.max(list2.size(), list3.size());
        if (Math.min(list2.size(), list3.size()) <= 0 && iMax <= 0) {
            return CollectionsKt.emptyList();
        }
        List<? extends IAuthTabCallbackStub> list5 = list4;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator<T> it2 = list5.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                int i3 = getSmallIconId + 103;
                notifyNotificationWithChannel = i3 % 128;
                int i4 = i3 % 2;
                if ((((IAuthTabCallbackStub) it2.next()) instanceof IAuthTabCallbackStub.onExtraCallbackWithResult) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
            if (i2 != 0) {
                z = true;
            }
            it = RangesKt.until(0, iMax).iterator();
            while (it.hasNext()) {
                int i5 = notifyNotificationWithChannel + 75;
                getSmallIconId = i5 % 128;
                int i6 = i5 % 2;
                int iNextInt = it.nextInt();
                if (list2.size() <= iNextInt) {
                    arrayList.add(new onWarmupCompleted.onNavigationEvent(access000Var.IAuthTabCallbackStub() * list3.get(iNextInt).onExtraCallbackWithResult(), list3.get(iNextInt).onWarmupCompleted()));
                } else if (list3.size() <= iNextInt) {
                    arrayList.add(new onWarmupCompleted.onExtraCallback(z ? 0 : access000Var.IAuthTabCallback() * (CollectionsKt.getLastIndex(list) - list2.get(iNextInt).onExtraCallbackWithResult()), list2.get(iNextInt).onWarmupCompleted()));
                } else {
                    if (onPostMessage() && z) {
                        int i7 = notifyNotificationWithChannel + 19;
                        getSmallIconId = i7 % 128;
                        int i8 = i7 % 2;
                        iOnExtraCallbackWithResult = list3.get(iNextInt).onExtraCallbackWithResult() - 1;
                    } else {
                        iOnExtraCallbackWithResult = list2.get(iNextInt).onExtraCallbackWithResult();
                    }
                    arrayList.add(new onWarmupCompleted.onExtraCallbackWithResult(iOnExtraCallbackWithResult * access000Var.IAuthTabCallbackStub(), list2.get(iNextInt).onWarmupCompleted(), list3.get(iNextInt).onWarmupCompleted()));
                }
            }
            return arrayList;
        }
        int i9 = getSmallIconId + 95;
        notifyNotificationWithChannel = i9 % 128;
        int i10 = i9 % 2;
        z = false;
        it = RangesKt.until(0, iMax).iterator();
        while (it.hasNext()) {
        }
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        int lastIndex;
        int lastIndex2;
        int iIAuthTabCallback;
        access000 access000Var;
        ArrayList arrayList;
        List<String> listListOf;
        int i;
        List list;
        List listReversed;
        List listMutableListOf;
        int i2 = 0;
        TdsRollingNumberV1View tdsRollingNumberV1View = (TdsRollingNumberV1View) objArr[0];
        int i3 = 1;
        List list2 = (List) objArr[1];
        int i4 = 2;
        List list3 = (List) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        access000 access000Var2 = (access000) objArr[5];
        int i5 = 2 % 2;
        ArrayList arrayList2 = new ArrayList();
        int iMax = Math.max(list2.size(), list3.size());
        if (Math.min(list2.size(), list3.size()) <= 0 && iMax <= 0) {
            int i6 = getSmallIconId + 113;
            notifyNotificationWithChannel = i6 % 128;
            int i7 = i6 % 2;
            return CollectionsKt.emptyList();
        }
        IntIterator it = RangesKt.until(0, iMax).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            if (list2.size() <= iNextInt) {
                int iOnExtraCallbackWithResult = ((onExtraCallbackWithResult) list3.get(iNextInt)).onExtraCallbackWithResult();
                int iIAuthTabCallbackStub = access000Var2.IAuthTabCallbackStub();
                int iOnExtraCallbackWithResult2 = ((onExtraCallbackWithResult) list3.get(iNextInt)).onExtraCallbackWithResult();
                int iIAuthTabCallbackStub2 = access000Var2.IAuthTabCallbackStub();
                onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) list3.get(iNextInt);
                char cOnExtraCallback = ((onExtraCallbackWithResult) list3.get(iNextInt)).onExtraCallback();
                char[] cArr = new char[i3];
                cArr[i2] = 18375;
                Object[] objArr2 = new Object[i3];
                a(cArr, 13874 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(new IAuthTabCallbackStub.onExtraCallback(iIAuthTabCallbackStub * iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2 * iIAuthTabCallbackStub2, onextracallbackwithresult, zBooleanValue, tdsRollingNumberV1View.onNavigationEvent(((String) objArr2[i2]).intern(), String.valueOf(cOnExtraCallback), zBooleanValue, zBooleanValue2, access000Var2)));
                access000Var2 = access000Var2;
                arrayList2 = arrayList3;
            } else {
                ArrayList arrayList4 = arrayList2;
                access000 access000Var3 = access000Var2;
                if (list3.size() <= iNextInt) {
                    if (((tdsRollingNumberV1View.onPostMessage() ? 1 : 0) ^ i3) != 0) {
                        lastIndex = (CollectionsKt.getLastIndex(list2) - ((onExtraCallbackWithResult) list2.get(iNextInt)).onExtraCallbackWithResult()) + i3;
                        int i8 = notifyNotificationWithChannel + 99;
                        getSmallIconId = i8 % 128;
                        int i9 = i8 % i4;
                    } else {
                        lastIndex = CollectionsKt.getLastIndex(list2) - ((onExtraCallbackWithResult) list2.get(iNextInt)).onExtraCallbackWithResult();
                    }
                    int iIAuthTabCallback2 = lastIndex * access000Var3.IAuthTabCallback();
                    if (tdsRollingNumberV1View.onPostMessage()) {
                        lastIndex2 = CollectionsKt.getLastIndex(list2) - ((onExtraCallbackWithResult) list2.get(iNextInt)).onExtraCallbackWithResult();
                        iIAuthTabCallback = access000Var3.IAuthTabCallback();
                    } else {
                        lastIndex2 = (CollectionsKt.getLastIndex(list2) - ((onExtraCallbackWithResult) list2.get(iNextInt)).onExtraCallbackWithResult()) + i3;
                        iIAuthTabCallback = access000Var3.IAuthTabCallback();
                    }
                    int i10 = lastIndex2 * iIAuthTabCallback;
                    int i11 = notifyNotificationWithChannel + 57;
                    getSmallIconId = i11 % 128;
                    if (i11 % i4 == 0) {
                        boolean z = access000Var3 instanceof access000.onExtraCallback;
                        throw null;
                    }
                    onExtraCallbackWithResult onextracallbackwithresult2 = (onExtraCallbackWithResult) list2.get(iNextInt);
                    if (!(access000Var3 instanceof access000.onExtraCallback) || zBooleanValue2) {
                        String strValueOf = String.valueOf(((onExtraCallbackWithResult) list2.get(iNextInt)).onExtraCallback());
                        char[] cArr2 = new char[i3];
                        cArr2[i2] = 18375;
                        Object[] objArr3 = new Object[i3];
                        a(cArr2, KeyEvent.getDeadChar(i2, i2) + 13873, objArr3);
                        String strIntern = ((String) objArr3[i2]).intern();
                        access000Var = access000Var3;
                        arrayList = arrayList4;
                        List<String> listOnNavigationEvent = tdsRollingNumberV1View.onNavigationEvent(strValueOf, strIntern, zBooleanValue, zBooleanValue2, access000Var);
                        int i12 = notifyNotificationWithChannel + 61;
                        getSmallIconId = i12 % 128;
                        int i13 = i12 % i4;
                        listListOf = listOnNavigationEvent;
                    } else {
                        listListOf = CollectionsKt.listOf(new String[]{String.valueOf(((onExtraCallbackWithResult) list2.get(iNextInt)).onExtraCallback()), ""});
                        access000Var = access000Var3;
                        arrayList = arrayList4;
                    }
                    arrayList.add(new IAuthTabCallbackStub.onExtraCallbackWithResult(iIAuthTabCallback2, i10, onextracallbackwithresult2, zBooleanValue, listListOf));
                    arrayList2 = arrayList;
                    access000Var2 = access000Var;
                    i2 = 0;
                } else {
                    if (Character.isDigit(((onExtraCallbackWithResult) list2.get(iNextInt)).onExtraCallback()) || Character.isDigit(((onExtraCallbackWithResult) list3.get(iNextInt)).onExtraCallback())) {
                        i = i3;
                        if (zBooleanValue2 || ((onExtraCallbackWithResult) list2.get(iNextInt)).onExtraCallback() != ((onExtraCallbackWithResult) list3.get(iNextInt)).onExtraCallback()) {
                            int iOnExtraCallbackWithResult3 = ((onExtraCallbackWithResult) list2.get(iNextInt)).onExtraCallbackWithResult();
                            int iIAuthTabCallbackStub3 = access000Var3.IAuthTabCallbackStub();
                            arrayList4.add(new IAuthTabCallbackStub.onNavigationEvent(iOnExtraCallbackWithResult3 * iIAuthTabCallbackStub3, access000Var3.IAuthTabCallbackStub() * (list2.size() < list3.size() ? ((onExtraCallbackWithResult) list3.get(iNextInt)).onExtraCallbackWithResult() : ((onExtraCallbackWithResult) list2.get(iNextInt)).onExtraCallbackWithResult()), (onExtraCallbackWithResult) list2.get(iNextInt), (onExtraCallbackWithResult) list3.get(iNextInt), zBooleanValue, tdsRollingNumberV1View.onNavigationEvent(String.valueOf(((onExtraCallbackWithResult) list2.get(iNextInt)).onExtraCallback()), String.valueOf(((onExtraCallbackWithResult) list3.get(iNextInt)).onExtraCallback()), zBooleanValue, zBooleanValue2, access000Var3)));
                            arrayList2 = arrayList4;
                            i3 = i;
                            access000Var2 = access000Var3;
                            i2 = 0;
                            i4 = 2;
                        } else {
                            arrayList4.add(new IAuthTabCallbackStub.onWarmupCompleted(((onExtraCallbackWithResult) list2.get(iNextInt)).onExtraCallbackWithResult() * access000Var3.IAuthTabCallbackStub(), (onExtraCallbackWithResult) list2.get(iNextInt), (onExtraCallbackWithResult) list3.get(iNextInt)));
                        }
                    } else {
                        int iOnExtraCallbackWithResult4 = ((onExtraCallbackWithResult) list2.get(iNextInt)).onExtraCallbackWithResult();
                        int iIAuthTabCallbackStub4 = access000Var3.IAuthTabCallbackStub();
                        int iOnExtraCallbackWithResult5 = list2.size() < list3.size() ? ((onExtraCallbackWithResult) list3.get(iNextInt)).onExtraCallbackWithResult() : ((onExtraCallbackWithResult) list2.get(iNextInt)).onExtraCallbackWithResult();
                        int iIAuthTabCallbackStub5 = access000Var3.IAuthTabCallbackStub();
                        onExtraCallbackWithResult onextracallbackwithresult3 = (onExtraCallbackWithResult) list2.get(iNextInt);
                        onExtraCallbackWithResult onextracallbackwithresult4 = (onExtraCallbackWithResult) list3.get(iNextInt);
                        if (access000Var3 instanceof access000.onExtraCallback) {
                            listMutableListOf = CollectionsKt.listOf(new String[]{String.valueOf(((onExtraCallbackWithResult) list2.get(iNextInt)).onExtraCallback()), String.valueOf(((onExtraCallbackWithResult) list3.get(iNextInt)).onExtraCallback())});
                        } else if (access000Var3 instanceof access000.IAuthTabCallback) {
                            listMutableListOf = CollectionsKt.mutableListOf(new String[]{String.valueOf(((onExtraCallbackWithResult) list2.get(iNextInt)).onExtraCallback()), String.valueOf(((onExtraCallbackWithResult) list3.get(iNextInt)).onExtraCallback())});
                            listMutableListOf.addAll(i3, zBooleanValue ? ArraysKt.toList(tdsRollingNumberV1View.prefetchWithMultipleUrls) : ArraysKt.reversed(tdsRollingNumberV1View.prefetchWithMultipleUrls));
                            Unit unit = Unit.INSTANCE;
                        } else {
                            if (!(access000Var3 instanceof access000.onExtraCallbackWithResult)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List listMutableListOf2 = CollectionsKt.mutableListOf(new String[]{String.valueOf(((onExtraCallbackWithResult) list2.get(iNextInt)).onExtraCallback()), String.valueOf(((onExtraCallbackWithResult) list3.get(iNextInt)).onExtraCallback())});
                            int iOnWarmupCompleted = ((access000.onExtraCallbackWithResult) access000Var3).onWarmupCompleted();
                            int i14 = 0;
                            while (i14 < iOnWarmupCompleted) {
                                if (zBooleanValue) {
                                    int i15 = getSmallIconId + 111;
                                    notifyNotificationWithChannel = i15 % 128;
                                    if (i15 % i4 != 0) {
                                        ArraysKt.toList(tdsRollingNumberV1View.prefetchWithMultipleUrls);
                                        Object obj = null;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    listReversed = ArraysKt.toList(tdsRollingNumberV1View.prefetchWithMultipleUrls);
                                } else {
                                    listReversed = ArraysKt.reversed(tdsRollingNumberV1View.prefetchWithMultipleUrls);
                                }
                                listMutableListOf2.addAll(1, listReversed);
                                i14++;
                                i3 = 1;
                                i4 = 2;
                            }
                            i = i3;
                            Unit unit2 = Unit.INSTANCE;
                            list = listMutableListOf2;
                            arrayList4.add(new IAuthTabCallbackStub.onNavigationEvent(iOnExtraCallbackWithResult4 * iIAuthTabCallbackStub4, iOnExtraCallbackWithResult5 * iIAuthTabCallbackStub5, onextracallbackwithresult3, onextracallbackwithresult4, zBooleanValue, list));
                        }
                        list = listMutableListOf;
                        i = i3;
                        arrayList4.add(new IAuthTabCallbackStub.onNavigationEvent(iOnExtraCallbackWithResult4 * iIAuthTabCallbackStub4, iOnExtraCallbackWithResult5 * iIAuthTabCallbackStub5, onextracallbackwithresult3, onextracallbackwithresult4, zBooleanValue, list));
                    }
                    arrayList2 = arrayList4;
                    access000Var2 = access000Var3;
                    i3 = i;
                    i2 = 0;
                    i4 = 2;
                }
            }
        }
        return arrayList2;
    }

    private final List<String> onNavigationEvent(String str, String str2, boolean z, boolean z2, access000 access000Var) {
        Pair pairIAuthTabCallback;
        int iOnWarmupCompleted;
        int i = 2 % 2;
        boolean z3 = access000Var instanceof access000.onExtraCallback;
        if (z3) {
            int i2 = notifyNotificationWithChannel + 55;
            getSmallIconId = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!z2) {
                return CollectionsKt.listOf(new String[]{str, str2});
            }
        }
        if (TextUtils.isDigitsOnly(str) && TextUtils.isDigitsOnly(str2)) {
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Integer.valueOf(Integer.parseInt(str)), Integer.valueOf(Integer.parseInt(str2)));
        } else if (TextUtils.isDigitsOnly(str)) {
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Integer.valueOf(Integer.parseInt(str)), Integer.valueOf(Integer.parseInt(str)));
            int i3 = getSmallIconId + 105;
            notifyNotificationWithChannel = i3 % 128;
            int i4 = i3 % 2;
        } else if (TextUtils.isDigitsOnly(str2)) {
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Integer.valueOf(Integer.parseInt(str2)), Integer.valueOf(Integer.parseInt(str2)));
        } else if (z) {
            int i5 = getSmallIconId + 15;
            notifyNotificationWithChannel = i5 % 128;
            int i6 = i5 % 2;
            pairIAuthTabCallback = getWrite.IAuthTabCallback(9, 0);
        } else {
            pairIAuthTabCallback = getWrite.IAuthTabCallback(0, 9);
        }
        int iIntValue = ((Number) pairIAuthTabCallback.onExtraCallbackWithResult()).intValue();
        int iIntValue2 = ((Number) pairIAuthTabCallback.IAuthTabCallback()).intValue();
        if (z3) {
            int i7 = getSmallIconId + 69;
            notifyNotificationWithChannel = i7 % 128;
            iOnWarmupCompleted = i7 % 2 != 0 ? 0 : 1;
        } else {
            iOnWarmupCompleted = access000Var.onWarmupCompleted();
        }
        List list = ArraysKt.toList(this.prefetchWithMultipleUrls);
        Collections.rotate(list, z ? -iIntValue : -(iIntValue + 1));
        if (!z) {
            list = CollectionsKt.reversed(list);
        }
        List list2 = CollectionsKt.toList(list);
        List listSubList = list.subList(0, list.indexOf(String.valueOf(iIntValue2)) + 1);
        if (iIntValue == iIntValue2) {
            iOnWarmupCompleted++;
            int i8 = notifyNotificationWithChannel + 37;
            getSmallIconId = i8 % 128;
            int i9 = i8 % 2;
        }
        ArrayList arrayList = new ArrayList();
        if (iOnWarmupCompleted > 1) {
            arrayList.addAll(listSubList);
            for (int i10 = 0; i10 < iOnWarmupCompleted - 1; i10++) {
                arrayList.addAll(0, list2);
            }
        } else {
            arrayList.addAll(listSubList);
            int i11 = getSmallIconId + 41;
            notifyNotificationWithChannel = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 3 % 2;
            }
        }
        if (!(!TextUtils.isDigitsOnly(str)) && TextUtils.isDigitsOnly(str2)) {
            return arrayList;
        }
        if (TextUtils.isDigitsOnly(str)) {
            arrayList.add(str2);
            return arrayList;
        }
        if (!TextUtils.isDigitsOnly(str2)) {
            arrayList.add(0, str);
            arrayList.add(str2);
            return arrayList;
        }
        int i13 = getSmallIconId + 29;
        notifyNotificationWithChannel = i13 % 128;
        if (i13 % 2 != 0) {
            arrayList.add(1, str);
            return arrayList;
        }
        arrayList.add(0, str);
        return arrayList;
    }

    private static final Unit onTransact(TdsRollingNumberV1View tdsRollingNumberV1View, IAuthTabCallbackStub iAuthTabCallbackStub, float f) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 23;
        notifyNotificationWithChannel = i2 % 128;
        int i3 = i2 % 2;
        if (onExtraCallback(tdsRollingNumberV1View, null, 1, null)) {
            ((IAuthTabCallbackStub.onWarmupCompleted) iAuthTabCallbackStub).onWarmupCompleted(f);
            tdsRollingNumberV1View.invalidate();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = getSmallIconId + 85;
        notifyNotificationWithChannel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(TdsRollingNumberV1View tdsRollingNumberV1View, IAuthTabCallbackStub iAuthTabCallbackStub, float f) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 15;
        getSmallIconId = i2 % 128;
        if (i2 % 2 != 0 ? onExtraCallback(tdsRollingNumberV1View, null, 1, null) : onExtraCallback(tdsRollingNumberV1View, null, 1, null)) {
            ((IAuthTabCallbackStub.onNavigationEvent) iAuthTabCallbackStub).onExtraCallback(f);
            tdsRollingNumberV1View.invalidate();
            int i3 = getSmallIconId + 53;
            notifyNotificationWithChannel = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(TdsRollingNumberV1View tdsRollingNumberV1View, IAuthTabCallbackStub iAuthTabCallbackStub, float f) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 53;
        getSmallIconId = i2 % 128;
        if (i2 % 2 != 0 ? onExtraCallback(tdsRollingNumberV1View, null, 1, null) : !(!onExtraCallback(tdsRollingNumberV1View, null, 0, null))) {
            ((IAuthTabCallbackStub.onNavigationEvent) iAuthTabCallbackStub).onWarmupCompleted(f);
            tdsRollingNumberV1View.invalidate();
            int i3 = getSmallIconId + 37;
            notifyNotificationWithChannel = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback_Parcel(TdsRollingNumberV1View tdsRollingNumberV1View, IAuthTabCallbackStub iAuthTabCallbackStub, float f) {
        int i = 2 % 2;
        if (onExtraCallback(tdsRollingNumberV1View, null, 1, null)) {
            int i2 = notifyNotificationWithChannel + 3;
            getSmallIconId = i2 % 128;
            int i3 = i2 % 2;
            ((IAuthTabCallbackStub.onExtraCallback) iAuthTabCallbackStub).onWarmupCompleted(f);
            tdsRollingNumberV1View.invalidate();
            int i4 = getSmallIconId + 99;
            notifyNotificationWithChannel = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 3;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i6 = notifyNotificationWithChannel + 57;
        getSmallIconId = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit getInterfaceDescriptor(TdsRollingNumberV1View tdsRollingNumberV1View, IAuthTabCallbackStub iAuthTabCallbackStub, float f) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 5;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 == 0 ? !(!onExtraCallback(tdsRollingNumberV1View, null, 1, null)) : !(!onExtraCallback(tdsRollingNumberV1View, null, 1, null))) {
            ((IAuthTabCallbackStub.onExtraCallback) iAuthTabCallbackStub).onExtraCallback(f);
            tdsRollingNumberV1View.invalidate();
        }
        Unit unit = Unit.INSTANCE;
        int i3 = getSmallIconId + 123;
        notifyNotificationWithChannel = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 63 / 0;
        }
        return unit;
    }

    private static final Unit access000(TdsRollingNumberV1View tdsRollingNumberV1View, IAuthTabCallbackStub iAuthTabCallbackStub, float f) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 109;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 == 0 ? !(!onExtraCallback(tdsRollingNumberV1View, null, 1, null)) : onExtraCallback(tdsRollingNumberV1View, null, 0, null)) {
            ((IAuthTabCallbackStub.onExtraCallbackWithResult) iAuthTabCallbackStub).onWarmupCompleted(f);
            tdsRollingNumberV1View.invalidate();
        }
        Unit unit = Unit.INSTANCE;
        int i3 = notifyNotificationWithChannel + 15;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 93 / 0;
        }
        return unit;
    }

    private static final Unit access100(TdsRollingNumberV1View tdsRollingNumberV1View, IAuthTabCallbackStub iAuthTabCallbackStub, float f) {
        int i = 2 % 2;
        Object obj = null;
        if (onExtraCallback(tdsRollingNumberV1View, null, 1, null)) {
            int i2 = notifyNotificationWithChannel + 19;
            getSmallIconId = i2 % 128;
            if (i2 % 2 != 0) {
                ((IAuthTabCallbackStub.onExtraCallbackWithResult) iAuthTabCallbackStub).onNavigationEvent(f);
                tdsRollingNumberV1View.invalidate();
            } else {
                ((IAuthTabCallbackStub.onExtraCallbackWithResult) iAuthTabCallbackStub).onNavigationEvent(f);
                tdsRollingNumberV1View.invalidate();
                obj.hashCode();
                throw null;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i3 = getSmallIconId + 49;
        notifyNotificationWithChannel = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(TdsRollingNumberV1View tdsRollingNumberV1View, onWarmupCompleted onwarmupcompleted, float f) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 11;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 == 0 ? onExtraCallback(tdsRollingNumberV1View, null, 1, null) : onExtraCallback(tdsRollingNumberV1View, null, 0, null)) {
            ((onWarmupCompleted.onExtraCallbackWithResult) onwarmupcompleted).IAuthTabCallback(f);
            tdsRollingNumberV1View.invalidate();
            int i3 = notifyNotificationWithChannel + 37;
            getSmallIconId = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(TdsRollingNumberV1View tdsRollingNumberV1View, onWarmupCompleted onwarmupcompleted, float f) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 29;
        notifyNotificationWithChannel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (onExtraCallback(tdsRollingNumberV1View, null, 1, null)) {
            int i4 = getSmallIconId + 65;
            notifyNotificationWithChannel = i4 % 128;
            if (i4 % 2 != 0) {
                ((onWarmupCompleted.onNavigationEvent) onwarmupcompleted).onNavigationEvent(f);
                tdsRollingNumberV1View.invalidate();
                obj.hashCode();
                throw null;
            }
            ((onWarmupCompleted.onNavigationEvent) onwarmupcompleted).onNavigationEvent(f);
            tdsRollingNumberV1View.invalidate();
            int i5 = getSmallIconId + 121;
            notifyNotificationWithChannel = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(TdsRollingNumberV1View tdsRollingNumberV1View, onWarmupCompleted onwarmupcompleted, float f) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 119;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        if (onExtraCallback(tdsRollingNumberV1View, null, 1, null)) {
            ((onWarmupCompleted.onExtraCallback) onwarmupcompleted).IAuthTabCallback(f);
            tdsRollingNumberV1View.invalidate();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = notifyNotificationWithChannel + 21;
        getSmallIconId = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(TdsRollingNumberV1View tdsRollingNumberV1View, onTransact ontransact, float f) {
        int i = 2 % 2;
        Object obj = null;
        if (!(!onExtraCallback(tdsRollingNumberV1View, null, 1, null))) {
            int i2 = notifyNotificationWithChannel + 49;
            getSmallIconId = i2 % 128;
            if (i2 % 2 != 0) {
                ((onTransact.onWarmupCompleted) ontransact).onWarmupCompleted(f);
                tdsRollingNumberV1View.invalidate();
            } else {
                ((onTransact.onWarmupCompleted) ontransact).onWarmupCompleted(f);
                tdsRollingNumberV1View.invalidate();
                obj.hashCode();
                throw null;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i3 = notifyNotificationWithChannel + 31;
        getSmallIconId = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit asInterface(TdsRollingNumberV1View tdsRollingNumberV1View, onTransact ontransact, float f) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 43;
        getSmallIconId = i2 % 128;
        if (i2 % 2 != 0 ? onExtraCallback(tdsRollingNumberV1View, null, 1, null) : onExtraCallback(tdsRollingNumberV1View, null, 1, null)) {
            int i3 = getSmallIconId + 77;
            notifyNotificationWithChannel = i3 % 128;
            int i4 = i3 % 2;
            ((onTransact.onNavigationEvent) ontransact).onExtraCallback(f);
            tdsRollingNumberV1View.invalidate();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(TdsRollingNumberV1View tdsRollingNumberV1View, onTransact ontransact, float f) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 17;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 == 0 ? onExtraCallback(tdsRollingNumberV1View, null, 1, null) : onExtraCallback(tdsRollingNumberV1View, null, 0, null)) {
            int i3 = getSmallIconId + 115;
            notifyNotificationWithChannel = i3 % 128;
            if (i3 % 2 == 0) {
                ((onTransact.onExtraCallback) ontransact).onWarmupCompleted(f);
                tdsRollingNumberV1View.invalidate();
            } else {
                ((onTransact.onExtraCallback) ontransact).onWarmupCompleted(f);
                tdsRollingNumberV1View.invalidate();
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        TdsRollingNumberV1View tdsRollingNumberV1View = (TdsRollingNumberV1View) objArr[0];
        onTransact ontransact = (onTransact) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 119;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (onExtraCallback(tdsRollingNumberV1View, null, 1, null)) {
            int i4 = getSmallIconId + 93;
            notifyNotificationWithChannel = i4 % 128;
            if (i4 % 2 != 0) {
                ((onTransact.onWarmupCompleted) ontransact).IAuthTabCallback(fFloatValue);
                tdsRollingNumberV1View.invalidate();
                obj.hashCode();
                throw null;
            }
            ((onTransact.onWarmupCompleted) ontransact).IAuthTabCallback(fFloatValue);
            tdsRollingNumberV1View.invalidate();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        TdsRollingNumberV1View tdsRollingNumberV1View = (TdsRollingNumberV1View) objArr[0];
        asInterface asinterface = (asInterface) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 77;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        if (onExtraCallback(tdsRollingNumberV1View, null, 1, null)) {
            int i4 = getSmallIconId + 47;
            notifyNotificationWithChannel = i4 % 128;
            if (i4 % 2 != 0) {
                ((asInterface.onWarmupCompleted) asinterface).onExtraCallback(fFloatValue);
                tdsRollingNumberV1View.invalidate();
                int i5 = 4 / 0;
            } else {
                ((asInterface.onWarmupCompleted) asinterface).onExtraCallback(fFloatValue);
                tdsRollingNumberV1View.invalidate();
            }
            int i6 = notifyNotificationWithChannel + 41;
            getSmallIconId = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(TdsRollingNumberV1View tdsRollingNumberV1View, asInterface asinterface, float f) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 111;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        if (onExtraCallback(tdsRollingNumberV1View, null, 1, null)) {
            ((asInterface.onExtraCallbackWithResult) asinterface).onExtraCallbackWithResult(f);
            tdsRollingNumberV1View.invalidate();
            int i4 = getSmallIconId + 91;
            notifyNotificationWithChannel = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        TdsRollingNumberV1View tdsRollingNumberV1View = (TdsRollingNumberV1View) objArr[0];
        asInterface asinterface = (asInterface) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 103;
        getSmallIconId = i2 % 128;
        if (i2 % 2 != 0 ? onExtraCallback(tdsRollingNumberV1View, null, 1, null) : onExtraCallback(tdsRollingNumberV1View, null, 1, null)) {
            int i3 = notifyNotificationWithChannel + 75;
            getSmallIconId = i3 % 128;
            if (i3 % 2 == 0) {
                ((asInterface.IAuthTabCallback) asinterface).onWarmupCompleted(fFloatValue);
                tdsRollingNumberV1View.invalidate();
                int i4 = 12 / 0;
            } else {
                ((asInterface.IAuthTabCallback) asinterface).onWarmupCompleted(fFloatValue);
                tdsRollingNumberV1View.invalidate();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(TdsRollingNumberV1View tdsRollingNumberV1View, float f) {
        int i = 2 % 2;
        if (onExtraCallback(tdsRollingNumberV1View, null, 1, null)) {
            int i2 = getSmallIconId + 39;
            notifyNotificationWithChannel = i2 % 128;
            int i3 = i2 % 2;
            tdsRollingNumberV1View.extraCommand = f;
            tdsRollingNumberV1View.invalidate();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = notifyNotificationWithChannel + 9;
        getSmallIconId = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(TdsRollingNumberV1View tdsRollingNumberV1View, float f) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 87;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        if (onExtraCallback(tdsRollingNumberV1View, null, 1, null)) {
            int i4 = getSmallIconId + 33;
            notifyNotificationWithChannel = i4 % 128;
            int i5 = i4 % 2;
            tdsRollingNumberV1View.IPostMessageService = f;
            tdsRollingNumberV1View.invalidate();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(TdsRollingNumberV1View tdsRollingNumberV1View, float f) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 101;
        notifyNotificationWithChannel = i2 % 128;
        int i3 = i2 % 2;
        if (!(!onExtraCallback(tdsRollingNumberV1View, null, 1, null))) {
            int i4 = notifyNotificationWithChannel + 57;
            getSmallIconId = i4 % 128;
            int i5 = i4 % 2;
            tdsRollingNumberV1View.onNavigationEvent = f;
            tdsRollingNumberV1View.invalidate();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:76:0x09a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final runOnUiThreadDelayed onExtraCallbackWithResult(access000 access000Var, int i) throws NoWhenBranchMatchedException {
        AppLovinSdkSettings appLovinSdkSettings;
        int i2;
        AppLovinSdkSettings appLovinSdkSettings2;
        boolean z;
        AppLovinSdkSettings appLovinSdkSettings3;
        AppLovinSdkSettings appLovinSdkSettings4;
        Object objOnWarmupCompleted;
        AppLovinSdkSettings appLovinSdkSettings5;
        final TdsRollingNumberV1View tdsRollingNumberV1View = this;
        int i3 = 2;
        int i4 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i5 = notifyNotificationWithChannel + 37;
        while (true) {
            getSmallIconId = i5 % 128;
            int i6 = i5 % i3;
            for (final IAuthTabCallbackStub iAuthTabCallbackStub : tdsRollingNumberV1View.getInterfaceDescriptor) {
                if (iAuthTabCallbackStub instanceof IAuthTabCallbackStub.onWarmupCompleted) {
                    break;
                }
                if (iAuthTabCallbackStub instanceof IAuthTabCallbackStub.onNavigationEvent) {
                    IAuthTabCallbackStub.onNavigationEvent onnavigationevent = (IAuthTabCallbackStub.onNavigationEvent) iAuthTabCallbackStub;
                    arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback((Interpolator) access000Var.onExtraCallback().getFirst(), ((Number) access000Var.onExtraCallback().getSecond()).intValue()), Float.valueOf(onnavigationevent.onExtraCallbackWithResult().onWarmupCompleted()), Float.valueOf(onnavigationevent.IAuthTabCallback().onWarmupCompleted()), new Function1() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda20
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj) {
                            int i7 = 2 % 2;
                            int i8 = onExtraCallbackWithResult + 23;
                            onNavigationEvent = i8 % 128;
                            int i9 = i8 % 2;
                            Unit unit = (Unit) TdsRollingNumberV1View.onExtraCallbackWithResult(new Object[]{this.f$0, iAuthTabCallbackStub, Float.valueOf(((Float) obj).floatValue())}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -924016718, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 924016744);
                            int i10 = onNavigationEvent + 23;
                            onExtraCallbackWithResult = i10 % 128;
                            int i11 = i10 % 2;
                            return unit;
                        }
                    }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, Integer.valueOf(((Integer) IAuthTabCallbackStub.onNavigationEvent.IAuthTabCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{onnavigationevent}, 1443991819, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1443991819)).intValue()), 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                    float lastIndex = CollectionsKt.getLastIndex(onnavigationevent.onNavigationEvent()) * extraCallbackWithResult();
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback((Interpolator) access000Var.onExtraCallbackWithResult().getFirst(), ((Number) access000Var.onExtraCallbackWithResult().getSecond()).intValue());
                    if (!onnavigationevent.onExtraCallback()) {
                        lastIndex = -lastIndex;
                    }
                    tdsRollingNumberV1View = this;
                    arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{appLovinSdkSettingsOnExtraCallback, Float.valueOf(0.0f), Float.valueOf(lastIndex), new Function1() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda21
                        private static int onExtraCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj) {
                            int i7 = 2 % 2;
                            int i8 = onNavigationEvent + 117;
                            onExtraCallback = i8 % 128;
                            int i9 = i8 % 2;
                            TdsRollingNumberV1View tdsRollingNumberV1View2 = this.f$0;
                            if (i9 == 0) {
                                return TdsRollingNumberV1View.onNavigationEvent(tdsRollingNumberV1View2, iAuthTabCallbackStub, ((Float) obj).floatValue());
                            }
                            TdsRollingNumberV1View.onNavigationEvent(tdsRollingNumberV1View2, iAuthTabCallbackStub, ((Float) obj).floatValue());
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, Integer.valueOf(((Integer) IAuthTabCallbackStub.onNavigationEvent.IAuthTabCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{onnavigationevent}, 945470556, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -945470555)).intValue()), 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                } else if (iAuthTabCallbackStub instanceof IAuthTabCallbackStub.onExtraCallback) {
                    IAuthTabCallbackStub.onExtraCallback onextracallback = (IAuthTabCallbackStub.onExtraCallback) iAuthTabCallbackStub;
                    arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback((Interpolator) access000Var.IAuthTabCallbackDefault().getFirst(), ((Number) access000Var.IAuthTabCallbackDefault().getSecond()).intValue()), Float.valueOf(0.0f), Float.valueOf(1.0f), new Function1() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda22
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj) {
                            int i7 = 2 % 2;
                            int i8 = IAuthTabCallback + 75;
                            onNavigationEvent = i8 % 128;
                            int i9 = i8 % 2;
                            Unit unitIAuthTabCallback = TdsRollingNumberV1View.IAuthTabCallback(this.f$0, iAuthTabCallbackStub, ((Float) obj).floatValue());
                            int i10 = onNavigationEvent + 49;
                            IAuthTabCallback = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i11 = 75 / 0;
                            }
                            return unitIAuthTabCallback;
                        }
                    }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, Integer.valueOf(onextracallback.onExtraCallbackWithResult()), 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                    float lastIndex2 = CollectionsKt.getLastIndex(onextracallback.onWarmupCompleted()) * extraCallbackWithResult();
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback2 = RallysKt.onExtraCallback((Interpolator) access000Var.onExtraCallbackWithResult().getFirst(), ((Number) access000Var.onExtraCallbackWithResult().getSecond()).intValue());
                    if (!onextracallback.IAuthTabCallback()) {
                        lastIndex2 = -lastIndex2;
                    }
                    arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{appLovinSdkSettingsOnExtraCallback2, Float.valueOf(0.0f), Float.valueOf(lastIndex2), new Function1() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda23
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj) {
                            int i7 = 2 % 2;
                            int i8 = onExtraCallbackWithResult + 49;
                            onNavigationEvent = i8 % 128;
                            int i9 = i8 % 2;
                            TdsRollingNumberV1View tdsRollingNumberV1View2 = this.f$0;
                            if (i9 == 0) {
                                return TdsRollingNumberV1View.onExtraCallbackWithResult(tdsRollingNumberV1View2, iAuthTabCallbackStub, ((Float) obj).floatValue());
                            }
                            TdsRollingNumberV1View.onExtraCallbackWithResult(tdsRollingNumberV1View2, iAuthTabCallbackStub, ((Float) obj).floatValue());
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, Integer.valueOf(onextracallback.IAuthTabCallbackStub()), 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                } else {
                    if (!(iAuthTabCallbackStub instanceof IAuthTabCallbackStub.onExtraCallbackWithResult)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IAuthTabCallbackStub.onExtraCallbackWithResult onextracallbackwithresult = (IAuthTabCallbackStub.onExtraCallbackWithResult) iAuthTabCallbackStub;
                    arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback((Interpolator) access000Var.onNavigationEvent().getFirst(), ((Number) access000Var.onNavigationEvent().getSecond()).intValue()), Float.valueOf(1.0f), Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda24
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj) {
                            int i7 = 2 % 2;
                            int i8 = IAuthTabCallback + 37;
                            onNavigationEvent = i8 % 128;
                            if (i8 % 2 == 0) {
                                TdsRollingNumberV1View.asBinder(this.f$0, iAuthTabCallbackStub, ((Float) obj).floatValue());
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            Unit unitAsBinder = TdsRollingNumberV1View.asBinder(this.f$0, iAuthTabCallbackStub, ((Float) obj).floatValue());
                            int i9 = onNavigationEvent + 45;
                            IAuthTabCallback = i9 % 128;
                            int i10 = i9 % 2;
                            return unitAsBinder;
                        }
                    }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, Integer.valueOf(onextracallbackwithresult.onNavigationEvent()), 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                    float lastIndex3 = CollectionsKt.getLastIndex(onextracallbackwithresult.onExtraCallback()) * extraCallbackWithResult();
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback3 = RallysKt.onExtraCallback((Interpolator) access000Var.onExtraCallbackWithResult().getFirst(), ((Number) access000Var.onExtraCallbackWithResult().getSecond()).intValue());
                    if (!onextracallbackwithresult.IAuthTabCallback()) {
                        lastIndex3 = -lastIndex3;
                    }
                    arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{appLovinSdkSettingsOnExtraCallback3, Float.valueOf(0.0f), Float.valueOf(lastIndex3), new Function1() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda25
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj) {
                            int i7 = 2 % 2;
                            int i8 = onWarmupCompleted + 125;
                            onExtraCallbackWithResult = i8 % 128;
                            int i9 = i8 % 2;
                            Unit unitIAuthTabCallbackStub = TdsRollingNumberV1View.IAuthTabCallbackStub(this.f$0, iAuthTabCallbackStub, ((Float) obj).floatValue());
                            int i10 = onWarmupCompleted + 49;
                            onExtraCallbackWithResult = i10 % 128;
                            if (i10 % 2 == 0) {
                                return unitIAuthTabCallbackStub;
                            }
                            throw null;
                        }
                    }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, Integer.valueOf(onextracallbackwithresult.IAuthTabCallbackDefault()), 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                }
                i3 = 2;
            }
            for (final onWarmupCompleted onwarmupcompleted : tdsRollingNumberV1View.onTransact) {
                if (onwarmupcompleted instanceof onWarmupCompleted.onExtraCallbackWithResult) {
                    onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult2 = (onWarmupCompleted.onExtraCallbackWithResult) onwarmupcompleted;
                    arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback((Interpolator) access000Var.onExtraCallback().getFirst(), ((Number) access000Var.onExtraCallback().getSecond()).intValue()), Float.valueOf(onextracallbackwithresult2.onExtraCallback()), Float.valueOf(onextracallbackwithresult2.IAuthTabCallback()), new Function1() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda26
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke(Object obj) {
                            int i7 = 2 % 2;
                            int i8 = IAuthTabCallback + 83;
                            onExtraCallbackWithResult = i8 % 128;
                            if (i8 % 2 != 0) {
                                TdsRollingNumberV1View.onExtraCallback(this.f$0, onwarmupcompleted, ((Float) obj).floatValue());
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            Unit unitOnExtraCallback = TdsRollingNumberV1View.onExtraCallback(this.f$0, onwarmupcompleted, ((Float) obj).floatValue());
                            int i9 = IAuthTabCallback + 31;
                            onExtraCallbackWithResult = i9 % 128;
                            int i10 = i9 % 2;
                            return unitOnExtraCallback;
                        }
                    }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, Integer.valueOf(onextracallbackwithresult2.onWarmupCompleted()), 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                } else if (onwarmupcompleted instanceof onWarmupCompleted.onNavigationEvent) {
                    arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback((Interpolator) access000Var.IAuthTabCallbackDefault().getFirst(), ((Number) access000Var.IAuthTabCallbackDefault().getSecond()).intValue()), Float.valueOf(0.0f), Float.valueOf(1.0f), new Function1() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda27
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj) {
                            Unit unitOnNavigationEvent;
                            int i7 = 2 % 2;
                            int i8 = onExtraCallback + 47;
                            onExtraCallbackWithResult = i8 % 128;
                            if (i8 % 2 == 0) {
                                unitOnNavigationEvent = TdsRollingNumberV1View.onNavigationEvent(this.f$0, onwarmupcompleted, ((Float) obj).floatValue());
                                int i9 = 54 / 0;
                            } else {
                                unitOnNavigationEvent = TdsRollingNumberV1View.onNavigationEvent(this.f$0, onwarmupcompleted, ((Float) obj).floatValue());
                            }
                            int i10 = onExtraCallbackWithResult + 69;
                            onExtraCallback = i10 % 128;
                            if (i10 % 2 == 0) {
                                return unitOnNavigationEvent;
                            }
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, Integer.valueOf(((onWarmupCompleted.onNavigationEvent) onwarmupcompleted).onNavigationEvent()), 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                } else {
                    if (!(onwarmupcompleted instanceof onWarmupCompleted.onExtraCallback)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback((Interpolator) access000Var.onNavigationEvent().getFirst(), ((Number) access000Var.onNavigationEvent().getSecond()).intValue()), Float.valueOf(1.0f), Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda28
                        private static int onNavigationEvent = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj) {
                            int i7 = 2 % 2;
                            int i8 = onWarmupCompleted + 107;
                            onNavigationEvent = i8 % 128;
                            int i9 = i8 % 2;
                            TdsRollingNumberV1View tdsRollingNumberV1View2 = this.f$0;
                            if (i9 == 0) {
                                return TdsRollingNumberV1View.onWarmupCompleted(tdsRollingNumberV1View2, onwarmupcompleted, ((Float) obj).floatValue());
                            }
                            TdsRollingNumberV1View.onWarmupCompleted(tdsRollingNumberV1View2, onwarmupcompleted, ((Float) obj).floatValue());
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, Integer.valueOf(((onWarmupCompleted.onExtraCallback) onwarmupcompleted).IAuthTabCallback()), 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                }
            }
            final onTransact ontransact = tdsRollingNumberV1View.IAuthTabCallback_Parcel;
            if (ontransact != null) {
                boolean z2 = ontransact instanceof onTransact.onExtraCallback;
                if (!z2) {
                    if (ontransact instanceof onTransact.onWarmupCompleted) {
                        appLovinSdkSettings5 = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback((Interpolator) access000Var.IAuthTabCallbackDefault().getFirst(), ((Number) access000Var.IAuthTabCallbackDefault().getSecond()).intValue()), Float.valueOf(0.0f), Float.valueOf(1.0f), new Function1() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda10
                            private static int onExtraCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke(Object obj) {
                                int i7 = 2 % 2;
                                int i8 = onExtraCallbackWithResult + 39;
                                onExtraCallback = i8 % 128;
                                if (i8 % 2 != 0) {
                                    return (Unit) TdsRollingNumberV1View.onExtraCallbackWithResult(new Object[]{this.f$0, ontransact, Float.valueOf(((Float) obj).floatValue())}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -698992226, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 698992234);
                                }
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                        }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                    } else {
                        if (!(ontransact instanceof onTransact.onNavigationEvent)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        appLovinSdkSettings5 = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback((Interpolator) access000Var.onNavigationEvent().getFirst(), ((Number) access000Var.onNavigationEvent().getSecond()).intValue()), Float.valueOf(1.0f), Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda11
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            public final Object invoke(Object obj) {
                                int i7 = 2 % 2;
                                int i8 = onExtraCallbackWithResult + 97;
                                IAuthTabCallback = i8 % 128;
                                int i9 = i8 % 2;
                                Unit unitOnNavigationEvent = TdsRollingNumberV1View.onNavigationEvent(this.f$0, ontransact, ((Float) obj).floatValue());
                                int i10 = IAuthTabCallback + 125;
                                onExtraCallbackWithResult = i10 % 128;
                                int i11 = i10 % 2;
                                return unitOnNavigationEvent;
                            }
                        }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                    }
                    appLovinSdkSettings2 = appLovinSdkSettings5;
                    i2 = 2;
                } else {
                    int i7 = getSmallIconId + 97;
                    notifyNotificationWithChannel = i7 % 128;
                    i2 = 2;
                    int i8 = i7 % 2;
                    appLovinSdkSettings2 = null;
                }
                if (appLovinSdkSettings2 != null) {
                    int i9 = getSmallIconId + 37;
                    notifyNotificationWithChannel = i9 % 128;
                    if (i9 % i2 != 0) {
                        z = z2;
                        objOnWarmupCompleted = RallysKt.onWarmupCompleted(new Object[]{this, appLovinSdkSettings2, 1, null, 1, null, null, null, Integer.valueOf(ontransact.onNavigationEvent()), 0L, true, 5904, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
                    } else {
                        z = z2;
                        objOnWarmupCompleted = RallysKt.onWarmupCompleted(new Object[]{this, appLovinSdkSettings2, 0, null, 0, null, null, null, Integer.valueOf(ontransact.onNavigationEvent()), 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
                    }
                    arrayList.add((Rally) objOnWarmupCompleted);
                } else {
                    z = z2;
                }
                if (z) {
                    onTransact.onExtraCallback onextracallback2 = (onTransact.onExtraCallback) ontransact;
                    appLovinSdkSettings4 = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback((Interpolator) onextracallback2.onExtraCallback().getFirst(), ((Number) onextracallback2.onExtraCallback().getSecond()).intValue()), Float.valueOf(onextracallback2.IAuthTabCallback()), Float.valueOf(onextracallback2.onWarmupCompleted()), new Function1() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda12
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj) {
                            int i10 = 2 % 2;
                            int i11 = onWarmupCompleted + 83;
                            onExtraCallback = i11 % 128;
                            int i12 = i11 % 2;
                            Unit unitOnWarmupCompleted = TdsRollingNumberV1View.onWarmupCompleted(this.f$0, ontransact, ((Float) obj).floatValue());
                            int i13 = onExtraCallback + 9;
                            onWarmupCompleted = i13 % 128;
                            int i14 = i13 % 2;
                            return unitOnWarmupCompleted;
                        }
                    }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                } else if (ontransact instanceof onTransact.onWarmupCompleted) {
                    onTransact.onWarmupCompleted onwarmupcompleted2 = (onTransact.onWarmupCompleted) ontransact;
                    appLovinSdkSettings4 = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback((Interpolator) onwarmupcompleted2.onExtraCallbackWithResult().getFirst(), ((Number) onwarmupcompleted2.onExtraCallbackWithResult().getSecond()).intValue()), Float.valueOf(onwarmupcompleted2.onExtraCallback()), Float.valueOf(onwarmupcompleted2.onWarmupCompleted()), new Function1() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda13
                        private static int onNavigationEvent = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj) {
                            int i10 = 2 % 2;
                            int i11 = onNavigationEvent + 65;
                            onWarmupCompleted = i11 % 128;
                            if (i11 % 2 != 0) {
                                return (Unit) TdsRollingNumberV1View.onExtraCallbackWithResult(new Object[]{this.f$0, ontransact, Float.valueOf(((Float) obj).floatValue())}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 2089446016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -2089446011);
                            }
                            int i12 = 32 / 0;
                            return (Unit) TdsRollingNumberV1View.onExtraCallbackWithResult(new Object[]{this.f$0, ontransact, Float.valueOf(((Float) obj).floatValue())}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 2089446016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -2089446011);
                        }
                    }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                } else {
                    if (!(ontransact instanceof onTransact.onNavigationEvent)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i10 = getSmallIconId + 65;
                    notifyNotificationWithChannel = i10 % 128;
                    int i11 = i10 % 2;
                    appLovinSdkSettings3 = null;
                    if (appLovinSdkSettings3 != null) {
                        arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{this, appLovinSdkSettings3, 0, null, 0, null, null, null, Integer.valueOf(ontransact.onNavigationEvent()), 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                    }
                }
                appLovinSdkSettings3 = appLovinSdkSettings4;
                if (appLovinSdkSettings3 != null) {
                }
            }
            final asInterface asinterface = tdsRollingNumberV1View.ICustomTabsCallback;
            if (asinterface != null) {
                if (asinterface instanceof asInterface.onWarmupCompleted) {
                    asInterface.onWarmupCompleted onwarmupcompleted3 = (asInterface.onWarmupCompleted) asinterface;
                    appLovinSdkSettings = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback((Interpolator) onwarmupcompleted3.onWarmupCompleted().getFirst(), ((Number) onwarmupcompleted3.onWarmupCompleted().getSecond()).intValue()), Float.valueOf(onwarmupcompleted3.onNavigationEvent()), Float.valueOf(onwarmupcompleted3.IAuthTabCallback()), new Function1() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda14
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj) {
                            int i12 = 2 % 2;
                            int i13 = IAuthTabCallback + 63;
                            onNavigationEvent = i13 % 128;
                            int i14 = i13 % 2;
                            TdsRollingNumberV1View tdsRollingNumberV1View2 = this.f$0;
                            if (i14 != 0) {
                                return TdsRollingNumberV1View.onNavigationEvent(tdsRollingNumberV1View2, asinterface, ((Float) obj).floatValue());
                            }
                            TdsRollingNumberV1View.onNavigationEvent(tdsRollingNumberV1View2, asinterface, ((Float) obj).floatValue());
                            throw null;
                        }
                    }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                } else if (asinterface instanceof asInterface.onExtraCallbackWithResult) {
                    asInterface.onExtraCallbackWithResult onextracallbackwithresult3 = (asInterface.onExtraCallbackWithResult) asinterface;
                    appLovinSdkSettings = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback((Interpolator) onextracallbackwithresult3.onExtraCallbackWithResult().getFirst(), ((Number) onextracallbackwithresult3.onExtraCallbackWithResult().getSecond()).intValue()), Float.valueOf(0.0f), Float.valueOf(1.0f), new Function1() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda15
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj) {
                            int i12 = 2 % 2;
                            int i13 = IAuthTabCallback + 25;
                            onWarmupCompleted = i13 % 128;
                            int i14 = i13 % 2;
                            Unit unitIAuthTabCallback = TdsRollingNumberV1View.IAuthTabCallback(this.f$0, asinterface, ((Float) obj).floatValue());
                            int i15 = IAuthTabCallback + 41;
                            onWarmupCompleted = i15 % 128;
                            if (i15 % 2 == 0) {
                                return unitIAuthTabCallback;
                            }
                            throw null;
                        }
                    }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                } else {
                    if (!(asinterface instanceof asInterface.IAuthTabCallback)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    asInterface.IAuthTabCallback iAuthTabCallback = (asInterface.IAuthTabCallback) asinterface;
                    appLovinSdkSettings = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback((Interpolator) iAuthTabCallback.IAuthTabCallback().getFirst(), ((Number) iAuthTabCallback.IAuthTabCallback().getSecond()).intValue()), Float.valueOf(1.0f), Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda16
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj) {
                            int i12 = 2 % 2;
                            int i13 = onNavigationEvent + 27;
                            IAuthTabCallback = i13 % 128;
                            int i14 = i13 % 2;
                            Unit unitOnExtraCallbackWithResult = TdsRollingNumberV1View.onExtraCallbackWithResult(this.f$0, asinterface, ((Float) obj).floatValue());
                            int i15 = IAuthTabCallback + 83;
                            onNavigationEvent = i15 % 128;
                            int i16 = i15 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                }
                arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{this, appLovinSdkSettings, 0, null, 0, null, null, null, Integer.valueOf(asinterface.onExtraCallback()), 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
            }
            onExtraCallback onextracallback3 = tdsRollingNumberV1View.receiveFile;
            if (onextracallback3 != null) {
                if (getLayoutParams().width != -2 || IAuthTabCallbackStub() || onextracallback3.onExtraCallback() <= onextracallback3.onWarmupCompleted()) {
                    tdsRollingNumberV1View.ITrustedWebActivityCallbackStubProxy = 0.0f;
                } else {
                    tdsRollingNumberV1View.ITrustedWebActivityCallbackStubProxy = onextracallback3.onExtraCallback() - onextracallback3.onWarmupCompleted();
                }
                arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback((Interpolator) onextracallback3.IAuthTabCallback().getFirst(), ((Number) onextracallback3.IAuthTabCallback().getSecond()).intValue()), Float.valueOf(onextracallback3.onWarmupCompleted()), Float.valueOf(onextracallback3.onExtraCallback()), new Function1() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda17
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i12 = 2 % 2;
                        int i13 = IAuthTabCallback + 81;
                        onNavigationEvent = i13 % 128;
                        int i14 = i13 % 2;
                        Unit unit = (Unit) TdsRollingNumberV1View.onExtraCallbackWithResult(new Object[]{this.f$0, Float.valueOf(((Float) obj).floatValue())}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1823530421, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1823530424);
                        int i15 = onNavigationEvent + 25;
                        IAuthTabCallback = i15 % 128;
                        if (i15 % 2 == 0) {
                            return unit;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, Integer.valueOf(onextracallback3.onNavigationEvent()), 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
            }
            onExtraCallback onextracallback4 = tdsRollingNumberV1View.onVerticalScrollEvent;
            if (onextracallback4 != null) {
                arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback((Interpolator) onextracallback4.IAuthTabCallback().getFirst(), ((Number) onextracallback4.IAuthTabCallback().getSecond()).intValue()), Float.valueOf(onextracallback4.onWarmupCompleted()), Float.valueOf(onextracallback4.onExtraCallback()), new Function1() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda18
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj) {
                        Unit unit;
                        int i12 = 2 % 2;
                        int i13 = onExtraCallbackWithResult + 11;
                        onExtraCallback = i13 % 128;
                        if (i13 % 2 != 0) {
                            unit = (Unit) TdsRollingNumberV1View.onExtraCallbackWithResult(new Object[]{this.f$0, Float.valueOf(((Float) obj).floatValue())}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 98554005, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -98553990);
                            int i14 = 95 / 0;
                        } else {
                            unit = (Unit) TdsRollingNumberV1View.onExtraCallbackWithResult(new Object[]{this.f$0, Float.valueOf(((Float) obj).floatValue())}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 98554005, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -98553990);
                        }
                        int i15 = onExtraCallback + 71;
                        onExtraCallbackWithResult = i15 % 128;
                        int i16 = i15 % 2;
                        return unit;
                    }
                }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, Integer.valueOf(onextracallback4.onNavigationEvent()), 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
            }
            IAuthTabCallback iAuthTabCallback2 = tdsRollingNumberV1View.onWarmupCompleted;
            if (iAuthTabCallback2 != null) {
                arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback((Interpolator) iAuthTabCallback2.onNavigationEvent().getFirst(), ((Number) iAuthTabCallback2.onNavigationEvent().getSecond()).intValue()), Float.valueOf(iAuthTabCallback2.onExtraCallbackWithResult()), Float.valueOf(iAuthTabCallback2.onWarmupCompleted()), new Function1() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda19
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i12 = 2 % 2;
                        int i13 = onWarmupCompleted + 51;
                        onExtraCallback = i13 % 128;
                        int i14 = i13 % 2;
                        Unit unitOnWarmupCompleted = TdsRollingNumberV1View.onWarmupCompleted(this.f$0, ((Float) obj).floatValue());
                        if (i14 != 0) {
                            int i15 = 47 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, Integer.valueOf(iAuthTabCallback2.IAuthTabCallback()), 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
            }
            return RallysKt.onWarmupCompleted(null, pxToDp.IAuthTabCallback.onExtraCallback, arrayList, 0, null, 0, null, null, Boolean.FALSE, i, 0L, false, 3321, null);
            IAuthTabCallbackStub.onWarmupCompleted onwarmupcompleted4 = (IAuthTabCallbackStub.onWarmupCompleted) iAuthTabCallbackStub;
            arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback((Interpolator) access000Var.onExtraCallback().getFirst(), ((Number) access000Var.onExtraCallback().getSecond()).intValue()), Float.valueOf(onwarmupcompleted4.IAuthTabCallback().onWarmupCompleted()), Float.valueOf(onwarmupcompleted4.onExtraCallback().onWarmupCompleted()), new Function1() { // from class: im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View$$ExternalSyntheticLambda9
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) {
                    int i12 = 2 % 2;
                    int i13 = onNavigationEvent + 113;
                    onWarmupCompleted = i13 % 128;
                    if (i13 % 2 != 0) {
                        TdsRollingNumberV1View.onExtraCallback(this.f$0, iAuthTabCallbackStub, ((Float) obj).floatValue());
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    Unit unitOnExtraCallback = TdsRollingNumberV1View.onExtraCallback(this.f$0, iAuthTabCallbackStub, ((Float) obj).floatValue());
                    int i14 = onWarmupCompleted + 35;
                    onNavigationEvent = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i15 = 94 / 0;
                    }
                    return unitOnExtraCallback;
                }
            }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, Integer.valueOf(onwarmupcompleted4.onNavigationEvent()), 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
            i5 = notifyNotificationWithChannel + 39;
        }
    }

    static /* synthetic */ boolean onExtraCallback(TdsRollingNumberV1View tdsRollingNumberV1View, runOnUiThreadDelayed runonuithreaddelayed, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId;
        int i4 = i3 + 63;
        notifyNotificationWithChannel = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            runonuithreaddelayed = tdsRollingNumberV1View.IEngagementSignalsCallbackDefault;
            int i5 = i3 + 99;
            notifyNotificationWithChannel = i5 % 128;
            int i6 = i5 % 2;
        }
        return tdsRollingNumberV1View.onExtraCallbackWithResult(runonuithreaddelayed);
    }

    private final boolean onExtraCallbackWithResult(runOnUiThreadDelayed runonuithreaddelayed) {
        int i = 2 % 2;
        if (!isInLayout()) {
            int i2 = notifyNotificationWithChannel + 81;
            getSmallIconId = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (runonuithreaddelayed != null && runonuithreaddelayed.postMessage()) {
                int i3 = getSmallIconId + 107;
                notifyNotificationWithChannel = i3 % 128;
                return i3 % 2 == 0;
            }
        }
        int i4 = getSmallIconId + 87;
        notifyNotificationWithChannel = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private final void access100() {
        Function0<Unit> function0;
        int i = 2 % 2;
        int i2 = getSmallIconId + 57;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 != 0) {
            this.ITrustedWebActivityCallbackStubProxy = 2.0f;
            this.extraCommand = 0.0f;
            this.IAuthTabCallback = true;
            onRelationshipValidationResult();
            function0 = this.setEngagementSignalsCallback;
            if (function0 == null) {
                return;
            }
        } else {
            this.ITrustedWebActivityCallbackStubProxy = 0.0f;
            this.extraCommand = 0.0f;
            this.IAuthTabCallback = false;
            onRelationshipValidationResult();
            function0 = this.setEngagementSignalsCallback;
            if (function0 == null) {
                return;
            }
        }
        function0.invoke();
        int i3 = getSmallIconId + 119;
        notifyNotificationWithChannel = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void onExtraCallbackWithResult(float f, float f2) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel;
        int i3 = i2 + 67;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        this.onPostMessage = f;
        this.ICustomTabsCallbackDefault = f2;
        int i5 = i2 + 105;
        getSmallIconId = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private final void onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 9;
        notifyNotificationWithChannel = i2 % 128;
        int i3 = i2 % 2;
        this.onPostMessage = 0.0f;
        this.ICustomTabsCallbackDefault = 0.0f;
        invalidate();
        int i4 = getSmallIconId + 93;
        notifyNotificationWithChannel = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 53;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 == 0) {
            this.onMinimized = this.ITrustedWebActivityCallbackStub;
            this.extraCallbackWithResult = this.IPostMessageService_Parcel;
            this.ITrustedWebActivityCallbackStub = str;
            this.IPostMessageService_Parcel = str2;
            onTransact();
            return;
        }
        this.onMinimized = this.ITrustedWebActivityCallbackStub;
        this.extraCallbackWithResult = this.IPostMessageService_Parcel;
        this.ITrustedWebActivityCallbackStub = str;
        this.IPostMessageService_Parcel = str2;
        onTransact();
        throw null;
    }

    private final void onExtraCallback(String str, boolean z) {
        int i;
        int i2;
        int i3 = 2 % 2;
        if (StringsKt.isBlank(str)) {
            return;
        }
        int length = str.length();
        float[] fArr = new float[length];
        this.requestPostMessageChannel.getTextWidths(onExtraCallbackWithResult(str), 0, length, fArr);
        this.readTypedObject = this.ITrustedWebActivityCallback;
        float fSum = ArraysKt.sum(fArr);
        this.ITrustedWebActivityCallback = fSum;
        this.onUnminimized = this.readTypedObject < fSum;
        TextPaint textPaint = this.ICustomTabsServiceStub;
        CharSequence charSequence = this.warmup;
        this.validateRelationship = textPaint.measureText(charSequence, 0, charSequence.length());
        TextPaint textPaint2 = this.IPostMessageServiceDefault;
        CharSequence charSequence2 = this.IEngagementSignalsCallback_Parcel;
        this.IPostMessageServiceStub = textPaint2.measureText(charSequence2, 0, charSequence2.length());
        float fIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        float f = this.ITrustedWebActivityCallback;
        float measuredWidth = (getMeasuredWidth() - ((((fIAuthTabCallback_Parcel + f) + this.validateRelationship) + this.IPostMessageServiceStub) + onExtraCallback())) - (getPaddingStart() + getPaddingEnd());
        float f2 = 0.0f;
        float fCoerceAtLeast = RangesKt.coerceAtLeast(measuredWidth, 0.0f);
        int i4 = access100.onWarmupCompleted[this.onExtraCallback.ordinal()];
        if (i4 == 1) {
            int i5 = notifyNotificationWithChannel + 45;
            getSmallIconId = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 3;
            }
            fCoerceAtLeast = 0.0f;
        } else if (i4 == 2) {
            fCoerceAtLeast /= 2.0f;
        }
        this.onActivityLayout = this.areNotificationsEnabled;
        this.areNotificationsEnabled = fCoerceAtLeast;
        if (z) {
            int i7 = 0;
            for (int i8 = 0; i8 < str.length(); i8++) {
                if (onExtraCallback(str.charAt(i8))) {
                    i7++;
                }
            }
            i = i7 - 1;
        } else {
            i = 0;
        }
        Collection<? extends onExtraCallbackWithResult> arrayList = new ArrayList<>(length);
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int i11 = notifyNotificationWithChannel;
            int i12 = i11 + 115;
            getSmallIconId = i12 % 128;
            int i13 = i12 % 2;
            float f3 = fArr[i9];
            float f4 = z ? this.validateRelationship + fCoerceAtLeast : f2;
            if (i10 != 0) {
                int i14 = i11 + 15;
                getSmallIconId = i14 % 128;
                int i15 = i14 % 2;
                int i16 = 0;
                while (i16 < i10) {
                    int i17 = getSmallIconId + 113;
                    notifyNotificationWithChannel = i17 % 128;
                    if (i17 % 2 != 0) {
                        f4 -= fArr[i16];
                        i16 += 70;
                    } else {
                        f4 += fArr[i16];
                        i16++;
                    }
                }
            }
            char cCharAt = str.charAt(i10);
            if (onExtraCallback(cCharAt)) {
                i2 = z ? i - 1 : i + 1;
            } else if (z) {
                i2 = i;
                i++;
            } else {
                i2 = i;
            }
            arrayList.add(new onExtraCallbackWithResult(cCharAt, f4, i, f3));
            i9++;
            i10++;
            i = i2;
            f2 = 0.0f;
        }
        this.writeTypedObject.clear();
        this.writeTypedObject.addAll(this.ITrustedWebActivityCallbackDefault);
        this.ITrustedWebActivityCallbackDefault.clear();
        ArrayList<onExtraCallbackWithResult> arrayList2 = this.ITrustedWebActivityCallbackDefault;
        if (z) {
            int i18 = getSmallIconId + 67;
            notifyNotificationWithChannel = i18 % 128;
            int i19 = i18 % 2;
            arrayList = CollectionsKt.reversed(arrayList);
        }
        arrayList2.addAll(arrayList);
    }

    private final boolean onExtraCallback(String str, String str2) {
        float fFloatValue;
        int i = 2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult((CharSequence) str);
        String strOnExtraCallbackWithResult2 = onExtraCallbackWithResult((CharSequence) str2);
        Float floatOrNull = StringsKt.toFloatOrNull(StringsKt.replace$default(strOnExtraCallbackWithResult, ",", "", false, 4, (Object) null));
        float fFloatValue2 = 0.0f;
        if (floatOrNull != null) {
            int i2 = notifyNotificationWithChannel + 83;
            getSmallIconId = i2 % 128;
            if (i2 % 2 != 0) {
                fFloatValue = floatOrNull.floatValue();
            } else {
                floatOrNull.floatValue();
                throw null;
            }
        } else {
            fFloatValue = 0.0f;
        }
        Float floatOrNull2 = StringsKt.toFloatOrNull(StringsKt.replace$default(strOnExtraCallbackWithResult2, ",", "", false, 4, (Object) null));
        if (floatOrNull2 != null) {
            fFloatValue2 = floatOrNull2.floatValue();
            int i3 = getSmallIconId + 101;
            notifyNotificationWithChannel = i3 % 128;
            int i4 = i3 % 2;
        }
        if (fFloatValue2 <= fFloatValue) {
            return false;
        }
        int i5 = getSmallIconId + 19;
        notifyNotificationWithChannel = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private final String onExtraCallbackWithResult(String str) {
        char cCharAt;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            int i3 = getSmallIconId + 27;
            notifyNotificationWithChannel = i3 % 128;
            if (i3 % 2 == 0 ? (cCharAt = str.charAt(i2)) == ',' : (cCharAt = str.charAt(i2)) == 'v') {
                cCharAt = this.extraCallback;
                int i4 = getSmallIconId + 89;
                notifyNotificationWithChannel = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int i6 = getSmallIconId + 91;
                notifyNotificationWithChannel = i6 % 128;
                int i7 = i6 % 2;
                if (cCharAt == '.') {
                    cCharAt = this.access100;
                }
            }
            arrayList.add(Character.valueOf(cCharAt));
        }
        return CollectionsKt.joinToString$default(arrayList, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    private final String onExtraCallbackWithResult(CharSequence charSequence) {
        int i = 2 % 2;
        String strReplace = new Regex("[^\\d.-]").replace(charSequence, "9");
        int i2 = getSmallIconId + 3;
        notifyNotificationWithChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return strReplace;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean onExtraCallback(char c) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 111;
        getSmallIconId = i2 % 128;
        if (i2 % 2 == 0) {
            Character.isDigit(c);
            throw null;
        }
        if (!Character.isDigit(c)) {
            if (!((Boolean) onExtraCallbackWithResult(new Object[]{this, Character.valueOf(c)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -547612458, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 547612458)).booleanValue()) {
                int i3 = notifyNotificationWithChannel + 99;
                getSmallIconId = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
        }
        int i5 = notifyNotificationWithChannel + 101;
        getSmallIconId = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return true;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Integer numValueOf;
        int i = 0;
        TdsRollingNumberV1View tdsRollingNumberV1View = (TdsRollingNumberV1View) objArr[0];
        CharSequence charSequence = (CharSequence) objArr[1];
        int i2 = 2 % 2;
        if (StringsKt.isBlank(charSequence)) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(charSequence);
        if (!tdsRollingNumberV1View.onGreatestScrollPercentageIncreased) {
            int i3 = notifyNotificationWithChannel + 39;
            getSmallIconId = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                StringsKt.toDoubleOrNull(tdsRollingNumberV1View.onExtraCallbackWithResult(charSequence));
                obj.hashCode();
                throw null;
            }
            Double doubleOrNull = StringsKt.toDoubleOrNull(tdsRollingNumberV1View.onExtraCallbackWithResult(charSequence));
            if (doubleOrNull == null) {
                throw new IllegalStateException("Invalid input number:" + ((Object) charSequence));
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.US, "%,.2f", Arrays.copyOf(new Object[]{doubleOrNull}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            int i5 = 0;
            while (i4 < str.length()) {
                int i6 = getSmallIconId + 73;
                notifyNotificationWithChannel = i6 % 128;
                int i7 = i6 % 2;
                if (str.charAt(i4) == ',') {
                    int i8 = getSmallIconId + 73;
                    notifyNotificationWithChannel = i8 % 128;
                    if (i8 % 2 != 0) {
                        Integer.valueOf(i5);
                        throw null;
                    }
                    numValueOf = Integer.valueOf(i5);
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int i9 = getSmallIconId + 63;
                    notifyNotificationWithChannel = i9 % 128;
                    if (i9 % 2 != 0) {
                        arrayList.add(numValueOf);
                        obj.hashCode();
                        throw null;
                    }
                    arrayList.add(numValueOf);
                    int i10 = getSmallIconId + 25;
                    notifyNotificationWithChannel = i10 % 128;
                    int i11 = i10 % 2;
                }
                i4++;
                i5++;
                int i12 = notifyNotificationWithChannel + 27;
                getSmallIconId = i12 % 128;
                int i13 = i12 % 2;
            }
            try {
                for (Object obj2 : arrayList) {
                    int i14 = notifyNotificationWithChannel + 35;
                    getSmallIconId = i14 % 128;
                    int i15 = i14 % 2;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    int iIntValue = ((Number) obj2).intValue();
                    if (stringBuffer.charAt(iIntValue) != ',') {
                        int i16 = getSmallIconId + 77;
                        notifyNotificationWithChannel = i16 % 128;
                        if (i16 % 2 != 0) {
                            stringBuffer.insert(iIntValue, '0');
                        } else {
                            stringBuffer.insert(iIntValue, ',');
                        }
                    }
                    i++;
                }
            } catch (Exception unused) {
                return "";
            }
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private final void onExtraCallbackWithResult(Canvas canvas) {
        int iOnExtraCallback;
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 1;
        getSmallIconId = i2 % 128;
        if (i2 % 2 == 0) {
            iOnExtraCallback = getBacktraceNoteBytes.onExtraCallback(this.requestPostMessageChannel.descent() / this.requestPostMessageChannel.ascent());
            if (getMeasuredHeight() <= iOnExtraCallback) {
                return;
            }
        } else {
            iOnExtraCallback = getBacktraceNoteBytes.onExtraCallback(this.requestPostMessageChannel.descent() - this.requestPostMessageChannel.ascent());
            if (getMeasuredHeight() <= iOnExtraCallback) {
                return;
            }
        }
        float measuredHeight = (getMeasuredHeight() - iOnExtraCallback) / 2.0f;
        canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight);
        int i3 = getSmallIconId + 93;
        notifyNotificationWithChannel = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(Canvas canvas) {
        int i;
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 31;
        notifyNotificationWithChannel = i3 % 128;
        int i4 = i3 % 2;
        Rally rally = this.newSession;
        if (rally == null || !rally.postMessage()) {
            return;
        }
        int i5 = notifyNotificationWithChannel + 91;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        float measuredHeight = (getMeasuredHeight() - this.newAuthTabSession) / 2.0f;
        RectF rectFWriteTypedObject = writeTypedObject();
        float f = this.prefetch;
        float f2 = this.newAuthTabSession;
        rectFWriteTypedObject.set(f, measuredHeight, f + f2, f2 + measuredHeight);
        Paint paintICustomTabsCallback = ICustomTabsCallback();
        float f3 = this.newAuthTabSession;
        Rally rally2 = this.IAuthTabCallbackStubProxy;
        if (rally2 != null) {
            int i7 = getSmallIconId + 17;
            notifyNotificationWithChannel = i7 % 128;
            if (i7 % 2 == 0 ? !rally2.postMessage() : !rally2.postMessage()) {
                i = this.isEngagementSignalsApiAvailable;
                int i8 = notifyNotificationWithChannel + 3;
                getSmallIconId = i8 % 128;
                int i9 = i8 % 2;
            } else {
                i = this.access000;
            }
        }
        sMaxAgeSeconds.onExtraCallback(paintICustomTabsCallback, f3, f3, 75.0d, new int[]{0, i, 0}, new float[]{0.0f, 0.5f, 1.0f}, writeTypedObject().left, writeTypedObject().top);
        canvas.drawRect(writeTypedObject().left, writeTypedObject().top, writeTypedObject().right, writeTypedObject().bottom, ICustomTabsCallback());
        int i10 = getSmallIconId + 63;
        notifyNotificationWithChannel = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 5 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r5 >= r11.length()) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        r9 = ((android.text.Spannable) r11).nextSpanTransition(r5, r11.length(), android.text.style.CharacterStyle.class);
        r17 = r14.measureText(r11, r5, r9);
        r3 = (android.text.Spanned) r11;
        r4 = (android.text.style.ForegroundColorSpan) kotlin.collections.ArraysKt.lastOrNull(r3.getSpans(r5, r9, android.text.style.ForegroundColorSpan.class));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 28) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
    
        r6 = im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.getSmallIconId + 59;
        im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.notifyNotificationWithChannel = r6 % 128;
        r6 = r6 % 2;
        r6 = (android.text.style.TypefaceSpan) kotlin.collections.ArraysKt.lastOrNull(r3.getSpans(r5, r9, android.text.style.TypefaceSpan.class));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
    
        if (r6 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0089, code lost:
    
        r6 = r6.getTypeface();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
    
        if (r6 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008f, code lost:
    
        r3 = im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.notifyNotificationWithChannel + 101;
        im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.getSmallIconId = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0098, code lost:
    
        if ((r3 % 2) != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009a, code lost:
    
        r3 = 59 / r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        r3 = (o.setCookieJarokhttp) kotlin.collections.ArraysKt.lastOrNull(r3.getSpans(r5, r9, o.setCookieJarokhttp.class));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
    
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        r6 = im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.notifyNotificationWithChannel + 15;
        im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.getSmallIconId = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
    
        if ((r6 % 2) == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        r6 = r3.IAuthTabCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        r3.IAuthTabCallback();
        r15.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
    
        r3 = (o.setCookieJarokhttp) kotlin.collections.ArraysKt.lastOrNull(r3.getSpans(r5, r9, o.setCookieJarokhttp.class));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
    
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d1, code lost:
    
        r6 = r3.IAuthTabCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d6, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        r8 = r14.getColor();
        r7 = r14.getTypeface();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00df, code lost:
    
        if (r4 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e1, code lost:
    
        r14.setColor(r4.getForegroundColor());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e8, code lost:
    
        if (r6 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ea, code lost:
    
        r3 = im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.notifyNotificationWithChannel + r1;
        im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.getSmallIconId = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f2, code lost:
    
        if ((r3 % 2) == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f4, code lost:
    
        r14.setTypeface(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f8, code lost:
    
        r14.setTypeface(r6);
        r15.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fe, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ff, code lost:
    
        r2.drawText(r11, r5, r9, r12 + r16, r13, r14);
        r14.setColor(r8);
        r14.setTypeface(r7);
        r16 = r16 + r17;
        r5 = r9;
        r0 = 0;
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011e, code lost:
    
        r2.drawText(r11.toString(), r12, r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0125, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003b, code lost:
    
        if ((r11 instanceof android.text.Spannable) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if ((r11 instanceof android.text.Spannable) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        r5 = 0;
        r16 = 0.0f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        int i = 0;
        int i2 = 1;
        Canvas canvas = (Canvas) objArr[1];
        CharSequence charSequence = (CharSequence) objArr[2];
        float fFloatValue = ((Number) objArr[3]).floatValue();
        float fFloatValue2 = ((Number) objArr[4]).floatValue();
        Paint paint = (Paint) objArr[5];
        int i3 = 2 % 2;
        int i4 = getSmallIconId + 29;
        notifyNotificationWithChannel = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
    }

    private final void onExtraCallbackWithResult(Canvas canvas, float f) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 83;
        getSmallIconId = i2 % 128;
        if (i2 % 2 != 0) {
            Drawable drawableOnExtraCallbackWithResult = this.IAuthTabCallbackStub.onExtraCallbackWithResult();
            if (drawableOnExtraCallbackWithResult != null) {
                Bitmap bitmap = (Bitmap) IAuthTabCallbackDefault.IAuthTabCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1648438978, -1648438977, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this.IAuthTabCallbackStub});
                if (bitmap != null) {
                    float fOnExtraCallbackWithResult = onExtraCallbackWithResult(bitmap, this.mayLaunchUrl);
                    drawableOnExtraCallbackWithResult.setBounds((int) f, (int) fOnExtraCallbackWithResult, (int) (f + drawableOnExtraCallbackWithResult.getIntrinsicWidth()), (int) (fOnExtraCallbackWithResult + drawableOnExtraCallbackWithResult.getIntrinsicHeight()));
                    drawableOnExtraCallbackWithResult.draw(canvas);
                    return;
                }
            }
            int i3 = getSmallIconId + 43;
            notifyNotificationWithChannel = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.IAuthTabCallbackStub.onExtraCallbackWithResult();
        throw null;
    }

    private final void onNavigationEvent(Canvas canvas, float f) throws NoWhenBranchMatchedException {
        Bitmap bitmapOnTransact;
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 37;
        getSmallIconId = i2 % 128;
        if (i2 % 2 == 0) {
            this.IAuthTabCallbackStub.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Drawable drawableIAuthTabCallback = this.IAuthTabCallbackStub.IAuthTabCallback();
        if (drawableIAuthTabCallback == null || (bitmapOnTransact = this.IAuthTabCallbackStub.onTransact()) == null) {
            return;
        }
        float fOnExtraCallbackWithResult = onExtraCallbackWithResult(bitmapOnTransact, this.IEngagementSignalsCallbackStub);
        drawableIAuthTabCallback.setBounds((int) f, (int) fOnExtraCallbackWithResult, (int) (f + drawableIAuthTabCallback.getIntrinsicWidth()), (int) (fOnExtraCallbackWithResult + drawableIAuthTabCallback.getIntrinsicHeight()));
        drawableIAuthTabCallback.draw(canvas);
        int i3 = notifyNotificationWithChannel + 73;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final float onExtraCallbackWithResult(Bitmap bitmap, onNavigationEvent onnavigationevent) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 11;
        notifyNotificationWithChannel = i3 % 128;
        if (i3 % 2 == 0 ? (i = access100.onExtraCallback[onnavigationevent.ordinal()]) == 1 : (i = access100.onExtraCallback[onnavigationevent.ordinal()]) == 1) {
            return (getMeasuredHeight() - bitmap.getHeight()) / 2.0f;
        }
        if (i == 2) {
            return (getMeasuredHeight() - bitmap.getHeight()) - (this.requestPostMessageChannel.getTextSize() * 0.2f);
        }
        int i4 = notifyNotificationWithChannel + 27;
        int i5 = i4 % 128;
        getSmallIconId = i5;
        int i6 = i4 % 2;
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i7 = i5 + 41;
        notifyNotificationWithChannel = i7 % 128;
        return i7 % 2 != 0 ? (this.requestPostMessageChannel.getTextSize() - 0.2f) / 2.0f : (this.requestPostMessageChannel.getTextSize() * 0.2f) + 0.0f;
    }

    private final void onWarmupCompleted(Canvas canvas, float f, float f2) {
        int i = 2 % 2;
        Paint paint = this.onActivityResized;
        float fAccess000 = access000();
        int i2 = this.onMessageChannelReady;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, fAccess000, i2, 0, tileMode));
        canvas.drawRect(f, 0.0f, f2, access000(), this.onActivityResized);
        this.onActivityResized.setShader(new LinearGradient(0.0f, canvas.getHeight(), 0.0f, canvas.getHeight() - IAuthTabCallbackStubProxy(), this.onMessageChannelReady, 0, tileMode));
        canvas.drawRect(f, canvas.getHeight() - IAuthTabCallbackStubProxy(), f2, canvas.getHeight(), this.onActivityResized);
        int i3 = notifyNotificationWithChannel + 71;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7 A[PHI: r8
      0x00e7: PHI (r8v16 java.lang.Object) = (r8v15 java.lang.Object), (r8v19 java.lang.Object) binds: [B:39:0x00e5, B:36:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(Canvas canvas) throws NoWhenBranchMatchedException {
        Object next;
        int i = 2 % 2;
        if (this.getInterfaceDescriptor.isEmpty()) {
            return;
        }
        for (IAuthTabCallbackStub iAuthTabCallbackStub : this.getInterfaceDescriptor) {
            if (iAuthTabCallbackStub instanceof IAuthTabCallbackStub.onWarmupCompleted) {
                IAuthTabCallbackStub.onWarmupCompleted onwarmupcompleted = (IAuthTabCallbackStub.onWarmupCompleted) iAuthTabCallbackStub;
                canvas.drawText(String.valueOf(onwarmupcompleted.onExtraCallback().onExtraCallback()), onwarmupcompleted.onWarmupCompleted(), readTypedObject(), this.requestPostMessageChannel);
            } else {
                int i2 = 0;
                if (iAuthTabCallbackStub instanceof IAuthTabCallbackStub.onNavigationEvent) {
                    IAuthTabCallbackStub.onNavigationEvent onnavigationevent = (IAuthTabCallbackStub.onNavigationEvent) iAuthTabCallbackStub;
                    for (Object obj : onnavigationevent.onNavigationEvent()) {
                        if (i2 < 0) {
                            int i3 = getSmallIconId + 115;
                            notifyNotificationWithChannel = i3 % 128;
                            if (i3 % 2 != 0) {
                                CollectionsKt.throwIndexOverflow();
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            CollectionsKt.throwIndexOverflow();
                        }
                        String str = (String) obj;
                        if (onnavigationevent.onExtraCallback()) {
                            float fExtraCallbackWithResult = extraCallbackWithResult();
                            canvas.drawText(str, onnavigationevent.asInterface(), (readTypedObject() + (i2 * fExtraCallbackWithResult)) - onnavigationevent.asBinder(), this.requestPostMessageChannel);
                        } else {
                            float fExtraCallbackWithResult2 = extraCallbackWithResult();
                            canvas.drawText(str, onnavigationevent.asInterface(), (readTypedObject() + ((-i2) * fExtraCallbackWithResult2)) - onnavigationevent.asBinder(), this.requestPostMessageChannel);
                        }
                        i2++;
                    }
                } else if (iAuthTabCallbackStub instanceof IAuthTabCallbackStub.onExtraCallback) {
                    IAuthTabCallbackStub.onExtraCallback onextracallback = (IAuthTabCallbackStub.onExtraCallback) iAuthTabCallbackStub;
                    Iterator<T> it = onextracallback.onWarmupCompleted().iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        int i5 = getSmallIconId + 81;
                        notifyNotificationWithChannel = i5 % 128;
                        if (i5 % 2 != 0) {
                            next = it.next();
                            int i6 = 1 / 0;
                            if (i4 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                        } else {
                            next = it.next();
                            if (i4 < 0) {
                            }
                        }
                        String str2 = (String) next;
                        onExtraCallbackWithResult(new Object[]{this, Float.valueOf(onextracallback.onExtraCallback())}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 2126536451, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -2126536431);
                        if (onextracallback.IAuthTabCallback()) {
                            int i7 = getSmallIconId + 25;
                            notifyNotificationWithChannel = i7 % 128;
                            int i8 = i7 % 2;
                            float fExtraCallbackWithResult3 = extraCallbackWithResult();
                            canvas.drawText(str2, onextracallback.onNavigationEvent().onWarmupCompleted(), (readTypedObject() + (i4 * fExtraCallbackWithResult3)) - onextracallback.IAuthTabCallbackDefault(), this.requestPostMessageChannel);
                        } else {
                            float fExtraCallbackWithResult4 = extraCallbackWithResult();
                            canvas.drawText(str2, onextracallback.onNavigationEvent().onWarmupCompleted(), (readTypedObject() + ((-i4) * fExtraCallbackWithResult4)) - onextracallback.IAuthTabCallbackDefault(), this.requestPostMessageChannel);
                        }
                        i4++;
                    }
                } else {
                    if (!(iAuthTabCallbackStub instanceof IAuthTabCallbackStub.onExtraCallbackWithResult)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IAuthTabCallbackStub.onExtraCallbackWithResult onextracallbackwithresult = (IAuthTabCallbackStub.onExtraCallbackWithResult) iAuthTabCallbackStub;
                    for (Object obj3 : onextracallbackwithresult.onExtraCallback()) {
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                            int i9 = notifyNotificationWithChannel + 1;
                            getSmallIconId = i9 % 128;
                            int i10 = i9 % 2;
                        }
                        String str3 = (String) obj3;
                        onExtraCallbackWithResult(new Object[]{this, Float.valueOf(onextracallbackwithresult.onWarmupCompleted())}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 2126536451, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -2126536431);
                        if (onextracallbackwithresult.IAuthTabCallback()) {
                            float fExtraCallbackWithResult5 = extraCallbackWithResult();
                            canvas.drawText(str3, onextracallbackwithresult.onExtraCallbackWithResult().onWarmupCompleted(), (readTypedObject() + (i2 * fExtraCallbackWithResult5)) - onextracallbackwithresult.asInterface(), this.requestPostMessageChannel);
                        } else {
                            float fExtraCallbackWithResult6 = extraCallbackWithResult();
                            canvas.drawText(str3, onextracallbackwithresult.onExtraCallbackWithResult().onWarmupCompleted(), (readTypedObject() + ((-i2) * fExtraCallbackWithResult6)) - onextracallbackwithresult.asInterface(), this.requestPostMessageChannel);
                        }
                        i2++;
                    }
                }
            }
            ICustomTabsCallbackStub();
        }
        onWarmupCompleted(canvas, this.onPostMessage, this.ICustomTabsCallbackDefault);
        int i11 = notifyNotificationWithChannel + 17;
        getSmallIconId = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final float onNavigationEvent(IAuthTabCallbackStub iAuthTabCallbackStub) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = getSmallIconId;
        int i3 = i2 + 91;
        int i4 = i3 % 128;
        notifyNotificationWithChannel = i4;
        if (i3 % 2 != 0) {
            boolean z = iAuthTabCallbackStub instanceof IAuthTabCallbackStub.onWarmupCompleted;
            throw null;
        }
        if (iAuthTabCallbackStub instanceof IAuthTabCallbackStub.onWarmupCompleted) {
            IAuthTabCallbackStub.onWarmupCompleted onwarmupcompleted = (IAuthTabCallbackStub.onWarmupCompleted) iAuthTabCallbackStub;
            return Math.min(onwarmupcompleted.IAuthTabCallback().onWarmupCompleted(), onwarmupcompleted.onExtraCallback().onWarmupCompleted());
        }
        if (iAuthTabCallbackStub instanceof IAuthTabCallbackStub.onNavigationEvent) {
            IAuthTabCallbackStub.onNavigationEvent onnavigationevent = (IAuthTabCallbackStub.onNavigationEvent) iAuthTabCallbackStub;
            return Math.min(onnavigationevent.onExtraCallbackWithResult().onWarmupCompleted(), onnavigationevent.IAuthTabCallback().onWarmupCompleted());
        }
        if (iAuthTabCallbackStub instanceof IAuthTabCallbackStub.onExtraCallback) {
            int i5 = i2 + 95;
            notifyNotificationWithChannel = i5 % 128;
            if (i5 % 2 == 0) {
                return ((IAuthTabCallbackStub.onExtraCallback) iAuthTabCallbackStub).onNavigationEvent().onWarmupCompleted();
            }
            int i6 = 70 / 0;
            return ((IAuthTabCallbackStub.onExtraCallback) iAuthTabCallbackStub).onNavigationEvent().onWarmupCompleted();
        }
        if (!(iAuthTabCallbackStub instanceof IAuthTabCallbackStub.onExtraCallbackWithResult)) {
            throw new NoWhenBranchMatchedException();
        }
        int i7 = i4 + 43;
        getSmallIconId = i7 % 128;
        int i8 = i7 % 2;
        return ((IAuthTabCallbackStub.onExtraCallbackWithResult) iAuthTabCallbackStub).onExtraCallbackWithResult().onWarmupCompleted();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final float onExtraCallback(IAuthTabCallbackStub iAuthTabCallbackStub) throws NoWhenBranchMatchedException {
        float fOnWarmupCompleted;
        int i = 2 % 2;
        if (iAuthTabCallbackStub instanceof IAuthTabCallbackStub.onWarmupCompleted) {
            IAuthTabCallbackStub.onWarmupCompleted onwarmupcompleted = (IAuthTabCallbackStub.onWarmupCompleted) iAuthTabCallbackStub;
            fOnWarmupCompleted = Math.max(onwarmupcompleted.IAuthTabCallback().onWarmupCompleted(), onwarmupcompleted.onExtraCallback().onWarmupCompleted());
        } else if (iAuthTabCallbackStub instanceof IAuthTabCallbackStub.onNavigationEvent) {
            int i2 = notifyNotificationWithChannel + 103;
            getSmallIconId = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackStub.onNavigationEvent onnavigationevent = (IAuthTabCallbackStub.onNavigationEvent) iAuthTabCallbackStub;
            fOnWarmupCompleted = Math.max(onnavigationevent.onExtraCallbackWithResult().onWarmupCompleted(), onnavigationevent.IAuthTabCallback().onWarmupCompleted());
        } else if (iAuthTabCallbackStub instanceof IAuthTabCallbackStub.onExtraCallback) {
            fOnWarmupCompleted = ((IAuthTabCallbackStub.onExtraCallback) iAuthTabCallbackStub).onNavigationEvent().onWarmupCompleted();
        } else {
            if (!(iAuthTabCallbackStub instanceof IAuthTabCallbackStub.onExtraCallbackWithResult)) {
                throw new NoWhenBranchMatchedException();
            }
            int i4 = getSmallIconId + 103;
            notifyNotificationWithChannel = i4 % 128;
            int i5 = i4 % 2;
            fOnWarmupCompleted = ((IAuthTabCallbackStub.onExtraCallbackWithResult) iAuthTabCallbackStub).onExtraCallbackWithResult().onWarmupCompleted();
        }
        return fOnWarmupCompleted + this.requestPostMessageChannelWithExtras;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onNavigationEvent(Canvas canvas) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        for (onWarmupCompleted onwarmupcompleted : this.onTransact) {
            int i2 = getSmallIconId + 87;
            notifyNotificationWithChannel = i2 % 128;
            int i3 = i2 % 2;
            if (onwarmupcompleted instanceof onWarmupCompleted.onExtraCallbackWithResult) {
                char c = this.extraCallback;
                canvas.drawText(String.valueOf(c), ((onWarmupCompleted.onExtraCallbackWithResult) onwarmupcompleted).onNavigationEvent(), readTypedObject(), this.requestPostMessageChannel);
            } else if (onwarmupcompleted instanceof onWarmupCompleted.onNavigationEvent) {
                int i4 = getSmallIconId + 61;
                notifyNotificationWithChannel = i4 % 128;
                int i5 = i4 % 2;
                onWarmupCompleted.onNavigationEvent onnavigationevent = (onWarmupCompleted.onNavigationEvent) onwarmupcompleted;
                onExtraCallbackWithResult(new Object[]{this, Float.valueOf(onnavigationevent.onWarmupCompleted())}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 2126536451, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -2126536431);
                char c2 = this.extraCallback;
                canvas.drawText(String.valueOf(c2), onnavigationevent.onExtraCallbackWithResult(), readTypedObject(), this.requestPostMessageChannel);
                ICustomTabsCallbackStub();
            } else {
                if (!(onwarmupcompleted instanceof onWarmupCompleted.onExtraCallback)) {
                    throw new NoWhenBranchMatchedException();
                }
                onWarmupCompleted.onExtraCallback onextracallback = (onWarmupCompleted.onExtraCallback) onwarmupcompleted;
                onExtraCallbackWithResult(new Object[]{this, Float.valueOf(onextracallback.onExtraCallback())}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 2126536451, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -2126536431);
                char c3 = this.extraCallback;
                canvas.drawText(String.valueOf(c3), onextracallback.onNavigationEvent(), readTypedObject(), this.requestPostMessageChannel);
                ICustomTabsCallbackStub();
                int i6 = getSmallIconId + 73;
                notifyNotificationWithChannel = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onExtraCallback(Canvas canvas, onTransact ontransact) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        if (ontransact == null) {
            return;
        }
        if (ontransact instanceof onTransact.onExtraCallback) {
            canvas.drawText("-", ((onTransact.onExtraCallback) ontransact).onExtraCallbackWithResult(), readTypedObject(), this.requestPostMessageChannel);
            return;
        }
        if (ontransact instanceof onTransact.onWarmupCompleted) {
            int i2 = getSmallIconId + 7;
            notifyNotificationWithChannel = i2 % 128;
            int i3 = i2 % 2;
            onTransact.onWarmupCompleted onwarmupcompleted = (onTransact.onWarmupCompleted) ontransact;
            onExtraCallbackWithResult(new Object[]{this, Float.valueOf(onwarmupcompleted.IAuthTabCallback())}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 2126536451, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -2126536431);
            canvas.drawText("-", onwarmupcompleted.asInterface(), readTypedObject(), this.requestPostMessageChannel);
            ICustomTabsCallbackStub();
            return;
        }
        if (!(ontransact instanceof onTransact.onNavigationEvent)) {
            throw new NoWhenBranchMatchedException();
        }
        int i4 = getSmallIconId + 63;
        notifyNotificationWithChannel = i4 % 128;
        if (i4 % 2 == 0) {
            onTransact.onNavigationEvent onnavigationevent = (onTransact.onNavigationEvent) ontransact;
            onExtraCallbackWithResult(new Object[]{this, Float.valueOf(onnavigationevent.IAuthTabCallback())}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 2126536451, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -2126536431);
            canvas.drawText("-", onnavigationevent.onWarmupCompleted(), readTypedObject(), this.requestPostMessageChannel);
            ICustomTabsCallbackStub();
            return;
        }
        onTransact.onNavigationEvent onnavigationevent2 = (onTransact.onNavigationEvent) ontransact;
        onExtraCallbackWithResult(new Object[]{this, Float.valueOf(onnavigationevent2.IAuthTabCallback())}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 2126536451, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -2126536431);
        canvas.drawText("-", onnavigationevent2.onWarmupCompleted(), readTypedObject(), this.requestPostMessageChannel);
        ICustomTabsCallbackStub();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onExtraCallbackWithResult(Canvas canvas, asInterface asinterface) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 67;
        int i3 = i2 % 128;
        getSmallIconId = i3;
        int i4 = i2 % 2;
        if (asinterface == null) {
            return;
        }
        if (asinterface instanceof asInterface.onWarmupCompleted) {
            int i5 = i3 + 117;
            notifyNotificationWithChannel = i5 % 128;
            int i6 = i5 % 2;
            canvas.drawText(String.valueOf(this.access100), ((asInterface.onWarmupCompleted) asinterface).onExtraCallbackWithResult(), readTypedObject(), this.requestPostMessageChannel);
            return;
        }
        if (!(!(asinterface instanceof asInterface.onExtraCallbackWithResult))) {
            asInterface.onExtraCallbackWithResult onextracallbackwithresult = (asInterface.onExtraCallbackWithResult) asinterface;
            onExtraCallbackWithResult(new Object[]{this, Float.valueOf(onextracallbackwithresult.IAuthTabCallback())}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 2126536451, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -2126536431);
            canvas.drawText(String.valueOf(this.access100), onextracallbackwithresult.onWarmupCompleted(), readTypedObject(), this.requestPostMessageChannel);
            ICustomTabsCallbackStub();
            return;
        }
        if (!(asinterface instanceof asInterface.IAuthTabCallback)) {
            throw new NoWhenBranchMatchedException();
        }
        asInterface.IAuthTabCallback iAuthTabCallback = (asInterface.IAuthTabCallback) asinterface;
        onExtraCallbackWithResult(new Object[]{this, Float.valueOf(iAuthTabCallback.onExtraCallbackWithResult())}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 2126536451, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -2126536431);
        canvas.drawText(String.valueOf(this.access100), iAuthTabCallback.onWarmupCompleted(), readTypedObject(), this.requestPostMessageChannel);
        ICustomTabsCallbackStub();
        int i7 = getSmallIconId + 113;
        notifyNotificationWithChannel = i7 % 128;
        int i8 = i7 % 2;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        TdsRollingNumberV1View tdsRollingNumberV1View = (TdsRollingNumberV1View) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = getSmallIconId + 21;
        notifyNotificationWithChannel = i2 % 128;
        tdsRollingNumberV1View.requestPostMessageChannel.setAlpha(RangesKt.coerceIn((int) (fFloatValue * 255.0f), 0, i2 % 2 != 0 ? 15394 : 255));
        return null;
    }

    private final void ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 41;
        getSmallIconId = i2 % 128;
        this.requestPostMessageChannel.setAlpha(i2 % 2 == 0 ? 26937 : 255);
    }

    public final void setSizeNotCritical(boolean z) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 53;
        int i3 = i2 % 128;
        notifyNotificationWithChannel = i3;
        int i4 = i2 % 2;
        this.onRelationshipValidationResult = z;
        int i5 = i3 + 57;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setLeftCoordinateViews(@NotNull View... viewArr) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 97;
        notifyNotificationWithChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(viewArr, "");
        List<View> list = this.ICustomTabsCallback_Parcel;
        list.clear();
        CollectionsKt.addAll(list, viewArr);
        int i4 = notifyNotificationWithChannel + 83;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setRightCoordinateViews(@NotNull View... viewArr) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 61;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(viewArr, "");
        List<View> list = this.ICustomTabsServiceStubProxy;
        list.clear();
        CollectionsKt.addAll(list, viewArr);
        int i4 = notifyNotificationWithChannel + 57;
        getSmallIconId = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final onNavigationEvent CENTER = new onNavigationEvent("CENTER", 0);
        public static final onNavigationEvent TOP = new onNavigationEvent("TOP", 1);
        public static final onNavigationEvent BOTTOM = new onNavigationEvent("BOTTOM", 2);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 63;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent[] onnavigationeventArr = {CENTER, TOP, BOTTOM};
            int i5 = i2 + 73;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            throw null;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = onExtraCallback + 39;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i4 = onExtraCallback + 65;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onnavigationeventArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onExtraCallbackWithResult + 79;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        private static int onTransact = 1;
        private final float onExtraCallback;
        private final float onExtraCallbackWithResult;
        private final char onNavigationEvent;
        private final int onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                int i4 = i3 + 87;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (this.onNavigationEvent != onextracallbackwithresult.onNavigationEvent || Float.compare(this.onExtraCallback, onextracallbackwithresult.onExtraCallback) != 0 || this.onWarmupCompleted != onextracallbackwithresult.onWarmupCompleted) {
                return false;
            }
            if (Float.compare(this.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallbackWithResult) == 0) {
                return true;
            }
            int i6 = onTransact + 7;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Character.hashCode(this.onNavigationEvent);
            return i3 == 0 ? (((((iHashCode << 6) / Float.hashCode(this.onExtraCallback)) >>> 46) - Integer.hashCode(this.onWarmupCompleted)) + 69) >>> Float.hashCode(this.onExtraCallbackWithResult) : (((((iHashCode * 31) + Float.hashCode(this.onExtraCallback)) * 31) + Integer.hashCode(this.onWarmupCompleted)) * 31) + Float.hashCode(this.onExtraCallbackWithResult);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Blank(char=" + this.onNavigationEvent + ", xOffset=" + this.onExtraCallback + ", digitIdx=" + this.onWarmupCompleted + ", width=" + this.onExtraCallbackWithResult + ")";
            int i2 = onTransact + 49;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onExtraCallbackWithResult(char c, float f, int i, float f2) {
            this.onNavigationEvent = c;
            this.onExtraCallback = f;
            this.onWarmupCompleted = i;
            this.onExtraCallbackWithResult = f2;
        }

        public final char onExtraCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 25;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onNavigationEvent;
            }
            throw null;
        }

        public final float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 25;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.onWarmupCompleted;
            int i6 = i2 + 75;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }
    }

    public static abstract class IAuthTabCallbackStub {
        public /* synthetic */ IAuthTabCallbackStub(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class onWarmupCompleted extends IAuthTabCallbackStub {
            private static int asInterface = 1;
            private static int onExtraCallbackWithResult;
            private final onExtraCallbackWithResult IAuthTabCallback;
            private float onExtraCallback;
            private final onExtraCallbackWithResult onNavigationEvent;
            private final int onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = asInterface + 113;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(obj instanceof onWarmupCompleted)) {
                    int i4 = onExtraCallbackWithResult + 91;
                    asInterface = i4 % 128;
                    return i4 % 2 == 0;
                }
                onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
                if (this.onWarmupCompleted != onwarmupcompleted.onWarmupCompleted) {
                    int i5 = asInterface + 71;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback)) {
                    int i7 = asInterface + 107;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }
                if (!(!Intrinsics.areEqual(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent))) {
                    return true;
                }
                int i9 = onExtraCallbackWithResult + 77;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = asInterface + 1;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = (((Integer.hashCode(this.onWarmupCompleted) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode();
                int i4 = onExtraCallbackWithResult + 117;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Remain(xDelay=" + this.onWarmupCompleted + ", fromBlank=" + this.IAuthTabCallback + ", toBlank=" + this.onNavigationEvent + ")";
                int i2 = asInterface + 1;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onWarmupCompleted(int i, @NotNull onExtraCallbackWithResult onextracallbackwithresult, @NotNull onExtraCallbackWithResult onextracallbackwithresult2) {
                super(null);
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                Intrinsics.checkNotNullParameter(onextracallbackwithresult2, "");
                this.onWarmupCompleted = i;
                this.IAuthTabCallback = onextracallbackwithresult;
                this.onNavigationEvent = onextracallbackwithresult2;
                this.onExtraCallback = onextracallbackwithresult.onWarmupCompleted();
            }

            public final int onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 117;
                asInterface = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.onWarmupCompleted;
                }
                throw null;
            }

            public final onExtraCallbackWithResult IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 123;
                int i3 = i2 % 128;
                asInterface = i3;
                int i4 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = this.IAuthTabCallback;
                int i5 = i3 + 27;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return onextracallbackwithresult;
                }
                throw null;
            }

            public final onExtraCallbackWithResult onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 15;
                int i3 = i2 % 128;
                asInterface = i3;
                int i4 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = this.onNavigationEvent;
                int i5 = i3 + 9;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return onextracallbackwithresult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final float onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 73;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                float f = this.onExtraCallback;
                int i5 = i2 + 123;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return f;
            }

            public final void onWarmupCompleted(float f) {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 69;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                this.onExtraCallback = f;
                int i5 = i2 + 107;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        }

        private IAuthTabCallbackStub() {
        }

        public static final class onNavigationEvent extends IAuthTabCallbackStub {
            private static int IAuthTabCallbackStub = 1;
            private static int onTransact;
            private final List<String> IAuthTabCallback;
            private final int IAuthTabCallbackDefault;
            private float asBinder;
            private float asInterface;
            private final onExtraCallbackWithResult onExtraCallback;
            private final boolean onExtraCallbackWithResult;
            private final onExtraCallbackWithResult onNavigationEvent;
            private final int onWarmupCompleted;

            public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
                int i7 = ~i6;
                int i8 = ~i;
                int i9 = (~(i7 | i4)) | (~(i7 | i8));
                int i10 = ~i4;
                int i11 = (~(i | i10 | i6)) | i9;
                int i12 = ~(i8 | i10);
                int i13 = i4 + i6 + i2 + ((-1228711472) * i5) + ((-141981132) * i3);
                int i14 = i13 * i13;
                int i15 = (((-639131287) * i4) - 2072313856) + (1118068377 * i6) + (i11 * (-1268883816)) + ((-1757199664) * i9) + ((-1268883816) * i12) + ((-1908015104) * i2) + ((-287309824) * i5) + ((-1573388288) * i3) + ((-2138374144) * i14);
                int i16 = ((i4 * (-646461497)) - 273503129) + (i6 * (-646460521)) + (i11 * 488) + (i9 * (-976)) + (i12 * 488) + (i2 * (-646461009)) + (i5 * 1623110960) + (i3 * (-2035004020)) + (i14 * 33882112);
                if (i15 + (i16 * i16 * (-1051394048)) != 1) {
                    return onExtraCallback(objArr);
                }
                onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
                int i17 = 2 % 2;
                int i18 = onTransact;
                int i19 = i18 + 19;
                IAuthTabCallbackStub = i19 % 128;
                int i20 = i19 % 2;
                int i21 = onnavigationevent.IAuthTabCallbackDefault;
                int i22 = i18 + 37;
                IAuthTabCallbackStub = i22 % 128;
                int i23 = i22 % 2;
                return Integer.valueOf(i21);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onNavigationEvent)) {
                    return false;
                }
                onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
                if (this.onWarmupCompleted != onnavigationevent.onWarmupCompleted) {
                    return false;
                }
                if (this.IAuthTabCallbackDefault != onnavigationevent.IAuthTabCallbackDefault) {
                    int i2 = onTransact + 95;
                    IAuthTabCallbackStub = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback)) {
                    int i4 = onTransact + 9;
                    IAuthTabCallbackStub = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent)) {
                    if (this.onExtraCallbackWithResult != onnavigationevent.onExtraCallbackWithResult) {
                        int i6 = onTransact + 121;
                        IAuthTabCallbackStub = i6 % 128;
                        int i7 = i6 % 2;
                        return false;
                    }
                    if (Intrinsics.areEqual(this.IAuthTabCallback, onnavigationevent.IAuthTabCallback)) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onTransact + 17;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = (((((((((Integer.hashCode(this.onWarmupCompleted) * 31) + Integer.hashCode(this.IAuthTabCallbackDefault)) * 31) + this.onExtraCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult)) * 31) + this.IAuthTabCallback.hashCode();
                int i4 = IAuthTabCallbackStub + 13;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Replace(xDelay=" + this.onWarmupCompleted + ", yDelay=" + this.IAuthTabCallbackDefault + ", fromBlank=" + this.onExtraCallback + ", toBlank=" + this.onNavigationEvent + ", ascendingOrder=" + this.onExtraCallbackWithResult + ", numbers=" + this.IAuthTabCallback + ")";
                int i2 = IAuthTabCallbackStub + 31;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onNavigationEvent(int i, int i2, @NotNull onExtraCallbackWithResult onextracallbackwithresult, @NotNull onExtraCallbackWithResult onextracallbackwithresult2, boolean z, @NotNull List<String> list) {
                super(null);
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                Intrinsics.checkNotNullParameter(onextracallbackwithresult2, "");
                Intrinsics.checkNotNullParameter(list, "");
                this.onWarmupCompleted = i;
                this.IAuthTabCallbackDefault = i2;
                this.onExtraCallback = onextracallbackwithresult;
                this.onNavigationEvent = onextracallbackwithresult2;
                this.onExtraCallbackWithResult = z;
                this.IAuthTabCallback = list;
                this.asBinder = onextracallbackwithresult.onWarmupCompleted();
            }

            private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
                onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
                int i = 2 % 2;
                int i2 = onTransact + 51;
                int i3 = i2 % 128;
                IAuthTabCallbackStub = i3;
                int i4 = i2 % 2;
                int i5 = onnavigationevent.onWarmupCompleted;
                int i6 = i3 + 71;
                onTransact = i6 % 128;
                if (i6 % 2 == 0) {
                    return Integer.valueOf(i5);
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onExtraCallbackWithResult onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 115;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.onExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onExtraCallbackWithResult IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 61;
                int i3 = i2 % 128;
                onTransact = i3;
                int i4 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = this.onNavigationEvent;
                int i5 = i3 + 103;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return onextracallbackwithresult;
            }

            public final boolean onExtraCallback() {
                int i = 2 % 2;
                int i2 = onTransact + 73;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                boolean z = this.onExtraCallbackWithResult;
                if (i3 == 0) {
                    int i4 = 28 / 0;
                }
                return z;
            }

            public final List<String> onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onTransact;
                int i3 = i2 + 75;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                List<String> list = this.IAuthTabCallback;
                int i5 = i2 + 9;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return list;
            }

            public final float asInterface() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 21;
                int i3 = i2 % 128;
                onTransact = i3;
                int i4 = i2 % 2;
                float f = this.asBinder;
                int i5 = i3 + 47;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return f;
            }

            public final void onExtraCallback(float f) {
                int i = 2 % 2;
                int i2 = onTransact;
                int i3 = i2 + 95;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                this.asBinder = f;
                int i5 = i2 + 49;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
            }

            public final float asBinder() {
                int i = 2 % 2;
                int i2 = onTransact + 45;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                float f = this.asInterface;
                if (i3 == 0) {
                    int i4 = 18 / 0;
                }
                return f;
            }

            public final void onWarmupCompleted(float f) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 59;
                int i3 = i2 % 128;
                onTransact = i3;
                int i4 = i2 % 2;
                this.asInterface = f;
                if (i4 != 0) {
                    throw null;
                }
                int i5 = i3 + 37;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 17 / 0;
                }
            }

            public final int onWarmupCompleted() {
                int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                return ((Integer) IAuthTabCallback(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{this}, 1443991819, iOnExtraCallbackWithResult3, -1443991819)).intValue();
            }

            public final int IAuthTabCallbackDefault() {
                int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                return ((Integer) IAuthTabCallback(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{this}, 945470556, iOnExtraCallbackWithResult3, -945470555)).intValue();
            }
        }

        public static final class onExtraCallback extends IAuthTabCallbackStub {
            private static int IAuthTabCallbackStub = 1;
            private static int asInterface;
            private final boolean IAuthTabCallback;
            private final int IAuthTabCallbackDefault;
            private final List<String> onExtraCallback;
            private final int onExtraCallbackWithResult;
            private float onNavigationEvent;
            private float onTransact;
            private final onExtraCallbackWithResult onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 121;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onExtraCallback)) {
                    return false;
                }
                onExtraCallback onextracallback = (onExtraCallback) obj;
                if (this.onExtraCallbackWithResult != onextracallback.onExtraCallbackWithResult) {
                    int i4 = i2 + 103;
                    IAuthTabCallbackStub = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (this.IAuthTabCallbackDefault != onextracallback.IAuthTabCallbackDefault) {
                    int i6 = i2 + 15;
                    IAuthTabCallbackStub = i6 % 128;
                    return i6 % 2 == 0;
                }
                if (!Intrinsics.areEqual(this.onWarmupCompleted, onextracallback.onWarmupCompleted)) {
                    return false;
                }
                if (this.IAuthTabCallback != onextracallback.IAuthTabCallback) {
                    int i7 = IAuthTabCallbackStub + 55;
                    asInterface = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.onExtraCallback, onextracallback.onExtraCallback)) {
                    return true;
                }
                int i9 = asInterface + 51;
                IAuthTabCallbackStub = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 97;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = (((((((Integer.hashCode(this.onExtraCallbackWithResult) * 31) + Integer.hashCode(this.IAuthTabCallbackDefault)) * 31) + this.onWarmupCompleted.hashCode()) * 31) + Boolean.hashCode(this.IAuthTabCallback)) * 31) + this.onExtraCallback.hashCode();
                int i4 = asInterface + 125;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Appear(xDelay=" + this.onExtraCallbackWithResult + ", yDelay=" + this.IAuthTabCallbackDefault + ", toBlank=" + this.onWarmupCompleted + ", ascendingOrder=" + this.IAuthTabCallback + ", numbers=" + this.onExtraCallback + ")";
                int i2 = IAuthTabCallbackStub + 29;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallback(int i, int i2, @NotNull onExtraCallbackWithResult onextracallbackwithresult, boolean z, @NotNull List<String> list) {
                super(null);
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                Intrinsics.checkNotNullParameter(list, "");
                this.onExtraCallbackWithResult = i;
                this.IAuthTabCallbackDefault = i2;
                this.onWarmupCompleted = onextracallbackwithresult;
                this.IAuthTabCallback = z;
                this.onExtraCallback = list;
            }

            public final int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub;
                int i3 = i2 + 111;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                int i5 = this.onExtraCallbackWithResult;
                int i6 = i2 + 73;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                return i5;
            }

            public final int IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 69;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = this.IAuthTabCallbackDefault;
                int i5 = i2 + 45;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 79 / 0;
                }
                return i4;
            }

            public final onExtraCallbackWithResult onNavigationEvent() {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 5;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = this.onWarmupCompleted;
                int i5 = i2 + 37;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 != 0) {
                    return onextracallbackwithresult;
                }
                throw null;
            }

            public final boolean IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = asInterface + 67;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                boolean z = this.IAuthTabCallback;
                if (i3 == 0) {
                    int i4 = 13 / 0;
                }
                return z;
            }

            public final List<String> onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = asInterface + 61;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                List<String> list = this.onExtraCallback;
                if (i3 == 0) {
                    int i4 = 44 / 0;
                }
                return list;
            }

            public final float onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub;
                int i3 = i2 + 37;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                float f = this.onNavigationEvent;
                int i5 = i2 + 13;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    return f;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final void onWarmupCompleted(float f) {
                int i = 2 % 2;
                int i2 = asInterface + 91;
                int i3 = i2 % 128;
                IAuthTabCallbackStub = i3;
                int i4 = i2 % 2;
                this.onNavigationEvent = f;
                if (i4 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 71;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
            }

            public final float IAuthTabCallbackDefault() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 49;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                float f = this.onTransact;
                if (i3 != 0) {
                    int i4 = 5 / 0;
                }
                return f;
            }

            public final void onExtraCallback(float f) {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 15;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                this.onTransact = f;
                if (i4 == 0) {
                    throw null;
                }
                int i5 = i2 + 77;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
            }
        }

        public static final class onExtraCallbackWithResult extends IAuthTabCallbackStub {
            private static int IAuthTabCallbackStub = 1;
            private static int asInterface;
            private float IAuthTabCallback;
            private float IAuthTabCallbackDefault;
            private final List<String> onExtraCallback;
            private final int onExtraCallbackWithResult;
            private final onExtraCallbackWithResult onNavigationEvent;
            private final int onTransact;
            private final boolean onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub;
                int i3 = i2 + 9;
                int i4 = i3 % 128;
                asInterface = i4;
                if (i3 % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (this == obj) {
                    int i5 = i2 + 63;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
                if (!(obj instanceof onExtraCallbackWithResult)) {
                    return false;
                }
                onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
                if (this.onExtraCallbackWithResult != onextracallbackwithresult.onExtraCallbackWithResult) {
                    int i7 = i4 + 15;
                    IAuthTabCallbackStub = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }
                if (this.onTransact != onextracallbackwithresult.onTransact) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent)) {
                    int i9 = IAuthTabCallbackStub + 23;
                    asInterface = i9 % 128;
                    int i10 = i9 % 2;
                    return false;
                }
                if (this.onWarmupCompleted == onextracallbackwithresult.onWarmupCompleted) {
                    return Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback);
                }
                int i11 = IAuthTabCallbackStub + 19;
                asInterface = i11 % 128;
                return i11 % 2 != 0;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 69;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = (((((((Integer.hashCode(this.onExtraCallbackWithResult) * 31) + Integer.hashCode(this.onTransact)) * 31) + this.onNavigationEvent.hashCode()) * 31) + Boolean.hashCode(this.onWarmupCompleted)) * 31) + this.onExtraCallback.hashCode();
                int i4 = IAuthTabCallbackStub + 59;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 23 / 0;
                }
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Disappear(xDelay=" + this.onExtraCallbackWithResult + ", yDelay=" + this.onTransact + ", fromBlank=" + this.onNavigationEvent + ", ascendingOrder=" + this.onWarmupCompleted + ", numbers=" + this.onExtraCallback + ")";
                int i2 = IAuthTabCallbackStub + 73;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallbackWithResult(int i, int i2, @NotNull onExtraCallbackWithResult onextracallbackwithresult, boolean z, @NotNull List<String> list) {
                super(null);
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                Intrinsics.checkNotNullParameter(list, "");
                this.onExtraCallbackWithResult = i;
                this.onTransact = i2;
                this.onNavigationEvent = onextracallbackwithresult;
                this.onWarmupCompleted = z;
                this.onExtraCallback = list;
                this.IAuthTabCallback = 1.0f;
            }

            public final int onNavigationEvent() {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 91;
                IAuthTabCallbackStub = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i4 = this.onExtraCallbackWithResult;
                int i5 = i2 + 89;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 != 0) {
                    return i4;
                }
                obj.hashCode();
                throw null;
            }

            public final int IAuthTabCallbackDefault() {
                int i = 2 % 2;
                int i2 = asInterface + 73;
                int i3 = i2 % 128;
                IAuthTabCallbackStub = i3;
                int i4 = i2 % 2;
                int i5 = this.onTransact;
                int i6 = i3 + 29;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                return i5;
            }

            public final onExtraCallbackWithResult onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub;
                int i3 = i2 + 57;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = this.onNavigationEvent;
                int i5 = i2 + 113;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                return onextracallbackwithresult;
            }

            public final boolean IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 11;
                int i3 = i2 % 128;
                asInterface = i3;
                int i4 = i2 % 2;
                boolean z = this.onWarmupCompleted;
                int i5 = i3 + 5;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 != 0) {
                    return z;
                }
                throw null;
            }

            public final List<String> onExtraCallback() {
                int i = 2 % 2;
                int i2 = asInterface + 67;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.onExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final float onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 71;
                int i3 = i2 % 128;
                asInterface = i3;
                int i4 = i2 % 2;
                float f = this.IAuthTabCallback;
                int i5 = i3 + 95;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 != 0) {
                    return f;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final void onWarmupCompleted(float f) {
                int i = 2 % 2;
                int i2 = asInterface + 53;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                this.IAuthTabCallback = f;
                if (i3 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final float asInterface() {
                int i = 2 % 2;
                int i2 = asInterface + 73;
                int i3 = i2 % 128;
                IAuthTabCallbackStub = i3;
                int i4 = i2 % 2;
                float f = this.IAuthTabCallbackDefault;
                int i5 = i3 + 19;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                return f;
            }

            public final void onNavigationEvent(float f) {
                int i = 2 % 2;
                int i2 = asInterface + 47;
                int i3 = i2 % 128;
                IAuthTabCallbackStub = i3;
                int i4 = i2 % 2;
                this.IAuthTabCallbackDefault = f;
                int i5 = i3 + 29;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    public static abstract class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public static final class onExtraCallbackWithResult extends onWarmupCompleted {
            private static int IAuthTabCallbackDefault = 1;
            private static int onNavigationEvent;
            private float IAuthTabCallback;
            private final float onExtraCallback;
            private final int onExtraCallbackWithResult;
            private final float onWarmupCompleted;

            public onExtraCallbackWithResult(int i, float f, float f2) {
                super(null);
                this.onExtraCallbackWithResult = i;
                this.onExtraCallback = f;
                this.onWarmupCompleted = f2;
                this.IAuthTabCallback = f;
            }

            public int onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 23;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                int i4 = i2 % 2;
                int i5 = this.onExtraCallbackWithResult;
                int i6 = i3 + 59;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 96 / 0;
                }
                return i5;
            }

            public final float onExtraCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 117;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                Object obj = null;
                if (i2 % 2 == 0) {
                    throw null;
                }
                float f = this.onExtraCallback;
                int i4 = i3 + 55;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return f;
                }
                obj.hashCode();
                throw null;
            }

            public final float IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 59;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                float f = this.onWarmupCompleted;
                if (i3 == 0) {
                    int i4 = 27 / 0;
                }
                return f;
            }

            public final void IAuthTabCallback(float f) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 7;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                this.IAuthTabCallback = f;
                int i5 = i3 + 61;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public final float onNavigationEvent() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault;
                int i3 = i2 + 21;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                float f = this.IAuthTabCallback;
                int i5 = i2 + 1;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return f;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static final class onNavigationEvent extends onWarmupCompleted {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private final float IAuthTabCallback;
            private float onExtraCallback;
            private final int onWarmupCompleted;

            public onNavigationEvent(int i, float f) {
                super(null);
                this.onWarmupCompleted = i;
                this.IAuthTabCallback = f;
            }

            public int onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 113;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = this.onWarmupCompleted;
                int i5 = i2 + 45;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return i4;
            }

            public final float onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 83;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                float f = this.IAuthTabCallback;
                if (i3 == 0) {
                    int i4 = 33 / 0;
                }
                return f;
            }

            public final void onNavigationEvent(float f) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 39;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                this.onExtraCallback = f;
                if (i4 != 0) {
                    throw null;
                }
                int i5 = i2 + 31;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 51 / 0;
                }
            }

            public final float onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 91;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                float f = this.onExtraCallback;
                int i5 = i2 + 63;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return f;
            }
        }

        public static final class onExtraCallback extends onWarmupCompleted {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            private float IAuthTabCallback;
            private final float onExtraCallback;
            private final int onExtraCallbackWithResult;

            public onExtraCallback(int i, float f) {
                super(null);
                this.onExtraCallbackWithResult = i;
                this.onExtraCallback = f;
                this.IAuthTabCallback = 1.0f;
            }

            public int IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 43;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.onExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final float onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 85;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.onExtraCallback;
                }
                throw null;
            }

            public final void IAuthTabCallback(float f) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 53;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                this.IAuthTabCallback = f;
                if (i4 != 0) {
                    throw null;
                }
                int i5 = i2 + 93;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }

            public final float onExtraCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 25;
                onNavigationEvent = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    throw null;
                }
                float f = this.IAuthTabCallback;
                int i4 = i2 + 31;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return f;
                }
                obj.hashCode();
                throw null;
            }
        }
    }

    public static abstract class onTransact {
        public /* synthetic */ onTransact(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int onNavigationEvent();

        private onTransact() {
        }

        public static final class onExtraCallback extends onTransact {
            private static int IAuthTabCallbackDefault = 0;
            private static int onTransact = 1;
            private final Pair<Interpolator, Integer> IAuthTabCallback;
            private final float onExtraCallback;
            private float onExtraCallbackWithResult;
            private final int onNavigationEvent;
            private final float onWarmupCompleted;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public onExtraCallback(int i, float f, float f2, @NotNull Pair<? extends Interpolator, Integer> pair) {
                super(null);
                Intrinsics.checkNotNullParameter(pair, "");
                this.onNavigationEvent = i;
                this.onWarmupCompleted = f;
                this.onExtraCallback = f2;
                this.IAuthTabCallback = pair;
                this.onExtraCallbackWithResult = IAuthTabCallback();
            }

            @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.onTransact
            public int onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onTransact + 49;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                int i4 = i2 % 2;
                int i5 = this.onNavigationEvent;
                int i6 = i3 + 97;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                return i5;
            }

            public float IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault;
                int i3 = i2 + 105;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                float f = this.onWarmupCompleted;
                int i5 = i2 + 73;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return f;
            }

            public float onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onTransact + 97;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                int i4 = i2 % 2;
                float f = this.onExtraCallback;
                int i5 = i3 + 35;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return f;
            }

            public Pair<Interpolator, Integer> onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 91;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.IAuthTabCallback;
                }
                throw null;
            }

            public final float onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 107;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.onExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final void onWarmupCompleted(float f) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 9;
                int i3 = i2 % 128;
                onTransact = i3;
                int i4 = i2 % 2;
                this.onExtraCallbackWithResult = f;
                if (i4 == 0) {
                    int i5 = 5 / 0;
                }
                int i6 = i3 + 11;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
            }
        }

        public static final class onWarmupCompleted extends onTransact {
            private static int IAuthTabCallbackDefault = 1;
            private static int IAuthTabCallbackStub;
            private final int IAuthTabCallback;
            private float asInterface;
            private float onExtraCallback;
            private final Pair<Interpolator, Integer> onExtraCallbackWithResult;
            private final float onNavigationEvent;
            private final float onWarmupCompleted;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public onWarmupCompleted(int i, float f, float f2, @NotNull Pair<? extends Interpolator, Integer> pair) {
                super(null);
                Intrinsics.checkNotNullParameter(pair, "");
                this.IAuthTabCallback = i;
                this.onWarmupCompleted = f;
                this.onNavigationEvent = f2;
                this.onExtraCallbackWithResult = pair;
                this.asInterface = onExtraCallback();
            }

            @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.onTransact
            public int onNavigationEvent() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 11;
                int i3 = i2 % 128;
                IAuthTabCallbackStub = i3;
                if (i2 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = this.IAuthTabCallback;
                int i5 = i3 + 9;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 8 / 0;
                }
                return i4;
            }

            public float onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault;
                int i3 = i2 + 77;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                float f = this.onWarmupCompleted;
                int i5 = i2 + 15;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return f;
            }

            public float onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault;
                int i3 = i2 + 71;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                float f = this.onNavigationEvent;
                int i5 = i2 + 101;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return f;
            }

            public Pair<Interpolator, Integer> onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 27;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                int i4 = i2 % 2;
                Pair<Interpolator, Integer> pair = this.onExtraCallbackWithResult;
                int i5 = i3 + 55;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return pair;
            }

            public final float IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 21;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.onExtraCallback;
                }
                throw null;
            }

            public final void onWarmupCompleted(float f) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 21;
                int i3 = i2 % 128;
                IAuthTabCallbackStub = i3;
                int i4 = i2 % 2;
                this.onExtraCallback = f;
                int i5 = i3 + 77;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
            }

            public final void IAuthTabCallback(float f) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 117;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                int i4 = i2 % 2;
                this.asInterface = f;
                if (i4 == 0) {
                    int i5 = 13 / 0;
                }
                int i6 = i3 + 47;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
            }

            public final float asInterface() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 59;
                int i3 = i2 % 128;
                IAuthTabCallbackStub = i3;
                int i4 = i2 % 2;
                float f = this.asInterface;
                int i5 = i3 + 39;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return f;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static final class onNavigationEvent extends onTransact {
            private static int IAuthTabCallbackDefault = 1;
            private static int asInterface;
            private final float IAuthTabCallback;
            private final float onExtraCallback;
            private final int onExtraCallbackWithResult;
            private float onNavigationEvent;
            private final Pair<Interpolator, Integer> onWarmupCompleted;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public onNavigationEvent(int i, float f, float f2, @NotNull Pair<? extends Interpolator, Integer> pair) {
                super(null);
                Intrinsics.checkNotNullParameter(pair, "");
                this.onExtraCallbackWithResult = i;
                this.IAuthTabCallback = f;
                this.onExtraCallback = f2;
                this.onWarmupCompleted = pair;
                this.onNavigationEvent = 1.0f;
            }

            @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.onTransact
            public int onNavigationEvent() {
                int i = 2 % 2;
                int i2 = asInterface + 119;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                int i4 = this.onExtraCallbackWithResult;
                if (i3 == 0) {
                    int i5 = 48 / 0;
                }
                return i4;
            }

            public float onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 67;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                float f = this.IAuthTabCallback;
                int i5 = i2 + 89;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return f;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final float IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 81;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                float f = this.onNavigationEvent;
                int i5 = i2 + 71;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 / 0;
                }
                return f;
            }

            public final void onExtraCallback(float f) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 93;
                int i3 = i2 % 128;
                asInterface = i3;
                int i4 = i2 % 2;
                Object obj = null;
                this.onNavigationEvent = f;
                if (i4 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 35;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
    }

    public static abstract class asInterface {
        public /* synthetic */ asInterface(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int onExtraCallback();

        private asInterface() {
        }

        public static final class onWarmupCompleted extends asInterface {
            private static int asInterface = 0;
            private static int onTransact = 1;
            private float IAuthTabCallback;
            private final Pair<Interpolator, Integer> onExtraCallback;
            private final int onExtraCallbackWithResult;
            private final float onNavigationEvent;
            private final float onWarmupCompleted;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public onWarmupCompleted(int i, float f, float f2, @NotNull Pair<? extends Interpolator, Integer> pair) {
                super(null);
                Intrinsics.checkNotNullParameter(pair, "");
                this.onExtraCallbackWithResult = i;
                this.onWarmupCompleted = f;
                this.onNavigationEvent = f2;
                this.onExtraCallback = pair;
                this.IAuthTabCallback = f;
            }

            @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.asInterface
            public int onExtraCallback() {
                int i = 2 % 2;
                int i2 = onTransact + 89;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.onExtraCallbackWithResult;
                }
                throw null;
            }

            public final float onNavigationEvent() {
                int i = 2 % 2;
                int i2 = asInterface + 53;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.onWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final float IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = asInterface + 31;
                int i3 = i2 % 128;
                onTransact = i3;
                int i4 = i2 % 2;
                float f = this.onNavigationEvent;
                int i5 = i3 + 19;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    return f;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public Pair<Interpolator, Integer> onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 85;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                Pair<Interpolator, Integer> pair = this.onExtraCallback;
                int i5 = i2 + 83;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return pair;
            }

            public final void onExtraCallback(float f) {
                int i = 2 % 2;
                int i2 = onTransact + 81;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                this.IAuthTabCallback = f;
                if (i3 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final float onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = asInterface + 71;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.IAuthTabCallback;
                }
                throw null;
            }
        }

        public static final class onExtraCallbackWithResult extends asInterface {
            private static int IAuthTabCallbackDefault = 1;
            private static int onExtraCallback;
            private float IAuthTabCallback;
            private final Pair<Interpolator, Integer> onExtraCallbackWithResult;
            private final int onNavigationEvent;
            private final float onWarmupCompleted;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public onExtraCallbackWithResult(int i, float f, @NotNull Pair<? extends Interpolator, Integer> pair) {
                super(null);
                Intrinsics.checkNotNullParameter(pair, "");
                this.onNavigationEvent = i;
                this.onWarmupCompleted = f;
                this.onExtraCallbackWithResult = pair;
            }

            @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.asInterface
            public int onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 89;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                int i4 = this.onNavigationEvent;
                int i5 = i3 + 57;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return i4;
            }

            public final float onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 11;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                float f = this.onWarmupCompleted;
                int i5 = i2 + 47;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                return f;
            }

            public Pair<Interpolator, Integer> onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 25;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                Pair<Interpolator, Integer> pair = this.onExtraCallbackWithResult;
                int i5 = i2 + 45;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                return pair;
            }

            public final float IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 33;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.IAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final void onExtraCallbackWithResult(float f) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 55;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                int i4 = i2 % 2;
                this.IAuthTabCallback = f;
                int i5 = i3 + 99;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        }

        public static final class IAuthTabCallback extends asInterface {
            private static int IAuthTabCallback = 0;
            private static int asBinder = 1;
            private final float onExtraCallback;
            private float onExtraCallbackWithResult;
            private final int onNavigationEvent;
            private final Pair<Interpolator, Integer> onWarmupCompleted;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public IAuthTabCallback(int i, float f, @NotNull Pair<? extends Interpolator, Integer> pair) {
                super(null);
                Intrinsics.checkNotNullParameter(pair, "");
                this.onNavigationEvent = i;
                this.onExtraCallback = f;
                this.onWarmupCompleted = pair;
                this.onExtraCallbackWithResult = 1.0f;
            }

            @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.asInterface
            public int onExtraCallback() {
                int i = 2 % 2;
                int i2 = asBinder + 63;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                Object obj = null;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = this.onNavigationEvent;
                int i5 = i3 + 15;
                asBinder = i5 % 128;
                if (i5 % 2 != 0) {
                    return i4;
                }
                obj.hashCode();
                throw null;
            }

            public final float onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 15;
                int i3 = i2 % 128;
                asBinder = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                float f = this.onExtraCallback;
                int i4 = i3 + 17;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return f;
            }

            public Pair<Interpolator, Integer> IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 59;
                int i3 = i2 % 128;
                asBinder = i3;
                int i4 = i2 % 2;
                Pair<Interpolator, Integer> pair = this.onWarmupCompleted;
                int i5 = i3 + 85;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return pair;
            }

            public final float onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 57;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                float f = this.onExtraCallbackWithResult;
                if (i3 == 0) {
                    int i4 = 81 / 0;
                }
                return f;
            }

            public final void onWarmupCompleted(float f) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 61;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                this.onExtraCallbackWithResult = f;
                if (i3 == 0) {
                    int i4 = 41 / 0;
                }
            }
        }
    }

    public interface IAuthTabCallbackStubProxy {

        public static final class onNavigationEvent implements IAuthTabCallbackStubProxy {
            private static int IAuthTabCallback = 0;
            public static final onNavigationEvent onExtraCallback = new onNavigationEvent();
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted = 1;

            static {
                int i = onNavigationEvent + 13;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
            
                r7 = 21 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
            
                if ((r7 instanceof im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.IAuthTabCallbackStubProxy.onNavigationEvent) != false) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
            
                r1 = r1 + 99;
                im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.IAuthTabCallbackStubProxy.onNavigationEvent.IAuthTabCallback = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r6 == r7) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r6 == r7) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                r3 = r3 + 47;
                im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.IAuthTabCallbackStubProxy.onNavigationEvent.onWarmupCompleted = r3 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
            
                if ((r3 % 2) != 0) goto L11;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 41;
                int i4 = i3 % 128;
                IAuthTabCallback = i4;
                if (i3 % 2 != 0) {
                    int i5 = 8 / 0;
                }
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 53;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return -1591823529;
                }
                int i3 = 97 / 0;
                return -1591823529;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 15;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                if (i2 % 2 != 0) {
                    int i4 = 93 / 0;
                }
                int i5 = i3 + 117;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 32 / 0;
                }
                return "AUTO";
            }

            private onNavigationEvent() {
            }
        }

        public static final class onExtraCallback implements IAuthTabCallbackStubProxy {
            public static final onExtraCallback IAuthTabCallback = new onExtraCallback();
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallback + 35;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 9;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (this != obj) {
                    return obj instanceof onExtraCallback;
                }
                int i4 = i3 + 39;
                onNavigationEvent = i4 % 128;
                return i4 % 2 == 0;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 49;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return -1087688125;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 97;
                onExtraCallbackWithResult = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = i2 + 87;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return "UP";
                }
                obj.hashCode();
                throw null;
            }

            private onExtraCallback() {
            }
        }

        public static final class onWarmupCompleted implements IAuthTabCallbackStubProxy {
            public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted = 1;

            static {
                int i = onNavigationEvent + 47;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this != obj) {
                    if (obj instanceof onWarmupCompleted) {
                        return true;
                    }
                    int i2 = onWarmupCompleted + 11;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                int i4 = onWarmupCompleted + 89;
                int i5 = i4 % 128;
                onExtraCallback = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 83;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    return true;
                }
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 97;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 95;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return -1591739830;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 107;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = i2 + 101;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return "DOWN";
            }

            private onWarmupCompleted() {
            }
        }
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int asBinder = 1;
        private final float onExtraCallback;
        private final float onExtraCallbackWithResult;
        private final Pair<Interpolator, Integer> onNavigationEvent;
        private final int onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        public onExtraCallback(int i, float f, float f2, @NotNull Pair<? extends Interpolator, Integer> pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            this.onWarmupCompleted = i;
            this.onExtraCallbackWithResult = f;
            this.onExtraCallback = f2;
            this.onNavigationEvent = pair;
        }

        public final int onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            float f = this.onExtraCallbackWithResult;
            if (i3 != 0) {
                int i4 = 15 / 0;
            }
            return f;
        }

        public final float onExtraCallback() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 101;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            float f = this.onExtraCallback;
            int i5 = i2 + 39;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Pair<Interpolator, Integer> IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            int i3 = i2 % 128;
            asBinder = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            Pair<Interpolator, Integer> pair = this.onNavigationEvent;
            int i4 = i3 + 3;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return pair;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallback {
        private static int asInterface = 1;
        private static int onWarmupCompleted;
        private final int IAuthTabCallback;
        private final Pair<Interpolator, Integer> onExtraCallback;
        private final float onExtraCallbackWithResult;
        private final float onNavigationEvent;

        /* JADX WARN: Multi-variable type inference failed */
        public IAuthTabCallback(int i, float f, float f2, @NotNull Pair<? extends Interpolator, Integer> pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            this.IAuthTabCallback = i;
            this.onExtraCallbackWithResult = f;
            this.onNavigationEvent = f2;
            this.onExtraCallback = pair;
        }

        public final int IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 107;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = this.IAuthTabCallback;
            int i5 = i2 + 23;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        public final float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface + 3;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            float f = this.onExtraCallbackWithResult;
            int i5 = i3 + 73;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return f;
            }
            throw null;
        }

        public final float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 41;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            float f = this.onNavigationEvent;
            int i5 = i2 + 53;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Pair<Interpolator, Integer> onNavigationEvent() {
            Pair<Interpolator, Integer> pair;
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 107;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                pair = this.onExtraCallback;
                int i4 = 59 / 0;
            } else {
                pair = this.onExtraCallback;
            }
            int i5 = i2 + 119;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return pair;
            }
            throw null;
        }
    }

    static final class IAuthTabCallbackDefault {
        private static int asBinder = 1;
        private static int onExtraCallback;
        private Bitmap IAuthTabCallback;
        private Bitmap onExtraCallbackWithResult;
        private Drawable onNavigationEvent;
        private Drawable onWarmupCompleted;

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
            int i7 = ~i5;
            int i8 = ~i4;
            int i9 = (~(i7 | i8)) | (~(i8 | i2));
            int i10 = ~((~i2) | i5 | i4);
            int i11 = i9 | i10;
            int i12 = (~(i2 | i8 | i5)) | i10;
            int i13 = i5 | i4;
            int i14 = i5 + i4 + i3 + ((-1865910757) * i6) + ((-1665280692) * i);
            int i15 = i14 * i14;
            int i16 = ((i5 * (-906343980)) - 215482368) + ((-906343980) * i4) + (i11 * (-2063747539)) + (2063747539 * i12) + ((-2063747539) * i13) + (1324875776 * i3) + ((-1540882432) * i6) + ((-912261120) * i) + (1566179328 * i15);
            int i17 = (i5 * (-52584228)) + 761582770 + (i4 * (-52584228)) + (i11 * 415) + (i12 * (-415)) + (i13 * 415) + (i3 * (-52583813)) + (i6 * (-195242759)) + (i * 1657508740) + (i15 * (-834797568));
            return i16 + ((i17 * i17) * 1251344384) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
        }

        public final Drawable onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 81;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            Drawable drawable = this.onWarmupCompleted;
            int i5 = i2 + 85;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 77 / 0;
            }
            return drawable;
        }

        public final void onExtraCallback(@Nullable Drawable drawable) {
            Bitmap bitmapOnExtraCallback;
            int i = 2 % 2;
            this.onWarmupCompleted = drawable;
            Object obj = null;
            if (drawable != null) {
                int i2 = onExtraCallback + 105;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                bitmapOnExtraCallback = ForwardingLiveDataExternalSyntheticLambda0.onExtraCallback(drawable, 0, 0, (Bitmap.Config) null, 7, (Object) null);
                int i4 = onExtraCallback + 125;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            } else {
                bitmapOnExtraCallback = null;
            }
            this.onExtraCallbackWithResult = bitmapOnExtraCallback;
            int i6 = onExtraCallback + 11;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) objArr[0];
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 121;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            Bitmap bitmap = iAuthTabCallbackDefault.onExtraCallbackWithResult;
            int i5 = i2 + 43;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return bitmap;
        }

        public final Drawable IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 69;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            Drawable drawable = this.onNavigationEvent;
            int i5 = i2 + 93;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return drawable;
        }

        public final void onExtraCallbackWithResult(@Nullable Drawable drawable) {
            Bitmap bitmapOnExtraCallback;
            int i = 2 % 2;
            int i2 = asBinder + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent = drawable;
            if (drawable != null) {
                bitmapOnExtraCallback = ForwardingLiveDataExternalSyntheticLambda0.onExtraCallback(drawable, 0, 0, (Bitmap.Config) null, 7, (Object) null);
                int i4 = asBinder + 17;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                bitmapOnExtraCallback = null;
            }
            this.IAuthTabCallback = bitmapOnExtraCallback;
        }

        public final Bitmap onTransact() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float onNavigationEvent() {
            int i = 2 % 2;
            Drawable drawable = this.onWarmupCompleted;
            if (drawable == null) {
                int i2 = asBinder + 55;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return 0.0f;
            }
            int i4 = asBinder + 123;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                return ((Float) IAuthTabCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, 1740643205, -1740643205, iOnWarmupCompleted3, new Object[]{this, drawable})).floatValue();
            }
            int iOnWarmupCompleted4 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted5 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted6 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            float fFloatValue = ((Float) IAuthTabCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted4, iOnWarmupCompleted5, 1740643205, -1740643205, iOnWarmupCompleted6, new Object[]{this, drawable})).floatValue();
            int i5 = 38 / 0;
            return fFloatValue;
        }

        public final float asBinder() {
            int i = 2 % 2;
            Drawable drawable = this.onNavigationEvent;
            if (drawable == null) {
                int i2 = asBinder + 65;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return 0.0f;
            }
            int i4 = asBinder + 71;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                return ((Float) IAuthTabCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, 1740643205, -1740643205, iOnWarmupCompleted3, new Object[]{this, drawable})).floatValue();
            }
            int iOnWarmupCompleted4 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted5 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted6 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            ((Float) IAuthTabCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted4, iOnWarmupCompleted5, 1740643205, -1740643205, iOnWarmupCompleted6, new Object[]{this, drawable})).floatValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[PHI: r1
          0x0037: PHI (r1v13 java.lang.Number) = (r1v4 java.lang.Number), (r1v5 java.lang.Number), (r1v15 java.lang.Number) binds: [B:8:0x0026, B:10:0x002c, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r1
          0x0028: PHI (r1v5 java.lang.Number) = (r1v4 java.lang.Number), (r1v15 java.lang.Number) binds: [B:8:0x0026, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            Number numberValueOf;
            Number numberValueOf2;
            Drawable drawable = (Drawable) objArr[1];
            int i = 2 % 2;
            int i2 = asBinder + 63;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                numberValueOf = Float.valueOf(2.0f);
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    numberValueOf2 = bounds != null ? Integer.valueOf(bounds.width()) : numberValueOf;
                }
            } else {
                numberValueOf = Float.valueOf(0.0f);
                if (drawable != null) {
                }
            }
            float fFloatValue = numberValueOf2.floatValue();
            if (fFloatValue != 0.0f) {
                return Float.valueOf(fFloatValue);
            }
            int i3 = onExtraCallback;
            int i4 = i3 + 101;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            if (drawable != null) {
                int i6 = i3 + 99;
                asBinder = i6 % 128;
                if (i6 % 2 == 0) {
                    Integer.valueOf(drawable.getIntrinsicWidth());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                numberValueOf = Integer.valueOf(drawable.getIntrinsicWidth());
            }
            float fFloatValue2 = numberValueOf.floatValue();
            int i7 = asBinder + 5;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return Float.valueOf(fFloatValue2);
        }

        public final void onExtraCallback() {
            int i = 2 % 2;
            int i2 = asBinder + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onExtraCallback((Drawable) null);
            Bitmap bitmap = this.onExtraCallbackWithResult;
            if (bitmap != null) {
                int i4 = asBinder + 75;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    bitmap.recycle();
                    obj.hashCode();
                    throw null;
                }
                bitmap.recycle();
            }
            onExtraCallbackWithResult(null);
            Bitmap bitmap2 = this.IAuthTabCallback;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
        }

        private final float IAuthTabCallback(Drawable drawable) {
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            return ((Float) IAuthTabCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, 1740643205, -1740643205, iOnWarmupCompleted3, new Object[]{this, drawable})).floatValue();
        }

        public final Bitmap onWarmupCompleted() {
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            return (Bitmap) IAuthTabCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, 1648438978, -1648438977, iOnWarmupCompleted3, new Object[]{this});
        }
    }

    public static abstract class access000 {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ access000(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int IAuthTabCallback();

        public abstract Pair<Interpolator, Integer> IAuthTabCallback(int i);

        public abstract Pair<Interpolator, Integer> IAuthTabCallbackDefault();

        public abstract int IAuthTabCallbackStub();

        public abstract Pair<Interpolator, Integer> onExtraCallback();

        public abstract Pair<Interpolator, Integer> onExtraCallbackWithResult();

        public abstract Pair<Interpolator, Integer> onNavigationEvent();

        public abstract Pair<Interpolator, Integer> onNavigationEvent(int i);

        public abstract int onWarmupCompleted();

        private access000() {
        }

        public final Pair<Interpolator, Integer> onNavigationEvent(@NotNull deprecated_dns deprecated_dnsVar) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(deprecated_dnsVar, "");
            Pair<Interpolator, Integer> pairIAuthTabCallback = getWrite.IAuthTabCallback(deprecated_dnsVar, Integer.valueOf(deprecated_dnsVar.IAuthTabCallback()));
            int i4 = IAuthTabCallback + 89;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return pairIAuthTabCallback;
        }

        public interface onExtraCallback {

            public static final class IAuthTabCallback extends access000 implements onExtraCallback {
                public static final IAuthTabCallback IAuthTabCallback;
                private static final int IAuthTabCallbackDefault;
                private static int IAuthTabCallbackStub = 1;
                private static int IAuthTabCallback_Parcel = 1;
                private static int access100;
                private static final Pair<Interpolator, Integer> asBinder;
                private static final Pair<Interpolator, Integer> asInterface;
                private static final int onExtraCallback;
                private static final Pair<Interpolator, Integer> onExtraCallbackWithResult;
                private static final Pair<Interpolator, Integer> onNavigationEvent;
                private static int onTransact;
                private static final int onWarmupCompleted = 0;

                private IAuthTabCallback() {
                    super(null);
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public int onWarmupCompleted() {
                    int i = 2 % 2;
                    int i2 = access100;
                    int i3 = i2 + 19;
                    IAuthTabCallback_Parcel = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = onWarmupCompleted;
                    int i6 = i2 + 109;
                    IAuthTabCallback_Parcel = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 39 / 0;
                    }
                    return i5;
                }

                static {
                    IAuthTabCallback iAuthTabCallback = new IAuthTabCallback();
                    IAuthTabCallback = iAuthTabCallback;
                    IAuthTabCallbackDefault = 35;
                    onExtraCallback = 10;
                    deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
                    onExtraCallbackWithResult = iAuthTabCallback.onNavigationEvent(deprecated_certificatepinner.IAuthTabCallback());
                    asInterface = iAuthTabCallback.onNavigationEvent(deprecated_certificatepinner.onNavigationEvent());
                    asBinder = iAuthTabCallback.onNavigationEvent(deprecated_certificatepinner.asBinder());
                    onNavigationEvent = iAuthTabCallback.onNavigationEvent(deprecated_certificatepinner.asInterface());
                    int i = onTransact + 33;
                    IAuthTabCallbackStub = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 14 / 0;
                    }
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public int IAuthTabCallbackStub() {
                    int i = 2 % 2;
                    int i2 = access100;
                    int i3 = i2 + 107;
                    IAuthTabCallback_Parcel = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = IAuthTabCallbackDefault;
                    int i6 = i2 + 45;
                    IAuthTabCallback_Parcel = i6 % 128;
                    int i7 = i6 % 2;
                    return i5;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public int IAuthTabCallback() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback_Parcel + 39;
                    access100 = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = onExtraCallback;
                    if (i3 != 0) {
                        int i5 = 93 / 0;
                    }
                    return i4;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public Pair<Interpolator, Integer> onExtraCallbackWithResult() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback_Parcel + 65;
                    access100 = i2 % 128;
                    if (i2 % 2 == 0) {
                        return onExtraCallbackWithResult;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public Pair<Interpolator, Integer> onExtraCallback() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback_Parcel + 87;
                    access100 = i2 % 128;
                    if (i2 % 2 == 0) {
                        return asInterface;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public Pair<Interpolator, Integer> IAuthTabCallbackDefault() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback_Parcel + 73;
                    int i3 = i2 % 128;
                    access100 = i3;
                    int i4 = i2 % 2;
                    Pair<Interpolator, Integer> pair = asBinder;
                    int i5 = i3 + 21;
                    IAuthTabCallback_Parcel = i5 % 128;
                    int i6 = i5 % 2;
                    return pair;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public Pair<Interpolator, Integer> onNavigationEvent() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback_Parcel + 71;
                    access100 = i2 % 128;
                    if (i2 % 2 == 0) {
                        return onNavigationEvent;
                    }
                    throw null;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public Pair<Interpolator, Integer> onNavigationEvent(int i) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback_Parcel + 27;
                    access100 = i3 % 128;
                    int i4 = i3 % 2;
                    Pair<Interpolator, Integer> pairIAuthTabCallback = getWrite.IAuthTabCallback(Address.onNavigationEvent.onExtraCallbackWithResult(), Integer.valueOf((i * 20) + 500));
                    int i5 = IAuthTabCallback_Parcel + 67;
                    access100 = i5 % 128;
                    int i6 = i5 % 2;
                    return pairIAuthTabCallback;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public Pair<Interpolator, Integer> IAuthTabCallback(int i) {
                    Interpolator interpolatorOnExtraCallbackWithResult;
                    int i2;
                    int i3 = 2 % 2;
                    int i4 = IAuthTabCallback_Parcel + 49;
                    access100 = i4 % 128;
                    if (i4 % 2 != 0) {
                        interpolatorOnExtraCallbackWithResult = Address.onNavigationEvent.onExtraCallbackWithResult();
                        i2 = (i << 80) % 7863;
                    } else {
                        interpolatorOnExtraCallbackWithResult = Address.onNavigationEvent.onExtraCallbackWithResult();
                        i2 = (i * 10) + 400;
                    }
                    Pair<Interpolator, Integer> pairIAuthTabCallback = getWrite.IAuthTabCallback(interpolatorOnExtraCallbackWithResult, Integer.valueOf(i2));
                    int i5 = IAuthTabCallback_Parcel + 59;
                    access100 = i5 % 128;
                    int i6 = i5 % 2;
                    return pairIAuthTabCallback;
                }
            }
        }

        public interface IAuthTabCallback {

            public static final class onExtraCallback extends access000 implements IAuthTabCallback {
                private static final int IAuthTabCallback;
                private static int IAuthTabCallbackDefault = 0;
                private static int IAuthTabCallbackStub = 1;
                private static int IAuthTabCallbackStubProxy = 1;
                private static int access100;
                private static final int asBinder;
                private static final Pair<Interpolator, Integer> asInterface;
                private static final int onExtraCallback;
                private static final Pair<Interpolator, Integer> onExtraCallbackWithResult;
                public static final onExtraCallback onNavigationEvent;
                private static final Pair<Interpolator, Integer> onTransact;
                private static final Pair<Interpolator, Integer> onWarmupCompleted;

                private onExtraCallback() {
                    super(null);
                }

                static {
                    onExtraCallback onextracallback = new onExtraCallback();
                    onNavigationEvent = onextracallback;
                    IAuthTabCallback = 1;
                    asBinder = 40;
                    onExtraCallback = 30;
                    deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
                    onWarmupCompleted = onextracallback.onNavigationEvent(deprecated_certificatepinner.onExtraCallbackWithResult());
                    onTransact = onextracallback.onNavigationEvent(deprecated_certificatepinner.asBinder());
                    asInterface = onextracallback.onNavigationEvent(deprecated_certificatepinner.onExtraCallbackWithResult());
                    onExtraCallbackWithResult = onextracallback.onNavigationEvent(deprecated_certificatepinner.asBinder());
                    int i = IAuthTabCallbackDefault + 75;
                    IAuthTabCallbackStub = i % 128;
                    int i2 = i % 2;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public int onWarmupCompleted() {
                    int i = 2 % 2;
                    int i2 = access100 + 119;
                    int i3 = i2 % 128;
                    IAuthTabCallbackStubProxy = i3;
                    Object obj = null;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    int i4 = IAuthTabCallback;
                    int i5 = i3 + 47;
                    access100 = i5 % 128;
                    if (i5 % 2 == 0) {
                        return i4;
                    }
                    obj.hashCode();
                    throw null;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public int IAuthTabCallbackStub() {
                    int i = 2 % 2;
                    int i2 = access100;
                    int i3 = i2 + 35;
                    IAuthTabCallbackStubProxy = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = asBinder;
                    int i6 = i2 + 25;
                    IAuthTabCallbackStubProxy = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 85 / 0;
                    }
                    return i5;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public int IAuthTabCallback() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallbackStubProxy + 73;
                    int i3 = i2 % 128;
                    access100 = i3;
                    if (i2 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int i4 = onExtraCallback;
                    int i5 = i3 + 35;
                    IAuthTabCallbackStubProxy = i5 % 128;
                    int i6 = i5 % 2;
                    return i4;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public Pair<Interpolator, Integer> onExtraCallbackWithResult() {
                    int i = 2 % 2;
                    int i2 = access100 + 123;
                    int i3 = i2 % 128;
                    IAuthTabCallbackStubProxy = i3;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    Pair<Interpolator, Integer> pair = onWarmupCompleted;
                    int i4 = i3 + 67;
                    access100 = i4 % 128;
                    int i5 = i4 % 2;
                    return pair;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public Pair<Interpolator, Integer> onExtraCallback() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallbackStubProxy;
                    int i3 = i2 + 17;
                    access100 = i3 % 128;
                    int i4 = i3 % 2;
                    Pair<Interpolator, Integer> pair = onTransact;
                    int i5 = i2 + 3;
                    access100 = i5 % 128;
                    int i6 = i5 % 2;
                    return pair;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public Pair<Interpolator, Integer> IAuthTabCallbackDefault() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallbackStubProxy;
                    int i3 = i2 + 91;
                    access100 = i3 % 128;
                    Object obj = null;
                    if (i3 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    Pair<Interpolator, Integer> pair = asInterface;
                    int i4 = i2 + 59;
                    access100 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return pair;
                    }
                    throw null;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public Pair<Interpolator, Integer> onNavigationEvent() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallbackStubProxy + 91;
                    access100 = i2 % 128;
                    if (i2 % 2 == 0) {
                        return onExtraCallbackWithResult;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public Pair<Interpolator, Integer> onNavigationEvent(int i) {
                    Interpolator interpolatorOnExtraCallbackWithResult;
                    int i2;
                    int i3 = 2 % 2;
                    int i4 = access100 + 103;
                    IAuthTabCallbackStubProxy = i4 % 128;
                    if (i4 % 2 == 0) {
                        interpolatorOnExtraCallbackWithResult = Address.onNavigationEvent.onExtraCallbackWithResult();
                        i2 = (i * 121) >>> 7739;
                    } else {
                        interpolatorOnExtraCallbackWithResult = Address.onNavigationEvent.onExtraCallbackWithResult();
                        i2 = (i * 50) + 600;
                    }
                    Pair<Interpolator, Integer> pairIAuthTabCallback = getWrite.IAuthTabCallback(interpolatorOnExtraCallbackWithResult, Integer.valueOf(i2));
                    int i5 = IAuthTabCallbackStubProxy + 93;
                    access100 = i5 % 128;
                    int i6 = i5 % 2;
                    return pairIAuthTabCallback;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public Pair<Interpolator, Integer> IAuthTabCallback(int i) {
                    int i2 = 2 % 2;
                    int i3 = access100 + 105;
                    IAuthTabCallbackStubProxy = i3 % 128;
                    int i4 = i3 % 2;
                    Pair<Interpolator, Integer> pairIAuthTabCallback = getWrite.IAuthTabCallback(Address.onNavigationEvent.onExtraCallbackWithResult(), Integer.valueOf((i * 60) + 550));
                    int i5 = access100 + 91;
                    IAuthTabCallbackStubProxy = i5 % 128;
                    int i6 = i5 % 2;
                    return pairIAuthTabCallback;
                }
            }

            public static final class onExtraCallbackWithResult extends access000 implements IAuthTabCallback {
                private static final Pair<Interpolator, Integer> IAuthTabCallback;
                private static final int IAuthTabCallbackDefault;
                private static final Pair<Interpolator, Integer> IAuthTabCallbackStub;
                private static int IAuthTabCallbackStubProxy = 0;
                private static int IAuthTabCallback_Parcel = 1;
                private static int access000 = 1;
                private static final deprecated_dns asBinder;
                private static int asInterface;
                public static final onExtraCallbackWithResult onExtraCallback;
                private static final Pair<Interpolator, Integer> onExtraCallbackWithResult;
                private static final int onNavigationEvent;
                private static final Pair<Interpolator, Integer> onTransact;
                private static final int onWarmupCompleted;

                private onExtraCallbackWithResult() {
                    super(null);
                }

                static {
                    onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
                    onExtraCallback = onextracallbackwithresult;
                    deprecated_dns deprecated_dnsVar = new deprecated_dns(180.0d, 22.0d);
                    asBinder = deprecated_dnsVar;
                    onWarmupCompleted = 1;
                    IAuthTabCallbackDefault = 40;
                    onNavigationEvent = 30;
                    IAuthTabCallback = onextracallbackwithresult.onNavigationEvent(deprecated_dnsVar);
                    deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
                    onTransact = onextracallbackwithresult.onNavigationEvent(deprecated_certificatepinner.onNavigationEvent());
                    IAuthTabCallbackStub = onextracallbackwithresult.onNavigationEvent(deprecated_certificatepinner.asBinder());
                    onExtraCallbackWithResult = onextracallbackwithresult.onNavigationEvent(deprecated_certificatepinner.asBinder());
                    int i = asInterface + 57;
                    IAuthTabCallback_Parcel = i % 128;
                    int i2 = i % 2;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public int onWarmupCompleted() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallbackStubProxy + 125;
                    access000 = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = onWarmupCompleted;
                    if (i3 == 0) {
                        int i5 = 36 / 0;
                    }
                    return i4;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public int IAuthTabCallbackStub() {
                    int i = 2 % 2;
                    int i2 = access000;
                    int i3 = i2 + 107;
                    IAuthTabCallbackStubProxy = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = IAuthTabCallbackDefault;
                    int i6 = i2 + 123;
                    IAuthTabCallbackStubProxy = i6 % 128;
                    int i7 = i6 % 2;
                    return i5;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public int IAuthTabCallback() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallbackStubProxy + 11;
                    int i3 = i2 % 128;
                    access000 = i3;
                    int i4 = i2 % 2;
                    int i5 = onNavigationEvent;
                    int i6 = i3 + 25;
                    IAuthTabCallbackStubProxy = i6 % 128;
                    int i7 = i6 % 2;
                    return i5;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public Pair<Interpolator, Integer> onExtraCallbackWithResult() {
                    int i = 2 % 2;
                    int i2 = access000 + 83;
                    IAuthTabCallbackStubProxy = i2 % 128;
                    if (i2 % 2 == 0) {
                        return IAuthTabCallback;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public Pair<Interpolator, Integer> onExtraCallback() {
                    Pair<Interpolator, Integer> pair;
                    int i = 2 % 2;
                    int i2 = access000 + 39;
                    int i3 = i2 % 128;
                    IAuthTabCallbackStubProxy = i3;
                    if (i2 % 2 != 0) {
                        pair = onTransact;
                        int i4 = 26 / 0;
                    } else {
                        pair = onTransact;
                    }
                    int i5 = i3 + 107;
                    access000 = i5 % 128;
                    if (i5 % 2 != 0) {
                        return pair;
                    }
                    throw null;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public Pair<Interpolator, Integer> IAuthTabCallbackDefault() {
                    int i = 2 % 2;
                    int i2 = access000 + 89;
                    int i3 = i2 % 128;
                    IAuthTabCallbackStubProxy = i3;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    Pair<Interpolator, Integer> pair = IAuthTabCallbackStub;
                    int i4 = i3 + 17;
                    access000 = i4 % 128;
                    int i5 = i4 % 2;
                    return pair;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public Pair<Interpolator, Integer> onNavigationEvent() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallbackStubProxy + 9;
                    access000 = i2 % 128;
                    if (i2 % 2 != 0) {
                        return onExtraCallbackWithResult;
                    }
                    throw null;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public Pair<Interpolator, Integer> onNavigationEvent(int i) {
                    int i2 = 2 % 2;
                    int i3 = access000 + 123;
                    IAuthTabCallbackStubProxy = i3 % 128;
                    int i4 = i3 % 2;
                    Pair<Interpolator, Integer> pairIAuthTabCallback = getWrite.IAuthTabCallback(Address.onNavigationEvent.onExtraCallbackWithResult(), Integer.valueOf((i * 50) + 600));
                    int i5 = IAuthTabCallbackStubProxy + 11;
                    access000 = i5 % 128;
                    int i6 = i5 % 2;
                    return pairIAuthTabCallback;
                }

                @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
                public Pair<Interpolator, Integer> IAuthTabCallback(int i) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallbackStubProxy + 77;
                    access000 = i3 % 128;
                    int i4 = i3 % 2;
                    Pair<Interpolator, Integer> pairIAuthTabCallback = getWrite.IAuthTabCallback(Address.onNavigationEvent.onExtraCallbackWithResult(), Integer.valueOf((i * 60) + 550));
                    int i5 = IAuthTabCallbackStubProxy + 7;
                    access000 = i5 % 128;
                    if (i5 % 2 != 0) {
                        return pairIAuthTabCallback;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        }

        public static final class onExtraCallbackWithResult extends access000 {
            private static int asBinder = 1;
            private static int asInterface;
            private final Pair<Interpolator, Integer> IAuthTabCallback;
            private final Pair<Interpolator, Integer> IAuthTabCallbackStub;
            private final int onExtraCallback;
            private final int onExtraCallbackWithResult;
            private final Pair<Interpolator, Integer> onNavigationEvent;
            private final int onTransact;
            private final Pair<Interpolator, Integer> onWarmupCompleted;

            public onExtraCallbackWithResult(int i) {
                super(null);
                this.onExtraCallbackWithResult = i;
                this.onTransact = 50;
                this.onExtraCallback = 40;
                Address address = Address.onNavigationEvent;
                this.IAuthTabCallback = getWrite.IAuthTabCallback(address.onExtraCallbackWithResult(), Integer.valueOf(onWarmupCompleted() * 600));
                this.onWarmupCompleted = getWrite.IAuthTabCallback(address.onExtraCallbackWithResult(), Integer.valueOf(onWarmupCompleted() * 600));
                this.IAuthTabCallbackStub = getWrite.IAuthTabCallback(address.onExtraCallbackWithResult(), Integer.valueOf(onWarmupCompleted() * 600));
                this.onNavigationEvent = getWrite.IAuthTabCallback(address.onExtraCallbackWithResult(), Integer.valueOf(onWarmupCompleted() * 200));
            }

            @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
            public int onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = asBinder + 7;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                int i4 = this.onExtraCallbackWithResult;
                if (i3 != 0) {
                    int i5 = 98 / 0;
                }
                return i4;
            }

            @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
            public int IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = asBinder;
                int i3 = i2 + 27;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                int i5 = this.onTransact;
                int i6 = i2 + 79;
                asInterface = i6 % 128;
                if (i6 % 2 == 0) {
                    return i5;
                }
                throw null;
            }

            @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
            public int IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = asBinder + 75;
                int i3 = i2 % 128;
                asInterface = i3;
                int i4 = i2 % 2;
                int i5 = this.onExtraCallback;
                int i6 = i3 + 37;
                asBinder = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 6 / 0;
                }
                return i5;
            }

            @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
            public Pair<Interpolator, Integer> onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = asInterface + 1;
                int i3 = i2 % 128;
                asBinder = i3;
                int i4 = i2 % 2;
                Pair<Interpolator, Integer> pair = this.IAuthTabCallback;
                int i5 = i3 + 39;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    return pair;
                }
                throw null;
            }

            @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
            public Pair<Interpolator, Integer> onExtraCallback() {
                int i = 2 % 2;
                int i2 = asBinder + 49;
                int i3 = i2 % 128;
                asInterface = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                Pair<Interpolator, Integer> pair = this.onWarmupCompleted;
                int i4 = i3 + 13;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                return pair;
            }

            @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
            public Pair<Interpolator, Integer> IAuthTabCallbackDefault() {
                int i = 2 % 2;
                int i2 = asInterface + 61;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.IAuthTabCallbackStub;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
            public Pair<Interpolator, Integer> onNavigationEvent() {
                int i = 2 % 2;
                int i2 = asBinder;
                int i3 = i2 + 9;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                Pair<Interpolator, Integer> pair = this.onNavigationEvent;
                int i5 = i2 + 21;
                asInterface = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 98 / 0;
                }
                return pair;
            }

            @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
            public Pair<Interpolator, Integer> onNavigationEvent(int i) {
                int i2 = 2 % 2;
                int i3 = asInterface + 55;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                Pair<Interpolator, Integer> pairIAuthTabCallback = getWrite.IAuthTabCallback(Address.onNavigationEvent.onExtraCallbackWithResult(), Integer.valueOf((onWarmupCompleted() * 80) + 900 + (i * 40)));
                int i5 = asInterface + 113;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                return pairIAuthTabCallback;
            }

            @Override // im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View.access000
            public Pair<Interpolator, Integer> IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                int i3 = asInterface + 25;
                asBinder = i3 % 128;
                return getWrite.IAuthTabCallback(Address.onNavigationEvent.onExtraCallbackWithResult(), i3 % 2 == 0 ? Integer.valueOf(((onWarmupCompleted() << 120) + 1543) >>> (i / 53)) : Integer.valueOf((onWarmupCompleted() * 20) + 700 + (i * 100)));
            }
        }
    }

    public static final class asBinder {
        public /* synthetic */ asBinder(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private asBinder() {
        }
    }

    @Override // o.getHostnameVerifierokhttp
    public void showLoadingIndicator(@Nullable String str) {
        int i = 2 % 2;
        int i2 = notifyNotificationWithChannel + 59;
        getSmallIconId = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            isLaidOut();
            obj.hashCode();
            throw null;
        }
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new writeTypedObject());
            int i3 = notifyNotificationWithChannel + 123;
            getSmallIconId = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 33 / 0;
                return;
            }
            return;
        }
        int i5 = getSmallIconId + 107;
        notifyNotificationWithChannel = i5 % 128;
        if (i5 % 2 != 0) {
            StringsKt.isBlank(onExtraCallbackWithResult());
            throw null;
        }
        if (StringsKt.isBlank(onExtraCallbackWithResult()) && asInterface(this) == null) {
            return;
        }
        IAuthTabCallback(this, ((Float) onExtraCallbackWithResult(new Object[]{this, null, null, null, null, 15, null}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -783133487, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 783133506)).floatValue());
        Rally rallyOnExtraCallbackWithResult = onExtraCallbackWithResult(this);
        if (rallyOnExtraCallbackWithResult != null) {
            int i6 = notifyNotificationWithChannel + 51;
            getSmallIconId = i6 % 128;
            if (i6 % 2 == 0) {
                rallyOnExtraCallbackWithResult.ICustomTabsServiceStub();
                throw null;
            }
            rallyOnExtraCallbackWithResult.ICustomTabsServiceStub();
        }
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(Address.onNavigationEvent.asInterface(), 2200);
        float f = -onExtraCallback(this);
        float fOnExtraCallback = onExtraCallback(this);
        Object[] objArr = {appLovinSdkSettingsOnExtraCallback, Float.valueOf(f), Float.valueOf(fOnExtraCallback), new extraCallbackWithResult(), null, 8, null};
        onExtraCallbackWithResult(this, (Rally) isFireOS.onExtraCallbackWithResult(Rally.onExtraCallbackWithResult(Rally.onWarmupCompleted((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, objArr, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), -1, getExtraParameters.Normal, 0, null, null, null, 0, 0L, false, 2032, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), null, new ICustomTabsCallback(), 1, null), (Object) null, new readTypedObject(), 1, (Object) null), false, 1, null));
    }

    @Override // o.getHostnameVerifierokhttp
    public void dismissLoadingIndicator() {
        int i = 2 % 2;
        if (isLaidOut() && !isLayoutRequested()) {
            onNavigationEvent(this, true);
            int i2 = getSmallIconId + 99;
            notifyNotificationWithChannel = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        addOnLayoutChangeListener(new IAuthTabCallback_Parcel());
        int i4 = notifyNotificationWithChannel + 121;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0580, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0584, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0589, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x058d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad A[PHI: r3
      0x00ad: PHI (r3v44 int) = (r3v41 int), (r3v54 int) binds: [B:29:0x00c2, B:22:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0 A[PHI: r3
      0x00b0: PHI (r3v42 int) = (r3v41 int), (r3v54 int) binds: [B:29:0x00c2, B:22:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(@NotNull Canvas canvas) {
        int iSave;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        onExtraCallbackWithResult(canvas);
        if (this.IEngagementSignalsCallbackStubProxy != null) {
            float paddingStart = getPaddingStart();
            iSave = canvas.save();
            canvas.translate(paddingStart, 0.0f);
            try {
                float fIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
                float fMeasureText = this.requestPostMessageChannel.measureText(String.valueOf(this.IEngagementSignalsCallbackStubProxy));
                float f = this.asBinder;
                onExtraCallbackWithResult(canvas, 0.0f);
                canvas.drawText(String.valueOf(this.IEngagementSignalsCallbackStubProxy), fIAuthTabCallback_Parcel, readTypedObject(), this.requestPostMessageChannel);
                onNavigationEvent(canvas, fMeasureText + fIAuthTabCallback_Parcel + f);
                return;
            } finally {
            }
        }
        if (StringsKt.isBlank(this.IPostMessageService_Parcel)) {
            return;
        }
        float paddingStart2 = getPaddingStart();
        iSave = canvas.save();
        canvas.translate(paddingStart2, 0.0f);
        try {
            if (((Boolean) onExtraCallbackWithResult(new Object[]{this}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1909624481, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1909624475)).booleanValue()) {
                int i2 = notifyNotificationWithChannel + 17;
                int iSave2 = i2 % 128;
                getSmallIconId = iSave2;
                try {
                    if (i2 % 2 == 0) {
                        float f2 = this.onNavigationEvent;
                        iSave2 = canvas.save();
                        canvas.translate(f2, 0.0f);
                        if (this.IAuthTabCallback) {
                            float fIAuthTabCallback_Parcel2 = IAuthTabCallback_Parcel();
                            float fIAuthTabCallback_Parcel3 = IAuthTabCallback_Parcel() + this.validateRelationship;
                            iSave = canvas.save();
                            canvas.translate(fIAuthTabCallback_Parcel3, 0.0f);
                            try {
                                onWarmupCompleted(canvas);
                                onNavigationEvent(canvas);
                                onExtraCallback(canvas, this.IAuthTabCallback_Parcel);
                                onExtraCallbackWithResult(canvas, this.ICustomTabsCallback);
                                onExtraCallbackWithResult(new Object[]{this, canvas, this.IEngagementSignalsCallback_Parcel, Float.valueOf(this.IPostMessageService), Float.valueOf(readTypedObject()), this.IPostMessageServiceDefault}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -731251165, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 731251178);
                                canvas.restoreToCount(iSave);
                                onExtraCallbackWithResult(canvas, 0.0f);
                                onNavigationEvent(canvas, fIAuthTabCallback_Parcel3 + this.IPostMessageService + this.IPostMessageServiceStub + this.asBinder);
                                onExtraCallbackWithResult(new Object[]{this, canvas, this.warmup, Float.valueOf(fIAuthTabCallback_Parcel2), Float.valueOf(readTypedObject()), this.ICustomTabsServiceStub}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -731251165, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 731251178);
                            } finally {
                            }
                        } else {
                            int i3 = iSave2;
                            try {
                                float fIAuthTabCallback_Parcel4 = IAuthTabCallback_Parcel();
                                TextPaint textPaint = this.ICustomTabsServiceStub;
                                CharSequence charSequence = this.warmup;
                                float fMeasureText2 = fIAuthTabCallback_Parcel4 + textPaint.measureText(charSequence, 0, charSequence.length());
                                float fMeasureText3 = fMeasureText2 + this.requestPostMessageChannel.measureText(this.IPostMessageService_Parcel);
                                String str = this.IPostMessageService_Parcel;
                                canvas.drawText(str, 0, str.length(), fMeasureText2, readTypedObject(), (Paint) this.requestPostMessageChannel);
                                onExtraCallbackWithResult(canvas, 0.0f);
                                onNavigationEvent(canvas, this.asBinder + fMeasureText3 + this.IPostMessageServiceStub);
                                onExtraCallbackWithResult(new Object[]{this, canvas, this.warmup, Float.valueOf(fIAuthTabCallback_Parcel4), Float.valueOf(readTypedObject()), this.ICustomTabsServiceStub}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -731251165, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 731251178);
                                onExtraCallbackWithResult(new Object[]{this, canvas, this.IEngagementSignalsCallback_Parcel, Float.valueOf(fMeasureText3), Float.valueOf(readTypedObject()), this.IPostMessageServiceDefault}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -731251165, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 731251178);
                                iSave2 = i3;
                            } catch (Throwable th) {
                                th = th;
                                iSave2 = i3;
                                canvas.restoreToCount(iSave2);
                                throw th;
                            }
                        }
                        onExtraCallback(canvas);
                        canvas.restoreToCount(iSave2);
                    } else {
                        float f3 = this.onNavigationEvent;
                        iSave2 = canvas.save();
                        canvas.translate(f3, 0.0f);
                        if (!this.IAuthTabCallback) {
                        }
                        onExtraCallback(canvas);
                        canvas.restoreToCount(iSave2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else if (((Boolean) onExtraCallbackWithResult(new Object[]{this}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1977507681, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1977507699)).booleanValue()) {
                if (this.IAuthTabCallback) {
                    float fIAuthTabCallback_Parcel5 = IAuthTabCallback_Parcel();
                    float fIAuthTabCallback_Parcel6 = IAuthTabCallback_Parcel() + this.validateRelationship;
                    iSave = canvas.save();
                    canvas.translate(fIAuthTabCallback_Parcel6, 0.0f);
                    onWarmupCompleted(canvas);
                    onNavigationEvent(canvas);
                    onExtraCallback(canvas, this.IAuthTabCallback_Parcel);
                    onExtraCallbackWithResult(canvas, this.ICustomTabsCallback);
                    onExtraCallbackWithResult(new Object[]{this, canvas, this.IEngagementSignalsCallback_Parcel, Float.valueOf(this.IPostMessageService), Float.valueOf(readTypedObject()), this.IPostMessageServiceDefault}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -731251165, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 731251178);
                    canvas.restoreToCount(iSave);
                    onExtraCallbackWithResult(canvas, 0.0f);
                    onNavigationEvent(canvas, fIAuthTabCallback_Parcel6 + this.IPostMessageService + this.IPostMessageServiceStub + this.asBinder);
                    onExtraCallbackWithResult(new Object[]{this, canvas, this.warmup, Float.valueOf(fIAuthTabCallback_Parcel5), Float.valueOf(readTypedObject()), this.ICustomTabsServiceStub}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -731251165, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 731251178);
                } else {
                    int i4 = getSmallIconId + 97;
                    notifyNotificationWithChannel = i4 % 128;
                    int i5 = i4 % 2;
                    float fIAuthTabCallback_Parcel7 = IAuthTabCallback_Parcel();
                    TextPaint textPaint2 = this.ICustomTabsServiceStub;
                    CharSequence charSequence2 = this.warmup;
                    float fMeasureText4 = fIAuthTabCallback_Parcel7 + textPaint2.measureText(charSequence2, 0, charSequence2.length());
                    float fMeasureText5 = fMeasureText4 + this.requestPostMessageChannel.measureText(this.IPostMessageService_Parcel);
                    String str2 = this.IPostMessageService_Parcel;
                    canvas.drawText(str2, 0, str2.length(), fMeasureText4, readTypedObject(), (Paint) this.requestPostMessageChannel);
                    onExtraCallbackWithResult(canvas, 0.0f);
                    onNavigationEvent(canvas, this.asBinder + fMeasureText5 + this.IPostMessageServiceStub);
                    onExtraCallbackWithResult(new Object[]{this, canvas, this.warmup, Float.valueOf(fIAuthTabCallback_Parcel7), Float.valueOf(readTypedObject()), this.ICustomTabsServiceStub}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -731251165, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 731251178);
                    onExtraCallbackWithResult(new Object[]{this, canvas, this.IEngagementSignalsCallback_Parcel, Float.valueOf(fMeasureText5), Float.valueOf(readTypedObject()), this.IPostMessageServiceDefault}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -731251165, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 731251178);
                }
                onExtraCallback(canvas);
            } else if (!(!onPostMessage())) {
                float f4 = this.extraCommand;
                float f5 = this.ITrustedWebActivityCallbackStubProxy;
                iSave = canvas.save();
                canvas.translate(f4 - f5, 0.0f);
                if (this.IAuthTabCallback) {
                    onExtraCallbackWithResult(canvas, 0.0f);
                    onExtraCallbackWithResult(new Object[]{this, canvas, this.warmup, Float.valueOf(IAuthTabCallback_Parcel()), Float.valueOf(readTypedObject()), this.ICustomTabsServiceStub}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -731251165, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 731251178);
                    float fIAuthTabCallback_Parcel8 = IAuthTabCallback_Parcel();
                    float f6 = this.extraCommand;
                    iSave = canvas.save();
                    canvas.translate(fIAuthTabCallback_Parcel8 - f6, 0.0f);
                    onWarmupCompleted(canvas);
                    onNavigationEvent(canvas);
                    onExtraCallback(canvas, this.IAuthTabCallback_Parcel);
                    onExtraCallbackWithResult(canvas, this.ICustomTabsCallback);
                    canvas.restoreToCount(iSave);
                    float fIAuthTabCallback_Parcel9 = (((this.areNotificationsEnabled + IAuthTabCallback_Parcel()) + this.validateRelationship) + this.ITrustedWebActivityCallback) - this.extraCommand;
                    onExtraCallbackWithResult(new Object[]{this, canvas, this.IEngagementSignalsCallback_Parcel, Float.valueOf(fIAuthTabCallback_Parcel9), Float.valueOf(readTypedObject()), this.IPostMessageServiceDefault}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -731251165, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 731251178);
                    onNavigationEvent(canvas, fIAuthTabCallback_Parcel9 + this.IPostMessageServiceStub + this.asBinder);
                } else {
                    float fIAuthTabCallback_Parcel10 = IAuthTabCallback_Parcel();
                    TextPaint textPaint3 = this.ICustomTabsServiceStub;
                    CharSequence charSequence3 = this.warmup;
                    float fMeasureText6 = fIAuthTabCallback_Parcel10 + textPaint3.measureText(charSequence3, 0, charSequence3.length());
                    float fMeasureText7 = fMeasureText6 + this.requestPostMessageChannel.measureText(this.IPostMessageService_Parcel);
                    onExtraCallbackWithResult(canvas, 0.0f);
                    onExtraCallbackWithResult(new Object[]{this, canvas, this.warmup, Float.valueOf(IAuthTabCallback_Parcel()), Float.valueOf(readTypedObject()), this.ICustomTabsServiceStub}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -731251165, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 731251178);
                    String str3 = this.IPostMessageService_Parcel;
                    canvas.drawText(str3, 0, str3.length(), fMeasureText6, readTypedObject(), (Paint) this.requestPostMessageChannel);
                    onExtraCallbackWithResult(new Object[]{this, canvas, this.IEngagementSignalsCallback_Parcel, Float.valueOf(fMeasureText7), Float.valueOf(readTypedObject()), this.IPostMessageServiceDefault}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -731251165, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 731251178);
                    onNavigationEvent(canvas, fMeasureText7 + this.IPostMessageServiceStub + this.asBinder);
                }
                onExtraCallback(canvas);
                canvas.restoreToCount(iSave);
            }
        } catch (Throwable th3) {
            throw th3;
        } finally {
        }
    }

    public static /* synthetic */ Unit onExtraCallback(TdsRollingNumberV1View tdsRollingNumberV1View, onTransact ontransact, float f) {
        return (Unit) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, ontransact, Float.valueOf(f)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 2089446016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -2089446011);
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsRollingNumberV1View tdsRollingNumberV1View, float f) {
        return (Unit) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, Float.valueOf(f)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1823530421, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1823530424);
    }

    public static /* synthetic */ Paint IAuthTabCallback() {
        return (Paint) onExtraCallbackWithResult(new Object[0], MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1935681165, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1935681182);
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsRollingNumberV1View tdsRollingNumberV1View, IAuthTabCallbackStub iAuthTabCallbackStub, float f) {
        return (Unit) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, iAuthTabCallbackStub, Float.valueOf(f)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -924016718, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 924016744);
    }

    public static /* synthetic */ Unit onExtraCallback(TdsRollingNumberV1View tdsRollingNumberV1View, float f) {
        return (Unit) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, Float.valueOf(f)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 98554005, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -98553990);
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsRollingNumberV1View tdsRollingNumberV1View) {
        return (Unit) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1781337846, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1781337844);
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsRollingNumberV1View tdsRollingNumberV1View, String str, String str2, boolean z, boolean z2, int i, access000 access000Var, boolean z3) {
        return (Unit) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, str, str2, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i), access000Var, Boolean.valueOf(z3)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1473872923, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1473872916);
    }

    public static /* synthetic */ Unit onExtraCallback(TdsRollingNumberV1View tdsRollingNumberV1View, String str, access000 access000Var, boolean z, boolean z2, boolean z3, char c, char c2) {
        return (Unit) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, str, access000Var, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Character.valueOf(c), Character.valueOf(c2)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1745444392, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1745444403);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TdsRollingNumberV1View tdsRollingNumberV1View, onTransact ontransact, float f) {
        return (Unit) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, ontransact, Float.valueOf(f)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -698992226, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 698992234);
    }

    private final void onExtraCallback(float f) {
        onExtraCallbackWithResult(new Object[]{this, Float.valueOf(f)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 2126536451, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -2126536431);
    }

    private final onTransact onExtraCallback(List<onExtraCallbackWithResult> list, List<onExtraCallbackWithResult> list2, List<? extends IAuthTabCallbackStub> list3, boolean z, access000 access000Var) {
        return (onTransact) onExtraCallbackWithResult(new Object[]{this, list, list2, list3, Boolean.valueOf(z), access000Var}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -715332983, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 715332999);
    }

    private final List<IAuthTabCallbackStub> onNavigationEvent(List<onExtraCallbackWithResult> list, List<onExtraCallbackWithResult> list2, boolean z, boolean z2, access000 access000Var) {
        return (List) onExtraCallbackWithResult(new Object[]{this, list, list2, Boolean.valueOf(z), Boolean.valueOf(z2), access000Var}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 832088648, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -832088636);
    }

    private final onExtraCallback IAuthTabCallback(List<onExtraCallbackWithResult> list, List<onExtraCallbackWithResult> list2, List<? extends IAuthTabCallbackStub> list3, boolean z, access000 access000Var) {
        return (onExtraCallback) onExtraCallbackWithResult(new Object[]{this, list, list2, list3, Boolean.valueOf(z), access000Var}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1050413352, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1050413330);
    }

    private final void onExtraCallback(Canvas canvas, CharSequence charSequence, float f, float f2, Paint paint) {
        onExtraCallbackWithResult(new Object[]{this, canvas, charSequence, Float.valueOf(f), Float.valueOf(f2), paint}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -731251165, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 731251178);
    }

    private final String IAuthTabCallback(CharSequence charSequence) {
        return (String) onExtraCallbackWithResult(new Object[]{this, charSequence}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1447235696, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1447235687);
    }

    private static final Unit onTransact(TdsRollingNumberV1View tdsRollingNumberV1View, onTransact ontransact, float f) {
        return (Unit) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, ontransact, Float.valueOf(f)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1066779698, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1066779677);
    }

    private static final Unit onWarmupCompleted(TdsRollingNumberV1View tdsRollingNumberV1View, asInterface asinterface, float f) {
        return (Unit) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, asinterface, Float.valueOf(f)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 2066092931, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -2066092906);
    }

    private static final Unit asInterface(TdsRollingNumberV1View tdsRollingNumberV1View, asInterface asinterface, float f) {
        return (Unit) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, asinterface, Float.valueOf(f)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 859304503, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -859304479);
    }

    private static final AppLovinSdkSettings onWarmupCompleted(TdsRollingNumberV1View tdsRollingNumberV1View, boolean z) {
        return (AppLovinSdkSettings) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, Boolean.valueOf(z)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1996864087, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1996864088);
    }

    private final boolean onMessageChannelReady() {
        return ((Boolean) onExtraCallbackWithResult(new Object[]{this}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1909624481, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1909624475)).booleanValue();
    }

    private final boolean onMinimized() {
        return ((Boolean) onExtraCallbackWithResult(new Object[]{this}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1977507681, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1977507699)).booleanValue();
    }

    private final boolean onWarmupCompleted(char c) {
        return ((Boolean) onExtraCallbackWithResult(new Object[]{this, Character.valueOf(c)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -547612458, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 547612458)).booleanValue();
    }

    private static final RectF ICustomTabsCallbackStubProxy() {
        return (RectF) onExtraCallbackWithResult(new Object[0], MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1818681553, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1818681576);
    }

    private static final Unit IAuthTabCallback(TdsRollingNumberV1View tdsRollingNumberV1View, String str, access000 access000Var, boolean z, boolean z2, boolean z3, char c, char c2) {
        return (Unit) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, str, access000Var, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Character.valueOf(c), Character.valueOf(c2)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -83639508, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 83639522);
    }

    private static final Unit IAuthTabCallback(TdsRollingNumberV1View tdsRollingNumberV1View, String str, String str2, boolean z, boolean z2, int i, access000 access000Var, boolean z3) {
        return (Unit) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, str, str2, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i), access000Var, Boolean.valueOf(z3)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1421619214, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1421619224);
    }

    private static final Unit IAuthTabCallbackDefault(TdsRollingNumberV1View tdsRollingNumberV1View) {
        return (Unit) onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1168770223, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1168770227);
    }

    static void asBinder() {
        ITrustedWebActivityCallback_Parcel = 5248306119991149248L;
    }
}
