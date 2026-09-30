package o;

import java.lang.annotation.Annotation;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class isEqual implements CertCertType {
    private static final CertCertType IAuthTabCallback = new isEqual();

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    isEqual() {
    }

    static Annotation[] onExtraCallback(Annotation[] annotationArr) {
        if (getDirNames.onWarmupCompleted(annotationArr, CertCertType.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = IAuthTabCallback;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return CertCertType.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof CertCertType;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + CertCertType.class.getName() + "()";
    }
}
