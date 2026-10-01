package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.ToolkitManager_Update;
import o.getVidR;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.agreement.model.RegisterAccountDto;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getVidR extends ToolkitManager_Update {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int onExtraCallback = 8;
    private final TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult IAuthTabCallback;

    public getVidR(@NotNull TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.IAuthTabCallback = onextracallbackwithresult;
    }

    public static /* synthetic */ writeRaw onWarmupCompleted(getVidR getvidr, TypeUtils2 typeUtils2, List list, boolean z, boolean z2, ToolkitManager_Update.onExtraCallbackWithResult onextracallbackwithresult, int i, Object obj) {
        if ((i & 16) != 0) {
            onextracallbackwithresult = null;
        }
        return getvidr.onExtraCallbackWithResult(typeUtils2, list, z, z2, onextracallbackwithresult);
    }

    public final writeRaw<List<TabBarInfoQueryPointOnTabBarInfoQueryListener>> onExtraCallbackWithResult(@NotNull TypeUtils2 typeUtils2, @NotNull List<RegisterAccountDto> list, boolean z, boolean z2, @Nullable ToolkitManager_Update.onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(typeUtils2, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            writeRaw<List<TabBarInfoQueryPointOnTabBarInfoQueryListener>> writerawOnExtraCallback = writeRaw.onExtraCallback(CollectionsKt__CollectionsKt.emptyList());
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallback, "");
            return writerawOnExtraCallback;
        }
        List<RegisterAccountDto> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (RegisterAccountDto registerAccountDto : list2) {
            arrayList.add(new setDescriptionTextColor(Long.parseLong(registerAccountDto.IAuthTabCallback()), Integer.parseInt(registerAccountDto.onNavigationEvent()), registerAccountDto.onWarmupCompleted(), (String) null, (String) null, 24, (DefaultConstructorMarker) null));
        }
        return onNavigationEvent(typeUtils2, arrayList, z, z2, onextracallbackwithresult);
    }

    private final writeRaw<List<TabBarInfoQueryPointOnTabBarInfoQueryListener>> onNavigationEvent(TypeUtils2 typeUtils2, List<setDescriptionTextColor> list, boolean z, boolean z2, ToolkitManager_Update.onExtraCallbackWithResult onextracallbackwithresult) {
        writeRaw writerawOnExtraCallbackWithResult = ToolkitManager_Update.onExtraCallbackWithResult(this, typeUtils2, list, this.IAuthTabCallback, z, z2, false, onextracallbackwithresult, false, 160, null);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.agreement.MultiAccountAgreementHelper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getVidR.onExtraCallbackWithResult(this.f$0, (List) obj);
            }
        };
        writeRaw writerawOnNavigationEvent = writerawOnExtraCallbackWithResult.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.account.agreement.MultiAccountAgreementHelper$$ExternalSyntheticLambda1
            @Override // o.deserializeFloat
            public final void accept(Object obj) {
                getVidR.getInterfaceDescriptor(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.agreement.MultiAccountAgreementHelper$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getVidR.onExtraCallbackWithResult((Throwable) obj);
            }
        };
        writeRaw<List<TabBarInfoQueryPointOnTabBarInfoQueryListener>> writerawOnWarmupCompleted = writerawOnNavigationEvent.onWarmupCompleted(new deserializeFloat() { // from class: viva.republica.toss.account.agreement.MultiAccountAgreementHelper$$ExternalSyntheticLambda3
            @Override // o.deserializeFloat
            public final void accept(Object obj) {
                getVidR.IAuthTabCallbackStubProxy(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
        return writerawOnWarmupCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getInterfaceDescriptor(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(getVidR getvidr, List list) throws Throwable {
        getvidr.onWarmupCompleted(getvidr.IAuthTabCallback);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Throwable th) {
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "MultiAccountAgreementHelper", th.getMessage(), th, (Map) null, 8, (Object) null);
        return Unit.INSTANCE;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
