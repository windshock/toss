package im.toss.rome;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.annotations.RealmModule;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import o.clearRegisters;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RomeConfigRegistry {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final Companion Companion = new Companion(null);
    private static String onExtraCallbackWithResult = RomeConfigRegistry.class.getSimpleName();
    private static Map<Class<? extends RealmModel>, RealmConfiguration> onExtraCallback = new HashMap();

    public static final /* synthetic */ Map onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 121;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Map<Class<? extends RealmModel>, RealmConfiguration> map = onExtraCallback;
        int i5 = i2 + 71;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T extends RealmModel> void onWarmupCompleted(@NotNull Class<T> cls, @NotNull RealmConfiguration realmConfiguration) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(cls, "");
            Intrinsics.checkNotNullParameter(realmConfiguration, "");
            if (RomeConfigRegistry.onWarmupCompleted().containsKey(cls)) {
                return;
            }
            RomeConfigRegistry.onWarmupCompleted().put(cls, realmConfiguration);
            int i4 = onWarmupCompleted + 13;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        public final <T> void onNavigationEvent(@NotNull Class<T> cls, @NotNull RealmConfiguration realmConfiguration) {
            Annotation annotation;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(cls, "");
            Intrinsics.checkNotNullParameter(realmConfiguration, "");
            Annotation[] annotations = cls.getAnnotations();
            Intrinsics.checkNotNullExpressionValue(annotations, "");
            int length = annotations.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    int i3 = onWarmupCompleted + 69;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    annotation = null;
                    break;
                }
                annotation = annotations[i2];
                if (Intrinsics.areEqual(clearRegisters.onNavigationEvent(clearRegisters.IAuthTabCallback(annotation)).getName(), RealmModule.class.getName())) {
                    break;
                }
                int i5 = onWarmupCompleted + 97;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                i2++;
            }
            if (annotation != null) {
                RealmModule realmModule = (RealmModule) annotation;
                KClass[] orCreateKotlinClasses = Reflection.getOrCreateKotlinClasses(realmModule.classes());
                ArrayList<KClass> arrayList = new ArrayList();
                for (KClass kClass : orCreateKotlinClasses) {
                    Class<?>[] interfaces = clearRegisters.onNavigationEvent(kClass).getInterfaces();
                    Intrinsics.checkNotNullExpressionValue(interfaces, "");
                    if (!(true ^ ArraysKt.contains(interfaces, RealmModel.class))) {
                        int i7 = onWarmupCompleted + 79;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        arrayList.add(kClass);
                    }
                }
                for (KClass kClass2 : arrayList) {
                    Companion companion = RomeConfigRegistry.Companion;
                    Class clsOnNavigationEvent = clearRegisters.onNavigationEvent(kClass2);
                    Intrinsics.checkNotNull(clsOnNavigationEvent, "");
                    companion.onWarmupCompleted(clsOnNavigationEvent, realmConfiguration);
                }
                KClass[] orCreateKotlinClasses2 = Reflection.getOrCreateKotlinClasses(realmModule.classes());
                ArrayList arrayList2 = new ArrayList();
                for (KClass kClass3 : orCreateKotlinClasses2) {
                    if (!(!Intrinsics.areEqual(clearRegisters.onNavigationEvent(kClass3).getSuperclass(), RealmObject.class))) {
                        arrayList2.add(kClass3);
                    }
                }
                Iterator<T> it = arrayList2.iterator();
                while (!(!it.hasNext())) {
                    int i9 = onWarmupCompleted + 19;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    KClass kClass4 = (KClass) it.next();
                    Companion companion2 = RomeConfigRegistry.Companion;
                    Class clsOnNavigationEvent2 = clearRegisters.onNavigationEvent(kClass4);
                    Intrinsics.checkNotNull(clsOnNavigationEvent2, "");
                    companion2.onWarmupCompleted(clsOnNavigationEvent2, realmConfiguration);
                }
            }
        }

        public final <T extends RealmModel> RealmConfiguration onWarmupCompleted(@NotNull Class<T> cls) {
            RealmConfiguration realmConfiguration;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(cls, "");
                realmConfiguration = (RealmConfiguration) RomeConfigRegistry.onWarmupCompleted().get(cls);
                int i3 = 37 / 0;
            } else {
                Intrinsics.checkNotNullParameter(cls, "");
                realmConfiguration = (RealmConfiguration) RomeConfigRegistry.onWarmupCompleted().get(cls);
            }
            int i4 = onNavigationEvent + 83;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return realmConfiguration;
        }

        public final <T extends RealmModel> Realm onWarmupCompleted(@NotNull T t) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(t, "");
            RealmConfiguration realmConfigurationOnWarmupCompleted = onWarmupCompleted(t.getClass());
            if (realmConfigurationOnWarmupCompleted != null) {
                int i2 = onNavigationEvent + 53;
                onWarmupCompleted = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    RomeConfigRegistryKt.onWarmupCompleted(realmConfigurationOnWarmupCompleted);
                    obj.hashCode();
                    throw null;
                }
                Realm realmOnWarmupCompleted = RomeConfigRegistryKt.onWarmupCompleted(realmConfigurationOnWarmupCompleted);
                if (realmOnWarmupCompleted != null) {
                    int i3 = onWarmupCompleted + 23;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        return realmOnWarmupCompleted;
                    }
                    throw null;
                }
            }
            Realm realmOnMessageChannelReady = Realm.onMessageChannelReady();
            Intrinsics.checkNotNullExpressionValue(realmOnMessageChannelReady, "");
            int i4 = onWarmupCompleted + 15;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return realmOnMessageChannelReady;
        }

        public final <T extends RealmModel> Realm onExtraCallbackWithResult(@NotNull Class<T> cls) {
            Realm realmOnWarmupCompleted;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(cls, "");
            RealmConfiguration realmConfigurationOnWarmupCompleted = onWarmupCompleted(cls);
            if (realmConfigurationOnWarmupCompleted != null && (realmOnWarmupCompleted = RomeConfigRegistryKt.onWarmupCompleted(realmConfigurationOnWarmupCompleted)) != null) {
                int i2 = onWarmupCompleted + 33;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return realmOnWarmupCompleted;
                }
                throw null;
            }
            Realm realmOnMessageChannelReady = Realm.onMessageChannelReady();
            Intrinsics.checkNotNullExpressionValue(realmOnMessageChannelReady, "");
            int i3 = onWarmupCompleted + 45;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 86 / 0;
            }
            return realmOnMessageChannelReady;
        }
    }

    static {
        int i = onNavigationEvent + 79;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 42 / 0;
        }
    }
}
