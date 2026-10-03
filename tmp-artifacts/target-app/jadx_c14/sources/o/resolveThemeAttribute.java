package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxSingleKt;
import o.GeckoHubImp;
import o.TypeUtils2;
import o.TypeUtils5;
import o.TypeUtilsMethodInheritanceComparator;
import o.deserializeIp;
import o.deserializeUriNullableCollection;
import o.isJSONTypeIgnore;
import o.resolveThemeAttribute;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class resolveThemeAttribute {
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallbackStub;
    private static char[] onExtraCallback;
    private static long onNavigationEvent;
    private static final String onWarmupCompleted;
    private static final byte[] $$a = {57, 22, -21, -92};
    private static final int $$b = 123;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, short r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r8 = 97 - r8
            byte[] r0 = o.resolveThemeAttribute.$$a
            int r7 = r7 * 3
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2d
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L2d:
            int r6 = r6 + 1
            int r4 = -r4
            int r8 = r8 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.resolveThemeAttribute.$$c(short, byte, short):java.lang.String");
    }

    static {
        IAuthTabCallbackStub = 1;
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(KeyEvent.getDeadChar(0, 0), View.resolveSize(0, 0) + 14, (char) Gravity.getAbsoluteGravity(0, 0), objArr);
        onWarmupCompleted = ((String) objArr[0]).intern();
        Companion = new onNavigationEvent(null);
        int i = IAuthTabCallbackDefault + 11;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 34 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TypeUtils2 typeUtils2IAuthTabCallbackDefault = IAuthTabCallbackDefault(function1, obj);
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        int i5 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return typeUtils2IAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getHostnameVerifierokhttp gethostnameverifierokhttp, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(gethostnameverifierokhttp, deserializeurinullablecollection);
        int i4 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ TypeUtils2 IAuthTabCallback(isJSONTypeIgnore isjsontypeignore, isJSONTypeIgnore isjsontypeignore2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(isjsontypeignore, isjsontypeignore2);
        }
        onExtraCallback(isjsontypeignore, isjsontypeignore2);
        throw null;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipIAuthTabCallbackStub = IAuthTabCallbackStub(function1, obj);
        int i4 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return deserializeipIAuthTabCallbackStub;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallback(isJSONTypeIgnore isjsontypeignore, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(isjsontypeignore, th);
        }
        onWarmupCompleted(isjsontypeignore, th);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact(function1, obj);
            throw null;
        }
        deserializeIp deserializeipOnTransact = onTransact(function1, obj);
        int i3 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 20 / 0;
        }
        return deserializeipOnTransact;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(getHostnameVerifierokhttp gethostnameverifierokhttp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onNavigationEvent(gethostnameverifierokhttp);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = i4 | i7 | (~i3);
        int i9 = ~i4;
        int i10 = (~(i3 | i7)) | (~(i7 | i9));
        int i11 = i6 + i4 + i + ((-92689393) * i2) + (1942122663 * i5);
        int i12 = i11 * i11;
        int i13 = (((-665130586) * i6) - 357761024) + ((-674687396) * i4) + (4778405 * i8) + (i9 * (-4778405)) + ((-4778405) * i10) + ((-669908992) * i) + ((-1056047104) * i2) + ((-742522880) * i5) + ((-592117760) * i12);
        int i14 = (i6 * 1048061654) + 1366922925 + (i4 * 1048062268) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (i * 1048061961) + (i2 * 439444615) + (i5 * (-1279783457)) + (i12 * 173867008);
        int i15 = i13 + (i14 * i14 * (-1898250240));
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ deserializeIp onWarmupCompleted(isJSONTypeIgnore isjsontypeignore, Throwable th, Boolean bool) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        deserializeIp deserializeip = (deserializeIp) onNavigationEvent(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{isjsontypeignore, th, bool}, iOnExtraCallback, -942127123, PushInfo.Companion.onExtraCallback(), 942127125);
        int i4 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return deserializeip;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, obj);
        if (i3 != 0) {
            int i4 = 2 / 0;
        }
        int i5 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    @Inject
    public resolveThemeAttribute() {
    }

    public static /* synthetic */ writeRaw onWarmupCompleted(resolveThemeAttribute resolvethemeattribute, isJSONTypeIgnore isjsontypeignore, getHostnameVerifierokhttp gethostnameverifierokhttp, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 4) != 0) {
            gethostnameverifierokhttp = null;
        }
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        writeRaw writeraw = (writeRaw) onNavigationEvent(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{resolvethemeattribute, isjsontypeignore, gethostnameverifierokhttp}, iOnExtraCallback, -1009254412, PushInfo.Companion.onExtraCallback(), 1009254415);
        int i4 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return writeraw;
    }

    private static final Unit onExtraCallback(getHostnameVerifierokhttp gethostnameverifierokhttp, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 75;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (gethostnameverifierokhttp != null) {
            int i5 = i2 + 125;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            getHostnameVerifierokhttp.onNavigationEvent(gethostnameverifierokhttp, (String) null, 1, (Object) null);
            int i7 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
    }

    private static final void onNavigationEvent(getHostnameVerifierokhttp gethostnameverifierokhttp) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (gethostnameverifierokhttp != null) {
            gethostnameverifierokhttp.dismissLoadingIndicator();
        }
        int i3 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 58 / 0;
        }
    }

    private static final TypeUtils2 IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        TypeUtils2 typeUtils2 = (TypeUtils2) function1.invoke(obj);
        int i4 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return typeUtils2;
    }

    private static final TypeUtils2 onExtraCallback(isJSONTypeIgnore isjsontypeignore, isJSONTypeIgnore isjsontypeignore2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isjsontypeignore2, "");
        resolveResource resolveresource = new resolveResource(isjsontypeignore, TypeUtilsMethodInheritanceComparator.IAuthTabCallback.onExtraCallbackWithResult);
        int i2 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 50 / 0;
        }
        return resolveresource;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final isJSONTypeIgnore isjsontypeignore = (isJSONTypeIgnore) objArr[1];
        final getHostnameVerifierokhttp gethostnameverifierokhttp = (getHostnameVerifierokhttp) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isjsontypeignore, "");
        writeRaw writerawIAuthTabCallback = DefaultReactNativeHostExternalSyntheticLambda0.onNavigationEvent.onWarmupCompleted(isjsontypeignore).onExtraCallbackWithResult(writeRaw.onExtraCallback(isjsontypeignore)).IAuthTabCallback(NetConverter3.onExtraCallback());
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.password.CertIssuer$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return resolveThemeAttribute.IAuthTabCallback(gethostnameverifierokhttp, (deserializeUriNullableCollection) obj);
            }
        };
        writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.password.CertIssuer$$ExternalSyntheticLambda1
            public final void accept(Object obj) {
                resolveThemeAttribute.onWarmupCompleted(function1, obj);
            }
        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.password.CertIssuer$$ExternalSyntheticLambda2
            public final void run() {
                resolveThemeAttribute.onExtraCallbackWithResult(gethostnameverifierokhttp);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.password.CertIssuer$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return resolveThemeAttribute.IAuthTabCallback(isjsontypeignore, (isJSONTypeIgnore) obj);
            }
        };
        writeRaw writerawOnWarmupCompleted2 = writerawOnWarmupCompleted.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.password.CertIssuer$$ExternalSyntheticLambda4
            public final Object apply(Object obj) {
                return (TypeUtils2) resolveThemeAttribute.onNavigationEvent(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{function12, obj}, PushInfo.Companion.onExtraCallback(), 1809433838, PushInfo.Companion.onExtraCallback(), -1809433838);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted2, "");
        int i2 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
        }
        return writerawOnWarmupCompleted2;
    }

    public static /* synthetic */ writeRaw onNavigationEvent(resolveThemeAttribute resolvethemeattribute, isJSONTypeIgnore isjsontypeignore, getHostnameVerifierokhttp gethostnameverifierokhttp, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            gethostnameverifierokhttp = null;
        }
        writeRaw<TypeUtils2> writerawOnWarmupCompleted = resolvethemeattribute.onWarmupCompleted(isjsontypeignore, gethostnameverifierokhttp);
        int i5 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return writerawOnWarmupCompleted;
    }

    private static final deserializeIp IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (deserializeIp) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i3 = 21 / 0;
        return deserializeip;
    }

    public final writeRaw<TypeUtils2> onWarmupCompleted(@NotNull final isJSONTypeIgnore isjsontypeignore, @Nullable getHostnameVerifierokhttp gethostnameverifierokhttp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isjsontypeignore, "");
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        writeRaw writerawIAuthTabCallback = ((writeRaw) onNavigationEvent(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{this, isjsontypeignore, gethostnameverifierokhttp}, iOnExtraCallback, -1009254412, PushInfo.Companion.onExtraCallback(), 1009254415)).IAuthTabCallback(3L);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.password.CertIssuer$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                return resolveThemeAttribute.IAuthTabCallback(isjsontypeignore, (Throwable) obj);
            }
        };
        writeRaw<TypeUtils2> writerawAsBinder = writerawIAuthTabCallback.asBinder(new deserializeIntNullableCollection() { // from class: viva.republica.toss.password.CertIssuer$$ExternalSyntheticLambda8
            public final Object apply(Object obj) {
                return resolveThemeAttribute.IAuthTabCallback(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawAsBinder, "");
        int i2 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return writerawAsBinder;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int label;
        private static char[] onWarmupCompleted = {64964, 64960, 64980, 64985, 64966, 64925, 64986, 64915, 64978, 64987, 64988, 64982, 64976, 64967, 64977, 65008, 64961, 64989, 64981, 64991, 64990, 64970, 64965, 64984, 64916};
        private static char onNavigationEvent = 51244;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(access13800Var);
            int i2 = onExtraCallbackWithResult + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 123;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onextracallbackCreate.invokeSuspend(unit);
            }
            onextracallbackCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.onNavigationEvent(obj);
                    return obj;
                }
                Object[] objArr = new Object[1];
                a(new char[]{'\r', 7, 13847, 13847, '\b', '\f', '\f', 5, 21, 19, 16, 6, 0, 24, 14, 21, '\t', '\f', '\r', 16, 11, 15, '\f', 6, 21, '\t', 22, 2, '\r', 20, 14, 21, 5, 2, '\b', 11, 5, '\b', '\r', 11, 15, 11, 3, 14, 7, 16, 13856}, (byte) (32 - MotionEvent.axisFromString("")), 47 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
            Boolean boolOnNavigationEvent = access14000.onNavigationEvent(false);
            this.label = 1;
            Object[] objArr2 = new Object[1];
            a(new char[]{'\t', 3, 14, '\b', '\t', 15, '\f', 1, 7, '\r', 20, 16, 16, 21, '\n', '\b', 6, 11, 7, 22, 6, '\t', 23, 7, '\t', 16, '\t', '\r', 16, 14}, (byte) (68 - View.resolveSizeAndState(0, 0, 0)), 30 - TextUtils.indexOf("", ""), objArr2);
            Object[] objArr3 = {lifecyclesKtawaitStarted21, ((String) objArr2[0]).intern(), boolOnNavigationEvent, this};
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            Object objOnExtraCallback = LifecyclesKtawaitStarted21.onExtraCallback(objArr3, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, iIAuthTabCallback);
            if (objOnExtraCallback != objOnWarmupCompleted) {
                int i3 = onExtraCallback + 5;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return objOnExtraCallback;
            }
            int i5 = onExtraCallback + 103;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            boolean z;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onWarmupCompleted;
            Object obj2 = null;
            if (cArr2 != null) {
                int i4 = $10 + 69;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i6 = 0; i6 < length; i6++) {
                    int i7 = $11 + 77;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), 26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-16754077) - Color.rgb(0, 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
                Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                boolean z2 = false;
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, TextUtils.getTrimmedLength("") + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    int i9 = $11 + 51;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
                    } else {
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                    }
                    while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            z = z2;
                            obj = obj2;
                        } else {
                            try {
                                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                                if (objOnExtraCallback3 == null) {
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (KeyEvent.getMaxKeyCode() >> 16)), View.resolveSizeAndState(0, 0, 0) + 74, (ViewConfiguration.getWindowTouchSlop() >> 8) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                    if (objOnExtraCallback4 == null) {
                                        z = false;
                                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), View.getDefaultSize(0, 0) + 30, 19488 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    } else {
                                        z = false;
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                    int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                                } else {
                                    obj = null;
                                    z = false;
                                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                                        int i13 = $11 + 25;
                                        $10 = i13 % 128;
                                        int i14 = i13 % 2;
                                    } else {
                                        int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                                    }
                                }
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                        obj2 = obj;
                        z2 = z;
                    }
                }
                int i17 = 0;
                while (i17 < i) {
                    int i18 = $11 + 115;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        cArr4[i17] = (char) (cArr4[i17] ^ 8491);
                        i17 += 90;
                    } else {
                        cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                        i17++;
                    }
                }
                objArr[0] = new String(cArr4);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
    }

    private static final deserializeIp onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (deserializeIp) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    private static final deserializeIp onWarmupCompleted(final isJSONTypeIgnore isjsontypeignore, final Throwable th) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.getSize(0), 14 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) TextUtils.getOffsetAfter("", 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0) + 15, View.MeasureSpec.getMode(0) + 10, (char) (55683 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr2);
        ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr2[0]).intern(), th, (Map) null, 8, (Object) null);
        writeRaw writerawIAuthTabCallback = RxSingleKt.IAuthTabCallback((CoroutineContext) null, new onExtraCallback(null), 1, (Object) null);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.password.CertIssuer$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return resolveThemeAttribute.onWarmupCompleted(isjsontypeignore, th, (Boolean) obj);
            }
        };
        writeRaw writerawOnExtraCallbackWithResult = writerawIAuthTabCallback.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.password.CertIssuer$$ExternalSyntheticLambda6
            public final Object apply(Object obj) {
                return (deserializeIp) resolveThemeAttribute.onNavigationEvent(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{function1, obj}, PushInfo.Companion.onExtraCallback(), -976337210, PushInfo.Companion.onExtraCallback(), 976337211);
            }
        });
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return writerawOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        isJSONTypeIgnore isjsontypeignore = (isJSONTypeIgnore) objArr[0];
        Throwable th = (Throwable) objArr[1];
        Boolean bool = (Boolean) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bool, "");
        Object obj = null;
        if (bool.booleanValue()) {
            writeRaw writerawOnExtraCallback = writeRaw.onExtraCallback(new resolveResource(isjsontypeignore, TypeUtilsMethodInheritanceComparator.onExtraCallbackWithResult.IAuthTabCallback));
            int i2 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return writerawOnExtraCallback;
            }
            throw null;
        }
        writeRaw writerawOnExtraCallbackWithResult = writeRaw.onExtraCallbackWithResult(th);
        int i3 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return writerawOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public final TypeUtils2 IAuthTabCallback(@NotNull isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isjsontypeignore, "");
        resolveResource resolveresource = new resolveResource(isjsontypeignore, TypeUtils5.onExtraCallback.onExtraCallbackWithResult);
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return resolveresource;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r32, int r33, char r34, java.lang.Object[] r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.resolveThemeAttribute.a(int, int, char, java.lang.Object[]):void");
    }

    public static /* synthetic */ TypeUtils2 onNavigationEvent(Function1 function1, Object obj) {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        return (TypeUtils2) onNavigationEvent(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{function1, obj}, iOnExtraCallback, 1809433838, PushInfo.Companion.onExtraCallback(), -1809433838);
    }

    public static /* synthetic */ deserializeIp onExtraCallbackWithResult(Function1 function1, Object obj) {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        return (deserializeIp) onNavigationEvent(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{function1, obj}, iOnExtraCallback, -976337210, PushInfo.Companion.onExtraCallback(), 976337211);
    }

    private static final deserializeIp onNavigationEvent(isJSONTypeIgnore isjsontypeignore, Throwable th, Boolean bool) {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        return (deserializeIp) onNavigationEvent(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{isjsontypeignore, th, bool}, iOnExtraCallback, -942127123, PushInfo.Companion.onExtraCallback(), 942127125);
    }

    public final writeRaw<TypeUtils2> onExtraCallbackWithResult(@NotNull isJSONTypeIgnore isjsontypeignore, @Nullable getHostnameVerifierokhttp gethostnameverifierokhttp) {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        return (writeRaw) onNavigationEvent(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{this, isjsontypeignore, gethostnameverifierokhttp}, iOnExtraCallback, -1009254412, PushInfo.Companion.onExtraCallback(), 1009254415);
    }

    static void onWarmupCompleted() {
        onExtraCallback = new char[]{60806, 15503, 20435, 40648, 43308, 63507, 2915, 23119, 25784, 46982, 50921, 4404, 8196, 29558, 13319, 58660, 38490, 18295, 28923, 8605, 54007, 33744, 48416, 28190};
        onNavigationEvent = 3444795601479613687L;
    }
}
