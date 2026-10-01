package kotlin.jvm.internal;

import o.access4900;
import o.access5300;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class FunctionReference extends CallableReference implements FunctionBase, access5300 {
    private final int arity;

    public FunctionReference(int i) {
        this(i, CallableReference.NO_RECEIVER, null, null, null, 0);
    }

    public FunctionReference(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.CallableReference
    public access5300 getReflected() {
        return (access5300) super.getReflected();
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected access4900 computeReflected() {
        return Reflection.function(this);
    }

    @Override // o.access5300
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // o.access5300
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // o.access5300
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // o.access5300
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.jvm.internal.CallableReference, o.access4900
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && Intrinsics.areEqual(getBoundReceiver(), functionReference.getBoundReceiver()) && Intrinsics.areEqual(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof access5300) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        access4900 access4900VarCompute = compute();
        if (access4900VarCompute != this) {
            return access4900VarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
