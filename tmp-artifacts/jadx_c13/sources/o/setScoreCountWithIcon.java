package o;

import java.lang.Enum;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.setScoreCountWithIcon;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setScoreCountWithIcon<T extends Enum<T>> implements KSerializer<T> {
    private final Lazy onExtraCallback;
    private SerialDescriptor onExtraCallbackWithResult;
    private final T[] onWarmupCompleted;

    public setScoreCountWithIcon(@NotNull final String str, @NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tArr, "");
        this.onWarmupCompleted = tArr;
        this.onExtraCallback = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kotlinx.serialization.internal.EnumSerializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return setScoreCountWithIcon.IAuthTabCallback(this.f$0, str);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setScoreCountWithIcon(@NotNull String str, @NotNull T[] tArr, @NotNull SerialDescriptor serialDescriptor) {
        this(str, tArr);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        this.onExtraCallbackWithResult = serialDescriptor;
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.onExtraCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor IAuthTabCallback(setScoreCountWithIcon setscorecountwithicon, String str) {
        SerialDescriptor serialDescriptor = setscorecountwithicon.onExtraCallbackWithResult;
        return serialDescriptor == null ? setscorecountwithicon.IAuthTabCallback(str) : serialDescriptor;
    }

    private final SerialDescriptor IAuthTabCallback(String str) {
        setTimeOutListener settimeoutlistener = new setTimeOutListener(str, this.onWarmupCompleted.length);
        for (T t : this.onWarmupCompleted) {
            setAnimationsLoop.onExtraCallbackWithResult(settimeoutlistener, t.name(), false, 2, null);
        }
        return settimeoutlistener;
    }

    @Override // o.py
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull T t) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(t, "");
        int iIndexOf = ArraysKt___ArraysKt.indexOf(this.onWarmupCompleted, t);
        if (iIndexOf == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(t);
            sb.append(" is not a valid enum ");
            sb.append(getDescriptor().onExtraCallbackWithResult());
            sb.append(", must be one of ");
            String string = Arrays.toString(this.onWarmupCompleted);
            Intrinsics.checkNotNullExpressionValue(string, "");
            sb.append(string);
            throw new qn(sb.toString());
        }
        encoder.onExtraCallback(getDescriptor(), iIndexOf);
    }

    @Override // o.jp
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        int iIAuthTabCallback = decoder.IAuthTabCallback(getDescriptor());
        if (iIAuthTabCallback >= 0) {
            T[] tArr = this.onWarmupCompleted;
            if (iIAuthTabCallback < tArr.length) {
                return tArr[iIAuthTabCallback];
            }
        }
        throw new qn(iIAuthTabCallback + " is not among valid " + getDescriptor().onExtraCallbackWithResult() + " enum values, values size is " + this.onWarmupCompleted.length);
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().onExtraCallbackWithResult() + '>';
    }
}
