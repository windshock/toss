package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.FragmentActivityExternalSyntheticLambda0;
import o.FragmentManagerExternalSyntheticLambda1;
import o.GridLayout;
import o.LifecycleEffectKtExternalSyntheticLambda6;
import o.getTargetRequestCode;
import o.getView;
import o.setRetainInstance;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class TypeBase extends JavaType implements FragmentActivityExternalSyntheticLambda0 {
    private static final LifecycleEffectKtExternalSyntheticLambda6 onExtraCallback = LifecycleEffectKtExternalSyntheticLambda6.IAuthTabCallback();
    private static final JavaType[] onExtraCallbackWithResult = new JavaType[0];
    private static final long serialVersionUID = 1;
    protected final LifecycleEffectKtExternalSyntheticLambda6 _bindings;
    protected final JavaType _superClass;
    protected final JavaType[] _superInterfaces;
    volatile transient String onNavigationEvent;

    public TypeBase(Class<?> cls, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6, JavaType javaType, JavaType[] javaTypeArr, int i2, Object obj, Object obj2, boolean z) {
        super(cls, i2, obj, obj2, z);
        this._bindings = lifecycleEffectKtExternalSyntheticLambda6 == null ? onExtraCallback : lifecycleEffectKtExternalSyntheticLambda6;
        this._superClass = javaType;
        this._superInterfaces = javaTypeArr;
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public String onExtraCallbackWithResult() {
        String str = this.onNavigationEvent;
        return str == null ? ak_() : str;
    }

    protected String ak_() {
        return this._class.getName();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public LifecycleEffectKtExternalSyntheticLambda6 onWarmupCompleted() {
        return this._bindings;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public int onExtraCallback() {
        return this._bindings.onNavigationEvent();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType IAuthTabCallback(int i2) {
        return this._bindings.IAuthTabCallback(i2);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType IAuthTabCallbackStubProxy() {
        return this._superClass;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public List<JavaType> IAuthTabCallbackDefault() {
        JavaType[] javaTypeArr = this._superInterfaces;
        if (javaTypeArr == null) {
            return Collections.EMPTY_LIST;
        }
        int length = javaTypeArr.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        if (length == 1) {
            return Collections.singletonList(javaTypeArr[0]);
        }
        return Arrays.asList(javaTypeArr);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType IAuthTabCallback(Class<?> cls) {
        JavaType javaTypeIAuthTabCallback;
        JavaType[] javaTypeArr;
        if (cls == this._class) {
            return this;
        }
        if (cls.isInterface() && (javaTypeArr = this._superInterfaces) != null) {
            int length = javaTypeArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                JavaType javaTypeIAuthTabCallback2 = this._superInterfaces[i2].IAuthTabCallback(cls);
                if (javaTypeIAuthTabCallback2 != null) {
                    return javaTypeIAuthTabCallback2;
                }
            }
        }
        JavaType javaType = this._superClass;
        if (javaType == null || (javaTypeIAuthTabCallback = javaType.IAuthTabCallback(cls)) == null) {
            return null;
        }
        return javaTypeIAuthTabCallback;
    }

    @Override // o.FragmentActivityExternalSyntheticLambda0
    public void onExtraCallbackWithResult(getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, GridLayout gridLayout) throws IOException {
        setRetainInstance setretaininstance = new setRetainInstance(this, getTargetRequestCode.VALUE_STRING);
        gridLayout.onExtraCallbackWithResult(getview, setretaininstance);
        onExtraCallbackWithResult(getview, fragmentManagerExternalSyntheticLambda1);
        gridLayout.IAuthTabCallback(getview, setretaininstance);
    }

    @Override // o.FragmentActivityExternalSyntheticLambda0
    public void onExtraCallbackWithResult(getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
        getview.asBinder(onExtraCallbackWithResult());
    }

    protected static StringBuilder onExtraCallbackWithResult(Class<?> cls, StringBuilder sb, boolean z) {
        if (cls.isPrimitive()) {
            if (cls == Boolean.TYPE) {
                sb.append('Z');
                return sb;
            }
            if (cls == Byte.TYPE) {
                sb.append('B');
                return sb;
            }
            if (cls == Short.TYPE) {
                sb.append('S');
                return sb;
            }
            if (cls == Character.TYPE) {
                sb.append('C');
                return sb;
            }
            if (cls == Integer.TYPE) {
                sb.append('I');
                return sb;
            }
            if (cls == Long.TYPE) {
                sb.append('J');
                return sb;
            }
            if (cls == Float.TYPE) {
                sb.append('F');
                return sb;
            }
            if (cls == Double.TYPE) {
                sb.append('D');
                return sb;
            }
            if (cls == Void.TYPE) {
                sb.append('V');
                return sb;
            }
            throw new IllegalStateException("Unrecognized primitive type: " + cls.getName());
        }
        sb.append('L');
        String name = cls.getName();
        int length = name.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = name.charAt(i2);
            if (cCharAt == '.') {
                cCharAt = '/';
            }
            sb.append(cCharAt);
        }
        if (z) {
            sb.append(';');
        }
        return sb;
    }

    protected boolean onExtraCallback(int i2) {
        return this._class.getTypeParameters().length == i2;
    }
}
