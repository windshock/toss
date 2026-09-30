package com.alibaba.ariver.resource.api.prepare;

import androidx.annotation.NonNull;
import com.alibaba.ariver.resource.api.models.AppModel;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface PrepareController {
    void finish();

    Status getStatus();

    void lock(Object obj);

    void moveToError(PrepareException prepareException);

    void moveToNext();

    void onGetAppInfo(@NonNull AppModel appModel);

    void postTimeOut(long j);

    void setInterceptors(@NonNull List<StepInterceptor> list);

    void start();

    void unlock(Object obj);
}
