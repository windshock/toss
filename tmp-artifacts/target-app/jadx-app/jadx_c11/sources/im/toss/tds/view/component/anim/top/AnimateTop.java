package im.toss.tds.view.component.anim.top;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.features.tosscert.ui.R;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.R;
import im.toss.tds.view.component.anim.text.AnimateText;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinSdkSettings;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ICrashFilter;
import o.IOOMCallback;
import o.TrackGroupExternalSyntheticLambda0;
import o.access15300;
import o.deprecated_certificatePinner;
import o.enableThreadsBoost;
import o.getDid;
import o.getReferrerClickTimestampSeconds;
import o.getUrlokhttp;
import o.getWriteTimeoutokhttp;
import o.initMiniApp;
import o.initSDK;
import o.isFireOS;
import o.isMuted;
import o.onInstallReferrerServiceDisconnected;
import o.pxToDp;
import o.registerCrashCallback;
import o.reportCustomErr;
import o.response;
import o.runOnUiThreadDelayed;
import o.setBodyokhttp;
import o.setCustomDataCallback;
import o.setTagsokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AnimateTop extends FrameLayout implements registerCrashCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] getInterfaceDescriptor = {27356, 27477, 27479, 27503};
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;
    private int IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private runOnUiThreadDelayed IAuthTabCallbackStubProxy;
    private float IAuthTabCallback_Parcel;
    private int access000;
    private float access100;
    private final Lazy asBinder;
    private final Lazy asInterface;
    private int onExtraCallback;
    private int onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private int onTransact;
    private boolean onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimateTop(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimateTop(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(AnimateTop animateTop) {
        int i = 2 % 2;
        int i2 = readTypedObject + 1;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(animateTop);
        }
        onExtraCallbackWithResult(animateTop);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AnimateTop animateTop, float f) {
        int i = 2 % 2;
        int i2 = readTypedObject + 125;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(animateTop, f);
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        int i5 = writeTypedObject + 119;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AnimateTop animateTop, initSDK.onNavigationEvent onnavigationevent) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 35;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(animateTop, onnavigationevent);
        int i4 = writeTypedObject + 75;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 51;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnMessageChannelReady = onMessageChannelReady();
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        return unitOnMessageChannelReady;
    }

    public static /* synthetic */ Unit asInterface() {
        int i = 2 % 2;
        int i2 = readTypedObject + 95;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            return (Unit) onNavigationEvent(2129409314, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, new Object[0], iOnNavigationEvent, iOnNavigationEvent3, -2129409314);
        }
        int iOnNavigationEvent4 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent5 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent6 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AnimateText onExtraCallback(AnimateTop animateTop) {
        int i = 2 % 2;
        int i2 = readTypedObject + 7;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            return (AnimateText) onNavigationEvent(142487307, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, new Object[]{animateTop}, iOnNavigationEvent, iOnNavigationEvent3, -142487305);
        }
        int iOnNavigationEvent4 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent5 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent6 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int i3 = 68 / 0;
        return (AnimateText) onNavigationEvent(142487307, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent5, new Object[]{animateTop}, iOnNavigationEvent4, iOnNavigationEvent6, -142487305);
    }

    public static /* synthetic */ AnimateText onNavigationEvent(AnimateTop animateTop) {
        int i = 2 % 2;
        int i2 = readTypedObject + 95;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        AnimateText animateText = (AnimateText) onNavigationEvent(1859466419, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, new Object[]{animateTop}, iOnNavigationEvent, iOnNavigationEvent3, -1859466416);
        int i4 = writeTypedObject + 85;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return animateText;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = (~(i7 | i)) | (~(i7 | i8));
        int i10 = ~i;
        int i11 = (~(i4 | i10 | i6)) | i9;
        int i12 = ~(i8 | i10);
        int i13 = i + i6 + i3 + ((-1228711472) * i5) + ((-141981132) * i2);
        int i14 = i13 * i13;
        int i15 = (((-639131287) * i) - 2072313856) + (1118068377 * i6) + (i11 * (-1268883816)) + ((-1757199664) * i9) + ((-1268883816) * i12) + ((-1908015104) * i3) + ((-287309824) * i5) + ((-1573388288) * i2) + ((-2138374144) * i14);
        int i16 = ((i * (-646461497)) - 273503129) + (i6 * (-646460521)) + (i11 * 488) + (i9 * (-976)) + (i12 * 488) + (i3 * (-646461009)) + (i5 * 1623110960) + (i2 * (-2035004020)) + (i14 * 33882112);
        int i17 = i15 + (i16 * i16 * (-1051394048));
        if (i17 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i17 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i17 != 3) {
            return i17 != 4 ? onExtraCallback(objArr) : onNavigationEvent(objArr);
        }
        AnimateTop animateTop = (AnimateTop) objArr[0];
        int i18 = 2 % 2;
        int i19 = writeTypedObject + 105;
        readTypedObject = i19 % 128;
        int i20 = i19 % 2;
        AnimateText animateText = (AnimateText) animateTop.findViewById(R.id.title);
        int i21 = readTypedObject + 77;
        writeTypedObject = i21 % 128;
        int i22 = i21 % 2;
        return animateText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateTop(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws NoWhenBranchMatchedException {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.asInterface = reportCustomErr.onNavigationEvent(this, IOOMCallback.Top, false, (Function0) null, new Function1() { // from class: im.toss.tds.view.component.anim.top.AnimateTop$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 25;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                AnimateTop animateTop = this.f$0;
                initSDK.onNavigationEvent onnavigationevent = (initSDK.onNavigationEvent) obj;
                if (i4 != 0) {
                    return AnimateTop.IAuthTabCallback(animateTop, onnavigationevent);
                }
                AnimateTop.IAuthTabCallback(animateTop, onnavigationevent);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 4, (Object) null);
        this.asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.view.component.anim.top.AnimateTop$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 107;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                AnimateText animateTextOnNavigationEvent = AnimateTop.onNavigationEvent(this.f$0);
                int i5 = IAuthTabCallback + 85;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return animateTextOnNavigationEvent;
            }
        });
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.view.component.anim.top.AnimateTop$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 51;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                AnimateText animateTextOnExtraCallback = AnimateTop.onExtraCallback(this.f$0);
                int i5 = onNavigationEvent + 97;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 90 / 0;
                }
                return animateTextOnExtraCallback;
            }
        });
        int iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(this, 24);
        this.onExtraCallback = iOnExtraCallbackWithResult;
        this.access000 = iOnExtraCallbackWithResult;
        this.onExtraCallbackWithResult = iOnExtraCallbackWithResult;
        this.onNavigationEvent = true;
        View.inflate(context, R.layout.animate_top, this);
        onWarmupCompleted(context, attributeSet);
        setWillNotDraw(false);
        this.onTransact = context.getResources().getDimensionPixelSize(R.dimen.animate_top_interval_margin);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AnimateTop(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = writeTypedObject + 101;
            readTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 % 3;
            } else {
                int i5 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = writeTypedObject + 7;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public /* bridge */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 113;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        }
        super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ initSDK IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = readTypedObject + 53;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback typedObject = readTypedObject();
        int i4 = writeTypedObject + 111;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return typedObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Set<String> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = readTypedObject + 45;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Set<String> setIAuthTabCallbackStub = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        int i4 = writeTypedObject + 61;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return setIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ initSDK IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 73;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        initSDK initsdkIAuthTabCallbackStubProxy = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
        int i4 = readTypedObject + 41;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return initsdkIAuthTabCallbackStubProxy;
    }

    public /* bridge */ boolean IAuthTabCallback_Parcel() {
        boolean zIAuthTabCallback_Parcel;
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            zIAuthTabCallback_Parcel = super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
            int i3 = 41 / 0;
        } else {
            zIAuthTabCallback_Parcel = super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        }
        int i4 = readTypedObject + 37;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback_Parcel;
    }

    public /* bridge */ enableThreadsBoost.onNavigationEvent access000() {
        int i = 2 % 2;
        int i2 = readTypedObject + 93;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        enableThreadsBoost.onNavigationEvent onnavigationeventAccess000 = super/*o.setDeviceId*/.access000();
        int i4 = writeTypedObject + 99;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventAccess000;
    }

    public /* bridge */ boolean access100() {
        boolean zAccess100;
        int i = 2 % 2;
        int i2 = writeTypedObject + 59;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            zAccess100 = super/*o.initSDK*/.access100();
            int i3 = 99 / 0;
        } else {
            zAccess100 = super/*o.initSDK*/.access100();
        }
        int i4 = readTypedObject + 13;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return zAccess100;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Function1<ICrashFilter, Boolean> asBinder() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 119;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Function1<ICrashFilter, Boolean> function1AsBinder = super/*o.MonitorCrashConfig*/.asBinder();
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        return function1AsBinder;
    }

    public /* bridge */ boolean extraCallback() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 119;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.extraCallback();
        }
        super/*o.MonitorCrashConfig*/.extraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ initSDK.onNavigationEvent getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 5;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
            throw null;
        }
        initSDK.onNavigationEvent interfaceDescriptor = super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
        int i3 = writeTypedObject + 91;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return interfaceDescriptor;
    }

    public /* bridge */ initSDK.onNavigationEvent onExtraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 113;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        initSDK.onNavigationEvent onnavigationeventOnExtraCallback = super/*o.MonitorCrashConfig*/.onExtraCallback();
        int i4 = writeTypedObject + 97;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationeventOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ initMiniApp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
            throw null;
        }
        initMiniApp initminiappOnExtraCallbackWithResult = super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
        int i3 = readTypedObject + 71;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return initminiappOnExtraCallbackWithResult;
    }

    public /* bridge */ enableThreadsBoost onNavigationEvent() {
        enableThreadsBoost enablethreadsboostOnNavigationEvent;
        int i = 2 % 2;
        int i2 = readTypedObject + 101;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            enablethreadsboostOnNavigationEvent = super/*o.MonitorCrashConfig*/.onNavigationEvent();
            int i3 = 64 / 0;
        } else {
            enablethreadsboostOnNavigationEvent = super/*o.MonitorCrashConfig*/.onNavigationEvent();
        }
        int i4 = readTypedObject + 45;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return enablethreadsboostOnNavigationEvent;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = readTypedObject + 35;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(map);
        int i4 = readTypedObject + 17;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull ICrashFilter iCrashFilter) {
        int i = 2 % 2;
        int i2 = readTypedObject + 95;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.setDeviceId*/.onNavigationEvent(iCrashFilter);
        }
        super/*o.setDeviceId*/.onNavigationEvent(iCrashFilter);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ getDid onTransact() {
        int i = 2 % 2;
        int i2 = readTypedObject + 77;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.MonitorCrashConfig*/.onTransact();
        }
        super/*o.MonitorCrashConfig*/.onTransact();
        throw null;
    }

    public /* bridge */ Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 51;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        }
        super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        throw null;
    }

    public /* bridge */ void setAsCtaButton() {
        int i = 2 % 2;
        int i2 = readTypedObject + 5;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super/*o.initSDK*/.setAsCtaButton();
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ void setComponentKey(@Nullable enableThreadsBoost enablethreadsboost) {
        int i = 2 % 2;
        int i2 = readTypedObject + 1;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setComponentKey(enablethreadsboost);
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
    }

    public /* bridge */ void setCustomParam(@NotNull String str, @NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = readTypedObject + 85;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParam(str, function1);
        int i4 = readTypedObject + 119;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setCustomParams(@NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 29;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParams(function1);
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
    }

    public /* bridge */ void setEventLoggableChecker(@Nullable Function1<? super ICrashFilter, Boolean> function1) {
        int i = 2 % 2;
        int i2 = readTypedObject + 121;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setEventLoggableChecker(function1);
        int i4 = writeTypedObject + 21;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setMaskingWords(@NotNull Set<String> set) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 89;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMaskingWords(set);
        int i4 = readTypedObject + 9;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setMetadata(@NotNull getDid getdid) {
        int i = 2 % 2;
        int i2 = readTypedObject + 67;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMetadata(getdid);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setTrackable(boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 39;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setTrackable(z);
        int i4 = readTypedObject + 25;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public setCustomDataCallback readTypedObject() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setCustomDataCallback setcustomdatacallback = (setCustomDataCallback) this.asInterface.getValue();
        int i3 = readTypedObject + 79;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 89 / 0;
        }
        return setcustomdatacallback;
    }

    private static final Unit onNavigationEvent(AnimateTop animateTop, initSDK.onNavigationEvent onnavigationevent) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (!animateTop.onNavigationEvent) {
            int i2 = readTypedObject + 33;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                listCreateListBuilder.add(animateTop.writeTypedObject().onActivityResized());
                int i3 = 83 / 0;
            } else {
                listCreateListBuilder.add(animateTop.writeTypedObject().onActivityResized());
            }
            int i4 = writeTypedObject + 67;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        listCreateListBuilder.add(animateTop.onPostMessage().onActivityResized());
        if (animateTop.onNavigationEvent) {
            listCreateListBuilder.add(animateTop.writeTypedObject().onActivityResized());
        }
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 173, 3}, true, new byte[]{1, 1, 1, 0}, objArr);
        getReferrerClickTimestampSeconds.onExtraCallbackWithResult(onnavigationevent, ((String) objArr[0]).intern(), listBuild);
        return Unit.INSTANCE;
    }

    public final AnimateText onPostMessage() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 33;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.asBinder.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        AnimateText animateText = (AnimateText) value;
        int i4 = readTypedObject + 63;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return animateText;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AnimateTop animateTop = (AnimateTop) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 35;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        AnimateText animateText = (AnimateText) animateTop.findViewById(R.id.sub_title);
        int i4 = writeTypedObject + 13;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return animateText;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AnimateText writeTypedObject() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 9;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Object value = this.IAuthTabCallbackDefault.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object value2 = this.IAuthTabCallbackDefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        AnimateText animateText = (AnimateText) value2;
        int i3 = readTypedObject + 117;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return animateText;
    }

    private final void onWarmupCompleted(Context context, AttributeSet attributeSet) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        IAuthTabCallback iAuthTabCallback = IAuthTabCallback.Size22;
        onExtraCallback onextracallback = onExtraCallback.Size17;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iOnUnminimized = new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration)).onUnminimized();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        int iICustomTabsCallbackStubProxy = new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration2)).ICustomTabsCallbackStubProxy();
        response responseVarOnExtraCallback = response.Bold;
        response responseVarOnExtraCallback2 = response.Regular;
        if (attributeSet != null) {
            int i2 = readTypedObject + 79;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AnimateTop);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == R.styleable.AnimateTop_titleSize) {
                    iAuthTabCallback = IAuthTabCallback.values()[typedArrayObtainStyledAttributes.getInt(index, 0)];
                } else if (index == R.styleable.AnimateTop_subtitleSize) {
                    onextracallback = onExtraCallback.values()[typedArrayObtainStyledAttributes.getInt(index, 0)];
                } else {
                    int i5 = R.styleable.AnimateTop_titleTextColor;
                    if (index == i5) {
                        Context context4 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "");
                        Configuration configuration3 = context4.getResources().getConfiguration();
                        Intrinsics.checkNotNullExpressionValue(configuration3, "");
                        iOnUnminimized = typedArrayObtainStyledAttributes.getColor(i5, new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration3)).onUnminimized());
                        int i6 = writeTypedObject + 75;
                        readTypedObject = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        int i8 = R.styleable.AnimateTop_subtitleTextColor;
                        if (index == i8) {
                            Context context5 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context5, "");
                            Configuration configuration4 = context5.getResources().getConfiguration();
                            Intrinsics.checkNotNullExpressionValue(configuration4, "");
                            iICustomTabsCallbackStubProxy = typedArrayObtainStyledAttributes.getColor(i8, new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration4)).ICustomTabsCallbackStubProxy());
                        } else if (index == R.styleable.AnimateTop_titleFontFamily) {
                            int i9 = readTypedObject + 23;
                            writeTypedObject = i9 % 128;
                            if (i9 % 2 == 0) {
                                responseVarOnExtraCallback = response.Companion.onExtraCallback(typedArrayObtainStyledAttributes.getResourceId(index, responseVarOnExtraCallback.getResId()));
                                int i10 = 59 / 0;
                            } else {
                                responseVarOnExtraCallback = response.Companion.onExtraCallback(typedArrayObtainStyledAttributes.getResourceId(index, responseVarOnExtraCallback.getResId()));
                            }
                        } else if (index == R.styleable.AnimateTop_subtitleFontFamily) {
                            responseVarOnExtraCallback2 = response.Companion.onExtraCallback(typedArrayObtainStyledAttributes.getResourceId(index, responseVarOnExtraCallback2.getResId()));
                        }
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        setTitleSize(iAuthTabCallback);
        setTitleTextColor(iOnUnminimized);
        setTitleFont(responseVarOnExtraCallback);
        setSubtitleSize(onextracallback);
        setSubtitleTextColor(iICustomTabsCallbackStubProxy);
        setSubtitleFont(responseVarOnExtraCallback2);
        int i11 = readTypedObject + 45;
        writeTypedObject = i11 % 128;
        int i12 = i11 % 2;
    }

    public final void setTitleSize(@NotNull IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = writeTypedObject + 93;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            onPostMessage().setTextSize$tds_view_release(iAuthTabCallback);
            int i3 = 26 / 0;
        } else {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            onPostMessage().setTextSize$tds_view_release(iAuthTabCallback);
        }
        int i4 = writeTypedObject + 117;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setSubtitleSize(@NotNull onExtraCallback onextracallback) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = writeTypedObject + 59;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            writeTypedObject().setTextSize$tds_view_release(onextracallback);
        } else {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            writeTypedObject().setTextSize$tds_view_release(onextracallback);
            int i3 = 68 / 0;
        }
    }

    public final void setTitleTextColor(int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 97;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        onPostMessage().setTextColor(i);
        int i5 = readTypedObject + 73;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void setSubtitleTextColor(int i) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 53;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        writeTypedObject().setTextColor(i);
        int i5 = readTypedObject + 95;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
    }

    public final void setTitleFont(@NotNull response responseVar) {
        int i = 2 % 2;
        int i2 = readTypedObject + 93;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(responseVar, "");
        onPostMessage().setFont(responseVar);
        int i4 = readTypedObject + 61;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
    }

    public final void setSubtitleFont(@NotNull response responseVar) {
        int i = 2 % 2;
        int i2 = readTypedObject + 45;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(responseVar, "");
            writeTypedObject().setFont(responseVar);
        } else {
            Intrinsics.checkNotNullParameter(responseVar, "");
            writeTypedObject().setFont(responseVar);
            throw null;
        }
    }

    public final void setUpperGap(int i) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 7;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        this.access000 = varyMatches.IAuthTabCallback(this, Integer.valueOf(i));
        int i5 = writeTypedObject + 85;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setLowerGap(int i) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 85;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallbackWithResult = varyMatches.IAuthTabCallback(this, Integer.valueOf(i));
        int i5 = writeTypedObject + 29;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setMaxTitleSize(float f) {
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onPostMessage().setMaxTextSize(f);
        if (i3 == 0) {
            throw null;
        }
    }

    public final void setMaxSubtitleSize(float f) {
        int i = 2 % 2;
        int i2 = readTypedObject + 27;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject().setMaxTextSize(f);
        int i4 = writeTypedObject + 57;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setInterMargin(int i) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 75;
        int i4 = i3 % 128;
        writeTypedObject = i4;
        int i5 = i3 % 2;
        this.onTransact = i;
        int i6 = i4 + 103;
        readTypedObject = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setInnerPadding(int i) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 125;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        int iIAuthTabCallback = varyMatches.IAuthTabCallback(this, Integer.valueOf(i));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.container);
        if (viewGroup != null) {
            int i5 = readTypedObject + 1;
            writeTypedObject = i5 % 128;
            if (i5 % 2 != 0) {
                viewGroup.setPadding(iIAuthTabCallback, iIAuthTabCallback, iIAuthTabCallback, iIAuthTabCallback);
            } else {
                viewGroup.setPadding(iIAuthTabCallback, iIAuthTabCallback, iIAuthTabCallback, iIAuthTabCallback);
                throw null;
            }
        }
        this.onExtraCallback = iIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallback(AnimateTop animateTop, getWriteTimeoutokhttp getwritetimeoutokhttp, getWriteTimeoutokhttp getwritetimeoutokhttp2, getWriteTimeoutokhttp getwritetimeoutokhttp3, boolean z, boolean z2, int i, Object obj) {
        boolean z3;
        boolean z4;
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 99;
        int i4 = i3 % 128;
        readTypedObject = i4;
        getWriteTimeoutokhttp getwritetimeoutokhttp4 = (i3 % 2 == 0 && (i & 1) != 0) ? null : getwritetimeoutokhttp;
        getWriteTimeoutokhttp getwritetimeoutokhttp5 = (i & 4) != 0 ? null : getwritetimeoutokhttp3;
        if ((i & 8) != 0) {
            int i5 = i4 + 69;
            writeTypedObject = i5 % 128;
            z3 = i5 % 2 == 0;
        } else {
            z3 = z;
        }
        if ((i & 16) != 0) {
            int i6 = writeTypedObject + 63;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
            z4 = false;
        } else {
            z4 = z2;
        }
        animateTop.onWarmupCompleted(getwritetimeoutokhttp4, getwritetimeoutokhttp2, getwritetimeoutokhttp5, z3, z4);
    }

    public final void onWarmupCompleted(@Nullable getWriteTimeoutokhttp getwritetimeoutokhttp, @NotNull getWriteTimeoutokhttp getwritetimeoutokhttp2, @Nullable getWriteTimeoutokhttp getwritetimeoutokhttp3, boolean z, boolean z2) {
        AnimateText animateTextOnPostMessage;
        AnimateText animateTextWriteTypedObject;
        getWriteTimeoutokhttp getwritetimeoutokhttp4;
        Function0 function0;
        int i;
        int i2 = 2 % 2;
        getWriteTimeoutokhttp getwritetimeoutokhttp5 = getwritetimeoutokhttp2;
        Intrinsics.checkNotNullParameter(getwritetimeoutokhttp5, "");
        if (getwritetimeoutokhttp != null) {
            int i3 = writeTypedObject + 97;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            this.onNavigationEvent = false;
            animateTextOnPostMessage = writeTypedObject();
            animateTextWriteTypedObject = onPostMessage();
            getwritetimeoutokhttp4 = getwritetimeoutokhttp5;
            getwritetimeoutokhttp5 = getwritetimeoutokhttp;
        } else {
            if (getwritetimeoutokhttp3 == null) {
                this.onNavigationEvent = true;
                onExtraCallbackWithResult(this, onPostMessage(), getwritetimeoutokhttp2, null, 4, null);
                AnimateText.IAuthTabCallback(writeTypedObject(), (Function0) null, 1, (Object) null);
                requestLayout();
                return;
            }
            this.onNavigationEvent = true;
            animateTextOnPostMessage = onPostMessage();
            animateTextWriteTypedObject = writeTypedObject();
            getwritetimeoutokhttp4 = getwritetimeoutokhttp3;
        }
        AnimateText animateText = animateTextWriteTypedObject;
        AnimateText animateText2 = animateTextOnPostMessage;
        boolean z3 = getwritetimeoutokhttp5 instanceof getWriteTimeoutokhttp.onNavigationEvent;
        if (z3) {
            int i5 = writeTypedObject + 107;
            readTypedObject = i5 % 128;
            if (i5 % 2 != 0) {
                boolean z4 = getwritetimeoutokhttp4 instanceof getWriteTimeoutokhttp.onNavigationEvent;
                throw null;
            }
            if (getwritetimeoutokhttp4 instanceof getWriteTimeoutokhttp.onNavigationEvent) {
                onNavigationEvent(animateText2, (getWriteTimeoutokhttp.onNavigationEvent) getwritetimeoutokhttp5, animateText, (getWriteTimeoutokhttp.onNavigationEvent) getwritetimeoutokhttp4);
            }
        }
        this.onWarmupCompleted = z3;
        if (!z) {
            Object[] objArr = {this, animateText2, getwritetimeoutokhttp5, new Function0() { // from class: im.toss.tds.view.component.anim.top.AnimateTop$$ExternalSyntheticLambda4
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 117;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitIAuthTabCallback = AnimateTop.IAuthTabCallback(this.f$0);
                    int i9 = onExtraCallbackWithResult + 63;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    return unitIAuthTabCallback;
                }
            }};
            int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            onNavigationEvent(-614025903, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 614025904);
            int i6 = writeTypedObject + 23;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
        }
        if (!z2) {
            int i8 = readTypedObject + 53;
            writeTypedObject = i8 % 128;
            if (i8 % 2 == 0) {
                function0 = null;
                i = 2;
            } else {
                function0 = null;
                i = 4;
            }
            onExtraCallbackWithResult(this, animateText, getwritetimeoutokhttp4, function0, i, null);
        }
        requestLayout();
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = getInterfaceDescriptor;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 35283), 36 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 14240 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i7 = $11 + 73;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = $11 + 89;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 66 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), Color.argb(0, 0, 0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    int i12 = $11 + 85;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), Color.green(0) + 29, 17657 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 49468), 70 - (Process.myTid() >> 22), 12487 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i15 = $11 + 9;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i17 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i17, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i17);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static final Unit onExtraCallbackWithResult(AnimateTop animateTop) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 47;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        animateTop.onActivityLayout();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void onExtraCallbackWithResult(AnimateTop animateTop, AnimateText animateText, getWriteTimeoutokhttp getwritetimeoutokhttp, Function0 function0, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 59;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: im.toss.tds.view.component.anim.top.AnimateTop$$ExternalSyntheticLambda5
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallback + 49;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 != 0) {
                        return AnimateTop.ICustomTabsCallback();
                    }
                    AnimateTop.ICustomTabsCallback();
                    throw null;
                }
            };
            int i5 = readTypedObject + 21;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
        }
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onNavigationEvent(-614025903, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, new Object[]{animateTop, animateText, getwritetimeoutokhttp, function0}, iOnNavigationEvent, iOnNavigationEvent3, 614025904);
    }

    private static final Unit onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = readTypedObject + 69;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 37;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws NoWhenBranchMatchedException {
        AnimateTop animateTop = (AnimateTop) objArr[0];
        AnimateText animateText = (AnimateText) objArr[1];
        getWriteTimeoutokhttp getwritetimeoutokhttp = (getWriteTimeoutokhttp) objArr[2];
        Function0 function0 = (Function0) objArr[3];
        int i = 2 % 2;
        int i2 = readTypedObject + 21;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        getWriteTimeoutokhttp.onExtraCallback(967777866, iIAuthTabCallback2, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback, new Object[]{getwritetimeoutokhttp, function0}, iIAuthTabCallback3, -967777865);
        getwritetimeoutokhttp.onWarmupCompleted(animateTop);
        Object obj = null;
        if (getwritetimeoutokhttp instanceof getWriteTimeoutokhttp.onWarmupCompleted) {
            int i4 = writeTypedObject + 105;
            readTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                animateText.onWarmupCompleted((getWriteTimeoutokhttp.onWarmupCompleted) getwritetimeoutokhttp);
                return null;
            }
            animateText.onWarmupCompleted((getWriteTimeoutokhttp.onWarmupCompleted) getwritetimeoutokhttp);
            obj.hashCode();
            throw null;
        }
        if (getwritetimeoutokhttp instanceof getWriteTimeoutokhttp.onNavigationEvent) {
            animateText.onExtraCallback((getWriteTimeoutokhttp.onNavigationEvent) getwritetimeoutokhttp);
            return null;
        }
        if (!(getwritetimeoutokhttp instanceof getWriteTimeoutokhttp.IAuthTabCallback)) {
            throw new NoWhenBranchMatchedException();
        }
        animateText.onExtraCallbackWithResult((getWriteTimeoutokhttp.IAuthTabCallback) getwritetimeoutokhttp);
        return null;
    }

    private final void onNavigationEvent(AnimateText animateText, getWriteTimeoutokhttp.onNavigationEvent onnavigationevent, AnimateText animateText2, getWriteTimeoutokhttp.onNavigationEvent onnavigationevent2) {
        int i = 2 % 2;
        Iterator it = CollectionsKt.plus(AnimateText.onExtraCallbackWithResult(animateText, onnavigationevent.extraCallbackWithResult(), onnavigationevent.IAuthTabCallback_Parcel(), (String) null, onnavigationevent.ICustomTabsCallback(), 4, (Object) null), AnimateText.onExtraCallbackWithResult(animateText2, onnavigationevent2.extraCallbackWithResult(), onnavigationevent2.IAuthTabCallback_Parcel(), (String) null, onnavigationevent2.ICustomTabsCallback(), 4, (Object) null)).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int iIntValue = ((Number) ((Pair) it.next()).getSecond()).intValue();
        int i2 = writeTypedObject + 3;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 % 4;
        }
        while (it.hasNext()) {
            int i4 = writeTypedObject + 115;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            int iIntValue2 = ((Number) ((Pair) it.next()).getSecond()).intValue();
            if (iIntValue < iIntValue2) {
                int i6 = writeTypedObject + 113;
                readTypedObject = i6 % 128;
                int i7 = i6 % 2;
                iIntValue = iIntValue2;
            }
        }
        int iMax = Math.max(iIntValue, Math.max(onnavigationevent.access000(), onnavigationevent2.access000()));
        onnavigationevent.onExtraCallback(iMax);
        onnavigationevent2.onExtraCallback(iMax);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onActivityLayout() {
        AnimateText animateTextWriteTypedObject;
        float fICustomTabsCallbackStubProxy;
        int i = 2 % 2;
        if (this.onNavigationEvent) {
            int i2 = readTypedObject + 125;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                onPostMessage();
                throw null;
            }
            animateTextWriteTypedObject = onPostMessage();
        } else {
            animateTextWriteTypedObject = writeTypedObject();
        }
        CharSequence charSequenceOnMinimized = animateTextWriteTypedObject.onMinimized();
        CharSequence charSequence = "";
        if (charSequenceOnMinimized == null) {
            int i3 = writeTypedObject + 65;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            charSequenceOnMinimized = "";
        }
        float fIAuthTabCallback = AnimateText.IAuthTabCallback(animateTextWriteTypedObject, charSequenceOnMinimized, 0, 2, null);
        CharSequence charSequenceOnMessageChannelReady = animateTextWriteTypedObject.onMessageChannelReady();
        if (charSequenceOnMessageChannelReady == null) {
            int i5 = writeTypedObject + 99;
            readTypedObject = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 7 / 0;
            }
        } else {
            charSequence = charSequenceOnMessageChannelReady;
        }
        float fIAuthTabCallback2 = AnimateText.IAuthTabCallback(animateTextWriteTypedObject, charSequence, 0, 2, null);
        float f = 0.0f;
        if (this.onWarmupCompleted) {
            int i7 = readTypedObject + 71;
            writeTypedObject = i7 % 128;
            int i8 = i7 % 2;
            if (animateTextWriteTypedObject.ICustomTabsCallbackStubProxy() == 0) {
                int i9 = writeTypedObject + 91;
                readTypedObject = i9 % 128;
                int i10 = i9 % 2;
                fICustomTabsCallbackStubProxy = 0.0f;
            } else {
                fICustomTabsCallbackStubProxy = animateTextWriteTypedObject.ICustomTabsCallbackStubProxy() - fIAuthTabCallback;
            }
        }
        this.IAuthTabCallback_Parcel = animateTextWriteTypedObject.getMeasuredHeight();
        if (animateTextWriteTypedObject.onMessageChannelReady() != null) {
            if (!this.onWarmupCompleted) {
                this.access100 = fIAuthTabCallback - fIAuthTabCallback2;
            }
            onNavigationEvent(-898371968, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this, Float.valueOf(this.access100), Float.valueOf(fICustomTabsCallbackStubProxy)}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 898371972);
            return;
        }
        int i11 = writeTypedObject + 55;
        readTypedObject = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 42 / 0;
            if (this.onWarmupCompleted) {
                f = fICustomTabsCallbackStubProxy;
            }
        } else if (this.onWarmupCompleted) {
        }
        this.access100 = f;
        invalidate();
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final AnimateTop animateTop = (AnimateTop) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        float fFloatValue2 = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = readTypedObject + 47;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = animateTop.IAuthTabCallbackStubProxy;
        if (runonuithreaddelayed != null) {
            int i5 = i3 + 19;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
            runonuithreaddelayed.onNavigationEvent();
            int i7 = readTypedObject + 45;
            writeTypedObject = i7 % 128;
            int i8 = i7 % 2;
        }
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        Object[] objArr2 = {(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2), new Function1() { // from class: im.toss.tds.view.component.anim.top.AnimateTop$$ExternalSyntheticLambda6
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i9 = 2 % 2;
                int i10 = onWarmupCompleted + 47;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                Unit unitIAuthTabCallback = AnimateTop.IAuthTabCallback(this.f$0, ((Float) obj).floatValue());
                int i12 = onWarmupCompleted + 93;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                return unitIAuthTabCallback;
            }
        }, null, 8, null};
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted(animateTop, iAuthTabCallback, CollectionsKt.listOf((Rally) RallysKt.onWarmupCompleted(new Object[]{animateTop, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, objArr2, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3832, null);
        isFireOS.onExtraCallbackWithResult(runonuithreaddelayedOnWarmupCompleted, false, 1, null);
        animateTop.IAuthTabCallbackStubProxy = runonuithreaddelayedOnWarmupCompleted;
        return null;
    }

    private static final Unit onExtraCallbackWithResult(AnimateTop animateTop, float f) {
        Unit unit;
        int i = 2 % 2;
        int i2 = readTypedObject + 107;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            animateTop.access100 = f;
            animateTop.invalidate();
            unit = Unit.INSTANCE;
            int i3 = 7 / 0;
        } else {
            animateTop.access100 = f;
            animateTop.invalidate();
            unit = Unit.INSTANCE;
        }
        int i4 = writeTypedObject + 121;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        boolean z;
        int i3 = 2 % 2;
        super.onMeasure(i, i2);
        AnimateText animateTextOnPostMessage = this.onNavigationEvent ? onPostMessage() : writeTypedObject();
        if (animateTextOnPostMessage.onMessageChannelReady() == null) {
            z = true;
            int i4 = writeTypedObject + 1;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = writeTypedObject + 59;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        float fIAuthTabCallback = 0.0f;
        if (this.onWarmupCompleted && !animateTextOnPostMessage.onUnminimized().isEmpty()) {
            int i8 = writeTypedObject + 53;
            readTypedObject = i8 % 128;
            int i9 = i8 % 2;
            if (!animateTextOnPostMessage.ICustomTabsCallbackDefault()) {
                this.IAuthTabCallback_Parcel = animateTextOnPostMessage.getMeasuredHeight();
                CharSequence charSequenceOnMinimized = animateTextOnPostMessage.onMinimized() == null ? animateTextOnPostMessage.onUnminimized().get(0) : animateTextOnPostMessage.onMinimized();
                if (animateTextOnPostMessage.ICustomTabsCallbackStubProxy() != 0) {
                    int i10 = readTypedObject + 25;
                    writeTypedObject = i10 % 128;
                    int i11 = i10 % 2;
                    float fICustomTabsCallbackStubProxy = animateTextOnPostMessage.ICustomTabsCallbackStubProxy();
                    if (charSequenceOnMinimized == null) {
                        int i12 = readTypedObject + 29;
                        writeTypedObject = i12 % 128;
                        int i13 = i12 % 2;
                        charSequenceOnMinimized = "";
                    }
                    fIAuthTabCallback = fICustomTabsCallbackStubProxy - AnimateText.IAuthTabCallback(animateTextOnPostMessage, charSequenceOnMinimized, 0, 2, null);
                }
                this.access100 = fIAuthTabCallback;
            }
        } else if (z) {
            int i14 = writeTypedObject + 57;
            readTypedObject = i14 % 128;
            int i15 = i14 % 2;
            this.IAuthTabCallback_Parcel = animateTextOnPostMessage.getMeasuredHeight();
            this.access100 = 0.0f;
        }
        this.IAuthTabCallbackStub = Integer.max(onPostMessage().getMeasuredHeight(), this.IAuthTabCallbackStub);
        int iMax = Integer.max(writeTypedObject().getMeasuredHeight(), this.IAuthTabCallback);
        this.IAuthTabCallback = iMax;
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.access000 + this.IAuthTabCallbackStub + this.onTransact + iMax + this.onExtraCallbackWithResult);
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        AnimateText animateTextWriteTypedObject;
        AnimateText animateTextOnPostMessage;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(this.onExtraCallback, this.access000);
        if (this.onNavigationEvent) {
            int i2 = writeTypedObject + 81;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            animateTextWriteTypedObject = onPostMessage();
        } else {
            animateTextWriteTypedObject = writeTypedObject();
            int i4 = writeTypedObject + 81;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        if (this.onNavigationEvent) {
            int i6 = readTypedObject + 31;
            writeTypedObject = i6 % 128;
            if (i6 % 2 == 0) {
                writeTypedObject();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            animateTextOnPostMessage = writeTypedObject();
        } else {
            animateTextOnPostMessage = onPostMessage();
        }
        animateTextWriteTypedObject.draw(canvas);
        canvas.translate(0.0f, (this.IAuthTabCallback_Parcel + this.onTransact) - this.access100);
        animateTextOnPostMessage.draw(canvas);
        canvas.restore();
        int i7 = readTypedObject + 31;
        writeTypedObject = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 45 / 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 1;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(canvas, "");
            super.dispatchDraw(canvas);
            onInstallReferrerServiceDisconnected.onExtraCallbackWithResult(onInstallReferrerServiceDisconnected.onExtraCallback, this, canvas, (SizeF) null, 4, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(canvas, "");
            super.dispatchDraw(canvas);
            onInstallReferrerServiceDisconnected.onExtraCallbackWithResult(onInstallReferrerServiceDisconnected.onExtraCallback, this, canvas, (SizeF) null, 4, (Object) null);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        int i = 2 % 2;
        if (onInstallReferrerServiceDisconnected.onExtraCallback.onExtraCallback(this, motionEvent)) {
            int i2 = writeTypedObject + 65;
            readTypedObject = i2 % 128;
            return i2 % 2 == 0;
        }
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        int i3 = readTypedObject + 109;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return zOnTouchEvent;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 47;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 9;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public final void extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = readTypedObject + 1;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            onMinimized();
            onPostMessage().extraCallbackWithResult();
            writeTypedObject().extraCallbackWithResult();
            invalidate();
            int i3 = 53 / 0;
            return;
        }
        onMinimized();
        onPostMessage().extraCallbackWithResult();
        writeTypedObject().extraCallbackWithResult();
        invalidate();
    }

    private final void onMinimized() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 37;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackStub = 0;
        this.IAuthTabCallback = 0;
        runOnUiThreadDelayed runonuithreaddelayed = this.IAuthTabCallbackStubProxy;
        if (runonuithreaddelayed != null) {
            int i5 = i3 + 115;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            runonuithreaddelayed.onNavigationEvent();
            if (i6 == 0) {
                int i7 = 73 / 0;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        onPostMessage().ICustomTabsCallbackStub();
        writeTypedObject().ICustomTabsCallbackStub();
        runOnUiThreadDelayed runonuithreaddelayed = this.IAuthTabCallbackStubProxy;
        if (runonuithreaddelayed != null) {
            int i2 = writeTypedObject + 45;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                runonuithreaddelayed.onNavigationEvent();
            } else {
                runonuithreaddelayed.onNavigationEvent();
                throw null;
            }
        }
        super.onDetachedFromWindow();
        int i3 = readTypedObject + 85;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        public static final IAuthTabCallback Size22 = new IAuthTabCallback("Size22", 0);
        public static final IAuthTabCallback Size28 = new IAuthTabCallback("Size28", 1);
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 95;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {Size22, Size28};
            int i5 = i2 + 91;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return iAuthTabCallbackArr;
            }
            throw null;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i5 = i3 + 39;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 == 0) {
                throw null;
            }
            int i4 = onExtraCallback + 5;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return iAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i3 = onWarmupCompleted + 121;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return iAuthTabCallbackArr;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = IAuthTabCallback + 11;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final onExtraCallback Size17 = new onExtraCallback("Size17", 0);
        public static final onExtraCallback Size15 = new onExtraCallback("Size15", 1);
        public static final onExtraCallback Size13 = new onExtraCallback("Size13", 2);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 43;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallback[] onextracallbackArr = {Size17, Size15, Size13};
            int i5 = i2 + 89;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i4 = i3 + 121;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return enumEntries;
            }
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = onExtraCallback + 65;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = $VALUES;
            if (i3 == 0) {
                return (onExtraCallback[]) onextracallbackArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onExtraCallbackWithResult + 99;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }

    private static final Unit onActivityResized() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (Unit) onNavigationEvent(2129409314, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, new Object[0], iOnNavigationEvent, iOnNavigationEvent3, -2129409314);
    }

    private final void onExtraCallbackWithResult(AnimateText animateText, getWriteTimeoutokhttp getwritetimeoutokhttp, Function0<Unit> function0) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onNavigationEvent(-614025903, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this, animateText, getwritetimeoutokhttp, function0}, iOnNavigationEvent, iOnNavigationEvent3, 614025904);
    }

    private final void onNavigationEvent(float f, float f2) {
        Object[] objArr = {this, Float.valueOf(f), Float.valueOf(f2)};
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onNavigationEvent(-898371968, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 898371972);
    }

    private static final AnimateText onWarmupCompleted(AnimateTop animateTop) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (AnimateText) onNavigationEvent(142487307, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, new Object[]{animateTop}, iOnNavigationEvent, iOnNavigationEvent3, -142487305);
    }

    private static final AnimateText IAuthTabCallbackStub(AnimateTop animateTop) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (AnimateText) onNavigationEvent(1859466419, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, new Object[]{animateTop}, iOnNavigationEvent, iOnNavigationEvent3, -1859466416);
    }
}
