package com.tnkfactory.ad.style;

import com.tnkfactory.ad.TnkContext;
import com.tnkfactory.ad.basic.ITnkSection;
import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.data.view.AdListCuration;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.clearRegisters;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ITnkOffAdCuration extends ITnkSection {
    public AdEventHandler adEventHandler;
    public List<? extends AdListVo> arrAdItem;
    public AdListCuration curation;
    public TnkContext tnkContext;

    public final AdEventHandler getAdEventHandler() {
        AdEventHandler adEventHandler = this.adEventHandler;
        if (adEventHandler != null) {
            return adEventHandler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final List<AdListVo> getArrAdItem() {
        List list = this.arrAdItem;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final AdListCuration getCuration() {
        AdListCuration adListCuration = this.curation;
        if (adListCuration != null) {
            return adListCuration;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final TnkContext getTnkContext() {
        TnkContext tnkContext = this.tnkContext;
        if (tnkContext != null) {
            return tnkContext;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public ITnkOffAdItem makeViewItem(@NotNull TnkContext tnkContext, @NotNull AdListVo adListVo) throws IllegalAccessException, InstantiationException {
        Intrinsics.checkNotNullParameter(tnkContext, "");
        Intrinsics.checkNotNullParameter(adListVo, "");
        Object objNewInstance = clearRegisters.onNavigationEvent(getCuration().getLayoutInfo().getViewClass()).newInstance();
        ITnkOffAdItem iTnkOffAdItem = (ITnkOffAdItem) objNewInstance;
        iTnkOffAdItem.onItemInit(tnkContext, adListVo);
        Intrinsics.checkNotNullExpressionValue(objNewInstance, "");
        return iTnkOffAdItem;
    }

    public void onCreateCuration(@NotNull TnkContext tnkContext, @NotNull AdListCuration adListCuration, @NotNull List<? extends AdListVo> list) {
        Intrinsics.checkNotNullParameter(tnkContext, "");
        Intrinsics.checkNotNullParameter(adListCuration, "");
        Intrinsics.checkNotNullParameter(list, "");
        setArrAdItem(list);
        setAdEventHandler(tnkContext.getEventHandler());
        setCuration(adListCuration);
        setTnkContext(tnkContext);
    }

    public final void setAdEventHandler(@NotNull AdEventHandler adEventHandler) {
        Intrinsics.checkNotNullParameter(adEventHandler, "");
        this.adEventHandler = adEventHandler;
    }

    public final void setArrAdItem(@NotNull List<? extends AdListVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.arrAdItem = list;
    }

    public final void setCuration(@NotNull AdListCuration adListCuration) {
        Intrinsics.checkNotNullParameter(adListCuration, "");
        this.curation = adListCuration;
    }

    public final void setTnkContext(@NotNull TnkContext tnkContext) {
        Intrinsics.checkNotNullParameter(tnkContext, "");
        this.tnkContext = tnkContext;
    }
}
