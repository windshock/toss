package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.DynamicRootView;
import o.getTimeOutListener;
import o.htf2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ReferenceArraySerializer<ElementKlass, Element extends ElementKlass> extends getTimeOutListener<Element, Element[], ArrayList<Element>> {
    private final SerialDescriptor IAuthTabCallback;
    private final KClass<ElementKlass> onWarmupCompleted;

    @Override // o.getTimeOutListener
    public /* bridge */ /* synthetic */ void onNavigationEvent(Object obj, int i, Object obj2) {
        onNavigationEvent((ArrayList<int>) obj, i, (int) obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferenceArraySerializer(@NotNull KClass<ElementKlass> kClass, @NotNull KSerializer<Element> kSerializer) {
        super(kSerializer, null);
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kSerializer, "");
        this.onWarmupCompleted = kClass;
        this.IAuthTabCallback = new DynamicRootView(kSerializer.getDescriptor());
    }

    @Override // o.getTimeOutListener, kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return this.IAuthTabCallback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public int onExtraCallback(@NotNull Element[] elementArr) {
        Intrinsics.checkNotNullParameter(elementArr, "");
        return elementArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public Iterator<Element> onExtraCallbackWithResult(@NotNull Element[] elementArr) {
        Intrinsics.checkNotNullParameter(elementArr, "");
        return ArrayIteratorKt.iterator(elementArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> onExtraCallbackWithResult() {
        return new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    public int onWarmupCompleted(@NotNull ArrayList<Element> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public Element[] onNavigationEvent(@NotNull ArrayList<Element> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return (Element[]) htf2.onWarmupCompleted(arrayList, this.onWarmupCompleted);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> IAuthTabCallback(@NotNull Element[] elementArr) {
        Intrinsics.checkNotNullParameter(elementArr, "");
        return new ArrayList<>(ArraysKt___ArraysJvmKt.asList(elementArr));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    public void onNavigationEvent(@NotNull ArrayList<Element> arrayList, int i) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        arrayList.ensureCapacity(i);
    }

    protected void onNavigationEvent(@NotNull ArrayList<Element> arrayList, int i, Element element) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        arrayList.add(i, element);
    }
}
