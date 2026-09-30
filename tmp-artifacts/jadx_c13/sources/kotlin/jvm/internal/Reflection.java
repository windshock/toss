package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KTypeProjection;
import o.access5000;
import o.access5200;
import o.access5300;
import o.access5400;
import o.access5500;
import o.access5700;
import o.access5900;
import o.addAllCauses;
import o.addAllLogBuffers;
import o.addAllMemoryMappings;
import o.addAllOpenFds;
import o.addCauses;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class Reflection {
    private static final KClass[] EMPTY_K_CLASS_ARRAY;
    static final String REFLECTION_NOT_AVAILABLE = " (Kotlin reflection is not available)";
    private static final ReflectionFactory factory;

    static {
        ReflectionFactory reflectionFactory;
        try {
            reflectionFactory = (ReflectionFactory) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            reflectionFactory = null;
        }
        if (reflectionFactory == null) {
            reflectionFactory = new ReflectionFactory();
        }
        factory = reflectionFactory;
        EMPTY_K_CLASS_ARRAY = new KClass[0];
    }

    public static KClass createKotlinClass(Class cls) {
        return factory.createKotlinClass(cls);
    }

    public static KClass createKotlinClass(Class cls, String str) {
        return factory.createKotlinClass(cls, str);
    }

    public static access5000 getOrCreateKotlinPackage(Class cls) {
        return factory.getOrCreateKotlinPackage(cls, _UrlKt.FRAGMENT_ENCODE_SET);
    }

    public static access5000 getOrCreateKotlinPackage(Class cls, String str) {
        return factory.getOrCreateKotlinPackage(cls, str);
    }

    public static KClass getOrCreateKotlinClass(Class cls) {
        return factory.getOrCreateKotlinClass(cls);
    }

    public static KClass getOrCreateKotlinClass(Class cls, String str) {
        return factory.getOrCreateKotlinClass(cls, str);
    }

    public static KClass[] getOrCreateKotlinClasses(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return EMPTY_K_CLASS_ARRAY;
        }
        KClass[] kClassArr = new KClass[length];
        for (int i = 0; i < length; i++) {
            kClassArr[i] = getOrCreateKotlinClass(clsArr[i]);
        }
        return kClassArr;
    }

    public static String renderLambdaToString(Lambda lambda) {
        return factory.renderLambdaToString(lambda);
    }

    public static String renderLambdaToString(FunctionBase functionBase) {
        return factory.renderLambdaToString(functionBase);
    }

    public static access5300 function(FunctionReference functionReference) {
        return factory.function(functionReference);
    }

    public static addAllMemoryMappings property0(PropertyReference0 propertyReference0) {
        return factory.property0(propertyReference0);
    }

    public static access5700 mutableProperty0(MutablePropertyReference0 mutablePropertyReference0) {
        return factory.mutableProperty0(mutablePropertyReference0);
    }

    public static addAllCauses property1(PropertyReference1 propertyReference1) {
        return factory.property1(propertyReference1);
    }

    public static access5500 mutableProperty1(MutablePropertyReference1 mutablePropertyReference1) {
        return factory.mutableProperty1(mutablePropertyReference1);
    }

    public static addAllLogBuffers property2(PropertyReference2 propertyReference2) {
        return factory.property2(propertyReference2);
    }

    public static access5400 mutableProperty2(MutablePropertyReference2 mutablePropertyReference2) {
        return factory.mutableProperty2(mutablePropertyReference2);
    }

    public static access5900 typeOf(access5200 access5200Var) {
        return factory.typeOf(access5200Var, Collections.EMPTY_LIST, false);
    }

    public static access5900 typeOf(Class cls) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Collections.EMPTY_LIST, false);
    }

    public static access5900 typeOf(Class cls, KTypeProjection kTypeProjection) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Collections.singletonList(kTypeProjection), false);
    }

    public static access5900 typeOf(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Arrays.asList(kTypeProjection, kTypeProjection2), false);
    }

    public static access5900 typeOf(Class cls, KTypeProjection... kTypeProjectionArr) {
        return factory.typeOf(getOrCreateKotlinClass(cls), ArraysKt___ArraysKt.toList(kTypeProjectionArr), false);
    }

    public static access5900 nullableTypeOf(access5200 access5200Var) {
        return factory.typeOf(access5200Var, Collections.EMPTY_LIST, true);
    }

    public static access5900 nullableTypeOf(Class cls) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Collections.EMPTY_LIST, true);
    }

    public static access5900 nullableTypeOf(Class cls, KTypeProjection kTypeProjection) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Collections.singletonList(kTypeProjection), true);
    }

    public static access5900 nullableTypeOf(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Arrays.asList(kTypeProjection, kTypeProjection2), true);
    }

    public static access5900 nullableTypeOf(Class cls, KTypeProjection... kTypeProjectionArr) {
        return factory.typeOf(getOrCreateKotlinClass(cls), ArraysKt___ArraysKt.toList(kTypeProjectionArr), true);
    }

    public static addCauses typeParameter(Object obj, String str, addAllOpenFds addallopenfds, boolean z) {
        return factory.typeParameter(obj, str, addallopenfds, z);
    }

    public static void setUpperBounds(addCauses addcauses, access5900 access5900Var) {
        factory.setUpperBounds(addcauses, Collections.singletonList(access5900Var));
    }

    public static void setUpperBounds(addCauses addcauses, access5900... access5900VarArr) {
        factory.setUpperBounds(addcauses, ArraysKt___ArraysKt.toList(access5900VarArr));
    }

    public static access5900 platformType(access5900 access5900Var, access5900 access5900Var2) {
        return factory.platformType(access5900Var, access5900Var2);
    }

    public static access5900 mutableCollectionType(access5900 access5900Var) {
        return factory.mutableCollectionType(access5900Var);
    }

    public static access5900 nothingType(access5900 access5900Var) {
        return factory.nothingType(access5900Var);
    }
}
