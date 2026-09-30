package o;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.ReferenceArraySerializer;
import o.access13000;
import o.getCommandLine;
import o.getU64;
import o.setLogBuffers;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class sp {
    public static final <T> KSerializer<T> IAuthTabCallback(@NotNull KSerializer<T> kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "");
        return kSerializer.getDescriptor().asInterface() ? kSerializer : new setGuideText(kSerializer);
    }

    public static final <K, V> KSerializer<Pair<K, V>> onNavigationEvent(@NotNull KSerializer<K> kSerializer, @NotNull KSerializer<V> kSerializer2) {
        Intrinsics.checkNotNullParameter(kSerializer, "");
        Intrinsics.checkNotNullParameter(kSerializer2, "");
        return new setAlphaColor(kSerializer, kSerializer2);
    }

    public static final <K, V> KSerializer<Map.Entry<K, V>> IAuthTabCallback(@NotNull KSerializer<K> kSerializer, @NotNull KSerializer<V> kSerializer2) {
        Intrinsics.checkNotNullParameter(kSerializer, "");
        Intrinsics.checkNotNullParameter(kSerializer2, "");
        return new setCoreColor(kSerializer, kSerializer2);
    }

    public static final <A, B, C> KSerializer<Triple<A, B, C>> onExtraCallback(@NotNull KSerializer<A> kSerializer, @NotNull KSerializer<B> kSerializer2, @NotNull KSerializer<C> kSerializer3) {
        Intrinsics.checkNotNullParameter(kSerializer, "");
        Intrinsics.checkNotNullParameter(kSerializer2, "");
        Intrinsics.checkNotNullParameter(kSerializer3, "");
        return new setGuideTextColor(kSerializer, kSerializer2, kSerializer3);
    }

    public static final KSerializer<Character> onExtraCallbackWithResult(@NotNull CharCompanionObject charCompanionObject) {
        Intrinsics.checkNotNullParameter(charCompanionObject, "");
        return getTimeOut.onExtraCallbackWithResult;
    }

    public static final KSerializer<char[]> onExtraCallback() {
        return getRenderListener.onNavigationEvent;
    }

    public static final KSerializer<Byte> onExtraCallback(@NotNull ByteCompanionObject byteCompanionObject) {
        Intrinsics.checkNotNullParameter(byteCompanionObject, "");
        return beginShowFromInvisible.IAuthTabCallback;
    }

    public static final KSerializer<byte[]> onNavigationEvent() {
        return callBackRenderFail.onExtraCallbackWithResult;
    }

    public static final KSerializer<access13200> asBinder() {
        return pmi11.onWarmupCompleted;
    }

    public static final KSerializer<Short> onNavigationEvent(@NotNull ShortCompanionObject shortCompanionObject) {
        Intrinsics.checkNotNullParameter(shortCompanionObject, "");
        return getWriggleProgressIv.onWarmupCompleted;
    }

    public static final KSerializer<short[]> onTransact() {
        return otyycx.onExtraCallback;
    }

    public static final KSerializer<TombstoneProtosRegisterBuilder> access100() {
        return getStarEmptyDrawable.IAuthTabCallback;
    }

    public static final KSerializer<Integer> IAuthTabCallback(@NotNull IntCompanionObject intCompanionObject) {
        Intrinsics.checkNotNullParameter(intCompanionObject, "");
        return getDynamicHeight.onWarmupCompleted;
    }

    public static final KSerializer<int[]> IAuthTabCallbackDefault() {
        return getClickArea.onExtraCallback;
    }

    public static final KSerializer<access13400> IAuthTabCallback_Parcel() {
        return setSlideText.IAuthTabCallback;
    }

    public static final KSerializer<Long> onNavigationEvent(@NotNull LongCompanionObject longCompanionObject) {
        Intrinsics.checkNotNullParameter(longCompanionObject, "");
        return oty1.onExtraCallback;
    }

    public static final KSerializer<long[]> IAuthTabCallbackStub() {
        return syc1.onExtraCallbackWithResult;
    }

    public static final KSerializer<access13100> access000() {
        return ry2.onExtraCallback;
    }

    public static final KSerializer<Float> onWarmupCompleted(@NotNull FloatCompanionObject floatCompanionObject) {
        Intrinsics.checkNotNullParameter(floatCompanionObject, "");
        return dj3.onWarmupCompleted;
    }

    public static final KSerializer<float[]> IAuthTabCallback() {
        return aeu3.IAuthTabCallback;
    }

    public static final KSerializer<Double> onWarmupCompleted(@NotNull DoubleCompanionObject doubleCompanionObject) {
        Intrinsics.checkNotNullParameter(doubleCompanionObject, "");
        return setVideoListener.onWarmupCompleted;
    }

    public static final KSerializer<double[]> onWarmupCompleted() {
        return setMuteListener.onNavigationEvent;
    }

    public static final KSerializer<Boolean> onExtraCallback(@NotNull BooleanCompanionObject booleanCompanionObject) {
        Intrinsics.checkNotNullParameter(booleanCompanionObject, "");
        return getBgColor.IAuthTabCallback;
    }

    public static final KSerializer<boolean[]> onExtraCallbackWithResult() {
        return setClipChildren.onWarmupCompleted;
    }

    public static final KSerializer<Unit> onExtraCallback(@NotNull Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return getStarFillDrawable.onExtraCallback;
    }

    public static final KSerializer<String> onExtraCallbackWithResult(@NotNull StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "");
        return getWriggleLayout.onNavigationEvent;
    }

    public static final <T, E extends T> KSerializer<E[]> IAuthTabCallback(@NotNull KClass<T> kClass, @NotNull KSerializer<E> kSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kSerializer, "");
        return new ReferenceArraySerializer(kClass, kSerializer);
    }

    public static final <T> KSerializer<List<T>> onExtraCallback(@NotNull KSerializer<T> kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "");
        return new checkCanOpenLandingPage(kSerializer);
    }

    public static final <T> KSerializer<Set<T>> onWarmupCompleted(@NotNull KSerializer<T> kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "");
        return new ul1(kSerializer);
    }

    public static final <K, V> KSerializer<Map<K, V>> onExtraCallback(@NotNull KSerializer<K> kSerializer, @NotNull KSerializer<V> kSerializer2) {
        Intrinsics.checkNotNullParameter(kSerializer, "");
        Intrinsics.checkNotNullParameter(kSerializer2, "");
        return new getMutilBackgroundDrawable(kSerializer, kSerializer2);
    }

    public static final KSerializer<UInt> onWarmupCompleted(@NotNull UInt.onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        return thx1.IAuthTabCallback;
    }

    public static final KSerializer<access13000> onExtraCallback(@NotNull access13000.onNavigationEvent onnavigationevent) {
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        return thx11.onWarmupCompleted;
    }

    public static final KSerializer<UByte> onNavigationEvent(@NotNull UByte.onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        return pmi2.IAuthTabCallback;
    }

    public static final KSerializer<getU64> onExtraCallback(@NotNull getU64.onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        return wie1.onNavigationEvent;
    }

    public static final KSerializer<setLogBuffers> IAuthTabCallback(@NotNull setLogBuffers.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        return setTimedown.IAuthTabCallback;
    }

    public static final KSerializer<getCommandLine> onWarmupCompleted(@NotNull getCommandLine.onWarmupCompleted onwarmupcompleted) {
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        return makeView.onExtraCallbackWithResult;
    }

    public static final KSerializer asInterface() {
        return setYRound.onWarmupCompleted;
    }
}
