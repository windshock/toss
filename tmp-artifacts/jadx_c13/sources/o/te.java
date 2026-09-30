package o;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.te;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class te implements SerialDescriptor, getDynamicClickListener {
    private final Lazy IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final int IAuthTabCallbackStub;
    private final SerialDescriptor[] IAuthTabCallback_Parcel;
    private final Set<String> access000;
    private final Map<String, Integer> asBinder;
    private final vbt asInterface;
    private final String[] onExtraCallback;
    private final List<Annotation>[] onExtraCallbackWithResult;
    private final SerialDescriptor[] onNavigationEvent;
    private final boolean[] onTransact;
    private final List<Annotation> onWarmupCompleted;

    public te(@NotNull String str, @NotNull vbt vbtVar, int i, @NotNull List<? extends SerialDescriptor> list, @NotNull qt qtVar) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(vbtVar, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(qtVar, "");
        this.IAuthTabCallbackDefault = str;
        this.asInterface = vbtVar;
        this.IAuthTabCallbackStub = i;
        this.onWarmupCompleted = qtVar.onExtraCallbackWithResult();
        this.access000 = CollectionsKt___CollectionsKt.toHashSet(qtVar.onExtraCallback());
        String[] strArr = (String[]) qtVar.onExtraCallback().toArray(new String[0]);
        this.onExtraCallback = strArr;
        this.onNavigationEvent = setImageLottieTosPath.IAuthTabCallback(qtVar.onWarmupCompleted());
        this.onExtraCallbackWithResult = (List[]) qtVar.IAuthTabCallback().toArray(new List[0]);
        this.onTransact = CollectionsKt___CollectionsKt.toBooleanArray(qtVar.onNavigationEvent());
        Iterable<IndexedValue> iterableWithIndex = ArraysKt___ArraysKt.withIndex(strArr);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterableWithIndex, 10));
        for (IndexedValue indexedValue : iterableWithIndex) {
            arrayList.add(getWrite.IAuthTabCallback(indexedValue.onExtraCallback(), Integer.valueOf(indexedValue.onNavigationEvent())));
        }
        this.asBinder = access8000.onWarmupCompleted(arrayList);
        this.IAuthTabCallback_Parcel = setImageLottieTosPath.IAuthTabCallback(list);
        this.IAuthTabCallback = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kotlinx.serialization.descriptors.SerialDescriptorImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(te.onExtraCallback(this.f$0));
            }
        });
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String onExtraCallbackWithResult() {
        return this.IAuthTabCallbackDefault;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public vbt IAuthTabCallback() {
        return this.asInterface;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int onExtraCallback() {
        return this.IAuthTabCallbackStub;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    @Override // o.getDynamicClickListener
    public Set<String> asBinder() {
        return this.access000;
    }

    private final int IAuthTabCallbackDefault() {
        return ((Number) this.IAuthTabCallback.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onExtraCallback(te teVar) {
        return htf3.onExtraCallback(teVar, teVar.IAuthTabCallback_Parcel);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String onWarmupCompleted(int i) {
        return this.onExtraCallback[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Integer num = this.asBinder.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> onExtraCallbackWithResult(int i) {
        return this.onExtraCallbackWithResult[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor onNavigationEvent(int i) {
        return this.onNavigationEvent[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean onExtraCallback(int i) {
        return this.onTransact[i];
    }

    public int hashCode() {
        return IAuthTabCallbackDefault();
    }

    public String toString() {
        return htf3.onWarmupCompleted(this);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (!Intrinsics.areEqual(onExtraCallbackWithResult(), serialDescriptor.onExtraCallbackWithResult()) || !Arrays.equals(this.IAuthTabCallback_Parcel, ((te) obj).IAuthTabCallback_Parcel) || onExtraCallback() != serialDescriptor.onExtraCallback()) {
            return false;
        }
        int iOnExtraCallback = onExtraCallback();
        for (int i = 0; i < iOnExtraCallback; i++) {
            if (!Intrinsics.areEqual(onNavigationEvent(i).onExtraCallbackWithResult(), serialDescriptor.onNavigationEvent(i).onExtraCallbackWithResult()) || !Intrinsics.areEqual(onNavigationEvent(i).IAuthTabCallback(), serialDescriptor.onNavigationEvent(i).IAuthTabCallback())) {
                return false;
            }
        }
        return true;
    }
}
