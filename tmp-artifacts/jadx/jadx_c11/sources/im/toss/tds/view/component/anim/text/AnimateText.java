package im.toss.tds.view.component.anim.text;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.provider.Settings;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.zziea;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.tosscert.ui.R;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda11;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.R;
import im.toss.tds.view.component.anim.top.AnimateTop;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.SubTypography1;
import im.toss.tds.view.component.atom.text.SubTypography10;
import im.toss.tds.view.component.atom.text.SubTypography11;
import im.toss.tds.view.component.atom.text.SubTypography12;
import im.toss.tds.view.component.atom.text.SubTypography2;
import im.toss.tds.view.component.atom.text.SubTypography3;
import im.toss.tds.view.component.atom.text.SubTypography4;
import im.toss.tds.view.component.atom.text.SubTypography5;
import im.toss.tds.view.component.atom.text.SubTypography6;
import im.toss.tds.view.component.atom.text.SubTypography7;
import im.toss.tds.view.component.atom.text.SubTypography8;
import im.toss.tds.view.component.atom.text.SubTypography9;
import im.toss.tds.view.component.atom.text.Typography;
import im.toss.tds.view.component.atom.text.Typography1;
import im.toss.tds.view.component.atom.text.Typography2;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.atom.text.Typography4;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.text.Typography7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.Address;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.AppLovinSdkConfigurationConsentDialogState;
import o.AppLovinSdkSettings;
import o.CacheCacheResponseBody1;
import o.S0;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.access15300;
import o.access15400;
import o.deprecated_certificatePinner;
import o.findResAndMsg;
import o.formatMsgs;
import o.getExtraParameters;
import o.getReadTimeoutokhttp;
import o.getRetryOnConnectionFailureokhttp;
import o.getSocketFactoryokhttp;
import o.getTcfVendorConsentStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.getWriteTimeoutokhttp;
import o.getX509TrustManagerOrNullokhttp;
import o.isFireOS;
import o.isMuted;
import o.isUserConsentSet;
import o.matches;
import o.maybeUpdateAnimatable;
import o.pingInterval;
import o.processDeepLink;
import o.pxToDp;
import o.readTimeout;
import o.response;
import o.runOnUiThreadDelayed;
import o.setAuthenticatorokhttp;
import o.setBodyokhttp;
import o.setCreativeDebuggerEnabled;
import o.setHasUserConsent;
import o.setHeadersokhttp;
import o.setRandomHost;
import o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AnimateText extends View {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int prefetchWithMultipleUrls = 1;
    private static int setEngagementSignalsCallback = 0;
    private static int validateRelationship = 1;
    private static int warmup;
    private runOnUiThreadDelayed IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private Integer[] IAuthTabCallbackStub;
    private StaticLayout IAuthTabCallbackStubProxy;
    private final pingInterval IAuthTabCallback_Parcel;
    private response ICustomTabsCallback;
    private IAuthTabCallback ICustomTabsCallbackDefault;
    private StaticLayout ICustomTabsCallbackStub;
    private boolean ICustomTabsCallbackStubProxy;
    private final Matrix ICustomTabsCallback_Parcel;
    private final List<getRetryOnConnectionFailureokhttp> ICustomTabsService;
    private final List<getRetryOnConnectionFailureokhttp> access000;
    private CharSequence access100;
    private onNavigationEvent asBinder;
    private int asInterface;
    private boolean extraCallback;
    private getWriteTimeoutokhttp.IAuthTabCallback extraCallbackWithResult;
    private CharSequence extraCommand;
    private Runnable getInterfaceDescriptor;
    private final pingInterval isEngagementSignalsApiAvailable;
    private int mayLaunchUrl;
    private getWriteTimeoutokhttp.onNavigationEvent newAuthTabSession;
    private int newSession;
    private onWarmupCompleted newSessionWithExtras;
    private int onActivityLayout;
    private final Matrix onActivityResized;
    private final Camera onExtraCallback;
    private final Matrix onExtraCallbackWithResult;
    private boolean onMessageChannelReady;
    private boolean onMinimized;
    private final Lazy onNavigationEvent;
    private long onPostMessage;
    private boolean onRelationshipValidationResult;
    private IAuthTabCallback onTransact;
    private onNavigationEvent onUnminimized;
    private BaseTextView onWarmupCompleted;
    private Runnable postMessage;
    private Shader prefetch;
    private boolean readTypedObject;
    private getWriteTimeoutokhttp.onWarmupCompleted receiveFile;
    private final List<CharSequence> requestPostMessageChannel;
    private runOnUiThreadDelayed requestPostMessageChannelWithExtras;
    private int writeTypedObject;

    static final class IAuthTabCallbackDefault extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = AnimateText.onExtraCallback(AnimateText.this, (access13800) this);
            if (i3 == 0) {
                int i4 = 26 / 0;
            }
            int i5 = onExtraCallbackWithResult + 117;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objOnExtraCallback;
        }
    }

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] IAuthTabCallback;
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent = 0;
        private static int onTransact = 1;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[AnimateTop.IAuthTabCallback.values().length];
            try {
                iArr[AnimateTop.IAuthTabCallback.Size28.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimateTop.IAuthTabCallback.Size22.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
            int[] iArr2 = new int[AnimateTop.onExtraCallback.values().length];
            try {
                iArr2[AnimateTop.onExtraCallback.Size17.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AnimateTop.onExtraCallback.Size15.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AnimateTop.onExtraCallback.Size13.ordinal()] = 3;
                int i = onTransact + 99;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            onExtraCallbackWithResult = iArr2;
            int[] iArr3 = new int[IAuthTabCallback.values().length];
            try {
                iArr3[IAuthTabCallback.Char.ordinal()] = 1;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[IAuthTabCallback.Word.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[IAuthTabCallback.Line.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            onExtraCallback = iArr3;
            int[] iArr4 = new int[onNavigationEvent.values().length];
            try {
                iArr4[onNavigationEvent.CENTER_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[onNavigationEvent.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[onNavigationEvent.CENTER_LEFT.ordinal()] = 3;
                int i5 = onNavigationEvent + 75;
                onTransact = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 / 5;
                } else {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused11) {
            }
            IAuthTabCallback = iArr4;
        }
    }

    public static abstract class onWarmupCompleted {
        public abstract Shader onNavigationEvent(float f, float f2);
    }

    static {
        int i = validateRelationship + 33;
        warmup = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimateText(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimateText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 103;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = new Object[0];
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -26255257, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr2, iOnWarmupCompleted, 26255258, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        int i4 = setEngagementSignalsCallback + 45;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 9;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 443606654, iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted, -443606634, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        int i4 = setEngagementSignalsCallback + 7;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(ViewGroup viewGroup, AnimateText animateText, Function0 function0, Function0 function02) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 65;
        setEngagementSignalsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(viewGroup, animateText, function0, function02);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(viewGroup, animateText, function0, function02);
        int i3 = setEngagementSignalsCallback + 23;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 7;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            ICustomTabsServiceDefault();
            throw null;
        }
        Unit unitICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int i3 = prefetchWithMultipleUrls + 71;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitICustomTabsServiceDefault;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 61;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedList = writeTypedList();
        int i4 = prefetchWithMultipleUrls + 81;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitWriteTypedList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 75;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1009348617, iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted, 1009348629, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        int i4 = setEngagementSignalsCallback + 97;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 105;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit engagementSignalsCallback = setEngagementSignalsCallback();
        int i4 = prefetchWithMultipleUrls + 15;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return engagementSignalsCallback;
    }

    public static /* synthetic */ Unit ICustomTabsCallback() {
        Unit unitValidateRelationship;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 9;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitValidateRelationship = validateRelationship();
            int i3 = 51 / 0;
        } else {
            unitValidateRelationship = validateRelationship();
        }
        int i4 = prefetchWithMultipleUrls + 45;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return unitValidateRelationship;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        Unit unit;
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 9;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
            unit = (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1257666275, iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted, 1257666297, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
            int i3 = 20 / 0;
        } else {
            int iOnWarmupCompleted3 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted4 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
            unit = (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1257666275, iOnWarmupCompleted4, new Object[0], iOnWarmupCompleted3, 1257666297, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        }
        int i4 = setEngagementSignalsCallback + 29;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit access000() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 95;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIEngagementSignalsCallback = IEngagementSignalsCallback();
        int i4 = prefetchWithMultipleUrls + 101;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIEngagementSignalsCallback;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        ViewGroup viewGroup = (ViewGroup) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        AnimateText animateText = (AnimateText) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Function0 function02 = (Function0) objArr[4];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 39;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {viewGroup, function0, animateText, Integer.valueOf(iIntValue), function02};
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted4 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        if (i3 == 0) {
            return (Unit) onWarmupCompleted(iOnWarmupCompleted3, 2010377297, iOnWarmupCompleted2, objArr2, iOnWarmupCompleted, -2010377295, iOnWarmupCompleted4);
        }
        throw null;
    }

    public static /* synthetic */ Unit access100() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 19;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 141899817, iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted, -141899796, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        int i4 = prefetchWithMultipleUrls + 55;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        AnimateText animateText = (AnimateText) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 103;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(animateText, function0);
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit asBinder() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 113;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 != 0) {
            return postMessage();
        }
        postMessage();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit extraCallback() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 117;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsServiceStubProxy = ICustomTabsServiceStubProxy();
        int i4 = setEngagementSignalsCallback + 39;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsServiceStubProxy;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 95;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitRequestPostMessageChannel = requestPostMessageChannel();
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return unitRequestPostMessageChannel;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 61;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitNewAuthTabSession = newAuthTabSession();
        int i4 = prefetchWithMultipleUrls + 47;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitNewAuthTabSession;
    }

    public static /* synthetic */ float onExtraCallback(Context context) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 95;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = onNavigationEvent(context);
        int i4 = setEngagementSignalsCallback + 107;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 111;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unitPrefetchWithMultipleUrls = prefetchWithMultipleUrls();
        int i4 = setEngagementSignalsCallback + 61;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return unitPrefetchWithMultipleUrls;
    }

    public static /* synthetic */ Unit onExtraCallback(AnimateText animateText, int i, String str, List list, readTimeout readtimeout, Integer num, int i2, int i3, onNavigationEvent onnavigationevent, Function0 function0, Function0 function02, Function0 function03, Function0 function04, AnimateTop animateTop) {
        int i4 = 2 % 2;
        int i5 = setEngagementSignalsCallback + 59;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(animateText, i, str, list, readtimeout, num, i2, i3, onnavigationevent, function0, function02, function03, function04, animateTop);
        int i7 = setEngagementSignalsCallback + 27;
        prefetchWithMultipleUrls = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 87;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1830000536, iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted, -1830000528, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        int i4 = setEngagementSignalsCallback + 119;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        Unit unitReceiveFile;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 33;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitReceiveFile = receiveFile();
            int i3 = 90 / 0;
        } else {
            unitReceiveFile = receiveFile();
        }
        int i4 = setEngagementSignalsCallback + 35;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return unitReceiveFile;
    }

    public static /* synthetic */ Unit onNavigationEvent(AnimateText animateText, Function0 function0) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 111;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 134719532, iOnWarmupCompleted2, new Object[]{animateText, function0}, iOnWarmupCompleted, -134719513, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        int i4 = prefetchWithMultipleUrls + 21;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(AnimateText animateText, readTimeout readtimeout, Integer num, boolean z, int i, boolean z2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, AnimateTop animateTop) {
        int i2 = 2 % 2;
        int i3 = prefetchWithMultipleUrls + 43;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(animateText, readtimeout, num, z, i, z2, function0, function02, function03, function04, animateTop);
        int i5 = prefetchWithMultipleUrls + 45;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onTransact() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 65;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsService_Parcel = ICustomTabsService_Parcel();
        int i4 = setEngagementSignalsCallback + 59;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsService_Parcel;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7;
        int i8 = i2 | i5 | i4;
        int i9 = (~((~i4) | i5)) | i2;
        int i10 = ~((~i2) | i5);
        int i11 = i2 + i5 + i3 + (1132004924 * i) + ((-2047965933) * i6);
        int i12 = i11 * i11;
        int i13 = ((1650805025 * i2) - 289800192) + ((-1513965855) * i5) + ((-565098208) * i8) + (i9 * 565098208) + (565098208 * i10) + ((-2079064064) * i3) + (1823473664 * i) + (830210048 * i6) + ((-1143341056) * i12);
        int i14 = ((i2 * (-767560105)) - 1188649921) + (i5 * (-767559017)) + (i8 * (-544)) + (i9 * 544) + (i10 * 544) + (i3 * (-767559561)) + (i * 1544553956) + (i6 * (-1468578859)) + (i12 * (-2108293120));
        int i15 = 0;
        switch (i13 + (i14 * i14 * (-2075787264))) {
            case 1:
                int i16 = 2 % 2;
                int i17 = prefetchWithMultipleUrls + 119;
                setEngagementSignalsCallback = i17 % 128;
                int i18 = i17 % 2;
                Unit unit = Unit.INSTANCE;
                int i19 = setEngagementSignalsCallback + 123;
                prefetchWithMultipleUrls = i19 % 128;
                int i20 = i19 % 2;
                return unit;
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return asInterface(objArr);
            case 10:
                return asBinder(objArr);
            case 11:
                return getInterfaceDescriptor(objArr);
            case 12:
                return IAuthTabCallback_Parcel(objArr);
            case 13:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                return access000(objArr);
            case 15:
                return access100(objArr);
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                return writeTypedObject(objArr);
            case R.styleable.TdsListRowV1View_centerType /* 17 */:
                return extraCallbackWithResult(objArr);
            case R.styleable.TdsListRowV1View_disabledType /* 18 */:
                return ICustomTabsCallback(objArr);
            case R.styleable.TdsListRowV1View_leftDate /* 19 */:
                return extraCallback(objArr);
            case R.styleable.TdsListRowV1View_leftImage /* 20 */:
                return readTypedObject(objArr);
            case R.styleable.TdsListRowV1View_leftImageColor /* 21 */:
                return onActivityLayout(objArr);
            case R.styleable.TdsListRowV1View_leftImageHeight /* 22 */:
                return onPostMessage(objArr);
            case R.styleable.TdsListRowV1View_leftImageType /* 23 */:
                return onMessageChannelReady(objArr);
            case R.styleable.TdsListRowV1View_leftImageUrl /* 24 */:
                return onMinimized(objArr);
            case R.styleable.TdsListRowV1View_leftImageWidth /* 25 */:
                AnimateText animateText = (AnimateText) objArr[0];
                List<? extends CharSequence> list = (List) objArr[1];
                readTimeout readtimeout = (readTimeout) objArr[2];
                onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[3];
                int iIntValue = ((Number) objArr[4]).intValue();
                int iIntValue2 = ((Number) objArr[5]).intValue();
                int iIntValue3 = ((Number) objArr[6]).intValue();
                int iIntValue4 = ((Number) objArr[7]).intValue();
                Object obj = objArr[8];
                int i21 = 2 % 2;
                if ((iIntValue4 & 4) != 0) {
                    onnavigationevent = onNavigationEvent.TOP_LEFT;
                }
                if ((iIntValue4 & 8) != 0) {
                    int i22 = setEngagementSignalsCallback + 41;
                    int i23 = i22 % 128;
                    prefetchWithMultipleUrls = i23;
                    int i24 = i22 % 2;
                    int i25 = i23 + 27;
                    setEngagementSignalsCallback = i25 % 128;
                    int i26 = i25 % 2;
                    i7 = 1;
                } else {
                    i7 = iIntValue;
                }
                animateText.onExtraCallback(list, readtimeout, onnavigationevent, i7, (iIntValue4 & 16) != 0 ? 0 : iIntValue2, (iIntValue4 & 32) != 0 ? 0 : iIntValue3);
                return null;
            case R.styleable.TdsListRowV1View_leftLottie /* 26 */:
                return onActivityResized(objArr);
            case R.styleable.TdsListRowV1View_leftLottieHeight /* 27 */:
                return onUnminimized(objArr);
            case R.styleable.TdsListRowV1View_leftLottieRepeatCount /* 28 */:
                AnimateText animateText2 = (AnimateText) objArr[0];
                readTimeout readtimeout2 = (readTimeout) objArr[1];
                int iIntValue5 = ((Number) objArr[2]).intValue();
                Function0<Unit> function0 = (Function0) objArr[3];
                int iIntValue6 = ((Number) objArr[4]).intValue();
                Object obj2 = objArr[5];
                int i27 = 2 % 2;
                if ((iIntValue6 & 2) != 0) {
                    int i28 = setEngagementSignalsCallback;
                    int i29 = i28 + 73;
                    prefetchWithMultipleUrls = i29 % 128;
                    int i30 = i29 % 2;
                    int i31 = i28 + 87;
                    prefetchWithMultipleUrls = i31 % 128;
                    int i32 = i31 % 2;
                } else {
                    i15 = iIntValue5;
                }
                if ((iIntValue6 & 4) != 0) {
                    function0 = new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda6
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke() {
                            int i33 = 2 % 2;
                            int i34 = onExtraCallbackWithResult + 15;
                            onNavigationEvent = i34 % 128;
                            int i35 = i34 % 2;
                            Object obj3 = null;
                            Object[] objArr2 = new Object[0];
                            int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                            if (i35 != 0) {
                                obj3.hashCode();
                                throw null;
                            }
                            Unit unit2 = (Unit) AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1608491223, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr2, iOnWarmupCompleted, -1608491209, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                            int i36 = onExtraCallbackWithResult + 19;
                            onNavigationEvent = i36 % 128;
                            if (i36 % 2 == 0) {
                                return unit2;
                            }
                            throw null;
                        }
                    };
                }
                animateText2.onExtraCallback(readtimeout2, i15, function0);
                return null;
            case R.styleable.TdsListRowV1View_leftLottieUrl /* 29 */:
                return ICustomTabsCallbackStub(objArr);
            case R.styleable.TdsListRowV1View_leftLottieWidth /* 30 */:
                return onRelationshipValidationResult(objArr);
            case R.styleable.TdsListRowV1View_leftRank /* 31 */:
                AnimateText animateText3 = (AnimateText) objArr[0];
                int i33 = 2 % 2;
                int i34 = prefetchWithMultipleUrls;
                int i35 = i34 + 111;
                setEngagementSignalsCallback = i35 % 128;
                int i36 = i35 % 2;
                long j = animateText3.onPostMessage;
                int i37 = i34 + 37;
                setEngagementSignalsCallback = i37 % 128;
                int i38 = i37 % 2;
                return Long.valueOf(j);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 17;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function0);
        if (i3 != 0) {
            throw null;
        }
        int i4 = setEngagementSignalsCallback + 109;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 61;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsServiceStub = ICustomTabsServiceStub();
        int i4 = setEngagementSignalsCallback + 81;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return unitICustomTabsServiceStub;
        }
        throw null;
    }

    public static final class IAuthTabCallbackStub implements View.OnLayoutChangeListener {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ getWriteTimeoutokhttp.onWarmupCompleted onNavigationEvent;

        public IAuthTabCallbackStub(getWriteTimeoutokhttp.onWarmupCompleted onwarmupcompleted) {
            this.onNavigationEvent = onwarmupcompleted;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = IAuthTabCallback + 107;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            AnimateText.IAuthTabCallback(AnimateText.this, this.onNavigationEvent.access000(), this.onNavigationEvent.getInterfaceDescriptor(), this.onNavigationEvent.onTransact(), this.onNavigationEvent.asInterface(), this.onNavigationEvent.extraCallback(), this.onNavigationEvent.IAuthTabCallbackStub(), this.onNavigationEvent.IAuthTabCallbackDefault(), (Function0) null, this.onNavigationEvent.asBinder(), (Integer) null, this.onNavigationEvent.onWarmupCompleted(), 640, (Object) null);
            int i12 = onWarmupCompleted + 83;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    public static final class IAuthTabCallbackStubProxy implements View.OnLayoutChangeListener {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ AnimateText IAuthTabCallback;
        final /* synthetic */ IAuthTabCallback onNavigationEvent;
        final /* synthetic */ getWriteTimeoutokhttp.IAuthTabCallback onWarmupCompleted;

        public IAuthTabCallbackStubProxy(getWriteTimeoutokhttp.IAuthTabCallback iAuthTabCallback, AnimateText animateText, IAuthTabCallback iAuthTabCallback2) {
            this.onWarmupCompleted = iAuthTabCallback;
            this.IAuthTabCallback = animateText;
            this.onNavigationEvent = iAuthTabCallback2;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            view.removeOnLayoutChangeListener(this);
            ArrayList arrayList = new ArrayList();
            if (!this.onWarmupCompleted.asInterface()) {
                int i10 = onExtraCallbackWithResult + 113;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                arrayList.add(AnimateText.IAuthTabCallback(this.IAuthTabCallback, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(0.0f), (Function1) null, 5, (Object) null), 0, IAuthTabCallback.None, false, 0));
            }
            arrayList.add(AnimateText.onExtraCallbackWithResult(this.IAuthTabCallback, this.onWarmupCompleted.readTypedObject(), this.onWarmupCompleted.access000(), this.onWarmupCompleted.IAuthTabCallbackStubProxy(), this.onNavigationEvent, this.onWarmupCompleted.onWarmupCompleted()));
            if (!this.onWarmupCompleted.asInterface()) {
                pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
                List<getRetryOnConnectionFailureokhttp> listIAuthTabCallback = AnimateText.IAuthTabCallback(this.IAuthTabCallback);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIAuthTabCallback, 10));
                for (getRetryOnConnectionFailureokhttp getretryonconnectionfailureokhttp : listIAuthTabCallback) {
                    AnimateText animateText = this.IAuthTabCallback;
                    AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                    float fOnNavigationEvent = getretryonconnectionfailureokhttp.ICustomTabsCallback().onNavigationEvent();
                    Object[] objArr = {appLovinSdkSettings, Float.valueOf(0.0f), Float.valueOf(fOnNavigationEvent), new writeTypedObject(getretryonconnectionfailureokhttp, this.IAuthTabCallback), null, 8, null};
                    arrayList2.add((Rally) RallysKt.onWarmupCompleted(new Object[]{animateText, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, objArr, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                    int i12 = onExtraCallbackWithResult + 29;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                }
                arrayList.add(RallysKt.onWarmupCompleted(this.IAuthTabCallback, iAuthTabCallback, arrayList2, 0, null, 0, null, null, Boolean.FALSE, 100, 0L, false, 3320, null));
                int i14 = onExtraCallback + 59;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
            }
            AnimateText.onNavigationEvent(this.IAuthTabCallback, (runOnUiThreadDelayed) isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted(this.IAuthTabCallback, pxToDp.IAuthTabCallback.onExtraCallback, arrayList, 0, null, 0, null, null, Boolean.FALSE, this.onWarmupCompleted.onTransact(), 0L, false, 3320, null), null, this.IAuthTabCallback.new extraCallback(this.onWarmupCompleted), 1, null), false, 1, null));
        }
    }

    public static final class extraCallbackWithResult implements View.OnLayoutChangeListener {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getWriteTimeoutokhttp.onNavigationEvent onExtraCallbackWithResult;

        public extraCallbackWithResult(getWriteTimeoutokhttp.onNavigationEvent onnavigationevent) {
            this.onExtraCallbackWithResult = onnavigationevent;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = IAuthTabCallback + 67;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            List<Pair<CharSequence, Integer>> listOnExtraCallback = AnimateText.this.onExtraCallback(this.onExtraCallbackWithResult.extraCallbackWithResult(), this.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), this.onExtraCallbackWithResult.extraCallback(), this.onExtraCallbackWithResult.ICustomTabsCallback());
            int iAccess000 = this.onExtraCallbackWithResult.access000();
            Iterator<T> it = listOnExtraCallback.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            int iIntValue = ((Number) ((Pair) it.next()).getSecond()).intValue();
            while (!(!it.hasNext())) {
                int i12 = onNavigationEvent + 91;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                int iIntValue2 = ((Number) ((Pair) it.next()).getSecond()).intValue();
                if (iIntValue < iIntValue2) {
                    int i14 = onNavigationEvent + 119;
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
                    iIntValue = iIntValue2;
                }
            }
            int iMax = Math.max(iAccess000, iIntValue);
            AnimateText animateText = AnimateText.this;
            readTypedObject readtypedobject = new readTypedObject(this.onExtraCallbackWithResult, animateText, iMax, listOnExtraCallback);
            AnimateText.this.setTickerRunning$tds_view_release(true);
            AnimateText.onExtraCallbackWithResult(AnimateText.this, false);
            AnimateText.this.post(readtypedobject);
            AnimateText.IAuthTabCallback(animateText, readtypedobject);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateText(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onWarmupCompleted = new Typography(context, null, 0, 6, null);
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda2
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 77;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                float fOnExtraCallback = AnimateText.onExtraCallback(context);
                if (i4 != 0) {
                    return Float.valueOf(fOnExtraCallback);
                }
                int i5 = 81 / 0;
                return Float.valueOf(fOnExtraCallback);
            }
        });
        this.onPostMessage = -1L;
        onNavigationEvent onnavigationevent = onNavigationEvent.TOP_LEFT;
        this.onUnminimized = onnavigationevent;
        int integer = 3;
        this.isEngagementSignalsApiAvailable = new pingInterval(null, null, 3, null);
        this.IAuthTabCallback_Parcel = new pingInterval(null, null, 3, null);
        this.asBinder = onnavigationevent;
        IAuthTabCallback iAuthTabCallback = IAuthTabCallback.Char;
        this.ICustomTabsCallbackDefault = iAuthTabCallback;
        this.onTransact = iAuthTabCallback;
        this.ICustomTabsService = new ArrayList();
        this.access000 = new ArrayList();
        this.IAuthTabCallbackDefault = 255;
        this.requestPostMessageChannel = new ArrayList();
        this.ICustomTabsCallback = response.Medium;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        this.mayLaunchUrl = new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration)).onUnminimized();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, im.toss.tds.view.R.styleable.AnimateText);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i2 = 0;
            while (i2 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == im.toss.tds.view.R.styleable.AnimateText_typography) {
                    integer = typedArrayObtainStyledAttributes.getInteger(index, integer);
                } else if (index == im.toss.tds.view.R.styleable.AnimateText_android_fontFamily) {
                    this.ICustomTabsCallback = response.Companion.onExtraCallback(typedArrayObtainStyledAttributes.getResourceId(index, this.ICustomTabsCallback.getResId()));
                } else {
                    int i3 = im.toss.tds.view.R.styleable.AnimateText_android_textColor;
                    if (index != i3) {
                        if (index == im.toss.tds.view.R.styleable.AnimateText_preserveTextOnRecyclerViewDetach) {
                            this.onRelationshipValidationResult = typedArrayObtainStyledAttributes.getBoolean(index, false);
                        }
                    } else {
                        Context context3 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "");
                        Configuration configuration2 = context3.getResources().getConfiguration();
                        Intrinsics.checkNotNullExpressionValue(configuration2, "");
                        this.mayLaunchUrl = typedArrayObtainStyledAttributes.getColor(i3, new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration2)).onUnminimized());
                    }
                }
                i2++;
                int i4 = setEngagementSignalsCallback + 95;
                prefetchWithMultipleUrls = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            typedArrayObtainStyledAttributes.recycle();
            int i7 = prefetchWithMultipleUrls + 33;
            setEngagementSignalsCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
        }
        setTypography(integer);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        Configuration configuration3 = context4.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        int iAccess200 = new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration3)).access200();
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        Configuration configuration4 = context5.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration4, "");
        int iIntValue = ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-1604678659, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration4)).requestPostMessageChannel()}, matches.onExtraCallback(), 1604678665, matches.onExtraCallback())).intValue();
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        Configuration configuration5 = context6.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration5, "");
        this.IAuthTabCallbackStub = new Integer[]{Integer.valueOf(iAccess200), Integer.valueOf(iIntValue), Integer.valueOf(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration5)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue())};
        this.onExtraCallback = new Camera();
        this.onExtraCallbackWithResult = new Matrix();
        this.ICustomTabsCallback_Parcel = new Matrix();
        this.onActivityResized = new Matrix();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AnimateText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = setEngagementSignalsCallback + 105;
            prefetchWithMultipleUrls = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = setEngagementSignalsCallback + 113;
            prefetchWithMultipleUrls = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ List IAuthTabCallback(AnimateText animateText) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 55;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        int i4 = i2 % 2;
        Object obj = null;
        List<getRetryOnConnectionFailureokhttp> list = animateText.access000;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 109;
        setEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public static final /* synthetic */ runOnUiThreadDelayed IAuthTabCallback(AnimateText animateText, AppLovinSdkSettings appLovinSdkSettings, int i, IAuthTabCallback iAuthTabCallback, boolean z, int i2) {
        int i3 = 2 % 2;
        int i4 = setEngagementSignalsCallback + 81;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallback = animateText.onExtraCallback(appLovinSdkSettings, i, iAuthTabCallback, z, i2);
        int i6 = setEngagementSignalsCallback + 105;
        prefetchWithMultipleUrls = i6 % 128;
        if (i6 % 2 != 0) {
            return runonuithreaddelayedOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(AnimateText animateText, onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 113;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        animateText.onNavigationEvent(onnavigationevent);
        int i4 = setEngagementSignalsCallback + 43;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void IAuthTabCallback(AnimateText animateText, CharSequence charSequence, onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 43;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        animateText.onNavigationEvent(charSequence, onnavigationevent);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = setEngagementSignalsCallback + 71;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(AnimateText animateText, Runnable runnable) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 11;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        animateText.postMessage = runnable;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getWriteTimeoutokhttp.onNavigationEvent IAuthTabCallbackDefault(AnimateText animateText) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 69;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        int i4 = i2 % 2;
        getWriteTimeoutokhttp.onNavigationEvent onnavigationevent = animateText.newAuthTabSession;
        int i5 = i3 + 39;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return onnavigationevent;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        AnimateText animateText = (AnimateText) objArr[0];
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 91;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        getWriteTimeoutokhttp.IAuthTabCallback iAuthTabCallback = animateText.extraCallbackWithResult;
        int i5 = i2 + 45;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 != 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        AnimateText animateText = (AnimateText) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 33;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        animateText.IAuthTabCallbackDefault = iIntValue;
        int i5 = i2 + 23;
        prefetchWithMultipleUrls = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getWriteTimeoutokhttp.onWarmupCompleted IAuthTabCallbackStubProxy(AnimateText animateText) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 71;
        int i3 = i2 % 128;
        setEngagementSignalsCallback = i3;
        int i4 = i2 % 2;
        getWriteTimeoutokhttp.onWarmupCompleted onwarmupcompleted = animateText.receiveFile;
        int i5 = i3 + 53;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 != 0) {
            return onwarmupcompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) {
        AnimateText animateText = (AnimateText) objArr[0];
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 97;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1934036565, iOnWarmupCompleted2, new Object[]{animateText, iAuthTabCallback}, iOnWarmupCompleted, -1934036549, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        int i4 = prefetchWithMultipleUrls + 61;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return null;
    }

    public static final /* synthetic */ Runnable asBinder(AnimateText animateText) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 43;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        int i4 = i2 % 2;
        Runnable runnable = animateText.getInterfaceDescriptor;
        int i5 = i3 + 43;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return runnable;
    }

    public static final /* synthetic */ int asInterface(AnimateText animateText) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 69;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = animateText.onActivityLayout;
        if (i4 != 0) {
            int i6 = 59 / 0;
        }
        int i7 = i2 + 41;
        setEngagementSignalsCallback = i7 % 128;
        int i8 = i7 % 2;
        return i5;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        AnimateText animateText = (AnimateText) objArr[0];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 115;
        int i3 = i2 % 128;
        setEngagementSignalsCallback = i3;
        int i4 = i2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = animateText.requestPostMessageChannelWithExtras;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 81;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
        return runonuithreaddelayed;
    }

    public static final /* synthetic */ Object onExtraCallback(AnimateText animateText, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 37;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = animateText.IAuthTabCallback((access13800<? super Unit>) access13800Var);
        int i4 = prefetchWithMultipleUrls + 85;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return objIAuthTabCallback;
        }
        throw null;
    }

    public static final /* synthetic */ int onExtraCallbackWithResult(AnimateText animateText, StaticLayout staticLayout, IAuthTabCallback iAuthTabCallback, int i) {
        int i2 = 2 % 2;
        int i3 = prefetchWithMultipleUrls + 3;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        int iOnExtraCallbackWithResult = animateText.onExtraCallbackWithResult(staticLayout, iAuthTabCallback, i);
        int i5 = setEngagementSignalsCallback + 53;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
        return iOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ BaseTextView onExtraCallbackWithResult(AnimateText animateText) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 115;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextView = animateText.onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        return baseTextView;
    }

    public static final /* synthetic */ runOnUiThreadDelayed onExtraCallbackWithResult(AnimateText animateText, CharSequence charSequence, String str, setAuthenticatorokhttp setauthenticatorokhttp, IAuthTabCallback iAuthTabCallback, AnimateTop animateTop) throws NumberFormatException {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 49;
        prefetchWithMultipleUrls = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            animateText.onExtraCallbackWithResult(charSequence, str, setauthenticatorokhttp, iAuthTabCallback, animateTop);
            throw null;
        }
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult = animateText.onExtraCallbackWithResult(charSequence, str, setauthenticatorokhttp, iAuthTabCallback, animateTop);
        int i3 = setEngagementSignalsCallback + 7;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 != 0) {
            return runonuithreaddelayedOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(AnimateText animateText, int i) {
        int i2 = 2 % 2;
        int i3 = setEngagementSignalsCallback + 123;
        int i4 = i3 % 128;
        prefetchWithMultipleUrls = i4;
        int i5 = i3 % 2;
        Object obj = null;
        animateText.asInterface = i;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 125;
        setEngagementSignalsCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(AnimateText animateText, boolean z) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 3;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        animateText.readTypedObject = z;
        int i5 = i2 + 43;
        setEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        AnimateText animateText = (AnimateText) objArr[0];
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 73;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        boolean z = animateText.onMessageChannelReady;
        if (i4 == 0) {
            int i5 = 67 / 0;
        }
        int i6 = i2 + 101;
        prefetchWithMultipleUrls = i6 % 128;
        if (i6 % 2 != 0) {
            return Boolean.valueOf(z);
        }
        int i7 = 40 / 0;
        return Boolean.valueOf(z);
    }

    public static final /* synthetic */ StaticLayout onNavigationEvent(AnimateText animateText) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 99;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        StaticLayout staticLayout = animateText.IAuthTabCallbackStubProxy;
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        return staticLayout;
    }

    public static final /* synthetic */ void onNavigationEvent(AnimateText animateText, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 13;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        animateText.IAuthTabCallback(charSequence);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        int i5 = prefetchWithMultipleUrls + 9;
        setEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(AnimateText animateText, runOnUiThreadDelayed runonuithreaddelayed) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 89;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        animateText.requestPostMessageChannelWithExtras = runonuithreaddelayed;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        AnimateText animateText = (AnimateText) objArr[0];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 11;
        int i3 = i2 % 128;
        setEngagementSignalsCallback = i3;
        int i4 = i2 % 2;
        pingInterval pinginterval = animateText.IAuthTabCallback_Parcel;
        if (i4 != 0) {
            int i5 = 64 / 0;
        }
        int i6 = i3 + 19;
        prefetchWithMultipleUrls = i6 % 128;
        if (i6 % 2 != 0) {
            return pinginterval;
        }
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(AnimateText animateText) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 61;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
            onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1458955612, iOnWarmupCompleted2, new Object[]{animateText}, iOnWarmupCompleted, 1458955629, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted3 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted4 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1458955612, iOnWarmupCompleted4, new Object[]{animateText}, iOnWarmupCompleted3, 1458955629, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        int i3 = setEngagementSignalsCallback + 33;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 46 / 0;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(AnimateText animateText, int i, String str, List list, readTimeout readtimeout, Integer num, int i2, int i3, onNavigationEvent onnavigationevent, Function0 function0, Function0 function02, Function0 function03, Function0 function04, AnimateTop animateTop) {
        int i4 = 2 % 2;
        int i5 = prefetchWithMultipleUrls + 31;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        animateText.onExtraCallbackWithResult(i, str, list, readtimeout, num, i2, i3, onnavigationevent, function0, function02, function03, function04, animateTop);
        int i7 = prefetchWithMultipleUrls + 81;
        setEngagementSignalsCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 29 / 0;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(AnimateText animateText, Runnable runnable) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 69;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        int i4 = i2 % 2;
        animateText.getInterfaceDescriptor = runnable;
        if (i4 == 0) {
            int i5 = 8 / 0;
        }
        int i6 = i3 + 15;
        setEngagementSignalsCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    private final float extraCommand() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 65;
        setEngagementSignalsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ((Number) this.onNavigationEvent.getValue()).floatValue();
            obj.hashCode();
            throw null;
        }
        float fFloatValue = ((Number) this.onNavigationEvent.getValue()).floatValue();
        int i3 = prefetchWithMultipleUrls + 7;
        setEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return fFloatValue;
        }
        obj.hashCode();
        throw null;
    }

    private static final float onNavigationEvent(Context context) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 33;
        prefetchWithMultipleUrls = i2 % 128;
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", i2 % 2 == 0 ? 0.0f : 1.0f);
    }

    public final CharSequence onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 67;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        int i4 = i2 % 2;
        CharSequence charSequence = this.extraCommand;
        int i5 = i3 + 111;
        setEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return charSequence;
        }
        throw null;
    }

    public final void setPrevText$tds_view_release(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 115;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        int i4 = i2 % 2;
        this.extraCommand = charSequence;
        if (i4 == 0) {
            int i5 = 75 / 0;
        }
        int i6 = i3 + 23;
        setEngagementSignalsCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CharSequence onMinimized() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 31;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        CharSequence charSequence = this.access100;
        int i5 = i2 + 115;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return charSequence;
    }

    public final void setCurText$tds_view_release(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 111;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        this.access100 = charSequence;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 57;
        setEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
    }

    public final int ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 103;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.newSession;
        if (i3 == 0) {
            int i5 = 49 / 0;
        }
        return i4;
    }

    public final void setTickerMaxHeight$tds_view_release(int i) {
        int i2 = 2 % 2;
        int i3 = setEngagementSignalsCallback + 73;
        int i4 = i3 % 128;
        prefetchWithMultipleUrls = i4;
        int i5 = i3 % 2;
        this.newSession = i;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 41;
        setEngagementSignalsCallback = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final List<CharSequence> onUnminimized() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 59;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        List<CharSequence> list = this.requestPostMessageChannel;
        int i5 = i2 + 25;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final boolean ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 29;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onMinimized;
        }
        throw null;
    }

    public final void setTickerRunning$tds_view_release(boolean z) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 55;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        this.onMinimized = z;
        int i5 = i2 + 27;
        setEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setStyle(float f, float f2, @NotNull response responseVar, int i) {
        int i2 = 2 % 2;
        int i3 = setEngagementSignalsCallback + 41;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(responseVar, "");
            setTextSize(f);
            onExtraCallbackWithResult(f2);
            setFont(responseVar);
            setTextColor(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(responseVar, "");
        setTextSize(f);
        onExtraCallbackWithResult(f2);
        setFont(responseVar);
        setTextColor(i);
        int i4 = setEngagementSignalsCallback + 55;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setTextSize(float f) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 81;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.onWarmupCompleted.setTextSize(5, f);
        } else {
            this.onWarmupCompleted.setTextSize(2, f);
        }
        int i3 = setEngagementSignalsCallback + 35;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 21;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.setLineSpacing(0.0f, f);
        int i4 = prefetchWithMultipleUrls + 15;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setFont(@NotNull response responseVar) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 73;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(responseVar, "");
        this.ICustomTabsCallback = responseVar;
        this.onWarmupCompleted.onNavigationEvent(responseVar);
        int i4 = setEngagementSignalsCallback + 7;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setTextColor(int i) {
        int i2 = 2 % 2;
        this.mayLaunchUrl = i;
        TextPaint paint = this.onWarmupCompleted.getPaint();
        if (paint != null) {
            int i3 = prefetchWithMultipleUrls + 91;
            setEngagementSignalsCallback = i3 % 128;
            int i4 = i3 % 2;
            paint.setColor(i);
        }
        int i5 = setEngagementSignalsCallback + 101;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setTextGradientColor(@NotNull Shader shader) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 5;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(shader, "");
        this.newSessionWithExtras = null;
        this.prefetch = shader;
        this.onWarmupCompleted.getPaint().setShader(shader);
        int i4 = setEngagementSignalsCallback + 39;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTextGradient(@Nullable onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 39;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.newSessionWithExtras = onwarmupcompleted;
            this.prefetch = null;
            int i3 = 61 / 0;
            if (onwarmupcompleted == null) {
                this.onWarmupCompleted.getPaint().setShader(null);
            }
        } else {
            this.newSessionWithExtras = onwarmupcompleted;
            this.prefetch = null;
            if (onwarmupcompleted == null) {
            }
        }
        int i4 = prefetchWithMultipleUrls + 13;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setTypography(int i) {
        int i2 = 2 % 2;
        int i3 = setEngagementSignalsCallback + 73;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        this.onWarmupCompleted = onWarmupCompleted(i);
        setFont(this.ICustomTabsCallback);
        setTextColor(this.mayLaunchUrl);
        Shader shader = this.prefetch;
        if (shader != null) {
            int i5 = prefetchWithMultipleUrls + 107;
            setEngagementSignalsCallback = i5 % 128;
            int i6 = i5 % 2;
            setTextGradientColor(shader);
        }
        int i7 = setEngagementSignalsCallback + 125;
        prefetchWithMultipleUrls = i7 % 128;
        int i8 = i7 % 2;
    }

    public final TextPaint onPostMessage() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 45;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        TextPaint paint = this.onWarmupCompleted.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "");
        int i4 = setEngagementSignalsCallback + 119;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return paint;
    }

    private final BaseTextView onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = prefetchWithMultipleUrls + 9;
        setEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        switch (i) {
            case 1:
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                return new Typography1(context, null, 0, 6, null);
            case 2:
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                return new Typography2(context2, null, 0, 6, null);
            case 3:
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                return new Typography3(context3, null, 0, 6, null);
            case 4:
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                Typography4 typography4 = new Typography4(context4, null, 0, 6, null);
                int i4 = setEngagementSignalsCallback + 53;
                prefetchWithMultipleUrls = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 8 / 0;
                }
                return typography4;
            case 5:
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                return new Typography5(context5, null, 0, 6, null);
            case 6:
                Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                return new Typography6(context6, null, 0, 6, null);
            case 7:
                Context context7 = getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "");
                Typography7 typography7 = new Typography7(context7, null, 0, 6, null);
                int i6 = prefetchWithMultipleUrls + 115;
                setEngagementSignalsCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 75 / 0;
                }
                return typography7;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final void setSubTypography(int i) {
        int i2 = 2 % 2;
        int i3 = setEngagementSignalsCallback + 13;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        this.onWarmupCompleted = onNavigationEvent(i);
        setFont(this.ICustomTabsCallback);
        setTextColor(this.mayLaunchUrl);
        Shader shader = this.prefetch;
        if (shader != null) {
            int i5 = prefetchWithMultipleUrls + 81;
            setEngagementSignalsCallback = i5 % 128;
            int i6 = i5 % 2;
            setTextGradientColor(shader);
            if (i6 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final BaseTextView onNavigationEvent(int i) {
        int i2 = 2 % 2;
        switch (i) {
            case 1:
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                return new SubTypography1(context, null, 0, 6, null);
            case 2:
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                return new SubTypography2(context2, null, 0, 6, null);
            case 3:
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                return new SubTypography3(context3, null, 0, 6, null);
            case 4:
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                return new SubTypography4(context4, null, 0, 6, null);
            case 5:
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                return new SubTypography5(context5, null, 0, 6, null);
            case 6:
                Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                SubTypography6 subTypography6 = new SubTypography6(context6, null, 0, 6, null);
                int i3 = setEngagementSignalsCallback + 3;
                prefetchWithMultipleUrls = i3 % 128;
                if (i3 % 2 != 0) {
                    return subTypography6;
                }
                throw null;
            case 7:
                Context context7 = getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "");
                return new SubTypography7(context7, null, 0, 6, null);
            case 8:
                Context context8 = getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "");
                return new SubTypography8(context8, null, 0, 6, null);
            case 9:
                Context context9 = getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "");
                return new SubTypography9(context9, null, 0, 6, null);
            case 10:
                Context context10 = getContext();
                Intrinsics.checkNotNullExpressionValue(context10, "");
                return new SubTypography10(context10, null, 0, 6, null);
            case 11:
                Context context11 = getContext();
                Intrinsics.checkNotNullExpressionValue(context11, "");
                SubTypography11 subTypography11 = new SubTypography11(context11, null, 0, 6, null);
                int i4 = setEngagementSignalsCallback + 89;
                prefetchWithMultipleUrls = i4 % 128;
                if (i4 % 2 != 0) {
                    return subTypography11;
                }
                throw null;
            case 12:
                Context context12 = getContext();
                Intrinsics.checkNotNullExpressionValue(context12, "");
                SubTypography12 subTypography12 = new SubTypography12(context12, null, 0, 6, null);
                int i5 = prefetchWithMultipleUrls + 111;
                setEngagementSignalsCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return subTypography12;
                }
                throw null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void setTextSize$tds_view_release(@NotNull AnimateTop.IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        BaseTextView subTypography2;
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 111;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        int i4 = onExtraCallbackWithResult.onWarmupCompleted[iAuthTabCallback.ordinal()];
        if (i4 == 1) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            subTypography2 = new SubTypography2(context, null, 0, 6, null);
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            subTypography2 = new Typography3(context2, null, 0, 6, null);
        }
        this.onWarmupCompleted = subTypography2;
        setFont(this.ICustomTabsCallback);
        setTextColor(this.mayLaunchUrl);
        Shader shader = this.prefetch;
        if (shader != null) {
            int i5 = prefetchWithMultipleUrls + 49;
            setEngagementSignalsCallback = i5 % 128;
            int i6 = i5 % 2;
            setTextGradientColor(shader);
            int i7 = prefetchWithMultipleUrls + 85;
            setEngagementSignalsCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 5 % 3;
            }
        }
        int i9 = setEngagementSignalsCallback + 93;
        prefetchWithMultipleUrls = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void setTextSize$tds_view_release(@NotNull AnimateTop.onExtraCallback onextracallback) throws NoWhenBranchMatchedException {
        BaseTextView typography5;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        int i2 = onExtraCallbackWithResult.onExtraCallbackWithResult[onextracallback.ordinal()];
        if (i2 != 1) {
            int i3 = setEngagementSignalsCallback + 1;
            prefetchWithMultipleUrls = i3 % 128;
            if (i3 % 2 != 0 ? i2 == 2 : i2 == 2) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                typography5 = new Typography6(context, null, 0, 6, null);
                int i4 = setEngagementSignalsCallback + 39;
                prefetchWithMultipleUrls = i4 % 128;
                int i5 = i4 % 2;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                typography5 = new Typography7(context2, null, 0, 6, null);
            }
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            typography5 = new Typography5(context3, null, 0, 6, null);
        }
        this.onWarmupCompleted = typography5;
        setFont(this.ICustomTabsCallback);
        setTextColor(this.mayLaunchUrl);
        Shader shader = this.prefetch;
        if (shader != null) {
            int i6 = setEngagementSignalsCallback + 61;
            prefetchWithMultipleUrls = i6 % 128;
            int i7 = i6 % 2;
            setTextGradientColor(shader);
            if (i7 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return r1.getColor();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r2 = im.toss.tds.view.component.anim.text.AnimateText.prefetchWithMultipleUrls + 3;
        im.toss.tds.view.component.anim.text.AnimateText.setEngagementSignalsCallback = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int onActivityLayout() {
        TextPaint paint;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 65;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            paint = this.onWarmupCompleted.getPaint();
            int i3 = 20 / 0;
        } else {
            paint = this.onWarmupCompleted.getPaint();
        }
    }

    public final void setMaxTextSize(float f) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 29;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.onWarmupCompleted(f);
        int i4 = prefetchWithMultipleUrls + 41;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final CharSequence onActivityResized() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 125;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        CharSequence charSequence = this.access100;
        if (charSequence == null) {
            int i4 = i3 + 1;
            setEngagementSignalsCallback = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            charSequence = "null";
        }
        int i5 = i3 + 51;
        setEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return charSequence;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(AnimateText animateText, CharSequence charSequence, readTimeout readtimeout, int i, onNavigationEvent onnavigationevent, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, int i2, Object obj) {
        int i3;
        boolean z3;
        Function0 function04;
        int i4 = 2 % 2;
        int i5 = prefetchWithMultipleUrls;
        int i6 = i5 + 7;
        setEngagementSignalsCallback = i6 % 128;
        if (i6 % 2 == 0 ? (i2 & 4) == 0 : (i2 & 3) == 0) {
            i3 = i;
        } else {
            int i7 = i5 + 29;
            setEngagementSignalsCallback = i7 % 128;
            int i8 = i7 % 2;
            i3 = 0;
        }
        onNavigationEvent onnavigationevent2 = (i2 & 8) != 0 ? onNavigationEvent.TOP_LEFT : onnavigationevent;
        if ((i2 & 16) != 0) {
            int i9 = prefetchWithMultipleUrls + 69;
            setEngagementSignalsCallback = i9 % 128;
            int i10 = i9 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        boolean z4 = (i2 & 32) != 0 ? false : z2;
        Function0 function05 = (i2 & 64) != 0 ? new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda16
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i11 = 2 % 2;
                int i12 = onExtraCallbackWithResult + 119;
                onNavigationEvent = i12 % 128;
                if (i12 % 2 != 0) {
                    AnimateText.IAuthTabCallbackStubProxy();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitIAuthTabCallbackStubProxy = AnimateText.IAuthTabCallbackStubProxy();
                int i13 = onNavigationEvent + 103;
                onExtraCallbackWithResult = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 13 / 0;
                }
                return unitIAuthTabCallbackStubProxy;
            }
        } : function0;
        Function0 function06 = (i2 & 128) != 0 ? new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda17
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i11 = 2 % 2;
                int i12 = onExtraCallback + 21;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                Unit unitAccess000 = AnimateText.access000();
                if (i13 == 0) {
                    int i14 = 77 / 0;
                }
                return unitAccess000;
            }
        } : function02;
        if ((i2 & 256) != 0) {
            Function0 function07 = new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda18
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    Unit unitIAuthTabCallback_Parcel;
                    int i11 = 2 % 2;
                    int i12 = onExtraCallbackWithResult + 95;
                    onExtraCallback = i12 % 128;
                    if (i12 % 2 == 0) {
                        unitIAuthTabCallback_Parcel = AnimateText.IAuthTabCallback_Parcel();
                        int i13 = 45 / 0;
                    } else {
                        unitIAuthTabCallback_Parcel = AnimateText.IAuthTabCallback_Parcel();
                    }
                    int i14 = onExtraCallback + 91;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    return unitIAuthTabCallback_Parcel;
                }
            };
            int i11 = prefetchWithMultipleUrls + 97;
            setEngagementSignalsCallback = i11 % 128;
            int i12 = i11 % 2;
            function04 = function07;
        } else {
            function04 = function03;
        }
        animateText.onExtraCallback(charSequence, readtimeout, i3, onnavigationevent2, z3, z4, (Function0<Unit>) function05, (Function0<Unit>) function06, (Function0<Unit>) function04);
    }

    private static final Unit writeTypedList() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 119;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = prefetchWithMultipleUrls + 117;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 93;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = setEngagementSignalsCallback + 123;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        Unit unit;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 81;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unit = Unit.INSTANCE;
            int i3 = 46 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = setEngagementSignalsCallback + 125;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public final void onExtraCallback(@NotNull CharSequence charSequence, @NotNull readTimeout readtimeout, int i, @NotNull onNavigationEvent onnavigationevent, boolean z, boolean z2, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(readtimeout, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        this.extraCallback = S0.onNavigationEvent(charSequence);
        this.onPostMessage = -1L;
        getWriteTimeoutokhttp.onWarmupCompleted onwarmupcompleted = new getWriteTimeoutokhttp.onWarmupCompleted(charSequence, readtimeout, i, onnavigationevent, z, z2, function0, function02, function03);
        if (processDeepLink.onExtraCallback()) {
            int i3 = setEngagementSignalsCallback + 29;
            int i4 = i3 % 128;
            prefetchWithMultipleUrls = i4;
            int i5 = i3 % 2;
            if (!(readtimeout instanceof readTimeout.onNavigationEvent)) {
                int i6 = i4 + 39;
                setEngagementSignalsCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    Object[] objArr = {this, charSequence, Integer.valueOf(i), onnavigationevent, Boolean.valueOf(z), Boolean.valueOf(z2), function0, function02, function03};
                    int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                    onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 824883475, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, iOnWarmupCompleted, -824883475, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                    return;
                }
                Object[] objArr2 = {this, charSequence, Integer.valueOf(i), onnavigationevent, Boolean.valueOf(z), Boolean.valueOf(z2), function0, function02, function03};
                int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 824883475, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr2, iOnWarmupCompleted2, -824883475, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                throw null;
            }
        }
        this.receiveFile = onwarmupcompleted;
        this.newAuthTabSession = null;
        this.extraCallbackWithResult = null;
        onWarmupCompleted(onwarmupcompleted);
    }

    public final void onWarmupCompleted(@NotNull getWriteTimeoutokhttp.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 59;
        setEngagementSignalsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        if (this.onMinimized) {
            warmup();
            if (onwarmupcompleted.asInterface()) {
                ICustomTabsCallbackStub();
            }
        }
        if (StringsKt.isBlank(onwarmupcompleted.access000())) {
            onExtraCallback(onwarmupcompleted.getInterfaceDescriptor(), onwarmupcompleted.onTransact(), onwarmupcompleted.asBinder());
            int i3 = setEngagementSignalsCallback + 65;
            prefetchWithMultipleUrls = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        IAuthTabCallback(onwarmupcompleted.access000());
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        onNavigationEvent((onNavigationEvent) getWriteTimeoutokhttp.onExtraCallback(1819973442, iIAuthTabCallback2, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback, new Object[]{onwarmupcompleted}, iIAuthTabCallback3, -1819973442));
        Object[] objArr = {this, onwarmupcompleted.getInterfaceDescriptor().access100()};
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1934036565, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, iOnWarmupCompleted, -1934036549, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        requestPostMessageChannelWithExtras();
        requestLayout();
        if (isLaidOut()) {
            int i5 = setEngagementSignalsCallback + 105;
            prefetchWithMultipleUrls = i5 % 128;
            if (i5 % 2 == 0) {
                isLayoutRequested();
                obj.hashCode();
                throw null;
            }
            if (!isLayoutRequested()) {
                IAuthTabCallback(this, onwarmupcompleted.access000(), onwarmupcompleted.getInterfaceDescriptor(), onwarmupcompleted.onTransact(), onwarmupcompleted.asInterface(), onwarmupcompleted.extraCallback(), onwarmupcompleted.IAuthTabCallbackStub(), onwarmupcompleted.IAuthTabCallbackDefault(), (Function0) null, onwarmupcompleted.asBinder(), (Integer) null, onwarmupcompleted.onWarmupCompleted(), 640, (Object) null);
                return;
            }
        }
        addOnLayoutChangeListener(new IAuthTabCallbackStub(onwarmupcompleted));
    }

    private final void IAuthTabCallback(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 33;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.extraCommand = this.access100;
            onWarmupCompleted(charSequence);
            int i3 = 57 / 0;
        } else {
            this.extraCommand = this.access100;
            onWarmupCompleted(charSequence);
        }
        int i4 = setEngagementSignalsCallback + 107;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onWarmupCompleted(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 49;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.access100 = charSequence;
            setContentDescription(charSequence);
        } else {
            this.access100 = charSequence;
            setContentDescription(charSequence);
            throw null;
        }
    }

    private final void onNavigationEvent(onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 57;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        this.onUnminimized = this.asBinder;
        this.asBinder = onnavigationevent;
        int i5 = i2 + 45;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        AnimateText animateText = (AnimateText) objArr[0];
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 21;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            animateText.ICustomTabsCallbackDefault = animateText.onTransact;
            animateText.onTransact = iAuthTabCallback;
            int i3 = 96 / 0;
            return null;
        }
        animateText.ICustomTabsCallbackDefault = animateText.onTransact;
        animateText.onTransact = iAuthTabCallback;
        return null;
    }

    private final void requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 87;
        setEngagementSignalsCallback = i2 % 128;
        this.newSession = i2 % 2 != 0 ? 1 : 0;
        this.requestPostMessageChannel.clear();
        int i3 = setEngagementSignalsCallback + 93;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        AnimateText animateText = (AnimateText) objArr[0];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 101;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        AppCompatTextView appCompatTextView = animateText.onWarmupCompleted;
        Integer[] numArr = animateText.IAuthTabCallbackStub;
        int i4 = animateText.writeTypedObject;
        animateText.writeTypedObject = i4 + 1;
        appCompatTextView.setTextColor(numArr[i4 % 3].intValue());
        int i5 = prefetchWithMultipleUrls + 85;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static /* synthetic */ void onWarmupCompleted(AnimateText animateText, List list, readTimeout readtimeout, int i, int i2, String str, onNavigationEvent onnavigationevent, boolean z, Function0 function0, Function0 function02, Function0 function03, int i3, Integer num, int i4, Object obj) {
        int i5;
        String str2;
        int i6 = 2 % 2;
        boolean z2 = false;
        if ((i4 & 4) != 0) {
            int i7 = setEngagementSignalsCallback + 97;
            prefetchWithMultipleUrls = i7 % 128;
            int i8 = i7 % 2;
            i5 = 0;
        } else {
            i5 = i;
        }
        int i9 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) != 0) {
            int i10 = setEngagementSignalsCallback + 49;
            prefetchWithMultipleUrls = i10 % 128;
            int i11 = i10 % 2;
            str2 = "infinite";
        } else {
            str2 = str;
        }
        onNavigationEvent onnavigationevent2 = (i4 & 32) != 0 ? onNavigationEvent.TOP_LEFT : onnavigationevent;
        if ((i4 & 64) != 0) {
            int i12 = setEngagementSignalsCallback + 47;
            prefetchWithMultipleUrls = i12 % 128;
            int i13 = i12 % 2;
        } else {
            z2 = z;
        }
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 238677204, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{animateText, list, readtimeout, Integer.valueOf(i5), Integer.valueOf(i9), str2, onnavigationevent2, Boolean.valueOf(z2), (i4 & 128) != 0 ? new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda7
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i14 = 2 % 2;
                int i15 = onWarmupCompleted + 39;
                onExtraCallbackWithResult = i15 % 128;
                int i16 = i15 % 2;
                Unit unitExtraCallback = AnimateText.extraCallback();
                if (i16 != 0) {
                    int i17 = 0 / 0;
                }
                return unitExtraCallback;
            }
        } : function0, (i4 & 256) != 0 ? new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda8
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i14 = 2 % 2;
                int i15 = onNavigationEvent + 103;
                onExtraCallbackWithResult = i15 % 128;
                if (i15 % 2 == 0) {
                    return AnimateText.onTransact();
                }
                AnimateText.onTransact();
                throw null;
            }
        } : function02, (i4 & 512) != 0 ? new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                Unit unitAccess100;
                int i14 = 2 % 2;
                int i15 = IAuthTabCallback + 1;
                onExtraCallback = i15 % 128;
                if (i15 % 2 == 0) {
                    unitAccess100 = AnimateText.access100();
                    int i16 = 13 / 0;
                } else {
                    unitAccess100 = AnimateText.access100();
                }
                int i17 = IAuthTabCallback + 9;
                onExtraCallback = i17 % 128;
                if (i17 % 2 != 0) {
                    return unitAccess100;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        } : function03, Integer.valueOf((i4 & 1024) != 0 ? 1500 : i3), (i4 & 2048) != 0 ? null : num}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -238677197, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final Unit ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 11;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = prefetchWithMultipleUrls + 59;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 117;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = prefetchWithMultipleUrls + 123;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 75;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = setEngagementSignalsCallback + 45;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) {
        boolean z;
        AnimateText animateText = (AnimateText) objArr[0];
        int iIntValue = 1;
        List list = (List) objArr[1];
        readTimeout readtimeout = (readTimeout) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int iIntValue3 = ((Number) objArr[4]).intValue();
        String str = (String) objArr[5];
        onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[6];
        boolean zBooleanValue = ((Boolean) objArr[7]).booleanValue();
        Function0 function0 = (Function0) objArr[8];
        Function0 function02 = (Function0) objArr[9];
        Function0 function03 = (Function0) objArr[10];
        int iIntValue4 = ((Number) objArr[11]).intValue();
        Integer num = (Integer) objArr[12];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(readtimeout, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        List list2 = list;
        if (list2 instanceof Collection) {
            int i2 = prefetchWithMultipleUrls + 23;
            setEngagementSignalsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 96 / 0;
                if (list2.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        int i4 = setEngagementSignalsCallback + 17;
                        prefetchWithMultipleUrls = i4 % 128;
                        int i5 = i4 % 2;
                        if (S0.onNavigationEvent((CharSequence) it.next())) {
                            int i6 = prefetchWithMultipleUrls + 75;
                            setEngagementSignalsCallback = i6 % 128;
                            int i7 = i6 % 2;
                            z = true;
                            break;
                        }
                    }
                    z = false;
                }
            } else if (list2.isEmpty()) {
            }
        }
        animateText.extraCallback = z;
        Object obj = null;
        if (animateText.extraCommand() != 0.0f) {
            animateText.onPostMessage = -1L;
            animateText.onActivityLayout = 0;
            getWriteTimeoutokhttp.onNavigationEvent onnavigationevent2 = new getWriteTimeoutokhttp.onNavigationEvent(list, readtimeout, iIntValue2, iIntValue3, str, onnavigationevent, zBooleanValue, function0, function02, function03, num);
            if (processDeepLink.onExtraCallback()) {
                int i8 = prefetchWithMultipleUrls + 107;
                setEngagementSignalsCallback = i8 % 128;
                int i9 = i8 % 2;
                if (!(readtimeout instanceof readTimeout.onNavigationEvent)) {
                    onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 918484400, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{animateText, list, Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), str, onnavigationevent, Boolean.valueOf(zBooleanValue), function0, function02, function03, num}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -918484391, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                    return null;
                }
            }
            animateText.newAuthTabSession = onnavigationevent2;
            animateText.receiveFile = null;
            animateText.extraCallbackWithResult = null;
            animateText.onExtraCallback(onnavigationevent2);
            return null;
        }
        int i10 = setEngagementSignalsCallback + 97;
        prefetchWithMultipleUrls = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.areEqual(str, "infinite");
            obj.hashCode();
            throw null;
        }
        if (Intrinsics.areEqual(str, "infinite")) {
            int i11 = prefetchWithMultipleUrls + 51;
            setEngagementSignalsCallback = i11 % 128;
            int i12 = i11 % 2;
            iIntValue = Integer.MAX_VALUE;
        } else {
            Integer intOrNull = StringsKt.toIntOrNull(str);
            if (intOrNull != null) {
                iIntValue = intOrNull.intValue();
            }
        }
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1085163460, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{animateText, list, readtimeout, onnavigationevent, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue4), 0, 32, null}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1085163485, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        return null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        AnimateText animateText = (AnimateText) objArr[0];
        List list = (List) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        String str = (String) objArr[4];
        onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[5];
        boolean zBooleanValue = ((Boolean) objArr[6]).booleanValue();
        Function0 function0 = (Function0) objArr[7];
        Function0 function02 = (Function0) objArr[8];
        Function0 function03 = (Function0) objArr[9];
        Integer num = (Integer) objArr[10];
        int i = 2 % 2;
        getWriteTimeoutokhttp.onNavigationEvent onnavigationevent2 = new getWriteTimeoutokhttp.onNavigationEvent(list, readTimeout.onNavigationEvent.IAuthTabCallback.onExtraCallback, iIntValue, iIntValue2, str, onnavigationevent, zBooleanValue, function0, function02, function03, num);
        animateText.newAuthTabSession = onnavigationevent2;
        animateText.receiveFile = null;
        animateText.extraCallbackWithResult = null;
        animateText.onExtraCallback(onnavigationevent2);
        int i2 = setEngagementSignalsCallback + 27;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private final void onExtraCallback(List<? extends CharSequence> list, readTimeout readtimeout, onNavigationEvent onnavigationevent, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = prefetchWithMultipleUrls + 43;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
            int i7 = prefetchWithMultipleUrls + 69;
            setEngagementSignalsCallback = i7 % 128;
            int i8 = i7 % 2;
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
            if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new ICustomTabsCallback(list, i3, onnavigationevent, readtimeout, i2, i, null), 3, (Object) null);
            }
        }
        int i9 = prefetchWithMultipleUrls + 25;
        setEngagementSignalsCallback = i9 % 128;
        int i10 = i9 % 2;
    }

    static final class ICustomTabsCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ onNavigationEvent $alignment;
        final /* synthetic */ int $leftCount;
        final /* synthetic */ readTimeout $motion;
        final /* synthetic */ int $stepDelay;
        final /* synthetic */ List<CharSequence> $texts;
        final /* synthetic */ int $tickerIndex;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        ICustomTabsCallback(List<? extends CharSequence> list, int i, onNavigationEvent onnavigationevent, readTimeout readtimeout, int i2, int i3, access13800<? super ICustomTabsCallback> access13800Var) {
            super(2, access13800Var);
            this.$texts = list;
            this.$tickerIndex = i;
            this.$alignment = onnavigationevent;
            this.$motion = readtimeout;
            this.$stepDelay = i2;
            this.$leftCount = i3;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallback iCustomTabsCallback = AnimateText.this.new ICustomTabsCallback(this.$texts, this.$tickerIndex, this.$alignment, this.$motion, this.$stepDelay, this.$leftCount, access13800Var);
            int i2 = onExtraCallback + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iCustomTabsCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 49;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 91 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 91;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 39;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i5 = this.label;
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                AnimateText.this.setCurText$tds_view_release(this.$texts.get(this.$tickerIndex));
                AnimateText.IAuthTabCallback(AnimateText.this, this.$alignment);
                AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 381616639, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{AnimateText.this, this.$motion.access100()}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -381616610, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                AnimateText animateText = AnimateText.this;
                AnimateText.IAuthTabCallback(animateText, animateText.onMinimized(), this.$alignment);
                CharSequence charSequenceOnMinimized = AnimateText.this.onMinimized();
                if (charSequenceOnMinimized == null) {
                    return Unit.INSTANCE;
                }
                AnimateText animateText2 = AnimateText.this;
                readTimeout readtimeout = this.$motion;
                ArrayList arrayList = new ArrayList(charSequenceOnMinimized.length());
                int i6 = 0;
                int i7 = 0;
                while (i7 < charSequenceOnMinimized.length()) {
                    int i8 = i6;
                    int i9 = i7;
                    ArrayList arrayList2 = arrayList;
                    AnimateText.IAuthTabCallback(animateText2).add(new getRetryOnConnectionFailureokhttp(animateText2, new AppLovinSdkConfigurationConsentDialogState(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0.0f, 0.0f, null, 262143, null), getX509TrustManagerOrNullokhttp.onExtraCallback(charSequenceOnMinimized, i6), null, false, 16, null));
                    StaticLayout staticLayoutOnNavigationEvent = AnimateText.onNavigationEvent(animateText2);
                    if (staticLayoutOnNavigationEvent != null) {
                        int i10 = onExtraCallback + 49;
                        onNavigationEvent = i10 % 128;
                        if (i10 % 2 == 0) {
                            AnimateText.onExtraCallbackWithResult(animateText2, staticLayoutOnNavigationEvent, readtimeout.access100(), i8);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        AnimateText.onExtraCallbackWithResult(animateText2, staticLayoutOnNavigationEvent, readtimeout.access100(), i8);
                    }
                    if (readtimeout.access100() == IAuthTabCallback.Char) {
                        Iterator<T> it = ((pingInterval) AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1798520192, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{animateText2}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1798520165, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallback().iterator();
                        while (!(!it.hasNext())) {
                            int i11 = onNavigationEvent + 19;
                            onExtraCallback = i11 % 128;
                            if (i11 % 2 != 0) {
                                Pair pair = (Pair) it.next();
                                int i12 = 3 / 0;
                            } else {
                                Pair pair2 = (Pair) it.next();
                            }
                        }
                    }
                    arrayList2.add(Unit.INSTANCE);
                    i7 = i9 + 1;
                    i6 = i8 + 1;
                    arrayList = arrayList2;
                }
                AnimateText.this.invalidate();
                int i13 = this.$stepDelay;
                long j = i13 == 0 ? 1000L : i13;
                this.L$0 = access15400.onNavigationEvent(charSequenceOnMinimized);
                i = 1;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(j, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                i = 1;
            }
            int size = this.$texts.size();
            int i14 = this.$tickerIndex;
            if (size - i <= i14) {
                int i15 = onExtraCallback + 63;
                int i16 = i15 % 128;
                onNavigationEvent = i16;
                int i17 = i15 % 2;
                int i18 = this.$leftCount;
                if (i18 > 1) {
                    int i19 = i16 + 125;
                    onExtraCallback = i19 % 128;
                    if (i19 % 2 != 0) {
                        AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1085163460, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{AnimateText.this, this.$texts, this.$motion, null, Integer.valueOf(i18), Integer.valueOf(this.$stepDelay), 1, 4, null}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1085163485, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                    } else {
                        AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1085163460, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{AnimateText.this, this.$texts, this.$motion, null, Integer.valueOf(i18 - 1), Integer.valueOf(this.$stepDelay), 0, 4, null}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1085163485, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                    }
                }
            } else {
                AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1085163460, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{AnimateText.this, this.$texts, this.$motion, null, Integer.valueOf(this.$leftCount), Integer.valueOf(this.$stepDelay), Integer.valueOf(i14 + 1), 4, null}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1085163485, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
            }
            return Unit.INSTANCE;
        }
    }

    static final class readTypedObject implements Runnable {
        private static int asInterface = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ int IAuthTabCallback;
        final /* synthetic */ AnimateText onExtraCallback;
        final /* synthetic */ List<Pair<CharSequence, Integer>> onNavigationEvent;
        final /* synthetic */ getWriteTimeoutokhttp.onNavigationEvent onWarmupCompleted;

        readTypedObject(getWriteTimeoutokhttp.onNavigationEvent onnavigationevent, AnimateText animateText, int i, List<? extends Pair<? extends CharSequence, Integer>> list) {
            this.onWarmupCompleted = onnavigationevent;
            this.onExtraCallback = animateText;
            this.IAuthTabCallback = i;
            this.onNavigationEvent = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 2 % 2;
            CharSequence charSequence = this.onWarmupCompleted.extraCallbackWithResult().get(AnimateText.asInterface(this.onExtraCallback));
            if (!StringsKt.isBlank(charSequence)) {
                final int iMax = Math.max(0, this.IAuthTabCallback - ((Number) this.onNavigationEvent.get(AnimateText.asInterface(this.onExtraCallback)).getSecond()).intValue());
                AnimateText.onNavigationEvent(this.onExtraCallback, charSequence);
                AnimateText animateText = this.onExtraCallback;
                Object[] objArr = {this.onWarmupCompleted};
                int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                AnimateText.IAuthTabCallback(animateText, (onNavigationEvent) getWriteTimeoutokhttp.onExtraCallback(1819973442, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback, objArr, OverseasRrnInputTextField.IAuthTabCallback(), -1819973442));
                Object[] objArr2 = {this.onExtraCallback, this.onWarmupCompleted.IAuthTabCallback_Parcel().access100()};
                int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 381616639, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr2, iOnWarmupCompleted, -381616610, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                AnimateText animateText2 = this.onExtraCallback;
                Object[] objArr3 = {this.onWarmupCompleted};
                int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
                AnimateText.IAuthTabCallback(animateText2, charSequence, (onNavigationEvent) getWriteTimeoutokhttp.onExtraCallback(1819973442, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2, objArr3, OverseasRrnInputTextField.IAuthTabCallback(), -1819973442));
                AnimateText.onWarmupCompleted(this.onExtraCallback);
                readTimeout readtimeoutIAuthTabCallback_Parcel = this.onWarmupCompleted.IAuthTabCallback_Parcel();
                int iOnTransact = this.onWarmupCompleted.onTransact();
                boolean zAsInterface = this.onWarmupCompleted.asInterface();
                Function0<Unit> function0IAuthTabCallbackStub = this.onWarmupCompleted.IAuthTabCallbackStub();
                Function0<Unit> function0IAuthTabCallbackDefault = this.onWarmupCompleted.IAuthTabCallbackDefault();
                Integer numICustomTabsCallback = this.onWarmupCompleted.ICustomTabsCallback();
                AnimateTop animateTopOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted();
                final AnimateText animateText3 = this.onExtraCallback;
                final getWriteTimeoutokhttp.onNavigationEvent onnavigationevent = this.onWarmupCompleted;
                final List<Pair<CharSequence, Integer>> list = this.onNavigationEvent;
                final int i2 = this.IAuthTabCallback;
                AnimateText.IAuthTabCallback(animateText3, charSequence, readtimeoutIAuthTabCallback_Parcel, iOnTransact, zAsInterface, false, (Function0) function0IAuthTabCallbackStub, (Function0) function0IAuthTabCallbackDefault, (Function0) new Function0<Unit>() { // from class: im.toss.tds.view.component.anim.text.AnimateText.readTypedObject.4
                    private static int asInterface = 0;
                    private static int onTransact = 1;

                    public /* synthetic */ Object invoke() {
                        int i3 = 2 % 2;
                        int i4 = asInterface + 35;
                        onTransact = i4 % 128;
                        int i5 = i4 % 2;
                        IAuthTabCallback();
                        Unit unit = Unit.INSTANCE;
                        int i6 = onTransact + 53;
                        asInterface = i6 % 128;
                        int i7 = i6 % 2;
                        return unit;
                    }

                    public final void IAuthTabCallback() {
                        int iOnTransact2;
                        int i3 = 2 % 2;
                        Object obj = null;
                        if (((runOnUiThreadDelayed) AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1675398663, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{animateText3}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1675398689, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted())) != null) {
                            int i4 = asInterface + 93;
                            onTransact = i4 % 128;
                            if (i4 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            runOnUiThreadDelayed runonuithreaddelayed = (runOnUiThreadDelayed) AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1675398663, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{animateText3}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1675398689, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                            if ((runonuithreaddelayed == null || !runonuithreaddelayed.prefetch()) && !onnavigationevent.asInterface()) {
                                return;
                            }
                        }
                        if (animateText3.ICustomTabsCallbackDefault()) {
                            AnimateText animateText4 = animateText3;
                            int iAsInterface = AnimateText.asInterface(animateText4);
                            String strExtraCallback = onnavigationevent.extraCallback();
                            List<Pair<CharSequence, Integer>> list2 = list;
                            readTimeout readtimeoutIAuthTabCallback_Parcel2 = onnavigationevent.IAuthTabCallback_Parcel();
                            Integer numICustomTabsCallback2 = onnavigationevent.ICustomTabsCallback();
                            if (!onnavigationevent.asInterface()) {
                                iOnTransact2 = iMax;
                            } else {
                                iOnTransact2 = onnavigationevent.onTransact() + i2;
                                int i5 = asInterface + 97;
                                onTransact = i5 % 128;
                                int i6 = i5 % 2;
                            }
                            int i7 = iOnTransact2;
                            int i8 = i2;
                            Object[] objArr4 = {onnavigationevent};
                            AnimateText.onWarmupCompleted(animateText4, iAsInterface + 1, strExtraCallback, list2, readtimeoutIAuthTabCallback_Parcel2, numICustomTabsCallback2, i7, i8, (onNavigationEvent) getWriteTimeoutokhttp.onExtraCallback(1819973442, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), objArr4, OverseasRrnInputTextField.IAuthTabCallback(), -1819973442), onnavigationevent.IAuthTabCallbackStub(), onnavigationevent.IAuthTabCallbackDefault(), null, onnavigationevent.asBinder(), onnavigationevent.onWarmupCompleted());
                            int i9 = onTransact + 119;
                            asInterface = i9 % 128;
                            if (i9 % 2 == 0) {
                                return;
                            }
                            obj.hashCode();
                            throw null;
                        }
                    }
                }, (Function0) null, numICustomTabsCallback, animateTopOnWarmupCompleted, 272, (Object) null);
                int i3 = asInterface + 67;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i4 = onExtraCallbackWithResult + 37;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static /* synthetic */ void IAuthTabCallback(AnimateText animateText, CharSequence charSequence, readTimeout readtimeout, int i, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Integer num, AnimateTop animateTop, int i2, Object obj) {
        int i3;
        boolean z3;
        boolean z4;
        int i4 = 2 % 2;
        if ((i2 & 4) != 0) {
            int i5 = setEngagementSignalsCallback + 75;
            prefetchWithMultipleUrls = i5 % 128;
            int i6 = i5 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 8) != 0) {
            int i7 = prefetchWithMultipleUrls + 11;
            setEngagementSignalsCallback = i7 % 128;
            int i8 = i7 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i2 & 16) != 0) {
            int i9 = prefetchWithMultipleUrls + 113;
            int i10 = i9 % 128;
            setEngagementSignalsCallback = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 5;
            prefetchWithMultipleUrls = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 4 % 2;
            }
            z4 = false;
        } else {
            z4 = z2;
        }
        animateText.IAuthTabCallback(charSequence, readtimeout, i3, z3, z4, (Function0<Unit>) ((i2 & 32) != 0 ? new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda22
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i14 = 2 % 2;
                int i15 = onWarmupCompleted + 11;
                onExtraCallback = i15 % 128;
                if (i15 % 2 != 0) {
                    int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                    int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                    return (Unit) AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1893584475, iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted, -1893584457, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                }
                int iOnWarmupCompleted3 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                int iOnWarmupCompleted4 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        } : function0), (Function0<Unit>) ((i2 & 64) != 0 ? new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda23
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i14 = 2 % 2;
                int i15 = IAuthTabCallback + 9;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                Unit unitIAuthTabCallbackDefault = AnimateText.IAuthTabCallbackDefault();
                int i17 = IAuthTabCallback + 83;
                onWarmupCompleted = i17 % 128;
                int i18 = i17 % 2;
                return unitIAuthTabCallbackDefault;
            }
        } : function02), (Function0<Unit>) ((i2 & 128) != 0 ? new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda24
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i14 = 2 % 2;
                int i15 = IAuthTabCallback + 57;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                Unit unitICustomTabsCallback = AnimateText.ICustomTabsCallback();
                int i17 = onWarmupCompleted + 109;
                IAuthTabCallback = i17 % 128;
                int i18 = i17 % 2;
                return unitICustomTabsCallback;
            }
        } : function03), (Function0<Unit>) ((i2 & 256) != 0 ? new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda25
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i14 = 2 % 2;
                int i15 = IAuthTabCallback + 65;
                onExtraCallback = i15 % 128;
                int i16 = i15 % 2;
                Unit unitOnWarmupCompleted = AnimateText.onWarmupCompleted();
                int i17 = IAuthTabCallback + 53;
                onExtraCallback = i17 % 128;
                int i18 = i17 % 2;
                return unitOnWarmupCompleted;
            }
        } : function04), (i2 & 512) != 0 ? null : num, animateTop);
    }

    private static final Unit setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 77;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = setEngagementSignalsCallback + 115;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 17;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = prefetchWithMultipleUrls + 97;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit validateRelationship() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 29;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = prefetchWithMultipleUrls + 17;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 125;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = setEngagementSignalsCallback + 13;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onWarmupCompleted(AnimateText animateText, readTimeout readtimeout, Integer num, boolean z, int i, boolean z2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, AnimateTop animateTop) {
        int i2 = 2 % 2;
        int i3 = prefetchWithMultipleUrls + 89;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        animateText.IAuthTabCallback(readtimeout.onTransact(), readtimeout.IAuthTabCallbackDefault(), readtimeout.IAuthTabCallbackStub(), readtimeout.asBinder(), animateText.onNavigationEvent(readtimeout, num), readtimeout.access100(), z, i, z2, (Function0<Unit>) function0, (Function0<Unit>) function02, (Function0<Unit>) function03, (Function0<Unit>) function04, animateTop);
        Unit unit = Unit.INSTANCE;
        int i5 = setEngagementSignalsCallback + 59;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private final void IAuthTabCallback(CharSequence charSequence, final readTimeout readtimeout, final int i, boolean z, final boolean z2, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, final Integer num, final AnimateTop animateTop) {
        int i2 = 2 % 2;
        int i3 = setEngagementSignalsCallback + 9;
        int i4 = i3 % 128;
        prefetchWithMultipleUrls = i4;
        int i5 = i3 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = this.IAuthTabCallback;
        if (runonuithreaddelayed != null) {
            int i6 = i4 + 101;
            setEngagementSignalsCallback = i6 % 128;
            if (i6 % 2 != 0) {
                runonuithreaddelayed.onNavigationEvent();
                throw null;
            }
            runonuithreaddelayed.onNavigationEvent();
        }
        final boolean z3 = readtimeout instanceof readTimeout.onWarmupCompleted;
        Function0 function05 = new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i7 = 2 % 2;
                int i8 = onExtraCallbackWithResult + 61;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                Unit unitOnNavigationEvent = AnimateText.onNavigationEvent(this.f$0, readtimeout, num, z3, i, z2, function0, function02, function03, function04, animateTop);
                int i10 = IAuthTabCallback + 119;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 == 0) {
                    return unitOnNavigationEvent;
                }
                throw null;
            }
        };
        if (z) {
            function0.invoke();
            function02.invoke();
            onExtraCallbackWithResult(charSequence, animateTop, z3);
            function03.invoke();
            function04.invoke();
            return;
        }
        function05.invoke();
        int i7 = prefetchWithMultipleUrls + 123;
        setEngagementSignalsCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 0 / 0;
        }
    }

    public static /* synthetic */ List onExtraCallbackWithResult(AnimateText animateText, List list, readTimeout readtimeout, String str, Integer num, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = setEngagementSignalsCallback;
        int i4 = i3 + 105;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 4) != 0) {
            int i6 = i3 + 105;
            prefetchWithMultipleUrls = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            str = "infinite";
        }
        if ((i & 8) != 0) {
            int i7 = i3 + 3;
            prefetchWithMultipleUrls = i7 % 128;
            int i8 = i7 % 2;
            num = null;
        }
        return animateText.onExtraCallback((List<? extends CharSequence>) list, readtimeout, str, num);
    }

    private final int onWarmupCompleted(List<? extends CharSequence> list, int i) {
        int i2 = 2 % 2;
        int i3 = prefetchWithMultipleUrls + 65;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        if (list.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = {this, (CharSequence) it.next(), Integer.valueOf(i)};
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iIntValue = ((Integer) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 88943956, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, iOnWarmupCompleted, -88943926, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted())).intValue();
        while (it.hasNext()) {
            Object[] objArr2 = {this, (CharSequence) it.next(), Integer.valueOf(i)};
            int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
            int iIntValue2 = ((Integer) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 88943956, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr2, iOnWarmupCompleted2, -88943926, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted())).intValue();
            if (iIntValue < iIntValue2) {
                iIntValue = iIntValue2;
            }
        }
        int i5 = prefetchWithMultipleUrls + 115;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return iIntValue;
    }

    private final int onNavigationEvent(List<? extends CharSequence> list, int i) {
        int i2 = 2 % 2;
        int i3 = setEngagementSignalsCallback + 67;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        if (list.isEmpty()) {
            int i5 = setEngagementSignalsCallback + 81;
            prefetchWithMultipleUrls = i5 % 128;
            return (i5 % 2 == 0 ? 0 : 1) ^ 1;
        }
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int i6 = prefetchWithMultipleUrls + 61;
        setEngagementSignalsCallback = i6 % 128;
        int i7 = i6 % 2;
        int iOnWarmupCompleted = onWarmupCompleted((CharSequence) it.next(), i);
        while (it.hasNext()) {
            int iOnWarmupCompleted2 = onWarmupCompleted((CharSequence) it.next(), i);
            if (iOnWarmupCompleted < iOnWarmupCompleted2) {
                iOnWarmupCompleted = iOnWarmupCompleted2;
            }
        }
        return iOnWarmupCompleted;
    }

    private final void onExtraCallbackWithResult(final int i, final String str, final List<? extends Pair<? extends CharSequence, Integer>> list, final readTimeout readtimeout, final Integer num, int i2, final int i3, final onNavigationEvent onnavigationevent, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, final AnimateTop animateTop) {
        boolean z;
        int size;
        CharSequence charSequence;
        int i4 = 2 % 2;
        if (!Intrinsics.areEqual(str, "infinite") && i == list.size()) {
            int i5 = prefetchWithMultipleUrls + 35;
            setEngagementSignalsCallback = i5 % 128;
            if (i5 % 2 == 0) {
                z = true;
            }
            if (!this.readTypedObject || !(!z)) {
                function04.invoke();
            }
            int i6 = setEngagementSignalsCallback + 61;
            prefetchWithMultipleUrls = i6 % 128;
            if (i6 % 2 == 0) {
                size = i % list.size();
                charSequence = (CharSequence) list.get(size).getFirst();
                if (StringsKt.isBlank(charSequence)) {
                    return;
                }
            } else {
                size = i % list.size();
                charSequence = (CharSequence) list.get(size).getFirst();
                if (StringsKt.isBlank(charSequence)) {
                    return;
                }
            }
            CharSequence charSequence2 = charSequence;
            final int iMax = Math.max(0, i3 - ((Number) list.get(size).getSecond()).intValue());
            this.onActivityLayout = size;
            IAuthTabCallback(charSequence2);
            onNavigationEvent(onnavigationevent);
            onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1934036565, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this, readtimeout.access100()}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1934036549, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
            onNavigationEvent(charSequence2, onnavigationevent);
            IAuthTabCallback(this, charSequence2, readtimeout, i2, false, false, (Function0) function0, (Function0) function02, new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda3
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i7 = 2 % 2;
                    int i8 = onExtraCallback + 37;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitOnExtraCallback = AnimateText.onExtraCallback(this.f$0, i, str, list, readtimeout, num, iMax, i3, onnavigationevent, function0, function02, function03, function04, animateTop);
                    int i10 = onExtraCallback + 95;
                    onNavigationEvent = i10 % 128;
                    if (i10 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    throw null;
                }
            }, (Function0) null, num, animateTop, 280, (Object) null);
            return;
        }
        int i7 = prefetchWithMultipleUrls + 115;
        setEngagementSignalsCallback = i7 % 128;
        int i8 = i7 % 2;
        z = false;
        if (!this.readTypedObject) {
        }
        function04.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(AnimateText animateText, int i, String str, List list, readTimeout readtimeout, Integer num, int i2, int i3, onNavigationEvent onnavigationevent, Function0 function0, Function0 function02, Function0 function03, Function0 function04, AnimateTop animateTop) {
        int i4 = 2 % 2;
        int i5 = prefetchWithMultipleUrls + 111;
        int i6 = i5 % 128;
        setEngagementSignalsCallback = i6;
        Object obj = null;
        if (i5 % 2 != 0) {
            runOnUiThreadDelayed runonuithreaddelayed = animateText.requestPostMessageChannelWithExtras;
            obj.hashCode();
            throw null;
        }
        runOnUiThreadDelayed runonuithreaddelayed2 = animateText.requestPostMessageChannelWithExtras;
        if (runonuithreaddelayed2 != null) {
            int i7 = i6 + 111;
            prefetchWithMultipleUrls = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            if (runonuithreaddelayed2 != null && runonuithreaddelayed2.prefetch()) {
                if (animateText.onMinimized) {
                    animateText.onExtraCallbackWithResult(i + 1, str, list, readtimeout, num, i2, i3, onnavigationevent, function0, function02, function03, function04, animateTop);
                    Unit unit = Unit.INSTANCE;
                    int i8 = prefetchWithMultipleUrls + 107;
                    setEngagementSignalsCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return unit;
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final int onExtraCallback(CharSequence charSequence, BaseTextView baseTextView, readTimeout readtimeout, onNavigationEvent onnavigationevent, Integer num) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 1;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        StaticLayout staticLayoutOnNavigationEvent = onNavigationEvent(this, charSequence, onnavigationevent, baseTextView, 0, 8, null);
        AppLovinSdkSettings appLovinSdkSettingsOnTransact = readtimeout.onTransact();
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallbackDefault = readtimeout.IAuthTabCallbackDefault();
        int iIAuthTabCallback = IAuthTabCallback(staticLayoutOnNavigationEvent, appLovinSdkSettingsOnTransact, readtimeout.IAuthTabCallbackStub(), readtimeout.access100());
        int iIAuthTabCallback2 = IAuthTabCallback(staticLayoutOnNavigationEvent, appLovinSdkSettingsIAuthTabCallbackDefault, readtimeout.asBinder(), readtimeout.access100());
        int iOnNavigationEvent = onNavigationEvent(readtimeout, num);
        if (iOnNavigationEvent != -1) {
            return Math.max(iIAuthTabCallback2, iOnNavigationEvent + iIAuthTabCallback);
        }
        int iMax = Math.max(iIAuthTabCallback, iIAuthTabCallback2);
        int i4 = prefetchWithMultipleUrls + 113;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return iMax;
    }

    private static final Unit postMessage() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 67;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit receiveFile() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 3;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        return unit;
    }

    private static final Unit prefetchWithMultipleUrls() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 75;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit requestPostMessageChannel() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 123;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = setEngagementSignalsCallback + 51;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void IAuthTabCallback(AppLovinSdkSettings appLovinSdkSettings, AppLovinSdkSettings appLovinSdkSettings2, int i, int i2, int i3, IAuthTabCallback iAuthTabCallback, boolean z, int i4, boolean z2, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, AnimateTop animateTop) {
        boolean z3;
        AppLovinSdkSettings appLovinSdkSettings3;
        CharSequence charSequence;
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallback;
        int i5 = 2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = this.requestPostMessageChannelWithExtras;
        boolean z4 = runonuithreaddelayed != null && runonuithreaddelayed.postMessage();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (z4) {
            isEngagementSignalsApiAvailable();
            if (viewGroup != null) {
                int i6 = setEngagementSignalsCallback + 53;
                prefetchWithMultipleUrls = i6 % 128;
                if (i6 % 2 == 0) {
                    viewGroup.setClipChildren(this.ICustomTabsCallbackStubProxy);
                    int i7 = 83 / 0;
                } else {
                    viewGroup.setClipChildren(this.ICustomTabsCallbackStubProxy);
                }
            }
            newSession();
        } else {
            if (viewGroup == null || !viewGroup.getClipChildren()) {
                z3 = false;
            } else {
                int i8 = setEngagementSignalsCallback + 71;
                prefetchWithMultipleUrls = i8 % 128;
                int i9 = i8 % 2;
                z3 = true;
            }
            this.ICustomTabsCallbackStubProxy = z3;
        }
        AppLovinSdkSettings appLovinSdkSettings4 = z2 ? appLovinSdkSettings2 : appLovinSdkSettings;
        if (z2) {
            appLovinSdkSettings3 = appLovinSdkSettings;
        } else {
            int i10 = prefetchWithMultipleUrls + 83;
            setEngagementSignalsCallback = i10 % 128;
            int i11 = i10 % 2;
            appLovinSdkSettings3 = appLovinSdkSettings2;
        }
        int i12 = z2 ? i2 : i;
        int i13 = z2 ^ true ? i2 : i;
        if ((z4 && this.newAuthTabSession == null) || (charSequence = this.extraCommand) == null || charSequence.length() == 0) {
            runonuithreaddelayedOnExtraCallback = null;
        } else {
            int i14 = prefetchWithMultipleUrls + 77;
            setEngagementSignalsCallback = i14 % 128;
            int i15 = i14 % 2;
            runonuithreaddelayedOnExtraCallback = onExtraCallback(appLovinSdkSettings3, i13, iAuthTabCallback, z, i4);
        }
        int i16 = (runonuithreaddelayedOnExtraCallback == null || i3 == -1) ? i4 : i4 + i3;
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallback2 = onExtraCallback(appLovinSdkSettings4, i12, iAuthTabCallback, z, i16, animateTop);
        if (runonuithreaddelayedOnExtraCallback2 == null) {
            return;
        }
        final ViewGroup viewGroup2 = viewGroup;
        final int i17 = i16;
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted(this, pxToDp.IAuthTabCallback.onExtraCallback, runonuithreaddelayedOnExtraCallback != null ? CollectionsKt.listOf(new runOnUiThreadDelayed[]{runonuithreaddelayedOnExtraCallback, runonuithreaddelayedOnExtraCallback2}) : CollectionsKt.listOf(runonuithreaddelayedOnExtraCallback2), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3832, null), null, new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                Unit unit;
                int i18 = 2 % 2;
                int i19 = onWarmupCompleted + 93;
                onExtraCallbackWithResult = i19 % 128;
                if (i19 % 2 == 0) {
                    ViewGroup viewGroup3 = viewGroup2;
                    Function0 function05 = function0;
                    AnimateText animateText = this;
                    int i20 = i17;
                    Object[] objArr = {viewGroup3, function05, animateText, Integer.valueOf(i20), function02};
                    int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                    unit = (Unit) AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 931798365, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, iOnWarmupCompleted, -931798350, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                    int i21 = 70 / 0;
                } else {
                    ViewGroup viewGroup4 = viewGroup2;
                    Function0 function06 = function0;
                    AnimateText animateText2 = this;
                    int i22 = i17;
                    Object[] objArr2 = {viewGroup4, function06, animateText2, Integer.valueOf(i22), function02};
                    int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                    unit = (Unit) AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 931798365, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr2, iOnWarmupCompleted2, -931798350, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                }
                int i23 = onWarmupCompleted + 103;
                onExtraCallbackWithResult = i23 % 128;
                if (i23 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, 1, null), null, new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i18 = 2 % 2;
                int i19 = IAuthTabCallback + 81;
                onWarmupCompleted = i19 % 128;
                int i20 = i19 % 2;
                ViewGroup viewGroup3 = viewGroup2;
                if (i20 != 0) {
                    return AnimateText.IAuthTabCallback(viewGroup3, this, function03, function04);
                }
                int i21 = 38 / 0;
                return AnimateText.IAuthTabCallback(viewGroup3, this, function03, function04);
            }
        }, 1, null);
        if (z2) {
            int i18 = prefetchWithMultipleUrls + 81;
            setEngagementSignalsCallback = i18 % 128;
            int i19 = i18 % 2;
            runonuithreaddelayedOnWarmupCompleted.requestPostMessageChannel();
        } else {
            isFireOS.onExtraCallbackWithResult(runonuithreaddelayedOnWarmupCompleted, false, 1, null);
        }
        this.requestPostMessageChannelWithExtras = runonuithreaddelayedOnWarmupCompleted;
    }

    private static final void onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 63;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        function0.invoke();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = setEngagementSignalsCallback + 65;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ViewGroup viewGroup = (ViewGroup) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        AnimateText animateText = (AnimateText) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        final Function0 function02 = (Function0) objArr[4];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 47;
        int i3 = i2 % 128;
        setEngagementSignalsCallback = i3;
        int i4 = i2 % 2;
        if (viewGroup != null) {
            int i5 = i3 + 59;
            prefetchWithMultipleUrls = i5 % 128;
            int i6 = i5 % 2;
            viewGroup.setClipChildren(false);
        }
        function0.invoke();
        animateText.getInterfaceDescriptor = new Runnable() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // java.lang.Runnable
            public final void run() {
                int i7 = 2 % 2;
                int i8 = IAuthTabCallback + 65;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                Object[] objArr2 = {function02};
                int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1689026296, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr2, iOnWarmupCompleted, 1689026301, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                int i10 = IAuthTabCallback + 17;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        animateText.getRootView().postDelayed(animateText.getInterfaceDescriptor, iIntValue);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(ViewGroup viewGroup, AnimateText animateText, Function0 function0, Function0 function02) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 29;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (viewGroup != null) {
            viewGroup.setClipChildren(animateText.ICustomTabsCallbackStubProxy);
        }
        function0.invoke();
        function02.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = setEngagementSignalsCallback + 49;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final int IAuthTabCallback(StaticLayout staticLayout, AppLovinSdkSettings appLovinSdkSettings, int i, IAuthTabCallback iAuthTabCallback) {
        int iIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = setEngagementSignalsCallback;
        int i4 = i3 + 109;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (staticLayout != null) {
            int i5 = i3 + 21;
            prefetchWithMultipleUrls = i5 % 128;
            int i6 = i5 % 2;
            iIAuthTabCallback = IAuthTabCallback(staticLayout, iAuthTabCallback);
            int i7 = setEngagementSignalsCallback + 93;
            prefetchWithMultipleUrls = i7 % 128;
            int i8 = i7 % 2;
        } else {
            iIAuthTabCallback = 0;
        }
        return appLovinSdkSettings.onNavigationEvent().IAuthTabCallbackStub() + (Math.max(0, iIAuthTabCallback - 1) * i);
    }

    private final int onNavigationEvent(readTimeout readtimeout, Integer num) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 71;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (num != null) {
            return RangesKt.coerceAtLeast(num.intValue(), 0);
        }
        int iAsInterface = readtimeout.asInterface();
        int i3 = prefetchWithMultipleUrls + 41;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        return iAsInterface;
    }

    private final void onExtraCallback(StaticLayout staticLayout, boolean z) {
        List<Pair<Integer, Integer>> listOnExtraCallback;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 77;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        if (staticLayout != null) {
            if (z) {
                int i5 = i2 + 27;
                setEngagementSignalsCallback = i5 % 128;
                int i6 = i5 % 2;
                if (Intrinsics.areEqual(staticLayout.getText(), this.isEngagementSignalsApiAvailable.IAuthTabCallback())) {
                    return;
                }
                pingInterval pinginterval = this.isEngagementSignalsApiAvailable;
                CharSequence text = staticLayout.getText();
                Intrinsics.checkNotNullExpressionValue(text, "");
                pinginterval.IAuthTabCallback(text);
            } else {
                if (Intrinsics.areEqual(staticLayout.getText(), this.IAuthTabCallback_Parcel.IAuthTabCallback())) {
                    return;
                }
                pingInterval pinginterval2 = this.IAuthTabCallback_Parcel;
                CharSequence text2 = staticLayout.getText();
                Intrinsics.checkNotNullExpressionValue(text2, "");
                pinginterval2.IAuthTabCallback(text2);
            }
            if (z) {
                int i7 = prefetchWithMultipleUrls + 87;
                setEngagementSignalsCallback = i7 % 128;
                int i8 = i7 % 2;
                listOnExtraCallback = this.isEngagementSignalsApiAvailable.onExtraCallback();
            } else {
                listOnExtraCallback = this.IAuthTabCallback_Parcel.onExtraCallback();
            }
            CharSequence text3 = staticLayout.getText();
            Intrinsics.checkNotNullExpressionValue(text3, "");
            onExtraCallback(listOnExtraCallback, text3);
        }
    }

    private final void onExtraCallback(List<Pair<Integer, Integer>> list, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 61;
        setEngagementSignalsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            CacheCacheResponseBody1.onNavigationEvent.onExtraCallback();
            obj.hashCode();
            throw null;
        }
        Pattern patternOnExtraCallback = CacheCacheResponseBody1.onNavigationEvent.onExtraCallback();
        if (patternOnExtraCallback != null) {
            int i3 = setEngagementSignalsCallback + 39;
            prefetchWithMultipleUrls = i3 % 128;
            if (i3 % 2 == 0) {
                patternOnExtraCallback.matcher(charSequence);
                obj.hashCode();
                throw null;
            }
            Matcher matcher = patternOnExtraCallback.matcher(charSequence);
            if (matcher != null) {
                int i4 = prefetchWithMultipleUrls + 123;
                setEngagementSignalsCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    list.clear();
                    throw null;
                }
                list.clear();
                while (matcher.find()) {
                    list.add(new Pair<>(Integer.valueOf(matcher.start()), Integer.valueOf(matcher.end())));
                }
            }
        }
    }

    public static final class onTransact implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        onTransact() {
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.IAuthTabCallback(f);
            int i4 = onExtraCallback + 75;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallback(f);
            if (i3 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onExtraCallback + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(f);
            int i4 = onExtraCallback + 39;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(obj);
            int i4 = onExtraCallback + 121;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 39 / 0;
            }
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(f);
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {AnimateText.this, Integer.valueOf((int) (f * 255.0f))};
            int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
            AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -2127053504, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, iOnWarmupCompleted, 2127053517, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
            AnimateText.this.postInvalidateOnAnimation();
            int i4 = onNavigationEvent + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class asBinder implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        asBinder() {
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.IAuthTabCallback(f);
            int i4 = onExtraCallbackWithResult + 23;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallback(f);
            int i4 = onExtraCallback + 3;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(f);
            int i4 = onExtraCallbackWithResult + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(obj);
            if (i3 == 0) {
                int i4 = 83 / 0;
            }
            int i5 = onExtraCallbackWithResult + 115;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(f);
            if (i3 != 0) {
                throw null;
            }
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = {AnimateText.this, Integer.valueOf((int) (f + 255.0f))};
                int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -2127053504, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, iOnWarmupCompleted, 2127053517, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
            } else {
                Object[] objArr2 = {AnimateText.this, Integer.valueOf((int) (f * 255.0f))};
                int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -2127053504, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr2, iOnWarmupCompleted2, 2127053517, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
            }
            AnimateText.this.postInvalidateOnAnimation();
            int i3 = onExtraCallback + 77;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    private final runOnUiThreadDelayed onExtraCallback(AppLovinSdkSettings appLovinSdkSettings, int i, IAuthTabCallback iAuthTabCallback, boolean z, int i2, AnimateTop animateTop) {
        Float fValueOf;
        CharSequence charSequence;
        int iOnExtraCallbackWithResult;
        int i3 = 2 % 2;
        int i4 = setEngagementSignalsCallback + 85;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            fValueOf = Float.valueOf(2.0f);
            charSequence = this.access100;
            if (charSequence == null) {
                return null;
            }
        } else {
            fValueOf = Float.valueOf(1.0f);
            charSequence = this.access100;
            if (charSequence == null) {
                return null;
            }
        }
        CharSequence charSequence2 = charSequence;
        this.access000.clear();
        if (this.extraCallback) {
            int length = i2 + ((charSequence2.length() - 1) * i);
            pxToDp.onWarmupCompleted onwarmupcompleted = pxToDp.onWarmupCompleted.IAuthTabCallback;
            List listMutableListOf = CollectionsKt.mutableListOf(new Rally[]{RallysKt.IAuthTabCallback((shouldFailAdDisplayIfDontKeepActivitiesIsEnabled) new onTransact(), appLovinSdkSettings, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)});
            if (length > 0) {
                listMutableListOf.add(RallysKt.IAuthTabCallback((shouldFailAdDisplayIfDontKeepActivitiesIsEnabled) new asBinder(), isMuted.onNavigationEvent(RallysKt.onExtraCallback(length), fValueOf, fValueOf, (Function1) null, 4, (Object) null), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null));
                int i5 = prefetchWithMultipleUrls + 9;
                setEngagementSignalsCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            return RallysKt.onWarmupCompleted(this, onwarmupcompleted, listMutableListOf, 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3832, null);
        }
        if (iAuthTabCallback == IAuthTabCallback.None) {
            getRetryOnConnectionFailureokhttp getretryonconnectionfailureokhttp = new getRetryOnConnectionFailureokhttp(this, new AppLovinSdkConfigurationConsentDialogState(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0.0f, 0.0f, null, 262143, null), null, animateTop, z);
            this.access000.add(getretryonconnectionfailureokhttp);
            return RallysKt.onWarmupCompleted(this, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt.listOf(RallysKt.onExtraCallback((setCreativeDebuggerEnabled) getretryonconnectionfailureokhttp, appLovinSdkSettings, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, i2, 0L, false, 1788, (Object) null)), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3832, null);
        }
        pxToDp.IAuthTabCallback iAuthTabCallback2 = pxToDp.IAuthTabCallback.onExtraCallback;
        ArrayList arrayList = new ArrayList(charSequence2.length());
        int i7 = 0;
        int i8 = 0;
        while (i7 < charSequence2.length()) {
            getRetryOnConnectionFailureokhttp getretryonconnectionfailureokhttp2 = new getRetryOnConnectionFailureokhttp(this, new AppLovinSdkConfigurationConsentDialogState(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0.0f, 0.0f, null, 262143, null), getX509TrustManagerOrNullokhttp.onExtraCallback(charSequence2, i8), animateTop, z);
            this.access000.add(getretryonconnectionfailureokhttp2);
            StaticLayout staticLayout = this.IAuthTabCallbackStubProxy;
            if (staticLayout != null) {
                int i9 = prefetchWithMultipleUrls + 117;
                setEngagementSignalsCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    iOnExtraCallbackWithResult = onExtraCallbackWithResult(staticLayout, iAuthTabCallback, i8);
                    int i10 = 59 / 0;
                } else {
                    iOnExtraCallbackWithResult = onExtraCallbackWithResult(staticLayout, iAuthTabCallback, i8);
                }
            } else {
                iOnExtraCallbackWithResult = 0;
            }
            if (iAuthTabCallback == IAuthTabCallback.Char) {
                int i11 = setEngagementSignalsCallback + 105;
                prefetchWithMultipleUrls = i11 % 128;
                int i12 = i11 % 2;
                Iterator<T> it = this.IAuthTabCallback_Parcel.onExtraCallback().iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    int iIntValue = ((Number) pair.getSecond()).intValue();
                    int iIntValue2 = ((Number) pair.getFirst()).intValue();
                    if (i8 >= ((Number) pair.getSecond()).intValue()) {
                        iOnExtraCallbackWithResult -= (iIntValue - iIntValue2) - 1;
                    }
                }
            }
            arrayList.add(RallysKt.onExtraCallback((setCreativeDebuggerEnabled) getretryonconnectionfailureokhttp2, appLovinSdkSettings, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, i2 + ((iOnExtraCallbackWithResult - 1) * i), 0L, false, 1788, (Object) null));
            i7++;
            i8++;
        }
        return RallysKt.onWarmupCompleted(this, iAuthTabCallback2, arrayList, 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3832, null);
    }

    public static final class IAuthTabCallback_Parcel implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        IAuthTabCallback_Parcel() {
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.IAuthTabCallback(f);
            int i4 = onNavigationEvent + 45;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallback(f);
            int i4 = IAuthTabCallback + 81;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(f);
            int i4 = IAuthTabCallback + 9;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(obj);
            int i4 = IAuthTabCallback + 3;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(f);
            int i4 = IAuthTabCallback + 43;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 45 / 0;
            }
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                AnimateText.onExtraCallbackWithResult(AnimateText.this, (int) (f + 255.0f));
            } else {
                AnimateText.onExtraCallbackWithResult(AnimateText.this, (int) (f * 255.0f));
            }
            AnimateText.this.postInvalidateOnAnimation();
        }
    }

    public static final class access000 implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        access000() {
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            super.IAuthTabCallback(f);
            if (i3 != 0) {
                int i4 = 27 / 0;
            }
            int i5 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallback(f);
            if (i3 == 0) {
                int i4 = 1 / 0;
            }
            int i5 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(f);
            if (i3 != 0) {
                int i4 = 87 / 0;
            }
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(obj);
            int i4 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(f);
            if (i3 != 0) {
                int i4 = 19 / 0;
            }
            int i5 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                AnimateText.onExtraCallbackWithResult(AnimateText.this, (int) (f * 255.0f));
            } else {
                AnimateText.onExtraCallbackWithResult(AnimateText.this, (int) (f * 255.0f));
            }
            AnimateText.this.postInvalidateOnAnimation();
            int i3 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 24 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0023 A[PHI: r3 r4
      0x0023: PHI (r3v11 java.lang.Float) = (r3v5 java.lang.Float), (r3v16 java.lang.Float) binds: [B:8:0x0031, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x0023: PHI (r4v15 java.lang.CharSequence) = (r4v2 java.lang.CharSequence), (r4v18 java.lang.CharSequence) binds: [B:8:0x0031, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final runOnUiThreadDelayed onExtraCallback(AppLovinSdkSettings appLovinSdkSettings, int i, IAuthTabCallback iAuthTabCallback, boolean z, int i2) {
        Float fValueOf;
        CharSequence charSequence;
        int iOnExtraCallbackWithResult;
        int i3 = 2 % 2;
        int i4 = setEngagementSignalsCallback + 113;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            fValueOf = Float.valueOf(1.0f);
            this.ICustomTabsService.clear();
            charSequence = this.access100;
            if (charSequence != null) {
                Float f = fValueOf;
                if (this.extraCallback) {
                    int length = i2 + ((charSequence.length() - 1) * i);
                    pxToDp.onWarmupCompleted onwarmupcompleted = pxToDp.onWarmupCompleted.IAuthTabCallback;
                    List listMutableListOf = CollectionsKt.mutableListOf(new Rally[]{RallysKt.IAuthTabCallback((shouldFailAdDisplayIfDontKeepActivitiesIsEnabled) new IAuthTabCallback_Parcel(), appLovinSdkSettings, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)});
                    if (length > 0) {
                        listMutableListOf.add(RallysKt.IAuthTabCallback((shouldFailAdDisplayIfDontKeepActivitiesIsEnabled) new access000(), isMuted.onNavigationEvent(RallysKt.onExtraCallback(length), f, f, (Function1) null, 4, (Object) null), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null));
                    }
                    return RallysKt.onWarmupCompleted(this, onwarmupcompleted, listMutableListOf, 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3832, null);
                }
            }
        } else {
            fValueOf = Float.valueOf(0.0f);
            this.ICustomTabsService.clear();
            charSequence = this.access100;
            if (charSequence != null) {
            }
        }
        if (iAuthTabCallback == IAuthTabCallback.None) {
            pxToDp.IAuthTabCallback iAuthTabCallback2 = pxToDp.IAuthTabCallback.onExtraCallback;
            List<getRetryOnConnectionFailureokhttp> list = this.access000;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            int i5 = setEngagementSignalsCallback + 17;
            prefetchWithMultipleUrls = i5 % 128;
            int i6 = i5 % 2;
            for (getRetryOnConnectionFailureokhttp getretryonconnectionfailureokhttp : list) {
                getretryonconnectionfailureokhttp.onWarmupCompleted(z);
                this.ICustomTabsService.add(getretryonconnectionfailureokhttp);
                arrayList.add(RallysKt.onExtraCallback((setCreativeDebuggerEnabled) getretryonconnectionfailureokhttp, appLovinSdkSettings, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, i2, 0L, false, 1788, (Object) null));
            }
            return RallysKt.onWarmupCompleted(this, iAuthTabCallback2, arrayList, 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3832, null);
        }
        pxToDp.IAuthTabCallback iAuthTabCallback3 = pxToDp.IAuthTabCallback.onExtraCallback;
        List<getRetryOnConnectionFailureokhttp> list2 = this.access000;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i7 = 0;
        for (Object obj : list2) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            getRetryOnConnectionFailureokhttp getretryonconnectionfailureokhttp2 = (getRetryOnConnectionFailureokhttp) obj;
            getretryonconnectionfailureokhttp2.onWarmupCompleted(z);
            this.ICustomTabsService.add(getretryonconnectionfailureokhttp2);
            StaticLayout staticLayout = this.ICustomTabsCallbackStub;
            if (staticLayout != null) {
                int i8 = prefetchWithMultipleUrls + 45;
                setEngagementSignalsCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    iOnExtraCallbackWithResult = onExtraCallbackWithResult(staticLayout, iAuthTabCallback, i7);
                    int i9 = 74 / 0;
                } else {
                    iOnExtraCallbackWithResult = onExtraCallbackWithResult(staticLayout, iAuthTabCallback, i7);
                }
            } else {
                iOnExtraCallbackWithResult = 0;
            }
            if (iAuthTabCallback == IAuthTabCallback.Char) {
                Iterator<T> it = this.isEngagementSignalsApiAvailable.onExtraCallback().iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    int iIntValue = ((Number) pair.getSecond()).intValue();
                    int iIntValue2 = ((Number) pair.getFirst()).intValue();
                    if (i7 >= ((Number) pair.getSecond()).intValue()) {
                        iOnExtraCallbackWithResult -= (iIntValue - iIntValue2) - 1;
                    }
                }
            }
            arrayList2.add(RallysKt.onExtraCallback((setCreativeDebuggerEnabled) getretryonconnectionfailureokhttp2, appLovinSdkSettings, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, i2 + ((iOnExtraCallbackWithResult - 1) * i), 0L, false, 1788, (Object) null));
            i7++;
        }
        return RallysKt.onWarmupCompleted(this, iAuthTabCallback3, arrayList2, 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3832, null);
    }

    private final void onExtraCallback(AppLovinSdkSettings appLovinSdkSettings, int i, int i2, IAuthTabCallback iAuthTabCallback, boolean z, final Function0<Unit> function0) {
        int i3 = 2 % 2;
        warmup();
        this.IAuthTabCallback = (runOnUiThreadDelayed) isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted(this, pxToDp.IAuthTabCallback.onExtraCallback, onExtraCallbackWithResult(this.access000, this.IAuthTabCallbackStubProxy, appLovinSdkSettings, i, iAuthTabCallback, z), 0, null, 0, null, null, Boolean.FALSE, i2, 0L, false, 3320, null), null, new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                Unit unit;
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 29;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    Object[] objArr = {this.f$0, function0};
                    int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                    unit = (Unit) AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1747962282, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, iOnWarmupCompleted, 1747962292, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                    int i6 = 88 / 0;
                } else {
                    Object[] objArr2 = {this.f$0, function0};
                    int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                    unit = (Unit) AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1747962282, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr2, iOnWarmupCompleted2, 1747962292, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                }
                int i7 = onExtraCallbackWithResult + 61;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 24 / 0;
                }
                return unit;
            }
        }, 1, null), false, 1, null);
        int i4 = setEngagementSignalsCallback + 117;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(AnimateText animateText, Function0 function0) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 67;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 != 0) {
            animateText.ICustomTabsCallbackStub();
            function0.invoke();
            return Unit.INSTANCE;
        }
        animateText.ICustomTabsCallbackStub();
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(AnimateText animateText, CharSequence charSequence, setAuthenticatorokhttp setauthenticatorokhttp, int i, boolean z, String str, onNavigationEvent onnavigationevent, Function0 function0, Function0 function02, Function0 function03, int i2, Object obj) {
        int i3;
        boolean z2;
        String str2;
        onNavigationEvent onnavigationevent2;
        int i4 = 2 % 2;
        int i5 = prefetchWithMultipleUrls + 113;
        int i6 = i5 % 128;
        setEngagementSignalsCallback = i6;
        int i7 = i5 % 2;
        if ((i2 & 4) != 0) {
            int i8 = i6 + 87;
            prefetchWithMultipleUrls = i8 % 128;
            int i9 = i8 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 8) != 0) {
            int i10 = prefetchWithMultipleUrls + 109;
            setEngagementSignalsCallback = i10 % 128;
            int i11 = i10 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i2 & 16) != 0) {
            int i12 = setEngagementSignalsCallback + 1;
            int i13 = i12 % 128;
            prefetchWithMultipleUrls = i13;
            int i14 = i12 % 2;
            int i15 = i13 + 3;
            setEngagementSignalsCallback = i15 % 128;
            int i16 = i15 % 2;
            str2 = "infinite";
        } else {
            str2 = str;
        }
        if ((i2 & 32) != 0) {
            int i17 = prefetchWithMultipleUrls + 37;
            setEngagementSignalsCallback = i17 % 128;
            int i18 = i17 % 2;
            onnavigationevent2 = onNavigationEvent.TOP_LEFT;
        } else {
            onnavigationevent2 = onnavigationevent;
        }
        animateText.IAuthTabCallback(charSequence, setauthenticatorokhttp, i3, z2, str2, onnavigationevent2, (i2 & 64) != 0 ? new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda19
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i19 = 2 % 2;
                int i20 = IAuthTabCallback + 73;
                onExtraCallback = i20 % 128;
                if (i20 % 2 == 0) {
                    return AnimateText.getInterfaceDescriptor();
                }
                AnimateText.getInterfaceDescriptor();
                throw null;
            }
        } : function0, (i2 & 128) != 0 ? new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda20
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i19 = 2 % 2;
                int i20 = onExtraCallback + 113;
                onExtraCallbackWithResult = i20 % 128;
                int i21 = i20 % 2;
                int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                Unit unit = (Unit) AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1915467337, iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted, -1915467333, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                int i22 = onExtraCallback + 85;
                onExtraCallbackWithResult = i22 % 128;
                int i23 = i22 % 2;
                return unit;
            }
        } : function02, (i2 & 256) != 0 ? new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda21
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i19 = 2 % 2;
                int i20 = onExtraCallback + 1;
                onWarmupCompleted = i20 % 128;
                int i21 = i20 % 2;
                Unit unitOnExtraCallbackWithResult = AnimateText.onExtraCallbackWithResult();
                int i22 = onExtraCallback + 37;
                onWarmupCompleted = i22 % 128;
                int i23 = i22 % 2;
                return unitOnExtraCallbackWithResult;
            }
        } : function03);
    }

    private static final Unit newAuthTabSession() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 43;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 121;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = prefetchWithMultipleUrls + 5;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return unit;
    }

    public final void IAuthTabCallback(@NotNull CharSequence charSequence, @NotNull setAuthenticatorokhttp setauthenticatorokhttp, int i, boolean z, @NotNull String str, @NotNull onNavigationEvent onnavigationevent, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(setauthenticatorokhttp, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        this.extraCallback = S0.onNavigationEvent(charSequence);
        this.onPostMessage = -1L;
        getWriteTimeoutokhttp.IAuthTabCallback iAuthTabCallback = new getWriteTimeoutokhttp.IAuthTabCallback(charSequence, setauthenticatorokhttp, i, z, str, onnavigationevent, function0, function02, function03);
        Object obj = null;
        if (processDeepLink.onExtraCallback()) {
            int i3 = prefetchWithMultipleUrls + 109;
            setEngagementSignalsCallback = i3 % 128;
            if (i3 % 2 == 0) {
                IAuthTabCallback(setauthenticatorokhttp, charSequence, i, onnavigationevent, function02, function0, function03);
                return;
            } else {
                IAuthTabCallback(setauthenticatorokhttp, charSequence, i, onnavigationevent, function02, function0, function03);
                obj.hashCode();
                throw null;
            }
        }
        this.extraCallbackWithResult = iAuthTabCallback;
        this.newAuthTabSession = null;
        this.receiveFile = null;
        onExtraCallbackWithResult(iAuthTabCallback);
        int i4 = setEngagementSignalsCallback + 29;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IAuthTabCallback(setAuthenticatorokhttp setauthenticatorokhttp, CharSequence charSequence, int i, onNavigationEvent onnavigationevent, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        int i2 = 2 % 2;
        int i3 = prefetchWithMultipleUrls + 67;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        if (setauthenticatorokhttp instanceof setAuthenticatorokhttp.onNavigationEvent.onExtraCallback) {
            getWriteTimeoutokhttp.onWarmupCompleted onwarmupcompleted = new getWriteTimeoutokhttp.onWarmupCompleted(charSequence, readTimeout.onNavigationEvent.IAuthTabCallback.onExtraCallback, i, onnavigationevent, false, false, function0, function02, function03);
            this.extraCallbackWithResult = null;
            this.newAuthTabSession = null;
            this.receiveFile = onwarmupcompleted;
            onWarmupCompleted(onwarmupcompleted);
            setTextColor(((setAuthenticatorokhttp.onNavigationEvent.onExtraCallback) setauthenticatorokhttp).asBinder());
            return;
        }
        getWriteTimeoutokhttp.onWarmupCompleted onwarmupcompleted2 = new getWriteTimeoutokhttp.onWarmupCompleted(charSequence, readTimeout.onNavigationEvent.IAuthTabCallback.onExtraCallback, i, onnavigationevent, false, false, function0, function02, function03);
        this.extraCallbackWithResult = null;
        this.newAuthTabSession = null;
        this.receiveFile = onwarmupcompleted2;
        onWarmupCompleted(onwarmupcompleted2);
        int i5 = setEngagementSignalsCallback + 65;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AnimateText animateText = (AnimateText) objArr[0];
        CharSequence charSequence = (CharSequence) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[5]).booleanValue();
        Function0 function0 = (Function0) objArr[6];
        Function0 function02 = (Function0) objArr[7];
        Function0 function03 = (Function0) objArr[8];
        int i = 2 % 2;
        getWriteTimeoutokhttp.onWarmupCompleted onwarmupcompleted = new getWriteTimeoutokhttp.onWarmupCompleted(charSequence, readTimeout.onNavigationEvent.IAuthTabCallback.onExtraCallback, iIntValue, onnavigationevent, zBooleanValue, zBooleanValue2, function0, function02, function03);
        animateText.extraCallbackWithResult = null;
        animateText.newAuthTabSession = null;
        animateText.receiveFile = onwarmupcompleted;
        animateText.onWarmupCompleted(onwarmupcompleted);
        int i2 = setEngagementSignalsCallback + 9;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    static final class writeTypedObject implements Function1<Float, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ AnimateText onNavigationEvent;
        final /* synthetic */ getRetryOnConnectionFailureokhttp onWarmupCompleted;

        writeTypedObject(getRetryOnConnectionFailureokhttp getretryonconnectionfailureokhttp, AnimateText animateText) {
            this.onWarmupCompleted = getretryonconnectionfailureokhttp;
            this.onNavigationEvent = animateText;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(((Number) obj).floatValue());
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                this.onWarmupCompleted.ICustomTabsCallback().onWarmupCompleted(f);
                this.onNavigationEvent.postInvalidateOnAnimation();
            } else {
                this.onWarmupCompleted.ICustomTabsCallback().onWarmupCompleted(f);
                this.onNavigationEvent.postInvalidateOnAnimation();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    static final class extraCallback implements Function0<Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ getWriteTimeoutokhttp.IAuthTabCallback onWarmupCompleted;

        extraCallback(getWriteTimeoutokhttp.IAuthTabCallback iAuthTabCallback) {
            this.onWarmupCompleted = iAuthTabCallback;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted();
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 45;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        public final void onWarmupCompleted() {
            int i = 2 % 2;
            AnimateText animateText = AnimateText.this;
            final getWriteTimeoutokhttp.IAuthTabCallback iAuthTabCallback = this.onWarmupCompleted;
            AnimateText.onWarmupCompleted(animateText, new Runnable() { // from class: im.toss.tds.view.component.anim.text.AnimateText.extraCallback.3
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 61;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    iAuthTabCallback.IAuthTabCallbackDefault().invoke();
                    int i5 = onExtraCallbackWithResult + 95;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                }
            });
            AnimateText.this.getRootView().postDelayed(AnimateText.asBinder(AnimateText.this), this.onWarmupCompleted.onTransact());
            int i2 = IAuthTabCallback + 65;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class asInterface implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        asInterface() {
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.IAuthTabCallback(f);
            int i4 = onExtraCallbackWithResult + 9;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallback(f);
            int i4 = onExtraCallback + 55;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(f);
            int i4 = onExtraCallbackWithResult + 41;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(obj);
            int i4 = onExtraCallback + 87;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(f);
            int i4 = onExtraCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -2127053504, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{AnimateText.this, Integer.valueOf((int) (f * 255.0f))}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 2127053517, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
            AnimateText.this.postInvalidateOnAnimation();
            int i4 = onExtraCallback + 125;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class getInterfaceDescriptor implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ setHasUserConsent onExtraCallback;

        getInterfaceDescriptor(setHasUserConsent sethasuserconsent) {
            this.onExtraCallback = sethasuserconsent;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.IAuthTabCallback(f);
            int i4 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallback(f);
            int i4 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(f);
            int i4 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(obj);
            int i4 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public /* bridge */ void onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(f);
            int i4 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public void onNavigationEvent(float f) {
            int i = 2 % 2;
            TextPaint paint = AnimateText.onExtraCallbackWithResult(AnimateText.this).getPaint();
            if (paint != null) {
                int i2 = onExtraCallbackWithResult + 117;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    paint.setColor(this.onExtraCallback.IAuthTabCallback(f).intValue());
                    int i3 = 90 / 0;
                } else {
                    paint.setColor(this.onExtraCallback.IAuthTabCallback(f).intValue());
                }
                int i4 = onExtraCallbackWithResult + 43;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            AnimateText.this.postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045 A[PHI: r1
      0x0045: PHI (r1v21 java.lang.Float) = (r1v5 java.lang.Float), (r1v23 java.lang.Float) binds: [B:8:0x002f, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[PHI: r1
      0x0031: PHI (r1v6 java.lang.Float) = (r1v5 java.lang.Float), (r1v23 java.lang.Float) binds: [B:8:0x002f, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final runOnUiThreadDelayed onExtraCallbackWithResult(CharSequence charSequence, String str, setAuthenticatorokhttp setauthenticatorokhttp, IAuthTabCallback iAuthTabCallback, AnimateTop animateTop) throws NumberFormatException {
        Float fValueOf;
        int i;
        int i2 = 2 % 2;
        int i3 = prefetchWithMultipleUrls + 25;
        setEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            fValueOf = Float.valueOf(2.0f);
            if (Intrinsics.areEqual(str, "infinite")) {
                int i4 = prefetchWithMultipleUrls;
                int i5 = i4 + 43;
                setEngagementSignalsCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 97;
                setEngagementSignalsCallback = i7 % 128;
                int i8 = i7 % 2;
                i = -1;
            } else {
                i = Integer.parseInt(str);
                int i9 = prefetchWithMultipleUrls + 57;
                setEngagementSignalsCallback = i9 % 128;
                int i10 = i9 % 2;
            }
        } else {
            fValueOf = Float.valueOf(1.0f);
            if (Intrinsics.areEqual(str, "infinite")) {
            }
        }
        int i11 = i;
        Float f = fValueOf;
        this.access000.clear();
        if (this.extraCallback) {
            int i12 = setEngagementSignalsCallback + 99;
            prefetchWithMultipleUrls = i12 % 128;
            if (i12 % 2 == 0) {
                boolean z = setauthenticatorokhttp instanceof setAuthenticatorokhttp.onExtraCallback.onExtraCallbackWithResult;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (setauthenticatorokhttp instanceof setAuthenticatorokhttp.onExtraCallback.onExtraCallbackWithResult) {
                runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted(this, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt.listOf(RallysKt.IAuthTabCallback((shouldFailAdDisplayIfDontKeepActivitiesIsEnabled) new asInterface(), isMuted.onNavigationEvent(RallysKt.onExtraCallback(setauthenticatorokhttp.onExtraCallbackWithResult(), 2400), Float.valueOf(0.4f), f, (Function1) null, 4, (Object) null), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)), i11, getExtraParameters.Normal, 0, null, null, Boolean.FALSE, 0, 0L, false, 3808, null);
                int i13 = prefetchWithMultipleUrls + 57;
                setEngagementSignalsCallback = i13 % 128;
                int i14 = i13 % 2;
                return runonuithreaddelayedOnWarmupCompleted;
            }
            if (setauthenticatorokhttp instanceof setAuthenticatorokhttp.onNavigationEvent.onExtraCallback) {
                setAuthenticatorokhttp.onNavigationEvent.onExtraCallback onextracallback = (setAuthenticatorokhttp.onNavigationEvent.onExtraCallback) setauthenticatorokhttp;
                return RallysKt.onWarmupCompleted(this, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt.listOf(RallysKt.IAuthTabCallback((shouldFailAdDisplayIfDontKeepActivitiesIsEnabled) new getInterfaceDescriptor(new setHasUserConsent(onextracallback.IAuthTabCallbackDefault(), onextracallback.asBinder())), isMuted.onNavigationEvent(RallysKt.onExtraCallback(setauthenticatorokhttp.onExtraCallbackWithResult(), 2400), Float.valueOf(0.0f), f, (Function1) null, 4, (Object) null), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)), i11, getExtraParameters.Alternate, 0, null, null, Boolean.FALSE, 0, 0L, false, 3808, null);
            }
        }
        List listIAuthTabCallback = getWrite.IAuthTabCallback(setauthenticatorokhttp.onNavigationEvent());
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i15 = 0;
        int i16 = 0;
        while (i15 < charSequence.length()) {
            getRetryOnConnectionFailureokhttp getretryonconnectionfailureokhttp = new getRetryOnConnectionFailureokhttp(this, new AppLovinSdkConfigurationConsentDialogState(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0.0f, 0.0f, null, 262143, null), getX509TrustManagerOrNullokhttp.onExtraCallback(charSequence, i16), animateTop, false, 16, null);
            this.access000.add(getretryonconnectionfailureokhttp);
            StaticLayout staticLayout = this.IAuthTabCallbackStubProxy;
            arrayList.add(RallysKt.onExtraCallbackWithResult(getretryonconnectionfailureokhttp, listIAuthTabCallback, i11, getExtraParameters.Normal, 0, null, null, Boolean.FALSE, (staticLayout != null ? onExtraCallbackWithResult(staticLayout, iAuthTabCallback, i16) : 0) * setauthenticatorokhttp.onExtraCallback(), 0L, false, 1648, null));
            i15++;
            i16++;
        }
        return RallysKt.onWarmupCompleted(this, pxToDp.IAuthTabCallback.onExtraCallback, arrayList, 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3832, null);
    }

    private final void onExtraCallbackWithResult(CharSequence charSequence, AnimateTop animateTop, boolean z) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 73;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.access000.clear();
            if (this.onTransact == IAuthTabCallback.None) {
                this.access000.add(new getRetryOnConnectionFailureokhttp(this, new AppLovinSdkConfigurationConsentDialogState(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0.0f, 0.0f, null, 262143, null), null, animateTop, z));
            } else {
                List<getRetryOnConnectionFailureokhttp> list = this.access000;
                ArrayList arrayList = new ArrayList(charSequence.length());
                int i3 = 0;
                int i4 = 0;
                while (i3 < charSequence.length()) {
                    arrayList.add(new getRetryOnConnectionFailureokhttp(this, new AppLovinSdkConfigurationConsentDialogState(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0.0f, 0.0f, null, 262143, null), getX509TrustManagerOrNullokhttp.onExtraCallback(charSequence, i4), animateTop, z));
                    i3++;
                    i4++;
                }
                list.addAll(arrayList);
                int i5 = prefetchWithMultipleUrls + 87;
                setEngagementSignalsCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            invalidate();
            return;
        }
        this.access000.clear();
        IAuthTabCallback iAuthTabCallback = IAuthTabCallback.None;
        throw null;
    }

    public final void ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 91;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        this.readTypedObject = false;
        this.onMinimized = false;
        Object obj = null;
        this.extraCommand = null;
        onWarmupCompleted((CharSequence) null);
        this.ICustomTabsService.clear();
        this.access000.clear();
        int i4 = setEngagementSignalsCallback + 75;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void warmup() {
        int i = 2 % 2;
        Runnable runnable = this.postMessage;
        if (runnable != null) {
            int i2 = prefetchWithMultipleUrls + 59;
            setEngagementSignalsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                getRootView().removeCallbacks(runnable);
            } else {
                getRootView().removeCallbacks(runnable);
                int i3 = 99 / 0;
            }
        }
        Runnable runnable2 = this.getInterfaceDescriptor;
        if (runnable2 != null) {
            getRootView().removeCallbacks(runnable2);
        }
        this.readTypedObject = true;
        this.onMinimized = false;
        isEngagementSignalsApiAvailable();
        int i4 = prefetchWithMultipleUrls + 41;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int IAuthTabCallback(StaticLayout staticLayout, IAuthTabCallback iAuthTabCallback) {
        int i;
        int i2 = 2 % 2;
        int i3 = setEngagementSignalsCallback + 37;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 != 0 ? (i = onExtraCallbackWithResult.onExtraCallback[iAuthTabCallback.ordinal()]) == 1 : (i = onExtraCallbackWithResult.onExtraCallback[iAuthTabCallback.ordinal()]) == 1) {
            CharSequence text = staticLayout.getText();
            Intrinsics.checkNotNullExpressionValue(text, "");
            return StringsKt.trim(StringsKt.replace$default(StringsKt.replace$default(CacheCacheResponseBody1.onNavigationEvent.IAuthTabCallback().replace(text, "e"), "\n", "", false, 4, (Object) null), " ", "", false, 4, (Object) null)).toString().length();
        }
        if (i != 2) {
            int i4 = prefetchWithMultipleUrls + 17;
            setEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
            if (i != 3) {
                return 0;
            }
            return staticLayout.getLineCount();
        }
        CharSequence text2 = staticLayout.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "");
        int i6 = 0;
        for (int i7 = 0; i7 < text2.length(); i7++) {
            int i8 = setEngagementSignalsCallback + 89;
            prefetchWithMultipleUrls = i8 % 128;
            int i9 = i8 % 2;
            char cCharAt = text2.charAt(i7);
            if (cCharAt != ' ') {
                int i10 = setEngagementSignalsCallback + 17;
                prefetchWithMultipleUrls = i10 % 128;
                if (i10 % 2 == 0) {
                    if (cCharAt == 28) {
                        i6++;
                    }
                } else if (cCharAt == '\n') {
                }
            }
        }
        return i6 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0066 A[Catch: Exception -> 0x00a5, TryCatch #0 {Exception -> 0x00a5, blocks: (B:3:0x0004, B:12:0x0024, B:17:0x0035, B:19:0x003b, B:22:0x0044, B:26:0x0055, B:33:0x0068, B:32:0x0066, B:29:0x005e, B:37:0x006f, B:40:0x007f, B:43:0x0090, B:45:0x0096), top: B:55:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int onExtraCallbackWithResult(StaticLayout staticLayout, IAuthTabCallback iAuthTabCallback, int i) {
        CharSequence text;
        CharSequence charSequenceSubSequence;
        char cCharAt;
        int i2 = 2 % 2;
        int lineForOffset = 0;
        try {
            int i3 = onExtraCallbackWithResult.onExtraCallback[iAuthTabCallback.ordinal()];
            if (i3 == 1) {
                if (staticLayout != null && (text = staticLayout.getText()) != null) {
                    int i4 = prefetchWithMultipleUrls + 57;
                    setEngagementSignalsCallback = i4 % 128;
                    int i5 = i4 % 2;
                    CharSequence charSequenceSubSequence2 = text.subSequence(0, i + 1);
                    if (charSequenceSubSequence2 != null) {
                        int i6 = prefetchWithMultipleUrls + 51;
                        setEngagementSignalsCallback = i6 % 128;
                        int i7 = i6 % 2;
                        int i8 = 0;
                        for (int i9 = 0; i9 < charSequenceSubSequence2.length(); i9++) {
                            char cCharAt2 = charSequenceSubSequence2.charAt(i9);
                            if (cCharAt2 != ' ' && cCharAt2 != '\n') {
                                i8++;
                            }
                        }
                        return i8;
                    }
                }
                return 0;
            }
            if (i3 != 2) {
                if (i3 != 3) {
                    return 0;
                }
                if (staticLayout != null) {
                    int i10 = setEngagementSignalsCallback + 15;
                    prefetchWithMultipleUrls = i10 % 128;
                    int i11 = i10 % 2;
                    lineForOffset = staticLayout.getLineForOffset(i);
                }
                return lineForOffset + 1;
            }
            if (staticLayout != null) {
                int i12 = setEngagementSignalsCallback + 87;
                prefetchWithMultipleUrls = i12 % 128;
                int i13 = i12 % 2;
                CharSequence text2 = staticLayout.getText();
                if (text2 != null && (charSequenceSubSequence = text2.subSequence(0, i + 1)) != null) {
                    int i14 = 0;
                    for (int i15 = 0; i15 < charSequenceSubSequence.length(); i15++) {
                        int i16 = prefetchWithMultipleUrls + 77;
                        setEngagementSignalsCallback = i16 % 128;
                        if (i16 % 2 != 0) {
                            cCharAt = charSequenceSubSequence.charAt(i15);
                            if (cCharAt != 'm') {
                                if (cCharAt == '\n') {
                                }
                            }
                            i14++;
                        } else {
                            cCharAt = charSequenceSubSequence.charAt(i15);
                            if (cCharAt != ' ') {
                                if (cCharAt == '\n') {
                                    i14++;
                                }
                            }
                        }
                    }
                    return i14;
                }
            }
            return 0;
        } catch (Exception e) {
            isUserConsentSet.onExtraCallbackWithResult(getTcfVendorConsentStatus.Companion.onTransact(), "AnimateText", "getSplitUnitCount) exception:" + e, null, null, false, 28, null);
            return 0;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        ConstraintLayout constraintLayout;
        int iIntValue;
        int iIntValue2;
        int i3 = 2 % 2;
        int i4 = setEngagementSignalsCallback + 81;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int iOnWarmupCompleted = 0;
        if (mode != 1073741824) {
            if (this.requestPostMessageChannel.isEmpty()) {
                CharSequence charSequence = this.access100;
                if (charSequence != null) {
                    int i6 = setEngagementSignalsCallback + 81;
                    prefetchWithMultipleUrls = i6 % 128;
                    int i7 = i6 % 2;
                    iIntValue = ((Integer) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 88943956, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this, charSequence, Integer.valueOf(size)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -88943926, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted())).intValue();
                    int i8 = setEngagementSignalsCallback + 19;
                    prefetchWithMultipleUrls = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 4 % 5;
                    }
                } else {
                    iIntValue = 0;
                }
                CharSequence charSequence2 = this.extraCommand;
                if (charSequence2 != null) {
                    int i10 = prefetchWithMultipleUrls + 3;
                    setEngagementSignalsCallback = i10 % 128;
                    int i11 = i10 % 2;
                    iIntValue2 = ((Integer) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 88943956, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this, charSequence2, Integer.valueOf(size)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -88943926, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted())).intValue();
                } else {
                    iIntValue2 = 0;
                }
                size = Math.max(iIntValue, iIntValue2);
            } else {
                int i12 = prefetchWithMultipleUrls + 61;
                setEngagementSignalsCallback = i12 % 128;
                int i13 = i12 % 2;
                size = Math.min(onWarmupCompleted(this.requestPostMessageChannel, size), size);
            }
        }
        if (mode2 != 1073741824) {
            if (this.requestPostMessageChannel.isEmpty()) {
                CharSequence charSequence3 = this.access100;
                size2 = charSequence3 != null ? onWarmupCompleted(charSequence3, size) : 0;
                CharSequence charSequence4 = this.extraCommand;
                if (charSequence4 != null) {
                    int i14 = prefetchWithMultipleUrls + 35;
                    setEngagementSignalsCallback = i14 % 128;
                    if (i14 % 2 != 0) {
                        onWarmupCompleted(charSequence4, size);
                        throw null;
                    }
                    iOnWarmupCompleted = onWarmupCompleted(charSequence4, size);
                }
                ConstraintLayout parent = getParent();
                if (!(!(parent instanceof ConstraintLayout))) {
                    constraintLayout = parent;
                    int i15 = prefetchWithMultipleUrls + 103;
                    setEngagementSignalsCallback = i15 % 128;
                    int i16 = i15 % 2;
                } else {
                    constraintLayout = null;
                }
                if (!((constraintLayout != null ? constraintLayout.getParent() : null) instanceof AnimateTop)) {
                    int i17 = setEngagementSignalsCallback + 117;
                    prefetchWithMultipleUrls = i17 % 128;
                    int i18 = i17 % 2;
                    size2 = Math.max(size2, iOnWarmupCompleted);
                }
            } else {
                int iOnNavigationEvent = onNavigationEvent(this.requestPostMessageChannel, size);
                this.newSession = iOnNavigationEvent;
                size2 = size2 != 0 ? Math.min(iOnNavigationEvent, size2) : iOnNavigationEvent;
            }
        }
        setMeasuredDimension(size, size2);
        onNavigationEvent(this.access100, this.asBinder);
    }

    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) {
        int i = 0;
        AnimateText animateText = (AnimateText) objArr[0];
        CharSequence charSequence = (CharSequence) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        if (StringsKt.isBlank(charSequence)) {
            return 0;
        }
        StaticLayout staticLayoutOnWarmupCompleted = animateText.onWarmupCompleted(charSequence, animateText.asBinder, animateText.onWarmupCompleted, iIntValue);
        int lineCount = staticLayoutOnWarmupCompleted.getLineCount();
        int i3 = setEngagementSignalsCallback + 51;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        int iCeil = 0;
        while (i < lineCount) {
            float lineWidth = staticLayoutOnWarmupCompleted.getLineWidth(i);
            if (lineWidth > iCeil) {
                int i5 = prefetchWithMultipleUrls + 9;
                setEngagementSignalsCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    Math.ceil(lineWidth);
                    throw null;
                }
                iCeil = (int) Math.ceil(lineWidth);
                int i6 = prefetchWithMultipleUrls + 87;
                setEngagementSignalsCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            i++;
            int i8 = setEngagementSignalsCallback + 63;
            prefetchWithMultipleUrls = i8 % 128;
            int i9 = i8 % 2;
        }
        return Integer.valueOf(iCeil);
    }

    private final int onWarmupCompleted(CharSequence charSequence, int i) {
        int i2 = 2 % 2;
        if (StringsKt.isBlank(charSequence)) {
            int i3 = prefetchWithMultipleUrls + 11;
            setEngagementSignalsCallback = i3 % 128;
            int i4 = i3 % 2;
            return 0;
        }
        int height = onWarmupCompleted(charSequence, this.asBinder, this.onWarmupCompleted, i).getHeight();
        int i5 = setEngagementSignalsCallback + 3;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 != 0) {
            return height;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ float IAuthTabCallback(AnimateText animateText, CharSequence charSequence, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = setEngagementSignalsCallback + 5;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0 ? (i2 & 2) != 0 : (i2 & 3) != 0) {
            i = animateText.getMeasuredWidth();
        }
        float fOnNavigationEvent = animateText.onNavigationEvent(charSequence, i);
        int i5 = setEngagementSignalsCallback + 69;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
        return fOnNavigationEvent;
    }

    public final float onNavigationEvent(@NotNull CharSequence charSequence, int i) {
        int i2 = 2 % 2;
        int i3 = prefetchWithMultipleUrls + 35;
        setEngagementSignalsCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            onWarmupCompleted(charSequence, i);
            throw null;
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        float fOnWarmupCompleted = onWarmupCompleted(charSequence, i);
        int i4 = setEngagementSignalsCallback + 23;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return fOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 117;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.draw(canvas);
        onWarmupCompleted(canvas, true);
        onWarmupCompleted(canvas, false);
        int i4 = setEngagementSignalsCallback + 99;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(Canvas canvas, boolean z) {
        StaticLayout staticLayout;
        IAuthTabCallback iAuthTabCallback;
        List<getRetryOnConnectionFailureokhttp> list;
        float measuredHeight;
        int i;
        String str;
        CharSequence charSequence;
        float f;
        IAuthTabCallback iAuthTabCallback2;
        onNavigationEvent onnavigationevent;
        StaticLayout staticLayout2;
        int i2;
        Iterator it;
        int i3 = 2 % 2;
        boolean z2 = false;
        if (z) {
            int i4 = prefetchWithMultipleUrls + 75;
            setEngagementSignalsCallback = i4 % 128;
            if (i4 % 2 != 0) {
                staticLayout = this.ICustomTabsCallbackStub;
                int i5 = 93 / 0;
            } else {
                staticLayout = this.ICustomTabsCallbackStub;
            }
        } else {
            staticLayout = this.IAuthTabCallbackStubProxy;
        }
        StaticLayout staticLayout3 = staticLayout;
        if (staticLayout3 != null) {
            onNavigationEvent onnavigationevent2 = z ^ true ? this.asBinder : this.onUnminimized;
            if (z) {
                int i6 = prefetchWithMultipleUrls + 59;
                setEngagementSignalsCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
                iAuthTabCallback = this.ICustomTabsCallbackDefault;
            } else {
                iAuthTabCallback = this.onTransact;
            }
            IAuthTabCallback iAuthTabCallback3 = iAuthTabCallback;
            if (z) {
                list = this.ICustomTabsService;
                int i7 = setEngagementSignalsCallback + 83;
                prefetchWithMultipleUrls = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 3 / 3;
                }
            } else {
                list = this.access000;
            }
            List<getRetryOnConnectionFailureokhttp> list2 = list;
            List<Pair<Integer, Integer>> listOnExtraCallback = (z ? this.isEngagementSignalsApiAvailable : this.IAuthTabCallback_Parcel).onExtraCallback();
            if (this.extraCallback) {
                int i9 = setEngagementSignalsCallback + 23;
                prefetchWithMultipleUrls = i9 % 128;
                int i10 = i9 % 2;
                if (!z) {
                    TextPaint paint = this.onWarmupCompleted.getPaint();
                    if (paint != null) {
                        paint.setAlpha(this.IAuthTabCallbackDefault);
                    }
                    staticLayout3.draw(canvas);
                    return;
                }
                TextPaint paint2 = this.onWarmupCompleted.getPaint();
                if (paint2 != null) {
                    int i11 = prefetchWithMultipleUrls + 49;
                    setEngagementSignalsCallback = i11 % 128;
                    int i12 = i11 % 2;
                    paint2.setAlpha(this.asInterface);
                }
                staticLayout3.draw(canvas);
                return;
            }
            TextPaint paint3 = this.onWarmupCompleted.getPaint();
            if (paint3 != null) {
                if (onnavigationevent2 != onNavigationEvent.CENTER_LEFT) {
                    int i13 = setEngagementSignalsCallback + 45;
                    prefetchWithMultipleUrls = i13 % 128;
                    int i14 = i13 % 2;
                    measuredHeight = (onnavigationevent2 == onNavigationEvent.CENTER || onnavigationevent2 == onNavigationEvent.CENTER_RIGHT) ? (getMeasuredHeight() - staticLayout3.getHeight()) / 2.0f : 0.0f;
                }
                float f2 = measuredHeight;
                RectF rectFOnExtraCallback = onExtraCallback(staticLayout3, f2);
                onWarmupCompleted onwarmupcompleted = this.newSessionWithExtras;
                Shader shaderOnNavigationEvent = onwarmupcompleted != null ? onwarmupcompleted.onNavigationEvent(RangesKt.coerceAtLeast(rectFOnExtraCallback.width(), 1.0f), RangesKt.coerceAtLeast(rectFOnExtraCallback.height(), 1.0f)) : null;
                if (iAuthTabCallback3 == IAuthTabCallback.None) {
                    onExtraCallbackWithResult(paint3, canvas, staticLayout3, list2, f2, rectFOnExtraCallback, shaderOnNavigationEvent);
                    return;
                }
                CharSequence text = staticLayout3.getText();
                String str2 = "";
                Intrinsics.checkNotNullExpressionValue(text, "");
                int i15 = 0;
                int i16 = 0;
                while (i16 < text.length()) {
                    char cCharAt = text.charAt(i16);
                    if (list2.isEmpty()) {
                        i = i16;
                        str = str2;
                        charSequence = text;
                        f = f2;
                        iAuthTabCallback2 = iAuthTabCallback3;
                        onnavigationevent = onnavigationevent2;
                        staticLayout2 = staticLayout3;
                    } else {
                        if (listOnExtraCallback.isEmpty()) {
                            i2 = i15;
                            i = i16;
                            str = str2;
                            charSequence = text;
                            f = f2;
                            iAuthTabCallback2 = iAuthTabCallback3;
                            onnavigationevent = onnavigationevent2;
                            staticLayout2 = staticLayout3;
                            IAuthTabCallback(i2, paint3, String.valueOf(cCharAt), onnavigationevent, iAuthTabCallback2, canvas, staticLayout2, list2, f, rectFOnExtraCallback, shaderOnNavigationEvent);
                        } else {
                            Iterator it2 = listOnExtraCallback.iterator();
                            String string = str2;
                            boolean z3 = z2;
                            boolean z4 = z3;
                            while (it2.hasNext()) {
                                Pair pair = (Pair) it2.next();
                                int iIntValue = ((Number) pair.getFirst()).intValue();
                                if (i15 < ((Number) pair.getSecond()).intValue()) {
                                    int i17 = setEngagementSignalsCallback + 59;
                                    it = it2;
                                    prefetchWithMultipleUrls = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        throw null;
                                    }
                                    if (iIntValue <= i15) {
                                        z3 = true;
                                        if (i15 == ((Number) pair.getFirst()).intValue()) {
                                            int i18 = setEngagementSignalsCallback + 113;
                                            prefetchWithMultipleUrls = i18 % 128;
                                            int i19 = i18 % 2;
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        CharSequence text2 = staticLayout3.getText();
                                        Intrinsics.checkNotNullExpressionValue(text2, str2);
                                        string = StringsKt.subSequence(text2, RangesKt.until(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue())).toString();
                                    }
                                } else {
                                    it = it2;
                                }
                                it2 = it;
                            }
                            if (z3) {
                                int i20 = setEngagementSignalsCallback;
                                int i21 = i20 + 61;
                                prefetchWithMultipleUrls = i21 % 128;
                                int i22 = i21 % 2;
                                if (z4) {
                                    int i23 = i20 + 93;
                                    prefetchWithMultipleUrls = i23 % 128;
                                    int i24 = i23 % 2;
                                    i2 = i15;
                                    i = i16;
                                    str = str2;
                                    charSequence = text;
                                    f = f2;
                                    iAuthTabCallback2 = iAuthTabCallback3;
                                    onnavigationevent = onnavigationevent2;
                                    staticLayout2 = staticLayout3;
                                    IAuthTabCallback(i15, paint3, string, onnavigationevent2, iAuthTabCallback3, canvas, staticLayout3, list2, f, rectFOnExtraCallback, shaderOnNavigationEvent);
                                } else {
                                    i2 = i15;
                                    i = i16;
                                    str = str2;
                                    charSequence = text;
                                    f = f2;
                                    iAuthTabCallback2 = iAuthTabCallback3;
                                    onnavigationevent = onnavigationevent2;
                                    staticLayout2 = staticLayout3;
                                }
                            } else {
                                i2 = i15;
                                i = i16;
                                str = str2;
                                charSequence = text;
                                f = f2;
                                iAuthTabCallback2 = iAuthTabCallback3;
                                onnavigationevent = onnavigationevent2;
                                staticLayout2 = staticLayout3;
                                IAuthTabCallback(i2, paint3, String.valueOf(cCharAt), onnavigationevent, iAuthTabCallback2, canvas, staticLayout2, list2, f, rectFOnExtraCallback, shaderOnNavigationEvent);
                            }
                        }
                        i15 = i2 + 1;
                    }
                    i16 = i + 1;
                    str2 = str;
                    text = charSequence;
                    f2 = f;
                    iAuthTabCallback3 = iAuthTabCallback2;
                    onnavigationevent2 = onnavigationevent;
                    staticLayout3 = staticLayout2;
                    z2 = false;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(TextPaint textPaint, Canvas canvas, StaticLayout staticLayout, List<getRetryOnConnectionFailureokhttp> list, float f, RectF rectF, Shader shader) {
        float fWriteTypedObject;
        float fICustomTabsCallback;
        int i = 2 % 2;
        getRetryOnConnectionFailureokhttp getretryonconnectionfailureokhttp = (getRetryOnConnectionFailureokhttp) CollectionsKt.firstOrNull(list);
        if (getretryonconnectionfailureokhttp == null) {
            return;
        }
        AppLovinSdkConfigurationConsentDialogState appLovinSdkConfigurationConsentDialogStateICustomTabsCallback = getretryonconnectionfailureokhttp.ICustomTabsCallback();
        float fCoerceAtLeast = RangesKt.coerceAtLeast(staticLayout.getWidth(), 1.0f);
        float fCoerceAtLeast2 = RangesKt.coerceAtLeast(staticLayout.getHeight(), 1.0f);
        if (appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.writeTypedObject() == 0.0f) {
            fWriteTypedObject = appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.access000() * fCoerceAtLeast;
        } else {
            fWriteTypedObject = appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.writeTypedObject();
        }
        if (appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.ICustomTabsCallback() == 0.0f) {
            fICustomTabsCallback = appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.getInterfaceDescriptor() * fCoerceAtLeast2;
        } else {
            fICustomTabsCallback = appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.ICustomTabsCallback();
        }
        this.onExtraCallbackWithResult.reset();
        this.onExtraCallback.save();
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -751413862, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this, this.onExtraCallback, appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.onExtraCallback()}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 751413865, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        this.onExtraCallback.rotate(((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{appLovinSdkConfigurationConsentDialogStateICustomTabsCallback}, zziea.IAuthTabCallback(), 28336792, -28336789)).floatValue(), appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.onTransact(), -((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{appLovinSdkConfigurationConsentDialogStateICustomTabsCallback}, zziea.IAuthTabCallback(), 928198490, -928198490)).floatValue());
        this.onExtraCallback.getMatrix(this.onExtraCallbackWithResult);
        this.onExtraCallback.restore();
        float fFloatValue = ((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{appLovinSdkConfigurationConsentDialogStateICustomTabsCallback}, zziea.IAuthTabCallback(), -488248815, 488248817)).floatValue();
        float fAsInterface = appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.asInterface();
        float fIAuthTabCallbackDefault = appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.IAuthTabCallbackDefault();
        float fAsInterface2 = appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.asInterface();
        RectF rectFOnWarmupCompleted = onWarmupCompleted(staticLayout, textPaint);
        float fWidth = rectFOnWarmupCompleted.left + (rectFOnWarmupCompleted.width() * appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.IAuthTabCallbackStubProxy());
        float fHeight = rectFOnWarmupCompleted.top + (rectFOnWarmupCompleted.height() * ((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{appLovinSdkConfigurationConsentDialogStateICustomTabsCallback}, zziea.IAuthTabCallback(), 1720941521, -1720941515)).floatValue());
        this.onExtraCallbackWithResult.preScale(fFloatValue * fAsInterface, fIAuthTabCallbackDefault * fAsInterface2);
        this.onExtraCallbackWithResult.preTranslate(-fWidth, -fHeight);
        this.onExtraCallbackWithResult.postTranslate(fWidth, fHeight);
        float f2 = f + fICustomTabsCallback;
        this.onExtraCallbackWithResult.postTranslate(fWriteTypedObject, f2);
        canvas.save();
        if (Build.VERSION.SDK_INT >= 31) {
            int i2 = prefetchWithMultipleUrls + 85;
            setEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
            if (((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{appLovinSdkConfigurationConsentDialogStateICustomTabsCallback}, zziea.IAuthTabCallback(), -485618801, 485618806)).floatValue() > 0.0f) {
                RenderNode renderNodeRr_ = getretryonconnectionfailureokhttp.rr_();
                if (renderNodeRr_ != null) {
                    int iIAuthTabCallback = zziea.IAuthTabCallback();
                    int iIAuthTabCallback2 = zziea.IAuthTabCallback();
                    int iCeil = (int) Math.ceil(((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), iIAuthTabCallback, zziea.IAuthTabCallback(), new Object[]{appLovinSdkConfigurationConsentDialogStateICustomTabsCallback}, iIAuthTabCallback2, -485618801, 485618806)).floatValue() * 2.0f);
                    int iMax = Math.max(iCeil, (int) Math.ceil(Math.abs(fWriteTypedObject) + Math.abs(fWidth)));
                    int iMax2 = Math.max(iCeil, (int) Math.ceil(Math.abs(f2) + Math.abs(fHeight)));
                    float f3 = iMax;
                    int i4 = (int) (fWriteTypedObject - f3);
                    float f4 = iMax2;
                    int i5 = (int) (f2 - f4);
                    renderNodeRr_.setPosition(i4, i5, (int) (fWriteTypedObject + fCoerceAtLeast + f3), (int) (f2 + fCoerceAtLeast2 + f4));
                    renderNodeRr_.setRenderEffect(RenderEffect.createBlurEffect(((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{appLovinSdkConfigurationConsentDialogStateICustomTabsCallback}, zziea.IAuthTabCallback(), -485618801, 485618806)).floatValue(), ((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{appLovinSdkConfigurationConsentDialogStateICustomTabsCallback}, zziea.IAuthTabCallback(), -485618801, 485618806)).floatValue(), Shader.TileMode.CLAMP));
                    RecordingCanvas recordingCanvasBeginRecording = renderNodeRr_.beginRecording();
                    Intrinsics.checkNotNullExpressionValue(recordingCanvasBeginRecording, "");
                    recordingCanvasBeginRecording.save();
                    Matrix matrix = new Matrix(this.onExtraCallbackWithResult);
                    matrix.postTranslate(-i4, -i5);
                    recordingCanvasBeginRecording.concat(matrix);
                    IAuthTabCallback(textPaint, (Canvas) recordingCanvasBeginRecording, staticLayout, appLovinSdkConfigurationConsentDialogStateICustomTabsCallback, rectF, shader, false);
                    recordingCanvasBeginRecording.restore();
                    renderNodeRr_.endRecording();
                    canvas.drawRenderNode(renderNodeRr_);
                }
            } else {
                canvas.concat(this.onExtraCallbackWithResult);
                IAuthTabCallback(textPaint, canvas, staticLayout, appLovinSdkConfigurationConsentDialogStateICustomTabsCallback, rectF, shader, true);
            }
        }
        canvas.restore();
        this.onExtraCallbackWithResult.reset();
        int i6 = prefetchWithMultipleUrls + 19;
        setEngagementSignalsCallback = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private final RectF onWarmupCompleted(StaticLayout staticLayout, TextPaint textPaint) {
        Paint.FontMetrics fontMetrics;
        int lineCount;
        int i;
        int i2 = 2 % 2;
        int i3 = prefetchWithMultipleUrls + 113;
        setEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            fontMetrics = textPaint.getFontMetrics();
            lineCount = staticLayout.getLineCount();
            i = 1;
        } else {
            fontMetrics = textPaint.getFontMetrics();
            lineCount = staticLayout.getLineCount();
            i = 0;
        }
        float fMax = -3.4028235E38f;
        float fMax2 = -3.4028235E38f;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        while (i < lineCount) {
            fMin = Math.min(fMin, staticLayout.getLineLeft(i));
            fMax = Math.max(fMax, staticLayout.getLineRight(i));
            float lineBaseline = staticLayout.getLineBaseline(i);
            fMin2 = Math.min(fMin2, fontMetrics.ascent + lineBaseline);
            fMax2 = Math.max(fMax2, lineBaseline + fontMetrics.descent);
            i++;
        }
        if (fMin != Float.MAX_VALUE && fMin2 != Float.MAX_VALUE && fMax != -3.4028235E38f) {
            int i4 = prefetchWithMultipleUrls + 59;
            int i5 = i4 % 128;
            setEngagementSignalsCallback = i5;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (fMax2 != -3.4028235E38f && fMax > fMin) {
                int i6 = i5 + 45;
                prefetchWithMultipleUrls = i6 % 128;
                int i7 = i6 % 2;
                if (fMax2 > fMin2) {
                    return new RectF(fMin, fMin2, fMax, fMax2);
                }
            }
        }
        return new RectF(0.0f, 0.0f, staticLayout.getWidth(), staticLayout.getHeight());
    }

    private final void IAuthTabCallback(TextPaint textPaint, Canvas canvas, StaticLayout staticLayout, AppLovinSdkConfigurationConsentDialogState appLovinSdkConfigurationConsentDialogState, RectF rectF, Shader shader, boolean z) {
        Shader shader2;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 1;
        setEngagementSignalsCallback = i2 % 128;
        BlurMaskFilter blurMaskFilter = null;
        if (i2 % 2 != 0) {
            textPaint.getColor();
            textPaint.getTypeface();
            textPaint.getShader();
            textPaint.getMaskFilter();
            textPaint.getAlpha();
            throw null;
        }
        int color = textPaint.getColor();
        Typeface typeface = textPaint.getTypeface();
        Shader shader3 = textPaint.getShader();
        MaskFilter maskFilter = textPaint.getMaskFilter();
        int alpha = textPaint.getAlpha();
        if (shader == null) {
            try {
                shader2 = this.prefetch;
                if (shader2 == null) {
                    int i3 = prefetchWithMultipleUrls + 47;
                    setEngagementSignalsCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        shader2 = textPaint.getShader();
                        int i4 = 80 / 0;
                    } else {
                        shader2 = textPaint.getShader();
                    }
                }
            } finally {
                textPaint.setAlpha(alpha);
                textPaint.setColor(color);
                textPaint.setTypeface(typeface);
                textPaint.setShader(shader3);
                textPaint.setMaskFilter(maskFilter);
            }
        } else {
            shader2 = shader;
        }
        textPaint.setShader(shader2);
        Integer numIAuthTabCallback_Parcel = appLovinSdkConfigurationConsentDialogState.IAuthTabCallback_Parcel();
        if (numIAuthTabCallback_Parcel != null) {
            textPaint.setColor(numIAuthTabCallback_Parcel.intValue());
        }
        if (z) {
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            if (((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), iIAuthTabCallback, zziea.IAuthTabCallback(), new Object[]{appLovinSdkConfigurationConsentDialogState}, iIAuthTabCallback2, -485618801, 485618806)).floatValue() > 0.0f) {
                blurMaskFilter = new BlurMaskFilter(appLovinSdkConfigurationConsentDialogState.IAuthTabCallback(), BlurMaskFilter.Blur.NORMAL);
            }
        }
        textPaint.setMaskFilter(blurMaskFilter);
        textPaint.setAlpha(Math.min(255, (int) (appLovinSdkConfigurationConsentDialogState.onExtraCallbackWithResult() * appLovinSdkConfigurationConsentDialogState.onNavigationEvent() * 255.0f)));
        float f = rectF.left;
        Shader shader4 = textPaint.getShader();
        if (shader4 == null) {
            int i5 = setEngagementSignalsCallback + 65;
            prefetchWithMultipleUrls = i5 % 128;
            int i6 = i5 % 2;
            staticLayout.draw(canvas);
            int i7 = prefetchWithMultipleUrls + 31;
            setEngagementSignalsCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            shader4.getLocalMatrix(this.onActivityResized);
            this.ICustomTabsCallback_Parcel.set(this.onActivityResized);
            this.ICustomTabsCallback_Parcel.postTranslate(-f, 0.0f);
            shader4.setLocalMatrix(this.ICustomTabsCallback_Parcel);
            staticLayout.draw(canvas);
            shader4.setLocalMatrix(this.onActivityResized);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Camera camera = (Camera) objArr[1];
        Float f = (Float) objArr[2];
        int i = 2 % 2;
        if (f == null) {
            return null;
        }
        int i2 = prefetchWithMultipleUrls + 97;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = f.floatValue();
        if (fFloatValue <= 0.0f) {
            int i4 = setEngagementSignalsCallback + 75;
            prefetchWithMultipleUrls = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 69 / 0;
            }
            fFloatValue = 100000.0f;
        }
        camera.setLocation(0.0f, 0.0f, -fFloatValue);
        int i6 = prefetchWithMultipleUrls + 95;
        setEngagementSignalsCallback = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private final RectF onExtraCallback(StaticLayout staticLayout, float f) {
        int i = 2 % 2;
        int lineCount = staticLayout.getLineCount();
        float width = -3.4028235E38f;
        float fMin = Float.MAX_VALUE;
        int i2 = 0;
        while (i2 < lineCount) {
            int i3 = prefetchWithMultipleUrls + 119;
            setEngagementSignalsCallback = i3 % 128;
            if (i3 % 2 != 0) {
                fMin = Math.min(fMin, staticLayout.getLineLeft(i2));
                width = Math.max(width, staticLayout.getLineRight(i2));
                i2 += 76;
            } else {
                fMin = Math.min(fMin, staticLayout.getLineLeft(i2));
                width = Math.max(width, staticLayout.getLineRight(i2));
                i2++;
            }
        }
        if (fMin == Float.MAX_VALUE || width == -3.4028235E38f) {
            width = staticLayout.getWidth();
            fMin = 0.0f;
        }
        RectF rectF = new RectF(fMin, f, width, staticLayout.getHeight() + f);
        int i4 = setEngagementSignalsCallback + 93;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return rectF;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x03ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(int i, TextPaint textPaint, String str, onNavigationEvent onnavigationevent, IAuthTabCallback iAuthTabCallback, Canvas canvas, StaticLayout staticLayout, List<getRetryOnConnectionFailureokhttp> list, float f, RectF rectF, Shader shader) {
        float fMeasureText;
        float fFloatValue;
        Shader shader2;
        Shader shader3;
        Integer numOnWarmupCompleted;
        String str2;
        float f2;
        int i2 = 2 % 2;
        if (StringsKt.isBlank(str)) {
            return;
        }
        int lineForOffset = staticLayout.getLineForOffset(i);
        float primaryHorizontal = staticLayout.getPrimaryHorizontal(i);
        float lineBaseline = staticLayout.getLineBaseline(lineForOffset) + f;
        float lineBottom = (staticLayout.getLineBottom(lineForOffset) + f) - (staticLayout.getLineTop(lineForOffset) + f);
        if (i > list.size() - 1) {
            return;
        }
        getRetryOnConnectionFailureokhttp getretryonconnectionfailureokhttp = list.get(i);
        AppLovinSdkConfigurationConsentDialogState appLovinSdkConfigurationConsentDialogStateICustomTabsCallback = getretryonconnectionfailureokhttp.ICustomTabsCallback();
        Float typedObject = appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.readTypedObject();
        if (typedObject != null) {
            fMeasureText = typedObject.floatValue();
        } else {
            fMeasureText = textPaint.measureText(str);
            appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.onWarmupCompleted(Float.valueOf(fMeasureText));
        }
        float fAccess000 = appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.writeTypedObject() == 0.0f ? iAuthTabCallback == IAuthTabCallback.Char ? appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.access000() * fMeasureText : staticLayout.getWidth() * appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.access000() : appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.writeTypedObject();
        float interfaceDescriptor = appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.ICustomTabsCallback() == 0.0f ? appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.getInterfaceDescriptor() * lineBottom : appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.ICustomTabsCallback();
        float f3 = primaryHorizontal - rectF.left;
        float f4 = lineBaseline - rectF.top;
        this.onExtraCallbackWithResult.reset();
        this.onExtraCallback.save();
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -751413862, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this, this.onExtraCallback, appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.onExtraCallback()}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 751413865, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        this.onExtraCallback.rotate(((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{appLovinSdkConfigurationConsentDialogStateICustomTabsCallback}, zziea.IAuthTabCallback(), 28336792, -28336789)).floatValue(), appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.onTransact(), -((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{appLovinSdkConfigurationConsentDialogStateICustomTabsCallback}, zziea.IAuthTabCallback(), 928198490, -928198490)).floatValue());
        this.onExtraCallback.getMatrix(this.onExtraCallbackWithResult);
        this.onExtraCallback.restore();
        float fFloatValue2 = ((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{appLovinSdkConfigurationConsentDialogStateICustomTabsCallback}, zziea.IAuthTabCallback(), -488248815, 488248817)).floatValue();
        float fAsInterface = appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.asInterface();
        float fIAuthTabCallbackDefault = appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.IAuthTabCallbackDefault();
        float fAsInterface2 = appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.asInterface();
        float fIAuthTabCallbackStubProxy = appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.IAuthTabCallbackStubProxy() * fMeasureText;
        if (getretryonconnectionfailureokhttp.onNavigationEvent()) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            float f5 = fontMetrics.ascent;
            fFloatValue = f5 + ((fontMetrics.descent - f5) * ((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{appLovinSdkConfigurationConsentDialogStateICustomTabsCallback}, zziea.IAuthTabCallback(), 1720941521, -1720941515)).floatValue());
        } else {
            fFloatValue = ((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{appLovinSdkConfigurationConsentDialogStateICustomTabsCallback}, zziea.IAuthTabCallback(), 1720941521, -1720941515)).floatValue() * lineBottom;
        }
        this.onExtraCallbackWithResult.preScale(fFloatValue2 * fAsInterface, fIAuthTabCallbackDefault * fAsInterface2);
        this.onExtraCallbackWithResult.preTranslate(-fIAuthTabCallbackStubProxy, -fFloatValue);
        this.onExtraCallbackWithResult.postTranslate(fIAuthTabCallbackStubProxy, fFloatValue);
        float f6 = primaryHorizontal + fAccess000;
        float f7 = lineBaseline + interfaceDescriptor;
        this.onExtraCallbackWithResult.postTranslate(f6, f7);
        canvas.save();
        if (Build.VERSION.SDK_INT >= 31) {
            int i3 = prefetchWithMultipleUrls + 97;
            setEngagementSignalsCallback = i3 % 128;
            int i4 = i3 % 2;
            if (((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{appLovinSdkConfigurationConsentDialogStateICustomTabsCallback}, zziea.IAuthTabCallback(), -485618801, 485618806)).floatValue() > 0.0f) {
                RenderNode renderNodeRr_ = getretryonconnectionfailureokhttp.rr_();
                if (renderNodeRr_ != null) {
                    int iCeil = (int) Math.ceil(((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{appLovinSdkConfigurationConsentDialogStateICustomTabsCallback}, zziea.IAuthTabCallback(), -485618801, 485618806)).floatValue() * 2.0f);
                    float fMax = Math.max(iCeil, (int) Math.ceil(Math.abs(fAccess000) + Math.abs(fIAuthTabCallbackStubProxy)));
                    int i5 = (int) (f6 - fMax);
                    float fMax2 = Math.max(iCeil, (int) Math.ceil(Math.abs(interfaceDescriptor) + Math.abs(fFloatValue)));
                    int i6 = (int) ((textPaint.getFontMetrics().ascent + f7) - fMax2);
                    renderNodeRr_.setPosition(i5, i6, (int) (f6 + fMeasureText + fMax), (int) (f7 + textPaint.getFontMetrics().descent + fMax2));
                    renderNodeRr_.setRenderEffect(RenderEffect.createBlurEffect(((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{appLovinSdkConfigurationConsentDialogStateICustomTabsCallback}, zziea.IAuthTabCallback(), -485618801, 485618806)).floatValue(), ((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{appLovinSdkConfigurationConsentDialogStateICustomTabsCallback}, zziea.IAuthTabCallback(), -485618801, 485618806)).floatValue(), Shader.TileMode.CLAMP));
                    RecordingCanvas recordingCanvasBeginRecording = renderNodeRr_.beginRecording();
                    Intrinsics.checkNotNullExpressionValue(recordingCanvasBeginRecording, "");
                    recordingCanvasBeginRecording.save();
                    Matrix matrix = new Matrix(this.onExtraCallbackWithResult);
                    matrix.postTranslate(-i5, -i6);
                    recordingCanvasBeginRecording.concat(matrix);
                    int color = textPaint.getColor();
                    Typeface typeface = textPaint.getTypeface();
                    Shader shader4 = textPaint.getShader();
                    MaskFilter maskFilter = textPaint.getMaskFilter();
                    int alpha = textPaint.getAlpha();
                    if (shader == null) {
                        int i7 = setEngagementSignalsCallback + 31;
                        int i8 = i7 % 128;
                        prefetchWithMultipleUrls = i8;
                        int i9 = i7 % 2;
                        shader3 = this.prefetch;
                        if (shader3 == null) {
                            int i10 = i8 + 83;
                            setEngagementSignalsCallback = i10 % 128;
                            int i11 = i10 % 2;
                            shader3 = textPaint.getShader();
                        }
                    } else {
                        shader3 = shader;
                    }
                    textPaint.setShader(shader3);
                    textPaint.setMaskFilter(null);
                    getReadTimeoutokhttp getreadtimeoutokhttpOnExtraCallbackWithResult = getretryonconnectionfailureokhttp.onExtraCallbackWithResult();
                    if (getreadtimeoutokhttpOnExtraCallbackWithResult != null) {
                        int i12 = prefetchWithMultipleUrls + 97;
                        setEngagementSignalsCallback = i12 % 128;
                        int i13 = i12 % 2;
                        numOnWarmupCompleted = getreadtimeoutokhttpOnExtraCallbackWithResult.onWarmupCompleted();
                    } else {
                        numOnWarmupCompleted = null;
                    }
                    if (numOnWarmupCompleted != null) {
                        int i14 = prefetchWithMultipleUrls + 21;
                        setEngagementSignalsCallback = i14 % 128;
                        int i15 = i14 % 2;
                        textPaint.setColor(numOnWarmupCompleted.intValue());
                    } else {
                        Integer numIAuthTabCallback_Parcel = appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.IAuthTabCallback_Parcel();
                        if (numIAuthTabCallback_Parcel != null) {
                            textPaint.setColor(numIAuthTabCallback_Parcel.intValue());
                        }
                    }
                    getReadTimeoutokhttp getreadtimeoutokhttpOnExtraCallbackWithResult2 = getretryonconnectionfailureokhttp.onExtraCallbackWithResult();
                    Typeface typefaceIAuthTabCallback = getreadtimeoutokhttpOnExtraCallbackWithResult2 != null ? getreadtimeoutokhttpOnExtraCallbackWithResult2.IAuthTabCallback() : null;
                    if (typefaceIAuthTabCallback != null) {
                        textPaint.setTypeface(typefaceIAuthTabCallback);
                    }
                    textPaint.setAlpha(Math.min(255, (int) (Color.alpha(textPaint.getColor()) * appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.onExtraCallbackWithResult() * appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.onNavigationEvent())));
                    Shader shader5 = textPaint.getShader();
                    if (shader5 == null) {
                        int i16 = setEngagementSignalsCallback + 19;
                        prefetchWithMultipleUrls = i16 % 128;
                        if (i16 % 2 == 0) {
                            f2 = 1.0f;
                            str2 = str;
                        } else {
                            str2 = str;
                            f2 = 0.0f;
                        }
                        recordingCanvasBeginRecording.drawText(str2, f2, f2, textPaint);
                    } else {
                        shader5.getLocalMatrix(this.onActivityResized);
                        this.ICustomTabsCallback_Parcel.set(this.onActivityResized);
                        this.ICustomTabsCallback_Parcel.postTranslate(-f3, -f4);
                        shader5.setLocalMatrix(this.ICustomTabsCallback_Parcel);
                        recordingCanvasBeginRecording.drawText(str, 0.0f, 0.0f, textPaint);
                        shader5.setLocalMatrix(this.onActivityResized);
                    }
                    textPaint.setAlpha(alpha);
                    textPaint.setColor(color);
                    textPaint.setTypeface(typeface);
                    textPaint.setShader(shader4);
                    textPaint.setMaskFilter(maskFilter);
                    recordingCanvasBeginRecording.restore();
                    renderNodeRr_.endRecording();
                    canvas.drawRenderNode(renderNodeRr_);
                }
            } else {
                canvas.concat(this.onExtraCallbackWithResult);
                int color2 = textPaint.getColor();
                Typeface typeface2 = textPaint.getTypeface();
                Shader shader6 = textPaint.getShader();
                MaskFilter maskFilter2 = textPaint.getMaskFilter();
                textPaint.getAlpha();
                if (shader == null) {
                    int i17 = setEngagementSignalsCallback;
                    int i18 = i17 + 61;
                    prefetchWithMultipleUrls = i18 % 128;
                    int i19 = i18 % 2;
                    Shader shader7 = this.prefetch;
                    if (shader7 == null) {
                        int i20 = i17 + 27;
                        prefetchWithMultipleUrls = i20 % 128;
                        if (i20 % 2 == 0) {
                            textPaint.getShader();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        shader2 = textPaint.getShader();
                    } else {
                        shader2 = shader7;
                    }
                } else {
                    shader2 = shader;
                }
                textPaint.setShader(shader2);
                getReadTimeoutokhttp getreadtimeoutokhttpOnExtraCallbackWithResult3 = getretryonconnectionfailureokhttp.onExtraCallbackWithResult();
                Integer numOnWarmupCompleted2 = getreadtimeoutokhttpOnExtraCallbackWithResult3 != null ? getreadtimeoutokhttpOnExtraCallbackWithResult3.onWarmupCompleted() : null;
                if (numOnWarmupCompleted2 != null) {
                    textPaint.setColor(numOnWarmupCompleted2.intValue());
                } else {
                    Integer numIAuthTabCallback_Parcel2 = appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.IAuthTabCallback_Parcel();
                    if (numIAuthTabCallback_Parcel2 != null) {
                        textPaint.setColor(numIAuthTabCallback_Parcel2.intValue());
                    }
                }
                getReadTimeoutokhttp getreadtimeoutokhttpOnExtraCallbackWithResult4 = getretryonconnectionfailureokhttp.onExtraCallbackWithResult();
                Typeface typefaceIAuthTabCallback2 = getreadtimeoutokhttpOnExtraCallbackWithResult4 != null ? getreadtimeoutokhttpOnExtraCallbackWithResult4.IAuthTabCallback() : null;
                if (typefaceIAuthTabCallback2 != null) {
                    int i21 = setEngagementSignalsCallback + 63;
                    prefetchWithMultipleUrls = i21 % 128;
                    if (i21 % 2 == 0) {
                        textPaint.setTypeface(typefaceIAuthTabCallback2);
                        throw null;
                    }
                    textPaint.setTypeface(typefaceIAuthTabCallback2);
                }
                if (((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{appLovinSdkConfigurationConsentDialogStateICustomTabsCallback}, zziea.IAuthTabCallback(), -485618801, 485618806)).floatValue() > 0.0f) {
                    textPaint.setMaskFilter(new BlurMaskFilter(appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.IAuthTabCallback(), BlurMaskFilter.Blur.NORMAL));
                } else {
                    textPaint.setMaskFilter(null);
                }
                textPaint.setAlpha(Math.min(255, (int) (Color.alpha(textPaint.getColor()) * appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.onExtraCallbackWithResult() * appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.onNavigationEvent())));
                Shader shader8 = textPaint.getShader();
                if (shader8 == null) {
                    canvas.drawText(str, 0.0f, 0.0f, textPaint);
                } else {
                    shader8.getLocalMatrix(this.onActivityResized);
                    this.ICustomTabsCallback_Parcel.set(this.onActivityResized);
                    this.ICustomTabsCallback_Parcel.postTranslate(-f3, -f4);
                    shader8.setLocalMatrix(this.ICustomTabsCallback_Parcel);
                    canvas.drawText(str, 0.0f, 0.0f, textPaint);
                    shader8.setLocalMatrix(this.onActivityResized);
                    int i22 = setEngagementSignalsCallback + 107;
                    prefetchWithMultipleUrls = i22 % 128;
                    int i23 = i22 % 2;
                }
                textPaint.setAlpha(255);
                textPaint.setColor(color2);
                textPaint.setTypeface(typeface2);
                textPaint.setShader(shader6);
                textPaint.setMaskFilter(maskFilter2);
            }
        }
        canvas.restore();
        this.onExtraCallbackWithResult.reset();
    }

    private final void onNavigationEvent(CharSequence charSequence, onNavigationEvent onnavigationevent) {
        CharSequence text;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 19;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        if (charSequence != null) {
            StaticLayout staticLayout = this.IAuthTabCallbackStubProxy;
            if (staticLayout != null) {
                int i5 = i2 + 35;
                setEngagementSignalsCallback = i5 % 128;
                int i6 = i5 % 2;
                CharSequence charSequence2 = this.extraCommand;
                if (staticLayout == null || (text = staticLayout.getText()) == null) {
                    int i7 = prefetchWithMultipleUrls + 111;
                    setEngagementSignalsCallback = i7 % 128;
                    int i8 = i7 % 2;
                    text = "";
                }
                if (!(!Intrinsics.areEqual(charSequence2, text))) {
                    int i9 = prefetchWithMultipleUrls + 79;
                    setEngagementSignalsCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        this.ICustomTabsCallbackStub = this.IAuthTabCallbackStubProxy;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    this.ICustomTabsCallbackStub = this.IAuthTabCallbackStubProxy;
                }
            }
            this.IAuthTabCallbackStubProxy = onNavigationEvent(this, charSequence, onnavigationevent, this.onWarmupCompleted, 0, 8, null);
        }
        onExtraCallback(this.ICustomTabsCallbackStub, true);
        onExtraCallback(this.IAuthTabCallbackStubProxy, false);
    }

    static /* synthetic */ StaticLayout onNavigationEvent(AnimateText animateText, CharSequence charSequence, onNavigationEvent onnavigationevent, BaseTextView baseTextView, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = prefetchWithMultipleUrls + 107;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0 ? (i2 & 8) != 0 : (i2 & 85) != 0) {
            i = (animateText.getMeasuredWidth() - animateText.getPaddingStart()) - animateText.getPaddingEnd();
            int i5 = prefetchWithMultipleUrls + 43;
            setEngagementSignalsCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return animateText.onWarmupCompleted(charSequence, onnavigationevent, baseTextView, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final StaticLayout onWarmupCompleted(CharSequence charSequence, onNavigationEvent onnavigationevent, BaseTextView baseTextView, int i) {
        Layout.Alignment alignment;
        int i2 = 2 % 2;
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), baseTextView.getPaint(), i);
        int i3 = onExtraCallbackWithResult.IAuthTabCallback[onnavigationevent.ordinal()];
        if (i3 == 1) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            int i4 = setEngagementSignalsCallback + 67;
            int i5 = i4 % 128;
            prefetchWithMultipleUrls = i5;
            int i6 = i4 % 2;
            if (i3 != 2) {
                int i7 = i5 + 61;
                int i8 = i7 % 128;
                setEngagementSignalsCallback = i8;
                int i9 = i7 % 2;
                if (i3 == 3) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int i10 = i8 + 75;
                    prefetchWithMultipleUrls = i10 % 128;
                    if (i10 % 2 == 0) {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                        int i11 = 61 / 0;
                    } else {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    }
                }
            }
        }
        StaticLayout staticLayoutBuild = builderObtain.setAlignment(alignment).setIncludePad(baseTextView.getIncludeFontPadding()).setLineSpacing(baseTextView.getLineSpacingExtra(), baseTextView.getLineSpacingMultiplier()).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "");
        return staticLayoutBuild;
    }

    private final runOnUiThreadDelayed newSession() {
        int i = 2 % 2;
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        List<getRetryOnConnectionFailureokhttp> list = this.ICustomTabsService;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i2 = prefetchWithMultipleUrls + 57;
            setEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add(RallysKt.onExtraCallback((setCreativeDebuggerEnabled) it.next(), isMuted.onNavigationEvent(RallysKt.onExtraCallback(Address.onNavigationEvent.onWarmupCompleted(), 400), (Float) null, Float.valueOf(0.0f), (Function1) null, 5, (Object) null), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null));
            int i4 = prefetchWithMultipleUrls + 101;
            setEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return (runOnUiThreadDelayed) isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted(this, iAuthTabCallback, arrayList, 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3832, null), false, 1, null);
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 27;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = prefetchWithMultipleUrls + 63;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r1
      0x0029: PHI (r1v5 o.runOnUiThreadDelayed) = (r1v4 o.runOnUiThreadDelayed), (r1v7 o.runOnUiThreadDelayed) binds: [B:8:0x0027, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull readTimeout readtimeout, int i, @NotNull Function0<Unit> function0) {
        runOnUiThreadDelayed runonuithreaddelayed;
        int i2 = 2 % 2;
        int i3 = setEngagementSignalsCallback + 17;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(readtimeout, "");
            Intrinsics.checkNotNullParameter(function0, "");
            runonuithreaddelayed = this.requestPostMessageChannelWithExtras;
            int i4 = 38 / 0;
            if (runonuithreaddelayed != null) {
                int i5 = prefetchWithMultipleUrls + 85;
                setEngagementSignalsCallback = i5 % 128;
                int i6 = i5 % 2;
                if (runonuithreaddelayed.postMessage()) {
                    IAuthTabCallback(function0);
                    return;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(readtimeout, "");
            Intrinsics.checkNotNullParameter(function0, "");
            runonuithreaddelayed = this.requestPostMessageChannelWithExtras;
            if (runonuithreaddelayed != null) {
            }
        }
        onExtraCallback(readtimeout.IAuthTabCallbackDefault(), readtimeout.asBinder(), i, readtimeout.access100(), readtimeout instanceof readTimeout.onWarmupCompleted, function0);
        int i7 = prefetchWithMultipleUrls + 49;
        setEngagementSignalsCallback = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IAuthTabCallback(AnimateText animateText, Function0 function0, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = setEngagementSignalsCallback + 97;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda11
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 33;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    Unit unitIAuthTabCallback = AnimateText.IAuthTabCallback();
                    int i8 = onWarmupCompleted + 17;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return unitIAuthTabCallback;
                }
            };
        }
        animateText.IAuthTabCallback((Function0<Unit>) function0);
        int i5 = prefetchWithMultipleUrls + 65;
        setEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 101;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = prefetchWithMultipleUrls + 77;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public final void IAuthTabCallback(@NotNull final Function0<Unit> function0) {
        Function0<Unit> function02 = function0;
        int i = 2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        Intrinsics.checkNotNullParameter(function02, "");
        warmup();
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        List<getRetryOnConnectionFailureokhttp> list = this.ICustomTabsService;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i2 = setEngagementSignalsCallback + 19;
            prefetchWithMultipleUrls = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add(RallysKt.onExtraCallback((setCreativeDebuggerEnabled) it.next(), isMuted.onNavigationEvent(RallysKt.onExtraCallback(Address.onNavigationEvent.asBinder(), 400), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null));
            function02 = function02;
        }
        List<getRetryOnConnectionFailureokhttp> list2 = this.access000;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            int i4 = setEngagementSignalsCallback + 115;
            prefetchWithMultipleUrls = i4 % 128;
            int i5 = i4 % 2;
            arrayList2.add(RallysKt.onExtraCallback((setCreativeDebuggerEnabled) it2.next(), isMuted.onNavigationEvent(RallysKt.onExtraCallback(Address.onNavigationEvent.asBinder(), 400), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null));
        }
        this.IAuthTabCallback = (runOnUiThreadDelayed) isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted(this, iAuthTabCallback, CollectionsKt.plus(arrayList, arrayList2), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3832, null), null, new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateText$$ExternalSyntheticLambda26
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 65;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                Unit unitOnNavigationEvent = AnimateText.onNavigationEvent(this.f$0, function0);
                int i9 = onNavigationEvent + 79;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    return unitOnNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, 1, null), false, 1, null);
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        AnimateText animateText = (AnimateText) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 73;
        setEngagementSignalsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            animateText.ICustomTabsCallbackStub();
            function0.invoke();
            Unit unit = Unit.INSTANCE;
            int i3 = setEngagementSignalsCallback + 123;
            prefetchWithMultipleUrls = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        animateText.ICustomTabsCallbackStub();
        function0.invoke();
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    public final void extraCallbackWithResult() {
        long jICustomTabsService;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 99;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        warmup();
        ICustomTabsCallbackStub();
        postInvalidate();
        if (!this.onMessageChannelReady) {
            return;
        }
        int i4 = prefetchWithMultipleUrls + 49;
        int i5 = i4 % 128;
        setEngagementSignalsCallback = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        runOnUiThreadDelayed runonuithreaddelayed = this.requestPostMessageChannelWithExtras;
        if (runonuithreaddelayed != null) {
            jICustomTabsService = runonuithreaddelayed.ICustomTabsService();
            int i6 = setEngagementSignalsCallback + 117;
            prefetchWithMultipleUrls = i6 % 128;
            int i7 = i6 % 2;
        } else {
            int i8 = i5 + 71;
            prefetchWithMultipleUrls = i8 % 128;
            int i9 = i8 % 2;
            jICustomTabsService = -1;
        }
        this.onPostMessage = jICustomTabsService;
    }

    private final void ICustomTabsService() {
        long jICustomTabsService;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 43;
        int i3 = i2 % 128;
        setEngagementSignalsCallback = i3;
        if (i2 % 2 == 0) {
            if (this.onRelationshipValidationResult && !(!this.onMessageChannelReady)) {
                runOnUiThreadDelayed runonuithreaddelayed = this.requestPostMessageChannelWithExtras;
                if (runonuithreaddelayed != null) {
                    jICustomTabsService = runonuithreaddelayed.ICustomTabsService();
                } else {
                    int i4 = i3 + 123;
                    prefetchWithMultipleUrls = i4 % 128;
                    int i5 = i4 % 2;
                    jICustomTabsService = -1;
                }
                this.onPostMessage = jICustomTabsService;
                warmup();
                postInvalidate();
                return;
            }
            extraCallbackWithResult();
            return;
        }
        throw null;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 89;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onAttachedToWindow();
        this.onMessageChannelReady = getSocketFactoryokhttp.onExtraCallbackWithResult(this, RecyclerView.class);
        ICustomTabsCallback_Parcel();
        int i4 = prefetchWithMultipleUrls + 5;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void ICustomTabsCallback_Parcel() {
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 123;
        prefetchWithMultipleUrls = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            obj.hashCode();
            throw null;
        }
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null && (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult)) != null) {
            maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new access100(null), 3, (Object) null);
        }
        int i3 = setEngagementSignalsCallback + 35;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        int I$0;
        Object L$0;
        int label;

        access100(access13800<? super access100> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = AnimateText.this.new access100(access13800Var);
            int i2 = onNavigationEvent + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return access100Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 31;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            access100 access100VarCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                access100VarCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = access100VarCreate.invokeSuspend(unit);
            int i4 = onWarmupCompleted + 71;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0114, code lost:
        
            if (im.toss.tds.view.component.anim.text.AnimateText.onExtraCallback(r0, (o.access13800) r13) == r1) goto L32;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            getWriteTimeoutokhttp.onWarmupCompleted onwarmupcompletedIAuthTabCallbackStubProxy;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {AnimateText.this};
                int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                if (((Boolean) AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -128226858, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, iOnWarmupCompleted, 128226882, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted())).booleanValue()) {
                    Object[] objArr2 = {AnimateText.this};
                    int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                    if (((Long) AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 408125835, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr2, iOnWarmupCompleted2, -408125804, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted())).longValue() >= 0) {
                        Object[] objArr3 = {AnimateText.this};
                        int iOnWarmupCompleted3 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                        getWriteTimeoutokhttp.IAuthTabCallback iAuthTabCallback = (getWriteTimeoutokhttp.IAuthTabCallback) AnimateText.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 125352850, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr3, iOnWarmupCompleted3, -125352844, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                        if (iAuthTabCallback != null) {
                            AnimateText animateText = AnimateText.this;
                            animateText.onExtraCallbackWithResult(iAuthTabCallback);
                            this.L$0 = access15400.onNavigationEvent(iAuthTabCallback);
                            this.I$0 = 0;
                            this.label = 1;
                            if (AnimateText.onExtraCallback(animateText, (access13800) this) != objOnWarmupCompleted) {
                            }
                            return objOnWarmupCompleted;
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i3 = onWarmupCompleted + 55;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return unit;
            }
            if (i2 != 1) {
                int i5 = onWarmupCompleted + 39;
                int i6 = i5 % 128;
                onNavigationEvent = i6;
                if (i5 % 2 != 0 ? i2 != 2 : i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = i6 + 29;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                onwarmupcompletedIAuthTabCallbackStubProxy = AnimateText.IAuthTabCallbackStubProxy(AnimateText.this);
                if (onwarmupcompletedIAuthTabCallbackStubProxy != null) {
                    AnimateText animateText2 = AnimateText.this;
                    animateText2.onWarmupCompleted(onwarmupcompletedIAuthTabCallbackStubProxy);
                    this.L$0 = access15400.onNavigationEvent(onwarmupcompletedIAuthTabCallbackStubProxy);
                    this.I$0 = 0;
                    this.label = 3;
                }
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            getWriteTimeoutokhttp.onNavigationEvent onnavigationeventIAuthTabCallbackDefault = AnimateText.IAuthTabCallbackDefault(AnimateText.this);
            if (onnavigationeventIAuthTabCallbackDefault != null) {
                AnimateText animateText3 = AnimateText.this;
                animateText3.onExtraCallback(onnavigationeventIAuthTabCallbackDefault);
                this.L$0 = access15400.onNavigationEvent(onnavigationeventIAuthTabCallbackDefault);
                this.I$0 = 0;
                this.label = 2;
                if (AnimateText.onExtraCallback(animateText3, (access13800) this) != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            onwarmupcompletedIAuthTabCallbackStubProxy = AnimateText.IAuthTabCallbackStubProxy(AnimateText.this);
            if (onwarmupcompletedIAuthTabCallbackStubProxy != null) {
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
        IAuthTabCallbackDefault iAuthTabCallbackDefault;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 71;
        setEngagementSignalsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = access13800Var instanceof IAuthTabCallbackDefault;
            obj.hashCode();
            throw null;
        }
        if (access13800Var instanceof IAuthTabCallbackDefault) {
            iAuthTabCallbackDefault = (IAuthTabCallbackDefault) access13800Var;
            int i3 = iAuthTabCallbackDefault.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallbackDefault.label = i3 - 2147483648;
            } else {
                iAuthTabCallbackDefault = new IAuthTabCallbackDefault(access13800Var);
                int i4 = prefetchWithMultipleUrls + 51;
                setEngagementSignalsCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        Object obj2 = iAuthTabCallbackDefault.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = iAuthTabCallbackDefault.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(obj2);
            iAuthTabCallbackDefault.label = 1;
            if (formatMsgs.onWarmupCompleted(100L, iAuthTabCallbackDefault) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj2);
        }
        runOnUiThreadDelayed runonuithreaddelayed = this.requestPostMessageChannelWithExtras;
        if (runonuithreaddelayed != null) {
            int i7 = prefetchWithMultipleUrls + 87;
            setEngagementSignalsCallback = i7 % 128;
            int i8 = i7 % 2;
            runonuithreaddelayed.onExtraCallback(this.onPostMessage);
        }
        Unit unit = Unit.INSTANCE;
        int i9 = setEngagementSignalsCallback + 47;
        prefetchWithMultipleUrls = i9 % 128;
        if (i9 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 83;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsService();
        super.onDetachedFromWindow();
        int i4 = setEngagementSignalsCallback + 105;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 o.runOnUiThreadDelayed) = (r1v4 o.runOnUiThreadDelayed), (r1v7 o.runOnUiThreadDelayed) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void isEngagementSignalsApiAvailable() {
        runOnUiThreadDelayed runonuithreaddelayed;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 63;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            runonuithreaddelayed = this.IAuthTabCallback;
            int i3 = 48 / 0;
            if (runonuithreaddelayed != null) {
                runonuithreaddelayed.onNavigationEvent();
            }
        } else {
            runonuithreaddelayed = this.IAuthTabCallback;
            if (runonuithreaddelayed != null) {
            }
        }
        runOnUiThreadDelayed runonuithreaddelayed2 = this.requestPostMessageChannelWithExtras;
        if (runonuithreaddelayed2 != null) {
            int i4 = prefetchWithMultipleUrls + 7;
            setEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
            runonuithreaddelayed2.onNavigationEvent();
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 41;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        StaticLayout staticLayout = this.IAuthTabCallbackStubProxy;
        if (staticLayout != null) {
            int i4 = i3 + 21;
            setEngagementSignalsCallback = i4 % 128;
            return i4 % 2 != 0 ? staticLayout.getLineBaseline(1) : staticLayout.getLineBaseline(0);
        }
        StaticLayout staticLayout2 = this.ICustomTabsCallbackStub;
        if (staticLayout2 != null) {
            return staticLayout2.getLineBaseline(0);
        }
        int i5 = i3 + 85;
        setEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return -1;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final IAuthTabCallback Char = new IAuthTabCallback("Char", 0);
        public static final IAuthTabCallback Word = new IAuthTabCallback("Word", 1);
        public static final IAuthTabCallback Line = new IAuthTabCallback("Line", 2);
        public static final IAuthTabCallback None = new IAuthTabCallback("None", 3);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            IAuthTabCallback[] iAuthTabCallbackArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                IAuthTabCallback iAuthTabCallback = Char;
                IAuthTabCallback iAuthTabCallback2 = Word;
                IAuthTabCallback iAuthTabCallback3 = Line;
                IAuthTabCallback iAuthTabCallback4 = None;
                iAuthTabCallbackArr = new IAuthTabCallback[5];
                iAuthTabCallbackArr[0] = iAuthTabCallback;
                iAuthTabCallbackArr[0] = iAuthTabCallback2;
                iAuthTabCallbackArr[4] = iAuthTabCallback3;
                iAuthTabCallbackArr[5] = iAuthTabCallback4;
            } else {
                iAuthTabCallbackArr = new IAuthTabCallback[]{Char, Word, Line, None};
            }
            int i4 = i3 + 37;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return iAuthTabCallbackArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 == 0) {
                return iAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i3 = onWarmupCompleted + 79;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return iAuthTabCallbackArr;
            }
            throw null;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onNavigationEvent + 83;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final onNavigationEvent TOP_LEFT = new onNavigationEvent("TOP_LEFT", 0);
        public static final onNavigationEvent TOP_CENTER = new onNavigationEvent("TOP_CENTER", 1);
        public static final onNavigationEvent CENTER = new onNavigationEvent("CENTER", 2);
        public static final onNavigationEvent CENTER_LEFT = new onNavigationEvent("CENTER_LEFT", 3);
        public static final onNavigationEvent CENTER_RIGHT = new onNavigationEvent("CENTER_RIGHT", 4);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = {TOP_LEFT, TOP_CENTER, CENTER, CENTER_LEFT, CENTER_RIGHT};
            int i5 = i3 + 73;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 52 / 0;
            }
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 121;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i2 + 97;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            if (i3 == 0) {
                throw null;
            }
            int i4 = onWarmupCompleted + 55;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 89;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onnavigationeventArr;
            }
            throw null;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onExtraCallbackWithResult + 91;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    public final void onExtraCallback(@NotNull getWriteTimeoutokhttp.onNavigationEvent onnavigationevent) {
        int iIntValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        if (!(!this.onMinimized)) {
            warmup();
        }
        this.requestPostMessageChannel.clear();
        this.requestPostMessageChannel.addAll(onnavigationevent.extraCallbackWithResult());
        requestLayout();
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new extraCallbackWithResult(onnavigationevent));
            int i2 = setEngagementSignalsCallback + 19;
            prefetchWithMultipleUrls = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        List<Pair<CharSequence, Integer>> listOnExtraCallback = onExtraCallback(onnavigationevent.extraCallbackWithResult(), onnavigationevent.IAuthTabCallback_Parcel(), onnavigationevent.extraCallback(), onnavigationevent.ICustomTabsCallback());
        int iAccess000 = onnavigationevent.access000();
        Iterator<T> it = listOnExtraCallback.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = setEngagementSignalsCallback + 53;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            iIntValue = ((Number) ((Pair) it.next()).getSecond()).intValue();
            int i5 = 73 / 0;
        } else {
            iIntValue = ((Number) ((Pair) it.next()).getSecond()).intValue();
        }
        while (it.hasNext()) {
            int iIntValue2 = ((Number) ((Pair) it.next()).getSecond()).intValue();
            if (iIntValue < iIntValue2) {
                int i6 = setEngagementSignalsCallback + 9;
                prefetchWithMultipleUrls = i6 % 128;
                if (i6 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                iIntValue = iIntValue2;
            }
        }
        readTypedObject readtypedobject = new readTypedObject(onnavigationevent, this, Math.max(iAccess000, iIntValue), listOnExtraCallback);
        setTickerRunning$tds_view_release(true);
        onExtraCallbackWithResult(this, false);
        post(readtypedobject);
        IAuthTabCallback(this, readtypedobject);
    }

    public final List<Pair<CharSequence, Integer>> onExtraCallback(@NotNull List<? extends CharSequence> list, @NotNull readTimeout readtimeout, @NotNull String str, @Nullable Integer num) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(readtimeout, "");
        Intrinsics.checkNotNullParameter(str, "");
        ArrayList<CharSequence> arrayList = new ArrayList();
        if (Intrinsics.areEqual(str, "infinite")) {
            int i2 = prefetchWithMultipleUrls + 39;
            setEngagementSignalsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                arrayList.addAll(list);
                throw null;
            }
            arrayList.addAll(list);
        } else {
            try {
                Result.Companion companion = Result.Companion;
                int i3 = Integer.parseInt(str);
                for (int i4 = 0; i4 < i3; i4++) {
                    arrayList.addAll(list);
                }
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                isUserConsentSet.onExtraCallbackWithResult(getTcfVendorConsentStatus.Companion.onTransact(), Reflection.getOrCreateKotlinClass(arrayList.getClass()).toString(), th2.toString(), null, null, false, 28, null);
                return CollectionsKt.emptyList();
            }
            Result.IAuthTabCallback(obj);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (CharSequence charSequence : arrayList) {
            int i5 = prefetchWithMultipleUrls + 123;
            setEngagementSignalsCallback = i5 % 128;
            int i6 = i5 % 2;
            arrayList2.add(getWrite.IAuthTabCallback(charSequence, Integer.valueOf(onExtraCallback(charSequence, this.onWarmupCompleted, readtimeout, this.asBinder, num))));
            int i7 = setEngagementSignalsCallback + 81;
            prefetchWithMultipleUrls = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = setEngagementSignalsCallback + 29;
        prefetchWithMultipleUrls = i9 % 128;
        if (i9 % 2 != 0) {
            return arrayList2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[PHI: r6
      0x0044: PHI (r6v5 java.lang.Object) = (r6v4 java.lang.Object), (r6v8 java.lang.Object) binds: [B:11:0x0042, B:8:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<Rally> onExtraCallbackWithResult(List<getRetryOnConnectionFailureokhttp> list, StaticLayout staticLayout, AppLovinSdkSettings appLovinSdkSettings, int i, IAuthTabCallback iAuthTabCallback, boolean z) {
        Object next;
        int iOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        List<getRetryOnConnectionFailureokhttp> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        int i3 = prefetchWithMultipleUrls + 57;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (it.hasNext()) {
            int i6 = prefetchWithMultipleUrls + 29;
            setEngagementSignalsCallback = i6 % 128;
            if (i6 % 2 != 0) {
                next = it.next();
                int i7 = 78 / 0;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
            } else {
                next = it.next();
                if (i5 < 0) {
                }
            }
            getRetryOnConnectionFailureokhttp getretryonconnectionfailureokhttp = (getRetryOnConnectionFailureokhttp) next;
            getretryonconnectionfailureokhttp.onWarmupCompleted(z);
            if (staticLayout != null) {
                iOnExtraCallbackWithResult = onExtraCallbackWithResult(staticLayout, iAuthTabCallback, i5);
                int i8 = prefetchWithMultipleUrls + 17;
                setEngagementSignalsCallback = i8 % 128;
                int i9 = i8 % 2;
            } else {
                int i10 = setEngagementSignalsCallback + 81;
                prefetchWithMultipleUrls = i10 % 128;
                int i11 = i10 % 2;
                iOnExtraCallbackWithResult = 0;
            }
            arrayList.add(RallysKt.onExtraCallback((setCreativeDebuggerEnabled) getretryonconnectionfailureokhttp, appLovinSdkSettings, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, iOnExtraCallbackWithResult * i, 0L, false, 1788, (Object) null));
            i5++;
        }
        return arrayList;
    }

    public final void onExtraCallbackWithResult(@NotNull getWriteTimeoutokhttp.IAuthTabCallback iAuthTabCallback) {
        ArrayList arrayList;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 103;
        setEngagementSignalsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        runOnUiThreadDelayed runonuithreaddelayed = this.IAuthTabCallback;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
        }
        if (this.onMinimized) {
            warmup();
            if (iAuthTabCallback.asInterface()) {
                ICustomTabsCallbackStub();
            }
        }
        if (!(!StringsKt.isBlank(iAuthTabCallback.readTypedObject()))) {
            int i3 = prefetchWithMultipleUrls + 37;
            setEngagementSignalsCallback = i3 % 128;
            if (i3 % 2 == 0) {
                newSession();
                return;
            } else {
                newSession();
                int i4 = 24 / 0;
                return;
            }
        }
        IAuthTabCallback IAuthTabCallback2 = iAuthTabCallback.IAuthTabCallbackStubProxy().IAuthTabCallback();
        IAuthTabCallback(iAuthTabCallback.readTypedObject());
        onNavigationEvent((onNavigationEvent) getWriteTimeoutokhttp.onExtraCallback(1819973442, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{iAuthTabCallback}, OverseasRrnInputTextField.IAuthTabCallback(), -1819973442));
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1934036565, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this, IAuthTabCallback2}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1934036549, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        requestPostMessageChannelWithExtras();
        requestLayout();
        if (isLaidOut()) {
            int i5 = prefetchWithMultipleUrls + 1;
            setEngagementSignalsCallback = i5 % 128;
            int i6 = i5 % 2;
            if (!isLayoutRequested()) {
                ArrayList arrayList2 = new ArrayList();
                float f = 0.0f;
                if (!iAuthTabCallback.asInterface()) {
                    int i7 = prefetchWithMultipleUrls + 119;
                    setEngagementSignalsCallback = i7 % 128;
                    int i8 = i7 % 2;
                    arrayList2.add(IAuthTabCallback(this, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(0.0f), (Function1) null, 5, (Object) null), 0, IAuthTabCallback.None, false, 0));
                    int i9 = prefetchWithMultipleUrls + 103;
                    setEngagementSignalsCallback = i9 % 128;
                    int i10 = i9 % 2;
                }
                arrayList2.add(onExtraCallbackWithResult(this, iAuthTabCallback.readTypedObject(), iAuthTabCallback.access000(), iAuthTabCallback.IAuthTabCallbackStubProxy(), IAuthTabCallback2, iAuthTabCallback.onWarmupCompleted()));
                if (iAuthTabCallback.asInterface()) {
                    arrayList = arrayList2;
                } else {
                    pxToDp.IAuthTabCallback iAuthTabCallback2 = pxToDp.IAuthTabCallback.onExtraCallback;
                    List<getRetryOnConnectionFailureokhttp> listIAuthTabCallback = IAuthTabCallback(this);
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIAuthTabCallback, 10));
                    for (getRetryOnConnectionFailureokhttp getretryonconnectionfailureokhttp : listIAuthTabCallback) {
                        arrayList3.add((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(f), Float.valueOf(getretryonconnectionfailureokhttp.ICustomTabsCallback().onNavigationEvent()), new writeTypedObject(getretryonconnectionfailureokhttp, this), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                        f = 0.0f;
                    }
                    runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted(this, iAuthTabCallback2, arrayList3, 0, null, 0, null, null, Boolean.FALSE, 100, 0L, false, 3320, null);
                    arrayList = arrayList2;
                    arrayList.add(runonuithreaddelayedOnWarmupCompleted);
                }
                onNavigationEvent(this, (runOnUiThreadDelayed) isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted(this, pxToDp.IAuthTabCallback.onExtraCallback, arrayList, 0, null, 0, null, null, Boolean.FALSE, iAuthTabCallback.onTransact(), 0L, false, 3320, null), null, new extraCallback(iAuthTabCallback), 1, null), false, 1, null));
                return;
            }
        }
        addOnLayoutChangeListener(new IAuthTabCallbackStubProxy(iAuthTabCallback, this, IAuthTabCallback2));
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1915467337, iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted, -1915467333, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ Unit asInterface() {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1893584475, iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted, -1893584457, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallback(ViewGroup viewGroup, Function0 function0, AnimateText animateText, int i, Function0 function02) {
        Object[] objArr = {viewGroup, function0, animateText, Integer.valueOf(i), function02};
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 931798365, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, iOnWarmupCompleted, -931798350, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub() {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 83120322, iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted, -83120311, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallback(AnimateText animateText, Function0 function0) {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1747962282, iOnWarmupCompleted2, new Object[]{animateText, function0}, iOnWarmupCompleted, 1747962292, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ Unit writeTypedObject() {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1608491223, iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted, -1608491209, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ void onExtraCallback(Function0 function0) {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1689026296, iOnWarmupCompleted2, new Object[]{function0}, iOnWarmupCompleted, 1689026301, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ Unit readTypedObject() {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -341681817, iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted, 341681840, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static final /* synthetic */ pingInterval onExtraCallback(AnimateText animateText) {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (pingInterval) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1798520192, iOnWarmupCompleted2, new Object[]{animateText}, iOnWarmupCompleted, -1798520165, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static final /* synthetic */ getWriteTimeoutokhttp.IAuthTabCallback IAuthTabCallbackStub(AnimateText animateText) {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (getWriteTimeoutokhttp.IAuthTabCallback) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 125352850, iOnWarmupCompleted2, new Object[]{animateText}, iOnWarmupCompleted, -125352844, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static final /* synthetic */ long onTransact(AnimateText animateText) {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Long) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 408125835, iOnWarmupCompleted2, new Object[]{animateText}, iOnWarmupCompleted, -408125804, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted())).longValue();
    }

    public static final /* synthetic */ runOnUiThreadDelayed access000(AnimateText animateText) {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (runOnUiThreadDelayed) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1675398663, iOnWarmupCompleted2, new Object[]{animateText}, iOnWarmupCompleted, 1675398689, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static final /* synthetic */ boolean getInterfaceDescriptor(AnimateText animateText) {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Boolean) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -128226858, iOnWarmupCompleted2, new Object[]{animateText}, iOnWarmupCompleted, 128226882, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted())).booleanValue();
    }

    public static final /* synthetic */ void onNavigationEvent(AnimateText animateText, IAuthTabCallback iAuthTabCallback) {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 381616639, iOnWarmupCompleted2, new Object[]{animateText, iAuthTabCallback}, iOnWarmupCompleted, -381616610, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static final /* synthetic */ void onNavigationEvent(AnimateText animateText, int i) {
        Object[] objArr = {animateText, Integer.valueOf(i)};
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -2127053504, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, iOnWarmupCompleted, 2127053517, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private final void onExtraCallbackWithResult(Camera camera, Float f) {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -751413862, iOnWarmupCompleted2, new Object[]{this, camera, f}, iOnWarmupCompleted, 751413865, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private final void onRelationshipValidationResult() {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1458955612, iOnWarmupCompleted2, new Object[]{this}, iOnWarmupCompleted, 1458955629, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ void IAuthTabCallback(AnimateText animateText, readTimeout readtimeout, int i, Function0 function0, int i2, Object obj) {
        Object[] objArr = {animateText, readtimeout, Integer.valueOf(i), function0, Integer.valueOf(i2), obj};
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 306306691, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, iOnWarmupCompleted, -306306663, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final Unit mayLaunchUrl() {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1257666275, iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted, 1257666297, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private final int onExtraCallback(CharSequence charSequence, int i) {
        Object[] objArr = {this, charSequence, Integer.valueOf(i)};
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Integer) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 88943956, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, iOnWarmupCompleted, -88943926, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted())).intValue();
    }

    private final void onExtraCallbackWithResult(List<? extends CharSequence> list, int i, int i2, String str, onNavigationEvent onnavigationevent, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Integer num) {
        Object[] objArr = {this, list, Integer.valueOf(i), Integer.valueOf(i2), str, onnavigationevent, Boolean.valueOf(z), function0, function02, function03, num};
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 918484400, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, iOnWarmupCompleted, -918484391, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private final void onExtraCallbackWithResult(CharSequence charSequence, int i, onNavigationEvent onnavigationevent, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        Object[] objArr = {this, charSequence, Integer.valueOf(i), onnavigationevent, Boolean.valueOf(z), Boolean.valueOf(z2), function0, function02, function03};
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 824883475, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, iOnWarmupCompleted, -824883475, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final Unit newSessionWithExtras() {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -26255257, iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted, 26255258, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final Unit prefetch() {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1830000536, iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted, -1830000528, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    static /* synthetic */ void onExtraCallback(AnimateText animateText, List list, readTimeout readtimeout, onNavigationEvent onnavigationevent, int i, int i2, int i3, int i4, Object obj) {
        Object[] objArr = {animateText, list, readtimeout, onnavigationevent, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), obj};
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1085163460, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, iOnWarmupCompleted, 1085163485, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final Unit onExtraCallbackWithResult(ViewGroup viewGroup, Function0 function0, AnimateText animateText, int i, Function0 function02) {
        Object[] objArr = {viewGroup, function0, animateText, Integer.valueOf(i), function02};
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 2010377297, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, iOnWarmupCompleted, -2010377295, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private final void onWarmupCompleted(IAuthTabCallback iAuthTabCallback) {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1934036565, iOnWarmupCompleted2, new Object[]{this, iAuthTabCallback}, iOnWarmupCompleted, -1934036549, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final Unit updateVisuals() {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 443606654, iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted, -443606634, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final Unit onWarmupCompleted(AnimateText animateText, Function0 function0) {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 134719532, iOnWarmupCompleted2, new Object[]{animateText, function0}, iOnWarmupCompleted, -134719513, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final Unit access200() {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 141899817, iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted, -141899796, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final Unit onSessionEnded() {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1009348617, iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted, 1009348629, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public final void onExtraCallback(@NotNull List<? extends CharSequence> list, @NotNull readTimeout readtimeout, int i, int i2, @NotNull String str, @NotNull onNavigationEvent onnavigationevent, boolean z, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, int i3, @Nullable Integer num) {
        Object[] objArr = {this, list, readtimeout, Integer.valueOf(i), Integer.valueOf(i2), str, onnavigationevent, Boolean.valueOf(z), function0, function02, function03, Integer.valueOf(i3), num};
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 238677204, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, iOnWarmupCompleted, -238677197, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }
}
