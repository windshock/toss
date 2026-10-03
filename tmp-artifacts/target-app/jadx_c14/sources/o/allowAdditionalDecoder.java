package o;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AUTextView;
import o.adInfo;
import o.allowAdditionalDecoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.TabBadgeInfo;
import viva.republica.toss.main.TabBadgeSyncRequest;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class allowAdditionalDecoder {
    public static final int IAuthTabCallback;
    private static final setTid<TabBadgeInfo> IAuthTabCallbackStub;
    private static final deserializeUriCollection onExtraCallback;
    private static final wie2 onWarmupCompleted;
    public static final allowAdditionalDecoder onNavigationEvent = new allowAdditionalDecoder();
    private static final AppSetIdAndScope1 onExtraCallbackWithResult = ea10.onExtraCallbackWithResult("TabBadgeDataSource");

    private allowAdditionalDecoder() {
    }

    static {
        deserializeUriCollection deserializeuricollection = new deserializeUriCollection();
        onExtraCallback = deserializeuricollection;
        onWarmupCompleted = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: viva.republica.toss.main.TabBadgeDataSource$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return allowAdditionalDecoder.onNavigationEvent((adInfo) obj);
            }
        }, 1, (Object) null);
        setTid<TabBadgeInfo> settidOnNavigationEvent = setTid.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(settidOnNavigationEvent, "");
        IAuthTabCallbackStub = settidOnNavigationEvent;
        if (settidOnNavigationEvent.onWarmupCompleted() == null) {
            writeRaw writerawOnNavigationEvent = writeRaw.onNavigationEvent(new Callable() { // from class: viva.republica.toss.main.TabBadgeDataSource$$ExternalSyntheticLambda3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return allowAdditionalDecoder.onExtraCallbackWithResult();
                }
            }).onNavigationEvent(clearTid.onExtraCallback());
            Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent, "");
            access27600.onExtraCallback(setMessageBytes.onExtraCallbackWithResult(writerawOnNavigationEvent, new Function1() { // from class: viva.republica.toss.main.TabBadgeDataSource$$ExternalSyntheticLambda4
                public final Object invoke(Object obj) {
                    return allowAdditionalDecoder.onExtraCallback((Throwable) obj);
                }
            }, new Function1() { // from class: viva.republica.toss.main.TabBadgeDataSource$$ExternalSyntheticLambda5
                public final Object invoke(Object obj) {
                    return allowAdditionalDecoder.onExtraCallbackWithResult((TabBadgeInfo) obj);
                }
            }), deserializeuricollection);
        }
        IAuthTabCallback = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(adInfo adinfo) {
        Intrinsics.checkNotNullParameter(adinfo, "");
        adinfo.IAuthTabCallbackDefault(true);
        adinfo.IAuthTabCallback(true);
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback3, 186882589, new Object[]{adinfo, true}, iOnExtraCallback2, iOnExtraCallback);
        adinfo.onExtraCallbackWithResult(true);
        return Unit.INSTANCE;
    }

    public final setTid<TabBadgeInfo> onExtraCallback() {
        return IAuthTabCallbackStub;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabBadgeInfo onExtraCallbackWithResult() {
        return onNavigationEvent.asInterface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(TabBadgeInfo tabBadgeInfo) {
        IAuthTabCallbackStub.onExtraCallback(tabBadgeInfo);
        return Unit.INSTANCE;
    }

    public static final class onWarmupCompleted<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public onWarmupCompleted(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        public final deserializeIp<TabBadgeInfo> apply(writeRaw<BaseApiResponse<TabBadgeInfo>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            final AnonymousClass2 anonymousClass2 = new Function1<BaseApiResponse<TabBadgeInfo>, deserializeIp<? extends TabBadgeInfo>>() { // from class: o.allowAdditionalDecoder.onWarmupCompleted.2
                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends TabBadgeInfo> invoke(BaseApiResponse<TabBadgeInfo> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = TabBadgeInfo.class.newInstance();
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
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass2) { // from class: o.UtilsKtExternalSyntheticLambda17$ComponentActivityExternalSyntheticLambda7
                private final /* synthetic */ Function1 onNavigationEvent;

                {
                    Intrinsics.checkNotNullParameter(anonymousClass2, "");
                    this.onNavigationEvent = anonymousClass2;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return this.onNavigationEvent.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallbackWithResult;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public final void onExtraCallbackWithResult(@Nullable String str) throws Throwable {
        TabBadgeSyncRequest tabBadgeSyncRequestOnNavigationEvent = onNavigationEvent(str);
        if (tabBadgeSyncRequestOnNavigationEvent != null) {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getScrollBarSize() >> 8)), 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 24733 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -842029757, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29426), 21 - TextUtils.lastIndexOf("", '0', 0), 24734 - View.resolveSizeAndState(0, 0, 0), -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
                }
                writeRaw<BaseApiResponse<TabBadgeInfo>> writerawOnWarmupCompleted = ((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj, null)).onWarmupCompleted(tabBadgeSyncRequestOnNavigationEvent);
                MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
                Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
                writeRaw writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new onWarmupCompleted(mapConverterOnExtraCallback, null));
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                access27600.onExtraCallback(setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback, new Function1() { // from class: viva.republica.toss.main.TabBadgeDataSource$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj2) {
                        return allowAdditionalDecoder.onExtraCallbackWithResult((Throwable) obj2);
                    }
                }, new Function1() { // from class: viva.republica.toss.main.TabBadgeDataSource$$ExternalSyntheticLambda1
                    public final Object invoke(Object obj2) {
                        return allowAdditionalDecoder.onWarmupCompleted((TabBadgeInfo) obj2);
                    }
                }), onExtraCallback);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(TabBadgeInfo tabBadgeInfo) {
        Intrinsics.checkNotNullParameter(tabBadgeInfo, "");
        onNavigationEvent.onExtraCallback(tabBadgeInfo);
        IAuthTabCallbackStub.onExtraCallback(tabBadgeInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public final void IAuthTabCallback() {
        onExtraCallbackWithResult("");
    }

    public final void IAuthTabCallback(@NotNull String str) {
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(str, "");
        TabBadgeInfo tabBadgeInfo = (TabBadgeInfo) IAuthTabCallbackStub.onWarmupCompleted();
        if (tabBadgeInfo == null) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(tabBadgeInfo.size()));
            Iterator<T> it = tabBadgeInfo.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), Boolean.valueOf(Intrinsics.areEqual(entry.getKey(), str) ? false : ((Boolean) entry.getValue()).booleanValue()));
            }
        }
        TabBadgeInfo tabBadgeInfo2 = new TabBadgeInfo(linkedHashMap);
        if (Intrinsics.areEqual(tabBadgeInfo, tabBadgeInfo2)) {
            return;
        }
        onExtraCallback(tabBadgeInfo2);
        IAuthTabCallbackStub.onExtraCallback(tabBadgeInfo2);
    }

    private final TabBadgeInfo asInterface() {
        Object obj;
        TabBadgeInfo tabBadgeInfo;
        try {
            Result.Companion companion = Result.Companion;
            String strOnExtraCallbackWithResult = addPolicy.getSmallIconBitmap().onExtraCallbackWithResult("tabRedDotBadgeInfo", "");
            if (!StringsKt.isBlank(strOnExtraCallbackWithResult)) {
                tabBadgeInfo = (TabBadgeInfo) onWarmupCompleted.onExtraCallback(TabBadgeInfo.Companion.serializer(), strOnExtraCallbackWithResult);
            } else {
                tabBadgeInfo = new TabBadgeInfo();
            }
            obj = Result.constructor-impl(tabBadgeInfo);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        TabBadgeInfo tabBadgeInfo2 = new TabBadgeInfo();
        if (Result.onExtraCallback(obj)) {
            obj = tabBadgeInfo2;
        }
        return (TabBadgeInfo) obj;
    }

    private final void onExtraCallback(TabBadgeInfo tabBadgeInfo) {
        TextRoundCornerProgressBarSavedState1 smallIconBitmap = addPolicy.getSmallIconBitmap();
        wie2 wie2Var = onWarmupCompleted;
        wie2Var.onExtraCallback();
        smallIconBitmap.onNavigationEvent("tabRedDotBadgeInfo", wie2Var.onWarmupCompleted(TabBadgeInfo.Companion.serializer(), tabBadgeInfo));
    }

    private final TabBadgeSyncRequest onNavigationEvent(String str) {
        List listSplit$default;
        if (str != null && StringsKt.isBlank(str)) {
            return new TabBadgeSyncRequest((List) null, 1, (DefaultConstructorMarker) null);
        }
        if (str == null || (listSplit$default = StringsKt.split$default(str, new String[]{","}, false, 0, 6, (Object) null)) == null || !(!listSplit$default.isEmpty())) {
            return null;
        }
        return new TabBadgeSyncRequest(StringsKt.split$default(str, new String[]{","}, false, 0, 6, (Object) null));
    }

    public final void onWarmupCompleted() {
        onExtraCallback.onExtraCallbackWithResult();
    }
}
