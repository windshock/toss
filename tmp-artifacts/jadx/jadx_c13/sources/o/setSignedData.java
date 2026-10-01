package o;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.ToolkitManager_Update;
import o.setSignedData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setSignedData extends ToolkitManager_Update {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onExtraCallback = 8;

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public final writeRaw<TabBarInfoQueryPointOnTabBarInfoQueryListener> IAuthTabCallback(@NotNull TypeUtils2 typeUtils2, boolean z, boolean z2, @NotNull final setDescriptionTextColor setdescriptiontextcolor, boolean z3, @Nullable ToolkitManager_Update.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        Intrinsics.checkNotNullParameter(typeUtils2, "");
        Intrinsics.checkNotNullParameter(setdescriptiontextcolor, "");
        writeRaw<List<TabBarInfoQueryPointOnTabBarInfoQueryListener>> writerawIAuthTabCallback = IAuthTabCallback(typeUtils2, CollectionsKt__CollectionsJVMKt.listOf(setdescriptiontextcolor), setdescriptiontextcolor.IAuthTabCallback(), z, z2, z3, onextracallbackwithresult, false);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.agreement.SingleAccountAgreementHelper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSignedData.IAuthTabCallback((List) obj);
            }
        };
        writeRaw<R> writerawOnWarmupCompleted = writerawIAuthTabCallback.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.account.agreement.SingleAccountAgreementHelper$$ExternalSyntheticLambda1
            @Override // o.deserializeIntNullableCollection
            public final Object apply(Object obj) {
                return setSignedData.access000(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.agreement.SingleAccountAgreementHelper$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSignedData.onNavigationEvent(this.f$0, setdescriptiontextcolor, (TabBarInfoQueryPointOnTabBarInfoQueryListener) obj);
            }
        };
        writeRaw writerawOnNavigationEvent = writerawOnWarmupCompleted.onNavigationEvent((deserializeFloat<? super R>) new deserializeFloat() { // from class: viva.republica.toss.account.agreement.SingleAccountAgreementHelper$$ExternalSyntheticLambda3
            @Override // o.deserializeFloat
            public final void accept(Object obj) {
                setSignedData.IAuthTabCallback_Parcel(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.account.agreement.SingleAccountAgreementHelper$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSignedData.onWarmupCompleted((Throwable) obj);
            }
        };
        writeRaw<TabBarInfoQueryPointOnTabBarInfoQueryListener> writerawOnWarmupCompleted2 = writerawOnNavigationEvent.onWarmupCompleted(new deserializeFloat() { // from class: viva.republica.toss.account.agreement.SingleAccountAgreementHelper$$ExternalSyntheticLambda5
            @Override // o.deserializeFloat
            public final void accept(Object obj) {
                setSignedData.access100(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted2, "");
        return writerawOnWarmupCompleted2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabBarInfoQueryPointOnTabBarInfoQueryListener access000(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (TabBarInfoQueryPointOnTabBarInfoQueryListener) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabBarInfoQueryPointOnTabBarInfoQueryListener IAuthTabCallback(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (tabBarInfoQueryPointOnTabBarInfoQueryListener != null) {
            return tabBarInfoQueryPointOnTabBarInfoQueryListener;
        }
        throw new IllegalStateException("등록중인 계좌를 찾을 수 없어요. 다시 시도해주세요.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(setSignedData setsigneddata, setDescriptionTextColor setdescriptiontextcolor, TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) throws Throwable {
        setsigneddata.onWarmupCompleted(setdescriptiontextcolor.IAuthTabCallback());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void access100(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(Throwable th) {
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SingleAccountAgreementHelper", th.getMessage(), th, (Map) null, 8, (Object) null);
        return Unit.INSTANCE;
    }
}
