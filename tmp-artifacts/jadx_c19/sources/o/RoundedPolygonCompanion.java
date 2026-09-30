package o;

import com.fasterxml.jackson.databind.JavaType;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RoundedPolygonCompanion extends nSetBufferTransform {
    private static final long serialVersionUID = 1;
    protected final Constructor<?> _constructor;
    protected onExtraCallbackWithResult _serialization;

    public RoundedPolygonCompanion(onTransactionCommitted ontransactioncommitted, Constructor<?> constructor, nIsHwuiUsingVulkanRenderer nishwuiusingvulkanrenderer, nIsHwuiUsingVulkanRenderer[] nishwuiusingvulkanrendererArr) {
        super(ontransactioncommitted, nishwuiusingvulkanrenderer, nishwuiusingvulkanrendererArr);
        Objects.requireNonNull(constructor);
        this._constructor = constructor;
    }

    protected RoundedPolygonCompanion(onExtraCallbackWithResult onextracallbackwithresult) {
        super(null, null, null);
        this._constructor = null;
        this._serialization = onextracallbackwithresult;
    }

    @Override // o.nCreate
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public RoundedPolygonCompanion IAuthTabCallback(nIsHwuiUsingVulkanRenderer nishwuiusingvulkanrenderer) {
        return new RoundedPolygonCompanion(this.onWarmupCompleted, this._constructor, nishwuiusingvulkanrenderer, this._paramAnnotations);
    }

    @Override // o.internalPathIteratorPeek
    /* renamed from: IAuthTabCallbackDefault, reason: merged with bridge method [inline-methods] */
    public Constructor<?> onWarmupCompleted() {
        return this._constructor;
    }

    @Override // o.internalPathIteratorPeek
    public int onExtraCallbackWithResult() {
        return this._constructor.getModifiers();
    }

    @Override // o.internalPathIteratorPeek
    public String onExtraCallback() {
        return this._constructor.getName();
    }

    @Override // o.internalPathIteratorPeek
    public JavaType IAuthTabCallback() {
        return this.onWarmupCompleted.IAuthTabCallback(onNavigationEvent());
    }

    @Override // o.internalPathIteratorPeek
    public Class<?> onNavigationEvent() {
        return this._constructor.getDeclaringClass();
    }

    @Override // o.nSetBufferTransform
    public int access100() {
        return this._constructor.getParameterCount();
    }

    @Override // o.nSetBufferTransform
    public Class<?> onExtraCallbackWithResult(int i2) {
        Class<?>[] parameterTypes = this._constructor.getParameterTypes();
        if (i2 >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i2];
    }

    @Override // o.nSetBufferTransform
    public JavaType onNavigationEvent(int i2) {
        Type[] genericParameterTypes = this._constructor.getGenericParameterTypes();
        if (i2 >= genericParameterTypes.length) {
            return null;
        }
        return this.onWarmupCompleted.IAuthTabCallback(genericParameterTypes[i2]);
    }

    @Override // o.nSetBufferTransform
    public final Object asInterface() throws Exception {
        return this._constructor.newInstance(null);
    }

    @Override // o.nSetBufferTransform
    public final Object onWarmupCompleted(Object[] objArr) throws Exception {
        return this._constructor.newInstance(objArr);
    }

    @Override // o.nSetBufferTransform
    public final Object onExtraCallbackWithResult(Object obj) throws Exception {
        return this._constructor.newInstance(obj);
    }

    @Override // o.nCreate
    public Class<?> onTransact() {
        return this._constructor.getDeclaringClass();
    }

    @Override // o.nCreate
    public Member IAuthTabCallbackStub() {
        return this._constructor;
    }

    @Override // o.nCreate
    public void onNavigationEvent(Object obj, Object obj2) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor of " + onTransact().getName());
    }

    @Override // o.nCreate
    public Object onWarmupCompleted(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor of " + onTransact().getName());
    }

    @Override // o.internalPathIteratorPeek
    public String toString() {
        int parameterCount = this._constructor.getParameterCount();
        return String.format("[constructor for %s (%d arg%s), annotations: %s", SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(this._constructor.getDeclaringClass()), Integer.valueOf(parameterCount), parameterCount == 1 ? "" : "s", this.IAuthTabCallback);
    }

    @Override // o.internalPathIteratorPeek
    public int hashCode() {
        return Objects.hashCode(this._constructor);
    }

    @Override // o.internalPathIteratorPeek
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (((Boolean) SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(-971345653, new Object[]{obj, RoundedPolygonCompanion.class}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 971345658, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult())).booleanValue()) {
            return Objects.equals(this._constructor, ((RoundedPolygonCompanion) obj)._constructor);
        }
        return false;
    }

    Object writeReplace() {
        return new RoundedPolygonCompanion(new onExtraCallbackWithResult(this._constructor));
    }

    Object readResolve() throws NoSuchMethodException, SecurityException {
        onExtraCallbackWithResult onextracallbackwithresult = this._serialization;
        Class cls = onextracallbackwithresult.clazz;
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(onextracallbackwithresult.args);
            if (!declaredConstructor.isAccessible()) {
                SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(1769484191, new Object[]{declaredConstructor, false}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1769484188, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
            }
            return new RoundedPolygonCompanion(null, declaredConstructor, null, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find constructor with " + this._serialization.args.length + " args from Class '" + cls.getName());
        }
    }
}
