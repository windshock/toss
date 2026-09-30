package ru.nsk.kstatemachine.state;

import o.access13800;
import o.getFidoInfo;
import o.logicIssueClose;
import o.logicRenewCertKur;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface RedirectPseudoState extends getFidoInfo {
    Object onExtraCallback(@NotNull logicRenewCertKur<?> logicrenewcertkur, @NotNull access13800<? super logicIssueClose> access13800Var);
}
