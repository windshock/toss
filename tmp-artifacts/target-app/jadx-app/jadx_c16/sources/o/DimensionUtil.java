package o;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.getDensity;
import o.toJSONObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class DimensionUtil {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public static final class IAuthTabCallback<T> implements Comparator {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(Boolean.valueOf(((toJSONObject.IAuthTabCallback) t2).asBinder()), Boolean.valueOf(((toJSONObject.IAuthTabCallback) t).asBinder()));
            int i4 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 15 / 0;
            }
            return iIAuthTabCallback;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x011d, code lost:
    
        r2 = o.getWrite.IAuthTabCallback(java.lang.Integer.valueOf(r6), java.lang.Integer.valueOf(r8));
        r12 = ((java.lang.Number) r2.onExtraCallbackWithResult()).intValue();
        r11 = ((java.lang.Number) r2.IAuthTabCallback()).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013d, code lost:
    
        if (r12 < 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013f, code lost:
    
        r14.add(r12, o.toJSONObject.IAuthTabCallback.onNavigationEvent(r25, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, o.toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onNavigationEvent.onWarmupCompleted, false, false, (o.toJSONObject.onExtraCallback) null, 1919, (java.lang.Object) null));
        r0 = o.getDensity.onNavigationEvent.onWarmupCompleted(r24, false, IAuthTabCallback(r14), IAuthTabCallback(r13), (java.util.List) null, (java.util.List) null, (java.util.List) null, 57, (java.lang.Object) null);
        r1 = o.DimensionUtil.onExtraCallback + 23;
        o.DimensionUtil.IAuthTabCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0182, code lost:
    
        if (r11 < 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0184, code lost:
    
        r13.add(r11, o.toJSONObject.IAuthTabCallback.onNavigationEvent(r25, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, o.toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onExtraCallbackWithResult.onWarmupCompleted, false, false, (o.toJSONObject.onExtraCallback) null, 1919, (java.lang.Object) null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01bf, code lost:
    
        return o.getDensity.onNavigationEvent.onWarmupCompleted(r24, false, IAuthTabCallback(r14), IAuthTabCallback(r13), (java.util.List) null, (java.util.List) null, (java.util.List) null, 57, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final getDensity.onNavigationEvent onWarmupCompleted(@NotNull getDensity.onNavigationEvent onnavigationevent, @Nullable toJSONObject.IAuthTabCallback iAuthTabCallback, @Nullable String str) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        if (iAuthTabCallback != null && !Intrinsics.areEqual(iAuthTabCallback.IAuthTabCallbackStubProxy(), toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$IAuthTabCallback.onNavigationEvent)) {
            int i3 = onExtraCallback + 33;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                Intrinsics.areEqual(iAuthTabCallback.IAuthTabCallbackStubProxy(), toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onExtraCallback.onWarmupCompleted);
                throw null;
            }
            if (!Intrinsics.areEqual(iAuthTabCallback.IAuthTabCallbackStubProxy(), toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onExtraCallback.onWarmupCompleted)) {
                String strOnTransact = iAuthTabCallback.onTransact();
                if (str == null) {
                    int i4 = onExtraCallback + 89;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                } else if (!getByteArray.onNavigationEvent(strOnTransact, str)) {
                }
                int i6 = IAuthTabCallback + 23;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                List mutableList = CollectionsKt.toMutableList((List) getDensity.onNavigationEvent.onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -641708251, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{onnavigationevent}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, 641708252));
                List mutableList2 = CollectionsKt.toMutableList(onnavigationevent.asBinder());
                mutableList.remove(iAuthTabCallback);
                mutableList2.remove(iAuthTabCallback);
                int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                Iterator it = ((List) getDensity.onNavigationEvent.onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -641708251, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{onnavigationevent}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2, 641708252)).iterator();
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    i = -1;
                    if (!it.hasNext()) {
                        i9 = -1;
                        break;
                    }
                    String strOnTransact2 = ((toJSONObject.IAuthTabCallback) it.next()).onTransact();
                    if (str != null && getByteArray.onNavigationEvent(strOnTransact2, str)) {
                        int i10 = IAuthTabCallback + 17;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        break;
                    }
                    i9++;
                }
                Iterator it2 = onnavigationevent.asBinder().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    int i12 = IAuthTabCallback + 9;
                    onExtraCallback = i12 % 128;
                    if (i12 % 2 == 0) {
                        ((toJSONObject.IAuthTabCallback) it2.next()).onTransact();
                        obj.hashCode();
                        throw null;
                    }
                    String strOnTransact3 = ((toJSONObject.IAuthTabCallback) it2.next()).onTransact();
                    if (str != null) {
                        if (getByteArray.onNavigationEvent(strOnTransact3, str)) {
                            i = i8;
                            break;
                        }
                    } else {
                        int i13 = onExtraCallback + 123;
                        IAuthTabCallback = i13 % 128;
                        int i14 = i13 % 2;
                    }
                    i8++;
                }
            }
        }
        return onnavigationevent;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final getDensity.onNavigationEvent onNavigationEvent(@NotNull getDensity.onNavigationEvent onnavigationevent, @NotNull toJSONObject.IAuthTabCallback iAuthTabCallback, @NotNull getDensity$onNavigationEvent$onExtraCallback getdensity_onnavigationevent_onextracallback) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(getdensity_onnavigationevent_onextracallback, "");
        int i4 = onWarmupCompleted.onExtraCallbackWithResult[getdensity_onnavigationevent_onextracallback.ordinal()];
        if (i4 == 1) {
            List mutableList = CollectionsKt.toMutableList(onnavigationevent.asBinder());
            mutableList.remove(iAuthTabCallback);
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            listCreateListBuilder.addAll((List) getDensity.onNavigationEvent.onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -641708251, iIAuthTabCallback2, new Object[]{onnavigationevent}, iIAuthTabCallback3, iIAuthTabCallback, 641708252));
            listCreateListBuilder.add(toJSONObject.IAuthTabCallback.onNavigationEvent(iAuthTabCallback, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onNavigationEvent.onWarmupCompleted, false, false, (toJSONObject.onExtraCallback) null, 1919, (Object) null));
            Unit unit = Unit.INSTANCE;
            getDensity.onNavigationEvent onnavigationeventOnWarmupCompleted = getDensity.onNavigationEvent.onWarmupCompleted(onnavigationevent, false, IAuthTabCallback(CollectionsKt.build(listCreateListBuilder)), mutableList, (List) null, (List) null, (List) null, 57, (Object) null);
            int i5 = IAuthTabCallback + 59;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationeventOnWarmupCompleted;
        }
        if (i4 != 2) {
            int i7 = IAuthTabCallback + 95;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            if (i4 == 3 || i4 == 4) {
                return onnavigationevent;
            }
            throw new NoWhenBranchMatchedException();
        }
        int iIAuthTabCallback4 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback5 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback6 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        List mutableList2 = CollectionsKt.toMutableList((List) getDensity.onNavigationEvent.onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -641708251, iIAuthTabCallback5, new Object[]{onnavigationevent}, iIAuthTabCallback6, iIAuthTabCallback4, 641708252));
        mutableList2.remove(iAuthTabCallback);
        List listCreateListBuilder2 = CollectionsKt.createListBuilder();
        listCreateListBuilder2.addAll(onnavigationevent.asBinder());
        listCreateListBuilder2.add(toJSONObject.IAuthTabCallback.onNavigationEvent(iAuthTabCallback, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onExtraCallbackWithResult.onWarmupCompleted, false, false, (toJSONObject.onExtraCallback) null, 1919, (Object) null));
        Unit unit2 = Unit.INSTANCE;
        return getDensity.onNavigationEvent.onWarmupCompleted(onnavigationevent, false, mutableList2, IAuthTabCallback(CollectionsKt.build(listCreateListBuilder2)), (List) null, (List) null, (List) null, 57, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b1, code lost:
    
        return o.getDensity.onNavigationEvent.onWarmupCompleted(r14, false, r6, IAuthTabCallback(r0), r8, r9, r10, 1, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b2, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b5, code lost:
    
        if ((r2 instanceof o.toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onNavigationEvent) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b7, code lost:
    
        r12 = o.SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        r9 = o.SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        r11 = o.SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        r0 = kotlin.collections.CollectionsKt.toMutableList((java.util.List) o.getDensity.onNavigationEvent.onWarmupCompleted(o.SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -641708251, r9, new java.lang.Object[]{r14}, r11, r12, 641708252));
        r0.add(r15);
        r3 = kotlin.collections.CollectionsKt.toMutableList(r14.asBinder());
        r4 = kotlin.collections.CollectionsKt.toMutableList(r14.onNavigationEvent());
        r5 = kotlin.collections.CollectionsKt.toMutableList(r14.onTransact());
        r3.remove(r15);
        r4.remove(r15);
        r5.remove(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0113, code lost:
    
        return o.getDensity.onNavigationEvent.onWarmupCompleted(r14, false, IAuthTabCallback(r0), r3, r4, r5, r6, 1, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x011a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, o.toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$IAuthTabCallback.onNavigationEvent) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x011c, code lost:
    
        r0 = kotlin.collections.CollectionsKt.toMutableList(r14.onNavigationEvent());
        r0.add(r15);
        r3 = kotlin.collections.CollectionsKt.toMutableList(r14.asBinder());
        r12 = o.SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        r9 = o.SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        r11 = o.SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        r2 = kotlin.collections.CollectionsKt.toMutableList((java.util.List) o.getDensity.onNavigationEvent.onWarmupCompleted(o.SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -641708251, r9, new java.lang.Object[]{r14}, r11, r12, 641708252));
        r5 = kotlin.collections.CollectionsKt.toMutableList(r14.onTransact());
        r3.remove(r15);
        r2.remove(r15);
        r5.remove(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0178, code lost:
    
        return o.getDensity.onNavigationEvent.onWarmupCompleted(r14, false, r2, r3, IAuthTabCallback(r0), r5, r6, 1, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x017f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, o.toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onExtraCallback.onWarmupCompleted) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0181, code lost:
    
        r0 = kotlin.collections.CollectionsKt.toMutableList(r14.onTransact());
        r0.add(r15);
        r3 = kotlin.collections.CollectionsKt.toMutableList(r14.asBinder());
        r12 = o.SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        r9 = o.SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        r11 = o.SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        r2 = kotlin.collections.CollectionsKt.toMutableList((java.util.List) o.getDensity.onNavigationEvent.onWarmupCompleted(o.SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -641708251, r9, new java.lang.Object[]{r14}, r11, r12, 641708252));
        r4 = kotlin.collections.CollectionsKt.toMutableList(r14.onNavigationEvent());
        r3.remove(r15);
        r2.remove(r15);
        r4.remove(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01dd, code lost:
    
        return o.getDensity.onNavigationEvent.onWarmupCompleted(r14, false, r2, r3, r4, IAuthTabCallback(r0), r6, 1, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01e0, code lost:
    
        if ((r2 instanceof o.toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onWarmupCompleted) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01e2, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01e8, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        if ((r2 instanceof o.toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onExtraCallbackWithResult) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
    
        if ((r2 instanceof o.toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onExtraCallbackWithResult) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        r10 = r1;
        r1 = o.DimensionUtil.IAuthTabCallback + 55;
        o.DimensionUtil.onExtraCallback = r1 % 128;
        r1 = r1 % 2;
        r0 = kotlin.collections.CollectionsKt.toMutableList(r14.asBinder());
        r0.add(r15);
        r6 = o.SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        r3 = o.SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        r5 = o.SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        r6 = kotlin.collections.CollectionsKt.toMutableList((java.util.List) o.getDensity.onNavigationEvent.onWarmupCompleted(o.SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -641708251, r3, new java.lang.Object[]{r14}, r5, r6, 641708252));
        r8 = kotlin.collections.CollectionsKt.toMutableList(r14.onNavigationEvent());
        r9 = kotlin.collections.CollectionsKt.toMutableList(r14.onTransact());
        r6.remove(r15);
        r8.remove(r15);
        r9.remove(r15);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final getDensity.onNavigationEvent onExtraCallbackWithResult(@NotNull getDensity.onNavigationEvent onnavigationevent, @NotNull toJSONObject.IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        List mutableList;
        toJSONObject.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallbackStubProxy;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            mutableList = CollectionsKt.toMutableList(onnavigationevent.onExtraCallbackWithResult());
            mutableList.remove(iAuthTabCallback);
            onextracallbackwithresultIAuthTabCallbackStubProxy = iAuthTabCallback.IAuthTabCallbackStubProxy();
            int i3 = 82 / 0;
        } else {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            mutableList = CollectionsKt.toMutableList(onnavigationevent.onExtraCallbackWithResult());
            mutableList.remove(iAuthTabCallback);
            onextracallbackwithresultIAuthTabCallbackStubProxy = iAuthTabCallback.IAuthTabCallbackStubProxy();
        }
    }

    public static final getDensity.onNavigationEvent IAuthTabCallback(@NotNull getDensity.onNavigationEvent onnavigationevent, @NotNull toJSONObject.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (iAuthTabCallback.IAuthTabCallbackStubProxy() instanceof toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onWarmupCompleted) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 89;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 94 / 0;
            }
            int i5 = i2 + 113;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return onnavigationevent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List mutableList = CollectionsKt.toMutableList(onnavigationevent.onExtraCallbackWithResult());
        mutableList.add(0, iAuthTabCallback);
        List mutableList2 = CollectionsKt.toMutableList(onnavigationevent.asBinder());
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        List mutableList3 = CollectionsKt.toMutableList((List) getDensity.onNavigationEvent.onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -641708251, iIAuthTabCallback2, new Object[]{onnavigationevent}, iIAuthTabCallback3, iIAuthTabCallback, 641708252));
        List mutableList4 = CollectionsKt.toMutableList(onnavigationevent.onNavigationEvent());
        List mutableList5 = CollectionsKt.toMutableList(onnavigationevent.onTransact());
        mutableList2.remove(iAuthTabCallback);
        mutableList3.remove(iAuthTabCallback);
        mutableList4.remove(iAuthTabCallback);
        mutableList5.remove(iAuthTabCallback);
        return getDensity.onNavigationEvent.onWarmupCompleted(onnavigationevent, false, mutableList3, mutableList2, mutableList4, mutableList5, mutableList, 1, (Object) null);
    }

    private static final List<toJSONObject.IAuthTabCallback> IAuthTabCallback(List<toJSONObject.IAuthTabCallback> list) {
        int i = 2 % 2;
        List<toJSONObject.IAuthTabCallback> listSortedWith = CollectionsKt.sortedWith(list, new IAuthTabCallback());
        int i2 = onExtraCallback + 93;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 72 / 0;
        }
        return listSortedWith;
    }
}
