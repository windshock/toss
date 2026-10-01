package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import com.tmoney.a;
import im.toss.components.tuba.distribution.DistributionRequestBody;
import im.toss.core.cache.RxSharedApiCall;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.UtilsKtExternalSyntheticLambda12;
import o.deserializeIp;
import o.deserializeUriNullableCollection;
import o.setApTextSize;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class UtilsKtExternalSyntheticLambda12 {
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackStub;
    private static int access100;
    private final UtilsKtExternalSyntheticLambda5 IAuthTabCallback;
    private final ConcurrentHashMap<String, Throwable> IAuthTabCallbackDefault;
    private final ConcurrentHashMap<String, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg> asBinder;
    private final UtilsKtExternalSyntheticLambda14 asInterface;
    private final UtilsKtExternalSyntheticLambda7 onExtraCallback;
    private final ConcurrentHashMap<String, Boolean> onExtraCallbackWithResult;
    private final ConcurrentHashMap<String, RxSharedApiCall<Boolean>> onNavigationEvent;
    private final setAdUnitIds onTransact;
    private final UtilsKtExternalSyntheticLambda8 onWarmupCompleted;
    private static final byte[] $$a = {13, 38, -109, 117};
    private static final int $$b = 180;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int getInterfaceDescriptor = 1;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        int I$0;
        int I$1;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12 = UtilsKtExternalSyntheticLambda12.this;
            if (i3 == 0) {
                return utilsKtExternalSyntheticLambda12.onExtraCallback((String) null, (UtilsKtExternalSyntheticLambda3) null, (access13800<? super Boolean>) this);
            }
            utilsKtExternalSyntheticLambda12.onExtraCallback((String) null, (UtilsKtExternalSyntheticLambda3) null, (access13800<? super Boolean>) this);
            obj2.hashCode();
            throw null;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        int I$0;
        int I$1;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object[] objArr = {UtilsKtExternalSyntheticLambda12.this, null, null, this};
            int iOnWarmupCompleted = a.AnonymousClass3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.AnonymousClass3.onWarmupCompleted();
            int iOnWarmupCompleted3 = a.AnonymousClass3.onWarmupCompleted();
            int iOnWarmupCompleted4 = a.AnonymousClass3.onWarmupCompleted();
            if (i3 == 0) {
                objOnNavigationEvent = UtilsKtExternalSyntheticLambda12.onNavigationEvent(objArr, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted4, iOnWarmupCompleted3, 1061247442, -1061247433);
                int i4 = 53 / 0;
            } else {
                objOnNavigationEvent = UtilsKtExternalSyntheticLambda12.onNavigationEvent(objArr, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted4, iOnWarmupCompleted3, 1061247442, -1061247433);
            }
            int i5 = onNavigationEvent + 61;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objOnNavigationEvent;
        }
    }

    public static final /* synthetic */ class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[UtilsKtExternalSyntheticLambda3.values().length];
            try {
                iArr[UtilsKtExternalSyntheticLambda3.deviceIDAndGA.ordinal()] = 1;
                int i = onWarmupCompleted + 85;
                IAuthTabCallback = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UtilsKtExternalSyntheticLambda3.deviceIDOnly.ordinal()] = 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
            int i4 = IAuthTabCallback + 47;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 90 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, int i) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 4 - (b * 4);
        int i4 = i * 2;
        int i5 = 105 - (b2 * 3);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = i4;
            int i8 = 0;
            int i9 = (-i3) + i7;
            int i10 = i6 + 1;
            i2 = i8;
            i5 = i9;
            i3 = i10;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            int i11 = i5;
            i6 = i3;
            i3 = bArr[i3];
            i7 = i11;
            int i92 = (-i3) + i7;
            int i102 = i6 + 1;
            i2 = i8;
            i5 = i92;
            i3 = i102;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i4) {
            }
        }
    }

    static {
        access100 = 0;
        onExtraCallback();
        Companion = new onExtraCallbackWithResult(null);
        int i = IAuthTabCallback_Parcel + 9;
        access100 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Map IAuthTabCallback(AtomicBoolean atomicBoolean, ConcurrentHashMap concurrentHashMap, AtomicLong atomicLong, List list, UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12, trimMetadataStringsTo trimmetadatastringsto, Map map, Map map2, Map map3) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Map mapOnWarmupCompleted = onWarmupCompleted(atomicBoolean, concurrentHashMap, atomicLong, list, utilsKtExternalSyntheticLambda12, trimmetadatastringsto, map, map2, map3);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        int i5 = getInterfaceDescriptor + 53;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return mapOnWarmupCompleted;
    }

    public static /* synthetic */ onExtraCallback IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback onextracallbackICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(function1, obj);
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        return onextracallbackICustomTabsCallbackStubProxy;
    }

    public static /* synthetic */ onExtraCallback IAuthTabCallback(UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12, String str, boolean z, Boolean bool) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback onextracallbackOnExtraCallbackWithResult = onExtraCallbackWithResult(utilsKtExternalSyntheticLambda12, str, z, bool);
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 79;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return onextracallbackOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onUnminimized(function1, obj);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        int i5 = getInterfaceDescriptor + 77;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        readTypedObject(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 105;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ deserializeIp IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipOnRelationshipValidationResult = onRelationshipValidationResult(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 27;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return deserializeipOnRelationshipValidationResult;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            onPostMessage(function1, obj);
            obj2.hashCode();
            throw null;
        }
        deserializeIp deserializeipOnPostMessage = onPostMessage(function1, obj);
        int i3 = IAuthTabCallbackStubProxy + 111;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return deserializeipOnPostMessage;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ RxSharedApiCall access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        RxSharedApiCall rxSharedApiCallICustomTabsCallbackStub = ICustomTabsCallbackStub(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 103;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return rxSharedApiCallICustomTabsCallbackStub;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) onNavigationEvent(new Object[]{th}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), 1913747654, -1913747650);
        }
        throw null;
    }

    public static /* synthetic */ Map access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Map map = (Map) onNavigationEvent(new Object[]{function1, obj}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), -1768245618, 1768245630);
        int i4 = IAuthTabCallbackStubProxy + 19;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(new Object[]{function1, obj}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), 1937635727, -1937635722);
            return;
        }
        onNavigationEvent(new Object[]{function1, obj}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), 1937635727, -1937635722);
        int i3 = 10 / 0;
    }

    public static /* synthetic */ Boolean asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolOnMinimized = onMinimized(function1, obj);
        int i4 = getInterfaceDescriptor + 91;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return boolOnMinimized;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        onExtraCallback onextracallback = (onExtraCallback) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolIAuthTabCallback = IAuthTabCallback(onextracallback);
        int i4 = IAuthTabCallbackStubProxy + 71;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return boolIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 31;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Map onExtraCallback(UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12, List list, boolean z, ConcurrentHashMap concurrentHashMap, Throwable th) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Map mapIAuthTabCallback = IAuthTabCallback(utilsKtExternalSyntheticLambda12, list, z, concurrentHashMap, th);
        int i4 = getInterfaceDescriptor + 17;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return mapIAuthTabCallback;
    }

    public static /* synthetic */ Pair onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Pair pairOnActivityResized = onActivityResized(function1, obj);
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        return pairOnActivityResized;
    }

    public static /* synthetic */ Unit onExtraCallback(UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12, String str, Boolean bool) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(utilsKtExternalSyntheticLambda12, str, bool);
        int i4 = getInterfaceDescriptor + 35;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12, boolean z, ConcurrentHashMap concurrentHashMap, Map map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(utilsKtExternalSyntheticLambda12, z, concurrentHashMap, map);
        int i4 = getInterfaceDescriptor + 33;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ deserializeIp onExtraCallback(writeRaw writeraw) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeip = (deserializeIp) onNavigationEvent(new Object[]{writeraw}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), 246859469, -246859459);
        int i4 = getInterfaceDescriptor + 93;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return deserializeip;
    }

    public static /* synthetic */ Boolean onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return (Boolean) onNavigationEvent(new Object[]{function1, obj}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), -1490543218, 1490543225);
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        Object obj3 = objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(getbacktracenote, obj, obj2, obj3);
        }
        onExtraCallback(getbacktracenote, obj, obj2, obj3);
        throw null;
    }

    public static /* synthetic */ RxSharedApiCall onNavigationEvent(boolean z, UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12, String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        RxSharedApiCall rxSharedApiCallOnExtraCallback = onExtraCallback(z, utilsKtExternalSyntheticLambda12, str, str2, str3);
        int i4 = IAuthTabCallbackStubProxy + 7;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return rxSharedApiCallOnExtraCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = i | i9;
        int i11 = (~(i7 | i)) | i9 | (~(i8 | i));
        int i12 = ~((~i) | i6 | i5);
        int i13 = i6 + i5 + i2 + ((-2027816600) * i4) + ((-1234684791) * i3);
        int i14 = i13 * i13;
        int i15 = (i6 * (-132237830)) + 1711013888 + ((-132237830) * i5) + (i10 * 228444679) + (228444679 * i11) + ((-228444679) * i12) + (96206848 * i2) + (811597824 * i4) + (1100742656 * i3) + (1751056384 * i14);
        int i16 = ((i6 * 572746074) - 905264446) + (i5 * 572746074) + (i10 * (-489)) + (i11 * (-489)) + (i12 * 489) + (i2 * 572745585) + (i4 * 982511336) + (i3 * (-774025351)) + (i14 * 1257177088);
        switch (i15 + (i16 * i16 * 1874919424)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                Function1 function1 = (Function1) objArr[0];
                Object obj = objArr[1];
                int i17 = 2 % 2;
                int i18 = IAuthTabCallbackStubProxy + 121;
                getInterfaceDescriptor = i18 % 128;
                int i19 = i18 % 2;
                Boolean bool = (Boolean) function1.invoke(obj);
                int i20 = IAuthTabCallbackStubProxy + 25;
                getInterfaceDescriptor = i20 % 128;
                int i21 = i20 % 2;
                return bool;
            case 8:
                return IAuthTabCallbackStub(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return onTransact(objArr);
            case 11:
                return access000(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return IAuthTabCallback_Parcel(objArr);
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                return getInterfaceDescriptor(objArr);
            case 15:
                return access100(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(AtomicLong atomicLong, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(atomicLong, deserializeurinullablecollection);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(atomicLong, deserializeurinullablecollection);
        int i3 = getInterfaceDescriptor + 99;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 77 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onNavigationEvent(new Object[]{onextracallback}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), -838000003, 838000014);
        int i4 = IAuthTabCallbackStubProxy + 93;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12, String str, AtomicLong atomicLong, trimMetadataStringsTo trimmetadatastringsto, onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(utilsKtExternalSyntheticLambda12, str, atomicLong, trimmetadatastringsto, onextracallback);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        writeRaw writeraw = (writeRaw) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(writeraw, "");
        int i4 = getInterfaceDescriptor + 123;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return writeraw;
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult(function1, obj);
        int i4 = getInterfaceDescriptor + 121;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Boolean onWarmupCompleted(UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12, String str, boolean z, Ref.BooleanRef booleanRef, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 69;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolOnExtraCallbackWithResult = onExtraCallbackWithResult(utilsKtExternalSyntheticLambda12, str, z, booleanRef, str2);
        int i4 = IAuthTabCallbackStubProxy + 77;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return boolOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        extraCallback(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 27;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return null;
    }

    public static /* synthetic */ Map onWarmupCompleted(List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return (Map) onNavigationEvent(new Object[]{list}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), -1974717570, 1974717583);
        }
        int i3 = 30 / 0;
        return (Map) onNavigationEvent(new Object[]{list}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), -1974717570, 1974717583);
    }

    public static /* synthetic */ Pair onWarmupCompleted(String str, Boolean bool) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Pair pairOnNavigationEvent = onNavigationEvent(str, bool);
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
        return pairOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AtomicLong atomicLong, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onNavigationEvent(new Object[]{atomicLong, deserializeurinullablecollection}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), 2047375548, -2047375540);
        int i4 = getInterfaceDescriptor + 9;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ deserializeIp onWarmupCompleted(UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12, String str, String str2, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipOnExtraCallbackWithResult = onExtraCallbackWithResult(utilsKtExternalSyntheticLambda12, str, str2, th);
        int i4 = getInterfaceDescriptor + 51;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return deserializeipOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onMessageChannelReady(function1, obj);
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
    }

    @Inject
    public UtilsKtExternalSyntheticLambda12(@NotNull UtilsKtExternalSyntheticLambda14 utilsKtExternalSyntheticLambda14, @NotNull UtilsKtExternalSyntheticLambda8 utilsKtExternalSyntheticLambda8, @NotNull UtilsKtExternalSyntheticLambda5 utilsKtExternalSyntheticLambda5, @NotNull setAdUnitIds setadunitids, @NotNull UtilsKtExternalSyntheticLambda7 utilsKtExternalSyntheticLambda7) {
        Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda14, "");
        Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda5, "");
        Intrinsics.checkNotNullParameter(setadunitids, "");
        Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda7, "");
        this.asInterface = utilsKtExternalSyntheticLambda14;
        this.onWarmupCompleted = utilsKtExternalSyntheticLambda8;
        this.IAuthTabCallback = utilsKtExternalSyntheticLambda5;
        this.onTransact = setadunitids;
        this.onExtraCallback = utilsKtExternalSyntheticLambda7;
        this.onNavigationEvent = new ConcurrentHashMap<>();
        this.onExtraCallbackWithResult = new ConcurrentHashMap<>();
        this.IAuthTabCallbackDefault = new ConcurrentHashMap<>();
        this.asBinder = new ConcurrentHashMap<>();
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallbackWithResult.clear();
            this.onNavigationEvent.clear();
            this.IAuthTabCallbackDefault.clear();
            this.asBinder.clear();
            int i3 = 10 / 0;
        } else {
            this.onExtraCallbackWithResult.clear();
            this.onNavigationEvent.clear();
            this.IAuthTabCallbackDefault.clear();
            this.asBinder.clear();
        }
        int i4 = getInterfaceDescriptor + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class IAuthTabCallbackDefault<Upstream, Downstream> implements deserializeUri {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public IAuthTabCallbackDefault(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<Map<String, ? extends Boolean>> apply(writeRaw<BaseApiResponse<Map<String, ? extends Boolean>>> writeraw) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onExtraCallback(new Function1<BaseApiResponse<Map<String, ? extends Boolean>>, deserializeIp<? extends Map<String, ? extends Boolean>>>() { // from class: o.UtilsKtExternalSyntheticLambda12.IAuthTabCallbackDefault.3
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;
                private static int onWarmupCompleted;

                static {
                    int i2 = onNavigationEvent + 75;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                }

                public /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InstantiationException {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 41;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    deserializeIp<? extends Map<String, ? extends Boolean>> deserializeipOnExtraCallback = onExtraCallback((BaseApiResponse) obj);
                    int i5 = onWarmupCompleted + 25;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return deserializeipOnExtraCallback;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final deserializeIp<? extends Map<String, ? extends Boolean>> onExtraCallback(BaseApiResponse<Map<String, ? extends Boolean>> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Object objOnTransact;
                    int i2 = 2 % 2;
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                        if (apiErrorExtraCallbackWithResult == null) {
                            int i3 = onExtraCallback + 87;
                            onWarmupCompleted = i3 % 128;
                            int i4 = i3 % 2;
                            apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                        }
                        return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                    }
                    int i5 = onWarmupCompleted + 65;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        objOnTransact = baseApiResponse.onTransact();
                        int i6 = 49 / 0;
                        if (objOnTransact == null) {
                            int i7 = onExtraCallback + 61;
                            onWarmupCompleted = i7 % 128;
                            if (i7 % 2 != 0) {
                                Map.class.newInstance();
                                throw null;
                            }
                            objOnTransact = Map.class.newInstance();
                        }
                    } else {
                        objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                        }
                    }
                    return writeRaw.onExtraCallback(objOnTransact);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallbackWithResult;
            if (mapConverter != null) {
                int i2 = IAuthTabCallback + 95;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onWarmupCompleted;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            int i4 = IAuthTabCallback + 71;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            int i6 = IAuthTabCallback + 115;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return writerawIAuthTabCallback;
        }
    }

    public static final class IAuthTabCallbackStub<Upstream, Downstream> implements deserializeUri {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public IAuthTabCallbackStub(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallback = mapConverter;
            this.onExtraCallbackWithResult = mapConverter2;
        }

        public final deserializeIp<Boolean> apply(writeRaw<BaseApiResponse<Boolean>> writeraw) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onExtraCallback(new Function1<BaseApiResponse<Boolean>, deserializeIp<? extends Boolean>>() { // from class: o.UtilsKtExternalSyntheticLambda12.IAuthTabCallbackStub.3
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                static {
                    int i2 = IAuthTabCallback + 29;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                }

                public /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InstantiationException {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 55;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    deserializeIp<? extends Boolean> deserializeipOnExtraCallbackWithResult = onExtraCallbackWithResult((BaseApiResponse) obj);
                    int i5 = onNavigationEvent + 37;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return deserializeipOnExtraCallbackWithResult;
                }

                public final deserializeIp<? extends Boolean> onExtraCallbackWithResult(BaseApiResponse<Boolean> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    int i2 = 2 % 2;
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = Boolean.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        int i3 = onNavigationEvent + 123;
                        onExtraCallback = i3 % 128;
                        int i4 = i3 % 2;
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    writeRaw writerawOnExtraCallbackWithResult2 = writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                    int i5 = onExtraCallback + 117;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        return writerawOnExtraCallbackWithResult2;
                    }
                    throw null;
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallbackWithResult;
            if (mapConverter2 != null) {
                int i2 = onNavigationEvent + 125;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            int i4 = onNavigationEvent + 39;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return writerawOnExtraCallbackWithResult;
            }
            throw null;
        }
    }

    public static final class asBinder<Upstream, Downstream> implements deserializeUri {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public asBinder(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.IAuthTabCallback = mapConverter2;
        }

        public final deserializeIp<Boolean> apply(writeRaw<BaseApiResponse<Boolean>> writeraw) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onExtraCallback(new Function1<BaseApiResponse<Boolean>, deserializeIp<? extends Boolean>>() { // from class: o.UtilsKtExternalSyntheticLambda12.asBinder.2
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                static {
                    int i2 = onNavigationEvent + 85;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                }

                public /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InstantiationException {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 69;
                    onExtraCallback = i3 % 128;
                    BaseApiResponse<Boolean> baseApiResponse = (BaseApiResponse) obj;
                    if (i3 % 2 != 0) {
                        IAuthTabCallback(baseApiResponse);
                        throw null;
                    }
                    deserializeIp<? extends Boolean> deserializeipIAuthTabCallback = IAuthTabCallback(baseApiResponse);
                    int i4 = onExtraCallbackWithResult + 27;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return deserializeipIAuthTabCallback;
                }

                public final deserializeIp<? extends Boolean> IAuthTabCallback(BaseApiResponse<Boolean> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    int i2 = 2 % 2;
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    Object obj = null;
                    if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                        if (apiErrorExtraCallbackWithResult == null) {
                            apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                        }
                        writeRaw writerawOnExtraCallbackWithResult2 = writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                        int i3 = onExtraCallback + 71;
                        onExtraCallbackWithResult = i3 % 128;
                        if (i3 % 2 != 0) {
                            return writerawOnExtraCallbackWithResult2;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    int i4 = onExtraCallback + 27;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        baseApiResponse.onTransact();
                        throw null;
                    }
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact == null) {
                        int i5 = onExtraCallback + 21;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        objOnTransact = Boolean.class.newInstance();
                    }
                    return writeRaw.onExtraCallback(objOnTransact);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onWarmupCompleted;
            Object obj = null;
            if (mapConverter != null) {
                int i2 = onExtraCallbackWithResult + 5;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter), "");
                    obj.hashCode();
                    throw null;
                }
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.IAuthTabCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            int i3 = onExtraCallbackWithResult + 115;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                return writerawIAuthTabCallback;
            }
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2), "");
            obj.hashCode();
            throw null;
        }
    }

    public static final class asInterface<Upstream, Downstream> implements deserializeUri {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public asInterface(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<Map<String, ? extends Boolean>> apply(writeRaw<BaseApiResponse<Map<String, ? extends Boolean>>> writeraw) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onExtraCallback(new Function1<BaseApiResponse<Map<String, ? extends Boolean>>, deserializeIp<? extends Map<String, ? extends Boolean>>>() { // from class: o.UtilsKtExternalSyntheticLambda12.asInterface.5
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                static {
                    int i2 = onExtraCallback + 29;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                }

                public /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InstantiationException {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 59;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    deserializeIp<? extends Map<String, ? extends Boolean>> deserializeipOnExtraCallbackWithResult = onExtraCallbackWithResult((BaseApiResponse) obj);
                    int i5 = onNavigationEvent + 67;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        return deserializeipOnExtraCallbackWithResult;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                public final deserializeIp<? extends Map<String, ? extends Boolean>> onExtraCallbackWithResult(BaseApiResponse<Map<String, ? extends Boolean>> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    int i2 = 2 % 2;
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                        if (apiErrorExtraCallbackWithResult == null) {
                            apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                        }
                        writeRaw writerawOnExtraCallbackWithResult2 = writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                        int i3 = onWarmupCompleted + 59;
                        onNavigationEvent = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i4 = 81 / 0;
                        }
                        return writerawOnExtraCallbackWithResult2;
                    }
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact == null) {
                        int i5 = onWarmupCompleted + 5;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        objOnTransact = Map.class.newInstance();
                        int i7 = onWarmupCompleted + 123;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    return writeRaw.onExtraCallback(objOnTransact);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallbackWithResult;
            if (mapConverter != null) {
                int i2 = onNavigationEvent + 21;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onWarmupCompleted;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            int i4 = IAuthTabCallback + 119;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return writerawIAuthTabCallback;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Unit unit;
        AtomicLong atomicLong = (AtomicLong) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            atomicLong.set(System.nanoTime());
            unit = Unit.INSTANCE;
            int i3 = 28 / 0;
        } else {
            atomicLong.set(System.nanoTime());
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallbackStubProxy + 85;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return unit;
    }

    private static final void extraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 71;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12, String str, AtomicLong atomicLong, trimMetadataStringsTo trimmetadatastringsto, onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(utilsKtExternalSyntheticLambda12, str, onextracallback.onExtraCallbackWithResult(), onextracallback.onExtraCallback(), atomicLong.get(), null, null, trimmetadatastringsto, 48, null);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 61;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Boolean IAuthTabCallback(onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            return Boolean.valueOf(onextracallback.onExtraCallbackWithResult());
        }
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Boolean.valueOf(onextracallback.onExtraCallbackWithResult());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Boolean onMinimized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Boolean bool = (Boolean) function1.invoke(obj);
        int i3 = IAuthTabCallbackStubProxy + 57;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 40 / 0;
        }
        return bool;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        final UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12 = (UtilsKtExternalSyntheticLambda12) objArr[0];
        final String str = (String) objArr[1];
        UtilsKtExternalSyntheticLambda3 utilsKtExternalSyntheticLambda3 = (UtilsKtExternalSyntheticLambda3) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda3, "");
        final AtomicLong atomicLong = new AtomicLong(System.nanoTime());
        final trimMetadataStringsTo trimmetadatastringstoOnNavigationEvent = r8lambdaxnlsrUWnZSWLAlZCj_icPo2spk0.onExtraCallbackWithResult.onNavigationEvent();
        writeRaw<onExtraCallback> writerawOnWarmupCompleted = utilsKtExternalSyntheticLambda12.onWarmupCompleted(str, utilsKtExternalSyntheticLambda3);
        final Function1 function1 = new Function1() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda27
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 103;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                AtomicLong atomicLong2 = atomicLong;
                deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) obj;
                if (i4 == 0) {
                    return UtilsKtExternalSyntheticLambda12.onWarmupCompleted(atomicLong2, deserializeurinullablecollection);
                }
                UtilsKtExternalSyntheticLambda12.onWarmupCompleted(atomicLong2, deserializeurinullablecollection);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        };
        writeRaw writerawOnExtraCallback = writerawOnWarmupCompleted.onExtraCallback(new deserializeFloat() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda28
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final void accept(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 55;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                UtilsKtExternalSyntheticLambda12.onTransact(function1, obj);
                if (i4 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        final Function1 function12 = new Function1() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda29
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 121;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = UtilsKtExternalSyntheticLambda12.onNavigationEvent(this.f$0, str, atomicLong, trimmetadatastringstoOnNavigationEvent, (UtilsKtExternalSyntheticLambda12.onExtraCallback) obj);
                int i5 = onWarmupCompleted + 21;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }
        };
        writeRaw writerawOnNavigationEvent = writerawOnExtraCallback.onNavigationEvent(new deserializeFloat() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda30
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final void accept(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 25;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                UtilsKtExternalSyntheticLambda12.getInterfaceDescriptor(function12, obj);
                int i5 = onWarmupCompleted + 57;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        final Function1 function13 = new Function1() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda31
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 25;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Boolean bool = (Boolean) UtilsKtExternalSyntheticLambda12.onNavigationEvent(new Object[]{(UtilsKtExternalSyntheticLambda12.onExtraCallback) obj}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), 657010094, -657010080);
                int i5 = onNavigationEvent + 11;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return bool;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        };
        writeRaw writerawOnWarmupCompleted2 = writerawOnNavigationEvent.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda32
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object apply(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 47;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolAsInterface = UtilsKtExternalSyntheticLambda12.asInterface(function13, obj);
                int i5 = onExtraCallback + 93;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 29 / 0;
                }
                return boolAsInterface;
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted2, "");
        int i2 = IAuthTabCallbackStubProxy + 49;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return writerawOnWarmupCompleted2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final RxSharedApiCall ICustomTabsCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        RxSharedApiCall rxSharedApiCall = (RxSharedApiCall) function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 77;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return rxSharedApiCall;
        }
        throw null;
    }

    private static final void onMessageChannelReady(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 119;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12, String str, Boolean bool) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 115;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            UtilsKtExternalSyntheticLambda7 utilsKtExternalSyntheticLambda7 = utilsKtExternalSyntheticLambda12.onExtraCallback;
            Intrinsics.checkNotNull(bool);
            utilsKtExternalSyntheticLambda7.onExtraCallback(str, bool.booleanValue());
            utilsKtExternalSyntheticLambda12.asBinder.put(str, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.REMOTE);
            return Unit.INSTANCE;
        }
        UtilsKtExternalSyntheticLambda7 utilsKtExternalSyntheticLambda72 = utilsKtExternalSyntheticLambda12.onExtraCallback;
        Intrinsics.checkNotNull(bool);
        utilsKtExternalSyntheticLambda72.onExtraCallback(str, bool.booleanValue());
        utilsKtExternalSyntheticLambda12.asBinder.put(str, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.REMOTE);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final deserializeIp onRelationshipValidationResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        getInterfaceDescriptor = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i3 = getInterfaceDescriptor + 79;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return deserializeip;
        }
        obj2.hashCode();
        throw null;
    }

    private static final deserializeIp onExtraCallbackWithResult(UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12, String str, String str2, Throwable th) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        if (utilsKtExternalSyntheticLambda12.onNavigationEvent(th)) {
            if (Intrinsics.areEqual(utilsKtExternalSyntheticLambda12.IAuthTabCallback(th), "NOT_EXIST")) {
                utilsKtExternalSyntheticLambda12.onExtraCallbackWithResult(str, th);
            }
            utilsKtExternalSyntheticLambda12.onExtraCallback.onExtraCallbackWithResult(str2);
            writeRaw writerawOnExtraCallbackWithResult = writeRaw.onExtraCallbackWithResult(th);
            Intrinsics.checkNotNull(writerawOnExtraCallbackWithResult);
            int i2 = getInterfaceDescriptor + 121;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 99 / 0;
            }
            return writerawOnExtraCallbackWithResult;
        }
        Boolean boolOnExtraCallback = utilsKtExternalSyntheticLambda12.onExtraCallback.onExtraCallback(str2);
        if (boolOnExtraCallback != null) {
            utilsKtExternalSyntheticLambda12.asBinder.put(str2, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.PERSISTENT_CACHE);
            writeRaw writerawOnExtraCallback = writeRaw.onExtraCallback(boolOnExtraCallback);
            if (writerawOnExtraCallback != null) {
                int i4 = getInterfaceDescriptor + 73;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                return writerawOnExtraCallback;
            }
        }
        writeRaw writerawOnExtraCallbackWithResult2 = writeRaw.onExtraCallbackWithResult(th);
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult2, "");
        int i6 = getInterfaceDescriptor + 99;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return writerawOnExtraCallbackWithResult2;
    }

    private static final RxSharedApiCall onExtraCallback(boolean z, final UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12, final String str, final String str2, String str3) {
        writeRaw writerawIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str3, "");
        if (z) {
            writeRaw<BaseApiResponse<Boolean>> writerawOnExtraCallback = utilsKtExternalSyntheticLambda12.asInterface.onExtraCallback(str);
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writerawIAuthTabCallback = writerawOnExtraCallback.IAuthTabCallback(new asBinder(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            int i4 = getInterfaceDescriptor + 101;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        } else {
            writeRaw<BaseApiResponse<Boolean>> writerawIAuthTabCallback2 = utilsKtExternalSyntheticLambda12.asInterface.IAuthTabCallback(str);
            MapConverter mapConverterOnExtraCallback2 = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback2, "");
            writerawIAuthTabCallback = writerawIAuthTabCallback2.IAuthTabCallback(new IAuthTabCallbackStub(mapConverterOnExtraCallback2, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        }
        final Function1 function1 = new Function1() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda6
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i6 = 2 % 2;
                int i7 = onNavigationEvent + 37;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    UtilsKtExternalSyntheticLambda12.onExtraCallback(this.f$0, str2, (Boolean) obj);
                    throw null;
                }
                Unit unitOnExtraCallback = UtilsKtExternalSyntheticLambda12.onExtraCallback(this.f$0, str2, (Boolean) obj);
                int i8 = onExtraCallback + 69;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return unitOnExtraCallback;
            }
        };
        writeRaw writerawOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(new deserializeFloat() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda7
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final void accept(Object obj) {
                int i6 = 2 % 2;
                int i7 = onNavigationEvent + 3;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                UtilsKtExternalSyntheticLambda12.onWarmupCompleted(function1, obj);
                int i9 = onNavigationEvent + 125;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 62 / 0;
                }
            }
        });
        final Function1 function12 = new Function1() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda8
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) throws Throwable {
                int i6 = 2 % 2;
                int i7 = onNavigationEvent + 107;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                deserializeIp deserializeipOnWarmupCompleted = UtilsKtExternalSyntheticLambda12.onWarmupCompleted(this.f$0, str, str2, (Throwable) obj);
                int i9 = onNavigationEvent + 33;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 99 / 0;
                }
                return deserializeipOnWarmupCompleted;
            }
        };
        writeRaw writerawAsBinder = writerawOnNavigationEvent.asBinder(new deserializeIntNullableCollection() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object apply(Object obj) {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 9;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                deserializeIp deserializeipIAuthTabCallbackStubProxy = UtilsKtExternalSyntheticLambda12.IAuthTabCallbackStubProxy(function12, obj);
                int i9 = IAuthTabCallback + 23;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 != 0) {
                    return deserializeipIAuthTabCallbackStubProxy;
                }
                throw null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawAsBinder, "");
        return RxSharedApiCall.Companion.onWarmupCompleted(RxSharedApiCall.Companion, "tubaDistributionApi", writerawAsBinder, null, null, 12, null);
    }

    private static final onExtraCallback ICustomTabsCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        onExtraCallback onextracallback = (onExtraCallback) function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 25;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return onextracallback;
    }

    private static final onExtraCallback onExtraCallbackWithResult(UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12, String str, boolean z, Boolean bool) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bool, "");
        onExtraCallback onextracallback = new onExtraCallback(bool.booleanValue(), (r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg) onNavigationEvent(new Object[]{utilsKtExternalSyntheticLambda12, str, Boolean.valueOf(z)}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), -1017588629, 1017588632));
        int i2 = IAuthTabCallbackStubProxy + 17;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return onextracallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if ((r3 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        r1 = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        r3 = r20.IAuthTabCallbackDefault.get(r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r3 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        r1 = o.UtilsKtExternalSyntheticLambda12.IAuthTabCallbackStubProxy + 43;
        o.UtilsKtExternalSyntheticLambda12.getInterfaceDescriptor = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if ((r1 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        r1 = o.writeRaw.onExtraCallbackWithResult(r3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r2 = 21 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        r1 = o.writeRaw.onExtraCallbackWithResult(r3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r2 = onExtraCallback(r22);
        r3 = onExtraCallbackWithResult(r21, r2);
        r6 = r20.asBinder.containsKey(r3);
        r7 = r20.onNavigationEvent;
        r9 = new im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda2(r2, r20, r21, r3);
        r1 = r7.computeIfAbsent(r3, new im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda3(r9));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r15 = o.setApTextSize.onNavigationEvent.4.onNavigationEvent();
        r13 = o.setApTextSize.onNavigationEvent.4.onNavigationEvent();
        r19 = o.setApTextSize.onNavigationEvent.4.onNavigationEvent();
        r1 = (o.writeRaw) im.toss.core.cache.RxSharedApiCall.onExtraCallback(r13, o.setApTextSize.onNavigationEvent.4.onNavigationEvent(), r15, -939077752, 939077756, new java.lang.Object[]{r1, null, null, false, 7, null}, r19);
        r4 = new im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda4(r20, r3, r6);
        r1 = r1.onWarmupCompleted(new im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda5(r4));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r1 = o.writeRaw.onExtraCallback(new o.UtilsKtExternalSyntheticLambda12.onExtraCallback(r3.booleanValue(), o.r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.CONFIGURED));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r3 = o.UtilsKtExternalSyntheticLambda12.IAuthTabCallbackStubProxy + 75;
        o.UtilsKtExternalSyntheticLambda12.getInterfaceDescriptor = r3 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final writeRaw<onExtraCallback> onWarmupCompleted(final String str, UtilsKtExternalSyntheticLambda3 utilsKtExternalSyntheticLambda3) throws NoWhenBranchMatchedException {
        Boolean boolOnNavigationEvent;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            boolOnNavigationEvent = onNavigationEvent(str);
            int i3 = 48 / 0;
        } else {
            boolOnNavigationEvent = onNavigationEvent(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(IAuthTabCallbackStub)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - KeyEvent.keyCodeFromString("")), 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 10278 - Gravity.getAbsoluteGravity(0, 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 55 - Color.blue(0), 2167 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i7 = $10 + 119;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i9 = $11 + 107;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i11 = $10 + 107;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i13 = $10 + 55;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[i << simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 55, ImageFormat.getBitsPerPixel(0) + 2168, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 54, 16779383 + Color.rgb(0, 0, 0), 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                int i14 = $11 + 23;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 3 / 2;
                }
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(@NotNull String str, @NotNull UtilsKtExternalSyntheticLambda3 utilsKtExternalSyntheticLambda3, @NotNull access13800<? super Boolean> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        long jNanoTime;
        trimMetadataStringsTo trimmetadatastringstoOnNavigationEvent;
        String str2;
        String str3;
        trimMetadataStringsTo trimmetadatastringsto;
        long j;
        Object obj;
        trimMetadataStringsTo trimmetadatastringsto2;
        long j2;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            int i2 = getInterfaceDescriptor + 31;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i4 = iAuthTabCallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i4 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object objOnWarmupCompleted = iAuthTabCallback.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i5 = iAuthTabCallback.label;
        try {
            if (i5 == 0) {
                ResultKt.onNavigationEvent(objOnWarmupCompleted);
                jNanoTime = System.nanoTime();
                trimmetadatastringstoOnNavigationEvent = r8lambdaxnlsrUWnZSWLAlZCj_icPo2spk0.onExtraCallbackWithResult.onNavigationEvent();
                try {
                    Result.Companion companion = kotlin.Result.Companion;
                    writeRaw writeraw = (writeRaw) onNavigationEvent(new Object[]{this, str, utilsKtExternalSyntheticLambda3}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), 137562224, -137562224);
                    str2 = str;
                    try {
                        iAuthTabCallback.L$0 = str2;
                        iAuthTabCallback.L$1 = access15400.onNavigationEvent(utilsKtExternalSyntheticLambda3);
                        iAuthTabCallback.L$2 = trimmetadatastringstoOnNavigationEvent;
                        iAuthTabCallback.L$3 = access15400.onNavigationEvent(iAuthTabCallback);
                        iAuthTabCallback.J$0 = jNanoTime;
                        iAuthTabCallback.I$0 = 0;
                        iAuthTabCallback.I$1 = 0;
                        iAuthTabCallback.label = 1;
                        objOnWarmupCompleted = RxAwaitKt.onWarmupCompleted(writeraw, iAuthTabCallback);
                        if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                            return objOnWarmupCompleted2;
                        }
                        trimmetadatastringsto = trimmetadatastringstoOnNavigationEvent;
                        j = jNanoTime;
                        str3 = str2;
                    } catch (Exception e) {
                        e = e;
                        str3 = str2;
                        Result.Companion companion2 = kotlin.Result.Companion;
                        obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e));
                        trimmetadatastringsto2 = trimmetadatastringstoOnNavigationEvent;
                        j2 = jNanoTime;
                        String str4 = str3;
                        if (kotlin.Result.exceptionOrNull-impl(obj) == null) {
                        }
                    } catch (WebResourceResponseModel e2) {
                        e = e2;
                        str3 = str2;
                        Result.Companion companion3 = kotlin.Result.Companion;
                        obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e));
                        trimmetadatastringsto2 = trimmetadatastringstoOnNavigationEvent;
                        j2 = jNanoTime;
                        String str42 = str3;
                        if (kotlin.Result.exceptionOrNull-impl(obj) == null) {
                        }
                    }
                } catch (WebResourceResponseModel e3) {
                    e = e3;
                    str2 = str;
                } catch (Exception e4) {
                    e = e4;
                    str2 = str;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = IAuthTabCallbackStubProxy + 85;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
                j = iAuthTabCallback.J$0;
                trimmetadatastringsto = (trimMetadataStringsTo) iAuthTabCallback.L$2;
                str3 = (String) iAuthTabCallback.L$0;
                try {
                    ResultKt.onNavigationEvent(objOnWarmupCompleted);
                } catch (Exception e5) {
                    e = e5;
                    jNanoTime = j;
                    trimmetadatastringstoOnNavigationEvent = trimmetadatastringsto;
                    Result.Companion companion22 = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e));
                    trimmetadatastringsto2 = trimmetadatastringstoOnNavigationEvent;
                    j2 = jNanoTime;
                    String str422 = str3;
                    if (kotlin.Result.exceptionOrNull-impl(obj) == null) {
                    }
                } catch (WebResourceResponseModel e6) {
                    e = e6;
                    jNanoTime = j;
                    trimmetadatastringstoOnNavigationEvent = trimmetadatastringsto;
                    Result.Companion companion32 = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e));
                    trimmetadatastringsto2 = trimmetadatastringstoOnNavigationEvent;
                    j2 = jNanoTime;
                    String str4222 = str3;
                    if (kotlin.Result.exceptionOrNull-impl(obj) == null) {
                    }
                }
            }
            obj = kotlin.Result.constructor-impl(objOnWarmupCompleted);
            int i8 = IAuthTabCallbackStubProxy + 17;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
            j2 = j;
            trimmetadatastringsto2 = trimmetadatastringsto;
            String str42222 = str3;
            if (kotlin.Result.exceptionOrNull-impl(obj) == null) {
                return obj;
            }
            onExtraCallbackWithResult(this, str42222, false, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.DECLARED_DEFAULT, j2, access14000.onNavigationEvent(false), null, trimmetadatastringsto2, 32, null);
            Boolean boolOnNavigationEvent = access14000.onNavigationEvent(false);
            int i10 = getInterfaceDescriptor + 47;
            IAuthTabCallbackStubProxy = i10 % 128;
            int i11 = i10 % 2;
            return boolOnNavigationEvent;
        } catch (CancellationException e7) {
            throw e7;
        }
    }

    private static final Pair onActivityResized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (Pair) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Pair onNavigationEvent(String str, Boolean bool) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bool, "");
            getWrite.IAuthTabCallback(str, bool);
            throw null;
        }
        Intrinsics.checkNotNullParameter(bool, "");
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(str, bool);
        int i3 = IAuthTabCallbackStubProxy + 55;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 70 / 0;
        }
        return pairIAuthTabCallback;
    }

    private static final deserializeIp onPostMessage(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 97;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return deserializeip;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        List list = (List) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
            return access8100.onExtraCallbackWithResult(list);
        }
        Intrinsics.checkNotNullParameter(list, "");
        access8100.onExtraCallbackWithResult(list);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Map map = (Map) function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 55;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    private static final void readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 9;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12, boolean z, ConcurrentHashMap concurrentHashMap, Map map) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(map);
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Boolean bool = (Boolean) entry.getValue();
                boolean zBooleanValue = bool.booleanValue();
                String strOnExtraCallbackWithResult = utilsKtExternalSyntheticLambda12.onExtraCallbackWithResult(str, z);
                ConcurrentHashMap<String, RxSharedApiCall<Boolean>> concurrentHashMap2 = utilsKtExternalSyntheticLambda12.onNavigationEvent;
                RxSharedApiCall.Companion companion = RxSharedApiCall.Companion;
                writeRaw writerawOnExtraCallback = writeRaw.onExtraCallback(bool);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallback, "");
                concurrentHashMap2.putIfAbsent(strOnExtraCallbackWithResult, RxSharedApiCall.Companion.onWarmupCompleted(companion, "tubaDistributionApi", writerawOnExtraCallback, null, null, 12, null));
                utilsKtExternalSyntheticLambda12.onExtraCallback.onExtraCallback(strOnExtraCallbackWithResult, zBooleanValue);
                r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg r8lambdaimi1kkyy494wcpjbjziyxabnqtg = r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.REMOTE;
                concurrentHashMap.put(str, r8lambdaimi1kkyy494wcpjbjziyxabnqtg);
                utilsKtExternalSyntheticLambda12.asBinder.put(strOnExtraCallbackWithResult, r8lambdaimi1kkyy494wcpjbjziyxabnqtg);
            }
            Unit unit = Unit.INSTANCE;
            int i3 = getInterfaceDescriptor + 57;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        Intrinsics.checkNotNull(map);
        map.entrySet().iterator();
        throw null;
    }

    private static final Map onExtraCallback(getBacktraceNote getbacktracenote, Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            Intrinsics.checkNotNullParameter(obj3, "");
            return (Map) getbacktracenote.invoke(obj, obj2, obj3);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        Map map = (Map) getbacktracenote.invoke(obj, obj2, obj3);
        int i3 = 57 / 0;
        return map;
    }

    private static final Map onWarmupCompleted(AtomicBoolean atomicBoolean, ConcurrentHashMap concurrentHashMap, AtomicLong atomicLong, List list, UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12, trimMetadataStringsTo trimmetadatastringsto, Map map, Map map2, Map map3) {
        Iterator it;
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(map3, "");
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(access8100.onWarmupCompleted(map, map2), map3);
        if (atomicBoolean.compareAndSet(false, true)) {
            int i2 = getInterfaceDescriptor + 95;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                it = mapOnWarmupCompleted.entrySet().iterator();
                int i3 = 66 / 0;
            } else {
                it = mapOnWarmupCompleted.entrySet().iterator();
            }
            while (it.hasNext()) {
                int i4 = IAuthTabCallbackStubProxy + 93;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg r8lambdaimi1kkyy494wcpjbjziyxabnqtg = (r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg) concurrentHashMap.get(str);
                if (r8lambdaimi1kkyy494wcpjbjziyxabnqtg == null) {
                    r8lambdaimi1kkyy494wcpjbjziyxabnqtg = r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.UNKNOWN;
                }
                r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg r8lambdaimi1kkyy494wcpjbjziyxabnqtg2 = r8lambdaimi1kkyy494wcpjbjziyxabnqtg;
                long j = atomicLong.get();
                int size = list.size();
                if (concurrentHashMap.get(str) == r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.DECLARED_DEFAULT) {
                    obj = Boolean.FALSE;
                    int i6 = IAuthTabCallbackStubProxy + 113;
                    getInterfaceDescriptor = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    obj = ALCFaceSDK12.onNavigationEvent;
                }
                utilsKtExternalSyntheticLambda12.IAuthTabCallback(str, zBooleanValue, r8lambdaimi1kkyy494wcpjbjziyxabnqtg2, j, obj, Integer.valueOf(size), trimmetadatastringsto);
            }
        }
        int i8 = IAuthTabCallbackStubProxy + 89;
        getInterfaceDescriptor = i8 % 128;
        int i9 = i8 % 2;
        return mapOnWarmupCompleted;
    }

    private static final Unit IAuthTabCallback(AtomicLong atomicLong, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        atomicLong.set(System.nanoTime());
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 33;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 71;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public final writeRaw<Map<String, Boolean>> onExtraCallbackWithResult(@NotNull final List<String> list, @NotNull UtilsKtExternalSyntheticLambda3 utilsKtExternalSyntheticLambda3) throws NoWhenBranchMatchedException {
        writeRaw writerawOnExtraCallback;
        writeRaw writerawOnExtraCallback2;
        writeRaw writerawIAuthTabCallback;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 25;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda3, "");
            list.isEmpty();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda3, "");
        if (list.isEmpty()) {
            writeRaw<Map<String, Boolean>> writerawOnExtraCallback3 = writeRaw.onExtraCallback(access8100.onNavigationEvent());
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallback3, "");
            return writerawOnExtraCallback3;
        }
        final AtomicLong atomicLong = new AtomicLong(System.nanoTime());
        final trimMetadataStringsTo trimmetadatastringstoOnNavigationEvent = r8lambdaxnlsrUWnZSWLAlZCj_icPo2spk0.onExtraCallbackWithResult.onNavigationEvent();
        boolean z = false;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final boolean zOnExtraCallback = onExtraCallback(utilsKtExternalSyntheticLambda3);
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        for (final String str : list) {
            Boolean boolOnNavigationEvent = onNavigationEvent(str);
            if (boolOnNavigationEvent != null) {
                linkedHashMap.put(str, boolOnNavigationEvent);
                concurrentHashMap.put(str, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.CONFIGURED);
            } else if (this.IAuthTabCallbackDefault.containsKey(str)) {
                linkedHashMap.put(str, Boolean.FALSE);
                concurrentHashMap.put(str, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.DECLARED_DEFAULT);
            } else {
                RxSharedApiCall<Boolean> rxSharedApiCall = this.onNavigationEvent.get(onExtraCallbackWithResult(str, zOnExtraCallback));
                if (rxSharedApiCall != null) {
                    Object[] objArr = {rxSharedApiCall, null, null, Boolean.valueOf(z), 7, null};
                    int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                    writeRaw writeraw = (writeRaw) RxSharedApiCall.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, -939077752, 939077756, objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent());
                    final Function1 function1 = new Function1() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda10
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2) {
                            int i4 = 2 % 2;
                            int i5 = onNavigationEvent + 57;
                            onExtraCallbackWithResult = i5 % 128;
                            int i6 = i5 % 2;
                            Pair pairOnWarmupCompleted = UtilsKtExternalSyntheticLambda12.onWarmupCompleted(str, (Boolean) obj2);
                            int i7 = onExtraCallbackWithResult + 115;
                            onNavigationEvent = i7 % 128;
                            if (i7 % 2 == 0) {
                                int i8 = 93 / 0;
                            }
                            return pairOnWarmupCompleted;
                        }
                    };
                    writeRaw writerawOnWarmupCompleted = writeraw.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda14
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object apply(Object obj2) {
                            int i4 = 2 % 2;
                            int i5 = onNavigationEvent + 43;
                            onExtraCallbackWithResult = i5 % 128;
                            int i6 = i5 % 2;
                            Pair pairOnExtraCallback = UtilsKtExternalSyntheticLambda12.onExtraCallback(function1, obj2);
                            int i7 = onNavigationEvent + 69;
                            onExtraCallbackWithResult = i7 % 128;
                            if (i7 % 2 != 0) {
                                return pairOnExtraCallback;
                            }
                            throw null;
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
                    arrayList.add(writerawOnWarmupCompleted);
                    concurrentHashMap.put(str, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.SESSION_CACHE);
                    int i4 = getInterfaceDescriptor + 57;
                    IAuthTabCallbackStubProxy = i4 % 128;
                    i = 2;
                    int i5 = i4 % 2;
                } else {
                    i = 2;
                    arrayList2.add(str);
                }
                z = false;
            }
        }
        writeRaw writerawOnExtraCallback4 = writeRaw.onExtraCallback(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallback4, "");
        if (arrayList.isEmpty()) {
            writerawOnExtraCallback = writeRaw.onExtraCallback(access8100.onNavigationEvent());
            Intrinsics.checkNotNull(writerawOnExtraCallback);
        } else {
            getByteBuffer getbytebufferOnExtraCallback = getByteBuffer.onExtraCallback(arrayList);
            final Function1 function12 = new Function1() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda15
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2) {
                    int i6 = 2 % 2;
                    int i7 = onNavigationEvent + 19;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    deserializeIp deserializeipOnExtraCallback = UtilsKtExternalSyntheticLambda12.onExtraCallback((writeRaw) obj2);
                    if (i8 == 0) {
                        int i9 = 66 / 0;
                    }
                    int i10 = onExtraCallbackWithResult + 15;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    return deserializeipOnExtraCallback;
                }
            };
            writeRaw writerawWriteTypedObject = getbytebufferOnExtraCallback.IAuthTabCallbackDefault(new deserializeIntNullableCollection() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda16
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object apply(Object obj2) {
                    deserializeIp deserializeipIAuthTabCallback_Parcel;
                    int i6 = 2 % 2;
                    int i7 = onNavigationEvent + 69;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 != 0) {
                        deserializeipIAuthTabCallback_Parcel = UtilsKtExternalSyntheticLambda12.IAuthTabCallback_Parcel(function12, obj2);
                        int i8 = 85 / 0;
                    } else {
                        deserializeipIAuthTabCallback_Parcel = UtilsKtExternalSyntheticLambda12.IAuthTabCallback_Parcel(function12, obj2);
                    }
                    int i9 = onWarmupCompleted + 3;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 82 / 0;
                    }
                    return deserializeipIAuthTabCallback_Parcel;
                }
            }).writeTypedObject();
            final Function1 function13 = new Function1() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda17
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2) {
                    int i6 = 2 % 2;
                    int i7 = IAuthTabCallback + 101;
                    onNavigationEvent = i7 % 128;
                    List list2 = (List) obj2;
                    if (i7 % 2 == 0) {
                        UtilsKtExternalSyntheticLambda12.onWarmupCompleted(list2);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    Map mapOnWarmupCompleted = UtilsKtExternalSyntheticLambda12.onWarmupCompleted(list2);
                    int i8 = onNavigationEvent + 85;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return mapOnWarmupCompleted;
                }
            };
            writerawOnExtraCallback = writerawWriteTypedObject.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda18
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object apply(Object obj2) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 63;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    Map mapAccess100 = UtilsKtExternalSyntheticLambda12.access100(function13, obj2);
                    int i9 = onWarmupCompleted + 115;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        return mapAccess100;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
            Intrinsics.checkNotNull(writerawOnExtraCallback);
        }
        writeRaw writeraw2 = writerawOnExtraCallback;
        if (arrayList2.isEmpty()) {
            writerawOnExtraCallback2 = writeRaw.onExtraCallback(access8100.onNavigationEvent());
            Intrinsics.checkNotNull(writerawOnExtraCallback2);
        } else {
            DistributionRequestBody distributionRequestBody = new DistributionRequestBody(arrayList2);
            if (zOnExtraCallback) {
                writeRaw<BaseApiResponse<Map<String, Boolean>>> writerawOnWarmupCompleted2 = this.asInterface.onWarmupCompleted(distributionRequestBody);
                MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
                Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
                writerawIAuthTabCallback = writerawOnWarmupCompleted2.IAuthTabCallback(new asInterface(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            } else {
                writeRaw<BaseApiResponse<Map<String, Boolean>>> writerawOnExtraCallback5 = this.asInterface.onExtraCallback(distributionRequestBody);
                MapConverter mapConverterOnExtraCallback2 = clearTid.onExtraCallback();
                Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback2, "");
                writerawIAuthTabCallback = writerawOnExtraCallback5.IAuthTabCallback(new IAuthTabCallbackDefault(mapConverterOnExtraCallback2, NetConverter3.onExtraCallback()));
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            }
            final Function1 function14 = new Function1() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda19
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 83;
                    onNavigationEvent = i7 % 128;
                    Object obj3 = null;
                    if (i7 % 2 != 0) {
                        UtilsKtExternalSyntheticLambda12.onExtraCallback(this.f$0, zOnExtraCallback, concurrentHashMap, (Map) obj2);
                        obj3.hashCode();
                        throw null;
                    }
                    Unit unitOnExtraCallback = UtilsKtExternalSyntheticLambda12.onExtraCallback(this.f$0, zOnExtraCallback, concurrentHashMap, (Map) obj2);
                    int i8 = onExtraCallback + 9;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    obj3.hashCode();
                    throw null;
                }
            };
            writerawOnExtraCallback2 = writerawIAuthTabCallback.onNavigationEvent(new deserializeFloat() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda20
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final void accept(Object obj2) {
                    int i6 = 2 % 2;
                    int i7 = onNavigationEvent + 27;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    UtilsKtExternalSyntheticLambda12.IAuthTabCallbackStub(function14, obj2);
                    if (i8 == 0) {
                        throw null;
                    }
                }
            }).asInterface(new deserializeIntNullableCollection() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda21
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object apply(Object obj2) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallbackWithResult + 103;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    Map mapOnExtraCallback = UtilsKtExternalSyntheticLambda12.onExtraCallback(this.f$0, arrayList2, zOnExtraCallback, concurrentHashMap, (Throwable) obj2);
                    int i9 = onExtraCallbackWithResult + 113;
                    IAuthTabCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 39 / 0;
                    }
                    return mapOnExtraCallback;
                }
            });
            Intrinsics.checkNotNull(writerawOnExtraCallback2);
            int i6 = getInterfaceDescriptor + 91;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % i;
        }
        final getBacktraceNote getbacktracenote = new getBacktraceNote() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda22
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int i8 = 2 % 2;
                int i9 = onExtraCallbackWithResult + 49;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                Map mapIAuthTabCallback = UtilsKtExternalSyntheticLambda12.IAuthTabCallback(atomicBoolean, concurrentHashMap, atomicLong, list, this, trimmetadatastringstoOnNavigationEvent, (Map) obj2, (Map) obj3, (Map) obj4);
                int i11 = onExtraCallback + 55;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 == 0) {
                    return mapIAuthTabCallback;
                }
                throw null;
            }
        };
        writeRaw writerawIAuthTabCallback2 = writeRaw.IAuthTabCallback(writerawOnExtraCallback4, writeraw2, writerawOnExtraCallback2, new deserializeLong() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda11
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object apply(Object obj2, Object obj3, Object obj4) {
                int i8 = 2 % 2;
                int i9 = onExtraCallback + 85;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                Map map = (Map) UtilsKtExternalSyntheticLambda12.onNavigationEvent(new Object[]{getbacktracenote, obj2, obj3, obj4}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), 934008392, -934008390);
                int i11 = onExtraCallback + 51;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 != 0) {
                    return map;
                }
                Object obj5 = null;
                obj5.hashCode();
                throw null;
            }
        });
        final Function1 function15 = new Function1() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda12
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj2) {
                int i8 = 2 % 2;
                int i9 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnNavigationEvent = UtilsKtExternalSyntheticLambda12.onNavigationEvent(atomicLong, (deserializeUriNullableCollection) obj2);
                int i11 = IAuthTabCallback + 5;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 != 0) {
                    return unitOnNavigationEvent;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        };
        writeRaw<Map<String, Boolean>> writerawOnExtraCallback6 = writerawIAuthTabCallback2.onExtraCallback(new deserializeFloat() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda13
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final void accept(Object obj2) {
                int i8 = 2 % 2;
                int i9 = onExtraCallbackWithResult + 123;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                Function1 function16 = function15;
                if (i10 != 0) {
                    UtilsKtExternalSyntheticLambda12.onNavigationEvent(new Object[]{function16, obj2}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), -1786513482, 1786513483);
                    return;
                }
                UtilsKtExternalSyntheticLambda12.onNavigationEvent(new Object[]{function16, obj2}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), -1786513482, 1786513483);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallback6, "");
        return writerawOnExtraCallback6;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws NoWhenBranchMatchedException {
        onNavigationEvent onnavigationevent;
        long jNanoTime;
        trimMetadataStringsTo trimmetadatastringstoOnNavigationEvent;
        trimMetadataStringsTo trimmetadatastringsto;
        Object obj;
        List<String> list;
        trimMetadataStringsTo trimmetadatastringsto2;
        UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12 = (UtilsKtExternalSyntheticLambda12) objArr[0];
        List<String> list2 = (List) objArr[1];
        UtilsKtExternalSyntheticLambda3 utilsKtExternalSyntheticLambda3 = (UtilsKtExternalSyntheticLambda3) objArr[2];
        onNavigationEvent onnavigationevent2 = (access13800) objArr[3];
        int i = 2 % 2;
        if (onnavigationevent2 instanceof onNavigationEvent) {
            onnavigationevent = onnavigationevent2;
            int i2 = onnavigationevent.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = IAuthTabCallbackStubProxy + 11;
                getInterfaceDescriptor = i3 % 128;
                if (i3 % 2 == 0) {
                    onnavigationevent.label = i2 >>> Integer.MIN_VALUE;
                } else {
                    onnavigationevent.label = i2 - 2147483648;
                }
            } else {
                onnavigationevent = utilsKtExternalSyntheticLambda12.new onNavigationEvent(onnavigationevent2);
            }
        }
        Object obj2 = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = onnavigationevent.label;
        try {
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj2);
                jNanoTime = System.nanoTime();
                trimmetadatastringstoOnNavigationEvent = r8lambdaxnlsrUWnZSWLAlZCj_icPo2spk0.onExtraCallbackWithResult.onNavigationEvent();
                try {
                    Result.Companion companion = kotlin.Result.Companion;
                    writeRaw<Map<String, Boolean>> writerawOnExtraCallbackWithResult = utilsKtExternalSyntheticLambda12.onExtraCallbackWithResult(list2, utilsKtExternalSyntheticLambda3);
                    onnavigationevent.L$0 = list2;
                    onnavigationevent.L$1 = access15400.onNavigationEvent(utilsKtExternalSyntheticLambda3);
                    onnavigationevent.L$2 = trimmetadatastringstoOnNavigationEvent;
                    onnavigationevent.L$3 = access15400.onNavigationEvent(onnavigationevent);
                    onnavigationevent.J$0 = jNanoTime;
                    onnavigationevent.I$0 = 0;
                    onnavigationevent.I$1 = 0;
                    onnavigationevent.label = 1;
                    Object objOnWarmupCompleted2 = RxAwaitKt.onWarmupCompleted(writerawOnExtraCallbackWithResult, onnavigationevent);
                    if (objOnWarmupCompleted2 == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    trimmetadatastringsto = trimmetadatastringstoOnNavigationEvent;
                    obj2 = objOnWarmupCompleted2;
                } catch (WebResourceResponseModel e) {
                    e = e;
                    Result.Companion companion2 = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e));
                    list = list2;
                    trimmetadatastringsto2 = trimmetadatastringstoOnNavigationEvent;
                    long j = jNanoTime;
                    if (kotlin.Result.exceptionOrNull-impl(obj) == null) {
                    }
                } catch (Exception e2) {
                    e = e2;
                    Result.Companion companion3 = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e));
                    list = list2;
                    trimmetadatastringsto2 = trimmetadatastringstoOnNavigationEvent;
                    long j2 = jNanoTime;
                    if (kotlin.Result.exceptionOrNull-impl(obj) == null) {
                    }
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j3 = onnavigationevent.J$0;
                trimmetadatastringsto = (trimMetadataStringsTo) onnavigationevent.L$2;
                List<String> list3 = (List) onnavigationevent.L$0;
                try {
                    ResultKt.onNavigationEvent(obj2);
                    jNanoTime = j3;
                    list2 = list3;
                } catch (Exception e3) {
                    e = e3;
                    jNanoTime = j3;
                    list2 = list3;
                    trimmetadatastringstoOnNavigationEvent = trimmetadatastringsto;
                    Result.Companion companion32 = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e));
                    list = list2;
                    trimmetadatastringsto2 = trimmetadatastringstoOnNavigationEvent;
                    long j22 = jNanoTime;
                    if (kotlin.Result.exceptionOrNull-impl(obj) == null) {
                    }
                } catch (WebResourceResponseModel e4) {
                    e = e4;
                    jNanoTime = j3;
                    list2 = list3;
                    trimmetadatastringstoOnNavigationEvent = trimmetadatastringsto;
                    Result.Companion companion22 = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e));
                    list = list2;
                    trimmetadatastringsto2 = trimmetadatastringstoOnNavigationEvent;
                    long j222 = jNanoTime;
                    if (kotlin.Result.exceptionOrNull-impl(obj) == null) {
                    }
                }
            }
            try {
                obj = kotlin.Result.constructor-impl(obj2);
                list = list2;
                trimmetadatastringsto2 = trimmetadatastringsto;
            } catch (Exception e5) {
                e = e5;
                trimmetadatastringstoOnNavigationEvent = trimmetadatastringsto;
                Result.Companion companion322 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e));
                list = list2;
                trimmetadatastringsto2 = trimmetadatastringstoOnNavigationEvent;
                long j2222 = jNanoTime;
                if (kotlin.Result.exceptionOrNull-impl(obj) == null) {
                }
            } catch (WebResourceResponseModel e6) {
                e = e6;
                trimmetadatastringstoOnNavigationEvent = trimmetadatastringsto;
                Result.Companion companion222 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e));
                list = list2;
                trimmetadatastringsto2 = trimmetadatastringstoOnNavigationEvent;
                long j22222 = jNanoTime;
                if (kotlin.Result.exceptionOrNull-impl(obj) == null) {
                }
            }
            long j222222 = jNanoTime;
            if (kotlin.Result.exceptionOrNull-impl(obj) == null) {
                return obj;
            }
            int i5 = IAuthTabCallbackStubProxy + 33;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                int i7 = IAuthTabCallbackStubProxy + 55;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
                utilsKtExternalSyntheticLambda12.IAuthTabCallback((String) it.next(), false, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.DECLARED_DEFAULT, j222222, access14000.onNavigationEvent(false), access14000.onNavigationEvent(list.size()), trimmetadatastringsto2);
            }
            return access8100.onNavigationEvent();
        } catch (CancellationException e7) {
            throw e7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        return java.lang.Boolean.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r6.element = true;
        r4 = o.UtilsKtExternalSyntheticLambda12.getInterfaceDescriptor + 29;
        o.UtilsKtExternalSyntheticLambda12.IAuthTabCallbackStubProxy = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Boolean onExtraCallbackWithResult(UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12, String str, boolean z, Ref.BooleanRef booleanRef, String str2) {
        Boolean boolOnExtraCallback;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str2, "");
            boolOnExtraCallback = utilsKtExternalSyntheticLambda12.onExtraCallback.onExtraCallback(str);
            int i3 = 52 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str2, "");
            boolOnExtraCallback = utilsKtExternalSyntheticLambda12.onExtraCallback.onExtraCallback(str);
        }
    }

    public final boolean IAuthTabCallback(@NotNull String str, final boolean z, @NotNull UtilsKtExternalSyntheticLambda3 utilsKtExternalSyntheticLambda3) {
        r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg r8lambdaimi1kkyy494wcpjbjziyxabnqtg;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda3, "");
        long jNanoTime = System.nanoTime();
        Boolean boolOnNavigationEvent = onNavigationEvent(str);
        if (boolOnNavigationEvent != null) {
            int i2 = getInterfaceDescriptor + 123;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                boolean zBooleanValue = boolOnNavigationEvent.booleanValue();
                onExtraCallbackWithResult(this, str, zBooleanValue, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.CONFIGURED, jNanoTime, Boolean.valueOf(z), null, null, 6, null);
                return zBooleanValue;
            }
            boolean zBooleanValue2 = boolOnNavigationEvent.booleanValue();
            onExtraCallbackWithResult(this, str, zBooleanValue2, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.CONFIGURED, jNanoTime, Boolean.valueOf(z), null, null, 96, null);
            return zBooleanValue2;
        }
        final String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str, onExtraCallback(utilsKtExternalSyntheticLambda3));
        onNavigationEvent(new Object[]{this, str, utilsKtExternalSyntheticLambda3, strOnExtraCallbackWithResult}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), 1081455583, -1081455577);
        Boolean bool = this.onExtraCallbackWithResult.get(strOnExtraCallbackWithResult);
        if (bool != null) {
            boolean zBooleanValue3 = bool.booleanValue();
            onExtraCallbackWithResult(this, str, zBooleanValue3, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.SESSION_CACHE, jNanoTime, Boolean.valueOf(z), null, null, 96, null);
            return zBooleanValue3;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.onExtraCallbackWithResult;
        final Function1 function1 = new Function1() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 77;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                Boolean boolOnWarmupCompleted = UtilsKtExternalSyntheticLambda12.onWarmupCompleted(this.f$0, strOnExtraCallbackWithResult, z, booleanRef, (String) obj);
                int i6 = IAuthTabCallback + 97;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return boolOnWarmupCompleted;
            }
        };
        Boolean boolComputeIfAbsent = concurrentHashMap.computeIfAbsent(strOnExtraCallbackWithResult, new Function() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 65;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                Function1 function12 = function1;
                if (i5 != 0) {
                    return UtilsKtExternalSyntheticLambda12.onExtraCallbackWithResult(function12, obj);
                }
                UtilsKtExternalSyntheticLambda12.onExtraCallbackWithResult(function12, obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(boolComputeIfAbsent, "");
        boolean zBooleanValue4 = boolComputeIfAbsent.booleanValue();
        if (booleanRef.element) {
            int i3 = getInterfaceDescriptor + 69;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg r8lambdaimi1kkyy494wcpjbjziyxabnqtg2 = r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.PERSISTENT_CACHE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            r8lambdaimi1kkyy494wcpjbjziyxabnqtg = r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.PERSISTENT_CACHE;
        } else {
            r8lambdaimi1kkyy494wcpjbjziyxabnqtg = r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.DECLARED_DEFAULT;
        }
        onExtraCallbackWithResult(this, str, zBooleanValue4, r8lambdaimi1kkyy494wcpjbjziyxabnqtg, jNanoTime, Boolean.valueOf(z), null, null, 96, null);
        return zBooleanValue4;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 119;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 13;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws NoWhenBranchMatchedException {
        UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12 = (UtilsKtExternalSyntheticLambda12) objArr[0];
        String str = (String) objArr[1];
        UtilsKtExternalSyntheticLambda3 utilsKtExternalSyntheticLambda3 = (UtilsKtExternalSyntheticLambda3) objArr[2];
        String str2 = (String) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            utilsKtExternalSyntheticLambda12.onNavigationEvent.containsKey(str2);
            throw null;
        }
        if (utilsKtExternalSyntheticLambda12.onNavigationEvent.containsKey(str2)) {
            return null;
        }
        writeRaw<onExtraCallback> writerawOnWarmupCompleted = utilsKtExternalSyntheticLambda12.onWarmupCompleted(str, utilsKtExternalSyntheticLambda3);
        final Function1 function1 = new Function1() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda23
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj2) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 33;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnNavigationEvent = UtilsKtExternalSyntheticLambda12.onNavigationEvent((UtilsKtExternalSyntheticLambda12.onExtraCallback) obj2);
                int i6 = onWarmupCompleted + 75;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 46 / 0;
                }
                return unitOnNavigationEvent;
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda24
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final void accept(Object obj2) {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 45;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                UtilsKtExternalSyntheticLambda12.asBinder(function1, obj2);
                if (i5 == 0) {
                    int i6 = 60 / 0;
                }
            }
        };
        final Function1 function12 = new Function1() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda25
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj2) {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 3;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Unit unit = (Unit) UtilsKtExternalSyntheticLambda12.onNavigationEvent(new Object[]{(Throwable) obj2}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), 760964769, -760964754);
                int i6 = onExtraCallbackWithResult + 41;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return unit;
            }
        };
        writerawOnWarmupCompleted.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: im.toss.components.tuba.distribution.TubaDistributionEvaluator$$ExternalSyntheticLambda26
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final void accept(Object obj2) {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 61;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                UtilsKtExternalSyntheticLambda12.IAuthTabCallbackDefault(function12, obj2);
                int i6 = onExtraCallback + 91;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 26 / 0;
                }
            }
        });
        int i3 = getInterfaceDescriptor + 49;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 59;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void onUnminimized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        int i5 = getInterfaceDescriptor + 1;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    private final String onExtraCallbackWithResult(String str, boolean z) {
        int i = 2 % 2;
        String str2 = str + "-" + z;
        int i2 = IAuthTabCallbackStubProxy + 57;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return str2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12 = (UtilsKtExternalSyntheticLambda12) objArr[0];
        String str = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (zBooleanValue) {
            return r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.SESSION_CACHE;
        }
        r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg r8lambdaimi1kkyy494wcpjbjziyxabnqtg = utilsKtExternalSyntheticLambda12.asBinder.get(str);
        if (r8lambdaimi1kkyy494wcpjbjziyxabnqtg == null) {
            r8lambdaimi1kkyy494wcpjbjziyxabnqtg = r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.UNKNOWN;
        }
        int i4 = IAuthTabCallbackStubProxy + 113;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return r8lambdaimi1kkyy494wcpjbjziyxabnqtg;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void onExtraCallbackWithResult(UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12, String str, boolean z, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg r8lambdaimi1kkyy494wcpjbjziyxabnqtg, long j, Object obj, Integer num, trimMetadataStringsTo trimmetadatastringsto, int i, Object obj2) {
        trimMetadataStringsTo trimmetadatastringsto2;
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 29;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Object obj3 = (i & 16) != 0 ? ALCFaceSDK12.onNavigationEvent : obj;
        Integer num2 = (i & 32) != 0 ? null : num;
        if ((i & 64) != 0) {
            int i5 = IAuthTabCallbackStubProxy + 73;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            trimmetadatastringsto2 = null;
        } else {
            trimmetadatastringsto2 = trimmetadatastringsto;
        }
        utilsKtExternalSyntheticLambda12.IAuthTabCallback(str, z, r8lambdaimi1kkyy494wcpjbjziyxabnqtg, j, obj3, num2, trimmetadatastringsto2);
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private final boolean onNavigationEvent;
        private final r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg onWarmupCompleted;

        public onExtraCallback(boolean z, @NotNull r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg r8lambdaimi1kkyy494wcpjbjziyxabnqtg) {
            Intrinsics.checkNotNullParameter(r8lambdaimi1kkyy494wcpjbjziyxabnqtg, "");
            this.onNavigationEvent = z;
            this.onWarmupCompleted = r8lambdaimi1kkyy494wcpjbjziyxabnqtg;
        }

        public final boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 51;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onNavigationEvent;
            int i5 = i2 + 25;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg r8lambdaimi1kkyy494wcpjbjziyxabnqtg = this.onWarmupCompleted;
            if (i3 != 0) {
                int i4 = 99 / 0;
            }
            return r8lambdaimi1kkyy494wcpjbjziyxabnqtg;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r4.onWarmupCompleted.IAuthTabCallback(r5);
        r5 = r4.onWarmupCompleted.onWarmupCompleted(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r5 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        return java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        r5 = o.UtilsKtExternalSyntheticLambda12.getInterfaceDescriptor + 83;
        o.UtilsKtExternalSyntheticLambda12.IAuthTabCallbackStubProxy = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r4.IAuthTabCallback.onExtraCallbackWithResult() != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r4.IAuthTabCallback.onExtraCallbackWithResult() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Boolean onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 27 / 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final boolean onExtraCallback(UtilsKtExternalSyntheticLambda3 utilsKtExternalSyntheticLambda3) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted.onNavigationEvent[utilsKtExternalSyntheticLambda3.ordinal()];
        if (i2 != 1) {
            int i3 = getInterfaceDescriptor + 55;
            int i4 = i3 % 128;
            IAuthTabCallbackStubProxy = i4;
            int i5 = i3 % 2;
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = i4 + 13;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        return this.onTransact.IAuthTabCallback();
    }

    private final void onExtraCallbackWithResult(String str, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            if (this.IAuthTabCallbackDefault.putIfAbsent(str, th) != null) {
                int i3 = getInterfaceDescriptor + 39;
                IAuthTabCallbackStubProxy = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 25 / 0;
                    return;
                }
                return;
            }
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(Color.red(0) + 13, (ViewConfiguration.getLongPressTimeout() >> 16) + 1, new char[]{'\f', 65531, 6, 15, '\n', 65525, 65531, 2, 65528, 65527, 65535, '\b', 65527}, true, Color.argb(0, 0, 0, 0) + 257, objArr);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "distribution");
            Object[] objArr2 = new Object[1];
            a(3 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3, new char[]{65528, 65534, '\f'}, true, View.resolveSizeAndState(0, 0, 0) + 260, objArr2);
            Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str)});
            Object[] objArr3 = new Object[1];
            a(18 - (ViewConfiguration.getScrollBarSize() >> 8), 14 - TextUtils.indexOf("", "", 0, 0), new char[]{65532, 65525, '\n', 5, 4, 65525, 15, 65531, 1, 65525, 65527, 65528, 11, '\n', 65530, 4, 11, 5}, true, 257 - KeyEvent.normalizeMetaState(0), objArr3);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr3[0]).intern(), (String) null, mapOnWarmupCompleted, (String) null, false, (String) null, 58, (Object) null);
            return;
        }
        this.IAuthTabCallbackDefault.putIfAbsent(str, th);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String IAuthTabCallback(Throwable th) {
        TossApiCallException.ApiError apiError;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 == 0) {
            int i4 = 18 / 0;
            apiError = th instanceof TossApiCallException.ApiError ? (TossApiCallException.ApiError) th : null;
        } else if (th instanceof TossApiCallException.ApiError) {
        }
        if (apiError == null) {
            return null;
        }
        int i5 = i3 + 109;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return apiError.asBinder();
    }

    private final boolean onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = IAuthTabCallback(th);
        if (strIAuthTabCallback == null) {
            return false;
        }
        if (!Intrinsics.areEqual(strIAuthTabCallback, "NOT_EXIST")) {
            int i4 = getInterfaceDescriptor + 17;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.areEqual(strIAuthTabCallback, "UNEVALUABLE_STATUS");
                throw null;
            }
            if (!Intrinsics.areEqual(strIAuthTabCallback, "UNEVALUABLE_STATUS")) {
                int i5 = IAuthTabCallbackStubProxy + 7;
                getInterfaceDescriptor = i5 % 128;
                return i5 % 2 == 0;
            }
        }
        return true;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private final void IAuthTabCallback(String str, boolean z, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg r8lambdaimi1kkyy494wcpjbjziyxabnqtg, long j, Object obj, Integer num, trimMetadataStringsTo trimmetadatastringsto) {
        int i = 2 % 2;
        ALCFaceSDK4 aLCFaceSDK4IAuthTabCallback = r8lambdaxnlsrUWnZSWLAlZCj_icPo2spk0.onExtraCallbackWithResult.IAuthTabCallback();
        if (aLCFaceSDK4IAuthTabCallback == null) {
            int i2 = IAuthTabCallbackStubProxy + 75;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        try {
            aLCFaceSDK4IAuthTabCallback.IAuthTabCallback(new ALCFaceSDKExternalSyntheticLambda4(ALCFaceSDK3.DISTRIBUTION, str, Boolean.valueOf(z), obj, r8lambdaimi1kkyy494wcpjbjziyxabnqtg, System.nanoTime() - j, num, trimmetadatastringsto));
            int i4 = IAuthTabCallbackStubProxy + 33;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }

    private static final Map IAuthTabCallback(UtilsKtExternalSyntheticLambda12 utilsKtExternalSyntheticLambda12, List list, boolean z, ConcurrentHashMap concurrentHashMap, Throwable th) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        if (!utilsKtExternalSyntheticLambda12.onNavigationEvent(th)) {
            List list2 = list;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
            for (Object obj : list2) {
                String str = (String) obj;
                Boolean boolOnExtraCallback = utilsKtExternalSyntheticLambda12.onExtraCallback.onExtraCallback(utilsKtExternalSyntheticLambda12.onExtraCallbackWithResult(str, z));
                concurrentHashMap.put(str, boolOnExtraCallback != null ? r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.PERSISTENT_CACHE : r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.DECLARED_DEFAULT);
                if (boolOnExtraCallback != null) {
                    int i4 = getInterfaceDescriptor + 29;
                    IAuthTabCallbackStubProxy = i4 % 128;
                    int i5 = i4 % 2;
                    zBooleanValue = boolOnExtraCallback.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                linkedHashMap.put(obj, Boolean.valueOf(zBooleanValue));
            }
            return linkedHashMap;
        }
        List list3 = list;
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            int i6 = getInterfaceDescriptor + 15;
            IAuthTabCallbackStubProxy = i6 % 128;
            if (i6 % 2 != 0) {
                String str2 = (String) it.next();
                utilsKtExternalSyntheticLambda12.onExtraCallback.onExtraCallbackWithResult(utilsKtExternalSyntheticLambda12.onExtraCallbackWithResult(str2, z));
                concurrentHashMap.put(str2, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.DECLARED_DEFAULT);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            String str3 = (String) it.next();
            utilsKtExternalSyntheticLambda12.onExtraCallback.onExtraCallbackWithResult(utilsKtExternalSyntheticLambda12.onExtraCallbackWithResult(str3, z));
            concurrentHashMap.put(str3, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.DECLARED_DEFAULT);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
        for (Object obj3 : list3) {
            int i7 = IAuthTabCallbackStubProxy + 119;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            linkedHashMap2.put(obj3, Boolean.FALSE);
        }
        return linkedHashMap2;
    }

    public static /* synthetic */ Map IAuthTabCallback(getBacktraceNote getbacktracenote, Object obj, Object obj2, Object obj3) {
        return (Map) onNavigationEvent(new Object[]{getbacktracenote, obj, obj2, obj3}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), 934008392, -934008390);
    }

    public static /* synthetic */ Unit onExtraCallback(Throwable th) {
        return (Unit) onNavigationEvent(new Object[]{th}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), 760964769, -760964754);
    }

    public static /* synthetic */ Boolean onExtraCallback(onExtraCallback onextracallback) {
        return (Boolean) onNavigationEvent(new Object[]{onextracallback}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), 657010094, -657010080);
    }

    private static final Unit onExtraCallback(AtomicLong atomicLong, deserializeUriNullableCollection deserializeurinullablecollection) {
        return (Unit) onNavigationEvent(new Object[]{atomicLong, deserializeurinullablecollection}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), 2047375548, -2047375540);
    }

    private static final Map ICustomTabsCallback(Function1 function1, Object obj) {
        return (Map) onNavigationEvent(new Object[]{function1, obj}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), -1768245618, 1768245630);
    }

    private static final deserializeIp onExtraCallbackWithResult(writeRaw writeraw) {
        return (deserializeIp) onNavigationEvent(new Object[]{writeraw}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), 246859469, -246859459);
    }

    private static final Map onExtraCallback(List list) {
        return (Map) onNavigationEvent(new Object[]{list}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), -1974717570, 1974717583);
    }

    private static final Boolean onActivityLayout(Function1 function1, Object obj) {
        return (Boolean) onNavigationEvent(new Object[]{function1, obj}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), -1490543218, 1490543225);
    }

    private final r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg IAuthTabCallback(String str, boolean z) {
        return (r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg) onNavigationEvent(new Object[]{this, str, Boolean.valueOf(z)}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), -1017588629, 1017588632);
    }

    private final void onWarmupCompleted(String str, UtilsKtExternalSyntheticLambda3 utilsKtExternalSyntheticLambda3, String str2) {
        onNavigationEvent(new Object[]{this, str, utilsKtExternalSyntheticLambda3, str2}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), 1081455583, -1081455577);
    }

    private static final Unit onExtraCallbackWithResult(onExtraCallback onextracallback) {
        return (Unit) onNavigationEvent(new Object[]{onextracallback}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), -838000003, 838000014);
    }

    private static final void ICustomTabsCallbackDefault(Function1 function1, Object obj) {
        onNavigationEvent(new Object[]{function1, obj}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), 1937635727, -1937635722);
    }

    private static final Unit onWarmupCompleted(Throwable th) {
        return (Unit) onNavigationEvent(new Object[]{th}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), 1913747654, -1913747650);
    }

    public final Object onExtraCallbackWithResult(@NotNull List<String> list, @NotNull UtilsKtExternalSyntheticLambda3 utilsKtExternalSyntheticLambda3, @NotNull access13800<? super Map<String, Boolean>> access13800Var) {
        return onNavigationEvent(new Object[]{this, list, utilsKtExternalSyntheticLambda3, access13800Var}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), 1061247442, -1061247433);
    }

    public final writeRaw<Boolean> IAuthTabCallback(@NotNull String str, @NotNull UtilsKtExternalSyntheticLambda3 utilsKtExternalSyntheticLambda3) {
        return (writeRaw) onNavigationEvent(new Object[]{this, str, utilsKtExternalSyntheticLambda3}, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), 137562224, -137562224);
    }

    static void onExtraCallback() {
        IAuthTabCallbackStub = 478309054;
    }
}
