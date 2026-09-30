package o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.readFully;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class AFf1oSDK5<T> extends AFf1bSDK<AFf1mSDK<T>> {
    private static int onMessageChannelReady = 0;
    private static int onMinimized = 1;
    private final long IAuthTabCallback;
    private final Function1<AFf1mSDK<T>, setByteOrder> IAuthTabCallbackDefault;
    private final float IAuthTabCallbackStub;
    private final CameraPresenceProviderExternalSyntheticLambda6<Boolean> IAuthTabCallbackStubProxy;
    private final removeTimestamp IAuthTabCallback_Parcel;
    private final long ICustomTabsCallback;
    private int access000;
    private final DeviceQuirksExternalSyntheticLambda0 access100;
    private final int asBinder;
    private final Map<setByteOrder, readFully> asInterface;
    private final Pair<Double, Double> extraCallback;
    private final boolean extraCallbackWithResult;
    private final fromKilometersPerHour getInterfaceDescriptor;
    private List<AFf1nSDK<T>> onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final CameraPresenceProviderExternalSyntheticLambda6<SurfaceProcessorNodeOut> onNavigationEvent;
    private final seek onTransact;
    private final float onWarmupCompleted;
    private final Integer readTypedObject;
    private final float writeTypedObject;

    public /* synthetic */ AFf1oSDK5(Integer num, Function1 function1, Pair pair, float f, int i, fromKilometersPerHour fromkilometersperhour, float f2, seek seekVar, int i2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, float f3, boolean z, long j, long j2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, function1, pair, f, i, fromkilometersperhour, f2, seekVar, i2, deviceQuirksExternalSyntheticLambda0, f3, z, j, j2, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AFf1oSDK5(Integer num, Function1<? super AFf1mSDK<T>, setByteOrder> function1, Pair<Double, Double> pair, float f, int i, fromKilometersPerHour fromkilometersperhour, float f2, seek seekVar, int i2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, float f3, boolean z, long j, long j2, CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6<SurfaceProcessorNodeOut> cameraPresenceProviderExternalSyntheticLambda62) {
        removeTimestamp removetimestampOnWarmupCompleted;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda6, "");
        this.readTypedObject = num;
        this.IAuthTabCallbackDefault = function1;
        this.extraCallback = pair;
        this.writeTypedObject = f;
        this.asBinder = i;
        this.getInterfaceDescriptor = fromkilometersperhour;
        this.onWarmupCompleted = f2;
        this.onTransact = seekVar;
        this.onExtraCallbackWithResult = i2;
        this.access100 = deviceQuirksExternalSyntheticLambda0;
        this.IAuthTabCallbackStub = f3;
        this.extraCallbackWithResult = z;
        this.ICustomTabsCallback = j;
        this.IAuthTabCallback = j2;
        this.IAuthTabCallbackStubProxy = cameraPresenceProviderExternalSyntheticLambda6;
        this.onNavigationEvent = cameraPresenceProviderExternalSyntheticLambda62;
        if (z) {
            removetimestampOnWarmupCompleted = getMappingAreaSize.onWarmupCompleted();
        } else {
            int i3 = onMessageChannelReady + 115;
            onMinimized = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
            removetimestampOnWarmupCompleted = null;
        }
        this.IAuthTabCallback_Parcel = removetimestampOnWarmupCompleted;
        this.onExtraCallback = CollectionsKt__CollectionsKt.emptyList();
        this.asInterface = new LinkedHashMap();
        int i5 = onMessageChannelReady + 39;
        onMinimized = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Map onWarmupCompleted(AFf1oSDK5 aFf1oSDK5) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 37;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        Map<setByteOrder, readFully> map = aFf1oSDK5.asInterface;
        int i5 = i3 + 1;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    @Override // o.AFf1bSDK
    public /* synthetic */ void onExtraCallbackWithResult(setOrientationDegrees setorientationdegrees, AFf1jSDK aFf1jSDK, Function0 function0) {
        int i = 2 % 2;
        int i2 = onMinimized + 77;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(setorientationdegrees, (AFf1mSDK) aFf1jSDK, (Function0<Float>) function0);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
    }

    public Integer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 91;
        int i3 = i2 % 128;
        onMinimized = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Integer num = this.readTypedObject;
        int i4 = i3 + 91;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            return num;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.AFf1bSDK
    public List<AFf1nSDK<T>> onExtraCallback() {
        List<AFf1nSDK<T>> list;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 43;
        int i3 = i2 % 128;
        onMinimized = i3;
        if (i2 % 2 == 0) {
            list = this.onExtraCallback;
            int i4 = 48 / 0;
        } else {
            list = this.onExtraCallback;
        }
        int i5 = i3 + 59;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return list;
    }

    static final class onNavigationEvent implements Function1<setByteOrder, readFully> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ AFf1oSDK5<T> IAuthTabCallback;

        onNavigationEvent(AFf1oSDK5<T> aFf1oSDK5) {
            this.IAuthTabCallback = aFf1oSDK5;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ readFully invoke(setByteOrder setbyteorder) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            readFully readfullyOnWarmupCompleted = onWarmupCompleted(setbyteorder.access100());
            int i4 = onNavigationEvent + 21;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return readfullyOnWarmupCompleted;
            }
            throw null;
        }

        public final readFully onWarmupCompleted(long j) {
            int i = 2 % 2;
            Map mapOnWarmupCompleted = AFf1oSDK5.onWarmupCompleted(this.IAuthTabCallback);
            setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(j);
            Object objOnWarmupCompleted = mapOnWarmupCompleted.get(setbyteorderOnNavigationEvent);
            if (objOnWarmupCompleted == null) {
                int i2 = onNavigationEvent + 51;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                objOnWarmupCompleted = readFully.onExtraCallback.onWarmupCompleted(readFully.Companion, CollectionsKt__CollectionsKt.listOf((Object[]) new setByteOrder[]{setByteOrder.onNavigationEvent(setByteOrder.onExtraCallbackWithResult(j, 0.3f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault())}), 0.0f, 0.0f, 0, 14, (Object) null);
                mapOnWarmupCompleted.put(setbyteorderOnNavigationEvent, objOnWarmupCompleted);
            }
            readFully readfully = (readFully) objOnWarmupCompleted;
            int i4 = onExtraCallback + 89;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return readfully;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final Function1<setByteOrder, readFully> onWarmupCompleted() {
        int i = 2 % 2;
        onNavigationEvent onnavigationevent = new onNavigationEvent(this);
        int i2 = onMinimized + 109;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            return onnavigationevent;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027d A[PHI: r4 r6
      0x027d: PHI (r4v20 long) = (r4v19 long), (r4v33 long) binds: [B:76:0x0272, B:73:0x0261] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r6v11 o.AFf1nSDK) = (r6v10 o.AFf1nSDK), (r6v18 o.AFf1nSDK) binds: [B:76:0x0272, B:73:0x0261] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0397  */
    @Override // o.AFf1bSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallback(@NotNull setOrientationDegrees setorientationdegrees, @NotNull List<AFf1mSDK<T>> list, @Nullable Double d) throws Throwable {
        Object objM31constructorimpl;
        float fFloatValue;
        float f;
        removeTimestamp removetimestamp;
        float f2;
        int size;
        int i;
        removeTimestamp removetimestamp2;
        int i2;
        int i3;
        float f3;
        List list2;
        long jIAuthTabCallback;
        AFf1nSDK aFf1nSDK;
        long j;
        long j2;
        Object objM31constructorimpl2;
        Double d2;
        Double dValueOf;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        Intrinsics.checkNotNullParameter(list, "");
        int iOnExtraCallbackWithResult = setorientationdegrees.onExtraCallbackWithResult(y1ExternalSyntheticLambda8.onExtraCallbackWithResult(this.access100));
        int iOnExtraCallbackWithResult2 = setorientationdegrees.onExtraCallbackWithResult(y1ExternalSyntheticLambda8.onExtraCallback(this.access100));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32));
        float fOnExtraCallbackWithResult = setorientationdegrees.onExtraCallbackWithResult(y1ExternalSyntheticLambda8.onNavigationEvent(this.access100));
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) setorientationdegrees.onTransact()) - setorientationdegrees.onExtraCallbackWithResult(y1ExternalSyntheticLambda8.onWarmupCompleted(this.access100))) - setorientationdegrees.onExtraCallbackWithResult(this.IAuthTabCallbackStub);
        float fOnExtraCallbackWithResult2 = fIntBitsToFloat2 + setorientationdegrees.onExtraCallbackWithResult(this.IAuthTabCallbackStub);
        float f4 = iOnExtraCallbackWithResult2;
        float f5 = iOnExtraCallbackWithResult;
        double dDoubleValue = this.extraCallback.getFirst().doubleValue();
        double dDoubleValue2 = this.extraCallback.getSecond().doubleValue() - dDoubleValue;
        Integer numOnExtraCallbackWithResult = onExtraCallbackWithResult();
        List listDrop = CollectionsKt___CollectionsKt.drop(list, RangesKt___RangesKt.coerceAtLeast(list.size() - (numOnExtraCallbackWithResult != null ? numOnExtraCallbackWithResult.intValue() : list.size()), 0));
        this.access000 = listDrop.size();
        Integer numOnExtraCallbackWithResult2 = onExtraCallbackWithResult();
        if ((numOnExtraCallbackWithResult2 != null ? numOnExtraCallbackWithResult2.intValue() : listDrop.size()) != 0) {
            try {
                Result.Companion companion = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(Float.valueOf(((fIntBitsToFloat - fOnExtraCallbackWithResult) - f4) / RangesKt___RangesKt.coerceAtLeast(r0 - 1, 0)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
            }
            if (!(!Result.onExtraCallback(objM31constructorimpl))) {
                objM31constructorimpl = null;
            }
            Float f6 = (Float) objM31constructorimpl;
            fFloatValue = f6 != null ? f6.floatValue() : 0.0f;
        }
        float f7 = fFloatValue;
        double dDoubleValue3 = 0.0d;
        if (dDoubleValue2 != 0.0d) {
            int i5 = onMessageChannelReady + 33;
            onMinimized = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    try {
                        Result.Companion companion3 = Result.Companion;
                        f = fOnExtraCallbackWithResult2;
                        dValueOf = Double.valueOf((fIntBitsToFloat2 % f5) + dDoubleValue2);
                    } catch (Throwable th2) {
                        th = th2;
                        f = fOnExtraCallbackWithResult2;
                        Result.Companion companion4 = Result.Companion;
                        objM31constructorimpl2 = Result.m31constructorimpl(ResultKt.createFailure(th));
                        if (Result.onExtraCallback(objM31constructorimpl2)) {
                        }
                        d2 = (Double) objM31constructorimpl2;
                        if (d2 != null) {
                        }
                        List list3 = listDrop;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        int i6 = 0;
                        while (r0.hasNext()) {
                        }
                        List list4 = listDrop;
                        this.onExtraCallback = arrayList;
                        AFf1nSDK aFf1nSDK2 = (AFf1nSDK) CollectionsKt___CollectionsKt.firstOrNull((List) arrayList);
                        if (aFf1nSDK2 == null) {
                        }
                        removetimestamp = this.IAuthTabCallback_Parcel;
                        if (removetimestamp == null) {
                        }
                        long jAccess100 = ((setByteOrder) this.IAuthTabCallbackDefault.invoke(CollectionsKt___CollectionsKt.firstOrNull(list4))).access100();
                        size = this.onExtraCallback.size();
                        i = 1;
                        while (i < size) {
                        }
                        float f8 = f2;
                        List list5 = list4;
                        AFf1nSDK aFf1nSDK3 = (AFf1nSDK) CollectionsKt___CollectionsKt.lastOrNull((List) this.onExtraCallback);
                        if (aFf1nSDK3 == null) {
                        }
                        removetimestamp2 = this.IAuthTabCallback_Parcel;
                        if (removetimestamp2 != null) {
                        }
                        CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6 = this.IAuthTabCallbackStubProxy;
                        CameraPresenceProviderExternalSyntheticLambda6<SurfaceProcessorNodeOut> cameraPresenceProviderExternalSyntheticLambda62 = this.onNavigationEvent;
                        AFf1lSDK5.onWarmupCompleted(setorientationdegrees, d, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62 == null ? (SurfaceProcessorNodeOut) cameraPresenceProviderExternalSyntheticLambda62.onExtraCallbackWithResult() : null, this.extraCallback, this.access100, this.ICustomTabsCallback, this.IAuthTabCallback);
                    }
                } else {
                    f = fOnExtraCallbackWithResult2;
                    Result.Companion companion5 = Result.Companion;
                    dValueOf = Double.valueOf((fIntBitsToFloat2 - f5) / dDoubleValue2);
                }
                objM31constructorimpl2 = Result.m31constructorimpl(dValueOf);
            } catch (Throwable th3) {
                th = th3;
            }
            if (Result.onExtraCallback(objM31constructorimpl2)) {
                objM31constructorimpl2 = null;
            }
            d2 = (Double) objM31constructorimpl2;
            if (d2 != null) {
                dDoubleValue3 = d2.doubleValue();
            }
        } else {
            f = fOnExtraCallbackWithResult2;
        }
        List list32 = listDrop;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list32, 10));
        int i62 = 0;
        for (T t : list32) {
            int i7 = onMinimized + 83;
            onMessageChannelReady = i7 % 128;
            int i8 = i7 % 2;
            if (i62 < 0) {
                int i9 = onMessageChannelReady + 97;
                onMinimized = i9 % 128;
                if (i9 % 2 == 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            AFf1mSDK aFf1mSDK = (AFf1mSDK) t;
            double d3 = fIntBitsToFloat2;
            arrayList2.add(new AFf1nSDK(aFf1mSDK, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits((i62 * f7) + f4) << 32) | (Float.floatToRawIntBits((float) (d3 - ((aFf1mSDK.onExtraCallback() - dDoubleValue) * dDoubleValue3))) & 4294967295L)), (float) (d3 - ((aFf1mSDK.onNavigationEvent() - dDoubleValue) * dDoubleValue3)), (float) (d3 - ((aFf1mSDK.onExtraCallbackWithResult() - dDoubleValue) * dDoubleValue3)), null));
            i62++;
            f4 = f4;
            listDrop = listDrop;
            f7 = f7;
        }
        List list42 = listDrop;
        this.onExtraCallback = arrayList2;
        AFf1nSDK aFf1nSDK22 = (AFf1nSDK) CollectionsKt___CollectionsKt.firstOrNull((List) arrayList2);
        long jIAuthTabCallback2 = aFf1nSDK22 == null ? aFf1nSDK22.IAuthTabCallback() : setUseCaseAttached.Companion.IAuthTabCallback();
        removetimestamp = this.IAuthTabCallback_Parcel;
        if (removetimestamp == null) {
            removetimestamp.asBinder();
            int i10 = (int) (jIAuthTabCallback2 >> 32);
            f2 = f;
            removetimestamp.onWarmupCompleted(Float.intBitsToFloat(i10), f2);
            removetimestamp.onNavigationEvent(Float.intBitsToFloat(i10), Float.intBitsToFloat((int) jIAuthTabCallback2));
            int i11 = onMessageChannelReady + 33;
            onMinimized = i11 % 128;
            int i12 = i11 % 2;
        } else {
            f2 = f;
        }
        long jAccess1002 = ((setByteOrder) this.IAuthTabCallbackDefault.invoke(CollectionsKt___CollectionsKt.firstOrNull(list42))).access100();
        size = this.onExtraCallback.size();
        i = 1;
        while (i < size) {
            AFf1nSDK aFf1nSDK4 = (AFf1nSDK) CollectionsKt___CollectionsKt.getOrNull(this.onExtraCallback, i - 1);
            if (aFf1nSDK4 != null) {
                int i13 = onMessageChannelReady + 29;
                onMinimized = i13 % 128;
                if (i13 % 2 == 0) {
                    jIAuthTabCallback = aFf1nSDK4.IAuthTabCallback();
                    aFf1nSDK = (AFf1nSDK) CollectionsKt___CollectionsKt.getOrNull(this.onExtraCallback, i);
                    int i14 = 69 / 0;
                    if (aFf1nSDK == null) {
                        i2 = size;
                        i3 = i;
                        f3 = f2;
                        list2 = list42;
                    } else {
                        long j3 = jIAuthTabCallback;
                        long jIAuthTabCallback3 = aFf1nSDK.IAuthTabCallback();
                        List list6 = list42;
                        long jAccess1003 = ((setByteOrder) this.IAuthTabCallbackDefault.invoke(list6.get(i))).access100();
                        if (setByteOrder.onExtraCallbackWithResult(jAccess1002, jAccess1003)) {
                            i2 = size;
                            j = jAccess1003;
                            list2 = list6;
                            j2 = jAccess1002;
                        } else {
                            int i15 = onMinimized + 67;
                            int i16 = i15 % 128;
                            onMessageChannelReady = i16;
                            int i17 = i15 % 2;
                            removeTimestamp removetimestamp3 = this.IAuthTabCallback_Parcel;
                            if (removetimestamp3 != null) {
                                int i18 = i16 + 81;
                                i2 = size;
                                onMinimized = i18 % 128;
                                int i19 = i18 % 2;
                                j = jAccess1003;
                                int i20 = (int) (jIAuthTabCallback3 >> 32);
                                removetimestamp3.onNavigationEvent(Float.intBitsToFloat(i20), f2);
                                list2 = list6;
                                setOrientationDegrees.onExtraCallback(setorientationdegrees, removetimestamp3, onWarmupCompleted().invoke(setByteOrder.onNavigationEvent(jAccess1002)), 0.0f, (hasMoreElements) null, (seek) null, 0, 60, (Object) null);
                                removetimestamp3.asBinder();
                                removetimestamp3.onWarmupCompleted(Float.intBitsToFloat(i20), f2);
                                jIAuthTabCallback3 = jIAuthTabCallback3;
                                removetimestamp3.onNavigationEvent(Float.intBitsToFloat(i20), Float.intBitsToFloat((int) jIAuthTabCallback3));
                            } else {
                                i2 = size;
                                j = jAccess1003;
                                list2 = list6;
                            }
                            j2 = j;
                        }
                        long j4 = jIAuthTabCallback3;
                        i3 = i;
                        f3 = f2;
                        setorientationdegrees.onNavigationEvent(j, j3, jIAuthTabCallback3, this.writeTypedObject, this.asBinder, this.getInterfaceDescriptor, this.onWarmupCompleted, this.onTransact, this.onExtraCallbackWithResult);
                        removeTimestamp removetimestamp4 = this.IAuthTabCallback_Parcel;
                        if (removetimestamp4 != null) {
                            int i21 = onMinimized + 31;
                            onMessageChannelReady = i21 % 128;
                            int i22 = i21 % 2;
                            removetimestamp4.onNavigationEvent(Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) j4));
                        }
                        jAccess1002 = j2;
                    }
                } else {
                    jIAuthTabCallback = aFf1nSDK4.IAuthTabCallback();
                    aFf1nSDK = (AFf1nSDK) CollectionsKt___CollectionsKt.getOrNull(this.onExtraCallback, i);
                    if (aFf1nSDK == null) {
                    }
                }
            } else {
                i2 = size;
                i3 = i;
                f3 = f2;
                list2 = list42;
            }
            i = i3 + 1;
            size = i2;
            f2 = f3;
            list42 = list2;
        }
        float f82 = f2;
        List list52 = list42;
        AFf1nSDK aFf1nSDK32 = (AFf1nSDK) CollectionsKt___CollectionsKt.lastOrNull((List) this.onExtraCallback);
        long jIAuthTabCallback4 = aFf1nSDK32 == null ? aFf1nSDK32.IAuthTabCallback() : setUseCaseAttached.Companion.IAuthTabCallback();
        removetimestamp2 = this.IAuthTabCallback_Parcel;
        if (removetimestamp2 != null) {
            removetimestamp2.onNavigationEvent(Float.intBitsToFloat((int) (jIAuthTabCallback4 >> 32)), f82);
            setOrientationDegrees.onExtraCallback(setorientationdegrees, removetimestamp2, (readFully) onWarmupCompleted().invoke(this.IAuthTabCallbackDefault.invoke(CollectionsKt___CollectionsKt.lastOrNull(list52))), 0.0f, (hasMoreElements) null, (seek) null, 0, 60, (Object) null);
            removetimestamp2.onExtraCallback();
        }
        CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda63 = this.IAuthTabCallbackStubProxy;
        CameraPresenceProviderExternalSyntheticLambda6<SurfaceProcessorNodeOut> cameraPresenceProviderExternalSyntheticLambda622 = this.onNavigationEvent;
        AFf1lSDK5.onWarmupCompleted(setorientationdegrees, d, cameraPresenceProviderExternalSyntheticLambda63, cameraPresenceProviderExternalSyntheticLambda622 == null ? (SurfaceProcessorNodeOut) cameraPresenceProviderExternalSyntheticLambda622.onExtraCallbackWithResult() : null, this.extraCallback, this.access100, this.ICustomTabsCallback, this.IAuthTabCallback);
    }

    public void onWarmupCompleted(@NotNull setOrientationDegrees setorientationdegrees, @Nullable AFf1mSDK<T> aFf1mSDK, @NotNull Function0<Float> function0) {
        Object objM31constructorimpl;
        float fFloatValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (aFf1mSDK == null || this.access000 == 0) {
            return;
        }
        double dDoubleValue = this.extraCallback.getFirst().doubleValue();
        double dDoubleValue2 = this.extraCallback.getSecond().doubleValue();
        float fOnExtraCallback = setorientationdegrees.onExtraCallback(y1ExternalSyntheticLambda8.onExtraCallbackWithResult(this.access100));
        float fOnExtraCallback2 = setorientationdegrees.onExtraCallback(y1ExternalSyntheticLambda8.onExtraCallback(this.access100));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32));
        float fOnExtraCallback3 = setorientationdegrees.onExtraCallback(y1ExternalSyntheticLambda8.onNavigationEvent(this.access100));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) setorientationdegrees.onTransact()) - setorientationdegrees.onExtraCallback(y1ExternalSyntheticLambda8.onWarmupCompleted(this.access100));
        Integer numOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int iIntValue = numOnExtraCallbackWithResult != null ? numOnExtraCallbackWithResult.intValue() : this.access000;
        try {
            Result.Companion companion = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(Float.valueOf(((fIntBitsToFloat - fOnExtraCallback3) - fOnExtraCallback2) / RangesKt___RangesKt.coerceAtLeast(iIntValue - 1, 0)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(objM31constructorimpl)) {
            objM31constructorimpl = null;
        }
        Float f = (Float) objM31constructorimpl;
        if (f != null) {
            int i2 = onMessageChannelReady + 73;
            onMinimized = i2 % 128;
            if (i2 % 2 == 0) {
                fFloatValue = f.floatValue();
                int i3 = 96 / 0;
            } else {
                fFloatValue = f.floatValue();
            }
        } else {
            fFloatValue = 0.0f;
        }
        double d = (fIntBitsToFloat2 - fOnExtraCallback) / (dDoubleValue2 - dDoubleValue);
        int i4 = this.access000 - 1;
        float fCoerceIn = fOnExtraCallback2 + (RangesKt___RangesKt.coerceIn(i4, 0, i4) * fFloatValue);
        double d2 = fIntBitsToFloat2;
        setOrientationDegrees.IAuthTabCallback(setorientationdegrees, getMaxAdCount.onNavigationEvent(this.IAuthTabCallbackDefault.invoke(null).access100(), function0.invoke().floatValue() >= 0.5f ? PostviewFormatValidatorExternalSyntheticLambda0.IAuthTabCallback(0.2f, 0.0f, (function0.invoke().floatValue() - 0.5f) * 2.0f) : 0.2f), setorientationdegrees.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f) + VirtualCameraControlExternalSyntheticLambda2.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), function0.invoke().floatValue()))), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fCoerceIn) << 32) | (Float.floatToRawIntBits((float) (d2 - ((aFf1mSDK.onExtraCallback() - dDoubleValue) * d))) & 4294967295L)), function0.invoke().floatValue(), (hasMoreElements) null, (seek) null, 0, 112, (Object) null);
        setOrientationDegrees.IAuthTabCallback(setorientationdegrees, this.IAuthTabCallbackDefault.invoke(null).access100(), setorientationdegrees.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f)), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fCoerceIn) << 32) | (Float.floatToRawIntBits((float) (d2 - ((aFf1mSDK.onExtraCallback() - dDoubleValue) * d))) & 4294967295L)), 0.0f, (hasMoreElements) null, (seek) null, 0, 120, (Object) null);
        int i5 = onMinimized + 63;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.AFf1bSDK
    public void onExtraCallbackWithResult(@NotNull setOrientationDegrees setorientationdegrees, @NotNull SurfaceProcessorNodeOut surfaceProcessorNodeOut, @Nullable Double d, @NotNull String str, long j, long j2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (d != null) {
            int i2 = onMessageChannelReady + 11;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            if (!Intrinsics.areEqual(d, 0.0d)) {
                AFf1lSDK5.IAuthTabCallback(setorientationdegrees, this.extraCallback, this.access100, d.doubleValue(), surfaceProcessorNodeOut, j, j2);
                int i4 = onMinimized + 125;
                onMessageChannelReady = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    @Override // o.AFf1bSDK
    public void IAuthTabCallback(@NotNull setOrientationDegrees setorientationdegrees, @Nullable AFf1gSDK<AFf1mSDK<T>> aFf1gSDK) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        Object obj = null;
        if (aFf1gSDK != null && ((AFf1mSDK) aFf1gSDK.IAuthTabCallback()) != null) {
            int i2 = onMinimized + 99;
            onMessageChannelReady = i2 % 128;
            int i3 = i2 % 2;
            if (aFf1gSDK.onExtraCallbackWithResult() != null) {
                if (Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32)) == 0.0f) {
                    return;
                }
                long jOnExtraCallback = onExtraCallback((AFf1mSDK) aFf1gSDK.IAuthTabCallback());
                float fCoerceIn = RangesKt___RangesKt.coerceIn(Float.intBitsToFloat((int) (jOnExtraCallback >> 32)) - (((int) (aFf1gSDK.onExtraCallbackWithResult().asBinder() >> 32)) / 2.0f), 0.0f, RangesKt___RangesKt.coerceAtLeast(Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32)) - ((int) (aFf1gSDK.onExtraCallbackWithResult().asBinder() >> 32)), 0.0f));
                SurfaceProcessorNodeOut surfaceProcessorNodeOutOnExtraCallbackWithResult = aFf1gSDK.onExtraCallbackWithResult();
                long jOnWarmupCompleted = setUseCaseAttached.onWarmupCompleted(jOnExtraCallback, fCoerceIn, 0.0f, 2, (Object) null);
                float fAsBinder = (int) aFf1gSDK.onExtraCallbackWithResult().asBinder();
                float fOnExtraCallbackWithResult = setorientationdegrees.onExtraCallbackWithResult(aFf1gSDK.onNavigationEvent());
                getProcessor.onExtraCallbackWithResult(setorientationdegrees, surfaceProcessorNodeOutOnExtraCallbackWithResult, this.IAuthTabCallbackDefault.invoke(null).access100(), setUseCaseAttached.onExtraCallbackWithResult(jOnWarmupCompleted, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fAsBinder - fOnExtraCallbackWithResult) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))), 0.0f, (ExifSpeedConverter) null, (bindChildren) null, (hasMoreElements) null, 0, 248, (Object) null);
                setOrientationDegrees.IAuthTabCallback(setorientationdegrees, setByteOrder.onExtraCallbackWithResult(this.IAuthTabCallbackDefault.invoke(null).access100(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null), setorientationdegrees.onExtraCallbackWithResult(AFf1eSDK.IAuthTabCallback()), jOnExtraCallback, 0.0f, (hasMoreElements) null, (seek) null, 0, 120, (Object) null);
                return;
            }
        }
        int i4 = onMessageChannelReady + 85;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r23.onExtraCallbackWithResult() == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r23.onExtraCallbackWithResult() == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (java.lang.Float.intBitsToFloat((int) (r22.onTransact() >> 32)) != 0.0f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        r15 = IAuthTabCallback((o.AFf1mSDK) r23.IAuthTabCallback());
        r6 = kotlin.ranges.RangesKt___RangesKt.coerceIn(java.lang.Float.intBitsToFloat((int) (r15 >> 32)) - (((int) (r23.onExtraCallbackWithResult().asBinder() >> 32)) / 2.0f), 0.0f, kotlin.ranges.RangesKt___RangesKt.coerceAtLeast(java.lang.Float.intBitsToFloat((int) (r22.onTransact() >> 32)) - ((int) (r23.onExtraCallbackWithResult().asBinder() >> 32)), 0.0f));
        r1 = -r22.onExtraCallbackWithResult(r23.onNavigationEvent());
        o.getProcessor.onExtraCallbackWithResult(r22, r23.onExtraCallbackWithResult(), r21.IAuthTabCallbackDefault.invoke(null).access100(), o.setUseCaseAttached.onExtraCallbackWithResult(o.setUseCaseAttached.onWarmupCompleted(r15, r6, 0.0f, 2, (java.lang.Object) null), o.setUseCaseAttached.IAuthTabCallback((java.lang.Float.floatToRawIntBits(r1) & 4294967295L) | (java.lang.Float.floatToRawIntBits(0.0f) << 32))), 0.0f, (o.ExifSpeedConverter) null, (o.bindChildren) null, (o.hasMoreElements) null, 0, 248, (java.lang.Object) null);
        o.setOrientationDegrees.IAuthTabCallback(r22, o.setByteOrder.onExtraCallbackWithResult(r21.IAuthTabCallbackDefault.invoke(null).access100(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (java.lang.Object) null), r22.onExtraCallbackWithResult(o.AFf1eSDK.IAuthTabCallback()), r15, 0.0f, (o.hasMoreElements) null, (o.seek) null, 0, 120, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0127, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    @Override // o.AFf1bSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(@NotNull setOrientationDegrees setorientationdegrees, @Nullable AFf1gSDK<AFf1mSDK<T>> aFf1gSDK) {
        int i = 2 % 2;
        int i2 = onMinimized + 55;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        if (aFf1gSDK != null) {
            int i4 = onMinimized + 33;
            onMessageChannelReady = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 40 / 0;
                if (((AFf1mSDK) aFf1gSDK.IAuthTabCallback()) != null) {
                    int i6 = onMinimized + 13;
                    onMessageChannelReady = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 46 / 0;
                    }
                }
            } else if (((AFf1mSDK) aFf1gSDK.IAuthTabCallback()) != null) {
            }
        }
        int i8 = onMessageChannelReady + 67;
        onMinimized = i8 % 128;
        int i9 = i8 % 2;
    }

    private final long onExtraCallback(AFf1mSDK<T> aFf1mSDK) {
        AFf1nSDK<T> aFf1nSDKPrevious;
        long jIAuthTabCallback;
        float fOnExtraCallbackWithResult;
        int i = 2 % 2;
        List<AFf1nSDK<T>> listOnExtraCallback = onExtraCallback();
        ListIterator<AFf1nSDK<T>> listIterator = listOnExtraCallback.listIterator(listOnExtraCallback.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                aFf1nSDKPrevious = null;
                break;
            }
            aFf1nSDKPrevious = listIterator.previous();
            if (aFf1nSDKPrevious.onExtraCallback().onNavigationEvent() == aFf1mSDK.onNavigationEvent()) {
                break;
            }
        }
        AFf1nSDK<T> aFf1nSDK = aFf1nSDKPrevious;
        if (aFf1nSDK != null) {
            jIAuthTabCallback = aFf1nSDK.IAuthTabCallback();
        } else {
            jIAuthTabCallback = setUseCaseAttached.Companion.IAuthTabCallback();
            int i2 = onMinimized + 15;
            onMessageChannelReady = i2 % 128;
            int i3 = i2 % 2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jIAuthTabCallback >> 32));
        int i4 = onMessageChannelReady + 97;
        int i5 = i4 % 128;
        onMinimized = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (aFf1nSDK != null) {
            fOnExtraCallbackWithResult = aFf1nSDK.onExtraCallbackWithResult();
        } else {
            int i6 = i5 + 111;
            onMessageChannelReady = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 5;
            }
            fOnExtraCallbackWithResult = 0.0f;
        }
        return setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fOnExtraCallbackWithResult) & 4294967295L));
    }

    private final long IAuthTabCallback(AFf1mSDK<T> aFf1mSDK) {
        Object obj;
        AFf1nSDK<T> aFf1nSDKPrevious;
        float fOnNavigationEvent;
        int i = 2 % 2;
        List<AFf1nSDK<T>> listOnExtraCallback = onExtraCallback();
        ListIterator<AFf1nSDK<T>> listIterator = listOnExtraCallback.listIterator(listOnExtraCallback.size());
        while (true) {
            obj = null;
            if (!listIterator.hasPrevious()) {
                aFf1nSDKPrevious = null;
                break;
            }
            aFf1nSDKPrevious = listIterator.previous();
            if (aFf1nSDKPrevious.onExtraCallback().onExtraCallbackWithResult() == aFf1mSDK.onExtraCallbackWithResult()) {
                break;
            }
        }
        AFf1nSDK<T> aFf1nSDK = aFf1nSDKPrevious;
        float fIntBitsToFloat = Float.intBitsToFloat((int) ((aFf1nSDK != null ? aFf1nSDK.IAuthTabCallback() : setUseCaseAttached.Companion.IAuthTabCallback()) >> 32));
        int i2 = onMinimized;
        int i3 = i2 + 51;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        if (aFf1nSDK != null) {
            int i5 = i2 + 9;
            onMessageChannelReady = i5 % 128;
            int i6 = i5 % 2;
            fOnNavigationEvent = aFf1nSDK.onNavigationEvent();
        } else {
            fOnNavigationEvent = 0.0f;
        }
        long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fOnNavigationEvent) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        int i7 = onMessageChannelReady + 89;
        onMinimized = i7 % 128;
        if (i7 % 2 != 0) {
            return jIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }
}
