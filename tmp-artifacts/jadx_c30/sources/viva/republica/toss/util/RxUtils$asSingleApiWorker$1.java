package viva.republica.toss.util;

import im.toss.network.model.BaseApiResponse;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.MapConverter;
import o.deserializeIp;
import o.deserializeUri;
import o.writeRaw;
import viva.republica.toss.util.RxUtils;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RxUtils$asSingleApiWorker$1<Upstream, Downstream> implements deserializeUri {
    final /* synthetic */ MapConverter IAuthTabCallback;
    final /* synthetic */ MapConverter onWarmupCompleted;

    public final deserializeIp<T> apply(writeRaw<BaseApiResponse<T>> writeraw) {
        Intrinsics.checkNotNullParameter(writeraw, BuildConfig.FLAVOR);
        Intrinsics.needClassReification();
        writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new RxUtils.sam.i.io_reactivex_functions_Function.0(RxUtils$asSingleApiWorker$1$transform$1.onExtraCallbackWithResult));
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, BuildConfig.FLAVOR);
        MapConverter mapConverter = this.IAuthTabCallback;
        if (mapConverter != null) {
            writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, BuildConfig.FLAVOR);
        }
        MapConverter mapConverter2 = this.onWarmupCompleted;
        if (mapConverter2 == null) {
            return writerawOnExtraCallbackWithResult;
        }
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, BuildConfig.FLAVOR);
        return writerawIAuthTabCallback;
    }
}
