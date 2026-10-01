package ru.nsk.kstatemachine.visitors;

import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import o.access13800;
import o.access14100;
import o.generateAesIV;
import o.logicIssueCertSendConf;
import o.logicVerifyCMSSignedData;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface RecursiveCoVisitor extends logicVerifyCMSSignedData {

    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object onExtraCallbackWithResult(@NotNull RecursiveCoVisitor recursiveCoVisitor, @NotNull generateAesIV generateaesiv, @NotNull access13800<? super Unit> access13800Var) {
            RecursiveCoVisitor$visitChildren$1 recursiveCoVisitor$visitChildren$1;
            RecursiveCoVisitor recursiveCoVisitor2;
            Iterator it;
            Iterator it2;
            RecursiveCoVisitor recursiveCoVisitor3;
            if (access13800Var instanceof RecursiveCoVisitor$visitChildren$1) {
                recursiveCoVisitor$visitChildren$1 = (RecursiveCoVisitor$visitChildren$1) access13800Var;
                int i = recursiveCoVisitor$visitChildren$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    recursiveCoVisitor$visitChildren$1.label = i - 2147483648;
                } else {
                    recursiveCoVisitor$visitChildren$1 = new RecursiveCoVisitor$visitChildren$1(access13800Var);
                }
            }
            Object obj = recursiveCoVisitor$visitChildren$1.result;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = recursiveCoVisitor$visitChildren$1.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                recursiveCoVisitor2 = recursiveCoVisitor;
                it = generateaesiv.access000().iterator();
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it2 = (Iterator) recursiveCoVisitor$visitChildren$1.L$1;
                    recursiveCoVisitor3 = (RecursiveCoVisitor) recursiveCoVisitor$visitChildren$1.L$0;
                    ResultKt.onNavigationEvent(obj);
                    while (it2.hasNext()) {
                        generateAesIV generateaesiv2 = (generateAesIV) it2.next();
                        recursiveCoVisitor$visitChildren$1.L$0 = recursiveCoVisitor3;
                        recursiveCoVisitor$visitChildren$1.L$1 = it2;
                        recursiveCoVisitor$visitChildren$1.L$2 = null;
                        recursiveCoVisitor$visitChildren$1.label = 2;
                        if (recursiveCoVisitor3.onWarmupCompleted(generateaesiv2, recursiveCoVisitor$visitChildren$1) == objOnExtraCallback) {
                            return objOnExtraCallback;
                        }
                    }
                    return Unit.INSTANCE;
                }
                it = (Iterator) recursiveCoVisitor$visitChildren$1.L$2;
                generateaesiv = (generateAesIV) recursiveCoVisitor$visitChildren$1.L$1;
                recursiveCoVisitor2 = (RecursiveCoVisitor) recursiveCoVisitor$visitChildren$1.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            while (it.hasNext()) {
                logicIssueCertSendConf logicissuecertsendconf = (logicIssueCertSendConf) it.next();
                recursiveCoVisitor$visitChildren$1.L$0 = recursiveCoVisitor2;
                recursiveCoVisitor$visitChildren$1.L$1 = generateaesiv;
                recursiveCoVisitor$visitChildren$1.L$2 = it;
                recursiveCoVisitor$visitChildren$1.label = 1;
                if (recursiveCoVisitor2.onExtraCallback(logicissuecertsendconf, recursiveCoVisitor$visitChildren$1) == objOnExtraCallback) {
                    break;
                }
            }
            it2 = generateaesiv.getInterfaceDescriptor().iterator();
            recursiveCoVisitor3 = recursiveCoVisitor2;
            while (it2.hasNext()) {
            }
            return Unit.INSTANCE;
        }
    }
}
