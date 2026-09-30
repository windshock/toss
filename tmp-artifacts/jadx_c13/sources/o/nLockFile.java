package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.channels.ReceiveCatching;
import o.GeckoHubImp;
import o.jni_YGNodeStyleGetBorderJNI;
import o.nLockFile;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class nLockFile<E> implements nLockFileSegment<E> {
    private static final /* synthetic */ AtomicLongFieldUpdater IAuthTabCallbackDefault;
    private static final /* synthetic */ AtomicReferenceFieldUpdater IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy;
    private static int IAuthTabCallback_Parcel;
    private static byte[] ICustomTabsCallback;
    private static final /* synthetic */ AtomicLongFieldUpdater access100;
    private static final /* synthetic */ AtomicReferenceFieldUpdater asBinder;
    private static final /* synthetic */ AtomicReferenceFieldUpdater asInterface;
    private static int onActivityLayout;
    private static final /* synthetic */ AtomicReferenceFieldUpdater onExtraCallback;
    private static final /* synthetic */ AtomicReferenceFieldUpdater onExtraCallbackWithResult;
    private static final /* synthetic */ AtomicLongFieldUpdater onTransact;
    private static final /* synthetic */ AtomicLongFieldUpdater onWarmupCompleted;
    private static int readTypedObject;
    private static short[] writeTypedObject;
    public final Function1<E, Unit> IAuthTabCallback;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private final int access000;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private final getBacktraceNote<jni_YGNodeStyleGetBorderJNI<?>, Object, Object, getBacktraceNote<Throwable, Object, CoroutineContext, Unit>> getInterfaceDescriptor;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    private static final byte[] $$a = {63, 67, 46, -88};
    private static final int $$b = 237;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onMessageChannelReady = 0;
    private static int extraCallbackWithResult = 0;
    private static int extraCallback = 1;

    static final class IAuthTabCallbackStub extends ContinuationImpl {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ nLockFile<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(nLockFile<E> nlockfile, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(access13800Var);
            this.this$0 = nlockfile;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = nLockFile.onExtraCallbackWithResult((nLockFile) this.this$0, (sya) null, 0, 0L, (access13800) this);
            return objOnExtraCallbackWithResult == access14100.onExtraCallback() ? objOnExtraCallbackWithResult : lud.onExtraCallback(objOnExtraCallbackWithResult);
        }
    }

    static final class onTransact<E> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ nLockFile<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(nLockFile<E> nlockfile, access13800<? super onTransact> access13800Var) {
            super(access13800Var);
            this.this$0 = nlockfile;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = nLockFile.onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this.this$0, this}, 1757675597, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1757675581, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
            return objOnWarmupCompleted == access14100.onExtraCallback() ? objOnWarmupCompleted : lud.onExtraCallback(objOnWarmupCompleted);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, byte b2) {
        int i;
        byte[] bArr = $$a;
        int i2 = 115 - (s * 4);
        int i3 = 1 - (b * 4);
        int i4 = 4 - (b2 * 3);
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i5 = i3;
            i = 0;
            i2 += i5;
            i4++;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i3) {
                return new String(bArr2, 0);
            }
            i5 = bArr[i4];
            i2 += i5;
            i4++;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i3) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i3) {
            }
        }
    }

    static {
        onActivityLayout = 1;
        onPostMessage();
        access100 = AtomicLongFieldUpdater.newUpdater(nLockFile.class, "sendersAndCloseStatus$volatile");
        onTransact = AtomicLongFieldUpdater.newUpdater(nLockFile.class, "receivers$volatile");
        onWarmupCompleted = AtomicLongFieldUpdater.newUpdater(nLockFile.class, "bufferEnd$volatile");
        IAuthTabCallbackDefault = AtomicLongFieldUpdater.newUpdater(nLockFile.class, "completedExpandBuffersAndPauseFlag$volatile");
        asInterface = AtomicReferenceFieldUpdater.newUpdater(nLockFile.class, Object.class, "sendSegment$volatile");
        asBinder = AtomicReferenceFieldUpdater.newUpdater(nLockFile.class, Object.class, "receiveSegment$volatile");
        onExtraCallbackWithResult = AtomicReferenceFieldUpdater.newUpdater(nLockFile.class, Object.class, "bufferEndSegment$volatile");
        onExtraCallback = AtomicReferenceFieldUpdater.newUpdater(nLockFile.class, Object.class, "_closeCause$volatile");
        IAuthTabCallbackStub = AtomicReferenceFieldUpdater.newUpdater(nLockFile.class, Object.class, "closeHandler$volatile");
        int i = onMessageChannelReady + 107;
        onActivityLayout = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(Object obj, nLockFile nlockfile, jni_YGNodeStyleGetBorderJNI jni_ygnodestylegetborderjni, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 31;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(obj, nlockfile, jni_ygnodestylegetborderjni, th, obj2, coroutineContext);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(obj, nlockfile, jni_ygnodestylegetborderjni, th, obj2, coroutineContext);
        int i3 = extraCallbackWithResult + 119;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 91;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = IAuthTabCallbackStub;
        int i5 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return atomicReferenceFieldUpdater;
    }

    private static final /* synthetic */ AtomicLongFieldUpdater ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 63;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = access100;
        int i5 = i2 + 53;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return atomicLongFieldUpdater;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 55;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            atomicReferenceFieldUpdater = asInterface;
            int i4 = 12 / 0;
        } else {
            atomicReferenceFieldUpdater = asInterface;
        }
        int i5 = i2 + 21;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return atomicReferenceFieldUpdater;
    }

    private static final /* synthetic */ AtomicLongFieldUpdater extraCommand() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 103;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = onTransact;
        int i5 = i2 + 43;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return atomicLongFieldUpdater;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater isEngagementSignalsApiAvailable() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 81;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            atomicReferenceFieldUpdater = onExtraCallback;
            int i4 = 47 / 0;
        } else {
            atomicReferenceFieldUpdater = onExtraCallback;
        }
        int i5 = i2 + 97;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return atomicReferenceFieldUpdater;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 55;
        int i3 = i2 % 128;
        extraCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = asBinder;
        int i4 = i3 + 29;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return atomicReferenceFieldUpdater;
    }

    private static final /* synthetic */ AtomicLongFieldUpdater onActivityResized() {
        int i = 2 % 2;
        int i2 = extraCallback + 7;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = onWarmupCompleted;
        int i5 = i3 + 5;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return atomicLongFieldUpdater;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, Object obj, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        int i = 2 % 2;
        int i2 = extraCallback + 11;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(function1, obj, th, obj2, coroutineContext);
        }
        IAuthTabCallback(function1, obj, th, obj2, coroutineContext);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public static /* synthetic */ getBacktraceNote onNavigationEvent(nLockFile nlockfile, jni_YGNodeStyleGetBorderJNI jni_ygnodestylegetborderjni, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 67;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(nlockfile, jni_ygnodestylegetborderjni, obj, obj2);
            throw null;
        }
        getBacktraceNote getbacktracenoteIAuthTabCallback = IAuthTabCallback(nlockfile, jni_ygnodestylegetborderjni, obj, obj2);
        int i3 = extraCallbackWithResult + 107;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return getbacktracenoteIAuthTabCallback;
    }

    private static final /* synthetic */ AtomicLongFieldUpdater onUnminimized() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 41;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = IAuthTabCallbackDefault;
        int i5 = i3 + 39;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return atomicLongFieldUpdater;
        }
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        long j;
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~i;
        int i11 = i9 | (~(i8 | i10));
        int i12 = ~(i | i2 | i4);
        int i13 = i11 | i12;
        int i14 = i10 | i2;
        int i15 = i2 + i4 + i3 + (112060874 * i5) + ((-1891258303) * i6);
        int i16 = i15 * i15;
        int i17 = (i2 * 1286644997) + 1783103488 + (1286644997 * i4) + (i13 * (-1821943044)) + ((-651081208) * i12) + ((-1821943044) * i14) + ((-535298048) * i3) + ((-1427111936) * i5) + (1712848896 * i6) + (159514624 * i16);
        int i18 = ((i2 * (-1669307009)) - 1771304782) + (i4 * (-1669307009)) + (i13 * 564) + (i12 * (-1128)) + (i14 * 564) + (i3 * (-1669306445)) + (i5 * (-1582645698)) + (i6 * (-198941581)) + (i16 * (-203030528));
        switch (i17 + (i18 * i18 * (-2008154112))) {
            case 1:
                int i19 = 2 % 2;
                int i20 = extraCallbackWithResult + 101;
                int i21 = i20 % 128;
                extraCallback = i21;
                int i22 = i20 % 2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onExtraCallbackWithResult;
                int i23 = i21 + 3;
                extraCallbackWithResult = i23 % 128;
                int i24 = i23 % 2;
                return atomicReferenceFieldUpdater;
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return IAuthTabCallback(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return asInterface(objArr);
            case 10:
                return onTransact(objArr);
            case 11:
                return asBinder(objArr);
            case 12:
                return access000(objArr);
            case 13:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                return getInterfaceDescriptor(objArr);
            case 15:
                return access100(objArr);
            case 16:
                return IAuthTabCallback_Parcel(objArr);
            case 17:
                return ICustomTabsCallback(objArr);
            case 18:
                return extraCallback(objArr);
            case 19:
                return writeTypedObject(objArr);
            case 20:
                return readTypedObject(objArr);
            default:
                nLockFile nlockfile = (nLockFile) objArr[0];
                int i25 = 2 % 2;
                int i26 = extraCallback + 19;
                extraCallbackWithResult = i26 % 128;
                int i27 = i26 % 2;
                AtomicLongFieldUpdater atomicLongFieldUpdaterICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
                int i28 = extraCallback + 103;
                extraCallbackWithResult = i28 % 128;
                int i29 = i28 % 2;
                do {
                    j = atomicLongFieldUpdaterICustomTabsCallback_Parcel.get(nlockfile);
                } while (!atomicLongFieldUpdaterICustomTabsCallback_Parcel.compareAndSet(nlockfile, j, nTryLock.onExtraCallback(1152921504606846975L & j, 3)));
                return null;
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object IAuthTabCallback(@NotNull access13800<? super lud<? extends E>> access13800Var) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 77;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, access13800Var}, 1757675597, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1757675581, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        }
        onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, access13800Var}, 1757675597, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1757675581, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 5;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    protected void extraCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 85;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    protected boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 55;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 67;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void onActivityLayout() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 123;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // o.lt
    public Object onExtraCallback(E e, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 23;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = onExtraCallback(this, e, access13800Var);
        int i4 = extraCallbackWithResult + 125;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object onExtraCallbackWithResult(@NotNull access13800<? super E> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 103;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback((nLockFile) this, (access13800) access13800Var);
        }
        IAuthTabCallback((nLockFile) this, (access13800) access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nLockFile(int i, @Nullable Function1<? super E, Unit> function1) {
        getBacktraceNote<jni_YGNodeStyleGetBorderJNI<?>, Object, Object, getBacktraceNote<Throwable, Object, CoroutineContext, Unit>> getbacktracenote;
        this.access000 = i;
        this.IAuthTabCallback = function1;
        if (i < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = nTryLock.IAuthTabCallback(i);
        this.completedExpandBuffersAndPauseFlag$volatile = ICustomTabsCallbackDefault();
        sya syaVar = new sya(0L, null, this, 3);
        this.sendSegment$volatile = syaVar;
        this.receiveSegment$volatile = syaVar;
        if (!(!newSession())) {
            int i2 = extraCallback + 123;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            syaVar = nTryLock.IAuthTabCallbackStubProxy;
            Intrinsics.checkNotNull(syaVar, "");
            int i4 = 2 % 2;
        }
        this.bufferEndSegment$volatile = syaVar;
        if (function1 != 0) {
            getbacktracenote = new getBacktraceNote() { // from class: kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda1
                @Override // o.getBacktraceNote
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return nLockFile.onNavigationEvent(this.f$0, (jni_YGNodeStyleGetBorderJNI) obj, obj2, obj3);
                }
            };
            int i5 = extraCallback + 107;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } else {
            getbacktracenote = null;
        }
        this.getInterfaceDescriptor = getbacktracenote;
        this._closeCause$volatile = nTryLock.access000;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ nLockFile(int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = extraCallbackWithResult + 101;
            extraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = 2 % 2;
            function1 = null;
        }
        this(i, function1);
    }

    public static final /* synthetic */ Throwable IAuthTabCallback(nLockFile nlockfile) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 119;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            nlockfile.ICustomTabsCallbackStub();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Throwable thICustomTabsCallbackStub = nlockfile.ICustomTabsCallbackStub();
        int i3 = extraCallback + 21;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return thICustomTabsCallbackStub;
    }

    public static final /* synthetic */ access5300 IAuthTabCallback(nLockFile nlockfile, Function1 function1) {
        int i = 2 % 2;
        int i2 = extraCallback + 89;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return nlockfile.onExtraCallback(function1);
        }
        nlockfile.onExtraCallback(function1);
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(nLockFile nlockfile, Object obj, maybeRemoveAttachStateListener mayberemoveattachstatelistener) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 31;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        Object[] objArr = {nlockfile, obj, mayberemoveattachstatelistener};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback4 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        if (i3 == 0) {
            onWarmupCompleted(iIAuthTabCallback, objArr, 632645495, iIAuthTabCallback2, -632645493, iIAuthTabCallback3, iIAuthTabCallback4);
            throw null;
        }
        onWarmupCompleted(iIAuthTabCallback, objArr, 632645495, iIAuthTabCallback2, -632645493, iIAuthTabCallback3, iIAuthTabCallback4);
        int i4 = extraCallback + 75;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(nLockFile nlockfile, syncDoGet syncdoget, sya syaVar, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 109;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        nlockfile.IAuthTabCallback(syncdoget, syaVar, i);
        if (i4 == 0) {
            int i5 = 2 / 0;
        }
        int i6 = extraCallback + 69;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 57;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        AtomicLongFieldUpdater atomicLongFieldUpdaterICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        return atomicLongFieldUpdaterICustomTabsCallback_Parcel;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        nLockFile nlockfile = (nLockFile) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        sya<E> syaVar = (sya) objArr[2];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 5;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return nlockfile.onWarmupCompleted(jLongValue, syaVar);
        }
        nlockfile.onWarmupCompleted(jLongValue, syaVar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ int onExtraCallback(nLockFile nlockfile, sya syaVar, int i, Object obj, long j, Object obj2, boolean z) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 35;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iOnExtraCallbackWithResult = nlockfile.onExtraCallbackWithResult(syaVar, i, obj, j, obj2, z);
        int i5 = extraCallbackWithResult + 45;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return iOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        nLockFile nlockfile = (nLockFile) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 47;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {nlockfile, Long.valueOf(jLongValue)};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback4 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        if (i3 != 0) {
            return Boolean.valueOf(((Boolean) onWarmupCompleted(iIAuthTabCallback, objArr2, -610862469, iIAuthTabCallback2, 610862479, iIAuthTabCallback3, iIAuthTabCallback4)).booleanValue());
        }
        ((Boolean) onWarmupCompleted(iIAuthTabCallback, objArr2, -610862469, iIAuthTabCallback2, 610862479, iIAuthTabCallback3, iIAuthTabCallback4)).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getBacktraceNote onExtraCallback(nLockFile nlockfile, Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 33;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<Throwable, Object, CoroutineContext, Unit> getbacktracenoteIAuthTabCallback = nlockfile.IAuthTabCallback((Function1<? super Function1, Unit>) function1, (Function1) obj);
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return getbacktracenoteIAuthTabCallback;
    }

    public static final /* synthetic */ sya onExtraCallback(nLockFile nlockfile, long j, sya syaVar) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            nlockfile.onExtraCallback(j, syaVar);
            throw null;
        }
        sya<E> syaVarOnExtraCallback = nlockfile.onExtraCallback(j, syaVar);
        int i3 = extraCallback + 101;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return syaVarOnExtraCallback;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(nLockFile nlockfile, sya syaVar, int i, long j, Object obj) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 15;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object objOnNavigationEvent = nlockfile.onNavigationEvent(syaVar, i, j, obj);
        int i5 = extraCallbackWithResult + 15;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return objOnNavigationEvent;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(nLockFile nlockfile, sya syaVar, int i, long j, access13800 access13800Var) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 91;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object objOnWarmupCompleted = onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nlockfile, syaVar, Integer.valueOf(i), Long.valueOf(j), access13800Var}, 1323250223, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1323250211, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        int i5 = extraCallback + 5;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return objOnWarmupCompleted;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(nLockFile nlockfile, Throwable th, Object obj, CoroutineContext coroutineContext) {
        int i = 2 % 2;
        int i2 = extraCallback + 71;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        nlockfile.onExtraCallbackWithResult(th, (Throwable) obj, coroutineContext);
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(nLockFile nlockfile, maybeRemoveAttachStateListener mayberemoveattachstatelistener) {
        int i = 2 % 2;
        int i2 = extraCallback + 3;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        nlockfile.onWarmupCompleted(mayberemoveattachstatelistener);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(nLockFile nlockfile, syncDoGet syncdoget, sya syaVar, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 41;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        nlockfile.onWarmupCompleted(syncdoget, syaVar, i);
        int i5 = extraCallback + 115;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ Object onNavigationEvent(nLockFile nlockfile, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 97;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = nlockfile.IAuthTabCallback(obj, obj2);
        int i4 = extraCallbackWithResult + 99;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 83;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterMayLaunchUrl = mayLaunchUrl();
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        return atomicReferenceFieldUpdaterMayLaunchUrl;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater onTransact() {
        int i = 2 % 2;
        int i2 = extraCallback + 13;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = (AtomicReferenceFieldUpdater) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[0], -1349238246, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1349238261, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        int i4 = extraCallback + 69;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return atomicReferenceFieldUpdater;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onWarmupCompleted(nLockFile nlockfile, Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 73;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = nlockfile.onWarmupCompleted(obj, obj2);
        int i4 = extraCallback + 51;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnWarmupCompleted;
        }
        throw null;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater onWarmupCompleted() {
        AtomicLongFieldUpdater atomicLongFieldUpdaterExtraCommand;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 43;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            atomicLongFieldUpdaterExtraCommand = extraCommand();
            int i3 = 4 / 0;
        } else {
            atomicLongFieldUpdaterExtraCommand = extraCommand();
        }
        int i4 = extraCallback + 77;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return atomicLongFieldUpdaterExtraCommand;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ access5300 onWarmupCompleted(nLockFile nlockfile, Function1 function1) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 105;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        access5300<Unit> access5300VarIAuthTabCallback = nlockfile.IAuthTabCallback(function1);
        int i4 = extraCallbackWithResult + 1;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return access5300VarIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(nLockFile nlockfile, Throwable th, Object obj, CoroutineContext coroutineContext) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 5;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        nlockfile.onWarmupCompleted(th, obj, coroutineContext);
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        int i5 = extraCallbackWithResult + 79;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(nLockFile nlockfile, jni_YGNodeStyleGetBorderJNI jni_ygnodestylegetborderjni, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 61;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        nlockfile.onExtraCallback((jni_YGNodeStyleGetBorderJNI<?>) jni_ygnodestylegetborderjni, obj);
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(nLockFile nlockfile, maybeRemoveAttachStateListener mayberemoveattachstatelistener) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 39;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nlockfile, mayberemoveattachstatelistener}, 1936512349, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1936512330, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        int i4 = extraCallbackWithResult + 17;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
    }

    public final long access100() {
        int i = 2 % 2;
        int i2 = extraCallback + 7;
        extraCallbackWithResult = i2 % 128;
        return i2 % 2 != 0 ? ICustomTabsCallback_Parcel().get(this) % 1152921504606846975L : ICustomTabsCallback_Parcel().get(this) & 1152921504606846975L;
    }

    public final long IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 111;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        long j = extraCommand().get(this);
        int i4 = extraCallback + 93;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final long ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 99;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        long j = onActivityResized().get(this);
        int i4 = extraCallbackWithResult + 113;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    private final boolean newSession() {
        int i = 2 % 2;
        long jICustomTabsCallbackDefault = ICustomTabsCallbackDefault();
        if (jICustomTabsCallbackDefault != 0) {
            int i2 = extraCallbackWithResult;
            int i3 = i2 + 39;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (jICustomTabsCallbackDefault != LongCompanionObject.MAX_VALUE) {
                int i5 = i2 + 81;
                extraCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
        }
        int i7 = extraCallback + 71;
        extraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(syncDoGet syncdoget, sya<E> syaVar, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 39;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        syncdoget.IAuthTabCallback(syaVar, i + nTryLock.onNavigationEvent);
        int i5 = extraCallbackWithResult + 31;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        nLockFile nlockfile = (nLockFile) objArr[0];
        Object obj = objArr[1];
        maybeRemoveAttachStateListener mayberemoveattachstatelistener = (maybeRemoveAttachStateListener) objArr[2];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 79;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        Function1<E, Unit> function1 = nlockfile.IAuthTabCallback;
        if (function1 != null) {
            int i5 = i3 + 69;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            ycx7.onExtraCallback(function1, obj, mayberemoveattachstatelistener.getContext());
            int i7 = extraCallback + 111;
            extraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
        Throwable th = (Throwable) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nlockfile}, 1328941896, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1328941878, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        Result.Companion companion = Result.Companion;
        mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(th)));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x013f, code lost:
    
        throw new java.lang.IllegalStateException("unexpected");
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f2 A[SYNTHETIC] */
    @Override // o.lt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object IAuthTabCallback(E e) {
        sya syaVar;
        int i = 2 % 2;
        if (onTransact(ICustomTabsCallback_Parcel().get(this))) {
            int i2 = extraCallbackWithResult + 25;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            return lud.Companion.onExtraCallbackWithResult();
        }
        djExternalSyntheticApiModelOutline0 djexternalsyntheticapimodeloutline0 = nTryLock.onTransact;
        sya syaVar2 = (sya) onTransact().get(this);
        while (true) {
            long andIncrement = IAuthTabCallbackDefault().getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zBooleanValue = ((Boolean) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, Long.valueOf(andIncrement)}, 131741186, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -131741181, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue();
            long j2 = nTryLock.onNavigationEvent;
            long j3 = j / j2;
            int i4 = (int) (j % j2);
            if (syaVar2.onExtraCallback != j3) {
                sya syaVarOnExtraCallback = onExtraCallback(this, j3, syaVar2);
                if (syaVarOnExtraCallback != null) {
                    syaVar = syaVarOnExtraCallback;
                } else if (!(!zBooleanValue)) {
                    int i5 = extraCallbackWithResult + 37;
                    extraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    Object objOnExtraCallback = lud.Companion.onExtraCallback((Throwable) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this}, 1328941896, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1328941878, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback()));
                    int i7 = extraCallback + 43;
                    extraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 12 / 0;
                    }
                    return objOnExtraCallback;
                }
            } else {
                syaVar = syaVar2;
            }
            int iOnExtraCallback = onExtraCallback(this, syaVar, i4, e, j, djexternalsyntheticapimodeloutline0, zBooleanValue);
            if (iOnExtraCallback == 0) {
                syaVar.onWarmupCompleted();
                return lud.Companion.onNavigationEvent(Unit.INSTANCE);
            }
            if (iOnExtraCallback == 1) {
                return lud.Companion.onNavigationEvent(Unit.INSTANCE);
            }
            if (iOnExtraCallback == 2) {
                if (!zBooleanValue) {
                    syaVar.access100();
                    return lud.Companion.onExtraCallbackWithResult();
                }
                syaVar.access100();
                Object objOnExtraCallback2 = lud.Companion.onExtraCallback((Throwable) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this}, 1328941896, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1328941878, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback()));
                int i9 = extraCallbackWithResult + 21;
                extraCallback = i9 % 128;
                int i10 = i9 % 2;
                return objOnExtraCallback2;
            }
            int i11 = extraCallbackWithResult + 67;
            extraCallback = i11 % 128;
            if (i11 % 2 == 0) {
                if (iOnExtraCallback == 3) {
                    break;
                }
                if (iOnExtraCallback != 4) {
                    if (j < IAuthTabCallbackStubProxy()) {
                        int i12 = extraCallbackWithResult + 123;
                        extraCallback = i12 % 128;
                        if (i12 % 2 == 0) {
                            syaVar.onWarmupCompleted();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        syaVar.onWarmupCompleted();
                    }
                    return lud.Companion.onExtraCallback((Throwable) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this}, 1328941896, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1328941878, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback()));
                }
                if (iOnExtraCallback == 5) {
                    syaVar.onWarmupCompleted();
                }
                syaVar2 = syaVar;
            } else {
                if (iOnExtraCallback == 3) {
                    break;
                }
                if (iOnExtraCallback != 4) {
                }
            }
        }
    }

    static final class onExtraCallbackWithResult implements syncDoGet {
        private final /* synthetic */ setResourceInternal<Boolean> IAuthTabCallback;
        private final maybeRemoveAttachStateListener<Boolean> onExtraCallbackWithResult;

        @Override // o.syncDoGet
        public void IAuthTabCallback(@NotNull ycx5<?> ycx5Var, int i) {
            this.IAuthTabCallback.IAuthTabCallback(ycx5Var, i);
        }

        public final maybeRemoveAttachStateListener<Boolean> IAuthTabCallback() {
            return this.onExtraCallbackWithResult;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01b6 A[PHI: r3
      0x01b6: PHI (r3v9 int) = (r3v8 int), (r3v39 int) binds: [B:44:0x01b4, B:41:0x01a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c0 A[PHI: r3
      0x01c0: PHI (r3v36 int) = (r3v8 int), (r3v39 int) binds: [B:44:0x01b4, B:41:0x01a2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallbackStubProxy)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 43424), (KeyEvent.getMaxKeyCode() >> 16) + 42, (-16754777) - Color.rgb(0, 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                int i8 = $11 + 37;
                $10 = i8 % 128;
                if (i8 % 2 == 0) {
                    byte[] bArr = ICustomTabsCallback;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        for (int i9 = 0; i9 < length; i9++) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0)), 55 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        }
                        int i10 = $11 + 65;
                        $10 = i10 % 128;
                        i6 = 2;
                        int i11 = i10 % 2;
                        bArr = bArr2;
                    } else {
                        i6 = 2;
                    }
                    if (bArr != null) {
                        int i12 = $10 + 15;
                        $11 = i12 % 128;
                        int i13 = i12 % i6;
                        byte[] bArr3 = ICustomTabsCallback;
                        Object[] objArr4 = new Object[i6];
                        objArr4[1] = Integer.valueOf(IAuthTabCallback_Parcel);
                        objArr4[0] = Integer.valueOf(i);
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 43424), View.MeasureSpec.getMode(0) + 42, Color.argb(0, 0, 0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStubProxy ^ (-4629411779493505016L))));
                    } else {
                        iIntValue = (short) (((short) (writeTypedObject[i + ((int) (IAuthTabCallback_Parcel ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStubProxy ^ (-4629411779493505016L))));
                    }
                } else {
                    throw null;
                }
            }
            if (iIntValue > 0) {
                int i14 = $11;
                int i15 = i14 + Imgproc.COLOR_YUV2RGBA_YVYU;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    i4 = ((i >> iIntValue) << 4) + ((int) (IAuthTabCallback_Parcel | (-4629411779493505016L)));
                    if (!(!z)) {
                        int i16 = i14 + 55;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback_Parcel ^ (-4629411779493505016L)));
                    if (z) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(readTypedObject), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET)), 86 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0), 9567 - Drawable.resolveOpacity(0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = ICustomTabsCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i18 = 0; i18 < length2; i18++) {
                        bArr5[i18] = (byte) (bArr4[i18] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = ICustomTabsCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = writeTypedObject;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    protected final Object onExtraCallbackWithResult(E e) {
        sya syaVar;
        int i = 2 % 2;
        int i2 = extraCallback + 91;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        djExternalSyntheticApiModelOutline0 djexternalsyntheticapimodeloutline0 = nTryLock.onExtraCallbackWithResult;
        sya syaVar2 = (sya) onTransact().get(this);
        while (true) {
            long andIncrement = IAuthTabCallbackDefault().getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zBooleanValue = ((Boolean) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, Long.valueOf(andIncrement)}, 131741186, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -131741181, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue();
            long j2 = nTryLock.onNavigationEvent;
            long j3 = j / j2;
            int i4 = (int) (j % j2);
            if (syaVar2.onExtraCallback != j3) {
                sya syaVarOnExtraCallback = onExtraCallback(this, j3, syaVar2);
                if (syaVarOnExtraCallback == null) {
                    int i5 = extraCallback + 65;
                    extraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    if (zBooleanValue) {
                        return lud.Companion.onExtraCallback((Throwable) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this}, 1328941896, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1328941878, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback()));
                    }
                } else {
                    syaVar = syaVarOnExtraCallback;
                }
            } else {
                syaVar = syaVar2;
            }
            sya syaVar3 = syaVar;
            int iOnExtraCallback = onExtraCallback(this, syaVar, i4, e, j, djexternalsyntheticapimodeloutline0, zBooleanValue);
            if (iOnExtraCallback == 0) {
                syaVar3.onWarmupCompleted();
                return lud.Companion.onNavigationEvent(Unit.INSTANCE);
            }
            if (iOnExtraCallback == 1) {
                return lud.Companion.onNavigationEvent(Unit.INSTANCE);
            }
            int i7 = extraCallback;
            int i8 = i7 + 29;
            extraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            if (iOnExtraCallback == 2) {
                if (!zBooleanValue) {
                    onExtraCallbackWithResult((syaVar3.onExtraCallback * j2) + i4);
                    return lud.Companion.onNavigationEvent(Unit.INSTANCE);
                }
                syaVar3.access100();
                return lud.Companion.onExtraCallback((Throwable) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this}, 1328941896, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1328941878, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback()));
            }
            if (iOnExtraCallback == 3) {
                throw new IllegalStateException("unexpected");
            }
            int i10 = i7 + 101;
            extraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            if (iOnExtraCallback == 4) {
                if (j < IAuthTabCallbackStubProxy()) {
                    syaVar3.onWarmupCompleted();
                }
                return lud.Companion.onExtraCallback((Throwable) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this}, 1328941896, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1328941878, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback()));
            }
            if (iOnExtraCallback == 5) {
                syaVar3.onWarmupCompleted();
            }
            syaVar2 = syaVar3;
        }
    }

    private final int onExtraCallbackWithResult(sya<E> syaVar, int i, E e, long j, Object obj, boolean z) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 113;
        extraCallbackWithResult = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            syaVar.onWarmupCompleted(i, (int) e);
            obj2.hashCode();
            throw null;
        }
        syaVar.onWarmupCompleted(i, (int) e);
        if (z) {
            return onExtraCallback((sya<int>) syaVar, i, (int) e, j, obj, z);
        }
        Object objOnExtraCallback = syaVar.onExtraCallback(i);
        if (objOnExtraCallback == null) {
            int i4 = extraCallback + 45;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (((Boolean) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, Long.valueOf(j)}, -711815857, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 711815874, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue()) {
                int i6 = extraCallback + 77;
                extraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                if (syaVar.onExtraCallback(i, null, nTryLock.onExtraCallbackWithResult)) {
                    int i8 = extraCallbackWithResult + 65;
                    extraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (syaVar.onExtraCallback(i, null, obj)) {
                    return 2;
                }
            }
        } else if (objOnExtraCallback instanceof syncDoGet) {
            syaVar.onWarmupCompleted(i);
            if (!onNavigationEvent(objOnExtraCallback, e)) {
                if (syaVar.onExtraCallbackWithResult(i, nTryLock.IAuthTabCallbackStub) == nTryLock.IAuthTabCallbackStub) {
                    return 5;
                }
                syaVar.onWarmupCompleted(i, true);
                return 5;
            }
            int i10 = extraCallback + 23;
            extraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            syaVar.onNavigationEvent(i, nTryLock.asInterface);
            ICustomTabsCallback();
            return 0;
        }
        return onExtraCallback((sya<int>) syaVar, i, (int) e, j, obj, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x000b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int onExtraCallback(sya<E> syaVar, int i, E e, long j, Object obj, boolean z) {
        int i2 = 2 % 2;
        while (true) {
            Object objOnExtraCallback = syaVar.onExtraCallback(i);
            if (objOnExtraCallback == null) {
                if (((Boolean) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, Long.valueOf(j)}, -711815857, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 711815874, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue()) {
                    int i3 = extraCallback + 51;
                    extraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 7 / 0;
                        if (!z) {
                            if (!syaVar.onExtraCallback(i, null, nTryLock.onExtraCallbackWithResult)) {
                                int i5 = extraCallback + 99;
                                extraCallbackWithResult = i5 % 128;
                                return i5 % 2 != 0 ? 0 : 1;
                            }
                        }
                    } else if (!z) {
                        if (!syaVar.onExtraCallback(i, null, nTryLock.onExtraCallbackWithResult)) {
                        }
                    }
                }
                if (z) {
                    if (syaVar.onExtraCallback(i, null, nTryLock.onTransact)) {
                        syaVar.onWarmupCompleted(i, false);
                        return 4;
                    }
                } else {
                    if (obj == null) {
                        int i6 = extraCallback + 97;
                        extraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        return 3;
                    }
                    if (!(!syaVar.onExtraCallback(i, null, obj))) {
                        return 2;
                    }
                }
            } else {
                if (objOnExtraCallback != nTryLock.access100) {
                    if (objOnExtraCallback == nTryLock.IAuthTabCallbackStub) {
                        int i8 = extraCallback + 27;
                        extraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        syaVar.onWarmupCompleted(i);
                        return 5;
                    }
                    if (objOnExtraCallback == nTryLock.IAuthTabCallback_Parcel) {
                        syaVar.onWarmupCompleted(i);
                        return 5;
                    }
                    if (objOnExtraCallback == nTryLock.extraCallback()) {
                        syaVar.onWarmupCompleted(i);
                        onExtraCallback();
                        return 4;
                    }
                    syaVar.onWarmupCompleted(i);
                    if (objOnExtraCallback instanceof thx) {
                        int i10 = extraCallbackWithResult + 75;
                        extraCallback = i10 % 128;
                        if (i10 % 2 == 0) {
                            objOnExtraCallback = ((thx) objOnExtraCallback).IAuthTabCallback;
                            int i11 = 78 / 0;
                        } else {
                            objOnExtraCallback = ((thx) objOnExtraCallback).IAuthTabCallback;
                        }
                    }
                    if (onNavigationEvent(objOnExtraCallback, e)) {
                        syaVar.onNavigationEvent(i, nTryLock.asInterface);
                        ICustomTabsCallback();
                        return 0;
                    }
                    if (syaVar.onExtraCallbackWithResult(i, nTryLock.IAuthTabCallbackStub) != nTryLock.IAuthTabCallbackStub) {
                        int i12 = extraCallbackWithResult + 123;
                        extraCallback = i12 % 128;
                        int i13 = i12 % 2;
                        syaVar.onWarmupCompleted(i, true);
                    }
                    return 5;
                }
                int i14 = extraCallback + 27;
                extraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                if (syaVar.onExtraCallback(i, objOnExtraCallback, nTryLock.onExtraCallbackWithResult)) {
                    int i16 = extraCallbackWithResult + 23;
                    extraCallback = i16 % 128;
                    return i16 % 2 == 0 ? 0 : 1;
                }
            }
        }
    }

    private final boolean onTransact(long j) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 119;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!(!((Boolean) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, Long.valueOf(j)}, -610862469, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 610862479, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue())) {
            return false;
        }
        boolean z = !((Boolean) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, Long.valueOf(j & 1152921504606846975L)}, -711815857, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 711815874, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue();
        int i4 = extraCallbackWithResult + 45;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        nLockFile nlockfile = (nLockFile) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 11;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (jLongValue < nlockfile.ICustomTabsCallbackDefault() || jLongValue < nlockfile.IAuthTabCallbackStubProxy() + nlockfile.access000) {
            return true;
        }
        int i4 = extraCallback;
        int i5 = i4 + 65;
        extraCallbackWithResult = i5 % 128;
        boolean z = i5 % 2 != 0;
        int i6 = i4 + 85;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return ((o.jni_YGNodeStyleGetBorderJNI) r7).onExtraCallbackWithResult(r6, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if ((r7 instanceof kotlinx.coroutines.channels.ReceiveCatching) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r3 = r3 + 83;
        o.nLockFile.extraCallback = r3 % 128;
        r3 = r3 % 2;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r7, "");
        r7 = ((kotlinx.coroutines.channels.ReceiveCatching) r7).onNavigationEvent;
        r8 = o.lud.onExtraCallback(o.lud.Companion.onNavigationEvent(r8));
        r1 = r6.IAuthTabCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r2 = o.nLockFile.extraCallback + 21;
        o.nLockFile.extraCallbackWithResult = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if ((r2 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        r5 = IAuthTabCallback((kotlin.jvm.functions.Function1) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        IAuthTabCallback((kotlin.jvm.functions.Function1) r1);
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        r7 = o.nTryLock.onExtraCallbackWithResult(r7, r8, (o.getBacktraceNote) r5);
        r8 = o.nLockFile.extraCallback + 49;
        o.nLockFile.extraCallbackWithResult = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if ((r8 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        r8 = 5 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if ((r7 instanceof o.nLockFile.IAuthTabCallback) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r7, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        return ((o.nLockFile.IAuthTabCallback) r7).onNavigationEvent((o.nLockFile.IAuthTabCallback) r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if ((r7 instanceof o.maybeRemoveAttachStateListener) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        r1 = r1 + 39;
        o.nLockFile.extraCallbackWithResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if ((r1 % 2) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r7, "");
        r7 = (o.maybeRemoveAttachStateListener) r7;
        r0 = r6.IAuthTabCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        r5 = onExtraCallback(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        return o.nTryLock.onExtraCallbackWithResult(r7, r8, (o.getBacktraceNote) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r7, "");
        r7 = (o.maybeRemoveAttachStateListener) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
    
        throw new java.lang.IllegalStateException(("Unexpected receiver type: " + r7).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((r7 instanceof o.jni_YGNodeStyleGetBorderJNI) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if ((r7 instanceof o.jni_YGNodeStyleGetBorderJNI) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onNavigationEvent(Object obj, E e) {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 25;
        int i4 = i3 % 128;
        extraCallbackWithResult = i4;
        if (i3 % 2 != 0) {
            int i5 = 27 / 0;
        }
    }

    static /* synthetic */ <E> Object IAuthTabCallback(nLockFile<E> nlockfile, access13800<? super E> access13800Var) throws Throwable {
        sya<E> syaVar;
        int i = 2 % 2;
        sya<E> syaVar2 = (sya) onNavigationEvent().get(nlockfile);
        while (!nlockfile.IAuthTabCallback_Parcel()) {
            long andIncrement = onWarmupCompleted().getAndIncrement(nlockfile);
            long j = nTryLock.onNavigationEvent;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (syaVar2.onExtraCallback != j2) {
                int i3 = extraCallbackWithResult + 83;
                extraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                sya<E> syaVar3 = (sya) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nlockfile, Long.valueOf(j2), syaVar2}, -459845233, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 459845240, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                if (syaVar3 != null) {
                    syaVar = syaVar3;
                } else {
                    continue;
                }
            } else {
                syaVar = syaVar2;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(nlockfile, syaVar, i2, andIncrement, (Object) null);
            if (objOnExtraCallbackWithResult == nTryLock.extraCallbackWithResult) {
                throw new IllegalStateException("unexpected");
            }
            if (objOnExtraCallbackWithResult != nTryLock.IAuthTabCallbackDefault) {
                if (objOnExtraCallbackWithResult == nTryLock.ICustomTabsCallback) {
                    int i4 = extraCallback + 113;
                    extraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return nlockfile.onExtraCallbackWithResult(syaVar, i2, andIncrement, access13800Var);
                }
                syaVar.onWarmupCompleted();
                int i6 = extraCallback + 77;
                extraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return objOnExtraCallbackWithResult;
            }
            if (andIncrement < nlockfile.access100()) {
                syaVar.onWarmupCompleted();
            }
            int i8 = extraCallback + 49;
            extraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            syaVar2 = syaVar;
        }
        throw ui.onExtraCallback(nlockfile.ICustomTabsCallbackStub());
    }

    private final void IAuthTabCallback(syncDoGet syncdoget, sya<E> syaVar, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 31;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            onActivityLayout();
            syncdoget.IAuthTabCallback(syaVar, i);
            int i4 = 74 / 0;
        } else {
            onActivityLayout();
            syncdoget.IAuthTabCallback(syaVar, i);
        }
    }

    private final void onWarmupCompleted(maybeRemoveAttachStateListener<? super E> mayberemoveattachstatelistener) {
        int i = 2 % 2;
        int i2 = extraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Result.Companion companion = Result.Companion;
            mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(ICustomTabsCallbackStub())));
            int i3 = 96 / 0;
        } else {
            Result.Companion companion2 = Result.Companion;
            mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(ICustomTabsCallbackStub())));
        }
        int i4 = extraCallbackWithResult + 85;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        onTransact ontransact;
        sya syaVar;
        nLockFile nlockfile = (nLockFile) objArr[0];
        access13800 access13800Var = (access13800) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 89;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 78 / 0;
            if (access13800Var instanceof onTransact) {
                ontransact = (onTransact) access13800Var;
                int i4 = ontransact.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    ontransact.label = i4 - 2147483648;
                } else {
                    ontransact = new onTransact(nlockfile, access13800Var);
                }
            }
        } else if (!(access13800Var instanceof onTransact)) {
        }
        Object obj = ontransact.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i5 = ontransact.label;
        if (i5 != 0) {
            int i6 = extraCallback + 13;
            extraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0 ? i5 != 1 : i5 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            Object objOnExtraCallback2 = ((lud) obj).onExtraCallback();
            int i7 = extraCallback + 53;
            extraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return objOnExtraCallback2;
        }
        ResultKt.onNavigationEvent(obj);
        sya syaVar2 = (sya) onNavigationEvent().get(nlockfile);
        int i9 = extraCallback + 125;
        extraCallbackWithResult = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 3 % 5;
        }
        while (!nlockfile.IAuthTabCallback_Parcel()) {
            long andIncrement = onWarmupCompleted().getAndIncrement(nlockfile);
            long j = nTryLock.onNavigationEvent;
            long j2 = andIncrement / j;
            int i11 = (int) (andIncrement % j);
            if (syaVar2.onExtraCallback != j2) {
                sya syaVar3 = (sya) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nlockfile, Long.valueOf(j2), syaVar2}, -459845233, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 459845240, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                if (syaVar3 != null) {
                    syaVar = syaVar3;
                } else {
                    continue;
                }
            } else {
                syaVar = syaVar2;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(nlockfile, syaVar, i11, andIncrement, (Object) null);
            if (objOnExtraCallbackWithResult == nTryLock.extraCallbackWithResult) {
                throw new IllegalStateException("unexpected");
            }
            int i12 = extraCallback + 63;
            extraCallbackWithResult = i12 % 128;
            if (i12 % 2 != 0) {
                djExternalSyntheticApiModelOutline0 unused = nTryLock.IAuthTabCallbackDefault;
                throw null;
            }
            if (objOnExtraCallbackWithResult != nTryLock.IAuthTabCallbackDefault) {
                if (objOnExtraCallbackWithResult != nTryLock.ICustomTabsCallback) {
                    syaVar.onWarmupCompleted();
                    return lud.Companion.onNavigationEvent(objOnExtraCallbackWithResult);
                }
                ontransact.label = 1;
                Object objOnWarmupCompleted = onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nlockfile, syaVar, Integer.valueOf(i11), Long.valueOf(andIncrement), ontransact}, 1323250223, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1323250211, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                return objOnWarmupCompleted == objOnExtraCallback ? objOnExtraCallback : objOnWarmupCompleted;
            }
            int i13 = extraCallback + 65;
            extraCallbackWithResult = i13 % 128;
            if (i13 % 2 != 0) {
                nlockfile.access100();
                throw null;
            }
            if (andIncrement < nlockfile.access100()) {
                syaVar.onWarmupCompleted();
            }
            syaVar2 = syaVar;
        }
        return lud.Companion.onExtraCallback(nlockfile.asBinder());
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        nLockFile nlockfile = (nLockFile) objArr[0];
        maybeRemoveAttachStateListener mayberemoveattachstatelistener = (maybeRemoveAttachStateListener) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallback + 59;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Result.Companion companion = Result.Companion;
        mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(lud.onExtraCallback(lud.Companion.onExtraCallback(nlockfile.asBinder()))));
        int i4 = extraCallback + 3;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    protected final void onExtraCallbackWithResult(long j) {
        setIndicatorDirection setindicatordirectionOnExtraCallbackWithResult;
        int i = 2 % 2;
        sya<E> syaVar = (sya) mayLaunchUrl().get(this);
        while (true) {
            long j2 = extraCommand().get(this);
            if (j < Math.max(this.access000 + j2, ICustomTabsCallbackDefault())) {
                int i2 = extraCallback + 29;
                extraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            if (extraCommand().compareAndSet(this, j2, j2 + 1)) {
                long j3 = nTryLock.onNavigationEvent;
                long j4 = j2 / j3;
                int i4 = (int) (j2 % j3);
                if (syaVar.onExtraCallback != j4) {
                    sya<E> syaVarOnWarmupCompleted = onWarmupCompleted(j4, syaVar);
                    if (syaVarOnWarmupCompleted == null) {
                        int i5 = extraCallback + 75;
                        extraCallbackWithResult = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 3 / 4;
                        }
                    } else {
                        syaVar = syaVarOnWarmupCompleted;
                    }
                }
                Object objOnNavigationEvent = onNavigationEvent(syaVar, i4, j2, (Object) null);
                Object obj = null;
                if (objOnNavigationEvent != nTryLock.IAuthTabCallbackDefault) {
                    syaVar.onWarmupCompleted();
                    Function1<E, Unit> function1 = this.IAuthTabCallback;
                    if (function1 != null && (setindicatordirectionOnExtraCallbackWithResult = ycx7.onExtraCallbackWithResult(function1, objOnNavigationEvent, null, 2, null)) != null) {
                        throw setindicatordirectionOnExtraCallbackWithResult;
                    }
                } else if (j2 < access100()) {
                    int i7 = extraCallback + 25;
                    extraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        syaVar.onWarmupCompleted();
                        obj.hashCode();
                        throw null;
                    }
                    syaVar.onWarmupCompleted();
                } else {
                    continue;
                }
            }
        }
    }

    private final Object onNavigationEvent(sya<E> syaVar, int i, long j, Object obj) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 11;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object objOnExtraCallback = syaVar.onExtraCallback(i);
        Object obj2 = null;
        if (objOnExtraCallback == null) {
            if (j >= (ICustomTabsCallback_Parcel().get(this) & 1152921504606846975L)) {
                int i5 = extraCallbackWithResult + 17;
                extraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                if (obj == null) {
                    return nTryLock.ICustomTabsCallback;
                }
                if (syaVar.onExtraCallback(i, objOnExtraCallback, obj)) {
                    onMessageChannelReady();
                    return nTryLock.extraCallbackWithResult;
                }
            }
        } else if (objOnExtraCallback == nTryLock.onExtraCallbackWithResult) {
            int i6 = extraCallbackWithResult + 57;
            extraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                syaVar.onExtraCallback(i, objOnExtraCallback, nTryLock.asInterface);
                throw null;
            }
            if (syaVar.onExtraCallback(i, objOnExtraCallback, nTryLock.asInterface)) {
                onMessageChannelReady();
                return syaVar.IAuthTabCallback(i);
            }
        }
        int i7 = extraCallback + 91;
        int i8 = i7 % 128;
        extraCallbackWithResult = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 107;
        extraCallback = i10 % 128;
        int i11 = i10 % 2;
        Object objIAuthTabCallback = IAuthTabCallback(syaVar, i, j, obj);
        if (i11 == 0) {
            int i12 = 55 / 0;
        }
        return objIAuthTabCallback;
    }

    private final Object IAuthTabCallback(sya<E> syaVar, int i, long j, Object obj) {
        int i2 = 2 % 2;
        while (true) {
            Object objOnExtraCallback = syaVar.onExtraCallback(i);
            if (objOnExtraCallback == null || objOnExtraCallback == nTryLock.access100) {
                if (j < (ICustomTabsCallback_Parcel().get(this) & 1152921504606846975L)) {
                    if (syaVar.onExtraCallback(i, objOnExtraCallback, nTryLock.IAuthTabCallback_Parcel)) {
                        onMessageChannelReady();
                        return nTryLock.IAuthTabCallbackDefault;
                    }
                } else {
                    if (obj == null) {
                        djExternalSyntheticApiModelOutline0 djexternalsyntheticapimodeloutline0 = nTryLock.ICustomTabsCallback;
                        int i3 = extraCallback + 63;
                        extraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                        return djexternalsyntheticapimodeloutline0;
                    }
                    if (syaVar.onExtraCallback(i, objOnExtraCallback, obj)) {
                        int i5 = extraCallbackWithResult + 101;
                        extraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        onMessageChannelReady();
                        return nTryLock.extraCallbackWithResult;
                    }
                }
            } else {
                if (objOnExtraCallback != nTryLock.onExtraCallbackWithResult) {
                    if (objOnExtraCallback != nTryLock.onTransact && objOnExtraCallback != nTryLock.IAuthTabCallback_Parcel) {
                        if (objOnExtraCallback == nTryLock.extraCallback()) {
                            onMessageChannelReady();
                            return nTryLock.IAuthTabCallbackDefault;
                        }
                        if (objOnExtraCallback != nTryLock.extraCallback && syaVar.onExtraCallback(i, objOnExtraCallback, nTryLock.writeTypedObject)) {
                            boolean z = objOnExtraCallback instanceof thx;
                            if (z) {
                                int i7 = extraCallbackWithResult + 71;
                                extraCallback = i7 % 128;
                                int i8 = i7 % 2;
                                objOnExtraCallback = ((thx) objOnExtraCallback).IAuthTabCallback;
                            }
                            if (!onWarmupCompleted(objOnExtraCallback, syaVar, i)) {
                                syaVar.onNavigationEvent(i, nTryLock.onTransact);
                                syaVar.onWarmupCompleted(i, false);
                                if (z) {
                                    onMessageChannelReady();
                                }
                                return nTryLock.IAuthTabCallbackDefault;
                            }
                            int i9 = extraCallback + 65;
                            extraCallbackWithResult = i9 % 128;
                            if (i9 % 2 != 0) {
                                syaVar.onNavigationEvent(i, nTryLock.asInterface);
                                onMessageChannelReady();
                                syaVar.IAuthTabCallback(i);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            syaVar.onNavigationEvent(i, nTryLock.asInterface);
                            onMessageChannelReady();
                            E eIAuthTabCallback = syaVar.IAuthTabCallback(i);
                            int i10 = extraCallback + 77;
                            extraCallbackWithResult = i10 % 128;
                            int i11 = i10 % 2;
                            return eIAuthTabCallback;
                        }
                    }
                    return nTryLock.IAuthTabCallbackDefault;
                }
                if (!(!syaVar.onExtraCallback(i, objOnExtraCallback, nTryLock.asInterface))) {
                    int i12 = extraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
                    extraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    onMessageChannelReady();
                    return syaVar.IAuthTabCallback(i);
                }
            }
        }
    }

    private final boolean onWarmupCompleted(Object obj, sya<E> syaVar, int i) {
        int i2 = 2 % 2;
        if (obj instanceof maybeRemoveAttachStateListener) {
            int i3 = extraCallbackWithResult + 87;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNull(obj, "");
            return nTryLock.IAuthTabCallback((maybeRemoveAttachStateListener) obj, Unit.INSTANCE, null, 2, null);
        }
        if (!(obj instanceof jni_YGNodeStyleGetBorderJNI)) {
            if (obj instanceof onExtraCallbackWithResult) {
                int i5 = extraCallbackWithResult + 57;
                extraCallback = i5 % 128;
                int i6 = i5 % 2;
                return nTryLock.IAuthTabCallback(((onExtraCallbackWithResult) obj).IAuthTabCallback(), Boolean.TRUE, null, 2, null);
            }
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "");
        jni_YGNodeStyleGetDisplayJNI jni_ygnodestylegetdisplayjniIAuthTabCallback = ((jni_YGNodeStyleGetDirectionJNI) obj).IAuthTabCallback(this, Unit.INSTANCE);
        if (jni_ygnodestylegetdisplayjniIAuthTabCallback == jni_YGNodeStyleGetDisplayJNI.REREGISTER) {
            int i7 = extraCallback + 51;
            extraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                syaVar.onWarmupCompleted(i);
                int i8 = 3 / 0;
            } else {
                syaVar.onWarmupCompleted(i);
            }
        }
        return jni_ygnodestylegetdisplayjniIAuthTabCallback == jni_YGNodeStyleGetDisplayJNI.SUCCESSFUL;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onMessageChannelReady() {
        int i = 2 % 2;
        if (newSession()) {
            return;
        }
        sya<E> syaVar = (sya) ((AtomicReferenceFieldUpdater) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[0], -1858799222, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1858799223, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).get(this);
        while (true) {
            long andIncrement = onActivityResized().getAndIncrement(this);
            long j = nTryLock.onNavigationEvent;
            long j2 = andIncrement / j;
            if (access100() <= andIncrement) {
                int i2 = extraCallbackWithResult + 13;
                extraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 78 / 0;
                    if (syaVar.onExtraCallback < j2) {
                        if (syaVar.onExtraCallbackWithResult() != 0) {
                            int i4 = extraCallback + 119;
                            extraCallbackWithResult = i4 % 128;
                            int i5 = i4 % 2;
                            onExtraCallbackWithResult(j2, syaVar);
                        }
                    }
                } else if (syaVar.onExtraCallback < j2) {
                }
                onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, 0L, 1, null}, 517592440, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -517592427, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                return;
            }
            if (syaVar.onExtraCallback != j2) {
                sya<E> syaVarOnNavigationEvent = onNavigationEvent(j2, syaVar, andIncrement);
                if (syaVarOnNavigationEvent != null) {
                    int i6 = extraCallback + 31;
                    extraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    syaVar = syaVarOnNavigationEvent;
                } else {
                    continue;
                }
            }
            if (((Boolean) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, syaVar, Integer.valueOf((int) (andIncrement % j)), Long.valueOf(andIncrement)}, 2110017338, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -2110017329, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue()) {
                int i8 = extraCallback + 123;
                extraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, 0L, 1, null}, 517592440, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -517592427, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                return;
            }
            onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, 0L, 1, null}, 517592440, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -517592427, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        if (r11 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r2.onWarmupCompleted(r11, r4, r6) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r11 = o.nLockFile.extraCallbackWithResult + 123;
        o.nLockFile.extraCallback = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if ((r11 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        r4.onNavigationEvent(r6, o.nTryLock.onExtraCallbackWithResult);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        r4.onNavigationEvent(r6, o.nTryLock.onExtraCallbackWithResult);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        r4.onNavigationEvent(r6, o.nTryLock.onTransact);
        r4.onWarmupCompleted(r6, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) {
        nLockFile nlockfile = (nLockFile) objArr[0];
        sya<E> syaVar = (sya) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        long jLongValue = ((Number) objArr[3]).longValue();
        int i = 2 % 2;
        Object objOnExtraCallback = syaVar.onExtraCallback(iIntValue);
        if (objOnExtraCallback instanceof syncDoGet) {
            int i2 = extraCallbackWithResult + 9;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (jLongValue >= extraCommand().get(nlockfile)) {
                int i4 = extraCallback + 29;
                extraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    syaVar.onExtraCallback(iIntValue, objOnExtraCallback, nTryLock.extraCallback);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (syaVar.onExtraCallback(iIntValue, objOnExtraCallback, nTryLock.extraCallback)) {
                    int i5 = extraCallbackWithResult + 109;
                    extraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        boolean zOnWarmupCompleted = nlockfile.onWarmupCompleted(objOnExtraCallback, syaVar, iIntValue);
                        int i6 = 58 / 0;
                    }
                }
            }
        }
        return Boolean.valueOf(nlockfile.onWarmupCompleted(syaVar, iIntValue, jLongValue));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d0, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onWarmupCompleted(sya<E> syaVar, int i, long j) {
        int i2 = 2 % 2;
        while (true) {
            Object objOnExtraCallback = syaVar.onExtraCallback(i);
            if (objOnExtraCallback instanceof syncDoGet) {
                if (j < extraCommand().get(this)) {
                    if (syaVar.onExtraCallback(i, objOnExtraCallback, new thx((syncDoGet) objOnExtraCallback))) {
                        return true;
                    }
                } else if (syaVar.onExtraCallback(i, objOnExtraCallback, nTryLock.extraCallback)) {
                    if (onWarmupCompleted(objOnExtraCallback, syaVar, i)) {
                        syaVar.onNavigationEvent(i, nTryLock.onExtraCallbackWithResult);
                        return true;
                    }
                    syaVar.onNavigationEvent(i, nTryLock.onTransact);
                    syaVar.onWarmupCompleted(i, false);
                    return false;
                }
            } else {
                if (objOnExtraCallback == nTryLock.onTransact) {
                    return false;
                }
                if (objOnExtraCallback != null) {
                    Object obj = null;
                    if (objOnExtraCallback == nTryLock.onExtraCallbackWithResult) {
                        int i3 = extraCallbackWithResult;
                        int i4 = i3 + 1;
                        extraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        int i6 = i3 + 17;
                        extraCallback = i6 % 128;
                        if (i6 % 2 != 0) {
                            return true;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    if (objOnExtraCallback == nTryLock.IAuthTabCallback_Parcel || objOnExtraCallback == nTryLock.asInterface) {
                        break;
                    }
                    int i7 = extraCallback + 115;
                    extraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        djExternalSyntheticApiModelOutline0 unused = nTryLock.IAuthTabCallbackStub;
                        throw null;
                    }
                    if (objOnExtraCallback == nTryLock.IAuthTabCallbackStub) {
                        break;
                    }
                    if (objOnExtraCallback == nTryLock.extraCallback()) {
                        int i8 = extraCallbackWithResult + 63;
                        extraCallback = i8 % 128;
                        return i8 % 2 != 0;
                    }
                    if (objOnExtraCallback != nTryLock.writeTypedObject) {
                        throw new IllegalStateException(("Unexpected cell state: " + objOnExtraCallback).toString());
                    }
                } else if (syaVar.onExtraCallback(i, objOnExtraCallback, nTryLock.access100)) {
                    return true;
                }
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        nLockFile nlockfile = (nLockFile) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        Object obj = objArr[3];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 109;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((iIntValue & 1) != 0) {
            int i5 = i3 + 35;
            int i6 = i5 % 128;
            extraCallbackWithResult = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 101;
            extraCallback = i8 % 128;
            int i9 = i8 % 2;
            jLongValue = 1;
        }
        nlockfile.asInterface(jLongValue);
        int i10 = extraCallback + 33;
        extraCallbackWithResult = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final void asInterface(long j) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 41;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0 ? (onUnminimized().addAndGet(this, j) & 4611686018427387904L) != 0 : onUnminimized().addAndGet(this, j) / 4611686018427387904L != 0) {
            while ((onUnminimized().get(this) & 4611686018427387904L) != 0) {
            }
        }
        int i3 = extraCallback + 63;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 64 / 0;
        }
    }

    public final void onExtraCallback(long j) {
        long j2;
        boolean z;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 63;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (newSession()) {
            return;
        }
        while (ICustomTabsCallbackDefault() <= j) {
        }
        int i4 = extraCallbackWithResult + 85;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        int i6 = nTryLock.asBinder;
        for (int i7 = 0; i7 < i6; i7++) {
            long jICustomTabsCallbackDefault = ICustomTabsCallbackDefault();
            if (jICustomTabsCallbackDefault == (onUnminimized().get(this) & 4611686018427387903L)) {
                int i8 = extraCallbackWithResult + 83;
                extraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 27 / 0;
                    if (jICustomTabsCallbackDefault == ICustomTabsCallbackDefault()) {
                        return;
                    }
                } else if (jICustomTabsCallbackDefault == ICustomTabsCallbackDefault()) {
                    return;
                }
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdaterOnUnminimized = onUnminimized();
        do {
            j2 = atomicLongFieldUpdaterOnUnminimized.get(this);
        } while (!atomicLongFieldUpdaterOnUnminimized.compareAndSet(this, j2, nTryLock.onWarmupCompleted(j2 & 4611686018427387903L, true)));
        while (true) {
            long jICustomTabsCallbackDefault2 = ICustomTabsCallbackDefault();
            long j3 = onUnminimized().get(this);
            long j4 = j3 & 4611686018427387903L;
            if ((4611686018427387904L & j3) != 0) {
                int i10 = extraCallbackWithResult + 91;
                extraCallback = i10 % 128;
                int i11 = i10 % 2;
                z = true;
            } else {
                z = false;
            }
            if (jICustomTabsCallbackDefault2 == j4) {
                int i12 = extraCallback + 35;
                extraCallbackWithResult = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 99 / 0;
                    if (jICustomTabsCallbackDefault2 == ICustomTabsCallbackDefault()) {
                        break;
                    }
                } else if (jICustomTabsCallbackDefault2 == ICustomTabsCallbackDefault()) {
                    break;
                }
            }
            if (!z) {
                onUnminimized().compareAndSet(this, j3, nTryLock.onWarmupCompleted(j4, true));
                int i14 = extraCallbackWithResult + 93;
                extraCallback = i14 % 128;
                int i15 = i14 % 2;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdaterOnUnminimized2 = onUnminimized();
        int i16 = extraCallback + 41;
        extraCallbackWithResult = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 5 / 3;
        }
        while (true) {
            long j5 = atomicLongFieldUpdaterOnUnminimized2.get(this);
            if (atomicLongFieldUpdaterOnUnminimized2.compareAndSet(this, j5, nTryLock.onWarmupCompleted(j5 & 4611686018427387903L, false))) {
                return;
            }
            int i18 = extraCallbackWithResult + 13;
            extraCallback = i18 % 128;
            int i19 = i18 % 2;
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public jni_YGNodeStyleGetAlignItemsJNI<E> IAuthTabCallbackStub() {
        int i = 2 % 2;
        onExtraCallback onextracallback = onExtraCallback.onExtraCallback;
        Intrinsics.checkNotNull(onextracallback, "");
        getBacktraceNote getbacktracenote = (getBacktraceNote) TypeIntrinsics.beforeCheckcastToFunctionOfArity(onextracallback, 3);
        IAuthTabCallbackDefault iAuthTabCallbackDefault = IAuthTabCallbackDefault.onWarmupCompleted;
        Intrinsics.checkNotNull(iAuthTabCallbackDefault, "");
        jni_YGNodeStyleGetAlignSelfJNI jni_ygnodestylegetalignselfjni = new jni_YGNodeStyleGetAlignSelfJNI(this, getbacktracenote, (getBacktraceNote) TypeIntrinsics.beforeCheckcastToFunctionOfArity(iAuthTabCallbackDefault, 3), this.getInterfaceDescriptor);
        int i2 = extraCallback + 71;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return jni_ygnodestylegetalignselfjni;
    }

    final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements getBacktraceNote<nLockFile<?>, jni_YGNodeStyleGetBorderJNI<?>, Object, Unit> {
        public static final onExtraCallback onExtraCallback = new onExtraCallback();

        onExtraCallback() {
            super(3, nLockFile.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // o.getBacktraceNote
        public /* synthetic */ Unit invoke(nLockFile<?> nlockfile, jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni, Object obj) {
            onExtraCallback(nlockfile, jni_ygnodestylegetborderjni, obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(nLockFile<?> nlockfile, jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni, Object obj) {
            nLockFile.onWarmupCompleted((nLockFile) nlockfile, (jni_YGNodeStyleGetBorderJNI) jni_ygnodestylegetborderjni, obj);
        }
    }

    final /* synthetic */ class IAuthTabCallbackDefault extends FunctionReferenceImpl implements getBacktraceNote<nLockFile<?>, Object, Object, Object> {
        public static final IAuthTabCallbackDefault onWarmupCompleted = new IAuthTabCallbackDefault();

        IAuthTabCallbackDefault() {
            super(3, nLockFile.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // o.getBacktraceNote
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nLockFile<?> nlockfile, Object obj, Object obj2) {
            return nLockFile.onWarmupCompleted(nlockfile, obj, obj2);
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public jni_YGNodeStyleGetAlignItemsJNI<lud<E>> asInterface() {
        int i = 2 % 2;
        asInterface asinterface = asInterface.onWarmupCompleted;
        Intrinsics.checkNotNull(asinterface, "");
        getBacktraceNote getbacktracenote = (getBacktraceNote) TypeIntrinsics.beforeCheckcastToFunctionOfArity(asinterface, 3);
        asBinder asbinder = asBinder.onNavigationEvent;
        Intrinsics.checkNotNull(asbinder, "");
        jni_YGNodeStyleGetAlignSelfJNI jni_ygnodestylegetalignselfjni = new jni_YGNodeStyleGetAlignSelfJNI(this, getbacktracenote, (getBacktraceNote) TypeIntrinsics.beforeCheckcastToFunctionOfArity(asbinder, 3), this.getInterfaceDescriptor);
        int i2 = extraCallbackWithResult + 71;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return jni_ygnodestylegetalignselfjni;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ class asInterface extends FunctionReferenceImpl implements getBacktraceNote<nLockFile<?>, jni_YGNodeStyleGetBorderJNI<?>, Object, Unit> {
        public static final asInterface onWarmupCompleted = new asInterface();

        asInterface() {
            super(3, nLockFile.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // o.getBacktraceNote
        public /* synthetic */ Unit invoke(nLockFile<?> nlockfile, jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni, Object obj) {
            onExtraCallback(nlockfile, jni_ygnodestylegetborderjni, obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(nLockFile<?> nlockfile, jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni, Object obj) {
            nLockFile.onWarmupCompleted((nLockFile) nlockfile, (jni_YGNodeStyleGetBorderJNI) jni_ygnodestylegetborderjni, obj);
        }
    }

    final /* synthetic */ class asBinder extends FunctionReferenceImpl implements getBacktraceNote<nLockFile<?>, Object, Object, Object> {
        public static final asBinder onNavigationEvent = new asBinder();

        asBinder() {
            super(3, nLockFile.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // o.getBacktraceNote
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nLockFile<?> nlockfile, Object obj, Object obj2) {
            return nLockFile.onNavigationEvent(nlockfile, obj, obj2);
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        jni_YGNodeStyleGetBorderJNI jni_ygnodestylegetborderjni = (jni_YGNodeStyleGetBorderJNI) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 9;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            jni_ygnodestylegetborderjni.onExtraCallback(nTryLock.extraCallback());
            return null;
        }
        jni_ygnodestylegetborderjni.onExtraCallback(nTryLock.extraCallback());
        throw null;
    }

    private final Object onWarmupCompleted(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 65;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (obj2 == nTryLock.extraCallback()) {
            throw ICustomTabsCallbackStub();
        }
        int i4 = extraCallback + 61;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return obj2;
    }

    private final Object IAuthTabCallback(Object obj, Object obj2) {
        Object objOnNavigationEvent;
        int i = 2 % 2;
        int i2 = extraCallback + 1;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            if (obj2 == nTryLock.extraCallback()) {
                objOnNavigationEvent = lud.Companion.onExtraCallback(asBinder());
                int i3 = extraCallback + 77;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            } else {
                objOnNavigationEvent = lud.Companion.onNavigationEvent(obj2);
            }
            return lud.onExtraCallback(objOnNavigationEvent);
        }
        nTryLock.extraCallback();
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    private static final getBacktraceNote IAuthTabCallback(final nLockFile nlockfile, final jni_YGNodeStyleGetBorderJNI jni_ygnodestylegetborderjni, Object obj, final Object obj2) {
        int i = 2 % 2;
        getBacktraceNote getbacktracenote = new getBacktraceNote() { // from class: kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda0
            @Override // o.getBacktraceNote
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return nLockFile.IAuthTabCallback(obj2, nlockfile, jni_ygnodestylegetborderjni, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
        int i2 = extraCallback + 31;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return getbacktracenote;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(Object obj, nLockFile nlockfile, jni_YGNodeStyleGetBorderJNI jni_ygnodestylegetborderjni, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 5;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (obj != nTryLock.extraCallback()) {
            int i4 = extraCallbackWithResult + 11;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            ycx7.onExtraCallback(nlockfile.IAuthTabCallback, obj, jni_ygnodestylegetborderjni.onExtraCallbackWithResult());
        }
        Unit unit = Unit.INSTANCE;
        int i6 = extraCallbackWithResult + 53;
        extraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public nUnlockFile<E> writeTypedObject() {
        int i = 2 % 2;
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback();
        int i2 = extraCallback + 123;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    final class IAuthTabCallback implements nUnlockFile<E>, syncDoGet {
        private Object IAuthTabCallback = nTryLock.getInterfaceDescriptor;
        private setResourceInternal<? super Boolean> onNavigationEvent;

        public IAuthTabCallback() {
        }

        @Override // o.nUnlockFile
        public Object onWarmupCompleted(@NotNull access13800<? super Boolean> access13800Var) throws Throwable {
            boolean zOnExtraCallback = true;
            if (this.IAuthTabCallback == nTryLock.getInterfaceDescriptor || this.IAuthTabCallback == nTryLock.extraCallback()) {
                nLockFile<E> nlockfile = nLockFile.this;
                sya<E> syaVar = (sya) nLockFile.onNavigationEvent().get(nlockfile);
                while (true) {
                    if (nlockfile.IAuthTabCallback_Parcel()) {
                        zOnExtraCallback = onExtraCallback();
                        break;
                    }
                    long andIncrement = nLockFile.onWarmupCompleted().getAndIncrement(nlockfile);
                    long j = nTryLock.onNavigationEvent;
                    long j2 = andIncrement / j;
                    int i = (int) (andIncrement % j);
                    if (syaVar.onExtraCallback != j2) {
                        sya<E> syaVar2 = (sya) nLockFile.onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nlockfile, Long.valueOf(j2), syaVar}, -459845233, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 459845240, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                        if (syaVar2 == null) {
                            continue;
                        } else {
                            syaVar = syaVar2;
                        }
                    }
                    Object objOnExtraCallbackWithResult = nLockFile.onExtraCallbackWithResult(nlockfile, syaVar, i, andIncrement, (Object) null);
                    if (objOnExtraCallbackWithResult != nTryLock.extraCallbackWithResult) {
                        if (objOnExtraCallbackWithResult == nTryLock.IAuthTabCallbackDefault) {
                            if (andIncrement < nlockfile.access100()) {
                                syaVar.onWarmupCompleted();
                            }
                        } else {
                            if (objOnExtraCallbackWithResult == nTryLock.ICustomTabsCallback) {
                                return onExtraCallbackWithResult(syaVar, i, andIncrement, access13800Var);
                            }
                            syaVar.onWarmupCompleted();
                            this.IAuthTabCallback = objOnExtraCallbackWithResult;
                        }
                    } else {
                        throw new IllegalStateException("unreachable");
                    }
                }
            }
            return access14000.onNavigationEvent(zOnExtraCallback);
        }

        private final boolean onExtraCallback() throws Throwable {
            this.IAuthTabCallback = nTryLock.extraCallback();
            Throwable thAsBinder = nLockFile.this.asBinder();
            if (thAsBinder == null) {
                return false;
            }
            throw ui.onExtraCallback(thAsBinder);
        }

        private final Object onExtraCallbackWithResult(sya<E> syaVar, int i, long j, access13800<? super Boolean> access13800Var) {
            Boolean boolOnNavigationEvent;
            Function1<E, Unit> function1;
            sya syaVar2;
            nLockFile<E> nlockfile = nLockFile.this;
            setResourceInternal setresourceinternalOnWarmupCompleted = maybeAddAttachStateListener.onWarmupCompleted(access14200.onExtraCallbackWithResult(access13800Var));
            try {
                this.onNavigationEvent = setresourceinternalOnWarmupCompleted;
                Object objOnExtraCallbackWithResult = nLockFile.onExtraCallbackWithResult(nlockfile, syaVar, i, j, this);
                if (objOnExtraCallbackWithResult != nTryLock.extraCallbackWithResult) {
                    getBacktraceNote getbacktracenoteOnExtraCallback = null;
                    if (objOnExtraCallbackWithResult == nTryLock.IAuthTabCallbackDefault) {
                        if (j < nlockfile.access100()) {
                            syaVar.onWarmupCompleted();
                        }
                        sya syaVar3 = (sya) nLockFile.onNavigationEvent().get(nlockfile);
                        while (true) {
                            if (nlockfile.IAuthTabCallback_Parcel()) {
                                IAuthTabCallback();
                                break;
                            }
                            long andIncrement = nLockFile.onWarmupCompleted().getAndIncrement(nlockfile);
                            long j2 = nTryLock.onNavigationEvent;
                            long j3 = andIncrement / j2;
                            int i2 = (int) (andIncrement % j2);
                            if (syaVar3.onExtraCallback != j3) {
                                sya syaVar4 = (sya) nLockFile.onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nlockfile, Long.valueOf(j3), syaVar3}, -459845233, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 459845240, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                                if (syaVar4 != null) {
                                    syaVar2 = syaVar4;
                                } else {
                                    continue;
                                }
                            } else {
                                syaVar2 = syaVar3;
                            }
                            objOnExtraCallbackWithResult = nLockFile.onExtraCallbackWithResult(nlockfile, syaVar2, i2, andIncrement, this);
                            if (objOnExtraCallbackWithResult != nTryLock.extraCallbackWithResult) {
                                if (objOnExtraCallbackWithResult == nTryLock.IAuthTabCallbackDefault) {
                                    if (andIncrement < nlockfile.access100()) {
                                        syaVar2.onWarmupCompleted();
                                    }
                                    syaVar3 = syaVar2;
                                } else {
                                    if (objOnExtraCallbackWithResult == nTryLock.ICustomTabsCallback) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    syaVar2.onWarmupCompleted();
                                    this.IAuthTabCallback = objOnExtraCallbackWithResult;
                                    this.onNavigationEvent = null;
                                    boolOnNavigationEvent = access14000.onNavigationEvent(true);
                                    function1 = nlockfile.IAuthTabCallback;
                                    if (function1 != null) {
                                    }
                                }
                            } else {
                                nLockFile.IAuthTabCallback(nlockfile, this, syaVar2, i2);
                                break;
                            }
                        }
                        setresourceinternalOnWarmupCompleted.IAuthTabCallback((setResourceInternal) boolOnNavigationEvent, (getBacktraceNote<? super Throwable, ? super setResourceInternal, ? super CoroutineContext, Unit>) getbacktracenoteOnExtraCallback);
                    } else {
                        syaVar.onWarmupCompleted();
                        this.IAuthTabCallback = objOnExtraCallbackWithResult;
                        this.onNavigationEvent = null;
                        boolOnNavigationEvent = access14000.onNavigationEvent(true);
                        function1 = nlockfile.IAuthTabCallback;
                        if (function1 != null) {
                            getbacktracenoteOnExtraCallback = nLockFile.onExtraCallback(nlockfile, function1, objOnExtraCallbackWithResult);
                        }
                        setresourceinternalOnWarmupCompleted.IAuthTabCallback((setResourceInternal) boolOnNavigationEvent, (getBacktraceNote<? super Throwable, ? super setResourceInternal, ? super CoroutineContext, Unit>) getbacktracenoteOnExtraCallback);
                    }
                } else {
                    nLockFile.IAuthTabCallback(nlockfile, this, syaVar, i);
                }
                Object objIAuthTabCallbackDefault = setresourceinternalOnWarmupCompleted.IAuthTabCallbackDefault();
                if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
                    access14600.IAuthTabCallback(access13800Var);
                }
                return objIAuthTabCallbackDefault;
            } catch (Throwable th) {
                setresourceinternalOnWarmupCompleted.IAuthTabCallbackStub();
                throw th;
            }
        }

        @Override // o.syncDoGet
        public void IAuthTabCallback(@NotNull ycx5<?> ycx5Var, int i) {
            setResourceInternal<? super Boolean> setresourceinternal = this.onNavigationEvent;
            if (setresourceinternal != null) {
                setresourceinternal.IAuthTabCallback(ycx5Var, i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void IAuthTabCallback() {
            setResourceInternal<? super Boolean> setresourceinternal = this.onNavigationEvent;
            Intrinsics.checkNotNull(setresourceinternal);
            this.onNavigationEvent = null;
            this.IAuthTabCallback = nTryLock.extraCallback();
            Throwable thAsBinder = nLockFile.this.asBinder();
            if (thAsBinder == null) {
                Result.Companion companion = Result.Companion;
                setresourceinternal.resumeWith(Result.m31constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.Companion;
                setresourceinternal.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(thAsBinder)));
            }
        }

        @Override // o.nUnlockFile
        public E onNavigationEvent() throws Throwable {
            E e = (E) this.IAuthTabCallback;
            if (e != nTryLock.getInterfaceDescriptor) {
                this.IAuthTabCallback = nTryLock.getInterfaceDescriptor;
                if (e != nTryLock.extraCallback()) {
                    return e;
                }
                throw ui.onExtraCallback(nLockFile.IAuthTabCallback((nLockFile) nLockFile.this));
            }
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }

        public final boolean onNavigationEvent(E e) {
            setResourceInternal<? super Boolean> setresourceinternal = this.onNavigationEvent;
            Intrinsics.checkNotNull(setresourceinternal);
            this.onNavigationEvent = null;
            this.IAuthTabCallback = e;
            Boolean bool = Boolean.TRUE;
            nLockFile<E> nlockfile = nLockFile.this;
            Function1<E, Unit> function1 = nlockfile.IAuthTabCallback;
            return nTryLock.onExtraCallbackWithResult(setresourceinternal, bool, function1 != null ? nLockFile.onExtraCallback(nlockfile, function1, e) : null);
        }

        public final void onWarmupCompleted() {
            setResourceInternal<? super Boolean> setresourceinternal = this.onNavigationEvent;
            Intrinsics.checkNotNull(setresourceinternal);
            this.onNavigationEvent = null;
            this.IAuthTabCallback = nTryLock.extraCallback();
            Throwable thAsBinder = nLockFile.this.asBinder();
            if (thAsBinder == null) {
                Result.Companion companion = Result.Companion;
                setresourceinternal.resumeWith(Result.m31constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.Companion;
                setresourceinternal.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(thAsBinder)));
            }
        }
    }

    protected final Throwable asBinder() {
        int i = 2 % 2;
        int i2 = extraCallback + 19;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Throwable th = (Throwable) isEngagementSignalsApiAvailable().get(this);
        int i4 = extraCallbackWithResult + 87;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return th;
        }
        throw null;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        nLockFile nlockfile = (nLockFile) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 119;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Throwable thAsBinder = nlockfile.asBinder();
        if (thAsBinder == null) {
            thAsBinder = new fby("Channel was closed");
            int i4 = extraCallback + 31;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = extraCallbackWithResult + 87;
        extraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 90 / 0;
        }
        return thAsBinder;
    }

    private final Throwable ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 57;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Throwable thAsBinder = asBinder();
        if (thAsBinder != null) {
            return thAsBinder;
        }
        hf hfVar = new hf("Channel was closed");
        int i4 = extraCallbackWithResult + 25;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return hfVar;
    }

    @Override // o.lt
    public boolean onExtraCallback(@Nullable Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 57;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(th, false);
        int i4 = extraCallbackWithResult + 35;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return zOnExtraCallback;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void onNavigationEvent(@Nullable CancellationException cancellationException) {
        int i = 2 % 2;
        int i2 = extraCallback + 9;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((Throwable) cancellationException);
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCallback + 91;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public boolean IAuthTabCallback(@Nullable Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallback + 111;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        boolean zOnExtraCallback = onExtraCallback(th, true);
        int i4 = extraCallbackWithResult + 83;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    protected boolean onExtraCallback(@Nullable Throwable th, boolean z) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 75;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (z) {
            prefetch();
        }
        boolean zOnWarmupCompleted = RequestBuilder.onWarmupCompleted(isEngagementSignalsApiAvailable(), this, nTryLock.access000, th);
        if (!(!z)) {
            int i4 = extraCallbackWithResult + 91;
            extraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this}, 1416353531, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1416353531, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this}, 1416353531, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1416353531, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        } else {
            onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this}, 1613042211, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1613042205, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        }
        onExtraCallback();
        extraCallback();
        if (zOnWarmupCompleted) {
            int i5 = extraCallback + 71;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this}, 1962150351, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1962150343, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        }
        return zOnWarmupCompleted;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Object obj;
        djExternalSyntheticApiModelOutline0 djexternalsyntheticapimodeloutline0;
        nLockFile nlockfile = (nLockFile) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 111;
        extraCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            ICustomTabsCallbackStubProxy();
            obj2.hashCode();
            throw null;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy();
        do {
            obj = atomicReferenceFieldUpdaterICustomTabsCallbackStubProxy.get(nlockfile);
            if (obj == null) {
                int i3 = extraCallbackWithResult + 67;
                extraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    djExternalSyntheticApiModelOutline0 unused = nTryLock.IAuthTabCallback;
                    obj2.hashCode();
                    throw null;
                }
                djexternalsyntheticapimodeloutline0 = nTryLock.IAuthTabCallback;
            } else {
                djexternalsyntheticapimodeloutline0 = nTryLock.onExtraCallback;
            }
        } while (!RequestBuilder.onWarmupCompleted(atomicReferenceFieldUpdaterICustomTabsCallbackStubProxy, nlockfile, obj, djexternalsyntheticapimodeloutline0));
        int i4 = extraCallback + 63;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (obj == null) {
            return null;
        }
        ((Function1) obj).invoke(nlockfile.asBinder());
        int i5 = extraCallbackWithResult + 103;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // o.lt
    public void onExtraCallbackWithResult(@NotNull Function1<? super Throwable, Unit> function1) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 33;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (RequestBuilder.onWarmupCompleted(ICustomTabsCallbackStubProxy(), this, (Object) null, function1)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy();
        do {
            Object obj2 = atomicReferenceFieldUpdaterICustomTabsCallbackStubProxy.get(this);
            if (obj2 != nTryLock.IAuthTabCallback) {
                if (obj2 == nTryLock.onExtraCallback) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj2).toString());
            }
            int i4 = extraCallbackWithResult + 57;
            extraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                RequestBuilder.onWarmupCompleted(ICustomTabsCallbackStubProxy(), this, nTryLock.IAuthTabCallback, nTryLock.onExtraCallback);
                throw null;
            }
        } while (!RequestBuilder.onWarmupCompleted(ICustomTabsCallbackStubProxy(), this, nTryLock.IAuthTabCallback, nTryLock.onExtraCallback));
        int i5 = extraCallbackWithResult + 37;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            function1.invoke(asBinder());
        } else {
            function1.invoke(asBinder());
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        long j;
        long jOnExtraCallback;
        nLockFile nlockfile = (nLockFile) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 109;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            ICustomTabsCallback_Parcel();
            throw null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdaterICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        do {
            j = atomicLongFieldUpdaterICustomTabsCallback_Parcel.get(nlockfile);
            int i3 = (int) (j >> 60);
            if (i3 != 0) {
                int i4 = extraCallbackWithResult + 41;
                int i5 = i4 % 128;
                extraCallback = i5;
                if (i4 % 2 == 0) {
                    if (i3 != 0) {
                        break;
                    }
                    int i6 = i5 + 93;
                    extraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    jOnExtraCallback = nTryLock.onExtraCallback(j & 1152921504606846975L, 3);
                    int i8 = extraCallbackWithResult + 13;
                    extraCallback = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    if (i3 != 1) {
                        break;
                    }
                    int i62 = i5 + 93;
                    extraCallbackWithResult = i62 % 128;
                    int i72 = i62 % 2;
                    jOnExtraCallback = nTryLock.onExtraCallback(j & 1152921504606846975L, 3);
                    int i82 = extraCallbackWithResult + 13;
                    extraCallback = i82 % 128;
                    int i92 = i82 % 2;
                }
            } else {
                jOnExtraCallback = nTryLock.onExtraCallback(j & 1152921504606846975L, 2);
            }
        } while (!atomicLongFieldUpdaterICustomTabsCallback_Parcel.compareAndSet(nlockfile, j, jOnExtraCallback));
        return null;
    }

    private final void prefetch() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 15;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            ICustomTabsCallback_Parcel();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdaterICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        int i3 = extraCallback + 97;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            long j = atomicLongFieldUpdaterICustomTabsCallback_Parcel.get(this);
            if (((int) (j >> 60)) != 0) {
                return;
            }
            int i5 = extraCallbackWithResult + 79;
            extraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                if (atomicLongFieldUpdaterICustomTabsCallback_Parcel.compareAndSet(this, j, nTryLock.onExtraCallback(1152921504606846975L * j, 0))) {
                    return;
                }
            } else if (atomicLongFieldUpdaterICustomTabsCallback_Parcel.compareAndSet(this, j, nTryLock.onExtraCallback(1152921504606846975L & j, 1))) {
                return;
            }
        }
    }

    private final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 19;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback();
        int i4 = extraCallbackWithResult + 33;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a A[PHI: r1
      0x002a: PHI (r1v6 o.sya<E>) = (r1v4 o.sya<E>), (r1v7 o.sya<E>) binds: [B:8:0x0027, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final sya<E> onNavigationEvent(long j) {
        sya<E> syaVarOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = extraCallback + 51;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            syaVarOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = 45 / 0;
            if (!(true ^ extraCallbackWithResult())) {
                long jIAuthTabCallback = IAuthTabCallback((sya) syaVarOnExtraCallbackWithResult);
                if (jIAuthTabCallback != -1) {
                    int i4 = extraCallbackWithResult + 111;
                    extraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        onExtraCallbackWithResult(jIAuthTabCallback);
                    } else {
                        onExtraCallbackWithResult(jIAuthTabCallback);
                        throw null;
                    }
                }
            }
        } else {
            syaVarOnExtraCallbackWithResult = onExtraCallbackWithResult();
            if (extraCallbackWithResult()) {
            }
        }
        onWarmupCompleted(syaVarOnExtraCallbackWithResult, j);
        return syaVarOnExtraCallbackWithResult;
    }

    private final void IAuthTabCallback(long j) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 13;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(onNavigationEvent(j));
        int i4 = extraCallbackWithResult + 43;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final sya<E> onExtraCallbackWithResult() {
        int i = 2 % 2;
        Object obj = ((AtomicReferenceFieldUpdater) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[0], -1858799222, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1858799223, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).get(this);
        sya syaVar = (sya) ((AtomicReferenceFieldUpdater) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[0], -1349238246, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1349238261, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).get(this);
        if (syaVar.onExtraCallback > ((sya) obj).onExtraCallback) {
            int i2 = extraCallbackWithResult + 101;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            obj = syaVar;
        }
        sya syaVar2 = (sya) mayLaunchUrl().get(this);
        if (syaVar2.onExtraCallback > ((sya) obj).onExtraCallback) {
            int i4 = extraCallback + 43;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 4;
            }
            obj = syaVar2;
        }
        return (sya) getLargestMainSize.IAuthTabCallback((getJustifyContent) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        r9 = (o.sya) r9.onNavigationEvent();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long IAuthTabCallback(sya<E> syaVar) {
        int i = 2 % 2;
        do {
            int i2 = nTryLock.onNavigationEvent;
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                long j = (syaVar.onExtraCallback * nTryLock.onNavigationEvent) + i2;
                if (j < IAuthTabCallbackStubProxy()) {
                    int i3 = extraCallbackWithResult + 41;
                    extraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return -1L;
                }
                while (true) {
                    Object objOnExtraCallback = syaVar.onExtraCallback(i2);
                    if (objOnExtraCallback != null) {
                        int i5 = extraCallback + 111;
                        extraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        if (objOnExtraCallback != nTryLock.access100) {
                            int i7 = extraCallbackWithResult + 57;
                            extraCallback = i7 % 128;
                            int i8 = i7 % 2;
                            if (objOnExtraCallback == nTryLock.onExtraCallbackWithResult) {
                                int i9 = extraCallbackWithResult + 45;
                                extraCallback = i9 % 128;
                                int i10 = i9 % 2;
                                return j;
                            }
                        } else if (syaVar.onExtraCallback(i2, objOnExtraCallback, nTryLock.extraCallback())) {
                            syaVar.access100();
                            break;
                        }
                    }
                }
            }
        } while (syaVar != null);
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e4, code lost:
    
        r13 = (o.sya) r13.onNavigationEvent();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(sya<E> syaVar) {
        int i = 2 % 2;
        Function1<E, Unit> function1 = this.IAuthTabCallback;
        Object obj = null;
        Object objOnNavigationEvent = setShowDividerVertical.onNavigationEvent(null, 1, null);
        setIndicatorDirection setindicatordirectionOnNavigationEvent = null;
        loop0: do {
            int i2 = nTryLock.onNavigationEvent - 1;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                int i3 = extraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                long j = (syaVar.onExtraCallback * nTryLock.onNavigationEvent) + i2;
                while (true) {
                    Object objOnExtraCallback = syaVar.onExtraCallback(i2);
                    if (objOnExtraCallback == nTryLock.asInterface) {
                        break loop0;
                    }
                    if (objOnExtraCallback != nTryLock.onExtraCallbackWithResult) {
                        if (objOnExtraCallback != nTryLock.access100 && objOnExtraCallback != null) {
                            int i5 = extraCallbackWithResult + 35;
                            extraCallback = i5 % 128;
                            if (i5 % 2 == 0) {
                                boolean z = objOnExtraCallback instanceof syncDoGet;
                                throw null;
                            }
                            if ((!(objOnExtraCallback instanceof syncDoGet)) && !(objOnExtraCallback instanceof thx)) {
                                if (objOnExtraCallback == nTryLock.extraCallback || objOnExtraCallback == nTryLock.writeTypedObject) {
                                    break loop0;
                                }
                                int i6 = extraCallbackWithResult + 51;
                                extraCallback = i6 % 128;
                                if (i6 % 2 == 0) {
                                    djExternalSyntheticApiModelOutline0 unused = nTryLock.extraCallback;
                                    throw null;
                                }
                                if (objOnExtraCallback != nTryLock.extraCallback) {
                                    break;
                                }
                            } else {
                                if (j < IAuthTabCallbackStubProxy()) {
                                    break loop0;
                                }
                                syncDoGet syncdoget = objOnExtraCallback instanceof thx ? ((thx) objOnExtraCallback).IAuthTabCallback : (syncDoGet) objOnExtraCallback;
                                if (syaVar.onExtraCallback(i2, objOnExtraCallback, nTryLock.extraCallback())) {
                                    if (function1 != null) {
                                        setindicatordirectionOnNavigationEvent = ycx7.onNavigationEvent(function1, syaVar.onNavigationEvent(i2), setindicatordirectionOnNavigationEvent);
                                    }
                                    objOnNavigationEvent = setShowDividerVertical.onNavigationEvent(objOnNavigationEvent, syncdoget);
                                    syaVar.onWarmupCompleted(i2);
                                    syaVar.access100();
                                    int i7 = extraCallback + 65;
                                    extraCallbackWithResult = i7 % 128;
                                    int i8 = i7 % 2;
                                }
                            }
                        } else if (syaVar.onExtraCallback(i2, objOnExtraCallback, nTryLock.extraCallback())) {
                            syaVar.access100();
                            break;
                        }
                    } else {
                        if (j < IAuthTabCallbackStubProxy()) {
                            break loop0;
                        }
                        if (syaVar.onExtraCallback(i2, objOnExtraCallback, nTryLock.extraCallback())) {
                            if (function1 != null) {
                                setindicatordirectionOnNavigationEvent = ycx7.onNavigationEvent(function1, syaVar.onNavigationEvent(i2), setindicatordirectionOnNavigationEvent);
                            }
                            syaVar.onWarmupCompleted(i2);
                            syaVar.access100();
                        }
                    }
                }
                i2--;
            }
        } while (syaVar != null);
        if (objOnNavigationEvent != null) {
            int i9 = extraCallback + 21;
            extraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                boolean z2 = objOnNavigationEvent instanceof ArrayList;
                obj.hashCode();
                throw null;
            }
            if (objOnNavigationEvent instanceof ArrayList) {
                Intrinsics.checkNotNull(objOnNavigationEvent, "");
                ArrayList arrayList = (ArrayList) objOnNavigationEvent;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    onExtraCallbackWithResult((syncDoGet) arrayList.get(size));
                }
            } else {
                onExtraCallbackWithResult((syncDoGet) objOnNavigationEvent);
            }
        }
        if (setindicatordirectionOnNavigationEvent != null) {
            throw setindicatordirectionOnNavigationEvent;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        r5 = o.nLockFile.extraCallback + 101;
        o.nLockFile.extraCallbackWithResult = r5 % 128;
        r5 = r5 % 2;
        r1 = o.setShowDividerVertical.onNavigationEvent(r1, r4);
        r9.onWarmupCompleted(r3, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x003f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(sya<E> syaVar, long j) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        Object objOnNavigationEvent = setShowDividerVertical.onNavigationEvent(null, 1, null);
        loop0: while (syaVar != null) {
            int i2 = extraCallbackWithResult + 11;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = nTryLock.onNavigationEvent - 1;
            while (i4 >= 0) {
                int i5 = extraCallback + 41;
                extraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    if (((syaVar.onExtraCallback & nTryLock.onNavigationEvent) | i4) < j) {
                        break loop0;
                    }
                    while (true) {
                        objOnExtraCallback = syaVar.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                            int i6 = extraCallback + 107;
                            extraCallbackWithResult = i6 % 128;
                            int i7 = i6 % 2;
                            if (objOnExtraCallback != nTryLock.access100) {
                                if (objOnExtraCallback instanceof thx) {
                                    if (syaVar.onExtraCallback(i4, objOnExtraCallback, nTryLock.extraCallback())) {
                                        objOnNavigationEvent = setShowDividerVertical.onNavigationEvent(objOnNavigationEvent, ((thx) objOnExtraCallback).IAuthTabCallback);
                                        syaVar.onWarmupCompleted(i4, true);
                                        int i8 = extraCallback + 1;
                                        extraCallbackWithResult = i8 % 128;
                                        int i9 = i8 % 2;
                                        break;
                                    }
                                } else if (objOnExtraCallback instanceof syncDoGet) {
                                    int i10 = extraCallback + 19;
                                    extraCallbackWithResult = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        if (syaVar.onExtraCallback(i4, objOnExtraCallback, nTryLock.extraCallback())) {
                                            break;
                                        }
                                    } else {
                                        int i11 = 67 / 0;
                                        if (syaVar.onExtraCallback(i4, objOnExtraCallback, nTryLock.extraCallback())) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (!syaVar.onExtraCallback(i4, objOnExtraCallback, nTryLock.extraCallback())) {
                            int i12 = extraCallback + 97;
                            extraCallbackWithResult = i12 % 128;
                            int i13 = i12 % 2;
                            syaVar.access100();
                            break;
                        }
                    }
                    i4--;
                } else {
                    if ((syaVar.onExtraCallback * nTryLock.onNavigationEvent) + i4 < j) {
                        break loop0;
                    }
                    while (true) {
                        objOnExtraCallback = syaVar.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                        }
                        if (!syaVar.onExtraCallback(i4, objOnExtraCallback, nTryLock.extraCallback())) {
                        }
                    }
                    i4--;
                }
            }
            syaVar = (sya) syaVar.onNavigationEvent();
        }
        if (objOnNavigationEvent != null) {
            int i14 = extraCallback + 47;
            extraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            if (!(objOnNavigationEvent instanceof ArrayList)) {
                onWarmupCompleted((syncDoGet) objOnNavigationEvent);
                return;
            }
            Intrinsics.checkNotNull(objOnNavigationEvent, "");
            ArrayList arrayList = (ArrayList) objOnNavigationEvent;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                onWarmupCompleted((syncDoGet) arrayList.get(size));
            }
        }
    }

    private final void onWarmupCompleted(syncDoGet syncdoget) {
        int i = 2 % 2;
        int i2 = extraCallback + 43;
        extraCallbackWithResult = i2 % 128;
        onWarmupCompleted(syncdoget, i2 % 2 == 0);
        int i3 = extraCallbackWithResult + 103;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void onExtraCallbackWithResult(syncDoGet syncdoget) {
        int i = 2 % 2;
        int i2 = extraCallback + 1;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(syncdoget, false);
        int i4 = extraCallback + 73;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(syncDoGet syncdoget, boolean z) {
        Throwable thICustomTabsCallbackStub;
        int i = 2 % 2;
        if (syncdoget instanceof onExtraCallbackWithResult) {
            maybeRemoveAttachStateListener<Boolean> mayberemoveattachstatelistenerIAuthTabCallback = ((onExtraCallbackWithResult) syncdoget).IAuthTabCallback();
            Result.Companion companion = Result.Companion;
            mayberemoveattachstatelistenerIAuthTabCallback.resumeWith(Result.m31constructorimpl(Boolean.FALSE));
            int i2 = extraCallback + 27;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 40 / 0;
                return;
            }
            return;
        }
        if (!(!(syncdoget instanceof maybeRemoveAttachStateListener))) {
            access13800 access13800Var = (access13800) syncdoget;
            Result.Companion companion2 = Result.Companion;
            if (z) {
                thICustomTabsCallbackStub = ICustomTabsCallbackStub();
                int i4 = extraCallbackWithResult + 55;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                thICustomTabsCallbackStub = (Throwable) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this}, 1328941896, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1328941878, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
            }
            access13800Var.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(thICustomTabsCallbackStub)));
            return;
        }
        if (syncdoget instanceof ReceiveCatching) {
            int i6 = extraCallbackWithResult + 5;
            extraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                setResourceInternal<lud<? extends E>> setresourceinternal = ((ReceiveCatching) syncdoget).onNavigationEvent;
                Result.Companion companion3 = Result.Companion;
                setresourceinternal.resumeWith(Result.m31constructorimpl(lud.onExtraCallback(lud.Companion.onExtraCallback(asBinder()))));
                return;
            } else {
                setResourceInternal<lud<? extends E>> setresourceinternal2 = ((ReceiveCatching) syncdoget).onNavigationEvent;
                Result.Companion companion4 = Result.Companion;
                setresourceinternal2.resumeWith(Result.m31constructorimpl(lud.onExtraCallback(lud.Companion.onExtraCallback(asBinder()))));
                throw null;
            }
        }
        if (!(!(syncdoget instanceof IAuthTabCallback))) {
            ((IAuthTabCallback) syncdoget).onWarmupCompleted();
            return;
        }
        if (!(syncdoget instanceof jni_YGNodeStyleGetBorderJNI)) {
            throw new IllegalStateException(("Unexpected waiter: " + syncdoget).toString());
        }
        ((jni_YGNodeStyleGetBorderJNI) syncdoget).onExtraCallbackWithResult(this, nTryLock.extraCallback());
        int i7 = extraCallbackWithResult + 3;
        extraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.lt
    public boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 125;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        AtomicLongFieldUpdater atomicLongFieldUpdaterICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        if (i3 != 0) {
            return ((Boolean) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, Long.valueOf(atomicLongFieldUpdaterICustomTabsCallback_Parcel.get(this))}, -610862469, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 610862479, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue();
        }
        ((Boolean) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, Long.valueOf(atomicLongFieldUpdaterICustomTabsCallback_Parcel.get(this))}, -610862469, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 610862479, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        nLockFile nlockfile = (nLockFile) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = extraCallback + 61;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nlockfile, Long.valueOf(jLongValue), false}, 487166467, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -487166447, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue();
        int i4 = extraCallbackWithResult + 69;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        int i5 = 9 / 0;
        return Boolean.valueOf(zBooleanValue);
    }

    public boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = extraCallback + 111;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackDefault = IAuthTabCallbackDefault(ICustomTabsCallback_Parcel().get(this));
        int i4 = extraCallback + 31;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return zIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean IAuthTabCallbackDefault(long j) {
        Object objOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 49;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Long lValueOf = Long.valueOf(j);
        if (i3 == 0) {
            objOnWarmupCompleted = onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, lValueOf, false}, 487166467, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -487166447, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        } else {
            objOnWarmupCompleted = onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, lValueOf, true}, 487166467, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -487166447, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        }
        return ((Boolean) objOnWarmupCompleted).booleanValue();
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        nLockFile nlockfile = (nLockFile) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 79;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (int) (jLongValue >> 60);
        if (i5 == 0 || i5 == 1) {
            int i6 = i2 + 119;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = i2 + 97;
        int i9 = i8 % 128;
        extraCallbackWithResult = i9;
        int i10 = i8 % 2;
        if (i5 != 2) {
            int i11 = i9 + Imgproc.COLOR_YUV2RGB_YVYU;
            extraCallback = i11 % 128;
            if (i11 % 2 != 0 ? i5 == 3 : i5 == 2) {
                nlockfile.IAuthTabCallback(jLongValue & 1152921504606846975L);
                return true;
            }
            throw new IllegalStateException(("unexpected close status: " + i5).toString());
        }
        nlockfile.onNavigationEvent(jLongValue & 1152921504606846975L);
        if (!zBooleanValue) {
            int i12 = extraCallbackWithResult + 107;
            extraCallback = i12 % 128;
            int i13 = i12 % 2;
            return true;
        }
        if (nlockfile.getInterfaceDescriptor()) {
            return false;
        }
        int i14 = extraCallback + 75;
        extraCallbackWithResult = i14 % 128;
        return i14 % 2 == 0;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean readTypedObject() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 35;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            if (!IAuthTabCallback_Parcel()) {
                if (getInterfaceDescriptor()) {
                    return false;
                }
                return !IAuthTabCallback_Parcel();
            }
            int i3 = extraCallback;
            int i4 = i3 + 31;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 61;
            extraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 0;
            }
            return false;
        }
        IAuthTabCallback_Parcel();
        throw null;
    }

    public final boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        while (true) {
            sya<E> syaVarOnWarmupCompleted = (sya) mayLaunchUrl().get(this);
            long jIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
            if (access100() <= jIAuthTabCallbackStubProxy) {
                return false;
            }
            long j = jIAuthTabCallbackStubProxy / nTryLock.onNavigationEvent;
            if (syaVarOnWarmupCompleted.onExtraCallback == j || (syaVarOnWarmupCompleted = onWarmupCompleted(j, syaVarOnWarmupCompleted)) != null) {
                syaVarOnWarmupCompleted.onWarmupCompleted();
                if (!(!onNavigationEvent(syaVarOnWarmupCompleted, (int) (jIAuthTabCallbackStubProxy % r6), jIAuthTabCallbackStubProxy))) {
                    int i2 = extraCallback + 19;
                    extraCallbackWithResult = i2 % 128;
                    return i2 % 2 == 0;
                }
                extraCommand().compareAndSet(this, jIAuthTabCallbackStubProxy, 1 + jIAuthTabCallbackStubProxy);
            } else if (((sya) mayLaunchUrl().get(this)).onExtraCallback < j) {
                int i3 = extraCallback + 103;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
        }
    }

    private final boolean onNavigationEvent(sya<E> syaVar, int i, long j) {
        Object objOnExtraCallback;
        int i2 = 2 % 2;
        do {
            objOnExtraCallback = syaVar.onExtraCallback(i);
            if (objOnExtraCallback != null) {
                int i3 = extraCallback + 57;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (objOnExtraCallback != nTryLock.access100) {
                    if (objOnExtraCallback == nTryLock.onExtraCallbackWithResult) {
                        return true;
                    }
                    if (objOnExtraCallback == nTryLock.onTransact) {
                        return false;
                    }
                    if (objOnExtraCallback == nTryLock.extraCallback()) {
                        int i5 = extraCallback + 11;
                        extraCallbackWithResult = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 53 / 0;
                        }
                        return false;
                    }
                    if (objOnExtraCallback == nTryLock.asInterface) {
                        int i7 = extraCallbackWithResult + 3;
                        extraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        return false;
                    }
                    if (objOnExtraCallback == nTryLock.IAuthTabCallback_Parcel) {
                        return false;
                    }
                    if (objOnExtraCallback == nTryLock.extraCallback) {
                        int i9 = extraCallbackWithResult + 47;
                        extraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        return true;
                    }
                    if (objOnExtraCallback == nTryLock.writeTypedObject) {
                        return false;
                    }
                    if (j == IAuthTabCallbackStubProxy()) {
                        int i11 = extraCallback + 81;
                        extraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        return true;
                    }
                    int i13 = extraCallbackWithResult + 119;
                    extraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    return false;
                }
            }
        } while (!syaVar.onExtraCallback(i, objOnExtraCallback, nTryLock.IAuthTabCallback_Parcel));
        onMessageChannelReady();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final sya<E> onExtraCallback(long j, sya<E> syaVar) {
        Object objOnWarmupCompleted;
        int i = 2 % 2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = (AtomicReferenceFieldUpdater) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[0], -1349238246, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1349238261, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        Function2 function2 = (Function2) nTryLock.extraCallbackWithResult();
        loop0: while (true) {
            objOnWarmupCompleted = getLargestMainSize.onWarmupCompleted(syaVar, j, function2);
            if (!djExternalSyntheticApiModelOutline1.onWarmupCompleted(objOnWarmupCompleted)) {
                int i2 = extraCallbackWithResult + 35;
                extraCallback = i2 % 128;
                int i3 = i2 % 2;
                ycx5 ycx5VarOnNavigationEvent = djExternalSyntheticApiModelOutline1.onNavigationEvent(objOnWarmupCompleted);
                while (true) {
                    ycx5 ycx5Var = (ycx5) atomicReferenceFieldUpdater.get(this);
                    if (ycx5Var.onExtraCallback >= ycx5VarOnNavigationEvent.onExtraCallback) {
                        break loop0;
                    }
                    int i4 = extraCallbackWithResult + 81;
                    extraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    if (ycx5VarOnNavigationEvent.IAuthTabCallback_Parcel()) {
                        if (RequestBuilder.onWarmupCompleted(atomicReferenceFieldUpdater, this, ycx5Var, ycx5VarOnNavigationEvent)) {
                            if (ycx5Var.IAuthTabCallbackDefault()) {
                                ycx5Var.IAuthTabCallbackStub();
                                int i6 = extraCallback + 29;
                                extraCallbackWithResult = i6 % 128;
                                if (i6 % 2 != 0) {
                                    int i7 = 4 % 5;
                                }
                            }
                        } else if (ycx5VarOnNavigationEvent.IAuthTabCallbackDefault()) {
                            ycx5VarOnNavigationEvent.IAuthTabCallbackStub();
                            int i8 = extraCallbackWithResult + 63;
                            extraCallback = i8 % 128;
                            int i9 = i8 % 2;
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (!djExternalSyntheticApiModelOutline1.onWarmupCompleted(objOnWarmupCompleted)) {
            sya<E> syaVar2 = (sya) djExternalSyntheticApiModelOutline1.onNavigationEvent(objOnWarmupCompleted);
            long j2 = syaVar2.onExtraCallback;
            if (j2 <= j) {
                return syaVar2;
            }
            long j3 = nTryLock.onNavigationEvent;
            access100(j2 * j3);
            if (syaVar2.onExtraCallback * j3 < IAuthTabCallbackStubProxy()) {
                syaVar2.onWarmupCompleted();
            }
            return null;
        }
        int i10 = extraCallbackWithResult + 29;
        extraCallback = i10 % 128;
        if (i10 % 2 == 0) {
            onExtraCallback();
            if (syaVar.onExtraCallback - nTryLock.onNavigationEvent < IAuthTabCallbackStubProxy()) {
                int i11 = extraCallback + 29;
                extraCallbackWithResult = i11 % 128;
                if (i11 % 2 != 0) {
                    syaVar.onWarmupCompleted();
                    int i12 = 59 / 0;
                } else {
                    syaVar.onWarmupCompleted();
                }
            }
        } else {
            onExtraCallback();
            if (syaVar.onExtraCallback * nTryLock.onNavigationEvent < IAuthTabCallbackStubProxy()) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (o.djExternalSyntheticApiModelOutline1.onWarmupCompleted(r7) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        onExtraCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if ((r20.onExtraCallback * o.nTryLock.onNavigationEvent) >= access100()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        r20.onWarmupCompleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        r3 = (o.sya) o.djExternalSyntheticApiModelOutline1.onNavigationEvent(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        if (newSession() != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        r5 = o.nLockFile.extraCallback + 19;
        o.nLockFile.extraCallbackWithResult = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        if ((r5 % 2) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r18 > (ICustomTabsCallbackDefault() - o.nTryLock.onNavigationEvent)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
    
        if (r18 > (ICustomTabsCallbackDefault() / o.nTryLock.onNavigationEvent)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b8, code lost:
    
        r5 = (java.util.concurrent.atomic.AtomicReferenceFieldUpdater) onWarmupCompleted(o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new java.lang.Object[0], -1858799222, o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1858799223, o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
    
        r6 = (o.ycx5) r5.get(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e3, code lost:
    
        if (r6.onExtraCallback >= r3.onExtraCallback) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e9, code lost:
    
        if (r3.IAuthTabCallback_Parcel() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ef, code lost:
    
        if (o.RequestBuilder.onWarmupCompleted(r5, r17, r6, r3) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f1, code lost:
    
        r5 = o.nLockFile.extraCallbackWithResult + 19;
        o.nLockFile.extraCallback = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fe, code lost:
    
        if (r6.IAuthTabCallbackDefault() == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0100, code lost:
    
        r6.IAuthTabCallbackStub();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010a, code lost:
    
        if ((!r3.IAuthTabCallbackDefault()) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010d, code lost:
    
        r3.IAuthTabCallbackStub();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0111, code lost:
    
        r5 = r3.onExtraCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0115, code lost:
    
        if (r5 <= r18) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0117, code lost:
    
        r1 = o.nTryLock.onNavigationEvent;
        onWarmupCompleted(o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new java.lang.Object[]{r17, java.lang.Long.valueOf(r5 * r1)}, -1524713147, o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1524713151, o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0145, code lost:
    
        if ((r3.onExtraCallback * r1) >= access100()) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0147, code lost:
    
        r3.onWarmupCompleted();
        r1 = o.nLockFile.extraCallback + 17;
        o.nLockFile.extraCallbackWithResult = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0153, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0154, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final sya<E> onWarmupCompleted(long j, sya<E> syaVar) {
        int i = 2 % 2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterMayLaunchUrl = mayLaunchUrl();
        Function2 function2 = (Function2) nTryLock.extraCallbackWithResult();
        int i2 = extraCallbackWithResult + 59;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        loop0: while (true) {
            Object objOnWarmupCompleted = getLargestMainSize.onWarmupCompleted(syaVar, j, function2);
            Object obj = null;
            if (djExternalSyntheticApiModelOutline1.onWarmupCompleted(objOnWarmupCompleted)) {
                break;
            }
            ycx5 ycx5VarOnNavigationEvent = djExternalSyntheticApiModelOutline1.onNavigationEvent(objOnWarmupCompleted);
            while (true) {
                ycx5 ycx5Var = (ycx5) atomicReferenceFieldUpdaterMayLaunchUrl.get(this);
                if (ycx5Var.onExtraCallback >= ycx5VarOnNavigationEvent.onExtraCallback) {
                    break loop0;
                }
                if (ycx5VarOnNavigationEvent.IAuthTabCallback_Parcel()) {
                    if (!(!RequestBuilder.onWarmupCompleted(atomicReferenceFieldUpdaterMayLaunchUrl, this, ycx5Var, ycx5VarOnNavigationEvent))) {
                        int i4 = extraCallbackWithResult + 107;
                        extraCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            ycx5Var.IAuthTabCallbackDefault();
                            obj.hashCode();
                            throw null;
                        }
                        if (ycx5Var.IAuthTabCallbackDefault()) {
                            ycx5Var.IAuthTabCallbackStub();
                        }
                    } else if (ycx5VarOnNavigationEvent.IAuthTabCallbackDefault()) {
                        ycx5VarOnNavigationEvent.IAuthTabCallbackStub();
                    }
                }
            }
        }
    }

    private final sya<E> onNavigationEvent(long j, sya<E> syaVar, long j2) {
        Object objOnWarmupCompleted;
        int i = 2 % 2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = (AtomicReferenceFieldUpdater) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[0], -1858799222, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1858799223, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        Function2 function2 = (Function2) nTryLock.extraCallbackWithResult();
        loop0: while (true) {
            objOnWarmupCompleted = getLargestMainSize.onWarmupCompleted(syaVar, j, function2);
            if (djExternalSyntheticApiModelOutline1.onWarmupCompleted(objOnWarmupCompleted)) {
                break;
            }
            int i2 = extraCallbackWithResult + 83;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            ycx5 ycx5VarOnNavigationEvent = djExternalSyntheticApiModelOutline1.onNavigationEvent(objOnWarmupCompleted);
            while (true) {
                ycx5 ycx5Var = (ycx5) atomicReferenceFieldUpdater.get(this);
                if (ycx5Var.onExtraCallback >= ycx5VarOnNavigationEvent.onExtraCallback) {
                    break loop0;
                }
                if (ycx5VarOnNavigationEvent.IAuthTabCallback_Parcel()) {
                    if (RequestBuilder.onWarmupCompleted(atomicReferenceFieldUpdater, this, ycx5Var, ycx5VarOnNavigationEvent)) {
                        if (!(!ycx5Var.IAuthTabCallbackDefault())) {
                            int i4 = extraCallback + 31;
                            extraCallbackWithResult = i4 % 128;
                            int i5 = i4 % 2;
                            ycx5Var.IAuthTabCallbackStub();
                        }
                    } else if (ycx5VarOnNavigationEvent.IAuthTabCallbackDefault()) {
                        ycx5VarOnNavigationEvent.IAuthTabCallbackStub();
                    }
                }
            }
        }
        if (djExternalSyntheticApiModelOutline1.onWarmupCompleted(objOnWarmupCompleted)) {
            int i6 = extraCallbackWithResult + 11;
            extraCallback = i6 % 128;
            int i7 = i6 % 2;
            onExtraCallback();
            onExtraCallbackWithResult(j, syaVar);
            onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, 0L, 1, null}, 517592440, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -517592427, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
            return null;
        }
        sya<E> syaVar2 = (sya) djExternalSyntheticApiModelOutline1.onNavigationEvent(objOnWarmupCompleted);
        if (syaVar2.onExtraCallback <= j) {
            return syaVar2;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdaterOnActivityResized = onActivityResized();
        long j3 = syaVar2.onExtraCallback;
        long j4 = nTryLock.onNavigationEvent;
        if (atomicLongFieldUpdaterOnActivityResized.compareAndSet(this, j2 + 1, j3 * j4)) {
            asInterface((syaVar2.onExtraCallback * j4) - j2);
        } else {
            onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, 0L, 1, null}, 517592440, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -517592427, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        }
        return null;
    }

    private final void access100(long j) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 83;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        AtomicLongFieldUpdater atomicLongFieldUpdaterICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        while (true) {
            long j2 = atomicLongFieldUpdaterICustomTabsCallback_Parcel.get(this);
            long j3 = 1152921504606846975L & j2;
            if (j3 >= j) {
                break;
            }
            int i4 = extraCallbackWithResult + 53;
            extraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                if (ICustomTabsCallback_Parcel().compareAndSet(this, j2, nTryLock.onExtraCallback(j3, (int) (j2 >>> 48)))) {
                    break;
                }
            } else {
                if (ICustomTabsCallback_Parcel().compareAndSet(this, j2, nTryLock.onExtraCallback(j3, (int) (j2 >> 60)))) {
                    break;
                }
            }
        }
        int i5 = extraCallback + 49;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        nLockFile nlockfile = (nLockFile) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = extraCallback + 111;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            AtomicLongFieldUpdater atomicLongFieldUpdaterExtraCommand = extraCommand();
            while (true) {
                long j = atomicLongFieldUpdaterExtraCommand.get(nlockfile);
                if (j >= jLongValue) {
                    break;
                }
                int i3 = extraCallback + 105;
                extraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 41 / 0;
                    if (extraCommand().compareAndSet(nlockfile, j, jLongValue)) {
                        break;
                    }
                    int i5 = extraCallback + 27;
                    extraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    if (extraCommand().compareAndSet(nlockfile, j, jLongValue)) {
                        break;
                    }
                    int i52 = extraCallback + 27;
                    extraCallbackWithResult = i52 % 128;
                    int i62 = i52 % 2;
                }
            }
            return null;
        }
        extraCommand();
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements getBacktraceNote<Throwable, lud<? extends E>, CoroutineContext, Unit> {
        onNavigationEvent(Object obj) {
            super(3, obj, nLockFile.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // o.getBacktraceNote
        public /* synthetic */ Unit invoke(Throwable th, Object obj, CoroutineContext coroutineContext) {
            onNavigationEvent(th, ((lud) obj).onExtraCallback(), coroutineContext);
            return Unit.INSTANCE;
        }

        public final void onNavigationEvent(Throwable th, Object obj, CoroutineContext coroutineContext) {
            nLockFile.onWarmupCompleted((nLockFile) this.receiver, th, obj, coroutineContext);
        }
    }

    private final access5300<Unit> IAuthTabCallback(Function1<? super E, Unit> function1) {
        int i = 2 % 2;
        onNavigationEvent onnavigationevent = new onNavigationEvent(this);
        int i2 = extraCallback + 49;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onnavigationevent;
        }
        throw null;
    }

    private final void onWarmupCompleted(Throwable th, Object obj, CoroutineContext coroutineContext) {
        int i = 2 % 2;
        int i2 = extraCallback + 91;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Function1<E, Unit> function1 = this.IAuthTabCallback;
        Intrinsics.checkNotNull(function1);
        Object objOnExtraCallbackWithResult = lud.onExtraCallbackWithResult(obj);
        Intrinsics.checkNotNull(objOnExtraCallbackWithResult);
        ycx7.onExtraCallback(function1, objOnExtraCallbackWithResult, coroutineContext);
        int i4 = extraCallback + 115;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
    }

    private static final Unit IAuthTabCallback(Function1 function1, Object obj, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        int i = 2 % 2;
        int i2 = extraCallback + 89;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ycx7.onExtraCallback(function1, obj, coroutineContext);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 81;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private final getBacktraceNote<Throwable, Object, CoroutineContext, Unit> IAuthTabCallback(final Function1<? super E, Unit> function1, final E e) {
        int i = 2 % 2;
        getBacktraceNote<Throwable, Object, CoroutineContext, Unit> getbacktracenote = new getBacktraceNote() { // from class: kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda2
            @Override // o.getBacktraceNote
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return nLockFile.onExtraCallback(function1, e, (Throwable) obj, obj2, (CoroutineContext) obj3);
            }
        };
        int i2 = extraCallbackWithResult + 65;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements getBacktraceNote<Throwable, E, CoroutineContext, Unit> {
        onWarmupCompleted(Object obj) {
            super(3, obj, nLockFile.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // o.getBacktraceNote
        public /* synthetic */ Unit invoke(Throwable th, Object obj, CoroutineContext coroutineContext) {
            onExtraCallbackWithResult(th, obj, coroutineContext);
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(Throwable th, E e, CoroutineContext coroutineContext) {
            nLockFile.onExtraCallbackWithResult((nLockFile) this.receiver, th, e, coroutineContext);
        }
    }

    private final access5300<Unit> onExtraCallback(Function1<? super E, Unit> function1) {
        int i = 2 % 2;
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this);
        int i2 = extraCallbackWithResult + 87;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        return onwarmupcompleted;
    }

    private final void onExtraCallbackWithResult(Throwable th, E e, CoroutineContext coroutineContext) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 85;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Function1<E, Unit> function1 = this.IAuthTabCallback;
        Intrinsics.checkNotNull(function1);
        ycx7.onExtraCallback(function1, e, coroutineContext);
        int i4 = extraCallbackWithResult + 5;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ <E> Object onExtraCallback(nLockFile<E> nlockfile, E e, access13800<? super Unit> access13800Var) {
        sya syaVar;
        sya syaVar2;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 103;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            syaVar = (sya) onTransact().get(nlockfile);
            int i3 = 29 / 0;
        } else {
            syaVar = (sya) onTransact().get(nlockfile);
        }
        while (true) {
            long andIncrement = IAuthTabCallbackDefault().getAndIncrement(nlockfile);
            long j = andIncrement & 1152921504606846975L;
            boolean zBooleanValue = ((Boolean) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nlockfile, Long.valueOf(andIncrement)}, 131741186, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -131741181, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue();
            long j2 = nTryLock.onNavigationEvent;
            long j3 = j / j2;
            int i4 = (int) (j % j2);
            Object obj = null;
            if (syaVar.onExtraCallback != j3) {
                sya syaVarOnExtraCallback = onExtraCallback(nlockfile, j3, syaVar);
                if (syaVarOnExtraCallback == null) {
                    int i5 = extraCallbackWithResult + 63;
                    int i6 = i5 % 128;
                    extraCallback = i6;
                    if (i5 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (zBooleanValue) {
                        int i7 = i6 + 37;
                        extraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        Object objOnWarmupCompleted = onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nlockfile, e, access13800Var}, 804369102, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -804369099, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                        if (objOnWarmupCompleted == access14100.onExtraCallback()) {
                            return objOnWarmupCompleted;
                        }
                    }
                } else {
                    syaVar2 = syaVarOnExtraCallback;
                }
            } else {
                syaVar2 = syaVar;
            }
            int iOnExtraCallback = onExtraCallback(nlockfile, syaVar2, i4, e, j, null, zBooleanValue);
            if (iOnExtraCallback == 0) {
                syaVar2.onWarmupCompleted();
                break;
            }
            int i9 = extraCallbackWithResult + 5;
            int i10 = i9 % 128;
            extraCallback = i10;
            int i11 = i9 % 2;
            if (iOnExtraCallback == 1) {
                break;
            }
            if (iOnExtraCallback != 2) {
                int i12 = i10 + 101;
                extraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                if (iOnExtraCallback == 3) {
                    Object objOnWarmupCompleted2 = onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nlockfile, syaVar2, Integer.valueOf(i4), e, Long.valueOf(j), access13800Var}, -1340936766, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1340936780, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                    if (objOnWarmupCompleted2 == access14100.onExtraCallback()) {
                        int i14 = extraCallbackWithResult + 25;
                        extraCallback = i14 % 128;
                        if (i14 % 2 != 0) {
                            return objOnWarmupCompleted2;
                        }
                        obj.hashCode();
                        throw null;
                    }
                } else if (iOnExtraCallback != 4) {
                    if (iOnExtraCallback == 5) {
                        syaVar2.onWarmupCompleted();
                    }
                    syaVar = syaVar2;
                } else {
                    if (j < nlockfile.IAuthTabCallbackStubProxy()) {
                        syaVar2.onWarmupCompleted();
                    }
                    Object objOnWarmupCompleted3 = onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nlockfile, e, access13800Var}, 804369102, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -804369099, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                    if (objOnWarmupCompleted3 == access14100.onExtraCallback()) {
                        return objOnWarmupCompleted3;
                    }
                }
            } else if (!(!zBooleanValue)) {
                syaVar2.access100();
                Object objOnWarmupCompleted4 = onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nlockfile, e, access13800Var}, 804369102, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -804369099, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                if (objOnWarmupCompleted4 == access14100.onExtraCallback()) {
                    return objOnWarmupCompleted4;
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        setIndicatorDirection setindicatordirectionOnExtraCallbackWithResult;
        nLockFile nlockfile = (nLockFile) objArr[0];
        Object obj = objArr[1];
        access13800 access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        Function1<E, Unit> function1 = nlockfile.IAuthTabCallback;
        if (function1 != null && (setindicatordirectionOnExtraCallbackWithResult = ycx7.onExtraCallbackWithResult(function1, obj, null, 2, null)) != null) {
            setExecute.onNavigationEvent(setindicatordirectionOnExtraCallbackWithResult, (Throwable) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nlockfile}, 1328941896, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1328941878, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback()));
            Result.Companion companion = Result.Companion;
            setresourceinternal.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(setindicatordirectionOnExtraCallbackWithResult)));
        } else {
            Throwable th = (Throwable) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nlockfile}, 1328941896, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1328941878, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
            Result.Companion companion2 = Result.Companion;
            setresourceinternal.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(th)));
        }
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            int i2 = extraCallbackWithResult + 125;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            access14600.IAuthTabCallback(access13800Var);
        }
        if (objIAuthTabCallbackDefault != access14100.onExtraCallback()) {
            return Unit.INSTANCE;
        }
        int i4 = extraCallbackWithResult + 9;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return objIAuthTabCallbackDefault;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
    
        if (r9 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0124, code lost:
    
        r3 = r3 + 81;
        o.nLockFile.extraCallbackWithResult = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012b, code lost:
    
        r19.access100();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012f, code lost:
    
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0131, code lost:
    
        if (r2 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0133, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0135, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0136, code lost:
    
        if (r6 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        r3 = r3 + 9;
        o.nLockFile.extraCallbackWithResult = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0141, code lost:
    
        onExtraCallbackWithResult(r1, r6, r19, r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [o.setResourceInternal] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) throws Throwable {
        ?? OnExtraCallback;
        setResourceInternal setresourceinternal;
        Object objIAuthTabCallbackDefault;
        sya syaVar;
        nLockFile nlockfile = (nLockFile) objArr[0];
        sya syaVar2 = (sya) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        Object obj = objArr[3];
        long jLongValue = ((Number) objArr[4]).longValue();
        access13800 access13800Var = (access13800) objArr[5];
        int i = 2 % 2;
        setResourceInternal setresourceinternalOnWarmupCompleted = maybeAddAttachStateListener.onWarmupCompleted(access14200.onExtraCallbackWithResult(access13800Var));
        try {
            OnExtraCallback = onExtraCallback(nlockfile, syaVar2, iIntValue, obj, jLongValue, setresourceinternalOnWarmupCompleted, false);
            try {
                if (OnExtraCallback != 0) {
                    int i2 = extraCallbackWithResult + 79;
                    int i3 = i2 % 128;
                    extraCallback = i3;
                    int i4 = i2 % 2;
                    if (OnExtraCallback != 1) {
                        if (OnExtraCallback != 2) {
                            if (OnExtraCallback == 4) {
                                setresourceinternal = setresourceinternalOnWarmupCompleted;
                                if (jLongValue < nlockfile.IAuthTabCallbackStubProxy()) {
                                    int i5 = extraCallback + 115;
                                    extraCallbackWithResult = i5 % 128;
                                    int i6 = i5 % 2;
                                    syaVar2.onWarmupCompleted();
                                }
                            } else {
                                if (OnExtraCallback != 5) {
                                    throw new IllegalStateException("unexpected");
                                }
                                int i7 = i3 + 31;
                                extraCallbackWithResult = i7 % 128;
                                int i8 = i7 % 2;
                                syaVar2.onWarmupCompleted();
                                sya syaVar3 = (sya) onTransact().get(nlockfile);
                                while (true) {
                                    long andIncrement = IAuthTabCallbackDefault().getAndIncrement(nlockfile);
                                    long j = andIncrement & 1152921504606846975L;
                                    boolean zBooleanValue = ((Boolean) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nlockfile, Long.valueOf(andIncrement)}, 131741186, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -131741181, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue();
                                    long j2 = nTryLock.onNavigationEvent;
                                    long j3 = j / j2;
                                    int i9 = (int) (j % j2);
                                    if (syaVar3.onExtraCallback != j3) {
                                        sya syaVarOnExtraCallback = onExtraCallback(nlockfile, j3, syaVar3);
                                        if (syaVarOnExtraCallback == null) {
                                            int i10 = extraCallback + 41;
                                            extraCallbackWithResult = i10 % 128;
                                            int i11 = i10 % 2;
                                            if (zBooleanValue) {
                                                break;
                                            }
                                        } else {
                                            syaVar = syaVarOnExtraCallback;
                                        }
                                    } else {
                                        syaVar = syaVar3;
                                    }
                                    sya syaVar4 = syaVar;
                                    int iOnExtraCallback = onExtraCallback(nlockfile, syaVar, i9, obj, j, setresourceinternalOnWarmupCompleted, zBooleanValue);
                                    if (iOnExtraCallback == 0) {
                                        setresourceinternal = setresourceinternalOnWarmupCompleted;
                                        syaVar4.onWarmupCompleted();
                                        Result.Companion companion = Result.Companion;
                                        break;
                                    }
                                    if (iOnExtraCallback == 1) {
                                        setresourceinternal = setresourceinternalOnWarmupCompleted;
                                        Result.Companion companion2 = Result.Companion;
                                        break;
                                    }
                                    int i12 = extraCallback;
                                    int i13 = i12 + 33;
                                    int i14 = i13 % 128;
                                    extraCallbackWithResult = i14;
                                    if (i13 % 2 != 0) {
                                        if (iOnExtraCallback == 5) {
                                            break;
                                        }
                                        int i15 = i14 + 107;
                                        extraCallback = i15 % 128;
                                        int i16 = i15 % 2;
                                        if (iOnExtraCallback != 3) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        if (iOnExtraCallback != 4) {
                                            if (iOnExtraCallback == 5) {
                                                syaVar4.onWarmupCompleted();
                                            }
                                            syaVar3 = syaVar4;
                                        } else if (j < nlockfile.IAuthTabCallbackStubProxy()) {
                                            syaVar4.onWarmupCompleted();
                                        }
                                    } else {
                                        if (iOnExtraCallback == 2) {
                                            break;
                                        }
                                        int i152 = i14 + 107;
                                        extraCallback = i152 % 128;
                                        int i162 = i152 % 2;
                                        if (iOnExtraCallback != 3) {
                                        }
                                    }
                                }
                                setresourceinternal = setresourceinternalOnWarmupCompleted;
                            }
                            IAuthTabCallback(nlockfile, obj, setresourceinternal);
                        } else {
                            setresourceinternal = setresourceinternalOnWarmupCompleted;
                            onExtraCallbackWithResult(nlockfile, setresourceinternal, syaVar2, iIntValue);
                            int i17 = extraCallbackWithResult + 61;
                            extraCallback = i17 % 128;
                            int i18 = i17 % 2;
                        }
                        objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
                        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
                            access14600.IAuthTabCallback(access13800Var);
                        }
                        return objIAuthTabCallbackDefault != access14100.onExtraCallback() ? objIAuthTabCallbackDefault : Unit.INSTANCE;
                    }
                    setresourceinternal = setresourceinternalOnWarmupCompleted;
                    Result.Companion companion3 = Result.Companion;
                } else {
                    setresourceinternal = setresourceinternalOnWarmupCompleted;
                    syaVar2.onWarmupCompleted();
                    Result.Companion companion4 = Result.Companion;
                }
                setresourceinternal.resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
                objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
                if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
                }
                if (objIAuthTabCallbackDefault != access14100.onExtraCallback()) {
                }
            } catch (Throwable th) {
                th = th;
                OnExtraCallback.IAuthTabCallbackStub();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            OnExtraCallback = setresourceinternalOnWarmupCompleted;
        }
    }

    private final Object onExtraCallbackWithResult(sya<E> syaVar, int i, long j, access13800<? super E> access13800Var) {
        Function1<E, Unit> function1;
        sya syaVar2;
        int i2 = 2 % 2;
        setResourceInternal setresourceinternalOnWarmupCompleted = maybeAddAttachStateListener.onWarmupCompleted(access14200.onExtraCallbackWithResult(access13800Var));
        try {
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((nLockFile) this, (sya) syaVar, i, j, (Object) setresourceinternalOnWarmupCompleted);
            if (objOnExtraCallbackWithResult != nTryLock.extraCallbackWithResult) {
                access5300 access5300VarIAuthTabCallback = null;
                if (objOnExtraCallbackWithResult == nTryLock.IAuthTabCallbackDefault) {
                    if (j < access100()) {
                        int i3 = extraCallback + 79;
                        extraCallbackWithResult = i3 % 128;
                        if (i3 % 2 == 0) {
                            syaVar.onWarmupCompleted();
                        } else {
                            syaVar.onWarmupCompleted();
                            int i4 = 65 / 0;
                        }
                    }
                    sya syaVar3 = (sya) onNavigationEvent().get(this);
                    while (true) {
                        if (IAuthTabCallback_Parcel()) {
                            onExtraCallbackWithResult((nLockFile) this, (maybeRemoveAttachStateListener) setresourceinternalOnWarmupCompleted);
                            break;
                        }
                        long andIncrement = onWarmupCompleted().getAndIncrement(this);
                        long j2 = nTryLock.onNavigationEvent;
                        long j3 = andIncrement / j2;
                        int i5 = (int) (andIncrement % j2);
                        if (syaVar3.onExtraCallback != j3) {
                            int i6 = extraCallback + 31;
                            extraCallbackWithResult = i6 % 128;
                            if (i6 % 2 != 0) {
                                access5300VarIAuthTabCallback.hashCode();
                                throw null;
                            }
                            sya syaVar4 = (sya) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, Long.valueOf(j3), syaVar3}, -459845233, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 459845240, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                            if (syaVar4 != null) {
                                syaVar2 = syaVar4;
                            } else {
                                continue;
                            }
                        } else {
                            syaVar2 = syaVar3;
                        }
                        objOnExtraCallbackWithResult = onExtraCallbackWithResult((nLockFile) this, syaVar2, i5, andIncrement, (Object) setresourceinternalOnWarmupCompleted);
                        if (objOnExtraCallbackWithResult != nTryLock.extraCallbackWithResult) {
                            if (objOnExtraCallbackWithResult != nTryLock.IAuthTabCallbackDefault) {
                                if (objOnExtraCallbackWithResult == nTryLock.ICustomTabsCallback) {
                                    throw new IllegalStateException("unexpected");
                                }
                                syaVar2.onWarmupCompleted();
                                function1 = this.IAuthTabCallback;
                                if (function1 != null) {
                                }
                            } else {
                                int i7 = extraCallback + 37;
                                extraCallbackWithResult = i7 % 128;
                                int i8 = i7 % 2;
                                if (andIncrement < access100()) {
                                    int i9 = extraCallbackWithResult + 119;
                                    extraCallback = i9 % 128;
                                    int i10 = i9 % 2;
                                    syaVar2.onWarmupCompleted();
                                }
                                syaVar3 = syaVar2;
                            }
                        } else {
                            int i11 = extraCallbackWithResult + 95;
                            int i12 = i11 % 128;
                            extraCallback = i12;
                            if (i11 % 2 == 0) {
                                throw null;
                            }
                            setResourceInternal setresourceinternal = setresourceinternalOnWarmupCompleted != null ? setresourceinternalOnWarmupCompleted : null;
                            if (setresourceinternal != null) {
                                int i13 = i12 + 21;
                                extraCallbackWithResult = i13 % 128;
                                if (i13 % 2 != 0) {
                                    IAuthTabCallback(this, setresourceinternal, syaVar2, i5);
                                    access5300VarIAuthTabCallback.hashCode();
                                    throw null;
                                }
                                IAuthTabCallback(this, setresourceinternal, syaVar2, i5);
                            }
                        }
                    }
                    setresourceinternalOnWarmupCompleted.IAuthTabCallback((setResourceInternal) objOnExtraCallbackWithResult, (getBacktraceNote<? super Throwable, ? super setResourceInternal, ? super CoroutineContext, Unit>) access5300VarIAuthTabCallback);
                } else {
                    syaVar.onWarmupCompleted();
                    function1 = this.IAuthTabCallback;
                    if (function1 != null) {
                        access5300VarIAuthTabCallback = IAuthTabCallback((nLockFile) this, (Function1) function1);
                    }
                    setresourceinternalOnWarmupCompleted.IAuthTabCallback((setResourceInternal) objOnExtraCallbackWithResult, (getBacktraceNote<? super Throwable, ? super setResourceInternal, ? super CoroutineContext, Unit>) access5300VarIAuthTabCallback);
                }
            } else {
                IAuthTabCallback(this, setresourceinternalOnWarmupCompleted, syaVar, i);
            }
            Object objIAuthTabCallbackDefault = setresourceinternalOnWarmupCompleted.IAuthTabCallbackDefault();
            if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
                access14600.IAuthTabCallback(access13800Var);
            }
            return objIAuthTabCallbackDefault;
        } catch (Throwable th) {
            setresourceinternalOnWarmupCompleted.IAuthTabCallbackStub();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object access000(Object[] objArr) throws Throwable {
        IAuthTabCallbackStub iAuthTabCallbackStub;
        setResourceInternal setresourceinternal;
        ReceiveCatching receiveCatching;
        lud ludVarOnExtraCallback;
        Function1<E, Unit> function1;
        sya syaVar;
        char c = 0;
        nLockFile nlockfile = (nLockFile) objArr[0];
        sya syaVar2 = (sya) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        long jLongValue = ((Number) objArr[3]).longValue();
        access13800 access13800Var = (access13800) objArr[4];
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallbackStub) {
            iAuthTabCallbackStub = (IAuthTabCallbackStub) access13800Var;
            int i2 = iAuthTabCallbackStub.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallbackStub.label = i2 - 2147483648;
                int i3 = extraCallbackWithResult + 1;
                extraCallback = i3 % 128;
                int i4 = i3 % 2;
            } else {
                iAuthTabCallbackStub = new IAuthTabCallbackStub(nlockfile, access13800Var);
            }
        }
        IAuthTabCallbackStub iAuthTabCallbackStub2 = iAuthTabCallbackStub;
        Object objIAuthTabCallbackDefault = iAuthTabCallbackStub2.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i5 = iAuthTabCallbackStub2.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallbackDefault);
            iAuthTabCallbackStub2.L$0 = nlockfile;
            iAuthTabCallbackStub2.L$1 = syaVar2;
            iAuthTabCallbackStub2.I$0 = iIntValue;
            iAuthTabCallbackStub2.J$0 = jLongValue;
            iAuthTabCallbackStub2.label = 1;
            setResourceInternal setresourceinternalOnWarmupCompleted = maybeAddAttachStateListener.onWarmupCompleted(access14200.onExtraCallbackWithResult(iAuthTabCallbackStub2));
            try {
                Intrinsics.checkNotNull(setresourceinternalOnWarmupCompleted, "");
                receiveCatching = new ReceiveCatching(setresourceinternalOnWarmupCompleted);
                setresourceinternal = setresourceinternalOnWarmupCompleted;
            } catch (Throwable th) {
                th = th;
                setresourceinternal = setresourceinternalOnWarmupCompleted;
            }
            try {
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(nlockfile, syaVar2, iIntValue, jLongValue, receiveCatching);
                if (objOnExtraCallbackWithResult == nTryLock.extraCallbackWithResult) {
                    IAuthTabCallback(nlockfile, receiveCatching, syaVar2, iIntValue);
                } else {
                    ReceiveCatching receiveCatching2 = receiveCatching;
                    access5300 access5300VarOnWarmupCompleted = null;
                    if (objOnExtraCallbackWithResult == nTryLock.IAuthTabCallbackDefault) {
                        if (jLongValue < nlockfile.access100()) {
                            int i6 = extraCallbackWithResult + 31;
                            extraCallback = i6 % 128;
                            int i7 = i6 % 2;
                            syaVar2.onWarmupCompleted();
                        }
                        sya syaVar3 = (sya) onNavigationEvent().get(nlockfile);
                        while (true) {
                            if (nlockfile.IAuthTabCallback_Parcel()) {
                                onWarmupCompleted(nlockfile, (maybeRemoveAttachStateListener) setresourceinternal);
                                break;
                            }
                            long andIncrement = onWarmupCompleted().getAndIncrement(nlockfile);
                            long j = nTryLock.onNavigationEvent;
                            long j2 = andIncrement / j;
                            int i8 = (int) (andIncrement % j);
                            if (syaVar3.onExtraCallback != j2) {
                                Object[] objArr2 = new Object[3];
                                objArr2[c] = nlockfile;
                                objArr2[1] = Long.valueOf(j2);
                                objArr2[2] = syaVar3;
                                sya syaVar4 = (sya) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), objArr2, -459845233, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 459845240, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                                if (syaVar4 != null) {
                                    int i9 = extraCallback + 69;
                                    extraCallbackWithResult = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        access5300VarOnWarmupCompleted.hashCode();
                                        throw null;
                                    }
                                    syaVar = syaVar4;
                                } else {
                                    continue;
                                }
                            } else {
                                syaVar = syaVar3;
                            }
                            sya syaVar5 = syaVar;
                            ReceiveCatching receiveCatching3 = receiveCatching2;
                            Object objOnExtraCallbackWithResult2 = onExtraCallbackWithResult(nlockfile, syaVar, i8, andIncrement, receiveCatching2);
                            if (objOnExtraCallbackWithResult2 == nTryLock.extraCallbackWithResult) {
                                IAuthTabCallback(nlockfile, receiveCatching3, syaVar5, i8);
                                break;
                            }
                            if (objOnExtraCallbackWithResult2 == nTryLock.IAuthTabCallbackDefault) {
                                if (andIncrement < nlockfile.access100()) {
                                    int i10 = extraCallbackWithResult + 1;
                                    extraCallback = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        syaVar5.onWarmupCompleted();
                                        access5300VarOnWarmupCompleted.hashCode();
                                        throw null;
                                    }
                                    syaVar5.onWarmupCompleted();
                                }
                                syaVar3 = syaVar5;
                                receiveCatching2 = receiveCatching3;
                                c = 0;
                            } else {
                                if (objOnExtraCallbackWithResult2 == nTryLock.ICustomTabsCallback) {
                                    throw new IllegalStateException("unexpected");
                                }
                                syaVar5.onWarmupCompleted();
                                ludVarOnExtraCallback = lud.onExtraCallback(lud.Companion.onNavigationEvent(objOnExtraCallbackWithResult2));
                                function1 = nlockfile.IAuthTabCallback;
                                if (function1 != null) {
                                }
                            }
                        }
                    } else {
                        syaVar2.onWarmupCompleted();
                        ludVarOnExtraCallback = lud.onExtraCallback(lud.Companion.onNavigationEvent(objOnExtraCallbackWithResult));
                        function1 = nlockfile.IAuthTabCallback;
                        if (function1 != null) {
                            access5300VarOnWarmupCompleted = onWarmupCompleted(nlockfile, (Function1) function1);
                        }
                        setresourceinternal.IAuthTabCallback((setResourceInternal) ludVarOnExtraCallback, (getBacktraceNote<? super Throwable, ? super setResourceInternal, ? super CoroutineContext, Unit>) access5300VarOnWarmupCompleted);
                    }
                }
                objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
                if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
                    access14600.IAuthTabCallback(iAuthTabCallbackStub2);
                }
                if (objIAuthTabCallbackDefault == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } catch (Throwable th2) {
                th = th2;
                setresourceinternal.IAuthTabCallbackStub();
                throw th;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objIAuthTabCallbackDefault);
        }
        return ((lud) objIAuthTabCallbackDefault).onExtraCallback();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object onMinimized() {
        sya syaVar;
        int i = 2 % 2;
        long j = extraCommand().get(this);
        long j2 = ICustomTabsCallback_Parcel().get(this);
        if (IAuthTabCallbackDefault(j2)) {
            return lud.Companion.onExtraCallback(asBinder());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            int i2 = extraCallback + 111;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return lud.Companion.onExtraCallbackWithResult();
        }
        djExternalSyntheticApiModelOutline0 djexternalsyntheticapimodeloutline0 = nTryLock.IAuthTabCallbackStub;
        sya syaVar2 = (sya) onNavigationEvent().get(this);
        while (!IAuthTabCallback_Parcel()) {
            long andIncrement = onWarmupCompleted().getAndIncrement(this);
            long j3 = nTryLock.onNavigationEvent;
            long j4 = andIncrement / j3;
            int i4 = (int) (andIncrement % j3);
            if (syaVar2.onExtraCallback != j4) {
                sya syaVar3 = (sya) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, Long.valueOf(j4), syaVar2}, -459845233, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 459845240, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                if (syaVar3 != null) {
                    syaVar = syaVar3;
                } else {
                    continue;
                }
            } else {
                syaVar = syaVar2;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(this, syaVar, i4, andIncrement, djexternalsyntheticapimodeloutline0);
            if (objOnExtraCallbackWithResult == nTryLock.extraCallbackWithResult) {
                onExtraCallback(andIncrement);
                syaVar.access100();
                return lud.Companion.onExtraCallbackWithResult();
            }
            if (objOnExtraCallbackWithResult != nTryLock.IAuthTabCallbackDefault) {
                if (objOnExtraCallbackWithResult == nTryLock.ICustomTabsCallback) {
                    throw new IllegalStateException("unexpected");
                }
                int i5 = extraCallback + 27;
                extraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                syaVar.onWarmupCompleted();
                Object objOnNavigationEvent = lud.Companion.onNavigationEvent(objOnExtraCallbackWithResult);
                int i7 = extraCallback + 125;
                extraCallbackWithResult = i7 % 128;
                if (i7 % 2 == 0) {
                    return objOnNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (andIncrement < access100()) {
                syaVar.onWarmupCompleted();
            }
            syaVar2 = syaVar;
        }
        return lud.Companion.onExtraCallback(asBinder());
    }

    private final void onExtraCallback(jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni, Object obj) {
        sya syaVar;
        int i = 2 % 2;
        sya syaVar2 = (sya) onNavigationEvent().get(this);
        while (!IAuthTabCallback_Parcel()) {
            long andIncrement = onWarmupCompleted().getAndIncrement(this);
            long j = nTryLock.onNavigationEvent;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (syaVar2.onExtraCallback != j2) {
                int i3 = extraCallback + 103;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                sya syaVar3 = (sya) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, Long.valueOf(j2), syaVar2}, -459845233, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 459845240, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                if (syaVar3 != null) {
                    syaVar = syaVar3;
                } else {
                    continue;
                }
            } else {
                syaVar = syaVar2;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(this, syaVar, i2, andIncrement, jni_ygnodestylegetborderjni);
            if (objOnExtraCallbackWithResult != nTryLock.extraCallbackWithResult) {
                if (objOnExtraCallbackWithResult != nTryLock.IAuthTabCallbackDefault) {
                    if (objOnExtraCallbackWithResult == nTryLock.ICustomTabsCallback) {
                        throw new IllegalStateException("unexpected");
                    }
                    syaVar.onWarmupCompleted();
                    jni_ygnodestylegetborderjni.onExtraCallback(objOnExtraCallbackWithResult);
                    return;
                }
                if (andIncrement < access100()) {
                    int i5 = extraCallbackWithResult + 57;
                    extraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    syaVar.onWarmupCompleted();
                }
                syaVar2 = syaVar;
            } else {
                int i7 = extraCallbackWithResult + 99;
                int i8 = i7 % 128;
                extraCallback = i8;
                if (i7 % 2 == 0) {
                    boolean z = jni_ygnodestylegetborderjni instanceof syncDoGet;
                    throw null;
                }
                syncDoGet syncdoget = jni_ygnodestylegetborderjni instanceof syncDoGet ? (syncDoGet) jni_ygnodestylegetborderjni : null;
                if (syncdoget != null) {
                    int i9 = i8 + 19;
                    extraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    IAuthTabCallback(this, syncdoget, syaVar, i2);
                    return;
                }
                return;
            }
        }
        onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, jni_ygnodestylegetborderjni}, -2008251673, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 2008251684, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x001d, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(long j, sya<E> syaVar) {
        sya<E> syaVar2;
        int i = 2 % 2;
        while (syaVar.onExtraCallback < j) {
            int i2 = extraCallbackWithResult + 123;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            sya<E> syaVar3 = (sya) syaVar.onExtraCallbackWithResult();
            if (syaVar3 == null) {
                break;
            } else {
                syaVar = syaVar3;
            }
        }
        while (true) {
            if (!syaVar.asInterface() || (syaVar2 = (sya) syaVar.onExtraCallbackWithResult()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = (AtomicReferenceFieldUpdater) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[0], -1858799222, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1858799223, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                while (true) {
                    ycx5 ycx5Var = (ycx5) atomicReferenceFieldUpdater.get(this);
                    if (ycx5Var.onExtraCallback >= syaVar.onExtraCallback) {
                        return;
                    }
                    if (syaVar.IAuthTabCallback_Parcel()) {
                        if (RequestBuilder.onWarmupCompleted(atomicReferenceFieldUpdater, this, ycx5Var, syaVar)) {
                            int i4 = extraCallbackWithResult + 17;
                            extraCallback = i4 % 128;
                            if (i4 % 2 == 0) {
                                ycx5Var.IAuthTabCallbackDefault();
                                throw null;
                            }
                            if (ycx5Var.IAuthTabCallbackDefault()) {
                                ycx5Var.IAuthTabCallbackStub();
                                return;
                            }
                            return;
                        }
                        if (syaVar.IAuthTabCallbackDefault()) {
                            syaVar.IAuthTabCallbackStub();
                            int i5 = extraCallback + 89;
                            extraCallbackWithResult = i5 % 128;
                            int i6 = i5 % 2;
                        }
                    }
                }
            } else {
                int i7 = extraCallbackWithResult + 119;
                extraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
                syaVar = syaVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02b3, code lost:
    
        r5 = r2;
        r2 = r1;
        r4 = (o.sya) r4.onExtraCallbackWithResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02bc, code lost:
    
        if (r4 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0243, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, o.nTryLock.extraCallback()) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x024e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, o.nTryLock.extraCallback()) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0250, code lost:
    
        r1 = r2.toString();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() throws Throwable {
        StringBuilder sb;
        char c;
        char c2;
        String string;
        StringBuilder sb2;
        char c3 = 2;
        int i = 2 % 2;
        StringBuilder sb3 = new StringBuilder();
        int i2 = (int) (ICustomTabsCallback_Parcel().get(this) >> 60);
        if (i2 == 2) {
            sb3.append("closed,");
        } else if (i2 == 3) {
            sb3.append("cancelled,");
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("capacity=");
        sb4.append(this.access000);
        char c4 = ',';
        sb4.append(',');
        sb3.append(sb4.toString());
        sb3.append("data=[");
        boolean z = true;
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new sya[]{mayLaunchUrl().get(this), ((AtomicReferenceFieldUpdater) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[0], -1349238246, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1349238261, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).get(this), ((AtomicReferenceFieldUpdater) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[0], -1858799222, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1858799223, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((sya) obj) != nTryLock.IAuthTabCallbackStubProxy) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((sya) next).onExtraCallback;
            while (true) {
                Object next2 = it.next();
                long j2 = ((sya) next2).onExtraCallback;
                if (j > j2) {
                    int i3 = extraCallback + 33;
                    extraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 77 / 0;
                    }
                    next = next2;
                    j = j2;
                }
                if (!it.hasNext()) {
                    break;
                }
                c4 = c4;
                z = z;
            }
        }
        sya syaVar = (sya) next;
        long jIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        long jAccess100 = access100();
        loop2: while (true) {
            int i5 = nTryLock.onNavigationEvent;
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                StringBuilder sb5 = sb3;
                long j3 = (syaVar.onExtraCallback * nTryLock.onNavigationEvent) + i6;
                if (j3 >= jAccess100 && j3 >= jIAuthTabCallbackStubProxy) {
                    sb = sb5;
                    break loop2;
                }
                Object objOnExtraCallback = syaVar.onExtraCallback(i6);
                Object objOnNavigationEvent = syaVar.onNavigationEvent(i6);
                if (objOnExtraCallback instanceof maybeRemoveAttachStateListener) {
                    if (j3 < jIAuthTabCallbackStubProxy && j3 >= jAccess100) {
                        string = "receive";
                    } else if (j3 >= jAccess100 || j3 < jIAuthTabCallbackStubProxy) {
                        string = "cont";
                    } else {
                        Object[] objArr = new Object[1];
                        a((short) Drawable.resolveOpacity(0, 0), (byte) (Color.rgb(0, 0, 0) + 16777161), (-1393345259) - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), AndroidCharacter.getMirror('0') - 61214, (ViewConfiguration.getKeyRepeatDelay() >> 16) - 44, objArr);
                        string = ((String) objArr[0]).intern();
                    }
                } else if (objOnExtraCallback instanceof jni_YGNodeStyleGetBorderJNI) {
                    if (j3 < jIAuthTabCallbackStubProxy) {
                        int i7 = extraCallback + 47;
                        extraCallbackWithResult = i7 % 128;
                        if (i7 % 2 != 0) {
                            throw null;
                        }
                        string = j3 >= jAccess100 ? "onReceive" : (j3 >= jAccess100 || j3 < jIAuthTabCallbackStubProxy) ? "select" : "onSend";
                    }
                    i6++;
                    c3 = c2;
                    sb3 = sb2;
                } else if (objOnExtraCallback instanceof ReceiveCatching) {
                    string = "receiveCatching";
                } else if (!(!(objOnExtraCallback instanceof onExtraCallbackWithResult))) {
                    int i8 = extraCallbackWithResult + 1;
                    extraCallback = i8 % 128;
                    c2 = 2;
                    int i9 = i8 % 2;
                    string = "sendBroadcast";
                    if (objOnNavigationEvent != null) {
                    }
                    i6++;
                    c3 = c2;
                    sb3 = sb2;
                } else if (objOnExtraCallback instanceof thx) {
                    string = "EB(" + objOnExtraCallback + ')';
                } else if (Intrinsics.areEqual(objOnExtraCallback, nTryLock.writeTypedObject) || Intrinsics.areEqual(objOnExtraCallback, nTryLock.extraCallback)) {
                    string = "resuming_sender";
                } else {
                    if (objOnExtraCallback == null || Intrinsics.areEqual(objOnExtraCallback, nTryLock.access100) || Intrinsics.areEqual(objOnExtraCallback, nTryLock.asInterface) || Intrinsics.areEqual(objOnExtraCallback, nTryLock.IAuthTabCallback_Parcel)) {
                        sb2 = sb5;
                        c2 = 2;
                    } else {
                        int i10 = extraCallbackWithResult + 23;
                        extraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        if (!Intrinsics.areEqual(objOnExtraCallback, nTryLock.IAuthTabCallbackStub)) {
                            int i12 = extraCallback + 97;
                            extraCallbackWithResult = i12 % 128;
                            int i13 = i12 % 2;
                            if (!Intrinsics.areEqual(objOnExtraCallback, nTryLock.onTransact)) {
                                int i14 = extraCallback + 103;
                                extraCallbackWithResult = i14 % 128;
                                if (i14 % 2 != 0) {
                                    int i15 = 20 / 0;
                                }
                                if (objOnNavigationEvent != null) {
                                    sb2 = sb5;
                                    sb2.append('(' + string + ',' + objOnNavigationEvent + "),");
                                } else {
                                    sb2 = sb5;
                                    sb2.append(string + ',');
                                }
                            }
                        }
                        c2 = 2;
                        sb2 = sb5;
                    }
                    i6++;
                    c3 = c2;
                    sb3 = sb2;
                }
                c2 = 2;
                if (objOnNavigationEvent != null) {
                }
                i6++;
                c3 = c2;
                sb3 = sb2;
            }
            c3 = c;
            sb3 = sb;
        }
        if (StringsKt___StringsKt.last(sb) == ',') {
            Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "");
        }
        sb.append("]");
        return sb.toString();
    }

    public static final /* synthetic */ sya onExtraCallbackWithResult(nLockFile nlockfile, long j, sya syaVar) {
        return (sya) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nlockfile, Long.valueOf(j), syaVar}, -459845233, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 459845240, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private final boolean onWarmupCompleted(long j) {
        return ((Boolean) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, Long.valueOf(j)}, -711815857, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 711815874, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue();
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater onRelationshipValidationResult() {
        return (AtomicReferenceFieldUpdater) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[0], -1858799222, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1858799223, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater ICustomTabsService() {
        return (AtomicReferenceFieldUpdater) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[0], -1349238246, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1349238261, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private final void postMessage() {
        onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this}, 1962150351, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1962150343, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private final boolean onExtraCallback(long j, boolean z) {
        return ((Boolean) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, Long.valueOf(j), Boolean.valueOf(z)}, 487166467, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -487166447, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue();
    }

    private final boolean asBinder(long j) {
        return ((Boolean) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, Long.valueOf(j)}, -610862469, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 610862479, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue();
    }

    private final void newSessionWithExtras() {
        onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this}, 1416353531, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1416353531, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private final void newAuthTabSession() {
        onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this}, 1613042211, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1613042205, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private final void IAuthTabCallback(maybeRemoveAttachStateListener<? super lud<? extends E>> mayberemoveattachstatelistener) {
        onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, mayberemoveattachstatelistener}, 1936512349, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1936512330, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private final void onWarmupCompleted(jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni) {
        onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, jni_ygnodestylegetborderjni}, -2008251673, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 2008251684, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private final Object onExtraCallbackWithResult(E e, access13800<? super Unit> access13800Var) {
        return onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, e, access13800Var}, 804369102, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -804369099, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private final void onNavigationEvent(E e, maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener) {
        onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, e, mayberemoveattachstatelistener}, 632645495, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -632645493, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private final Object onWarmupCompleted(sya<E> syaVar, int i, long j, access13800<? super lud<? extends E>> access13800Var) {
        return onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, syaVar, Integer.valueOf(i), Long.valueOf(j), access13800Var}, 1323250223, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1323250211, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private final Object IAuthTabCallback(sya<E> syaVar, int i, E e, long j, access13800<? super Unit> access13800Var) {
        return onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, syaVar, Integer.valueOf(i), e, Long.valueOf(j), access13800Var}, -1340936766, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1340936780, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private final boolean onExtraCallback(sya<E> syaVar, int i, long j) {
        return ((Boolean) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, syaVar, Integer.valueOf(i), Long.valueOf(j)}, 2110017338, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -2110017329, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue();
    }

    private final void IAuthTabCallbackStub(long j) {
        onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, Long.valueOf(j)}, -1524713147, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1524713151, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    protected final Throwable access000() {
        return (Throwable) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this}, 1328941896, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1328941878, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    static void onPostMessage() {
        IAuthTabCallback_Parcel = -146072862;
        IAuthTabCallbackStubProxy = -1538795485;
        readTypedObject = -1176029335;
        ICustomTabsCallback = new byte[]{-47, 55, -56, 51};
    }
}
