package o;

import android.animation.ValueAnimator;
import android.provider.Settings;
import android.view.animation.Interpolator;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.getEventService;
import o.pxToDp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class isFireOS<T extends getEventService> extends getEventService {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int extraCallback = 1;
    private static int extraCallbackWithResult = 0;
    private static int onActivityLayout = 1;
    private static int readTypedObject;
    private Interpolator IAuthTabCallback;
    private Long IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private final Map<Object, Function0<Unit>> IAuthTabCallbackStubProxy;
    private final Map<Object, Function0<Unit>> IAuthTabCallback_Parcel;
    private int ICustomTabsCallback;
    private final Map<Object, Function0<Unit>> access000;
    private final Map<Object, Function0<Unit>> access100;
    private getExtraParameters asBinder;
    private boolean asInterface;
    private final Map<Object, Function0<Unit>> getInterfaceDescriptor;
    private int onExtraCallback;
    private ValueAnimator onExtraCallbackWithResult;
    private Integer onNavigationEvent;
    private final Map<Object, Function0<Unit>> onTransact;
    private Boolean onWarmupCompleted;
    private int writeTypedObject;

    static {
        int i = extraCallbackWithResult + 85;
        extraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ isFireOS(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~i5;
        int i11 = i9 | (~(i8 | i10));
        int i12 = ~(i5 | i4 | i6);
        int i13 = i11 | i12;
        int i14 = i10 | i4;
        int i15 = i4 + i6 + i2 + (112060874 * i3) + ((-1891258303) * i);
        int i16 = i15 * i15;
        int i17 = (i4 * 1286644997) + 1783103488 + (1286644997 * i6) + (i13 * (-1821943044)) + ((-651081208) * i12) + ((-1821943044) * i14) + ((-535298048) * i2) + ((-1427111936) * i3) + (1712848896 * i) + (159514624 * i16);
        int i18 = ((i4 * (-1669307009)) - 1771304782) + (i6 * (-1669307009)) + (i13 * 564) + (i12 * (-1128)) + (i14 * 564) + (i2 * (-1669306445)) + (i3 * (-1582645698)) + (i * (-198941581)) + (i16 * (-203030528));
        switch (i17 + (i18 * i18 * (-2008154112))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                isFireOS isfireos = (isFireOS) objArr[0];
                int i19 = 2 % 2;
                int i20 = readTypedObject + 93;
                onActivityLayout = i20 % 128;
                int i21 = i20 % 2;
                isfireos.asInterface = true;
                if (!isfireos.postMessage()) {
                    return isfireos;
                }
                int i22 = onActivityLayout + 49;
                readTypedObject = i22 % 128;
                int i23 = i22 % 2;
                isfireos.access100(isfireos.ICustomTabsCallback);
                return isfireos;
            case 6:
                return asBinder(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return asInterface(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    protected abstract void IAuthTabCallbackDefault(int i);

    public abstract isFireOS<T> IAuthTabCallbackStubProxy();

    public abstract ValueAnimator IAuthTabCallback_Parcel();

    public abstract pxToDp ICustomTabsCallback_Parcel();

    public abstract isFireOS<T> access100();

    public abstract List<T> extraCallback();

    protected abstract void extraCommand();

    public abstract isFireOS<T> onExtraCallbackWithResult(boolean z);

    public abstract void onWarmupCompleted(@NotNull T t, float f);

    public abstract isFireOS<T> setEngagementSignalsCallback();

    private isFireOS() {
        this.getInterfaceDescriptor = new LinkedHashMap();
        this.access000 = new LinkedHashMap();
        this.IAuthTabCallback_Parcel = new LinkedHashMap();
        this.onTransact = new LinkedHashMap();
        this.access100 = new LinkedHashMap();
        this.IAuthTabCallbackStubProxy = new LinkedHashMap();
        this.asBinder = getExtraParameters.Alternate;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        isFireOS isfireos = (isFireOS) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 81;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        Long l = isfireos.IAuthTabCallbackDefault;
        int i5 = i2 + 39;
        onActivityLayout = i5 % 128;
        if (i5 % 2 != 0) {
            return l;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(@Nullable Long l) {
        int i = 2 % 2;
        int i2 = readTypedObject + 107;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackDefault = l;
        int i5 = i3 + 73;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
    }

    public final ValueAnimator readTypedObject() {
        ValueAnimator valueAnimator;
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 43;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0) {
            valueAnimator = this.onExtraCallbackWithResult;
            int i4 = 93 / 0;
        } else {
            valueAnimator = this.onExtraCallbackWithResult;
        }
        int i5 = i2 + 15;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return valueAnimator;
    }

    public final void onExtraCallback(@Nullable ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = readTypedObject + 51;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        this.onExtraCallbackWithResult = valueAnimator;
        if (i4 == 0) {
            int i5 = 29 / 0;
        }
        int i6 = i3 + 83;
        readTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final Map<Object, Function0<Unit>> isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = readTypedObject + 69;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Map<Object, Function0<Unit>> map = this.getInterfaceDescriptor;
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
        return map;
    }

    public final Map<Object, Function0<Unit>> onRelationshipValidationResult() {
        Map<Object, Function0<Unit>> map;
        int i = 2 % 2;
        int i2 = onActivityLayout + 19;
        int i3 = i2 % 128;
        readTypedObject = i3;
        if (i2 % 2 != 0) {
            map = this.access000;
            int i4 = 40 / 0;
        } else {
            map = this.access000;
        }
        int i5 = i3 + 7;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final Map<Object, Function0<Unit>> ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 77;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        Map<Object, Function0<Unit>> map = this.IAuthTabCallback_Parcel;
        int i5 = i3 + 45;
        onActivityLayout = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        isFireOS isfireos = (isFireOS) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 103;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        Map<Object, Function0<Unit>> map = isfireos.onTransact;
        int i5 = i2 + 103;
        onActivityLayout = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    public final Map<Object, Function0<Unit>> ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 7;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Map<Object, Function0<Unit>> map = this.access100;
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        return map;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        isFireOS isfireos = (isFireOS) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 119;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        Map<Object, Function0<Unit>> map = isfireos.IAuthTabCallbackStubProxy;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 21;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return map;
    }

    public final boolean newAuthTabSession() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 113;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.asInterface;
        int i5 = i2 + 47;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
        return z;
    }

    public final int onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = readTypedObject + 65;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getExtraParameters onPostMessage() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 83;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        getExtraParameters getextraparameters = this.asBinder;
        int i5 = i3 + 63;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return getextraparameters;
    }

    public final int mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 5;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return this.writeTypedObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onActivityResized() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 89;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackStub;
        }
        throw null;
    }

    public final boolean newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = readTypedObject + 63;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.writeTypedObject >= 0) {
            return false;
        }
        int i4 = i3 + 39;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final int ICustomTabsService() {
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ICustomTabsCallback;
        }
        throw null;
    }

    public final Interpolator onMinimized() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 37;
        int i3 = i2 % 128;
        readTypedObject = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Interpolator interpolator = this.IAuthTabCallback;
        int i4 = i3 + 41;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return interpolator;
    }

    public final Integer extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 49;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.onNavigationEvent;
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        return num;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        isFireOS isfireos = (isFireOS) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        Boolean bool = isfireos.onWarmupCompleted;
        int i5 = i3 + 21;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r8.ICustomTabsCallback == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r1 = r1 + 5;
        r4 = r1 % 128;
        o.isFireOS.onActivityLayout = r4;
        r1 = r1 % 2;
        r4 = r4 + 67;
        o.isFireOS.readTypedObject = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if ((r4 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r8.ICustomTabsCallback == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean prefetch() {
        int i = 2 % 2;
        Object obj = null;
        if (!this.asInterface) {
            Integer numAsBinder = asBinder();
            if (numAsBinder == null || numAsBinder.intValue() != 0) {
                int i2 = this.ICustomTabsCallback;
                Integer numAsBinder2 = asBinder();
                if (numAsBinder2 != null) {
                    int i3 = readTypedObject + 69;
                    onActivityLayout = i3 % 128;
                    if (i3 % 2 == 0) {
                        numAsBinder2.intValue();
                        obj.hashCode();
                        throw null;
                    }
                    if (i2 == numAsBinder2.intValue()) {
                        return true;
                    }
                }
            }
            int i4 = onActivityLayout + 119;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = readTypedObject;
        int i7 = i6 + 123;
        onActivityLayout = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 52 / 0;
        }
    }

    public final isFireOS<T> ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 3;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface = false;
        if (postMessage()) {
            access100(this.ICustomTabsCallback);
            int i4 = onActivityLayout + 79;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        return this;
    }

    public final isFireOS<T> receiveFile() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 83;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy();
        IAuthTabCallbackDefault(0);
        ICustomTabsCallback();
        Object obj = null;
        onExtraCallbackWithResult(this, false, 1, null);
        int i4 = readTypedObject + 39;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            return this;
        }
        obj.hashCode();
        throw null;
    }

    public final isFireOS<T> requestPostMessageChannel() {
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = readTypedObject + 1;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStubProxy();
            IAuthTabCallbackDefault(IAuthTabCallbackStub());
            int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            objOnExtraCallbackWithResult = onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -683498017, iOnExtraCallbackWithResult, 683498022);
        } else {
            IAuthTabCallbackStubProxy();
            IAuthTabCallbackDefault(IAuthTabCallbackStub());
            int iOnExtraCallbackWithResult4 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            objOnExtraCallbackWithResult = onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult6, -683498017, iOnExtraCallbackWithResult4, 683498022);
        }
        onExtraCallbackWithResult(this, false, 1, null);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        isFireOS isfireos = (isFireOS) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityLayout + 7;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        ValueAnimator valueAnimator = isfireos.onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 53 / 0;
            if (valueAnimator != null) {
                if (valueAnimator.isStarted()) {
                    int i5 = onActivityLayout + 53;
                    readTypedObject = i5 % 128;
                    if (i5 % 2 == 0) {
                        return true;
                    }
                    throw null;
                }
            }
        } else if (valueAnimator != null) {
        }
        return false;
    }

    public final boolean postMessage() {
        int i = 2 % 2;
        ValueAnimator valueAnimator = this.onExtraCallbackWithResult;
        if (valueAnimator != null) {
            int i2 = readTypedObject + 1;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            boolean zIsRunning = valueAnimator.isRunning();
            if (i3 != 0 ? zIsRunning : zIsRunning) {
                int i4 = onActivityLayout + 15;
                readTypedObject = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        int i6 = readTypedObject + 113;
        onActivityLayout = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final boolean newSession() {
        int i = 2 % 2;
        ValueAnimator valueAnimator = this.onExtraCallbackWithResult;
        if (valueAnimator == null) {
            return false;
        }
        int i2 = readTypedObject + 3;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        if (!valueAnimator.isPaused()) {
            return false;
        }
        int i4 = onActivityLayout + 23;
        readTypedObject = i4 % 128;
        return i4 % 2 == 0;
    }

    public static /* synthetic */ isFireOS onExtraCallbackWithResult(isFireOS isfireos, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = readTypedObject;
        int i4 = i3 + 47;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
        }
        if ((i & 1) != 0) {
            int i6 = i3 + 51;
            onActivityLayout = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        return isfireos.onExtraCallbackWithResult(z);
    }

    public final void requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 13;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        isFireOS<?> isfireosOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (isfireosOnExtraCallbackWithResult != null) {
            if (isfireosOnExtraCallbackWithResult.postMessage()) {
                isfireosOnExtraCallbackWithResult.IAuthTabCallbackStubProxy();
            }
            isfireosOnExtraCallbackWithResult.requestPostMessageChannelWithExtras();
            int i3 = readTypedObject + 9;
            onActivityLayout = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private final void access100(int i) {
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 117;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            setEngagementSignalsCallback();
            IAuthTabCallbackDefault(i);
            onExtraCallbackWithResult(this, false, 0, null);
        } else {
            setEngagementSignalsCallback();
            IAuthTabCallbackDefault(i);
            onExtraCallbackWithResult(this, false, 1, null);
        }
    }

    public final isFireOS<T> asInterface(float f) {
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = readTypedObject + 51;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (i3 == 0) {
            objOnExtraCallbackWithResult = onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this, Integer.valueOf((int) (fIAuthTabCallbackStub - f))}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -877071172, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 877071174);
        } else {
            objOnExtraCallbackWithResult = onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this, Integer.valueOf((int) (fIAuthTabCallbackStub * f))}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -877071172, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 877071174);
        }
        return (isFireOS) objOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        isFireOS isfireos = (isFireOS) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = readTypedObject + 43;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        if (isfireos.postMessage()) {
            int i4 = onActivityLayout + 111;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            isfireos.access100(iIntValue);
            return isfireos;
        }
        isfireos.IAuthTabCallbackDefault(iIntValue);
        return isfireos;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        isFireOS isfireos = (isFireOS) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = readTypedObject + 9;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        isfireos.onExtraCallback = iIntValue;
        int i5 = i3 + 75;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
        return null;
    }

    public final void onNavigationEvent(@NotNull getExtraParameters getextraparameters) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 59;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getextraparameters, "");
            this.asBinder = getextraparameters;
            int i3 = 64 / 0;
        } else {
            Intrinsics.checkNotNullParameter(getextraparameters, "");
            this.asBinder = getextraparameters;
        }
        int i4 = readTypedObject + 17;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 17;
        int i4 = i3 % 128;
        onActivityLayout = i4;
        int i5 = i3 % 2;
        this.writeTypedObject = i;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 97;
        readTypedObject = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 107;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackStub = i;
        if (i4 != 0) {
            int i5 = 72 / 0;
        }
    }

    public final void onExtraCallbackWithResult(@Nullable Interpolator interpolator) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 99;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallback = interpolator;
        int i5 = i3 + 67;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void IAuthTabCallback(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 121;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent = num;
        int i5 = i2 + 65;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
    }

    public final void onExtraCallback(@Nullable Boolean bool) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 17;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted = bool;
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(int i, int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        int i7 = readTypedObject;
        int i8 = i7 + 91;
        onActivityLayout = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 85 / 0;
            if (!this.asInterface) {
                int i10 = i7 + 11;
                onActivityLayout = i10 % 128;
                int i11 = i10 % 2;
                onExtraCallbackWithResult(i, i2, i3, i4, i5);
                if (i11 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        } else if (!this.asInterface) {
        }
        int i12 = onActivityLayout + 23;
        readTypedObject = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5) {
        Iterator it;
        int i6 = 2 % 2;
        if (i5 <= 0) {
            int i7 = readTypedObject;
            int i8 = i7 + 11;
            onActivityLayout = i8 % 128;
            int i9 = i8 % 2;
            if (i != 0 || i2 < 0) {
                return;
            }
            int i10 = i7 + 119;
            onActivityLayout = i10 % 128;
            int i11 = i10 % 2;
            Iterator<T> it2 = this.getInterfaceDescriptor.values().iterator();
            while (it2.hasNext()) {
                ((Function0) it2.next()).invoke();
            }
            Iterator<T> it3 = this.access100.values().iterator();
            while (it3.hasNext()) {
                ((Function0) it3.next()).invoke();
            }
            if (this.writeTypedObject <= 1) {
                int i12 = readTypedObject + 41;
                onActivityLayout = i12 % 128;
                int i13 = i12 % 2;
                if (newSessionWithExtras()) {
                    Iterator<T> it4 = this.IAuthTabCallback_Parcel.values().iterator();
                    while (it4.hasNext()) {
                        ((Function0) it4.next()).invoke();
                    }
                    Iterator<T> it5 = this.IAuthTabCallbackStubProxy.values().iterator();
                    while (it5.hasNext()) {
                        ((Function0) it5.next()).invoke();
                        int i14 = onActivityLayout + 81;
                        readTypedObject = i14 % 128;
                        int i15 = i14 % 2;
                    }
                }
            }
            Iterator<T> it6 = this.access000.values().iterator();
            while (it6.hasNext()) {
                ((Function0) it6.next()).invoke();
            }
            return;
        }
        int i16 = i - i3;
        int i17 = i2 - i3;
        if (i == 0 && i2 != 0) {
            Iterator<T> it7 = this.getInterfaceDescriptor.values().iterator();
            while (it7.hasNext()) {
                ((Function0) it7.next()).invoke();
            }
            if (Settings.Global.getFloat(contentType.onExtraCallback.IAuthTabCallbackStubProxy().getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
                int i18 = readTypedObject + 13;
                onActivityLayout = i18 % 128;
                if (i18 % 2 == 0) {
                    it = this.access100.values().iterator();
                    int i19 = 8 / 0;
                } else {
                    it = this.access100.values().iterator();
                }
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                return;
            }
            return;
        }
        if (i != IAuthTabCallbackStub()) {
            int i20 = onActivityLayout + 33;
            readTypedObject = i20 % 128;
            int i21 = i20 % 2;
            if (i2 == IAuthTabCallbackStub()) {
                return;
            }
        }
        int i22 = i + 1;
        if (i22 <= i2 && i22 <= i3) {
            int i23 = readTypedObject + 85;
            onActivityLayout = i23 % 128;
            int i24 = i23 % 2;
            if (i3 <= i2) {
                Iterator<T> it8 = this.access100.values().iterator();
                while (it8.hasNext()) {
                    ((Function0) it8.next()).invoke();
                }
                return;
            }
        }
        if (i17 >= i5 - i4) {
            int iMin = (Integer.min(i16 / i5, i17 / i5) + 1) * i5;
            int i25 = iMin - i4;
            int i26 = i16 + 1;
            if (i26 <= i25) {
                int i27 = readTypedObject + 125;
                onActivityLayout = i27 % 128;
                int i28 = i27 % 2;
                if (i25 <= i17) {
                    if (i2 != IAuthTabCallbackStub()) {
                        Iterator<T> it9 = this.IAuthTabCallback_Parcel.values().iterator();
                        while (it9.hasNext()) {
                            ((Function0) it9.next()).invoke();
                        }
                        return;
                    }
                    return;
                }
            }
            if (i26 > iMin || iMin > i17) {
                return;
            }
            Iterator<T> it10 = this.IAuthTabCallbackStubProxy.values().iterator();
            int i29 = readTypedObject + 27;
            onActivityLayout = i29 % 128;
            int i30 = i29 % 2;
            while (it10.hasNext()) {
                int i31 = onActivityLayout + 107;
                readTypedObject = i31 % 128;
                int i32 = i31 % 2;
                ((Function0) it10.next()).invoke();
            }
        }
    }

    public final Collection<Function0<Unit>> IAuthTabCallback(int i, int i2) {
        int i3 = 2 % 2;
        if (i == IAuthTabCallbackStub() || i2 != IAuthTabCallbackStub()) {
            Set setOnExtraCallback = clearFaultAdjacentMetadata.onExtraCallback();
            int i4 = onActivityLayout + 13;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            return setOnExtraCallback;
        }
        Collection<Function0<Unit>> collectionValues = this.access000.values();
        int i6 = readTypedObject + 113;
        onActivityLayout = i6 % 128;
        int i7 = i6 % 2;
        return collectionValues;
    }

    private final void access000(int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = this.ICustomTabsCallback;
        this.ICustomTabsCallback = i;
        if (!this.asInterface && (i2 = this.onExtraCallback) > 0 && i4 < i2) {
            int i5 = onActivityLayout + 67;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
            if (i >= i2) {
                Iterator<T> it = this.getInterfaceDescriptor.values().iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                Iterator<T> it2 = this.access100.values().iterator();
                while (it2.hasNext()) {
                    ((Function0) it2.next()).invoke();
                }
            }
        }
        int i7 = readTypedObject + 103;
        onActivityLayout = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a1 A[EDGE_INSN: B:103:0x01a1->B:77:0x01a1 BREAK  A[LOOP:6: B:56:0x0147->B:76:0x0199], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a8 A[LOOP:7: B:79:0x01a8->B:86:0x01c1, LOOP_START, PHI: r3
      0x01a8: PHI (r3v12 int) = (r3v11 int), (r3v13 int) binds: [B:78:0x01a6, B:86:0x01c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        boolean z;
        int size;
        int i;
        int i2;
        int lastIndex;
        int i3;
        getEventService geteventservice;
        int iIAuthTabCallbackStub;
        int i4;
        int i5 = 0;
        isFireOS isfireos = (isFireOS) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i6 = 2 % 2;
        List listExtraCallback = isfireos.extraCallback();
        if (listExtraCallback.isEmpty()) {
            isfireos.access000(iIntValue);
            return null;
        }
        List list = listExtraCallback;
        int size2 = list.size();
        int iIAuthTabCallbackStub2 = 0;
        for (int i7 = 0; i7 < size2; i7++) {
            iIAuthTabCallbackStub2 += ((getEventService) listExtraCallback.get(i7)).IAuthTabCallbackStub();
        }
        int i8 = isfireos.IAuthTabCallbackStub;
        int i9 = iIAuthTabCallbackStub2 + i8;
        isfireos.onExtraCallback(isfireos.ICustomTabsCallback, iIntValue, isfireos.onExtraCallback, i8, i9);
        isfireos.ICustomTabsCallback = iIntValue;
        if (iIntValue >= isfireos.onExtraCallback) {
            if (iIntValue == isfireos.IAuthTabCallbackStub()) {
                int size3 = list.size();
                int i10 = readTypedObject + 17;
                onActivityLayout = i10 % 128;
                int i11 = i10 % 2;
                while (i5 < size3) {
                    isfireos.onWarmupCompleted((getEventService) listExtraCallback.get(i5), 1.0f);
                    i5++;
                }
            } else if (i9 == 0) {
                int size4 = list.size();
                while (i5 < size4) {
                    isfireos.onWarmupCompleted((getEventService) listExtraCallback.get(i5), 1.0f);
                    i5++;
                }
            } else {
                int i12 = iIntValue - isfireos.onExtraCallback;
                int i13 = i12 / i9;
                if (isfireos.asBinder == getExtraParameters.Alternate) {
                    int i14 = readTypedObject;
                    int i15 = i14 + 97;
                    onActivityLayout = i15 % 128;
                    int i16 = i15 % 2;
                    if (i13 % 2 == 1) {
                        int i17 = i14 + 59;
                        onActivityLayout = i17 % 128;
                        int i18 = i17 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    int i19 = z ? (i9 - (i12 % i9)) - isfireos.IAuthTabCallbackStub : i12 % i9;
                    if (!z) {
                        if (i19 >= iIAuthTabCallbackStub2) {
                            int size5 = list.size();
                            while (i5 < size5) {
                                int i20 = readTypedObject + 31;
                                onActivityLayout = i20 % 128;
                                if (i20 % 2 == 0) {
                                    isfireos.onWarmupCompleted((getEventService) listExtraCallback.get(i5), 1.0f);
                                    i5 += 53;
                                } else {
                                    isfireos.onWarmupCompleted((getEventService) listExtraCallback.get(i5), 1.0f);
                                    i5++;
                                }
                            }
                        }
                        Object objFirst = CollectionsKt.first(listExtraCallback);
                        size = list.size();
                        i = 0;
                        i2 = 0;
                        while (true) {
                            if (i >= size) {
                            }
                            isfireos.onWarmupCompleted(geteventservice, 1.0f);
                            i2 += iIAuthTabCallbackStub;
                            i++;
                        }
                        lastIndex = CollectionsKt.getLastIndex(listExtraCallback);
                        i3 = i5 + 1;
                        if (i3 <= lastIndex) {
                        }
                        getEventService geteventservice2 = (getEventService) objFirst;
                        int iIAuthTabCallbackStub3 = geteventservice2.IAuthTabCallbackStub();
                        isfireos.onWarmupCompleted(geteventservice2, iIAuthTabCallbackStub3 > 0 ? (i19 - i2) / iIAuthTabCallbackStub3 : 1.0f);
                        return null;
                    }
                    if (i19 <= 0) {
                        int size6 = list.size();
                        while (i5 < size6) {
                            int i21 = onActivityLayout + 113;
                            readTypedObject = i21 % 128;
                            if (i21 % 2 != 0) {
                                isfireos.onWarmupCompleted((getEventService) listExtraCallback.get(i5), 0.0f);
                                i5 += 116;
                            } else {
                                isfireos.onWarmupCompleted((getEventService) listExtraCallback.get(i5), 0.0f);
                                i5++;
                            }
                        }
                    }
                    Object objFirst2 = CollectionsKt.first(listExtraCallback);
                    size = list.size();
                    i = 0;
                    i2 = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        geteventservice = (getEventService) listExtraCallback.get(i);
                        iIAuthTabCallbackStub = geteventservice.IAuthTabCallbackStub();
                        if (iIAuthTabCallbackStub <= 0 || i19 > (i4 = i2 + iIAuthTabCallbackStub)) {
                            isfireos.onWarmupCompleted(geteventservice, 1.0f);
                            i2 += iIAuthTabCallbackStub;
                            i++;
                        } else {
                            int i22 = readTypedObject;
                            int i23 = i22 + 19;
                            onActivityLayout = i23 % 128;
                            if (i23 % 2 == 0) {
                                throw null;
                            }
                            if (i19 == i4) {
                                int i24 = i22 + 77;
                                onActivityLayout = i24 % 128;
                                if (i24 % 2 == 0) {
                                    int i25 = 57 / 0;
                                    if (i < CollectionsKt.getLastIndex(listExtraCallback)) {
                                        i5 = i + 1;
                                        if (((getEventService) listExtraCallback.get(i5)).IAuthTabCallbackStub() == 0) {
                                            objFirst2 = listExtraCallback.get(i5);
                                            isfireos.onWarmupCompleted(geteventservice, 1.0f);
                                        } else {
                                            i5 = i;
                                            objFirst2 = geteventservice;
                                        }
                                    }
                                } else if (i < CollectionsKt.getLastIndex(listExtraCallback)) {
                                }
                            }
                        }
                    }
                    lastIndex = CollectionsKt.getLastIndex(listExtraCallback);
                    i3 = i5 + 1;
                    if (i3 <= lastIndex) {
                        while (true) {
                            getEventService geteventservice3 = (getEventService) listExtraCallback.get(lastIndex);
                            if (z && geteventservice3.IAuthTabCallbackStub() == 0) {
                                isfireos.onWarmupCompleted(geteventservice3, 1.0f);
                            } else {
                                isfireos.onWarmupCompleted(geteventservice3, 0.0f);
                            }
                            if (lastIndex == i3) {
                                break;
                            }
                            lastIndex--;
                            int i26 = onActivityLayout + 57;
                            readTypedObject = i26 % 128;
                            int i27 = i26 % 2;
                        }
                    }
                    getEventService geteventservice22 = (getEventService) objFirst2;
                    int iIAuthTabCallbackStub32 = geteventservice22.IAuthTabCallbackStub();
                    isfireos.onWarmupCompleted(geteventservice22, iIAuthTabCallbackStub32 > 0 ? (i19 - i2) / iIAuthTabCallbackStub32 : 1.0f);
                    return null;
                }
            }
        } else if (isfireos.asInterface) {
            int size7 = list.size();
            while (i5 < size7) {
                isfireos.onWarmupCompleted((getEventService) listExtraCallback.get(i5), 0.0f);
                i5++;
            }
        } else {
            int size8 = list.size() - 1;
            if (size8 >= 0) {
                while (true) {
                    int i28 = size8 - 1;
                    isfireos.onWarmupCompleted((getEventService) listExtraCallback.get(size8), 0.0f);
                    if (i28 < 0) {
                        break;
                    }
                    size8 = i28;
                }
            }
        }
        return null;
    }

    protected final void asBinder(int i) {
        Integer numValueOf;
        int iIntValue;
        int i2 = 2 % 2;
        List<T> listExtraCallback = extraCallback();
        if (listExtraCallback.isEmpty()) {
            access000(i);
            return;
        }
        int i3 = 0;
        if (listExtraCallback.isEmpty()) {
            int i4 = readTypedObject + 85;
            onActivityLayout = i4 % 128;
            numValueOf = null;
            if (i4 % 2 == 0) {
                throw null;
            }
        } else {
            numValueOf = Integer.valueOf(listExtraCallback.get(0).IAuthTabCallbackStub());
            int lastIndex = CollectionsKt.getLastIndex(listExtraCallback);
            if (lastIndex > 0) {
                int i5 = onActivityLayout + 125;
                readTypedObject = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(listExtraCallback.get(i7).IAuthTabCallbackStub());
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i7 == lastIndex) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            int i8 = readTypedObject + 7;
            onActivityLayout = i8 % 128;
            int i9 = i8 % 2;
            iIntValue = 0;
        }
        int i10 = this.IAuthTabCallbackStub;
        int i11 = iIntValue + i10;
        onExtraCallback(this.ICustomTabsCallback, i, this.onExtraCallback, i10, i11);
        this.ICustomTabsCallback = i;
        if (i < this.onExtraCallback) {
            int size = listExtraCallback.size();
            while (i3 < size) {
                onWarmupCompleted(listExtraCallback.get(i3), 0.0f);
                i3++;
            }
            return;
        }
        if (i == IAuthTabCallbackStub()) {
            Iterator<T> it = listExtraCallback.iterator();
            while (it.hasNext()) {
                int i12 = readTypedObject + 5;
                onActivityLayout = i12 % 128;
                if (i12 % 2 == 0) {
                    onWarmupCompleted((getEventService) it.next(), 0.0f);
                } else {
                    onWarmupCompleted((getEventService) it.next(), 1.0f);
                }
            }
            return;
        }
        if (i11 == 0) {
            int size2 = listExtraCallback.size();
            while (i3 < size2) {
                onWarmupCompleted(listExtraCallback.get(i3), 1.0f);
                i3++;
            }
            return;
        }
        int i13 = i - this.onExtraCallback;
        boolean z = this.asBinder == getExtraParameters.Alternate && ((long) (i13 / i11)) % 2 == 1;
        int i14 = z ? (i11 - (i13 % i11)) - this.IAuthTabCallbackStub : i13 % i11;
        if (z) {
            if (i14 <= 0) {
                int size3 = listExtraCallback.size();
                while (i3 < size3) {
                    int i15 = readTypedObject + 11;
                    onActivityLayout = i15 % 128;
                    if (i15 % 2 == 0) {
                        onWarmupCompleted(listExtraCallback.get(i3), 2.0f);
                        i3 += 28;
                    } else {
                        onWarmupCompleted(listExtraCallback.get(i3), 0.0f);
                        i3++;
                    }
                }
                return;
            }
        } else if (i14 >= iIntValue) {
            int size4 = listExtraCallback.size();
            while (i3 < size4) {
                int i16 = readTypedObject + 109;
                onActivityLayout = i16 % 128;
                int i17 = i16 % 2;
                onWarmupCompleted(listExtraCallback.get(i3), 1.0f);
                i3++;
            }
            return;
        }
        int size5 = listExtraCallback.size();
        while (i3 < size5) {
            T t = listExtraCallback.get(i3);
            int iIAuthTabCallbackStub = t.IAuthTabCallbackStub();
            if (i14 <= iIAuthTabCallbackStub) {
                int i18 = onActivityLayout + 5;
                readTypedObject = i18 % 128;
                onWarmupCompleted(t, i18 % 2 != 0 ? i14 * iIAuthTabCallbackStub : i14 / iIAuthTabCallbackStub);
            } else {
                onWarmupCompleted(t, 1.0f);
            }
            i3++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void asInterface(int i) {
        int i2;
        int i3 = 2 % 2;
        List<T> listExtraCallback = extraCallback();
        if (listExtraCallback.isEmpty()) {
            int i4 = onActivityLayout + 87;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            access000(i);
            return;
        }
        pxToDp pxtodpICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        Integer num = null;
        pxToDp.onNavigationEvent onnavigationevent = pxtodpICustomTabsCallback_Parcel instanceof pxToDp.onNavigationEvent ? (pxToDp.onNavigationEvent) pxtodpICustomTabsCallback_Parcel : null;
        if (onnavigationevent == null) {
            throw new IllegalStateException();
        }
        int i6 = onActivityLayout + 65;
        readTypedObject = i6 % 128;
        int i7 = i6 % 2;
        int iOnNavigationEvent = onnavigationevent.onNavigationEvent();
        int i8 = 0;
        if (!listExtraCallback.isEmpty()) {
            Integer numValueOf = Integer.valueOf(listExtraCallback.get(0).IAuthTabCallbackStub());
            int lastIndex = CollectionsKt.getLastIndex(listExtraCallback);
            if (lastIndex > 0) {
                int i9 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf((i9 * iOnNavigationEvent) + listExtraCallback.get(i9).IAuthTabCallbackStub());
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i9 == lastIndex) {
                        break;
                    }
                    int i10 = readTypedObject + 83;
                    onActivityLayout = i10 % 128;
                    i9 = i10 % 2 == 0 ? i9 + 22 : i9 + 1;
                }
            }
            num = numValueOf;
        }
        int iIntValue = num != null ? num.intValue() : 0;
        int i11 = this.IAuthTabCallbackStub;
        int i12 = iIntValue + i11;
        onExtraCallback(this.ICustomTabsCallback, i, this.onExtraCallback, i11, i12);
        this.ICustomTabsCallback = i;
        if (i < this.onExtraCallback) {
            int size = listExtraCallback.size();
            while (i8 < size) {
                int i13 = readTypedObject + 29;
                onActivityLayout = i13 % 128;
                if (i13 % 2 == 0) {
                    onWarmupCompleted(listExtraCallback.get(i8), 0.0f);
                    i8 += 83;
                } else {
                    onWarmupCompleted(listExtraCallback.get(i8), 0.0f);
                    i8++;
                }
            }
        } else if (i == IAuthTabCallbackStub()) {
            Iterator<T> it = listExtraCallback.iterator();
            while (it.hasNext()) {
                onWarmupCompleted((getEventService) it.next(), 1.0f);
            }
        } else if (i12 == 0) {
            int size2 = listExtraCallback.size();
            while (i8 < size2) {
                int i14 = onActivityLayout + 125;
                readTypedObject = i14 % 128;
                if (i14 % 2 != 0) {
                    onWarmupCompleted(listExtraCallback.get(i8), 0.0f);
                    i8 += 50;
                } else {
                    onWarmupCompleted(listExtraCallback.get(i8), 1.0f);
                    i8++;
                }
            }
        } else {
            int i15 = i - this.onExtraCallback;
            boolean z = this.asBinder == getExtraParameters.Alternate && ((long) (i15 / i12)) % 2 == 1;
            if (z) {
                int i16 = onActivityLayout + 87;
                readTypedObject = i16 % 128;
                i2 = (i16 % 2 != 0 ? i12 % (i15 << i12) : i12 - (i15 % i12)) - this.IAuthTabCallbackStub;
            } else {
                i2 = i15 % i12;
            }
            if (z) {
                if (i2 <= 0) {
                    int i17 = readTypedObject + 97;
                    onActivityLayout = i17 % 128;
                    int i18 = i17 % 2;
                    int size3 = listExtraCallback.size();
                    while (i8 < size3) {
                        onWarmupCompleted(listExtraCallback.get(i8), 0.0f);
                        i8++;
                    }
                } else {
                    int size4 = listExtraCallback.size();
                    while (i8 < size4) {
                        T t = listExtraCallback.get(i8);
                        int iIAuthTabCallbackStub = t.IAuthTabCallbackStub();
                        int i19 = i8 * iOnNavigationEvent;
                        if (i2 <= i19) {
                            int i20 = onActivityLayout + 51;
                            readTypedObject = i20 % 128;
                            if (i20 % 2 != 0) {
                                onWarmupCompleted(t, 2.0f);
                            } else {
                                onWarmupCompleted(t, 0.0f);
                            }
                        } else if (i2 <= i19 + iIAuthTabCallbackStub) {
                            onWarmupCompleted(t, (i2 - i19) / iIAuthTabCallbackStub);
                        } else {
                            onWarmupCompleted(t, 1.0f);
                        }
                        i8++;
                    }
                }
            } else if (i2 >= iIntValue) {
                int i21 = onActivityLayout + 3;
                readTypedObject = i21 % 128;
                int i22 = i21 % 2;
                int size5 = listExtraCallback.size();
                while (i8 < size5) {
                    onWarmupCompleted(listExtraCallback.get(i8), 1.0f);
                    i8++;
                }
            }
        }
        int i23 = onActivityLayout + 123;
        readTypedObject = i23 % 128;
        int i24 = i23 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int onNavigationEvent(int i, int i2) {
        boolean z;
        long j;
        int iCoerceIn;
        int i3 = 2 % 2;
        if (i <= 0) {
            return 0;
        }
        int i4 = this.onExtraCallback;
        if (i > i4 && i2 > 0) {
            long j2 = i2;
            long j3 = this.IAuthTabCallbackStub;
            long j4 = j3 + j2;
            if (j4 > 0) {
                long j5 = i - i4;
                long j6 = j5 / j4;
                if (this.asBinder == getExtraParameters.Alternate) {
                    int i5 = readTypedObject + 69;
                    int i6 = i5 % 128;
                    onActivityLayout = i6;
                    if (i5 % 2 != 0 ? j6 % 2 != 1 : (j6 ^ 2) != 1) {
                        z = false;
                    } else {
                        int i7 = i6 + 59;
                        readTypedObject = i7 % 128;
                        if (i7 % 2 == 0) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    int i8 = onActivityLayout + 3;
                    readTypedObject = i8 % 128;
                    int i9 = i8 % 2;
                    j = (j4 - (j5 % j4)) - j3;
                } else {
                    j = j5 % j4;
                }
                if (z && j <= 0) {
                    iCoerceIn = 0;
                } else if (!z) {
                    int i10 = readTypedObject + 23;
                    onActivityLayout = i10 % 128;
                    int i11 = i10 % 2;
                    iCoerceIn = j >= j2 ? i2 : (int) RangesKt.coerceIn(j, 0L, j2);
                }
                return this.onExtraCallback + iCoerceIn;
            }
        }
        return i;
    }

    public final void onExtraCallback(long j) {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 87;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ValueAnimator valueAnimator = this.onExtraCallbackWithResult;
        if (valueAnimator != null) {
            int i4 = i2 + 113;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
            valueAnimator.setCurrentPlayTime(j);
            int i6 = onActivityLayout + 101;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public final isFireOS<T> access000() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (isFireOS) onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -683498017, iOnExtraCallbackWithResult, 683498022);
    }

    public final void onNavigationEvent(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -368425803, iOnExtraCallbackWithResult, 368425806);
    }

    public final Boolean writeTypedObject() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Boolean) onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -2993319, iOnExtraCallbackWithResult, 2993327);
    }

    public final Long onActivityLayout() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Long) onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -2006667594, iOnExtraCallbackWithResult, 2006667601);
    }

    public final Map<Object, Function0<Unit>> ICustomTabsCallbackStubProxy() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Map) onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 2140325197, iOnExtraCallbackWithResult, -2140325197);
    }

    public final Map<Object, Function0<Unit>> onUnminimized() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Map) onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 25930010, iOnExtraCallbackWithResult, -25930004);
    }

    public final boolean prefetchWithMultipleUrls() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 1606632384, iOnExtraCallbackWithResult, -1606632380)).booleanValue();
    }

    public final isFireOS<T> IAuthTabCallbackStub(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (isFireOS) onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -877071172, iOnExtraCallbackWithResult, 877071174);
    }

    public final void onTransact(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1910894775, iOnExtraCallbackWithResult, 1910894776);
    }
}
