package o;

import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.getStreamSharingChildren;
import o.getViewTypeCount;
import o.putBooleanArray;
import o.r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY;
import o.w6;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class w6 implements component5 {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private final getViewTypeCount.onExtraCallback IAuthTabCallback;
    private final putCharSequenceArray asInterface;
    private final getViewTypeCount.onExtraCallback onExtraCallback;
    private final getViewTypeCount.onExtraCallback onExtraCallbackWithResult;
    private final getViewTypeCount.asInterface onNavigationEvent;
    private final boolean onTransact;
    private final getViewTypeCount.onExtraCallback onWarmupCompleted;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int onExtraCallback = 0;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[getViewTypeCount.asInterface.IAuthTabCallback.values().length];
            try {
                iArr[getViewTypeCount.asInterface.IAuthTabCallback.Right.ordinal()] = 1;
                int i = onWarmupCompleted + 99;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getViewTypeCount.asInterface.IAuthTabCallback.Center.ordinal()] = 2;
                int i4 = onWarmupCompleted + 85;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(w6 w6Var, component4 component4Var, int i, boolean z, List list, int i2, List list2, List list3, int i3, int i4, int i5, int i6, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i7 = 2 % 2;
        int i8 = IAuthTabCallbackDefault + 13;
        asBinder = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            onExtraCallback(w6Var, component4Var, i, z, list, i2, list2, list3, i3, i4, i5, i6, onextracallbackwithresult);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(w6Var, component4Var, i, z, list, i2, list2, list3, i3, i4, i5, i6, onextracallbackwithresult);
        int i9 = asBinder + 49;
        IAuthTabCallbackDefault = i9 % 128;
        if (i9 % 2 == 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public w6(@NotNull putCharSequenceArray putcharsequencearray, boolean z, @NotNull getViewTypeCount.onExtraCallback onextracallback, @NotNull getViewTypeCount.onExtraCallback onextracallback2, @NotNull getViewTypeCount.onExtraCallback onextracallback3, @NotNull getViewTypeCount.onExtraCallback onextracallback4, @NotNull getViewTypeCount.asInterface asinterface) {
        Intrinsics.checkNotNullParameter(putcharsequencearray, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(onextracallback2, "");
        Intrinsics.checkNotNullParameter(onextracallback3, "");
        Intrinsics.checkNotNullParameter(onextracallback4, "");
        Intrinsics.checkNotNullParameter(asinterface, "");
        this.asInterface = putcharsequencearray;
        this.onTransact = z;
        this.onWarmupCompleted = onextracallback;
        this.onExtraCallbackWithResult = onextracallback2;
        this.onExtraCallback = onextracallback3;
        this.IAuthTabCallback = onextracallback4;
        this.onNavigationEvent = asinterface;
    }

    private static final long onWarmupCompleted(long j, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 85;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        long jIAuthTabCallback = VirtualCameraCaptureResult.IAuthTabCallback(j, 0, RangesKt.coerceAtLeast(i, 0), 0, 0, 12, (Object) null);
        int i5 = IAuthTabCallbackDefault + 105;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return jIAuthTabCallback;
    }

    public final Pair<List<getStreamSharingChildren>, List<getStreamSharingChildren>> onExtraCallback(@NotNull component4 component4Var, @NotNull List<? extends component7> list, @NotNull List<? extends component7> list2, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList;
        ArrayList arrayList2;
        Integer numValueOf;
        int i;
        Integer numValueOf2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(component4Var, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        int iAsInterface = VirtualCameraCaptureResult.asInterface(j);
        int iIAuthTabCallbackDefault = VirtualCameraCaptureResult.IAuthTabCallbackDefault(j);
        int iOnExtraCallbackWithResult = component4Var.onExtraCallbackWithResult(this.onNavigationEvent.onNavigationEvent());
        int iOnExtraCallbackWithResult2 = component4Var.onExtraCallbackWithResult(w3a.onWarmupCompleted.onWarmupCompleted());
        int iCoerceAtLeast = RangesKt.coerceAtLeast((iAsInterface - iOnExtraCallbackWithResult) - iOnExtraCallbackWithResult2, 0);
        if (!list.isEmpty()) {
            int i3 = asBinder + 7;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            if (!list2.isEmpty()) {
                int i5 = asBinder + 85;
                IAuthTabCallbackDefault = i5 % 128;
                try {
                } catch (Throwable th) {
                    Result.Companion companion = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (i5 % 2 != 0) {
                    Result.Companion companion2 = Result.Companion;
                    list.isEmpty();
                    throw null;
                }
                Result.Companion companion3 = Result.Companion;
                if (list.isEmpty()) {
                    numValueOf2 = null;
                } else {
                    numValueOf2 = Integer.valueOf(list.get(0).onExtraCallbackWithResult(iIAuthTabCallbackDefault));
                    int lastIndex = CollectionsKt.getLastIndex(list);
                    if (lastIndex > 0) {
                        int i6 = asBinder + 23;
                        IAuthTabCallbackDefault = i6 % 128;
                        int i7 = i6 % 2 != 0 ? 0 : 1;
                        while (true) {
                            Integer numValueOf3 = Integer.valueOf(list.get(i7).onExtraCallbackWithResult(iIAuthTabCallbackDefault));
                            if (numValueOf3.compareTo(numValueOf2) > 0) {
                                numValueOf2 = numValueOf3;
                            }
                            if (i7 == lastIndex) {
                                break;
                            }
                            i7++;
                        }
                    }
                }
                obj = Result.constructor-impl(numValueOf2);
                if (Result.onExtraCallback(obj)) {
                    obj = null;
                }
                Integer num = (Integer) obj;
                try {
                    Result.Companion companion4 = Result.Companion;
                    if (list2.isEmpty()) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(list2.get(0).onExtraCallbackWithResult(iIAuthTabCallbackDefault));
                        int lastIndex2 = CollectionsKt.getLastIndex(list2);
                        if (lastIndex2 > 0) {
                            int i8 = 1;
                            while (true) {
                                Integer numValueOf4 = Integer.valueOf(list2.get(i8).onExtraCallbackWithResult(iIAuthTabCallbackDefault));
                                if (numValueOf4.compareTo(numValueOf) > 0) {
                                    int i9 = asBinder + 53;
                                    i = iIAuthTabCallbackDefault;
                                    IAuthTabCallbackDefault = i9 % 128;
                                    int i10 = i9 % 2;
                                    numValueOf = numValueOf4;
                                } else {
                                    i = iIAuthTabCallbackDefault;
                                }
                                if (i8 == lastIndex2) {
                                    break;
                                }
                                i8++;
                                iIAuthTabCallbackDefault = i;
                            }
                        }
                    }
                    obj2 = Result.constructor-impl(numValueOf);
                } catch (Throwable th2) {
                    Result.Companion companion5 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
                }
                if (Result.onExtraCallback(obj2)) {
                    int i11 = asBinder + 71;
                    IAuthTabCallbackDefault = i11 % 128;
                    int i12 = i11 % 2;
                    obj3 = null;
                } else {
                    obj3 = obj2;
                }
                Integer num2 = (Integer) obj3;
                if (num2 != null && num != null) {
                    int iCoerceAtLeast2 = RangesKt.coerceAtLeast((iAsInterface - num.intValue()) - iOnExtraCallbackWithResult2, 0);
                    if (num2.intValue() < iOnExtraCallbackWithResult) {
                        iOnExtraCallbackWithResult = num2.intValue();
                    } else if (iCoerceAtLeast2 >= iOnExtraCallbackWithResult) {
                        int i13 = asBinder + 27;
                        IAuthTabCallbackDefault = i13 % 128;
                        int i14 = i13 % 2;
                        iOnExtraCallbackWithResult = iCoerceAtLeast2;
                    }
                    arrayList = new ArrayList(list.size());
                    int size = list.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        arrayList.add(list.get(i15).onExtraCallback(onWarmupCompleted(j, (iAsInterface - iOnExtraCallbackWithResult) - iOnExtraCallbackWithResult2)));
                    }
                    arrayList2 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        arrayList2.add(list2.get(i16).onExtraCallback(onWarmupCompleted(j, iOnExtraCallbackWithResult)));
                    }
                } else if (num != null) {
                    int i17 = asBinder + 13;
                    IAuthTabCallbackDefault = i17 % 128;
                    int i18 = i17 % 2;
                    int iCoerceAtLeast3 = RangesKt.coerceAtLeast((iAsInterface - num.intValue()) - iOnExtraCallbackWithResult2, 0);
                    if (iCoerceAtLeast3 >= iOnExtraCallbackWithResult) {
                        int i19 = IAuthTabCallbackDefault + 63;
                        asBinder = i19 % 128;
                        int i20 = i19 % 2;
                        iOnExtraCallbackWithResult = iCoerceAtLeast3;
                    }
                    arrayList = new ArrayList(list.size());
                    int size3 = list.size();
                    for (int i21 = 0; i21 < size3; i21++) {
                        arrayList.add(list.get(i21).onExtraCallback(onWarmupCompleted(j, (iAsInterface - iOnExtraCallbackWithResult) - iOnExtraCallbackWithResult2)));
                    }
                    arrayList2 = new ArrayList(list2.size());
                    int size4 = list2.size();
                    for (int i22 = 0; i22 < size4; i22++) {
                        arrayList2.add(list2.get(i22).onExtraCallback(onWarmupCompleted(j, iOnExtraCallbackWithResult)));
                    }
                } else if (num2 != null) {
                    int iCoerceAtLeast4 = RangesKt.coerceAtLeast((iAsInterface - num2.intValue()) - iOnExtraCallbackWithResult2, 0);
                    if (iCoerceAtLeast4 >= iCoerceAtLeast) {
                        iCoerceAtLeast = iCoerceAtLeast4;
                    }
                    arrayList = new ArrayList(list.size());
                    int size5 = list.size();
                    for (int i23 = 0; i23 < size5; i23++) {
                        arrayList.add(list.get(i23).onExtraCallback(onWarmupCompleted(j, iCoerceAtLeast)));
                    }
                    arrayList2 = new ArrayList(list2.size());
                    int size6 = list2.size();
                    for (int i24 = 0; i24 < size6; i24++) {
                        arrayList2.add(list2.get(i24).onExtraCallback(onWarmupCompleted(j, (iAsInterface - iCoerceAtLeast) - iOnExtraCallbackWithResult2)));
                    }
                } else {
                    arrayList = new ArrayList(list.size());
                    int size7 = list.size();
                    for (int i25 = 0; i25 < size7; i25++) {
                        arrayList.add(list.get(i25).onExtraCallback(onWarmupCompleted(j, iCoerceAtLeast)));
                    }
                    arrayList2 = new ArrayList(list2.size());
                    int size8 = list2.size();
                    for (int i26 = 0; i26 < size8; i26++) {
                        arrayList2.add(list2.get(i26).onExtraCallback(onWarmupCompleted(j, iOnExtraCallbackWithResult)));
                    }
                }
                return getWrite.IAuthTabCallback(arrayList, arrayList2);
            }
        }
        ArrayList arrayList3 = new ArrayList(list.size());
        int size9 = list.size();
        for (int i27 = 0; i27 < size9; i27++) {
            arrayList3.add(list.get(i27).onExtraCallback(j));
        }
        ArrayList arrayList4 = new ArrayList(list2.size());
        int size10 = list2.size();
        for (int i28 = 0; i28 < size10; i28++) {
            arrayList4.add(list2.get(i28).onExtraCallback(j));
        }
        return getWrite.IAuthTabCallback(arrayList3, arrayList4);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public component8 onExtraCallbackWithResult(@NotNull final component4 component4Var, @NotNull List<? extends component7> list, long j) throws NoWhenBranchMatchedException {
        int i;
        List arrayList;
        List arrayList2;
        final List list2;
        final List list3;
        final boolean z;
        final int i2;
        int iMax;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(component4Var, "");
        Intrinsics.checkNotNullParameter(list, "");
        List<? extends component7> listEmptyList = CollectionsKt.emptyList();
        List<? extends component7> listEmptyList2 = CollectionsKt.emptyList();
        List listEmptyList3 = CollectionsKt.emptyList();
        int size = list.size();
        List<? extends component7> listListOf = listEmptyList;
        List listListOf2 = listEmptyList3;
        List<? extends component7> listListOf3 = listEmptyList2;
        int i4 = 0;
        while (i4 < size) {
            component7 component7Var = list.get(i4);
            Object objOnExtraCallbackWithResult = ImmediateFutureImmediateSuccessfulFuture.onExtraCallbackWithResult(component7Var);
            if (objOnExtraCallbackWithResult == getViewTypeCount.asBinder.Center) {
                listListOf = CollectionsKt.listOf(component7Var);
            } else if (objOnExtraCallbackWithResult == getViewTypeCount.asBinder.Right) {
                listListOf3 = CollectionsKt.listOf(component7Var);
            } else if (objOnExtraCallbackWithResult == getViewTypeCount.asBinder.Left) {
                listListOf2 = CollectionsKt.listOf(component7Var);
            }
            i4++;
            int i5 = IAuthTabCallbackDefault + 115;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
        int iAsInterface = VirtualCameraCaptureResult.asInterface(j);
        VirtualCameraCaptureResult.IAuthTabCallbackDefault(j);
        Triple<Integer, Integer, List<getStreamSharingChildren>> tripleOnExtraCallback = lExternalSyntheticLambda6.onExtraCallback(listListOf2, r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, iAsInterface, 0, 0, 13, (Object) null));
        final int iIntValue = ((Number) tripleOnExtraCallback.onExtraCallbackWithResult()).intValue();
        int iIntValue2 = ((Number) tripleOnExtraCallback.onExtraCallback()).intValue();
        final List list4 = (List) tripleOnExtraCallback.IAuthTabCallback();
        final int iCoerceAtLeast = RangesKt.coerceAtLeast(iAsInterface - iIntValue, 0);
        if (this.onTransact) {
            arrayList2 = new ArrayList(listListOf.size());
            int size2 = listListOf.size();
            int i7 = 0;
            while (i7 < size2) {
                int i8 = IAuthTabCallbackDefault + 43;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
                arrayList2.add(listListOf.get(i7).onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, iCoerceAtLeast, 0, 0, 13, (Object) null)));
                i7++;
                iIntValue2 = iIntValue2;
            }
            i = iIntValue2;
            arrayList = new ArrayList(listListOf3.size());
            int size3 = listListOf3.size();
            for (int i10 = 0; i10 < size3; i10++) {
                int i11 = asBinder + 123;
                IAuthTabCallbackDefault = i11 % 128;
                int i12 = i11 % 2;
                arrayList.add(listListOf3.get(i10).onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, iCoerceAtLeast, 0, 0, 13, (Object) null)));
            }
        } else {
            i = iIntValue2;
            long jIAuthTabCallback = VirtualCameraCaptureResult.IAuthTabCallback(j, 0, iCoerceAtLeast, 0, 0, 12, (Object) null);
            int i13 = IAuthTabCallback.onNavigationEvent[this.onNavigationEvent.onExtraCallbackWithResult().ordinal()];
            if (i13 != 1) {
                int i14 = asBinder + 119;
                IAuthTabCallbackDefault = i14 % 128;
                if (i14 % 2 == 0 ? i13 != 2 : i13 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                Pair<List<getStreamSharingChildren>, List<getStreamSharingChildren>> pairOnExtraCallback = onExtraCallback(component4Var, listListOf, listListOf3, jIAuthTabCallback);
                List list5 = (List) pairOnExtraCallback.getFirst();
                list2 = (List) pairOnExtraCallback.getSecond();
                list3 = list5;
                final int iIAuthTabCallback = y1g.IAuthTabCallback(list3);
                int iIAuthTabCallback2 = y1g.IAuthTabCallback(list2);
                if (!this.onTransact) {
                    int i15 = IAuthTabCallbackDefault + 69;
                    int i16 = i15 % 128;
                    asBinder = i16;
                    if (i15 % 2 == 0) {
                        throw null;
                    }
                    if (iIAuthTabCallback2 > 0) {
                        int i17 = i16 + 93;
                        int i18 = i17 % 128;
                        IAuthTabCallbackDefault = i18;
                        int i19 = i17 % 2;
                        if (iIAuthTabCallback > 0) {
                            int i20 = i18 + 85;
                            asBinder = i20 % 128;
                            int i21 = i20 % 2;
                            z = true;
                        } else {
                            int i22 = asBinder + 85;
                            IAuthTabCallbackDefault = i22 % 128;
                            if (i22 % 2 != 0) {
                                int i23 = 2 / 3;
                            }
                            z = false;
                        }
                    }
                }
                final int iOnExtraCallbackWithResult = component4Var.onExtraCallbackWithResult(w3a.onWarmupCompleted.IAuthTabCallbackStub());
                if (z) {
                    i2 = i;
                    iMax = Math.max(i2, Math.max(iIAuthTabCallback, iIAuthTabCallback2));
                } else {
                    i2 = i;
                    iMax = Math.max(i2, iIAuthTabCallback) + iIAuthTabCallback2 + iOnExtraCallbackWithResult;
                }
                final int i24 = iMax;
                return component4.IAuthTabCallback(component4Var, iAsInterface, iMax, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1MeasurePolicy$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj) {
                        int i25 = 2 % 2;
                        int i26 = onExtraCallbackWithResult + 109;
                        IAuthTabCallback = i26 % 128;
                        int i27 = i26 % 2;
                        Unit unitOnNavigationEvent = w6.onNavigationEvent(this.f$0, component4Var, iIAuthTabCallback, z, list4, i2, list3, list2, i24, iIntValue, iOnExtraCallbackWithResult, iCoerceAtLeast, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                        int i28 = IAuthTabCallback + 81;
                        onExtraCallbackWithResult = i28 % 128;
                        int i29 = i28 % 2;
                        return unitOnNavigationEvent;
                    }
                }, 4, (Object) null);
            }
            Pair<List<getStreamSharingChildren>, List<getStreamSharingChildren>> pairOnExtraCallback2 = onExtraCallback(component4Var, listListOf3, listListOf, jIAuthTabCallback);
            arrayList = (List) pairOnExtraCallback2.getFirst();
            arrayList2 = (List) pairOnExtraCallback2.getSecond();
        }
        list3 = arrayList2;
        list2 = arrayList;
        final int iIAuthTabCallback3 = y1g.IAuthTabCallback(list3);
        int iIAuthTabCallback22 = y1g.IAuthTabCallback(list2);
        if (!this.onTransact) {
        }
        final int iOnExtraCallbackWithResult2 = component4Var.onExtraCallbackWithResult(w3a.onWarmupCompleted.IAuthTabCallbackStub());
        if (z) {
        }
        final int i242 = iMax;
        return component4.IAuthTabCallback(component4Var, iAsInterface, iMax, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1MeasurePolicy$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i25 = 2 % 2;
                int i26 = onExtraCallbackWithResult + 109;
                IAuthTabCallback = i26 % 128;
                int i27 = i26 % 2;
                Unit unitOnNavigationEvent = w6.onNavigationEvent(this.f$0, component4Var, iIAuthTabCallback3, z, list4, i2, list3, list2, i242, iIntValue, iOnExtraCallbackWithResult2, iCoerceAtLeast, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                int i28 = IAuthTabCallback + 81;
                onExtraCallbackWithResult = i28 % 128;
                int i29 = i28 % 2;
                return unitOnNavigationEvent;
            }
        }, 4, (Object) null);
    }

    private static final Unit onExtraCallback(w6 w6Var, component4 component4Var, int i, boolean z, List list, int i2, List list2, List list3, int i3, int i4, int i5, int i6, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnExtraCallback;
        r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onWarmupCompleted onwarmupcompletedIAuthTabCallback;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        putCharSequenceArray putcharsequencearray = w6Var.asInterface;
        getViewTypeCount.asBinder asbinder = getViewTypeCount.asBinder.Center;
        r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onExtraCallback<accessgetTlsVersionsAsStringp> onExtraCallback = putBooleanArray.onExtraCallback();
        r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY r8lambda3ckywq3ss3onutwsvbshr4mmayIAuthTabCallback = putcharsequencearray.IAuthTabCallback(asbinder, new putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.onMinimized(), onExtraCallback));
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = (accessgetTlsVersionsAsStringp) ((r8lambda3ckywq3ss3onutwsvbshr4mmayIAuthTabCallback == null || (onwarmupcompletedIAuthTabCallback = r8lambda3ckywq3ss3onutwsvbshr4mmayIAuthTabCallback.IAuthTabCallback()) == null) ? null : onwarmupcompletedIAuthTabCallback.onWarmupCompleted(onExtraCallback));
        connectionCount connectioncountOnWarmupCompleted = accessgettlsversionsasstringp != null ? AppLovinInitProvider.onWarmupCompleted(accessgettlsversionsasstringp, 0.0f, 1, (Object) null) : null;
        if (connectioncountOnWarmupCompleted != null) {
            float fOnWarmupCompleted = AppLovinInitProvider.onWarmupCompleted(onextracallbackwithresult, connectioncountOnWarmupCompleted, w3a.onWarmupCompleted.asInterface());
            long jOnWarmupCompleted = AppLovinInitProvider.onWarmupCompleted(onextracallbackwithresult, connectioncountOnWarmupCompleted, 0.0f, 2, null);
            RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallbackWithResult(jOnWarmupCompleted);
            iOnExtraCallback = getBacktraceNoteBytes.onExtraCallback(((Float) w4.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback(jOnWarmupCompleted), AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(jOnWarmupCompleted) * fOnWarmupCompleted)), Float.valueOf(onextracallbackwithresult.c_(jOnWarmupCompleted)), component4Var}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1902972198, 1902972203)).floatValue());
        } else {
            iOnExtraCallback = i;
        }
        getViewTypeCount.onExtraCallback onextracallback = z ? w6Var.onExtraCallbackWithResult : w6Var.onWarmupCompleted;
        int i8 = asBinder + 125;
        IAuthTabCallbackDefault = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        for (int size = list.size(); i10 < size; size = size) {
            getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) list.get(i10);
            getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, 0, w4.onExtraCallbackWithResult(onextracallbackwithresult, onextracallback, getstreamsharingchildren.T_(), i3, iOnExtraCallback), 0.0f, 4, (Object) null);
            i10++;
        }
        if (z) {
            int iMax = Math.max(i2, i);
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                getStreamSharingChildren getstreamsharingchildren2 = (getStreamSharingChildren) list2.get(i11);
                getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren2, i4, (iMax - getstreamsharingchildren2.T_()) / 2, 0.0f, 4, (Object) null);
            }
            int size3 = list3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                int i13 = asBinder + 41;
                IAuthTabCallbackDefault = i13 % 128;
                int i14 = i13 % 2;
                getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) list3.get(i12), i4, iMax + i5, 0.0f, 4, (Object) null);
            }
        } else {
            int size4 = list2.size();
            for (int i15 = 0; i15 < size4; i15++) {
                int i16 = asBinder + 113;
                IAuthTabCallbackDefault = i16 % 128;
                int i17 = i16 % 2;
                getStreamSharingChildren getstreamsharingchildren3 = (getStreamSharingChildren) list2.get(i15);
                getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren3, i4, (i3 - getstreamsharingchildren3.T_()) / 2, 0.0f, 4, (Object) null);
            }
            int size5 = list3.size();
            for (int i18 = 0; i18 < size5; i18++) {
                int i19 = IAuthTabCallbackDefault + 41;
                asBinder = i19 % 128;
                int i20 = i19 % 2;
                getStreamSharingChildren getstreamsharingchildren4 = (getStreamSharingChildren) list3.get(i18);
                getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren4, (i6 - getstreamsharingchildren4.getInterfaceDescriptor()) + i4, w6Var.onExtraCallback.onNavigationEvent(onextracallbackwithresult, getstreamsharingchildren4.T_(), i3), 0.0f, 4, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }
}
