package o;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.GetAccountsHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ObjectDigestInfo implements ALCFaceQuality {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        return super/*o.drawTextBox*/.onExtraCallbackWithResult();
    }

    public /* bridge */ boolean onNavigationEvent() {
        return super/*o.drawTextBox*/.onNavigationEvent();
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        return super/*o.drawTextBox*/.onWarmupCompleted(str);
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
    }

    public onOutOfMemory onExtraCallback() {
        return new onOutOfMemory.IAuthTabCallback(new GetAccountsHandler$.ExternalSyntheticLambda0());
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        try {
            List<KeyBoardVisiblePoint> listOnWarmupCompleted = Companion.onWarmupCompleted();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnWarmupCompleted, 10));
            Iterator<T> it = listOnWarmupCompleted.iterator();
            while (it.hasNext()) {
                arrayList.add(new UST_CERT_GetAuthorityKeyIdentifierInfo((KeyBoardVisiblePoint) it.next()));
            }
            ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, ALCEyeBlink.onWarmupCompleted.onExtraCallbackWithResult(new UST_CERT_GetCertCPS(arrayList)));
        } catch (Exception e) {
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, e.getLocalizedMessage(), (String) null, (Map) null, 6, (Object) null);
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final List<KeyBoardVisiblePoint> onWarmupCompleted() {
            return CollectionsKt.sortedWith(PageShowPoint.Companion.IAuthTabCallback(), new UST_TSA_VerifyTimeStampTokenWithHash());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IAuthTabCallback(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Uri uri = Uri.parse(str);
        return filterCreatePageParams.IAuthTabCallback(uri) || filterCreatePageParams.IAuthTabCallbackStub(uri) || filterCreatePageParams.onWarmupCompleted(uri);
    }
}
