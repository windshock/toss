package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class LifecycleEffectKtExternalSyntheticLambda6 implements Serializable {
    private static final LifecycleEffectKtExternalSyntheticLambda6 IAuthTabCallback;
    private static final String[] onExtraCallback;
    private static final JavaType[] onWarmupCompleted;
    private static final long serialVersionUID = 1;
    private final int _hashCode;
    private final String[] _names;
    private final JavaType[] _types;
    private final String[] _unboundVariables;

    static {
        String[] strArr = new String[0];
        onExtraCallback = strArr;
        JavaType[] javaTypeArr = new JavaType[0];
        onWarmupCompleted = javaTypeArr;
        IAuthTabCallback = new LifecycleEffectKtExternalSyntheticLambda6(strArr, javaTypeArr, null);
    }

    private LifecycleEffectKtExternalSyntheticLambda6(String[] strArr, JavaType[] javaTypeArr, String[] strArr2) {
        strArr = strArr == null ? onExtraCallback : strArr;
        this._names = strArr;
        javaTypeArr = javaTypeArr == null ? onWarmupCompleted : javaTypeArr;
        this._types = javaTypeArr;
        if (strArr.length != javaTypeArr.length) {
            throw new IllegalArgumentException("Mismatching names (" + strArr.length + "), types (" + javaTypeArr.length + ")");
        }
        this._unboundVariables = strArr2;
        this._hashCode = Arrays.hashCode(javaTypeArr);
    }

    public static LifecycleEffectKtExternalSyntheticLambda6 IAuthTabCallback() {
        return IAuthTabCallback;
    }

    protected Object readResolve() {
        String[] strArr = this._names;
        return (strArr == null || strArr.length == 0) ? IAuthTabCallback : this;
    }

    public static LifecycleEffectKtExternalSyntheticLambda6 onExtraCallback(Class<?> cls, List<JavaType> list) {
        JavaType[] javaTypeArr;
        if (list == null || list.isEmpty()) {
            javaTypeArr = onWarmupCompleted;
        } else {
            javaTypeArr = (JavaType[]) list.toArray(onWarmupCompleted);
        }
        return onWarmupCompleted(cls, javaTypeArr);
    }

    public static LifecycleEffectKtExternalSyntheticLambda6 onWarmupCompleted(Class<?> cls, JavaType[] javaTypeArr) {
        String[] strArr;
        if (javaTypeArr == null) {
            javaTypeArr = onWarmupCompleted;
        } else {
            int length = javaTypeArr.length;
            if (length == 1) {
                return onExtraCallback(cls, javaTypeArr[0]);
            }
            if (length == 2) {
                return IAuthTabCallback(cls, javaTypeArr[0], javaTypeArr[1]);
            }
        }
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            strArr = onExtraCallback;
        } else {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                strArr[i2] = typeParameters[i2].getName();
            }
        }
        if (strArr.length != javaTypeArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create TypeBindings for class ");
            sb.append(cls.getName());
            sb.append(" with ");
            sb.append(javaTypeArr.length);
            sb.append(" type parameter");
            sb.append(javaTypeArr.length == 1 ? "" : "s");
            sb.append(": class expects ");
            sb.append(strArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
        return new LifecycleEffectKtExternalSyntheticLambda6(strArr, javaTypeArr, null);
    }

    public static LifecycleEffectKtExternalSyntheticLambda6 onExtraCallback(Class<?> cls, JavaType javaType) {
        TypeVariable[] typeVariableArrOnNavigationEvent = onWarmupCompleted.onNavigationEvent(cls);
        int length = typeVariableArrOnNavigationEvent == null ? 0 : typeVariableArrOnNavigationEvent.length;
        if (length != 1) {
            throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
        }
        return new LifecycleEffectKtExternalSyntheticLambda6(new String[]{typeVariableArrOnNavigationEvent[0].getName()}, new JavaType[]{javaType}, null);
    }

    public static LifecycleEffectKtExternalSyntheticLambda6 IAuthTabCallback(Class<?> cls, JavaType javaType, JavaType javaType2) {
        TypeVariable[] typeVariableArrOnWarmupCompleted = onWarmupCompleted.onWarmupCompleted(cls);
        int length = typeVariableArrOnWarmupCompleted == null ? 0 : typeVariableArrOnWarmupCompleted.length;
        if (length != 2) {
            throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
        }
        return new LifecycleEffectKtExternalSyntheticLambda6(new String[]{typeVariableArrOnWarmupCompleted[0].getName(), typeVariableArrOnWarmupCompleted[1].getName()}, new JavaType[]{javaType, javaType2}, null);
    }

    public static LifecycleEffectKtExternalSyntheticLambda6 IAuthTabCallback(List<String> list, List<JavaType> list2) {
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            return IAuthTabCallback;
        }
        return new LifecycleEffectKtExternalSyntheticLambda6((String[]) list.toArray(onExtraCallback), (JavaType[]) list2.toArray(onWarmupCompleted), null);
    }

    public static LifecycleEffectKtExternalSyntheticLambda6 onExtraCallbackWithResult(Class<?> cls, JavaType javaType) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 0) {
            return IAuthTabCallback;
        }
        if (length != 1) {
            throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
        }
        return new LifecycleEffectKtExternalSyntheticLambda6(new String[]{typeParameters[0].getName()}, new JavaType[]{javaType}, null);
    }

    public static LifecycleEffectKtExternalSyntheticLambda6 onExtraCallbackWithResult(Class<?> cls, JavaType[] javaTypeArr) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            return IAuthTabCallback;
        }
        if (javaTypeArr == null) {
            javaTypeArr = onWarmupCompleted;
        }
        int length = typeParameters.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = typeParameters[i2].getName();
        }
        if (length != javaTypeArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create TypeBindings for class ");
            sb.append(cls.getName());
            sb.append(" with ");
            sb.append(javaTypeArr.length);
            sb.append(" type parameter");
            sb.append(javaTypeArr.length == 1 ? "" : "s");
            sb.append(": class expects ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        return new LifecycleEffectKtExternalSyntheticLambda6(strArr, javaTypeArr, null);
    }

    public LifecycleEffectKtExternalSyntheticLambda6 onExtraCallbackWithResult(String str) {
        String[] strArr;
        String[] strArr2 = this._unboundVariables;
        int length = strArr2 == null ? 0 : strArr2.length;
        if (length == 0) {
            strArr = new String[1];
        } else {
            strArr = (String[]) Arrays.copyOf(strArr2, length + 1);
        }
        strArr[length] = str;
        return new LifecycleEffectKtExternalSyntheticLambda6(this._names, this._types, strArr);
    }

    public JavaType onExtraCallback(String str) {
        JavaType javaTypeMayLaunchUrl;
        int length = this._names.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(this._names[i2])) {
                ResolvedRecursiveType resolvedRecursiveType = this._types[i2];
                return (!(resolvedRecursiveType instanceof ResolvedRecursiveType) || (javaTypeMayLaunchUrl = resolvedRecursiveType.mayLaunchUrl()) == null) ? resolvedRecursiveType : javaTypeMayLaunchUrl;
            }
        }
        return null;
    }

    private boolean onTransact() {
        for (JavaType javaType : this._types) {
            if (javaType instanceof LifecycleEffectKtExternalSyntheticLambda5) {
                return true;
            }
        }
        return false;
    }

    public boolean onExtraCallback() {
        return this._types.length == 0;
    }

    public int onNavigationEvent() {
        return this._types.length;
    }

    public JavaType IAuthTabCallback(int i2) {
        if (i2 < 0) {
            return null;
        }
        JavaType[] javaTypeArr = this._types;
        if (i2 >= javaTypeArr.length) {
            return null;
        }
        JavaType javaType = javaTypeArr[i2];
        return javaType == null ? LifecycleEffectKtExternalSyntheticLambda4.IAuthTabCallback() : javaType;
    }

    public JavaType onExtraCallbackWithResult(int i2) {
        if (i2 < 0) {
            return null;
        }
        JavaType[] javaTypeArr = this._types;
        if (i2 < javaTypeArr.length) {
            return javaTypeArr[i2];
        }
        return null;
    }

    public List<JavaType> onWarmupCompleted() {
        JavaType[] javaTypeArr = this._types;
        if (javaTypeArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        List<JavaType> listAsList = Arrays.asList(javaTypeArr);
        if (!listAsList.contains(null)) {
            return listAsList;
        }
        ArrayList arrayList = new ArrayList(listAsList);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2) == null) {
                arrayList.set(i2, LifecycleEffectKtExternalSyntheticLambda4.IAuthTabCallback());
            }
        }
        return arrayList;
    }

    public boolean onWarmupCompleted(String str) {
        String[] strArr = this._unboundVariables;
        if (strArr == null) {
            return false;
        }
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                return false;
            }
        } while (!str.equals(this._unboundVariables[length]));
        return true;
    }

    public Object onWarmupCompleted(Class<?> cls) {
        if (onTransact()) {
            return null;
        }
        return new onNavigationEvent(cls, this._types, this._hashCode);
    }

    public String toString() {
        if (this._types.length == 0) {
            return "<>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        int length = this._types.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 > 0) {
                sb.append(',');
            }
            JavaType javaType = this._types[i2];
            if (javaType == null) {
                sb.append("?");
            } else {
                sb.append(javaType.onTransact());
            }
        }
        sb.append('>');
        return sb.toString();
    }

    public int hashCode() {
        return this._hashCode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!((Boolean) SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(-971345653, new Object[]{obj, getClass()}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 971345658, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult())).booleanValue()) {
            return false;
        }
        LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6 = (LifecycleEffectKtExternalSyntheticLambda6) obj;
        return this._hashCode == lifecycleEffectKtExternalSyntheticLambda6._hashCode && Arrays.equals(this._types, lifecycleEffectKtExternalSyntheticLambda6._types);
    }

    protected JavaType[] onExtraCallbackWithResult() {
        return this._types;
    }
}
