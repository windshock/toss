package im.toss.tds.view.component.atom.iconbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;
import com.google.android.gms.internal.ads.zzaq;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.tosscert.ui.R;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.foundation.graphics.drawable.RoundDrawable;
import im.toss.tds.view.R;
import im.toss.tds.view.component.atom.image.TdsImageView;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppLovinSdkSettings;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Challenge;
import o.ICrashFilter;
import o.RequestBodyCompanion;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.access15300;
import o.accessgetDEFAULT_PROTOCOLScp;
import o.authParams;
import o.deprecated_authenticator;
import o.deprecated_certificatePinner;
import o.deprecated_cookieJar;
import o.deprecated_followRedirects;
import o.enableThreadsBoost;
import o.forJavaName;
import o.getBacktraceNoteBytes;
import o.getDid;
import o.getReferrerClickTimestampSeconds;
import o.getUrlokhttp;
import o.initMiniApp;
import o.initSDK;
import o.isFireOS;
import o.isMuted;
import o.isOneShot;
import o.javaName;
import o.noStore;
import o.onCrash;
import o.onInstallReferrerServiceDisconnected;
import o.onInstallReferrerSetupFinished;
import o.registerCrashCallback;
import o.reportCustomErr;
import o.setBodyokhttp;
import o.setCustomDataCallback;
import o.setHasUserConsent;
import o.setTagsokhttp;
import o.verifyClientState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class TdsIconButtonV1View extends TdsImageView implements registerCrashCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000;
    private static int[] getInterfaceDescriptor = {1372255172, 1107684367, -1297526152, -1902117772, 1634165115, -1816699068, -620255414, -307435031, -684524987, 537693346, -1851981551, -1951341207, 1301156236, -1817763846, 2092104429, 823917397, 1635906419, -2141853108};
    private onWarmupCompleted IAuthTabCallback;
    private IAuthTabCallback IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private Rally access100;
    private int asBinder;
    private final Lazy asInterface;
    private final int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private boolean onTransact;
    private final int onWarmupCompleted;

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        static {
            int[] iArr = new int[onWarmupCompleted.values().length];
            try {
                iArr[onWarmupCompleted.Fill.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 87;
                onExtraCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            IAuthTabCallback = iArr;
            int i3 = onExtraCallbackWithResult + 59;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsIconButtonV1View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsIconButtonV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(TdsIconButtonV1View tdsIconButtonV1View) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(tdsIconButtonV1View);
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 7;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(TdsIconButtonV1View tdsIconButtonV1View, int i, int i2, int i3, int i4, int i5, int i6, float f) {
        int i7 = 2 % 2;
        int i8 = IAuthTabCallback_Parcel + 73;
        access000 = i8 % 128;
        int i9 = i8 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(tdsIconButtonV1View, i, i2, i3, i4, i5, i6, f);
        int i10 = access000 + 115;
        IAuthTabCallback_Parcel = i10 % 128;
        if (i10 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TdsIconButtonV1View tdsIconButtonV1View, int i, int i2, int i3, int i4, int i5, int i6, float f) {
        int i7 = 2 % 2;
        int i8 = IAuthTabCallback_Parcel + 87;
        access000 = i8 % 128;
        if (i8 % 2 == 0) {
            return (Unit) onNavigationEvent(new Object[]{tdsIconButtonV1View, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Float.valueOf(f)}, zzaq.onNavigationEvent(), -746021164, 746021165, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | (~(i7 | i2)) | (~(i8 | i2));
        int i10 = ~i2;
        int i11 = (~(i10 | i3)) | (~(i8 | i3));
        int i12 = ~(i8 | i7 | i10);
        int i13 = i2 + i3 + i + ((-2109949842) * i5) + (2078889904 * i6);
        int i14 = i13 * i13;
        int i15 = ((-1963971821) * i2) + 932184064 + (61854959 * i3) + (1134570258 * i9) + (i11 * (-1134570258)) + ((-1134570258) * i12) + (1196425216 * i) + (610271232 * i5) + (922746880 * i6) + (671350784 * i14);
        int i16 = (i2 * (-573803825)) + 196542130 + (i3 * (-573802789)) + (i9 * (-518)) + (i11 * 518) + (i12 * 518) + (i * (-573803307)) + (i5 * (-843101306)) + (i6 * (-1524517520)) + (i14 * 458489856);
        if (i15 + (i16 * i16 * 64749568) == 1) {
            return onExtraCallback(objArr);
        }
        registerCrashCallback registercrashcallback = (TdsIconButtonV1View) objArr[0];
        initSDK.onNavigationEvent onnavigationevent = (initSDK.onNavigationEvent) objArr[1];
        int i17 = 2 % 2;
        int i18 = access000 + 97;
        IAuthTabCallback_Parcel = i18 % 128;
        int i19 = i18 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Object[] objArr2 = new Object[1];
        a(new int[]{-1204319606, 250880128}, KeyEvent.keyCodeFromString("") + 4, objArr2);
        getReferrerClickTimestampSeconds.onWarmupCompleted(onnavigationevent, ((String) objArr2[0]).intern(), registercrashcallback.getContentDescription());
        Unit unit = Unit.INSTANCE;
        int i20 = IAuthTabCallback_Parcel + 7;
        access000 = i20 % 128;
        int i21 = i20 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsIconButtonV1View tdsIconButtonV1View, initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = access000 + 43;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) onNavigationEvent(new Object[]{tdsIconButtonV1View, onnavigationevent}, zzaq.onNavigationEvent(), 1059206510, -1059206510, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TdsIconButtonV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        onWarmupCompleted onwarmupcompleted;
        super(context, attributeSet, i);
        String strValueOf = "";
        Intrinsics.checkNotNullParameter(context, "");
        this.asInterface = reportCustomErr.onNavigationEvent(this, onCrash.IconButton, false, (Function0) null, new Function1() { // from class: im.toss.tds.view.component.atom.iconbutton.TdsIconButtonV1View$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 119;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    TdsIconButtonV1View.onNavigationEvent(this.f$0, (initSDK.onNavigationEvent) obj);
                    throw null;
                }
                Unit unitOnNavigationEvent = TdsIconButtonV1View.onNavigationEvent(this.f$0, (initSDK.onNavigationEvent) obj);
                int i4 = onExtraCallback + 15;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 43 / 0;
                }
                return unitOnNavigationEvent;
            }
        }, 6, (Object) null);
        int color = ContextCompat.getColor(context, R.color.icon_button_default_icon_color);
        this.onNavigationEvent = color;
        int color2 = ContextCompat.getColor(context, R.color.icon_button_default_icon_next_color);
        this.onExtraCallbackWithResult = color2;
        this.onExtraCallback = ContextCompat.getColor(context, R.color.icon_button_default_background_color);
        this.onWarmupCompleted = ContextCompat.getColor(context, R.color.icon_button_default_background_next_color);
        this.onTransact = true;
        this.IAuthTabCallback = onWarmupCompleted.None;
        this.IAuthTabCallbackDefault = IAuthTabCallback.Size16;
        this.IAuthTabCallbackStub = color2;
        this.asBinder = color;
        setClickable(true);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TdsIconButtonV1View);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int i3 = access000 + 37;
                IAuthTabCallback_Parcel = i3 % 128;
                if (i3 % 2 == 0) {
                    typedArrayObtainStyledAttributes.getIndex(i2);
                    int i4 = R.styleable.TdsIconButtonV1View_size;
                    throw null;
                }
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.TdsIconButtonV1View_size) {
                    int i5 = IAuthTabCallback_Parcel + 115;
                    access000 = i5 % 128;
                    int i6 = i5 % 2;
                    setIconSize(((IAuthTabCallback[]) IAuthTabCallback.getEntries().toArray(new IAuthTabCallback[0]))[typedArrayObtainStyledAttributes.getInt(index, 0)]);
                } else {
                    if (index == R.styleable.TdsIconButtonV1View_withBackground) {
                        int i7 = IAuthTabCallback_Parcel + 27;
                        access000 = i7 % 128;
                        int i8 = i7 % 2;
                        if (typedArrayObtainStyledAttributes.getBoolean(index, false)) {
                            onwarmupcompleted = onWarmupCompleted.Fill;
                            int i9 = 2 % 2;
                        } else {
                            onwarmupcompleted = onWarmupCompleted.None;
                        }
                        this.IAuthTabCallback = onwarmupcompleted;
                    } else if (index == R.styleable.TdsIconButtonV1View_backgroundType) {
                        int i10 = access000 + 43;
                        IAuthTabCallback_Parcel = i10 % 128;
                        int i11 = i10 % 2;
                        this.IAuthTabCallback = (onWarmupCompleted) onWarmupCompleted.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0));
                    } else if (index == R.styleable.TdsIconButtonV1View_iconColor) {
                        int i12 = IAuthTabCallback_Parcel + 25;
                        access000 = i12 % 128;
                        int i13 = i12 % 2;
                        color = typedArrayObtainStyledAttributes.getColor(index, this.onNavigationEvent);
                        int i14 = IAuthTabCallback_Parcel + 7;
                        access000 = i14 % 128;
                        if (i14 % 2 != 0) {
                        }
                    } else if (index == R.styleable.TdsIconButtonV1View_iconUrl) {
                        int i15 = IAuthTabCallback_Parcel + 71;
                        access000 = i15 % 128;
                        int i16 = i15 % 2;
                        strValueOf = String.valueOf(typedArrayObtainStyledAttributes.getString(index));
                    } else if (index == R.styleable.TdsIconButtonV1View_enableIconColorEffect) {
                        z = typedArrayObtainStyledAttributes.getBoolean(index, true);
                    }
                }
                int i17 = 2 % 2;
            }
            typedArrayObtainStyledAttributes.recycle();
            setIconColor(color);
            setBackground$default(this, this.IAuthTabCallback, 0, 2, (Object) null);
            setIcon(strValueOf, z);
        }
    }

    public /* bridge */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        int i4 = access000 + 39;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }

    public /* synthetic */ initSDK IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 33;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsCallback();
        }
        ICustomTabsCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Set<String> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
            throw null;
        }
        Set<String> setIAuthTabCallbackStub = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        int i3 = access000 + 71;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return setIAuthTabCallbackStub;
    }

    public /* bridge */ initSDK IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        initSDK initsdkIAuthTabCallbackStubProxy = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
        int i4 = IAuthTabCallback_Parcel + 101;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return initsdkIAuthTabCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 85;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        }
        super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        throw null;
    }

    public /* bridge */ enableThreadsBoost.onNavigationEvent access000() {
        int i = 2 % 2;
        int i2 = access000 + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        enableThreadsBoost.onNavigationEvent onnavigationeventAccess000 = super/*o.setDeviceId*/.access000();
        int i4 = IAuthTabCallback_Parcel + 75;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventAccess000;
    }

    public /* bridge */ boolean access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 51;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess100 = super/*o.initSDK*/.access100();
        int i4 = IAuthTabCallback_Parcel + 59;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return zAccess100;
    }

    public /* bridge */ Function1<ICrashFilter, Boolean> asBinder() {
        Function1<ICrashFilter, Boolean> function1AsBinder;
        int i = 2 % 2;
        int i2 = access000 + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            function1AsBinder = super/*o.MonitorCrashConfig*/.asBinder();
            int i3 = 70 / 0;
        } else {
            function1AsBinder = super/*o.MonitorCrashConfig*/.asBinder();
        }
        int i4 = access000 + 53;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return function1AsBinder;
    }

    public /* bridge */ boolean extraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 123;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallback = super/*o.MonitorCrashConfig*/.extraCallback();
        int i4 = access000 + 109;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zExtraCallback;
    }

    public /* bridge */ initSDK.onNavigationEvent getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = access000 + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        initSDK.onNavigationEvent interfaceDescriptor = super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
        int i4 = access000 + 47;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return interfaceDescriptor;
        }
        throw null;
    }

    public /* bridge */ initSDK.onNavigationEvent onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000 + 99;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        initSDK.onNavigationEvent onnavigationeventOnExtraCallback = super/*o.MonitorCrashConfig*/.onExtraCallback();
        int i4 = access000 + 67;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnExtraCallback;
    }

    public /* bridge */ initMiniApp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000 + 71;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp initminiappOnExtraCallbackWithResult = super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback_Parcel + 23;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return initminiappOnExtraCallbackWithResult;
    }

    public /* bridge */ enableThreadsBoost onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 17;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.MonitorCrashConfig*/.onNavigationEvent();
        }
        super/*o.MonitorCrashConfig*/.onNavigationEvent();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 97;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.setDeviceId*/.onNavigationEvent(map);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(map);
        int i3 = access000 + 31;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull ICrashFilter iCrashFilter) {
        int i = 2 % 2;
        int i2 = access000 + 61;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(iCrashFilter);
        int i4 = IAuthTabCallback_Parcel + 75;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ getDid onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 63;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.onTransact();
        }
        super/*o.MonitorCrashConfig*/.onTransact();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.onWarmupCompleted();
            throw null;
        }
        Map<String, Object> mapOnWarmupCompleted = super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        int i3 = access000 + 41;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return mapOnWarmupCompleted;
    }

    public /* bridge */ void setAsCtaButton() {
        int i = 2 % 2;
        int i2 = access000 + 59;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.initSDK*/.setAsCtaButton();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setComponentKey(@Nullable enableThreadsBoost enablethreadsboost) {
        int i = 2 % 2;
        int i2 = access000 + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setComponentKey(enablethreadsboost);
        int i4 = access000 + 49;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setCustomParam(@NotNull String str, @NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 15;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParam(str, function1);
        int i4 = IAuthTabCallback_Parcel + 99;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
    }

    public /* bridge */ void setCustomParams(@NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super/*o.MonitorCrashConfig*/.setCustomParams(function1);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = access000 + 43;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ void setEventLoggableChecker(@Nullable Function1<? super ICrashFilter, Boolean> function1) {
        int i = 2 % 2;
        int i2 = access000 + 77;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setEventLoggableChecker(function1);
        int i4 = IAuthTabCallback_Parcel + 41;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ void setMaskingWords(@NotNull Set<String> set) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMaskingWords(set);
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
    }

    public /* bridge */ void setMetadata(@NotNull getDid getdid) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super/*o.MonitorCrashConfig*/.setMetadata(getdid);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 65;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ void setTrackable(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 69;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setTrackable(z);
        int i4 = IAuthTabCallback_Parcel + 37;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsIconButtonV1View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = access000 + 23;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = IAuthTabCallback_Parcel + 103;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public setCustomDataCallback ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = access000 + 17;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback setcustomdatacallback = (setCustomDataCallback) this.asInterface.getValue();
        int i4 = access000 + 119;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return setcustomdatacallback;
        }
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        public static final IAuthTabCallback Size16 = new IAuthTabCallback("Size16", 0, 8, 8.0f);
        public static final IAuthTabCallback Size20 = new IAuthTabCallback("Size20", 1, 10, 10.0f);
        public static final IAuthTabCallback Size24 = new IAuthTabCallback("Size24", 2, 12, 14.0f);
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final int paddingDp;
        private final float radiusDp;

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = Size16;
            if (i3 != 0) {
                return new IAuthTabCallback[]{iAuthTabCallback, Size20, Size24};
            }
            IAuthTabCallback iAuthTabCallback2 = Size20;
            IAuthTabCallback iAuthTabCallback3 = Size24;
            IAuthTabCallback[] iAuthTabCallbackArr = new IAuthTabCallback[4];
            iAuthTabCallbackArr[1] = iAuthTabCallback;
            iAuthTabCallbackArr[0] = iAuthTabCallback2;
            iAuthTabCallbackArr[4] = iAuthTabCallback3;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i4 = i3 + 29;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 52 / 0;
            }
            return enumEntries;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 == 0) {
                int i4 = 55 / 0;
            }
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return iAuthTabCallbackArr;
            }
            throw null;
        }

        private IAuthTabCallback(String str, int i, int i2, float f) {
            this.paddingDp = i2;
            this.radiusDp = f;
        }

        public final int getPaddingDp() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 103;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.paddingDp;
            int i6 = i2 + 97;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final float getRadiusDp() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 59;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            float f = this.radiusDp;
            int i5 = i2 + 47;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = IAuthTabCallback + 67;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        public static final onWarmupCompleted None = new onWarmupCompleted("None", 0);
        public static final onWarmupCompleted Fill = new onWarmupCompleted("Fill", 1);
        public static final onWarmupCompleted Border = new onWarmupCompleted("Border", 2);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                onWarmupCompleted onwarmupcompleted = None;
                onWarmupCompleted onwarmupcompleted2 = Fill;
                onWarmupCompleted onwarmupcompleted3 = Border;
                onwarmupcompletedArr = new onWarmupCompleted[2];
                onwarmupcompletedArr[1] = onwarmupcompleted;
                onwarmupcompletedArr[1] = onwarmupcompleted2;
                onwarmupcompletedArr[4] = onwarmupcompleted3;
            } else {
                onwarmupcompletedArr = new onWarmupCompleted[]{None, Fill, Border};
            }
            int i4 = i3 + 91;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 != 0) {
                int i4 = 82 / 0;
            }
            int i5 = onExtraCallback + 121;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = $VALUES;
            if (i3 != 0) {
                return (onWarmupCompleted[]) onwarmupcompletedArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onNavigationEvent + 97;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(boolean z) {
        ColorStateList colorStateListValueOf;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.onTransact = z;
            int i3 = 89 / 0;
            colorStateListValueOf = !(z ^ true) ? ColorStateList.valueOf(this.asBinder) : null;
        } else {
            this.onTransact = z;
            if (z) {
            }
        }
        setImageTintList(colorStateListValueOf);
        int i4 = IAuthTabCallback_Parcel + 87;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final IAuthTabCallback asInterface() {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 49;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            iAuthTabCallback = this.IAuthTabCallbackDefault;
            int i4 = 83 / 0;
        } else {
            iAuthTabCallback = this.IAuthTabCallbackDefault;
        }
        int i5 = i2 + 125;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return iAuthTabCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setIconSize(@NotNull IAuthTabCallback iAuthTabCallback) {
        RoundDrawable roundDrawable;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 19;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.IAuthTabCallbackDefault = iAuthTabCallback;
        onWarmupCompleted(setTagsokhttp.onExtraCallbackWithResult(this, Integer.valueOf(iAuthTabCallback.getPaddingDp() << 1)));
        Drawable background = getBackground();
        if (background instanceof RoundDrawable) {
            roundDrawable = (RoundDrawable) background;
            int i4 = access000 + 79;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        } else {
            roundDrawable = null;
        }
        IAuthTabCallback(roundDrawable != null ? roundDrawable.onExtraCallbackWithResult() : this.onExtraCallback, setTagsokhttp.onExtraCallbackWithResult(this, Float.valueOf(iAuthTabCallback.getRadiusDp())), this.IAuthTabCallback);
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setIconColor(int i) {
        int iOnExtraCallbackWithResult;
        int iOnNavigationEvent;
        int i2 = 2 % 2;
        this.asBinder = i;
        setImageTintList(ColorStateList.valueOf(i));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        forJavaName forjavanameOnNavigationEvent = new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration)).onNavigationEvent(i);
        if (forjavanameOnNavigationEvent == null) {
            return;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        if (!new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration2)).IAuthTabCallback(i)) {
            iOnExtraCallbackWithResult = forjavanameOnNavigationEvent.onExtraCallbackWithResult(i, 200);
        } else {
            int i3 = access000 + 85;
            IAuthTabCallback_Parcel = i3 % 128;
            iOnExtraCallbackWithResult = i3 % 2 == 0 ? forJavaName.onNavigationEvent(forjavanameOnNavigationEvent, i, 0, 4, null) : forJavaName.onNavigationEvent(forjavanameOnNavigationEvent, i, 0, 2, null);
        }
        this.IAuthTabCallbackStub = iOnExtraCallbackWithResult;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration3 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        getUrlokhttp geturlokhttp = new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration3));
        if (geturlokhttp.IAuthTabCallback(i)) {
            int i4 = IAuthTabCallback_Parcel + 125;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                iOnNavigationEvent = geturlokhttp.onExtraCallbackWithResult(i);
                int i5 = 90 / 0;
            } else {
                iOnNavigationEvent = geturlokhttp.onExtraCallbackWithResult(i);
            }
        } else {
            iOnNavigationEvent = geturlokhttp.onNavigationEvent(i, 200);
            int i6 = access000 + 97;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
        }
        this.IAuthTabCallbackStub = iOnNavigationEvent;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getInterfaceDescriptor;
        long j = 0;
        int i4 = -1469660336;
        char c = 0;
        if (iArr3 != null) {
            int i5 = $11 + 89;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 71, 8848 - TextUtils.getCapsMode("", 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    j = 0;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getInterfaceDescriptor;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[c] = Integer.valueOf(iArr5[i7]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 72, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i7++;
                c = 0;
            }
            int i8 = $10 + 71;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 4 % 3;
            }
            iArr5 = iArr6;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i10 = $10 + 103;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 22252), 40 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 10301 - (ViewConfiguration.getLongPressTimeout() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i12++;
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 4034), '~' - AndroidCharacter.getMirror('0'), View.combineMeasuredStates(0, 0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = access000 + 109;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        int iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(this, Integer.valueOf(this.IAuthTabCallbackDefault.getPaddingDp()));
        int i6 = iOnExtraCallbackWithResult << 2;
        setPadding(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult);
        setMeasuredDimension(i6, i6);
        int i7 = access000 + 123;
        IAuthTabCallback_Parcel = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPressed(boolean z) {
        int defaultColor;
        final int alpha;
        Rally rally;
        int i = 2 % 2;
        int i2 = access000 + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.setPressed(z);
        Rally rally2 = this.access100;
        if (rally2 != null) {
            int i4 = IAuthTabCallback_Parcel + 99;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                rally2.ICustomTabsServiceStub();
                throw null;
            }
            rally2.ICustomTabsServiceStub();
        }
        if (z) {
            ColorStateList imageTintList = getImageTintList();
            final int defaultColor2 = imageTintList != null ? imageTintList.getDefaultColor() : this.asBinder;
            final int i5 = this.IAuthTabCallbackStub;
            Drawable background = getBackground();
            RoundDrawable roundDrawable = background instanceof RoundDrawable ? (RoundDrawable) background : null;
            final int alpha2 = roundDrawable != null ? roundDrawable.getAlpha() : 0;
            int i6 = this.onExtraCallback;
            Drawable background2 = getBackground();
            RoundDrawable roundDrawable2 = background2 instanceof RoundDrawable ? (RoundDrawable) background2 : null;
            final int iOnExtraCallbackWithResult = roundDrawable2 != null ? roundDrawable2.onExtraCallbackWithResult() : this.onExtraCallback;
            final int i7 = this.onWarmupCompleted;
            final int i8 = i6 >>> 24;
            rally = (Rally) isFireOS.onExtraCallbackWithResult(Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), null, Float.valueOf(0.9f), null, 5, null), Float.valueOf(0.0f), Float.valueOf(1.0f), new Function1() { // from class: im.toss.tds.view.component.atom.iconbutton.TdsIconButtonV1View$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj) {
                    int i9 = 2 % 2;
                    int i10 = IAuthTabCallback + 29;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitOnExtraCallback = TdsIconButtonV1View.onExtraCallback(this.f$0, defaultColor2, i5, iOnExtraCallbackWithResult, i7, alpha2, i8, ((Float) obj).floatValue());
                    int i12 = IAuthTabCallback + 63;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                    return unitOnExtraCallback;
                }
            }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), null, new Function0() { // from class: im.toss.tds.view.component.atom.iconbutton.TdsIconButtonV1View$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke() {
                    int i9 = 2 % 2;
                    int i10 = IAuthTabCallback + 19;
                    onExtraCallback = i10 % 128;
                    Object obj = null;
                    if (i10 % 2 != 0) {
                        TdsIconButtonV1View.IAuthTabCallback(this.f$0);
                        throw null;
                    }
                    Unit unitIAuthTabCallback = TdsIconButtonV1View.IAuthTabCallback(this.f$0);
                    int i11 = onExtraCallback + 113;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 != 0) {
                        return unitIAuthTabCallback;
                    }
                    obj.hashCode();
                    throw null;
                }
            }, 1, null), false, 1, null);
        } else {
            ColorStateList imageTintList2 = getImageTintList();
            if (imageTintList2 != null) {
                int i9 = IAuthTabCallback_Parcel + 57;
                access000 = i9 % 128;
                if (i9 % 2 != 0) {
                    imageTintList2.getDefaultColor();
                    throw null;
                }
                defaultColor = imageTintList2.getDefaultColor();
            } else {
                defaultColor = this.IAuthTabCallbackStub;
            }
            final int i10 = defaultColor;
            final int i11 = this.asBinder;
            Drawable background3 = getBackground();
            RoundDrawable roundDrawable3 = background3 instanceof RoundDrawable ? (RoundDrawable) background3 : null;
            if (roundDrawable3 != null) {
                int i12 = access000 + 107;
                IAuthTabCallback_Parcel = i12 % 128;
                int i13 = i12 % 2;
                alpha = roundDrawable3.getAlpha();
            } else {
                int i14 = this.onExtraCallback >>> 24;
                int i15 = IAuthTabCallback_Parcel + 41;
                access000 = i15 % 128;
                int i16 = i15 % 2;
                alpha = i14;
            }
            Drawable background4 = getBackground();
            RoundDrawable roundDrawable4 = background4 instanceof RoundDrawable ? (RoundDrawable) background4 : null;
            final int iOnExtraCallbackWithResult2 = roundDrawable4 != null ? roundDrawable4.onExtraCallbackWithResult() : this.onWarmupCompleted;
            final int i17 = this.onExtraCallback;
            final int i18 = 0;
            rally = (Rally) isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), null, Float.valueOf(1.0f), null, 5, null), Float.valueOf(0.0f), Float.valueOf(1.0f), new Function1() { // from class: im.toss.tds.view.component.atom.iconbutton.TdsIconButtonV1View$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj) {
                    int i19 = 2 % 2;
                    int i20 = onExtraCallbackWithResult + 85;
                    IAuthTabCallback = i20 % 128;
                    int i21 = i20 % 2;
                    Unit unitOnExtraCallbackWithResult = TdsIconButtonV1View.onExtraCallbackWithResult(this.f$0, i10, i11, iOnExtraCallbackWithResult2, i17, alpha, i18, ((Float) obj).floatValue());
                    int i22 = IAuthTabCallback + 77;
                    onExtraCallbackWithResult = i22 % 128;
                    if (i22 % 2 != 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    throw null;
                }
            }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), false, 1, null);
        }
        this.access100 = rally;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[PHI: r2
      0x008b: PHI (r2v6 android.graphics.drawable.Drawable) = (r2v5 android.graphics.drawable.Drawable), (r2v7 android.graphics.drawable.Drawable) binds: [B:26:0x0089, B:23:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(TdsIconButtonV1View tdsIconButtonV1View, int i, int i2, int i3, int i4, int i5, int i6, float f) {
        Drawable drawableMutate;
        int i7 = 2 % 2;
        if (tdsIconButtonV1View.onTransact) {
            tdsIconButtonV1View.setImageTintList(ColorStateList.valueOf(new setHasUserConsent(i, i2).IAuthTabCallback(f).intValue()));
        }
        if (onNavigationEvent.IAuthTabCallback[tdsIconButtonV1View.IAuthTabCallback.ordinal()] == 1) {
            int i8 = IAuthTabCallback_Parcel + 5;
            access000 = i8 % 128;
            int i9 = i8 % 2;
            Drawable background = tdsIconButtonV1View.getBackground();
            if (background instanceof RoundDrawable) {
                int i10 = access000 + 39;
                IAuthTabCallback_Parcel = i10 % 128;
                if (i10 % 2 == 0) {
                    roundDrawable.hashCode();
                    throw null;
                }
                roundDrawable = (RoundDrawable) background;
            }
            if (roundDrawable != null) {
                roundDrawable.IAuthTabCallback(new setHasUserConsent(i3, i4).IAuthTabCallback(f).intValue());
            }
        } else {
            Drawable background2 = tdsIconButtonV1View.getBackground();
            roundDrawable = background2 instanceof RoundDrawable ? (RoundDrawable) background2 : null;
            if (roundDrawable != null) {
                int i11 = access000 + 13;
                IAuthTabCallback_Parcel = i11 % 128;
                if (i11 % 2 == 0) {
                    drawableMutate = roundDrawable.mutate();
                    int i12 = 77 / 0;
                    if (drawableMutate != null) {
                        drawableMutate.setAlpha(i5 + ((int) ((i6 - i5) * f)));
                    }
                } else {
                    drawableMutate = roundDrawable.mutate();
                    if (drawableMutate != null) {
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(TdsIconButtonV1View tdsIconButtonV1View) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 19;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {noStore.Companion};
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        isOneShot.onExtraCallbackWithResult(tdsIconButtonV1View, (noStore) noStore.onExtraCallback.onWarmupCompleted(objArr, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 31;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, im.toss.tds.view.component.atom.iconbutton.TdsIconButtonV1View, im.toss.tds.view.component.atom.image.TdsImageView] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Drawable drawableMutate;
        ?? r0 = (TdsIconButtonV1View) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int iIntValue3 = ((Number) objArr[3]).intValue();
        int iIntValue4 = ((Number) objArr[4]).intValue();
        int iIntValue5 = ((Number) objArr[5]).intValue();
        int iIntValue6 = ((Number) objArr[6]).intValue();
        float fFloatValue = ((Number) objArr[7]).floatValue();
        int i = 2 % 2;
        int i2 = access000 + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            if (((TdsIconButtonV1View) r0).onTransact) {
                r0.setImageTintList(ColorStateList.valueOf(new setHasUserConsent(iIntValue, iIntValue2).IAuthTabCallback(fFloatValue).intValue()));
            }
            if (onNavigationEvent.IAuthTabCallback[((TdsIconButtonV1View) r0).IAuthTabCallback.ordinal()] == 1) {
                Drawable background = r0.getBackground();
                roundDrawable = background instanceof RoundDrawable ? (RoundDrawable) background : null;
                if (roundDrawable != null) {
                    roundDrawable.IAuthTabCallback(new setHasUserConsent(iIntValue3, iIntValue4).IAuthTabCallback(fFloatValue).intValue());
                }
            } else {
                Drawable background2 = r0.getBackground();
                roundDrawable = background2 instanceof RoundDrawable ? (RoundDrawable) background2 : null;
                if (roundDrawable != null && (drawableMutate = roundDrawable.mutate()) != null) {
                    drawableMutate.setAlpha(iIntValue5 + ((int) ((iIntValue6 - iIntValue5) * fFloatValue)));
                }
            }
            Unit unit = Unit.INSTANCE;
            int i3 = access000 + 59;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        boolean z = ((TdsIconButtonV1View) r0).onTransact;
        roundDrawable.hashCode();
        throw null;
    }

    public static /* synthetic */ void setIcon$default(TdsIconButtonV1View tdsIconButtonV1View, int i, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIcon");
        }
        int i4 = IAuthTabCallback_Parcel;
        int i5 = i4 + 101;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 2) != 0) {
            int i7 = i4 + 41;
            access000 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i4 + 115;
            access000 = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        }
        tdsIconButtonV1View.setIcon(i, z);
    }

    public final void setIcon(int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 103;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult(z);
        setImageResource(i);
        int i5 = access000 + 49;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
    }

    public static /* synthetic */ void setIcon$default(TdsIconButtonV1View tdsIconButtonV1View, Drawable drawable, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 73;
        int i4 = i3 % 128;
        access000 = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIcon");
        }
        int i5 = i4 + 123;
        int i6 = i5 % 128;
        IAuthTabCallback_Parcel = i6;
        int i7 = i5 % 2;
        if ((i & 2) != 0) {
            int i8 = i6 + 85;
            access000 = i8 % 128;
            z = i8 % 2 == 0;
        }
        tdsIconButtonV1View.setIcon(drawable, z);
    }

    public final void setIcon(@Nullable Drawable drawable, boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(z);
            setImageDrawable(drawable);
            int i3 = 93 / 0;
        } else {
            onExtraCallbackWithResult(z);
            setImageDrawable(drawable);
        }
    }

    public static /* synthetic */ void setIcon$default(TdsIconButtonV1View tdsIconButtonV1View, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIcon");
        }
        int i3 = IAuthTabCallback_Parcel + 57;
        int i4 = i3 % 128;
        access000 = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 31;
            IAuthTabCallback_Parcel = i6 % 128;
            z = i6 % 2 != 0;
        }
        tdsIconButtonV1View.setIcon(str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0034 A[PHI: r12 r13
      0x0034: PHI (r12v6 java.lang.String) = (r12v2 java.lang.String), (r12v8 java.lang.String) binds: [B:8:0x0059, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r13v5 int) = (r13v3 int), (r13v8 int) binds: [B:8:0x0059, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setIcon(@NotNull String str, boolean z) {
        String string;
        int paddingDp;
        int i = 2 % 2;
        int i2 = access000 + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult(z);
            string = StringsKt.trim(str).toString();
            paddingDp = this.IAuthTabCallbackDefault.getPaddingDp() >> setTagsokhttp.onExtraCallbackWithResult(this, 3);
            if (!StringsKt.isBlank(string)) {
                int i3 = paddingDp;
                TdsImageView.setImageWithSize$default(this, string, i3, i3, null, null, 24, null);
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult(z);
            string = StringsKt.trim(str).toString();
            paddingDp = this.IAuthTabCallbackDefault.getPaddingDp() * setTagsokhttp.onExtraCallbackWithResult(this, 2);
            if (!StringsKt.isBlank(string)) {
            }
        }
        int i4 = access000 + 81;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void setIcon$default(TdsIconButtonV1View tdsIconButtonV1View, deprecated_followRedirects deprecated_followredirects, boolean z, int i, Object obj) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIcon");
        }
        if ((i & 2) != 0) {
            int i3 = access000;
            int i4 = i3 + 39;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 121;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        }
        tdsIconButtonV1View.setIcon(deprecated_followredirects, z);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setIcon(@NotNull deprecated_followRedirects deprecated_followredirects, boolean z) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = access000 + 115;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
        if (deprecated_followredirects instanceof deprecated_cookieJar) {
            setIcon(((deprecated_cookieJar) deprecated_followredirects).onExtraCallbackWithResult(getContext()), z);
            return;
        }
        if (deprecated_followredirects instanceof accessgetDEFAULT_PROTOCOLScp) {
            int i4 = access000 + 53;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            setIcon(((accessgetDEFAULT_PROTOCOLScp) deprecated_followredirects).onNavigationEvent(), z);
            return;
        }
        if (!(deprecated_followredirects instanceof verifyClientState)) {
            throw new NoWhenBranchMatchedException();
        }
        setIcon(deprecated_authenticator.onWarmupCompleted((verifyClientState) deprecated_followredirects, getContext()), z);
        int i6 = IAuthTabCallback_Parcel + 111;
        access000 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 24 / 0;
        }
    }

    public static /* synthetic */ void setBackground$default(TdsIconButtonV1View tdsIconButtonV1View, boolean z, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = access000;
        int i5 = i4 + 15;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBackground");
        }
        if ((i2 & 2) != 0) {
            int i7 = i4 + 81;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            i = tdsIconButtonV1View.onExtraCallback;
            if (i8 == 0) {
                int i9 = 31 / 0;
            }
        }
        tdsIconButtonV1View.setBackground(z, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final void setBackground(boolean z, int i) {
        onWarmupCompleted onwarmupcompleted;
        int i2 = 2 % 2;
        if (z) {
            int i3 = access000 + 41;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            onwarmupcompleted = onWarmupCompleted.Fill;
        } else {
            onwarmupcompleted = onWarmupCompleted.None;
            int i5 = IAuthTabCallback_Parcel + 61;
            access000 = i5 % 128;
            int i6 = i5 % 2;
        }
        this.IAuthTabCallback = onwarmupcompleted;
        IAuthTabCallback(i, setTagsokhttp.onExtraCallbackWithResult(this, Float.valueOf(this.IAuthTabCallbackDefault.getRadiusDp())), this.IAuthTabCallback);
    }

    public static /* synthetic */ void setBackground$default(TdsIconButtonV1View tdsIconButtonV1View, onWarmupCompleted onwarmupcompleted, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel;
        int i5 = i4 + 57;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBackground");
        }
        if ((i2 & 2) != 0) {
            int i6 = i4 + 107;
            access000 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = tdsIconButtonV1View.onExtraCallback;
                throw null;
            }
            i = tdsIconButtonV1View.onExtraCallback;
        }
        tdsIconButtonV1View.setBackground(onwarmupcompleted, i);
        int i8 = IAuthTabCallback_Parcel + 61;
        access000 = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setBackground(@NotNull onWarmupCompleted onwarmupcompleted, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 9;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            this.IAuthTabCallback = onwarmupcompleted;
            IAuthTabCallback(i, setTagsokhttp.onExtraCallbackWithResult(this, Float.valueOf(this.IAuthTabCallbackDefault.getRadiusDp())), onwarmupcompleted);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.IAuthTabCallback = onwarmupcompleted;
        IAuthTabCallback(i, setTagsokhttp.onExtraCallbackWithResult(this, Float.valueOf(this.IAuthTabCallbackDefault.getRadiusDp())), onwarmupcompleted);
        int i4 = access000 + 59;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(int i, float f, onWarmupCompleted onwarmupcompleted) {
        int i2 = 2 % 2;
        RoundDrawable roundDrawable = new RoundDrawable(i, f, 0, false, 12, null);
        if (onwarmupcompleted != onWarmupCompleted.Fill) {
            roundDrawable.mutate().setAlpha(0);
            int i3 = access000 + 115;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        }
        setBackground(roundDrawable);
        if (onwarmupcompleted == onWarmupCompleted.Border) {
            RoundDrawable roundDrawable2 = new RoundDrawable(RequestBodyCompanion.onNavigationEvent(this, authParams.BorderDefault), f, 0, false, 12, null);
            roundDrawable2.onNavigationEvent(Paint.Style.STROKE);
            javaName javanameOnWarmupCompleted = Challenge.IAuthTabCallback.onWarmupCompleted();
            Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), "");
            roundDrawable2.onWarmupCompleted(getBacktraceNoteBytes.onExtraCallback(javanameOnWarmupCompleted.onWarmupCompleted(r13)));
            setForeground(roundDrawable2);
        }
        int i5 = IAuthTabCallback_Parcel + 15;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 33;
        IAuthTabCallback_Parcel = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            boolean z = getDrawable() instanceof BitmapDrawable;
            obj.hashCode();
            throw null;
        }
        Drawable drawable = getDrawable();
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable != null) {
            int i4 = access000 + 51;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                bitmapDrawable.getBitmap();
                throw null;
            }
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (bitmap != null) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i, true);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "");
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                setImageDrawable(new BitmapDrawable(resources, bitmapCreateScaledBitmap));
            }
        }
        int i5 = access000 + 81;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super/*android.view.View*/.onDraw(canvas);
        onInstallReferrerServiceDisconnected.onExtraCallbackWithResult(onInstallReferrerServiceDisconnected.onExtraCallback, this, canvas, (SizeF) null, 4, (Object) null);
        int i4 = IAuthTabCallback_Parcel + 33;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean performClick() {
        int i = 2 % 2;
        int i2 = access000 + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, this, (initMiniApp) null, 3, (Object) null);
        } else {
            onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, this, (initMiniApp) null, 2, (Object) null);
        }
        boolean zPerformClick = super/*android.view.View*/.performClick();
        int i3 = access000 + 93;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return zPerformClick;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = access000 + 85;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (onInstallReferrerServiceDisconnected.onExtraCallback.onExtraCallback(this, motionEvent)) {
            int i4 = IAuthTabCallback_Parcel + 71;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        boolean zOnTouchEvent = super/*android.view.View*/.onTouchEvent(motionEvent);
        int i6 = IAuthTabCallback_Parcel + 67;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        return zOnTouchEvent;
    }

    private static final Unit onExtraCallback(TdsIconButtonV1View tdsIconButtonV1View, initSDK.onNavigationEvent onnavigationevent) {
        return (Unit) onNavigationEvent(new Object[]{tdsIconButtonV1View, onnavigationevent}, zzaq.onNavigationEvent(), 1059206510, -1059206510, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
    }

    private static final Unit onNavigationEvent(TdsIconButtonV1View tdsIconButtonV1View, int i, int i2, int i3, int i4, int i5, int i6, float f) {
        return (Unit) onNavigationEvent(new Object[]{tdsIconButtonV1View, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Float.valueOf(f)}, zzaq.onNavigationEvent(), -746021164, 746021165, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
    }
}
