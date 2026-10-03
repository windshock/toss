package o;

import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.loan.LoanComparisonLoadingItem;
import viva.republica.toss.network.model.loan.RequestResult;
import viva.republica.toss.network.model.loan.RequestResultGroup;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda25 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static final class asBinder<T> implements Comparator {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            float fFloatValue = ((Float) LoanComparisonLoadingItem.onExtraCallback(iOnExtraCallback, -1428407773, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, 1428407773, iOnExtraCallback3, new Object[]{(LoanComparisonLoadingItem) t})).floatValue();
            int iOnExtraCallback4 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback5 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback6 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(Float.valueOf(fFloatValue), Float.valueOf(((Float) LoanComparisonLoadingItem.onExtraCallback(iOnExtraCallback4, -1428407773, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback5, 1428407773, iOnExtraCallback6, new Object[]{(LoanComparisonLoadingItem) t2})).floatValue()));
            int i4 = onWarmupCompleted + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iIAuthTabCallback;
        }
    }

    public static final class onTransact<T> implements Comparator {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            RequestResult requestResult = (RequestResult) t;
            Float fWriteTypedObject = requestResult.writeTypedObject();
            if (fWriteTypedObject == null) {
                fWriteTypedObject = Float.valueOf(requestResult.asInterface());
                int i2 = onExtraCallback + 105;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
            }
            RequestResult requestResult2 = (RequestResult) t2;
            Float fWriteTypedObject2 = requestResult2.writeTypedObject();
            if (fWriteTypedObject2 == null) {
                int i4 = onExtraCallbackWithResult + 33;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                fWriteTypedObject2 = Float.valueOf(requestResult2.asInterface());
            }
            return getCodeNameBytes.IAuthTabCallback(fWriteTypedObject, fWriteTypedObject2);
        }
    }

    public static final class IAuthTabCallback<T> implements Comparator {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            RequestResult requestResult = (RequestResult) t2;
            if (i2 % 2 != 0) {
                return getCodeNameBytes.IAuthTabCallback(Long.valueOf(requestResult.onExtraCallbackWithResult()), Long.valueOf(((RequestResult) t).onExtraCallbackWithResult()));
            }
            getCodeNameBytes.IAuthTabCallback(Long.valueOf(requestResult.onExtraCallbackWithResult()), Long.valueOf(((RequestResult) t).onExtraCallbackWithResult()));
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult<T> implements Comparator {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(Long.valueOf(((LoanComparisonLoadingItem) t2).IAuthTabCallback()), Long.valueOf(((LoanComparisonLoadingItem) t).IAuthTabCallback()));
            int i4 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iIAuthTabCallback;
        }
    }

    public static final class onNavigationEvent<T> implements Comparator {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Comparator $this_thenBy;

        public onNavigationEvent(Comparator comparator) {
            this.$this_thenBy = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iCompare = this.$this_thenBy.compare(t, t2);
            if (iCompare != 0) {
                int i4 = onWarmupCompleted + 53;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 43 / 0;
                }
                return iCompare;
            }
            RequestResult requestResult = (RequestResult) t;
            Float fWriteTypedObject = requestResult.writeTypedObject();
            if (fWriteTypedObject == null) {
                int i6 = onWarmupCompleted + 101;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    Float.valueOf(requestResult.asInterface());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                fWriteTypedObject = Float.valueOf(requestResult.asInterface());
            }
            RequestResult requestResult2 = (RequestResult) t2;
            Float fWriteTypedObject2 = requestResult2.writeTypedObject();
            if (fWriteTypedObject2 == null) {
                int i7 = onWarmupCompleted + 31;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                fWriteTypedObject2 = Float.valueOf(requestResult2.asInterface());
            }
            return getCodeNameBytes.IAuthTabCallback(fWriteTypedObject, fWriteTypedObject2);
        }
    }

    public static final class onWarmupCompleted<T> implements Comparator {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Comparator $this_thenBy;

        public onWarmupCompleted(Comparator comparator) {
            this.$this_thenBy = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                this.$this_thenBy.compare(t, t2);
                obj.hashCode();
                throw null;
            }
            int iCompare = this.$this_thenBy.compare(t, t2);
            if (iCompare != 0) {
                int i3 = onNavigationEvent + 121;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return iCompare;
                }
                throw null;
            }
            int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            float fFloatValue = ((Float) LoanComparisonLoadingItem.onExtraCallback(iOnExtraCallback, -1428407773, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, 1428407773, iOnExtraCallback3, new Object[]{(LoanComparisonLoadingItem) t})).floatValue();
            int iOnExtraCallback4 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback5 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback6 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(Float.valueOf(fFloatValue), Float.valueOf(((Float) LoanComparisonLoadingItem.onExtraCallback(iOnExtraCallback4, -1428407773, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback5, 1428407773, iOnExtraCallback6, new Object[]{(LoanComparisonLoadingItem) t2})).floatValue()));
            int i4 = onExtraCallback + 19;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return iIAuthTabCallback;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallbackDefault<T> implements Comparator {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Comparator $this_thenByDescending;

        public IAuthTabCallbackDefault(Comparator comparator) {
            this.$this_thenByDescending = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int iCompare = this.$this_thenByDescending.compare(t, t2);
            if (iCompare == 0) {
                return getCodeNameBytes.IAuthTabCallback(Long.valueOf(((RequestResult) t2).onExtraCallbackWithResult()), Long.valueOf(((RequestResult) t).onExtraCallbackWithResult()));
            }
            int i2 = onWarmupCompleted;
            int i3 = i2 + 33;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 53;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return iCompare;
        }
    }

    public static final class IAuthTabCallbackStub<T> implements Comparator {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Comparator $this_thenByDescending;

        public IAuthTabCallbackStub(Comparator comparator) {
            this.$this_thenByDescending = comparator;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
        
            if ((r4 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        
            r4 = null;
            r4.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        
            return o.getCodeNameBytes.IAuthTabCallback(((viva.republica.toss.network.model.loan.LoanComparisonLoadingItem) r5).IAuthTabCallbackDefault(), ((viva.republica.toss.network.model.loan.LoanComparisonLoadingItem) r4).IAuthTabCallbackDefault());
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (r1 != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (r1 != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r4 = o.ImagePipelineExperimentsBuilderExternalSyntheticLambda25.IAuthTabCallbackStub.IAuthTabCallback + 37;
            o.ImagePipelineExperimentsBuilderExternalSyntheticLambda25.IAuthTabCallbackStub.onWarmupCompleted = r4 % 128;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int compare(T r4, T r5) {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.ImagePipelineExperimentsBuilderExternalSyntheticLambda25.IAuthTabCallbackStub.IAuthTabCallback
                int r1 = r1 + 29
                int r2 = r1 % 128
                o.ImagePipelineExperimentsBuilderExternalSyntheticLambda25.IAuthTabCallbackStub.onWarmupCompleted = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L1b
                java.util.Comparator r1 = r3.$this_thenByDescending
                int r1 = r1.compare(r4, r5)
                r2 = 41
                int r2 = r2 / 0
                if (r1 == 0) goto L34
                goto L23
            L1b:
                java.util.Comparator r1 = r3.$this_thenByDescending
                int r1 = r1.compare(r4, r5)
                if (r1 == 0) goto L34
            L23:
                int r4 = o.ImagePipelineExperimentsBuilderExternalSyntheticLambda25.IAuthTabCallbackStub.IAuthTabCallback
                int r4 = r4 + 37
                int r5 = r4 % 128
                o.ImagePipelineExperimentsBuilderExternalSyntheticLambda25.IAuthTabCallbackStub.onWarmupCompleted = r5
                int r4 = r4 % r0
                if (r4 != 0) goto L2f
                return r1
            L2f:
                r4 = 0
                r4.hashCode()
                throw r4
            L34:
                viva.republica.toss.network.model.loan.LoanComparisonLoadingItem r5 = (viva.republica.toss.network.model.loan.LoanComparisonLoadingItem) r5
                java.lang.String r5 = r5.IAuthTabCallbackDefault()
                viva.republica.toss.network.model.loan.LoanComparisonLoadingItem r4 = (viva.republica.toss.network.model.loan.LoanComparisonLoadingItem) r4
                java.lang.String r4 = r4.IAuthTabCallbackDefault()
                int r4 = o.getCodeNameBytes.IAuthTabCallback(r5, r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ImagePipelineExperimentsBuilderExternalSyntheticLambda25.IAuthTabCallbackStub.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    public static final class asInterface<T> implements Comparator {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Comparator $this_thenByDescending;

        public asInterface(Comparator comparator) {
            this.$this_thenByDescending = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int iCompare = this.$this_thenByDescending.compare(t, t2);
            if (iCompare != 0) {
                int i2 = onExtraCallbackWithResult + 115;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return iCompare;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(Long.valueOf(((LoanComparisonLoadingItem) t2).IAuthTabCallback()), Long.valueOf(((LoanComparisonLoadingItem) t).IAuthTabCallback()));
            int i3 = onExtraCallback + 19;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return iIAuthTabCallback;
        }
    }

    public static final class onExtraCallback<T> implements Comparator {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Comparator $this_thenByDescending;

        public onExtraCallback(Comparator comparator) {
            this.$this_thenByDescending = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iCompare = this.$this_thenByDescending.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(((LoanComparisonLoadingItem) t2).IAuthTabCallbackDefault(), ((LoanComparisonLoadingItem) t).IAuthTabCallbackDefault());
            int i4 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iIAuthTabCallback;
        }
    }

    public static final List<RequestResult> onExtraCallbackWithResult(@NotNull List<RequestResult> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        List<RequestResult> listSortedWith = CollectionsKt.sortedWith(list, new IAuthTabCallbackDefault(new onTransact()));
        int i2 = onWarmupCompleted + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
        return listSortedWith;
    }

    public static final RequestResult onExtraCallback(@NotNull ProducerSequenceFactoryExternalSyntheticLambda15 producerSequenceFactoryExternalSyntheticLambda15) {
        List<RequestResult> listOnExtraCallbackWithResult;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(producerSequenceFactoryExternalSyntheticLambda15, "");
        List<RequestResultGroup> listOnExtraCallbackWithResult2 = producerSequenceFactoryExternalSyntheticLambda15.onExtraCallbackWithResult(RequestResultGroup.GroupType.COMPLETE);
        if (listOnExtraCallbackWithResult2 != null) {
            int i2 = IAuthTabCallback + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            RequestResultGroup requestResultGroup = (RequestResultGroup) CollectionsKt.firstOrNull(listOnExtraCallbackWithResult2);
            if (requestResultGroup != null && (listOnExtraCallbackWithResult = requestResultGroup.onExtraCallbackWithResult()) != null) {
                ArrayList arrayList = new ArrayList();
                int i4 = IAuthTabCallback + 29;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                for (Object obj : listOnExtraCallbackWithResult) {
                    int i6 = IAuthTabCallback + 59;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    if (!((RequestResult) obj).onActivityLayout()) {
                        int i8 = onWarmupCompleted + 107;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        arrayList.add(obj);
                    }
                }
                List<RequestResult> listOnExtraCallbackWithResult3 = onExtraCallbackWithResult(arrayList);
                if (listOnExtraCallbackWithResult3 != null) {
                    int i10 = onWarmupCompleted + 109;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    RequestResult requestResult = (RequestResult) CollectionsKt.firstOrNull(listOnExtraCallbackWithResult3);
                    if (i11 == 0) {
                        int i12 = 40 / 0;
                    }
                    int i13 = onWarmupCompleted + 117;
                    IAuthTabCallback = i13 % 128;
                    if (i13 % 2 != 0) {
                        return requestResult;
                    }
                    throw null;
                }
            }
        }
        return null;
    }

    public static final Long IAuthTabCallback(@NotNull ProducerSequenceFactoryExternalSyntheticLambda2 producerSequenceFactoryExternalSyntheticLambda2) {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onWarmupCompleted = i2 % 128;
        Object obj2 = null;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(producerSequenceFactoryExternalSyntheticLambda2, "");
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(Long.valueOf(CommonModule_closeView.onWarmupCompleted.onTransact().parse(producerSequenceFactoryExternalSyntheticLambda2.onWarmupCompleted()).getTime()));
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(producerSequenceFactoryExternalSyntheticLambda2, "");
        Result.Companion companion3 = Result.Companion;
        obj = Result.constructor-impl(Long.valueOf(CommonModule_closeView.onWarmupCompleted.onTransact().parse(producerSequenceFactoryExternalSyntheticLambda2.onWarmupCompleted()).getTime()));
        if (Result.onExtraCallback(obj)) {
            int i3 = IAuthTabCallback + 67;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        } else {
            obj2 = obj;
        }
        return (Long) obj2;
    }

    public static final BigDecimal onWarmupCompleted(@NotNull RequestResult requestResult, float f) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(requestResult, "");
        BigDecimal bigDecimalSubtract = new BigDecimal(String.valueOf(f)).subtract(new BigDecimal(String.valueOf(requestResult.asInterface())));
        Object obj = null;
        if (bigDecimalSubtract.signum() <= 0) {
            int i2 = IAuthTabCallback + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = onWarmupCompleted + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return bigDecimalSubtract;
        }
        obj.hashCode();
        throw null;
    }

    public static final List<RequestResult> onWarmupCompleted(@NotNull List<RequestResult> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        List<RequestResult> listSortedWith = CollectionsKt.sortedWith(list, new onNavigationEvent(new IAuthTabCallback()));
        int i2 = IAuthTabCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return listSortedWith;
    }

    public static final List<LoanComparisonLoadingItem> onNavigationEvent(@NotNull List<LoanComparisonLoadingItem> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        List<LoanComparisonLoadingItem> listSortedWith = CollectionsKt.sortedWith(list, new IAuthTabCallbackStub(new asInterface(new asBinder())));
        int i2 = IAuthTabCallback + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return listSortedWith;
    }

    public static final List<LoanComparisonLoadingItem> IAuthTabCallback(@NotNull List<LoanComparisonLoadingItem> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        List<LoanComparisonLoadingItem> listSortedWith = CollectionsKt.sortedWith(list, new onExtraCallback(new onWarmupCompleted(new onExtraCallbackWithResult())));
        int i2 = IAuthTabCallback + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
        return listSortedWith;
    }
}
