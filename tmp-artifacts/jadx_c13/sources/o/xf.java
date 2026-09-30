package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class xf<T> implements KSerializer<T> {
    public abstract KClass<T> onExtraCallbackWithResult();

    @Override // o.py
    public final void serialize(@NotNull Encoder encoder, @NotNull T t) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(t, "");
        py<? super T> pyVarOnNavigationEvent = mue.onNavigationEvent(this, encoder, t);
        SerialDescriptor descriptor = getDescriptor();
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(descriptor);
        vylVarOnExtraCallback.onExtraCallback(getDescriptor(), 0, pyVarOnNavigationEvent.getDescriptor().onExtraCallbackWithResult());
        SerialDescriptor descriptor2 = getDescriptor();
        Intrinsics.checkNotNull(pyVarOnNavigationEvent, "");
        vylVarOnExtraCallback.onNavigationEvent(descriptor2, 1, pyVarOnNavigationEvent, t);
        vylVarOnExtraCallback.onNavigationEvent(descriptor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.jp
    public final T deserialize(@NotNull Decoder decoder) {
        T t;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor = getDescriptor();
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            t = (T) onExtraCallbackWithResult(ywVarOnWarmupCompleted);
        } else {
            Object objOnExtraCallback = null;
            while (true) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(getDescriptor());
                if (iOnNavigationEvent != -1) {
                    if (iOnNavigationEvent == 0) {
                        objectRef.element = (T) ywVarOnWarmupCompleted.asInterface(getDescriptor(), iOnNavigationEvent);
                    } else if (iOnNavigationEvent == 1) {
                        T t2 = objectRef.element;
                        if (t2 == 0) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        objectRef.element = t2;
                        objOnExtraCallback = yw.onExtraCallback(ywVarOnWarmupCompleted, getDescriptor(), iOnNavigationEvent, mue.onExtraCallback(this, ywVarOnWarmupCompleted, (String) t2), null, 8, null);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid index in polymorphic deserialization of ");
                        String str = (String) objectRef.element;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb.append(str);
                        sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb.append(iOnNavigationEvent);
                        throw new qn(sb.toString());
                    }
                } else if (objOnExtraCallback != null) {
                    Intrinsics.checkNotNull(objOnExtraCallback, "");
                    t = (T) objOnExtraCallback;
                } else {
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) objectRef.element)).toString());
                }
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor);
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T onExtraCallbackWithResult(yw ywVar) {
        return (T) yw.onExtraCallback(ywVar, getDescriptor(), 1, mue.onExtraCallback(this, ywVar, ywVar.asInterface(getDescriptor(), 0)), null, 8, null);
    }

    public jp<T> onExtraCallbackWithResult(@NotNull yw ywVar, @Nullable String str) {
        Intrinsics.checkNotNullParameter(ywVar, "");
        return ywVar.IAuthTabCallback().onExtraCallbackWithResult(onExtraCallbackWithResult(), str);
    }

    public py<T> onWarmupCompleted(@NotNull Encoder encoder, @NotNull T t) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(t, "");
        return encoder.onNavigationEvent().onNavigationEvent(onExtraCallbackWithResult(), t);
    }
}
