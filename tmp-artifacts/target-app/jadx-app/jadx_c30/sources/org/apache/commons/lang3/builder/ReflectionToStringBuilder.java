package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import o.BackupConstant;
import o.PAGAppOpenAdInteractionListener;
import o.PAGAppOpenAdLoadListener;
import o.PAGRewardFullExpressAdListenerProxy2;
import o.PAGVideoMediaView1;
import o.onVideoAdPlay;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ReflectionToStringBuilder extends PAGAppOpenAdLoadListener {
    private boolean IAuthTabCallback;
    private boolean onExtraCallback;
    protected String[] onExtraCallbackWithResult;
    private Class<?> onNavigationEvent;
    private boolean onWarmupCompleted;

    public static String onWarmupCompleted(Object obj, BackupConstant backupConstant) {
        return onExtraCallbackWithResult(obj, backupConstant, false, false, null);
    }

    public static <T> String onExtraCallbackWithResult(T t, BackupConstant backupConstant, boolean z, boolean z2, Class<? super T> cls) {
        return new ReflectionToStringBuilder(t, backupConstant, null, cls, z, z2).toString();
    }

    private static Object onNavigationEvent(Object obj) {
        return PAGVideoMediaView1.IAuthTabCallback(obj, "obj", new Object[0]);
    }

    public <T> ReflectionToStringBuilder(T t, BackupConstant backupConstant, StringBuffer stringBuffer, Class<? super T> cls, boolean z, boolean z2) {
        super(onNavigationEvent(t), backupConstant, stringBuffer);
        onNavigationEvent((Class<?>) cls);
        onNavigationEvent(z);
        onWarmupCompleted(z2);
    }

    protected boolean onExtraCallbackWithResult(Field field) {
        if (field.getName().indexOf(36) != -1) {
            return false;
        }
        if (Modifier.isTransient(field.getModifiers()) && !onWarmupCompleted()) {
            return false;
        }
        if (Modifier.isStatic(field.getModifiers()) && !onNavigationEvent()) {
            return false;
        }
        String[] strArr = this.onExtraCallbackWithResult;
        if (strArr == null || Arrays.binarySearch(strArr, field.getName()) < 0) {
            return !field.isAnnotationPresent(PAGAppOpenAdInteractionListener.class);
        }
        return false;
    }

    protected void IAuthTabCallback(Class<?> cls) throws SecurityException {
        if (cls.isArray()) {
            onWarmupCompleted(IAuthTabCallback());
            return;
        }
        Field[] fieldArr = (Field[]) onVideoAdPlay.onExtraCallbackWithResult(cls.getDeclaredFields(), Comparator.comparing(new Function() { // from class: org.apache.commons.lang3.builder.HashCodeBuilder$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Field) obj).getName();
            }
        }));
        AccessibleObject.setAccessible(fieldArr, true);
        for (Field field : fieldArr) {
            String name = field.getName();
            if (onExtraCallbackWithResult(field)) {
                try {
                    Object objOnNavigationEvent = onNavigationEvent(field);
                    if (!this.onExtraCallback || objOnNavigationEvent != null) {
                        onExtraCallback(name, objOnNavigationEvent, !field.isAnnotationPresent(PAGRewardFullExpressAdListenerProxy2.class));
                    }
                } catch (IllegalAccessException e) {
                    throw new InternalError("Unexpected IllegalAccessException: " + e.getMessage());
                }
            }
        }
    }

    public Class<?> onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    protected Object onNavigationEvent(Field field) throws IllegalAccessException {
        return field.get(IAuthTabCallback());
    }

    public boolean onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public boolean onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public ReflectionToStringBuilder onWarmupCompleted(Object obj) {
        asBinder().onWarmupCompleted(onTransact(), (String) null, obj);
        return this;
    }

    public void onWarmupCompleted(boolean z) {
        this.onWarmupCompleted = z;
    }

    public void onNavigationEvent(boolean z) {
        this.IAuthTabCallback = z;
    }

    public void onNavigationEvent(Class<?> cls) {
        Object objIAuthTabCallback;
        if (cls != null && (objIAuthTabCallback = IAuthTabCallback()) != null && !cls.isInstance(objIAuthTabCallback)) {
            throw new IllegalArgumentException("Specified class is not a superclass of the object");
        }
        this.onNavigationEvent = cls;
    }

    @Override // o.PAGAppOpenAdLoadListener
    public String toString() throws SecurityException {
        if (IAuthTabCallback() == null) {
            return asBinder().onTransact();
        }
        Class<?> superclass = IAuthTabCallback().getClass();
        IAuthTabCallback(superclass);
        while (superclass.getSuperclass() != null && superclass != onExtraCallbackWithResult()) {
            superclass = superclass.getSuperclass();
            IAuthTabCallback(superclass);
        }
        return super.toString();
    }
}
