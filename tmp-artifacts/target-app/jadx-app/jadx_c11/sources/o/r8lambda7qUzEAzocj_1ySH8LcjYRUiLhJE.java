package o;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.features.payment.ui.autopay.R;
import im.toss.securities.widget.calendar.ui.model.CalendarWidgetState;
import im.toss.securities.widget.data.model.calendar.Event;
import im.toss.securities.widget.data.model.calendar.WidgetCalendar;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.decodeIpv6;
import o.deprecated_address;
import o.getIconImageResource;
import o.isCivilized;
import o.r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE;
import o.r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU;
import o.setAdUnitIds;
import o.setLogBuffers;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE {
    private static int access000 = 1;
    private static int asBinder = 0;
    private static int asInterface = 0;
    private static int onTransact = 1;
    public static final r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE onExtraCallback = new r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE();
    private static final Lazy IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.widget.calendar.CalendarRepo$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            decodeIpv6 decodeipv6OnExtraCallback = r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE.onExtraCallback();
            int i4 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return decodeipv6OnExtraCallback;
        }
    });
    private static final Lazy onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.widget.calendar.CalendarRepo$$ExternalSyntheticLambda1
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            setAdUnitIds setadunitidsIAuthTabCallback = r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE.IAuthTabCallback();
            if (i3 != 0) {
                int i4 = 7 / 0;
            }
            return setadunitidsIAuthTabCallback;
        }
    });
    private static final Lazy IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.widget.calendar.CalendarRepo$$ExternalSyntheticLambda2
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE.onExtraCallbackWithResult();
                throw null;
            }
            deprecated_address deprecated_addressVarOnExtraCallbackWithResult = r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE.onExtraCallbackWithResult();
            int i3 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return deprecated_addressVarOnExtraCallbackWithResult;
            }
            obj.hashCode();
            throw null;
        }
    });
    private static final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.widget.calendar.CalendarRepo$$ExternalSyntheticLambda3
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dauOnWarmupCompleted = r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE.onWarmupCompleted();
            if (i3 != 0) {
                int i4 = 21 / 0;
            }
            return r8lambdakeemxoi4two_xjjc4c2vgm4dauOnWarmupCompleted;
        }
    });
    private static final ConcurrentHashMap<String, getIconImageResource<Result<WidgetCalendar>>> onNavigationEvent = new ConcurrentHashMap<>();
    public static final int onExtraCallbackWithResult = 8;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE r8lambda7quzeazocj_1ysh8lcjyruilhje = r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE.this;
            if (i3 != 0) {
                return r8lambda7quzeazocj_1ysh8lcjyruilhje.IAuthTabCallback((access13800<? super CalendarWidgetState>) this);
            }
            r8lambda7quzeazocj_1ysh8lcjyruilhje.IAuthTabCallback((access13800<? super CalendarWidgetState>) this);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ setAdUnitIds IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        setAdUnitIds interfaceDescriptor = getInterfaceDescriptor();
        int i4 = onTransact + 75;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i3;
        int i8 = ~(i7 | i);
        int i9 = ~i;
        int i10 = i8 | (~(i9 | i5));
        int i11 = (~(i | i5)) | (~((~i5) | i7 | i9));
        int i12 = i7 | i5 | i9;
        int i13 = i5 + i3 + i4 + (1362283521 * i2) + ((-853422242) * i6);
        int i14 = i13 * i13;
        int i15 = ((1713903284 * i5) - 1228931072) + ((-782767794) * i3) + (i10 * 1248335539) + (1248335539 * i11) + ((-1248335539) * i12) + (i4 * 465567744) + (465567744 * i2) + (1887436800 * i6) + ((-1154482176) * i14);
        int i16 = ((i5 * 722868660) - 41817558) + (i3 * 722869710) + (i10 * (-525)) + (i11 * (-525)) + (i12 * 525) + (i4 * 722869185) + (i2 * 1172694977) + (i6 * (-747618338)) + (i14 * 791674880);
        int i17 = i15 + (i16 * i16 * 751828992);
        if (i17 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i17 == 2) {
            r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE r8lambda7quzeazocj_1ysh8lcjyruilhje = (r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE) objArr[0];
            int i18 = 2 % 2;
            int i19 = asInterface + 49;
            onTransact = i19 % 128;
            int i20 = i19 % 2;
            setAdUnitIds setadunitidsAsBinder = r8lambda7quzeazocj_1ysh8lcjyruilhje.asBinder();
            int i21 = asInterface + 79;
            onTransact = i21 % 128;
            int i22 = i21 % 2;
            return setadunitidsAsBinder;
        }
        if (i17 == 3) {
            return onWarmupCompleted(objArr);
        }
        int i23 = 2 % 2;
        int i24 = asInterface + 53;
        onTransact = i24 % 128;
        int i25 = i24 % 2;
        deprecated_address deprecated_addressVar = (deprecated_address) IAuthTabCallbackStub.getValue();
        int i26 = onTransact + 21;
        asInterface = i26 % 128;
        int i27 = i26 % 2;
        return deprecated_addressVar;
    }

    public static /* synthetic */ decodeIpv6 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault();
        }
        IAuthTabCallbackDefault();
        throw null;
    }

    public static /* synthetic */ deprecated_address onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback_Parcel();
        }
        IAuthTabCallback_Parcel();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dauAccess000 = access000();
        int i4 = onTransact + 9;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdakeemxoi4two_xjjc4c2vgm4dauAccess000;
    }

    private r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE() {
    }

    public static final /* synthetic */ decodeIpv6 IAuthTabCallback(r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE r8lambda7quzeazocj_1ysh8lcjyruilhje) {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        decodeIpv6 decodeipv6IAuthTabCallbackStub = r8lambda7quzeazocj_1ysh8lcjyruilhje.IAuthTabCallbackStub();
        int i4 = asInterface + 5;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return decodeipv6IAuthTabCallbackStub;
    }

    public static final /* synthetic */ LocalDate onExtraCallback(r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE r8lambda7quzeazocj_1ysh8lcjyruilhje, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return r8lambda7quzeazocj_1ysh8lcjyruilhje.onExtraCallback(str);
        }
        r8lambda7quzeazocj_1ysh8lcjyruilhje.onExtraCallback(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ List onExtraCallback(r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE r8lambda7quzeazocj_1ysh8lcjyruilhje, List list) {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            r8lambda7quzeazocj_1ysh8lcjyruilhje.onWarmupCompleted((List<Event>) list);
            throw null;
        }
        List<CalendarWidgetState.UiEvent> listOnWarmupCompleted = r8lambda7quzeazocj_1ysh8lcjyruilhje.onWarmupCompleted((List<Event>) list);
        int i3 = onTransact + 51;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return listOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ ConcurrentHashMap onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 17;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        ConcurrentHashMap<String, getIconImageResource<Result<WidgetCalendar>>> concurrentHashMap = onNavigationEvent;
        int i5 = i2 + 123;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return concurrentHashMap;
        }
        throw null;
    }

    public static final /* synthetic */ r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU onNavigationEvent(r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE r8lambda7quzeazocj_1ysh8lcjyruilhje) {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = R.onWarmupCompleted();
        int iOnWarmupCompleted2 = R.onWarmupCompleted();
        r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dau = (r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU) onExtraCallback(iOnWarmupCompleted, R.onWarmupCompleted(), 464323863, iOnWarmupCompleted2, -464323862, R.onWarmupCompleted(), new Object[]{r8lambda7quzeazocj_1ysh8lcjyruilhje});
        int i4 = asInterface + 89;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return r8lambdakeemxoi4two_xjjc4c2vgm4dau;
        }
        throw null;
    }

    public static final /* synthetic */ deprecated_address onWarmupCompleted(r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE r8lambda7quzeazocj_1ysh8lcjyruilhje) {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = R.onWarmupCompleted();
        int iOnWarmupCompleted2 = R.onWarmupCompleted();
        deprecated_address deprecated_addressVar = (deprecated_address) onExtraCallback(iOnWarmupCompleted, R.onWarmupCompleted(), -1304860150, iOnWarmupCompleted2, 1304860150, R.onWarmupCompleted(), new Object[]{r8lambda7quzeazocj_1ysh8lcjyruilhje});
        int i4 = asInterface + 29;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_addressVar;
    }

    static {
        int i = access000 + 29;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private final decodeIpv6 IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        decodeIpv6 decodeipv6 = (decodeIpv6) IAuthTabCallback.getValue();
        int i4 = asInterface + 75;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return decodeipv6;
    }

    private static final decodeIpv6 IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        decodeIpv6 title = ((requiresTunnel) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), Class.forName("o.requiresTunnel"))).setTitle();
        int i4 = onTransact + 7;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return title;
    }

    private final setAdUnitIds asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setAdUnitIds setadunitids = (setAdUnitIds) onWarmupCompleted.getValue();
        int i4 = asInterface + 61;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return setadunitids;
    }

    private static final setAdUnitIds getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        UserChoiceBillingListener userChoiceBillingListener = UserChoiceBillingListener.onExtraCallback;
        if (i3 == 0) {
            return ((setAdUnitIds.onExtraCallbackWithResult) Response.onExtraCallback(userChoiceBillingListener.onExtraCallback(), setAdUnitIds.onExtraCallbackWithResult.class)).Rcolor();
        }
        ((setAdUnitIds.onExtraCallbackWithResult) Response.onExtraCallback(userChoiceBillingListener.onExtraCallback(), setAdUnitIds.onExtraCallbackWithResult.class)).Rcolor();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final deprecated_address IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        deprecated_address deprecated_addressVarShow = ((deprecated_address.onWarmupCompleted) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), Class.forName("o.deprecated_address$onWarmupCompleted"))).show();
        int i4 = onTransact + 31;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        return deprecated_addressVarShow;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dau = (r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU) IAuthTabCallbackDefault.getValue();
        int i4 = onTransact + 115;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return r8lambdakeemxoi4two_xjjc4c2vgm4dau;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU access000() {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dauComponentActivityExternalSyntheticLambda4 = ((r8lambda8gsVpRiuyOD9e92VNiuwkw3QtA) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), r8lambda8gsVpRiuyOD9e92VNiuwkw3QtA.class)).ComponentActivityExternalSyntheticLambda4();
        int i4 = asInterface + 91;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdakeemxoi4two_xjjc4c2vgm4dauComponentActivityExternalSyntheticLambda4;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function1<access13800<? super Result<? extends WidgetCalendar>>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ String $date;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(String str, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(1, access13800Var);
            this.$date = str;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$date, access13800Var);
            int i2 = onExtraCallback + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onWarmupCompleted = i2 % 128;
            access13800<? super Result<WidgetCalendar>> access13800Var = (access13800) obj;
            if (i2 % 2 == 0) {
                return onExtraCallback(access13800Var);
            }
            onExtraCallback(access13800Var);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object onExtraCallback(access13800<? super Result<WidgetCalendar>> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(access13800Var);
            if (i3 != 0) {
                return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 33 / 0;
            return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onWarmupCompleted + 113;
                int i6 = i5 % 128;
                onExtraCallback = i6;
                int i7 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i6 + 19;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.onNavigationEvent(obj);
                objOnWarmupCompleted = ((Result) obj).onNavigationEvent();
                int i10 = onExtraCallback + 109;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dauOnNavigationEvent = r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE.onNavigationEvent(r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE.onExtraCallback);
                String str = this.$date;
                Intrinsics.checkNotNull(str);
                this.label = 1;
                objOnWarmupCompleted = r8lambdakeemxoi4two_xjjc4c2vgm4dauOnNavigationEvent.onWarmupCompleted(str, this);
                if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                    return objOnWarmupCompleted2;
                }
            }
            return Result.IAuthTabCallback(objOnWarmupCompleted);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c2 A[Catch: Exception -> 0x0315, CancellationException -> 0x0322, WebResourceResponseModel -> 0x0325, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0322, Exception -> 0x0315, WebResourceResponseModel -> 0x0325, blocks: (B:20:0x0067, B:52:0x019a, B:53:0x01bc, B:55:0x01c2, B:59:0x01dd, B:62:0x01e4, B:63:0x01f0, B:65:0x01f4, B:69:0x01f8, B:70:0x0200, B:72:0x0206, B:77:0x0224, B:79:0x022c, B:81:0x0273, B:83:0x027d, B:86:0x02b3, B:87:0x02c4, B:89:0x02ca, B:90:0x02fe, B:80:0x0257, B:25:0x007c, B:35:0x00df, B:37:0x00e7, B:39:0x00f7, B:40:0x00fc, B:41:0x00fd, B:42:0x0102, B:43:0x0103, B:45:0x0149, B:48:0x017b, B:28:0x0083, B:30:0x00be, B:32:0x00c6, B:92:0x0309, B:93:0x030e, B:94:0x030f, B:95:0x0314), top: B:118:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0206 A[Catch: Exception -> 0x0315, CancellationException -> 0x0322, WebResourceResponseModel -> 0x0325, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0322, Exception -> 0x0315, WebResourceResponseModel -> 0x0325, blocks: (B:20:0x0067, B:52:0x019a, B:53:0x01bc, B:55:0x01c2, B:59:0x01dd, B:62:0x01e4, B:63:0x01f0, B:65:0x01f4, B:69:0x01f8, B:70:0x0200, B:72:0x0206, B:77:0x0224, B:79:0x022c, B:81:0x0273, B:83:0x027d, B:86:0x02b3, B:87:0x02c4, B:89:0x02ca, B:90:0x02fe, B:80:0x0257, B:25:0x007c, B:35:0x00df, B:37:0x00e7, B:39:0x00f7, B:40:0x00fc, B:41:0x00fd, B:42:0x0102, B:43:0x0103, B:45:0x0149, B:48:0x017b, B:28:0x0083, B:30:0x00be, B:32:0x00c6, B:92:0x0309, B:93:0x030e, B:94:0x030f, B:95:0x0314), top: B:118:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022c A[Catch: Exception -> 0x0315, CancellationException -> 0x0322, WebResourceResponseModel -> 0x0325, TryCatch #3 {CancellationException -> 0x0322, Exception -> 0x0315, WebResourceResponseModel -> 0x0325, blocks: (B:20:0x0067, B:52:0x019a, B:53:0x01bc, B:55:0x01c2, B:59:0x01dd, B:62:0x01e4, B:63:0x01f0, B:65:0x01f4, B:69:0x01f8, B:70:0x0200, B:72:0x0206, B:77:0x0224, B:79:0x022c, B:81:0x0273, B:83:0x027d, B:86:0x02b3, B:87:0x02c4, B:89:0x02ca, B:90:0x02fe, B:80:0x0257, B:25:0x007c, B:35:0x00df, B:37:0x00e7, B:39:0x00f7, B:40:0x00fc, B:41:0x00fd, B:42:0x0102, B:43:0x0103, B:45:0x0149, B:48:0x017b, B:28:0x0083, B:30:0x00be, B:32:0x00c6, B:92:0x0309, B:93:0x030e, B:94:0x030f, B:95:0x0314), top: B:118:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0257 A[Catch: Exception -> 0x0315, CancellationException -> 0x0322, WebResourceResponseModel -> 0x0325, TryCatch #3 {CancellationException -> 0x0322, Exception -> 0x0315, WebResourceResponseModel -> 0x0325, blocks: (B:20:0x0067, B:52:0x019a, B:53:0x01bc, B:55:0x01c2, B:59:0x01dd, B:62:0x01e4, B:63:0x01f0, B:65:0x01f4, B:69:0x01f8, B:70:0x0200, B:72:0x0206, B:77:0x0224, B:79:0x022c, B:81:0x0273, B:83:0x027d, B:86:0x02b3, B:87:0x02c4, B:89:0x02ca, B:90:0x02fe, B:80:0x0257, B:25:0x007c, B:35:0x00df, B:37:0x00e7, B:39:0x00f7, B:40:0x00fc, B:41:0x00fd, B:42:0x0102, B:43:0x0103, B:45:0x0149, B:48:0x017b, B:28:0x0083, B:30:0x00be, B:32:0x00c6, B:92:0x0309, B:93:0x030e, B:94:0x030f, B:95:0x0314), top: B:118:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027d A[Catch: Exception -> 0x0315, CancellationException -> 0x0322, WebResourceResponseModel -> 0x0325, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0322, Exception -> 0x0315, WebResourceResponseModel -> 0x0325, blocks: (B:20:0x0067, B:52:0x019a, B:53:0x01bc, B:55:0x01c2, B:59:0x01dd, B:62:0x01e4, B:63:0x01f0, B:65:0x01f4, B:69:0x01f8, B:70:0x0200, B:72:0x0206, B:77:0x0224, B:79:0x022c, B:81:0x0273, B:83:0x027d, B:86:0x02b3, B:87:0x02c4, B:89:0x02ca, B:90:0x02fe, B:80:0x0257, B:25:0x007c, B:35:0x00df, B:37:0x00e7, B:39:0x00f7, B:40:0x00fc, B:41:0x00fd, B:42:0x0102, B:43:0x0103, B:45:0x0149, B:48:0x017b, B:28:0x0083, B:30:0x00be, B:32:0x00c6, B:92:0x0309, B:93:0x030e, B:94:0x030f, B:95:0x0314), top: B:118:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ca A[Catch: Exception -> 0x0315, CancellationException -> 0x0322, WebResourceResponseModel -> 0x0325, LOOP:2: B:87:0x02c4->B:89:0x02ca, LOOP_END, TryCatch #3 {CancellationException -> 0x0322, Exception -> 0x0315, WebResourceResponseModel -> 0x0325, blocks: (B:20:0x0067, B:52:0x019a, B:53:0x01bc, B:55:0x01c2, B:59:0x01dd, B:62:0x01e4, B:63:0x01f0, B:65:0x01f4, B:69:0x01f8, B:70:0x0200, B:72:0x0206, B:77:0x0224, B:79:0x022c, B:81:0x0273, B:83:0x027d, B:86:0x02b3, B:87:0x02c4, B:89:0x02ca, B:90:0x02fe, B:80:0x0257, B:25:0x007c, B:35:0x00df, B:37:0x00e7, B:39:0x00f7, B:40:0x00fc, B:41:0x00fd, B:42:0x0102, B:43:0x0103, B:45:0x0149, B:48:0x017b, B:28:0x0083, B:30:0x00be, B:32:0x00c6, B:92:0x0309, B:93:0x030e, B:94:0x030f, B:95:0x0314), top: B:118:0x0050 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull access13800<? super CalendarWidgetState> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        Object error;
        Throwable th;
        onWarmupCompleted onwarmupcompleted2;
        int i;
        int i2;
        String str;
        Iterator it;
        Pair pair;
        CalendarWidgetState.UiEvents uiEvents;
        Pair pair2;
        CalendarWidgetState.UiEvents uiEvents2;
        int i3 = 2 % 2;
        int i4 = onTransact + 25;
        int i5 = i4 % 128;
        asInterface = i5;
        if (i4 % 2 != 0) {
            boolean z = access13800Var instanceof onWarmupCompleted;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (access13800Var instanceof onWarmupCompleted) {
            int i6 = i5 + 27;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i8 = onwarmupcompleted.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                int i9 = asInterface + 109;
                onTransact = i9 % 128;
                if (i9 % 2 == 0) {
                    onwarmupcompleted.label = i8 >>> Integer.MIN_VALUE;
                } else {
                    onwarmupcompleted.label = i8 - 2147483648;
                }
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object objOnNavigationEvent = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i10 = onwarmupcompleted.label;
        int i11 = 0;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion = Result.Companion;
            error = Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (WebResourceResponseModel e3) {
            Result.Companion companion2 = Result.Companion;
            error = Result.constructor-impl(ResultKt.createFailure(e3));
        }
        if (i10 == 0) {
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            Result.Companion companion3 = Result.Companion;
            q8a.onNavigationEvent.onExtraCallbackWithResult(access8100.onNavigationEvent(getWrite.IAuthTabCallback("function", "CalendarRepo.loadCalendarData")));
            r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE r8lambda7quzeazocj_1ysh8lcjyruilhje = onExtraCallback;
            if (!((setAdUnitIds) onExtraCallback(R.onWarmupCompleted(), R.onWarmupCompleted(), 1948428874, R.onWarmupCompleted(), -1948428872, R.onWarmupCompleted(), new Object[]{r8lambda7quzeazocj_1ysh8lcjyruilhje})).IAuthTabCallback()) {
                throw new CalendarWidgetState.UndefinedUser();
            }
            if (!onTextViewSizeChanged.onExtraCallbackWithResult.IAuthTabCallback()) {
                throw new CalendarWidgetState.NetworkError();
            }
            decodeIpv6 decodeipv6IAuthTabCallback = IAuthTabCallback(r8lambda7quzeazocj_1ysh8lcjyruilhje);
            onwarmupcompleted.L$0 = access15400.onNavigationEvent(onwarmupcompleted);
            onwarmupcompleted.I$0 = 0;
            onwarmupcompleted.I$1 = 0;
            onwarmupcompleted.label = 1;
            objOnNavigationEvent = decodeipv6IAuthTabCallback.onNavigationEvent(onwarmupcompleted);
            if (objOnNavigationEvent != objOnWarmupCompleted) {
                onwarmupcompleted2 = onwarmupcompleted;
                i = 0;
                i2 = 0;
            }
            return objOnWarmupCompleted;
        }
        int i12 = onTransact + 27;
        asInterface = i12 % 128;
        int i13 = i12 % 2;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) onwarmupcompleted.L$1;
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            Object objOnNavigationEvent2 = ((Result) objOnNavigationEvent).onNavigationEvent();
            ResultKt.onNavigationEvent(objOnNavigationEvent2);
            SortedMap sortedMapOnTransact = access8100.onTransact(((WidgetCalendar) objOnNavigationEvent2).onNavigationEvent());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sortedMapOnTransact.entrySet()) {
                List list = (List) entry.getValue();
                if (list != null) {
                    int i14 = asInterface + 81;
                    onTransact = i14 % 128;
                    if (i14 % 2 == 0) {
                        list.isEmpty();
                        throw null;
                    }
                    if (!list.isEmpty()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            List listOnExtraCallback = access8100.onExtraCallback(linkedHashMap);
            it = listOnExtraCallback.iterator();
            while (true) {
                if (it.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (Intrinsics.areEqual(((Pair) it.next()).getFirst(), str)) {
                    break;
                }
                i11++;
                int i15 = onTransact + 101;
                asInterface = i15 % 128;
                int i16 = i15 % 2;
            }
            pair = (Pair) CollectionsKt.getOrNull(listOnExtraCallback, i11);
            if (pair == null) {
                isCivilized iscivilized = isCivilized.onWarmupCompleted;
                r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE r8lambda7quzeazocj_1ysh8lcjyruilhje2 = onExtraCallback;
                String strIAuthTabCallback = iscivilized.IAuthTabCallback(onExtraCallback(r8lambda7quzeazocj_1ysh8lcjyruilhje2, (String) pair.getFirst()));
                Intrinsics.checkNotNullExpressionValue(strIAuthTabCallback, "");
                uiEvents = new CalendarWidgetState.UiEvents((String) pair.getFirst(), strIAuthTabCallback, onExtraCallback(r8lambda7quzeazocj_1ysh8lcjyruilhje2, (List) pair.getSecond()));
            } else {
                isCivilized iscivilized2 = isCivilized.onWarmupCompleted;
                r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE r8lambda7quzeazocj_1ysh8lcjyruilhje3 = onExtraCallback;
                Intrinsics.checkNotNull(str);
                String strIAuthTabCallback2 = iscivilized2.IAuthTabCallback(onExtraCallback(r8lambda7quzeazocj_1ysh8lcjyruilhje3, str));
                Intrinsics.checkNotNullExpressionValue(strIAuthTabCallback2, "");
                uiEvents = new CalendarWidgetState.UiEvents(str, strIAuthTabCallback2, CollectionsKt.emptyList());
            }
            pair2 = (Pair) CollectionsKt.getOrNull(listOnExtraCallback, i11 + 1);
            if (pair2 == null) {
                isCivilized iscivilized3 = isCivilized.onWarmupCompleted;
                r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE r8lambda7quzeazocj_1ysh8lcjyruilhje4 = onExtraCallback;
                String strOnWarmupCompleted = iscivilized3.onWarmupCompleted(onExtraCallback(r8lambda7quzeazocj_1ysh8lcjyruilhje4, (String) pair2.getFirst()));
                Intrinsics.checkNotNullExpressionValue(strOnWarmupCompleted, "");
                CalendarWidgetState.UiEvents uiEvents3 = new CalendarWidgetState.UiEvents((String) pair2.getFirst(), strOnWarmupCompleted, onExtraCallback(r8lambda7quzeazocj_1ysh8lcjyruilhje4, (List) pair2.getSecond()));
                int i17 = onTransact + 5;
                asInterface = i17 % 128;
                int i18 = i17 % 2;
                uiEvents2 = uiEvents3;
            } else {
                uiEvents2 = null;
            }
            List<Pair> list2 = listOnExtraCallback;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (Pair pair3 : list2) {
                isCivilized iscivilized4 = isCivilized.onWarmupCompleted;
                r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE r8lambda7quzeazocj_1ysh8lcjyruilhje5 = onExtraCallback;
                String strIAuthTabCallback3 = iscivilized4.IAuthTabCallback(onExtraCallback(r8lambda7quzeazocj_1ysh8lcjyruilhje5, (String) pair3.getFirst()));
                Intrinsics.checkNotNullExpressionValue(strIAuthTabCallback3, "");
                arrayList.add(new CalendarWidgetState.UiEvents((String) pair3.getFirst(), strIAuthTabCallback3, onExtraCallback(r8lambda7quzeazocj_1ysh8lcjyruilhje5, (List) pair3.getSecond())));
            }
            error = Result.constructor-impl(new CalendarWidgetState.Success(uiEvents, uiEvents2, arrayList));
            th = Result.exceptionOrNull-impl(error);
            if (th != 0) {
                error = th instanceof CalendarWidgetState ? (CalendarWidgetState) th : setCustomerUserId.onExtraCallbackWithResult(th) ? CalendarWidgetState.Maintenance.INSTANCE : new CalendarWidgetState.Error(th.getMessage());
            }
            return (CalendarWidgetState) error;
        }
        i = onwarmupcompleted.I$1;
        i2 = onwarmupcompleted.I$0;
        onwarmupcompleted2 = (access13800) onwarmupcompleted.L$0;
        ResultKt.onNavigationEvent(objOnNavigationEvent);
        if (!((Boolean) objOnNavigationEvent).booleanValue()) {
            if (onWarmupCompleted(onExtraCallback).onWarmupCompleted().isGuest()) {
                throw new CalendarWidgetState.GuestUser();
            }
            throw new CalendarWidgetState.UndefinedUser();
        }
        String str2 = ((ZonedDateTime) isCivilized.onNavigationEvent(new Object[]{isCivilized.onWarmupCompleted, Long.valueOf(zzaj.onWarmupCompleted().IAuthTabCallbackDefault())}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 1325193441, -1325193441)).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        ConcurrentHashMap concurrentHashMapOnNavigationEvent = onNavigationEvent();
        Object objIAuthTabCallback = concurrentHashMapOnNavigationEvent.get(str2);
        if (objIAuthTabCallback == null) {
            getIconImageResource.onExtraCallback onextracallback = getIconImageResource.Companion;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(str2, null);
            setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
            objIAuthTabCallback = getIconImageResource.onExtraCallback.IAuthTabCallback(onextracallback, "calendar", onextracallbackwithresult, (Object) null, setLogBuffers.onWarmupCompleted(setCommandLine.onWarmupCompleted(5, setRevision.SECONDS)), 4, (Object) null);
            Object objPutIfAbsent = concurrentHashMapOnNavigationEvent.putIfAbsent(str2, objIAuthTabCallback);
            if (objPutIfAbsent != null) {
                int i19 = asInterface + 57;
                onTransact = i19 % 128;
                int i20 = i19 % 2;
                objIAuthTabCallback = objPutIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(objIAuthTabCallback, "");
        onwarmupcompleted.L$0 = access15400.onNavigationEvent(onwarmupcompleted2);
        onwarmupcompleted.L$1 = str2;
        onwarmupcompleted.I$0 = i2;
        onwarmupcompleted.I$1 = i;
        onwarmupcompleted.label = 2;
        Object objIAuthTabCallback2 = getIconImageResource.IAuthTabCallback((getIconImageResource) objIAuthTabCallback, false, onwarmupcompleted, 1, (Object) null);
        if (objIAuthTabCallback2 == objOnWarmupCompleted) {
            return objOnWarmupCompleted;
        }
        str = str2;
        objOnNavigationEvent = objIAuthTabCallback2;
        Object objOnNavigationEvent22 = ((Result) objOnNavigationEvent).onNavigationEvent();
        ResultKt.onNavigationEvent(objOnNavigationEvent22);
        SortedMap sortedMapOnTransact2 = access8100.onTransact(((WidgetCalendar) objOnNavigationEvent22).onNavigationEvent());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        while (r1.hasNext()) {
        }
        List listOnExtraCallback2 = access8100.onExtraCallback(linkedHashMap2);
        it = listOnExtraCallback2.iterator();
        while (true) {
            if (it.hasNext()) {
            }
            i11++;
            int i152 = onTransact + 101;
            asInterface = i152 % 128;
            int i162 = i152 % 2;
        }
        pair = (Pair) CollectionsKt.getOrNull(listOnExtraCallback2, i11);
        if (pair == null) {
        }
        pair2 = (Pair) CollectionsKt.getOrNull(listOnExtraCallback2, i11 + 1);
        if (pair2 == null) {
        }
        List<Pair> list22 = listOnExtraCallback2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list22, 10));
        while (r1.hasNext()) {
        }
        error = Result.constructor-impl(new CalendarWidgetState.Success(uiEvents, uiEvents2, arrayList2));
        th = Result.exceptionOrNull-impl(error);
        if (th != 0) {
        }
        return (CalendarWidgetState) error;
    }

    private final LocalDate onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            LocalDate localDate = LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            Intrinsics.checkNotNullExpressionValue(localDate, "");
            return localDate;
        }
        Intrinsics.checkNotNullExpressionValue(LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd")), "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 73;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            if (!StringsKt.isBlank(str)) {
                String str2 = ZonedDateTime.parse(str, DateTimeFormatter.ISO_ZONED_DATE_TIME).withZoneSameInstant(ZoneId.systemDefault()).format(isCivilized.onNavigationEvent.onExtraCallbackWithResult.IAuthTabCallback());
                Intrinsics.checkNotNullExpressionValue(str2, "");
                return str2;
            }
            int i3 = onTransact + 9;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return "";
        }
        StringsKt.isBlank(str);
        throw null;
    }

    private final List<CalendarWidgetState.UiEvent> onWarmupCompleted(List<Event> list) {
        int i = 2 % 2;
        List<Event> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Event event : list2) {
            String strIAuthTabCallback = event.IAuthTabCallback();
            r2ExternalSyntheticLambda3 r2externalsyntheticlambda3OnTransact = event.onTransact();
            String strOnExtraCallback = event.onExtraCallback();
            r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE r8lambda7quzeazocj_1ysh8lcjyruilhje = onExtraCallback;
            String strOnExtraCallbackWithResult = event.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult == null) {
                int i2 = asInterface + 27;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                strOnExtraCallbackWithResult = "";
            }
            int iOnWarmupCompleted = R.onWarmupCompleted();
            int iOnWarmupCompleted2 = R.onWarmupCompleted();
            arrayList.add(new CalendarWidgetState.UiEvent(strIAuthTabCallback, r2externalsyntheticlambda3OnTransact, strOnExtraCallback, (String) onExtraCallback(iOnWarmupCompleted, R.onWarmupCompleted(), -1561530064, iOnWarmupCompleted2, 1561530067, R.onWarmupCompleted(), new Object[]{r8lambda7quzeazocj_1ysh8lcjyruilhje, strOnExtraCallbackWithResult})));
            int i4 = asInterface + 55;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        return arrayList;
    }

    public static final /* synthetic */ setAdUnitIds onExtraCallback(r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE r8lambda7quzeazocj_1ysh8lcjyruilhje) {
        int iOnWarmupCompleted = R.onWarmupCompleted();
        int iOnWarmupCompleted2 = R.onWarmupCompleted();
        return (setAdUnitIds) onExtraCallback(iOnWarmupCompleted, R.onWarmupCompleted(), 1948428874, iOnWarmupCompleted2, -1948428872, R.onWarmupCompleted(), new Object[]{r8lambda7quzeazocj_1ysh8lcjyruilhje});
    }

    private final String IAuthTabCallback(String str) {
        int iOnWarmupCompleted = R.onWarmupCompleted();
        int iOnWarmupCompleted2 = R.onWarmupCompleted();
        return (String) onExtraCallback(iOnWarmupCompleted, R.onWarmupCompleted(), -1561530064, iOnWarmupCompleted2, 1561530067, R.onWarmupCompleted(), new Object[]{this, str});
    }

    private final deprecated_address asInterface() {
        int iOnWarmupCompleted = R.onWarmupCompleted();
        int iOnWarmupCompleted2 = R.onWarmupCompleted();
        return (deprecated_address) onExtraCallback(iOnWarmupCompleted, R.onWarmupCompleted(), -1304860150, iOnWarmupCompleted2, 1304860150, R.onWarmupCompleted(), new Object[]{this});
    }

    private final r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU onTransact() {
        int iOnWarmupCompleted = R.onWarmupCompleted();
        int iOnWarmupCompleted2 = R.onWarmupCompleted();
        return (r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU) onExtraCallback(iOnWarmupCompleted, R.onWarmupCompleted(), 464323863, iOnWarmupCompleted2, -464323862, R.onWarmupCompleted(), new Object[]{this});
    }
}
