package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.getStreamSharingChildren;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class lExternalSyntheticLambda7 {

    public static final class onExtraCallback implements component5 {
        private static int IAuthTabCallback = 0;
        public static final onExtraCallback onExtraCallback = new onExtraCallback();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final component8 onExtraCallbackWithResult(component4 component4Var, List<? extends component7> list, long j) {
            int i;
            int i2;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(component4Var, "");
            Intrinsics.checkNotNullParameter(list, "");
            int size = list.size();
            if (size == 0) {
                return component4.IAuthTabCallback(component4Var, 0, 0, (Map) null, new Function1<getStreamSharingChildren.onExtraCallbackWithResult, Unit>() { // from class: o.lExternalSyntheticLambda7.onExtraCallback.4
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    static {
                        int i4 = onWarmupCompleted + 63;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                    }

                    public final void IAuthTabCallback(getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallbackWithResult + 1;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                        int i7 = onExtraCallbackWithResult + 19;
                        onExtraCallback = i7 % 128;
                        if (i7 % 2 == 0) {
                            return;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    public /* synthetic */ Object invoke(Object obj) {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallbackWithResult + 17;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        IAuthTabCallback((getStreamSharingChildren.onExtraCallbackWithResult) obj);
                        Unit unit = Unit.INSTANCE;
                        if (i6 != 0) {
                            int i7 = 97 / 0;
                        }
                        return unit;
                    }
                }, 4, (Object) null);
            }
            int i4 = 0;
            if (size == 1) {
                final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback = list.get(0).onExtraCallback(j);
                component8 component8VarIAuthTabCallback = component4.IAuthTabCallback(component4Var, getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor(), getstreamsharingchildrenOnExtraCallback.T_(), (Map) null, new Function1<getStreamSharingChildren.onExtraCallbackWithResult, Unit>() { // from class: o.lExternalSyntheticLambda7.onExtraCallback.1
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public /* synthetic */ Object invoke(Object obj) {
                        int i5 = 2 % 2;
                        int i6 = onWarmupCompleted + 3;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        onExtraCallback((getStreamSharingChildren.onExtraCallbackWithResult) obj);
                        Unit unit = Unit.INSTANCE;
                        if (i7 != 0) {
                            return unit;
                        }
                        throw null;
                    }

                    public final void onExtraCallback(getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
                        getStreamSharingChildren getstreamsharingchildren;
                        int i5;
                        int i6;
                        float f;
                        int i7;
                        int i8 = 2 % 2;
                        int i9 = onNavigationEvent + 57;
                        onWarmupCompleted = i9 % 128;
                        if (i9 % 2 != 0) {
                            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                            getstreamsharingchildren = getstreamsharingchildrenOnExtraCallback;
                            i5 = 1;
                            i6 = 1;
                            f = 1.0f;
                            i7 = 3;
                        } else {
                            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                            getstreamsharingchildren = getstreamsharingchildrenOnExtraCallback;
                            i5 = 0;
                            i6 = 0;
                            f = 0.0f;
                            i7 = 4;
                        }
                        getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, getstreamsharingchildren, i5, i6, f, i7, (Object) null);
                        int i10 = onNavigationEvent + 45;
                        onWarmupCompleted = i10 % 128;
                        if (i10 % 2 != 0) {
                            throw null;
                        }
                    }
                }, 4, (Object) null);
                int i5 = onNavigationEvent + 63;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 89 / 0;
                }
                return component8VarIAuthTabCallback;
            }
            final ArrayList arrayList = new ArrayList(list.size());
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                arrayList.add(list.get(i7).onExtraCallback(j));
            }
            int lastIndex = CollectionsKt.getLastIndex(arrayList);
            if (lastIndex >= 0) {
                int i8 = onNavigationEvent + 5;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                int iMax = 0;
                int iMax2 = 0;
                while (true) {
                    getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) arrayList.get(i4);
                    iMax = Math.max(iMax, getstreamsharingchildren.getInterfaceDescriptor());
                    iMax2 = Math.max(iMax2, getstreamsharingchildren.T_());
                    if (i4 == lastIndex) {
                        break;
                    }
                    i4++;
                }
                i = iMax;
                i2 = iMax2;
            } else {
                i = 0;
                i2 = 0;
            }
            return component4.IAuthTabCallback(component4Var, i, i2, (Map) null, new Function1<getStreamSharingChildren.onExtraCallbackWithResult, Unit>() { // from class: o.lExternalSyntheticLambda7.onExtraCallback.3
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public /* synthetic */ Object invoke(Object obj) {
                    int i10 = 2 % 2;
                    int i11 = IAuthTabCallback + 89;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    onExtraCallback((getStreamSharingChildren.onExtraCallbackWithResult) obj);
                    Unit unit = Unit.INSTANCE;
                    int i13 = IAuthTabCallback + 83;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                    return unit;
                }

                public final void onExtraCallback(getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
                    int i10 = 2 % 2;
                    int i11 = onWarmupCompleted + 23;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                    Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                    int lastIndex2 = CollectionsKt.getLastIndex(arrayList);
                    if (lastIndex2 < 0) {
                        return;
                    }
                    int i13 = IAuthTabCallback;
                    int i14 = i13 + 49;
                    onWarmupCompleted = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = i13 + 3;
                    onWarmupCompleted = i16 % 128;
                    int i17 = i16 % 2;
                    int i18 = 0;
                    while (true) {
                        getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, arrayList.get(i18), 0, 0, 0.0f, 4, (Object) null);
                        if (i18 == lastIndex2) {
                            return;
                        } else {
                            i18++;
                        }
                    }
                }
            }, 4, (Object) null);
        }
    }
}
