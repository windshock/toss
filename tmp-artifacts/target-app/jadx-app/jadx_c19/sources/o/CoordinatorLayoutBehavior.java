package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class CoordinatorLayoutBehavior {
    private static final String onExtraCallbackWithResult;
    public static final CoordinatorLayoutBehavior onNavigationEvent = new CoordinatorLayoutBehavior();
    private static final String[] onWarmupCompleted;

    static {
        String simpleName = CoordinatorLayoutBehavior.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        onExtraCallbackWithResult = simpleName;
        onWarmupCompleted = new String[]{"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"};
    }

    private CoordinatorLayoutBehavior() {
    }

    public static final /* synthetic */ String onNavigationEvent(CoordinatorLayoutBehavior coordinatorLayoutBehavior) {
        return onExtraCallbackWithResult;
    }

    @JvmStatic
    public static final String IAuthTabCallback(@Nullable String str) throws Exception {
        return onNavigationEvent.onExtraCallbackWithResult(new File(str));
    }

    private final String onExtraCallbackWithResult(File file) throws Exception {
        int i2;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 1024);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            do {
                i2 = bufferedInputStream.read(bArr);
                if (i2 > 0) {
                    messageDigest.update(bArr, 0, i2);
                }
            } while (i2 != -1);
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            Intrinsics.checkNotNullExpressionValue(string, "");
            CloseableKt.closeFinally(bufferedInputStream, (Throwable) null);
            return string;
        } finally {
        }
    }

    @JvmStatic
    public static final String onExtraCallbackWithResult(@NotNull Context context, @Nullable Long l) throws CertificateException {
        Intrinsics.checkNotNullParameter(context, "");
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        String[] strArr = onWarmupCompleted;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(Base64.decode(str, 0))));
        }
        List mutableList = CollectionsKt.toMutableList(arrayList);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        reentrantLock.lock();
        try {
            Class<?> cls = Class.forName("android.content.pm.Checksum");
            Intrinsics.checkNotNullExpressionValue(cls, "");
            Field field = cls.getField("TYPE_WHOLE_MD5");
            Intrinsics.checkNotNullExpressionValue(field, "");
            Object obj = field.get(null);
            Class<?> cls2 = Class.forName("android.content.pm.PackageManager$OnChecksumsReadyListener");
            Intrinsics.checkNotNullExpressionValue(cls2, "");
            Object objNewProxyInstance = Proxy.newProxyInstance(CoordinatorLayoutBehavior.class.getClassLoader(), new Class[]{cls2}, new onExtraCallbackWithResult(obj, objectRef, reentrantLock, conditionNewCondition));
            Intrinsics.checkNotNullExpressionValue(objNewProxyInstance, "");
            Method method = PackageManager.class.getMethod("requestChecksums", String.class, Boolean.TYPE, Integer.TYPE, List.class, cls2);
            Intrinsics.checkNotNullExpressionValue(method, "");
            method.invoke(context.getPackageManager(), context.getPackageName(), Boolean.FALSE, obj, CollectionsKt.toMutableList(mutableList), objNewProxyInstance);
            if (l == null) {
                conditionNewCondition.await();
            } else {
                conditionNewCondition.awaitNanos(l.longValue());
            }
            String str2 = (String) objectRef.element;
            reentrantLock.unlock();
            return str2;
        } catch (Throwable unused) {
            reentrantLock.unlock();
            return null;
        }
    }

    public static final class onExtraCallbackWithResult implements InvocationHandler {
        final /* synthetic */ Condition IAuthTabCallback;
        final /* synthetic */ Object onExtraCallback;
        final /* synthetic */ ReentrantLock onNavigationEvent;
        final /* synthetic */ Ref.ObjectRef onWarmupCompleted;

        onExtraCallbackWithResult(Object obj, Ref.ObjectRef objectRef, ReentrantLock reentrantLock, Condition condition) {
            this.onExtraCallback = obj;
            this.onWarmupCompleted = objectRef;
            this.onNavigationEvent = reentrantLock;
            this.IAuthTabCallback = condition;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(@Nullable Object obj, @NotNull Method method, @NotNull Object[] objArr) {
            Intrinsics.checkNotNullParameter(method, "");
            Intrinsics.checkNotNullParameter(objArr, "");
            try {
                if (Intrinsics.areEqual(method.getName(), "onChecksumsReady") && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                        }
                        for (Object obj3 : (List) obj2) {
                            if (obj3 != null) {
                                Method method2 = obj3.getClass().getMethod("getSplitName", null);
                                Intrinsics.checkNotNullExpressionValue(method2, "");
                                Method method3 = obj3.getClass().getMethod("getType", null);
                                Intrinsics.checkNotNullExpressionValue(method3, "");
                                if (method2.invoke(obj3, null) == null && Intrinsics.areEqual(method3.invoke(obj3, null), this.onExtraCallback)) {
                                    Method method4 = obj3.getClass().getMethod("getValue", null);
                                    Intrinsics.checkNotNullExpressionValue(method4, "");
                                    Object objInvoke = method4.invoke(obj3, null);
                                    if (objInvoke == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                                    }
                                    this.onWarmupCompleted.element = new BigInteger(1, (byte[]) objInvoke).toString(16);
                                    this.onNavigationEvent.lock();
                                    try {
                                        this.IAuthTabCallback.signalAll();
                                        return null;
                                    } finally {
                                        this.onNavigationEvent.unlock();
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
                CoordinatorLayoutBehavior.onNavigationEvent(CoordinatorLayoutBehavior.onNavigationEvent);
            }
            return null;
        }
    }
}
