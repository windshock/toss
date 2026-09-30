package im.toss.rn.toss.core.observability;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.observability.instrumentation.rn.RnBundleInfo;
import im.toss.observability.instrumentation.rn.RnCause;
import im.toss.observability.instrumentation.rn.RnPhase;
import im.toss.observability.instrumentation.rn.RnPhaseEvent;
import im.toss.observability.instrumentation.rn.RnPhaseSpanRecorder;
import im.toss.observability.lcp.RnJsHandoffRegistry;
import im.toss.observability.lcp.RnRuntimeVariantProvider;
import im.toss.rn.toss.core.observability.RnPhaseObserver;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.access15400;
import o.access6900;
import o.maybeUpdateAnimatable;
import o.r8lambda4jipudH4a44aIGrlvbWbk0rzTp4;
import o.r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RnPhaseObserver {
    public static final Companion Companion;
    private static int IAuthTabCallbackStubProxy;
    private static int IAuthTabCallback_Parcel;
    private static char access100;
    private static long asBinder;
    private final AtomicInteger IAuthTabCallback;
    private final RnPhaseSpanRecorder IAuthTabCallbackDefault;
    private volatile WeakReference<Object> IAuthTabCallbackStub;
    private volatile WeakReference<Object> asInterface;
    private final AtomicInteger onExtraCallback;
    private final AtomicBoolean onExtraCallbackWithResult;
    private final Map<Integer, BootHandle> onNavigationEvent;
    private final access6900<BootHandle> onTransact;
    private final RnJsHandoffRegistry onWarmupCompleted;
    private static final byte[] $$a = {106, 40, -98, -117};
    private static final int $$b = 218;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int writeTypedObject = 1;
    private static int getInterfaceDescriptor = 0;
    private static int access000 = 1;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[ReactMarkerConstants.values().length];
            try {
                iArr[ReactMarkerConstants.RUN_JS_BUNDLE_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReactMarkerConstants.RUN_JS_BUNDLE_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReactMarkerConstants.CONTENT_APPEARED.ordinal()] = 3;
                int i = onWarmupCompleted + 101;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallbackWithResult = iArr;
            int[] iArr2 = new int[RnCause.values().length];
            try {
                iArr2[RnCause.AIRLINE.ordinal()] = 1;
                int i4 = onWarmupCompleted + 33;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RnCause.BACKGROUND_UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            onExtraCallback = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, int i2) {
        int i3;
        int i4;
        int i5 = 3 - (i * 4);
        int i6 = s * 3;
        int i7 = i2 + 109;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            i4 = i5;
            int i8 = i6;
            i3 = 0;
            i5 += i8;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i3++;
            i4++;
            i8 = bArr[i4];
            i5 += i8;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i5;
            i5 = i7;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    static {
        IAuthTabCallback_Parcel = 0;
        onExtraCallback();
        Companion = new Companion(null);
        int i = writeTypedObject + 23;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = (~((~i3) | i8)) | i9;
        int i11 = i5 | i4;
        int i12 = (~(i3 | i8)) | i9;
        int i13 = i5 + i4 + i + (1258674323 * i6) + ((-126594725) * i2);
        int i14 = i13 * i13;
        int i15 = ((-1449289074) * i5) + 1954676736 + ((-212912869) * i4) + (i10 * (-1236376205)) + (i11 * (-1236376205)) + ((-1236376205) * i12) + (1609302016 * i) + (881065984 * i6) + ((-991690752) * i2) + ((-541982720) * i14);
        int i16 = ((i5 * (-1656160718)) - 817430035) + (i4 * (-1656161339)) + (i10 * 621) + (i11 * 621) + (i12 * 621) + (i * (-1656160097)) + (i6 * (-2121497779)) + (i2 * 1378977669) + (i14 * (-275906560));
        switch (i15 + (i16 * i16 * (-372375552))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                boolean z = false;
                RnPhaseObserver rnPhaseObserver = (RnPhaseObserver) objArr[0];
                Object obj = objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int iIntValue = ((Number) objArr[3]).intValue();
                Object obj2 = objArr[4];
                int i17 = 2 % 2;
                int i18 = access000;
                int i19 = i18 + 73;
                getInterfaceDescriptor = i19 % 128;
                if (i19 % 2 == 0 ? (iIntValue & 2) == 0 : (3 & iIntValue) == 0) {
                    z = zBooleanValue;
                } else {
                    int i20 = i18 + 25;
                    getInterfaceDescriptor = i20 % 128;
                    int i21 = i20 % 2;
                }
                rnPhaseObserver.onExtraCallback(obj, z);
                int i22 = getInterfaceDescriptor + 49;
                access000 = i22 % 128;
                int i23 = i22 % 2;
                return null;
            case 8:
                return asInterface(objArr);
            case 9:
                return onTransact(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ boolean IAuthTabCallback(String str, BootHandle bootHandle) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 17;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(iOnExtraCallback2, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, new Object[]{str, bootHandle}, -2136526785, 2136526787, iOnExtraCallback3)).booleanValue();
        int i4 = access000 + 87;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ boolean IAuthTabCallback(List list, BootHandle bootHandle) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(list, bootHandle);
        int i4 = getInterfaceDescriptor + 1;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(String str, Map.Entry entry) {
        int i = 2 % 2;
        int i2 = access000 + 15;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(iOnExtraCallback2, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, new Object[]{str, entry}, -1532494776, 1532494777, iOnExtraCallback3)).booleanValue();
        int i4 = access000 + 17;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ boolean onExtraCallback(List list, Map.Entry entry) {
        int i = 2 % 2;
        int i2 = access000 + 39;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(list, entry);
        int i4 = access000 + 7;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onNavigationEvent(RnPhaseObserver rnPhaseObserver, ReactMarkerConstants reactMarkerConstants, String str, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 19;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        onExtraCallback(rnPhaseObserver, reactMarkerConstants, str, i);
        if (i4 != 0) {
            throw null;
        }
        int i5 = getInterfaceDescriptor + 75;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Inject
    public RnPhaseObserver(@NotNull RnPhaseSpanRecorder rnPhaseSpanRecorder, @NotNull RnJsHandoffRegistry rnJsHandoffRegistry) {
        Intrinsics.checkNotNullParameter(rnPhaseSpanRecorder, "");
        Intrinsics.checkNotNullParameter(rnJsHandoffRegistry, "");
        this.IAuthTabCallbackDefault = rnPhaseSpanRecorder;
        this.onWarmupCompleted = rnJsHandoffRegistry;
        this.onExtraCallbackWithResult = new AtomicBoolean(false);
        this.IAuthTabCallback = new AtomicInteger(0);
        this.onExtraCallback = new AtomicInteger(0);
        this.onTransact = new access6900<>();
        this.onNavigationEvent = new LinkedHashMap();
    }

    static final class BootHandle {
        private static int IAuthTabCallbackStub = 1;
        private static int onWarmupCompleted;
        private final String IAuthTabCallback;
        private final String onExtraCallback;
        private final RnCause onExtraCallbackWithResult;
        private final WeakReference<Object> onNavigationEvent;

        public BootHandle(@NotNull String str, @NotNull RnCause rnCause, @Nullable String str2, @Nullable WeakReference<Object> weakReference) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(rnCause, "");
            this.IAuthTabCallback = str;
            this.onExtraCallbackWithResult = rnCause;
            this.onExtraCallback = str2;
            this.onNavigationEvent = weakReference;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 41;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return this.IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final RnCause onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 65;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallbackWithResult;
            }
            throw null;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 65;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.onExtraCallback;
            int i5 = i3 + 51;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final WeakReference<Object> IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            WeakReference<Object> weakReference = this.onNavigationEvent;
            int i4 = i3 + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return weakReference;
        }
    }

    private final BootHandle onExtraCallback(int i) {
        BootHandle bootHandle;
        synchronized (this.onNavigationEvent) {
            bootHandle = this.onNavigationEvent.get(Integer.valueOf(i));
            if (bootHandle == null) {
                bootHandle = (BootHandle) this.onTransact.onWarmupCompleted();
                if (bootHandle != null) {
                    while (this.onNavigationEvent.size() >= 8) {
                        Map<Integer, BootHandle> map = this.onNavigationEvent;
                        map.remove(CollectionsKt.first(map.keySet()));
                    }
                    this.onNavigationEvent.put(Integer.valueOf(i), bootHandle);
                } else {
                    bootHandle = null;
                }
            }
        }
        return bootHandle;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        BootHandle bootHandleRemove;
        RnPhaseObserver rnPhaseObserver = (RnPhaseObserver) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        synchronized (rnPhaseObserver.onNavigationEvent) {
            bootHandleRemove = rnPhaseObserver.onNavigationEvent.remove(Integer.valueOf(iIntValue));
        }
        return bootHandleRemove;
    }

    private final void onExtraCallback(BootHandle bootHandle) {
        synchronized (this.onNavigationEvent) {
            while (this.onTransact.size() >= 8) {
                this.onTransact.removeFirst();
            }
            this.onTransact.addLast(bootHandle);
            Unit unit = Unit.INSTANCE;
        }
    }

    private final boolean onNavigationEvent(final String str) {
        boolean zRemoveAll;
        synchronized (this.onNavigationEvent) {
            CollectionsKt.removeAll(this.onTransact, new Function1() { // from class: im.toss.rn.toss.core.observability.RnPhaseObserver$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj) {
                    Boolean boolValueOf;
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 103;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        boolValueOf = Boolean.valueOf(RnPhaseObserver.IAuthTabCallback(str, (RnPhaseObserver.BootHandle) obj));
                        int i3 = 76 / 0;
                    } else {
                        boolValueOf = Boolean.valueOf(RnPhaseObserver.IAuthTabCallback(str, (RnPhaseObserver.BootHandle) obj));
                    }
                    int i4 = IAuthTabCallback + 35;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 93 / 0;
                    }
                    return boolValueOf;
                }
            });
            zRemoveAll = CollectionsKt.removeAll(this.onNavigationEvent.entrySet(), new Function1() { // from class: im.toss.rn.toss.core.observability.RnPhaseObserver$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 99;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    Boolean boolValueOf = Boolean.valueOf(RnPhaseObserver.onExtraCallback(str, (Map.Entry) obj));
                    int i4 = onNavigationEvent + 83;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return boolValueOf;
                }
            });
        }
        return zRemoveAll;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String str = (String) objArr[0];
        BootHandle bootHandle = (BootHandle) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 71;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bootHandle, "");
        boolean zAreEqual = Intrinsics.areEqual(bootHandle.onExtraCallbackWithResult(), str);
        int i4 = access000 + 87;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zAreEqual);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str = (String) objArr[0];
        Map.Entry entry = (Map.Entry) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 97;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(entry, "");
        boolean zAreEqual = Intrinsics.areEqual(((BootHandle) entry.getValue()).onExtraCallbackWithResult(), str);
        int i4 = access000 + 125;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zAreEqual);
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        final RnPhaseObserver rnPhaseObserver = (RnPhaseObserver) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 17;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        if (rnPhaseObserver.onExtraCallbackWithResult.compareAndSet(false, true)) {
            ReactMarker.addListener(new ReactMarker.MarkerListener() { // from class: im.toss.rn.toss.core.observability.RnPhaseObserver$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i4) {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 101;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    RnPhaseObserver.onNavigationEvent(this.f$0, reactMarkerConstants, str, i4);
                    int i8 = IAuthTabCallback + 95;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                }
            });
            return null;
        }
        int i4 = access000 + 99;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return null;
    }

    private static final void onExtraCallback(RnPhaseObserver rnPhaseObserver, ReactMarkerConstants reactMarkerConstants, String str, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 57;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(reactMarkerConstants, "");
            Object[] objArr = {rnPhaseObserver, reactMarkerConstants, Integer.valueOf(i)};
            int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
            IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, objArr, -271685039, 271685047, ICustomTabsCallbackStubProxy.onExtraCallback());
            return;
        }
        Intrinsics.checkNotNullParameter(reactMarkerConstants, "");
        Object[] objArr2 = {rnPhaseObserver, reactMarkerConstants, Integer.valueOf(i)};
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, objArr2, -271685039, 271685047, ICustomTabsCallbackStubProxy.onExtraCallback());
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i5 = $11 + 113;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $11 + 125;
            $10 = i7 % 128;
            int i8 = i7 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', i4, i4));
                    int touchSlop = 43 - (ViewConfiguration.getTouchSlop() >> 8);
                    int iIndexOf = 1450 - TextUtils.indexOf((CharSequence) "", '0', i4, i4);
                    byte b = (byte) i4;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, (byte) (b2 + 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, touchSlop, iIndexOf, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) i4;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 49123), (ViewConfiguration.getJumpTapTimeout() >> 16) + 44, 1494 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23972), ExpandableListView.getPackedPositionType(0L) + 50, 22939 - (KeyEvent.getMaxKeyCode() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45849 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 30 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 12578 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (asBinder ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackStubProxy ^ 7798559133331975163L))) ^ ((char) (access100 ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i9 = $11 + 35;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    i2 = 2;
                    int i10 = 2 % 5;
                } else {
                    i2 = 2;
                }
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        RnPhase rnPhase;
        Object obj;
        RnBundleInfo rnBundleInfo;
        String str;
        boolean z;
        String strOnExtraCallbackWithResult;
        int i;
        WeakReference<Object> weakReference;
        Object obj2;
        RnPhaseObserver rnPhaseObserver = (RnPhaseObserver) objArr[0];
        ReactMarkerConstants reactMarkerConstants = (ReactMarkerConstants) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = WhenMappings.onExtraCallbackWithResult[reactMarkerConstants.ordinal()];
        if (i3 == 1) {
            rnPhaseObserver.onExtraCallbackWithResult(iIntValue);
            return null;
        }
        int i4 = getInterfaceDescriptor + 1;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        if (i3 != 2) {
            if (i3 == 3 && (weakReference = rnPhaseObserver.IAuthTabCallbackStub) != null && (obj2 = weakReference.get()) != null) {
                WeakReference<Object> weakReference2 = rnPhaseObserver.asInterface;
                if ((weakReference2 != null ? weakReference2.get() : null) == obj2) {
                    int i6 = getInterfaceDescriptor + 121;
                    access000 = i6 % 128;
                    if (i6 % 2 == 0) {
                        rnPhaseObserver.asInterface = null;
                        int i7 = 30 / 0;
                    } else {
                        rnPhaseObserver.asInterface = null;
                    }
                }
            }
            return null;
        }
        BootHandle bootHandle = (BootHandle) IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{rnPhaseObserver, Integer.valueOf(iIntValue)}, -1246761169, 1246761172, ICustomTabsCallbackStubProxy.onExtraCallback());
        rnPhaseObserver.IAuthTabCallback(bootHandle, iIntValue);
        if (bootHandle != null) {
            int i8 = access000 + 21;
            getInterfaceDescriptor = i8 % 128;
            if (i8 % 2 != 0) {
                rnPhase = RnPhase.RUNTIME_BOOT;
                obj = null;
                rnBundleInfo = null;
                str = null;
                z = false;
                strOnExtraCallbackWithResult = bootHandle.onExtraCallbackWithResult();
                i = 78;
            } else {
                rnPhase = RnPhase.RUNTIME_BOOT;
                obj = null;
                rnBundleInfo = null;
                str = null;
                z = false;
                strOnExtraCallbackWithResult = bootHandle.onExtraCallbackWithResult();
                i = 30;
            }
            IAuthTabCallback(rnPhaseObserver, rnPhase, obj, rnBundleInfo, str, z, strOnExtraCallbackWithResult, i, (Object) null);
        }
        rnPhaseObserver.IAuthTabCallback();
        return null;
    }

    public final void onExtraCallback(@NotNull Object obj, boolean z) {
        Object obj2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        this.IAuthTabCallbackStub = new WeakReference<>(obj);
        this.onWarmupCompleted.onExtraCallback(obj, SystemClock.uptimeMillis());
        if (z) {
            this.asInterface = new WeakReference<>(obj);
            return;
        }
        WeakReference<Object> weakReference = this.asInterface;
        if (weakReference != null) {
            int i2 = access000 + 79;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                weakReference.get();
                throw null;
            }
            obj2 = weakReference.get();
            int i3 = getInterfaceDescriptor + 63;
            access000 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            obj2 = null;
        }
        if (obj2 == obj) {
            int i5 = getInterfaceDescriptor + 9;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            this.asInterface = null;
        }
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        WeakReference<Object> weakReference = this.IAuthTabCallbackStub;
        if (weakReference != null) {
            int i4 = access000 + 73;
            getInterfaceDescriptor = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                weakReference.get();
                obj.hashCode();
                throw null;
            }
            Object obj2 = weakReference.get();
            if (obj2 != null) {
                int i5 = getInterfaceDescriptor + 13;
                access000 = i5 % 128;
                int i6 = i5 % 2;
                RnJsHandoffRegistry rnJsHandoffRegistry = this.onWarmupCompleted;
                if (i6 != 0) {
                    rnJsHandoffRegistry.onExtraCallback(obj2, SystemClock.uptimeMillis());
                } else {
                    rnJsHandoffRegistry.onExtraCallback(obj2, SystemClock.uptimeMillis());
                    obj.hashCode();
                    throw null;
                }
            }
        }
    }

    public final void IAuthTabCallback(@NotNull Object obj) {
        Object obj2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        WeakReference<Object> weakReference = this.IAuthTabCallbackStub;
        Object obj3 = null;
        if ((weakReference != null ? weakReference.get() : null) == obj) {
            this.IAuthTabCallbackStub = null;
        }
        WeakReference<Object> weakReference2 = this.asInterface;
        if (weakReference2 != null) {
            int i2 = getInterfaceDescriptor + 89;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                weakReference2.get();
                obj3.hashCode();
                throw null;
            }
            obj2 = weakReference2.get();
        } else {
            obj2 = null;
        }
        if (obj2 == obj) {
            int i3 = getInterfaceDescriptor + 1;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            this.asInterface = null;
        }
        Iterator it = ((List) IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{this, obj}, -395595539, 395595545, ICustomTabsCallbackStubProxy.onExtraCallback())).iterator();
        while (it.hasNext()) {
            IAuthTabCallback(this, RnPhase.RUNTIME_BOOT, (Object) null, (RnBundleInfo) null, "abandoned", false, (String) it.next(), 22, (Object) null);
        }
        try {
            Result.Companion companion = Result.Companion;
            RnPhaseSpanRecorder.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1471003723, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{this.IAuthTabCallbackDefault, obj}, -1471003722);
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        final List listDistinct;
        RnPhaseObserver rnPhaseObserver = (RnPhaseObserver) objArr[0];
        Object obj = objArr[1];
        synchronized (rnPhaseObserver.onNavigationEvent) {
            List listPlus = CollectionsKt.plus(rnPhaseObserver.onTransact, rnPhaseObserver.onNavigationEvent.values());
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listPlus) {
                WeakReference<Object> weakReferenceIAuthTabCallback = ((BootHandle) obj2).IAuthTabCallback();
                if ((weakReferenceIAuthTabCallback != null ? weakReferenceIAuthTabCallback.get() : null) == obj) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((BootHandle) it.next()).onExtraCallbackWithResult());
            }
            listDistinct = CollectionsKt.distinct(arrayList2);
            CollectionsKt.removeAll(rnPhaseObserver.onTransact, new Function1() { // from class: im.toss.rn.toss.core.observability.RnPhaseObserver$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj3) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 121;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    Boolean boolValueOf = Boolean.valueOf(RnPhaseObserver.IAuthTabCallback(listDistinct, (RnPhaseObserver.BootHandle) obj3));
                    int i4 = onNavigationEvent + 103;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return boolValueOf;
                }
            });
            CollectionsKt.removeAll(rnPhaseObserver.onNavigationEvent.entrySet(), new Function1() { // from class: im.toss.rn.toss.core.observability.RnPhaseObserver$$ExternalSyntheticLambda3
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj3) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 1;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        Boolean.valueOf(RnPhaseObserver.onExtraCallback(listDistinct, (Map.Entry) obj3));
                        throw null;
                    }
                    Boolean boolValueOf = Boolean.valueOf(RnPhaseObserver.onExtraCallback(listDistinct, (Map.Entry) obj3));
                    int i3 = onNavigationEvent + 83;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return boolValueOf;
                }
            });
        }
        return listDistinct;
    }

    private static final boolean onExtraCallbackWithResult(List list, BootHandle bootHandle) {
        int i = 2 % 2;
        int i2 = access000 + 77;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bootHandle, "");
        boolean zContains = list.contains(bootHandle.onExtraCallbackWithResult());
        int i4 = getInterfaceDescriptor + 81;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
        return zContains;
    }

    private static final boolean onExtraCallbackWithResult(List list, Map.Entry entry) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 81;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(entry, "");
            return list.contains(((BootHandle) entry.getValue()).onExtraCallbackWithResult());
        }
        Intrinsics.checkNotNullParameter(entry, "");
        list.contains(((BootHandle) entry.getValue()).onExtraCallbackWithResult());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(RnPhaseObserver rnPhaseObserver, RnCause rnCause, String str, String str2, Object obj, int i, Object obj2) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 21;
        access000 = i3 % 128;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 4) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = "boot#" + rnPhaseObserver.onExtraCallback.incrementAndGet();
            int i4 = access000 + 29;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
        if ((i & 8) != 0) {
            obj = null;
        }
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, new Object[]{rnPhaseObserver, rnCause, str, str2, obj}, 418180292, -418180288, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        WeakReference weakReference;
        RnPhaseObserver rnPhaseObserver = (RnPhaseObserver) objArr[0];
        RnCause rnCause = (RnCause) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        access000 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rnCause, "");
            Intrinsics.checkNotNullParameter(str2, "");
            int i3 = 73 / 0;
            weakReference = obj != null ? new WeakReference(obj) : null;
        } else {
            Intrinsics.checkNotNullParameter(rnCause, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (obj != null) {
            }
        }
        rnPhaseObserver.onExtraCallback(new BootHandle(str2, rnCause, str, weakReference));
        IAuthTabCallback(rnPhaseObserver, RnPhase.RUNTIME_BOOT, obj, (RnBundleInfo) null, rnCause, str, str2, 4, (Object) null);
        int i4 = getInterfaceDescriptor + 57;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public final Object onWarmupCompleted(@NotNull access13800<? super Unit> access13800Var) {
        Object objIAuthTabCallback;
        int i = 2 % 2;
        RnEntryScope rnEntryScope = access13800Var.getContext().get(RnEntryScope.onExtraCallbackWithResult);
        Object obj = null;
        if (rnEntryScope == null || (objIAuthTabCallback = rnEntryScope.IAuthTabCallback()) == null) {
            WeakReference<Object> weakReference = this.IAuthTabCallbackStub;
            if (weakReference != null) {
                int i2 = getInterfaceDescriptor + 121;
                access000 = i2 % 128;
                int i3 = i2 % 2;
                objIAuthTabCallback = weakReference.get();
            } else {
                objIAuthTabCallback = null;
            }
            if (objIAuthTabCallback == null) {
                return Unit.INSTANCE;
            }
        }
        Object obj2 = objIAuthTabCallback;
        if (Intrinsics.areEqual(onWarmupCompleted(obj2), "mono")) {
            int i4 = getInterfaceDescriptor + 19;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            return Unit.INSTANCE;
        }
        WeakReference<Object> weakReference2 = this.asInterface;
        if (weakReference2 != null) {
            int i6 = access000 + 69;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 != 0) {
                weakReference2.get();
                obj.hashCode();
                throw null;
            }
            obj = weakReference2.get();
        }
        onWarmupCompleted(this, obj2 == obj ? RnCause.SCREEN_PRELOAD : RnCause.USER_ENTRY, onWarmupCompleted(obj2), null, obj2, 4, null);
        return Unit.INSTANCE;
    }

    public final void IAuthTabCallback(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = access000 + 43;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        onNavigationEvent(str);
        IAuthTabCallback(this, RnPhase.RUNTIME_BOOT, (Object) null, (RnBundleInfo) null, str2, false, str, 22, (Object) null);
        int i4 = getInterfaceDescriptor + 125;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull RnCause rnCause, @NotNull Function1<? super T, r8lambda4jipudH4a44aIGrlvbWbk0rzTp4> function1, @NotNull Function1<? super access13800<? super T>, ? extends Object> function12, @NotNull access13800<? super T> access13800Var) throws Throwable {
        RnPhaseObserver$withBundleFetch$1 rnPhaseObserver$withBundleFetch$1;
        Object obj;
        Object obj2;
        r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4 r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4;
        Function1<? super T, r8lambda4jipudH4a44aIGrlvbWbk0rzTp4> function13;
        Object obj3;
        Object objIAuthTabCallback;
        WeakReference<Object> weakReference;
        r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4 r8lambdafaaz1poyhjg2_fsd27ejgxr8ao42;
        Throwable th;
        CancellationException e;
        int i = 2 % 2;
        int i2 = access000 + 49;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = access13800Var instanceof RnPhaseObserver$withBundleFetch$1;
            throw null;
        }
        if (access13800Var instanceof RnPhaseObserver$withBundleFetch$1) {
            rnPhaseObserver$withBundleFetch$1 = (RnPhaseObserver$withBundleFetch$1) access13800Var;
            int i3 = rnPhaseObserver$withBundleFetch$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rnPhaseObserver$withBundleFetch$1.label = i3 - 2147483648;
            } else {
                rnPhaseObserver$withBundleFetch$1 = new RnPhaseObserver$withBundleFetch$1(this, access13800Var);
            }
        }
        RnPhaseObserver$withBundleFetch$1 rnPhaseObserver$withBundleFetch$12 = rnPhaseObserver$withBundleFetch$1;
        Object obj4 = rnPhaseObserver$withBundleFetch$12.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = rnPhaseObserver$withBundleFetch$12.label;
        if (i4 != 0) {
            int i5 = access000 + 71;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 == 0 ? i4 != 1 : i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r8lambdafaaz1poyhjg2_fsd27ejgxr8ao42 = (r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4) rnPhaseObserver$withBundleFetch$12.L$6;
            function13 = (Function1) rnPhaseObserver$withBundleFetch$12.L$4;
            try {
                ResultKt.onNavigationEvent(obj4);
                obj3 = obj4;
                r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4 = r8lambdafaaz1poyhjg2_fsd27ejgxr8ao42;
            } catch (CancellationException e2) {
                e = e2;
                IAuthTabCallback(this, RnPhase.BUNDLE_FETCH, (Object) null, (RnBundleInfo) null, e.getClass().getSimpleName(), true, r8lambdafaaz1poyhjg2_fsd27ejgxr8ao42.IAuthTabCallback(), 6, (Object) null);
                throw e;
            } catch (Throwable th2) {
                th = th2;
                IAuthTabCallback(this, RnPhase.BUNDLE_FETCH, (Object) null, (RnBundleInfo) null, th.getClass().getSimpleName(), false, r8lambdafaaz1poyhjg2_fsd27ejgxr8ao42.IAuthTabCallback(), 22, (Object) null);
                throw th;
            }
        } else {
            ResultKt.onNavigationEvent(obj4);
            r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4 r8lambdafaaz1poyhjg2_fsd27ejgxr8ao43 = new r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4(str + "#" + this.IAuthTabCallback.incrementAndGet());
            int i6 = WhenMappings.onExtraCallback[rnCause.ordinal()];
            if (i6 == 1 || i6 == 2 || (weakReference = this.asInterface) == null) {
                int i7 = access000 + 95;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
                obj = null;
            } else {
                Object obj5 = weakReference.get();
                int i9 = access000 + 7;
                getInterfaceDescriptor = i9 % 128;
                int i10 = i9 % 2;
                obj = obj5;
            }
            RnCauseScope rnCauseScope = rnPhaseObserver$withBundleFetch$12.getContext().get(RnCauseScope.onExtraCallbackWithResult);
            RnCause rnCauseOnWarmupCompleted = rnCauseScope != null ? rnCauseScope.onWarmupCompleted() : null;
            RnEntryScope rnEntryScope = rnPhaseObserver$withBundleFetch$12.getContext().get(RnEntryScope.onExtraCallbackWithResult);
            if (rnEntryScope == null || (objIAuthTabCallback = rnEntryScope.IAuthTabCallback()) == null) {
                int i11 = access000 + 109;
                getInterfaceDescriptor = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 5 % 4;
                }
                obj2 = obj;
            } else {
                obj2 = objIAuthTabCallback;
            }
            RnPhase rnPhase = RnPhase.BUNDLE_FETCH;
            String upperCase = str2.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            Object obj6 = obj2;
            RnCause rnCause2 = rnCauseOnWarmupCompleted;
            Object obj7 = obj;
            r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4 = r8lambdafaaz1poyhjg2_fsd27ejgxr8ao43;
            IAuthTabCallback(this, rnPhase, obj2, new RnBundleInfo((RnBundleInfo.Source) null, str, upperCase, str3, (String) null, (String) null, (Integer) null, (Long) null, (Long) null, onExtraCallback(rnCause, obj2, obj, rnCauseOnWarmupCompleted), onWarmupCompleted(str), (List) null, (Double) null, 6641, (DefaultConstructorMarker) null), (RnCause) null, (String) null, r8lambdafaaz1poyhjg2_fsd27ejgxr8ao43.IAuthTabCallback(), 24, (Object) null);
            try {
                RnPhaseObserver$withBundleFetch$value$1 rnPhaseObserver$withBundleFetch$value$1 = new RnPhaseObserver$withBundleFetch$value$1(function12, null);
                rnPhaseObserver$withBundleFetch$12.L$0 = access15400.onNavigationEvent(str);
                rnPhaseObserver$withBundleFetch$12.L$1 = access15400.onNavigationEvent(str2);
                rnPhaseObserver$withBundleFetch$12.L$2 = access15400.onNavigationEvent(str3);
                rnPhaseObserver$withBundleFetch$12.L$3 = access15400.onNavigationEvent(rnCause);
                function13 = function1;
                rnPhaseObserver$withBundleFetch$12.L$4 = function13;
                rnPhaseObserver$withBundleFetch$12.L$5 = access15400.onNavigationEvent(function12);
                rnPhaseObserver$withBundleFetch$12.L$6 = r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4;
                rnPhaseObserver$withBundleFetch$12.L$7 = access15400.onNavigationEvent(obj7);
                rnPhaseObserver$withBundleFetch$12.L$8 = access15400.onNavigationEvent(rnCause2);
                rnPhaseObserver$withBundleFetch$12.L$9 = access15400.onNavigationEvent(obj6);
                rnPhaseObserver$withBundleFetch$12.label = 1;
                Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4, rnPhaseObserver$withBundleFetch$value$1, rnPhaseObserver$withBundleFetch$12);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                obj3 = objOnExtraCallback;
            } catch (CancellationException e3) {
                e = e3;
                r8lambdafaaz1poyhjg2_fsd27ejgxr8ao42 = r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4;
                IAuthTabCallback(this, RnPhase.BUNDLE_FETCH, (Object) null, (RnBundleInfo) null, e.getClass().getSimpleName(), true, r8lambdafaaz1poyhjg2_fsd27ejgxr8ao42.IAuthTabCallback(), 6, (Object) null);
                throw e;
            } catch (Throwable th3) {
                th = th3;
                r8lambdafaaz1poyhjg2_fsd27ejgxr8ao42 = r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4;
                IAuthTabCallback(this, RnPhase.BUNDLE_FETCH, (Object) null, (RnBundleInfo) null, th.getClass().getSimpleName(), false, r8lambdafaaz1poyhjg2_fsd27ejgxr8ao42.IAuthTabCallback(), 22, (Object) null);
                throw th;
            }
        }
        int i13 = getInterfaceDescriptor + 41;
        access000 = i13 % 128;
        int i14 = i13 % 2;
        r8lambda4jipudH4a44aIGrlvbWbk0rzTp4 r8lambda4jipudh4a44aigrlvbwbk0rztp4 = (r8lambda4jipudH4a44aIGrlvbWbk0rzTp4) function13.invoke(obj3);
        IAuthTabCallback(this, RnPhase.BUNDLE_FETCH, (Object) null, r8lambda4jipudh4a44aigrlvbwbk0rztp4.onWarmupCompleted(), r8lambda4jipudh4a44aigrlvbwbk0rztp4.onExtraCallback(), false, r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4.IAuthTabCallback(), 18, (Object) null);
        return obj3;
    }

    public static /* synthetic */ Object IAuthTabCallback(RnPhaseObserver rnPhaseObserver, RnBundleInfo rnBundleInfo, String str, boolean z, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = access000 + 5;
            int i4 = i3 % 128;
            getInterfaceDescriptor = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 121;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            str = null;
        }
        if ((i & 4) != 0) {
            int i8 = getInterfaceDescriptor + 31;
            access000 = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        return rnPhaseObserver.onWarmupCompleted(rnBundleInfo, str, z, (access13800<? super Unit>) access13800Var);
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(RnPhaseObserver rnPhaseObserver, RnBundleInfo rnBundleInfo, String str, boolean z, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access000 + 39;
        int i4 = i3 % 128;
        getInterfaceDescriptor = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 63;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            str = null;
        }
        if ((i & 4) != 0) {
            int i8 = access000 + 61;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        return rnPhaseObserver.onNavigationEvent(rnBundleInfo, str, z, (access13800<? super Unit>) access13800Var);
    }

    private final RnCause onExtraCallback(RnCause rnCause, Object obj, Object obj2, RnCause rnCause2) {
        int i;
        int i2 = 2 % 2;
        int i3 = access000 + 69;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            if (rnCause == RnCause.USER_ENTRY) {
                if (rnCause2 != null) {
                    return rnCause2;
                }
                int i4 = getInterfaceDescriptor + 11;
                access000 = i4 % 128;
                int i5 = i4 % 2;
                if (obj != null && obj == obj2) {
                    rnCause = RnCause.SCREEN_PRELOAD;
                    i = access000 + 25;
                    getInterfaceDescriptor = i % 128;
                }
                return rnCause;
            }
            i = getInterfaceDescriptor + 79;
            access000 = i % 128;
            int i6 = i % 2;
            return rnCause;
        }
        RnCause rnCause3 = RnCause.USER_ENTRY;
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        RnCause rnCause = (RnCause) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        int i = 2 % 2;
        Object obj = null;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(new RnCauseScope(rnCause), new RnPhaseObserver$withCause$2(function1, null), (access13800) objArr[3]);
        int i2 = getInterfaceDescriptor + 81;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return objOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    private final RnBundleInfo.Role onWarmupCompleted(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        a((char) (15842 - Color.blue(0)), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{1412, 65110, 38047, 44548, 64478, 9793}, new char[]{42211, 17294, 41932, 64953}, new char[]{14552, 24651, 58018, 62269}, new Object[1]);
        if (!Intrinsics.areEqual(str, ((String) r9[0]).intern())) {
            return RnBundleInfo.Role.SERVICE;
        }
        RnBundleInfo.Role role = RnBundleInfo.Role.HOST;
        int i4 = getInterfaceDescriptor + 3;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return role;
    }

    public final <T> Object IAuthTabCallback(@NotNull Function1<? super access13800<? super T>, ? extends Object> function1, @NotNull access13800<? super T> access13800Var) {
        int i = 2 % 2;
        WeakReference<Object> weakReference = this.IAuthTabCallbackStub;
        if (weakReference != null) {
            int i2 = getInterfaceDescriptor + 43;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            Object obj = weakReference.get();
            if (obj != null) {
                Object objOnNavigationEvent = onNavigationEvent(obj, function1, access13800Var);
                int i4 = access000 + 95;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                return objOnNavigationEvent;
            }
        }
        return function1.invoke(access13800Var);
    }

    public final <T> Object onNavigationEvent(@NotNull Object obj, @NotNull Function1<? super access13800<? super T>, ? extends Object> function1, @NotNull access13800<? super T> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(new RnEntryScope(obj), new RnPhaseObserver$withHostSetup$3(function1, null), access13800Var);
        int i2 = getInterfaceDescriptor + 17;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(int i) throws Throwable {
        RnCause rnCauseOnExtraCallbackWithResult;
        String strOnWarmupCompleted;
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 95;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        BootHandle bootHandleOnExtraCallback = onExtraCallback(i);
        WeakReference<Object> weakReference = this.IAuthTabCallbackStub;
        Object obj = weakReference != null ? weakReference.get() : null;
        if (bootHandleOnExtraCallback == null) {
            int i5 = access000 + 15;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            if (obj == null) {
                return;
            }
        }
        RnPhase rnPhase = RnPhase.BUNDLE_EVALUATE;
        RnBundleInfo rnBundleInfoOnNavigationEvent = onNavigationEvent();
        if (bootHandleOnExtraCallback != null) {
            int i7 = access000 + 25;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            rnCauseOnExtraCallbackWithResult = bootHandleOnExtraCallback.onExtraCallback();
            if (rnCauseOnExtraCallbackWithResult == null) {
                rnCauseOnExtraCallbackWithResult = onExtraCallbackWithResult(obj);
                int i9 = access000 + 17;
                getInterfaceDescriptor = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 5 % 3;
                }
            }
        }
        RnCause rnCause = rnCauseOnExtraCallbackWithResult;
        if (bootHandleOnExtraCallback == null || (strOnWarmupCompleted = bootHandleOnExtraCallback.onWarmupCompleted()) == null) {
            strOnWarmupCompleted = onWarmupCompleted(obj);
        }
        onExtraCallback(rnPhase, obj, rnBundleInfoOnNavigationEvent, rnCause, strOnWarmupCompleted, onExtraCallback(bootHandleOnExtraCallback, i));
    }

    private final void IAuthTabCallback(BootHandle bootHandle, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 45;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback(this, RnPhase.BUNDLE_EVALUATE, (Object) null, onNavigationEvent(), (String) null, false, onExtraCallback(bootHandle, i), 26, (Object) null);
        int i5 = access000 + 67;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String onExtraCallback(BootHandle bootHandle, int i) {
        String strOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor;
        int i4 = i3 + 73;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        if (bootHandle != null) {
            int i6 = i3 + 123;
            access000 = i6 % 128;
            if (i6 % 2 == 0) {
                bootHandle.onExtraCallbackWithResult();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            strOnExtraCallbackWithResult = bootHandle.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult == null) {
                strOnExtraCallbackWithResult = "instance#" + i;
            }
        }
        return "host@" + strOnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d A[PHI: r1
      0x001d: PHI (r1v5 java.lang.ref.WeakReference<java.lang.Object>) = (r1v4 java.lang.ref.WeakReference<java.lang.Object>), (r1v9 java.lang.ref.WeakReference<java.lang.Object>) binds: [B:10:0x001b, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final RnCause onExtraCallbackWithResult(Object obj) {
        WeakReference<Object> weakReference;
        Object obj2;
        int i = 2 % 2;
        if (obj != null) {
            int i2 = getInterfaceDescriptor + 107;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                weakReference = this.asInterface;
                int i3 = 56 / 0;
                if (weakReference != null) {
                    obj2 = weakReference.get();
                    int i4 = access000 + 39;
                    getInterfaceDescriptor = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    obj2 = null;
                }
            } else {
                weakReference = this.asInterface;
                if (weakReference != null) {
                }
            }
            if (obj == obj2) {
                return RnCause.SCREEN_PRELOAD;
            }
        }
        return RnCause.USER_ENTRY;
    }

    private final RnBundleInfo onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15841), ExpandableListView.getPackedPositionChild(0L) + 1, new char[]{1412, 65110, 38047, 44548, 64478, 9793}, new char[]{42211, 17294, 41932, 64953}, new char[]{14552, 24651, 58018, 62269}, objArr);
        RnBundleInfo rnBundleInfo = new RnBundleInfo((RnBundleInfo.Source) null, ((String) objArr[0]).intern(), (String) null, (String) null, (String) null, (String) null, (Integer) null, (Long) null, (Long) null, (RnCause) null, RnBundleInfo.Role.HOST, (List) null, (Double) null, 7165, (DefaultConstructorMarker) null);
        int i2 = access000 + 71;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return rnBundleInfo;
    }

    public static /* synthetic */ void onNavigationEvent(RnPhaseObserver rnPhaseObserver, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access000 + 69;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 2) != 0) {
            str2 = null;
        }
        rnPhaseObserver.onExtraCallbackWithResult(str, str2);
        int i5 = access000 + 91;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @Nullable String str2) {
        Object obj;
        Object obj2;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        RnPhase rnPhase = RnPhase.BUNDLE_EVALUATE;
        WeakReference<Object> weakReference = this.IAuthTabCallbackStub;
        Object obj3 = null;
        if (weakReference != null) {
            int i4 = access000 + 59;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                obj2 = weakReference.get();
                int i5 = 37 / 0;
            } else {
                obj2 = weakReference.get();
            }
            obj = obj2;
        } else {
            obj = null;
        }
        IAuthTabCallback(this, rnPhase, obj, (RnBundleInfo) null, RnCause.LAZY_IMPORT, str2, str, 4, (Object) null);
        int i6 = getInterfaceDescriptor + 95;
        access000 = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj3.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(RnPhaseObserver rnPhaseObserver, String str, RnBundleInfo rnBundleInfo, String str2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor;
        int i4 = i3 + 105;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 4) != 0) {
            int i6 = i3 + 45;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            str2 = null;
        }
        if ((i & 8) != 0) {
            int i8 = i3 + 13;
            access000 = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        rnPhaseObserver.onWarmupCompleted(str, rnBundleInfo, str2, z);
        int i10 = getInterfaceDescriptor + 23;
        access000 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull RnBundleInfo rnBundleInfo, @Nullable String str2, boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(rnBundleInfo, "");
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(rnBundleInfo, "");
        }
        IAuthTabCallback(this, RnPhase.BUNDLE_EVALUATE, (Object) null, rnBundleInfo, str2, z, str, 2, (Object) null);
    }

    static /* synthetic */ void IAuthTabCallback(RnPhaseObserver rnPhaseObserver, RnPhase rnPhase, Object obj, RnBundleInfo rnBundleInfo, RnCause rnCause, String str, String str2, int i, Object obj2) {
        RnBundleInfo rnBundleInfo2;
        int i2 = 2 % 2;
        String str3 = null;
        Object obj3 = (i & 2) != 0 ? null : obj;
        if ((i & 4) != 0) {
            int i3 = getInterfaceDescriptor + 13;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            rnBundleInfo2 = null;
        } else {
            rnBundleInfo2 = rnBundleInfo;
        }
        RnCause rnCause2 = (i & 8) != 0 ? null : rnCause;
        String str4 = (i & 16) != 0 ? null : str;
        if ((i & 32) != 0) {
            int i5 = access000 + 61;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 79 / 0;
            }
        } else {
            str3 = str2;
        }
        rnPhaseObserver.onExtraCallback(rnPhase, obj3, rnBundleInfo2, rnCause2, str4, str3);
    }

    private final void onExtraCallback(RnPhase rnPhase, Object obj, RnBundleInfo rnBundleInfo, RnCause rnCause, String str, String str2) {
        String str3;
        int i = 2 % 2;
        RnPhaseEvent.Edge edge = RnPhaseEvent.Edge.START;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (str == null) {
            String strOnWarmupCompleted = onWarmupCompleted(obj);
            int i2 = getInterfaceDescriptor + 53;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            str3 = strOnWarmupCompleted;
        } else {
            str3 = str;
        }
        Object[] objArr = {this, new RnPhaseEvent(rnPhase, edge, jUptimeMillis, obj, str2, rnCause, str3, rnBundleInfo, (String) null, false, 768, (DefaultConstructorMarker) null)};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, objArr, -1939574133, 1939574142, ICustomTabsCallbackStubProxy.onExtraCallback());
        int i4 = access000 + 35;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ void IAuthTabCallback(RnPhaseObserver rnPhaseObserver, RnPhase rnPhase, Object obj, RnBundleInfo rnBundleInfo, String str, boolean z, String str2, int i, Object obj2) {
        RnBundleInfo rnBundleInfo2;
        String str3;
        boolean z2;
        int i2 = 2 % 2;
        String str4 = null;
        Object obj3 = (i & 2) != 0 ? null : obj;
        if ((i & 4) != 0) {
            int i3 = getInterfaceDescriptor + 81;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            rnBundleInfo2 = null;
        } else {
            rnBundleInfo2 = rnBundleInfo;
        }
        if ((i & 8) != 0) {
            int i5 = access000 + 117;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i & 16) != 0) {
            int i7 = getInterfaceDescriptor + 77;
            access000 = i7 % 128;
            int i8 = i7 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 32) != 0) {
            int i9 = getInterfaceDescriptor + 55;
            access000 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 20 / 0;
            }
        } else {
            str4 = str2;
        }
        rnPhaseObserver.onExtraCallback(rnPhase, obj3, rnBundleInfo2, str3, z2, str4);
    }

    private final void onExtraCallback(RnPhase rnPhase, Object obj, RnBundleInfo rnBundleInfo, String str, boolean z, String str2) {
        int i = 2 % 2;
        Object[] objArr = {this, new RnPhaseEvent(rnPhase, RnPhaseEvent.Edge.END, SystemClock.uptimeMillis(), obj, str2, (RnCause) null, (String) null, rnBundleInfo, str, z, 96, (DefaultConstructorMarker) null)};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, objArr, -1939574133, 1939574142, ICustomTabsCallbackStubProxy.onExtraCallback());
        int i2 = getInterfaceDescriptor + 45;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    private final String onWarmupCompleted(Object obj) {
        RnRuntimeVariantProvider rnRuntimeVariantProvider;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 71;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        if (obj instanceof RnRuntimeVariantProvider) {
            int i5 = i2 + 11;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            rnRuntimeVariantProvider = (RnRuntimeVariantProvider) obj;
        } else {
            rnRuntimeVariantProvider = null;
        }
        if (rnRuntimeVariantProvider == null) {
            return null;
        }
        int i7 = access000 + 115;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
        return rnRuntimeVariantProvider.onExtraCallback();
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        RnPhaseObserver rnPhaseObserver = (RnPhaseObserver) objArr[0];
        RnPhaseEvent rnPhaseEvent = (RnPhaseEvent) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 77;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        try {
            Result.Companion companion = Result.Companion;
            Object[] objArr2 = {rnPhaseObserver.IAuthTabCallbackDefault, rnPhaseEvent};
            RnPhaseSpanRecorder.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 595091418, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr2, -595091415);
            Result.constructor-impl(Unit.INSTANCE);
            int i4 = access000 + 61;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
            return null;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r1
      0x002f: PHI (r1v7 o.r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4) = (r1v6 o.r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4), (r1v13 o.r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull String str, @NotNull access13800<? super Unit> access13800Var) {
        r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4 r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4;
        int i = 2 % 2;
        int i2 = access000 + 125;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4 = (r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4) access13800Var.getContext().get(r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4.onExtraCallbackWithResult);
            int i3 = 74 / 0;
            if (r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4 != null) {
                IAuthTabCallback(this, RnPhase.BUNDLE_DOWNLOAD, (Object) null, new RnBundleInfo((RnBundleInfo.Source) null, (String) null, (String) null, (String) null, str, (String) null, (Integer) null, (Long) null, (Long) null, (RnCause) null, (RnBundleInfo.Role) null, (List) null, (Double) null, 8175, (DefaultConstructorMarker) null), (RnCause) null, (String) null, r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4.IAuthTabCallback(), 26, (Object) null);
                int i4 = access000 + 53;
                getInterfaceDescriptor = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 % 4;
                }
            }
        } else {
            r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4 = access13800Var.getContext().get(r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4.onExtraCallbackWithResult);
            if (r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4 != null) {
            }
        }
        return Unit.INSTANCE;
    }

    public final Object onWarmupCompleted(@NotNull RnBundleInfo rnBundleInfo, @Nullable String str, boolean z, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4 r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4 = access13800Var.getContext().get(r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4.onExtraCallbackWithResult);
            if (r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4 != null) {
                int i3 = getInterfaceDescriptor + 105;
                access000 = i3 % 128;
                if (i3 % 2 == 0) {
                    IAuthTabCallback(this, RnPhase.BUNDLE_DOWNLOAD, (Object) null, rnBundleInfo, str, z, r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4.IAuthTabCallback(), 3, (Object) null);
                } else {
                    IAuthTabCallback(this, RnPhase.BUNDLE_DOWNLOAD, (Object) null, rnBundleInfo, str, z, r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4.IAuthTabCallback(), 2, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
        access13800Var.getContext().get(r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4.onExtraCallbackWithResult);
        throw null;
    }

    public final Object IAuthTabCallback(@NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4 r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4 = access13800Var.getContext().get(r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4.onExtraCallbackWithResult);
        if (r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4 != null) {
            int i4 = getInterfaceDescriptor + 59;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            IAuthTabCallback(this, RnPhase.BUNDLE_VERIFY, (Object) null, (RnBundleInfo) null, (RnCause) null, (String) null, r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4.IAuthTabCallback(), 30, (Object) null);
            int i6 = getInterfaceDescriptor + 109;
            access000 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 4;
            }
        }
        return Unit.INSTANCE;
    }

    public final Object onNavigationEvent(@NotNull RnBundleInfo rnBundleInfo, @Nullable String str, boolean z, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4 r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4 = access13800Var.getContext().get(r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4.onExtraCallbackWithResult);
        if (r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4 != null) {
            int i2 = getInterfaceDescriptor + 99;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(this, RnPhase.BUNDLE_VERIFY, (Object) null, rnBundleInfo, str, z, r8lambdafaaz1poyhjg2_fsd27ejgxr8ao4.IAuthTabCallback(), 2, (Object) null);
            int i4 = getInterfaceDescriptor + 91;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private final List<String> onExtraCallback(Object obj) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (List) IAuthTabCallback(iOnExtraCallback2, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, new Object[]{this, obj}, -395595539, 395595545, iOnExtraCallback3);
    }

    public static /* synthetic */ void onNavigationEvent(RnPhaseObserver rnPhaseObserver, Object obj, boolean z, int i, Object obj2) {
        Object[] objArr = {rnPhaseObserver, obj, Boolean.valueOf(z), Integer.valueOf(i), obj2};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, objArr, -27226709, 27226716, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    private static final boolean onWarmupCompleted(String str, BootHandle bootHandle) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return ((Boolean) IAuthTabCallback(iOnExtraCallback2, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, new Object[]{str, bootHandle}, -2136526785, 2136526787, iOnExtraCallback3)).booleanValue();
    }

    private static final boolean IAuthTabCallback(String str, Map.Entry entry) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return ((Boolean) IAuthTabCallback(iOnExtraCallback2, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, new Object[]{str, entry}, -1532494776, 1532494777, iOnExtraCallback3)).booleanValue();
    }

    private final void onExtraCallbackWithResult(ReactMarkerConstants reactMarkerConstants, int i) {
        Object[] objArr = {this, reactMarkerConstants, Integer.valueOf(i)};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, objArr, -271685039, 271685047, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    private final void IAuthTabCallback(RnPhaseEvent rnPhaseEvent) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback2, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, new Object[]{this, rnPhaseEvent}, -1939574133, 1939574142, iOnExtraCallback3);
    }

    private final BootHandle onWarmupCompleted(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (BootHandle) IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, objArr, -1246761169, 1246761172, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    public final void onExtraCallbackWithResult(@NotNull RnCause rnCause, @Nullable String str, @NotNull String str2, @Nullable Object obj) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback2, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, new Object[]{this, rnCause, str, str2, obj}, 418180292, -418180288, iOnExtraCallback3);
    }

    public final void onWarmupCompleted() {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback2, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, new Object[]{this}, 1183770401, -1183770401, iOnExtraCallback3);
    }

    public final <T> Object onExtraCallbackWithResult(@NotNull RnCause rnCause, @NotNull Function1<? super access13800<? super T>, ? extends Object> function1, @NotNull access13800<? super T> access13800Var) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return IAuthTabCallback(iOnExtraCallback2, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, new Object[]{this, rnCause, function1, access13800Var}, 45134883, -45134878, iOnExtraCallback3);
    }

    static void onExtraCallback() {
        asBinder = -7961326224399151336L;
        IAuthTabCallbackStubProxy = -1776194565;
        access100 = (char) 27643;
    }
}
