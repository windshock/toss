package im.toss.devtool.action.presentation;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.access15400;
import o.bindContext;
import o.findResAndMsg;
import o.getCornerRadius;
import o.internalStart;

/* loaded from: classes.dex */
public final class DevToolActionListViewModel$asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static final byte[] $$a;
    private static final int $$b = 158;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback;
    private static int onExtraCallback;
    private static int onWarmupCompleted;
    final /* synthetic */ String $keyword;
    final /* synthetic */ internalStart.onExtraCallback $state;
    Object L$0;
    int label;
    final /* synthetic */ DevToolActionListViewModel this$0;

    private static String $$c(short s, short s2, int i) {
        int i2 = 4 - (s2 * 2);
        int i3 = s * 2;
        byte[] bArr = $$a;
        int i4 = (i * 2) + 102;
        byte[] bArr2 = new byte[i3 + 11];
        int i5 = i3 + 10;
        int i6 = -1;
        if (bArr == null) {
            i2++;
            i4 = i2 + (-i4) + 2;
        }
        while (true) {
            int i7 = i4;
            int i8 = i2;
            i6++;
            bArr2[i6] = (byte) i7;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 = i8 + 1;
            i4 = i7 + (-bArr[i8]) + 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevToolActionListViewModel$asInterface(String str, DevToolActionListViewModel devToolActionListViewModel, internalStart.onExtraCallback onextracallback, access13800<? super DevToolActionListViewModel$asInterface> access13800Var) {
        super(2, access13800Var);
        this.$keyword = str;
        this.this$0 = devToolActionListViewModel;
        this.$state = onextracallback;
    }

    public static native int A(Object obj, Object obj2, int i, Object obj3, Object obj4, int i2, Object obj5, Object obj6, int i3, Object obj7, Object obj8, int i4, Object obj9);

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        DevToolActionListViewModel$asInterface devToolActionListViewModel$asInterface = new DevToolActionListViewModel$asInterface(this.$keyword, this.this$0, this.$state, access13800Var);
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 18 / 0;
        }
        return devToolActionListViewModel$asInterface;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onWarmupCompleted = i2 % 128;
        Object obj3 = null;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            obj3.hashCode();
            throw null;
        }
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
        int i3 = onExtraCallback + 57;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return objOnExtraCallbackWithResult;
        }
        throw null;
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        return objInvokeSuspend;
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) {
        char[] cArr2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr3 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback + i3);
            int i5 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            cArr3[i5] = bindContext.access000.g(cArr3[i5], IAuthTabCallback);
            LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
        }
        if (i2 > 0) {
            int i6 = $11 + 31;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i8 = $10 + 19;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 5 / 4;
            }
        }
        if (z) {
            int i10 = $10 + 7;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
            } else {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i11 = $11 + 21;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    public final Object invokeSuspend(Object obj) {
        internalStart.onExtraCallback onextracallbackIAuthTabCallback;
        int i = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        if (i2 != 0) {
            int i3 = onExtraCallback + 47;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                Object[] objArr = new Object[1];
                a(47 - View.getDefaultSize(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 9, new char[]{7, 19, 22, 19, 25, 24, '\r', 18, '\t', 7, 5, 16, 16, 65476, 24, 19, 65476, 65483, 22, '\t', 23, 25, 17, '\t', 65483, 65476, 6, '\t', '\n', 19, 22, '\t', 65476, 65483, '\r', 18, 26, 19, 15, '\t', 65483, 65476, 27, '\r', 24, '\f', 65476}, false, MotionEvent.axisFromString("") + 266, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            if (this.$keyword.length() <= 0 || ((internalStart.onExtraCallback) DevToolActionListViewModel.onExtraCallback$58d8e52c(this.this$0)) == null) {
                onextracallbackIAuthTabCallback = (internalStart.onExtraCallback) DevToolActionListViewModel.onExtraCallback$58d8e52c(this.this$0);
                if (onextracallbackIAuthTabCallback == null) {
                    onextracallbackIAuthTabCallback = this.$state;
                }
            } else {
                int i4 = onWarmupCompleted + 39;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                internalStart.onExtraCallback onextracallback = (internalStart.onExtraCallback) DevToolActionListViewModel.onExtraCallback$58d8e52c(this.this$0);
                Intrinsics.checkNotNull(onextracallback);
                DevToolActionListViewModel devToolActionListViewModel = this.this$0;
                String str = this.$keyword;
                onextracallbackIAuthTabCallback = internalStart.onExtraCallback.IAuthTabCallback(this.$state, DevToolActionListViewModel.onWarmupCompleted(devToolActionListViewModel, onextracallback.onExtraCallback(), str), DevToolActionListViewModel.onWarmupCompleted(devToolActionListViewModel, onextracallback.IAuthTabCallback(), str), DevToolActionListViewModel.onWarmupCompleted(devToolActionListViewModel, onextracallback.onNavigationEvent(), str), null, 8, null);
            }
            getCornerRadius getcornerradiusAsBinder = DevToolActionListViewModel.asBinder(this.this$0);
            this.L$0 = access15400.onNavigationEvent(onextracallbackIAuthTabCallback);
            this.label = 1;
            if (getcornerradiusAsBinder.emit(onextracallbackIAuthTabCallback, this) == objOnWarmupCompleted) {
                int i6 = onExtraCallback + 39;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 88 / 0;
                }
                return objOnWarmupCompleted;
            }
        }
        return Unit.INSTANCE;
    }

    static {
        byte[] bArr = {68, -59, -116, 119, -1, -3, 12, 26, -27, 9, -14, 19, -15, -5};
        $$a = bArr;
        ClassLoader parent = DevToolActionListViewModel$asInterface.class.getClassLoader().getParent();
        try {
            byte b = (byte) (bArr[4] + 1);
            byte b2 = b;
            Method declaredMethod = ClassLoader.class.getDeclaredMethod($$c(b, b2, b2), String.class);
            declaredMethod.setAccessible(true);
            System.load((String) declaredMethod.invoke(parent, "ea56"));
            onExtraCallback = 0;
            onWarmupCompleted = 1;
            IAuthTabCallback = 478308996;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
