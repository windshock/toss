package o;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ASN1SequenceParser {
    private final TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult IAuthTabCallback;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;

    public ASN1SequenceParser(@NotNull String str, @NotNull String str2, @NotNull TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.onExtraCallbackWithResult = str;
        this.onExtraCallback = str2;
        this.IAuthTabCallback = onextracallbackwithresult;
    }

    public final writeRaw<setDescriptionTextColor> onNavigationEvent() throws Throwable {
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - ((Process.getThreadPriority(0) + 20) >> 6)), Color.argb(0, 0, 0, 0) + 22, 24734 - ExpandableListView.getPackedPositionType(0L), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1971988338);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 29426), 21 - TextUtils.lastIndexOf("", '0'), 24734 - (ViewConfiguration.getTapTimeout() >> 16), -1154144738, false, "access000", new Class[0]);
            }
            writeRaw<BaseApiResponse<setDescriptionTextColor>> writerawOnNavigationEvent = ((getMediaViewVideoRendererApi) ((Method) objOnExtraCallback2).invoke(obj, null)).onNavigationEvent(this.onExtraCallbackWithResult, this.onExtraCallback, this.IAuthTabCallback.name());
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw<setDescriptionTextColor> writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new onExtraCallbackWithResult(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static final class onExtraCallbackWithResult<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onExtraCallbackWithResult(MapConverter mapConverter, MapConverter mapConverter2) {
            this.IAuthTabCallback = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<setDescriptionTextColor> apply(writeRaw<BaseApiResponse<setDescriptionTextColor>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            final AnonymousClass5 anonymousClass5 = new Function1<BaseApiResponse<setDescriptionTextColor>, deserializeIp<? extends setDescriptionTextColor>>() { // from class: o.ASN1SequenceParser.onExtraCallbackWithResult.5
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends setDescriptionTextColor> invoke(BaseApiResponse<setDescriptionTextColor> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = setDescriptionTextColor.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass5) { // from class: o.UtilsKtExternalSyntheticLambda17$onCreatePanelMenu
                private final /* synthetic */ Function1 onWarmupCompleted;

                {
                    Intrinsics.checkNotNullParameter(anonymousClass5, "");
                    this.onWarmupCompleted = anonymousClass5;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return this.onWarmupCompleted.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.IAuthTabCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onWarmupCompleted;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }
}
