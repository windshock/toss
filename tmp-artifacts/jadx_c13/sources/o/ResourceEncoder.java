package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResourceEncoder<K, V> {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static final ResourceEncoder onExtraCallback = new ResourceEncoder(0, 0, new Object[0]);
    private Object[] IAuthTabCallback;
    private int onExtraCallbackWithResult;
    private int onNavigationEvent;
    private final ResourceEncoderRegistry onWarmupCompleted;

    public ResourceEncoder(int i, int i2, @NotNull Object[] objArr, @Nullable ResourceEncoderRegistry resourceEncoderRegistry) {
        Intrinsics.checkNotNullParameter(objArr, "");
        this.onExtraCallbackWithResult = i;
        this.onNavigationEvent = i2;
        this.onWarmupCompleted = resourceEncoderRegistry;
        this.IAuthTabCallback = objArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResourceEncoder(int i, int i2, @NotNull Object[] objArr) {
        this(i, i2, objArr, null);
        Intrinsics.checkNotNullParameter(objArr, "");
    }

    private final onWarmupCompleted<K, V> onNavigationEvent() {
        return new onWarmupCompleted<>(this, 1);
    }

    private final onWarmupCompleted<K, V> onExtraCallback() {
        return new onWarmupCompleted<>(this, 0);
    }

    public final Object[] onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public final int IAuthTabCallback() {
        return Integer.bitCount(this.onExtraCallbackWithResult);
    }

    public final boolean onNavigationEvent(int i) {
        return (i & this.onExtraCallbackWithResult) != 0;
    }

    private final boolean IAuthTabCallback(int i) {
        return (i & this.onNavigationEvent) != 0;
    }

    public final int onExtraCallback(int i) {
        return Integer.bitCount((i - 1) & this.onExtraCallbackWithResult) << 1;
    }

    public final int onWarmupCompleted(int i) {
        return (this.IAuthTabCallback.length - 1) - Integer.bitCount((i - 1) & this.onNavigationEvent);
    }

    private final K onTransact(int i) {
        return (K) this.IAuthTabCallback[i];
    }

    private final V asBinder(int i) {
        return (V) this.IAuthTabCallback[i + 1];
    }

    public final ResourceEncoder<K, V> onExtraCallbackWithResult(int i) {
        Object obj = this.IAuthTabCallback[i];
        Intrinsics.checkNotNull(obj, "");
        return (ResourceEncoder) obj;
    }

    private final ResourceEncoder<K, V> onExtraCallbackWithResult(int i, K k, V v) {
        return new ResourceEncoder<>(i | this.onExtraCallbackWithResult, this.onNavigationEvent, ResourceCacheKey.onNavigationEvent(this.IAuthTabCallback, onExtraCallback(i), k, v));
    }

    private final ResourceEncoder<K, V> onWarmupCompleted(int i, K k, V v, ResourceEncoderRegistry resourceEncoderRegistry) {
        int iOnExtraCallback = onExtraCallback(i);
        if (this.onWarmupCompleted == resourceEncoderRegistry) {
            this.IAuthTabCallback = ResourceCacheKey.onNavigationEvent(this.IAuthTabCallback, iOnExtraCallback, k, v);
            this.onExtraCallbackWithResult = i | this.onExtraCallbackWithResult;
            return this;
        }
        return new ResourceEncoder<>(i | this.onExtraCallbackWithResult, this.onNavigationEvent, ResourceCacheKey.onNavigationEvent(this.IAuthTabCallback, iOnExtraCallback, k, v), resourceEncoderRegistry);
    }

    private final ResourceEncoder<K, V> onNavigationEvent(int i, V v) {
        Object[] objArr = this.IAuthTabCallback;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        objArrCopyOf[i + 1] = v;
        return new ResourceEncoder<>(this.onExtraCallbackWithResult, this.onNavigationEvent, objArrCopyOf);
    }

    private final ResourceEncoder<K, V> onNavigationEvent(int i, V v, RegistryNoImageHeaderParserException<K, V> registryNoImageHeaderParserException) {
        if (this.onWarmupCompleted == registryNoImageHeaderParserException.IAuthTabCallbackStub()) {
            this.IAuthTabCallback[i + 1] = v;
            return this;
        }
        registryNoImageHeaderParserException.onExtraCallbackWithResult(registryNoImageHeaderParserException.onTransact() + 1);
        Object[] objArr = this.IAuthTabCallback;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        objArrCopyOf[i + 1] = v;
        return new ResourceEncoder<>(this.onExtraCallbackWithResult, this.onNavigationEvent, objArrCopyOf, registryNoImageHeaderParserException.IAuthTabCallbackStub());
    }

    private final ResourceEncoder<K, V> onExtraCallbackWithResult(int i, int i2, ResourceEncoder<K, V> resourceEncoder) {
        Object[] objArr = resourceEncoder.IAuthTabCallback;
        if (objArr.length == 2 && resourceEncoder.onNavigationEvent == 0) {
            if (this.IAuthTabCallback.length == 1) {
                resourceEncoder.onExtraCallbackWithResult = this.onNavigationEvent;
                return resourceEncoder;
            }
            return new ResourceEncoder<>(this.onExtraCallbackWithResult ^ i2, i2 ^ this.onNavigationEvent, ResourceCacheKey.onWarmupCompleted(this.IAuthTabCallback, i, onExtraCallback(i2), objArr[0], objArr[1]));
        }
        Object[] objArr2 = this.IAuthTabCallback;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        objArrCopyOf[i] = resourceEncoder;
        return new ResourceEncoder<>(this.onExtraCallbackWithResult, this.onNavigationEvent, objArrCopyOf);
    }

    private final ResourceEncoder<K, V> onNavigationEvent(int i, ResourceEncoder<K, V> resourceEncoder, ResourceEncoderRegistry resourceEncoderRegistry) {
        ResourceEncoderRegistry resourceEncoderRegistry2 = resourceEncoder.onWarmupCompleted;
        Object[] objArr = this.IAuthTabCallback;
        if (objArr.length == 1 && resourceEncoder.IAuthTabCallback.length == 2 && resourceEncoder.onNavigationEvent == 0) {
            resourceEncoder.onExtraCallbackWithResult = this.onNavigationEvent;
            return resourceEncoder;
        }
        if (this.onWarmupCompleted == resourceEncoderRegistry) {
            objArr[i] = resourceEncoder;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        objArrCopyOf[i] = resourceEncoder;
        return new ResourceEncoder<>(this.onExtraCallbackWithResult, this.onNavigationEvent, objArrCopyOf, resourceEncoderRegistry);
    }

    private final ResourceEncoder<K, V> onExtraCallback(int i, int i2, ResourceEncoderRegistry resourceEncoderRegistry) {
        Object[] objArr = this.IAuthTabCallback;
        if (objArr.length == 1) {
            return null;
        }
        if (this.onWarmupCompleted == resourceEncoderRegistry) {
            this.IAuthTabCallback = ResourceCacheKey.onNavigationEvent(objArr, i);
            this.onNavigationEvent ^= i2;
            return this;
        }
        return new ResourceEncoder<>(this.onExtraCallbackWithResult, i2 ^ this.onNavigationEvent, ResourceCacheKey.onNavigationEvent(objArr, i), resourceEncoderRegistry);
    }

    private final Object[] IAuthTabCallback(int i, int i2, int i3, K k, V v, int i4, ResourceEncoderRegistry resourceEncoderRegistry) {
        K kOnTransact = onTransact(i);
        return ResourceCacheKey.onWarmupCompleted(this.IAuthTabCallback, i, onWarmupCompleted(i2) + 1, onWarmupCompleted(kOnTransact != null ? kOnTransact.hashCode() : 0, kOnTransact, asBinder(i), i3, k, v, i4 + 5, resourceEncoderRegistry));
    }

    private final ResourceEncoder<K, V> onExtraCallback(int i, int i2, int i3, K k, V v, int i4) {
        return new ResourceEncoder<>(this.onExtraCallbackWithResult ^ i2, i2 | this.onNavigationEvent, IAuthTabCallback(i, i2, i3, k, v, i4, null));
    }

    private final ResourceEncoder<K, V> onExtraCallback(int i, int i2, int i3, K k, V v, int i4, ResourceEncoderRegistry resourceEncoderRegistry) {
        if (this.onWarmupCompleted == resourceEncoderRegistry) {
            this.IAuthTabCallback = IAuthTabCallback(i, i2, i3, k, v, i4, resourceEncoderRegistry);
            this.onExtraCallbackWithResult ^= i2;
            this.onNavigationEvent |= i2;
            return this;
        }
        return new ResourceEncoder<>(this.onExtraCallbackWithResult ^ i2, i2 | this.onNavigationEvent, IAuthTabCallback(i, i2, i3, k, v, i4, resourceEncoderRegistry), resourceEncoderRegistry);
    }

    private final ResourceEncoder<K, V> onWarmupCompleted(int i, K k, V v, int i2, K k2, V v2, int i3, ResourceEncoderRegistry resourceEncoderRegistry) {
        Object[] objArr;
        if (i3 > 30) {
            return new ResourceEncoder<>(0, 0, new Object[]{k, v, k2, v2}, resourceEncoderRegistry);
        }
        int iIAuthTabCallback = ResourceCacheKey.IAuthTabCallback(i, i3);
        int iIAuthTabCallback2 = ResourceCacheKey.IAuthTabCallback(i2, i3);
        if (iIAuthTabCallback != iIAuthTabCallback2) {
            if (iIAuthTabCallback < iIAuthTabCallback2) {
                objArr = new Object[]{k, v, k2, v2};
            } else {
                objArr = new Object[]{k2, v2, k, v};
            }
            return new ResourceEncoder<>((1 << iIAuthTabCallback) | (1 << iIAuthTabCallback2), 0, objArr, resourceEncoderRegistry);
        }
        return new ResourceEncoder<>(0, 1 << iIAuthTabCallback, new Object[]{onWarmupCompleted(i, k, v, i2, k2, v2, i3 + 5, resourceEncoderRegistry)}, resourceEncoderRegistry);
    }

    private final ResourceEncoder<K, V> onExtraCallback(int i, int i2, RegistryNoImageHeaderParserException<K, V> registryNoImageHeaderParserException) {
        registryNoImageHeaderParserException.onWarmupCompleted(registryNoImageHeaderParserException.size() - 1);
        registryNoImageHeaderParserException.IAuthTabCallback(asBinder(i));
        if (this.IAuthTabCallback.length == 2) {
            return null;
        }
        if (this.onWarmupCompleted == registryNoImageHeaderParserException.IAuthTabCallbackStub()) {
            this.IAuthTabCallback = ResourceCacheKey.onExtraCallbackWithResult(this.IAuthTabCallback, i);
            this.onExtraCallbackWithResult ^= i2;
            return this;
        }
        return new ResourceEncoder<>(i2 ^ this.onExtraCallbackWithResult, this.onNavigationEvent, ResourceCacheKey.onExtraCallbackWithResult(this.IAuthTabCallback, i), registryNoImageHeaderParserException.IAuthTabCallbackStub());
    }

    private final ResourceEncoder<K, V> onWarmupCompleted(int i, RegistryNoImageHeaderParserException<K, V> registryNoImageHeaderParserException) {
        registryNoImageHeaderParserException.onWarmupCompleted(registryNoImageHeaderParserException.size() - 1);
        registryNoImageHeaderParserException.IAuthTabCallback(asBinder(i));
        if (this.IAuthTabCallback.length == 2) {
            return null;
        }
        if (this.onWarmupCompleted == registryNoImageHeaderParserException.IAuthTabCallbackStub()) {
            this.IAuthTabCallback = ResourceCacheKey.onExtraCallbackWithResult(this.IAuthTabCallback, i);
            return this;
        }
        return new ResourceEncoder<>(0, 0, ResourceCacheKey.onExtraCallbackWithResult(this.IAuthTabCallback, i), registryNoImageHeaderParserException.IAuthTabCallbackStub());
    }

    private final int IAuthTabCallback(Object obj) {
        IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, this.IAuthTabCallback.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return -1;
        }
        while (!Intrinsics.areEqual(obj, onTransact(first))) {
            if (first == last) {
                return -1;
            }
            first += step;
        }
        return first;
    }

    private final boolean onExtraCallbackWithResult(K k) {
        return IAuthTabCallback(k) != -1;
    }

    private final V onExtraCallback(K k) {
        int iIAuthTabCallback = IAuthTabCallback(k);
        if (iIAuthTabCallback != -1) {
            return asBinder(iIAuthTabCallback);
        }
        return null;
    }

    private final onWarmupCompleted<K, V> IAuthTabCallback(K k, V v) {
        int iIAuthTabCallback = IAuthTabCallback(k);
        if (iIAuthTabCallback != -1) {
            if (v == asBinder(iIAuthTabCallback)) {
                return null;
            }
            Object[] objArr = this.IAuthTabCallback;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            objArrCopyOf[iIAuthTabCallback + 1] = v;
            return new ResourceEncoder(0, 0, objArrCopyOf).onExtraCallback();
        }
        return new ResourceEncoder(0, 0, ResourceCacheKey.onNavigationEvent(this.IAuthTabCallback, 0, k, v)).onNavigationEvent();
    }

    private final ResourceEncoder<K, V> onNavigationEvent(K k, V v, RegistryNoImageHeaderParserException<K, V> registryNoImageHeaderParserException) {
        int iIAuthTabCallback = IAuthTabCallback(k);
        if (iIAuthTabCallback != -1) {
            registryNoImageHeaderParserException.IAuthTabCallback(asBinder(iIAuthTabCallback));
            if (this.onWarmupCompleted == registryNoImageHeaderParserException.IAuthTabCallbackStub()) {
                this.IAuthTabCallback[iIAuthTabCallback + 1] = v;
                return this;
            }
            registryNoImageHeaderParserException.onExtraCallbackWithResult(registryNoImageHeaderParserException.onTransact() + 1);
            Object[] objArr = this.IAuthTabCallback;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            objArrCopyOf[iIAuthTabCallback + 1] = v;
            return new ResourceEncoder<>(0, 0, objArrCopyOf, registryNoImageHeaderParserException.IAuthTabCallbackStub());
        }
        registryNoImageHeaderParserException.onWarmupCompleted(registryNoImageHeaderParserException.size() + 1);
        return new ResourceEncoder<>(0, 0, ResourceCacheKey.onNavigationEvent(this.IAuthTabCallback, 0, k, v), registryNoImageHeaderParserException.IAuthTabCallbackStub());
    }

    private final ResourceEncoder<K, V> onWarmupCompleted(K k, RegistryNoImageHeaderParserException<K, V> registryNoImageHeaderParserException) {
        int iIAuthTabCallback = IAuthTabCallback(k);
        return iIAuthTabCallback != -1 ? onWarmupCompleted(iIAuthTabCallback, registryNoImageHeaderParserException) : this;
    }

    private final ResourceEncoder<K, V> onExtraCallbackWithResult(K k, V v, RegistryNoImageHeaderParserException<K, V> registryNoImageHeaderParserException) {
        int iIAuthTabCallback = IAuthTabCallback(k);
        return (iIAuthTabCallback == -1 || !Intrinsics.areEqual(v, asBinder(iIAuthTabCallback))) ? this : onWarmupCompleted(iIAuthTabCallback, registryNoImageHeaderParserException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ResourceEncoder<K, V> onWarmupCompleted(ResourceEncoder<K, V> resourceEncoder, AppGlideModule appGlideModule, ResourceEncoderRegistry resourceEncoderRegistry) {
        int i = resourceEncoder.onNavigationEvent;
        int i2 = resourceEncoder.onExtraCallbackWithResult;
        Object[] objArr = this.IAuthTabCallback;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + resourceEncoder.IAuthTabCallback.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        int length = this.IAuthTabCallback.length;
        IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, resourceEncoder.IAuthTabCallback.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (!onExtraCallbackWithResult((ResourceEncoder<K, V>) resourceEncoder.IAuthTabCallback[first])) {
                    Object[] objArr2 = resourceEncoder.IAuthTabCallback;
                    objArrCopyOf[length] = objArr2[first];
                    objArrCopyOf[length + 1] = objArr2[first + 1];
                    length += 2;
                } else {
                    appGlideModule.IAuthTabCallback(appGlideModule.IAuthTabCallback() + 1);
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        if (length == this.IAuthTabCallback.length) {
            return this;
        }
        if (length == resourceEncoder.IAuthTabCallback.length) {
            return resourceEncoder;
        }
        if (length == objArrCopyOf.length) {
            return new ResourceEncoder<>(0, 0, objArrCopyOf, resourceEncoderRegistry);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "");
        return new ResourceEncoder<>(0, 0, objArrCopyOf2, resourceEncoderRegistry);
    }

    private final ResourceEncoder<K, V> IAuthTabCallback(ResourceEncoder<K, V> resourceEncoder, int i, int i2, AppGlideModule appGlideModule, RegistryNoImageHeaderParserException<K, V> registryNoImageHeaderParserException) {
        if (IAuthTabCallback(i)) {
            ResourceEncoder<K, V> resourceEncoderOnExtraCallbackWithResult = onExtraCallbackWithResult(onWarmupCompleted(i));
            if (resourceEncoder.IAuthTabCallback(i)) {
                return resourceEncoderOnExtraCallbackWithResult.onWarmupCompleted(resourceEncoder.onExtraCallbackWithResult(resourceEncoder.onWarmupCompleted(i)), i2 + 5, appGlideModule, registryNoImageHeaderParserException);
            }
            if (!resourceEncoder.onNavigationEvent(i)) {
                return resourceEncoderOnExtraCallbackWithResult;
            }
            int iOnExtraCallback = resourceEncoder.onExtraCallback(i);
            K kOnTransact = resourceEncoder.onTransact(iOnExtraCallback);
            V vAsBinder = resourceEncoder.asBinder(iOnExtraCallback);
            int size = registryNoImageHeaderParserException.size();
            ResourceEncoder<K, V> resourceEncoderOnExtraCallbackWithResult2 = resourceEncoderOnExtraCallbackWithResult.onExtraCallbackWithResult(kOnTransact != null ? kOnTransact.hashCode() : 0, kOnTransact, vAsBinder, i2 + 5, registryNoImageHeaderParserException);
            if (registryNoImageHeaderParserException.size() == size) {
                appGlideModule.IAuthTabCallback(appGlideModule.IAuthTabCallback() + 1);
            }
            return resourceEncoderOnExtraCallbackWithResult2;
        }
        if (resourceEncoder.IAuthTabCallback(i)) {
            ResourceEncoder<K, V> resourceEncoderOnExtraCallbackWithResult3 = resourceEncoder.onExtraCallbackWithResult(resourceEncoder.onWarmupCompleted(i));
            if (!onNavigationEvent(i)) {
                return resourceEncoderOnExtraCallbackWithResult3;
            }
            int iOnExtraCallback2 = onExtraCallback(i);
            K kOnTransact2 = onTransact(iOnExtraCallback2);
            int i3 = i2 + 5;
            if (!resourceEncoderOnExtraCallbackWithResult3.onWarmupCompleted(kOnTransact2 != null ? kOnTransact2.hashCode() : 0, (int) kOnTransact2, i3)) {
                return resourceEncoderOnExtraCallbackWithResult3.onExtraCallbackWithResult(kOnTransact2 != null ? kOnTransact2.hashCode() : 0, kOnTransact2, asBinder(iOnExtraCallback2), i3, registryNoImageHeaderParserException);
            }
            appGlideModule.IAuthTabCallback(appGlideModule.IAuthTabCallback() + 1);
            return resourceEncoderOnExtraCallbackWithResult3;
        }
        int iOnExtraCallback3 = onExtraCallback(i);
        K kOnTransact3 = onTransact(iOnExtraCallback3);
        V vAsBinder2 = asBinder(iOnExtraCallback3);
        int iOnExtraCallback4 = resourceEncoder.onExtraCallback(i);
        K kOnTransact4 = resourceEncoder.onTransact(iOnExtraCallback4);
        return onWarmupCompleted(kOnTransact3 != null ? kOnTransact3.hashCode() : 0, kOnTransact3, vAsBinder2, kOnTransact4 != null ? kOnTransact4.hashCode() : 0, kOnTransact4, resourceEncoder.asBinder(iOnExtraCallback4), i2 + 5, registryNoImageHeaderParserException.IAuthTabCallbackStub());
    }

    private final int IAuthTabCallbackDefault() {
        if (this.onNavigationEvent == 0) {
            return this.IAuthTabCallback.length / 2;
        }
        int iBitCount = Integer.bitCount(this.onExtraCallbackWithResult);
        int length = this.IAuthTabCallback.length;
        for (int i = iBitCount << 1; i < length; i++) {
            iBitCount += onExtraCallbackWithResult(i).IAuthTabCallbackDefault();
        }
        return iBitCount;
    }

    private final boolean onExtraCallback(ResourceEncoder<K, V> resourceEncoder) {
        if (this == resourceEncoder) {
            return true;
        }
        if (this.onNavigationEvent != resourceEncoder.onNavigationEvent || this.onExtraCallbackWithResult != resourceEncoder.onExtraCallbackWithResult) {
            return false;
        }
        int length = this.IAuthTabCallback.length;
        for (int i = 0; i < length; i++) {
            if (this.IAuthTabCallback[i] != resourceEncoder.IAuthTabCallback[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean onWarmupCompleted(int i, K k, int i2) {
        int iIAuthTabCallback = 1 << ResourceCacheKey.IAuthTabCallback(i, i2);
        if (onNavigationEvent(iIAuthTabCallback)) {
            return Intrinsics.areEqual(k, onTransact(onExtraCallback(iIAuthTabCallback)));
        }
        if (!IAuthTabCallback(iIAuthTabCallback)) {
            return false;
        }
        ResourceEncoder<K, V> resourceEncoderOnExtraCallbackWithResult = onExtraCallbackWithResult(onWarmupCompleted(iIAuthTabCallback));
        if (i2 == 30) {
            return resourceEncoderOnExtraCallbackWithResult.onExtraCallbackWithResult((ResourceEncoder<K, V>) k);
        }
        return resourceEncoderOnExtraCallbackWithResult.onWarmupCompleted(i, (int) k, i2 + 5);
    }

    public final V onExtraCallbackWithResult(int i, K k, int i2) {
        int iIAuthTabCallback = 1 << ResourceCacheKey.IAuthTabCallback(i, i2);
        if (onNavigationEvent(iIAuthTabCallback)) {
            int iOnExtraCallback = onExtraCallback(iIAuthTabCallback);
            if (Intrinsics.areEqual(k, onTransact(iOnExtraCallback))) {
                return asBinder(iOnExtraCallback);
            }
            return null;
        }
        if (!IAuthTabCallback(iIAuthTabCallback)) {
            return null;
        }
        ResourceEncoder<K, V> resourceEncoderOnExtraCallbackWithResult = onExtraCallbackWithResult(onWarmupCompleted(iIAuthTabCallback));
        if (i2 == 30) {
            return resourceEncoderOnExtraCallbackWithResult.onExtraCallback((ResourceEncoder<K, V>) k);
        }
        return resourceEncoderOnExtraCallbackWithResult.onExtraCallbackWithResult(i, (int) k, i2 + 5);
    }

    public final ResourceEncoder<K, V> onWarmupCompleted(@NotNull ResourceEncoder<K, V> resourceEncoder, int i, @NotNull AppGlideModule appGlideModule, @NotNull RegistryNoImageHeaderParserException<K, V> registryNoImageHeaderParserException) {
        Intrinsics.checkNotNullParameter(resourceEncoder, "");
        Intrinsics.checkNotNullParameter(appGlideModule, "");
        Intrinsics.checkNotNullParameter(registryNoImageHeaderParserException, "");
        if (this == resourceEncoder) {
            appGlideModule.onExtraCallbackWithResult(IAuthTabCallbackDefault());
            return this;
        }
        if (i > 30) {
            return onWarmupCompleted(resourceEncoder, appGlideModule, registryNoImageHeaderParserException.IAuthTabCallbackStub());
        }
        int i2 = this.onNavigationEvent | resourceEncoder.onNavigationEvent;
        int i3 = this.onExtraCallbackWithResult;
        int i4 = resourceEncoder.onExtraCallbackWithResult;
        int i5 = (i3 ^ i4) & (~i2);
        int i6 = i3 & i4;
        int i7 = i5;
        while (i6 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i6);
            if (Intrinsics.areEqual(onTransact(onExtraCallback(iLowestOneBit)), resourceEncoder.onTransact(resourceEncoder.onExtraCallback(iLowestOneBit)))) {
                i7 |= iLowestOneBit;
            } else {
                i2 |= iLowestOneBit;
            }
            i6 ^= iLowestOneBit;
        }
        if ((i2 & i7) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        ResourceEncoder<K, V> resourceEncoder2 = (Intrinsics.areEqual(this.onWarmupCompleted, registryNoImageHeaderParserException.IAuthTabCallbackStub()) && this.onExtraCallbackWithResult == i7 && this.onNavigationEvent == i2) ? this : new ResourceEncoder<>(i7, i2, new Object[(Integer.bitCount(i7) << 1) + Integer.bitCount(i2)]);
        int i8 = 0;
        int i9 = i2;
        int i10 = 0;
        while (i9 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i9);
            resourceEncoder2.IAuthTabCallback[(r5.length - 1) - i10] = IAuthTabCallback(resourceEncoder, iLowestOneBit2, i, appGlideModule, registryNoImageHeaderParserException);
            i10++;
            i9 ^= iLowestOneBit2;
        }
        while (i7 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i7);
            int i11 = i8 << 1;
            if (!resourceEncoder.onNavigationEvent(iLowestOneBit3)) {
                int iOnExtraCallback = onExtraCallback(iLowestOneBit3);
                resourceEncoder2.IAuthTabCallback[i11] = onTransact(iOnExtraCallback);
                resourceEncoder2.IAuthTabCallback[i11 + 1] = asBinder(iOnExtraCallback);
            } else {
                int iOnExtraCallback2 = resourceEncoder.onExtraCallback(iLowestOneBit3);
                resourceEncoder2.IAuthTabCallback[i11] = resourceEncoder.onTransact(iOnExtraCallback2);
                resourceEncoder2.IAuthTabCallback[i11 + 1] = resourceEncoder.asBinder(iOnExtraCallback2);
                if (onNavigationEvent(iLowestOneBit3)) {
                    appGlideModule.IAuthTabCallback(appGlideModule.IAuthTabCallback() + 1);
                }
            }
            i8++;
            i7 ^= iLowestOneBit3;
        }
        return onExtraCallback((ResourceEncoder) resourceEncoder2) ? this : resourceEncoder.onExtraCallback((ResourceEncoder) resourceEncoder2) ? resourceEncoder : resourceEncoder2;
    }

    public final onWarmupCompleted<K, V> IAuthTabCallback(int i, K k, V v, int i2) {
        onWarmupCompleted<K, V> onwarmupcompletedIAuthTabCallback;
        int iIAuthTabCallback = 1 << ResourceCacheKey.IAuthTabCallback(i, i2);
        if (onNavigationEvent(iIAuthTabCallback)) {
            int iOnExtraCallback = onExtraCallback(iIAuthTabCallback);
            if (Intrinsics.areEqual(k, onTransact(iOnExtraCallback))) {
                if (asBinder(iOnExtraCallback) == v) {
                    return null;
                }
                return onNavigationEvent(iOnExtraCallback, v).onExtraCallback();
            }
            return onExtraCallback(iOnExtraCallback, iIAuthTabCallback, i, k, v, i2).onNavigationEvent();
        }
        if (IAuthTabCallback(iIAuthTabCallback)) {
            int iOnWarmupCompleted = onWarmupCompleted(iIAuthTabCallback);
            ResourceEncoder<K, V> resourceEncoderOnExtraCallbackWithResult = onExtraCallbackWithResult(iOnWarmupCompleted);
            if (i2 == 30) {
                onwarmupcompletedIAuthTabCallback = resourceEncoderOnExtraCallbackWithResult.IAuthTabCallback(k, v);
                if (onwarmupcompletedIAuthTabCallback == null) {
                    return null;
                }
            } else {
                onwarmupcompletedIAuthTabCallback = resourceEncoderOnExtraCallbackWithResult.IAuthTabCallback(i, k, v, i2 + 5);
                if (onwarmupcompletedIAuthTabCallback == null) {
                    return null;
                }
            }
            onwarmupcompletedIAuthTabCallback.onNavigationEvent(onExtraCallbackWithResult(iOnWarmupCompleted, iIAuthTabCallback, onwarmupcompletedIAuthTabCallback.onNavigationEvent()));
            return onwarmupcompletedIAuthTabCallback;
        }
        return onExtraCallbackWithResult(iIAuthTabCallback, (int) k, (K) v).onNavigationEvent();
    }

    public final ResourceEncoder<K, V> onExtraCallbackWithResult(int i, K k, V v, int i2, @NotNull RegistryNoImageHeaderParserException<K, V> registryNoImageHeaderParserException) {
        ResourceEncoder<K, V> resourceEncoderOnExtraCallbackWithResult;
        Intrinsics.checkNotNullParameter(registryNoImageHeaderParserException, "");
        int iIAuthTabCallback = 1 << ResourceCacheKey.IAuthTabCallback(i, i2);
        if (onNavigationEvent(iIAuthTabCallback)) {
            int iOnExtraCallback = onExtraCallback(iIAuthTabCallback);
            if (Intrinsics.areEqual(k, onTransact(iOnExtraCallback))) {
                registryNoImageHeaderParserException.IAuthTabCallback(asBinder(iOnExtraCallback));
                if (asBinder(iOnExtraCallback) != v) {
                    return onNavigationEvent(iOnExtraCallback, (int) v, (RegistryNoImageHeaderParserException<K, int>) registryNoImageHeaderParserException);
                }
            } else {
                registryNoImageHeaderParserException.onWarmupCompleted(registryNoImageHeaderParserException.size() + 1);
                return onExtraCallback(iOnExtraCallback, iIAuthTabCallback, i, k, v, i2, registryNoImageHeaderParserException.IAuthTabCallbackStub());
            }
        } else if (IAuthTabCallback(iIAuthTabCallback)) {
            int iOnWarmupCompleted = onWarmupCompleted(iIAuthTabCallback);
            ResourceEncoder<K, V> resourceEncoderOnExtraCallbackWithResult2 = onExtraCallbackWithResult(iOnWarmupCompleted);
            if (i2 == 30) {
                resourceEncoderOnExtraCallbackWithResult = resourceEncoderOnExtraCallbackWithResult2.onNavigationEvent((ResourceEncoder<K, V>) k, (K) v, (RegistryNoImageHeaderParserException<ResourceEncoder<K, V>, K>) registryNoImageHeaderParserException);
            } else {
                resourceEncoderOnExtraCallbackWithResult = resourceEncoderOnExtraCallbackWithResult2.onExtraCallbackWithResult(i, k, v, i2 + 5, registryNoImageHeaderParserException);
            }
            if (resourceEncoderOnExtraCallbackWithResult2 != resourceEncoderOnExtraCallbackWithResult) {
                return onNavigationEvent(iOnWarmupCompleted, resourceEncoderOnExtraCallbackWithResult, registryNoImageHeaderParserException.IAuthTabCallbackStub());
            }
        } else {
            registryNoImageHeaderParserException.onWarmupCompleted(registryNoImageHeaderParserException.size() + 1);
            return onWarmupCompleted(iIAuthTabCallback, (int) k, (K) v, registryNoImageHeaderParserException.IAuthTabCallbackStub());
        }
        return this;
    }

    public final ResourceEncoder<K, V> onWarmupCompleted(int i, K k, int i2, @NotNull RegistryNoImageHeaderParserException<K, V> registryNoImageHeaderParserException) {
        ResourceEncoder<K, V> resourceEncoderOnWarmupCompleted;
        Intrinsics.checkNotNullParameter(registryNoImageHeaderParserException, "");
        int iIAuthTabCallback = 1 << ResourceCacheKey.IAuthTabCallback(i, i2);
        if (onNavigationEvent(iIAuthTabCallback)) {
            int iOnExtraCallback = onExtraCallback(iIAuthTabCallback);
            if (Intrinsics.areEqual(k, onTransact(iOnExtraCallback))) {
                return onExtraCallback(iOnExtraCallback, iIAuthTabCallback, registryNoImageHeaderParserException);
            }
        } else if (IAuthTabCallback(iIAuthTabCallback)) {
            int iOnWarmupCompleted = onWarmupCompleted(iIAuthTabCallback);
            ResourceEncoder<K, V> resourceEncoderOnExtraCallbackWithResult = onExtraCallbackWithResult(iOnWarmupCompleted);
            if (i2 == 30) {
                resourceEncoderOnWarmupCompleted = resourceEncoderOnExtraCallbackWithResult.onWarmupCompleted((ResourceEncoder<K, V>) k, (RegistryNoImageHeaderParserException<ResourceEncoder<K, V>, V>) registryNoImageHeaderParserException);
            } else {
                resourceEncoderOnWarmupCompleted = resourceEncoderOnExtraCallbackWithResult.onWarmupCompleted(i, (int) k, i2 + 5, (RegistryNoImageHeaderParserException<int, V>) registryNoImageHeaderParserException);
            }
            return onNavigationEvent(resourceEncoderOnExtraCallbackWithResult, resourceEncoderOnWarmupCompleted, iOnWarmupCompleted, iIAuthTabCallback, registryNoImageHeaderParserException.IAuthTabCallbackStub());
        }
        return this;
    }

    private final ResourceEncoder<K, V> onNavigationEvent(ResourceEncoder<K, V> resourceEncoder, ResourceEncoder<K, V> resourceEncoder2, int i, int i2, ResourceEncoderRegistry resourceEncoderRegistry) {
        if (resourceEncoder2 == null) {
            return onExtraCallback(i, i2, resourceEncoderRegistry);
        }
        return resourceEncoder != resourceEncoder2 ? onNavigationEvent(i, resourceEncoder2, resourceEncoderRegistry) : this;
    }

    public final ResourceEncoder<K, V> onExtraCallback(int i, K k, V v, int i2, @NotNull RegistryNoImageHeaderParserException<K, V> registryNoImageHeaderParserException) {
        ResourceEncoder<K, V> resourceEncoderOnExtraCallback;
        Intrinsics.checkNotNullParameter(registryNoImageHeaderParserException, "");
        int iIAuthTabCallback = 1 << ResourceCacheKey.IAuthTabCallback(i, i2);
        if (onNavigationEvent(iIAuthTabCallback)) {
            int iOnExtraCallback = onExtraCallback(iIAuthTabCallback);
            if (Intrinsics.areEqual(k, onTransact(iOnExtraCallback)) && Intrinsics.areEqual(v, asBinder(iOnExtraCallback))) {
                return onExtraCallback(iOnExtraCallback, iIAuthTabCallback, registryNoImageHeaderParserException);
            }
        } else if (IAuthTabCallback(iIAuthTabCallback)) {
            int iOnWarmupCompleted = onWarmupCompleted(iIAuthTabCallback);
            ResourceEncoder<K, V> resourceEncoderOnExtraCallbackWithResult = onExtraCallbackWithResult(iOnWarmupCompleted);
            if (i2 == 30) {
                resourceEncoderOnExtraCallback = resourceEncoderOnExtraCallbackWithResult.onExtraCallbackWithResult((ResourceEncoder<K, V>) k, (K) v, (RegistryNoImageHeaderParserException<ResourceEncoder<K, V>, K>) registryNoImageHeaderParserException);
            } else {
                resourceEncoderOnExtraCallback = resourceEncoderOnExtraCallbackWithResult.onExtraCallback(i, k, v, i2 + 5, registryNoImageHeaderParserException);
            }
            return onNavigationEvent(resourceEncoderOnExtraCallbackWithResult, resourceEncoderOnExtraCallback, iOnWarmupCompleted, iIAuthTabCallback, registryNoImageHeaderParserException.IAuthTabCallbackStub());
        }
        return this;
    }

    public final <K1, V1> boolean onExtraCallback(@NotNull ResourceEncoder<K1, V1> resourceEncoder, @NotNull Function2<? super V, ? super V1, Boolean> function2) {
        int i;
        Intrinsics.checkNotNullParameter(resourceEncoder, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (this == resourceEncoder) {
            return true;
        }
        int i2 = this.onExtraCallbackWithResult;
        if (i2 != resourceEncoder.onExtraCallbackWithResult || (i = this.onNavigationEvent) != resourceEncoder.onNavigationEvent) {
            return false;
        }
        if (i2 == 0 && i == 0) {
            Object[] objArr = this.IAuthTabCallback;
            if (objArr.length != resourceEncoder.IAuthTabCallback.length) {
                return false;
            }
            Iterable iterableStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, objArr.length), 2);
            if ((iterableStep instanceof Collection) && ((Collection) iterableStep).isEmpty()) {
                return true;
            }
            Iterator it = iterableStep.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                K1 k1OnTransact = resourceEncoder.onTransact(iNextInt);
                V1 v1AsBinder = resourceEncoder.asBinder(iNextInt);
                int iIAuthTabCallback = IAuthTabCallback(k1OnTransact);
                if (iIAuthTabCallback == -1 || !function2.invoke(asBinder(iIAuthTabCallback), v1AsBinder).booleanValue()) {
                    return false;
                }
            }
            return true;
        }
        int iBitCount = Integer.bitCount(i2) << 1;
        IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, iBitCount), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (Intrinsics.areEqual(onTransact(first), resourceEncoder.onTransact(first)) && function2.invoke(asBinder(first), resourceEncoder.asBinder(first)).booleanValue()) {
                if (first != last) {
                    first += step;
                }
            }
            return false;
        }
        int length = this.IAuthTabCallback.length;
        while (iBitCount < length) {
            if (!onExtraCallbackWithResult(iBitCount).onExtraCallback(resourceEncoder.onExtraCallbackWithResult(iBitCount), function2)) {
                return false;
            }
            iBitCount++;
        }
        return true;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final ResourceEncoder onExtraCallback() {
            return ResourceEncoder.onExtraCallback;
        }
    }
}
