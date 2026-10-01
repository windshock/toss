package o;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlinx.serialization.json.JsonObject;
import o.setPageLaunchParams;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setPageLaunchParams implements getPages {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static boolean IAuthTabCallbackDefault = false;
    private static char[] IAuthTabCallbackStub = null;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 0;
    private static int access100 = 1;
    private static boolean getInterfaceDescriptor;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent;
    private static int onTransact;
    private final Context IAuthTabCallback;
    private final Lazy asBinder;
    private final String asInterface;
    private final Lazy onExtraCallback;
    private final ReadOnlyProperty onExtraCallbackWithResult;
    private final ReadOnlyProperty onWarmupCompleted;

    public static /* synthetic */ boolean IAuthTabCallback(setPageLaunchParams setpagelaunchparams) {
        int i = 2 % 2;
        int i2 = access100 + 7;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsInterface = asInterface(setpagelaunchparams);
        int i4 = access100 + 89;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return zAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ BluetoothManager onExtraCallback(setPageLaunchParams setpagelaunchparams) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 59;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        BluetoothManager bluetoothManagerIAuthTabCallbackStub = IAuthTabCallbackStub(setpagelaunchparams);
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
        return bluetoothManagerIAuthTabCallbackStub;
    }

    public static /* synthetic */ float onExtraCallbackWithResult(setPageLaunchParams setpagelaunchparams) {
        int i = 2 % 2;
        int i2 = access100 + 11;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        float fAccess100 = access100(setpagelaunchparams);
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        return fAccess100;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = i3 | i7 | (~i2);
        int i9 = ~i3;
        int i10 = (~(i2 | i7)) | (~(i7 | i9));
        int i11 = i5 + i3 + i + ((-92689393) * i4) + (1942122663 * i6);
        int i12 = i11 * i11;
        int i13 = (((-665130586) * i5) - 357761024) + ((-674687396) * i3) + (4778405 * i8) + (i9 * (-4778405)) + ((-4778405) * i10) + ((-669908992) * i) + ((-1056047104) * i4) + ((-742522880) * i6) + ((-592117760) * i12);
        int i14 = (i5 * 1048061654) + 1366922925 + (i3 * 1048062268) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (i * 1048061961) + (i4 * 439444615) + (i6 * (-1279783457)) + (i12 * 173867008);
        int i15 = i13 + (i14 * i14 * (-1898250240));
        return i15 != 1 ? i15 != 2 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ PackageInfo onNavigationEvent(setPageLaunchParams setpagelaunchparams) {
        int i = 2 % 2;
        int i2 = access000 + 125;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            return (PackageInfo) onExtraCallbackWithResult(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, -808179779, new Object[]{setpagelaunchparams}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 808179779, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        }
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public setPageLaunchParams(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.asInterface = str;
        this.IAuthTabCallback = context.getApplicationContext();
        this.asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.facepay.log.impl.DefaultLogContextProvider$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 51;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                PackageInfo packageInfoOnNavigationEvent = setPageLaunchParams.onNavigationEvent(this.f$0);
                if (i3 == 0) {
                    int i4 = 37 / 0;
                }
                return packageInfoOnNavigationEvent;
            }
        });
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.facepay.log.impl.DefaultLogContextProvider$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() throws Throwable {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 35;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                BluetoothManager bluetoothManagerOnExtraCallback = setPageLaunchParams.onExtraCallback(this.f$0);
                int i4 = IAuthTabCallback + 33;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return bluetoothManagerOnExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.onWarmupCompleted = setAppLaunchParams.onWarmupCompleted(3000L, new Function0() { // from class: im.toss.facepay.log.impl.DefaultLogContextProvider$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 107;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Float fValueOf = Float.valueOf(setPageLaunchParams.onExtraCallbackWithResult(this.f$0));
                int i4 = onWarmupCompleted + 85;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return fValueOf;
                }
                throw null;
            }
        });
        this.onExtraCallbackWithResult = setAppLaunchParams.onWarmupCompleted(3000L, new Function0() { // from class: im.toss.facepay.log.impl.DefaultLogContextProvider$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 119;
                IAuthTabCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    Boolean.valueOf(setPageLaunchParams.IAuthTabCallback(this.f$0));
                    throw null;
                }
                Boolean boolValueOf = Boolean.valueOf(setPageLaunchParams.IAuthTabCallback(this.f$0));
                int i3 = onExtraCallbackWithResult + 25;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return boolValueOf;
                }
                obj.hashCode();
                throw null;
            }
        });
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        setPageLaunchParams setpagelaunchparams = (setPageLaunchParams) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 45;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = setpagelaunchparams.onWarmupCompleted();
        int i4 = access000 + 11;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zOnWarmupCompleted);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ PackageInfo IAuthTabCallbackDefault(setPageLaunchParams setpagelaunchparams) {
        int i = 2 % 2;
        int i2 = access100 + 53;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        PackageInfo packageInfoOnNavigationEvent = setpagelaunchparams.onNavigationEvent();
        int i4 = access000 + 27;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return packageInfoOnNavigationEvent;
        }
        throw null;
    }

    public static final /* synthetic */ String asBinder(setPageLaunchParams setpagelaunchparams) {
        int i = 2 % 2;
        int i2 = access000 + 7;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        String str = setpagelaunchparams.asInterface;
        int i5 = i3 + 79;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final /* synthetic */ float onTransact(setPageLaunchParams setpagelaunchparams) {
        int i = 2 % 2;
        int i2 = access000 + 73;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback = setpagelaunchparams.IAuthTabCallback();
        int i4 = access100 + 77;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return fIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws PackageManager.NameNotFoundException {
        setPageLaunchParams setpagelaunchparams = (setPageLaunchParams) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 37;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        PackageInfo packageInfo = setpagelaunchparams.IAuthTabCallback.getPackageManager().getPackageInfo(setpagelaunchparams.IAuthTabCallback.getPackageName(), 0);
        int i4 = access000 + 31;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return packageInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final PackageInfo onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 111;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.asBinder.getValue();
        if (i3 != 0) {
            return (PackageInfo) value;
        }
        throw null;
    }

    private final BluetoothManager onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000 + 9;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        BluetoothManager bluetoothManager = (BluetoothManager) this.onExtraCallback.getValue();
        int i3 = access100 + 97;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return bluetoothManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
    
        if ((r7 instanceof android.bluetooth.BluetoothManager) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0057, code lost:
    
        if ((r7 instanceof android.bluetooth.BluetoothManager) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0059, code lost:
    
        r1 = o.setPageLaunchParams.access000 + 5;
        o.setPageLaunchParams.access100 = r1 % 128;
        r7 = (android.bluetooth.BluetoothManager) r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final BluetoothManager IAuthTabCallbackStub(setPageLaunchParams setpagelaunchparams) throws Throwable {
        Object systemService;
        int i = 2 % 2;
        int i2 = access000 + 59;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Context context = setpagelaunchparams.IAuthTabCallback;
        if (i3 == 0) {
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-123, -122, -109, -109, -122, -120, -110, -111, -127}, 78 % KeyEvent.keyCodeFromString(""), objArr);
            systemService = context.getSystemService(((String) objArr[0]).intern());
        } else {
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-123, -122, -109, -109, -122, -120, -110, -111, -127}, KeyEvent.keyCodeFromString("") + 127, objArr2);
            systemService = context.getSystemService(((String) objArr2[0]).intern());
        }
    }

    static {
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-120, -123, -116, -117, -118, -119, -119, -120, -121, -122, -123, -124, -125, -126, -127}, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-112, -113, -114, -120, -123, -116, -117, -118, -119, -119, -120, -121, -122, -123, -124, -125, -126, -115, -122, -120, -124}, 127 - View.MeasureSpec.getSize(0), objArr2);
        addAllCommandLine<Object> addallcommandlineProperty1 = Reflection.property1(new PropertyReference1Impl(setPageLaunchParams.class, strIntern, ((String) objArr2[0]).intern(), 0));
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-120, -123, -116, -117, -118, -123, -122, -109, -109, -122, -120, -110, -111, -127}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(null, null, new byte[]{-108, -113, -114, -120, -123, -116, -117, -118, -123, -122, -109, -109, -122, -120, -110, -111, -115, -122, -120, -124}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, objArr4);
        onNavigationEvent = new addAllCommandLine[]{addallcommandlineProperty1, Reflection.property1(new PropertyReference1Impl(setPageLaunchParams.class, strIntern2, ((String) objArr4[0]).intern(), 0))};
        Companion = new IAuthTabCallback(null);
        int i = IAuthTabCallback_Parcel + 115;
        IAuthTabCallbackStubProxy = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 55;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) this.onWarmupCompleted.getValue(this, onNavigationEvent[0])).floatValue();
        int i4 = access000 + 111;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return fFloatValue;
        }
        throw null;
    }

    private static final float access100(setPageLaunchParams setpagelaunchparams) {
        Object objValueOf;
        int i = 2 % 2;
        try {
            Result.Companion companion = kotlin.Result.Companion;
            objValueOf = kotlin.Result.constructor-impl(Float.valueOf(setpagelaunchparams.asBinder()));
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            objValueOf = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.onExtraCallback(objValueOf)) {
            int i2 = access100 + 93;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            objValueOf = Float.valueOf(0.0f);
        }
        float fFloatValue = ((Number) objValueOf).floatValue();
        int i4 = access000 + 119;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return fFloatValue;
        }
        throw null;
    }

    private final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access000 + 105;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onExtraCallbackWithResult.getValue(this, onNavigationEvent[1])).booleanValue();
        int i4 = access100 + 83;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final boolean asInterface(setPageLaunchParams setpagelaunchparams) {
        Object obj;
        int i = 2 % 2;
        int i2 = access100 + 29;
        access000 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Result.Companion companion = kotlin.Result.Companion;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                obj = kotlin.Result.constructor-impl(Boolean.valueOf(((Boolean) onExtraCallbackWithResult(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, -1237350853, new Object[]{setpagelaunchparams}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1237350855, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()));
                int i3 = 73 / 0;
            } else {
                Result.Companion companion2 = kotlin.Result.Companion;
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                obj = kotlin.Result.constructor-impl(Boolean.valueOf(((Boolean) onExtraCallbackWithResult(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2, -1237350853, new Object[]{setpagelaunchparams}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1237350855, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()));
            }
        } catch (Throwable th) {
            Result.Companion companion3 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (kotlin.Result.onExtraCallback(obj)) {
            int i4 = access100 + 101;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            obj = bool;
        }
        return ((Boolean) obj).booleanValue();
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super getUseDynamicPlugins>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asBinder = 1;
        private static int onExtraCallbackWithResult;
        int label;
        private static char[] onNavigationEvent = {32567, 32555, 32561, 32554, 32566, 32550, 32625, 32635, 32629, 32624, 32638, 32580, 32582, 32627, 32519, 32619, 32568, 32634, 32628, 32618, 32626, 32581, 32633, 32617, 32636, 32616, 32639};
        private static int onExtraCallback = -1184333849;
        private static boolean onWarmupCompleted = true;
        private static boolean IAuthTabCallback = true;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = setPageLaunchParams.this.new onExtraCallbackWithResult(access13800Var);
            int i2 = onExtraCallbackWithResult + 117;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 9 / 0;
            }
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            asBinder = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super getUseDynamicPlugins> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onExtraCallbackWithResult + 13;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 41 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super getUseDynamicPlugins> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = asBinder + 39;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            String strIntern;
            int i = 2 % 2;
            int i2 = asBinder + 77;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-110, -121, -117, -112, -108, -118, -119, -118, -116, -113, -101, -112, -117, -102, -113, -111, -110, -103, -118, -104, -121, -117, -111, -113, -110, -119, -118, -105, -110, -106, -113, -111, -110, -107, -108, -109, -110, -119, -111, -113, -118, -112, -113, -114, -114, -115, -116}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i5 = i3 + 65;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            String strAsBinder = setPageLaunchParams.asBinder(setPageLaunchParams.this);
            String str2 = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            String str3 = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(str3, "");
            String str4 = setPageLaunchParams.IAuthTabCallbackDefault(setPageLaunchParams.this).packageName;
            Intrinsics.checkNotNullExpressionValue(str4, "");
            String str5 = setPageLaunchParams.IAuthTabCallbackDefault(setPageLaunchParams.this).versionName;
            if (str5 == null) {
                int i7 = onExtraCallbackWithResult + 41;
                asBinder = i7 % 128;
                if (i7 % 2 == 0) {
                    Object[] objArr2 = new Object[1];
                    a(null, null, new byte[]{-127}, 16084 >>> (ViewConfiguration.getScrollFriction() > 2.0f ? 1 : (ViewConfiguration.getScrollFriction() == 2.0f ? 0 : -1)), objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                } else {
                    Object[] objArr3 = new Object[1];
                    a(null, null, new byte[]{-127}, 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr3);
                    strIntern = ((String) objArr3[0]).intern();
                }
                str = strIntern;
            } else {
                str = str5;
            }
            float fOnTransact = setPageLaunchParams.onTransact(setPageLaunchParams.this);
            long jUptimeMillis = SystemClock.uptimeMillis();
            boolean zBooleanValue = ((Boolean) setPageLaunchParams.onExtraCallbackWithResult(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1152835339, new Object[]{setPageLaunchParams.this}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1152835338, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue();
            JsonObject jsonObject = new JsonObject(access8100.onNavigationEvent());
            Object[] objArr4 = new Object[1];
            a(null, null, new byte[]{-123, -125, -124, -125, -126}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            a(null, null, new byte[]{-120, -117, -118, -119, -120, -121, -122}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, objArr5);
            return new getUseDynamicPlugins(strAsBinder, -1L, str2, str3, str4, str, strIntern2, ((String) objArr5[0]).intern(), fOnTransact, jUptimeMillis, zBooleanValue, jsonObject);
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onNavigationEvent;
            double d = 0.0d;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    int i5 = $11 + 97;
                    $10 = i5 % 128;
                    if (i5 % i2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 77 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                            }
                            cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            i4 /= 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 77 - (ViewConfiguration.getScrollBarSize() >> 8), AndroidCharacter.getMirror('0') + 20904, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i4++;
                    }
                    i2 = 2;
                    d = 0.0d;
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            long j = 0;
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), ExpandableListView.getPackedPositionGroup(0L) + 75, 16037 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
            if (!IAuthTabCallback) {
                if (!onWarmupCompleted) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                    char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    int i6 = $11 + 5;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 64, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i8 = $11 + 125;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i10 = $10 + 61;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 0) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] % iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 63 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback6 == null) {
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 63 - (ViewConfiguration.getPressedStateDuration() >> 16), View.resolveSizeAndState(0, 0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                }
                j = 0;
            }
            objArr[0] = new String(cArr6);
        }
    }

    @Override // o.getPages
    public Object onWarmupCompleted(@NotNull access13800<? super getUseDynamicPlugins> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onExtraCallbackWithResult(null), access13800Var);
        int i2 = access000 + 87;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 30 / 0;
        }
        return objOnExtraCallback;
    }

    private final float asBinder() throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 87;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        ContentResolver contentResolver = this.IAuthTabCallback.getContentResolver();
        a(null, null, new byte[]{-119, -119, -120, -121, -122, -123, -124, -125, -126, -127, -97, -121, -120, -120, -126, -116, -119}, Color.blue(0) + 127, new Object[1]);
        float f = (Settings.System.getInt(contentResolver, ((String) r5[0]).intern(), 0) / 255.0f) * 100.0f;
        int i4 = access000 + 75;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        setPageLaunchParams setpagelaunchparams = (setPageLaunchParams) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        if (Build.VERSION.SDK_INT >= 31) {
            int i2 = access100 + 23;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            Context context = setpagelaunchparams.IAuthTabCallback;
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-100, -118, -101, -96, -96, -99, -118, -97, -98, -100, -99, -99, -100, -101, -102, -103, -115, -106, -121, -109, -125, -119, -119, -125, -104, -126, -120, -105, -106, -107, -125, -109, -126, -107, -121, -117}, Color.alpha(0) + 127, objArr2);
            if (context.checkSelfPermission(((String) objArr2[0]).intern()) != 0) {
                int i4 = access100 + 61;
                access000 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        }
        BluetoothManager bluetoothManagerOnExtraCallback = setpagelaunchparams.onExtraCallback();
        if (bluetoothManagerOnExtraCallback != null) {
            int i6 = access100 + 117;
            access000 = i6 % 128;
            if (i6 % 2 != 0) {
                bluetoothManagerOnExtraCallback.getAdapter();
                obj.hashCode();
                throw null;
            }
            BluetoothAdapter adapter = bluetoothManagerOnExtraCallback.getAdapter();
            if (adapter != null && adapter.isEnabled()) {
                int i7 = access100 + 71;
                access000 = i7 % 128;
                int i8 = i7 % 2;
                return true;
            }
        }
        return false;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int length;
        char[] cArr3;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr4 = IAuthTabCallbackStub;
        if (cArr4 != null) {
            int i5 = $10 + 7;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr4.length;
                cArr3 = new char[length];
                i2 = 1;
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i6 = $10 + 67;
                $11 = i6 % 128;
                if (i6 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr4[i2])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), TextUtils.indexOf((CharSequence) "", '0') + 78, (-16756264) - Color.rgb(0, 0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i2 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr4[i2])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 77 - Color.red(0), 20952 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i2] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i2++;
                    i3 = 2;
                }
            }
            cArr4 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onTransact)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 75 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 16037 - KeyEvent.normalizeMetaState(0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        int i7 = 1052772399;
        if (!(!getInterfaceDescriptor)) {
            int i8 = $10 + 69;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i7);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), 63 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i7 = 1052772399;
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (!IAuthTabCallbackDefault) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $10 + 11;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), 63 - TextUtils.getOffsetAfter("", 0), 12213 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr6);
    }

    public static final /* synthetic */ boolean onWarmupCompleted(setPageLaunchParams setpagelaunchparams) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return ((Boolean) onExtraCallbackWithResult(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, 1152835339, new Object[]{setpagelaunchparams}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1152835338, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue();
    }

    private static final PackageInfo IAuthTabCallbackStubProxy(setPageLaunchParams setpagelaunchparams) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (PackageInfo) onExtraCallbackWithResult(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, -808179779, new Object[]{setpagelaunchparams}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 808179779, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private final boolean IAuthTabCallbackDefault() {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return ((Boolean) onExtraCallbackWithResult(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, -1237350853, new Object[]{this}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1237350855, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue();
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallbackStub = new char[]{32561, 32545, 32554, 32564, 32555, 32551, 32557, 32566, 32544, 32528, 32562, 32560, 32529, 32747, 32746, 32533, 32559, 32550, 32556, 32569, 32567, 32749, 32547, 32558, 32527, 32518, 32534, 32519, 32524, 32523, 32572, 32525};
        onTransact = -1184333869;
        IAuthTabCallbackDefault = true;
        getInterfaceDescriptor = true;
    }
}
