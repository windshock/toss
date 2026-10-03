package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.CollectPerformancePoint;
import o.GeckoHubImp;
import o.deserializeIp;
import o.verifyHASH;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.util.RetryWithDelay;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class verifyHASH {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final verifyHASH onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static final Map<generateHASHFile, Long> onWarmupCompleted;

    static final class onExtraCallback extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return verifyHASH.this.onExtraCallbackWithResult((List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>) null, (access13800<? super List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>>) this);
        }
    }

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[generateHASHFile.values().length];
            try {
                iArr[generateHASHFile.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[generateHASHFile.BANK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[generateHASHFile.TOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[queryTabBarInfo.values().length];
            try {
                iArr2[queryTabBarInfo.TOSS_FAMILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[queryTabBarInfo.OPEN_BANKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[queryTabBarInfo.MYDATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            onExtraCallbackWithResult = iArr2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        CollectPerformancePoint collectPerformancePoint = (CollectPerformancePoint) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(zBooleanValue, collectPerformancePoint);
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        int i5 = IAuthTabCallbackStub + 71;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        extraCallback(function1, obj);
        int i4 = IAuthTabCallbackStub + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
    }

    public static /* synthetic */ List IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        List listAccess100 = access100(function1, obj);
        int i4 = IAuthTabCallbackStub + 51;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return listAccess100;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        String str = (String) objArr[1];
        List list = (List) objArr[2];
        CollectPerformancePoint collectPerformancePoint = (CollectPerformancePoint) objArr[3];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipIAuthTabCallback = IAuthTabCallback(zBooleanValue, str, list, collectPerformancePoint);
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return deserializeipIAuthTabCallback;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback(function1, obj);
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        int i5 = onNavigationEvent + 123;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(function1, obj);
        int i4 = IAuthTabCallbackStub + 51;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return deserializeipIAuthTabCallbackStubProxy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ deserializeIp asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipAccess000 = access000(function1, obj);
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        return deserializeipAccess000;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getInterfaceDescriptor(function1, obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 81;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final List onExtraCallback(List list, List list2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list2, "");
        int i4 = onNavigationEvent + 19;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ List onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback_Parcel(function1, obj);
        }
        IAuthTabCallback_Parcel(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        List list = (List) objArr[0];
        List list2 = (List) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list2, "");
        int i4 = IAuthTabCallbackStub + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public static /* synthetic */ List onExtraCallbackWithResult(List list, List list2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(list, list2);
            throw null;
        }
        List listOnExtraCallback = onExtraCallback(list, list2);
        int i3 = onNavigationEvent + 95;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return listOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(th);
        int i4 = onNavigationEvent + 115;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CollectPerformancePoint collectPerformancePoint) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(collectPerformancePoint);
        int i4 = onNavigationEvent + 33;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ deserializeIp onExtraCallbackWithResult(boolean z, String str, List list, CollectPerformancePoint collectPerformancePoint) {
        deserializeIp deserializeip;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (i3 == 0) {
            deserializeip = (deserializeIp) onWarmupCompleted(-1858538596, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1858538599, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{boolValueOf, str, list, collectPerformancePoint});
            int i4 = 43 / 0;
        } else {
            deserializeip = (deserializeIp) onWarmupCompleted(-1858538596, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1858538599, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{boolValueOf, str, list, collectPerformancePoint});
        }
        int i5 = onNavigationEvent + 21;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return deserializeip;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        readTypedObject(function1, obj);
        int i4 = IAuthTabCallbackStub + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(th);
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult(function1, obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 51;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws Throwable {
        int i7 = ~i5;
        int i8 = (~(i7 | i2)) | i;
        int i9 = (~(i7 | (~i2))) | (~((~i) | i7)) | (~(i | i5 | i2));
        int i10 = ~(i2 | i);
        int i11 = i + i5 + i3 + ((-813770285) * i4) + (135932771 * i6);
        int i12 = i11 * i11;
        int i13 = (526900465 * i) + 74317824 + ((-1745228167) * i5) + ((-249289968) * i8) + (2022838664 * i9) + ((-2022838664) * i10) + (277610496 * i3) + (1331953664 * i4) + ((-366739456) * i6) + ((-1308753920) * i12);
        int i14 = (i * 1149714451) + 247108311 + (i5 * 1149714091) + (i8 * (-720)) + (i9 * (-360)) + (i10 * 360) + (i3 * 1149713731) + (i4 * 1918847289) + (i6 * (-2006650391)) + (i12 * 460980224);
        switch (i13 + (i14 * i14 * (-1418592256))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return IAuthTabCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                Function1 function1 = (Function1) objArr[0];
                Object obj = objArr[1];
                int i15 = 2 % 2;
                int i16 = IAuthTabCallbackStub + 37;
                onNavigationEvent = i16 % 128;
                int i17 = i16 % 2;
                onWarmupCompleted(1753848509, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -1753848509, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{function1, obj});
                int i18 = onNavigationEvent + 27;
                IAuthTabCallbackStub = i18 % 128;
                int i19 = i18 % 2;
                return null;
            case 6:
                return asBinder(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return onTransact(objArr);
            case 10:
                Throwable th = (Throwable) objArr[0];
                int i20 = 2 % 2;
                int i21 = IAuthTabCallbackStub + 113;
                onNavigationEvent = i21 % 128;
                int i22 = i21 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(th);
                int i23 = onNavigationEvent + 59;
                IAuthTabCallbackStub = i23 % 128;
                int i24 = i23 % 2;
                return unitIAuthTabCallback;
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ List onWarmupCompleted(List list, List list2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        List list3 = (List) onWarmupCompleted(1752060153, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -1752060149, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{list, list2});
        int i4 = IAuthTabCallbackStub + 63;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return list3;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, Pair pair) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(z, pair);
        }
        onExtraCallbackWithResult(z, pair);
        throw null;
    }

    private verifyHASH() {
    }

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new char[]{52952, 55037, 65268, 34531, 44784, 46804, 24263, 26363, 3800, 5832, 16060, 50841, 61100, 63148, 40602, 42647, 20108, 22172}, 6151 - Drawable.resolveOpacity(0, 0), objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        onExtraCallback = new verifyHASH();
        onWarmupCompleted = new LinkedHashMap();
        int i = IAuthTabCallbackDefault + 123;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends KeyBoardVisiblePoint>>, Object> {
        final /* synthetic */ List<KeyBoardVisiblePoint> $accounts;
        final /* synthetic */ List<TabBarInfoQueryPointOnTabBarInfoQueryListener> $bankAccounts;
        final /* synthetic */ List<onDisclaimerClick> $tossAccounts;
        private /* synthetic */ Object L$0;
        int label;
        private static final byte[] $$a = {15, -112, -70, -94};
        private static final int $$b = 218;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onWarmupCompleted = 0;
        private static int onExtraCallback = 1;
        private static long onExtraCallbackWithResult = 7798559133331975163L;
        private static int onNavigationEvent = -1776194565;
        private static char IAuthTabCallback = 50749;

        private static String $$c(byte b, int i, short s) {
            byte[] bArr = $$a;
            int i2 = 110 - i;
            int i3 = (b * 4) + 4;
            int i4 = s * 2;
            byte[] bArr2 = new byte[i4 + 1];
            int i5 = -1;
            if (bArr == null) {
                i3++;
                i2 = i3 + (-i4);
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i2;
                if (i5 == i4) {
                    return new String(bArr2, 0);
                }
                i3++;
                i2 += -bArr[i3];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(List<? extends KeyBoardVisiblePoint> list, List<? extends onDisclaimerClick> list2, List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list3, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$accounts = list;
            this.$tossAccounts = list2;
            this.$bankAccounts = list3;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$accounts, this.$tossAccounts, this.$bankAccounts, access13800Var);
            onnavigationevent.L$0 = obj;
            int i2 = onExtraCallback + 115;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super List<? extends KeyBoardVisiblePoint>> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = 53 / 0;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super List<? extends KeyBoardVisiblePoint>> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onnavigationeventCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(unit);
            int i4 = onWarmupCompleted + 93;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends onDisclaimerClick>>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallbackDefault = 1;
            private static int onExtraCallback;
            final /* synthetic */ List<onDisclaimerClick> $tossAccounts;
            int label;
            private static char[] IAuthTabCallback = {32629, 32631, 32620, 32560, 32612, 32609, 32553, 32614, 32619, 32613, 32411, 32611, 32630, 32618, 32623, 32610, 32410, 32621, 32409, 32616};
            private static int onWarmupCompleted = -1184334064;
            private static boolean onNavigationEvent = true;
            private static boolean onExtraCallbackWithResult = true;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(List<? extends onDisclaimerClick> list, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
                this.$tossAccounts = list;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$tossAccounts, access13800Var);
                int i2 = IAuthTabCallbackDefault + 47;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return onextracallbackwithresult;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallback + 45;
                IAuthTabCallbackDefault = i2 % 128;
                Object obj3 = null;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super List<? extends onDisclaimerClick>> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    onWarmupCompleted(findresandmsg, access13800Var);
                    obj3.hashCode();
                    throw null;
                }
                Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
                int i3 = onExtraCallback + 95;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 != 0) {
                    return objOnWarmupCompleted;
                }
                obj3.hashCode();
                throw null;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super List<? extends onDisclaimerClick>> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 41;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallbackDefault + 57;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallback + 115;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 == 0) {
                    access14300.onWarmupCompleted();
                    throw null;
                }
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ResultKt.onNavigationEvent(obj);
                        return obj;
                    }
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{-119, -112, -113, -123, -117, -122, -120, -122, -127, -124, -108, -123, -113, -109, -124, -121, -119, -110, -122, -111, -112, -113, -121, -124, -119, -120, -122, -114, -119, -115, -124, -121, -119, -116, -117, -118, -119, -120, -121, -124, -122, -123, -124, -125, -125, -126, -127}, KeyEvent.normalizeMetaState(0) + 127, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
                verifyHASH verifyhash = verifyHASH.onExtraCallback;
                List<onDisclaimerClick> list = this.$tossAccounts;
                this.label = 1;
                Object objOnWarmupCompleted2 = verifyHASH.onWarmupCompleted(661252527, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -661252518, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{verifyhash, list, this});
                if (objOnWarmupCompleted2 != objOnWarmupCompleted) {
                    return objOnWarmupCompleted2;
                }
                int i4 = onExtraCallback + 13;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }

            private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2;
                int i3 = 2 % 2;
                DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
                char[] cArr2 = IAuthTabCallback;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i4 = 0;
                    while (i4 < length) {
                        int i5 = $10 + 61;
                        $11 = i5 % 128;
                        int i6 = i5 % i2;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.indexOf("", "") + 77, (Process.myTid() >> 22) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                            }
                            cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            i4++;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                try {
                    Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), KeyEvent.keyCodeFromString("") + 75, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    float f = 0.0f;
                    if (onExtraCallbackWithResult) {
                        int i7 = $11 + 5;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                        char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getTouchSlop() >> 8) + 63, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        }
                        String str = new String(cArr4);
                        int i9 = $11 + 11;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        objArr[0] = str;
                        return;
                    }
                    if (!onNavigationEvent) {
                        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                        char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                            cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                        }
                        objArr[0] = new String(cArr5);
                        return;
                    }
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                    char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    int i11 = $10 + 109;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i13 = $10 + 39;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        try {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 62, 12214 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback4).invoke(null, objArr5);
                            f = 0.0f;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    String str2 = new String(cArr6);
                    int i15 = $11 + 45;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    objArr[0] = str2;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }

        /* renamed from: o.verifyHASH$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        static final class C0017onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;
            private static char[] onWarmupCompleted = {27145, 27356, 27354, 27353, 27347, 27349, 27351, 27351, 27356, 27172, 27171, 27353, 27353, 27351, 27194, 27138, 27169, 27359, 27352, 27349, 27349, 27354, 27199, 27138, 27173, 27354, 27351, 27357, 27328, 27330, 27172, 27138, 27169, 27356, 27348, 27347, 27355, 27354, 27195, 27138, 27198, 27348, 27197, 27169, 27355, 27329, 27333};
            final /* synthetic */ List<TabBarInfoQueryPointOnTabBarInfoQueryListener> $bankAccounts;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0017onNavigationEvent(List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list, access13800<? super C0017onNavigationEvent> access13800Var) {
                super(2, access13800Var);
                this.$bankAccounts = list;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                C0017onNavigationEvent c0017onNavigationEvent = new C0017onNavigationEvent(this.$bankAccounts, access13800Var);
                int i2 = onNavigationEvent + 15;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return c0017onNavigationEvent;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 97;
                onNavigationEvent = i2 % 128;
                Object obj3 = null;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    onExtraCallback(findresandmsg, access13800Var);
                    obj3.hashCode();
                    throw null;
                }
                Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i3 = onNavigationEvent + 57;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return objOnExtraCallback;
                }
                obj3.hashCode();
                throw null;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 87;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                C0017onNavigationEvent c0017onNavigationEventCreate = create(findresandmsg, access13800Var);
                if (i3 == 0) {
                    return c0017onNavigationEventCreate.invokeSuspend(Unit.INSTANCE);
                }
                int i4 = 75 / 0;
                return c0017onNavigationEventCreate.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallback + 11;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    verifyHASH verifyhash = verifyHASH.onExtraCallback;
                    List<TabBarInfoQueryPointOnTabBarInfoQueryListener> list = this.$bankAccounts;
                    this.label = 1;
                    Object objOnExtraCallbackWithResult = verifyhash.onExtraCallbackWithResult((List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>) list, (access13800<? super List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>>) this);
                    return objOnExtraCallbackWithResult == objOnWarmupCompleted ? objOnWarmupCompleted : objOnExtraCallbackWithResult;
                }
                int i5 = onNavigationEvent + 53;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 0) {
                    Object[] objArr = new Object[1];
                    a(new int[]{0, 47, 41, 0}, true, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0}, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
                int i6 = onNavigationEvent + 51;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return obj;
            }

            private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                int i = 2 % 2;
                TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                char[] cArr = onWarmupCompleted;
                char c = '0';
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i6 = 0;
                    while (i6 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - TextUtils.lastIndexOf("", c, 0)), TextUtils.getTrimmedLength("") + 35, 14239 - Color.green(0), -884206168, false, "t", new Class[]{Integer.TYPE});
                            }
                            cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            i6++;
                            c = '0';
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
                    int i7 = $10 + 3;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    char c2 = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                        if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                            int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 10935), KeyEvent.getDeadChar(0, 0) + 65, 16718 - (ViewConfiguration.getTouchSlop() >> 8), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        } else {
                            int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Color.rgb(0, 0, 0) + 16777245, TextUtils.getOffsetAfter("", 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        }
                        c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                        Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - View.MeasureSpec.makeMeasureSpec(0, 0)), 69 - TextUtils.lastIndexOf("", '0'), 12486 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                    cArr3 = cArr4;
                }
                if (i5 > 0) {
                    int i11 = $10 + 91;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        char[] cArr5 = new char[i3];
                        System.arraycopy(cArr3, 1, cArr5, 1, i3);
                        System.arraycopy(cArr5, 0, cArr3, i3 % i5, i5);
                        System.arraycopy(cArr5, i5, cArr3, 0, i3 >>> i5);
                    } else {
                        char[] cArr6 = new char[i3];
                        System.arraycopy(cArr3, 0, cArr6, 0, i3);
                        int i12 = i3 - i5;
                        System.arraycopy(cArr6, 0, cArr3, i12, i5);
                        System.arraycopy(cArr6, i5, cArr3, 0, i12);
                    }
                }
                if (z) {
                    char[] cArr7 = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                        int i13 = $11 + 15;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                        trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    }
                    cArr3 = cArr7;
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
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object next;
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback + 51;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                    Object[] objArr = new Object[1];
                    a((char) View.resolveSizeAndState(0, 0, 0), (-1395344871) - View.getDefaultSize(0, 0), new char[]{57892, 21938, 5826, 10008, 13814, 18242, 2045, 23484, 31305, 61759, 32528, 3158, 48056, 32846, 52499, 3050, 23783, 62786, 54795, 48069, 36850, 8842, 64117, 46331, 62836, 47259, 16842, 10057, 24415, 55989, 1782, 54946, 37825, 30090, 18503, 32064, 16472, 1944, 43173, 49697, 56679, 53989, 27023, 7214, 14284, 60219, 19043}, new char[]{0, 0, 0, 0}, new char[]{6509, 54458, 8364, 13439}, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                List listListOf = CollectionsKt.listOf(new GeckoHubImp1[]{maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(this.$tossAccounts, null), 3, (Object) null), maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new C0017onNavigationEvent(this.$bankAccounts, null), 3, (Object) null)});
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.label = 1;
                obj = ResourceCallback.IAuthTabCallback(listListOf, this);
                if (obj == objOnWarmupCompleted) {
                    int i4 = onExtraCallback + 55;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            }
            List listFlatten = CollectionsKt.flatten((Iterable) obj);
            List<KeyBoardVisiblePoint> list = this.$accounts;
            for (KeyBoardVisiblePoint keyBoardVisiblePoint : list) {
                Iterator it = listFlatten.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(keyBoardVisiblePoint.onExtraCallbackWithResult(), ((KeyBoardVisiblePoint) next).onExtraCallbackWithResult())) {
                        break;
                    }
                }
                KeyBoardVisiblePoint keyBoardVisiblePoint2 = (KeyBoardVisiblePoint) next;
                if (keyBoardVisiblePoint2 != null) {
                    int i6 = onExtraCallback + 99;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    keyBoardVisiblePoint.IAuthTabCallback(keyBoardVisiblePoint2.onTransact());
                }
            }
            return list;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            int i5 = $10 + 25;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i7 = $11 + 25;
                $10 = i7 % 128;
                int i8 = i7 % i3;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 44 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1450 - TextUtils.indexOf((CharSequence) "", '0'), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 49123), 44 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1494 - TextUtils.getOffsetAfter("", 0), 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 50 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 22938, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        i2 = 2;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 45848), 30 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 12577 - ((Process.getThreadPriority(0) + 20) >> 6), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    } else {
                        i2 = 2;
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    i3 = i2;
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
    }

    public final Object onNavigationEvent(@NotNull List<? extends KeyBoardVisiblePoint> list, @NotNull access13800<? super List<? extends KeyBoardVisiblePoint>> access13800Var) {
        int i = 2 % 2;
        List<? extends KeyBoardVisiblePoint> list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener) {
                        arrayList2.add(obj2);
                    }
                }
                Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(new onNavigationEvent(list, arrayList, arrayList2, null), access13800Var);
                int i2 = onNavigationEvent + 43;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                return objOnExtraCallbackWithResult;
            }
            Object next = it.next();
            if (next instanceof onDisclaimerClick) {
                int i4 = IAuthTabCallbackStub + 49;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    arrayList.add(next);
                    obj.hashCode();
                    throw null;
                }
                arrayList.add(next);
                int i5 = IAuthTabCallbackStub + 123;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        List list = (List) objArr[1];
        access13800 access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        if (list.isEmpty()) {
            int i2 = IAuthTabCallbackStub + 19;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return CollectionsKt.emptyList();
            }
            CollectionsKt.emptyList();
            throw null;
        }
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onWarmupCompleted(null), access13800Var);
        int i3 = IAuthTabCallbackStub + 39;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 96 / 0;
        }
        return objOnExtraCallback;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends onDisclaimerClick>>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int[] onNavigationEvent = {-1843986707, -2062016216, -665520579, -887388276, -1835911672, -1693769771, 1819123356, 1713822840, 889932673, 178243901, 1755893109, -958456066, 1219422425, -32774673, -927649881, -1659379902, 806055786, -1577841728};
        int I$0;
        int I$1;
        Object L$0;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var);
            int i2 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super List<? extends onDisclaimerClick>> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 1;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 != 0) {
                    int i3 = IAuthTabCallback + 97;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                        Object[] objArr = new Object[1];
                        a(new int[]{-468027497, -1944038422, -1957187497, 1012134419, 376928969, 997001790, -910083586, 229377454, 2023790802, -1252241462, -2138362798, 1721317464, -632153876, 1489528808, 394451445, -1582052707, -1295514313, 2004459571, 996451946, 236602648, -1008224355, -900676302, -1444303645, -1371522452}, 47 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
                        throw new IllegalStateException(((String) objArr[0]).intern());
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    Result.Companion companion = Result.Companion;
                    writeRaw writerawOnExtraCallbackWithResult = PageShowPoint.Companion.onExtraCallbackWithResult(PageStartedPoint.TOSS_ACCOUNT);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = RxAwaitKt.onWarmupCompleted(writerawOnExtraCallbackWithResult, this);
                    if (obj == objOnWarmupCompleted) {
                        int i4 = onExtraCallbackWithResult + 77;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            return objOnWarmupCompleted;
                        }
                        throw null;
                    }
                }
                obj2 = Result.constructor-impl(((CollectPerformancePoint) obj).onWarmupCompleted());
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            return Result.exceptionOrNull-impl(obj2) != null ? CollectionsKt.emptyList() : obj2;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onNavigationEvent;
            char c = '0';
            int i4 = -1469660336;
            int i5 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $10 + 115;
                    $11 = i7 % 128;
                    if (i7 % i2 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", c, 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 72, 8848 - TextUtils.getTrimmedLength(""), -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(iArr2[i6])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 72 - Drawable.resolveOpacity(0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr3[i6] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                            i6++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i2 = 2;
                    c = '0';
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onNavigationEvent;
            if (iArr5 != null) {
                int i8 = $10 + 43;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i10 = 0;
                while (i10 < length3) {
                    int i11 = $10 + 65;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    Object[] objArr4 = new Object[1];
                    objArr4[i5] = Integer.valueOf(iArr5[i10]);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i5) == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', i5) + 73, (ViewConfiguration.getLongPressTimeout() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i10++;
                    i4 = -1469660336;
                    i5 = 0;
                }
                iArr5 = iArr6;
            }
            int i13 = i5;
            System.arraycopy(iArr5, i13, iArr4, i13, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i13;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[i13] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i14 = 0;
                for (int i15 = 16; i14 < i15; i15 = 16) {
                    int i16 = $10 + 99;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 22252), ImageFormat.getBitsPerPixel(0) + 40, ((Process.getThreadPriority(0) + 20) >> 6) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i14 += 86;
                    } else {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                        Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 22252), 39 - View.MeasureSpec.makeMeasureSpec(0, 0), 10301 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                        i14++;
                    }
                }
                int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 4033), TextUtils.indexOf((CharSequence) "", '0') + 79, 7398 - (ViewConfiguration.getScrollBarSize() >> 8), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
                i13 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 117;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0')), 23 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19626, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.MeasureSpec.getSize(0) + 59, TextUtils.lastIndexOf("", '0', 0) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 39;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            try {
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 59, 6382 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x01c6 -> B:40:0x01d2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull java.util.List<? extends o.TabBarInfoQueryPointOnTabBarInfoQueryListener> r23, @org.jetbrains.annotations.NotNull o.access13800<? super java.util.List<? extends o.TabBarInfoQueryPointOnTabBarInfoQueryListener>> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.verifyHASH.onExtraCallbackWithResult(java.util.List, o.access13800):java.lang.Object");
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws NoWhenBranchMatchedException {
        generateHASHFile[] generatehashfileArr;
        verifyHASH verifyhash = (verifyHASH) objArr[0];
        generateHASHFile[] generatehashfileArr2 = (generateHASHFile[]) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0 ? (iIntValue & 1) != 0 : (iIntValue & 1) != 0) {
            int i4 = i3 + 85;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                generatehashfileArr = new generateHASHFile[1];
                generatehashfileArr[1] = generateHASHFile.ALL;
            } else {
                generatehashfileArr = new generateHASHFile[]{generateHASHFile.ALL};
            }
            generatehashfileArr2 = generatehashfileArr;
        }
        if ((iIntValue & 2) != 0) {
            int i5 = onNavigationEvent + 21;
            IAuthTabCallbackStub = i5 % 128;
            zBooleanValue = i5 % 2 == 0;
        }
        verifyhash.onWarmupCompleted(generatehashfileArr2, zBooleanValue, (iIntValue & 4) == 0 ? zBooleanValue2 : true);
        return null;
    }

    private static final boolean IAuthTabCallback(generateHASHFile generatehashfile) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Long l = onWarmupCompleted.get(generatehashfile);
        if (l == null) {
            int i4 = IAuthTabCallbackStub + 57;
            onNavigationEvent = i4 % 128;
            l = i4 % 2 != 0 ? 1L : 0L;
        }
        return zzaj.onWarmupCompleted().IAuthTabCallbackDefault() - l.longValue() > 10000;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onWarmupCompleted(@org.jetbrains.annotations.NotNull o.generateHASHFile[] r8, boolean r9, boolean r10) throws kotlin.NoWhenBranchMatchedException {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            int r1 = r8.length
            r2 = 0
        La:
            if (r2 >= r1) goto L70
            r3 = r8[r2]
            if (r9 != 0) goto L1f
            int r4 = o.verifyHASH.IAuthTabCallbackStub
            int r4 = r4 + 9
            int r5 = r4 % 128
            o.verifyHASH.onNavigationEvent = r5
            int r4 = r4 % r0
            boolean r4 = IAuthTabCallback(r3)
            if (r4 == 0) goto L6d
        L1f:
            java.util.Map<o.generateHASHFile, java.lang.Long> r4 = o.verifyHASH.onWarmupCompleted
            o.zzag r5 = o.zzaj.onWarmupCompleted()
            long r5 = r5.IAuthTabCallbackDefault()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.put(r3, r5)
            int[] r4 = o.verifyHASH.onExtraCallbackWithResult.onNavigationEvent
            int r3 = r3.ordinal()
            r3 = r4[r3]
            r4 = 1
            if (r3 == r4) goto L68
            if (r3 == r0) goto L62
            int r4 = o.verifyHASH.IAuthTabCallbackStub
            int r4 = r4 + 95
            int r5 = r4 % 128
            o.verifyHASH.onNavigationEvent = r5
            int r4 = r4 % 2
            r6 = 3
            if (r4 == 0) goto L4d
            if (r3 != r6) goto L5c
            goto L4f
        L4d:
            if (r3 != r6) goto L5c
        L4f:
            int r5 = r5 + 45
            int r3 = r5 % 128
            o.verifyHASH.IAuthTabCallbackStub = r3
            int r5 = r5 % r0
            o.verifyHASH r3 = o.verifyHASH.onExtraCallback
            r3.onNavigationEvent(r9)
            goto L6d
        L5c:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L62:
            o.verifyHASH r3 = o.verifyHASH.onExtraCallback
            r3.onExtraCallback(r10)
            goto L6d
        L68:
            o.verifyHASH r3 = o.verifyHASH.onExtraCallback
            r3.IAuthTabCallback(r9, r10)
        L6d:
            int r2 = r2 + 1
            goto La
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.verifyHASH.onWarmupCompleted(o.generateHASHFile[], boolean, boolean):void");
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        List list = (List) objArr[1];
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            queryTabBarInfo querytabbarinfoICustomTabsCallbackDefault = ((TabBarInfoQueryPointOnTabBarInfoQueryListener) obj).ICustomTabsCallbackDefault();
            Object arrayList = linkedHashMap.get(querytabbarinfoICustomTabsCallbackDefault);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(querytabbarinfoICustomTabsCallbackDefault, arrayList);
            }
            ((List) arrayList).add(obj);
            int i2 = onNavigationEvent + 29;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                return null;
            }
            int i4 = onNavigationEvent + 71;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                Map.Entry entry = (Map.Entry) it.next();
                obj2.hashCode();
                throw null;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list2 = (List) entry2.getValue();
            queryTabBarInfo querytabbarinfo = (queryTabBarInfo) entry2.getKey();
            int i5 = querytabbarinfo == null ? -1 : onExtraCallbackWithResult.onExtraCallbackWithResult[querytabbarinfo.ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(genSignatureValue.onExtraCallbackWithResult.onNavigationEvent(list2), (String) null, 1, (Object) null);
            }
        }
    }

    private final void IAuthTabCallback(boolean z, final boolean z2) {
        int i = 2 % 2;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallbackStub = disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback.onExtraCallback(z).IAuthTabCallbackStub(RetryWithDelay.Companion.onNavigationEvent());
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.dataprovider.AccountSyncManager$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return verifyHASH.onWarmupCompleted(z2, (Pair) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.dataprovider.AccountSyncManager$$ExternalSyntheticLambda9
            public final void accept(Object obj) {
                verifyHASH.asInterface(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.dataprovider.AccountSyncManager$$ExternalSyntheticLambda10
            public final Object invoke(Object obj) {
                return (Unit) verifyHASH.onWarmupCompleted(1730053442, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -1730053432, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{(Throwable) obj});
            }
        };
        jsonReaderUnknownNumberParsingIAuthTabCallbackStub.onWarmupCompleted(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.dataprovider.AccountSyncManager$$ExternalSyntheticLambda11
            public final void accept(Object obj) {
                verifyHASH.onTransact(function12, obj);
            }
        });
        int i2 = IAuthTabCallbackStub + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final void getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStub + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void extraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStub + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
    }

    private static final Unit onExtraCallbackWithResult(boolean z, Pair pair) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (z) {
            onWarmupCompleted(-2053299224, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 2053299226, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{onExtraCallback, ((CollectPerformancePoint) pair.getSecond()).onNavigationEvent()});
            int i3 = IAuthTabCallbackStub + 113;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr = new Object[1];
        a(new char[]{52952, 55037, 65268, 34531, 44784, 46804, 24263, 26363, 3800, 5832, 16060, 50841, 61100, 63148, 40602, 42647, 20108, 22172}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6151, objArr);
        convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr[0]).intern(), th);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void ICustomTabsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onNavigationEvent + 111;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallback(final boolean z) {
        int i = 2 % 2;
        Object obj = null;
        Object[] objArr = {disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback, false, 1, null};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallbackStub = ((JsonReaderUnknownNumberParsing) disableOldAndroidAttachmentMetricsWorkarounds.onExtraCallback(-502500694, objArr, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 502500696, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).IAuthTabCallbackStub(RetryWithDelay.Companion.onNavigationEvent());
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.dataprovider.AccountSyncManager$$ExternalSyntheticLambda12
            public final Object invoke(Object obj2) {
                Boolean boolValueOf = Boolean.valueOf(z);
                return (Unit) verifyHASH.onWarmupCompleted(-1737466165, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1737466166, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{boolValueOf, (CollectPerformancePoint) obj2});
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.dataprovider.AccountSyncManager$$ExternalSyntheticLambda13
            public final void accept(Object obj2) {
                verifyHASH.IAuthTabCallbackStub(function1, obj2);
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.dataprovider.AccountSyncManager$$ExternalSyntheticLambda14
            public final Object invoke(Object obj2) {
                return verifyHASH.onNavigationEvent((Throwable) obj2);
            }
        };
        jsonReaderUnknownNumberParsingIAuthTabCallbackStub.onWarmupCompleted(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.dataprovider.AccountSyncManager$$ExternalSyntheticLambda15
            public final void accept(Object obj2) {
                verifyHASH.IAuthTabCallback(function12, obj2);
            }
        });
        int i2 = onNavigationEvent + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final void extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 115;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onNavigationEvent(boolean z, CollectPerformancePoint collectPerformancePoint) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            collectPerformancePoint.onNavigationEvent();
            obj.hashCode();
            throw null;
        }
        List listOnNavigationEvent = collectPerformancePoint.onNavigationEvent();
        if (z) {
            onWarmupCompleted(-2053299224, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 2053299226, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{onExtraCallback, listOnNavigationEvent});
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 93;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr = new Object[1];
        a(new char[]{52952, 55037, 65268, 34531, 44784, 46804, 24263, 26363, 3800, 5832, 16060, 50841, 61100, 63148, 40602, 42647, 20108, 22172}, 6151 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr[0]).intern(), th);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 95;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void onWarmupCompleted(verifyHASH verifyhash, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 37;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            int i5 = i4 + 113;
            onNavigationEvent = i5 % 128;
            z = i5 % 2 != 0;
        }
        verifyhash.onNavigationEvent(z);
    }

    private static final Unit onExtraCallback(CollectPerformancePoint collectPerformancePoint) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 81;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 46 / 0;
        }
        return unit2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 15;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private static final void readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStub + 47;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallbackStub = disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback.onWarmupCompleted(z).IAuthTabCallbackStub(RetryWithDelay.Companion.onNavigationEvent());
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.dataprovider.AccountSyncManager$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return verifyHASH.onExtraCallbackWithResult((CollectPerformancePoint) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.dataprovider.AccountSyncManager$$ExternalSyntheticLambda3
            public final void accept(Object obj) throws Throwable {
                verifyHASH.onWarmupCompleted(492686329, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -492686324, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{function1, obj});
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.dataprovider.AccountSyncManager$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return verifyHASH.onExtraCallbackWithResult((Throwable) obj);
            }
        };
        jsonReaderUnknownNumberParsingIAuthTabCallbackStub.onWarmupCompleted(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.dataprovider.AccountSyncManager$$ExternalSyntheticLambda5
            public final void accept(Object obj) {
                verifyHASH.onExtraCallbackWithResult(function12, obj);
            }
        });
        int i2 = onNavigationEvent + 25;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr = new Object[1];
        a(new char[]{52952, 55037, 65268, 34531, 44784, 46804, 24263, 26363, 3800, 5832, 16060, 50841, 61100, 63148, 40602, 42647, 20108, 22172}, 6152 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
        convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr[0]).intern(), th);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 63;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public final void onWarmupCompleted(@NotNull TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tabBarInfoQueryPointOnTabBarInfoQueryListener, "");
            onWarmupCompleted(-2053299224, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 2053299226, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this, CollectionsKt.listOf(tabBarInfoQueryPointOnTabBarInfoQueryListener)});
        } else {
            Intrinsics.checkNotNullParameter(tabBarInfoQueryPointOnTabBarInfoQueryListener, "");
            onWarmupCompleted(-2053299224, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 2053299226, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this, CollectionsKt.listOf(tabBarInfoQueryPointOnTabBarInfoQueryListener)});
            throw null;
        }
    }

    private static final deserializeIp access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i3 = onNavigationEvent + 29;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return deserializeip;
    }

    public final writeRaw<List<TabBarInfoQueryPointOnTabBarInfoQueryListener>> onWarmupCompleted(@Nullable final String str, @Nullable final List<String> list, final boolean z) {
        int i = 2 % 2;
        Object[] objArr = {disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback, false, 1, null};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        writeRaw writerawWriteTypedObject = ((JsonReaderUnknownNumberParsing) disableOldAndroidAttachmentMetricsWorkarounds.onExtraCallback(-502500694, objArr, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 502500696, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).IAuthTabCallbackStub(RetryWithDelay.Companion.onNavigationEvent()).writeTypedObject();
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.dataprovider.AccountSyncManager$$ExternalSyntheticLambda18
            public final Object invoke(Object obj) {
                return verifyHASH.onExtraCallbackWithResult(z, str, list, (CollectPerformancePoint) obj);
            }
        };
        writeRaw<List<TabBarInfoQueryPointOnTabBarInfoQueryListener>> writerawOnExtraCallbackWithResult = writerawWriteTypedObject.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.dataprovider.AccountSyncManager$$ExternalSyntheticLambda19
            public final Object apply(Object obj) {
                return verifyHASH.asBinder(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
        int i2 = onNavigationEvent + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return writerawOnExtraCallbackWithResult;
    }

    private static final List IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i4 = IAuthTabCallbackStub + 77;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061 A[PHI: r7 r8
      0x0061: PHI (r7v17 java.lang.Object) = (r7v16 java.lang.Object), (r7v20 java.lang.Object) binds: [B:14:0x005f, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r8v14 o.TabBarInfoQueryPointOnTabBarInfoQueryListener) = (r8v13 o.TabBarInfoQueryPointOnTabBarInfoQueryListener), (r8v20 o.TabBarInfoQueryPointOnTabBarInfoQueryListener) binds: [B:14:0x005f, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070 A[PHI: r7
      0x0070: PHI (r7v19 java.lang.Object) = (r7v16 java.lang.Object), (r7v17 java.lang.Object), (r7v20 java.lang.Object) binds: [B:14:0x005f, B:16:0x0065, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallback(java.lang.Object[] r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.verifyHASH.onExtraCallback(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ writeRaw onWarmupCompleted(verifyHASH verifyhash, String str, List list, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 39;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i8 = onNavigationEvent + 111;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            list = null;
        }
        return verifyhash.onExtraCallbackWithResult(str, list, z);
    }

    private static final deserializeIp IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        deserializeIp deserializeip;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            deserializeip = (deserializeIp) function1.invoke(obj);
            int i3 = 68 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            deserializeip = (deserializeIp) function1.invoke(obj);
        }
        int i4 = onNavigationEvent + 57;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return deserializeip;
    }

    public final writeRaw<List<TabBarInfoQueryPointOnTabBarInfoQueryListener>> onExtraCallbackWithResult(@Nullable final String str, @Nullable final List<String> list, final boolean z) {
        int i = 2 % 2;
        Object[] objArr = {disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback, false, 1, null};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        writeRaw writerawWriteTypedObject = ((JsonReaderUnknownNumberParsing) disableOldAndroidAttachmentMetricsWorkarounds.onExtraCallback(-502500694, objArr, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 502500696, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).IAuthTabCallbackStub(RetryWithDelay.Companion.onNavigationEvent()).writeTypedObject();
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.dataprovider.AccountSyncManager$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return (deserializeIp) verifyHASH.onWarmupCompleted(-2120955950, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 2120955957, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{Boolean.valueOf(z), str, list, (CollectPerformancePoint) obj});
            }
        };
        writeRaw<List<TabBarInfoQueryPointOnTabBarInfoQueryListener>> writerawOnExtraCallbackWithResult = writerawWriteTypedObject.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.dataprovider.AccountSyncManager$$ExternalSyntheticLambda7
            public final Object apply(Object obj) {
                return (deserializeIp) verifyHASH.onWarmupCompleted(169731092, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -169731086, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{function1, obj});
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
        int i2 = IAuthTabCallbackStub + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return writerawOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final List access100(Function1 function1, Object obj) {
        List list;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            list = (List) function1.invoke(obj);
            int i3 = 43 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            list = (List) function1.invoke(obj);
        }
        int i4 = onNavigationEvent + 87;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final o.deserializeIp IAuthTabCallback(boolean r7, java.lang.String r8, java.util.List r9, o.CollectPerformancePoint r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.verifyHASH.IAuthTabCallback(boolean, java.lang.String, java.util.List, o.CollectPerformancePoint):o.deserializeIp");
    }

    public static /* synthetic */ deserializeIp onExtraCallback(boolean z, String str, List list, CollectPerformancePoint collectPerformancePoint) {
        return (deserializeIp) onWarmupCompleted(-2120955950, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 2120955957, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{Boolean.valueOf(z), str, list, collectPerformancePoint});
    }

    public static /* synthetic */ deserializeIp onWarmupCompleted(Function1 function1, Object obj) {
        return (deserializeIp) onWarmupCompleted(169731092, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -169731086, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{function1, obj});
    }

    public static /* synthetic */ Unit IAuthTabCallback(boolean z, CollectPerformancePoint collectPerformancePoint) {
        return (Unit) onWarmupCompleted(-1737466165, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1737466166, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{Boolean.valueOf(z), collectPerformancePoint});
    }

    public static /* synthetic */ Unit onExtraCallback(Throwable th) {
        return (Unit) onWarmupCompleted(1730053442, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -1730053432, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{th});
    }

    private static final deserializeIp onWarmupCompleted(boolean z, String str, List list, CollectPerformancePoint collectPerformancePoint) {
        return (deserializeIp) onWarmupCompleted(-1858538596, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1858538599, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{Boolean.valueOf(z), str, list, collectPerformancePoint});
    }

    private static final List IAuthTabCallback(List list, List list2) {
        return (List) onWarmupCompleted(1752060153, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -1752060149, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{list, list2});
    }

    private final void IAuthTabCallback(List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list) throws Throwable {
        onWarmupCompleted(-2053299224, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 2053299226, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this, list});
    }

    private static final void writeTypedObject(Function1 function1, Object obj) throws Throwable {
        onWarmupCompleted(1753848509, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -1753848509, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{function1, obj});
    }

    public final Object IAuthTabCallback(@NotNull List<? extends onDisclaimerClick> list, @NotNull access13800<? super List<? extends onDisclaimerClick>> access13800Var) {
        return onWarmupCompleted(661252527, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -661252518, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this, list, access13800Var});
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = 4422656314391874478L;
    }
}
