package o;

import androidx.compose.runtime.RememberObserver;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.qa;
import o.r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class qa implements RememberObserver {
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact;
    private final Function0<Map<String, Object>> IAuthTabCallback;
    private final String IAuthTabCallbackStub;
    private final r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI asBinder;
    private getPackageType asInterface;
    private final Lazy onExtraCallback;
    private final Map<r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E.IAuthTabCallback, Long> onExtraCallbackWithResult;
    private final Map<r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E.IAuthTabCallback, Long> onNavigationEvent;
    private final String onWarmupCompleted;

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries enumEntriesOnWarmupCompleted = onWarmupCompleted();
        int i4 = onTransact + 125;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return enumEntriesOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i2 | i3 | i4;
        int i8 = (~((~i4) | i3)) | i2;
        int i9 = ~((~i2) | i3);
        int i10 = i2 + i3 + i5 + (1132004924 * i) + ((-2047965933) * i6);
        int i11 = i10 * i10;
        int i12 = ((1650805025 * i2) - 289800192) + ((-1513965855) * i3) + ((-565098208) * i7) + (i8 * 565098208) + (565098208 * i9) + ((-2079064064) * i5) + (1823473664 * i) + (830210048 * i6) + ((-1143341056) * i11);
        int i13 = ((i2 * (-767560105)) - 1188649921) + (i3 * (-767559017)) + (i7 * (-544)) + (i8 * 544) + (i9 * 544) + (i5 * (-767559561)) + (i * 1544553956) + (i6 * (-1468578859)) + (i11 * (-2108293120));
        return i12 + ((i13 * i13) * (-2075787264)) != 1 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa)) {
            int i2 = onTransact + 51;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        qa qaVar = (qa) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, qaVar.onWarmupCompleted) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, qaVar.IAuthTabCallbackStub) || !Intrinsics.areEqual(this.asBinder, qaVar.asBinder)) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, qaVar.IAuthTabCallback)) {
            return true;
        }
        int i4 = onTransact + 53;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.onWarmupCompleted.hashCode() * 31) + this.IAuthTabCallbackStub.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
        int i4 = onTransact + 61;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return iHashCode;
    }

    public void onRemembered() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 83;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ComposablePerformanceStamper(tag=" + this.onWarmupCompleted + ", viewName=" + this.IAuthTabCallbackStub + ", tracker=" + this.asBinder + ", paramsBuilder=" + this.IAuthTabCallback + ")";
        int i2 = IAuthTabCallbackDefault + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qa(@NotNull String str, @NotNull String str2, @NotNull r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI r8lambdavvxsp2uzrjb9nt4ewemuyygvi, @NotNull Function0<? extends Map<String, ? extends Object>> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(r8lambdavvxsp2uzrjb9nt4ewemuyygvi, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.onWarmupCompleted = str;
        this.IAuthTabCallbackStub = str2;
        this.asBinder = r8lambdavvxsp2uzrjb9nt4ewemuyygvi;
        this.IAuthTabCallback = function0;
        this.onExtraCallbackWithResult = new LinkedHashMap();
        this.onNavigationEvent = new LinkedHashMap();
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.libs.performance.tracker.composable.ComposablePerformanceStamper$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 7;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                EnumEntries enumEntries = (EnumEntries) qa.onExtraCallback(new Object[0], ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -598420317, 598420317, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
                int i4 = onExtraCallbackWithResult + 55;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return enumEntries;
            }
        });
    }

    public static final /* synthetic */ r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI IAuthTabCallback(qa qaVar) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 107;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI r8lambdavvxsp2uzrjb9nt4ewemuyygvi = qaVar.asBinder;
        int i5 = i2 + 117;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return r8lambdavvxsp2uzrjb9nt4ewemuyygvi;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        qa qaVar = (qa) objArr[0];
        getPackageType getpackagetype = (getPackageType) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        Object obj = null;
        qaVar.asInterface = getpackagetype;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 45;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final List<r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E.IAuthTabCallback> asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onExtraCallback.getValue();
        if (i3 == 0) {
            return (List) value;
        }
        int i4 = 99 / 0;
        return (List) value;
    }

    private static final EnumEntries onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E.IAuthTabCallback> entries = r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E.IAuthTabCallback.getEntries();
        int i4 = onTransact + 65;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return entries;
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.clear();
        this.onNavigationEvent.clear();
        this.asInterface = null;
        int i4 = IAuthTabCallbackDefault + 119;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onAbandoned() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 97;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onForgotten() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult();
        int i4 = onTransact + 123;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onWarmupCompleted(@NotNull r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (this.onNavigationEvent.get(iAuthTabCallback) == null && this.onExtraCallbackWithResult.get(iAuthTabCallback) == null) {
            this.onExtraCallbackWithResult.put(iAuthTabCallback, Long.valueOf(System.nanoTime()));
            int i4 = onTransact + 33;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void onNavigationEvent(@NotNull r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (this.onExtraCallbackWithResult.get(iAuthTabCallback) != null) {
            int i2 = IAuthTabCallbackDefault + 41;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (this.onNavigationEvent.get(iAuthTabCallback) == null) {
                this.onNavigationEvent.put(iAuthTabCallback, Long.valueOf(System.nanoTime()));
                if (onExtraCallback()) {
                    int i4 = IAuthTabCallbackDefault + 99;
                    onTransact = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 64 / 0;
                        if (this.asInterface != null) {
                            return;
                        }
                    } else if (this.asInterface != null) {
                        return;
                    }
                    this.asInterface = maybeUpdateAnimatable.onNavigationEvent(this.asBinder.IAuthTabCallback(), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new onNavigationEvent(null), 2, (Object) null);
                }
            }
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = qa.this.new onNavigationEvent(access13800Var);
            int i2 = onExtraCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objOnExtraCallback;
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i3 = 69 / 0;
            } else {
                objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            }
            int i4 = onExtraCallbackWithResult + 105;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 91;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI r8lambdavvxsp2uzrjb9nt4ewemuyygviIAuthTabCallback = qa.IAuthTabCallback(qa.this);
                r8lambdaj_ZEHZUtEGCGnvR3aFdvIS3LTTg r8lambdaj_zehzutegcgnvr3afdvis3lttgOnNavigationEvent = qa.this.onNavigationEvent();
                this.label = 1;
                if (r8lambdavvxsp2uzrjb9nt4ewemuyygviIAuthTabCallback.onNavigationEvent(r8lambdaj_zehzutegcgnvr3afdvis3lttgOnNavigationEvent, this) == objOnWarmupCompleted) {
                    int i3 = onExtraCallbackWithResult + 91;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = onExtraCallbackWithResult + 119;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            qa.onExtraCallback(new Object[]{qa.this, null}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -56777576, 56777577, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
            return Unit.INSTANCE;
        }
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        List<r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E.IAuthTabCallback> listAsInterface = asInterface();
        if ((listAsInterface instanceof Collection) && listAsInterface.isEmpty()) {
            int i2 = onTransact + 39;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        for (r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E.IAuthTabCallback iAuthTabCallback : listAsInterface) {
            if (this.onExtraCallbackWithResult.get(iAuthTabCallback) == null) {
                return false;
            }
            int i4 = onTransact + 17;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            if (this.onNavigationEvent.get(iAuthTabCallback) == null) {
                return false;
            }
        }
        return true;
    }

    public final r8lambdaj_ZEHZUtEGCGnvR3aFdvIS3LTTg onNavigationEvent() {
        int i = 2 % 2;
        List<r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E.IAuthTabCallback> listAsInterface = asInterface();
        ArrayList arrayList = new ArrayList();
        for (r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E.IAuthTabCallback iAuthTabCallback : listAsInterface) {
            Long l = this.onExtraCallbackWithResult.get(iAuthTabCallback);
            Long l2 = this.onNavigationEvent.get(iAuthTabCallback);
            r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E r8lambdazv6ennjsahjcjtrw9ahkpo3dg2e = null;
            if (l != null) {
                int i2 = onTransact + 3;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                if (l2 != null && l.longValue() < l2.longValue()) {
                    r8lambdazv6ennjsahjcjtrw9ahkpo3dg2e = new r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E(iAuthTabCallback, l.longValue(), l2.longValue());
                    int i3 = IAuthTabCallbackDefault + 9;
                    onTransact = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            if (r8lambdazv6ennjsahjcjtrw9ahkpo3dg2e != null) {
                arrayList.add(r8lambdazv6ennjsahjcjtrw9ahkpo3dg2e);
                int i5 = IAuthTabCallbackDefault + 3;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        return new r8lambdaj_ZEHZUtEGCGnvR3aFdvIS3LTTg(System.currentTimeMillis(), this.onWarmupCompleted, arrayList, access8100.onWarmupCompleted((Map) this.IAuthTabCallback.invoke(), access8100.onNavigationEvent(getWrite.IAuthTabCallback("viewName", this.IAuthTabCallbackStub))));
    }

    public static /* synthetic */ EnumEntries IAuthTabCallback() {
        return (EnumEntries) onExtraCallback(new Object[0], ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -598420317, 598420317, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
    }
}
