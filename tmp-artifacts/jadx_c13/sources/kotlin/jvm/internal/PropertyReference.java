package kotlin.jvm.internal;

import o.access4900;
import o.addAllCommandLine;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class PropertyReference extends CallableReference implements addAllCommandLine {
    private final boolean syntheticJavaProperty;

    public PropertyReference() {
        this.syntheticJavaProperty = false;
    }

    public PropertyReference(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.CallableReference
    public addAllCommandLine getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (addAllCommandLine) super.getReflected();
    }

    @Override // kotlin.jvm.internal.CallableReference
    public access4900 compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    @Override // o.addAllCommandLine
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    @Override // o.addAllCommandLine
    public boolean isConst() {
        return getReflected().isConst();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return getOwner().equals(propertyReference.getOwner()) && getName().equals(propertyReference.getName()) && getSignature().equals(propertyReference.getSignature()) && Intrinsics.areEqual(getBoundReceiver(), propertyReference.getBoundReceiver());
        }
        if (obj instanceof addAllCommandLine) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        access4900 access4900VarCompute = compute();
        if (access4900VarCompute != this) {
            return access4900VarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
