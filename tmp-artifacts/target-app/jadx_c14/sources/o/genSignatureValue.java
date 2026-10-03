package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.genSignatureValue;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class genSignatureValue {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static char onExtraCallback = 0;
    public static final genSignatureValue onExtraCallbackWithResult;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        onExtraCallbackWithResult();
        onExtraCallbackWithResult = new genSignatureValue();
        int i = IAuthTabCallbackStub + 5;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 10 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(List list) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(list);
        }
        IAuthTabCallback(list);
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, obj);
        int i4 = onWarmupCompleted + 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private genSignatureValue() {
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onWarmupCompleted + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNull(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = null;
            if (!it.hasNext()) {
                PageShowPoint.IAuthTabCallback(PageShowPoint.Companion, arrayList, false, 2, (Object) null);
                return Unit.INSTANCE;
            }
            int i2 = onWarmupCompleted + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            signEX signex = (signEX) it.next();
            TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted = PageShowPoint.Companion.onWarmupCompleted(signex.onExtraCallbackWithResult());
            if (tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted != null) {
                int i4 = onNavigationEvent + 57;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted.IAuthTabCallback(signex.IAuthTabCallback());
                    tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted.onWarmupCompleted(signex.onNavigationEvent());
                    tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted.onWarmupCompleted(zzaj.onWarmupCompleted().IAuthTabCallbackDefault());
                    throw null;
                }
                tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted.IAuthTabCallback(signex.IAuthTabCallback());
                tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted.onWarmupCompleted(signex.onNavigationEvent());
                tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted.onWarmupCompleted(zzaj.onWarmupCompleted().IAuthTabCallbackDefault());
                tabBarInfoQueryPointOnTabBarInfoQueryListener = tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted;
            }
            if (tabBarInfoQueryPointOnTabBarInfoQueryListener != null) {
                arrayList.add(tabBarInfoQueryPointOnTabBarInfoQueryListener);
            }
        }
    }

    public final writeRaw<List<signEX>> onNavigationEvent(@NotNull List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            Object[] objArr = new Object[1];
            a(new char[]{1, 2, 0, '\t', 5, 7, 14, 6, '\r', 7, 3, 14, 15, 14, 6, 11, 13918}, (byte) (123 - (Process.myPid() >> 22)), ExpandableListView.getPackedPositionGroup(0L) + 17, objArr);
            writeRaw<List<signEX>> writerawOnExtraCallbackWithResult = writeRaw.onExtraCallbackWithResult(new IllegalArgumentException(((String) objArr[0]).intern()));
            Intrinsics.checkNotNull(writerawOnExtraCallbackWithResult);
            return writerawOnExtraCallbackWithResult;
        }
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - Color.alpha(0)), 22 - View.resolveSize(0, 0), 24733 - TextUtils.indexOf((CharSequence) "", '0'), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-745626470);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 29426), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22, Color.red(0) + 24734, -489793014, false, "IAuthTabCallbackDefault", new Class[0]);
            }
            FullScreenAd fullScreenAd = (FullScreenAd) ((Method) objOnExtraCallback2).invoke(obj, null);
            List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                int i4 = onWarmupCompleted + 117;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(((TabBarInfoQueryPointOnTabBarInfoQueryListener) it.next()).onExtraCallbackWithResult());
                int i6 = onWarmupCompleted + 119;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            writeRaw<BaseApiResponse<List<signEX>>> writerawOnExtraCallback = fullScreenAd.onExtraCallback(new Signature(arrayList));
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallback.IAuthTabCallback(new onExtraCallback(mapConverterOnExtraCallback, null));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.dataprovider.mydata.MydataAccountHelper$$ExternalSyntheticLambda0
                public final Object invoke(Object obj2) {
                    return genSignatureValue.onExtraCallbackWithResult((List) obj2);
                }
            };
            writeRaw<List<signEX>> writerawOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.dataprovider.mydata.MydataAccountHelper$$ExternalSyntheticLambda1
                public final void accept(Object obj2) {
                    genSignatureValue.onExtraCallbackWithResult(function1, obj2);
                }
            });
            Intrinsics.checkNotNull(writerawOnNavigationEvent);
            return writerawOnNavigationEvent;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final Object onNavigationEvent(@NotNull List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list, @NotNull access13800<? super List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onWarmupCompleted(list, null), access13800Var);
        int i2 = onWarmupCompleted + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    public static final class onExtraCallback<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public onExtraCallback(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.IAuthTabCallback = mapConverter2;
        }

        public final deserializeIp<List<? extends signEX>> apply(writeRaw<BaseApiResponse<List<? extends signEX>>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            final AnonymousClass2 anonymousClass2 = new Function1<BaseApiResponse<List<? extends signEX>>, deserializeIp<? extends List<? extends signEX>>>() { // from class: o.genSignatureValue.onExtraCallback.2
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends List<? extends signEX>> invoke(BaseApiResponse<List<? extends signEX>> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = List.class.newInstance();
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
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass2) { // from class: o.UtilsKtExternalSyntheticLambda17$reportFullyDrawn
                private final /* synthetic */ Function1 onExtraCallbackWithResult;

                {
                    Intrinsics.checkNotNullParameter(anonymousClass2, "");
                    this.onExtraCallbackWithResult = anonymousClass2;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return this.onExtraCallbackWithResult.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallbackWithResult;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.IAuthTabCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ List<TabBarInfoQueryPointOnTabBarInfoQueryListener> $accounts;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        private static char[] IAuthTabCallback = {32767, 32761, 32758, 32698, 32750, 32747, 32691, 32744, 32765, 32751, 32749, 32757, 32760, 32764, 32753, 32756, 32748, 32759, 32739, 32754, 32693, 32737, 32746, 32692, 32726, 32678, 32766, 32725, 32728, 32712, 32676};
        private static int onNavigationEvent = -1184333926;
        private static boolean onExtraCallback = true;
        private static boolean onWarmupCompleted = true;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$accounts = list;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 71;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$accounts, access13800Var);
            int i2 = IAuthTabCallbackDefault + 119;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            IAuthTabCallbackDefault = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = 80 / 0;
            return objIAuthTabCallback;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            Object objOnWarmupCompleted;
            BaseApiResponse baseApiResponse;
            List<signEX> list;
            Object objOnTransact;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
            int i4 = this.label;
            try {
                if (i4 != 0) {
                    int i5 = onExtraCallbackWithResult;
                    int i6 = i5 + 41;
                    IAuthTabCallbackDefault = i6 % 128;
                    int i7 = i6 % 2;
                    if (i4 != 1) {
                        Object[] objArr = new Object[1];
                        a(null, null, new byte[]{-119, -112, -113, -123, -117, -122, -120, -122, -127, -124, -108, -123, -113, -109, -124, -121, -119, -110, -122, -111, -112, -113, -121, -124, -119, -120, -122, -114, -119, -115, -124, -121, -119, -116, -117, -118, -119, -120, -121, -124, -122, -123, -124, -125, -125, -126, -127}, KeyEvent.normalizeMetaState(0) + 127, objArr);
                        throw new IllegalStateException(((String) objArr[0]).intern());
                    }
                    int i8 = i5 + 47;
                    IAuthTabCallbackDefault = i8 % 128;
                    int i9 = i8 % 2;
                    ResultKt.onNavigationEvent(obj);
                    objOnWarmupCompleted = obj;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    List<TabBarInfoQueryPointOnTabBarInfoQueryListener> list2 = this.$accounts;
                    Result.Companion companion = Result.Companion;
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 29427), 22 - TextUtils.getOffsetAfter("", 0), 24734 - (ViewConfiguration.getPressedStateDuration() >> 16), -842029757, false, "onWarmupCompleted", (Class[]) null);
                    }
                    Object obj3 = ((Field) objOnExtraCallback).get(null);
                    try {
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-745626470);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 29426), 22 - TextUtils.indexOf("", "", 0), 24734 - KeyEvent.getDeadChar(0, 0), -489793014, false, "IAuthTabCallbackDefault", new Class[0]);
                        }
                        FullScreenAd fullScreenAd = (FullScreenAd) ((Method) objOnExtraCallback2).invoke(obj3, null);
                        List<TabBarInfoQueryPointOnTabBarInfoQueryListener> list3 = list2;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                        Iterator<T> it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((TabBarInfoQueryPointOnTabBarInfoQueryListener) it.next()).onExtraCallbackWithResult());
                        }
                        writeRaw<BaseApiResponse<List<signEX>>> writerawOnExtraCallback = fullScreenAd.onExtraCallback(new Signature(arrayList));
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.label = 1;
                        objOnWarmupCompleted = RxAwaitKt.onWarmupCompleted(writerawOnExtraCallback, this);
                        if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                            return objOnWarmupCompleted2;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                Intrinsics.checkNotNullExpressionValue(objOnWarmupCompleted, "");
                baseApiResponse = (BaseApiResponse) objOnWarmupCompleted;
            } catch (Exception e) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (WebResourceResponseModel e2) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (CancellationException e3) {
                throw e3;
            }
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult != null) {
                    throw apiErrorExtraCallbackWithResult;
                }
                int i10 = onExtraCallbackWithResult + 81;
                IAuthTabCallbackDefault = i10 % 128;
                if (i10 % 2 != 0) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                int i11 = 80 / 0;
                throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
            }
            try {
                objOnTransact = baseApiResponse.onTransact();
            } catch (NullPointerException e4) {
                if ((!Intrinsics.areEqual(List.class, Object.class)) && !Intrinsics.areEqual(List.class, Unit.class)) {
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e4);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
                list = Unit.INSTANCE;
            }
            if (objOnTransact == null) {
                Object[] objArr2 = new Object[1];
                a(null, null, new byte[]{-97, -119, -118, -112, -122, -105, -118, -119, -98, -119, -127, -112, -126, -125, -126, -99, -126, -123, -126, -101, -106, -100, -104, -126, -123, -126, -101, -106, -116, -104, -120, -119, -101, -113, -111, -122, -120, -105, -126, -123, -126, -101, -104, -118, -118, -122, -123, -104, -126, -127, -113, -125, -115, -117, -105, -119, -120, -104, -126, -111, -113, -111, -102, -123, -118, -113, -103, -104, -118, -112, -122, -113, -123, -127, -119, -125, -125, -122, -127, -104, -112, -113, -125, -123, -122, -110, -124, -119, -105, -106, -123, -124, -125, -125, -117, -112, -107, -112, -122, -112, -124, -122, -123, -124, -123, -118, -126, -127, -124, -119, -115, -124, -123, -122, -112, -112, -126, -127, -124, -125, -125, -117, -112}, (-16777089) - Color.rgb(0, 0, 0), objArr2);
                throw new NullPointerException(((String) objArr2[0]).intern());
            }
            int i12 = IAuthTabCallbackDefault + 91;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 != 0) {
                list = (List) objOnTransact;
                int i13 = 18 / 0;
            } else {
                list = (List) objOnTransact;
            }
            ArrayList arrayList2 = new ArrayList();
            for (signEX signex : list) {
                TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted = PageShowPoint.Companion.onWarmupCompleted(signex.onExtraCallbackWithResult());
                if (tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted != null) {
                    tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted.IAuthTabCallback(signex.IAuthTabCallback());
                    tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted.onWarmupCompleted(signex.onNavigationEvent());
                    tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted.onWarmupCompleted(zzaj.onWarmupCompleted().IAuthTabCallbackDefault());
                } else {
                    tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted = null;
                }
                if (tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted != null) {
                    arrayList2.add(tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted);
                }
            }
            PageShowPoint.IAuthTabCallback(PageShowPoint.Companion, arrayList2, false, 2, (Object) null);
            obj2 = Result.constructor-impl(arrayList2);
            return Result.exceptionOrNull-impl(obj2) != null ? CollectionsKt.emptyList() : obj2;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = IAuthTabCallback;
            long j = 0;
            if (cArr2 != null) {
                int i4 = $11 + 33;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getTapTimeout() >> 16) + 77, (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 20951, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6++;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), KeyEvent.keyCodeFromString("") + 75, 16037 - (ViewConfiguration.getTapTimeout() >> 16), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (onWarmupCompleted) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 64 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onExtraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i7 = $11 + 67;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] / iIntValue);
                        i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted % 1;
                    } else {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                    }
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i8 = $10 + 33;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 64, 12214 - TextUtils.getOffsetAfter("", 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallback;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $10 + 109;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 26 - View.combineMeasuredStates(0, 0), (-16754077) - Color.rgb(0, 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), TextUtils.getCapsMode("", 0, 0) + 26, TextUtils.getOffsetAfter("", 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i7 = $10 + 95;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - View.resolveSize(0, 0)), 74 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i9 = $10 + 91;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), 30 - (ViewConfiguration.getPressedStateDuration() >> 16), (-16757728) - Color.rgb(0, 0, 0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i12 = $11 + 115;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        } else {
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                int i18 = $10 + 27;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    int i19 = 3 % 4;
                }
                obj2 = obj;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = new char[]{64978, 64976, 64960, 64981, 64966, 64986, 64989, 64963, 64988, 64970, 64967, 64983, 64980, 64990, 64982, 64915};
        onExtraCallback = (char) 51245;
    }
}
