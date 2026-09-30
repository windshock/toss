package com.iap.ac.android.common.container.model;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.a.a;
import com.iap.ac.android.common.container.constant.StartMethod;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ContainerParams {
    public String appId;
    public Bundle containerBundle;
    public String postParams;
    public StartMethod startMethod = StartMethod.GET;
    public String url;

    public ContainerParams(@NonNull String str) {
        this.url = str;
    }

    public static ContainerParams createForMniProgram(@NonNull String str) {
        ContainerParams containerParams = new ContainerParams("");
        containerParams.appId = str;
        return containerParams;
    }

    public String toString() {
        StringBuilder sbA = a.a("ContainerParams{appId='");
        sbA.append(this.appId);
        sbA.append('\'');
        sbA.append(", containerBundle=");
        sbA.append(this.containerBundle);
        sbA.append(", postParams='");
        sbA.append(this.postParams);
        sbA.append('\'');
        sbA.append(", startMethod=");
        sbA.append(this.startMethod);
        sbA.append(", url='");
        sbA.append(this.url);
        sbA.append('\'');
        sbA.append('}');
        return sbA.toString();
    }
}
