package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.Map;
import o.access4900;
import o.access5000;
import o.access5600;
import o.access5900;
import o.addCauses;
import o.addCommandLineBytes;
import o.clearPacEnabledKeys;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class CallableReference implements access4900, Serializable, KotlinGenericDeclaration {
    public static final Object NO_RECEIVER = NoReceiver.INSTANCE;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    public final Object receiver;
    private transient access4900 reflected;
    private final String signature;

    protected abstract access4900 computeReflected();

    static class NoReceiver implements Serializable {
        private static final NoReceiver INSTANCE = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() throws ObjectStreamException {
            return INSTANCE;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    public CallableReference(Object obj) {
        this(obj, null, null, null, false);
    }

    protected CallableReference(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public access4900 compute() {
        access4900 access4900Var = this.reflected;
        if (access4900Var != null) {
            return access4900Var;
        }
        access4900 access4900VarComputeReflected = computeReflected();
        this.reflected = access4900VarComputeReflected;
        return access4900VarComputeReflected;
    }

    protected access4900 getReflected() {
        access4900 access4900VarCompute = compute();
        if (access4900VarCompute != this) {
            return access4900VarCompute;
        }
        throw new clearPacEnabledKeys();
    }

    public access5000 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? Reflection.getOrCreateKotlinPackage(cls) : Reflection.getOrCreateKotlinClass(cls);
    }

    @Override // o.access4900
    public String getName() {
        return this.name;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // kotlin.jvm.internal.KotlinGenericDeclaration
    public GenericDeclaration findJavaDeclaration() {
        return KotlinGenericDeclarationKt.findMethodBySignature(getOwner(), getSignature());
    }

    @Override // o.access4900
    public List<access5600> getParameters() {
        return getReflected().getParameters();
    }

    @Override // o.access4900
    public access5900 getReturnType() {
        return getReflected().getReturnType();
    }

    @Override // o.access4600
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @Override // o.access4900
    public List<addCauses> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // o.access4900
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // o.access4900
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @Override // o.access4900
    public addCommandLineBytes getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // o.access4900
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // o.access4900
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // o.access4900
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // o.access4900
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
