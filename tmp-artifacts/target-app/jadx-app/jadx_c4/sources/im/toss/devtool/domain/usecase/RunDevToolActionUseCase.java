package im.toss.devtool.domain.usecase;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.GeckoHubImp;
import o.TimelineExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.access15400;
import o.access8100;
import o.getScopeType;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RunDevToolActionUseCase {
    private final Object IAuthTabCallback;
    private final getScopeType onNavigationEvent;
    private static final byte[] $$a = {1, Byte.MIN_VALUE, 109, Byte.MIN_VALUE};
    private static final int $$b = 237;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int IAuthTabCallbackStub = 1;
    private static char[] onWarmupCompleted = {60855, 620, 12810, 8755, 21136, 17053, 29357, 25371, 37691, 33543, 46027, 41972, 54157, 50108, 61551, 57412, 4196, 223, 12531, 8361, 20815, 16747, 28951, 24971, 37291, 33164, 45488, 42561, 54791, 50730, 63199, 59060, 5844, 1882, 14191, 9995, 22328, 18345, 30593, 26548, 37966, 33914, 46139, 42195, 54513, 50335, 62799};
    private static long onExtraCallback = -1622570126648802803L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, short s2) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = (b * 3) + 1;
        int i4 = 4 - (s2 * 2);
        int i5 = 97 - (s * 4);
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            i5 = i3;
            int i6 = i4;
            i2 = 0;
            i5 += -i4;
            i4 = i6 + 1;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i6 = i4;
            i4 = bArr[i4];
            i5 += -i4;
            i4 = i6 + 1;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
            }
        }
    }

    @Inject
    public RunDevToolActionUseCase(@NotNull Object obj, @NotNull getScopeType getscopetype) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(getscopetype, "");
        this.IAuthTabCallback = obj;
        this.onNavigationEvent = getscopetype;
    }

    public static final /* synthetic */ getScopeType onNavigationEvent(RunDevToolActionUseCase runDevToolActionUseCase) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        getScopeType getscopetype = runDevToolActionUseCase.onNavigationEvent;
        int i5 = i3 + 75;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return getscopetype;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object IAuthTabCallback(RunDevToolActionUseCase runDevToolActionUseCase, String str, Map map, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = IAuthTabCallbackStub + 23;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            map = access8100.onNavigationEvent();
        }
        Object objOnWarmupCompleted = runDevToolActionUseCase.onWarmupCompleted(str, map, access13800Var);
        int i5 = IAuthTabCallbackStub + 37;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return objOnWarmupCompleted;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x010f, code lost:
    
        if (onExtraCallback$5a2aa680(r18, r2, r6, null, r5, 4, null) == r10) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull String str, @NotNull Map<String, ? extends List<String>> map, @NotNull access13800<? super Unit> access13800Var) {
        RunDevToolActionUseCase$invoke$1 runDevToolActionUseCase$invoke$1;
        int i;
        String str2;
        Map<String, ? extends List<String>> map2;
        int i2 = 2 % 2;
        if (!(!(access13800Var instanceof RunDevToolActionUseCase$invoke$1))) {
            runDevToolActionUseCase$invoke$1 = (RunDevToolActionUseCase$invoke$1) access13800Var;
            int i3 = runDevToolActionUseCase$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                runDevToolActionUseCase$invoke$1.label = i3 - 2147483648;
                i = onExtraCallbackWithResult + 101;
            } else {
                runDevToolActionUseCase$invoke$1 = new RunDevToolActionUseCase$invoke$1(this, access13800Var);
                i = onExtraCallbackWithResult + 59;
            }
        }
        IAuthTabCallbackStub = i % 128;
        int i4 = i % 2;
        RunDevToolActionUseCase$invoke$1 runDevToolActionUseCase$invoke$12 = runDevToolActionUseCase$invoke$1;
        Object obj = runDevToolActionUseCase$invoke$12.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = runDevToolActionUseCase$invoke$12.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            runDevToolActionUseCase$invoke$12.L$0 = access15400.onNavigationEvent(str);
            runDevToolActionUseCase$invoke$12.L$1 = map;
            runDevToolActionUseCase$invoke$12.label = 1;
            str2 = str;
            Object objIAuthTabCallback = IAuthTabCallback(str2, runDevToolActionUseCase$invoke$12);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                int i6 = IAuthTabCallbackStub + 19;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 3 / 5;
                }
                return objOnWarmupCompleted;
            }
            map2 = map;
            obj = objIAuthTabCallback;
        } else {
            if (i5 != 1) {
                int i8 = IAuthTabCallbackStub + 123;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0 ? i5 != 2 : i5 != 4) {
                    Object[] objArr = new Object[1];
                    a(ViewConfiguration.getScrollBarSize() >> 8, Color.red(0) + 47, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                Object obj2 = runDevToolActionUseCase$invoke$12.L$2;
                ResultKt.onNavigationEvent(obj);
                Unit unit = Unit.INSTANCE;
                int i9 = IAuthTabCallbackStub + 79;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                return unit;
            }
            Map<String, ? extends List<String>> map3 = (Map) runDevToolActionUseCase$invoke$12.L$1;
            String str3 = (String) runDevToolActionUseCase$invoke$12.L$0;
            ResultKt.onNavigationEvent(obj);
            map2 = map3;
            str2 = str3;
        }
        if (obj != null) {
            try {
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1404304175);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13, 11119 - View.combineMeasuredStates(0, 0), 1660093887, false, "onNavigationEvent", new Class[0]);
                }
                Object objInvoke = ((Method) objOnExtraCallback).invoke(obj, null);
                runDevToolActionUseCase$invoke$12.L$0 = access15400.onNavigationEvent(str2);
                runDevToolActionUseCase$invoke$12.L$1 = access15400.onNavigationEvent(map2);
                runDevToolActionUseCase$invoke$12.L$2 = access15400.onNavigationEvent(obj);
                runDevToolActionUseCase$invoke$12.I$0 = 0;
                runDevToolActionUseCase$invoke$12.label = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        Unit unit2 = Unit.INSTANCE;
        int i92 = IAuthTabCallbackStub + 79;
        onExtraCallbackWithResult = i92 % 128;
        int i102 = i92 % 2;
        return unit2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0207, code lost:
    
        if (r11 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0209, code lost:
    
        r0 = new java.lang.Object[]{r11, r3, r5};
        r3 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(694934829);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0214, code lost:
    
        if (r3 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0216, code lost:
    
        r3 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.View.resolveSizeAndState(0, 0, 0) + 13, (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 11118, 405480381, false, (java.lang.String) null, new java.lang.Class[]{(java.lang.Class) o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (android.widget.ExpandableListView.getPackedPositionType(0) + 33478), android.graphics.Color.red(0) + 21, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10882), java.lang.String.class, java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x026c, code lost:
    
        return ((java.lang.reflect.Constructor) r3).newInstance(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x026d, code lost:
    
        r9 = null;
        r12 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull String str, @NotNull access13800<? super Object> access13800Var) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        RunDevToolActionUseCase$resolve$1 runDevToolActionUseCase$resolve$1;
        String str2;
        Object next;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof RunDevToolActionUseCase$resolve$1) {
            runDevToolActionUseCase$resolve$1 = (RunDevToolActionUseCase$resolve$1) access13800Var;
            int i4 = runDevToolActionUseCase$resolve$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = IAuthTabCallbackStub + 39;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    runDevToolActionUseCase$resolve$1.label = i4 % Integer.MIN_VALUE;
                } else {
                    runDevToolActionUseCase$resolve$1.label = i4 - 2147483648;
                }
            } else {
                runDevToolActionUseCase$resolve$1 = new RunDevToolActionUseCase$resolve$1(this, access13800Var);
            }
        }
        Object objOnExtraCallback = runDevToolActionUseCase$resolve$1.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = runDevToolActionUseCase$resolve$1.label;
        Throwable th = null;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            RunDevToolActionUseCase$resolve$actions$1 runDevToolActionUseCase$resolve$actions$1 = new RunDevToolActionUseCase$resolve$actions$1(this, null);
            runDevToolActionUseCase$resolve$1.L$0 = str;
            runDevToolActionUseCase$resolve$1.label = 1;
            objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, runDevToolActionUseCase$resolve$actions$1, runDevToolActionUseCase$resolve$1);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                int i7 = onExtraCallbackWithResult + 107;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 != 0) {
                    return objOnWarmupCompleted;
                }
                th.hashCode();
                throw null;
            }
            str2 = str;
        } else {
            if (i6 != 1) {
                Object[] objArr = new Object[1];
                a(ViewConfiguration.getWindowTouchSlop() >> 8, TextUtils.indexOf("", "", 0, 0) + 47, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i8 = onExtraCallbackWithResult + 117;
            IAuthTabCallbackStub = i8 % 128;
            if (i8 % 2 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                th.hashCode();
                throw null;
            }
            str2 = (String) runDevToolActionUseCase$resolve$1.L$0;
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        List list = (List) objOnExtraCallback;
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1959995684);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 60357), View.resolveSizeAndState(0, 0, 0) + 10, 10821 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1167316916, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback2).get(null);
        try {
            Object[] objArr2 = {str2};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1293504097);
            long j = 0;
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 60309), (ViewConfiguration.getWindowTouchSlop() >> 8) + 10, 10821 - ExpandableListView.getPackedPositionGroup(0L), -2086252785, false, "onExtraCallback", new Class[]{String.class});
            }
            Iterator it = ((Iterable) ((Method) objOnExtraCallback3).invoke(obj, objArr2)).iterator();
            int i9 = onExtraCallbackWithResult + 15;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            while (!(!it.hasNext())) {
                String str3 = (String) it.next();
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    int i11 = IAuthTabCallbackStub + 79;
                    onExtraCallbackWithResult = i11 % 128;
                    if (i11 % 2 != 0) {
                        Object next2 = it2.next();
                        Object[] objArr3 = {str3};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-716596582);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (33478 - (ViewConfiguration.getEdgeSlop() >> 16)), TextUtils.getOffsetAfter("", 0) + 21, 10882 - Gravity.getAbsoluteGravity(0, 0), -469146614, false, "IAuthTabCallback", new Class[]{String.class});
                        }
                        ((Boolean) ((Method) objOnExtraCallback4).invoke(next2, objArr3)).booleanValue();
                        th.hashCode();
                        throw th;
                    }
                    next = it2.next();
                    Object[] objArr4 = {str3};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-716596582);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (33478 - View.MeasureSpec.makeMeasureSpec(0, 0)), 22 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), 10882 - View.resolveSizeAndState(0, 0, 0), -469146614, false, "IAuthTabCallback", new Class[]{String.class});
                    }
                    if (((Boolean) ((Method) objOnExtraCallback5).invoke(next, objArr4)).booleanValue()) {
                        int i12 = IAuthTabCallbackStub + 121;
                        onExtraCallbackWithResult = i12 % 128;
                        int i13 = i12 % 2;
                        break;
                    }
                    th = null;
                    j = 0;
                }
            }
            return th;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object onExtraCallback$5a2aa680(RunDevToolActionUseCase runDevToolActionUseCase, Object obj, Map map, Object obj2, access13800 access13800Var, int i, Object obj3) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 45;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 77;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 == 0) {
                access8100.onNavigationEvent();
                throw null;
            }
            map = access8100.onNavigationEvent();
        }
        if ((i & 4) != 0) {
            obj2 = null;
        }
        Object objOnNavigationEvent$1a5f36f3 = runDevToolActionUseCase.onNavigationEvent$1a5f36f3(obj, map, obj2, access13800Var);
        int i7 = onExtraCallbackWithResult + 59;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        return objOnNavigationEvent$1a5f36f3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0152, code lost:
    
        if (((java.lang.reflect.Method) r4).invoke(r0, r2) == r5) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent$1a5f36f3(@NotNull Object obj, @NotNull Map<String, ? extends List<String>> map, @Nullable Object obj2, @NotNull access13800<? super Unit> access13800Var) {
        RunDevToolActionUseCase$invoke$3 runDevToolActionUseCase$invoke$3;
        Object obj3;
        Map<String, ? extends List<String>> map2;
        Object obj4;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 37;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (access13800Var instanceof RunDevToolActionUseCase$invoke$3) {
            int i5 = i2 + 85;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = ((RunDevToolActionUseCase$invoke$3) access13800Var).label;
                throw null;
            }
            runDevToolActionUseCase$invoke$3 = (RunDevToolActionUseCase$invoke$3) access13800Var;
            int i7 = runDevToolActionUseCase$invoke$3.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                int i8 = onExtraCallbackWithResult + 109;
                IAuthTabCallbackStub = i8 % 128;
                int i9 = i8 % 2;
                runDevToolActionUseCase$invoke$3.label = i7 - 2147483648;
            } else {
                runDevToolActionUseCase$invoke$3 = new RunDevToolActionUseCase$invoke$3(this, access13800Var);
            }
        }
        Object obj5 = runDevToolActionUseCase$invoke$3.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i10 = runDevToolActionUseCase$invoke$3.label;
        try {
            if (i10 == 0) {
                ResultKt.onNavigationEvent(obj5);
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                RunDevToolActionUseCase$invoke$4 runDevToolActionUseCase$invoke$4 = new RunDevToolActionUseCase$invoke$4(this, obj, null);
                runDevToolActionUseCase$invoke$3.L$0 = obj;
                runDevToolActionUseCase$invoke$3.L$1 = map;
                obj3 = obj2;
                runDevToolActionUseCase$invoke$3.L$2 = obj3;
                runDevToolActionUseCase$invoke$3.label = 1;
                if (maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, runDevToolActionUseCase$invoke$4, runDevToolActionUseCase$invoke$3) != objOnWarmupCompleted) {
                    map2 = map;
                    obj4 = obj;
                }
                int i11 = IAuthTabCallbackStub + 75;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 == 0) {
                    return objOnWarmupCompleted;
                }
                throw null;
            }
            int i12 = onExtraCallbackWithResult + 93;
            IAuthTabCallbackStub = i12 % 128;
            if (i12 % 2 != 0 ? i10 != 1 : i10 != 0) {
                if (i10 != 2) {
                    Object[] objArr = new Object[1];
                    a(ViewConfiguration.getMinimumFlingVelocity() >> 16, 46 - TextUtils.lastIndexOf("", '0'), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                Object obj6 = runDevToolActionUseCase$invoke$3.L$3;
                Object obj7 = runDevToolActionUseCase$invoke$3.L$2;
                Object obj8 = runDevToolActionUseCase$invoke$3.L$0;
                ResultKt.onNavigationEvent(obj5);
                int i13 = onExtraCallbackWithResult + 63;
                IAuthTabCallbackStub = i13 % 128;
                int i14 = i13 % 2;
                return Unit.INSTANCE;
            }
            Object obj9 = runDevToolActionUseCase$invoke$3.L$2;
            map2 = (Map) runDevToolActionUseCase$invoke$3.L$1;
            obj4 = runDevToolActionUseCase$invoke$3.L$0;
            ResultKt.onNavigationEvent(obj5);
            obj3 = obj9;
            Object[] objArr2 = {obj4, map2, runDevToolActionUseCase$invoke$3};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1927564744);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 9 - View.resolveSizeAndState(0, 0, 0), 10766 - TextUtils.indexOf((CharSequence) "", '0'), -1134867288, false, "onExtraCallback", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((-16743738) - Color.rgb(0, 0, 0)), 20 - MotionEvent.axisFromString(""), Drawable.resolveOpacity(0, 0) + 10882), Map.class, access13800.class});
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        Object obj10 = obj3 == null ? this.IAuthTabCallback : obj3;
        runDevToolActionUseCase$invoke$3.L$0 = access15400.onNavigationEvent(obj4);
        runDevToolActionUseCase$invoke$3.L$1 = access15400.onNavigationEvent(map2);
        runDevToolActionUseCase$invoke$3.L$2 = access15400.onNavigationEvent(obj3);
        runDevToolActionUseCase$invoke$3.L$3 = access15400.onNavigationEvent(obj10);
        runDevToolActionUseCase$invoke$3.label = 2;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 17;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 59697), 16 - Process.getGidForName(""), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 46134), 31 - Color.argb(0, 0, 0, 0), TextUtils.indexOf((CharSequence) "", '0') + 20221, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    char cResolveOpacity = (char) (49123 - Drawable.resolveOpacity(0, 0));
                    int bitsPerPixel = 43 - ImageFormat.getBitsPerPixel(0);
                    int i7 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1493;
                    byte b = (byte) ($$a[0] - 1);
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveOpacity, bitsPerPixel, i7, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i8 = $11 + 63;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    char trimmedLength = (char) (49123 - TextUtils.getTrimmedLength(""));
                    int trimmedLength2 = TextUtils.getTrimmedLength("") + 44;
                    int defaultSize = View.getDefaultSize(0, 0) + 1494;
                    byte b3 = (byte) ($$a[0] - 1);
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(trimmedLength, trimmedLength2, defaultSize, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }
}
