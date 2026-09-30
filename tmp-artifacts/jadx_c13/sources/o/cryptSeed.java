package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import o.logicDisuseCertRr;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class cryptSeed {
    public static final Object onExtraCallback(@NotNull generateAesIV generateaesiv, @NotNull Function0<String> function0, @NotNull access13800<? super Unit> access13800Var) {
        logicDisuseCertRr.onExtraCallbackWithResult onextracallbackwithresultCF_;
        logicDisuseCertRr logicdisusecertrrOnNavigationEvent = onNavigationEvent(generateaesiv);
        if (logicdisusecertrrOnNavigationEvent == null || (onextracallbackwithresultCF_ = logicdisusecertrrOnNavigationEvent.cF_()) == null) {
            return Unit.INSTANCE;
        }
        Object objOnWarmupCompleted = onextracallbackwithresultCF_.onWarmupCompleted(function0, access13800Var);
        return objOnWarmupCompleted == access14100.onExtraCallback() ? objOnWarmupCompleted : Unit.INSTANCE;
    }

    public static final generateAesIV onExtraCallback(@NotNull generateAesIV generateaesiv) {
        Intrinsics.checkNotNullParameter(generateaesiv, "");
        generateAesIV generateaesivOnExtraCallback = generateaesiv.onExtraCallback();
        if (generateaesivOnExtraCallback != null) {
            return generateaesivOnExtraCallback;
        }
        throw new IllegalStateException("Initial state is not set, call setInitialState() first");
    }

    public static /* synthetic */ Set onExtraCallback(generateAesIV generateaesiv, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return onWarmupCompleted(generateaesiv, z);
    }

    public static final Set<generateAesIV> onWarmupCompleted(@NotNull generateAesIV generateaesiv, boolean z) {
        Intrinsics.checkNotNullParameter(generateaesiv, "");
        logicRenewCertSendConf logicrenewcertsendconf = new logicRenewCertSendConf(z);
        generateaesiv.onExtraCallback(logicrenewcertsendconf);
        return logicrenewcertsendconf.onNavigationEvent();
    }

    public static final generateAesIV onWarmupCompleted(@NotNull generateAesIV generateaesiv, @NotNull String str, boolean z) {
        Object next;
        Intrinsics.checkNotNullParameter(generateaesiv, "");
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<T> it = generateaesiv.getInterfaceDescriptor().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((generateAesIV) next).IAuthTabCallbackStubProxy(), str)) {
                break;
            }
        }
        generateAesIV generateaesiv2 = (generateAesIV) next;
        if (!z || generateaesiv2 != null) {
            return generateaesiv2;
        }
        for (generateAesIV generateaesiv3 : generateaesiv.getInterfaceDescriptor()) {
            generateAesIV generateaesivOnWarmupCompleted = generateaesiv3 instanceof logicDisuseCertRr ? null : onWarmupCompleted(generateaesiv3, str, true);
            if (generateaesivOnWarmupCompleted != null) {
                return generateaesivOnWarmupCompleted;
            }
        }
        return null;
    }

    private static final <S extends generateAesIV> void IAuthTabCallback(KClass<S> kClass, Collection<?> collection) {
        if (collection.size() <= 1) {
            return;
        }
        throw new IllegalArgumentException(("More than one state matches " + kClass.getSimpleName()).toString());
    }

    public static final <S extends generateAesIV> S onExtraCallback(@NotNull generateAesIV generateaesiv, @NotNull KClass<S> kClass, boolean z) {
        Intrinsics.checkNotNullParameter(generateaesiv, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        Set<generateAesIV> interfaceDescriptor = generateaesiv.getInterfaceDescriptor();
        ArrayList arrayList = new ArrayList();
        for (Object obj : interfaceDescriptor) {
            if (kClass.isInstance((generateAesIV) obj)) {
                arrayList.add(obj);
            }
        }
        IAuthTabCallback(kClass, arrayList);
        if (!z) {
            return (S) CollectionsKt___CollectionsKt.singleOrNull((List) arrayList);
        }
        Set<generateAesIV> interfaceDescriptor2 = generateaesiv.getInterfaceDescriptor();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = interfaceDescriptor2.iterator();
        while (it.hasNext()) {
            generateAesIV generateaesivOnExtraCallback = onExtraCallback((generateAesIV) it.next(), (KClass<generateAesIV>) kClass, true);
            if (generateaesivOnExtraCallback != null) {
                arrayList2.add(generateaesivOnExtraCallback);
            }
        }
        IAuthTabCallback(kClass, arrayList2);
        List listPlus = CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
        IAuthTabCallback(kClass, listPlus);
        return (S) CollectionsKt___CollectionsKt.singleOrNull(listPlus);
    }

    public static final logicDisuseCertRr onNavigationEvent(@NotNull generateAesIV generateaesiv) {
        Intrinsics.checkNotNullParameter(generateaesiv, "");
        logicDisuseCertRr logicdisusecertrr = generateaesiv instanceof logicDisuseCertRr ? (logicDisuseCertRr) generateaesiv : null;
        if (logicdisusecertrr != null) {
            return logicdisusecertrr;
        }
        generateAesIV generateaesivICustomTabsCallback = generateaesiv.ICustomTabsCallback();
        if (generateaesivICustomTabsCallback != null) {
            return onNavigationEvent(generateaesivICustomTabsCallback);
        }
        return null;
    }
}
