package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import ru.nsk.kstatemachine.visitors.RecursiveVisitor;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class logicSignature implements RecursiveVisitor {
    private final List<String> IAuthTabCallback = new ArrayList();

    public void onWarmupCompleted(@NotNull generateAesIV generateaesiv) {
        RecursiveVisitor.DefaultImpls.onExtraCallbackWithResult(this, generateaesiv);
    }

    public final int IAuthTabCallback() {
        return this.IAuthTabCallback.hashCode();
    }

    public void IAuthTabCallback(@NotNull logicDisuseCertRr logicdisusecertrr) {
        Intrinsics.checkNotNullParameter(logicdisusecertrr, BuildConfig.FLAVOR);
        this.IAuthTabCallback.add(onNavigationEvent(logicdisusecertrr));
        this.IAuthTabCallback.add("StateMachine creationArguments:" + logicdisusecertrr.cD_() + ", is" + Reflection.getOrCreateKotlinClass(logicDecCMSEnvelopedData.class).getSimpleName() + ":" + (logicdisusecertrr.readTypedObject() instanceof logicDecCMSEnvelopedData));
        onWarmupCompleted(logicdisusecertrr);
    }

    public void onExtraCallbackWithResult(@NotNull generateAesIV generateaesiv) {
        Intrinsics.checkNotNullParameter(generateaesiv, BuildConfig.FLAVOR);
        if (!(generateaesiv instanceof logicDisuseCertRr)) {
            this.IAuthTabCallback.add(onNavigationEvent(generateaesiv));
            onWarmupCompleted(generateaesiv);
            return;
        }
        this.IAuthTabCallback.add("class:" + Reflection.getOrCreateKotlinClass(generateaesiv.getClass()).getSimpleName() + ", name:" + generateaesiv.IAuthTabCallbackStubProxy());
    }

    private final String onNavigationEvent(generateAesIV generateaesiv) {
        String str;
        String str2;
        String simpleName = Reflection.getOrCreateKotlinClass(generateaesiv.getClass()).getSimpleName();
        String strIAuthTabCallbackStubProxy = generateaesiv.IAuthTabCallbackStubProxy();
        int size = generateaesiv.getInterfaceDescriptor().size();
        int size2 = generateaesiv.access000().size();
        certVerifyCertificate certverifycertificateIAuthTabCallback = generateaesiv.IAuthTabCallback();
        if (generateaesiv instanceof cryptGenerateHASH) {
            str2 = ", historyType:" + ((cryptGenerateHASH) generateaesiv).onWarmupCompleted();
        } else {
            if (generateaesiv instanceof cryptGenerateMACWithSHA256) {
                cryptGenerateMACWithSHA256 cryptgeneratemacwithsha256 = (cryptGenerateMACWithSHA256) generateaesiv;
                str = ", dataClass:" + cryptgeneratemacwithsha256.onWarmupCompleted() + ", defaultData:" + cryptgeneratemacwithsha256.asInterface();
            } else {
                str = BuildConfig.FLAVOR;
            }
            str2 = str;
        }
        return "class:" + simpleName + ", name:" + strIAuthTabCallbackStubProxy + ", statesCount:" + size + ", transitionsCount:" + size2 + ", childMode:" + certverifycertificateIAuthTabCallback + str2;
    }

    public <E extends certGetOCSPAddress> void onExtraCallbackWithResult(@NotNull logicIssueCertSendConf<E> logicissuecertsendconf) {
        Intrinsics.checkNotNullParameter(logicissuecertsendconf, BuildConfig.FLAVOR);
        this.IAuthTabCallback.add("class:" + Reflection.getOrCreateKotlinClass(logicissuecertsendconf.getClass()).getSimpleName() + ", name:" + logicissuecertsendconf.onNavigationEvent() + ", type:" + logicissuecertsendconf.IAuthTabCallbackStub() + ", event:" + logicissuecertsendconf.onWarmupCompleted().onExtraCallback());
    }
}
