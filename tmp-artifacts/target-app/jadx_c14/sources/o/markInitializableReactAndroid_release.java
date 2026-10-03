package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.getPackageType;
import o.markInitializableReactAndroid_release;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerRequest;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferDeleteParam;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferListResponse;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel;
import viva.republica.toss.network.model.transfer.periodic.TossBankSummary;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class markInitializableReactAndroid_release extends isTestMode {
    private final getCornerRadius<Boolean> IAuthTabCallback;
    private final getCornerRadius<List<IAuthTabCallback_Parcel>> IAuthTabCallbackDefault;
    private final getCornerRadius<List<PeriodicTransferModel>> IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private final getTileModeX<IAuthTabCallback> IAuthTabCallback_Parcel;
    private getPackageType ICustomTabsCallback;
    private final Set<String> access000;
    private final boolean access100;
    private final getCornerRadius<TossBankSummary> asBinder;
    private final getCornerRadius<onExtraCallbackWithResult> asInterface;
    private final H5TinyPopMenu getInterfaceDescriptor;
    private final getBorderRadius<IAuthTabCallback> onExtraCallback;
    private final getCornerRadius<Set<String>> onExtraCallbackWithResult;
    private final getCornerRadius<Boolean> onNavigationEvent;
    private final getCornerRadius<PeriodicTransferBannerResponse.Recommendations> onTransact;
    private final getCornerRadius<KeyBoardVisiblePoint> onWarmupCompleted;
    private final setRubIn<access000> readTypedObject;
    private boolean writeTypedObject;

    public interface IAuthTabCallbackStubProxy extends IAuthTabCallback_Parcel {
    }

    public interface IAuthTabCallback_Parcel {
    }

    public markInitializableReactAndroid_release(@NotNull H5TinyPopMenu h5TinyPopMenu, @NotNull Set<String> set, boolean z) {
        Intrinsics.checkNotNullParameter(h5TinyPopMenu, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.getInterfaceDescriptor = h5TinyPopMenu;
        this.access100 = z;
        getCornerRadius<List<IAuthTabCallback_Parcel>> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(CollectionsKt.emptyList());
        this.IAuthTabCallbackDefault = getcornerradiusOnNavigationEvent;
        getCornerRadius<List<PeriodicTransferModel>> getcornerradiusOnNavigationEvent2 = setShine.onNavigationEvent((Object) null);
        this.IAuthTabCallbackStub = getcornerradiusOnNavigationEvent2;
        getCornerRadius<KeyBoardVisiblePoint> getcornerradiusOnNavigationEvent3 = setShine.onNavigationEvent((Object) null);
        this.onWarmupCompleted = getcornerradiusOnNavigationEvent3;
        this.asInterface = setShine.onNavigationEvent((Object) null);
        this.onTransact = setShine.onNavigationEvent((Object) null);
        Boolean bool = Boolean.FALSE;
        getCornerRadius<Boolean> getcornerradiusOnNavigationEvent4 = setShine.onNavigationEvent(bool);
        this.onNavigationEvent = getcornerradiusOnNavigationEvent4;
        this.asBinder = setShine.onNavigationEvent((Object) null);
        getCornerRadius<Set<String>> getcornerradiusOnNavigationEvent5 = setShine.onNavigationEvent(clearFaultAdjacentMetadata.onExtraCallback());
        this.onExtraCallbackWithResult = getcornerradiusOnNavigationEvent5;
        getCornerRadius<Boolean> getcornerradiusOnNavigationEvent6 = setShine.onNavigationEvent(bool);
        this.IAuthTabCallback = getcornerradiusOnNavigationEvent6;
        getBorderRadius<IAuthTabCallback> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 1, (CloseableUtils) null, 5, (Object) null);
        this.onExtraCallback = getborderradiusOnWarmupCompleted;
        this.IAuthTabCallback_Parcel = ycxycx.onExtraCallbackWithResult(getborderradiusOnWarmupCompleted);
        this.readTypedObject = ycxycx.IAuthTabCallback(ycxycx.onWarmupCompleted(ycxycx.onWarmupCompleted(getcornerradiusOnNavigationEvent, getcornerradiusOnNavigationEvent2, getcornerradiusOnNavigationEvent3, getcornerradiusOnNavigationEvent4, getcornerradiusOnNavigationEvent5, new onPostMessage(null)), getcornerradiusOnNavigationEvent6, new onMinimized(null)), ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), getTileModeY.Companion.onNavigationEvent(), new access000(null, null, null, false, null, false, 63, null));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.access000 = linkedHashSet;
        CollectionsKt.addAll(linkedHashSet, set);
        this.IAuthTabCallbackStubProxy = z;
        IAuthTabCallbackDefault();
        asBinder();
        onExtraCallbackWithResult(true, (Collection<String>) set);
    }

    public final getTileModeX<IAuthTabCallback> onExtraCallback() {
        return this.IAuthTabCallback_Parcel;
    }

    public final setRubIn<access000> onWarmupCompleted() {
        return this.readTypedObject;
    }

    static final class onPostMessage extends SuspendLambda implements setPacEnabledKeys<List<? extends IAuthTabCallback_Parcel>, List<? extends PeriodicTransferModel>, KeyBoardVisiblePoint, Boolean, Set<? extends String>, access13800<? super access000>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ Object L$3;
        /* synthetic */ boolean Z$0;
        int label;

        onPostMessage(access13800<? super onPostMessage> access13800Var) {
            super(6, access13800Var);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            return onExtraCallback((List) obj, (List) obj2, (KeyBoardVisiblePoint) obj3, ((Boolean) obj4).booleanValue(), (Set) obj5, (access13800) obj6);
        }

        public final Object onExtraCallback(List<? extends IAuthTabCallback_Parcel> list, List<PeriodicTransferModel> list2, KeyBoardVisiblePoint keyBoardVisiblePoint, boolean z, Set<String> set, access13800<? super access000> access13800Var) {
            onPostMessage onpostmessage = new onPostMessage(access13800Var);
            onpostmessage.L$0 = list;
            onpostmessage.L$1 = list2;
            onpostmessage.L$2 = keyBoardVisiblePoint;
            onpostmessage.Z$0 = z;
            onpostmessage.L$3 = set;
            return onpostmessage.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            List list2 = (List) this.L$1;
            KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) this.L$2;
            boolean z = this.Z$0;
            Set set = (Set) this.L$3;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return new access000(list, list2, keyBoardVisiblePoint, z, set, false, 32, null);
        }
    }

    static final class onMinimized extends SuspendLambda implements getBacktraceNote<access000, Boolean, access13800<? super access000>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        onMinimized(access13800<? super onMinimized> access13800Var) {
            super(3, access13800Var);
        }

        public final Object IAuthTabCallback(access000 access000Var, boolean z, access13800<? super access000> access13800Var) {
            onMinimized onminimized = new onMinimized(access13800Var);
            onminimized.L$0 = access000Var;
            onminimized.Z$0 = z;
            return onminimized.invokeSuspend(Unit.INSTANCE);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return IAuthTabCallback((access000) obj, ((Boolean) obj2).booleanValue(), (access13800) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            access000 access000Var = (access000) this.L$0;
            boolean z = this.Z$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return access000.onExtraCallback(access000Var, null, null, null, false, null, z, 31, null);
        }
    }

    public final String onExtraCallbackWithResult(@NotNull Context context) {
        String strOnNavigationEvent;
        Intrinsics.checkNotNullParameter(context, "");
        KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) this.onWarmupCompleted.IAuthTabCallback();
        if (keyBoardVisiblePoint != null && (strOnNavigationEvent = issueCertV3.onNavigationEvent(keyBoardVisiblePoint)) != null) {
            return strOnNavigationEvent;
        }
        String string = context.getString(R.string.transfer_history);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    static final class ICustomTabsCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        ICustomTabsCallback(access13800<? super ICustomTabsCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return markInitializableReactAndroid_release.this.new ICustomTabsCallback(access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public static final class onWarmupCompleted implements IAnimation<String> {
            final /* synthetic */ IAnimation onExtraCallback;
            final /* synthetic */ markInitializableReactAndroid_release onWarmupCompleted;

            public onWarmupCompleted(IAnimation iAnimation, markInitializableReactAndroid_release markinitializablereactandroid_release) {
                this.onExtraCallback = iAnimation;
                this.onWarmupCompleted = markinitializablereactandroid_release;
            }

            public Object collect(setRipple setripple, access13800 access13800Var) {
                Object objCollect = this.onExtraCallback.collect(new AnonymousClass2(setripple, this.onWarmupCompleted), access13800Var);
                return objCollect == access14300.onWarmupCompleted() ? objCollect : Unit.INSTANCE;
            }

            /* renamed from: o.markInitializableReactAndroid_release$ICustomTabsCallback$onWarmupCompleted$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements setRipple {
                final /* synthetic */ setRipple IAuthTabCallback;
                final /* synthetic */ markInitializableReactAndroid_release onNavigationEvent;

                /* renamed from: o.markInitializableReactAndroid_release$ICustomTabsCallback$onWarmupCompleted$2$2, reason: invalid class name and collision with other inner class name */
                public static final class C00142 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public C00142(access13800 access13800Var) {
                        super(access13800Var);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(setRipple setripple, markInitializableReactAndroid_release markinitializablereactandroid_release) {
                    this.IAuthTabCallback = setripple;
                    this.onNavigationEvent = markinitializablereactandroid_release;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, o.access13800 r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof o.markInitializableReactAndroid_release.ICustomTabsCallback.onWarmupCompleted.AnonymousClass2.C00142
                        if (r0 == 0) goto L13
                        r0 = r7
                        o.markInitializableReactAndroid_release$ICustomTabsCallback$onWarmupCompleted$2$2 r0 = (o.markInitializableReactAndroid_release.ICustomTabsCallback.onWarmupCompleted.AnonymousClass2.C00142) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 + r2
                        r0.label = r1
                        goto L18
                    L13:
                        o.markInitializableReactAndroid_release$ICustomTabsCallback$onWarmupCompleted$2$2 r0 = new o.markInitializableReactAndroid_release$ICustomTabsCallback$onWarmupCompleted$2$2
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = o.access14300.onWarmupCompleted()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r6 = r0.L$3
                        o.setRipple r6 = (o.setRipple) r6
                        java.lang.Object r6 = r0.L$1
                        o.markInitializableReactAndroid_release$ICustomTabsCallback$onWarmupCompleted$2$2 r6 = (o.markInitializableReactAndroid_release.ICustomTabsCallback.onWarmupCompleted.AnonymousClass2.C00142) r6
                        kotlin.ResultKt.onNavigationEvent(r7)
                        goto L6b
                    L31:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L39:
                        kotlin.ResultKt.onNavigationEvent(r7)
                        o.setRipple r7 = r5.IAuthTabCallback
                        r2 = r6
                        o.KeyBoardVisiblePoint r2 = (o.KeyBoardVisiblePoint) r2
                        o.markInitializableReactAndroid_release r4 = r5.onNavigationEvent
                        java.lang.String r2 = o.markInitializableReactAndroid_release.IAuthTabCallback(r4, r2)
                        java.lang.Object r4 = o.access15400.onNavigationEvent(r6)
                        r0.L$0 = r4
                        java.lang.Object r4 = o.access15400.onNavigationEvent(r0)
                        r0.L$1 = r4
                        java.lang.Object r6 = o.access15400.onNavigationEvent(r6)
                        r0.L$2 = r6
                        java.lang.Object r6 = o.access15400.onNavigationEvent(r7)
                        r0.L$3 = r6
                        r6 = 0
                        r0.I$0 = r6
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L6b
                        return r1
                    L6b:
                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.markInitializableReactAndroid_release.ICustomTabsCallback.onWarmupCompleted.AnonymousClass2.emit(java.lang.Object, o.access13800):java.lang.Object");
                }
            }
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                IAnimation iAnimationOnNavigationEvent = ycxycx.onNavigationEvent(new onWarmupCompleted(markInitializableReactAndroid_release.this.onWarmupCompleted, markInitializableReactAndroid_release.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(markInitializableReactAndroid_release.this, null);
                this.label = 1;
                if (ycxycx.onWarmupCompleted(iAnimationOnNavigationEvent, anonymousClass2, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: o.markInitializableReactAndroid_release$ICustomTabsCallback$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<String, access13800<? super Unit>, Object> {
            Object L$0;
            int label;
            final /* synthetic */ markInitializableReactAndroid_release this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(markInitializableReactAndroid_release markinitializablereactandroid_release, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.this$0 = markinitializablereactandroid_release;
            }

            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, access13800<? super Unit> access13800Var) {
                return create(str, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new AnonymousClass2(this.this$0, access13800Var);
            }

            public final Object invokeSuspend(Object obj) {
                PeriodicTransferBannerResponse.Banner bannerOnNavigationEvent;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) this.this$0.onWarmupCompleted.IAuthTabCallback();
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onNavigationEvent onnavigationevent = new onNavigationEvent(keyBoardVisiblePoint, null);
                    this.L$0 = access15400.onNavigationEvent(keyBoardVisiblePoint);
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onnavigationevent, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                PeriodicTransferBannerResponse periodicTransferBannerResponse = (PeriodicTransferBannerResponse) obj;
                this.this$0.asInterface.onWarmupCompleted((periodicTransferBannerResponse == null || (bannerOnNavigationEvent = periodicTransferBannerResponse.onNavigationEvent()) == null) ? null : new onExtraCallbackWithResult("top_banner", bannerOnNavigationEvent));
                this.this$0.onTransact.onWarmupCompleted(periodicTransferBannerResponse != null ? periodicTransferBannerResponse.onWarmupCompleted() : null);
                return Unit.INSTANCE;
            }

            /* renamed from: o.markInitializableReactAndroid_release$ICustomTabsCallback$2$onNavigationEvent */
            static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super PeriodicTransferBannerResponse>, Object> {
                final /* synthetic */ KeyBoardVisiblePoint $account;
                int I$0;
                int I$1;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                onNavigationEvent(KeyBoardVisiblePoint keyBoardVisiblePoint, access13800<? super onNavigationEvent> access13800Var) {
                    super(2, access13800Var);
                    this.$account = keyBoardVisiblePoint;
                }

                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public final Object invoke(findResAndMsg findresandmsg, access13800<? super PeriodicTransferBannerResponse> access13800Var) {
                    return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    return new onNavigationEvent(this.$account, access13800Var);
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object obj2;
                    Object objOnExtraCallbackWithResult;
                    BaseApiResponse baseApiResponse;
                    PeriodicTransferBannerResponse periodicTransferBannerResponse;
                    Object objOnTransact;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i = this.label;
                    try {
                        if (i == 0) {
                            ResultKt.onNavigationEvent(obj);
                            KeyBoardVisiblePoint keyBoardVisiblePoint = this.$account;
                            Result.Companion companion = Result.Companion;
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 29426), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22, 24734 - ExpandableListView.getPackedPositionType(0L), -842029757, false, "onWarmupCompleted", (Class[]) null);
                            }
                            Object obj3 = ((Field) objOnExtraCallback).get(null);
                            try {
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1971988338);
                                if (objOnExtraCallback2 == null) {
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 29427), 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 24734 - KeyEvent.keyCodeFromString(""), -1154144738, false, "access000", new Class[0]);
                                }
                                getMediaViewVideoRendererApi getmediaviewvideorendererapi = (getMediaViewVideoRendererApi) ((Method) objOnExtraCallback2).invoke(obj3, null);
                                PeriodicTransferBannerRequest periodicTransferBannerRequest = new PeriodicTransferBannerRequest(keyBoardVisiblePoint != null ? willMountItems.onNavigationEvent(keyBoardVisiblePoint) : null);
                                this.L$0 = access15400.onNavigationEvent(this);
                                this.I$0 = 0;
                                this.I$1 = 0;
                                this.label = 1;
                                objOnExtraCallbackWithResult = getmediaviewvideorendererapi.onExtraCallbackWithResult(periodicTransferBannerRequest, (access13800<? super BaseApiResponse<PeriodicTransferBannerResponse>>) this);
                                if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                                    return objOnWarmupCompleted;
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.onNavigationEvent(obj);
                            objOnExtraCallbackWithResult = obj;
                        }
                        baseApiResponse = (BaseApiResponse) objOnExtraCallbackWithResult;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (WebResourceResponseModel e2) {
                        Result.Companion companion2 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
                    } catch (Exception e3) {
                        Result.Companion companion3 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
                    }
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()) {
                        try {
                            objOnTransact = baseApiResponse.onTransact();
                        } catch (NullPointerException e4) {
                            if (!Intrinsics.areEqual(PeriodicTransferBannerResponse.class, Object.class) && !Intrinsics.areEqual(PeriodicTransferBannerResponse.class, Unit.class)) {
                                TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e4);
                                apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                                throw apiErrorOnExtraCallbackWithResult;
                            }
                            periodicTransferBannerResponse = Unit.INSTANCE;
                        }
                        if (objOnTransact == null) {
                            throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse");
                        }
                        periodicTransferBannerResponse = (PeriodicTransferBannerResponse) objOnTransact;
                        obj2 = Result.constructor-impl(periodicTransferBannerResponse);
                        if (Result.onExtraCallback(obj2)) {
                            return null;
                        }
                        return obj2;
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    throw apiErrorExtraCallbackWithResult;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onNavigationEvent(markInitializableReactAndroid_release markinitializablereactandroid_release, boolean z, Collection collection, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            collection = null;
        }
        markinitializablereactandroid_release.onExtraCallbackWithResult(z, (Collection<String>) collection);
    }

    public final void onExtraCallbackWithResult(boolean z, @Nullable Collection<String> collection) {
        if (collection != null) {
            this.writeTypedObject = false;
            IAuthTabCallbackStub();
            CollectionsKt.addAll(this.access000, collection);
            this.onExtraCallbackWithResult.onWarmupCompleted(clearFaultAdjacentMetadata.onExtraCallback());
        }
        getPackageType getpackagetype = this.ICustomTabsCallback;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        this.ICustomTabsCallback = maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new extraCallback(z, null), 3, (Object) null);
    }

    static final class extraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ boolean $reset;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        extraCallback(boolean z, access13800<? super extraCallback> access13800Var) {
            super(2, access13800Var);
            this.$reset = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return markInitializableReactAndroid_release.this.new extraCallback(this.$reset, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    markInitializableReactAndroid_release.this.onNavigationEvent.onWarmupCompleted(access14000.onNavigationEvent(true));
                    if (this.$reset) {
                        markInitializableReactAndroid_release.this.IAuthTabCallbackStub.onWarmupCompleted((Object) null);
                    }
                    Result.Companion companion = Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onExtraCallback onextracallback = new onExtraCallback(null);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallback, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = Result.constructor-impl(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            markInitializableReactAndroid_release markinitializablereactandroid_release = markInitializableReactAndroid_release.this;
            if (Result.onNavigationEvent(obj2)) {
                PeriodicTransferListResponse periodicTransferListResponse = (PeriodicTransferListResponse) obj2;
                markinitializablereactandroid_release.writeTypedObject = true;
                markinitializablereactandroid_release.IAuthTabCallbackStub.onWarmupCompleted(periodicTransferListResponse.onWarmupCompleted());
                markinitializablereactandroid_release.asBinder.onWarmupCompleted(periodicTransferListResponse.IAuthTabCallback());
            }
            markInitializableReactAndroid_release markinitializablereactandroid_release2 = markInitializableReactAndroid_release.this;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                markinitializablereactandroid_release2.onExtraCallback.onNavigationEvent(new IAuthTabCallback.onExtraCallback(th, true));
            }
            markInitializableReactAndroid_release.this.onNavigationEvent.onWarmupCompleted(access14000.onNavigationEvent(false));
            return Unit.INSTANCE;
        }

        public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super PeriodicTransferListResponse>, Object> {
            int I$0;
            Object L$0;
            int label;

            public onExtraCallback(access13800 access13800Var) {
                super(2, access13800Var);
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onExtraCallback(access13800Var);
            }

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super PeriodicTransferListResponse> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29426), 22 - (ViewConfiguration.getTapTimeout() >> 16), 24733 - TextUtils.lastIndexOf("", '0', 0), -842029757, false, "onWarmupCompleted", (Class[]) null);
                    }
                    Object obj2 = ((Field) objOnExtraCallback).get(null);
                    try {
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1971988338);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 29426), 21 - MotionEvent.axisFromString(""), TextUtils.getTrimmedLength("") + 24734, -1154144738, false, "access000", new Class[0]);
                        }
                        getMediaViewVideoRendererApi getmediaviewvideorendererapi = (getMediaViewVideoRendererApi) ((Method) objOnExtraCallback2).invoke(obj2, null);
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.label = 1;
                        obj = getmediaviewvideorendererapi.asInterface(this);
                        if (obj == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    try {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact != null) {
                            return (PeriodicTransferListResponse) objOnTransact;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.transfer.periodic.PeriodicTransferListResponse");
                    } catch (NullPointerException e) {
                        if (Intrinsics.areEqual(PeriodicTransferListResponse.class, Object.class) || Intrinsics.areEqual(PeriodicTransferListResponse.class, Unit.class)) {
                            return Unit.INSTANCE;
                        }
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                }
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
        }
    }

    static final class extraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $enable;
        final /* synthetic */ IAuthTabCallbackStub $item;
        int I$0;
        int I$1;
        int I$2;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private static final byte[] $$a = {32, 13, -54, -47};
        private static final int $$b = 40;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private static long onExtraCallback = -9073909808953279560L;
        private static int onWarmupCompleted = -1776194565;
        private static char onExtraCallbackWithResult = 27643;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r7, short r8, short r9) {
            /*
                int r9 = r9 + 109
                int r7 = r7 * 4
                int r7 = 3 - r7
                byte[] r0 = o.markInitializableReactAndroid_release.extraCallbackWithResult.$$a
                int r8 = r8 * 2
                int r8 = r8 + 1
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r4 = r2
                r9 = r7
                goto L2a
            L15:
                r3 = r2
            L16:
                int r7 = r7 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L25:
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r6
            L2a:
                int r3 = -r3
                int r7 = r7 + r3
                r3 = r4
                r6 = r9
                r9 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.markInitializableReactAndroid_release.extraCallbackWithResult.$$c(int, short, short):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        extraCallbackWithResult(IAuthTabCallbackStub iAuthTabCallbackStub, boolean z, Context context, access13800<? super extraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$item = iAuthTabCallbackStub;
            this.$enable = z;
            this.$context = context;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            extraCallbackWithResult extracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return extracallbackwithresultCreate.invokeSuspend(unit);
            }
            extracallbackwithresultCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            extraCallbackWithResult extracallbackwithresult = markInitializableReactAndroid_release.this.new extraCallbackWithResult(this.$item, this.$enable, this.$context, access13800Var);
            extracallbackwithresult.L$0 = obj;
            int i2 = onNavigationEvent + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return extracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 11;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i4 = $11 + 121;
                $10 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 42 - TextUtils.indexOf((CharSequence) "", '0'), View.resolveSize(0, 0) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 49123), 44 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Gravity.getAbsoluteGravity(0, 0) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 50, Color.argb(0, 0, 0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45849 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 29 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 12577 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    int i6 = $10 + 19;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super PeriodicTransferModel>, Object> {
            final /* synthetic */ PeriodicTransferModel $data$inlined;
            final /* synthetic */ boolean $enable$inlined;
            int I$0;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallback(access13800 access13800Var, boolean z, PeriodicTransferModel periodicTransferModel) {
                super(2, access13800Var);
                this.$enable$inlined = z;
                this.$data$inlined = periodicTransferModel;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onExtraCallback(access13800Var, this.$enable$inlined, this.$data$inlined);
            }

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super PeriodicTransferModel> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
            
                if (r0 == r2) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x012b, code lost:
            
                if (r0 == r2) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x012d, code lost:
            
                return r2;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 422
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o.markInitializableReactAndroid_release.extraCallbackWithResult.onExtraCallback.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            IAuthTabCallback.onNavigationEvent onnavigationevent;
            Object objOnExtraCallback;
            int i = 2;
            int i2 = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            DefaultConstructorMarker defaultConstructorMarker = null;
            boolean z = false;
            try {
                if (i3 != 0) {
                    int i4 = IAuthTabCallback + 97;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnExtraCallback = obj;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    PeriodicTransferModel periodicTransferModelOnExtraCallback = markInitializableReactAndroid_release.this.onExtraCallback(this.$item);
                    if (periodicTransferModelOnExtraCallback == null) {
                        int i6 = IAuthTabCallback + 109;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        markInitializableReactAndroid_release.this.onExtraCallback(this.$item, !this.$enable);
                        return Unit.INSTANCE;
                    }
                    markInitializableReactAndroid_release.this.onExtraCallback(this.$item, this.$enable);
                    boolean z2 = this.$enable;
                    Result.Companion companion = Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onExtraCallback onextracallback = new onExtraCallback(null, z2, periodicTransferModelOnExtraCallback);
                    this.L$0 = access15400.onNavigationEvent(findresandmsg);
                    this.L$1 = access15400.onNavigationEvent(periodicTransferModelOnExtraCallback);
                    this.L$2 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallback, this);
                    if (objOnExtraCallback == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                obj2 = Result.constructor-impl(objOnExtraCallback);
            } catch (WebResourceResponseModel e) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            markInitializableReactAndroid_release markinitializablereactandroid_release = markInitializableReactAndroid_release.this;
            boolean z3 = this.$enable;
            Context context = this.$context;
            if (!(!Result.onNavigationEvent(obj2))) {
                getBorderRadius getborderradius = markinitializablereactandroid_release.onExtraCallback;
                if (z3) {
                    String string = context.getString(R.string.app_send_periodic___0f99343b21);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    Object[] objArr = new Object[1];
                    a((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 871452882 - KeyEvent.normalizeMetaState(0), new char[]{54352, 2233, 3431, 2724, 42682, 26464, 30622, 53979, 21994, 37365, 1316, 41599, 39475, 49682, 55245, 50754, 25602, 31595, 57712, 31914, 14550, 33828, 48461, 23429, 18019, 35445, 63406, 63578, 7449, 30491, 35919, 35158, 37308, 55802, 22508, 42052, 923, 3214, 24301, 1293, 56899, 40787, 59567, 22952, 56762, 51577, 57076, 43675, 36695, 58367, 274, 49269, 59539, 60470, 8293, 41300, 36046, 30646, 24828, 53609, 33303, 11771, 28997}, new char[]{20547, 12105, 62252, 60968}, new char[]{53948, 61776, 11315, 876}, objArr);
                    onnavigationevent = new IAuthTabCallback.onNavigationEvent(((String) objArr[0]).intern(), string);
                } else {
                    String string2 = context.getString(R.string.app_send_periodic___92ee93da1f);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    Object[] objArr2 = new Object[1];
                    a((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (-1898115462) - (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{35001, 36951, 3017, 56772, 31198, 61961, 15553, 16908, 36392, 49489, 37798, 5189, 48124, 61589, 23570, 38842, 57121, 56092, 27233, 36208, 10920, 53400, 21593, 15560, 56121, 48324, 25175, 52376, 14141, 53987, 31617, 52945, 21128, 37310, 21739, 55002, 1778, 17176, 1112, 26559, 56198, 34536, 6896, 19587, 49191, 40453, 36606, 7019, 57466, 57809, 1840, 13071, 28029, 53375, 30816, 40345, 12745, 1340, 15645}, new char[]{20547, 12105, 62252, 60968}, new char[]{31325, 56590, 47502, 64996}, objArr2);
                    onnavigationevent = new IAuthTabCallback.onNavigationEvent(((String) objArr2[0]).intern(), string2);
                }
                getborderradius.onNavigationEvent(onnavigationevent);
                markInitializableReactAndroid_release.onNavigationEvent(markinitializablereactandroid_release, false, null, 3, null);
            }
            markInitializableReactAndroid_release markinitializablereactandroid_release2 = markInitializableReactAndroid_release.this;
            IAuthTabCallbackStub iAuthTabCallbackStub = this.$item;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                markinitializablereactandroid_release2.onExtraCallback.onNavigationEvent(new IAuthTabCallback.onExtraCallback(th, z, i, defaultConstructorMarker));
                markinitializablereactandroid_release2.onExtraCallback(iAuthTabCallbackStub, iAuthTabCallbackStub.IAuthTabCallbackStub());
            }
            return Unit.INSTANCE;
        }
    }

    public final PeriodicTransferModel onExtraCallback(@NotNull IAuthTabCallbackStub iAuthTabCallbackStub) {
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        List list = (List) this.IAuthTabCallbackStub.IAuthTabCallback();
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((PeriodicTransferModel) next).onMessageChannelReady(), iAuthTabCallbackStub.asInterface())) {
                obj = next;
                break;
            }
        }
        return (PeriodicTransferModel) obj;
    }

    public final getPackageType onExtraCallback(@NotNull Context context, @NotNull IAuthTabCallbackStub iAuthTabCallbackStub, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        return maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new extraCallbackWithResult(iAuthTabCallbackStub, z, context, null), 3, (Object) null);
    }

    static final class readTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Context $context;
        final /* synthetic */ IAuthTabCallbackStub $item;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        private static char[] IAuthTabCallback = {64961, 64960, 64964, 64971, 64988, 64991, 64966, 64982, 64924, 64965, 64925, 64978, 64987, 64967, 64962, 64986, 64903, 64905, 64963, 64984, 64976, 64990, 64989, 64926, 64980};
        private static char onExtraCallbackWithResult = 51244;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        readTypedObject(IAuthTabCallbackStub iAuthTabCallbackStub, Context context, access13800<? super readTypedObject> access13800Var) {
            super(2, access13800Var);
            this.$item = iAuthTabCallbackStub;
            this.$context = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            readTypedObject readtypedobject = markInitializableReactAndroid_release.this.new readTypedObject(this.$item, this.$context, access13800Var);
            int i2 = onExtraCallback + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return readtypedobject;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 43;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            readTypedObject readtypedobjectCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                readtypedobjectCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = readtypedobjectCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Object>, Object> {
            final /* synthetic */ PeriodicTransferModel $data$inlined;
            int I$0;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IAuthTabCallback(access13800 access13800Var, PeriodicTransferModel periodicTransferModel) {
                super(2, access13800Var);
                this.$data$inlined = periodicTransferModel;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new IAuthTabCallback(access13800Var, this.$data$inlined);
            }

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Object> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objOnExtraCallbackWithResult;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 22, TextUtils.getTrimmedLength("") + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
                    }
                    Object obj2 = ((Field) objOnExtraCallback).get(null);
                    try {
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1971988338);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, 24733 - Process.getGidForName(""), -1154144738, false, "access000", new Class[0]);
                        }
                        getMediaViewVideoRendererApi getmediaviewvideorendererapi = (getMediaViewVideoRendererApi) ((Method) objOnExtraCallback2).invoke(obj2, null);
                        PeriodicTransferDeleteParam periodicTransferDeleteParam = new PeriodicTransferDeleteParam(this.$data$inlined.onMessageChannelReady(), this.$data$inlined.readTypedObject());
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.label = 1;
                        objOnExtraCallbackWithResult = getmediaviewvideorendererapi.onExtraCallbackWithResult(periodicTransferDeleteParam, (access13800<? super BaseApiResponse<Object>>) this);
                        if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnExtraCallbackWithResult = obj;
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) objOnExtraCallbackWithResult;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    try {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact != null) {
                            return objOnTransact;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                    } catch (NullPointerException e) {
                        if (Intrinsics.areEqual(Object.class, Object.class) || Intrinsics.areEqual(Object.class, Unit.class)) {
                            return Unit.INSTANCE;
                        }
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                }
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 323
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.markInitializableReactAndroid_release.readTypedObject.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int length;
            char[] cArr2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr3 = IAuthTabCallback;
            Object obj2 = null;
            if (cArr3 != null) {
                int i4 = $11 + 9;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                }
                for (int i5 = 0; i5 < length; i5++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25, View.combineMeasuredStates(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr2;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), ((Process.getThreadPriority(0) + 20) >> 6) + 26, 23140 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
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
                int i6 = $11 + 125;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i8 = $10 + 65;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i10 = $10 + 119;
                        $11 = i10 % 128;
                        if (i10 % 2 == 0) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback + b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent - 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        } else {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        }
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - Color.red(0)), 73 - ((byte) KeyEvent.getModifierMetaStateMask()), 8089 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), Gravity.getAbsoluteGravity(0, 0) + 30, 19488 - (ViewConfiguration.getPressedStateDuration() >> 16), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i11];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i12 = $10 + 39;
                                $11 = i12 % 128;
                                int i13 = i12 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i14];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i15];
                            } else {
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i16];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i17];
                                int i18 = $10 + 65;
                                $11 = i18 % 128;
                                int i19 = i18 % 2;
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i20 = 0; i20 < i; i20++) {
                cArr4[i20] = (char) (cArr4[i20] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }
    }

    public final getPackageType onExtraCallback(@NotNull Context context, @NotNull IAuthTabCallbackStub iAuthTabCallbackStub) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        return maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new readTypedObject(iAuthTabCallbackStub, context, null), 3, (Object) null);
    }

    public final void IAuthTabCallback(@NotNull final String str) {
        List mutableList;
        Intrinsics.checkNotNullParameter(str, "");
        getCornerRadius<List<PeriodicTransferModel>> getcornerradius = this.IAuthTabCallbackStub;
        List list = (List) getcornerradius.IAuthTabCallback();
        if (list == null || (mutableList = CollectionsKt.toMutableList(list)) == null) {
            mutableList = null;
        } else {
            CollectionsKt.removeAll(mutableList, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListViewModel$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(markInitializableReactAndroid_release.IAuthTabCallback(str, (PeriodicTransferModel) obj));
                }
            });
        }
        getcornerradius.onWarmupCompleted(mutableList);
        onNavigationEvent(this, false, null, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IAuthTabCallback(String str, PeriodicTransferModel periodicTransferModel) {
        Intrinsics.checkNotNullParameter(periodicTransferModel, "");
        return Intrinsics.areEqual(periodicTransferModel.onMessageChannelReady(), str);
    }

    static final class onMessageChannelReady extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ IAuthTabCallbackStub $item;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onMessageChannelReady(IAuthTabCallbackStub iAuthTabCallbackStub, Context context, access13800<? super onMessageChannelReady> access13800Var) {
            super(2, access13800Var);
            this.$item = iAuthTabCallbackStub;
            this.$context = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return markInitializableReactAndroid_release.this.new onMessageChannelReady(this.$item, this.$context, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 415
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.markInitializableReactAndroid_release.onMessageChannelReady.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final getPackageType onNavigationEvent(@NotNull Context context, @NotNull IAuthTabCallbackStub iAuthTabCallbackStub) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        return maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onMessageChannelReady(iAuthTabCallbackStub, context, null), 3, (Object) null);
    }

    public final void IAuthTabCallback(@Nullable KeyBoardVisiblePoint keyBoardVisiblePoint) {
        if (Intrinsics.areEqual(onExtraCallback((KeyBoardVisiblePoint) this.onWarmupCompleted.IAuthTabCallback()), onExtraCallback(keyBoardVisiblePoint))) {
            return;
        }
        this.onWarmupCompleted.onWarmupCompleted(keyBoardVisiblePoint);
    }

    public final void onNavigationEvent() {
        this.onExtraCallbackWithResult.onWarmupCompleted(clearFaultAdjacentMetadata.onExtraCallback());
    }

    public final void IAuthTabCallback() {
        this.IAuthTabCallbackStubProxy = false;
        this.IAuthTabCallback.onWarmupCompleted(Boolean.FALSE);
    }

    public final void onExtraCallbackWithResult() {
        this.IAuthTabCallbackStubProxy = true;
        if (this.writeTypedObject) {
            Iterable iterable = (Iterable) this.IAuthTabCallbackDefault.IAuthTabCallback();
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((IAuthTabCallback_Parcel) it.next()) instanceof access100) {
                    this.IAuthTabCallback.onWarmupCompleted(Boolean.TRUE);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExtraCallback(IAuthTabCallbackStub iAuthTabCallbackStub, boolean z) {
        List list = (List) this.IAuthTabCallbackDefault.IAuthTabCallback();
        getCornerRadius<List<IAuthTabCallback_Parcel>> getcornerradius = this.IAuthTabCallbackDefault;
        List mutableList = CollectionsKt.toMutableList(list);
        Iterator it = mutableList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = (IAuthTabCallback_Parcel) it.next();
            if ((iAuthTabCallback_Parcel instanceof IAuthTabCallbackStub) && Intrinsics.areEqual(((IAuthTabCallbackStub) iAuthTabCallback_Parcel).asInterface(), iAuthTabCallbackStub.asInterface())) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            Object obj = mutableList.get(i);
            Intrinsics.checkNotNull(obj, "");
            mutableList.set(i, IAuthTabCallbackStub.IAuthTabCallback((IAuthTabCallbackStub) obj, null, null, null, null, 0L, null, null, z, false, false, false, 1919, null));
        }
        getcornerradius.onWarmupCompleted(mutableList);
    }

    static final class writeTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        writeTypedObject(access13800<? super writeTypedObject> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return markInitializableReactAndroid_release.this.new writeTypedObject(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                IAnimation iAnimationOnWarmupCompleted = ycxycx.onWarmupCompleted(markInitializableReactAndroid_release.this.IAuthTabCallbackStub, markInitializableReactAndroid_release.this.onWarmupCompleted, markInitializableReactAndroid_release.this.asInterface, markInitializableReactAndroid_release.this.onTransact, markInitializableReactAndroid_release.this.asBinder, new AnonymousClass4(markInitializableReactAndroid_release.this, null));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(markInitializableReactAndroid_release.this, null);
                this.label = 1;
                if (ycxycx.onWarmupCompleted(iAnimationOnWarmupCompleted, anonymousClass1, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: o.markInitializableReactAndroid_release$writeTypedObject$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements setPacEnabledKeys<List<? extends PeriodicTransferModel>, KeyBoardVisiblePoint, onExtraCallbackWithResult, PeriodicTransferBannerResponse.Recommendations, TossBankSummary, access13800<? super List<? extends IAuthTabCallback_Parcel>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ Object L$2;
            /* synthetic */ Object L$3;
            /* synthetic */ Object L$4;
            int label;
            final /* synthetic */ markInitializableReactAndroid_release this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(markInitializableReactAndroid_release markinitializablereactandroid_release, access13800<? super AnonymousClass4> access13800Var) {
                super(6, access13800Var);
                this.this$0 = markinitializablereactandroid_release;
            }

            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final Object invoke(List<PeriodicTransferModel> list, KeyBoardVisiblePoint keyBoardVisiblePoint, onExtraCallbackWithResult onextracallbackwithresult, PeriodicTransferBannerResponse.Recommendations recommendations, TossBankSummary tossBankSummary, access13800<? super List<? extends IAuthTabCallback_Parcel>> access13800Var) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, access13800Var);
                anonymousClass4.L$0 = list;
                anonymousClass4.L$1 = keyBoardVisiblePoint;
                anonymousClass4.L$2 = onextracallbackwithresult;
                anonymousClass4.L$3 = recommendations;
                anonymousClass4.L$4 = tossBankSummary;
                return anonymousClass4.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                List list = (List) this.L$0;
                KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) this.L$1;
                onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) this.L$2;
                PeriodicTransferBannerResponse.Recommendations recommendations = (PeriodicTransferBannerResponse.Recommendations) this.L$3;
                TossBankSummary tossBankSummary = (TossBankSummary) this.L$4;
                if (this.label == 0) {
                    ResultKt.onNavigationEvent(obj);
                    return this.this$0.onExtraCallbackWithResult(list, keyBoardVisiblePoint, onextracallbackwithresult, recommendations, tossBankSummary);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: o.markInitializableReactAndroid_release$writeTypedObject$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends IAuthTabCallback_Parcel>, access13800<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ markInitializableReactAndroid_release this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(markInitializableReactAndroid_release markinitializablereactandroid_release, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.this$0 = markinitializablereactandroid_release;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, access13800Var);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final Object invoke(List<? extends IAuthTabCallback_Parcel> list, access13800<? super Unit> access13800Var) {
                return create(list, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                List list = (List) this.L$0;
                if (this.label == 0) {
                    ResultKt.onNavigationEvent(obj);
                    this.this$0.IAuthTabCallbackDefault.onWarmupCompleted(list);
                    this.this$0.IAuthTabCallback((List<? extends IAuthTabCallback_Parcel>) list);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private final void IAuthTabCallbackDefault() {
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new writeTypedObject(null), 3, (Object) null);
    }

    private final void asBinder() {
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new ICustomTabsCallback(null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<IAuthTabCallback_Parcel> onExtraCallbackWithResult(List<PeriodicTransferModel> list, KeyBoardVisiblePoint keyBoardVisiblePoint, onExtraCallbackWithResult onextracallbackwithresult, PeriodicTransferBannerResponse.Recommendations recommendations, TossBankSummary tossBankSummary) throws Resources.NotFoundException {
        String string;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(getInterfaceDescriptor.onExtraCallback);
        List<PeriodicTransferModel> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            if (keyBoardVisiblePoint == null || (string = issueCertV3.onNavigationEvent(keyBoardVisiblePoint)) == null) {
                string = ((Resources) followRedirects.IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followRedirects.onExtraCallbackWithResult}, -1316113811, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).getString(R.string.transfer_history);
                Intrinsics.checkNotNullExpressionValue(string, "");
            }
            listCreateListBuilder.add(new onTransact(string));
        }
        if (onextracallbackwithresult != null) {
            listCreateListBuilder.add(onextracallbackwithresult);
            listCreateListBuilder.add(new onWarmupCompleted("below_top_banner", 0, 0, 0, 14, null));
        }
        if (tossBankSummary != null) {
            listCreateListBuilder.add(new access100(tossBankSummary.onExtraCallbackWithResult(), tossBankSummary.onWarmupCompleted()));
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                PeriodicTransferModel periodicTransferModel = (PeriodicTransferModel) obj;
                if (keyBoardVisiblePoint == null || periodicTransferModel.onWarmupCompleted(keyBoardVisiblePoint)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new IAuthTabCallbackStub((PeriodicTransferModel) it.next()));
            }
            int i = 0;
            if (!arrayList2.isEmpty()) {
                List<PeriodicTransferBannerResponse.RecommendationBanner> listOnNavigationEvent = recommendations != null ? recommendations.onNavigationEvent() : null;
                if (listOnNavigationEvent != null && !listOnNavigationEvent.isEmpty()) {
                    listCreateListBuilder.add(new onWarmupCompleted("recommendation_top_margin", 0, 0, im.toss.uikit.R.color.transparent, 6, null));
                    listCreateListBuilder.add(new asBinder(recommendations.onExtraCallbackWithResult()));
                    List<PeriodicTransferBannerResponse.RecommendationBanner> listOnNavigationEvent2 = recommendations.onNavigationEvent();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnNavigationEvent2, 10));
                    int i2 = 0;
                    for (Object obj2 : listOnNavigationEvent2) {
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        arrayList3.add(new asInterface(i2, (PeriodicTransferBannerResponse.RecommendationBanner) obj2));
                        i2++;
                    }
                    listCreateListBuilder.addAll(arrayList3);
                }
                int i3 = 0;
                for (Object obj3 : arrayList2) {
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    IAuthTabCallbackStub iAuthTabCallbackStub = (IAuthTabCallbackStub) obj3;
                    if (i > 0 && ((IAuthTabCallbackStub) arrayList2.get(i - 1)).onWarmupCompleted() != iAuthTabCallbackStub.onWarmupCompleted()) {
                        listCreateListBuilder.add(new onNavigationEvent("divider_#" + i3));
                        i3++;
                    }
                    listCreateListBuilder.add(iAuthTabCallbackStub);
                    i++;
                }
            } else {
                List<PeriodicTransferBannerResponse.RecommendationBanner> listOnNavigationEvent3 = recommendations != null ? recommendations.onNavigationEvent() : null;
                if (listOnNavigationEvent3 != null && !listOnNavigationEvent3.isEmpty()) {
                    listCreateListBuilder.add(new onWarmupCompleted("recommendation_top_margin", 0, 0, im.toss.uikit.R.color.transparent, 6, null));
                    listCreateListBuilder.add(new asBinder(recommendations.onExtraCallbackWithResult()));
                    List<PeriodicTransferBannerResponse.RecommendationBanner> listOnNavigationEvent4 = recommendations.onNavigationEvent();
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnNavigationEvent4, 10));
                    for (Object obj4 : listOnNavigationEvent4) {
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        arrayList4.add(new asInterface(i, (PeriodicTransferBannerResponse.RecommendationBanner) obj4));
                        i++;
                    }
                    listCreateListBuilder.addAll(arrayList4);
                    DisplayMetrics displayMetrics = ((Resources) followRedirects.IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followRedirects.onExtraCallbackWithResult}, -1316113811, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                    listCreateListBuilder.add(new onWarmupCompleted("recommendation_bottom_margin", varyMatches.onNavigationEvent(40, displayMetrics), 0, im.toss.uikit.R.color.transparent, 4, null));
                }
                listCreateListBuilder.add(onExtraCallback.onExtraCallbackWithResult);
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IAuthTabCallback(List<? extends IAuthTabCallback_Parcel> list) {
        if (((Set) this.onExtraCallbackWithResult.IAuthTabCallback()).isEmpty() && this.writeTypedObject && !this.access000.isEmpty()) {
            List<? extends IAuthTabCallback_Parcel> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((IAuthTabCallback_Parcel) it.next()) instanceof IAuthTabCallbackStub) {
                        this.onExtraCallbackWithResult.onWarmupCompleted(CollectionsKt.toSet(this.access000));
                        IAuthTabCallbackStub();
                        break;
                    }
                }
            }
        }
        if (!((Boolean) this.IAuthTabCallback.IAuthTabCallback()).booleanValue() && this.IAuthTabCallbackStubProxy && this.writeTypedObject) {
            List<? extends IAuthTabCallback_Parcel> list3 = list;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                return;
            }
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                if (((IAuthTabCallback_Parcel) it2.next()) instanceof access100) {
                    this.IAuthTabCallback.onWarmupCompleted(Boolean.TRUE);
                    return;
                }
            }
        }
    }

    private final void IAuthTabCallbackStub() {
        this.access000.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String onExtraCallback(KeyBoardVisiblePoint keyBoardVisiblePoint) {
        if (keyBoardVisiblePoint == null) {
            return null;
        }
        return keyBoardVisiblePoint.onWarmupCompleted().getName() + "_" + keyBoardVisiblePoint.onExtraCallbackWithResult() + "_" + keyBoardVisiblePoint.asInterface() + "_" + keyBoardVisiblePoint.bP_();
    }

    public static final class IAuthTabCallbackDefault extends ViewModelProvider.onNavigationEvent {
        private final Set<String> IAuthTabCallback;
        private final H5TinyPopMenu onExtraCallback;
        private final boolean onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(@NotNull H5TinyPopMenu h5TinyPopMenu, @NotNull Set<String> set, boolean z) {
            Intrinsics.checkNotNullParameter(h5TinyPopMenu, "");
            Intrinsics.checkNotNullParameter(set, "");
            this.onExtraCallback = h5TinyPopMenu;
            this.IAuthTabCallback = set;
            this.onExtraCallbackWithResult = z;
        }

        public <T extends ViewModel> T create(@NotNull Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new markInitializableReactAndroid_release(this.onExtraCallback, this.IAuthTabCallback, this.onExtraCallbackWithResult);
        }
    }

    public static final class access000 {
        private final boolean IAuthTabCallback;
        private final List<IAuthTabCallback_Parcel> asBinder;
        private final boolean onExtraCallback;
        private final Set<String> onExtraCallbackWithResult;
        private final KeyBoardVisiblePoint onNavigationEvent;
        private final List<PeriodicTransferModel> onWarmupCompleted;

        public access000() {
            this(null, null, null, false, null, false, 63, null);
        }

        public static /* synthetic */ access000 onExtraCallback(access000 access000Var, List list, List list2, KeyBoardVisiblePoint keyBoardVisiblePoint, boolean z, Set set, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = access000Var.asBinder;
            }
            if ((i & 2) != 0) {
                list2 = access000Var.onWarmupCompleted;
            }
            List list3 = list2;
            if ((i & 4) != 0) {
                keyBoardVisiblePoint = access000Var.onNavigationEvent;
            }
            KeyBoardVisiblePoint keyBoardVisiblePoint2 = keyBoardVisiblePoint;
            if ((i & 8) != 0) {
                z = access000Var.onExtraCallback;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                set = access000Var.onExtraCallbackWithResult;
            }
            Set set2 = set;
            if ((i & 32) != 0) {
                z2 = access000Var.IAuthTabCallback;
            }
            return access000Var.IAuthTabCallback(list, list3, keyBoardVisiblePoint2, z3, set2, z2);
        }

        public final access000 IAuthTabCallback(@NotNull List<? extends IAuthTabCallback_Parcel> list, @Nullable List<PeriodicTransferModel> list2, @Nullable KeyBoardVisiblePoint keyBoardVisiblePoint, boolean z, @NotNull Set<String> set, boolean z2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(set, "");
            return new access000(list, list2, keyBoardVisiblePoint, z, set, z2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof access000)) {
                return false;
            }
            access000 access000Var = (access000) obj;
            return Intrinsics.areEqual(this.asBinder, access000Var.asBinder) && Intrinsics.areEqual(this.onWarmupCompleted, access000Var.onWarmupCompleted) && Intrinsics.areEqual(this.onNavigationEvent, access000Var.onNavigationEvent) && this.onExtraCallback == access000Var.onExtraCallback && Intrinsics.areEqual(this.onExtraCallbackWithResult, access000Var.onExtraCallbackWithResult) && this.IAuthTabCallback == access000Var.IAuthTabCallback;
        }

        public int hashCode() {
            int iHashCode = this.asBinder.hashCode();
            List<PeriodicTransferModel> list = this.onWarmupCompleted;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            KeyBoardVisiblePoint keyBoardVisiblePoint = this.onNavigationEvent;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + (keyBoardVisiblePoint != null ? keyBoardVisiblePoint.hashCode() : 0)) * 31) + Boolean.hashCode(this.onExtraCallback)) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + Boolean.hashCode(this.IAuthTabCallback);
        }

        public String toString() {
            return "UiState(uiItems=" + this.asBinder + ", periodicTransferItems=" + this.onWarmupCompleted + ", filteringAccount=" + this.onNavigationEvent + ", isRefreshing=" + this.onExtraCallback + ", pendingHighlightUniqueIds=" + this.onExtraCallbackWithResult + ", pendingTossBankHighlight=" + this.IAuthTabCallback + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public access000(@NotNull List<? extends IAuthTabCallback_Parcel> list, @Nullable List<PeriodicTransferModel> list2, @Nullable KeyBoardVisiblePoint keyBoardVisiblePoint, boolean z, @NotNull Set<String> set, boolean z2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(set, "");
            this.asBinder = list;
            this.onWarmupCompleted = list2;
            this.onNavigationEvent = keyBoardVisiblePoint;
            this.onExtraCallback = z;
            this.onExtraCallbackWithResult = set;
            this.IAuthTabCallback = z2;
        }

        public /* synthetic */ access000(List list, List list2, KeyBoardVisiblePoint keyBoardVisiblePoint, boolean z, Set set, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : list2, (i & 4) == 0 ? keyBoardVisiblePoint : null, (i & 8) != 0 ? false : z, (i & 16) != 0 ? clearFaultAdjacentMetadata.onExtraCallback() : set, (i & 32) != 0 ? false : z2);
        }

        public final List<IAuthTabCallback_Parcel> onWarmupCompleted() {
            return this.asBinder;
        }

        public final List<PeriodicTransferModel> IAuthTabCallback() {
            return this.onWarmupCompleted;
        }

        public final KeyBoardVisiblePoint onExtraCallback() {
            return this.onNavigationEvent;
        }

        public final boolean asInterface() {
            return this.onExtraCallback;
        }

        public final Set<String> onExtraCallbackWithResult() {
            return this.onExtraCallbackWithResult;
        }

        public final boolean onNavigationEvent() {
            return this.IAuthTabCallback;
        }
    }

    public static final class IAuthTabCallbackStub implements IAuthTabCallback_Parcel {
        private final boolean IAuthTabCallback;
        private final boolean IAuthTabCallbackDefault;
        private final String IAuthTabCallbackStub;
        private final boolean asBinder;
        private final String asInterface;
        private final String getInterfaceDescriptor;
        private final long onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final boolean onTransact;
        private final String onWarmupCompleted;

        public static /* synthetic */ IAuthTabCallbackStub IAuthTabCallback(IAuthTabCallbackStub iAuthTabCallbackStub, String str, String str2, String str3, String str4, long j, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            return iAuthTabCallbackStub.onNavigationEvent((i & 1) != 0 ? iAuthTabCallbackStub.IAuthTabCallbackStub : str, (i & 2) != 0 ? iAuthTabCallbackStub.asInterface : str2, (i & 4) != 0 ? iAuthTabCallbackStub.onWarmupCompleted : str3, (i & 8) != 0 ? iAuthTabCallbackStub.onExtraCallbackWithResult : str4, (i & 16) != 0 ? iAuthTabCallbackStub.onExtraCallback : j, (i & 32) != 0 ? iAuthTabCallbackStub.onNavigationEvent : str5, (i & 64) != 0 ? iAuthTabCallbackStub.getInterfaceDescriptor : str6, (i & 128) != 0 ? iAuthTabCallbackStub.IAuthTabCallbackDefault : z, (i & 256) != 0 ? iAuthTabCallbackStub.asBinder : z2, (i & 512) != 0 ? iAuthTabCallbackStub.IAuthTabCallback : z3, (i & 1024) != 0 ? iAuthTabCallbackStub.onTransact : z4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallbackStub)) {
                return false;
            }
            IAuthTabCallbackStub iAuthTabCallbackStub = (IAuthTabCallbackStub) obj;
            return Intrinsics.areEqual(this.IAuthTabCallbackStub, iAuthTabCallbackStub.IAuthTabCallbackStub) && Intrinsics.areEqual(this.asInterface, iAuthTabCallbackStub.asInterface) && Intrinsics.areEqual(this.onWarmupCompleted, iAuthTabCallbackStub.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallbackWithResult, iAuthTabCallbackStub.onExtraCallbackWithResult) && this.onExtraCallback == iAuthTabCallbackStub.onExtraCallback && Intrinsics.areEqual(this.onNavigationEvent, iAuthTabCallbackStub.onNavigationEvent) && Intrinsics.areEqual(this.getInterfaceDescriptor, iAuthTabCallbackStub.getInterfaceDescriptor) && this.IAuthTabCallbackDefault == iAuthTabCallbackStub.IAuthTabCallbackDefault && this.asBinder == iAuthTabCallbackStub.asBinder && this.IAuthTabCallback == iAuthTabCallbackStub.IAuthTabCallback && this.onTransact == iAuthTabCallbackStub.onTransact;
        }

        public int hashCode() {
            int iHashCode = this.IAuthTabCallbackStub.hashCode();
            int iHashCode2 = this.asInterface.hashCode();
            String str = this.onWarmupCompleted;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.onExtraCallbackWithResult;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            int iHashCode5 = Long.hashCode(this.onExtraCallback);
            int iHashCode6 = this.onNavigationEvent.hashCode();
            String str3 = this.getInterfaceDescriptor;
            return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.IAuthTabCallbackDefault)) * 31) + Boolean.hashCode(this.asBinder)) * 31) + Boolean.hashCode(this.IAuthTabCallback)) * 31) + Boolean.hashCode(this.onTransact);
        }

        public final IAuthTabCallbackStub onNavigationEvent(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, long j, @NotNull String str5, @Nullable String str6, boolean z, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new IAuthTabCallbackStub(str, str2, str3, str4, j, str5, str6, z, z2, z3, z4);
        }

        public String toString() {
            return "PeriodicTransferUiModel(uniqueId=" + this.IAuthTabCallbackStub + ", name=" + this.asInterface + ", description=" + this.onWarmupCompleted + ", descriptionTdsColor=" + this.onExtraCallbackWithResult + ", amount=" + this.onExtraCallback + ", dueDateInfo=" + this.onNavigationEvent + ", warningMessage=" + this.getInterfaceDescriptor + ", isEnabled=" + this.IAuthTabCallbackDefault + ", isExpired=" + this.asBinder + ", isDelayed=" + this.IAuthTabCallback + ", showSwitch=" + this.onTransact + ")";
        }

        public IAuthTabCallbackStub(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, long j, @NotNull String str5, @Nullable String str6, boolean z, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.IAuthTabCallbackStub = str;
            this.asInterface = str2;
            this.onWarmupCompleted = str3;
            this.onExtraCallbackWithResult = str4;
            this.onExtraCallback = j;
            this.onNavigationEvent = str5;
            this.getInterfaceDescriptor = str6;
            this.IAuthTabCallbackDefault = z;
            this.asBinder = z2;
            this.IAuthTabCallback = z3;
            this.onTransact = z4;
        }

        public final String asInterface() {
            return this.IAuthTabCallbackStub;
        }

        public final String onExtraCallback() {
            return this.asInterface;
        }

        public final String onExtraCallbackWithResult() {
            return this.onWarmupCompleted;
        }

        public final String IAuthTabCallback() {
            return this.onExtraCallbackWithResult;
        }

        public final long onNavigationEvent() {
            return this.onExtraCallback;
        }

        public final String onTransact() {
            return this.getInterfaceDescriptor;
        }

        public final boolean IAuthTabCallbackStub() {
            return this.IAuthTabCallbackDefault;
        }

        public final boolean asBinder() {
            return this.asBinder;
        }

        public final boolean IAuthTabCallbackDefault() {
            return this.IAuthTabCallback;
        }

        public final boolean onWarmupCompleted() {
            return this.onTransact;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public IAuthTabCallbackStub(@NotNull PeriodicTransferModel periodicTransferModel) throws NoWhenBranchMatchedException {
            String strIAuthTabCallback;
            Intrinsics.checkNotNullParameter(periodicTransferModel, "");
            String strOnMessageChannelReady = periodicTransferModel.onMessageChannelReady();
            String strWriteTypedObject = periodicTransferModel.writeTypedObject();
            strWriteTypedObject = strWriteTypedObject.length() <= 0 ? null : strWriteTypedObject;
            strWriteTypedObject = strWriteTypedObject == null ? periodicTransferModel.onNavigationEvent() : strWriteTypedObject;
            String strIAuthTabCallback_Parcel = periodicTransferModel.IAuthTabCallback_Parcel();
            String strAccess100 = periodicTransferModel.access100();
            long jOnExtraCallback = periodicTransferModel.onExtraCallback();
            String strAccess000 = periodicTransferModel.access000();
            PeriodicTransferModel.InvalidFields invalidFieldsExtraCallback = periodicTransferModel.extraCallback();
            this(strOnMessageChannelReady, strWriteTypedObject, strIAuthTabCallback_Parcel, strAccess100, jOnExtraCallback, strAccess000, (invalidFieldsExtraCallback == null || (strIAuthTabCallback = invalidFieldsExtraCallback.IAuthTabCallback()) == null || StringsKt.isBlank(strIAuthTabCallback)) ? null : strIAuthTabCallback, periodicTransferModel.ICustomTabsCallbackStub(), periodicTransferModel.onUnminimized(), periodicTransferModel.ICustomTabsCallbackStubProxy(), periodicTransferModel.extraCommand() && !periodicTransferModel.ICustomTabsCallbackStubProxy());
        }
    }

    public static final class getInterfaceDescriptor implements IAuthTabCallbackStubProxy {
        public static final getInterfaceDescriptor onExtraCallback = new getInterfaceDescriptor();

        private getInterfaceDescriptor() {
        }
    }

    public static final class onExtraCallback implements IAuthTabCallbackStubProxy {
        public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();

        private onExtraCallback() {
        }
    }

    public static final class onTransact implements IAuthTabCallbackStubProxy {
        private final String onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof onTransact) && Intrinsics.areEqual(this.onExtraCallbackWithResult, ((onTransact) obj).onExtraCallbackWithResult);
        }

        public int hashCode() {
            return this.onExtraCallbackWithResult.hashCode();
        }

        public String toString() {
            return "FilterUiModel(filteringAccountName=" + this.onExtraCallbackWithResult + ")";
        }

        public onTransact(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult = str;
        }

        public final String onNavigationEvent() {
            return this.onExtraCallbackWithResult;
        }
    }

    public static final class onExtraCallbackWithResult implements IAuthTabCallback_Parcel {
        private final String IAuthTabCallback;
        private final PeriodicTransferBannerResponse.Banner onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            return Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback) && Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent);
        }

        public int hashCode() {
            return (this.IAuthTabCallback.hashCode() * 31) + this.onNavigationEvent.hashCode();
        }

        public String toString() {
            return "BannerUiModel(id=" + this.IAuthTabCallback + ", banner=" + this.onNavigationEvent + ")";
        }

        public onExtraCallbackWithResult(@NotNull String str, @NotNull PeriodicTransferBannerResponse.Banner banner) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(banner, "");
            this.IAuthTabCallback = str;
            this.onNavigationEvent = banner;
        }

        public final String onExtraCallbackWithResult() {
            return this.IAuthTabCallback;
        }

        public final PeriodicTransferBannerResponse.Banner onExtraCallback() {
            return this.onNavigationEvent;
        }
    }

    public static final class onWarmupCompleted implements IAuthTabCallback_Parcel {
        private final int onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final int onNavigationEvent;
        private final int onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult) && this.onNavigationEvent == onwarmupcompleted.onNavigationEvent && this.onWarmupCompleted == onwarmupcompleted.onWarmupCompleted && this.onExtraCallback == onwarmupcompleted.onExtraCallback;
        }

        public int hashCode() {
            return (((((this.onExtraCallbackWithResult.hashCode() * 31) + Integer.hashCode(this.onNavigationEvent)) * 31) + Integer.hashCode(this.onWarmupCompleted)) * 31) + Integer.hashCode(this.onExtraCallback);
        }

        public String toString() {
            return "BorderUiModel(id=" + this.onExtraCallbackWithResult + ", height=" + this.onNavigationEvent + ", bottomMargin=" + this.onWarmupCompleted + ", colorResId=" + this.onExtraCallback + ")";
        }

        public onWarmupCompleted(@NotNull String str, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult = str;
            this.onNavigationEvent = i;
            this.onWarmupCompleted = i2;
            this.onExtraCallback = i3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onWarmupCompleted(String str, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i4 & 2) != 0) {
                DisplayMetrics displayMetrics = ((Resources) followRedirects.IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followRedirects.onExtraCallbackWithResult}, -1316113811, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                i = varyMatches.onNavigationEvent(16, displayMetrics);
            }
            if ((i4 & 4) != 0) {
                DisplayMetrics displayMetrics2 = ((Resources) followRedirects.IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followRedirects.onExtraCallbackWithResult}, -1316113811, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                i2 = varyMatches.onNavigationEvent(4, displayMetrics2);
            }
            this(str, i, i2, (i4 & 8) != 0 ? im.toss.tds.R.color.background_lower : i3);
        }

        public final String onExtraCallback() {
            return this.onExtraCallbackWithResult;
        }

        public final int onExtraCallbackWithResult() {
            return this.onNavigationEvent;
        }

        public final int onWarmupCompleted() {
            return this.onWarmupCompleted;
        }

        public final int onNavigationEvent() {
            return this.onExtraCallback;
        }
    }

    public static final class onNavigationEvent implements IAuthTabCallback_Parcel {
        private final String onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof onNavigationEvent) && Intrinsics.areEqual(this.onExtraCallbackWithResult, ((onNavigationEvent) obj).onExtraCallbackWithResult);
        }

        public int hashCode() {
            return this.onExtraCallbackWithResult.hashCode();
        }

        public String toString() {
            return "DividerUiModel(id=" + this.onExtraCallbackWithResult + ")";
        }

        public onNavigationEvent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult = str;
        }

        public final String onExtraCallbackWithResult() {
            return this.onExtraCallbackWithResult;
        }
    }

    public static final class asInterface implements IAuthTabCallback_Parcel {
        private final int onNavigationEvent;
        private final PeriodicTransferBannerResponse.RecommendationBanner onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof asInterface)) {
                return false;
            }
            asInterface asinterface = (asInterface) obj;
            return this.onNavigationEvent == asinterface.onNavigationEvent && Intrinsics.areEqual(this.onWarmupCompleted, asinterface.onWarmupCompleted);
        }

        public int hashCode() {
            return (Integer.hashCode(this.onNavigationEvent) * 31) + this.onWarmupCompleted.hashCode();
        }

        public String toString() {
            return "RecommendationBannerUiModel(id=" + this.onNavigationEvent + ", banner=" + this.onWarmupCompleted + ")";
        }

        public asInterface(int i, @NotNull PeriodicTransferBannerResponse.RecommendationBanner recommendationBanner) {
            Intrinsics.checkNotNullParameter(recommendationBanner, "");
            this.onNavigationEvent = i;
            this.onWarmupCompleted = recommendationBanner;
        }

        public final int onNavigationEvent() {
            return this.onNavigationEvent;
        }

        public final PeriodicTransferBannerResponse.RecommendationBanner IAuthTabCallback() {
            return this.onWarmupCompleted;
        }
    }

    public static final class asBinder implements IAuthTabCallbackStubProxy {
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof asBinder) && Intrinsics.areEqual(this.onNavigationEvent, ((asBinder) obj).onNavigationEvent);
        }

        public int hashCode() {
            return this.onNavigationEvent.hashCode();
        }

        public String toString() {
            return "RecommendationTitle(title=" + this.onNavigationEvent + ")";
        }

        public asBinder(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = str;
        }

        public final String IAuthTabCallback() {
            return this.onNavigationEvent;
        }
    }

    public static final class access100 implements IAuthTabCallbackStubProxy {
        private final String onExtraCallback;
        private final int onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof access100)) {
                return false;
            }
            access100 access100Var = (access100) obj;
            return this.onNavigationEvent == access100Var.onNavigationEvent && Intrinsics.areEqual(this.onExtraCallback, access100Var.onExtraCallback);
        }

        public int hashCode() {
            return (Integer.hashCode(this.onNavigationEvent) * 31) + this.onExtraCallback.hashCode();
        }

        public String toString() {
            return "TossBankSummaryUiModel(count=" + this.onNavigationEvent + ", scheme=" + this.onExtraCallback + ")";
        }

        public access100(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = i;
            this.onExtraCallback = str;
        }

        public final int onNavigationEvent() {
            return this.onNavigationEvent;
        }

        public final String IAuthTabCallback() {
            return this.onExtraCallback;
        }
    }

    public interface IAuthTabCallback {

        public static final class onExtraCallbackWithResult implements IAuthTabCallback {
            private final PeriodicTransferModel onNavigationEvent;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof onExtraCallbackWithResult) && Intrinsics.areEqual(this.onNavigationEvent, ((onExtraCallbackWithResult) obj).onNavigationEvent);
            }

            public int hashCode() {
                return this.onNavigationEvent.hashCode();
            }

            public String toString() {
                return "Edit(model=" + this.onNavigationEvent + ")";
            }

            public onExtraCallbackWithResult(@NotNull PeriodicTransferModel periodicTransferModel) {
                Intrinsics.checkNotNullParameter(periodicTransferModel, "");
                this.onNavigationEvent = periodicTransferModel;
            }

            public final PeriodicTransferModel onNavigationEvent() {
                return this.onNavigationEvent;
            }
        }

        public static final class onNavigationEvent implements IAuthTabCallback {
            private final String IAuthTabCallback;
            private final String onExtraCallback;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onNavigationEvent)) {
                    return false;
                }
                onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
                return Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback) && Intrinsics.areEqual(this.IAuthTabCallback, onnavigationevent.IAuthTabCallback);
            }

            public int hashCode() {
                return (this.onExtraCallback.hashCode() * 31) + this.IAuthTabCallback.hashCode();
            }

            public String toString() {
                return "Toast(iconUrl=" + this.onExtraCallback + ", text=" + this.IAuthTabCallback + ")";
            }

            public onNavigationEvent(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.onExtraCallback = str;
                this.IAuthTabCallback = str2;
            }

            public final String IAuthTabCallback() {
                return this.IAuthTabCallback;
            }

            public final String onExtraCallback() {
                return this.onExtraCallback;
            }
        }

        public static final class onExtraCallback implements IAuthTabCallback {
            private final boolean IAuthTabCallback;
            private final Throwable onExtraCallbackWithResult;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onExtraCallback)) {
                    return false;
                }
                onExtraCallback onextracallback = (onExtraCallback) obj;
                return Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult) && this.IAuthTabCallback == onextracallback.IAuthTabCallback;
            }

            public int hashCode() {
                return (this.onExtraCallbackWithResult.hashCode() * 31) + Boolean.hashCode(this.IAuthTabCallback);
            }

            public String toString() {
                return "Error(throwable=" + this.onExtraCallbackWithResult + ", isFatal=" + this.IAuthTabCallback + ")";
            }

            public onExtraCallback(@NotNull Throwable th, boolean z) {
                Intrinsics.checkNotNullParameter(th, "");
                this.onExtraCallbackWithResult = th;
                this.IAuthTabCallback = z;
            }

            public /* synthetic */ onExtraCallback(Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(th, (i & 2) != 0 ? false : z);
            }

            public final boolean onNavigationEvent() {
                return this.IAuthTabCallback;
            }

            public final Throwable onWarmupCompleted() {
                return this.onExtraCallbackWithResult;
            }
        }
    }
}
