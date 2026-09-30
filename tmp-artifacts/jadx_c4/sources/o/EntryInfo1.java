package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.parse;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class EntryInfo1 implements applyTransparentTitle {
    private static int asInterface = 0;
    private static int onTransact = 1;
    private int IAuthTabCallback;
    private boolean onExtraCallback;
    private final Set<String> onExtraCallbackWithResult = new LinkedHashSet();
    private final setRubIn<Map<String, parse>> onNavigationEvent;
    private final getCornerRadius<Map<String, parse>> onWarmupCompleted;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = EntryInfo1.this.onWarmupCompleted(null, null, this);
            if (i3 == 0) {
                int i4 = 99 / 0;
            }
            return objOnWarmupCompleted;
        }
    }

    public EntryInfo1() {
        getCornerRadius<Map<String, parse>> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(access8100.onNavigationEvent());
        this.onWarmupCompleted = getcornerradiusOnNavigationEvent;
        this.onNavigationEvent = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent);
    }

    @Override // o.applyTransparentTitle
    public /* bridge */ IAnimation<parse> onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        IAnimation<parse> iAnimationOnExtraCallback = super.onExtraCallback(str);
        int i4 = onTransact + 47;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return iAnimationOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.applyTransparentTitle
    public setRubIn<Map<String, parse>> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        setRubIn<Map<String, parse>> setrubin = this.onNavigationEvent;
        int i5 = i3 + 55;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return setrubin;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0184, code lost:
    
        if (o.formatMsgs.onWarmupCompleted(500, r10) == r6) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // o.applyTransparentTitle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onWarmupCompleted(@NotNull List<String> list, @NotNull List<String> list2, @NotNull access13800<? super Unit> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        int i;
        long j;
        List<String> list3;
        Iterable iterableUntil;
        long j2;
        Iterator it;
        List<String> list4;
        int i2;
        int i3;
        onWarmupCompleted onwarmupcompleted2;
        int i4;
        List<String> list5;
        List<String> list6;
        long j3;
        onWarmupCompleted onwarmupcompleted3;
        List<String> list7 = list;
        int i5 = 2 % 2;
        if (!(access13800Var instanceof onWarmupCompleted)) {
            onwarmupcompleted = new onWarmupCompleted(access13800Var);
        } else {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i6 = onwarmupcompleted.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i6 - 2147483648;
                int i7 = onTransact + 125;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i9 = onwarmupcompleted.label;
        if (i9 == 0) {
            ResultKt.onNavigationEvent(obj);
            i = this.IAuthTabCallback + 1;
            this.IAuthTabCallback = i;
            onNavigationEvent(list7, new parse.IAuthTabCallbackStub(i));
            onwarmupcompleted.L$0 = list7;
            onwarmupcompleted.L$1 = access15400.onNavigationEvent(list2);
            onwarmupcompleted.I$0 = i;
            j = 1024;
            onwarmupcompleted.J$0 = 1024L;
            onwarmupcompleted.label = 1;
            if (formatMsgs.onWarmupCompleted(100L, onwarmupcompleted) != objOnWarmupCompleted) {
                list3 = list2;
            }
            return objOnWarmupCompleted;
        }
        if (i9 == 1) {
            j = onwarmupcompleted.J$0;
            int i10 = onwarmupcompleted.I$0;
            list3 = (List) onwarmupcompleted.L$1;
            List<String> list8 = (List) onwarmupcompleted.L$0;
            ResultKt.onNavigationEvent(obj);
            i = i10;
            list7 = list8;
        } else {
            if (i9 == 2) {
                int i11 = onwarmupcompleted.I$1;
                j2 = onwarmupcompleted.J$0;
                int i12 = onwarmupcompleted.I$0;
                it = (Iterator) onwarmupcompleted.L$3;
                iterableUntil = (Iterable) onwarmupcompleted.L$2;
                List<String> list9 = (List) onwarmupcompleted.L$1;
                list4 = (List) onwarmupcompleted.L$0;
                ResultKt.onNavigationEvent(obj);
                i3 = i11;
                i2 = i12;
                list3 = list9;
                while (true) {
                    if (!it.hasNext()) {
                        Object next = it.next();
                        int iIntValue = ((Number) next).intValue();
                        onwarmupcompleted3 = onwarmupcompleted;
                        onNavigationEvent(list4, new parse.onExtraCallback(i2, (iIntValue * j2) / 10, j2));
                        onwarmupcompleted3.L$0 = list4;
                        onwarmupcompleted3.L$1 = access15400.onNavigationEvent(list3);
                        onwarmupcompleted3.L$2 = access15400.onNavigationEvent(iterableUntil);
                        onwarmupcompleted3.L$3 = it;
                        onwarmupcompleted3.L$4 = access15400.onNavigationEvent(next);
                        onwarmupcompleted3.I$0 = i2;
                        onwarmupcompleted3.J$0 = j2;
                        onwarmupcompleted3.I$1 = i3;
                        onwarmupcompleted3.I$2 = iIntValue;
                        onwarmupcompleted3.I$3 = 0;
                        onwarmupcompleted3.label = 2;
                        if (formatMsgs.onWarmupCompleted(500L, onwarmupcompleted3) == objOnWarmupCompleted) {
                            break;
                        }
                        onwarmupcompleted = onwarmupcompleted3;
                    } else {
                        onwarmupcompleted2 = onwarmupcompleted;
                        onNavigationEvent(list4, new parse.onNavigationEvent(i2));
                        onwarmupcompleted2.L$0 = list4;
                        onwarmupcompleted2.L$1 = access15400.onNavigationEvent(list3);
                        onwarmupcompleted2.L$2 = null;
                        onwarmupcompleted2.L$3 = null;
                        onwarmupcompleted2.L$4 = null;
                        onwarmupcompleted2.I$0 = i2;
                        onwarmupcompleted2.J$0 = j2;
                        onwarmupcompleted2.label = 3;
                        if (formatMsgs.onWarmupCompleted(500L, onwarmupcompleted2) != objOnWarmupCompleted) {
                            i4 = i2;
                            list5 = list3;
                            list6 = list4;
                            j3 = j2;
                        }
                    }
                }
                return objOnWarmupCompleted;
            }
            int i13 = onTransact + 125;
            int i14 = i13 % 128;
            asInterface = i14;
            if (i13 % 2 == 0 ? i9 != 3 : i9 != 3) {
                if (i9 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i15 = i14 + 33;
                onTransact = i15 % 128;
                int i16 = i15 % 2;
                list6 = (List) onwarmupcompleted.L$0;
                ResultKt.onNavigationEvent(obj);
                if (this.onExtraCallback) {
                    onNavigationEvent(list6, new parse.IAuthTabCallback(-6, "Network error"));
                } else {
                    onNavigationEvent(list6, parse.asBinder.IAuthTabCallback);
                    Iterator<T> it2 = list6.iterator();
                    while (it2.hasNext()) {
                        this.onExtraCallbackWithResult.add((String) it2.next());
                    }
                }
                return Unit.INSTANCE;
            }
            j3 = onwarmupcompleted.J$0;
            int i17 = onwarmupcompleted.I$0;
            list5 = (List) onwarmupcompleted.L$1;
            List<String> list10 = (List) onwarmupcompleted.L$0;
            ResultKt.onNavigationEvent(obj);
            i4 = i17;
            onwarmupcompleted2 = onwarmupcompleted;
            list6 = list10;
            onNavigationEvent(list6, new parse.asInterface(i4));
            onwarmupcompleted2.L$0 = list6;
            onwarmupcompleted2.L$1 = access15400.onNavigationEvent(list5);
            onwarmupcompleted2.I$0 = i4;
            onwarmupcompleted2.J$0 = j3;
            onwarmupcompleted2.label = 4;
        }
        iterableUntil = RangesKt.until(0, 10);
        j2 = j;
        it = iterableUntil.iterator();
        list4 = list7;
        i2 = i;
        i3 = 0;
        while (true) {
            if (!it.hasNext()) {
            }
            onwarmupcompleted = onwarmupcompleted3;
        }
        return objOnWarmupCompleted;
    }

    @Override // o.applyTransparentTitle
    public Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Map map = (Map) this.onWarmupCompleted.IAuthTabCallback();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((parse) entry.getValue()).onExtraCallback()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        onNavigationEvent(CollectionsKt.toList(linkedHashMap.keySet()), parse.onWarmupCompleted.onWarmupCompleted);
        Object objOnWarmupCompleted = formatMsgs.onWarmupCompleted(100L, access13800Var);
        if (objOnWarmupCompleted != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i2 = asInterface;
        int i3 = i2 + 103;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 97;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return objOnWarmupCompleted;
        }
        throw null;
    }

    @Override // o.applyTransparentTitle
    public boolean onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult.contains(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        boolean zContains = this.onExtraCallbackWithResult.contains(str);
        int i3 = onTransact + 13;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return zContains;
    }

    private final void onNavigationEvent(List<String> list, parse parseVar) {
        getCornerRadius<Map<String, parse>> getcornerradius;
        Object objIAuthTabCallback;
        Map mapOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onTransact + 5;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            getcornerradius = this.onWarmupCompleted;
            int i3 = 27 / 0;
        } else {
            getcornerradius = this.onWarmupCompleted;
        }
        do {
            objIAuthTabCallback = getcornerradius.IAuthTabCallback();
            mapOnWarmupCompleted = access8100.onWarmupCompleted((Map) objIAuthTabCallback);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                int i4 = onTransact + 31;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                mapOnWarmupCompleted.put((String) it.next(), parseVar);
            }
        } while (!getcornerradius.onWarmupCompleted(objIAuthTabCallback, mapOnWarmupCompleted));
        int i6 = onTransact + 89;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }
}
