package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import o.LifecycleEffectKtExternalSyntheticLambda6;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class SimpleType extends TypeBase {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean access100() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType onNavigationEvent(Class<?> cls, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean onPostMessage() {
        return false;
    }

    public SimpleType(Class<?> cls) {
        this(cls, LifecycleEffectKtExternalSyntheticLambda6.IAuthTabCallback(), null, null);
    }

    public SimpleType(Class<?> cls, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6, JavaType javaType, JavaType[] javaTypeArr) {
        this(cls, lifecycleEffectKtExternalSyntheticLambda6, javaType, javaTypeArr, null, null, false);
    }

    protected SimpleType(Class<?> cls, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6, JavaType javaType, JavaType[] javaTypeArr, Object obj, Object obj2, boolean z) {
        super(cls, lifecycleEffectKtExternalSyntheticLambda6, javaType, javaTypeArr, (lifecycleEffectKtExternalSyntheticLambda6 == null ? LifecycleEffectKtExternalSyntheticLambda6.IAuthTabCallback() : lifecycleEffectKtExternalSyntheticLambda6).hashCode(), obj, obj2, z);
    }

    protected SimpleType(Class<?> cls, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6, JavaType javaType, JavaType[] javaTypeArr, int i2, Object obj, Object obj2, boolean z) {
        super(cls, lifecycleEffectKtExternalSyntheticLambda6, javaType, javaTypeArr, i2, obj, obj2, z);
    }

    public static SimpleType onExtraCallback(Class<?> cls) {
        return new SimpleType(cls, null, null, null, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType IAuthTabCallback(JavaType javaType) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: IAuthTabCallbackStub, reason: merged with bridge method [inline-methods] */
    public SimpleType onExtraCallback(Object obj) {
        return this._typeHandler == obj ? this : new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, this._valueHandler, obj, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType onNavigationEvent(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: IAuthTabCallbackStubProxy, reason: merged with bridge method [inline-methods] */
    public SimpleType onWarmupCompleted(Object obj) {
        return obj == this._valueHandler ? this : new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, obj, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: IAuthTabCallbackDefault, reason: merged with bridge method [inline-methods] */
    public SimpleType onExtraCallbackWithResult(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: newAuthTabSession, reason: merged with bridge method [inline-methods] */
    public SimpleType isEngagementSignalsApiAvailable() {
        return this._asStatic ? this : new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, this._valueHandler, this._typeHandler, true);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    protected String ak_() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._class.getName());
        int iOnNavigationEvent = this._bindings.onNavigationEvent();
        if (iOnNavigationEvent > 0 && onExtraCallback(iOnNavigationEvent)) {
            sb.append('<');
            for (int i2 = 0; i2 < iOnNavigationEvent; i2++) {
                JavaType javaTypeIAuthTabCallback = IAuthTabCallback(i2);
                if (i2 > 0) {
                    sb.append(',');
                }
                sb.append(javaTypeIAuthTabCallback.onExtraCallbackWithResult());
            }
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder onExtraCallbackWithResult(StringBuilder sb) {
        return TypeBase.onExtraCallbackWithResult(this._class, sb, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder onExtraCallback(StringBuilder sb) {
        TypeBase.onExtraCallbackWithResult(this._class, sb, false);
        int iOnNavigationEvent = this._bindings.onNavigationEvent();
        if (iOnNavigationEvent > 0) {
            sb.append('<');
            for (int i2 = 0; i2 < iOnNavigationEvent; i2++) {
                sb = IAuthTabCallback(i2).onExtraCallback(sb);
            }
            sb.append('>');
        }
        sb.append(';');
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[simple type, class ");
        sb.append(ak_());
        sb.append(']');
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        SimpleType simpleType = (SimpleType) obj;
        if (simpleType._class != this._class) {
            return false;
        }
        return this._bindings.equals(simpleType._bindings);
    }
}
