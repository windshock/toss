package kotlin.jvm.internal;

import java.util.List;
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

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ReflectionFactory {
    private static final String KOTLIN_JVM_FUNCTIONS = "kotlin.jvm.functions.";

    public access5300 function(FunctionReference functionReference) {
        return functionReference;
    }

    public access5700 mutableProperty0(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public access5500 mutableProperty1(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public access5400 mutableProperty2(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    public addAllMemoryMappings property0(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public addAllCauses property1(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public addAllLogBuffers property2(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    public KClass createKotlinClass(Class cls) {
        return new ClassReference(cls);
    }

    public KClass createKotlinClass(Class cls, String str) {
        return new ClassReference(cls);
    }

    public access5000 getOrCreateKotlinPackage(Class cls, String str) {
        return new PackageReference(cls, str);
    }

    public KClass getOrCreateKotlinClass(Class cls) {
        return new ClassReference(cls);
    }

    public KClass getOrCreateKotlinClass(Class cls, String str) {
        return new ClassReference(cls);
    }

    public String renderLambdaToString(Lambda lambda) {
        return renderLambdaToString((FunctionBase) lambda);
    }

    public String renderLambdaToString(FunctionBase functionBase) {
        String string = functionBase.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith(KOTLIN_JVM_FUNCTIONS) ? string.substring(21) : string;
    }

    public access5900 typeOf(access5200 access5200Var, List<KTypeProjection> list, boolean z) {
        return new TypeReference(access5200Var, list, z);
    }

    public addCauses typeParameter(Object obj, String str, addAllOpenFds addallopenfds, boolean z) {
        return new TypeParameterReference(obj, str, addallopenfds, z);
    }

    public void setUpperBounds(addCauses addcauses, List<access5900> list) {
        ((TypeParameterReference) addcauses).setUpperBounds(list);
    }

    public access5900 platformType(access5900 access5900Var, access5900 access5900Var2) {
        return new TypeReference(access5900Var.getClassifier(), access5900Var.getArguments(), access5900Var2, ((TypeReference) access5900Var).getFlags$kotlin_stdlib());
    }

    public access5900 mutableCollectionType(access5900 access5900Var) {
        TypeReference typeReference = (TypeReference) access5900Var;
        return new TypeReference(access5900Var.getClassifier(), access5900Var.getArguments(), typeReference.getPlatformTypeUpperBound$kotlin_stdlib(), typeReference.getFlags$kotlin_stdlib() | 2);
    }

    public access5900 nothingType(access5900 access5900Var) {
        TypeReference typeReference = (TypeReference) access5900Var;
        return new TypeReference(access5900Var.getClassifier(), access5900Var.getArguments(), typeReference.getPlatformTypeUpperBound$kotlin_stdlib(), typeReference.getFlags$kotlin_stdlib() | 4);
    }
}
