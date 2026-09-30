package o;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;
import im.toss.securities.core.router.spec.TossSecRoute;
import im.toss.tosssecurities.tracker.v1.SecuritiesLogV1;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import o.DiskLruCacheEditornewSink11;
import o.DiskLruCacheEntry;
import o.deprecated_address;
import o.findResAndMsg;
import o.getKekid;
import o.q8a;
import o.q_;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q8a {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100;
    public static final q8a onNavigationEvent = new q8a();
    private static final Lazy IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.widget.common.log.WidgetTracker$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return q8a.onTransact();
            }
            q8a.onTransact();
            throw null;
        }
    });
    private static final Lazy onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.widget.common.log.WidgetTracker$$ExternalSyntheticLambda1
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            findResAndMsg findresandmsgOnExtraCallback = q8a.onExtraCallback();
            if (i3 != 0) {
                int i4 = 38 / 0;
            }
            return findresandmsgOnExtraCallback;
        }
    });
    private static final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.widget.common.log.WidgetTracker$$ExternalSyntheticLambda2
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                q8a.onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            deprecated_address deprecated_addressVarOnNavigationEvent = q8a.onNavigationEvent();
            int i3 = onExtraCallback + 113;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 21 / 0;
            }
            return deprecated_addressVarOnNavigationEvent;
        }
    });
    private static final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.widget.common.log.WidgetTracker$$ExternalSyntheticLambda3
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            DiskLruCacheEntry diskLruCacheEntryOnWarmupCompleted = q8a.onWarmupCompleted();
            int i4 = onExtraCallback + 107;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return diskLruCacheEntryOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });
    private static final Lazy IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.widget.common.log.WidgetTracker$$ExternalSyntheticLambda4
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return q8a.onExtraCallbackWithResult();
            }
            q8a.onExtraCallbackWithResult();
            throw null;
        }
    });
    private static final Lazy onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.widget.common.log.WidgetTracker$$ExternalSyntheticLambda5
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return q8a.IAuthTabCallback();
            }
            q8a.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });
    private static final Map<Integer, Boolean> onTransact = new LinkedHashMap();
    private static final jni_YGNodeStyleGetFlexBasisJNI IAuthTabCallbackDefault = jni_YGNodeStyleGetFlexGrowJNI.IAuthTabCallback(false, 1, (Object) null);
    public static final int onExtraCallbackWithResult = 8;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = q8a.this.onExtraCallbackWithResult(0, (access13800<? super Boolean>) this);
            int i4 = onExtraCallback + 51;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = q8a.this.onNavigationEvent(0, false, (access13800<? super Unit>) this);
            int i4 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    public static /* synthetic */ DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            access100();
            throw null;
        }
        DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallbackAccess100 = access100();
        int i3 = IAuthTabCallbackStubProxy + 121;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return iAuthTabCallbackAccess100;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {Integer.valueOf(iIntValue), str, str2, str3};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        int iOnExtraCallback3 = getKekid.onExtraCallback();
        if (i3 == 0) {
            return (Unit) onWarmupCompleted(getKekid.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, objArr2, 1525272994, iOnExtraCallback2, -1525272989);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findResAndMsg onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = getKekid.onExtraCallback();
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            int iOnExtraCallback3 = getKekid.onExtraCallback();
            return (findResAndMsg) onWarmupCompleted(getKekid.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, new Object[0], -428571135, iOnExtraCallback2, 428571135);
        }
        int iOnExtraCallback4 = getKekid.onExtraCallback();
        int iOnExtraCallback5 = getKekid.onExtraCallback();
        int iOnExtraCallback6 = getKekid.onExtraCallback();
        int i3 = 78 / 0;
        return (findResAndMsg) onWarmupCompleted(getKekid.onExtraCallback(), iOnExtraCallback6, iOnExtraCallback4, new Object[0], -428571135, iOnExtraCallback5, 428571135);
    }

    public static /* synthetic */ q_ onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = getKekid.onExtraCallback();
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            int iOnExtraCallback3 = getKekid.onExtraCallback();
            return (q_) onWarmupCompleted(getKekid.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, new Object[0], -481514326, iOnExtraCallback2, 481514327);
        }
        int iOnExtraCallback4 = getKekid.onExtraCallback();
        int iOnExtraCallback5 = getKekid.onExtraCallback();
        int iOnExtraCallback6 = getKekid.onExtraCallback();
        throw null;
    }

    public static /* synthetic */ deprecated_address onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCallback();
        }
        extraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AppSetIdAndScope1 onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1IAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        int i4 = IAuthTabCallbackStubProxy + 115;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return appSetIdAndScope1IAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = i7 | i6;
        int i11 = (~i10) | i9;
        int i12 = ~i6;
        int i13 = (~(i3 | i10)) | (~(i8 | i12)) | (~(i12 | i4));
        int i14 = i4 + i6 + i5 + ((-1017789379) * i2) + (461141949 * i);
        int i15 = i14 * i14;
        int i16 = ((-551480932) * i4) + 431816704 + ((-1613042074) * i6) + ((-1061561142) * i11) + (i13 * (-1616703077)) + ((-1616703077) * i9) + (1065222144 * i5) + ((-1727660032) * i2) + (1912995840 * i) + ((-1005256704) * i15);
        int i17 = ((i4 * (-1063000396)) - 360994079) + (i6 * (-1063001374)) + (i11 * (-978)) + (i13 * 489) + (i9 * 489) + (i5 * (-1063000885)) + (i2 * (-90181537)) + (i * (-1548859681)) + (i15 * 816250880);
        switch (i16 + (i17 * i17 * 1493368832)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                q8a q8aVar = (q8a) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i18 = 2 % 2;
                int i19 = IAuthTabCallback_Parcel + 65;
                IAuthTabCallbackStubProxy = i19 % 128;
                int i20 = i19 % 2;
                String strIAuthTabCallbackStub = q8aVar.IAuthTabCallbackStub(iIntValue);
                int i21 = IAuthTabCallbackStubProxy + 111;
                IAuthTabCallback_Parcel = i21 % 128;
                int i22 = i21 % 2;
                return strIAuthTabCallbackStub;
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                q8a q8aVar2 = (q8a) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i23 = 2 % 2;
                maybeUpdateAnimatable.onNavigationEvent(q8aVar2.IAuthTabCallbackStub(), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(iIntValue2, null), 3, (Object) null);
                int i24 = IAuthTabCallbackStubProxy + 99;
                IAuthTabCallback_Parcel = i24 % 128;
                int i25 = i24 % 2;
                return null;
            case 8:
                return asBinder(objArr);
            case 9:
                q8a q8aVar3 = (q8a) objArr[0];
                int iIntValue3 = ((Number) objArr[1]).intValue();
                String str = (String) objArr[2];
                boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
                int i26 = 2 % 2;
                int i27 = IAuthTabCallbackStubProxy + 25;
                IAuthTabCallback_Parcel = i27 % 128;
                int i28 = i27 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                q8aVar3.IAuthTabCallback(iIntValue3, str, zBooleanValue, "small");
                int i29 = IAuthTabCallback_Parcel + 31;
                IAuthTabCallbackStubProxy = i29 % 128;
                int i30 = i29 % 2;
                return null;
            case 10:
                return asInterface(objArr);
            case 11:
                return onTransact(objArr);
            case 12:
                return IAuthTabCallbackDefault(objArr);
            case 13:
                return access100(objArr);
            case 14:
                return access000(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ DiskLruCacheEntry onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        DiskLruCacheEntry diskLruCacheEntryExtraCallbackWithResult = extraCallbackWithResult();
        int i4 = IAuthTabCallback_Parcel + 61;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return diskLruCacheEntryExtraCallbackWithResult;
    }

    private q8a() {
    }

    public static final /* synthetic */ r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE IAuthTabCallback(q8a q8aVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            q8aVar.asBinder();
            obj.hashCode();
            throw null;
        }
        r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE r8lambdadx2qqacjxtadmiopz_luehkjmpeAsBinder = q8aVar.asBinder();
        int i3 = IAuthTabCallback_Parcel + 83;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return r8lambdadx2qqacjxtadmiopz_luehkjmpeAsBinder;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        q8a q8aVar = (q8a) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Pair<String, r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg> pairOnExtraCallback = q8aVar.onExtraCallback(iIntValue);
        int i4 = IAuthTabCallbackStubProxy + 35;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return pairOnExtraCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        q8a q8aVar = (q8a) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (i3 != 0) {
            int iOnExtraCallback = getKekid.onExtraCallback();
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            int iOnExtraCallback3 = getKekid.onExtraCallback();
            return (String) onWarmupCompleted(getKekid.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, new Object[]{q8aVar, numValueOf}, -411267963, iOnExtraCallback2, 411267965);
        }
        int iOnExtraCallback4 = getKekid.onExtraCallback();
        int iOnExtraCallback5 = getKekid.onExtraCallback();
        int iOnExtraCallback6 = getKekid.onExtraCallback();
        int i4 = 1 / 0;
        return (String) onWarmupCompleted(getKekid.onExtraCallback(), iOnExtraCallback6, iOnExtraCallback4, new Object[]{q8aVar, numValueOf}, -411267963, iOnExtraCallback5, 411267965);
    }

    public static final /* synthetic */ String IAuthTabCallbackStub(q8a q8aVar, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 103;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        String strAsBinder = q8aVar.asBinder(i);
        int i5 = IAuthTabCallback_Parcel + 91;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return strAsBinder;
    }

    public static final /* synthetic */ String onExtraCallbackWithResult(q8a q8aVar, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 17;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {q8aVar, Integer.valueOf(i)};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        String str = (String) onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, 1268501768, iOnExtraCallback2, -1268501764);
        int i5 = IAuthTabCallback_Parcel + 59;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final /* synthetic */ SharedPreferences onNavigationEvent(q8a q8aVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferences typedObject = q8aVar.readTypedObject();
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 75;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return typedObject;
    }

    public static final /* synthetic */ String onWarmupCompleted(q8a q8aVar, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 101;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return q8aVar.onNavigationEvent(i);
        }
        q8aVar.onNavigationEvent(i);
        throw null;
    }

    public static final /* synthetic */ q_ onWarmupCompleted(q8a q8aVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        q_ q_VarAsInterface = q8aVar.asInterface();
        int i4 = IAuthTabCallbackStubProxy + 87;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return q_VarAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = access100 + 35;
        access000 = i % 128;
        int i2 = i % 2;
    }

    private static final AppSetIdAndScope1 IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1OnExtraCallbackWithResult = ea10.onExtraCallbackWithResult("WidgetTracker");
        int i4 = IAuthTabCallback_Parcel + 27;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return appSetIdAndScope1OnExtraCallbackWithResult;
    }

    private final findResAndMsg IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = onWarmupCompleted.getValue();
        if (i3 != 0) {
            return (findResAndMsg) value;
        }
        int i4 = 95 / 0;
        return (findResAndMsg) value;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        GeckoHubImp geckoHubImpIAuthTabCallback;
        waitForLayout waitforlayoutOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            waitforlayoutOnExtraCallbackWithResult = isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 0, (Object) null);
        } else {
            geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            waitforlayoutOnExtraCallbackWithResult = isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null);
        }
        findResAndMsg findresandmsgOnWarmupCompleted = findRes.onWarmupCompleted(geckoHubImpIAuthTabCallback.plus(waitforlayoutOnExtraCallbackWithResult));
        int i3 = IAuthTabCallback_Parcel + 19;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 51 / 0;
        }
        return findresandmsgOnWarmupCompleted;
    }

    private final deprecated_address getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        deprecated_address deprecated_addressVar = (deprecated_address) asBinder.getValue();
        int i4 = IAuthTabCallback_Parcel + 1;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_addressVar;
    }

    private static final deprecated_address extraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        deprecated_address deprecated_addressVarShow = ((deprecated_address.onWarmupCompleted) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), Class.forName("o.deprecated_address$onWarmupCompleted"))).show();
        int i4 = IAuthTabCallback_Parcel + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_addressVarShow;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DiskLruCacheEntry diskLruCacheEntry = (DiskLruCacheEntry) asInterface.getValue();
        int i3 = IAuthTabCallbackStubProxy + 47;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return diskLruCacheEntry;
    }

    private static final DiskLruCacheEntry extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        DiskLruCacheEntry supportProgress = ((DiskLruCacheEntry.onExtraCallbackWithResult) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), DiskLruCacheEntry.onExtraCallbackWithResult.class)).setSupportProgress();
        int i4 = IAuthTabCallbackStubProxy + 31;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return supportProgress;
    }

    private final q_ asInterface() {
        q_ q_Var;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            q_Var = (q_) IAuthTabCallbackStub.getValue();
            int i3 = 56 / 0;
        } else {
            q_Var = (q_) IAuthTabCallbackStub.getValue();
        }
        int i4 = IAuthTabCallbackStubProxy + 3;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return q_Var;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        Context applicationContext = UserChoiceBillingListener.onExtraCallback.onExtraCallback().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        q_ supportProgressBarIndeterminateVisibility = ((q_.onExtraCallback) Response.onExtraCallback(applicationContext, q_.onExtraCallback.class)).setSupportProgressBarIndeterminateVisibility();
        int i4 = IAuthTabCallbackStubProxy + 107;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return supportProgressBarIndeterminateVisibility;
        }
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallback = (DiskLruCacheEditornewSink11.IAuthTabCallback) onExtraCallback.getValue();
        int i3 = IAuthTabCallbackStubProxy + 101;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    private static final DiskLruCacheEditornewSink11.IAuthTabCallback access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {onNavigationEvent};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallback2 = ((DiskLruCacheEntry) onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, -1344797860, iOnExtraCallback2, 1344797873)).IAuthTabCallback();
        int i4 = IAuthTabCallbackStubProxy + 115;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return IAuthTabCallback2;
        }
        throw null;
    }

    private final SharedPreferences readTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        IAuthTabCallback_Parcel = i2 % 128;
        SharedPreferences sharedPreferences = i2 % 2 != 0 ? UserChoiceBillingListener.onExtraCallback.onExtraCallback().getSharedPreferences("tossSecuritiesPlainStore", 1) : UserChoiceBillingListener.onExtraCallback.onExtraCallback().getSharedPreferences("tossSecuritiesPlainStore", 0);
        int i3 = IAuthTabCallback_Parcel + 113;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 95 / 0;
        }
        return sharedPreferences;
    }

    private final r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE asBinder() {
        int i = 2 % 2;
        if (getInterfaceDescriptor().IAuthTabCallback_Parcel().IAuthTabCallback() == HostnamesKt.PARENTS) {
            int i2 = IAuthTabCallback_Parcel + 69;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                return r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE.agent;
            }
            int i3 = 18 / 0;
            return r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE.agent;
        }
        r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE r8lambdadx2qqacjxtadmiopz_luehkjmpe = r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE.self;
        int i4 = IAuthTabCallback_Parcel + 85;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return r8lambdadx2qqacjxtadmiopz_luehkjmpe;
        }
        throw null;
    }

    private final String IAuthTabCallbackDefault(int i) {
        int i2 = 2 % 2;
        String str = "show_amount_" + i;
        int i3 = IAuthTabCallbackStubProxy + 101;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ String $content;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(int i, String str, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$appWidgetId = i;
            this.$content = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$appWidgetId, this.$content, access13800Var);
            int i2 = onWarmupCompleted + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 117;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 41 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = IAuthTabCallback + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            q8a q8aVar = q8a.onNavigationEvent;
            SharedPreferences sharedPreferencesOnNavigationEvent = q8a.onNavigationEvent(q8aVar);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesOnNavigationEvent, "");
            int i4 = this.$appWidgetId;
            String str = this.$content;
            SharedPreferences.Editor editorEdit = sharedPreferencesOnNavigationEvent.edit();
            editorEdit.putString(q8a.onWarmupCompleted(q8aVar, i4), str);
            editorEdit.apply();
            Unit unit = Unit.INSTANCE;
            int i5 = IAuthTabCallback + 61;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 36 / 0;
            }
            return unit;
        }
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        q8a q8aVar = (q8a) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        String str = (String) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        maybeUpdateAnimatable.onNavigationEvent(q8aVar.IAuthTabCallbackStub(), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(iIntValue, str, null), 3, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        q8a q8aVar = (q8a) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferences typedObject = q8aVar.readTypedObject();
        String strOnNavigationEvent = q8aVar.onNavigationEvent(iIntValue);
        Object obj = null;
        String string = typedObject.getString(strOnNavigationEvent, null);
        if (string == null) {
            int i4 = IAuthTabCallback_Parcel + 77;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            string = "";
        }
        int i5 = IAuthTabCallbackStubProxy + 91;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ String $content;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(int i, String str, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$appWidgetId = i;
            this.$content = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$appWidgetId, this.$content, access13800Var);
            int i2 = onExtraCallback + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            q8a q8aVar = q8a.onNavigationEvent;
            Object[] objArr = {q8aVar, Integer.valueOf(this.$appWidgetId)};
            String str = (String) q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), objArr, -1202793395, getKekid.onExtraCallback(), 1202793401);
            SharedPreferences sharedPreferencesOnNavigationEvent = q8a.onNavigationEvent(q8aVar);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesOnNavigationEvent, "");
            int i4 = this.$appWidgetId;
            String str2 = this.$content;
            SharedPreferences.Editor editorEdit = sharedPreferencesOnNavigationEvent.edit();
            editorEdit.putString(q8a.onWarmupCompleted(q8aVar, i4), str + str2);
            editorEdit.apply();
            Unit unit = Unit.INSTANCE;
            int i5 = onNavigationEvent + 117;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public final void onExtraCallback(int i, @NotNull String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        maybeUpdateAnimatable.onNavigationEvent(IAuthTabCallbackStub(), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(i, str, null), 3, (Object) null);
        int i3 = IAuthTabCallback_Parcel + 75;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ int $appWidgetId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(int i, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$appWidgetId = i;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(this.$appWidgetId, access13800Var);
            int i2 = IAuthTabCallback + 89;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return ontransact;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 67;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 70 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 61;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 15;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            q8a q8aVar = q8a.onNavigationEvent;
            SharedPreferences sharedPreferencesOnNavigationEvent = q8a.onNavigationEvent(q8aVar);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesOnNavigationEvent, "");
            int i7 = this.$appWidgetId;
            SharedPreferences.Editor editorEdit = sharedPreferencesOnNavigationEvent.edit();
            editorEdit.remove(q8a.onWarmupCompleted(q8aVar, i7));
            editorEdit.apply();
            return Unit.INSTANCE;
        }
    }

    private final void access000(int i) {
        int i2 = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(IAuthTabCallbackStub(), (CoroutineContext) null, (setRandomHost) null, new onTransact(i, null), 3, (Object) null);
        int i3 = IAuthTabCallback_Parcel + 23;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ String $name;
        final /* synthetic */ r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(int i, String str, r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$appWidgetId = i;
            this.$name = str;
            this.$type = r8lambdabrizzqzhaizmdvstl2yymmz7zsg;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$appWidgetId, this.$name, this.$type, access13800Var);
            int i2 = onWarmupCompleted + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 93;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onextracallbackwithresultCreate.invokeSuspend(unit);
            }
            onextracallbackwithresultCreate.invokeSuspend(unit);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            q8a q8aVar = q8a.onNavigationEvent;
            SharedPreferences sharedPreferencesOnNavigationEvent = q8a.onNavigationEvent(q8aVar);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesOnNavigationEvent, "");
            int i4 = this.$appWidgetId;
            String str = this.$name;
            r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg = this.$type;
            SharedPreferences.Editor editorEdit = sharedPreferencesOnNavigationEvent.edit();
            editorEdit.putString(q8a.onExtraCallbackWithResult(q8aVar, i4), str);
            editorEdit.putString(q8a.IAuthTabCallbackStub(q8aVar, i4), r8lambdabrizzqzhaizmdvstl2yymmz7zsg.name());
            editorEdit.apply();
            Unit unit = Unit.INSTANCE;
            int i5 = IAuthTabCallback + 83;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
    }

    public final void onWarmupCompleted(int i, @NotNull String str, @NotNull r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(r8lambdabrizzqzhaizmdvstl2yymmz7zsg, "");
        maybeUpdateAnimatable.onNavigationEvent(IAuthTabCallbackStub(), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(i, str, r8lambdabrizzqzhaizmdvstl2yymmz7zsg, null), 3, (Object) null);
        int i3 = IAuthTabCallback_Parcel + 119;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private final Pair<String, r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg> onExtraCallback(int i) {
        String strRemoveSurrounding;
        String strRemoveSurrounding2;
        Object obj;
        int i2 = 2 % 2;
        SharedPreferences typedObject = readTypedObject();
        Object[] objArr = {this, Integer.valueOf(i)};
        Object obj2 = null;
        String string = typedObject.getString((String) onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), objArr, 1268501768, getKekid.onExtraCallback(), -1268501764), null);
        if (string != null) {
            strRemoveSurrounding = StringsKt.removeSurrounding(string, "\"");
            int i3 = IAuthTabCallback_Parcel + 11;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
        } else {
            strRemoveSurrounding = null;
        }
        String string2 = typedObject.getString(asBinder(i), null);
        if (string2 != null) {
            int i5 = IAuthTabCallbackStubProxy + 35;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 == 0) {
                strRemoveSurrounding2 = StringsKt.removeSurrounding(string2, "\"");
            } else {
                strRemoveSurrounding2 = StringsKt.removeSurrounding(string2, "\"");
                int i6 = 28 / 0;
            }
        } else {
            strRemoveSurrounding2 = null;
        }
        if (strRemoveSurrounding2 != null) {
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.valueOf(strRemoveSurrounding2));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.onExtraCallback(obj)) {
                int i7 = IAuthTabCallback_Parcel + 9;
                IAuthTabCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
            } else {
                obj2 = obj;
            }
            obj2 = (r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg) obj2;
        }
        return getWrite.IAuthTabCallback(strRemoveSurrounding, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ int $appWidgetId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(int i, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
            this.$appWidgetId = i;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(this.$appWidgetId, access13800Var);
            int i2 = onExtraCallbackWithResult + 93;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackDefault;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 23;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 7 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 51;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            q8a q8aVar = q8a.onNavigationEvent;
            SharedPreferences sharedPreferencesOnNavigationEvent = q8a.onNavigationEvent(q8aVar);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesOnNavigationEvent, "");
            int i7 = this.$appWidgetId;
            SharedPreferences.Editor editorEdit = sharedPreferencesOnNavigationEvent.edit();
            editorEdit.remove(q8a.onExtraCallbackWithResult(q8aVar, i7));
            editorEdit.remove(q8a.IAuthTabCallbackStub(q8aVar, i7));
            editorEdit.apply();
            return Unit.INSTANCE;
        }
    }

    static final class access000 extends SuspendLambda implements Function2<SetDetectableSize, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int[] onNavigationEvent = {42481434, 1545786206, 1159676550, -1153849430, 1275748672, 1779951557, -884285903, 945254229, -984853763, 678213435, -35704484, 4840483, 111648261, 398970934, -656281972, -115414851, -1858764307, -751775447};
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ String $sectionName;
        final /* synthetic */ String $url;
        final /* synthetic */ String $widgetSize;
        final /* synthetic */ String $widgetType;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access000(String str, String str2, String str3, int i, String str4, access13800<? super access000> access13800Var) {
            super(2, access13800Var);
            this.$sectionName = str;
            this.$widgetType = str2;
            this.$widgetSize = str3;
            this.$appWidgetId = i;
            this.$url = str4;
        }

        public final Object IAuthTabCallback(SetDetectableSize setDetectableSize, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            access000 access000VarCreate = create(setDetectableSize, access13800Var);
            if (i3 == 0) {
                return access000VarCreate.invokeSuspend(Unit.INSTANCE);
            }
            access000VarCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = new access000(this.$sectionName, this.$widgetType, this.$widgetSize, this.$appWidgetId, this.$url, access13800Var);
            access000Var.L$0 = obj;
            int i2 = IAuthTabCallback + 103;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return access000Var;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            Object objIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            IAuthTabCallback = i2 % 128;
            SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                objIAuthTabCallback = IAuthTabCallback(setDetectableSize, access13800Var);
                int i3 = 20 / 0;
            } else {
                objIAuthTabCallback = IAuthTabCallback(setDetectableSize, access13800Var);
            }
            int i4 = onExtraCallback + 59;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onNavigationEvent;
            char c = '0';
            int i5 = -1469660336;
            int i6 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", c, 0, 0)), 72 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.rgb(0, 0, 0) + 16786064, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i7++;
                        c = '0';
                        i5 = -1469660336;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onNavigationEvent;
            if (iArr5 != null) {
                int i8 = $10 + 51;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i10 = 0;
                while (i10 < length3) {
                    int i11 = $11 + 103;
                    $10 = i11 % 128;
                    if (i11 % i3 != 0) {
                        try {
                            Object[] objArr3 = new Object[1];
                            objArr3[i6] = Integer.valueOf(iArr5[i10]);
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", i6, i6), 72 - TextUtils.indexOf("", "", i6), View.resolveSize(i6, i6) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr6[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        try {
                            Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), (ViewConfiguration.getEdgeSlop() >> 16) + 72, ImageFormat.getBitsPerPixel(0) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr6[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    i10++;
                    i3 = 2;
                    i6 = 0;
                }
                i2 = i6;
                iArr5 = iArr6;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr5, i2, iArr4, i2, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i12 = $10 + 33;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i14 = 0;
                for (int i15 = 16; i14 < i15; i15 = 16) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 22252), 39 - (ViewConfiguration.getJumpTapTimeout() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i14++;
                }
                int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - View.resolveSizeAndState(0, 0, 0)), KeyEvent.keyCodeFromString("") + 78, 7397 - TextUtils.indexOf((CharSequence) "", '0', 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            SetDetectableSize setDetectableSize = (SetDetectableSize) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                setDetectableSize.onExtraCallback("logNameConvert", "/ext-event/widget");
                setDetectableSize.onExtraCallback("sectionName", this.$sectionName);
                setDetectableSize.onExtraCallback("analytics_type", "widget_event");
                setDetectableSize.onExtraCallback("widget_type", this.$widgetType);
                setDetectableSize.onExtraCallback("widget_size", this.$widgetSize);
                q8a q8aVar = q8a.onNavigationEvent;
                setDetectableSize.onExtraCallback("agentType", q8a.IAuthTabCallback(q8aVar).name());
                Object[] objArr = {q8aVar, Integer.valueOf(this.$appWidgetId)};
                int iOnExtraCallback = getKekid.onExtraCallback();
                int iOnExtraCallback2 = getKekid.onExtraCallback();
                String str = (String) q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, -1202793395, iOnExtraCallback2, 1202793401);
                if (!StringsKt.isBlank(str)) {
                    setDetectableSize.onExtraCallback("content", str);
                }
                Object[] objArr2 = {q8aVar, Integer.valueOf(this.$appWidgetId)};
                int iOnExtraCallback3 = getKekid.onExtraCallback();
                int iOnExtraCallback4 = getKekid.onExtraCallback();
                Pair pair = (Pair) q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback3, objArr2, 546818922, iOnExtraCallback4, -546818910);
                String str2 = (String) pair.onExtraCallbackWithResult();
                r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg = (r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg) pair.IAuthTabCallback();
                if (str2 != null) {
                    setDetectableSize.onExtraCallback("groupDetail", str2);
                }
                if (r8lambdabrizzqzhaizmdvstl2yymmz7zsg != null) {
                    setDetectableSize.onExtraCallback("groupCategory", r8lambdabrizzqzhaizmdvstl2yymmz7zsg.name());
                }
                Object[] objArr3 = new Object[1];
                a(new int[]{-632704634, 870951625}, 2 - TextUtils.lastIndexOf("", '0', 0, 0), objArr3);
                setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), this.$url);
                int i5 = this.$appWidgetId;
                this.L$0 = setDetectableSize;
                this.L$1 = access15400.onNavigationEvent(str);
                this.L$2 = access15400.onNavigationEvent(str2);
                this.L$3 = access15400.onNavigationEvent(r8lambdabrizzqzhaizmdvstl2yymmz7zsg);
                this.label = 1;
                obj = q8aVar.onExtraCallbackWithResult(i5, (access13800<? super Boolean>) this);
                if (obj == objOnWarmupCompleted) {
                    int i6 = onExtraCallback + 121;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                int i7 = IAuthTabCallback + 81;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    setDetectableSize.onExtraCallback("showBalance", String.valueOf(bool.booleanValue()));
                    int i8 = 57 / 0;
                } else {
                    setDetectableSize.onExtraCallback("showBalance", String.valueOf(bool.booleanValue()));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final q8ExternalSyntheticLambda4 onWarmupCompleted(int i) {
        Object obj;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 45;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Object obj2 = null;
        String string = readTypedObject().getString(IAuthTabCallbackStub(i), null);
        if (string == null) {
            return null;
        }
        int i5 = IAuthTabCallbackStubProxy + 87;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            StringsKt.removeSurrounding(string, "\"");
            throw null;
        }
        String strRemoveSurrounding = StringsKt.removeSurrounding(string, "\"");
        if (strRemoveSurrounding == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(q8ExternalSyntheticLambda4.valueOf(strRemoveSurrounding));
            int i6 = IAuthTabCallback_Parcel + 43;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i8 = IAuthTabCallback_Parcel + 107;
            IAuthTabCallbackStubProxy = i8 % 128;
            if (i8 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
        } else {
            obj2 = obj;
        }
        return (q8ExternalSyntheticLambda4) obj2;
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ int $appWidgetId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(int i, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$appWidgetId = i;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = new asInterface(this.$appWidgetId, access13800Var);
            int i2 = onExtraCallback + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return asinterface;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            onWarmupCompleted = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 121;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnExtraCallback;
            }
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            asInterface asinterfaceCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 58 / 0;
            } else {
                objInvokeSuspend = asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onExtraCallback + 91;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            q8a q8aVar = q8a.onNavigationEvent;
            SharedPreferences sharedPreferencesOnNavigationEvent = q8a.onNavigationEvent(q8aVar);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesOnNavigationEvent, "");
            int i3 = this.$appWidgetId;
            SharedPreferences.Editor editorEdit = sharedPreferencesOnNavigationEvent.edit();
            Object[] objArr = {q8aVar, Integer.valueOf(i3)};
            int iOnExtraCallback = getKekid.onExtraCallback();
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            editorEdit.remove((String) q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, 1382693617, iOnExtraCallback2, -1382693614));
            editorEdit.apply();
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 91;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 83 / 0;
            }
            return unit;
        }
    }

    private final void access100(int i) {
        int i2 = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(IAuthTabCallbackStub(), (CoroutineContext) null, (setRandomHost) null, new asInterface(i, null), 3, (Object) null);
        int i3 = IAuthTabCallback_Parcel + 33;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final String onNavigationEvent(int i) {
        int i2 = 2 % 2;
        String str = i + "_content";
        int i3 = IAuthTabCallbackStubProxy + 65;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        String str = ((Number) objArr[1]).intValue() + "_name";
        int i2 = IAuthTabCallbackStubProxy + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String asBinder(int i) {
        int i2 = 2 % 2;
        String str = i + "_type";
        int i3 = IAuthTabCallback_Parcel + 119;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private final String IAuthTabCallbackStub(int i) {
        int i2 = 2 % 2;
        String str = i + "_size";
        int i3 = IAuthTabCallback_Parcel + 45;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 12 / 0;
        }
        return str;
    }

    public final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 87;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        access000(i);
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = IAuthTabCallback_Parcel + 101;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallbackWithResult(@Nullable Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        if (map == null) {
            int i5 = i3 + 25;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int iOnExtraCallback = getKekid.onExtraCallback();
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            int iOnExtraCallback3 = getKekid.onExtraCallback();
            onWarmupCompleted(getKekid.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, new Object[]{this, "debug", "/ext-event/widget", map, null, null, 24, null}, 1742777013, iOnExtraCallback2, -1742777002);
        }
    }

    public final void onWarmupCompleted(@NotNull Context context, @NotNull String str, @Nullable Integer num) {
        String str2;
        int restrictBackgroundStatus;
        ActivityManager activityManager;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        boolean z = false;
        Map<String, ? extends Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("function", str), getWrite.IAuthTabCallback("check_type", "network_check")});
        if (num != null) {
            mapIAuthTabCallback.put("appWidgetId", num);
        }
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        NetworkCapabilities networkCapabilities = activeNetwork != null ? connectivityManager.getNetworkCapabilities(activeNetwork) : null;
        mapIAuthTabCallback.put("has_network", Boolean.valueOf(activeNetwork != null));
        mapIAuthTabCallback.put("has_internet", Boolean.valueOf(networkCapabilities != null && networkCapabilities.hasCapability(12)));
        mapIAuthTabCallback.put("has_validated", Boolean.valueOf(networkCapabilities != null && networkCapabilities.hasCapability(16)));
        Object systemService2 = context.getSystemService("power");
        Intrinsics.checkNotNull(systemService2, "");
        PowerManager powerManager = (PowerManager) systemService2;
        if (powerManager.isPowerSaveMode()) {
            int i4 = IAuthTabCallback_Parcel + 117;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            str2 = "low";
        } else {
            str2 = "normal";
        }
        mapIAuthTabCallback.put("battery_mode", str2);
        int i6 = Build.VERSION.SDK_INT;
        mapIAuthTabCallback.put("is_ignoring_battery_optimizations", Boolean.valueOf(powerManager.isIgnoringBatteryOptimizations(context.getPackageName())));
        mapIAuthTabCallback.put("is_interactive", Boolean.valueOf(powerManager.isInteractive()));
        mapIAuthTabCallback.put("is_background_restricted", Boolean.valueOf(i6 >= 28 && (activityManager = (ActivityManager) ContextCompat.getSystemService(context, ActivityManager.class)) != null && activityManager.isBackgroundRestricted()));
        if (!(!connectivityManager.isActiveNetworkMetered()) && (restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus()) != 1) {
            int i7 = IAuthTabCallbackStubProxy;
            int i8 = i7 + 105;
            IAuthTabCallback_Parcel = i8 % 128;
            int i9 = i8 % 2;
            if (restrictBackgroundStatus != 2) {
                int i10 = i7 + 47;
                IAuthTabCallback_Parcel = i10 % 128;
                if (i10 % 2 == 0 && restrictBackgroundStatus == 3) {
                    z = true;
                }
            }
        }
        mapIAuthTabCallback.put("data_saver_enabled", Boolean.valueOf(z));
        onExtraCallbackWithResult(mapIAuthTabCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IAuthTabCallback(q8a q8aVar, Throwable th, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy;
        int i4 = i3 + 61;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 107;
            IAuthTabCallback_Parcel = i6 % 128;
            if (i6 % 2 != 0) {
                map = access8100.onNavigationEvent();
                int i7 = 77 / 0;
            } else {
                map = access8100.onNavigationEvent();
            }
            int i8 = IAuthTabCallbackStubProxy + 115;
            IAuthTabCallback_Parcel = i8 % 128;
            int i9 = i8 % 2;
        }
        q8aVar.onNavigationEvent(th, (Map<String, ? extends Object>) map);
    }

    public final void onNavigationEvent(@NotNull Throwable th, @NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = {this, "error", "/ext-event/widget", access8100.onWarmupCompleted(map, access8100.onNavigationEvent(getWrite.IAuthTabCallback("throwable", th.getMessage()))), null, null, 24, null};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, 1742777013, iOnExtraCallback2, -1742777002);
        int i4 = IAuthTabCallbackStubProxy + 105;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onNavigationEvent(@NotNull Context context, final int i, @NotNull final String str, @NotNull final String str2, @NotNull final String str3) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 59;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (i != 0) {
            onExtraCallback(context, i, new Function0() { // from class: im.toss.securities.widget.common.log.WidgetTracker$$ExternalSyntheticLambda6
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    Unit unit;
                    int i5 = 2 % 2;
                    int i6 = onExtraCallback + 125;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = i;
                        Object[] objArr = {Integer.valueOf(i7), str, str2, str3};
                        int iOnExtraCallback = getKekid.onExtraCallback();
                        int iOnExtraCallback2 = getKekid.onExtraCallback();
                        unit = (Unit) q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, 901503307, iOnExtraCallback2, -901503297);
                        int i8 = 3 / 0;
                    } else {
                        int i9 = i;
                        Object[] objArr2 = {Integer.valueOf(i9), str, str2, str3};
                        int iOnExtraCallback3 = getKekid.onExtraCallback();
                        int iOnExtraCallback4 = getKekid.onExtraCallback();
                        unit = (Unit) q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback3, objArr2, 901503307, iOnExtraCallback4, -901503297);
                    }
                    int i10 = onWarmupCompleted + 9;
                    onExtraCallback = i10 % 128;
                    if (i10 % 2 == 0) {
                        return unit;
                    }
                    throw null;
                }
            });
            return;
        }
        auth.onNavigationEvent.IAuthTabCallback(new IllegalStateException("appWidgetId is undefined"), access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("sectionName", str), getWrite.IAuthTabCallback("widgetType", str2), getWrite.IAuthTabCallback("widgetSize", str3)}));
        int i5 = IAuthTabCallbackStubProxy + 107;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function1<access13800<? super Pair<? extends String, ? extends r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg>>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ int $appWidgetId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback_Parcel(int i, access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(1, access13800Var);
            this.$appWidgetId = i;
        }

        public final Object IAuthTabCallback(access13800<? super Pair<String, ? extends r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg>> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 70 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = new IAuthTabCallback_Parcel(this.$appWidgetId, access13800Var);
            int i2 = onNavigationEvent + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback_Parcel;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((access13800) obj);
            int i4 = onNavigationEvent + 19;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 47;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            Object[] objArr = {q8a.onNavigationEvent, Integer.valueOf(this.$appWidgetId)};
            int iOnExtraCallback = getKekid.onExtraCallback();
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            if (i6 != 0) {
                return (Pair) q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, 546818922, iOnExtraCallback2, -546818910);
            }
            int i7 = 86 / 0;
            return (Pair) q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, 546818922, iOnExtraCallback2, -546818910);
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        int i = 2 % 2;
        onWarmupCompleted(onNavigationEvent, iIntValue, str, "widget_impression", str2, str3, null, new IAuthTabCallback_Parcel(iIntValue, null), null, 160, null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public final void onExtraCallbackWithResult(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 51;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        SharedPreferences sharedPreferences = context.getSharedPreferences("widget_log_pref", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong(onNavigationEvent.asInterface(i), 0L);
        editorEdit.apply();
        access000(i);
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, 219231764, iOnExtraCallback2, -219231757);
        access100(i);
        int i5 = IAuthTabCallback_Parcel + 65;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    private final String asInterface(int i) {
        int i2 = 2 % 2;
        String str = "last_log_ts_" + i;
        int i3 = IAuthTabCallbackStubProxy + 9;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 90 / 0;
        }
        return str;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(q8a q8aVar, int i, String str, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel + 49;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0 ? (i2 & 4) != 0 : (i2 & 3) != 0) {
            z = false;
        }
        q8aVar.onExtraCallbackWithResult(i, str, z);
        int i5 = IAuthTabCallback_Parcel + 3;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallbackWithResult(int i, @NotNull String str, boolean z) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onWarmupCompleted(this, i, str, "widget_event", "calendar", "medium", null, null, new access100(z, i, null), 96, null);
        int i3 = IAuthTabCallbackStubProxy + 35;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class access100 extends SuspendLambda implements Function1<access13800<? super String>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ boolean $useLatestContent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access100(boolean z, int i, access13800<? super access100> access13800Var) {
            super(1, access13800Var);
            this.$useLatestContent = z;
            this.$appWidgetId = i;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = new access100(this.$useLatestContent, this.$appWidgetId, access13800Var);
            int i2 = onNavigationEvent + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return access100Var;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((access13800) obj);
            int i4 = onNavigationEvent + 19;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 56 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(access13800<? super String> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            access100 access100VarCreate = create(access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return access100VarCreate.invokeSuspend(unit);
            }
            access100VarCreate.invokeSuspend(unit);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 47;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = i2 + 87;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            if (!this.$useLatestContent) {
                return null;
            }
            Object[] objArr = {q8a.onNavigationEvent, Integer.valueOf(this.$appWidgetId)};
            int iOnExtraCallback = getKekid.onExtraCallback();
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            String str = (String) q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, -1202793395, iOnExtraCallback2, 1202793401);
            int i6 = IAuthTabCallback + 5;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    public static /* synthetic */ void onNavigationEvent(q8a q8aVar, int i, String str, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 4) != 0) {
            int i4 = IAuthTabCallback_Parcel + 41;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        q8aVar.onNavigationEvent(i, str, z);
        int i6 = IAuthTabCallback_Parcel + 71;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void onNavigationEvent(int i, @NotNull String str, boolean z) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onWarmupCompleted(this, i, str, "widget_event", "myAsset", "small", null, null, new extraCallbackWithResult(z, i, null), 96, null);
        int i3 = IAuthTabCallbackStubProxy + 53;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    static final class extraCallbackWithResult extends SuspendLambda implements Function1<access13800<? super String>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ boolean $useLatestContent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        extraCallbackWithResult(boolean z, int i, access13800<? super extraCallbackWithResult> access13800Var) {
            super(1, access13800Var);
            this.$useLatestContent = z;
            this.$appWidgetId = i;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            extraCallbackWithResult extracallbackwithresult = new extraCallbackWithResult(this.$useLatestContent, this.$appWidgetId, access13800Var);
            int i2 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return extracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((access13800) obj);
            int i4 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(access13800<? super String> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (!this.$useLatestContent) {
                return null;
            }
            int i3 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = {q8a.onNavigationEvent, Integer.valueOf(this.$appWidgetId)};
                int iOnExtraCallback = getKekid.onExtraCallback();
                int iOnExtraCallback2 = getKekid.onExtraCallback();
                return (String) q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, -1202793395, iOnExtraCallback2, 1202793401);
            }
            Object[] objArr2 = {q8a.onNavigationEvent, Integer.valueOf(this.$appWidgetId)};
            int iOnExtraCallback3 = getKekid.onExtraCallback();
            int iOnExtraCallback4 = getKekid.onExtraCallback();
            throw null;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(q8a q8aVar, int i, String str, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 4) != 0) {
            int i4 = IAuthTabCallback_Parcel + 19;
            IAuthTabCallbackStubProxy = i4 % 128;
            z = i4 % 2 == 0;
        }
        q8aVar.IAuthTabCallback(i, str, z);
        int i5 = IAuthTabCallback_Parcel + 111;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void IAuthTabCallback(int i, @NotNull String str, boolean z) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        q8ExternalSyntheticLambda4 q8externalsyntheticlambda4OnWarmupCompleted = onWarmupCompleted(i);
        if (q8externalsyntheticlambda4OnWarmupCompleted == null) {
            int i3 = IAuthTabCallbackStubProxy + 5;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            q8externalsyntheticlambda4OnWarmupCompleted = q8ExternalSyntheticLambda4.medium;
        }
        String strName = q8externalsyntheticlambda4OnWarmupCompleted.name();
        Object obj = null;
        onWarmupCompleted(this, i, str, "widget_event", "myAsset", strName, null, null, new IAuthTabCallbackStubProxy(z, i, null), 96, null);
        int i5 = IAuthTabCallbackStubProxy + 73;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function1<access13800<? super String>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ boolean $useLatestContent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStubProxy(boolean z, int i, access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(1, access13800Var);
            this.$useLatestContent = z;
            this.$appWidgetId = i;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = new IAuthTabCallbackStubProxy(this.$useLatestContent, this.$appWidgetId, access13800Var);
            int i2 = onNavigationEvent + 37;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallbackStubProxy;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((access13800) obj);
            int i4 = onWarmupCompleted + 75;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(access13800<? super String> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxyCreate = create(access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return iAuthTabCallbackStubProxyCreate.invokeSuspend(unit);
            }
            iAuthTabCallbackStubProxyCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 75;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (!this.$useLatestContent) {
                int i7 = onWarmupCompleted + 47;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 5 / 0;
                }
                return null;
            }
            Object[] objArr = {q8a.onNavigationEvent, Integer.valueOf(this.$appWidgetId)};
            String str = (String) q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), objArr, -1202793395, getKekid.onExtraCallback(), 1202793401);
            int i9 = onNavigationEvent + 13;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return str;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(q8a q8aVar, int i, String str, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 4) != 0) {
            int i4 = IAuthTabCallbackStubProxy;
            int i5 = i4 + 83;
            IAuthTabCallback_Parcel = i5 % 128;
            boolean z2 = i5 % 2 == 0;
            int i6 = i4 + 103;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            z = !z2;
        }
        onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), new Object[]{q8aVar, Integer.valueOf(i), str, Boolean.valueOf(z)}, 111645652, getKekid.onExtraCallback(), -111645643);
    }

    public static /* synthetic */ void onExtraCallback(q8a q8aVar, int i, String str, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        if ((i2 & 4) != 0) {
            z = false;
        }
        q8aVar.onWarmupCompleted(i, str, z);
        int i6 = IAuthTabCallbackStubProxy + 95;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 56 / 0;
        }
    }

    public final void onWarmupCompleted(int i, @NotNull String str, boolean z) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        q8ExternalSyntheticLambda4 q8externalsyntheticlambda4OnWarmupCompleted = onWarmupCompleted(i);
        if (q8externalsyntheticlambda4OnWarmupCompleted == null) {
            int i3 = IAuthTabCallback_Parcel + 57;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            q8externalsyntheticlambda4OnWarmupCompleted = q8ExternalSyntheticLambda4.medium;
        }
        IAuthTabCallback(i, str, z, q8externalsyntheticlambda4OnWarmupCompleted.name());
        int i5 = IAuthTabCallbackStubProxy + 39;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private final void IAuthTabCallback(int i, String str, boolean z, String str2) {
        int i2 = 2 % 2;
        onWarmupCompleted(this, i, str, "widget_event", "stocks", str2, null, new writeTypedObject(i, null), new readTypedObject(z, i, null), 32, null);
        int i3 = IAuthTabCallbackStubProxy + 115;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class readTypedObject extends SuspendLambda implements Function1<access13800<? super String>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ boolean $useLatestContent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        readTypedObject(boolean z, int i, access13800<? super readTypedObject> access13800Var) {
            super(1, access13800Var);
            this.$useLatestContent = z;
            this.$appWidgetId = i;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            readTypedObject readtypedobject = new readTypedObject(this.$useLatestContent, this.$appWidgetId, access13800Var);
            int i2 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return readtypedobject;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((access13800) obj);
            int i4 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(access13800<? super String> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            readTypedObject readtypedobjectCreate = create(access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return readtypedobjectCreate.invokeSuspend(unit);
            }
            readtypedobjectCreate.invokeSuspend(unit);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            if (!this.$useLatestContent) {
                int i4 = onWarmupCompleted + 29;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }
            int i6 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = {q8a.onNavigationEvent, Integer.valueOf(this.$appWidgetId)};
            int iOnExtraCallback = getKekid.onExtraCallback();
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            return (String) q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, -1202793395, iOnExtraCallback2, 1202793401);
        }
    }

    static final class writeTypedObject extends SuspendLambda implements Function1<access13800<? super Pair<? extends String, ? extends r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg>>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ int $appWidgetId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        writeTypedObject(int i, access13800<? super writeTypedObject> access13800Var) {
            super(1, access13800Var);
            this.$appWidgetId = i;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            writeTypedObject writetypedobject = new writeTypedObject(this.$appWidgetId, access13800Var);
            int i2 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return writetypedobject;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            access13800<? super Pair<String, ? extends r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg>> access13800Var = (access13800) obj;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(access13800Var);
            }
            onExtraCallbackWithResult(access13800Var);
            throw null;
        }

        public final Object onExtraCallbackWithResult(access13800<? super Pair<String, ? extends r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg>> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            Object[] objArr = {q8a.onNavigationEvent, Integer.valueOf(this.$appWidgetId)};
            int iOnExtraCallback = getKekid.onExtraCallback();
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            Pair pair = (Pair) q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, 546818922, iOnExtraCallback2, -546818910);
            int i4 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return pair;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public final void onWarmupCompleted(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 21;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            onExtraCallbackWithResult(this, i, "위젯사용현황_삭제하기", true, 4, null);
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            onExtraCallbackWithResult(this, i, "위젯사용현황_삭제하기", false, 4, null);
        }
        onExtraCallbackWithResult(context, i);
    }

    public final void IAuthTabCallback(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 107;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        onNavigationEvent(this, i, "위젯사용현황_삭제하기", false, 4, null);
        onExtraCallbackWithResult(context, i);
        int i5 = IAuthTabCallback_Parcel + 57;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void onExtraCallback(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 47;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        IAuthTabCallback(this, i, "위젯사용현황_삭제하기", false, 4, null);
        onExtraCallbackWithResult(context, i);
        int i5 = IAuthTabCallback_Parcel + 5;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void onTransact(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 109;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        onWarmupCompleted(this, i, "위젯사용현황_삭제하기", false, 4, (Object) null);
        onExtraCallbackWithResult(context, i);
        int i5 = IAuthTabCallback_Parcel + 101;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onNavigationEvent(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 87;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            onExtraCallback(this, i, "위젯사용현황_삭제하기", true, 5, null);
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            onExtraCallback(this, i, "위젯사용현황_삭제하기", false, 4, null);
        }
        onExtraCallbackWithResult(context, i);
    }

    public final void onExtraCallbackWithResult(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Object[] objArr = {this, "analytics", "/ext-event/widget", null, "", new access000(str, str3, str4, i, str2, null), 4, null};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, 1742777013, iOnExtraCallback2, -1742777002);
        int i3 = IAuthTabCallback_Parcel + 29;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final void onWarmupCompleted(int i, @NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 45;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            onExtraCallbackWithResult(i, "widget_impression", (String) null, str, str2, z, str3, str4);
            return;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        onExtraCallbackWithResult(i, "widget_impression", (String) null, str, str2, z, str3, str4);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, @NotNull String str5) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 103;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        onExtraCallbackWithResult(i, "widget_event", str, str2, str3, z, str4, str5);
        int i5 = IAuthTabCallbackStubProxy + 41;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void onExtraCallbackWithResult(int i, String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 65;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        if (i == 0) {
            auth.onNavigationEvent.IAuthTabCallback(new IllegalStateException("appWidgetId is undefined"), access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("sectionName", "권리처리팝업"), getWrite.IAuthTabCallback("analyticsType", str), getWrite.IAuthTabCallback("widgetType", str5), getWrite.IAuthTabCallback("widgetSize", str6)}));
            return;
        }
        Object obj = null;
        onWarmupCompleted(this, i, "권리처리팝업", str, str5, str6, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(TossSecRoute.EarningCallDetail.PARAM_PRODUCT_CODE, str3), getWrite.IAuthTabCallback("productType", str4), getWrite.IAuthTabCallback("hasNotice", Boolean.valueOf(z))}), null, new ICustomTabsCallback(str2, null), 64, null);
        int i5 = IAuthTabCallbackStubProxy + 109;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class ICustomTabsCallback extends SuspendLambda implements Function1<access13800<? super String>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ String $content;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ICustomTabsCallback(String str, access13800<? super ICustomTabsCallback> access13800Var) {
            super(1, access13800Var);
            this.$content = str;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(this.$content, access13800Var);
            int i2 = IAuthTabCallback + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iCustomTabsCallback;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((access13800) obj);
            if (i3 != 0) {
                int i4 = 15 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(access13800<? super String> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 117;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onExtraCallback + 121;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            String str = this.$content;
            int i4 = IAuthTabCallback + 117;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static /* synthetic */ void onWarmupCompleted(q8a q8aVar, int i, String str, String str2, String str3, String str4, Map map, Function1 function1, Function1 function12, int i2, Object obj) {
        Function1 function13;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel + 115;
        IAuthTabCallbackStubProxy = i4 % 128;
        Map mapOnNavigationEvent = (i4 % 2 != 0 ? (i2 & 32) == 0 : (i2 & 80) == 0) ? map : access8100.onNavigationEvent();
        if ((i2 & 64) != 0) {
            IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(null);
            int i5 = IAuthTabCallbackStubProxy + 47;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            function13 = iAuthTabCallbackStub;
        } else {
            function13 = function1;
        }
        q8aVar.onExtraCallbackWithResult(i, str, str2, str3, str4, (Map<String, ? extends Object>) mapOnNavigationEvent, (Function1<? super access13800<? super Pair<String, ? extends r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg>>, ? extends Object>) function13, (Function1<? super access13800<? super String>, ? extends Object>) ((i2 & 128) != 0 ? new asBinder(null) : function12));
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function1<access13800<? super Pair<? extends String, ? extends r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg>>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(access13800Var);
            int i2 = onExtraCallback + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((access13800) obj);
            if (i3 == 0) {
                int i4 = 96 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(access13800<? super Pair<String, ? extends r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg>> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 63;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 73;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 111;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            Object obj2 = null;
            ResultKt.onNavigationEvent(obj);
            if (i6 == 0) {
                return null;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static final class asBinder extends SuspendLambda implements Function1<access13800<? super String>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = new asBinder(access13800Var);
            int i2 = onNavigationEvent + 85;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 59 / 0;
            }
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            onNavigationEvent = i2 % 128;
            access13800<? super String> access13800Var = (access13800) obj;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(access13800Var);
            }
            onExtraCallbackWithResult(access13800Var);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(access13800<? super String> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            asBinder asbinderCreate = create(access13800Var);
            if (i3 == 0) {
                return asbinderCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 10 / 0;
            return asbinderCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onNavigationEvent + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            int i4 = onWarmupCompleted + 71;
            onNavigationEvent = i4 % 128;
            Object obj2 = null;
            if (i4 % 2 != 0) {
                return null;
            }
            obj2.hashCode();
            throw null;
        }
    }

    private final void onExtraCallbackWithResult(int i, String str, String str2, String str3, String str4, Map<String, ? extends Object> map, Function1<? super access13800<? super Pair<String, ? extends r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg>>, ? extends Object> function1, Function1<? super access13800<? super String>, ? extends Object> function12) {
        int i2 = 2 % 2;
        Object[] objArr = {this, "analytics", "/ext-event/widget", null, "", new getInterfaceDescriptor(str, str2, str3, str4, map, function1, function12, i, null), 4, null};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, 1742777013, iOnExtraCallback2, -1742777002);
        int i3 = IAuthTabCallback_Parcel + 125;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    static final class getInterfaceDescriptor extends SuspendLambda implements Function2<SetDetectableSize, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ String $analyticsType;
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ Map<String, Object> $extraParams;
        final /* synthetic */ Function1<access13800<? super String>, Object> $onInvokeContent;
        final /* synthetic */ Function1<access13800<? super Pair<String, ? extends r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg>>, Object> $onInvokeGroupDetailCategory;
        final /* synthetic */ String $sectionName;
        final /* synthetic */ String $widgetSize;
        final /* synthetic */ String $widgetType;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        getInterfaceDescriptor(String str, String str2, String str3, String str4, Map<String, ? extends Object> map, Function1<? super access13800<? super Pair<String, ? extends r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg>>, ? extends Object> function1, Function1<? super access13800<? super String>, ? extends Object> function12, int i, access13800<? super getInterfaceDescriptor> access13800Var) {
            super(2, access13800Var);
            this.$sectionName = str;
            this.$analyticsType = str2;
            this.$widgetType = str3;
            this.$widgetSize = str4;
            this.$extraParams = map;
            this.$onInvokeGroupDetailCategory = function1;
            this.$onInvokeContent = function12;
            this.$appWidgetId = i;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            getInterfaceDescriptor getinterfacedescriptor = new getInterfaceDescriptor(this.$sectionName, this.$analyticsType, this.$widgetType, this.$widgetSize, this.$extraParams, this.$onInvokeGroupDetailCategory, this.$onInvokeContent, this.$appWidgetId, access13800Var);
            getinterfacedescriptor.L$0 = obj;
            int i2 = onWarmupCompleted + 33;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return getinterfacedescriptor;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            IAuthTabCallback = i2 % 128;
            SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(setDetectableSize, access13800Var);
            }
            onExtraCallbackWithResult(setDetectableSize, access13800Var);
            throw null;
        }

        public final Object onExtraCallbackWithResult(SetDetectableSize setDetectableSize, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(setDetectableSize, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x0127, code lost:
        
            if (r10 != r2) goto L43;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00f1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Pair pair;
            String str;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            SetDetectableSize setDetectableSize = (SetDetectableSize) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                setDetectableSize.onExtraCallback("logNameConvert", "/ext-event/widget");
                setDetectableSize.onExtraCallback("sectionName", this.$sectionName);
                setDetectableSize.onExtraCallback("analytics_type", this.$analyticsType);
                setDetectableSize.onExtraCallback("widget_type", this.$widgetType);
                setDetectableSize.onExtraCallback("widget_size", this.$widgetSize);
                setDetectableSize.onExtraCallback("agentType", q8a.IAuthTabCallback(q8a.onNavigationEvent).name());
                setDetectableSize.onExtraCallback(this.$extraParams);
                Function1<access13800<? super Pair<String, ? extends r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg>>, Object> function1 = this.$onInvokeGroupDetailCategory;
                this.L$0 = setDetectableSize;
                this.label = 1;
                obj = function1.invoke(this);
                if (obj != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            if (i4 == 1) {
                ResultKt.onNavigationEvent(obj);
            } else {
                if (i4 != 2) {
                    int i5 = IAuthTabCallback + 55;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0 ? i4 != 3 : i4 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    Boolean bool = (Boolean) obj;
                    if (bool != null) {
                        setDetectableSize.onExtraCallback("showBalance", String.valueOf(bool.booleanValue()));
                    }
                    return Unit.INSTANCE;
                }
                pair = (Pair) this.L$1;
                ResultKt.onNavigationEvent(obj);
                str = (String) obj;
                if (str != null) {
                    int i6 = onWarmupCompleted + 59;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0 ? (!StringsKt.isBlank(str)) : !StringsKt.isBlank(str)) {
                        setDetectableSize.onExtraCallback("content", str);
                    }
                }
                q8a q8aVar = q8a.onNavigationEvent;
                int i7 = this.$appWidgetId;
                this.L$0 = setDetectableSize;
                this.L$1 = access15400.onNavigationEvent(pair);
                this.L$2 = access15400.onNavigationEvent(str);
                this.label = 3;
                obj = q8aVar.onExtraCallbackWithResult(i7, (access13800<? super Boolean>) this);
            }
            pair = (Pair) obj;
            if (pair != null) {
                int i8 = onWarmupCompleted + 1;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                String str2 = (String) pair.getFirst();
                r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg = (r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg) pair.getSecond();
                if (str2 != null) {
                    int i10 = onWarmupCompleted + 13;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    if (!StringsKt.isBlank(str2)) {
                        setDetectableSize.onExtraCallback("groupDetail", str2);
                    }
                }
                if (r8lambdabrizzqzhaizmdvstl2yymmz7zsg != null) {
                    int i12 = onWarmupCompleted + 59;
                    IAuthTabCallback = i12 % 128;
                    int i13 = i12 % 2;
                    setDetectableSize.onExtraCallback("groupCategory", r8lambdabrizzqzhaizmdvstl2yymmz7zsg.name());
                }
            }
            Function1<access13800<? super String>, Object> function12 = this.$onInvokeContent;
            this.L$0 = setDetectableSize;
            this.L$1 = access15400.onNavigationEvent(pair);
            this.label = 2;
            obj = function12.invoke(this);
            if (obj != objOnWarmupCompleted) {
                str = (String) obj;
                if (str != null) {
                }
                q8a q8aVar2 = q8a.onNavigationEvent;
                int i72 = this.$appWidgetId;
                this.L$0 = setDetectableSize;
                this.L$1 = access15400.onNavigationEvent(pair);
                this.L$2 = access15400.onNavigationEvent(str);
                this.label = 3;
                obj = q8aVar2.onExtraCallbackWithResult(i72, (access13800<? super Boolean>) this);
            }
            return objOnWarmupCompleted;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        q8a q8aVar = (q8a) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        Map<String, ? extends Object> map = (Map) objArr[3];
        String str3 = (String) objArr[4];
        Function2<? super SetDetectableSize, ? super access13800<? super Unit>, ? extends Object> extracallback = (Function2) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        Object obj = objArr[7];
        int i = 2 % 2;
        if ((iIntValue & 4) != 0) {
            int i2 = IAuthTabCallback_Parcel + 111;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            map = null;
        }
        if ((iIntValue & 8) != 0) {
            int i4 = IAuthTabCallback_Parcel + 125;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 66 / 0;
            }
            str3 = "ext_";
        }
        if ((iIntValue & 16) != 0) {
            extracallback = new extraCallback(null);
        }
        q8aVar.onWarmupCompleted(str, str2, map, str3, extracallback);
        return null;
    }

    static final class extraCallback extends SuspendLambda implements Function2<SetDetectableSize, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        int label;

        extraCallback(access13800<? super extraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(SetDetectableSize setDetectableSize, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(setDetectableSize, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            extraCallback extracallback = new extraCallback(access13800Var);
            int i2 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return extracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((SetDetectableSize) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 105;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 117;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            Unit unit = Unit.INSTANCE;
            if (i6 != 0) {
                int i7 = 92 / 0;
            }
            return unit;
        }
    }

    private final void onWarmupCompleted(String str, String str2, Map<String, ? extends Object> map, String str3, Function2<? super SetDetectableSize, ? super access13800<? super Unit>, ? extends Object> function2) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(IAuthTabCallbackStub(), (CoroutineContext) null, (setRandomHost) null, new onMessageChannelReady(str3, str, str2, zzaj.onWarmupCompleted().IAuthTabCallbackDefault(), map, function2, null), 3, (Object) null);
        int i2 = IAuthTabCallback_Parcel + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static final class onMessageChannelReady extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ String $logName;
        final /* synthetic */ long $logTime;
        final /* synthetic */ String $logType;
        final /* synthetic */ String $logTypePrefix;
        final /* synthetic */ Map<String, Object> $params;
        final /* synthetic */ Function2<SetDetectableSize, access13800<? super Unit>, Object> $setup;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onMessageChannelReady(String str, String str2, String str3, long j, Map<String, ? extends Object> map, Function2<? super SetDetectableSize, ? super access13800<? super Unit>, ? extends Object> function2, access13800<? super onMessageChannelReady> access13800Var) {
            super(2, access13800Var);
            this.$logTypePrefix = str;
            this.$logType = str2;
            this.$logName = str3;
            this.$logTime = j;
            this.$params = map;
            this.$setup = function2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onMessageChannelReady onmessagechannelready = new onMessageChannelReady(this.$logTypePrefix, this.$logType, this.$logName, this.$logTime, this.$params, this.$setup, access13800Var);
            int i2 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onmessagechannelready;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            q_ q_Var;
            String str2;
            SetDetectableSize setDetectableSize;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 1;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str3 = (String) this.L$3;
                q_ q_Var2 = (q_) this.L$2;
                setDetectableSize = (SetDetectableSize) this.L$1;
                str = (String) this.L$0;
                ResultKt.onNavigationEvent(obj);
                str2 = str3;
                q_Var = q_Var2;
            } else {
                ResultKt.onNavigationEvent(obj);
                str = this.$logTypePrefix + this.$logType;
                q_ q_VarOnWarmupCompleted = q8a.onWarmupCompleted(q8a.onNavigationEvent);
                String str4 = this.$logType;
                SetDetectableSize setDetectableSize2 = new SetDetectableSize();
                Map<String, Object> map = this.$params;
                Function2<SetDetectableSize, access13800<? super Unit>, Object> function2 = this.$setup;
                setDetectableSize2.onExtraCallback(map);
                this.L$0 = str;
                this.L$1 = setDetectableSize2;
                this.L$2 = q_VarOnWarmupCompleted;
                this.L$3 = str4;
                this.I$0 = 0;
                this.label = 1;
                if (function2.invoke(setDetectableSize2, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                q_Var = q_VarOnWarmupCompleted;
                str2 = str4;
                setDetectableSize = setDetectableSize2;
            }
            AFd1jSDK.IAuthTabCallback.IAuthTabCallback(new SecuritiesLogV1(str, this.$logName, q_.onExtraCallbackWithResult(q_Var, str2, (String) null, setDetectableSize.IAuthTabCallback(), (Function1) null, false, 26, (Object) null), this.$logTime), true);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 41 / 0;
            }
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallbackWithResult(int i, @NotNull access13800<? super Boolean> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        Map<Integer, Boolean> map;
        Integer num;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 53;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = access13800Var instanceof IAuthTabCallback;
            throw null;
        }
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i4 = iAuthTabCallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = IAuthTabCallbackStubProxy + 13;
                IAuthTabCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                iAuthTabCallback.label = i4 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object obj = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = iAuthTabCallback.label;
        if (i7 != 0) {
            int i8 = IAuthTabCallback_Parcel + 43;
            IAuthTabCallbackStubProxy = i8 % 128;
            int i9 = i8 % 2;
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            num = (Integer) iAuthTabCallback.L$1;
            map = (Map) iAuthTabCallback.L$0;
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            map = onTransact;
            Integer numOnNavigationEvent = access14000.onNavigationEvent(i);
            Boolean bool = map.get(numOnNavigationEvent);
            if (bool != null) {
                return bool;
            }
            q8a q8aVar = onNavigationEvent;
            int iOnExtraCallback = getKekid.onExtraCallback();
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallback2 = (DiskLruCacheEditornewSink11.IAuthTabCallback) onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, new Object[]{q8aVar}, 7749691, iOnExtraCallback2, -7749683);
            String strIAuthTabCallbackDefault = q8aVar.IAuthTabCallbackDefault(i);
            KSerializer kSerializerOnExtraCallback = sp.onExtraCallback(BooleanCompanionObject.INSTANCE);
            iAuthTabCallback.L$0 = map;
            iAuthTabCallback.L$1 = numOnNavigationEvent;
            iAuthTabCallback.L$2 = access15400.onNavigationEvent(bool);
            iAuthTabCallback.I$0 = i;
            iAuthTabCallback.I$1 = 0;
            iAuthTabCallback.I$2 = 0;
            iAuthTabCallback.label = 1;
            Object objOnExtraCallback = iAuthTabCallback2.onExtraCallback(strIAuthTabCallbackDefault, kSerializerOnExtraCallback, iAuthTabCallback);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            obj = objOnExtraCallback;
            num = numOnNavigationEvent;
        }
        Boolean bool2 = (Boolean) obj;
        map.put(num, bool2);
        return bool2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(int i, boolean z, @NotNull access13800<? super Unit> access13800Var) throws Throwable {
        onWarmupCompleted onwarmupcompleted;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni2;
        int i4;
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackStubProxy;
        int i7 = i6 + 49;
        IAuthTabCallback_Parcel = i7 % 128;
        int i8 = i7 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            int i9 = i6 + 107;
            IAuthTabCallback_Parcel = i9 % 128;
            int i10 = i9 % 2;
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i11 = onwarmupcompleted.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i11 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
                int i12 = IAuthTabCallbackStubProxy + 119;
                IAuthTabCallback_Parcel = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 2 % 5;
                }
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i14 = onwarmupcompleted.label;
        try {
            if (i14 == 0) {
                ResultKt.onNavigationEvent(obj);
                jni_ygnodestylegetflexbasisjni = IAuthTabCallbackDefault;
                onwarmupcompleted.L$0 = jni_ygnodestylegetflexbasisjni;
                i2 = i;
                onwarmupcompleted.I$0 = i2;
                z2 = z;
                onwarmupcompleted.Z$0 = z2;
                onwarmupcompleted.I$1 = 0;
                onwarmupcompleted.label = 1;
                if (jni_ygnodestylegetflexbasisjni.IAuthTabCallback((Object) null, onwarmupcompleted) != objOnWarmupCompleted) {
                    int i15 = IAuthTabCallback_Parcel + 99;
                    IAuthTabCallbackStubProxy = i15 % 128;
                    int i16 = i15 % 2;
                    i3 = 0;
                }
                return objOnWarmupCompleted;
            }
            if (i14 != 1) {
                int i17 = IAuthTabCallbackStubProxy + 113;
                IAuthTabCallback_Parcel = i17 % 128;
                if (i17 % 2 == 0 ? i14 != 2 : i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = onwarmupcompleted.Z$0;
                i4 = onwarmupcompleted.I$0;
                jni_ygnodestylegetflexbasisjni2 = (jni_YGNodeStyleGetFlexBasisJNI) onwarmupcompleted.L$0;
                try {
                    ResultKt.onNavigationEvent(obj);
                    onTransact.put(access14000.onNavigationEvent(i4), access14000.onNavigationEvent(z3));
                    Unit unit = Unit.INSTANCE;
                    jni_ygnodestylegetflexbasisjni2.onWarmupCompleted((Object) null);
                    int i18 = IAuthTabCallbackStubProxy + 7;
                    IAuthTabCallback_Parcel = i18 % 128;
                    int i19 = i18 % 2;
                    return unit;
                } catch (Throwable th) {
                    th = th;
                    jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni2;
                    jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
                    throw th;
                }
            }
            int i20 = onwarmupcompleted.I$1;
            boolean z4 = onwarmupcompleted.Z$0;
            int i21 = onwarmupcompleted.I$0;
            jni_ygnodestylegetflexbasisjni = (jni_YGNodeStyleGetFlexBasisJNI) onwarmupcompleted.L$0;
            ResultKt.onNavigationEvent(obj);
            i2 = i21;
            i3 = i20;
            z2 = z4;
            q8a q8aVar = onNavigationEvent;
            int iOnExtraCallback = getKekid.onExtraCallback();
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallback = (DiskLruCacheEditornewSink11.IAuthTabCallback) onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, new Object[]{q8aVar}, 7749691, iOnExtraCallback2, -7749683);
            String strIAuthTabCallbackDefault = q8aVar.IAuthTabCallbackDefault(i2);
            Boolean boolOnNavigationEvent = access14000.onNavigationEvent(z2);
            KSerializer kSerializerOnExtraCallback = sp.onExtraCallback(BooleanCompanionObject.INSTANCE);
            onwarmupcompleted.L$0 = jni_ygnodestylegetflexbasisjni;
            onwarmupcompleted.I$0 = i2;
            onwarmupcompleted.Z$0 = z2;
            onwarmupcompleted.I$1 = i3;
            onwarmupcompleted.I$2 = 0;
            onwarmupcompleted.label = 2;
            if (iAuthTabCallback.onNavigationEvent(strIAuthTabCallbackDefault, boolOnNavigationEvent, kSerializerOnExtraCallback, onwarmupcompleted) != objOnWarmupCompleted) {
                z3 = z2;
                jni_ygnodestylegetflexbasisjni2 = jni_ygnodestylegetflexbasisjni;
                i4 = i2;
                onTransact.put(access14000.onNavigationEvent(i4), access14000.onNavigationEvent(z3));
                Unit unit2 = Unit.INSTANCE;
                jni_ygnodestylegetflexbasisjni2.onWarmupCompleted((Object) null);
                int i182 = IAuthTabCallbackStubProxy + 7;
                IAuthTabCallback_Parcel = i182 % 128;
                int i192 = i182 % 2;
                return unit2;
            }
            return objOnWarmupCompleted;
        } catch (Throwable th2) {
            th = th2;
            jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
            throw th;
        }
    }

    private final boolean onExtraCallback(Context context, int i, Function0<Unit> function0) {
        SharedPreferences.Editor editorEdit;
        int i2 = 2 % 2;
        String strAsInterface = asInterface(i);
        SharedPreferences sharedPreferences = context.getSharedPreferences("widget_log_pref", 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - sharedPreferences.getLong(strAsInterface, 0L) < 86400000) {
            int i3 = IAuthTabCallbackStubProxy + 77;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = IAuthTabCallback_Parcel + 3;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            function0.invoke();
            Intrinsics.checkNotNull(sharedPreferences);
            editorEdit = sharedPreferences.edit();
        } else {
            function0.invoke();
            Intrinsics.checkNotNull(sharedPreferences);
            editorEdit = sharedPreferences.edit();
        }
        editorEdit.putLong(strAsInterface, jCurrentTimeMillis);
        editorEdit.apply();
        return true;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, String str, String str2, String str3) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return (Unit) onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, 901503307, iOnExtraCallback2, -901503297);
    }

    public static final /* synthetic */ Pair onNavigationEvent(q8a q8aVar, int i) {
        Object[] objArr = {q8aVar, Integer.valueOf(i)};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return (Pair) onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, 546818922, iOnExtraCallback2, -546818910);
    }

    public static final /* synthetic */ String onExtraCallback(q8a q8aVar, int i) {
        Object[] objArr = {q8aVar, Integer.valueOf(i)};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return (String) onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, -1202793395, iOnExtraCallback2, 1202793401);
    }

    public static final /* synthetic */ String IAuthTabCallback(q8a q8aVar, int i) {
        Object[] objArr = {q8aVar, Integer.valueOf(i)};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return (String) onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, 1382693617, iOnExtraCallback2, -1382693614);
    }

    private final String onExtraCallbackWithResult(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return (String) onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, -411267963, iOnExtraCallback2, 411267965);
    }

    private final DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallbackDefault() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        int iOnExtraCallback3 = getKekid.onExtraCallback();
        return (DiskLruCacheEditornewSink11.IAuthTabCallback) onWarmupCompleted(getKekid.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, new Object[]{this}, 7749691, iOnExtraCallback2, -7749683);
    }

    private final String onTransact(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return (String) onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, 1268501768, iOnExtraCallback2, -1268501764);
    }

    private final DiskLruCacheEntry access000() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        int iOnExtraCallback3 = getKekid.onExtraCallback();
        return (DiskLruCacheEntry) onWarmupCompleted(getKekid.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, new Object[]{this}, -1344797860, iOnExtraCallback2, 1344797873);
    }

    private static final findResAndMsg IAuthTabCallbackStubProxy() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        int iOnExtraCallback3 = getKekid.onExtraCallback();
        return (findResAndMsg) onWarmupCompleted(getKekid.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, new Object[0], -428571135, iOnExtraCallback2, 428571135);
    }

    private final void IAuthTabCallback_Parcel(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, 219231764, iOnExtraCallback2, -219231757);
    }

    private static final q_ ICustomTabsCallback() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        int iOnExtraCallback3 = getKekid.onExtraCallback();
        return (q_) onWarmupCompleted(getKekid.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, new Object[0], -481514326, iOnExtraCallback2, 481514327);
    }

    private static final Unit onWarmupCompleted(int i, String str, String str2, String str3) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return (Unit) onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, 1525272994, iOnExtraCallback2, -1525272989);
    }

    static /* synthetic */ void onWarmupCompleted(q8a q8aVar, String str, String str2, Map map, String str3, Function2 function2, int i, Object obj) {
        Object[] objArr = {q8aVar, str, str2, map, str3, function2, Integer.valueOf(i), obj};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, 1742777013, iOnExtraCallback2, -1742777002);
    }

    public final void onWarmupCompleted(int i, @NotNull String str) {
        Object[] objArr = {this, Integer.valueOf(i), str};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, -1919848074, iOnExtraCallback2, 1919848088);
    }

    public final void onExtraCallback(int i, @NotNull String str, boolean z) {
        Object[] objArr = {this, Integer.valueOf(i), str, Boolean.valueOf(z)};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, 111645652, iOnExtraCallback2, -111645643);
    }
}
