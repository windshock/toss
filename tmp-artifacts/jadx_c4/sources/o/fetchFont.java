package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard;
import com.tmoney.LiveCheckConstants;
import im.toss.components.tuba.variable.v2.spec.DefaultVar;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class fetchFont implements setCompositionTask {
    private final addAnimatorUpdateListener IAuthTabCallbackDefault;
    private final clearComposition IAuthTabCallbackStub;
    private final LExternalSyntheticLambda0 asInterface;
    private final fromRawRes onExtraCallback;
    private List<DefaultVar> onNavigationEvent;
    private static final byte[] $$a = {23, 124, -70, -17};
    private static final int $$b = 111;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder = 478308972;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objOnNavigationEvent = fetchFont.this.onNavigationEvent((String[]) null, (access13800<? super Map<String, String>>) this);
            int i4 = onExtraCallback + 1;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static final class asBinder extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = fetchFont.this.onExtraCallback((String[]) null, (access13800<? super Map<String, setProgressInternal>>) this);
            int i4 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 87 / 0;
            }
            return objOnExtraCallback;
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = fetchFont.this.onExtraCallback((String) null, (access13800<? super setProgressInternal>) this);
            if (i3 == 0) {
                int i4 = 75 / 0;
            }
            return objOnExtraCallback;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            fetchFont fetchfont = fetchFont.this;
            if (i3 != 0) {
                return fetchfont.onNavigationEvent((String) null, (access13800<? super String>) this);
            }
            fetchfont.onNavigationEvent((String) null, (access13800<? super String>) this);
            obj2.hashCode();
            throw null;
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = fetchFont.this.onExtraCallbackWithResult((access13800<? super Unit>) this);
            int i4 = onNavigationEvent + 33;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, byte b) {
        int i3;
        int i4;
        int i5 = 105 - (i * 3);
        int i6 = (i2 * 4) + 1;
        byte[] bArr = $$a;
        int i7 = 3 - (b * 4);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            i5 += i7;
            i7 = i8;
            i3 = i4;
            i4 = i3 + 1;
            int i9 = i7 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
                return new String(bArr2, 0);
            }
            i8 = i9;
            i7 = bArr[i9];
            i5 += i7;
            i7 = i8;
            i3 = i4;
            i4 = i3 + 1;
            int i92 = i7 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            int i922 = i7 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        }
    }

    @Inject
    public fetchFont(@NotNull fromRawRes fromrawres, @NotNull addAnimatorUpdateListener addanimatorupdatelistener, @NotNull clearComposition clearcomposition, @NotNull LExternalSyntheticLambda0 lExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(fromrawres, "");
        Intrinsics.checkNotNullParameter(addanimatorupdatelistener, "");
        Intrinsics.checkNotNullParameter(clearcomposition, "");
        Intrinsics.checkNotNullParameter(lExternalSyntheticLambda0, "");
        this.onExtraCallback = fromrawres;
        this.IAuthTabCallbackDefault = addanimatorupdatelistener;
        this.IAuthTabCallbackStub = clearcomposition;
        this.asInterface = lExternalSyntheticLambda0;
    }

    public static final /* synthetic */ fromRawRes onExtraCallback(fetchFont fetchfont) {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        fromRawRes fromrawres = fetchfont.onExtraCallback;
        if (i3 != 0) {
            return fromrawres;
        }
        throw null;
    }

    public static final /* synthetic */ addAnimatorUpdateListener onNavigationEvent(fetchFont fetchfont) {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        addAnimatorUpdateListener addanimatorupdatelistener = fetchfont.IAuthTabCallbackDefault;
        int i5 = i3 + 61;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return addanimatorupdatelistener;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // o.setCompositionTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(@NotNull access13800<? super Unit> access13800Var) throws Throwable {
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
            if (access13800Var instanceof onWarmupCompleted) {
                onwarmupcompleted = (onWarmupCompleted) access13800Var;
                int i4 = onwarmupcompleted.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    onwarmupcompleted.label = i4 - 2147483648;
                } else {
                    onwarmupcompleted = new onWarmupCompleted(access13800Var);
                }
            }
        } else if (access13800Var instanceof onWarmupCompleted) {
        }
        Object objOnExtraCallbackWithResult = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onwarmupcompleted.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            this.onNavigationEvent = this.onExtraCallback.IAuthTabCallback();
            clearComposition clearcomposition = this.IAuthTabCallbackStub;
            onwarmupcompleted.label = 1;
            objOnExtraCallbackWithResult = clearcomposition.onExtraCallbackWithResult(onwarmupcompleted);
            if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i5 != 1) {
                Object[] objArr = new Object[1];
                a(47 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 12 - TextUtils.indexOf("", "", 0, 0), new char[]{24, '\f', 65476, 7, 19, 22, 19, 25, 24, '\r', 18, '\t', 7, 5, 16, 16, 65476, 24, 19, 65476, 65483, 22, '\t', 23, 25, 17, '\t', 65483, 65476, 6, '\t', '\n', 19, 22, '\t', 65476, 65483, '\r', 18, 26, 19, 15, '\t', 65483, 65476, 27, '\r'}, false, (Process.myPid() >> 22) + 161, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i6 = IAuthTabCallback_Parcel + 77;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        }
        List<DefaultVar> list = (List) objOnExtraCallbackWithResult;
        if (list != null) {
            int i8 = IAuthTabCallback_Parcel + 31;
            onTransact = i8 % 128;
            if (i8 % 2 != 0) {
                this.onNavigationEvent = list;
                this.onExtraCallback.IAuthTabCallback(list);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.onNavigationEvent = list;
            this.onExtraCallback.IAuthTabCallback(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    @Override // o.setCompositionTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onNavigationEvent(@NotNull String str, @NotNull access13800<? super String> access13800Var) throws Throwable {
        onNavigationEvent onnavigationevent;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = access13800Var instanceof onNavigationEvent;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(access13800Var instanceof onNavigationEvent)) {
            onnavigationevent = new onNavigationEvent(access13800Var);
        } else {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i3 = onnavigationevent.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = IAuthTabCallback_Parcel + 105;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                onnavigationevent.label = i3 - 2147483648;
            }
        }
        Object objOnExtraCallback = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = onnavigationevent.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            onnavigationevent.L$0 = access15400.onNavigationEvent(str);
            onnavigationevent.label = 1;
            objOnExtraCallback = onExtraCallback(str, (access13800<? super setProgressInternal>) onnavigationevent);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                int i7 = onTransact + 49;
                IAuthTabCallback_Parcel = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 33 / 0;
                }
                return objOnWarmupCompleted;
            }
        } else {
            if (i6 != 1) {
                Object[] objArr = new Object[1];
                a(48 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (-16777204) - Color.rgb(0, 0, 0), new char[]{24, '\f', 65476, 7, 19, 22, 19, 25, 24, '\r', 18, '\t', 7, 5, 16, 16, 65476, 24, 19, 65476, 65483, 22, '\t', 23, 25, 17, '\t', 65483, 65476, 6, '\t', '\n', 19, 22, '\t', 65476, 65483, '\r', 18, 26, 19, 15, '\t', 65483, 65476, 27, '\r'}, false, 160 - MotionEvent.axisFromString(""), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        return ((setProgressInternal) objOnExtraCallback).onNavigationEvent();
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super getPackageType>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallback;
        final /* synthetic */ String $key;
        final /* synthetic */ String $this_run;
        private /* synthetic */ Object L$0;
        int label;
        private static char[] onNavigationEvent = {32592, 32594, 32591, 32531, 32583, 32588, 32532, 32577, 32598, 32576, 32582, 32590, 32593, 32597, 32586, 32589, 32581, 32584, 32580, 32587};
        private static int onWarmupCompleted = -1184333837;
        private static boolean onExtraCallbackWithResult = true;
        private static boolean IAuthTabCallback = true;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(String str, String str2, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$key = str;
            this.$this_run = str2;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super getPackageType> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 69;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 70 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = fetchFont.this.new onExtraCallback(this.$key, this.$this_run, access13800Var);
            onextracallback.L$0 = obj;
            int i2 = onExtraCallback + 103;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 34 / 0;
            }
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            IAuthTabCallbackDefault = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super getPackageType> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 73;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 24 / 0;
            }
            return objIAuthTabCallback;
        }

        /* renamed from: o.fetchFont$onExtraCallback$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static char IAuthTabCallback = 54537;
            private static int asBinder = 1;
            private static char onExtraCallback = 42695;
            private static int onExtraCallbackWithResult = 0;
            private static char onNavigationEvent = 33624;
            private static char onWarmupCompleted = 44497;
            final /* synthetic */ String $key;
            final /* synthetic */ String $this_run;
            int label;
            final /* synthetic */ fetchFont this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(fetchFont fetchfont, String str, String str2, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.this$0 = fetchfont;
                this.$key = str;
                this.$this_run = str2;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, this.$key, this.$this_run, access13800Var);
                int i2 = onExtraCallbackWithResult + 105;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = asBinder + 105;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                if (i3 != 0) {
                    int i4 = 60 / 0;
                }
                int i5 = asBinder + 49;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 71 / 0;
                }
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = asBinder + 17;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = asBinder + 69;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = 2 % 2;
                if (this.label != 0) {
                    Object[] objArr = new Object[1];
                    a(new char[]{59713, 38671, 51502, 17714, 50296, 14244, 15377, 15994, 64403, 3190, 52638, 43870, 50769, 34292, 28314, 7145, 34363, 14691, 62776, 50757, 48460, 40358, 7136, 7605, 65396, 65505, 42496, 38830, 27160, 54841, 28314, 7145, 44310, 33741, 6171, 20679, 58394, 32738, 25990, 54387, 52001, 35280, 40557, 62743, 30395, 61799, 64931, 2223}, 47 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i2 = onExtraCallbackWithResult + 39;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                ResultKt.onNavigationEvent(obj);
                if (i3 != 0) {
                    fetchFont.onNavigationEvent(this.this$0).onNavigationEvent(this.$key, this.$this_run);
                    Unit unit = Unit.INSTANCE;
                    int i4 = onExtraCallbackWithResult + 31;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }
                fetchFont.onNavigationEvent(this.this$0).onNavigationEvent(this.$key, this.$this_run);
                Unit unit2 = Unit.INSTANCE;
                throw null;
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
                char[] cArr2 = new char[cArr.length];
                int i3 = 0;
                defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
                char[] cArr3 = new char[2];
                while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                    int i4 = $10 + 91;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                    int i6 = 58224;
                    int i7 = i3;
                    while (i7 < 16) {
                        char c = cArr3[1];
                        char c2 = cArr3[i3];
                        int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                        int i9 = c2 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(onWarmupCompleted);
                            objArr2[2] = Integer.valueOf(i9);
                            objArr2[1] = Integer.valueOf(i8);
                            objArr2[i3] = Integer.valueOf(c);
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                            if (objOnExtraCallback == null) {
                                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', i3));
                                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10;
                                int iKeyCodeFromString = 12434 - KeyEvent.keyCodeFromString("");
                                Class[] clsArr = new Class[4];
                                clsArr[i3] = Integer.TYPE;
                                clsArr[1] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, maximumDrawingCacheSize, iKeyCodeFromString, -787580090, false, "C", clsArr);
                            }
                            char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            char[] cArr4 = cArr3;
                            Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9, ((Process.getThreadPriority(0) + 20) >> 6) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            i6 -= 40503;
                            i7++;
                            cArr3 = cArr4;
                            i3 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    char[] cArr5 = cArr3;
                    cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                    cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 16014), 14 - (ViewConfiguration.getEdgeSlop() >> 16), 19901 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    cArr3 = cArr5;
                    i3 = 0;
                }
                String str = new String(cArr2, 0, i);
                int i10 = $11 + 31;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                objArr[0] = str;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
        
            return r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
        
            r4 = new java.lang.Object[1];
            a(null, null, new byte[]{-119, -112, -113, -123, -117, -122, -120, -122, -127, -124, -108, -123, -113, -109, -124, -121, -119, -110, -122, -111, -112, -113, -121, -124, -119, -120, -122, -114, -119, -115, -124, -121, -119, -116, -117, -118, -119, -120, -121, -124, -122, -123, -124, -125, -125, -126, -127}, 128 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)), r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0077, code lost:
        
            throw new java.lang.IllegalStateException(((java.lang.String) r4[0]).intern());
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (r11.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            if (r11.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r12);
            r5 = r1;
            o.maybeUpdateAnimatable.onNavigationEvent(r5, (kotlin.coroutines.CoroutineContext) null, (o.setRandomHost) null, new o.fetchFont.onExtraCallback.AnonymousClass5(r11.this$0, r11.$key, r11.$this_run, null), 3, (java.lang.Object) null);
            r12 = o.maybeUpdateAnimatable.onNavigationEvent(r5, (kotlin.coroutines.CoroutineContext) null, (o.setRandomHost) null, new o.fetchFont.onExtraCallback.AnonymousClass2(r11.this$0, r11.$key, r11.$this_run, null), 3, (java.lang.Object) null);
            r1 = o.fetchFont.onExtraCallback.IAuthTabCallbackDefault + 65;
            o.fetchFont.onExtraCallback.onExtraCallback = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            findResAndMsg findresandmsg;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 41;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                findresandmsg = (findResAndMsg) this.L$0;
                int i3 = 76 / 0;
            } else {
                findresandmsg = (findResAndMsg) this.L$0;
            }
        }

        /* renamed from: o.fetchFont$onExtraCallback$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static short[] onNavigationEvent;
            final /* synthetic */ String $key;
            final /* synthetic */ String $this_run;
            int label;
            final /* synthetic */ fetchFont this$0;
            private static final byte[] $$a = {59, -24, -77, -23};
            private static final int $$b = 182;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int asBinder = 0;
            private static int IAuthTabCallbackStub = 1;
            private static int onExtraCallback = -1261282833;
            private static int onExtraCallbackWithResult = -1538795448;
            private static int IAuthTabCallback = -746636219;
            private static byte[] onWarmupCompleted = {-25, 83, -91, 85, 107, -94, 109, -89, -68, -25, 32, 84, -65, 86, -13, AbstractSmartcard.BYTE_READ_MORE, 102, 110, AbstractSmartcard.BYTE_RESPONSE_LENGTH, AbstractSmartcard.BYTE_READ_MORE, -80, -91, -26, -93, 47, 87, -89, -79, -71, -89, -26, AbstractSmartcard.BYTE_READ_MORE, 102, 96, 96, -90, -70, 87, -1, -93, 41, 111, -12, 20, -72, -65, 106};

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String $$c(short s, byte b, short s2) {
                int i;
                int i2 = b * 2;
                int i3 = 115 - (s2 * 2);
                byte[] bArr = $$a;
                int i4 = s + 4;
                byte[] bArr2 = new byte[i2 + 1];
                if (bArr == null) {
                    int i5 = i3;
                    int i6 = 0;
                    i3 = i2;
                    i3 += i5;
                    i = i6;
                    bArr2[i] = (byte) i3;
                    i4++;
                    i6 = i + 1;
                    if (i == i2) {
                        return new String(bArr2, 0);
                    }
                    i5 = bArr[i4];
                    i3 += i5;
                    i = i6;
                    bArr2[i] = (byte) i3;
                    i4++;
                    i6 = i + 1;
                    if (i == i2) {
                    }
                } else {
                    i = 0;
                    bArr2[i] = (byte) i3;
                    i4++;
                    i6 = i + 1;
                    if (i == i2) {
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(fetchFont fetchfont, String str, String str2, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.this$0 = fetchfont;
                this.$key = str;
                this.$this_run = str2;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$key, this.$this_run, access13800Var);
                int i2 = asBinder + 9;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass2;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = asBinder + 115;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                int i4 = asBinder + 45;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = asBinder + 47;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass2 anonymousClass2Create = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    return anonymousClass2Create.invokeSuspend(unit);
                }
                anonymousClass2Create.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = asBinder + 23;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                if (this.label != 0) {
                    Object[] objArr = new Object[1];
                    a((short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 11), (byte) (KeyEvent.getDeadChar(0, 0) - 90), (-261456359) + Color.rgb(0, 0, 0), (-2000217066) - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) - 65, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
                fetchFont.onExtraCallback(this.this$0).onExtraCallback(this.$key, this.$this_run);
                Unit unit = Unit.INSTANCE;
                int i4 = asBinder + 71;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
                long j;
                int i4;
                int i5 = 2 % 2;
                TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 43424), 43 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 22439 - View.MeasureSpec.getMode(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    int i6 = -1;
                    int i7 = iIntValue == -1 ? 1 : 0;
                    if (i7 == 0) {
                        j = -4629411779493505016L;
                    } else {
                        byte[] bArr = onWarmupCompleted;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i8 = 0;
                            while (i8 < length) {
                                Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) i6;
                                    byte b3 = (byte) (b2 + 1);
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 12843), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 55, 2167 - Color.green(0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                i8++;
                                int i9 = $10 + 121;
                                $11 = i9 % 128;
                                int i10 = i9 % 2;
                                i6 = -1;
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            int i11 = $10 + 97;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                            byte[] bArr3 = onWarmupCompleted;
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getScrollBarSize() >> 8) + 42, 22439 - Color.argb(0, 0, 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                            int i13 = $10 + 83;
                            $11 = i13 % 128;
                            int i14 = i13 % 2;
                            j = -4629411779493505016L;
                        } else {
                            j = -4629411779493505016L;
                            iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                        }
                    }
                    if (iIntValue > 0) {
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ j)) + i7;
                        Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0') + 87, (ViewConfiguration.getTouchSlop() >> 8) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        byte[] bArr4 = onWarmupCompleted;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            for (int i15 = 0; i15 < length2; i15++) {
                                int i16 = $11 + 47;
                                $10 = i16 % 128;
                                int i17 = i16 % 2;
                                bArr5[i15] = (byte) (bArr4[i15] ^ (-4629411779493505016L));
                            }
                            bArr4 = bArr5;
                        }
                        boolean z = bArr4 != null;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                        while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                            if (z) {
                                int i18 = $10 + 91;
                                $11 = i18 % 128;
                                if (i18 % 2 == 0) {
                                    byte[] bArr6 = onWarmupCompleted;
                                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent;
                                    i4 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback / (((byte) (((byte) (bArr6[r8] / (-4629411779493505016L))) << s)) ^ b);
                                } else {
                                    byte[] bArr7 = onWarmupCompleted;
                                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                    i4 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b);
                                }
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i4;
                            } else {
                                short[] sArr = onNavigationEvent;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
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
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onNavigationEvent;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i4 = 0; i4 < length; i4++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 77 - TextUtils.getCapsMode("", 0, 0), 20953 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 75 - KeyEvent.normalizeMetaState(0), (KeyEvent.getMaxKeyCode() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i5 = 1052772399;
                if (IAuthTabCallback) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i6 = $11 + 113;
                        $10 = i6 % 128;
                        if (i6 % 2 != 0) {
                            cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback << 1) + defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] >>> iIntValue);
                            try {
                                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                                if (objOnExtraCallback3 == null) {
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 63, (ViewConfiguration.getFadingEdgeLength() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                                }
                                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 63 - Color.red(0), 12214 - (ViewConfiguration.getTapTimeout() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback4).invoke(null, objArr5);
                        }
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (onExtraCallbackWithResult) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                    char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 63, 12213 - TextUtils.lastIndexOf("", '0', 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback5).invoke(null, objArr6);
                        i5 = 1052772399;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i7 = $11 + 93;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                        int i9 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
                        cArr6[i8] = (char) (cArr2[iArr[0 / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] >> iIntValue);
                        i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                    } else {
                        cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                    }
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
                }
                objArr[0] = new String(cArr6);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f8  */
    @Override // o.setCompositionTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallback(@NotNull String str, @NotNull access13800<? super setProgressInternal> access13800Var) throws Throwable {
        onExtraCallbackWithResult onextracallbackwithresult;
        setProgressInternal setprogressinternal;
        String strOnExtraCallbackWithResult;
        Object objIAuthTabCallback;
        Object next;
        String str2;
        Object obj;
        boolean z;
        String str3 = str;
        int i = 2 % 2;
        int i2 = onTransact + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i4 = onextracallbackwithresult.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = IAuthTabCallback_Parcel + 125;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                onextracallbackwithresult.label = i4 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object obj2 = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onextracallbackwithresult.label;
        Object obj3 = null;
        if (i7 != 0) {
            int i8 = onTransact + 115;
            IAuthTabCallback_Parcel = i8 % 128;
            if (i8 % 2 != 0 ? i7 != 1 : i7 != 1) {
                if (i7 != 2) {
                    Object[] objArr = new Object[1];
                    a(47 - Color.alpha(0), 12 - TextUtils.getCapsMode("", 0, 0), new char[]{24, '\f', 65476, 7, 19, 22, 19, 25, 24, '\r', 18, '\t', 7, 5, 16, 16, 65476, 24, 19, 65476, 65483, 22, '\t', 23, 25, 17, '\t', 65483, 65476, 6, '\t', '\n', 19, 22, '\t', 65476, 65483, '\r', 18, 26, 19, 15, '\t', 65483, 65476, 27, '\r'}, false, TextUtils.indexOf((CharSequence) "", '0', 0) + 162, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                str2 = (String) onextracallbackwithresult.L$3;
                ResultKt.onNavigationEvent(obj2);
                return new setProgressInternal(str2, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.REMOTE);
            }
            setProgressInternal setprogressinternal2 = (setProgressInternal) onextracallbackwithresult.L$1;
            String str4 = (String) onextracallbackwithresult.L$0;
            ResultKt.onNavigationEvent(obj2);
            Object objOnNavigationEvent = ((kotlin.Result) obj2).onNavigationEvent();
            setprogressinternal = setprogressinternal2;
            str3 = str4;
            objIAuthTabCallback = objOnNavigationEvent;
        } else {
            ResultKt.onNavigationEvent(obj2);
            List<DefaultVar> list = this.onNavigationEvent;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    int i9 = IAuthTabCallback_Parcel + 3;
                    onTransact = i9 % 128;
                    if (i9 % 2 != 0) {
                        next = it.next();
                        int i10 = 4 / 0;
                        if (Intrinsics.areEqual(((DefaultVar) next).onExtraCallbackWithResult(), str3)) {
                            break;
                        }
                    } else {
                        next = it.next();
                        if (Intrinsics.areEqual(((DefaultVar) next).onExtraCallbackWithResult(), str3)) {
                            break;
                        }
                    }
                }
                DefaultVar defaultVar = (DefaultVar) next;
                if (defaultVar != null) {
                    setprogressinternal = new setProgressInternal((String) DefaultVar.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{defaultVar}, 1280857246, -1280857245, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback()), r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.CDN_DEFAULT);
                    if (!defaultVar.onExtraCallback()) {
                        this.onExtraCallback.onExtraCallbackWithResult(str3);
                        return setprogressinternal;
                    }
                }
                strOnExtraCallbackWithResult = this.IAuthTabCallbackDefault.onExtraCallbackWithResult(str3);
                if (strOnExtraCallbackWithResult == null) {
                    return new setProgressInternal(strOnExtraCallbackWithResult, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.SESSION_CACHE);
                }
                if (!this.asInterface.onNavigationEvent(str3)) {
                    onextracallbackwithresult.L$0 = str3;
                    onextracallbackwithresult.L$1 = setprogressinternal;
                    onextracallbackwithresult.label = 1;
                    objIAuthTabCallback = this.IAuthTabCallbackStub.IAuthTabCallback(new String[]{str}, onextracallbackwithresult);
                    if (objIAuthTabCallback != objOnWarmupCompleted) {
                    }
                    return objOnWarmupCompleted;
                }
                int i11 = onTransact + 111;
                int i12 = i11 % 128;
                IAuthTabCallback_Parcel = i12;
                if (i11 % 2 == 0) {
                    throw null;
                }
                if (setprogressinternal != null) {
                    return setprogressinternal;
                }
                int i13 = i12 + 49;
                onTransact = i13 % 128;
                if (i13 % 2 == 0) {
                    return setProgressInternal.Companion.onWarmupCompleted();
                }
                int i14 = 1 / 0;
                return setProgressInternal.Companion.onWarmupCompleted();
            }
            setprogressinternal = null;
            strOnExtraCallbackWithResult = this.IAuthTabCallbackDefault.onExtraCallbackWithResult(str3);
            if (strOnExtraCallbackWithResult == null) {
            }
        }
        if (kotlin.Result.onExtraCallback(objIAuthTabCallback)) {
            int i15 = IAuthTabCallback_Parcel + 115;
            onTransact = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 81 / 0;
            }
            obj = null;
        } else {
            obj = objIAuthTabCallback;
        }
        Map map = (Map) obj;
        if (map != null) {
            int i17 = onTransact + 117;
            IAuthTabCallback_Parcel = i17 % 128;
            if (i17 % 2 == 0) {
                obj3.hashCode();
                throw null;
            }
            String str5 = (String) map.get(str3);
            if (str5 != null) {
                onExtraCallback onextracallback = new onExtraCallback(str3, str5, null);
                onextracallbackwithresult.L$0 = access15400.onNavigationEvent(str3);
                onextracallbackwithresult.L$1 = access15400.onNavigationEvent(setprogressinternal);
                onextracallbackwithresult.L$2 = access15400.onNavigationEvent(objIAuthTabCallback);
                onextracallbackwithresult.L$3 = str5;
                onextracallbackwithresult.I$0 = 0;
                onextracallbackwithresult.label = 2;
                if (findRes.onExtraCallbackWithResult(onextracallback, onextracallbackwithresult) != objOnWarmupCompleted) {
                    str2 = str5;
                    return new setProgressInternal(str2, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.REMOTE);
                }
                return objOnWarmupCompleted;
            }
        }
        if (!(!kotlin.Result.onNavigationEvent(objIAuthTabCallback))) {
            int i18 = IAuthTabCallback_Parcel + 75;
            onTransact = i18 % 128;
            int i19 = i18 % 2;
            z = onExtraCallbackWithResult(str3);
        }
        if (z) {
            this.asInterface.IAuthTabCallback(str3);
        }
        String strOnNavigationEvent = this.onExtraCallback.onNavigationEvent(str3);
        if (strOnNavigationEvent != null) {
            if (z) {
                this.IAuthTabCallbackDefault.onNavigationEvent(str3, strOnNavigationEvent);
            }
            return new setProgressInternal(strOnNavigationEvent, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.PERSISTENT_CACHE);
        }
        if (setprogressinternal != null) {
            return setprogressinternal;
        }
        setProgressInternal setprogressinternalOnWarmupCompleted = setProgressInternal.Companion.onWarmupCompleted();
        int i20 = IAuthTabCallback_Parcel + 77;
        onTransact = i20 % 128;
        if (i20 % 2 == 0) {
            return setprogressinternalOnWarmupCompleted;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        char[] cArr2;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr3 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i6]), Integer.valueOf(asBinder)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - Color.blue(0)), 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 10278 - TextUtils.getOffsetAfter("", 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 12843), TextUtils.lastIndexOf("", '0', 0, 0) + 56, 2167 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i7 = $11 + 55;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
            } else {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i8 = $10 + 37;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Color.red(0)), 54 - Process.getGidForName(""), KeyEvent.normalizeMetaState(0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // o.setCompositionTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallback(@NotNull String[] strArr, @NotNull access13800<? super Map<String, setProgressInternal>> access13800Var) throws Throwable {
        asBinder asbinder;
        Set mutableSet;
        Map map;
        Object objOnNavigationEvent;
        Set setOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = access13800Var instanceof asBinder;
            obj.hashCode();
            throw null;
        }
        if (access13800Var instanceof asBinder) {
            asbinder = (asBinder) access13800Var;
            int i3 = asbinder.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                asbinder.label = i3 - 2147483648;
                int i4 = IAuthTabCallback_Parcel + 31;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            } else {
                asbinder = new asBinder(access13800Var);
                int i6 = IAuthTabCallback_Parcel + 95;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        Object obj2 = asbinder.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i8 = asbinder.label;
        if (i8 == 0) {
            ResultKt.onNavigationEvent(obj2);
            mutableSet = ArraysKt.toMutableSet(strArr);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<DefaultVar> list = this.onNavigationEvent;
            if (list != null) {
                ArrayList<DefaultVar> arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (mutableSet.contains(((DefaultVar) obj3).onExtraCallbackWithResult()) && (!r14.onExtraCallback())) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.onExtraCallback.onExtraCallbackWithResult(((DefaultVar) it.next()).onExtraCallbackWithResult());
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
                for (DefaultVar defaultVar : arrayList) {
                    Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(defaultVar.onExtraCallbackWithResult(), new setProgressInternal((String) DefaultVar.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{defaultVar}, 1280857246, -1280857245, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback()), r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.CDN_DEFAULT));
                    linkedHashMap2.put(pairIAuthTabCallback.getFirst(), pairIAuthTabCallback.getSecond());
                }
                linkedHashMap.putAll(linkedHashMap2);
                CollectionsKt.removeAll(mutableSet, linkedHashMap2.keySet());
                if (!mutableSet.isEmpty()) {
                }
                return linkedHashMap;
            }
            addAnimatorUpdateListener addanimatorupdatelistener = this.IAuthTabCallbackDefault;
            Set set = mutableSet;
            String[] strArr2 = (String[]) set.toArray(new String[0]);
            Map<String, String> mapOnExtraCallbackWithResult = addanimatorupdatelistener.onExtraCallbackWithResult((String[]) Arrays.copyOf(strArr2, strArr2.length));
            linkedHashMap.putAll(IAuthTabCallback(mapOnExtraCallbackWithResult, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.SESSION_CACHE));
            CollectionsKt.removeAll(set, mapOnExtraCallbackWithResult.keySet());
            if (!mutableSet.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int i9 = IAuthTabCallback_Parcel + 21;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
                for (Object obj4 : mutableSet) {
                    if (this.asInterface.onNavigationEvent((String) obj4)) {
                        linkedHashSet.add(obj4);
                    }
                }
                CollectionsKt.removeAll(set, linkedHashSet);
                if (!mutableSet.isEmpty()) {
                    clearComposition clearcomposition = this.IAuthTabCallbackStub;
                    String[] strArr3 = (String[]) set.toArray(new String[0]);
                    String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
                    asbinder.L$0 = access15400.onNavigationEvent(strArr);
                    asbinder.L$1 = mutableSet;
                    asbinder.L$2 = linkedHashMap;
                    asbinder.label = 1;
                    Object objIAuthTabCallback = clearcomposition.IAuthTabCallback(strArr4, asbinder);
                    if (objIAuthTabCallback == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    map = linkedHashMap;
                    objOnNavigationEvent = objIAuthTabCallback;
                }
            }
            return linkedHashMap;
        }
        int i11 = onTransact + 3;
        IAuthTabCallback_Parcel = i11 % 128;
        if (i11 % 2 != 0 ? i8 != 1 : i8 != 1) {
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getTapTimeout() >> 16) + 47, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11, new char[]{24, '\f', 65476, 7, 19, 22, 19, 25, 24, '\r', 18, '\t', 7, 5, 16, 16, 65476, 24, 19, 65476, 65483, 22, '\t', 23, 25, 17, '\t', 65483, 65476, 6, '\t', '\n', 19, 22, '\t', 65476, 65483, '\r', 18, 26, 19, 15, '\t', 65483, 65476, 27, '\r'}, false, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 161, objArr);
            throw new IllegalStateException(((String) objArr[0]).intern());
        }
        map = (Map) asbinder.L$2;
        mutableSet = (Set) asbinder.L$1;
        ResultKt.onNavigationEvent(obj2);
        objOnNavigationEvent = ((kotlin.Result) obj2).onNavigationEvent();
        Map<String, String> map2 = (Map) (kotlin.Result.onExtraCallback(objOnNavigationEvent) ? null : objOnNavigationEvent);
        if (map2 != null) {
            int i12 = onTransact + 47;
            IAuthTabCallback_Parcel = i12 % 128;
            int i13 = i12 % 2;
            map.putAll(IAuthTabCallback(map2, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.REMOTE));
            CollectionsKt.removeAll(mutableSet, map2.keySet());
            this.IAuthTabCallbackDefault.IAuthTabCallback(map2);
            this.onExtraCallback.onExtraCallbackWithResult(map2);
            if (mutableSet.isEmpty()) {
                return map;
            }
        }
        if (kotlin.Result.onNavigationEvent(objOnNavigationEvent)) {
            setOnExtraCallback = new LinkedHashSet();
            for (Object obj5 : mutableSet) {
                if (onExtraCallbackWithResult((String) obj5)) {
                    int i14 = onTransact + 87;
                    IAuthTabCallback_Parcel = i14 % 128;
                    if (i14 % 2 == 0) {
                        setOnExtraCallback.add(obj5);
                        throw null;
                    }
                    setOnExtraCallback.add(obj5);
                }
            }
        } else {
            setOnExtraCallback = clearFaultAdjacentMetadata.onExtraCallback();
        }
        Iterator it2 = setOnExtraCallback.iterator();
        while (it2.hasNext()) {
            int i15 = onTransact + 83;
            IAuthTabCallback_Parcel = i15 % 128;
            int i16 = i15 % 2;
            this.asInterface.IAuthTabCallback((String) it2.next());
        }
        fromRawRes fromrawres = this.onExtraCallback;
        Set set2 = mutableSet;
        String[] strArr5 = (String[]) set2.toArray(new String[0]);
        Map<String, String> mapOnNavigationEvent = fromrawres.onNavigationEvent((String[]) Arrays.copyOf(strArr5, strArr5.length));
        map.putAll(IAuthTabCallback(mapOnNavigationEvent, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.PERSISTENT_CACHE));
        CollectionsKt.removeAll(set2, mapOnNavigationEvent.keySet());
        addAnimatorUpdateListener addanimatorupdatelistener2 = this.IAuthTabCallbackDefault;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry<String, String> entry : mapOnNavigationEvent.entrySet()) {
            if (setOnExtraCallback.contains(entry.getKey())) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        addanimatorupdatelistener2.IAuthTabCallback(linkedHashMap3);
        return map;
    }

    @Override // o.setCompositionTask
    public void onExtraCallback(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.IAuthTabCallbackDefault.onNavigationEvent(str, str2);
        this.onExtraCallback.onExtraCallback(str, str2);
        int i4 = onTransact + 51;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setCompositionTask
    public String onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        List<DefaultVar> list = this.onNavigationEvent;
        Object obj = null;
        if (list != null) {
            int i2 = IAuthTabCallback_Parcel + 41;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                list.iterator();
                throw null;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i3 = IAuthTabCallback_Parcel + 5;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                Object next = it.next();
                DefaultVar defaultVar = (DefaultVar) next;
                if (!(!Intrinsics.areEqual(defaultVar.onExtraCallbackWithResult(), str)) && !defaultVar.onExtraCallback()) {
                    obj = next;
                    break;
                }
            }
            obj = (DefaultVar) obj;
        }
        if (obj != null) {
            String str2 = (String) DefaultVar.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{obj}, 1280857246, -1280857245, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
            if (str2 != null) {
                return str2;
            }
        }
        String strOnExtraCallbackWithResult = this.IAuthTabCallbackDefault.onExtraCallbackWithResult(str);
        int i5 = onTransact + 65;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return strOnExtraCallbackWithResult;
    }

    private final boolean onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        List<DefaultVar> list = this.onNavigationEvent;
        List<DefaultVar> list2 = list;
        if (list2 == null) {
            return false;
        }
        int i2 = IAuthTabCallback_Parcel + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (list2.isEmpty()) {
            return false;
        }
        List<DefaultVar> list3 = list;
        if (!(list3 instanceof Collection) || (!list3.isEmpty())) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((DefaultVar) it.next()).onExtraCallbackWithResult(), str)) {
                    return false;
                }
            }
        }
        int i4 = onTransact + 91;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.setCompositionTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onNavigationEvent(@NotNull String[] strArr, @NotNull access13800<? super Map<String, String>> access13800Var) throws Throwable {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i2 = iAuthTabCallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i2 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object objOnExtraCallback = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = iAuthTabCallback.label;
        if (i3 != 0) {
            int i4 = IAuthTabCallback_Parcel + 77;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            if (i3 != 1) {
                Object[] objArr = new Object[1];
                a(47 - TextUtils.indexOf("", "", 0, 0), 12 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{24, '\f', 65476, 7, 19, 22, 19, 25, 24, '\r', 18, '\t', 7, 5, 16, 16, 65476, 24, 19, 65476, 65483, 22, '\t', 23, 25, 17, '\t', 65483, 65476, 6, '\t', '\n', 19, 22, '\t', 65476, 65483, '\r', 18, 26, 19, 15, '\t', 65483, 65476, 27, '\r'}, false, KeyEvent.normalizeMetaState(0) + 161, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            iAuthTabCallback.L$0 = access15400.onNavigationEvent(strArr);
            iAuthTabCallback.label = 1;
            objOnExtraCallback = onExtraCallback(strArr2, (access13800<? super Map<String, setProgressInternal>>) iAuthTabCallback);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        Map map = (Map) objOnExtraCallback;
        LinkedHashMap linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(map.size()));
        int i6 = IAuthTabCallback_Parcel + 61;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((setProgressInternal) entry.getValue()).onNavigationEvent());
        }
        return linkedHashMap;
    }

    private final Map<String, setProgressInternal> IAuthTabCallback(Map<String, String> map, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg r8lambdaimi1kkyy494wcpjbjziyxabnqtg) {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), new setProgressInternal((String) entry.getValue(), r8lambdaimi1kkyy494wcpjbjziyxabnqtg));
            int i2 = IAuthTabCallback_Parcel + 63;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        }
        return linkedHashMap;
    }
}
