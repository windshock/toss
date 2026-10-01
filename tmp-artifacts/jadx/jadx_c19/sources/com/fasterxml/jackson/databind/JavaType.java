package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.type.ResolvedType;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;
import o.LifecycleEffectKtExternalSyntheticLambda4;
import o.LifecycleEffectKtExternalSyntheticLambda6;
import o.SavedStateHandleImplExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class JavaType extends ResolvedType implements Serializable, Type {
    private static final long serialVersionUID = 1;
    public final boolean _asStatic;
    public final Class<?> _class;
    protected final int _hash;
    public final Object _typeHandler;
    public final Object _valueHandler;

    public abstract JavaType IAuthTabCallback(int i2);

    public abstract JavaType IAuthTabCallback(JavaType javaType);

    public abstract JavaType IAuthTabCallback(Class<?> cls);

    public abstract List<JavaType> IAuthTabCallbackDefault();

    public JavaType IAuthTabCallbackStub() {
        return null;
    }

    public abstract JavaType IAuthTabCallbackStubProxy();

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    /* renamed from: IAuthTabCallback_Parcel, reason: merged with bridge method [inline-methods] */
    public JavaType onNavigationEvent() {
        return null;
    }

    public boolean ICustomTabsCallback() {
        return false;
    }

    public boolean access100() {
        return true;
    }

    public JavaType asInterface() {
        return null;
    }

    public abstract boolean equals(Object obj);

    public abstract JavaType isEngagementSignalsApiAvailable();

    public abstract int onExtraCallback();

    public abstract JavaType onExtraCallback(Object obj);

    public abstract StringBuilder onExtraCallback(StringBuilder sb);

    public abstract JavaType onExtraCallbackWithResult(Object obj);

    public abstract StringBuilder onExtraCallbackWithResult(StringBuilder sb);

    public abstract JavaType onNavigationEvent(Class<?> cls, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6, JavaType javaType, JavaType[] javaTypeArr);

    public abstract JavaType onNavigationEvent(Object obj);

    public abstract boolean onPostMessage();

    public boolean onUnminimized() {
        return false;
    }

    public abstract JavaType onWarmupCompleted(Object obj);

    public abstract LifecycleEffectKtExternalSyntheticLambda6 onWarmupCompleted();

    public boolean readTypedObject() {
        return false;
    }

    public abstract String toString();

    public JavaType(Class<?> cls, int i2, Object obj, Object obj2, boolean z) {
        this._class = cls;
        this._hash = (i2 * 31) + cls.hashCode();
        this._valueHandler = obj;
        this._typeHandler = obj2;
        this._asStatic = z;
    }

    public JavaType onNavigationEvent(JavaType javaType) {
        Object objAccess000 = javaType.access000();
        JavaType javaTypeOnExtraCallback = objAccess000 != this._typeHandler ? onExtraCallback(objAccess000) : this;
        Object interfaceDescriptor = javaType.getInterfaceDescriptor();
        return interfaceDescriptor != this._valueHandler ? javaTypeOnExtraCallback.onWarmupCompleted(interfaceDescriptor) : javaTypeOnExtraCallback;
    }

    public final Class<?> asBinder() {
        return this._class;
    }

    public final boolean onNavigationEvent(Class<?> cls) {
        return this._class == cls;
    }

    public final boolean onWarmupCompleted(Class<?> cls) {
        Class<?> cls2 = this._class;
        return cls2 == cls || cls.isAssignableFrom(cls2);
    }

    public final boolean onExtraCallbackWithResult(Class<?> cls) {
        Class<?> cls2 = this._class;
        return cls2 == cls || cls2.isAssignableFrom(cls);
    }

    public boolean writeTypedObject() {
        return Modifier.isAbstract(this._class.getModifiers());
    }

    public boolean onMessageChannelReady() {
        if ((this._class.getModifiers() & 1536) == 0) {
            return true;
        }
        return this._class.isPrimitive();
    }

    public boolean ICustomTabsCallback_Parcel() {
        return Throwable.class.isAssignableFrom(this._class);
    }

    public final boolean onActivityLayout() {
        return SavedStateHandleImplExternalSyntheticLambda0.access100(this._class);
    }

    public final boolean onActivityResized() {
        return SavedStateHandleImplExternalSyntheticLambda0.access100(this._class) && this._class != Enum.class;
    }

    public final boolean ICustomTabsCallbackStubProxy() {
        return SavedStateHandleImplExternalSyntheticLambda0.onMinimized(this._class);
    }

    public final boolean onRelationshipValidationResult() {
        return this._class.isInterface();
    }

    public final boolean ICustomTabsCallbackStub() {
        return this._class.isPrimitive();
    }

    public final boolean onMinimized() {
        return Modifier.isFinal(this._class.getModifiers());
    }

    public final boolean ICustomTabsCallbackDefault() {
        return this._class == Object.class;
    }

    public final boolean extraCommand() {
        return this._asStatic;
    }

    public boolean extraCallback() {
        return onExtraCallback() > 0;
    }

    public JavaType onWarmupCompleted(int i2) {
        JavaType javaTypeIAuthTabCallback = IAuthTabCallback(i2);
        return javaTypeIAuthTabCallback == null ? LifecycleEffectKtExternalSyntheticLambda4.IAuthTabCallback() : javaTypeIAuthTabCallback;
    }

    public <T> T getInterfaceDescriptor() {
        return (T) this._valueHandler;
    }

    public <T> T access000() {
        return (T) this._typeHandler;
    }

    public boolean extraCallbackWithResult() {
        return (this._typeHandler == null && this._valueHandler == null) ? false : true;
    }

    public String onTransact() {
        StringBuilder sb = new StringBuilder(40);
        onExtraCallback(sb);
        return sb.toString();
    }

    public int hashCode() {
        return this._hash;
    }
}
