package o;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.setAnimationsLoop;
import o.uu;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class setAnimationsLoop implements SerialDescriptor, getDynamicClickListener {
    private final Lazy IAuthTabCallback;
    private Map<String, Integer> IAuthTabCallbackDefault;
    private final aeu2<?> IAuthTabCallbackStub;
    private final Lazy IAuthTabCallbackStubProxy;
    private final String[] asBinder;
    private final List<Annotation>[] asInterface;
    private final String getInterfaceDescriptor;
    private List<Annotation> onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final boolean[] onTransact;
    private int onWarmupCompleted;

    public setAnimationsLoop(@NotNull String str, @Nullable aeu2<?> aeu2Var, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getInterfaceDescriptor = str;
        this.IAuthTabCallbackStub = aeu2Var;
        this.onNavigationEvent = i;
        this.onWarmupCompleted = -1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.asBinder = strArr;
        int i3 = this.onNavigationEvent;
        this.asInterface = new List[i3];
        this.onTransact = new boolean[i3];
        this.IAuthTabCallbackDefault = access8000.IAuthTabCallback();
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        this.IAuthTabCallback = LazyKt__LazyJVMKt.lazy(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return setAnimationsLoop.IAuthTabCallback(this.f$0);
            }
        });
        this.IAuthTabCallbackStubProxy = LazyKt__LazyJVMKt.lazy(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return setAnimationsLoop.onTransact(this.f$0);
            }
        });
        this.onExtraCallbackWithResult = LazyKt__LazyJVMKt.lazy(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(setAnimationsLoop.onWarmupCompleted(this.f$0));
            }
        });
    }

    public /* synthetic */ setAnimationsLoop(String str, aeu2 aeu2Var, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : aeu2Var, i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String onExtraCallbackWithResult() {
        return this.getInterfaceDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int onExtraCallback() {
        return this.onNavigationEvent;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public vbt IAuthTabCallback() {
        return uu.onExtraCallbackWithResult.onNavigationEvent;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> onNavigationEvent() {
        List<Annotation> list = this.onExtraCallback;
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @Override // o.getDynamicClickListener
    public Set<String> asBinder() {
        return this.IAuthTabCallbackDefault.keySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer[] IAuthTabCallback(setAnimationsLoop setanimationsloop) {
        KSerializer<?>[] kSerializerArrChildSerializers;
        aeu2<?> aeu2Var = setanimationsloop.IAuthTabCallbackStub;
        return (aeu2Var == null || (kSerializerArrChildSerializers = aeu2Var.childSerializers()) == null) ? jc11.onExtraCallbackWithResult : kSerializerArrChildSerializers;
    }

    private final KSerializer<?>[] onTransact() {
        return (KSerializer[]) this.IAuthTabCallback.getValue();
    }

    public final SerialDescriptor[] IAuthTabCallbackDefault() {
        return (SerialDescriptor[]) this.IAuthTabCallbackStubProxy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor[] onTransact(setAnimationsLoop setanimationsloop) {
        ArrayList arrayList;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        aeu2<?> aeu2Var = setanimationsloop.IAuthTabCallbackStub;
        if (aeu2Var == null || (kSerializerArrTypeParametersSerializers = aeu2Var.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
            for (KSerializer<?> kSerializer : kSerializerArrTypeParametersSerializers) {
                arrayList.add(kSerializer.getDescriptor());
            }
        }
        return setImageLottieTosPath.IAuthTabCallback(arrayList);
    }

    private final int IAuthTabCallback_Parcel() {
        return ((Number) this.onExtraCallbackWithResult.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onWarmupCompleted(setAnimationsLoop setanimationsloop) {
        return htf3.onExtraCallback(setanimationsloop, setanimationsloop.IAuthTabCallbackDefault());
    }

    public static /* synthetic */ void onExtraCallbackWithResult(setAnimationsLoop setanimationsloop, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        setanimationsloop.onWarmupCompleted(str, z);
    }

    public final void onWarmupCompleted(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        String[] strArr = this.asBinder;
        int i = this.onWarmupCompleted + 1;
        this.onWarmupCompleted = i;
        strArr[i] = str;
        this.onTransact[i] = z;
        this.asInterface[i] = null;
        if (i == this.onNavigationEvent - 1) {
            this.IAuthTabCallbackDefault = IAuthTabCallbackStub();
        }
    }

    public final void onExtraCallback(@NotNull Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "");
        List<Annotation> arrayList = this.asInterface[this.onWarmupCompleted];
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            this.asInterface[this.onWarmupCompleted] = arrayList;
        }
        arrayList.add(annotation);
    }

    public final void onWarmupCompleted(@NotNull Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "");
        if (this.onExtraCallback == null) {
            this.onExtraCallback = new ArrayList(1);
        }
        List<Annotation> list = this.onExtraCallback;
        Intrinsics.checkNotNull(list);
        list.add(annotation);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor onNavigationEvent(int i) {
        return onTransact()[i].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean onExtraCallback(int i) {
        return this.onTransact[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> onExtraCallbackWithResult(int i) {
        List<Annotation> list = this.asInterface[i];
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String onWarmupCompleted(int i) {
        return this.asBinder[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Integer num = this.IAuthTabCallbackDefault.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    private final Map<String, Integer> IAuthTabCallbackStub() {
        HashMap map = new HashMap();
        int length = this.asBinder.length;
        for (int i = 0; i < length; i++) {
            map.put(this.asBinder[i], Integer.valueOf(i));
        }
        return map;
    }

    public int hashCode() {
        return IAuthTabCallback_Parcel();
    }

    public String toString() {
        return htf3.onWarmupCompleted(this);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setAnimationsLoop)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (!Intrinsics.areEqual(onExtraCallbackWithResult(), serialDescriptor.onExtraCallbackWithResult()) || !Arrays.equals(IAuthTabCallbackDefault(), ((setAnimationsLoop) obj).IAuthTabCallbackDefault()) || onExtraCallback() != serialDescriptor.onExtraCallback()) {
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
