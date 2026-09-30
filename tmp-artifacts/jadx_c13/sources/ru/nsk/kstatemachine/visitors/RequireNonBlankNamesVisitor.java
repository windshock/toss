package ru.nsk.kstatemachine.visitors;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.certGetOCSPAddress;
import o.generateAesIV;
import o.logicDisuseCertRr;
import o.logicIssueCertSendConf;
import org.jetbrains.annotations.NotNull;
import ru.nsk.kstatemachine.visitors.RecursiveVisitor;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RequireNonBlankNamesVisitor implements RecursiveVisitor {
    private final Set<generateAesIV> onNavigationEvent = new LinkedHashSet();
    private final Set<logicIssueCertSendConf<?>> onExtraCallback = new LinkedHashSet();

    public void IAuthTabCallback(@NotNull generateAesIV generateaesiv) {
        RecursiveVisitor.DefaultImpls.onExtraCallbackWithResult(this, generateaesiv);
    }

    @Override // o.pkcs12GetCertWithPFXEncPKCS8
    public void IAuthTabCallback(@NotNull logicDisuseCertRr logicdisusecertrr) {
        Intrinsics.checkNotNullParameter(logicdisusecertrr, "");
        String strIAuthTabCallbackStubProxy = logicdisusecertrr.IAuthTabCallbackStubProxy();
        if (strIAuthTabCallbackStubProxy == null || StringsKt__StringsKt.isBlank(strIAuthTabCallbackStubProxy)) {
            this.onNavigationEvent.add(logicdisusecertrr);
        }
        IAuthTabCallback((generateAesIV) logicdisusecertrr);
    }

    @Override // o.pkcs12GetCertWithPFXEncPKCS8
    public void onExtraCallbackWithResult(@NotNull generateAesIV generateaesiv) {
        Intrinsics.checkNotNullParameter(generateaesiv, "");
        String strIAuthTabCallbackStubProxy = generateaesiv.IAuthTabCallbackStubProxy();
        if (strIAuthTabCallbackStubProxy == null || StringsKt__StringsKt.isBlank(strIAuthTabCallbackStubProxy)) {
            this.onNavigationEvent.add(generateaesiv);
        }
        if (generateaesiv instanceof logicDisuseCertRr) {
            return;
        }
        IAuthTabCallback(generateaesiv);
    }

    @Override // o.pkcs12GetCertWithPFXEncPKCS8
    public <E extends certGetOCSPAddress> void onExtraCallbackWithResult(@NotNull logicIssueCertSendConf<E> logicissuecertsendconf) {
        Intrinsics.checkNotNullParameter(logicissuecertsendconf, "");
        String strOnNavigationEvent = logicissuecertsendconf.onNavigationEvent();
        if (strOnNavigationEvent == null || StringsKt__StringsKt.isBlank(strOnNavigationEvent)) {
            this.onExtraCallback.add(logicissuecertsendconf);
        }
    }

    public final boolean onWarmupCompleted() {
        return (this.onNavigationEvent.isEmpty() && this.onExtraCallback.isEmpty()) ? false : true;
    }

    public final void onExtraCallbackWithResult() {
        if (onWarmupCompleted()) {
            throw new IllegalStateException(("There were blank names in states: " + CollectionsKt___CollectionsKt.joinToString$default(this.onNavigationEvent, null, null, null, 0, null, new Function1<generateAesIV, CharSequence>() { // from class: ru.nsk.kstatemachine.visitors.RequireNonBlankNamesVisitor$checkNonBlankNames$1$statesText$1
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public final CharSequence invoke(generateAesIV generateaesiv) {
                    Intrinsics.checkNotNullParameter(generateaesiv, "");
                    return generateaesiv + " (child of " + generateaesiv.ICustomTabsCallback() + ")";
                }
            }, 31, null) + " transitions: " + CollectionsKt___CollectionsKt.joinToString$default(this.onExtraCallback, null, null, null, 0, null, new Function1<logicIssueCertSendConf<?>, CharSequence>() { // from class: ru.nsk.kstatemachine.visitors.RequireNonBlankNamesVisitor$checkNonBlankNames$1$transitionsText$1
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final CharSequence invoke(logicIssueCertSendConf<?> logicissuecertsendconf) {
                    Intrinsics.checkNotNullParameter(logicissuecertsendconf, "");
                    return logicissuecertsendconf + " (in " + logicissuecertsendconf.onExtraCallbackWithResult() + ")";
                }
            }, 31, null)).toString());
        }
    }
}
