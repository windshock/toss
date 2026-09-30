package com.alibaba.ariver.kernel.api.singlePage;

import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;
import java.util.Map;

@DefaultImpl("com.alipay.mobile.nebulax.integration.base.singlepage.SinglePageManagerImpl")
/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface SinglePageManager extends Proxiable {
    void exitPage(String str);

    SingleViewContainer findSingleViewByToken(String str);

    Map<String, SingleViewContainer> getSingleViewMap();

    void pushPage(SingleViewContainer singleViewContainer);
}
