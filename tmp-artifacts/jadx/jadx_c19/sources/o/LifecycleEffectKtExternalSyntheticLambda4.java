package o;

import com.alibaba.ariver.kernel.RVParams;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.IterationType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.PlaceholderForType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.SimpleType;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class LifecycleEffectKtExternalSyntheticLambda4 implements Serializable {
    protected static final SimpleType IAuthTabCallback;
    protected static final SimpleType IAuthTabCallbackDefault;
    protected static final SimpleType IAuthTabCallbackStub;
    private static final Class<?> IAuthTabCallback_Parcel;
    private static final Class<?> access000;
    protected static final SimpleType asInterface;
    private static final Class<?> extraCallbackWithResult;
    protected static final SimpleType onExtraCallback;
    protected static final SimpleType onExtraCallbackWithResult;
    protected static final SimpleType onNavigationEvent;
    protected static final SimpleType onTransact;
    protected static final SimpleType onWarmupCompleted;
    private static final long serialVersionUID = 1;
    private static final Class<?> writeTypedObject;
    protected final ClassLoader _classLoader;
    protected final LifecycleEffectKtExternalSyntheticLambda7[] _modifiers;
    protected final RememberLifecycleOwnerKtExternalSyntheticLambda1 _parser;
    protected final dispatchOnCancelled<Object, JavaType> _typeCache;
    private static final JavaType[] onMessageChannelReady = new JavaType[0];
    protected static final LifecycleEffectKtExternalSyntheticLambda4 getInterfaceDescriptor = new LifecycleEffectKtExternalSyntheticLambda4();
    protected static final LifecycleEffectKtExternalSyntheticLambda6 asBinder = LifecycleEffectKtExternalSyntheticLambda6.IAuthTabCallback();
    private static final Class<?> extraCallback = String.class;
    private static final Class<?> ICustomTabsCallback = Object.class;
    private static final Class<?> IAuthTabCallbackStubProxy = Comparable.class;
    private static final Class<?> access100 = Enum.class;
    private static final Class<?> readTypedObject = FragmentActivityExternalSyntheticLambda3.class;

    static {
        Class<?> cls = Boolean.TYPE;
        IAuthTabCallback_Parcel = cls;
        Class<?> cls2 = Double.TYPE;
        access000 = cls2;
        Class<?> cls3 = Integer.TYPE;
        extraCallbackWithResult = cls3;
        Class<?> cls4 = Long.TYPE;
        writeTypedObject = cls4;
        onExtraCallback = new SimpleType(cls);
        onNavigationEvent = new SimpleType(cls2);
        onExtraCallbackWithResult = new SimpleType(cls3);
        asInterface = new SimpleType(cls4);
        onTransact = new SimpleType(String.class);
        IAuthTabCallbackDefault = new SimpleType(Object.class);
        onWarmupCompleted = new SimpleType(Comparable.class);
        IAuthTabCallback = new SimpleType(Enum.class);
        IAuthTabCallbackStub = new SimpleType(FragmentActivityExternalSyntheticLambda3.class);
    }

    private LifecycleEffectKtExternalSyntheticLambda4() {
        this(new SavedStateHandleSaverKtExternalSyntheticLambda5(16, RVParams.WEBVIEW_FONT_SIZE_LARGEST));
    }

    protected LifecycleEffectKtExternalSyntheticLambda4(dispatchOnCancelled<Object, JavaType> dispatchoncancelled) {
        Objects.requireNonNull(dispatchoncancelled);
        this._typeCache = dispatchoncancelled;
        this._parser = new RememberLifecycleOwnerKtExternalSyntheticLambda1(this);
        this._modifiers = null;
        this._classLoader = null;
    }

    public static LifecycleEffectKtExternalSyntheticLambda4 onWarmupCompleted() {
        return getInterfaceDescriptor;
    }

    public ClassLoader onNavigationEvent() {
        return this._classLoader;
    }

    public static JavaType IAuthTabCallback() {
        return onWarmupCompleted().onExtraCallback();
    }

    public Class<?> IAuthTabCallback(String str) throws ClassNotFoundException {
        Throwable th;
        Class<?> clsOnWarmupCompleted;
        if (str.indexOf(46) < 0 && (clsOnWarmupCompleted = onWarmupCompleted(str)) != null) {
            return clsOnWarmupCompleted;
        }
        ClassLoader classLoaderOnNavigationEvent = onNavigationEvent();
        if (classLoaderOnNavigationEvent == null) {
            classLoaderOnNavigationEvent = Thread.currentThread().getContextClassLoader();
        }
        if (classLoaderOnNavigationEvent != null) {
            try {
                return IAuthTabCallback(str, true, classLoaderOnNavigationEvent);
            } catch (Exception e) {
                th = (Throwable) SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(2113024254, new Object[]{e}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -2113024246, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
            }
        } else {
            th = null;
        }
        try {
            return onExtraCallback(str);
        } catch (Exception e2) {
            if (th == null) {
                th = (Throwable) SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(2113024254, new Object[]{e2}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -2113024246, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
            }
            SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallbackDefault(th);
            throw new ClassNotFoundException(th.getMessage(), th);
        }
    }

    protected Class<?> IAuthTabCallback(String str, boolean z, ClassLoader classLoader) throws ClassNotFoundException {
        return Class.forName(str, true, classLoader);
    }

    protected Class<?> onExtraCallback(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    protected Class<?> onWarmupCompleted(String str) {
        if ("int".equals(str)) {
            return Integer.TYPE;
        }
        if ("long".equals(str)) {
            return Long.TYPE;
        }
        if ("float".equals(str)) {
            return Float.TYPE;
        }
        if ("double".equals(str)) {
            return Double.TYPE;
        }
        if ("boolean".equals(str)) {
            return Boolean.TYPE;
        }
        if ("byte".equals(str)) {
            return Byte.TYPE;
        }
        if ("char".equals(str)) {
            return Character.TYPE;
        }
        if ("short".equals(str)) {
            return Short.TYPE;
        }
        if ("void".equals(str)) {
            return Void.TYPE;
        }
        return null;
    }

    public JavaType IAuthTabCallback(JavaType javaType, Class<?> cls) throws IllegalArgumentException {
        return onWarmupCompleted(javaType, cls, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        if (r0 == java.util.EnumSet.class) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JavaType onWarmupCompleted(JavaType javaType, Class<?> cls, boolean z) throws IllegalArgumentException {
        int length;
        JavaType javaTypeOnExtraCallback;
        Class<?> clsAsBinder = javaType.asBinder();
        if (clsAsBinder != cls) {
            if (clsAsBinder == Object.class) {
                javaTypeOnExtraCallback = onExtraCallback((LifecycleEffectKtExternalSyntheticLambda2) null, cls, asBinder);
            } else {
                if (!clsAsBinder.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException(String.format("Class %s not subtype of %s", SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(cls), SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(javaType)));
                }
                if (javaType.onPostMessage()) {
                    if (javaType.onUnminimized()) {
                        if (cls == HashMap.class || cls == LinkedHashMap.class || cls == EnumMap.class || cls == TreeMap.class) {
                            javaTypeOnExtraCallback = onExtraCallback((LifecycleEffectKtExternalSyntheticLambda2) null, cls, LifecycleEffectKtExternalSyntheticLambda6.IAuthTabCallback(cls, javaType.asInterface(), javaType.IAuthTabCallbackStub()));
                        }
                    } else if (javaType.readTypedObject()) {
                        if (cls == ArrayList.class || cls == LinkedList.class || cls == HashSet.class || cls == TreeSet.class) {
                            javaTypeOnExtraCallback = onExtraCallback((LifecycleEffectKtExternalSyntheticLambda2) null, cls, LifecycleEffectKtExternalSyntheticLambda6.onExtraCallback(cls, javaType.IAuthTabCallbackStub()));
                        }
                    }
                } else if (javaType.onWarmupCompleted().onExtraCallback() || (length = cls.getTypeParameters().length) == 0) {
                    javaTypeOnExtraCallback = onExtraCallback((LifecycleEffectKtExternalSyntheticLambda2) null, cls, asBinder);
                } else {
                    javaTypeOnExtraCallback = onExtraCallback((LifecycleEffectKtExternalSyntheticLambda2) null, cls, onExtraCallback(javaType, length, cls, z));
                }
            }
            return javaTypeOnExtraCallback.onNavigationEvent(javaType);
        }
        return javaType;
    }

    private LifecycleEffectKtExternalSyntheticLambda6 onExtraCallback(JavaType javaType, int i2, Class<?> cls, boolean z) throws IllegalArgumentException {
        PlaceholderForType[] placeholderForTypeArr = new PlaceholderForType[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            placeholderForTypeArr[i3] = new PlaceholderForType(i3);
        }
        JavaType javaTypeIAuthTabCallback = onExtraCallback((LifecycleEffectKtExternalSyntheticLambda2) null, cls, LifecycleEffectKtExternalSyntheticLambda6.onWarmupCompleted(cls, placeholderForTypeArr)).IAuthTabCallback(javaType.asBinder());
        if (javaTypeIAuthTabCallback == null) {
            throw new IllegalArgumentException(String.format("Internal error: unable to locate supertype (%s) from resolved subtype %s", javaType.asBinder().getName(), cls.getName()));
        }
        String strOnWarmupCompleted = onWarmupCompleted(javaType, javaTypeIAuthTabCallback);
        if (strOnWarmupCompleted != null && !z) {
            throw new IllegalArgumentException("Failed to specialize base type " + javaType.onExtraCallbackWithResult() + " as " + cls.getName() + ", problem: " + strOnWarmupCompleted);
        }
        JavaType[] javaTypeArr = new JavaType[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            JavaType javaTypeMayLaunchUrl = placeholderForTypeArr[i4].mayLaunchUrl();
            if (javaTypeMayLaunchUrl == null) {
                javaTypeMayLaunchUrl = IAuthTabCallback();
            }
            javaTypeArr[i4] = javaTypeMayLaunchUrl;
        }
        return LifecycleEffectKtExternalSyntheticLambda6.onWarmupCompleted(cls, javaTypeArr);
    }

    private String onWarmupCompleted(JavaType javaType, JavaType javaType2) throws IllegalArgumentException {
        List<JavaType> listOnWarmupCompleted = javaType.onWarmupCompleted().onWarmupCompleted();
        List<JavaType> listOnWarmupCompleted2 = javaType2.onWarmupCompleted().onWarmupCompleted();
        int size = listOnWarmupCompleted2.size();
        int size2 = listOnWarmupCompleted.size();
        int i2 = 0;
        while (i2 < size2) {
            JavaType javaType3 = listOnWarmupCompleted.get(i2);
            JavaType javaTypeIAuthTabCallback = i2 < size ? listOnWarmupCompleted2.get(i2) : IAuthTabCallback();
            if (!IAuthTabCallback(javaType3, javaTypeIAuthTabCallback) && !javaType3.onNavigationEvent(Object.class) && ((i2 != 0 || !javaType.onUnminimized() || !javaTypeIAuthTabCallback.onNavigationEvent(Object.class)) && (!javaType3.onRelationshipValidationResult() || !javaType3.onExtraCallbackWithResult(javaTypeIAuthTabCallback.asBinder())))) {
                return String.format("Type parameter #%d/%d differs; can not specialize %s with %s", Integer.valueOf(i2 + 1), Integer.valueOf(size2), javaType3.onExtraCallbackWithResult(), javaTypeIAuthTabCallback.onExtraCallbackWithResult());
            }
            i2++;
        }
        return null;
    }

    private boolean IAuthTabCallback(JavaType javaType, JavaType javaType2) {
        if (javaType2 instanceof PlaceholderForType) {
            ((PlaceholderForType) javaType2).onExtraCallback(javaType);
            return true;
        }
        if (javaType.asBinder() != javaType2.asBinder()) {
            return false;
        }
        List<JavaType> listOnWarmupCompleted = javaType.onWarmupCompleted().onWarmupCompleted();
        List<JavaType> listOnWarmupCompleted2 = javaType2.onWarmupCompleted().onWarmupCompleted();
        int size = listOnWarmupCompleted.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!IAuthTabCallback(listOnWarmupCompleted.get(i2), listOnWarmupCompleted2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public JavaType onWarmupCompleted(JavaType javaType, Class<?> cls) {
        Class<?> clsAsBinder = javaType.asBinder();
        if (clsAsBinder == cls) {
            return javaType;
        }
        JavaType javaTypeIAuthTabCallback = javaType.IAuthTabCallback(cls);
        if (javaTypeIAuthTabCallback != null) {
            return javaTypeIAuthTabCallback;
        }
        if (!cls.isAssignableFrom(clsAsBinder)) {
            throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", cls.getName(), javaType));
        }
        throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", cls.getName(), javaType));
    }

    public JavaType onExtraCallbackWithResult(String str) throws IllegalArgumentException {
        return this._parser.onExtraCallback(str);
    }

    public JavaType[] onExtraCallback(JavaType javaType, Class<?> cls) {
        JavaType javaTypeIAuthTabCallback = javaType.IAuthTabCallback(cls);
        if (javaTypeIAuthTabCallback == null) {
            return onMessageChannelReady;
        }
        return javaTypeIAuthTabCallback.onWarmupCompleted().onExtraCallbackWithResult();
    }

    public JavaType IAuthTabCallback(Type type) {
        return IAuthTabCallback((LifecycleEffectKtExternalSyntheticLambda2) null, type, asBinder);
    }

    public JavaType IAuthTabCallback(setSharedElementNames<?> setsharedelementnames) {
        return IAuthTabCallback((LifecycleEffectKtExternalSyntheticLambda2) null, setsharedelementnames.onWarmupCompleted(), asBinder);
    }

    public JavaType onNavigationEvent(Type type, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6) {
        return IAuthTabCallback((LifecycleEffectKtExternalSyntheticLambda2) null, type, lifecycleEffectKtExternalSyntheticLambda6);
    }

    public CollectionType onNavigationEvent(Class<? extends Collection> cls, Class<?> cls2) {
        return onExtraCallbackWithResult(cls, onExtraCallback((LifecycleEffectKtExternalSyntheticLambda2) null, cls2, asBinder));
    }

    public CollectionType onExtraCallbackWithResult(Class<? extends Collection> cls, JavaType javaType) {
        LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6OnExtraCallbackWithResult = LifecycleEffectKtExternalSyntheticLambda6.onExtraCallbackWithResult(cls, javaType);
        CollectionType collectionTypeOnExtraCallback = onExtraCallback((LifecycleEffectKtExternalSyntheticLambda2) null, cls, lifecycleEffectKtExternalSyntheticLambda6OnExtraCallbackWithResult);
        if (lifecycleEffectKtExternalSyntheticLambda6OnExtraCallbackWithResult.onExtraCallback() && javaType != null) {
            JavaType javaTypeIAuthTabCallbackStub = collectionTypeOnExtraCallback.IAuthTabCallback(Collection.class).IAuthTabCallbackStub();
            if (!javaTypeIAuthTabCallbackStub.equals(javaType)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(cls), javaType, javaTypeIAuthTabCallbackStub));
            }
        }
        return collectionTypeOnExtraCallback;
    }

    public MapType onExtraCallbackWithResult(Class<? extends Map> cls, Class<?> cls2, Class<?> cls3) {
        JavaType javaTypeOnExtraCallback;
        JavaType javaTypeOnExtraCallback2;
        if (cls == Properties.class) {
            javaTypeOnExtraCallback = onTransact;
            javaTypeOnExtraCallback2 = javaTypeOnExtraCallback;
        } else {
            LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6 = asBinder;
            javaTypeOnExtraCallback = onExtraCallback((LifecycleEffectKtExternalSyntheticLambda2) null, cls2, lifecycleEffectKtExternalSyntheticLambda6);
            javaTypeOnExtraCallback2 = onExtraCallback((LifecycleEffectKtExternalSyntheticLambda2) null, cls3, lifecycleEffectKtExternalSyntheticLambda6);
        }
        return IAuthTabCallback(cls, javaTypeOnExtraCallback, javaTypeOnExtraCallback2);
    }

    public MapType IAuthTabCallback(Class<? extends Map> cls, JavaType javaType, JavaType javaType2) {
        LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6OnExtraCallbackWithResult = LifecycleEffectKtExternalSyntheticLambda6.onExtraCallbackWithResult(cls, new JavaType[]{javaType, javaType2});
        MapType mapTypeOnExtraCallback = onExtraCallback((LifecycleEffectKtExternalSyntheticLambda2) null, cls, lifecycleEffectKtExternalSyntheticLambda6OnExtraCallbackWithResult);
        if (lifecycleEffectKtExternalSyntheticLambda6OnExtraCallbackWithResult.onExtraCallback()) {
            JavaType javaTypeIAuthTabCallback = mapTypeOnExtraCallback.IAuthTabCallback(Map.class);
            JavaType javaTypeAsInterface = javaTypeIAuthTabCallback.asInterface();
            if (!javaTypeAsInterface.equals(javaType)) {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(cls), javaType, javaTypeAsInterface));
            }
            JavaType javaTypeIAuthTabCallbackStub = javaTypeIAuthTabCallback.IAuthTabCallbackStub();
            if (!javaTypeIAuthTabCallbackStub.equals(javaType2)) {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(cls), javaType2, javaTypeIAuthTabCallbackStub));
            }
        }
        return mapTypeOnExtraCallback;
    }

    @Deprecated
    public JavaType onExtraCallback(Class<?> cls) {
        return onExtraCallback(cls, asBinder, (JavaType) null, (JavaType[]) null);
    }

    public JavaType onExtraCallbackWithResult(Class<?> cls, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6) {
        return onWarmupCompleted(cls, onExtraCallback((LifecycleEffectKtExternalSyntheticLambda2) null, cls, lifecycleEffectKtExternalSyntheticLambda6));
    }

    private JavaType onNavigationEvent(Class<?> cls, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaTypeOnExtraCallback;
        JavaType javaType2;
        JavaType javaType3;
        if (cls == Properties.class) {
            javaTypeOnExtraCallback = onTransact;
        } else {
            List<JavaType> listOnWarmupCompleted = lifecycleEffectKtExternalSyntheticLambda6.onWarmupCompleted();
            int size = listOnWarmupCompleted.size();
            if (size != 0) {
                if (size == 2) {
                    JavaType javaType4 = listOnWarmupCompleted.get(0);
                    javaType2 = listOnWarmupCompleted.get(1);
                    javaType3 = javaType4;
                    return MapType.IAuthTabCallback(cls, lifecycleEffectKtExternalSyntheticLambda6, javaType, javaTypeArr, javaType3, javaType2);
                }
                throw new IllegalArgumentException(String.format("Strange Map type %s with %d type parameter%s (%s), can not resolve", SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(cls), Integer.valueOf(size), size == 1 ? "" : "s", lifecycleEffectKtExternalSyntheticLambda6));
            }
            javaTypeOnExtraCallback = onExtraCallback();
        }
        javaType3 = javaTypeOnExtraCallback;
        javaType2 = javaType3;
        return MapType.IAuthTabCallback(cls, lifecycleEffectKtExternalSyntheticLambda6, javaType, javaTypeArr, javaType3, javaType2);
    }

    private JavaType onWarmupCompleted(Class<?> cls, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaTypeOnExtraCallback;
        List<JavaType> listOnWarmupCompleted = lifecycleEffectKtExternalSyntheticLambda6.onWarmupCompleted();
        if (listOnWarmupCompleted.isEmpty()) {
            javaTypeOnExtraCallback = onExtraCallback();
        } else if (listOnWarmupCompleted.size() == 1) {
            javaTypeOnExtraCallback = listOnWarmupCompleted.get(0);
        } else {
            throw new IllegalArgumentException("Strange Collection type " + cls.getName() + ": cannot determine type parameters");
        }
        return CollectionType.onExtraCallbackWithResult(cls, lifecycleEffectKtExternalSyntheticLambda6, javaType, javaTypeArr, javaTypeOnExtraCallback);
    }

    private JavaType IAuthTabCallbackDefault(Class<?> cls, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaTypeOnExtraCallback;
        List<JavaType> listOnWarmupCompleted = lifecycleEffectKtExternalSyntheticLambda6.onWarmupCompleted();
        if (listOnWarmupCompleted.isEmpty()) {
            javaTypeOnExtraCallback = onExtraCallback();
        } else if (listOnWarmupCompleted.size() == 1) {
            javaTypeOnExtraCallback = listOnWarmupCompleted.get(0);
        } else {
            throw new IllegalArgumentException("Strange Reference type " + cls.getName() + ": cannot determine type parameters");
        }
        return ReferenceType.onWarmupCompleted(cls, lifecycleEffectKtExternalSyntheticLambda6, javaType, javaTypeArr, javaTypeOnExtraCallback);
    }

    private JavaType IAuthTabCallback(Class<?> cls, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaTypeOnExtraCallback;
        List<JavaType> listOnWarmupCompleted = lifecycleEffectKtExternalSyntheticLambda6.onWarmupCompleted();
        if (listOnWarmupCompleted.isEmpty()) {
            javaTypeOnExtraCallback = onExtraCallback();
        } else if (listOnWarmupCompleted.size() == 1) {
            javaTypeOnExtraCallback = listOnWarmupCompleted.get(0);
        } else {
            throw new IllegalArgumentException("Strange Iteration type " + cls.getName() + ": cannot determine type parameters");
        }
        return IAuthTabCallback(cls, lifecycleEffectKtExternalSyntheticLambda6, javaType, javaTypeArr, javaTypeOnExtraCallback);
    }

    private JavaType IAuthTabCallback(Class<?> cls, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2) {
        return IterationType.onExtraCallbackWithResult(cls, lifecycleEffectKtExternalSyntheticLambda6, javaType, javaTypeArr, javaType2);
    }

    protected JavaType onExtraCallback(Class<?> cls, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaTypeOnNavigationEvent;
        return (!lifecycleEffectKtExternalSyntheticLambda6.onExtraCallback() || (javaTypeOnNavigationEvent = onNavigationEvent(cls)) == null) ? onExtraCallbackWithResult(cls, lifecycleEffectKtExternalSyntheticLambda6, javaType, javaTypeArr) : javaTypeOnNavigationEvent;
    }

    protected JavaType onExtraCallbackWithResult(Class<?> cls, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6, JavaType javaType, JavaType[] javaTypeArr) {
        return new SimpleType(cls, lifecycleEffectKtExternalSyntheticLambda6, javaType, javaTypeArr);
    }

    protected JavaType onExtraCallback() {
        return IAuthTabCallbackDefault;
    }

    protected JavaType onNavigationEvent(Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls == IAuthTabCallback_Parcel) {
                return onExtraCallback;
            }
            if (cls == extraCallbackWithResult) {
                return onExtraCallbackWithResult;
            }
            if (cls == writeTypedObject) {
                return asInterface;
            }
            if (cls == access000) {
                return onNavigationEvent;
            }
            return null;
        }
        if (cls == extraCallback) {
            return onTransact;
        }
        if (cls == ICustomTabsCallback) {
            return IAuthTabCallbackDefault;
        }
        if (cls == readTypedObject) {
            return IAuthTabCallbackStub;
        }
        return null;
    }

    protected JavaType IAuthTabCallback(LifecycleEffectKtExternalSyntheticLambda2 lifecycleEffectKtExternalSyntheticLambda2, Type type, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6) {
        JavaType javaTypeOnNavigationEvent;
        if (type instanceof Class) {
            javaTypeOnNavigationEvent = onExtraCallback(lifecycleEffectKtExternalSyntheticLambda2, (Class<?>) type, asBinder);
        } else if (type instanceof ParameterizedType) {
            javaTypeOnNavigationEvent = onExtraCallback(lifecycleEffectKtExternalSyntheticLambda2, (ParameterizedType) type, lifecycleEffectKtExternalSyntheticLambda6);
        } else {
            if (type instanceof JavaType) {
                return (JavaType) type;
            }
            if (type instanceof GenericArrayType) {
                javaTypeOnNavigationEvent = onNavigationEvent(lifecycleEffectKtExternalSyntheticLambda2, (GenericArrayType) type, lifecycleEffectKtExternalSyntheticLambda6);
            } else if (type instanceof TypeVariable) {
                javaTypeOnNavigationEvent = onExtraCallbackWithResult(lifecycleEffectKtExternalSyntheticLambda2, (TypeVariable<?>) type, lifecycleEffectKtExternalSyntheticLambda6);
            } else if (type instanceof WildcardType) {
                javaTypeOnNavigationEvent = onNavigationEvent(lifecycleEffectKtExternalSyntheticLambda2, (WildcardType) type, lifecycleEffectKtExternalSyntheticLambda6);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized Type: ");
                sb.append(type == null ? "[null]" : type.toString());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return onWarmupCompleted(type, javaTypeOnNavigationEvent);
    }

    protected JavaType onWarmupCompleted(Type type, JavaType javaType) {
        if (this._modifiers == null) {
            return javaType;
        }
        LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6OnWarmupCompleted = javaType.onWarmupCompleted();
        if (lifecycleEffectKtExternalSyntheticLambda6OnWarmupCompleted == null) {
            lifecycleEffectKtExternalSyntheticLambda6OnWarmupCompleted = asBinder;
        }
        LifecycleEffectKtExternalSyntheticLambda7[] lifecycleEffectKtExternalSyntheticLambda7Arr = this._modifiers;
        int length = lifecycleEffectKtExternalSyntheticLambda7Arr.length;
        int i2 = 0;
        while (i2 < length) {
            LifecycleEffectKtExternalSyntheticLambda7 lifecycleEffectKtExternalSyntheticLambda7 = lifecycleEffectKtExternalSyntheticLambda7Arr[i2];
            JavaType javaTypeOnExtraCallbackWithResult = lifecycleEffectKtExternalSyntheticLambda7.onExtraCallbackWithResult(javaType, type, lifecycleEffectKtExternalSyntheticLambda6OnWarmupCompleted, this);
            if (javaTypeOnExtraCallbackWithResult == null) {
                throw new IllegalStateException(String.format("TypeModifier %s (of type %s) return null for type %s", lifecycleEffectKtExternalSyntheticLambda7, lifecycleEffectKtExternalSyntheticLambda7.getClass().getName(), javaType));
            }
            i2++;
            javaType = javaTypeOnExtraCallbackWithResult;
        }
        return javaType;
    }

    protected JavaType onExtraCallback(LifecycleEffectKtExternalSyntheticLambda2 lifecycleEffectKtExternalSyntheticLambda2, Class<?> cls, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6) {
        LifecycleEffectKtExternalSyntheticLambda2 lifecycleEffectKtExternalSyntheticLambda2OnNavigationEvent;
        JavaType[] javaTypeArrIAuthTabCallback;
        JavaType javaTypeOnExtraCallbackWithResult;
        JavaType javaTypeOnNavigationEvent = onNavigationEvent(cls);
        if (javaTypeOnNavigationEvent != null) {
            return javaTypeOnNavigationEvent;
        }
        Object objOnWarmupCompleted = (lifecycleEffectKtExternalSyntheticLambda6 == null || lifecycleEffectKtExternalSyntheticLambda6.onExtraCallback()) ? cls : lifecycleEffectKtExternalSyntheticLambda6.onWarmupCompleted(cls);
        JavaType javaTypeOnNavigationEvent2 = null;
        JavaType javaTypeOnExtraCallbackWithResult2 = objOnWarmupCompleted == null ? null : this._typeCache.onExtraCallbackWithResult(objOnWarmupCompleted);
        if (javaTypeOnExtraCallbackWithResult2 != null) {
            return javaTypeOnExtraCallbackWithResult2;
        }
        if (lifecycleEffectKtExternalSyntheticLambda2 == null) {
            lifecycleEffectKtExternalSyntheticLambda2OnNavigationEvent = new LifecycleEffectKtExternalSyntheticLambda2(cls);
        } else {
            LifecycleEffectKtExternalSyntheticLambda2 lifecycleEffectKtExternalSyntheticLambda2OnExtraCallback = lifecycleEffectKtExternalSyntheticLambda2.onExtraCallback(cls);
            if (lifecycleEffectKtExternalSyntheticLambda2OnExtraCallback != null) {
                ResolvedRecursiveType resolvedRecursiveType = new ResolvedRecursiveType(cls, asBinder);
                lifecycleEffectKtExternalSyntheticLambda2OnExtraCallback.IAuthTabCallback(resolvedRecursiveType);
                return resolvedRecursiveType;
            }
            lifecycleEffectKtExternalSyntheticLambda2OnNavigationEvent = lifecycleEffectKtExternalSyntheticLambda2.onNavigationEvent(cls);
        }
        if (cls.isArray()) {
            javaTypeOnExtraCallbackWithResult = ArrayType.onExtraCallbackWithResult(IAuthTabCallback(lifecycleEffectKtExternalSyntheticLambda2OnNavigationEvent, (Type) cls.getComponentType(), lifecycleEffectKtExternalSyntheticLambda6), lifecycleEffectKtExternalSyntheticLambda6);
        } else {
            if (cls.isInterface()) {
                javaTypeArrIAuthTabCallback = IAuthTabCallback(lifecycleEffectKtExternalSyntheticLambda2OnNavigationEvent, cls, lifecycleEffectKtExternalSyntheticLambda6);
            } else {
                javaTypeOnNavigationEvent2 = onNavigationEvent(lifecycleEffectKtExternalSyntheticLambda2OnNavigationEvent, cls, lifecycleEffectKtExternalSyntheticLambda6);
                javaTypeArrIAuthTabCallback = IAuthTabCallback(lifecycleEffectKtExternalSyntheticLambda2OnNavigationEvent, cls, lifecycleEffectKtExternalSyntheticLambda6);
            }
            JavaType[] javaTypeArr = javaTypeArrIAuthTabCallback;
            if (cls == Properties.class) {
                SimpleType simpleType = onTransact;
                javaTypeOnExtraCallbackWithResult2 = MapType.IAuthTabCallback(cls, lifecycleEffectKtExternalSyntheticLambda6, javaTypeOnNavigationEvent2, javaTypeArr, simpleType, simpleType);
            } else if (javaTypeOnNavigationEvent2 != null) {
                javaTypeOnExtraCallbackWithResult2 = javaTypeOnNavigationEvent2.onNavigationEvent(cls, lifecycleEffectKtExternalSyntheticLambda6, javaTypeOnNavigationEvent2, javaTypeArr);
            }
            javaTypeOnExtraCallbackWithResult = (javaTypeOnExtraCallbackWithResult2 == null && (javaTypeOnExtraCallbackWithResult2 = onExtraCallbackWithResult(lifecycleEffectKtExternalSyntheticLambda2OnNavigationEvent, cls, lifecycleEffectKtExternalSyntheticLambda6, javaTypeOnNavigationEvent2, javaTypeArr)) == null && (javaTypeOnExtraCallbackWithResult2 = onWarmupCompleted(lifecycleEffectKtExternalSyntheticLambda2OnNavigationEvent, cls, lifecycleEffectKtExternalSyntheticLambda6, javaTypeOnNavigationEvent2, javaTypeArr)) == null) ? onExtraCallbackWithResult(cls, lifecycleEffectKtExternalSyntheticLambda6, javaTypeOnNavigationEvent2, javaTypeArr) : javaTypeOnExtraCallbackWithResult2;
        }
        lifecycleEffectKtExternalSyntheticLambda2OnNavigationEvent.onNavigationEvent(javaTypeOnExtraCallbackWithResult);
        if (objOnWarmupCompleted != null && !javaTypeOnExtraCallbackWithResult.extraCallbackWithResult()) {
            this._typeCache.onExtraCallback(objOnWarmupCompleted, javaTypeOnExtraCallbackWithResult);
        }
        return javaTypeOnExtraCallbackWithResult;
    }

    protected JavaType onNavigationEvent(LifecycleEffectKtExternalSyntheticLambda2 lifecycleEffectKtExternalSyntheticLambda2, Class<?> cls, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6) {
        Type typeIAuthTabCallbackStub = SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallbackStub(cls);
        if (typeIAuthTabCallbackStub == null) {
            return null;
        }
        return IAuthTabCallback(lifecycleEffectKtExternalSyntheticLambda2, typeIAuthTabCallbackStub, lifecycleEffectKtExternalSyntheticLambda6);
    }

    protected JavaType[] IAuthTabCallback(LifecycleEffectKtExternalSyntheticLambda2 lifecycleEffectKtExternalSyntheticLambda2, Class<?> cls, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6) {
        Type[] typeArrAsBinder = SavedStateHandleImplExternalSyntheticLambda0.asBinder(cls);
        if (typeArrAsBinder == null || typeArrAsBinder.length == 0) {
            return onMessageChannelReady;
        }
        int length = typeArrAsBinder.length;
        JavaType[] javaTypeArr = new JavaType[length];
        for (int i2 = 0; i2 < length; i2++) {
            javaTypeArr[i2] = IAuthTabCallback(lifecycleEffectKtExternalSyntheticLambda2, typeArrAsBinder[i2], lifecycleEffectKtExternalSyntheticLambda6);
        }
        return javaTypeArr;
    }

    protected JavaType onExtraCallbackWithResult(LifecycleEffectKtExternalSyntheticLambda2 lifecycleEffectKtExternalSyntheticLambda2, Class<?> cls, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6, JavaType javaType, JavaType[] javaTypeArr) {
        if (lifecycleEffectKtExternalSyntheticLambda6 == null) {
            lifecycleEffectKtExternalSyntheticLambda6 = asBinder;
        }
        LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda62 = lifecycleEffectKtExternalSyntheticLambda6;
        if (cls == Map.class) {
            return onNavigationEvent(cls, lifecycleEffectKtExternalSyntheticLambda62, javaType, javaTypeArr);
        }
        if (cls == Collection.class) {
            return onWarmupCompleted(cls, lifecycleEffectKtExternalSyntheticLambda62, javaType, javaTypeArr);
        }
        if (cls == AtomicReference.class) {
            return IAuthTabCallbackDefault(cls, lifecycleEffectKtExternalSyntheticLambda62, javaType, javaTypeArr);
        }
        if (cls == Iterator.class || cls == Stream.class) {
            return IAuthTabCallback(cls, lifecycleEffectKtExternalSyntheticLambda62, javaType, javaTypeArr);
        }
        if (!BaseStream.class.isAssignableFrom(cls)) {
            return null;
        }
        if (DoubleStream.class.isAssignableFrom(cls)) {
            return IAuthTabCallback(cls, lifecycleEffectKtExternalSyntheticLambda62, javaType, javaTypeArr, onNavigationEvent);
        }
        if (IntStream.class.isAssignableFrom(cls)) {
            return IAuthTabCallback(cls, lifecycleEffectKtExternalSyntheticLambda62, javaType, javaTypeArr, onExtraCallbackWithResult);
        }
        if (LongStream.class.isAssignableFrom(cls)) {
            return IAuthTabCallback(cls, lifecycleEffectKtExternalSyntheticLambda62, javaType, javaTypeArr, asInterface);
        }
        return null;
    }

    protected JavaType onWarmupCompleted(LifecycleEffectKtExternalSyntheticLambda2 lifecycleEffectKtExternalSyntheticLambda2, Class<?> cls, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6, JavaType javaType, JavaType[] javaTypeArr) {
        for (JavaType javaType2 : javaTypeArr) {
            JavaType javaTypeOnNavigationEvent = javaType2.onNavigationEvent(cls, lifecycleEffectKtExternalSyntheticLambda6, javaType, javaTypeArr);
            if (javaTypeOnNavigationEvent != null) {
                return javaTypeOnNavigationEvent;
            }
        }
        return null;
    }

    protected JavaType onExtraCallback(LifecycleEffectKtExternalSyntheticLambda2 lifecycleEffectKtExternalSyntheticLambda2, ParameterizedType parameterizedType, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6) {
        LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6OnWarmupCompleted;
        Class<?> cls = (Class) parameterizedType.getRawType();
        if (cls == access100) {
            return IAuthTabCallback;
        }
        if (cls == IAuthTabCallbackStubProxy) {
            return onWarmupCompleted;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        int length = actualTypeArguments == null ? 0 : actualTypeArguments.length;
        if (length == 0) {
            lifecycleEffectKtExternalSyntheticLambda6OnWarmupCompleted = asBinder;
        } else {
            JavaType[] javaTypeArr = new JavaType[length];
            for (int i2 = 0; i2 < length; i2++) {
                javaTypeArr[i2] = IAuthTabCallback(lifecycleEffectKtExternalSyntheticLambda2, actualTypeArguments[i2], lifecycleEffectKtExternalSyntheticLambda6);
            }
            lifecycleEffectKtExternalSyntheticLambda6OnWarmupCompleted = LifecycleEffectKtExternalSyntheticLambda6.onWarmupCompleted(cls, javaTypeArr);
        }
        return onExtraCallback(lifecycleEffectKtExternalSyntheticLambda2, cls, lifecycleEffectKtExternalSyntheticLambda6OnWarmupCompleted);
    }

    protected JavaType onNavigationEvent(LifecycleEffectKtExternalSyntheticLambda2 lifecycleEffectKtExternalSyntheticLambda2, GenericArrayType genericArrayType, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6) {
        return ArrayType.onExtraCallbackWithResult(IAuthTabCallback(lifecycleEffectKtExternalSyntheticLambda2, genericArrayType.getGenericComponentType(), lifecycleEffectKtExternalSyntheticLambda6), lifecycleEffectKtExternalSyntheticLambda6);
    }

    protected JavaType onExtraCallbackWithResult(LifecycleEffectKtExternalSyntheticLambda2 lifecycleEffectKtExternalSyntheticLambda2, TypeVariable<?> typeVariable, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6) {
        Type[] bounds;
        String name = typeVariable.getName();
        if (lifecycleEffectKtExternalSyntheticLambda6 == null) {
            throw new IllegalArgumentException("Null `bindings` passed (type variable \"" + name + "\")");
        }
        JavaType javaTypeOnExtraCallback = lifecycleEffectKtExternalSyntheticLambda6.onExtraCallback(name);
        if (javaTypeOnExtraCallback != null) {
            return javaTypeOnExtraCallback;
        }
        if (lifecycleEffectKtExternalSyntheticLambda6.onWarmupCompleted(name)) {
            return IAuthTabCallbackDefault;
        }
        LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6OnExtraCallbackWithResult = lifecycleEffectKtExternalSyntheticLambda6.onExtraCallbackWithResult(name);
        synchronized (typeVariable) {
            bounds = typeVariable.getBounds();
        }
        return IAuthTabCallback(lifecycleEffectKtExternalSyntheticLambda2, bounds[0], lifecycleEffectKtExternalSyntheticLambda6OnExtraCallbackWithResult);
    }

    protected JavaType onNavigationEvent(LifecycleEffectKtExternalSyntheticLambda2 lifecycleEffectKtExternalSyntheticLambda2, WildcardType wildcardType, LifecycleEffectKtExternalSyntheticLambda6 lifecycleEffectKtExternalSyntheticLambda6) {
        return IAuthTabCallback(lifecycleEffectKtExternalSyntheticLambda2, wildcardType.getUpperBounds()[0], lifecycleEffectKtExternalSyntheticLambda6);
    }
}
