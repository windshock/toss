package com.tnkfactory.ad.ext;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import com.tnkfactory.ad.c.a;
import com.tnkfactory.ad.ext.LiveDatasKt$;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ProcessTextApi23ImplExternalSyntheticLambda1;
import o.getBacktraceNote;
import o.setPacEnabledKeys;
import o.setTaggedAddrCtrl;
import o.setUnreadableElfFiles;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class LiveDatasKt {
    public static final Object a(MutableLiveData mutableLiveData, Object obj) {
        mutableLiveData.setValue(obj);
        return obj;
    }

    public static final <T> LiveData<T> merge(@NotNull LiveData<T>... liveDataArr) {
        Intrinsics.checkNotNullParameter(liveDataArr, "");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        for (LiveData<T> liveData : liveDataArr) {
            mediatorLiveData.addSource(liveData, new a(new LiveDatasKt$.ExternalSyntheticLambda0(mediatorLiveData)));
        }
        return mediatorLiveData;
    }

    public static final <T> T requireValue(@NotNull LiveData<T> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "");
        T t = (T) liveData.getValue();
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final <T> LiveData<T> setOnEach(@NotNull LiveData<T> liveData, @NotNull MutableLiveData<T> mutableLiveData) {
        Intrinsics.checkNotNullParameter(liveData, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        return ProcessTextApi23ImplExternalSyntheticLambda1.IAuthTabCallback(liveData, new LiveDatasKt$.ExternalSyntheticLambda1(mutableLiveData));
    }

    public static final Unit a(MediatorLiveData mediatorLiveData, Object obj) {
        mediatorLiveData.setValue(obj);
        return Unit.INSTANCE;
    }

    public static final <T, LIVE1> LiveData<T> combine(@NotNull T t, @NotNull final LiveData<LIVE1> liveData, @NotNull final Function2<? super T, ? super LIVE1, ? extends T> function2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(liveData, "");
        Intrinsics.checkNotNullParameter(function2, "");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.setValue(t);
        Iterator<T> it = CollectionsKt.listOf(liveData).iterator();
        while (it.hasNext()) {
            mediatorLiveData.addSource((LiveData) it.next(), new LiveDatasKt$sam$i$androidx_lifecycle_Observer$0(new Function1<LIVE1, Unit>() { // from class: com.tnkfactory.ad.ext.LiveDatasKt$combine$1$1$1
                /* JADX WARN: Multi-variable type inference failed */
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m147invoke((LiveDatasKt$combine$1$1$1<LIVE1>) obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m147invoke(LIVE1 live1) {
                    Object value = mediatorLiveData.getValue();
                    Object value2 = liveData.getValue();
                    if (value == null || value2 == null) {
                        return;
                    }
                    mediatorLiveData.setValue(function2.invoke(value, value2));
                }
            }));
        }
        return ProcessTextApi23ImplExternalSyntheticLambda1.IAuthTabCallback(mediatorLiveData);
    }

    public static final <T, LIVE1, LIVE2> LiveData<T> combine(@NotNull T t, @NotNull final LiveData<LIVE1> liveData, @NotNull final LiveData<LIVE2> liveData2, @NotNull final getBacktraceNote<? super T, ? super LIVE1, ? super LIVE2, ? extends T> getbacktracenote) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(liveData, "");
        Intrinsics.checkNotNullParameter(liveData2, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.setValue(t);
        Iterator<T> it = CollectionsKt.listOf(new LiveData[]{liveData, liveData2}).iterator();
        while (it.hasNext()) {
            mediatorLiveData.addSource((LiveData) it.next(), new LiveDatasKt$sam$i$androidx_lifecycle_Observer$0(new Function1() { // from class: com.tnkfactory.ad.ext.LiveDatasKt$combine$2$1$1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m148invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m148invoke(Object obj) {
                    Object value = mediatorLiveData.getValue();
                    Object value2 = liveData.getValue();
                    Object value3 = liveData2.getValue();
                    if (value == null || value2 == null || value3 == null) {
                        return;
                    }
                    mediatorLiveData.setValue(getbacktracenote.invoke(value, value2, value3));
                }
            }));
        }
        return ProcessTextApi23ImplExternalSyntheticLambda1.IAuthTabCallback(mediatorLiveData);
    }

    public static final <T, LIVE1, LIVE2, LIVE3> LiveData<T> combine(@NotNull T t, @NotNull final LiveData<LIVE1> liveData, @NotNull final LiveData<LIVE2> liveData2, @NotNull final LiveData<LIVE3> liveData3, @NotNull final setTaggedAddrCtrl<? super T, ? super LIVE1, ? super LIVE2, ? super LIVE3, ? extends T> settaggedaddrctrl) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(liveData, "");
        Intrinsics.checkNotNullParameter(liveData2, "");
        Intrinsics.checkNotNullParameter(liveData3, "");
        Intrinsics.checkNotNullParameter(settaggedaddrctrl, "");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.setValue(t);
        Iterator<T> it = CollectionsKt.listOf(new LiveData[]{liveData, liveData2, liveData3}).iterator();
        while (it.hasNext()) {
            mediatorLiveData.addSource((LiveData) it.next(), new LiveDatasKt$sam$i$androidx_lifecycle_Observer$0(new Function1() { // from class: com.tnkfactory.ad.ext.LiveDatasKt$combine$3$1$1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m149invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m149invoke(Object obj) {
                    Object value = mediatorLiveData.getValue();
                    Object value2 = liveData.getValue();
                    Object value3 = liveData2.getValue();
                    Object value4 = liveData3.getValue();
                    if (value == null || value2 == null || value3 == null || value4 == null) {
                        return;
                    }
                    mediatorLiveData.setValue(settaggedaddrctrl.invoke(value, value2, value3, value4));
                }
            }));
        }
        return ProcessTextApi23ImplExternalSyntheticLambda1.IAuthTabCallback(mediatorLiveData);
    }

    public static final <T, LIVE1, LIVE2, LIVE3, LIVE4> LiveData<T> combine(@NotNull T t, @NotNull final LiveData<LIVE1> liveData, @NotNull final LiveData<LIVE2> liveData2, @NotNull final LiveData<LIVE3> liveData3, @NotNull final LiveData<LIVE4> liveData4, @NotNull final setUnreadableElfFiles<? super T, ? super LIVE1, ? super LIVE2, ? super LIVE3, ? super LIVE4, ? extends T> setunreadableelffiles) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(liveData, "");
        Intrinsics.checkNotNullParameter(liveData2, "");
        Intrinsics.checkNotNullParameter(liveData3, "");
        Intrinsics.checkNotNullParameter(liveData4, "");
        Intrinsics.checkNotNullParameter(setunreadableelffiles, "");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.setValue(t);
        Iterator<T> it = CollectionsKt.listOf(new LiveData[]{liveData, liveData2, liveData3, liveData4}).iterator();
        while (it.hasNext()) {
            mediatorLiveData.addSource((LiveData) it.next(), new LiveDatasKt$sam$i$androidx_lifecycle_Observer$0(new Function1() { // from class: com.tnkfactory.ad.ext.LiveDatasKt$combine$4$1$1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m150invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m150invoke(Object obj) {
                    Object value = mediatorLiveData.getValue();
                    Object value2 = liveData.getValue();
                    Object value3 = liveData2.getValue();
                    Object value4 = liveData3.getValue();
                    Object value5 = liveData4.getValue();
                    if (value == null || value2 == null || value3 == null || value4 == null || value5 == null) {
                        return;
                    }
                    mediatorLiveData.setValue(setunreadableelffiles.invoke(value, value2, value3, value4, value5));
                }
            }));
        }
        return ProcessTextApi23ImplExternalSyntheticLambda1.IAuthTabCallback(mediatorLiveData);
    }

    public static final <T, LIVE1, LIVE2, LIVE3, LIVE4, LIVE5> LiveData<T> combine(@NotNull T t, @NotNull final LiveData<LIVE1> liveData, @NotNull final LiveData<LIVE2> liveData2, @NotNull final LiveData<LIVE3> liveData3, @NotNull final LiveData<LIVE4> liveData4, @NotNull final LiveData<LIVE5> liveData5, @NotNull final setPacEnabledKeys<? super T, ? super LIVE1, ? super LIVE2, ? super LIVE3, ? super LIVE4, ? super LIVE5, ? extends T> setpacenabledkeys) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(liveData, "");
        Intrinsics.checkNotNullParameter(liveData2, "");
        Intrinsics.checkNotNullParameter(liveData3, "");
        Intrinsics.checkNotNullParameter(liveData4, "");
        Intrinsics.checkNotNullParameter(liveData5, "");
        Intrinsics.checkNotNullParameter(setpacenabledkeys, "");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.setValue(t);
        Iterator<T> it = CollectionsKt.listOf(new LiveData[]{liveData, liveData2, liveData3, liveData4, liveData5}).iterator();
        while (it.hasNext()) {
            mediatorLiveData.addSource((LiveData) it.next(), new LiveDatasKt$sam$i$androidx_lifecycle_Observer$0(new Function1() { // from class: com.tnkfactory.ad.ext.LiveDatasKt$combine$5$1$1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m151invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m151invoke(Object obj) {
                    Object value = mediatorLiveData.getValue();
                    Object value2 = liveData.getValue();
                    Object value3 = liveData2.getValue();
                    Object value4 = liveData3.getValue();
                    Object value5 = liveData4.getValue();
                    Object value6 = liveData5.getValue();
                    if (value == null || value2 == null || value3 == null || value4 == null || value5 == null || value6 == null) {
                        return;
                    }
                    mediatorLiveData.setValue(setpacenabledkeys.invoke(value, value2, value3, value4, value5, value6));
                }
            }));
        }
        return ProcessTextApi23ImplExternalSyntheticLambda1.IAuthTabCallback(mediatorLiveData);
    }
}
